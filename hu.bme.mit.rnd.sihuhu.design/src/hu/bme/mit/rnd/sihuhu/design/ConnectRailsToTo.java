package hu.bme.mit.rnd.sihuhu.design;

import hu.bme.mit.rnd.sihuhu.sihuhu.Rail;
import hu.bme.mit.rnd.sihuhu.sihuhu.Switch;
import hu.bme.mit.rnd.sihuhu.sihuhu.SwitchConnection;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

public class ConnectRailsToTo implements IExternalJavaAction {

	public ConnectRailsToTo() {
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
				disconnectRails(source, sourceOldTo);
				sourceOldTo.getAllowedFrom().setName(
						sourceOldTo.getName() + "_from");
			}
		}

		if (target.getTo() instanceof Rail) {
			Rail targetOldTo = (Rail) target.getTo();
			if (targetOldTo != null) {
				disconnectRails(target, targetOldTo);
				targetOldTo.getAllowedFrom().setName(
						targetOldTo.getName() + "_to");
			}
		}

		// Set new connection and rename Signals
		if (target instanceof SwitchConnection) {
			source.setTo((Switch) ((SwitchConnection) target).eContainer());
		} else {
			source.setTo(target);
		}

		if (source instanceof SwitchConnection) {
			target.setTo((Switch) ((SwitchConnection) source).eContainer());
		} else {
			target.setTo(source);
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
