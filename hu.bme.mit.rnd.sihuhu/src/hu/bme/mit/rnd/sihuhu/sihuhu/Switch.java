/**
 */
package hu.bme.mit.rnd.sihuhu.sihuhu;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.Switch#getConnections <em>Connections</em>}</li>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.Switch#getConnectedRails <em>Connected Rails</em>}</li>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.Switch#getActiveConnection <em>Active Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage#getSwitch()
 * @model
 * @generated
 */
public interface Switch extends TrackElement {
	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.rnd.sihuhu.sihuhu.SwitchConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage#getSwitch_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwitchConnection> getConnections();

	/**
	 * Returns the value of the '<em><b>Connected Rails</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.rnd.sihuhu.sihuhu.Rail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Rails</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Rails</em>' reference list.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage#getSwitch_ConnectedRails()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Rail> getConnectedRails();

	/**
	 * Returns the value of the '<em><b>Active Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Connection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Connection</em>' reference.
	 * @see #setActiveConnection(SwitchConnection)
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage#getSwitch_ActiveConnection()
	 * @model
	 * @generated
	 */
	SwitchConnection getActiveConnection();

	/**
	 * Sets the value of the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Switch#getActiveConnection <em>Active Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Connection</em>' reference.
	 * @see #getActiveConnection()
	 * @generated
	 */
	void setActiveConnection(SwitchConnection value);

} // Switch
