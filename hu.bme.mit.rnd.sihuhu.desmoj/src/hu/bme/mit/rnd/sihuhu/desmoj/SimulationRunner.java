package hu.bme.mit.rnd.sihuhu.desmoj;

import hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage;

import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import desmoj.core.simulator.Experiment;
import desmoj.core.simulator.TimeInstant;

public class SimulationRunner {
	
	
	public static void main(String[] args) {
		try {
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("sihuhu", new XMIResourceFactoryImpl());

			ResourceSet resourceSet = new ResourceSetImpl();
			SihuhuPackage.eINSTANCE.eClass();
			
			Resource structuralRes =  resourceSet.getResource(URI.createURI("./Instance1.sihuhu"), true);
			Resource dynamicRes = null; //TODO: Add dynamic resource
		
        SihuhuSimulationModel model = new SihuhuSimulationModel(structuralRes, dynamicRes, null, "Sihuhu Simulation Model", true, false);

        Experiment experiment = new Experiment("Experiment", TimeUnit.SECONDS, TimeUnit.SECONDS, null);

        model.connectToExperiment(experiment);

        // Turn on the simulation trace from the start to the end
        experiment.traceOn(new TimeInstant(0));

        // Set when to stop the simulation
        experiment.stop(new TimeInstant(1, TimeUnit.HOURS));

        experiment.start();

        // Create the report files
        experiment.report();

        experiment.finish();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
