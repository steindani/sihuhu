package hu.bme.mit.rnd.sihuhu.design;

import hu.bme.mit.rnd.sihuhu.sihuhu.Rail;
import hu.bme.mit.rnd.sihuhu.sihuhu.Switch;
import hu.bme.mit.rnd.sihuhu.sihuhu.SwitchConnection;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

public class ConnectRails implements IExternalJavaAction {

	public ConnectRails() {
	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {
		Rail source = (Rail) parameters.get("source");
		Rail target = (Rail) parameters.get("target");

		System.out.println(source);
		System.out.println(target);

		// Unset previous connection, if given, and rename Signals
		if (source.getTo() instanceof Rail) {
			Rail sourceOldTo = (Rail) source.getTo();
			if (sourceOldTo != null) {
				sourceOldTo.setFrom(null);
				sourceOldTo.getAllowedFrom().setName(
						sourceOldTo.getName() + "_from");
			}
		}

		if (target.getFrom() instanceof Rail) {
			Rail targetOldFrom = (Rail) target.getFrom();
			if (targetOldFrom != null) {
				targetOldFrom.setTo(null);
				targetOldFrom.getAllowedFrom().setName(
						targetOldFrom.getName() + "_to");
			}
		}

		// Set new connection and rename Signals
		if (target instanceof SwitchConnection) {
			source.setTo((Switch) ((SwitchConnection) target).eContainer());
		} else {
			source.setTo(target);
		}

		if (source instanceof SwitchConnection) {
			target.setFrom((Switch) ((SwitchConnection) source).eContainer());
		} else {
			target.setFrom(source);
		}

		source.getAllowedTo().setName(
				source.getName() + "_to_" + target.getName());
		target.getAllowedFrom().setName(
				target.getName() + "_from_" + source.getName());
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
