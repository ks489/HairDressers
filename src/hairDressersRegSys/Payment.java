/**
 */
package hairDressersRegSys;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hairDressersRegSys.Payment#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link hairDressersRegSys.Payment#getDate <em>Date</em>}</li>
 *   <li>{@link hairDressersRegSys.Payment#getAmountPaid <em>Amount Paid</em>}</li>
 *   <li>{@link hairDressersRegSys.Payment#getInvoice <em>Invoice</em>}</li>
 * </ul>
 *
 * @see hairDressersRegSys.HairDressersRegSysPackage#getPayment()
 * @model
 * @generated
 */
public interface Payment extends EObject {
	/**
	 * Returns the value of the '<em><b>Payment Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method</em>' attribute.
	 * @see #setPaymentMethod(String)
	 * @see hairDressersRegSys.HairDressersRegSysPackage#getPayment_PaymentMethod()
	 * @model
	 * @generated
	 */
	String getPaymentMethod();

	/**
	 * Sets the value of the '{@link hairDressersRegSys.Payment#getPaymentMethod <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method</em>' attribute.
	 * @see #getPaymentMethod()
	 * @generated
	 */
	void setPaymentMethod(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see hairDressersRegSys.HairDressersRegSysPackage#getPayment_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link hairDressersRegSys.Payment#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Amount Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Paid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Paid</em>' attribute.
	 * @see #setAmountPaid(Float)
	 * @see hairDressersRegSys.HairDressersRegSysPackage#getPayment_AmountPaid()
	 * @model
	 * @generated
	 */
	Float getAmountPaid();

	/**
	 * Sets the value of the '{@link hairDressersRegSys.Payment#getAmountPaid <em>Amount Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Paid</em>' attribute.
	 * @see #getAmountPaid()
	 * @generated
	 */
	void setAmountPaid(Float value);

	/**
	 * Returns the value of the '<em><b>Invoice</b></em>' reference list.
	 * The list contents are of type {@link hairDressersRegSys.Invoice}.
	 * It is bidirectional and its opposite is '{@link hairDressersRegSys.Invoice#getPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice</em>' reference list.
	 * @see hairDressersRegSys.HairDressersRegSysPackage#getPayment_Invoice()
	 * @see hairDressersRegSys.Invoice#getPayment
	 * @model opposite="payment" required="true"
	 * @generated
	 */
	EList<Invoice> getInvoice();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void MakePayment();

} // Payment
