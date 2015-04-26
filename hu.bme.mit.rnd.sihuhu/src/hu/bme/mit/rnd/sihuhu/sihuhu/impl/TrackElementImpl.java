/**
 */
package hu.bme.mit.rnd.sihuhu.sihuhu.impl;

import hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage;
import hu.bme.mit.rnd.sihuhu.sihuhu.TrackElement;
import hu.bme.mit.rnd.sihuhu.sihuhu.Train;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Track Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.TrackElementImpl#getTrain <em>Train</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TrackElementImpl extends NamedElementImpl implements TrackElement {
	/**
	 * The cached value of the '{@link #getTrain() <em>Train</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrain()
	 * @generated
	 * @ordered
	 */
	protected Train train;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SihuhuPackage.Literals.TRACK_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Train getTrain() {
		if (train != null && train.eIsProxy()) {
			InternalEObject oldTrain = (InternalEObject)train;
			train = (Train)eResolveProxy(oldTrain);
			if (train != oldTrain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SihuhuPackage.TRACK_ELEMENT__TRAIN, oldTrain, train));
			}
		}
		return train;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Train basicGetTrain() {
		return train;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrain(Train newTrain, NotificationChain msgs) {
		Train oldTrain = train;
		train = newTrain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SihuhuPackage.TRACK_ELEMENT__TRAIN, oldTrain, newTrain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrain(Train newTrain) {
		if (newTrain != train) {
			NotificationChain msgs = null;
			if (train != null)
				msgs = ((InternalEObject)train).eInverseRemove(this, SihuhuPackage.TRAIN__ON_TRACKS, Train.class, msgs);
			if (newTrain != null)
				msgs = ((InternalEObject)newTrain).eInverseAdd(this, SihuhuPackage.TRAIN__ON_TRACKS, Train.class, msgs);
			msgs = basicSetTrain(newTrain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SihuhuPackage.TRACK_ELEMENT__TRAIN, newTrain, newTrain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SihuhuPackage.TRACK_ELEMENT__TRAIN:
				if (train != null)
					msgs = ((InternalEObject)train).eInverseRemove(this, SihuhuPackage.TRAIN__ON_TRACKS, Train.class, msgs);
				return basicSetTrain((Train)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SihuhuPackage.TRACK_ELEMENT__TRAIN:
				return basicSetTrain(null, msgs);
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
			case SihuhuPackage.TRACK_ELEMENT__TRAIN:
				if (resolve) return getTrain();
				return basicGetTrain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SihuhuPackage.TRACK_ELEMENT__TRAIN:
				setTrain((Train)newValue);
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
			case SihuhuPackage.TRACK_ELEMENT__TRAIN:
				setTrain((Train)null);
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
			case SihuhuPackage.TRACK_ELEMENT__TRAIN:
				return train != null;
		}
		return super.eIsSet(featureID);
	}

} //TrackElementImpl
