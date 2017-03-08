/**
 */
package hairDressersRegSys;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hairDressersRegSys.Service#getName <em>Name</em>}</li>
 *   <li>{@link hairDressersRegSys.Service#getDescription <em>Description</em>}</li>
 *   <li>{@link hairDressersRegSys.Service#getCostPerHour <em>Cost Per Hour</em>}</li>
 *   <li>{@link hairDressersRegSys.Service#getTime <em>Time</em>}</li>
 *   <li>{@link hairDressersRegSys.Service#getAppointment <em>Appointment</em>}</li>
 * </ul>
 *
 * @see hairDressersRegSys.HairDressersRegSysPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hairDressersRegSys.HairDressersRegSysPackage#getService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hairDressersRegSys.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see hairDressersRegSys.HairDressersRegSysPackage#getService_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link hairDressersRegSys.Service#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Cost Per Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Per Hour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Per Hour</em>' attribute.
	 * @see #setCostPerHour(Float)
	 * @see hairDressersRegSys.HairDressersRegSysPackage#getService_CostPerHour()
	 * @model
	 * @generated
	 */
	Float getCostPerHour();

	/**
	 * Sets the value of the '{@link hairDressersRegSys.Service#getCostPerHour <em>Cost Per Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Per Hour</em>' attribute.
	 * @see #getCostPerHour()
	 * @generated
	 */
	void setCostPerHour(Float value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(Date)
	 * @see hairDressersRegSys.HairDressersRegSysPackage#getService_Time()
	 * @model
	 * @generated
	 */
	Date getTime();

	/**
	 * Sets the value of the '{@link hairDressersRegSys.Service#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Date value);

	/**
	 * Returns the value of the '<em><b>Appointment</b></em>' containment reference list.
	 * The list contents are of type {@link hairDressersRegSys.Appointment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appointment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointment</em>' containment reference list.
	 * @see hairDressersRegSys.HairDressersRegSysPackage#getService_Appointment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Appointment> getAppointment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void AddService();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void RemoveService();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ViewAllServices();

} // Service
