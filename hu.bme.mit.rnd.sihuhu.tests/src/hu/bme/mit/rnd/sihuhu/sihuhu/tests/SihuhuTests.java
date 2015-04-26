/**
 */
package hu.bme.mit.rnd.sihuhu.sihuhu.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>sihuhu</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SihuhuTests extends TestSuite {

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
		TestSuite suite = new SihuhuTests("sihuhu Tests");
		suite.addTestSuite(SwitchTest.class);
		suite.addTestSuite(SignalTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SihuhuTests(String name) {
		super(name);
	}

} //SihuhuTests
