package hu.bme.mit.rnd.behavior.handler

import Behavior.BehaviorFactory
import Behavior.System
import Behavior.Transition
import Behavior.Component
import java.util.ArrayList
import sihuhu.Rail
import sihuhu.World
import sihuhu.Switch
import java.util.HashMap
import sihuhu.SwitchConnection

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
		for (r: allRails) {
			
			//Creating events
			val e1 = factory.createEvent
			e1.name = "trainIn"+r.name.toFirstUpper;
			sys.getEvents.add(e1);
			val e2 = factory.createEvent
			e2.name = "trainOut"+r.name.toFirstUpper;
			sys.getEvents.add(e2);
			val e3 = factory.createEvent
			e3.name = "railOccupied"+r.name.toFirstUpper;
			sys.getEvents.add(e3);
			val e4 = factory.createEvent
			e4.name = "railFree"+r.name.toFirstUpper;
			sys.getEvents.add(e4);
			
			//Creating component and states
			val c =factory.createComponent
			c.name="rail"+r.name.toFirstUpper
			sys.getComponents.add(c)
			val occState=factory.createState
			occState.name=c.name+"Occupied"
			c.states.add(occState)
			val freeState=factory.createState
			freeState.name=c.name+"Free"
			c.states.add(freeState)
			//Setting initial state
			if (r.train == null) c.currentState = freeState else c.currentState = occState//TODO
			
			//Creating transitions
			val t1 = factory.createTransition
			c.transitions.add(t1)
			t1.name="trainComesIn"
			t1.fromState=freeState
			t1.toState=occState
			t1.triggeringEvent=e1
			t1.generatedEvent = e3
			val t2 = factory.createTransition
			c.transitions.add(t2)
			t2.name="trainGoesOut"
			t2.fromState=occState
			t2.toState=freeState
			t2.triggeringEvent=e2
			t2.generatedEvent = e4}
		
		//Setting behavior of switches and SwitchComponents
		for (s:allSwitches) {
			//Creating events
			val e1 = factory.createEvent
			e1.name = "trainIn"+s.name.toFirstUpper;
			sys.getEvents.add(e1);
			val e2 = factory.createEvent
			e2.name = "trainOut"+s.name.toFirstUpper;
			sys.getEvents.add(e2);
			val e6 = factory.createEvent
			e6.name = "switch"+s.name.toFirstUpper+"Off";
			sys.getEvents.add(e6);
			
			//TODO Switch komponens
			
			//Setting behavior of SC
			val scToCmp=new HashMap<SwitchConnection,Component>();
			for (sc: s.connections) {
				//Creating events
				val e3 = factory.createEvent
				e3.name = "railOccupied"+sc.name.toFirstUpper;
				sys.getEvents.add(e3);
				val e4 = factory.createEvent
				e4.name = "railFree"+sc.name.toFirstUpper;
				sys.getEvents.add(e4);
				val e5 = factory.createEvent
				e5.name = "switch"+s.name.toFirstUpper+sc.name.toFirstUpper;
				sys.getEvents.add(e5);
				
				//Creating a component
				val c =factory.createComponent
				scToCmp.put(sc,c)
				c.name="rail"+sc.name
				sys.getComponents.add(c)
				//Creating states
				val occState=factory.createState
				occState.name=c.name+"Occupied"
				c.states.add(occState)
				val freeState=factory.createState
				freeState.name=c.name+"Free"
				c.states.add(freeState)
				val neState=factory.createState
				neState.name=c.name+"NonEx"
				c.states.add(neState)
				//Setting initial state
				c.currentState = neState
				//if (s.activeConnection == sc) if (); //TODO - A vonat mire mutat?
				
				//Creating normal Rail transitions
				val t1 = factory.createTransition
				c.transitions.add(t1)
				t1.name="trainComesIn"
				t1.fromState=freeState
				t1.toState=occState
				t1.triggeringEvent=e1
				t1.generatedEvent = e3
				val t2 = factory.createTransition
				c.transitions.add(t2)
				t2.name="trainGoesOut"
				t2.fromState=occState
				t2.toState=freeState
				t2.triggeringEvent=e2
				t2.generatedEvent = e4
				val t3= factory.createTransition
				c.transitions.add(t3)
				t3.name="switchOff"
				t2.fromState=freeState
				t2.toState=neState
				t2.triggeringEvent=e6					
			}
			for (sc: s.connections) {//TODO generated event
				for (conn: s.connections) {
					val c=scToCmp.get(sc)
					val t = factory.createTransition
					c.transitions.add(t)
					t.name="switchTo"+conn.name.toFirstUpper
					val neState=c.states.filter[name.equals(c.name+"NonEx")].get(0)
					val freeState=c.states.filter[name.equals(c.name+"Free")].get(0)
					if (sc==conn) {
						t.fromState=neState
						t.toState=freeState
					} else {
						t.fromState=freeState
						t.toState=neState
					}
				}
			}
			
		}
		
		for (s:allSwitches) {
			allRails.addAll(s.connections)
		}
		
		//Setting behavior of signals
		for (r:allRails) {
			//Signal to FromSide
			val c =factory.createComponent
			c.name="signal"+r.name.toFirstUpper+"To"+r.from.name.toFirstUpper
			sys.getComponents.add(c)
			//States
			val greenState=factory.createState
			val redState=factory.createState
			c.states.add(greenState)
			c.states.add(redState)
			if (r.allowedFrom.enabled) c.currentState=greenState else c.currentState=redState
			//Transitions
			if (r.from instanceof Switch) {
				val sw = r.from as Switch
				val toff = factory.createTransition
				c.transitions.add(toff)
				toff.name=sw.name+"Off"
				toff.fromState=greenState
				toff.toState=redState
				toff.triggeringEvent=sys.events.filter[name.equals("switch"+sw.name.toFirstUpper+"Off")].get(0)
				for (sc: sw.connections) { //If it is connected switch, free turns geen; occ red
					
					if (sc.from==r || sc.to==r) {
						//occupation turns red
						val tocc = factory.createTransition
						c.transitions.add(tocc)
						tocc.name="trainComesIn"+sc.name.toFirstUpper
						tocc.fromState=greenState
						tocc.toState=redState
						tocc.triggeringEvent=sys.events.filter[name.equals("railOccupied"+sc.name.toFirstUpper)].get(0)
						//free turns green
						val tfree = factory.createTransition
						c.transitions.add(tfree)
						tfree.name="trainGoesOut"+sc.name.toFirstUpper
						tocc.fromState=redState
						tocc.toState=greenState
						tocc.triggeringEvent=sys.events.filter[name.equals("railFreed"+sc.name.toFirstUpper)].get(0)
						//switch turns green
						val tsw = factory.createTransition
						c.transitions.add(tsw)
						tsw.name="switchTo"+sc.name.toFirstUpper
						tsw.fromState=redState
						tsw.toState=greenState
						tsw.triggeringEvent=sys.events.filter[name.equals("switch"+sw.name.toFirstUpper+sc.name.toFirstUpper)].get(0)
					} else {
						//switch turns red
						val tsw = factory.createTransition
						c.transitions.add(tsw)
						tsw.name="switchTo"+sc.name.toFirstUpper
						tsw.fromState=greenState
						tsw.toState=redState
						tsw.triggeringEvent=sys.events.filter[name.equals("switch"+sw.name.toFirstUpper+sc.name.toFirstUpper)].get(0)
					}
				}
				
			} else {
				val rail=r.from as Rail
				val tocc = factory.createTransition
				c.transitions.add(tocc)
				tocc.name="trainComesIn"+rail.name.toFirstUpper
				tocc.fromState=greenState
				tocc.toState=redState
				tocc.triggeringEvent=sys.events.filter[name.equals("railOccupied"+rail.name.toFirstUpper)].get(0)
				//free turns green
				val tfree = factory.createTransition
				c.transitions.add(tfree)
				tfree.name="trainGoesOut"+rail.name.toFirstUpper
				tocc.fromState=redState
				tocc.toState=greenState
				tocc.triggeringEvent=sys.events.filter[name.equals("railFreed"+rail.name.toFirstUpper)].get(0)
						
			}
		}
		
		return sys;
	}
}
