/**
 */
package hu.bme.mit.rnd.sihuhu.sihuhu;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.TrackElement#getTrain <em>Train</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage#getTrackElement()
 * @model abstract="true"
 * @generated
 */
public interface TrackElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Train</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Train#getOnTracks <em>On Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Train</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train</em>' reference.
	 * @see #setTrain(Train)
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage#getTrackElement_Train()
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.Train#getOnTracks
	 * @model opposite="onTracks"
	 * @generated
	 */
	Train getTrain();

	/**
	 * Sets the value of the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.TrackElement#getTrain <em>Train</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train</em>' reference.
	 * @see #getTrain()
	 * @generated
	 */
	void setTrain(Train value);

} // TrackElement
