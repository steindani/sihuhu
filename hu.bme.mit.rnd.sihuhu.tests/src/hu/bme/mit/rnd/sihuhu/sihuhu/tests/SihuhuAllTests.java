/**
 */
package hu.bme.mit.rnd.sihuhu.sihuhu.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Sihuhu</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class SihuhuAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new SihuhuAllTests("Sihuhu Tests");
		suite.addTest(SihuhuTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SihuhuAllTests(String name) {
		super(name);
	}

} //SihuhuAllTests
