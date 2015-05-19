package hu.bme.mit.rnd.sihuhu.desmoj.entities;

import hu.bme.mit.rnd.sihuhu.sihuhu.TrackElement;
import desmoj.core.simulator.Entity;
import desmoj.core.simulator.Model;

public class TrackElementEntity extends Entity {
	
	public TrackElement myElement;

	public TrackElementEntity(TrackElement element, Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		myElement = element;
	}
	
}
