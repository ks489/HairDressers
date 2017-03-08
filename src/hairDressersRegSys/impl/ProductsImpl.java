/**
 */
package hairDressersRegSys.impl;

import hairDressersRegSys.HairDressersRegSysPackage;
import hairDressersRegSys.Invoice;
import hairDressersRegSys.Products;

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
 * An implementation of the model object '<em><b>Products</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hairDressersRegSys.impl.ProductsImpl#getInvoice <em>Invoice</em>}</li>
 *   <li>{@link hairDressersRegSys.impl.ProductsImpl#getName <em>Name</em>}</li>
 *   <li>{@link hairDressersRegSys.impl.ProductsImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link hairDressersRegSys.impl.ProductsImpl#getPrice <em>Price</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductsImpl extends MinimalEObjectImpl.Container implements Products {
	/**
	 * The cached value of the '{@link #getInvoice() <em>Invoice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoice()
	 * @generated
	 * @ordered
	 */
	protected Invoice invoice;

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
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final Float PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected Float price = PRICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HairDressersRegSysPackage.Literals.PRODUCTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoice getInvoice() {
		if (invoice != null && invoice.eIsProxy()) {
			InternalEObject oldInvoice = (InternalEObject)invoice;
			invoice = (Invoice)eResolveProxy(oldInvoice);
			if (invoice != oldInvoice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HairDressersRegSysPackage.PRODUCTS__INVOICE, oldInvoice, invoice));
			}
		}
		return invoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoice basicGetInvoice() {
		return invoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvoice(Invoice newInvoice, NotificationChain msgs) {
		Invoice oldInvoice = invoice;
		invoice = newInvoice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.PRODUCTS__INVOICE, oldInvoice, newInvoice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoice(Invoice newInvoice) {
		if (newInvoice != invoice) {
			NotificationChain msgs = null;
			if (invoice != null)
				msgs = ((InternalEObject)invoice).eInverseRemove(this, HairDressersRegSysPackage.INVOICE__PRODUCTS, Invoice.class, msgs);
			if (newInvoice != null)
				msgs = ((InternalEObject)newInvoice).eInverseAdd(this, HairDressersRegSysPackage.INVOICE__PRODUCTS, Invoice.class, msgs);
			msgs = basicSetInvoice(newInvoice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.PRODUCTS__INVOICE, newInvoice, newInvoice));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.PRODUCTS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.PRODUCTS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(Float newPrice) {
		Float oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.PRODUCTS__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void AddProduct() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ViewTotalStock() {
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
			case HairDressersRegSysPackage.PRODUCTS__INVOICE:
				if (invoice != null)
					msgs = ((InternalEObject)invoice).eInverseRemove(this, HairDressersRegSysPackage.INVOICE__PRODUCTS, Invoice.class, msgs);
				return basicSetInvoice((Invoice)otherEnd, msgs);
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
			case HairDressersRegSysPackage.PRODUCTS__INVOICE:
				return basicSetInvoice(null, msgs);
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
			case HairDressersRegSysPackage.PRODUCTS__INVOICE:
				if (resolve) return getInvoice();
				return basicGetInvoice();
			case HairDressersRegSysPackage.PRODUCTS__NAME:
				return getName();
			case HairDressersRegSysPackage.PRODUCTS__DESCRIPTION:
				return getDescription();
			case HairDressersRegSysPackage.PRODUCTS__PRICE:
				return getPrice();
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
			case HairDressersRegSysPackage.PRODUCTS__INVOICE:
				setInvoice((Invoice)newValue);
				return;
			case HairDressersRegSysPackage.PRODUCTS__NAME:
				setName((String)newValue);
				return;
			case HairDressersRegSysPackage.PRODUCTS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case HairDressersRegSysPackage.PRODUCTS__PRICE:
				setPrice((Float)newValue);
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
			case HairDressersRegSysPackage.PRODUCTS__INVOICE:
				setInvoice((Invoice)null);
				return;
			case HairDressersRegSysPackage.PRODUCTS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HairDressersRegSysPackage.PRODUCTS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case HairDressersRegSysPackage.PRODUCTS__PRICE:
				setPrice(PRICE_EDEFAULT);
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
			case HairDressersRegSysPackage.PRODUCTS__INVOICE:
				return invoice != null;
			case HairDressersRegSysPackage.PRODUCTS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HairDressersRegSysPackage.PRODUCTS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case HairDressersRegSysPackage.PRODUCTS__PRICE:
				return PRICE_EDEFAULT == null ? price != null : !PRICE_EDEFAULT.equals(price);
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
			case HairDressersRegSysPackage.PRODUCTS___ADD_PRODUCT:
				AddProduct();
				return null;
			case HairDressersRegSysPackage.PRODUCTS___VIEW_TOTAL_STOCK:
				ViewTotalStock();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Description: ");
		result.append(description);
		result.append(", Price: ");
		result.append(price);
		result.append(')');
		return result.toString();
	}

} //ProductsImpl
