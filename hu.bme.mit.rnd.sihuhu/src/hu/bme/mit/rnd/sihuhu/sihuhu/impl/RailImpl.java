/**
 */
package hu.bme.mit.rnd.sihuhu.sihuhu.impl;

import hu.bme.mit.rnd.sihuhu.sihuhu.Rail;
import hu.bme.mit.rnd.sihuhu.sihuhu.Signal;
import hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage;
import hu.bme.mit.rnd.sihuhu.sihuhu.TrackElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.RailImpl#getAllowedTo <em>Allowed To</em>}</li>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.RailImpl#getAllowedFrom <em>Allowed From</em>}</li>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.RailImpl#getFrom <em>From</em>}</li>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.RailImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RailImpl extends TrackElementImpl implements Rail {
	/**
	 * The cached value of the '{@link #getAllowedTo() <em>Allowed To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedTo()
	 * @generated
	 * @ordered
	 */
	protected Signal allowedTo;

	/**
	 * The cached value of the '{@link #getAllowedFrom() <em>Allowed From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedFrom()
	 * @generated
	 * @ordered
	 */
	protected Signal allowedFrom;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected TrackElement from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected TrackElement to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SihuhuPackage.Literals.RAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getAllowedTo() {
		return allowedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllowedTo(Signal newAllowedTo, NotificationChain msgs) {
		Signal oldAllowedTo = allowedTo;
		allowedTo = newAllowedTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SihuhuPackage.RAIL__ALLOWED_TO, oldAllowedTo, newAllowedTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedTo(Signal newAllowedTo) {
		if (newAllowedTo != allowedTo) {
			NotificationChain msgs = null;
			if (allowedTo != null)
				msgs = ((InternalEObject)allowedTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SihuhuPackage.RAIL__ALLOWED_TO, null, msgs);
			if (newAllowedTo != null)
				msgs = ((InternalEObject)newAllowedTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SihuhuPackage.RAIL__ALLOWED_TO, null, msgs);
			msgs = basicSetAllowedTo(newAllowedTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SihuhuPackage.RAIL__ALLOWED_TO, newAllowedTo, newAllowedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getAllowedFrom() {
		return allowedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllowedFrom(Signal newAllowedFrom, NotificationChain msgs) {
		Signal oldAllowedFrom = allowedFrom;
		allowedFrom = newAllowedFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SihuhuPackage.RAIL__ALLOWED_FROM, oldAllowedFrom, newAllowedFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedFrom(Signal newAllowedFrom) {
		if (newAllowedFrom != allowedFrom) {
			NotificationChain msgs = null;
			if (allowedFrom != null)
				msgs = ((InternalEObject)allowedFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SihuhuPackage.RAIL__ALLOWED_FROM, null, msgs);
			if (newAllowedFrom != null)
				msgs = ((InternalEObject)newAllowedFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SihuhuPackage.RAIL__ALLOWED_FROM, null, msgs);
			msgs = basicSetAllowedFrom(newAllowedFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SihuhuPackage.RAIL__ALLOWED_FROM, newAllowedFrom, newAllowedFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackElement getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (TrackElement)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SihuhuPackage.RAIL__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackElement basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(TrackElement newFrom) {
		TrackElement oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SihuhuPackage.RAIL__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackElement getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (TrackElement)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SihuhuPackage.RAIL__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackElement basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(TrackElement newTo) {
		TrackElement oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SihuhuPackage.RAIL__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SihuhuPackage.RAIL__ALLOWED_TO:
				return basicSetAllowedTo(null, msgs);
			case SihuhuPackage.RAIL__ALLOWED_FROM:
				return basicSetAllowedFrom(null, msgs);
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
			case SihuhuPackage.RAIL__ALLOWED_TO:
				return getAllowedTo();
			case SihuhuPackage.RAIL__ALLOWED_FROM:
				return getAllowedFrom();
			case SihuhuPackage.RAIL__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case SihuhuPackage.RAIL__TO:
				if (resolve) return getTo();
				return basicGetTo();
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
			case SihuhuPackage.RAIL__ALLOWED_TO:
				setAllowedTo((Signal)newValue);
				return;
			case SihuhuPackage.RAIL__ALLOWED_FROM:
				setAllowedFrom((Signal)newValue);
				return;
			case SihuhuPackage.RAIL__FROM:
				setFrom((TrackElement)newValue);
				return;
			case SihuhuPackage.RAIL__TO:
				setTo((TrackElement)newValue);
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
			case SihuhuPackage.RAIL__ALLOWED_TO:
				setAllowedTo((Signal)null);
				return;
			case SihuhuPackage.RAIL__ALLOWED_FROM:
				setAllowedFrom((Signal)null);
				return;
			case SihuhuPackage.RAIL__FROM:
				setFrom((TrackElement)null);
				return;
			case SihuhuPackage.RAIL__TO:
				setTo((TrackElement)null);
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
			case SihuhuPackage.RAIL__ALLOWED_TO:
				return allowedTo != null;
			case SihuhuPackage.RAIL__ALLOWED_FROM:
				return allowedFrom != null;
			case SihuhuPackage.RAIL__FROM:
				return from != null;
			case SihuhuPackage.RAIL__TO:
				return to != null;
		}
		return super.eIsSet(featureID);
	}

} //RailImpl
