/**
 */
package hairDressersRegSys.impl;

import hairDressersRegSys.HairDressersRegSysPackage;
import hairDressersRegSys.Invoice;
import hairDressersRegSys.Payment;

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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hairDressersRegSys.impl.PaymentImpl#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link hairDressersRegSys.impl.PaymentImpl#getDate <em>Date</em>}</li>
 *   <li>{@link hairDressersRegSys.impl.PaymentImpl#getAmountPaid <em>Amount Paid</em>}</li>
 *   <li>{@link hairDressersRegSys.impl.PaymentImpl#getInvoice <em>Invoice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentImpl extends MinimalEObjectImpl.Container implements Payment {
	/**
	 * The default value of the '{@link #getPaymentMethod() <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentMethod() <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethod()
	 * @generated
	 * @ordered
	 */
	protected String paymentMethod = PAYMENT_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountPaid() <em>Amount Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountPaid()
	 * @generated
	 * @ordered
	 */
	protected static final Float AMOUNT_PAID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmountPaid() <em>Amount Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountPaid()
	 * @generated
	 * @ordered
	 */
	protected Float amountPaid = AMOUNT_PAID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInvoice() <em>Invoice</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoice()
	 * @generated
	 * @ordered
	 */
	protected EList<Invoice> invoice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HairDressersRegSysPackage.Literals.PAYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentMethod(String newPaymentMethod) {
		String oldPaymentMethod = paymentMethod;
		paymentMethod = newPaymentMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.PAYMENT__PAYMENT_METHOD, oldPaymentMethod, paymentMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.PAYMENT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getAmountPaid() {
		return amountPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountPaid(Float newAmountPaid) {
		Float oldAmountPaid = amountPaid;
		amountPaid = newAmountPaid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.PAYMENT__AMOUNT_PAID, oldAmountPaid, amountPaid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Invoice> getInvoice() {
		if (invoice == null) {
			invoice = new EObjectWithInverseResolvingEList<Invoice>(Invoice.class, this, HairDressersRegSysPackage.PAYMENT__INVOICE, HairDressersRegSysPackage.INVOICE__PAYMENT);
		}
		return invoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void MakePayment() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HairDressersRegSysPackage.PAYMENT__INVOICE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInvoice()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HairDressersRegSysPackage.PAYMENT__INVOICE:
				return ((InternalEList<?>)getInvoice()).basicRemove(otherEnd, msgs);
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
			case HairDressersRegSysPackage.PAYMENT__PAYMENT_METHOD:
				return getPaymentMethod();
			case HairDressersRegSysPackage.PAYMENT__DATE:
				return getDate();
			case HairDressersRegSysPackage.PAYMENT__AMOUNT_PAID:
				return getAmountPaid();
			case HairDressersRegSysPackage.PAYMENT__INVOICE:
				return getInvoice();
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
			case HairDressersRegSysPackage.PAYMENT__PAYMENT_METHOD:
				setPaymentMethod((String)newValue);
				return;
			case HairDressersRegSysPackage.PAYMENT__DATE:
				setDate((Date)newValue);
				return;
			case HairDressersRegSysPackage.PAYMENT__AMOUNT_PAID:
				setAmountPaid((Float)newValue);
				return;
			case HairDressersRegSysPackage.PAYMENT__INVOICE:
				getInvoice().clear();
				getInvoice().addAll((Collection<? extends Invoice>)newValue);
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
			case HairDressersRegSysPackage.PAYMENT__PAYMENT_METHOD:
				setPaymentMethod(PAYMENT_METHOD_EDEFAULT);
				return;
			case HairDressersRegSysPackage.PAYMENT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case HairDressersRegSysPackage.PAYMENT__AMOUNT_PAID:
				setAmountPaid(AMOUNT_PAID_EDEFAULT);
				return;
			case HairDressersRegSysPackage.PAYMENT__INVOICE:
				getInvoice().clear();
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
			case HairDressersRegSysPackage.PAYMENT__PAYMENT_METHOD:
				return PAYMENT_METHOD_EDEFAULT == null ? paymentMethod != null : !PAYMENT_METHOD_EDEFAULT.equals(paymentMethod);
			case HairDressersRegSysPackage.PAYMENT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case HairDressersRegSysPackage.PAYMENT__AMOUNT_PAID:
				return AMOUNT_PAID_EDEFAULT == null ? amountPaid != null : !AMOUNT_PAID_EDEFAULT.equals(amountPaid);
			case HairDressersRegSysPackage.PAYMENT__INVOICE:
				return invoice != null && !invoice.isEmpty();
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
			case HairDressersRegSysPackage.PAYMENT___MAKE_PAYMENT:
				MakePayment();
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
		result.append(" (PaymentMethod: ");
		result.append(paymentMethod);
		result.append(", Date: ");
		result.append(date);
		result.append(", AmountPaid: ");
		result.append(amountPaid);
		result.append(')');
		return result.toString();
	}

} //PaymentImpl
