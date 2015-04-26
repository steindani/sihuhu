/**
 */
package hu.bme.mit.rnd.sihuhu.sihuhu.tests;

import hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuFactory;
import hu.bme.mit.rnd.sihuhu.sihuhu.SwitchConnection;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Switch Connection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwitchConnectionTest extends RailTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SwitchConnectionTest.class);
	}

	/**
	 * Constructs a new Switch Connection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchConnectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Switch Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SwitchConnection getFixture() {
		return (SwitchConnection)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SihuhuFactory.eINSTANCE.createSwitchConnection());
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

} //SwitchConnectionTest
