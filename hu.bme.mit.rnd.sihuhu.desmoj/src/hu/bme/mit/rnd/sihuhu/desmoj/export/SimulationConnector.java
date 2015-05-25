package hu.bme.mit.rnd.sihuhu.desmoj.export;

import hu.bme.mit.rnd.sihuhu.design.ISimulationConnector;
import hu.bme.mit.rnd.sihuhu.desmoj.SimulationRunner;

import org.eclipse.emf.ecore.resource.Resource;

public class SimulationConnector implements ISimulationConnector {

	public SimulationConnector() {
		System.out.println("Desmo-J SimulationConnector created.");
	}

	@Override
	public void runSimulation(Resource structuralResource) {
		System.out.println("Running Eclipse-connected simulation.");
		try {
			SimulationRunner.runSimulation(structuralResource, null, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
