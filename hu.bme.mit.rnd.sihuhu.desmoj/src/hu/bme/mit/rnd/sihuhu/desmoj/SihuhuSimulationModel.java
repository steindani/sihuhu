package hu.bme.mit.rnd.sihuhu.desmoj;

import hu.bme.mit.rnd.sihuhu.desmoj.entities.TrackElementEntity;
import hu.bme.mit.rnd.sihuhu.desmoj.entities.TrainEntity;
import hu.bme.mit.rnd.sihuhu.desmoj.events.RandomTrainEvent;
import hu.bme.mit.rnd.sihuhu.sihuhu.World;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeInstant;

public class SihuhuSimulationModel extends Model {

	public Map<String, TrainEntity> trains;
	public Map<String, TrackElementEntity> trackElements;
	
	protected Resource resourceStructural;
	protected Resource resourceDynamic;
	public TransactionalEditingDomain editingDomain;

	public SihuhuSimulationModel(Resource structuralRes, Resource dynamicRes, Model owner, String name,
			boolean showInReport, boolean showInTrace) {
		super(owner, name, showInReport, showInTrace);
		
		resourceStructural = structuralRes;
		resourceDynamic = dynamicRes;

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
		trackElements = new HashMap<String, TrackElementEntity>();
		
		World world = ((World) resourceStructural.getContents().get(0));
		
		world.getTracks().forEach(
				track -> {
					track.getRails().forEach(
							rail -> {
								System.out.println(rail.getName());
								trackElements.put(rail.getName(), new TrackElementEntity(rail, this, rail.getName(), false));
							});
				});
		
		world.getTracks().forEach(
				track -> {
					track.getSwitches().forEach(
							switch1 -> {
								System.out.println(switch1.getName());
								trackElements.put(switch1.getName(), new TrackElementEntity(switch1, this, switch1.getName(), false));
							});
				});
		
		world.getTracks().forEach(
				track -> {
					track.getSwitches().forEach(
							switch1 -> {
								switch1.getConnections().forEach(
										sConn -> {
								System.out.println(sConn.getName());
								trackElements.put(sConn.getName(), new TrackElementEntity(sConn, this, sConn.getName(), false));
										});
							});
				});
		
		world.getTrains().forEach(
				train -> {
								System.out.println(train.getName());
								trains.put(train.getName(), new TrainEntity(train, this, train.getName(), false));
				});
		
		editingDomain = (TransactionalEditingDomain) SimulationRunner.getEditingDomainFor(world);
		
	}

}
