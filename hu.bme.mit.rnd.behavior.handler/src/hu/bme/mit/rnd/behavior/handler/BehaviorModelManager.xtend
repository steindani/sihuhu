package hu.bme.mit.rnd.behavior.handler

import Behavior.BehaviorFactory
import Behavior.Component
import Behavior.System
import hu.bme.mit.rnd.sihuhu.sihuhu.Rail
import hu.bme.mit.rnd.sihuhu.sihuhu.World
import hu.bme.mit.rnd.sihuhu.sihuhu.Switch
import java.util.ArrayList
import java.util.HashMap
import hu.bme.mit.rnd.sihuhu.sihuhu.SwitchConnection
import Behavior.Event
import hu.bme.mit.rnd.sihuhu.sihuhu.TrackElement
import Behavior.State
import Behavior.Transition
import hu.bme.mit.rnd.sihuhu.sihuhu.Signal
import java.util.List
import java.util.HashSet

//import org.eclipse.emf.ecore.EObject

class BehaviorModelManager {
	static extension BehaviorFactory factory = BehaviorFactory::eINSTANCE
	
	public static def System getBehaviorModel(World world) {
		var sys=factory.createSystem()
		
		//Collecting track elements from all tracks
		var allRails=new ArrayList<Rail>()
		var allSwitches=new ArrayList<Switch>()
		for (t: world.tracks) {
			allRails.addAll(t.rails)
			allSwitches.addAll(t.switches)
		}
		

		//Setting behavior of simple rails
		val rToRoe =new HashMap<Rail,Event>
		val rToRfe =new HashMap<Rail,Event>
		for (r: allRails) {
			
			//Creating events
			val tie = createTrainInEvent(r)
			sys.getEvents.add(tie);
			val toe = createTrainOutEvent(r)
			sys.getEvents.add(toe);
			val roe = createRailOccupiedEvent(r)
			sys.getEvents.add(roe);
			rToRoe.put(r,roe)
			val rfe = createRailFreedEvent(r)
			sys.getEvents.add(rfe);
			rToRfe.put(r,rfe)
			
			//Creating component
			val c =createComponent(r)
			sys.getComponents.add(c)
			
			
			//Creating transitions
			val tcit =createTransition("trainComesIn", c.states.get(1), c.states.get(0), tie, roe)
			c.transitions.add(tcit)
			val tgot =createTransition("trainGoesOut", c.states.get(0), c.states.get(1), toe, rfe)
			c.transitions.add(tgot)
			
		}
		
		//Setting behavior of switches and SwitchComponents
		val sToOff=new HashMap<Switch,Event>()
		val sToEvt=new HashMap<Switch,HashMap<SwitchConnection,Event>>()
		val scToRfe=new HashMap<SwitchConnection, Event>()
		val scToRoe=new HashMap<SwitchConnection, Event>()
		for (s:allSwitches) {
			//Creating events
			val tie =createTrainInEvent(s)
			sys.getEvents.add(tie)
			val toe = createTrainOutEvent(s)
			sys.getEvents.add(toe);
			val soe = factory.createEvent
			soe.name = "switch"+s.name.toFirstUpper+"Off";
			sys.getEvents.add(soe);
			sToOff.put(s,soe)
			val tsoe = factory.createEvent
			tsoe.name = "trySwitch"+s.name.toFirstUpper+"Off";
			sys.getEvents.add(tsoe);
			
			//Creating switch component
			val sComp=createComponent(s)
			sys.components.add(sComp)
			//Program.write(sComp);
			//Program.write(s.activeConnection);
			
			val scToState =new HashMap<SwitchConnection, State>()
			for (sc: s.connections) {
				val scState=createState(s,sc.name)
				sComp.states.add(scState)
				scToState.put(sc,scState)
				if (s.activeConnection==sc) sComp.currentState=scState
					
			}
			
			
			val offState=createState(s,"Off")
			sComp.states.add(offState)
			if (s.activeConnection == null) sComp.currentState = offState
			
			
			//Creating Switch Connection events
			val scToEvt=new HashMap<SwitchConnection,Event>()
			val scToTry=new HashMap<SwitchConnection,Event>()
			for (sc : s.connections) {
				val stce=factory.createEvent
				stce.name="switch"+s.name.toFirstUpper+"To"+sc.name.toFirstUpper
				sys.events.add(stce)
				scToEvt.put(sc,stce)
				val tse=factory.createEvent
				tse.name="trySwitch"+s.name.toFirstUpper+"To"+sc.name.toFirstUpper
				scToTry.put(sc,tse)
			}
			sToEvt.put(s,scToEvt)
			
			
			//Creating SC  components
			val scToComp=new HashMap<SwitchConnection, Component>()
			val scToFreeState=new HashMap<SwitchConnection,State>()
			val scToOccState=new HashMap<SwitchConnection,State>()
			val scToNeState=new HashMap<SwitchConnection,State>()
			for (sc:s.connections) {
				val c=createComponent(sc)
				sys.components.add(c)
				scToComp.put(sc,c)
				
				val occState=createState(sc,"Occupied")
				c.states.add(occState)
				scToOccState.put(sc,occState)
				val freeState=createState(sc,"Free")
				c.states.add(freeState)
				scToFreeState.put(sc,freeState)
				val neState=createState(sc,"NonExistent")
				c.states.add(neState)
				scToNeState.put(sc,neState)
				if ((sc.eContainer as Switch).activeConnection ==sc){
					if (sc.train==null) c.currentState = freeState
					else c.currentState=occState
				} else {
					c.currentState=neState
				}
			}
			
			//Transitions from off state of switch and to Offstate of switch
			for (sc : s.connections) {
				val ton=createTransition("switchOnTo"+sc.name.toFirstUpper, offState, scToState.get(sc), scToTry.get(sc), scToEvt.get(sc))
				sComp.transitions.add(ton)
				val toff=createTransition("switchOffFrom"+sc.name.toFirstUpper,scToState.get(sc), offState, tsoe,soe)
				sComp.transitions.add(toff)
				toff.guardStates.add(scToFreeState.get(sc))
			}
			//Transitions between switchconnections
			for (from:s.connections)
				for (to:s.connections) {
					val t=createTransition("from"+from.name.toFirstUpper+"To"+to.name.toFirstUpper, scToState.get(from),scToState.get(to),scToTry.get(to),scToEvt.get(to))
					sComp.transitions.add(t)
					t.guardStates.add(scToFreeState.get(from))
				}
			
			//Rail events for switchconnections
			val scToTie =new HashMap<SwitchConnection,Event>
			val scToToe =new HashMap<SwitchConnection,Event>
			//val scToRoe =new HashMap<SwitchConnection,Event>
			//val scToRfe =new HashMap<SwitchConnection,Event>
			for (sc:s.connections) {
				val sctie = createTrainInEvent(sc)
				sys.getEvents.add(sctie);
				scToTie.put(sc,sctie)
				val sctoe = createTrainOutEvent(sc)
				sys.getEvents.add(sctoe);
				scToToe.put(sc,sctoe)
				val scroe = createRailOccupiedEvent(sc)
				sys.getEvents.add(scroe);
				scToRoe.put(sc,scroe)
				val scrfe = createRailFreedEvent(sc)
				sys.getEvents.add(scrfe);
				scToRfe.put(sc,scrfe)
			}
			
			//Transitions when trains come in or leave
			for (sc:s.connections) {
				val scState=scToState.get(sc)
				val tin=createTransition("trainIn"+sc.name.toFirstUpper+"Active", scState, scState, tie, scToTie.get(sc))
				sComp.transitions.add(tin)
				tin.guardStates.add(scToFreeState.get(sc))
				val tout=createTransition("trainOut"+sc.name.toFirstUpper+"Active", scState, scState, toe, scToToe.get(sc))
				sComp.transitions.add(tout)
			}
			
			//Setting behavior of SC
			
			for (sc: s.connections) {
				val c=scToComp.get(sc)
				val freeState=scToFreeState.get(sc)
				val occState=scToOccState.get(sc)
				val neState=scToNeState.get(sc)
				val railOcc=scToRoe.get(sc)
				val railFree=scToRfe.get(sc)
				//Creating normal Rail transitions
				val tin=createTransition("trainIn", freeState, occState, scToTie.get(sc), railOcc)
				c.transitions.add(tin)
				val tout=createTransition("trainOut",occState, freeState, scToToe.get(sc), railFree)	
				c.transitions.add(tout)
				//Creating transitions of switch
				val toff = createTransition("deactivate", freeState, neState, soe,null)
				c.transitions.add(toff)
				for (to:s.connections) {
					val evt=scToEvt.get(to)
					if (sc==to) {
						val tact=createTransition("activate", neState, freeState, evt, null)
						c.transitions.add(tact)
					} else {
						val tto=createTransition("switchTo"+to.name.toFirstUpper, freeState, neState, evt, null)
						c.transitions.add(tto)
					}
				}				
			}
			
		}
		
		//Setting behavior of signals pointing to rails
		for (r:allRails) {
			//Signals indicating entering r
			val signals=new ArrayList<Signal>()
			if (r.to!=null) signals.addAll(getSignalsToRail(r,r.to))
			if (r.from!=null) signals.addAll(getSignalsToRail(r,r.from))
			
			//Events of rail
			val roe=rToRoe.get(r)
			val rfe=rToRfe.get(r)
			
			//creating a component for each signal
			for (s:signals) {
				val c=factory.createComponent()
				c.name="signal"+(s.eContainer as Rail).name.toFirstUpper+"To"+r.name.toFirstUpper
				sys.components.add(c)
				val greenState=factory.createState
				greenState.name=c.name+"Green"
				c.states.add(greenState)
				val redState=factory.createState
				redState.name=c.name+"Red"
				c.states.add(redState)
				if (r.train==null) c.currentState = greenState else c.currentState = redState
				
				val tall=createTransition("goesGreen", redState, greenState, rfe, null)
				c.transitions.add(tall)
				val tden=createTransition("goesRed", greenState, redState, roe, null)
				c.transitions.add(tden)
			}
		}
		
		for (s:allSwitches) {
			val scToEvt=sToEvt.get(s)
			//Signals indicating entering s
			val rToS=new HashMap<Rail,Signal>()
			val rToSc=new HashMap<Rail, List<SwitchConnection>>()
			
			val connRails=new HashSet<Rail>()
			//Connected rails
			for (sc:s.connections) {
				connRails.addAll(getAllRails(sc.from));
				connRails.addAll(getAllRails(sc.to));
			}

			for (r:connRails) {
				if (r.to==s) rToS.put(r,r.allowedTo)
				if (r.from==s) rToS.put(r,r.allowedFrom)
				rToSc.put(r,new ArrayList<SwitchConnection>)
			}
			for (sc:s.connections) {
				rToSc.get(sc.from).add(sc)
				rToSc.get(sc.to).add(sc)
			}
			
			for (r: rToS.keySet) {
				//val sig=rToS.get(r)
				val c=factory.createComponent()
				c.name="signal"+r.name.toFirstUpper+"To"+s.name.toFirstUpper
				sys.components.add(c)
				val greenState=factory.createState
				greenState.name=c.name+"Green"
				c.states.add(greenState)
				val redState=factory.createState
				redState.name=c.name+"Red"
				c.states.add(redState)
				
				c.currentState = redState
				if (rToSc.get(r).contains(s.activeConnection) && s.activeConnection.train==null) c.currentState=greenState
				
				//Switch transitions
				val toff=createTransition("off", greenState, redState, sToOff.get(s), null)
				c.transitions.add(toff)
				for (sc:s.connections) {
					if (rToSc.get(r).contains(sc)) {
						val tall=createTransition("switchedTo"+sc.name.toFirstUpper,redState, greenState, scToEvt.get(sc),null)
						c.transitions.add(tall)
					} else {
						val tden=createTransition("switchedTo"+sc.name.toFirstUpper,greenState, redState, scToEvt.get(sc),null)
						c.transitions.add(tden)
					}
				}
				//Rail transitions
				for (sc:rToSc.get(r)) {
					val tall=createTransition("goesGreen", redState, greenState, scToRfe.get(sc), null)
					c.transitions.add(tall)
					val tden=createTransition("goesRed", greenState, redState, scToRoe.get(sc), null)
					c.transitions.add(tden)
				}
			}
		}
	
		return sys;
	}
	
