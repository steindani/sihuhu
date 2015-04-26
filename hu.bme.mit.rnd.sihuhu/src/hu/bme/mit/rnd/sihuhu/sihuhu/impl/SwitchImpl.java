/**
 */
package hu.bme.mit.rnd.sihuhu.sihuhu.impl;

import hu.bme.mit.rnd.sihuhu.sihuhu.Rail;
import hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage;
import hu.bme.mit.rnd.sihuhu.sihuhu.Switch;
import hu.bme.mit.rnd.sihuhu.sihuhu.SwitchConnection;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.SwitchImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.SwitchImpl#getConnectedRails <em>Connected Rails</em>}</li>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.SwitchImpl#getActiveConnection <em>Active Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchImpl extends TrackElementImpl implements Switch {
	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchConnection> connections;

	/**
	 * The cached setting delegate for the '{@link #getConnectedRails() <em>Connected Rails</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedRails()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONNECTED_RAILS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SihuhuPackage.Literals.SWITCH__CONNECTED_RAILS).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getActiveConnection() <em>Active Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveConnection()
	 * @generated
	 * @ordered
	 */
	protected SwitchConnection activeConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SihuhuPackage.Literals.SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwitchConnection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<SwitchConnection>(SwitchConnection.class, this, SihuhuPackage.SWITCH__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Rail> getConnectedRails() {
		return (EList<Rail>)CONNECTED_RAILS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchConnection getActiveConnection() {
		if (activeConnection != null && activeConnection.eIsProxy()) {
			InternalEObject oldActiveConnection = (InternalEObject)activeConnection;
			activeConnection = (SwitchConnection)eResolveProxy(oldActiveConnection);
			if (activeConnection != oldActiveConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SihuhuPackage.SWITCH__ACTIVE_CONNECTION, oldActiveConnection, activeConnection));
			}
		}
		return activeConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchConnection basicGetActiveConnection() {
		return activeConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveConnection(SwitchConnection newActiveConnection) {
		SwitchConnection oldActiveConnection = activeConnection;
		activeConnection = newActiveConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SihuhuPackage.SWITCH__ACTIVE_CONNECTION, oldActiveConnection, activeConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SihuhuPackage.SWITCH__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SihuhuPackage.SWITCH__CONNECTIONS:
				return getConnections();
			case SihuhuPackage.SWITCH__CONNECTED_RAILS:
				return getConnectedRails();
			case SihuhuPackage.SWITCH__ACTIVE_CONNECTION:
				if (resolve) return getActiveConnection();
				return basicGetActiveConnection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SihuhuPackage.SWITCH__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends SwitchConnection>)newValue);
				return;
			case SihuhuPackage.SWITCH__ACTIVE_CONNECTION:
				setActiveConnection((SwitchConnection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SihuhuPackage.SWITCH__CONNECTIONS:
				getConnections().clear();
				return;
			case SihuhuPackage.SWITCH__ACTIVE_CONNECTION:
				setActiveConnection((SwitchConnection)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SihuhuPackage.SWITCH__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case SihuhuPackage.SWITCH__CONNECTED_RAILS:
				return CONNECTED_RAILS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SihuhuPackage.SWITCH__ACTIVE_CONNECTION:
				return activeConnection != null;
		}
		return super.eIsSet(featureID);
	}

} //SwitchImpl
