/**
 */
package HairDressersRegistrationSystem.hairDressersRegSys;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.Invoice#getProducts <em>Products</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.Invoice#getDate <em>Date</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.Invoice#getInvoiceNumber <em>Invoice Number</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.Invoice#getTotal <em>Total</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.Invoice#getDiscounts <em>Discounts</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.Invoice#getPayment <em>Payment</em>}</li>
 * </ul>
 *
 * @see HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage#getInvoice()
 * @model
 * @generated
 */
public interface Invoice extends EObject {
	/**
	 * Returns the value of the '<em><b>Products</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link HairDressersRegistrationSystem.hairDressersRegSys.Products#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' reference.
	 * @see #setProducts(Products)
	 * @see HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage#getInvoice_Products()
	 * @see HairDressersRegistrationSystem.hairDressersRegSys.Products#getInvoice
	 * @model opposite="invoice"
	 * @generated
	 */
	Products getProducts();

	/**
	 * Sets the value of the '{@link HairDressersRegistrationSystem.hairDressersRegSys.Invoice#getProducts <em>Products</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Products</em>' reference.
	 * @see #getProducts()
	 * @generated
	 */
	void setProducts(Products value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage#getInvoice_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link HairDressersRegistrationSystem.hairDressersRegSys.Invoice#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Number</em>' attribute.
	 * @see #setInvoiceNumber(int)
	 * @see HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage#getInvoice_InvoiceNumber()
	 * @model
	 * @generated
	 */
	int getInvoiceNumber();

	/**
	 * Sets the value of the '{@link HairDressersRegistrationSystem.hairDressersRegSys.Invoice#getInvoiceNumber <em>Invoice Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Number</em>' attribute.
	 * @see #getInvoiceNumber()
	 * @generated
	 */
	void setInvoiceNumber(int value);

	/**
	 * Returns the value of the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' attribute.
	 * @see #setTotal(Float)
	 * @see HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage#getInvoice_Total()
	 * @model
	 * @generated
	 */
	Float getTotal();

	/**
	 * Sets the value of the '{@link HairDressersRegistrationSystem.hairDressersRegSys.Invoice#getTotal <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' attribute.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(Float value);

	/**
	 * Returns the value of the '<em><b>Discounts</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link HairDressersRegistrationSystem.hairDressersRegSys.Discounts#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discounts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discounts</em>' reference.
	 * @see #setDiscounts(Discounts)
	 * @see HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage#getInvoice_Discounts()
	 * @see HairDressersRegistrationSystem.hairDressersRegSys.Discounts#getInvoice
	 * @model opposite="invoice"
	 * @generated
	 */
	Discounts getDiscounts();

	/**
	 * Sets the value of the '{@link HairDressersRegistrationSystem.hairDressersRegSys.Invoice#getDiscounts <em>Discounts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discounts</em>' reference.
	 * @see #getDiscounts()
	 * @generated
	 */
	void setDiscounts(Discounts value);

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link HairDressersRegistrationSystem.hairDressersRegSys.Payment#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' reference.
	 * @see #setPayment(Payment)
	 * @see HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage#getInvoice_Payment()
	 * @see HairDressersRegistrationSystem.hairDressersRegSys.Payment#getInvoice
	 * @model opposite="invoice"
	 * @generated
	 */
	Payment getPayment();

	/**
	 * Sets the value of the '{@link HairDressersRegistrationSystem.hairDressersRegSys.Invoice#getPayment <em>Payment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment</em>' reference.
	 * @see #getPayment()
	 * @generated
	 */
	void setPayment(Payment value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void CalculateTotal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void GetDiscount();

} // Invoice
