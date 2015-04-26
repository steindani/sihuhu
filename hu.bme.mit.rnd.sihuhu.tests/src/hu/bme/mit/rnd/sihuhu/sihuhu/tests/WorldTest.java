/**
 */
package hu.bme.mit.rnd.sihuhu.sihuhu.tests;

import hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuFactory;
import hu.bme.mit.rnd.sihuhu.sihuhu.World;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>World</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorldTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorldTest.class);
	}

	/**
	 * Constructs a new World test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorldTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this World test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected World getFixture() {
		return (World)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SihuhuFactory.eINSTANCE.createWorld());
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

} //WorldTest
