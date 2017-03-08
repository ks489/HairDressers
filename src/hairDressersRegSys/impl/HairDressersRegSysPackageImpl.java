/**
 */
package hairDressersRegSys.impl;

import hairDressersRegSys.Appointment;
import hairDressersRegSys.Customer;
import hairDressersRegSys.Discounts;
import hairDressersRegSys.HairDressersRegSysFactory;
import hairDressersRegSys.HairDressersRegSysPackage;
import hairDressersRegSys.Haircuts;
import hairDressersRegSys.Invoice;
import hairDressersRegSys.Other;
import hairDressersRegSys.Payment;
import hairDressersRegSys.Person;
import hairDressersRegSys.Products;
import hairDressersRegSys.Service;
import hairDressersRegSys.ServiceEmployee;
import hairDressersRegSys.Styling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HairDressersRegSysPackageImpl extends EPackageImpl implements HairDressersRegSysPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appointmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discountsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stylingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass haircutsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEmployeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hairDressersRegSys.HairDressersRegSysPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HairDressersRegSysPackageImpl() {
		super(eNS_URI, HairDressersRegSysFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link HairDressersRegSysPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HairDressersRegSysPackage init() {
		if (isInited) return (HairDressersRegSysPackage)EPackage.Registry.INSTANCE.getEPackage(HairDressersRegSysPackage.eNS_URI);

		// Obtain or create and register package
		HairDressersRegSysPackageImpl theHairDressersRegSysPackage = (HairDressersRegSysPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HairDressersRegSysPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HairDressersRegSysPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theHairDressersRegSysPackage.createPackageContents();

		// Initialize created meta-data
		theHairDressersRegSysPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHairDressersRegSysPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HairDressersRegSysPackage.eNS_URI, theHairDressersRegSysPackage);
		return theHairDressersRegSysPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Name() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Description() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_CostPerHour() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Time() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Appointment() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getService__AddService() {
		return serviceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getService__RemoveService() {
		return serviceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getService__ViewAllServices() {
		return serviceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppointment() {
		return appointmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Invoice() {
		return (EReference)appointmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppointment_Date() {
		return (EAttribute)appointmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppointment_StartTime() {
		return (EAttribute)appointmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppointment_EndTime() {
		return (EAttribute)appointmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAppointment__ViewSchedule() {
		return appointmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAppointment__AddAppointment() {
		return appointmentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProducts() {
		return productsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProducts_Invoice() {
		return (EReference)productsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProducts_Name() {
		return (EAttribute)productsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProducts_Description() {
		return (EAttribute)productsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProducts_Price() {
		return (EAttribute)productsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProducts__AddProduct() {
		return productsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProducts__ViewTotalStock() {
		return productsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvoice() {
		return invoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoice_Products() {
		return (EReference)invoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoice_Date() {
		return (EAttribute)invoiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoice_InvoiceNumber() {
		return (EAttribute)invoiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoice_Total() {
		return (EAttribute)invoiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoice_Discounts() {
		return (EReference)invoiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoice_Payment() {
		return (EReference)invoiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInvoice__CalculateTotal() {
		return invoiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInvoice__GetDiscount() {
		return invoiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscounts() {
		return discountsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscounts_Name() {
		return (EAttribute)discountsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscounts_Description() {
		return (EAttribute)discountsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscounts_Percentage() {
		return (EAttribute)discountsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscounts_Customer() {
		return (EReference)discountsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscounts_Invoice() {
		return (EReference)discountsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyling() {
		return stylingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyling_IsWash() {
		return (EAttribute)stylingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHaircuts() {
		return haircutsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHaircuts_IsWash() {
		return (EAttribute)haircutsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHaircuts_IsShave() {
		return (EAttribute)haircutsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHaircuts_IsCut() {
		return (EAttribute)haircutsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOther() {
		return otherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOther_AdditionalInformation() {
		return (EAttribute)otherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_Appointment() {
		return (EReference)customerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_Discounts() {
		return (EReference)customerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_CustomerId() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__PlaceAppointment() {
		return customerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__AddNewCustomer() {
		return customerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceEmployee() {
		return serviceEmployeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceEmployee_Appointment() {
		return (EReference)serviceEmployeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceEmployee_Role() {
		return (EAttribute)serviceEmployeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceEmployee_EmployeeId() {
		return (EAttribute)serviceEmployeeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceEmployee__MakeAppointment() {
		return serviceEmployeeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceEmployee__AddNewEmployee() {
		return serviceEmployeeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceEmployee__ViewAllAvailableEmployees() {
		return serviceEmployeeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceEmployee__ViewAppointments() {
		return serviceEmployeeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceEmployee__RemoveAppointment() {
		return serviceEmployeeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_FirstName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_LastName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Address() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_DateOfBirth() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerson__GetAge() {
		return personEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayment() {
		return paymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPayment_PaymentMethod() {
		return (EAttribute)paymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPayment_Date() {
		return (EAttribute)paymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPayment_AmountPaid() {
		return (EAttribute)paymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPayment_Invoice() {
		return (EReference)paymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPayment__MakePayment() {
		return paymentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HairDressersRegSysFactory getHairDressersRegSysFactory() {
		return (HairDressersRegSysFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__NAME);
		createEAttribute(serviceEClass, SERVICE__DESCRIPTION);
		createEAttribute(serviceEClass, SERVICE__COST_PER_HOUR);
		createEAttribute(serviceEClass, SERVICE__TIME);
		createEReference(serviceEClass, SERVICE__APPOINTMENT);
		createEOperation(serviceEClass, SERVICE___ADD_SERVICE);
		createEOperation(serviceEClass, SERVICE___REMOVE_SERVICE);
		createEOperation(serviceEClass, SERVICE___VIEW_ALL_SERVICES);

		appointmentEClass = createEClass(APPOINTMENT);
		createEReference(appointmentEClass, APPOINTMENT__INVOICE);
		createEAttribute(appointmentEClass, APPOINTMENT__DATE);
		createEAttribute(appointmentEClass, APPOINTMENT__START_TIME);
		createEAttribute(appointmentEClass, APPOINTMENT__END_TIME);
		createEOperation(appointmentEClass, APPOINTMENT___VIEW_SCHEDULE);
		createEOperation(appointmentEClass, APPOINTMENT___ADD_APPOINTMENT);

		productsEClass = createEClass(PRODUCTS);
		createEReference(productsEClass, PRODUCTS__INVOICE);
		createEAttribute(productsEClass, PRODUCTS__NAME);
		createEAttribute(productsEClass, PRODUCTS__DESCRIPTION);
		createEAttribute(productsEClass, PRODUCTS__PRICE);
		createEOperation(productsEClass, PRODUCTS___ADD_PRODUCT);
		createEOperation(productsEClass, PRODUCTS___VIEW_TOTAL_STOCK);

		invoiceEClass = createEClass(INVOICE);
		createEReference(invoiceEClass, INVOICE__PRODUCTS);
		createEAttribute(invoiceEClass, INVOICE__DATE);
		createEAttribute(invoiceEClass, INVOICE__INVOICE_NUMBER);
		createEAttribute(invoiceEClass, INVOICE__TOTAL);
		createEReference(invoiceEClass, INVOICE__DISCOUNTS);
		createEReference(invoiceEClass, INVOICE__PAYMENT);
		createEOperation(invoiceEClass, INVOICE___CALCULATE_TOTAL);
		createEOperation(invoiceEClass, INVOICE___GET_DISCOUNT);

		discountsEClass = createEClass(DISCOUNTS);
		createEAttribute(discountsEClass, DISCOUNTS__NAME);
		createEAttribute(discountsEClass, DISCOUNTS__DESCRIPTION);
		createEAttribute(discountsEClass, DISCOUNTS__PERCENTAGE);
		createEReference(discountsEClass, DISCOUNTS__CUSTOMER);
		createEReference(discountsEClass, DISCOUNTS__INVOICE);

		stylingEClass = createEClass(STYLING);
		createEAttribute(stylingEClass, STYLING__IS_WASH);

		haircutsEClass = createEClass(HAIRCUTS);
		createEAttribute(haircutsEClass, HAIRCUTS__IS_WASH);
		createEAttribute(haircutsEClass, HAIRCUTS__IS_SHAVE);
		createEAttribute(haircutsEClass, HAIRCUTS__IS_CUT);

		otherEClass = createEClass(OTHER);
		createEAttribute(otherEClass, OTHER__ADDITIONAL_INFORMATION);

		customerEClass = createEClass(CUSTOMER);
		createEReference(customerEClass, CUSTOMER__APPOINTMENT);
		createEReference(customerEClass, CUSTOMER__DISCOUNTS);
		createEAttribute(customerEClass, CUSTOMER__CUSTOMER_ID);
		createEOperation(customerEClass, CUSTOMER___PLACE_APPOINTMENT);
		createEOperation(customerEClass, CUSTOMER___ADD_NEW_CUSTOMER);

		serviceEmployeeEClass = createEClass(SERVICE_EMPLOYEE);
		createEReference(serviceEmployeeEClass, SERVICE_EMPLOYEE__APPOINTMENT);
		createEAttribute(serviceEmployeeEClass, SERVICE_EMPLOYEE__ROLE);
		createEAttribute(serviceEmployeeEClass, SERVICE_EMPLOYEE__EMPLOYEE_ID);
		createEOperation(serviceEmployeeEClass, SERVICE_EMPLOYEE___MAKE_APPOINTMENT);
		createEOperation(serviceEmployeeEClass, SERVICE_EMPLOYEE___ADD_NEW_EMPLOYEE);
		createEOperation(serviceEmployeeEClass, SERVICE_EMPLOYEE___VIEW_ALL_AVAILABLE_EMPLOYEES);
		createEOperation(serviceEmployeeEClass, SERVICE_EMPLOYEE___VIEW_APPOINTMENTS);
		createEOperation(serviceEmployeeEClass, SERVICE_EMPLOYEE___REMOVE_APPOINTMENT);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__FIRST_NAME);
		createEAttribute(personEClass, PERSON__LAST_NAME);
		createEAttribute(personEClass, PERSON__ADDRESS);
		createEAttribute(personEClass, PERSON__DATE_OF_BIRTH);
		createEOperation(personEClass, PERSON___GET_AGE);

		paymentEClass = createEClass(PAYMENT);
		createEAttribute(paymentEClass, PAYMENT__PAYMENT_METHOD);
		createEAttribute(paymentEClass, PAYMENT__DATE);
		createEAttribute(paymentEClass, PAYMENT__AMOUNT_PAID);
		createEReference(paymentEClass, PAYMENT__INVOICE);
		createEOperation(paymentEClass, PAYMENT___MAKE_PAYMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stylingEClass.getESuperTypes().add(this.getService());
		haircutsEClass.getESuperTypes().add(this.getService());
		otherEClass.getESuperTypes().add(this.getService());
		customerEClass.getESuperTypes().add(this.getPerson());
		serviceEmployeeEClass.getESuperTypes().add(this.getPerson());

		// Initialize classes, features, and operations; add parameters
		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_CostPerHour(), ecorePackage.getEFloatObject(), "CostPerHour", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Time(), ecorePackage.getEDate(), "Time", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Appointment(), this.getAppointment(), null, "appointment", null, 1, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getService__AddService(), null, "AddService", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getService__RemoveService(), null, "RemoveService", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getService__ViewAllServices(), null, "ViewAllServices", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(appointmentEClass, Appointment.class, "Appointment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAppointment_Invoice(), this.getInvoice(), null, "invoice", null, 1, 1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppointment_Date(), ecorePackage.getEDate(), "Date", null, 0, 1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppointment_StartTime(), ecorePackage.getEDate(), "StartTime", null, 0, 1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppointment_EndTime(), ecorePackage.getEDate(), "EndTime", null, 0, 1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAppointment__ViewSchedule(), null, "ViewSchedule", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAppointment__AddAppointment(), null, "AddAppointment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(productsEClass, Products.class, "Products", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProducts_Invoice(), this.getInvoice(), this.getInvoice_Products(), "invoice", null, 0, 1, Products.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProducts_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Products.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProducts_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Products.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProducts_Price(), ecorePackage.getEFloatObject(), "Price", null, 0, 1, Products.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProducts__AddProduct(), null, "AddProduct", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProducts__ViewTotalStock(), null, "ViewTotalStock", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(invoiceEClass, Invoice.class, "Invoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvoice_Products(), this.getProducts(), this.getProducts_Invoice(), "products", null, 0, 1, Invoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoice_Date(), ecorePackage.getEString(), "Date", null, 0, 1, Invoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoice_InvoiceNumber(), ecorePackage.getEInt(), "InvoiceNumber", null, 0, 1, Invoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoice_Total(), ecorePackage.getEFloatObject(), "Total", null, 0, 1, Invoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvoice_Discounts(), this.getDiscounts(), this.getDiscounts_Invoice(), "discounts", null, 0, 1, Invoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvoice_Payment(), this.getPayment(), this.getPayment_Invoice(), "payment", null, 0, 1, Invoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getInvoice__CalculateTotal(), null, "CalculateTotal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInvoice__GetDiscount(), null, "GetDiscount", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(discountsEClass, Discounts.class, "Discounts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscounts_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Discounts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscounts_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Discounts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscounts_Percentage(), ecorePackage.getEInt(), "Percentage", null, 0, 1, Discounts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscounts_Customer(), this.getCustomer(), this.getCustomer_Discounts(), "customer", null, 0, -1, Discounts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscounts_Invoice(), this.getInvoice(), this.getInvoice_Discounts(), "invoice", null, 0, -1, Discounts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stylingEClass, Styling.class, "Styling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStyling_IsWash(), ecorePackage.getEBoolean(), "IsWash", null, 0, 1, Styling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(haircutsEClass, Haircuts.class, "Haircuts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHaircuts_IsWash(), ecorePackage.getEBoolean(), "IsWash", null, 0, 1, Haircuts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHaircuts_IsShave(), ecorePackage.getEBoolean(), "IsShave", null, 0, 1, Haircuts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHaircuts_IsCut(), ecorePackage.getEBoolean(), "IsCut", null, 0, 1, Haircuts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(otherEClass, Other.class, "Other", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOther_AdditionalInformation(), ecorePackage.getEString(), "AdditionalInformation", null, 0, 1, Other.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomer_Appointment(), this.getAppointment(), null, "appointment", null, 1, -1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomer_Discounts(), this.getDiscounts(), this.getDiscounts_Customer(), "discounts", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_CustomerId(), ecorePackage.getEInt(), "CustomerId", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCustomer__PlaceAppointment(), null, "PlaceAppointment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCustomer__AddNewCustomer(), null, "AddNewCustomer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serviceEmployeeEClass, ServiceEmployee.class, "ServiceEmployee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceEmployee_Appointment(), this.getAppointment(), null, "appointment", null, 0, -1, ServiceEmployee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceEmployee_Role(), ecorePackage.getEString(), "Role", null, 0, 1, ServiceEmployee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceEmployee_EmployeeId(), ecorePackage.getEInt(), "EmployeeId", null, 0, 1, ServiceEmployee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getServiceEmployee__MakeAppointment(), null, "MakeAppointment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getServiceEmployee__AddNewEmployee(), null, "AddNewEmployee", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getServiceEmployee__ViewAllAvailableEmployees(), null, "ViewAllAvailableEmployees", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getServiceEmployee__ViewAppointments(), null, "ViewAppointments", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getServiceEmployee__RemoveAppointment(), null, "RemoveAppointment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_FirstName(), ecorePackage.getEString(), "FirstName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_LastName(), ecorePackage.getEString(), "LastName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Address(), ecorePackage.getEString(), "Address", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_DateOfBirth(), ecorePackage.getEDate(), "DateOfBirth", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPerson__GetAge(), ecorePackage.getEInt(), "GetAge", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(paymentEClass, Payment.class, "Payment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPayment_PaymentMethod(), ecorePackage.getEString(), "PaymentMethod", null, 0, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayment_Date(), ecorePackage.getEDate(), "Date", null, 0, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayment_AmountPaid(), ecorePackage.getEFloatObject(), "AmountPaid", null, 0, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPayment_Invoice(), this.getInvoice(), this.getInvoice_Payment(), "invoice", null, 1, -1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPayment__MakePayment(), null, "MakePayment", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HairDressersRegSysPackageImpl
