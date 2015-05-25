/**
 */
package Behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Behavior.Transition#getFromState <em>From State</em>}</li>
 *   <li>{@link Behavior.Transition#getToState <em>To State</em>}</li>
 *   <li>{@link Behavior.Transition#getGuardStates <em>Guard States</em>}</li>
 *   <li>{@link Behavior.Transition#getTriggeringEvent <em>Triggering Event</em>}</li>
 *   <li>{@link Behavior.Transition#getGeneratedEvent <em>Generated Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see Behavior.BehaviorPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>From State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From State</em>' reference.
	 * @see #setFromState(State)
	 * @see Behavior.BehaviorPackage#getTransition_FromState()
	 * @model
	 * @generated
	 */
	State getFromState();

	/**
	 * Sets the value of the '{@link Behavior.Transition#getFromState <em>From State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From State</em>' reference.
	 * @see #getFromState()
	 * @generated
	 */
	void setFromState(State value);

	/**
	 * Returns the value of the '<em><b>To State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To State</em>' reference.
	 * @see #setToState(State)
	 * @see Behavior.BehaviorPackage#getTransition_ToState()
	 * @model
	 * @generated
	 */
	State getToState();

	/**
	 * Sets the value of the '{@link Behavior.Transition#getToState <em>To State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To State</em>' reference.
	 * @see #getToState()
	 * @generated
	 */
	void setToState(State value);

	/**
	 * Returns the value of the '<em><b>Guard States</b></em>' reference list.
	 * The list contents are of type {@link Behavior.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard States</em>' reference list.
	 * @see Behavior.BehaviorPackage#getTransition_GuardStates()
	 * @model
	 * @generated
	 */
	EList<State> getGuardStates();

	/**
	 * Returns the value of the '<em><b>Triggering Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggering Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggering Event</em>' reference.
	 * @see #setTriggeringEvent(Event)
	 * @see Behavior.BehaviorPackage#getTransition_TriggeringEvent()
	 * @model
	 * @generated
	 */
	Event getTriggeringEvent();

	/**
	 * Sets the value of the '{@link Behavior.Transition#getTriggeringEvent <em>Triggering Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggering Event</em>' reference.
	 * @see #getTriggeringEvent()
	 * @generated
	 */
	void setTriggeringEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Generated Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Event</em>' reference.
	 * @see #setGeneratedEvent(Event)
	 * @see Behavior.BehaviorPackage#getTransition_GeneratedEvent()
	 * @model
	 * @generated
	 */
	Event getGeneratedEvent();

	/**
	 * Sets the value of the '{@link Behavior.Transition#getGeneratedEvent <em>Generated Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated Event</em>' reference.
	 * @see #getGeneratedEvent()
	 * @generated
	 */
	void setGeneratedEvent(Event value);

} // Transition
