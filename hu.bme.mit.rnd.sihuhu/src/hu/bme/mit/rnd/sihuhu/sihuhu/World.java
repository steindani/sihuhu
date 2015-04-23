/**
 */
package hu.bme.mit.rnd.sihuhu.sihuhu;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>World</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.World#getTracks <em>Tracks</em>}</li>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.World#getTrains <em>Trains</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage#getWorld()
 * @model
 * @generated
 */
public interface World extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Tracks</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.rnd.sihuhu.sihuhu.Track}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracks</em>' containment reference list.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage#getWorld_Tracks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Track> getTracks();

	/**
	 * Returns the value of the '<em><b>Trains</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.rnd.sihuhu.sihuhu.Train}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trains</em>' containment reference list.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage#getWorld_Trains()
	 * @model containment="true"
	 * @generated
	 */
	EList<Train> getTrains();

} // World
