package hu.bme.mit.rnd.sihuhu.desmoj;

import hu.bme.mit.rnd.behavior.handler.BehaviorModelManager;
import hu.bme.mit.rnd.sihuhu.desmoj.entities.TrainEntity;
import hu.bme.mit.rnd.sihuhu.desmoj.events.RandomTrainEvent;
import hu.bme.mit.rnd.sihuhu.sihuhu.Switch;
import hu.bme.mit.rnd.sihuhu.sihuhu.TrackElement;
import hu.bme.mit.rnd.sihuhu.sihuhu.World;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import Behavior.Component;
import Behavior.Event;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeInstant;

public class SihuhuSimulationModel extends Model {

	public Map<String, TrainEntity> trains;
	public Map<String, TrackElement> trackElements;
	public Map<String, Switch> switches;
	
	public Map<String, Component> dynComponents;
	public Behavior.System dynSystem;
	public Map<String, Event> dynEvents;
	
	protected Resource resourceStructural;
	protected Resource resourceDynamic;
	public TransactionalEditingDomain editingDomain;
	public boolean isGraphical;
	public boolean isDebug = false;


	public SihuhuSimulationModel(Resource structuralRes, Resource dynamicRes, boolean fromGraphical, Model owner, String name,
			boolean showInReport, boolean showInTrace) {
		super(owner, name, showInReport, showInTrace);
		
		resourceStructural = structuralRes;
		resourceDynamic = dynamicRes;
		isGraphical = fromGraphical;
		isDebug = false;

	}

	@Override
	public String description() {
		return "Sihuhu Train Simulation Model";
	}

	@Override
	public void doInitialSchedules() {
		// At the beginning we schedule a random train event
		int idx = new Random().nextInt(trains.values().toArray().length);
		TrainEntity randomTrain = (TrainEntity)(trains.values().toArray()[idx]);
	
		RandomTrainEvent nextRandomTrainEvent = new RandomTrainEvent(this, "Random Train Event", true);
		nextRandomTrainEvent.schedule(randomTrain, new TimeInstant(0));
	}

	@Override
	public void init() {
		trains = new HashMap<String, TrainEntity>();
		trackElements = new HashMap<String, TrackElement>();
		switches = new HashMap<String, Switch>();
		dynComponents = new HashMap<String, Component>();
		dynEvents = new HashMap<String, Event>();
		
		World world = ((World) resourceStructural.getContents().get(0));
		
		writeDebug("\nTrackElements:");
		
		world.getTracks().forEach(
				track -> {
					track.getRails().forEach(
							rail -> {
								writeDebug(rail.getName());
								trackElements.put(rail.getName(), rail);
							});
				});
		
		world.getTracks().forEach(
				track -> {
					track.getSwitches().forEach(
							switch1 -> {
								writeDebug(switch1.getName());
								trackElements.put(switch1.getName(), switch1);
								switches.put(switch1.getName(), switch1);
							});
				});
		
		
		world.getTracks().forEach(
				track -> {
					track.getSwitches().forEach(
							switch1 -> {
								switch1.getConnections().forEach(
										sConn -> {
								writeDebug(sConn.getName());
								trackElements.put(sConn.getName(), sConn);
										});
							});
				});
		
		
		writeDebug("\nTrains:");
		world.getTrains().forEach(
				train -> {
								writeDebug(train.getName());
								trains.put(train.getName(), new TrainEntity(train, this, train.getName(), false));
				});
		
		//If there is no given Dynamic model, we generate one
		if (resourceDynamic == null) {
			dynSystem = BehaviorModelManager.getBehaviorModel(world);
		} else {
			dynSystem = ((Behavior.System) resourceDynamic.getContents().get(0));
		}
		
		writeDebug("\nEvents:");
		dynSystem.getEvents().forEach(
				event -> {
					try {
					writeDebug(event.getName());
					dynEvents.put(event.getName(), event);
					} catch (Exception e) {System.out.println("Error with event: "+e.getMessage());}

				}
				);
		
		writeDebug("\nComponents:");
		dynSystem.getComponents().forEach(
				comp -> {
					try {
					writeDebug(comp.getName()+ " state: "+comp.getCurrentState().getName());
					dynComponents.put(comp.getName(), comp);
					} catch (Exception e) {System.out.println("Error with component: "+e.getMessage());}
				}
				);		
		
		editingDomain = (TransactionalEditingDomain) SimulationRunner.getEditingDomainFor(world);
		
	}
	
	public void writeDebug(String s){
		if(isDebug) {
			System.out.println(s);
		}
	}

}
