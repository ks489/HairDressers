/**
 */
package HairDressersRegistrationSystem.hairDressersRegSys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.ServiceEmployee#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.ServiceEmployee#getRole <em>Role</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.ServiceEmployee#getEmployeeId <em>Employee Id</em>}</li>
 * </ul>
 *
 * @see HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage#getServiceEmployee()
 * @model
 * @generated
 */
public interface ServiceEmployee extends Person {
	/**
	 * Returns the value of the '<em><b>Appointment</b></em>' containment reference list.
	 * The list contents are of type {@link HairDressersRegistrationSystem.hairDressersRegSys.Appointment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appointment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointment</em>' containment reference list.
	 * @see HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage#getServiceEmployee_Appointment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Appointment> getAppointment();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage#getServiceEmployee_Role()
	 * @model
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link HairDressersRegistrationSystem.hairDressersRegSys.ServiceEmployee#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Employee Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee Id</em>' attribute.
	 * @see #setEmployeeId(int)
	 * @see HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage#getServiceEmployee_EmployeeId()
	 * @model
	 * @generated
	 */
	int getEmployeeId();

	/**
	 * Sets the value of the '{@link HairDressersRegistrationSystem.hairDressersRegSys.ServiceEmployee#getEmployeeId <em>Employee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee Id</em>' attribute.
	 * @see #getEmployeeId()
	 * @generated
	 */
	void setEmployeeId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void MakeAppointment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void AddNewEmployee();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ViewAllAvailableEmployees();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ViewAppointments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void RemoveAppointment();

} // ServiceEmployee
