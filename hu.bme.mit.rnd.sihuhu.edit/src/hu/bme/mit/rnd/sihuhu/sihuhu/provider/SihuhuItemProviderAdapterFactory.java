/**
 */
package hu.bme.mit.rnd.sihuhu.sihuhu.provider;

import hu.bme.mit.rnd.sihuhu.sihuhu.util.SihuhuAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SihuhuItemProviderAdapterFactory extends SihuhuAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SihuhuItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.rnd.sihuhu.sihuhu.World} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorldItemProvider worldItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.rnd.sihuhu.sihuhu.World}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorldAdapter() {
		if (worldItemProvider == null) {
			worldItemProvider = new WorldItemProvider(this);
		}

		return worldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.rnd.sihuhu.sihuhu.Track} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackItemProvider trackItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.rnd.sihuhu.sihuhu.Track}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrackAdapter() {
		if (trackItemProvider == null) {
			trackItemProvider = new TrackItemProvider(this);
		}

		return trackItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.rnd.sihuhu.sihuhu.Rail} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RailItemProvider railItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.rnd.sihuhu.sihuhu.Rail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRailAdapter() {
		if (railItemProvider == null) {
			railItemProvider = new RailItemProvider(this);
		}

		return railItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.rnd.sihuhu.sihuhu.Switch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchItemProvider switchItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.rnd.sihuhu.sihuhu.Switch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSwitchAdapter() {
		if (switchItemProvider == null) {
			switchItemProvider = new SwitchItemProvider(this);
		}

		return switchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.rnd.sihuhu.sihuhu.SwitchConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchConnectionItemProvider switchConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.rnd.sihuhu.sihuhu.SwitchConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSwitchConnectionAdapter() {
		if (switchConnectionItemProvider == null) {
			switchConnectionItemProvider = new SwitchConnectionItemProvider(this);
		}

		return switchConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.rnd.sihuhu.sihuhu.Train} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainItemProvider trainItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.rnd.sihuhu.sihuhu.Train}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrainAdapter() {
		if (trainItemProvider == null) {
			trainItemProvider = new TrainItemProvider(this);
		}

		return trainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.rnd.sihuhu.sihuhu.Signal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalItemProvider signalItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.rnd.sihuhu.sihuhu.Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSignalAdapter() {
		if (signalItemProvider == null) {
			signalItemProvider = new SignalItemProvider(this);
		}

		return signalItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (worldItemProvider != null) worldItemProvider.dispose();
		if (trackItemProvider != null) trackItemProvider.dispose();
		if (railItemProvider != null) railItemProvider.dispose();
		if (switchItemProvider != null) switchItemProvider.dispose();
		if (switchConnectionItemProvider != null) switchConnectionItemProvider.dispose();
		if (trainItemProvider != null) trainItemProvider.dispose();
		if (signalItemProvider != null) signalItemProvider.dispose();
	}

}