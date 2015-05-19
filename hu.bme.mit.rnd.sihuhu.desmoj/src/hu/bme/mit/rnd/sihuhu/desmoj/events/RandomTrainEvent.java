package hu.bme.mit.rnd.sihuhu.desmoj.events;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import hu.bme.mit.rnd.sihuhu.desmoj.SihuhuSimulationModel;
import hu.bme.mit.rnd.sihuhu.desmoj.entities.TrackElementEntity;
import hu.bme.mit.rnd.sihuhu.desmoj.entities.TrainEntity;
import hu.bme.mit.rnd.sihuhu.sihuhu.Rail;
import desmoj.core.simulator.Event;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;

public class RandomTrainEvent extends Event<TrainEntity> {
	
	private SihuhuSimulationModel model;

	public RandomTrainEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		model = (SihuhuSimulationModel) owner;

	}

	@Override
	public void eventRoutine(TrainEntity train1) {
		TrackElementEntity nextElement = model.trackElements.get(train1.myTrain.getNextElement().getName());
		
		System.out.println("Train is on "+train1.myTrain.getOnTracks().size()+" tracks");
		
		if(train1.myTrain.getOnTracks().size()>1){
			// If train is on more than 1 element (= is in 2) then it leaves one
			// which is NOT next to out next element
			Rail r = (Rail) train1.myTrain.getOnTracks().get(0);
			if (r.getFrom().getName().equals(nextElement.myElement.getName()) || r.getTo().getName().equals(nextElement.myElement.getName())) {
				TrainOutEvent trainOutEvent = new TrainOutEvent(model, "Train Goes Out event", true);
				trainOutEvent.schedule(train1, model.trackElements.get(r.getName()), new TimeSpan(1, TimeUnit.MINUTES));				
			} else {
				Rail r2 = (Rail) train1.myTrain.getOnTracks().get(1);				
				TrainOutEvent trainOutEvent = new TrainOutEvent(model, "Train Goes Out event", true);
				trainOutEvent.schedule(train1, model.trackElements.get(r2.getName()), new TimeSpan(1, TimeUnit.MINUTES));				
			}
		} else {
			// If train is on only 1 element then it goes to its next
			TrainInEvent trainInEvent = new TrainInEvent(model, "Train Comes In event", true);
			trainInEvent.schedule(train1, nextElement, new TimeSpan(2, TimeUnit.MINUTES));
		}
		

		
		int idx = new Random().nextInt(model.trains.values().toArray().length);
		TrainEntity randomTrain = (TrainEntity)(model.trains.values().toArray()[idx]);
	
		RandomTrainEvent nextRandomTrainEvent = new RandomTrainEvent(model, "Random Train Event", true);
		nextRandomTrainEvent.schedule(randomTrain, new TimeSpan(5, TimeUnit.MINUTES));
	}

}
