/**
 */
package HairDressersRegistrationSystem.hairDressersRegSys.impl;

import HairDressersRegistrationSystem.hairDressersRegSys.Discounts;
import HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage;
import HairDressersRegistrationSystem.hairDressersRegSys.Invoice;
import HairDressersRegistrationSystem.hairDressersRegSys.Payment;
import HairDressersRegistrationSystem.hairDressersRegSys.Products;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.impl.InvoiceImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.impl.InvoiceImpl#getDate <em>Date</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.impl.InvoiceImpl#getInvoiceNumber <em>Invoice Number</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.impl.InvoiceImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.impl.InvoiceImpl#getDiscounts <em>Discounts</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.impl.InvoiceImpl#getPayment <em>Payment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvoiceImpl extends MinimalEObjectImpl.Container implements Invoice {
	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected Products products;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvoiceNumber() <em>Invoice Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int INVOICE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInvoiceNumber() <em>Invoice Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceNumber()
	 * @generated
	 * @ordered
	 */
	protected int invoiceNumber = INVOICE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected static final Float TOTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected Float total = TOTAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiscounts() <em>Discounts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscounts()
	 * @generated
	 * @ordered
	 */
	protected Discounts discounts;

	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected Payment payment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HairDressersRegSysPackage.Literals.INVOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Products getProducts() {
		if (products != null && products.eIsProxy()) {
			InternalEObject oldProducts = (InternalEObject)products;
			products = (Products)eResolveProxy(oldProducts);
			if (products != oldProducts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HairDressersRegSysPackage.INVOICE__PRODUCTS, oldProducts, products));
			}
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Products basicGetProducts() {
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProducts(Products newProducts, NotificationChain msgs) {
		Products oldProducts = products;
		products = newProducts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.INVOICE__PRODUCTS, oldProducts, newProducts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProducts(Products newProducts) {
		if (newProducts != products) {
			NotificationChain msgs = null;
			if (products != null)
				msgs = ((InternalEObject)products).eInverseRemove(this, HairDressersRegSysPackage.PRODUCTS__INVOICE, Products.class, msgs);
			if (newProducts != null)
				msgs = ((InternalEObject)newProducts).eInverseAdd(this, HairDressersRegSysPackage.PRODUCTS__INVOICE, Products.class, msgs);
			msgs = basicSetProducts(newProducts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.INVOICE__PRODUCTS, newProducts, newProducts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.INVOICE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInvoiceNumber() {
		return invoiceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceNumber(int newInvoiceNumber) {
		int oldInvoiceNumber = invoiceNumber;
		invoiceNumber = newInvoiceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.INVOICE__INVOICE_NUMBER, oldInvoiceNumber, invoiceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal(Float newTotal) {
		Float oldTotal = total;
		total = newTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.INVOICE__TOTAL, oldTotal, total));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discounts getDiscounts() {
		if (discounts != null && discounts.eIsProxy()) {
			InternalEObject oldDiscounts = (InternalEObject)discounts;
			discounts = (Discounts)eResolveProxy(oldDiscounts);
			if (discounts != oldDiscounts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HairDressersRegSysPackage.INVOICE__DISCOUNTS, oldDiscounts, discounts));
			}
		}
		return discounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discounts basicGetDiscounts() {
		return discounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscounts(Discounts newDiscounts, NotificationChain msgs) {
		Discounts oldDiscounts = discounts;
		discounts = newDiscounts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.INVOICE__DISCOUNTS, oldDiscounts, newDiscounts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscounts(Discounts newDiscounts) {
		if (newDiscounts != discounts) {
			NotificationChain msgs = null;
			if (discounts != null)
				msgs = ((InternalEObject)discounts).eInverseRemove(this, HairDressersRegSysPackage.DISCOUNTS__INVOICE, Discounts.class, msgs);
			if (newDiscounts != null)
				msgs = ((InternalEObject)newDiscounts).eInverseAdd(this, HairDressersRegSysPackage.DISCOUNTS__INVOICE, Discounts.class, msgs);
			msgs = basicSetDiscounts(newDiscounts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.INVOICE__DISCOUNTS, newDiscounts, newDiscounts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Payment getPayment() {
		if (payment != null && payment.eIsProxy()) {
			InternalEObject oldPayment = (InternalEObject)payment;
			payment = (Payment)eResolveProxy(oldPayment);
			if (payment != oldPayment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HairDressersRegSysPackage.INVOICE__PAYMENT, oldPayment, payment));
			}
		}
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Payment basicGetPayment() {
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayment(Payment newPayment, NotificationChain msgs) {
		Payment oldPayment = payment;
		payment = newPayment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.INVOICE__PAYMENT, oldPayment, newPayment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayment(Payment newPayment) {
		if (newPayment != payment) {
			NotificationChain msgs = null;
			if (payment != null)
				msgs = ((InternalEObject)payment).eInverseRemove(this, HairDressersRegSysPackage.PAYMENT__INVOICE, Payment.class, msgs);
			if (newPayment != null)
				msgs = ((InternalEObject)newPayment).eInverseAdd(this, HairDressersRegSysPackage.PAYMENT__INVOICE, Payment.class, msgs);
			msgs = basicSetPayment(newPayment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.INVOICE__PAYMENT, newPayment, newPayment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void CalculateTotal() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void GetDiscount() {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HairDressersRegSysPackage.INVOICE__PRODUCTS:
				if (products != null)
					msgs = ((InternalEObject)products).eInverseRemove(this, HairDressersRegSysPackage.PRODUCTS__INVOICE, Products.class, msgs);
				return basicSetProducts((Products)otherEnd, msgs);
			case HairDressersRegSysPackage.INVOICE__DISCOUNTS:
				if (discounts != null)
					msgs = ((InternalEObject)discounts).eInverseRemove(this, HairDressersRegSysPackage.DISCOUNTS__INVOICE, Discounts.class, msgs);
				return basicSetDiscounts((Discounts)otherEnd, msgs);
			case HairDressersRegSysPackage.INVOICE__PAYMENT:
				if (payment != null)
					msgs = ((InternalEObject)payment).eInverseRemove(this, HairDressersRegSysPackage.PAYMENT__INVOICE, Payment.class, msgs);
				return basicSetPayment((Payment)otherEnd, msgs);
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
			case HairDressersRegSysPackage.INVOICE__PRODUCTS:
				return basicSetProducts(null, msgs);
			case HairDressersRegSysPackage.INVOICE__DISCOUNTS:
				return basicSetDiscounts(null, msgs);
			case HairDressersRegSysPackage.INVOICE__PAYMENT:
				return basicSetPayment(null, msgs);
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
			case HairDressersRegSysPackage.INVOICE__PRODUCTS:
				if (resolve) return getProducts();
				return basicGetProducts();
			case HairDressersRegSysPackage.INVOICE__DATE:
				return getDate();
			case HairDressersRegSysPackage.INVOICE__INVOICE_NUMBER:
				return getInvoiceNumber();
			case HairDressersRegSysPackage.INVOICE__TOTAL:
				return getTotal();
			case HairDressersRegSysPackage.INVOICE__DISCOUNTS:
				if (resolve) return getDiscounts();
				return basicGetDiscounts();
			case HairDressersRegSysPackage.INVOICE__PAYMENT:
				if (resolve) return getPayment();
				return basicGetPayment();
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
			case HairDressersRegSysPackage.INVOICE__PRODUCTS:
				setProducts((Products)newValue);
				return;
			case HairDressersRegSysPackage.INVOICE__DATE:
				setDate((String)newValue);
				return;
			case HairDressersRegSysPackage.INVOICE__INVOICE_NUMBER:
				setInvoiceNumber((Integer)newValue);
				return;
			case HairDressersRegSysPackage.INVOICE__TOTAL:
				setTotal((Float)newValue);
				return;
			case HairDressersRegSysPackage.INVOICE__DISCOUNTS:
				setDiscounts((Discounts)newValue);
				return;
			case HairDressersRegSysPackage.INVOICE__PAYMENT:
				setPayment((Payment)newValue);
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
			case HairDressersRegSysPackage.INVOICE__PRODUCTS:
				setProducts((Products)null);
				return;
			case HairDressersRegSysPackage.INVOICE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case HairDressersRegSysPackage.INVOICE__INVOICE_NUMBER:
				setInvoiceNumber(INVOICE_NUMBER_EDEFAULT);
				return;
			case HairDressersRegSysPackage.INVOICE__TOTAL:
				setTotal(TOTAL_EDEFAULT);
				return;
			case HairDressersRegSysPackage.INVOICE__DISCOUNTS:
				setDiscounts((Discounts)null);
				return;
			case HairDressersRegSysPackage.INVOICE__PAYMENT:
				setPayment((Payment)null);
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
			case HairDressersRegSysPackage.INVOICE__PRODUCTS:
				return products != null;
			case HairDressersRegSysPackage.INVOICE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case HairDressersRegSysPackage.INVOICE__INVOICE_NUMBER:
				return invoiceNumber != INVOICE_NUMBER_EDEFAULT;
			case HairDressersRegSysPackage.INVOICE__TOTAL:
				return TOTAL_EDEFAULT == null ? total != null : !TOTAL_EDEFAULT.equals(total);
			case HairDressersRegSysPackage.INVOICE__DISCOUNTS:
				return discounts != null;
			case HairDressersRegSysPackage.INVOICE__PAYMENT:
				return payment != null;
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
			case HairDressersRegSysPackage.INVOICE___CALCULATE_TOTAL:
				CalculateTotal();
				return null;
			case HairDressersRegSysPackage.INVOICE___GET_DISCOUNT:
				GetDiscount();
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
		result.append(" (Date: ");
		result.append(date);
		result.append(", InvoiceNumber: ");
		result.append(invoiceNumber);
		result.append(", Total: ");
		result.append(total);
		result.append(')');
		return result.toString();
	}

} //InvoiceImpl
