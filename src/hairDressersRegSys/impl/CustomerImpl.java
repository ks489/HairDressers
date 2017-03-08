/**
 */
package hairDressersRegSys.impl;

import hairDressersRegSys.Appointment;
import hairDressersRegSys.Customer;
import hairDressersRegSys.Discounts;
import hairDressersRegSys.HairDressersRegSysPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hairDressersRegSys.impl.CustomerImpl#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link hairDressersRegSys.impl.CustomerImpl#getDiscounts <em>Discounts</em>}</li>
 *   <li>{@link hairDressersRegSys.impl.CustomerImpl#getCustomerId <em>Customer Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends PersonImpl implements Customer {
	/**
	 * The cached value of the '{@link #getAppointment() <em>Appointment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointment()
	 * @generated
	 * @ordered
	 */
	protected EList<Appointment> appointment;

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
	 * The default value of the '{@link #getCustomerId() <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerId()
	 * @generated
	 * @ordered
	 */
	protected static final int CUSTOMER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCustomerId() <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerId()
	 * @generated
	 * @ordered
	 */
	protected int customerId = CUSTOMER_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HairDressersRegSysPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Appointment> getAppointment() {
		if (appointment == null) {
			appointment = new EObjectContainmentEList<Appointment>(Appointment.class, this, HairDressersRegSysPackage.CUSTOMER__APPOINTMENT);
		}
		return appointment;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HairDressersRegSysPackage.CUSTOMER__DISCOUNTS, oldDiscounts, discounts));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.CUSTOMER__DISCOUNTS, oldDiscounts, newDiscounts);
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
				msgs = ((InternalEObject)discounts).eInverseRemove(this, HairDressersRegSysPackage.DISCOUNTS__CUSTOMER, Discounts.class, msgs);
			if (newDiscounts != null)
				msgs = ((InternalEObject)newDiscounts).eInverseAdd(this, HairDressersRegSysPackage.DISCOUNTS__CUSTOMER, Discounts.class, msgs);
			msgs = basicSetDiscounts(newDiscounts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.CUSTOMER__DISCOUNTS, newDiscounts, newDiscounts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerId(int newCustomerId) {
		int oldCustomerId = customerId;
		customerId = newCustomerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HairDressersRegSysPackage.CUSTOMER__CUSTOMER_ID, oldCustomerId, customerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void PlaceAppointment() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void AddNewCustomer() {
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
			case HairDressersRegSysPackage.CUSTOMER__DISCOUNTS:
				if (discounts != null)
					msgs = ((InternalEObject)discounts).eInverseRemove(this, HairDressersRegSysPackage.DISCOUNTS__CUSTOMER, Discounts.class, msgs);
				return basicSetDiscounts((Discounts)otherEnd, msgs);
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
			case HairDressersRegSysPackage.CUSTOMER__APPOINTMENT:
				return ((InternalEList<?>)getAppointment()).basicRemove(otherEnd, msgs);
			case HairDressersRegSysPackage.CUSTOMER__DISCOUNTS:
				return basicSetDiscounts(null, msgs);
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
			case HairDressersRegSysPackage.CUSTOMER__APPOINTMENT:
				return getAppointment();
			case HairDressersRegSysPackage.CUSTOMER__DISCOUNTS:
				if (resolve) return getDiscounts();
				return basicGetDiscounts();
			case HairDressersRegSysPackage.CUSTOMER__CUSTOMER_ID:
				return getCustomerId();
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
			case HairDressersRegSysPackage.CUSTOMER__APPOINTMENT:
				getAppointment().clear();
				getAppointment().addAll((Collection<? extends Appointment>)newValue);
				return;
			case HairDressersRegSysPackage.CUSTOMER__DISCOUNTS:
				setDiscounts((Discounts)newValue);
				return;
			case HairDressersRegSysPackage.CUSTOMER__CUSTOMER_ID:
				setCustomerId((Integer)newValue);
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
			case HairDressersRegSysPackage.CUSTOMER__APPOINTMENT:
				getAppointment().clear();
				return;
			case HairDressersRegSysPackage.CUSTOMER__DISCOUNTS:
				setDiscounts((Discounts)null);
				return;
			case HairDressersRegSysPackage.CUSTOMER__CUSTOMER_ID:
				setCustomerId(CUSTOMER_ID_EDEFAULT);
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
			case HairDressersRegSysPackage.CUSTOMER__APPOINTMENT:
				return appointment != null && !appointment.isEmpty();
			case HairDressersRegSysPackage.CUSTOMER__DISCOUNTS:
				return discounts != null;
			case HairDressersRegSysPackage.CUSTOMER__CUSTOMER_ID:
				return customerId != CUSTOMER_ID_EDEFAULT;
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
			case HairDressersRegSysPackage.CUSTOMER___PLACE_APPOINTMENT:
				PlaceAppointment();
				return null;
			case HairDressersRegSysPackage.CUSTOMER___ADD_NEW_CUSTOMER:
				AddNewCustomer();
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
		result.append(" (CustomerId: ");
		result.append(customerId);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
