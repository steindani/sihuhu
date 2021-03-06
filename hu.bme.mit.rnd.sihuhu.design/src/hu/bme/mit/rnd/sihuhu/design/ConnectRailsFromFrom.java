package hu.bme.mit.rnd.sihuhu.design;

import hu.bme.mit.rnd.sihuhu.sihuhu.Rail;
import hu.bme.mit.rnd.sihuhu.sihuhu.Switch;
import hu.bme.mit.rnd.sihuhu.sihuhu.SwitchConnection;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

public class ConnectRailsFromFrom implements IExternalJavaAction {

	public ConnectRailsFromFrom() {
	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {
		Rail source = (Rail) parameters.get("source");
		Rail target = (Rail) parameters.get("target");

		System.out.println(source);
		System.out.println(target);

		// Unset previous connection, if given, and rename Signals
		if (source.getFrom() instanceof Rail) {
			Rail sourceOldFrom = (Rail) source.getFrom();
			if (sourceOldFrom != null) {
				disconnectRails(source, sourceOldFrom);
				sourceOldFrom.getAllowedFrom().setName(
						sourceOldFrom.getName() + "_from");
			}
		}

		if (target.getFrom() instanceof Rail) {
			Rail targetOldTo = (Rail) target.getFrom();
			if (targetOldTo != null) {
				disconnectRails(target, targetOldTo);
				targetOldTo.getAllowedFrom().setName(
						targetOldTo.getName() + "_to");
			}
		}

		// Set new connection and rename Signals
		if (target instanceof SwitchConnection) {
			source.setFrom((Switch) ((SwitchConnection) target).eContainer());
		} else {
			source.setFrom(target);
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

	public void disconnectRails(Rail first, Rail second) {
		disconnectFrom(first, second);
		disconnectFrom(second, first);
	}
	
	public void disconnectFrom(Rail it, Rail that) {
		if (it.getFrom() == that) {
			it.setFrom(null);
		}
		
		if (it.getTo() == that) {
			it.setTo(null);
		}
	}
	
	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
