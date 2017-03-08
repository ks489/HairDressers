/**
 */
package hairDressersRegSys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hairDressersRegSys.Customer#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link hairDressersRegSys.Customer#getDiscounts <em>Discounts</em>}</li>
 *   <li>{@link hairDressersRegSys.Customer#getCustomerId <em>Customer Id</em>}</li>
 * </ul>
 *
 * @see hairDressersRegSys.HairDressersRegSysPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends Person {
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
	 * @see hairDressersRegSys.HairDressersRegSysPackage#getCustomer_Appointment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Appointment> getAppointment();

	/**
	 * Returns the value of the '<em><b>Discounts</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hairDressersRegSys.Discounts#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discounts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discounts</em>' reference.
	 * @see #setDiscounts(Discounts)
	 * @see hairDressersRegSys.HairDressersRegSysPackage#getCustomer_Discounts()
	 * @see hairDressersRegSys.Discounts#getCustomer
	 * @model opposite="customer"
	 * @generated
	 */
	Discounts getDiscounts();

	/**
	 * Sets the value of the '{@link hairDressersRegSys.Customer#getDiscounts <em>Discounts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discounts</em>' reference.
	 * @see #getDiscounts()
	 * @generated
	 */
	void setDiscounts(Discounts value);

	/**
	 * Returns the value of the '<em><b>Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Id</em>' attribute.
	 * @see #setCustomerId(int)
	 * @see hairDressersRegSys.HairDressersRegSysPackage#getCustomer_CustomerId()
	 * @model
	 * @generated
	 */
	int getCustomerId();

	/**
	 * Sets the value of the '{@link hairDressersRegSys.Customer#getCustomerId <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Id</em>' attribute.
	 * @see #getCustomerId()
	 * @generated
	 */
	void setCustomerId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void PlaceAppointment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void AddNewCustomer();

} // Customer
