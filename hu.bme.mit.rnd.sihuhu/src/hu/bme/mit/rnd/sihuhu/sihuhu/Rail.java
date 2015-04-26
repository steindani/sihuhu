/**
 */
package hu.bme.mit.rnd.sihuhu.sihuhu;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.Rail#getAllowedTo <em>Allowed To</em>}</li>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.Rail#getAllowedFrom <em>Allowed From</em>}</li>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.Rail#getFrom <em>From</em>}</li>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.Rail#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage#getRail()
 * @model
 * @generated
 */
public interface Rail extends TrackElement {
	/**
	 * Returns the value of the '<em><b>Allowed To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed To</em>' containment reference.
	 * @see #setAllowedTo(Signal)
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage#getRail_AllowedTo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Signal getAllowedTo();

	/**
	 * Sets the value of the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Rail#getAllowedTo <em>Allowed To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed To</em>' containment reference.
	 * @see #getAllowedTo()
	 * @generated
	 */
	void setAllowedTo(Signal value);

	/**
	 * Returns the value of the '<em><b>Allowed From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed From</em>' containment reference.
	 * @see #setAllowedFrom(Signal)
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage#getRail_AllowedFrom()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Signal getAllowedFrom();

	/**
	 * Sets the value of the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Rail#getAllowedFrom <em>Allowed From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed From</em>' containment reference.
	 * @see #getAllowedFrom()
	 * @generated
	 */
	void setAllowedFrom(Signal value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(TrackElement)
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage#getRail_From()
	 * @model
	 * @generated
	 */
	TrackElement getFrom();

	/**
	 * Sets the value of the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Rail#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(TrackElement value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(TrackElement)
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage#getRail_To()
	 * @model
	 * @generated
	 */
	TrackElement getTo();

	/**
	 * Sets the value of the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Rail#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(TrackElement value);

} // Rail