	def static dispatch List<Rail> getAllRails(Rail r) {
		val l=new ArrayList<Rail>()
		l.add(r);
		return l;
	}
	
	def static dispatch List<Rail> getAllRails(Switch s) {
		val l=new ArrayList<Rail>()
		for (sc: s.connections) l.add(sc);
		return l;
	}
		
	private def static Event createTrainInEvent(TrackElement te) {
		val ev = factory.createEvent
		ev.name="trainIn"+te.name.toFirstUpper
		return ev
	}
	
	private def static Event createTrainOutEvent(TrackElement te) {
		val ev = factory.createEvent
		ev.name="trainOut"+te.name.toFirstUpper
		return ev
	}
	
	private def static Event createRailOccupiedEvent(TrackElement te) {
		val ev = factory.createEvent
		ev.name="railOccupied"+te.name.toFirstUpper
		return ev
	}
	
	private def static Event createRailFreedEvent(TrackElement te) {
		val ev = factory.createEvent
		ev.name="railFreed"+te.name.toFirstUpper
		return ev
	}
	
	private static def dispatch Component createComponent(Rail r) {
		val c =factory.createComponent
		c.name="rail"+r.name.toFirstUpper
		
		val occState=createState(r,"Occupied")
		c.states.add(occState)
		val freeState=createState(r,"Free")
		c.states.add(freeState)
		if (r.train == null) c.currentState = freeState else c.currentState = occState
		
		return c
	}
	
