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
				TryTrainOutEvent trainOutEvent = new TryTrainOutEvent(model, "Try to go out", false);
				trainOutEvent.schedule(train1, new TimeSpan(1, TimeUnit.SECONDS));
		} else {
			if (train1.myTrain.getNextElement()!=null){
				if (model.switches.get(train1.myTrain.getNextElement().getName())!=null) {
					TryChangeSwitchEvent randomSwitchEvent = new TryChangeSwitchEvent(model, "Try to change switch", false);
					randomSwitchEvent.schedule(train1, new TimeSpan(1, TimeUnit.SECONDS));
				} else {
					TryTrainInEvent trainInEvent = new TryTrainInEvent(model, "Try to come in", false);
					trainInEvent.schedule(train1, new TimeSpan(2, TimeUnit.SECONDS));
				}
			} else {
				System.out.println("Train ("+train1.myTrain.getName()+") has nowhere to go! :(");
			}
		}
		

		
		int idx = new Random().nextInt(model.trains.values().toArray().length);
		TrainEntity randomTrain = (TrainEntity)(model.trains.values().toArray()[idx]);
	
		RandomTrainEvent nextRandomTrainEvent = new RandomTrainEvent(model, "Random Train Event", false);
		nextRandomTrainEvent.schedule(randomTrain, new TimeSpan(5, TimeUnit.SECONDS));
	}

}
