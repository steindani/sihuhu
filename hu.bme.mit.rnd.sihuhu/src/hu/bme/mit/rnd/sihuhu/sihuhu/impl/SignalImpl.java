/**
 */
package hu.bme.mit.rnd.sihuhu.sihuhu.impl;

import hu.bme.mit.rnd.sihuhu.sihuhu.Rail;
import hu.bme.mit.rnd.sihuhu.sihuhu.Signal;
import hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.SignalImpl#getNextRail <em>Next Rail</em>}</li>
 *   <li>{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.SignalImpl#isEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalImpl extends NamedElementImpl implements Signal {
	/**
	 * The cached setting delegate for the '{@link #getNextRail() <em>Next Rail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextRail()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NEXT_RAIL__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SihuhuPackage.Literals.SIGNAL__NEXT_RAIL).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ENABLED__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SihuhuPackage.Literals.SIGNAL__ENABLED).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SihuhuPackage.Literals.SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rail getNextRail() {
		return (Rail)NEXT_RAIL__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rail basicGetNextRail() {
		return (Rail)NEXT_RAIL__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return (Boolean)ENABLED__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SihuhuPackage.SIGNAL__NEXT_RAIL:
				if (resolve) return getNextRail();
				return basicGetNextRail();
			case SihuhuPackage.SIGNAL__ENABLED:
				return isEnabled();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SihuhuPackage.SIGNAL__NEXT_RAIL:
				return NEXT_RAIL__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SihuhuPackage.SIGNAL__ENABLED:
				return ENABLED__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //SignalImpl
