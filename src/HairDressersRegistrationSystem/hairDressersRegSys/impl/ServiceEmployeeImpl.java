/**
 */
package HairDressersRegistrationSystem.hairDressersRegSys.impl;

import HairDressersRegistrationSystem.hairDressersRegSys.Appointment;
import HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage;
import HairDressersRegistrationSystem.hairDressersRegSys.ServiceEmployee;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.impl.ServiceEmployeeImpl#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.impl.ServiceEmployeeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.impl.ServiceEmployeeImpl#getEmployeeId <em>Employee Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceEmployeeImpl extends PersonImpl implements ServiceEmployee {
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
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmployeeId() <em>Employee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeId()
	 * @generated
	 * @ordered
	 */
	protected static final int EMPLOYEE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEmployeeId() <em>Employee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeId()
	 * @generated
	 * @ordered
	 */
	protected int employeeId = EMPLOYEE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceEmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HairDressersRegSysPackage.Literals.SERVICE_EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Appointment> getAppointment() {
		if (appointment == null) {
			appointment = new EObjectContainmentEList<Appointment>(Appointment.class, this, HairDressersRegSysPackage.SERVICE_EMPLOYEE__APPOINTMENT);
		}
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.SERVICE_EMPLOYEE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmployeeId(int newEmployeeId) {
		int oldEmployeeId = employeeId;
		employeeId = newEmployeeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.SERVICE_EMPLOYEE__EMPLOYEE_ID, oldEmployeeId, employeeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void MakeAppointment() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void AddNewEmployee() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ViewAllAvailableEmployees() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ViewAppointments() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void RemoveAppointment() {
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
			case HairDressersRegSysPackage.SERVICE_EMPLOYEE__APPOINTMENT:
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
			case HairDressersRegSysPackage.SERVICE_EMPLOYEE__APPOINTMENT:
				return getAppointment();
			case HairDressersRegSysPackage.SERVICE_EMPLOYEE__ROLE:
				return getRole();
			case HairDressersRegSysPackage.SERVICE_EMPLOYEE__EMPLOYEE_ID:
				return getEmployeeId();
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
			case HairDressersRegSysPackage.SERVICE_EMPLOYEE__APPOINTMENT:
				getAppointment().clear();
				getAppointment().addAll((Collection<? extends Appointment>)newValue);
				return;
			case HairDressersRegSysPackage.SERVICE_EMPLOYEE__ROLE:
				setRole((String)newValue);
				return;
			case HairDressersRegSysPackage.SERVICE_EMPLOYEE__EMPLOYEE_ID:
				setEmployeeId((Integer)newValue);
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
			case HairDressersRegSysPackage.SERVICE_EMPLOYEE__APPOINTMENT:
				getAppointment().clear();
				return;
			case HairDressersRegSysPackage.SERVICE_EMPLOYEE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case HairDressersRegSysPackage.SERVICE_EMPLOYEE__EMPLOYEE_ID:
				setEmployeeId(EMPLOYEE_ID_EDEFAULT);
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
			case HairDressersRegSysPackage.SERVICE_EMPLOYEE__APPOINTMENT:
				return appointment != null && !appointment.isEmpty();
			case HairDressersRegSysPackage.SERVICE_EMPLOYEE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case HairDressersRegSysPackage.SERVICE_EMPLOYEE__EMPLOYEE_ID:
				return employeeId != EMPLOYEE_ID_EDEFAULT;
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
			case HairDressersRegSysPackage.SERVICE_EMPLOYEE___MAKE_APPOINTMENT:
				MakeAppointment();
				return null;
			case HairDressersRegSysPackage.SERVICE_EMPLOYEE___ADD_NEW_EMPLOYEE:
				AddNewEmployee();
				return null;
			case HairDressersRegSysPackage.SERVICE_EMPLOYEE___VIEW_ALL_AVAILABLE_EMPLOYEES:
				ViewAllAvailableEmployees();
				return null;
			case HairDressersRegSysPackage.SERVICE_EMPLOYEE___VIEW_APPOINTMENTS:
				ViewAppointments();
				return null;
			case HairDressersRegSysPackage.SERVICE_EMPLOYEE___REMOVE_APPOINTMENT:
				RemoveAppointment();
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
		result.append(" (Role: ");
		result.append(role);
		result.append(", EmployeeId: ");
		result.append(employeeId);
		result.append(')');
		return result.toString();
	}

} //ServiceEmployeeImpl
