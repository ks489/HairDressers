/**
 */
package HairDressersRegistrationSystem.hairDressersRegSys.impl;

import HairDressersRegistrationSystem.hairDressersRegSys.Appointment;
import HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage;
import HairDressersRegistrationSystem.hairDressersRegSys.Service;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.impl.ServiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.impl.ServiceImpl#getCostPerHour <em>Cost Per Hour</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.impl.ServiceImpl#getTime <em>Time</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.impl.ServiceImpl#getAppointment <em>Appointment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostPerHour() <em>Cost Per Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerHour()
	 * @generated
	 * @ordered
	 */
	protected static final Float COST_PER_HOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostPerHour() <em>Cost Per Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerHour()
	 * @generated
	 * @ordered
	 */
	protected Float costPerHour = COST_PER_HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Date time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAppointment() <em>Appointment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointment()
	 * @generated
	 * @ordered
	 */
	protected EList<Appointment> appointment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HairDressersRegSysPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.SERVICE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getCostPerHour() {
		return costPerHour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostPerHour(Float newCostPerHour) {
		Float oldCostPerHour = costPerHour;
		costPerHour = newCostPerHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.SERVICE__COST_PER_HOUR, oldCostPerHour, costPerHour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Date newTime) {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.SERVICE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Appointment> getAppointment() {
		if (appointment == null) {
			appointment = new EObjectContainmentEList<Appointment>(Appointment.class, this, HairDressersRegSysPackage.SERVICE__APPOINTMENT);
		}
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void AddService() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void RemoveService() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ViewAllServices() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HairDressersRegSysPackage.SERVICE__APPOINTMENT:
				return ((InternalEList<?>)getAppointment()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HairDressersRegSysPackage.SERVICE__NAME:
				return getName();
			case HairDressersRegSysPackage.SERVICE__DESCRIPTION:
				return getDescription();
			case HairDressersRegSysPackage.SERVICE__COST_PER_HOUR:
				return getCostPerHour();
			case HairDressersRegSysPackage.SERVICE__TIME:
				return getTime();
			case HairDressersRegSysPackage.SERVICE__APPOINTMENT:
				return getAppointment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HairDressersRegSysPackage.SERVICE__NAME:
				setName((String)newValue);
				return;
			case HairDressersRegSysPackage.SERVICE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case HairDressersRegSysPackage.SERVICE__COST_PER_HOUR:
				setCostPerHour((Float)newValue);
				return;
			case HairDressersRegSysPackage.SERVICE__TIME:
				setTime((Date)newValue);
				return;
			case HairDressersRegSysPackage.SERVICE__APPOINTMENT:
				getAppointment().clear();
				getAppointment().addAll((Collection<? extends Appointment>)newValue);
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
			case HairDressersRegSysPackage.SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HairDressersRegSysPackage.SERVICE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case HairDressersRegSysPackage.SERVICE__COST_PER_HOUR:
				setCostPerHour(COST_PER_HOUR_EDEFAULT);
				return;
			case HairDressersRegSysPackage.SERVICE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case HairDressersRegSysPackage.SERVICE__APPOINTMENT:
				getAppointment().clear();
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
			case HairDressersRegSysPackage.SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HairDressersRegSysPackage.SERVICE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case HairDressersRegSysPackage.SERVICE__COST_PER_HOUR:
				return COST_PER_HOUR_EDEFAULT == null ? costPerHour != null : !COST_PER_HOUR_EDEFAULT.equals(costPerHour);
			case HairDressersRegSysPackage.SERVICE__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case HairDressersRegSysPackage.SERVICE__APPOINTMENT:
				return appointment != null && !appointment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HairDressersRegSysPackage.SERVICE___ADD_SERVICE:
				AddService();
				return null;
			case HairDressersRegSysPackage.SERVICE___REMOVE_SERVICE:
				RemoveService();
				return null;
			case HairDressersRegSysPackage.SERVICE___VIEW_ALL_SERVICES:
				ViewAllServices();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Description: ");
		result.append(description);
		result.append(", CostPerHour: ");
		result.append(costPerHour);
		result.append(", Time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
