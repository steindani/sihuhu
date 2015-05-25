/**
 */
package Behavior.impl;

import Behavior.BehaviorPackage;
import Behavior.Event;
import Behavior.State;
import Behavior.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Behavior.impl.TransitionImpl#getFromState <em>From State</em>}</li>
 *   <li>{@link Behavior.impl.TransitionImpl#getToState <em>To State</em>}</li>
 *   <li>{@link Behavior.impl.TransitionImpl#getGuardStates <em>Guard States</em>}</li>
 *   <li>{@link Behavior.impl.TransitionImpl#getTriggeringEvent <em>Triggering Event</em>}</li>
 *   <li>{@link Behavior.impl.TransitionImpl#getGeneratedEvent <em>Generated Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends NamedElementImpl implements Transition {
	/**
	 * The cached value of the '{@link #getFromState() <em>From State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromState()
	 * @generated
	 * @ordered
	 */
	protected State fromState;

	/**
	 * The cached value of the '{@link #getToState() <em>To State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToState()
	 * @generated
	 * @ordered
	 */
	protected State toState;

	/**
	 * The cached value of the '{@link #getGuardStates() <em>Guard States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> guardStates;

	/**
	 * The cached value of the '{@link #getTriggeringEvent() <em>Triggering Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggeringEvent()
	 * @generated
	 * @ordered
	 */
	protected Event triggeringEvent;

	/**
	 * The cached value of the '{@link #getGeneratedEvent() <em>Generated Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedEvent()
	 * @generated
	 * @ordered
	 */
	protected Event generatedEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getFromState() {
		if (fromState != null && fromState.eIsProxy()) {
			InternalEObject oldFromState = (InternalEObject)fromState;
			fromState = (State)eResolveProxy(oldFromState);
			if (fromState != oldFromState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.TRANSITION__FROM_STATE, oldFromState, fromState));
			}
		}
		return fromState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetFromState() {
		return fromState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromState(State newFromState) {
		State oldFromState = fromState;
		fromState = newFromState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.TRANSITION__FROM_STATE, oldFromState, fromState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getToState() {
		if (toState != null && toState.eIsProxy()) {
			InternalEObject oldToState = (InternalEObject)toState;
			toState = (State)eResolveProxy(oldToState);
			if (toState != oldToState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.TRANSITION__TO_STATE, oldToState, toState));
			}
		}
		return toState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetToState() {
		return toState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToState(State newToState) {
		State oldToState = toState;
		toState = newToState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.TRANSITION__TO_STATE, oldToState, toState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getGuardStates() {
		if (guardStates == null) {
			guardStates = new EObjectResolvingEList<State>(State.class, this, BehaviorPackage.TRANSITION__GUARD_STATES);
		}
		return guardStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getTriggeringEvent() {
		if (triggeringEvent != null && triggeringEvent.eIsProxy()) {
			InternalEObject oldTriggeringEvent = (InternalEObject)triggeringEvent;
			triggeringEvent = (Event)eResolveProxy(oldTriggeringEvent);
			if (triggeringEvent != oldTriggeringEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.TRANSITION__TRIGGERING_EVENT, oldTriggeringEvent, triggeringEvent));
			}
		}
		return triggeringEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetTriggeringEvent() {
		return triggeringEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggeringEvent(Event newTriggeringEvent) {
		Event oldTriggeringEvent = triggeringEvent;
		triggeringEvent = newTriggeringEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.TRANSITION__TRIGGERING_EVENT, oldTriggeringEvent, triggeringEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getGeneratedEvent() {
		if (generatedEvent != null && generatedEvent.eIsProxy()) {
			InternalEObject oldGeneratedEvent = (InternalEObject)generatedEvent;
			generatedEvent = (Event)eResolveProxy(oldGeneratedEvent);
			if (generatedEvent != oldGeneratedEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.TRANSITION__GENERATED_EVENT, oldGeneratedEvent, generatedEvent));
			}
		}
		return generatedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetGeneratedEvent() {
		return generatedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratedEvent(Event newGeneratedEvent) {
		Event oldGeneratedEvent = generatedEvent;
		generatedEvent = newGeneratedEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.TRANSITION__GENERATED_EVENT, oldGeneratedEvent, generatedEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.TRANSITION__FROM_STATE:
				if (resolve) return getFromState();
				return basicGetFromState();
			case BehaviorPackage.TRANSITION__TO_STATE:
				if (resolve) return getToState();
				return basicGetToState();
			case BehaviorPackage.TRANSITION__GUARD_STATES:
				return getGuardStates();
			case BehaviorPackage.TRANSITION__TRIGGERING_EVENT:
				if (resolve) return getTriggeringEvent();
				return basicGetTriggeringEvent();
			case BehaviorPackage.TRANSITION__GENERATED_EVENT:
				if (resolve) return getGeneratedEvent();
				return basicGetGeneratedEvent();
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
			case BehaviorPackage.TRANSITION__FROM_STATE:
				setFromState((State)newValue);
				return;
			case BehaviorPackage.TRANSITION__TO_STATE:
				setToState((State)newValue);
				return;
			case BehaviorPackage.TRANSITION__GUARD_STATES:
				getGuardStates().clear();
				getGuardStates().addAll((Collection<? extends State>)newValue);
				return;
			case BehaviorPackage.TRANSITION__TRIGGERING_EVENT:
				setTriggeringEvent((Event)newValue);
				return;
			case BehaviorPackage.TRANSITION__GENERATED_EVENT:
				setGeneratedEvent((Event)newValue);
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
			case BehaviorPackage.TRANSITION__FROM_STATE:
				setFromState((State)null);
				return;
			case BehaviorPackage.TRANSITION__TO_STATE:
				setToState((State)null);
				return;
			case BehaviorPackage.TRANSITION__GUARD_STATES:
				getGuardStates().clear();
				return;
			case BehaviorPackage.TRANSITION__TRIGGERING_EVENT:
				setTriggeringEvent((Event)null);
				return;
			case BehaviorPackage.TRANSITION__GENERATED_EVENT:
				setGeneratedEvent((Event)null);
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
			case BehaviorPackage.TRANSITION__FROM_STATE:
				return fromState != null;
			case BehaviorPackage.TRANSITION__TO_STATE:
				return toState != null;
			case BehaviorPackage.TRANSITION__GUARD_STATES:
				return guardStates != null && !guardStates.isEmpty();
			case BehaviorPackage.TRANSITION__TRIGGERING_EVENT:
				return triggeringEvent != null;
			case BehaviorPackage.TRANSITION__GENERATED_EVENT:
				return generatedEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
