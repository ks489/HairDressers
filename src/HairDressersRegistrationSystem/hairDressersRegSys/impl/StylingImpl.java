/**
 */
package HairDressersRegistrationSystem.hairDressersRegSys.impl;

import HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage;
import HairDressersRegistrationSystem.hairDressersRegSys.Styling;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Styling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.impl.StylingImpl#isIsWash <em>Is Wash</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StylingImpl extends ServiceImpl implements Styling {
	/**
	 * The default value of the '{@link #isIsWash() <em>Is Wash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWash()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_WASH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsWash() <em>Is Wash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWash()
	 * @generated
	 * @ordered
	 */
	protected boolean isWash = IS_WASH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StylingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HairDressersRegSysPackage.Literals.STYLING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsWash() {
		return isWash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsWash(boolean newIsWash) {
		boolean oldIsWash = isWash;
		isWash = newIsWash;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.STYLING__IS_WASH, oldIsWash, isWash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HairDressersRegSysPackage.STYLING__IS_WASH:
				return isIsWash();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HairDressersRegSysPackage.STYLING__IS_WASH:
				setIsWash((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HairDressersRegSysPackage.STYLING__IS_WASH:
				setIsWash(IS_WASH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HairDressersRegSysPackage.STYLING__IS_WASH:
				return isWash != IS_WASH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (IsWash: ");
		result.append(isWash);
		result.append(')');
		return result.toString();
	}

} //StylingImpl
