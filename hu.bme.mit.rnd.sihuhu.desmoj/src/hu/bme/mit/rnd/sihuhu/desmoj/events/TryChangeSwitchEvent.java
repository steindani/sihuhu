package hu.bme.mit.rnd.sihuhu.desmoj.events;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.transaction.RecordingCommand;

import Behavior.Component;
import hu.bme.mit.rnd.behavior.handler.BehaviorModelManager;
import hu.bme.mit.rnd.sihuhu.desmoj.SihuhuSimulationModel;
import hu.bme.mit.rnd.sihuhu.desmoj.entities.TrainEntity;
import hu.bme.mit.rnd.sihuhu.sihuhu.Rail;
import hu.bme.mit.rnd.sihuhu.sihuhu.Switch;
import hu.bme.mit.rnd.sihuhu.sihuhu.SwitchConnection;
import hu.bme.mit.rnd.sihuhu.sihuhu.TrackElement;
import desmoj.core.simulator.Event;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;

public class TryChangeSwitchEvent extends Event<TrainEntity> {

	private SihuhuSimulationModel model;

	public TryChangeSwitchEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		model = (SihuhuSimulationModel) owner;
	}

	@Override
	public void eventRoutine(TrainEntity train1) {

		if (model.isDebug)
			System.out.println("Random Switch Event! :"
					+ train1.myTrain.getName());

		if (train1.myTrain.getNextElement() == null)
			return;

		// If the next element is NOT a Switch
		if (model.switches.get(train1.myTrain.getNextElement().getName()) == null)
			return;

		Switch sw = (Switch) train1.myTrain.getNextElement();

		// If the next element is occupied
		if ((sw.getActiveConnection()!=null) && (sw.getActiveConnection().getTrain()!=null))
			return;

		List<SwitchConnection> possibleConns = new ArrayList<SwitchConnection>();

		for (TrackElement te : train1.myTrain.getOnTracks()) {
			for (SwitchConnection sc : sw.getConnections())
				if (te.equals(getEffectiveElement(sc.getFrom()))
						|| te.equals(getEffectiveElement(sc.getTo())))
					possibleConns.add(sc);
		}

		if (possibleConns.isEmpty())
			return;

		int idx = new Random().nextInt(possibleConns.size());
		SwitchConnection randomConn = (SwitchConnection) (possibleConns
				.get(idx));

		// Modify the dynamic model
		BehaviorModelManager.eventComesIn(model.dynSystem,
				model.dynEvents.get("switch" + csillamize(sw.getName())+"To"+csillamize(randomConn.getName())));

		System.out.println("Train (" + train1.myTrain.getName()
				+ ") switched " + sw.getName() + " into " + randomConn.getName());
		
		TraceChangeSwitchEvent evt = new TraceChangeSwitchEvent(model, "Train changed switch", true);
		evt.schedule(train1, model.mockRails.get(sw.getName()), model.mockRails.get(randomConn.getName()), new TimeSpan(0, TimeUnit.SECONDS));

		if (model.isDebug)
			for (Component c : model.dynComponents.values()) {
				System.out.println("        COMP: " + c.getName() + " STAT: "
						+ c.getCurrentState().getName());
			}

		// Modify the structural model
		model.editingDomain.getCommandStack().execute(
				new RecordingCommand(model.editingDomain) {
					@Override
					protected void doExecute() {
						sw.setActiveConnection(randomConn);
					}
				});

		TryTrainInEvent trainInEvent = new TryTrainInEvent(model, "Try to come in", false);
		trainInEvent.schedule(train1, new TimeSpan(1, TimeUnit.SECONDS));
	}

	private Rail getEffectiveElement(TrackElement te) {
		try {
			if (model.switches.get(te.getName()) != null) {
				Switch sw = (Switch) te;
				return sw.getActiveConnection();
			}
			return (Rail) te;
		} catch (Exception e) {
			System.out.println("Error with Rail!");
			return null;
		}

	}

	private String csillamize(final String s) {
		return Character.toUpperCase(s.charAt(0)) + s.substring(1);
	}

}
