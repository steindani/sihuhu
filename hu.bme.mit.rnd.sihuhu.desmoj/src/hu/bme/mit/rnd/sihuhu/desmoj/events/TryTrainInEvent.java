package hu.bme.mit.rnd.sihuhu.desmoj.events;

import java.util.concurrent.TimeUnit;

import org.eclipse.emf.transaction.RecordingCommand;

import Behavior.Component;
import hu.bme.mit.rnd.behavior.handler.BehaviorModelManager;
import hu.bme.mit.rnd.sihuhu.desmoj.SihuhuSimulationModel;
import hu.bme.mit.rnd.sihuhu.desmoj.entities.TrainEntity;
import hu.bme.mit.rnd.sihuhu.sihuhu.Rail;
import hu.bme.mit.rnd.sihuhu.sihuhu.Switch;
import hu.bme.mit.rnd.sihuhu.sihuhu.TrackElement;
import desmoj.core.simulator.Event;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;

public class TryTrainInEvent extends Event<TrainEntity> {

	private SihuhuSimulationModel model;

	public TryTrainInEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		model = (SihuhuSimulationModel) owner;
	}

	@Override
	public void eventRoutine(TrainEntity train1) {

		if (model.isDebug)
			System.out.println("Train in Event! :" + train1.myTrain.getName());

		if (train1.myTrain.getNextElement() == null)
			return;
		for (TrackElement te : train1.myTrain.getOnTracks()) {
			if (isGreen(te, train1.myTrain.getNextElement())) {

				// If it is the next Element and it has Green light
				Rail newRail = getEffectiveElement(train1.myTrain
						.getNextElement());
				if (newRail == null)
					break;

				// Calculate the NEW next element (could be null!)
				TrackElement newNextElem = null;
				if (te.equals(getEffectiveElement(newRail.getFrom()))) {
					newNextElem = newRail.getTo();
				} else if (te.equals(getEffectiveElement(newRail.getTo()))) {
					newNextElem = newRail.getFrom();
				}
				TrackElement newNext = newNextElem;

				// Modify the dynamic model
				BehaviorModelManager.eventComesIn(
						model.dynSystem,
						model.dynEvents.get("trainIn"
								+ csillamize(newRail.getName())));

				System.out.println("Train (" + train1.myTrain.getName()
						+ ") came into " + newRail.getName());
				
				TraceTrainInEvent evt = new TraceTrainInEvent(model, "Train came in", true);
				evt.schedule(train1, model.mockRails.get(newRail.getName()), new TimeSpan(0, TimeUnit.SECONDS));

				if (model.isDebug)
					for (Component c : model.dynComponents.values()) {
						System.out.println("        COMP: " + c.getName()
								+ " STAT: " + c.getCurrentState().getName());
					}

				// Modify the structural model
				model.editingDomain.getCommandStack().execute(
						new RecordingCommand(model.editingDomain) {
							@Override
							protected void doExecute() {
								newRail.setTrain(train1.myTrain);
								train1.myTrain.setNextElement(newNext);
							}
						});

				pause();
				break;
			}

		}

	}

	private boolean isGreen(TrackElement trackElem1, TrackElement trackElem2) {
		try {
			String signalName = "signal" + csillamize(trackElem1.getName())
					+ "To" + csillamize(trackElem2.getName());
			Component comp = model.dynComponents.get(signalName);
			if (comp == null)
				return false;
			String stateName = comp.getCurrentState().getName();
			if ((signalName + "Green").equals(stateName))
				return true;
		} catch (Exception e) {
			System.out.println("Error with component!");
			return false;
		}

		return false;
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

	private void pause() {
		if (model.isGraphical)
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
	}
}
