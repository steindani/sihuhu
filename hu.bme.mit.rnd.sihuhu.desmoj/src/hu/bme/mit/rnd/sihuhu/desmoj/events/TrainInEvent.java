package hu.bme.mit.rnd.sihuhu.desmoj.events;

import hu.bme.mit.rnd.sihuhu.desmoj.SihuhuSimulationModel;
import hu.bme.mit.rnd.sihuhu.desmoj.entities.TrackElementEntity;
import hu.bme.mit.rnd.sihuhu.desmoj.entities.TrainEntity;
import desmoj.core.simulator.EventOf2Entities;
import desmoj.core.simulator.Model;

public class TrainInEvent extends EventOf2Entities<TrainEntity, TrackElementEntity>{
	
	private SihuhuSimulationModel model;

	public TrainInEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		model = (SihuhuSimulationModel) owner;
	}

	@Override
	public void eventRoutine(TrainEntity train1, TrackElementEntity trackElem1) {

		System.out.println("Train ("+ train1.myTrain.getName() +") came in ("+trackElem1.myElement.getName()+")!");
		// TODO Implement this using the dynamic model!
		
		//trackElem1.myElement.setTrain(train1.myTrain);
		
		//train1.myTrain.setNextElement(train1.myTrain.getOnTracks().get(0));
		//train1.myTrain.getOnTracks().add(train1.myTrain.getOnTracks().get(0));
		
		
		//TrainInEvent trainInEvent = new TrainInEvent(model, "Train comes In event", true);
		//trainInEvent.schedule(train1, model.trackElements.get("t1segS1"), new TimeSpan(1, TimeUnit.MINUTES));
		
		
	}

}
