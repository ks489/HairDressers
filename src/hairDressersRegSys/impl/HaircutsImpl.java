/**
 */
package hairDressersRegSys.impl;

import hairDressersRegSys.HairDressersRegSysPackage;
import hairDressersRegSys.Haircuts;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Haircuts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hairDressersRegSys.impl.HaircutsImpl#isIsWash <em>Is Wash</em>}</li>
 *   <li>{@link hairDressersRegSys.impl.HaircutsImpl#isIsShave <em>Is Shave</em>}</li>
 *   <li>{@link hairDressersRegSys.impl.HaircutsImpl#isIsCut <em>Is Cut</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HaircutsImpl extends ServiceImpl implements Haircuts {
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
	 * The default value of the '{@link #isIsShave() <em>Is Shave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsShave()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SHAVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsShave() <em>Is Shave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsShave()
	 * @generated
	 * @ordered
	 */
	protected boolean isShave = IS_SHAVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsCut() <em>Is Cut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCut()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCut() <em>Is Cut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCut()
	 * @generated
	 * @ordered
	 */
	protected boolean isCut = IS_CUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HaircutsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HairDressersRegSysPackage.Literals.HAIRCUTS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.HAIRCUTS__IS_WASH, oldIsWash, isWash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsShave() {
		return isShave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsShave(boolean newIsShave) {
		boolean oldIsShave = isShave;
		isShave = newIsShave;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.HAIRCUTS__IS_SHAVE, oldIsShave, isShave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCut() {
		return isCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCut(boolean newIsCut) {
		boolean oldIsCut = isCut;
		isCut = newIsCut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.HAIRCUTS__IS_CUT, oldIsCut, isCut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HairDressersRegSysPackage.HAIRCUTS__IS_WASH:
				return isIsWash();
			case HairDressersRegSysPackage.HAIRCUTS__IS_SHAVE:
				return isIsShave();
			case HairDressersRegSysPackage.HAIRCUTS__IS_CUT:
				return isIsCut();
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
			case HairDressersRegSysPackage.HAIRCUTS__IS_WASH:
				setIsWash((Boolean)newValue);
				return;
			case HairDressersRegSysPackage.HAIRCUTS__IS_SHAVE:
				setIsShave((Boolean)newValue);
				return;
			case HairDressersRegSysPackage.HAIRCUTS__IS_CUT:
				setIsCut((Boolean)newValue);
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
			case HairDressersRegSysPackage.HAIRCUTS__IS_WASH:
				setIsWash(IS_WASH_EDEFAULT);
				return;
			case HairDressersRegSysPackage.HAIRCUTS__IS_SHAVE:
				setIsShave(IS_SHAVE_EDEFAULT);
				return;
			case HairDressersRegSysPackage.HAIRCUTS__IS_CUT:
				setIsCut(IS_CUT_EDEFAULT);
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
			case HairDressersRegSysPackage.HAIRCUTS__IS_WASH:
				return isWash != IS_WASH_EDEFAULT;
			case HairDressersRegSysPackage.HAIRCUTS__IS_SHAVE:
				return isShave != IS_SHAVE_EDEFAULT;
			case HairDressersRegSysPackage.HAIRCUTS__IS_CUT:
				return isCut != IS_CUT_EDEFAULT;
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
		result.append(", IsShave: ");
		result.append(isShave);
		result.append(", IsCut: ");
		result.append(isCut);
		result.append(')');
		return result.toString();
	}

} //HaircutsImpl
