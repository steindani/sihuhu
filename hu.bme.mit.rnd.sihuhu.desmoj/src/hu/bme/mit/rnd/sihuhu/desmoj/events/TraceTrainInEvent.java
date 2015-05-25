package hu.bme.mit.rnd.sihuhu.desmoj.events;

import hu.bme.mit.rnd.sihuhu.desmoj.SihuhuSimulationModel;
import hu.bme.mit.rnd.sihuhu.desmoj.entities.RailEntity;
import hu.bme.mit.rnd.sihuhu.desmoj.entities.TrainEntity;
import desmoj.core.simulator.EventOf2Entities;
import desmoj.core.simulator.Model;

public class TraceTrainInEvent extends EventOf2Entities<TrainEntity, RailEntity> {
	
	private SihuhuSimulationModel model;

	public TraceTrainInEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		model = (SihuhuSimulationModel) owner;
	}

	@Override
	public void eventRoutine(TrainEntity who1, RailEntity who2) {
		model.railFrequencyHistogram.update(who2.getName().split("#")[0]);
		
	}

}
