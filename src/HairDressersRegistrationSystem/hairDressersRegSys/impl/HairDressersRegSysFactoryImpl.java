/**
 */
package HairDressersRegistrationSystem.hairDressersRegSys.impl;

import HairDressersRegistrationSystem.hairDressersRegSys.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HairDressersRegSysFactoryImpl extends EFactoryImpl implements HairDressersRegSysFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HairDressersRegSysFactory init() {
		try {
			HairDressersRegSysFactory theHairDressersRegSysFactory = (HairDressersRegSysFactory)EPackage.Registry.INSTANCE.getEFactory(HairDressersRegSysPackage.eNS_URI);
			if (theHairDressersRegSysFactory != null) {
				return theHairDressersRegSysFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HairDressersRegSysFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HairDressersRegSysFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HairDressersRegSysPackage.SERVICE: return createService();
			case HairDressersRegSysPackage.APPOINTMENT: return createAppointment();
			case HairDressersRegSysPackage.PRODUCTS: return createProducts();
			case HairDressersRegSysPackage.INVOICE: return createInvoice();
			case HairDressersRegSysPackage.DISCOUNTS: return createDiscounts();
			case HairDressersRegSysPackage.STYLING: return createStyling();
			case HairDressersRegSysPackage.HAIRCUTS: return createHaircuts();
			case HairDressersRegSysPackage.OTHER: return createOther();
			case HairDressersRegSysPackage.CUSTOMER: return createCustomer();
			case HairDressersRegSysPackage.SERVICE_EMPLOYEE: return createServiceEmployee();
			case HairDressersRegSysPackage.PERSON: return createPerson();
			case HairDressersRegSysPackage.PAYMENT: return createPayment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appointment createAppointment() {
		AppointmentImpl appointment = new AppointmentImpl();
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Products createProducts() {
		ProductsImpl products = new ProductsImpl();
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoice createInvoice() {
		InvoiceImpl invoice = new InvoiceImpl();
		return invoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discounts createDiscounts() {
		DiscountsImpl discounts = new DiscountsImpl();
		return discounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Styling createStyling() {
		StylingImpl styling = new StylingImpl();
		return styling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Haircuts createHaircuts() {
		HaircutsImpl haircuts = new HaircutsImpl();
		return haircuts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Other createOther() {
		OtherImpl other = new OtherImpl();
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEmployee createServiceEmployee() {
		ServiceEmployeeImpl serviceEmployee = new ServiceEmployeeImpl();
		return serviceEmployee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Payment createPayment() {
		PaymentImpl payment = new PaymentImpl();
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HairDressersRegSysPackage getHairDressersRegSysPackage() {
		return (HairDressersRegSysPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HairDressersRegSysPackage getPackage() {
		return HairDressersRegSysPackage.eINSTANCE;
	}

} //HairDressersRegSysFactoryImpl
