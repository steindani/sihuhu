/**
 */
package hu.bme.mit.rnd.sihuhu.sihuhu;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.Signal#getNextRail <em>Next Rail</em>}</li>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.Signal#isEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Next Rail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Rail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Rail</em>' reference.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage#getSignal_NextRail()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='hu.bme.mit.rnd.sihuhu.incquery.nextRail'"
	 * @generated
	 */
	Rail getNextRail();

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage#getSignal_Enabled()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='hu.bme.mit.rnd.sihuhu.incquery.enabled'"
	 * @generated
	 */
	boolean isEnabled();

} // Signal