	private static def dispatch Component createComponent(Switch s) {
		val c =factory.createComponent
		c.name="switch"+s.name.toFirstUpper
		return c
	}
	
	private static def dispatch Component createComponent(SwitchConnection sc) {
		val c =factory.createComponent
		c.name="rail"+sc.name.toFirstUpper
		return c
	}
	
	private static def State createState(TrackElement te, String name) {
		val s =factory.createState
		s.name=te.name.toFirstLower+name.toFirstUpper
		return s
	}
	
	private static def Transition createTransition(String name, State from, State to, Event trig, Event gen) {
		val t = factory.createTransition
		t.name=name
		t.fromState=from
		t.toState=to
		t.triggeringEvent = trig
		t.generatedEvent = gen
		return t
	}
	
	private static def dispatch List<Signal> getSignalsToRail(Rail r, Switch s) {
		val signals=new ArrayList<Signal>()
		for (sc:s.connections) {
			if (sc.to==r) signals.add(sc.allowedTo)
			if (sc.from==r) signals.add(sc.allowedFrom)
		}
		return signals
	}
	
	private static def dispatch List<Signal> getSignalsToRail(Rail r, Rail n) {
		val signals=new ArrayList<Signal>()
		if (n.to==r) signals.add(n.allowedTo)
		if (n.from==r) signals.add(n.allowedFrom)
		return signals
	}
	
	public static def boolean eventComesIn(System sys, Event event) {
		//Chosing the event to execute
		val e=getEventByName(sys, event.name)
		if (e==null) return false;
		
		var fired =false;
		val genEvents=new ArrayList<Event>()
		
		for (c: sys.components) {
			for (t: c.transitions) {
				if (t.triggeringEvent==e) {
					val enabled=isEnabled(sys, c, t);
					if (enabled) {
						fired=true;
						val genEv=fire(c, t)
						if (genEv!=null) genEvents.add(genEv)
					}
				}
			}
		}
		
		if (!fired) return false;
		
		for (ev:genEvents) eventComesIn(sys, ev)
		
		return true;
	}
	
	def private static Event fire(Component comp, Transition transition) {
		comp.currentState=transition.toState;
		return transition.generatedEvent;
	}
	
	def private static boolean isEnabled(System sys, Component comp, Transition tran) {
		if (comp.currentState!=tran.fromState) return false;
		//Checking guard
		for (s: tran.guardStates) {
			val c = s.eContainer as Component
			if (c.getCurrentState!=s) return false;
		}
		
		return true;

	}
	
	def private static getEventByName(System system, String string) {
		for (e: system. events) if (e.name.equals(string)) return e;
		return null;
	}
	
}
