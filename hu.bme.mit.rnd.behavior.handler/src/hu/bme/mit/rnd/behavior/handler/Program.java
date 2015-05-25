package hu.bme.mit.rnd.behavior.handler;



import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import Behavior.Component;
import Behavior.Event;
import hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage;
import hu.bme.mit.rnd.sihuhu.sihuhu.Switch;
import hu.bme.mit.rnd.sihuhu.sihuhu.Track;
import hu.bme.mit.rnd.sihuhu.sihuhu.World;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("sihuhu", new XMIResourceFactoryImpl());

		ResourceSet resourceSet = new ResourceSetImpl();
		SihuhuPackage.eINSTANCE.eClass();
		
		Resource structuralRes =  resourceSet.getResource(URI.createURI("./Tanszek.sihuhu"), true);
		World world = ((World) structuralRes.getContents().get(0));
		Track t= world.getTracks().get(0);
		
		
		
		
		Behavior.System system=BehaviorModelManager.getBehaviorModel(world);

		System.out.println(":)");

	}
	

}

