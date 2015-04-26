/**
 */
package hu.bme.mit.rnd.sihuhu.sihuhu;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Train</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.Train#getNextElement <em>Next Element</em>}</li>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.Train#getOnTracks <em>On Tracks</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage#getTrain()
 * @model
 * @generated
 */
public interface Train extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Next Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Element</em>' reference.
	 * @see #setNextElement(TrackElement)
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage#getTrain_NextElement()
	 * @model
	 * @generated
	 */
	TrackElement getNextElement();

	/**
	 * Sets the value of the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Train#getNextElement <em>Next Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Element</em>' reference.
	 * @see #getNextElement()
	 * @generated
	 */
	void setNextElement(TrackElement value);

	/**
	 * Returns the value of the '<em><b>On Tracks</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.rnd.sihuhu.sihuhu.TrackElement}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.rnd.sihuhu.sihuhu.TrackElement#getTrain <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Tracks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Tracks</em>' reference list.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage#getTrain_OnTracks()
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.TrackElement#getTrain
	 * @model opposite="train"
	 * @generated
	 */
	EList<TrackElement> getOnTracks();

} // Train
