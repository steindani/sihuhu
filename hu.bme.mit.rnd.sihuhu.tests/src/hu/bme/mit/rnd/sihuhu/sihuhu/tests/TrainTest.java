/**
 */
package hu.bme.mit.rnd.sihuhu.sihuhu.tests;

import hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuFactory;
import hu.bme.mit.rnd.sihuhu.sihuhu.Train;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Train</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrainTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TrainTest.class);
	}

	/**
	 * Constructs a new Train test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Train test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Train getFixture() {
		return (Train)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SihuhuFactory.eINSTANCE.createTrain());
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

} //TrainTest
