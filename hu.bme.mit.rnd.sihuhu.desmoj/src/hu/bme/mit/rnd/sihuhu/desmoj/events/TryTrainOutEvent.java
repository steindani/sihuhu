package hu.bme.mit.rnd.sihuhu.desmoj.events;

import java.util.concurrent.TimeUnit;

import org.eclipse.emf.transaction.RecordingCommand;

import Behavior.Component;
import hu.bme.mit.rnd.behavior.handler.BehaviorModelManager;
import hu.bme.mit.rnd.sihuhu.desmoj.SihuhuSimulationModel;
import hu.bme.mit.rnd.sihuhu.desmoj.entities.TrainEntity;
import hu.bme.mit.rnd.sihuhu.sihuhu.Rail;
import hu.bme.mit.rnd.sihuhu.sihuhu.TrackElement;
import desmoj.core.simulator.Event;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;

public class TryTrainOutEvent extends Event<TrainEntity> {

	private SihuhuSimulationModel model;

	public TryTrainOutEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		model = (SihuhuSimulationModel) owner;
	}

	@Override
	public void eventRoutine(TrainEntity train1) {

		if (model.isDebug)
			System.out.println("Train out Event! :" + train1.myTrain.getName());

		for (TrackElement te : train1.myTrain.getOnTracks()) {
			if (!isNextTo(te, train1.myTrain.getNextElement())) {

				// Update the dynamic model
				BehaviorModelManager.eventComesIn(
						model.dynSystem,
						model.dynEvents.get("trainOut"
								+ csillamize(te.getName())));

				System.out.println("Train (" + train1.myTrain.getName()
						+ ") left " + te.getName());
				
				TraceTrainOutEvent evt = new TraceTrainOutEvent(model, "Train left rail", true);
				evt.schedule(train1, model.mockRails.get(te.getName()), new TimeSpan(0, TimeUnit.SECONDS));

				if (model.isDebug)
					for (Component c : model.dynComponents.values()) {
						System.out.println("        COMP: " + c.getName()
								+ " STAT: " + c.getCurrentState().getName());
					}

				// Update the structural model
				model.editingDomain.getCommandStack().execute(
						new RecordingCommand(model.editingDomain) {
							@Override
							protected void doExecute() {
								train1.myTrain.getOnTracks().remove(te);
							}
						});

				pause();
			}

		}

	}

	private boolean isNextTo(TrackElement t1, TrackElement t2) {
		try {
			Rail rail = (Rail) (t1);
			if (rail.getFrom().equals(t2)) {
				return true;
			}
			if (rail.getTo().equals(t2)) {
				return true;
			}
		} catch (Exception e) {
			System.out.println("Someting bad happened with isNextTo"
					+ e.getMessage());
			return false;
		}
		return false;
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
