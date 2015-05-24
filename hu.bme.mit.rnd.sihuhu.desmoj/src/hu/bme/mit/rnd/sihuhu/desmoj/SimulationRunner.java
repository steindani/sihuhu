package hu.bme.mit.rnd.sihuhu.desmoj;

import hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage;

import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import desmoj.core.simulator.Experiment;
import desmoj.core.simulator.TimeInstant;

public class SimulationRunner {
	public static void runSimulation(Resource structuralResource, Resource dynamicResource) {
		
        SihuhuSimulationModel model = new SihuhuSimulationModel(structuralResource, dynamicResource, null, "Sihuhu Simulation Model", true, false);

        Experiment experiment = new Experiment("Experiment", TimeUnit.SECONDS, TimeUnit.SECONDS, null);

        model.connectToExperiment(experiment);

        // Turn on the simulation trace from the start to the end
        experiment.traceOn(new TimeInstant(0));

        // Set when to stop the simulation
        experiment.stop(new TimeInstant(1, TimeUnit.HOURS));
        
        class runThread extends Thread{
        	@Override
			public void run(){
                experiment.start();

                // Create the report files
                experiment.report();

                experiment.finish();
        	}
        }
        
        Thread t = new runThread();
        t.start();


        
        
		
	}
	
	public static void main(String[] args) {
		try {
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("sihuhu", new XMIResourceFactoryImpl());

			ResourceSet resourceSet = new ResourceSetImpl();
			SihuhuPackage.eINSTANCE.eClass();
			TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet);
			
			Resource structuralRes =  resourceSet.getResource(URI.createURI("./Instance1.sihuhu"), true);
			Resource dynamicRes = null; //TODO: Add dynamic resource
		
			runSimulation(structuralRes, dynamicRes);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 *  use: AdapterFactoryEditingDomain.getEditingDomainFor(object)
	 *  don't forget to cast to TransactionalEditingDomain
	 *  source: http://www.eclipse.org/forums/index.php/t/129694/
	 */
	static public EditingDomain getEditingDomainFor(EObject object) {
		Resource resource = object.eResource();
		if (resource != null) {

			IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) EcoreUtil
					.getExistingAdapter(resource, IEditingDomainProvider.class);

			if (editingDomainProvider != null) {
				return editingDomainProvider.getEditingDomain();
			} else {
				ResourceSet resourceSet = resource.getResourceSet();

				if (resourceSet instanceof IEditingDomainProvider) {
					EditingDomain editingDomain = ((IEditingDomainProvider) resourceSet)
							.getEditingDomain();
					return editingDomain;
				} else if (resourceSet != null) {
					editingDomainProvider = (IEditingDomainProvider) EcoreUtil
							.getExistingAdapter(resourceSet,
									IEditingDomainProvider.class);
					if (editingDomainProvider != null) {
						return editingDomainProvider.getEditingDomain();
					}
				}
			}
		}
		
		

		return null;
	}
	
}