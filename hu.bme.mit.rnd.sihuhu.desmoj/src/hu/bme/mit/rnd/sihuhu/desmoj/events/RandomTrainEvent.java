package hu.bme.mit.rnd.sihuhu.desmoj.events;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import hu.bme.mit.rnd.sihuhu.desmoj.SihuhuSimulationModel;
import hu.bme.mit.rnd.sihuhu.desmoj.entities.TrainEntity;
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
		
		if(train1.myTrain.getOnTracks().size()>1){		
				TrainOutEvent trainOutEvent = new TrainOutEvent(model, "Train Goes Out event", true);
				trainOutEvent.schedule(train1, new TimeSpan(1, TimeUnit.MINUTES));
		} else {
			if (train1.myTrain.getNextElement()!=null){
				if (model.switches.get(train1.myTrain.getNextElement().getName())!=null) {
					RandomSwitchEvent randomSwitchEvent = new RandomSwitchEvent(model, "Random Switch event", true);
					randomSwitchEvent.schedule(train1, new TimeSpan(1, TimeUnit.MINUTES));
				} else {
					TrainInEvent trainInEvent = new TrainInEvent(model, "Train Comes In event", true);
					trainInEvent.schedule(train1, new TimeSpan(2, TimeUnit.MINUTES));
				}
			} else {
				System.out.println("Train ("+train1.myTrain.getName()+") has nowhere to go! :(");
			}
		}
		

		
		int idx = new Random().nextInt(model.trains.values().toArray().length);
		TrainEntity randomTrain = (TrainEntity)(model.trains.values().toArray()[idx]);
	
		RandomTrainEvent nextRandomTrainEvent = new RandomTrainEvent(model, "Random Train Event", true);
		nextRandomTrainEvent.schedule(randomTrain, new TimeSpan(5, TimeUnit.MINUTES));
	}

}
