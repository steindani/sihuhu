package hu.bme.mit.rnd.sihuhu.design.actions;
import hu.bme.mit.rnd.sihuhu.design.ISimulationConnector;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.sirius.diagram.ui.part.SiriusDiagramEditor;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

/**
 * Our sample action implements workbench action delegate.
 * The action proxy will be created by the workbench and
 * shown in the UI. When the user tries to use the action,
 * this delegate will be created and execution will be 
 * delegated to it.
 * @see IWorkbenchWindowActionDelegate
 */
public class SimulateAction implements IWorkbenchWindowActionDelegate, IPartListener {
	protected IWorkbenchWindow window;
	protected IWorkbenchPart lastActivePart;
	
	/**
	 * The action has been activated. The argument of the
	 * method represents the 'real' action sitting
	 * in the workbench UI.
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	@SuppressWarnings("restriction")
	public void run(IAction action) {
//		MessageDialog.openInformation(
//			window.getShell(),
//			"Simulation",
//			"Hello, Eclipse world");
//		System.out.println(lastActivePart);
		
		if (lastActivePart instanceof SiriusDiagramEditor) {
			SiriusDiagramEditor editor = (SiriusDiagramEditor) lastActivePart;
			EList<Resource> resources = editor.getDiagram().eResource().getResourceSet().getResources();
			System.out.println(resources);
			
			((org.eclipse.sirius.diagram.business.internal.metamodel.spec.DSemanticDiagramSpec) ((org.eclipse.sirius.viewpoint.description.impl.AnnotationEntryImpl) editor
					.getDiagram().eContainer()).eContainer())
					.getOwnedRepresentationElements().forEach(
							representationElement -> {
//								System.out.println(representationElement.getClass());
//								System.out.println(representationElement);
								
								if (representationElement instanceof org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeContainerSpec) {
									org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeContainerSpec containerSpec = (org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeContainerSpec) representationElement;
									
									URI resourceURI = EcoreUtil.getURI(containerSpec.getTarget()).trimFragment();
									System.out.println(resourceURI);
									
									resources.forEach(
											resource -> {
												if (resource.getURI().equals(resourceURI)) {
													System.out.println("FOUND: " + resource);
													runSimulation(resource);
												}
											}
									);
								}
							});
		}
		
//		IEditorReference[] editorReferences = window.getWorkbench().getActiveWorkbenchWindow().getActivePage().getEditorReferences();
//		if (editorReferences.length > 0) {
//			try {
//				IEditorInput editorInput = editorReferences[0].getEditorInput();
//				editorInput.getName();
//			} catch (PartInitException e) {
//				e.printStackTrace();
//			}
//		}
	}

	protected void runSimulation(Resource resource) {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] config = registry.getConfigurationElementsFor("hu.bme.mit.rnd.sihuhu.design.sihuhu_simulator");
		try {
			for (IConfigurationElement e : config) {
				final Object o = e.createExecutableExtension("connector");
				if (o instanceof ISimulationConnector) {
					ISimulationConnector connector = (ISimulationConnector) o;
					executeExtension(connector, resource);
				}
			}
		} catch (CoreException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	private void executeExtension(final ISimulationConnector connector, Resource resource) {
		System.out.println("Running extension on " + connector + " with " + resource);
		ISafeRunnable runnable = new ISafeRunnable() {
			@Override
			public void handleException(Throwable e) {
				System.out.println("Exception in client");
			}

			@Override
			public void run() throws Exception {
				connector.runSimulation(resource);
			}
		};
		SafeRunner.run(runnable);
	}

	/**
	 * Selection in the workbench has been changed. We 
	 * can change the state of the 'real' action here
	 * if we want, but this can only happen after 
	 * the delegate has been created.
	 * @see IWorkbenchWindowActionDelegate#selectionChanged
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

	/**
	 * We can use this method to dispose of any system
	 * resources we previously allocated.
	 * @see IWorkbenchWindowActionDelegate#dispose
	 */
	public void dispose() {
	}

	/**
	 * We will cache window object in order to
	 * be able to provide parent shell for the message dialog.
	 * @see IWorkbenchWindowActionDelegate#init
	 */
	public void init(IWorkbenchWindow window) {
		this.window = window;
		window.getPartService().addPartListener(this);
	}
	
	// ------------------------------------------------------------------------

	@Override
	public void partActivated(IWorkbenchPart part) {
		lastActivePart = part;
	}

	@Override
	public void partBroughtToTop(IWorkbenchPart part) {
		lastActivePart = part;
	}

	@Override
	public void partClosed(IWorkbenchPart part) {}

	@Override
	public void partDeactivated(IWorkbenchPart part) {}

	@Override
	public void partOpened(IWorkbenchPart part) {}
}