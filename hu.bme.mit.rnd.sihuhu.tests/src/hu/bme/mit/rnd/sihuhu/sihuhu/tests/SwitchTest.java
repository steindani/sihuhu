/**
 */
package hu.bme.mit.rnd.sihuhu.sihuhu.tests;

import hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuFactory;
import hu.bme.mit.rnd.sihuhu.sihuhu.Switch;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.Switch#getConnectedRails() <em>Connected Rails</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SwitchTest extends TrackElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SwitchTest.class);
	}

	/**
	 * Constructs a new Switch test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Switch test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Switch getFixture() {
		return (Switch)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SihuhuFactory.eINSTANCE.createSwitch());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Switch#getConnectedRails() <em>Connected Rails</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.Switch#getConnectedRails()
	 * @generated
	 */
	public void testGetConnectedRails() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //SwitchTest
