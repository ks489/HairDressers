/**
 */
package HairDressersRegistrationSystem.hairDressersRegSys;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discounts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.Discounts#getName <em>Name</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.Discounts#getDescription <em>Description</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.Discounts#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.Discounts#getCustomer <em>Customer</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.Discounts#getInvoice <em>Invoice</em>}</li>
 * </ul>
 *
 * @see HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage#getDiscounts()
 * @model
 * @generated
 */
public interface Discounts extends EObject {
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
	 * @see HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage#getDiscounts_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link HairDressersRegistrationSystem.hairDressersRegSys.Discounts#getName <em>Name</em>}' attribute.
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
	 * @see HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage#getDiscounts_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link HairDressersRegistrationSystem.hairDressersRegSys.Discounts#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage</em>' attribute.
	 * @see #setPercentage(int)
	 * @see HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage#getDiscounts_Percentage()
	 * @model
	 * @generated
	 */
	int getPercentage();

	/**
	 * Sets the value of the '{@link HairDressersRegistrationSystem.hairDressersRegSys.Discounts#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(int value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference list.
	 * The list contents are of type {@link HairDressersRegistrationSystem.hairDressersRegSys.Customer}.
	 * It is bidirectional and its opposite is '{@link HairDressersRegistrationSystem.hairDressersRegSys.Customer#getDiscounts <em>Discounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference list.
	 * @see HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage#getDiscounts_Customer()
	 * @see HairDressersRegistrationSystem.hairDressersRegSys.Customer#getDiscounts
	 * @model opposite="discounts"
	 * @generated
	 */
	EList<Customer> getCustomer();

	/**
	 * Returns the value of the '<em><b>Invoice</b></em>' reference list.
	 * The list contents are of type {@link HairDressersRegistrationSystem.hairDressersRegSys.Invoice}.
	 * It is bidirectional and its opposite is '{@link HairDressersRegistrationSystem.hairDressersRegSys.Invoice#getDiscounts <em>Discounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice</em>' reference list.
	 * @see HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage#getDiscounts_Invoice()
	 * @see HairDressersRegistrationSystem.hairDressersRegSys.Invoice#getDiscounts
	 * @model opposite="discounts"
	 * @generated
	 */
	EList<Invoice> getInvoice();

} // Discounts
