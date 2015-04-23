/**
 */
package hu.bme.mit.rnd.sihuhu.sihuhu.impl;

import hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage;
import hu.bme.mit.rnd.sihuhu.sihuhu.TrackElement;
import hu.bme.mit.rnd.sihuhu.sihuhu.Train;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Train</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.TrainImpl#getNextElement <em>Next Element</em>}</li>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.TrainImpl#getOnTracks <em>On Tracks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrainImpl extends NamedElementImpl implements Train {
	/**
	 * The cached value of the '{@link #getNextElement() <em>Next Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextElement()
	 * @generated
	 * @ordered
	 */
	protected TrackElement nextElement;

	/**
	 * The cached value of the '{@link #getOnTracks() <em>On Tracks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnTracks()
	 * @generated
	 * @ordered
	 */
	protected EList<TrackElement> onTracks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SihuhuPackage.Literals.TRAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackElement getNextElement() {
		if (nextElement != null && nextElement.eIsProxy()) {
			InternalEObject oldNextElement = (InternalEObject)nextElement;
			nextElement = (TrackElement)eResolveProxy(oldNextElement);
			if (nextElement != oldNextElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SihuhuPackage.TRAIN__NEXT_ELEMENT, oldNextElement, nextElement));
			}
		}
		return nextElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackElement basicGetNextElement() {
		return nextElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextElement(TrackElement newNextElement) {
		TrackElement oldNextElement = nextElement;
		nextElement = newNextElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SihuhuPackage.TRAIN__NEXT_ELEMENT, oldNextElement, nextElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrackElement> getOnTracks() {
		if (onTracks == null) {
			onTracks = new EObjectWithInverseResolvingEList<TrackElement>(TrackElement.class, this, SihuhuPackage.TRAIN__ON_TRACKS, SihuhuPackage.TRACK_ELEMENT__TRAIN);
		}
		return onTracks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SihuhuPackage.TRAIN__ON_TRACKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOnTracks()).basicAdd(otherEnd, msgs);
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
			case SihuhuPackage.TRAIN__ON_TRACKS:
				return ((InternalEList<?>)getOnTracks()).basicRemove(otherEnd, msgs);
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
			case SihuhuPackage.TRAIN__NEXT_ELEMENT:
				if (resolve) return getNextElement();
				return basicGetNextElement();
			case SihuhuPackage.TRAIN__ON_TRACKS:
				return getOnTracks();
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
			case SihuhuPackage.TRAIN__NEXT_ELEMENT:
				setNextElement((TrackElement)newValue);
				return;
			case SihuhuPackage.TRAIN__ON_TRACKS:
				getOnTracks().clear();
				getOnTracks().addAll((Collection<? extends TrackElement>)newValue);
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
			case SihuhuPackage.TRAIN__NEXT_ELEMENT:
				setNextElement((TrackElement)null);
				return;
			case SihuhuPackage.TRAIN__ON_TRACKS:
				getOnTracks().clear();
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
			case SihuhuPackage.TRAIN__NEXT_ELEMENT:
				return nextElement != null;
			case SihuhuPackage.TRAIN__ON_TRACKS:
				return onTracks != null && !onTracks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrainImpl
