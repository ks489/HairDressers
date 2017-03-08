/**
 */
package HairDressersRegistrationSystem.hairDressersRegSys.impl;

import HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage;
import HairDressersRegistrationSystem.hairDressersRegSys.Other;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Other</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.impl.OtherImpl#getAdditionalInformation <em>Additional Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OtherImpl extends ServiceImpl implements Other {
	/**
	 * The default value of the '{@link #getAdditionalInformation() <em>Additional Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_INFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalInformation() <em>Additional Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation()
	 * @generated
	 * @ordered
	 */
	protected String additionalInformation = ADDITIONAL_INFORMATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OtherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HairDressersRegSysPackage.Literals.OTHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdditionalInformation() {
		return additionalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalInformation(String newAdditionalInformation) {
		String oldAdditionalInformation = additionalInformation;
		additionalInformation = newAdditionalInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.OTHER__ADDITIONAL_INFORMATION, oldAdditionalInformation, additionalInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HairDressersRegSysPackage.OTHER__ADDITIONAL_INFORMATION:
				return getAdditionalInformation();
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
			case HairDressersRegSysPackage.OTHER__ADDITIONAL_INFORMATION:
				setAdditionalInformation((String)newValue);
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
			case HairDressersRegSysPackage.OTHER__ADDITIONAL_INFORMATION:
				setAdditionalInformation(ADDITIONAL_INFORMATION_EDEFAULT);
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
			case HairDressersRegSysPackage.OTHER__ADDITIONAL_INFORMATION:
				return ADDITIONAL_INFORMATION_EDEFAULT == null ? additionalInformation != null : !ADDITIONAL_INFORMATION_EDEFAULT.equals(additionalInformation);
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
		result.append(" (AdditionalInformation: ");
		result.append(additionalInformation);
		result.append(')');
		return result.toString();
	}

} //OtherImpl
