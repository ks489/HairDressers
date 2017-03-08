/**
 */
package HairDressersRegistrationSystem.hairDressersRegSys.impl;

import HairDressersRegistrationSystem.hairDressersRegSys.Customer;
import HairDressersRegistrationSystem.hairDressersRegSys.Discounts;
import HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage;
import HairDressersRegistrationSystem.hairDressersRegSys.Invoice;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Discounts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.impl.DiscountsImpl#getName <em>Name</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.impl.DiscountsImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.impl.DiscountsImpl#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.impl.DiscountsImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link HairDressersRegistrationSystem.hairDressersRegSys.impl.DiscountsImpl#getInvoice <em>Invoice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscountsImpl extends MinimalEObjectImpl.Container implements Discounts {
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
	 * The default value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final int PERCENTAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected int percentage = PERCENTAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customer;

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
	protected DiscountsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HairDressersRegSysPackage.Literals.DISCOUNTS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.DISCOUNTS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.DISCOUNTS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPercentage() {
		return percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentage(int newPercentage) {
		int oldPercentage = percentage;
		percentage = newPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.DISCOUNTS__PERCENTAGE, oldPercentage, percentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getCustomer() {
		if (customer == null) {
			customer = new EObjectWithInverseResolvingEList<Customer>(Customer.class, this, HairDressersRegSysPackage.DISCOUNTS__CUSTOMER, HairDressersRegSysPackage.CUSTOMER__DISCOUNTS);
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Invoice> getInvoice() {
		if (invoice == null) {
			invoice = new EObjectWithInverseResolvingEList<Invoice>(Invoice.class, this, HairDressersRegSysPackage.DISCOUNTS__INVOICE, HairDressersRegSysPackage.INVOICE__DISCOUNTS);
		}
		return invoice;
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
			case HairDressersRegSysPackage.DISCOUNTS__CUSTOMER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomer()).basicAdd(otherEnd, msgs);
			case HairDressersRegSysPackage.DISCOUNTS__INVOICE:
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
			case HairDressersRegSysPackage.DISCOUNTS__CUSTOMER:
				return ((InternalEList<?>)getCustomer()).basicRemove(otherEnd, msgs);
			case HairDressersRegSysPackage.DISCOUNTS__INVOICE:
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
			case HairDressersRegSysPackage.DISCOUNTS__NAME:
				return getName();
			case HairDressersRegSysPackage.DISCOUNTS__DESCRIPTION:
				return getDescription();
			case HairDressersRegSysPackage.DISCOUNTS__PERCENTAGE:
				return getPercentage();
			case HairDressersRegSysPackage.DISCOUNTS__CUSTOMER:
				return getCustomer();
			case HairDressersRegSysPackage.DISCOUNTS__INVOICE:
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
			case HairDressersRegSysPackage.DISCOUNTS__NAME:
				setName((String)newValue);
				return;
			case HairDressersRegSysPackage.DISCOUNTS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case HairDressersRegSysPackage.DISCOUNTS__PERCENTAGE:
				setPercentage((Integer)newValue);
				return;
			case HairDressersRegSysPackage.DISCOUNTS__CUSTOMER:
				getCustomer().clear();
				getCustomer().addAll((Collection<? extends Customer>)newValue);
				return;
			case HairDressersRegSysPackage.DISCOUNTS__INVOICE:
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
			case HairDressersRegSysPackage.DISCOUNTS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HairDressersRegSysPackage.DISCOUNTS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case HairDressersRegSysPackage.DISCOUNTS__PERCENTAGE:
				setPercentage(PERCENTAGE_EDEFAULT);
				return;
			case HairDressersRegSysPackage.DISCOUNTS__CUSTOMER:
				getCustomer().clear();
				return;
			case HairDressersRegSysPackage.DISCOUNTS__INVOICE:
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
			case HairDressersRegSysPackage.DISCOUNTS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HairDressersRegSysPackage.DISCOUNTS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case HairDressersRegSysPackage.DISCOUNTS__PERCENTAGE:
				return percentage != PERCENTAGE_EDEFAULT;
			case HairDressersRegSysPackage.DISCOUNTS__CUSTOMER:
				return customer != null && !customer.isEmpty();
			case HairDressersRegSysPackage.DISCOUNTS__INVOICE:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", Description: ");
		result.append(description);
		result.append(", Percentage: ");
		result.append(percentage);
		result.append(')');
		return result.toString();
	}

} //DiscountsImpl
