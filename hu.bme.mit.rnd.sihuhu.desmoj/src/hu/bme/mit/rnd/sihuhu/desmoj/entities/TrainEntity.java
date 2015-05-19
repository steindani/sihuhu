package hu.bme.mit.rnd.sihuhu.desmoj.entities;

import hu.bme.mit.rnd.sihuhu.sihuhu.Train;
import desmoj.core.simulator.Entity;
import desmoj.core.simulator.Model;

public class TrainEntity extends Entity {
	
	public Train myTrain;

	public TrainEntity(Train train, Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		myTrain = train;
	}
	
}
