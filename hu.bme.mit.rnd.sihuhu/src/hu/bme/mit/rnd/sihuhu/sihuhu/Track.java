/**
 */
package hu.bme.mit.rnd.sihuhu.sihuhu;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.Track#getRails <em>Rails</em>}</li>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.Track#getSwitches <em>Switches</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage#getTrack()
 * @model
 * @generated
 */
public interface Track extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Rails</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.rnd.sihuhu.sihuhu.Rail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rails</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rails</em>' containment reference list.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage#getTrack_Rails()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rail> getRails();

	/**
	 * Returns the value of the '<em><b>Switches</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.rnd.sihuhu.sihuhu.Switch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switches</em>' containment reference list.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage#getTrack_Switches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Switch> getSwitches();

} // Track
