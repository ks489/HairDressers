/**
 */
package hairDressersRegSys;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hairDressersRegSys.HairDressersRegSysFactory
 * @model kind="package"
 * @generated
 */
public interface HairDressersRegSysPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hairDressersRegSys";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/hairDressersRegSys";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hairDressersRegSys";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HairDressersRegSysPackage eINSTANCE = hairDressersRegSys.impl.HairDressersRegSysPackageImpl.init();

	/**
	 * The meta object id for the '{@link hairDressersRegSys.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hairDressersRegSys.impl.ServiceImpl
	 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Cost Per Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__COST_PER_HOUR = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TIME = 3;

	/**
	 * The feature id for the '<em><b>Appointment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__APPOINTMENT = 4;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Add Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___ADD_SERVICE = 0;

	/**
	 * The operation id for the '<em>Remove Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___REMOVE_SERVICE = 1;

	/**
	 * The operation id for the '<em>View All Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___VIEW_ALL_SERVICES = 2;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link hairDressersRegSys.impl.AppointmentImpl <em>Appointment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hairDressersRegSys.impl.AppointmentImpl
	 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getAppointment()
	 * @generated
	 */
	int APPOINTMENT = 1;

	/**
	 * The feature id for the '<em><b>Invoice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__INVOICE = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__DATE = 1;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__START_TIME = 2;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__END_TIME = 3;

	/**
	 * The number of structural features of the '<em>Appointment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>View Schedule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT___VIEW_SCHEDULE = 0;

	/**
	 * The operation id for the '<em>Add Appointment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT___ADD_APPOINTMENT = 1;

	/**
	 * The number of operations of the '<em>Appointment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link hairDressersRegSys.impl.ProductsImpl <em>Products</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hairDressersRegSys.impl.ProductsImpl
	 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getProducts()
	 * @generated
	 */
	int PRODUCTS = 2;

	/**
	 * The feature id for the '<em><b>Invoice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTS__INVOICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTS__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTS__PRICE = 3;

	/**
	 * The number of structural features of the '<em>Products</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTS_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Add Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTS___ADD_PRODUCT = 0;

	/**
	 * The operation id for the '<em>View Total Stock</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTS___VIEW_TOTAL_STOCK = 1;

	/**
	 * The number of operations of the '<em>Products</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTS_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link hairDressersRegSys.impl.InvoiceImpl <em>Invoice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hairDressersRegSys.impl.InvoiceImpl
	 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getInvoice()
	 * @generated
	 */
	int INVOICE = 3;

	/**
	 * The feature id for the '<em><b>Products</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__PRODUCTS = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__DATE = 1;

	/**
	 * The feature id for the '<em><b>Invoice Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__INVOICE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__TOTAL = 3;

	/**
	 * The feature id for the '<em><b>Discounts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__DISCOUNTS = 4;

	/**
	 * The feature id for the '<em><b>Payment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__PAYMENT = 5;

	/**
	 * The number of structural features of the '<em>Invoice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Calculate Total</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE___CALCULATE_TOTAL = 0;

	/**
	 * The operation id for the '<em>Get Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE___GET_DISCOUNT = 1;

	/**
	 * The number of operations of the '<em>Invoice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link hairDressersRegSys.impl.DiscountsImpl <em>Discounts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hairDressersRegSys.impl.DiscountsImpl
	 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getDiscounts()
	 * @generated
	 */
	int DISCOUNTS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNTS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNTS__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNTS__PERCENTAGE = 2;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNTS__CUSTOMER = 3;

	/**
	 * The feature id for the '<em><b>Invoice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNTS__INVOICE = 4;

	/**
	 * The number of structural features of the '<em>Discounts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNTS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Discounts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hairDressersRegSys.impl.StylingImpl <em>Styling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hairDressersRegSys.impl.StylingImpl
	 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getStyling()
	 * @generated
	 */
	int STYLING = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLING__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLING__DESCRIPTION = SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cost Per Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLING__COST_PER_HOUR = SERVICE__COST_PER_HOUR;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLING__TIME = SERVICE__TIME;

	/**
	 * The feature id for the '<em><b>Appointment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLING__APPOINTMENT = SERVICE__APPOINTMENT;

	/**
	 * The feature id for the '<em><b>Is Wash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLING__IS_WASH = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Styling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLING_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLING___ADD_SERVICE = SERVICE___ADD_SERVICE;

	/**
	 * The operation id for the '<em>Remove Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLING___REMOVE_SERVICE = SERVICE___REMOVE_SERVICE;

	/**
	 * The operation id for the '<em>View All Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLING___VIEW_ALL_SERVICES = SERVICE___VIEW_ALL_SERVICES;

	/**
	 * The number of operations of the '<em>Styling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLING_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hairDressersRegSys.impl.HaircutsImpl <em>Haircuts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hairDressersRegSys.impl.HaircutsImpl
	 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getHaircuts()
	 * @generated
	 */
	int HAIRCUTS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAIRCUTS__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAIRCUTS__DESCRIPTION = SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cost Per Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAIRCUTS__COST_PER_HOUR = SERVICE__COST_PER_HOUR;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAIRCUTS__TIME = SERVICE__TIME;

	/**
	 * The feature id for the '<em><b>Appointment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAIRCUTS__APPOINTMENT = SERVICE__APPOINTMENT;

	/**
	 * The feature id for the '<em><b>Is Wash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAIRCUTS__IS_WASH = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Shave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAIRCUTS__IS_SHAVE = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Cut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAIRCUTS__IS_CUT = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Haircuts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAIRCUTS_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAIRCUTS___ADD_SERVICE = SERVICE___ADD_SERVICE;

	/**
	 * The operation id for the '<em>Remove Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAIRCUTS___REMOVE_SERVICE = SERVICE___REMOVE_SERVICE;

	/**
	 * The operation id for the '<em>View All Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAIRCUTS___VIEW_ALL_SERVICES = SERVICE___VIEW_ALL_SERVICES;

	/**
	 * The number of operations of the '<em>Haircuts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAIRCUTS_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hairDressersRegSys.impl.OtherImpl <em>Other</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hairDressersRegSys.impl.OtherImpl
	 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getOther()
	 * @generated
	 */
	int OTHER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER__DESCRIPTION = SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cost Per Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER__COST_PER_HOUR = SERVICE__COST_PER_HOUR;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER__TIME = SERVICE__TIME;

	/**
	 * The feature id for the '<em><b>Appointment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER__APPOINTMENT = SERVICE__APPOINTMENT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER__ADDITIONAL_INFORMATION = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Other</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER___ADD_SERVICE = SERVICE___ADD_SERVICE;

	/**
	 * The operation id for the '<em>Remove Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER___REMOVE_SERVICE = SERVICE___REMOVE_SERVICE;

	/**
	 * The operation id for the '<em>View All Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER___VIEW_ALL_SERVICES = SERVICE___VIEW_ALL_SERVICES;

	/**
	 * The number of operations of the '<em>Other</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hairDressersRegSys.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hairDressersRegSys.impl.PersonImpl
	 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 10;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DATE_OF_BIRTH = 3;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_AGE = 0;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link hairDressersRegSys.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hairDressersRegSys.impl.CustomerImpl
	 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 8;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__LAST_NAME = PERSON__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ADDRESS = PERSON__ADDRESS;

	/**
	 * The feature id for the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__DATE_OF_BIRTH = PERSON__DATE_OF_BIRTH;

	/**
	 * The feature id for the '<em><b>Appointment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__APPOINTMENT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Discounts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__DISCOUNTS = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CUSTOMER_ID = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___GET_AGE = PERSON___GET_AGE;

	/**
	 * The operation id for the '<em>Place Appointment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___PLACE_APPOINTMENT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add New Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___ADD_NEW_CUSTOMER = PERSON_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link hairDressersRegSys.impl.ServiceEmployeeImpl <em>Service Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hairDressersRegSys.impl.ServiceEmployeeImpl
	 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getServiceEmployee()
	 * @generated
	 */
	int SERVICE_EMPLOYEE = 9;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EMPLOYEE__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EMPLOYEE__LAST_NAME = PERSON__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EMPLOYEE__ADDRESS = PERSON__ADDRESS;

	/**
	 * The feature id for the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EMPLOYEE__DATE_OF_BIRTH = PERSON__DATE_OF_BIRTH;

	/**
	 * The feature id for the '<em><b>Appointment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EMPLOYEE__APPOINTMENT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EMPLOYEE__ROLE = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Employee Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EMPLOYEE__EMPLOYEE_ID = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EMPLOYEE_FEATURE_COUNT = PERSON_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EMPLOYEE___GET_AGE = PERSON___GET_AGE;

	/**
	 * The operation id for the '<em>Make Appointment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EMPLOYEE___MAKE_APPOINTMENT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add New Employee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EMPLOYEE___ADD_NEW_EMPLOYEE = PERSON_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>View All Available Employees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EMPLOYEE___VIEW_ALL_AVAILABLE_EMPLOYEES = PERSON_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>View Appointments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EMPLOYEE___VIEW_APPOINTMENTS = PERSON_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Remove Appointment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EMPLOYEE___REMOVE_APPOINTMENT = PERSON_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Service Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EMPLOYEE_OPERATION_COUNT = PERSON_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link hairDressersRegSys.impl.PaymentImpl <em>Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hairDressersRegSys.impl.PaymentImpl
	 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getPayment()
	 * @generated
	 */
	int PAYMENT = 11;

	/**
	 * The feature id for the '<em><b>Payment Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__DATE = 1;

	/**
	 * The feature id for the '<em><b>Amount Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__AMOUNT_PAID = 2;

	/**
	 * The feature id for the '<em><b>Invoice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__INVOICE = 3;

	/**
	 * The number of structural features of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT___MAKE_PAYMENT = 0;

	/**
	 * The number of operations of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link hairDressersRegSys.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see hairDressersRegSys.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hairDressersRegSys.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Service#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see hairDressersRegSys.Service#getDescription()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Description();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Service#getCostPerHour <em>Cost Per Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Per Hour</em>'.
	 * @see hairDressersRegSys.Service#getCostPerHour()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_CostPerHour();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Service#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see hairDressersRegSys.Service#getTime()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Time();

	/**
	 * Returns the meta object for the containment reference list '{@link hairDressersRegSys.Service#getAppointment <em>Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Appointment</em>'.
	 * @see hairDressersRegSys.Service#getAppointment()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Appointment();

	/**
	 * Returns the meta object for the '{@link hairDressersRegSys.Service#AddService() <em>Add Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Service</em>' operation.
	 * @see hairDressersRegSys.Service#AddService()
	 * @generated
	 */
	EOperation getService__AddService();

	/**
	 * Returns the meta object for the '{@link hairDressersRegSys.Service#RemoveService() <em>Remove Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Service</em>' operation.
	 * @see hairDressersRegSys.Service#RemoveService()
	 * @generated
	 */
	EOperation getService__RemoveService();

	/**
	 * Returns the meta object for the '{@link hairDressersRegSys.Service#ViewAllServices() <em>View All Services</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View All Services</em>' operation.
	 * @see hairDressersRegSys.Service#ViewAllServices()
	 * @generated
	 */
	EOperation getService__ViewAllServices();

	/**
	 * Returns the meta object for class '{@link hairDressersRegSys.Appointment <em>Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appointment</em>'.
	 * @see hairDressersRegSys.Appointment
	 * @generated
	 */
	EClass getAppointment();

	/**
	 * Returns the meta object for the containment reference '{@link hairDressersRegSys.Appointment#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invoice</em>'.
	 * @see hairDressersRegSys.Appointment#getInvoice()
	 * @see #getAppointment()
	 * @generated
	 */
	EReference getAppointment_Invoice();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Appointment#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see hairDressersRegSys.Appointment#getDate()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_Date();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Appointment#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see hairDressersRegSys.Appointment#getStartTime()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Appointment#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see hairDressersRegSys.Appointment#getEndTime()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_EndTime();

	/**
	 * Returns the meta object for the '{@link hairDressersRegSys.Appointment#ViewSchedule() <em>View Schedule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Schedule</em>' operation.
	 * @see hairDressersRegSys.Appointment#ViewSchedule()
	 * @generated
	 */
	EOperation getAppointment__ViewSchedule();

	/**
	 * Returns the meta object for the '{@link hairDressersRegSys.Appointment#AddAppointment() <em>Add Appointment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Appointment</em>' operation.
	 * @see hairDressersRegSys.Appointment#AddAppointment()
	 * @generated
	 */
	EOperation getAppointment__AddAppointment();

	/**
	 * Returns the meta object for class '{@link hairDressersRegSys.Products <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Products</em>'.
	 * @see hairDressersRegSys.Products
	 * @generated
	 */
	EClass getProducts();

	/**
	 * Returns the meta object for the reference '{@link hairDressersRegSys.Products#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice</em>'.
	 * @see hairDressersRegSys.Products#getInvoice()
	 * @see #getProducts()
	 * @generated
	 */
	EReference getProducts_Invoice();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Products#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hairDressersRegSys.Products#getName()
	 * @see #getProducts()
	 * @generated
	 */
	EAttribute getProducts_Name();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Products#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see hairDressersRegSys.Products#getDescription()
	 * @see #getProducts()
	 * @generated
	 */
	EAttribute getProducts_Description();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Products#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see hairDressersRegSys.Products#getPrice()
	 * @see #getProducts()
	 * @generated
	 */
	EAttribute getProducts_Price();

	/**
	 * Returns the meta object for the '{@link hairDressersRegSys.Products#AddProduct() <em>Add Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Product</em>' operation.
	 * @see hairDressersRegSys.Products#AddProduct()
	 * @generated
	 */
	EOperation getProducts__AddProduct();

	/**
	 * Returns the meta object for the '{@link hairDressersRegSys.Products#ViewTotalStock() <em>View Total Stock</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Total Stock</em>' operation.
	 * @see hairDressersRegSys.Products#ViewTotalStock()
	 * @generated
	 */
	EOperation getProducts__ViewTotalStock();

	/**
	 * Returns the meta object for class '{@link hairDressersRegSys.Invoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoice</em>'.
	 * @see hairDressersRegSys.Invoice
	 * @generated
	 */
	EClass getInvoice();

	/**
	 * Returns the meta object for the reference '{@link hairDressersRegSys.Invoice#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Products</em>'.
	 * @see hairDressersRegSys.Invoice#getProducts()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_Products();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Invoice#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see hairDressersRegSys.Invoice#getDate()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_Date();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Invoice#getInvoiceNumber <em>Invoice Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Number</em>'.
	 * @see hairDressersRegSys.Invoice#getInvoiceNumber()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_InvoiceNumber();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Invoice#getTotal <em>Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total</em>'.
	 * @see hairDressersRegSys.Invoice#getTotal()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_Total();

	/**
	 * Returns the meta object for the reference '{@link hairDressersRegSys.Invoice#getDiscounts <em>Discounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Discounts</em>'.
	 * @see hairDressersRegSys.Invoice#getDiscounts()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_Discounts();

	/**
	 * Returns the meta object for the reference '{@link hairDressersRegSys.Invoice#getPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment</em>'.
	 * @see hairDressersRegSys.Invoice#getPayment()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_Payment();

	/**
	 * Returns the meta object for the '{@link hairDressersRegSys.Invoice#CalculateTotal() <em>Calculate Total</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Total</em>' operation.
	 * @see hairDressersRegSys.Invoice#CalculateTotal()
	 * @generated
	 */
	EOperation getInvoice__CalculateTotal();

	/**
	 * Returns the meta object for the '{@link hairDressersRegSys.Invoice#GetDiscount() <em>Get Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Discount</em>' operation.
	 * @see hairDressersRegSys.Invoice#GetDiscount()
	 * @generated
	 */
	EOperation getInvoice__GetDiscount();

	/**
	 * Returns the meta object for class '{@link hairDressersRegSys.Discounts <em>Discounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discounts</em>'.
	 * @see hairDressersRegSys.Discounts
	 * @generated
	 */
	EClass getDiscounts();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Discounts#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hairDressersRegSys.Discounts#getName()
	 * @see #getDiscounts()
	 * @generated
	 */
	EAttribute getDiscounts_Name();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Discounts#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see hairDressersRegSys.Discounts#getDescription()
	 * @see #getDiscounts()
	 * @generated
	 */
	EAttribute getDiscounts_Description();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Discounts#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see hairDressersRegSys.Discounts#getPercentage()
	 * @see #getDiscounts()
	 * @generated
	 */
	EAttribute getDiscounts_Percentage();

	/**
	 * Returns the meta object for the reference list '{@link hairDressersRegSys.Discounts#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer</em>'.
	 * @see hairDressersRegSys.Discounts#getCustomer()
	 * @see #getDiscounts()
	 * @generated
	 */
	EReference getDiscounts_Customer();

	/**
	 * Returns the meta object for the reference list '{@link hairDressersRegSys.Discounts#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invoice</em>'.
	 * @see hairDressersRegSys.Discounts#getInvoice()
	 * @see #getDiscounts()
	 * @generated
	 */
	EReference getDiscounts_Invoice();

	/**
	 * Returns the meta object for class '{@link hairDressersRegSys.Styling <em>Styling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Styling</em>'.
	 * @see hairDressersRegSys.Styling
	 * @generated
	 */
	EClass getStyling();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Styling#isIsWash <em>Is Wash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Wash</em>'.
	 * @see hairDressersRegSys.Styling#isIsWash()
	 * @see #getStyling()
	 * @generated
	 */
	EAttribute getStyling_IsWash();

	/**
	 * Returns the meta object for class '{@link hairDressersRegSys.Haircuts <em>Haircuts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Haircuts</em>'.
	 * @see hairDressersRegSys.Haircuts
	 * @generated
	 */
	EClass getHaircuts();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Haircuts#isIsWash <em>Is Wash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Wash</em>'.
	 * @see hairDressersRegSys.Haircuts#isIsWash()
	 * @see #getHaircuts()
	 * @generated
	 */
	EAttribute getHaircuts_IsWash();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Haircuts#isIsShave <em>Is Shave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Shave</em>'.
	 * @see hairDressersRegSys.Haircuts#isIsShave()
	 * @see #getHaircuts()
	 * @generated
	 */
	EAttribute getHaircuts_IsShave();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Haircuts#isIsCut <em>Is Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Cut</em>'.
	 * @see hairDressersRegSys.Haircuts#isIsCut()
	 * @see #getHaircuts()
	 * @generated
	 */
	EAttribute getHaircuts_IsCut();

	/**
	 * Returns the meta object for class '{@link hairDressersRegSys.Other <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other</em>'.
	 * @see hairDressersRegSys.Other
	 * @generated
	 */
	EClass getOther();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Other#getAdditionalInformation <em>Additional Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Information</em>'.
	 * @see hairDressersRegSys.Other#getAdditionalInformation()
	 * @see #getOther()
	 * @generated
	 */
	EAttribute getOther_AdditionalInformation();

	/**
	 * Returns the meta object for class '{@link hairDressersRegSys.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see hairDressersRegSys.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the containment reference list '{@link hairDressersRegSys.Customer#getAppointment <em>Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Appointment</em>'.
	 * @see hairDressersRegSys.Customer#getAppointment()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Appointment();

	/**
	 * Returns the meta object for the reference '{@link hairDressersRegSys.Customer#getDiscounts <em>Discounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Discounts</em>'.
	 * @see hairDressersRegSys.Customer#getDiscounts()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Discounts();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Customer#getCustomerId <em>Customer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Id</em>'.
	 * @see hairDressersRegSys.Customer#getCustomerId()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CustomerId();

	/**
	 * Returns the meta object for the '{@link hairDressersRegSys.Customer#PlaceAppointment() <em>Place Appointment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Place Appointment</em>' operation.
	 * @see hairDressersRegSys.Customer#PlaceAppointment()
	 * @generated
	 */
	EOperation getCustomer__PlaceAppointment();

	/**
	 * Returns the meta object for the '{@link hairDressersRegSys.Customer#AddNewCustomer() <em>Add New Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add New Customer</em>' operation.
	 * @see hairDressersRegSys.Customer#AddNewCustomer()
	 * @generated
	 */
	EOperation getCustomer__AddNewCustomer();

	/**
	 * Returns the meta object for class '{@link hairDressersRegSys.ServiceEmployee <em>Service Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Employee</em>'.
	 * @see hairDressersRegSys.ServiceEmployee
	 * @generated
	 */
	EClass getServiceEmployee();

	/**
	 * Returns the meta object for the containment reference list '{@link hairDressersRegSys.ServiceEmployee#getAppointment <em>Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Appointment</em>'.
	 * @see hairDressersRegSys.ServiceEmployee#getAppointment()
	 * @see #getServiceEmployee()
	 * @generated
	 */
	EReference getServiceEmployee_Appointment();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.ServiceEmployee#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see hairDressersRegSys.ServiceEmployee#getRole()
	 * @see #getServiceEmployee()
	 * @generated
	 */
	EAttribute getServiceEmployee_Role();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.ServiceEmployee#getEmployeeId <em>Employee Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Employee Id</em>'.
	 * @see hairDressersRegSys.ServiceEmployee#getEmployeeId()
	 * @see #getServiceEmployee()
	 * @generated
	 */
	EAttribute getServiceEmployee_EmployeeId();

	/**
	 * Returns the meta object for the '{@link hairDressersRegSys.ServiceEmployee#MakeAppointment() <em>Make Appointment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Appointment</em>' operation.
	 * @see hairDressersRegSys.ServiceEmployee#MakeAppointment()
	 * @generated
	 */
	EOperation getServiceEmployee__MakeAppointment();

	/**
	 * Returns the meta object for the '{@link hairDressersRegSys.ServiceEmployee#AddNewEmployee() <em>Add New Employee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add New Employee</em>' operation.
	 * @see hairDressersRegSys.ServiceEmployee#AddNewEmployee()
	 * @generated
	 */
	EOperation getServiceEmployee__AddNewEmployee();

	/**
	 * Returns the meta object for the '{@link hairDressersRegSys.ServiceEmployee#ViewAllAvailableEmployees() <em>View All Available Employees</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View All Available Employees</em>' operation.
	 * @see hairDressersRegSys.ServiceEmployee#ViewAllAvailableEmployees()
	 * @generated
	 */
	EOperation getServiceEmployee__ViewAllAvailableEmployees();

	/**
	 * Returns the meta object for the '{@link hairDressersRegSys.ServiceEmployee#ViewAppointments() <em>View Appointments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Appointments</em>' operation.
	 * @see hairDressersRegSys.ServiceEmployee#ViewAppointments()
	 * @generated
	 */
	EOperation getServiceEmployee__ViewAppointments();

	/**
	 * Returns the meta object for the '{@link hairDressersRegSys.ServiceEmployee#RemoveAppointment() <em>Remove Appointment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Appointment</em>' operation.
	 * @see hairDressersRegSys.ServiceEmployee#RemoveAppointment()
	 * @generated
	 */
	EOperation getServiceEmployee__RemoveAppointment();

	/**
	 * Returns the meta object for class '{@link hairDressersRegSys.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see hairDressersRegSys.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see hairDressersRegSys.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Person#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see hairDressersRegSys.Person#getLastName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastName();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Person#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see hairDressersRegSys.Person#getAddress()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Address();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Person#getDateOfBirth <em>Date Of Birth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Birth</em>'.
	 * @see hairDressersRegSys.Person#getDateOfBirth()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_DateOfBirth();

	/**
	 * Returns the meta object for the '{@link hairDressersRegSys.Person#GetAge() <em>Get Age</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Age</em>' operation.
	 * @see hairDressersRegSys.Person#GetAge()
	 * @generated
	 */
	EOperation getPerson__GetAge();

	/**
	 * Returns the meta object for class '{@link hairDressersRegSys.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment</em>'.
	 * @see hairDressersRegSys.Payment
	 * @generated
	 */
	EClass getPayment();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Payment#getPaymentMethod <em>Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Method</em>'.
	 * @see hairDressersRegSys.Payment#getPaymentMethod()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_PaymentMethod();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Payment#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see hairDressersRegSys.Payment#getDate()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Date();

	/**
	 * Returns the meta object for the attribute '{@link hairDressersRegSys.Payment#getAmountPaid <em>Amount Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Paid</em>'.
	 * @see hairDressersRegSys.Payment#getAmountPaid()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_AmountPaid();

	/**
	 * Returns the meta object for the reference list '{@link hairDressersRegSys.Payment#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invoice</em>'.
	 * @see hairDressersRegSys.Payment#getInvoice()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_Invoice();

	/**
	 * Returns the meta object for the '{@link hairDressersRegSys.Payment#MakePayment() <em>Make Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Payment</em>' operation.
	 * @see hairDressersRegSys.Payment#MakePayment()
	 * @generated
	 */
	EOperation getPayment__MakePayment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HairDressersRegSysFactory getHairDressersRegSysFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hairDressersRegSys.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hairDressersRegSys.impl.ServiceImpl
		 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__DESCRIPTION = eINSTANCE.getService_Description();

		/**
		 * The meta object literal for the '<em><b>Cost Per Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__COST_PER_HOUR = eINSTANCE.getService_CostPerHour();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__TIME = eINSTANCE.getService_Time();

		/**
		 * The meta object literal for the '<em><b>Appointment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__APPOINTMENT = eINSTANCE.getService_Appointment();

		/**
		 * The meta object literal for the '<em><b>Add Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE___ADD_SERVICE = eINSTANCE.getService__AddService();

		/**
		 * The meta object literal for the '<em><b>Remove Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE___REMOVE_SERVICE = eINSTANCE.getService__RemoveService();

		/**
		 * The meta object literal for the '<em><b>View All Services</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE___VIEW_ALL_SERVICES = eINSTANCE.getService__ViewAllServices();

		/**
		 * The meta object literal for the '{@link hairDressersRegSys.impl.AppointmentImpl <em>Appointment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hairDressersRegSys.impl.AppointmentImpl
		 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getAppointment()
		 * @generated
		 */
		EClass APPOINTMENT = eINSTANCE.getAppointment();

		/**
		 * The meta object literal for the '<em><b>Invoice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPOINTMENT__INVOICE = eINSTANCE.getAppointment_Invoice();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__DATE = eINSTANCE.getAppointment_Date();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__START_TIME = eINSTANCE.getAppointment_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__END_TIME = eINSTANCE.getAppointment_EndTime();

		/**
		 * The meta object literal for the '<em><b>View Schedule</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPOINTMENT___VIEW_SCHEDULE = eINSTANCE.getAppointment__ViewSchedule();

		/**
		 * The meta object literal for the '<em><b>Add Appointment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPOINTMENT___ADD_APPOINTMENT = eINSTANCE.getAppointment__AddAppointment();

		/**
		 * The meta object literal for the '{@link hairDressersRegSys.impl.ProductsImpl <em>Products</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hairDressersRegSys.impl.ProductsImpl
		 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getProducts()
		 * @generated
		 */
		EClass PRODUCTS = eINSTANCE.getProducts();

		/**
		 * The meta object literal for the '<em><b>Invoice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTS__INVOICE = eINSTANCE.getProducts_Invoice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTS__NAME = eINSTANCE.getProducts_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTS__DESCRIPTION = eINSTANCE.getProducts_Description();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTS__PRICE = eINSTANCE.getProducts_Price();

		/**
		 * The meta object literal for the '<em><b>Add Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCTS___ADD_PRODUCT = eINSTANCE.getProducts__AddProduct();

		/**
		 * The meta object literal for the '<em><b>View Total Stock</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCTS___VIEW_TOTAL_STOCK = eINSTANCE.getProducts__ViewTotalStock();

		/**
		 * The meta object literal for the '{@link hairDressersRegSys.impl.InvoiceImpl <em>Invoice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hairDressersRegSys.impl.InvoiceImpl
		 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getInvoice()
		 * @generated
		 */
		EClass INVOICE = eINSTANCE.getInvoice();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__PRODUCTS = eINSTANCE.getInvoice_Products();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__DATE = eINSTANCE.getInvoice_Date();

		/**
		 * The meta object literal for the '<em><b>Invoice Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__INVOICE_NUMBER = eINSTANCE.getInvoice_InvoiceNumber();

		/**
		 * The meta object literal for the '<em><b>Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__TOTAL = eINSTANCE.getInvoice_Total();

		/**
		 * The meta object literal for the '<em><b>Discounts</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__DISCOUNTS = eINSTANCE.getInvoice_Discounts();

		/**
		 * The meta object literal for the '<em><b>Payment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__PAYMENT = eINSTANCE.getInvoice_Payment();

		/**
		 * The meta object literal for the '<em><b>Calculate Total</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INVOICE___CALCULATE_TOTAL = eINSTANCE.getInvoice__CalculateTotal();

		/**
		 * The meta object literal for the '<em><b>Get Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INVOICE___GET_DISCOUNT = eINSTANCE.getInvoice__GetDiscount();

		/**
		 * The meta object literal for the '{@link hairDressersRegSys.impl.DiscountsImpl <em>Discounts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hairDressersRegSys.impl.DiscountsImpl
		 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getDiscounts()
		 * @generated
		 */
		EClass DISCOUNTS = eINSTANCE.getDiscounts();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNTS__NAME = eINSTANCE.getDiscounts_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNTS__DESCRIPTION = eINSTANCE.getDiscounts_Description();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNTS__PERCENTAGE = eINSTANCE.getDiscounts_Percentage();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOUNTS__CUSTOMER = eINSTANCE.getDiscounts_Customer();

		/**
		 * The meta object literal for the '<em><b>Invoice</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOUNTS__INVOICE = eINSTANCE.getDiscounts_Invoice();

		/**
		 * The meta object literal for the '{@link hairDressersRegSys.impl.StylingImpl <em>Styling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hairDressersRegSys.impl.StylingImpl
		 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getStyling()
		 * @generated
		 */
		EClass STYLING = eINSTANCE.getStyling();

		/**
		 * The meta object literal for the '<em><b>Is Wash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLING__IS_WASH = eINSTANCE.getStyling_IsWash();

		/**
		 * The meta object literal for the '{@link hairDressersRegSys.impl.HaircutsImpl <em>Haircuts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hairDressersRegSys.impl.HaircutsImpl
		 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getHaircuts()
		 * @generated
		 */
		EClass HAIRCUTS = eINSTANCE.getHaircuts();

		/**
		 * The meta object literal for the '<em><b>Is Wash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAIRCUTS__IS_WASH = eINSTANCE.getHaircuts_IsWash();

		/**
		 * The meta object literal for the '<em><b>Is Shave</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAIRCUTS__IS_SHAVE = eINSTANCE.getHaircuts_IsShave();

		/**
		 * The meta object literal for the '<em><b>Is Cut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAIRCUTS__IS_CUT = eINSTANCE.getHaircuts_IsCut();

		/**
		 * The meta object literal for the '{@link hairDressersRegSys.impl.OtherImpl <em>Other</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hairDressersRegSys.impl.OtherImpl
		 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getOther()
		 * @generated
		 */
		EClass OTHER = eINSTANCE.getOther();

		/**
		 * The meta object literal for the '<em><b>Additional Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OTHER__ADDITIONAL_INFORMATION = eINSTANCE.getOther_AdditionalInformation();

		/**
		 * The meta object literal for the '{@link hairDressersRegSys.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hairDressersRegSys.impl.CustomerImpl
		 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Appointment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__APPOINTMENT = eINSTANCE.getCustomer_Appointment();

		/**
		 * The meta object literal for the '<em><b>Discounts</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__DISCOUNTS = eINSTANCE.getCustomer_Discounts();

		/**
		 * The meta object literal for the '<em><b>Customer Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CUSTOMER_ID = eINSTANCE.getCustomer_CustomerId();

		/**
		 * The meta object literal for the '<em><b>Place Appointment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___PLACE_APPOINTMENT = eINSTANCE.getCustomer__PlaceAppointment();

		/**
		 * The meta object literal for the '<em><b>Add New Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___ADD_NEW_CUSTOMER = eINSTANCE.getCustomer__AddNewCustomer();

		/**
		 * The meta object literal for the '{@link hairDressersRegSys.impl.ServiceEmployeeImpl <em>Service Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hairDressersRegSys.impl.ServiceEmployeeImpl
		 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getServiceEmployee()
		 * @generated
		 */
		EClass SERVICE_EMPLOYEE = eINSTANCE.getServiceEmployee();

		/**
		 * The meta object literal for the '<em><b>Appointment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_EMPLOYEE__APPOINTMENT = eINSTANCE.getServiceEmployee_Appointment();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_EMPLOYEE__ROLE = eINSTANCE.getServiceEmployee_Role();

		/**
		 * The meta object literal for the '<em><b>Employee Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_EMPLOYEE__EMPLOYEE_ID = eINSTANCE.getServiceEmployee_EmployeeId();

		/**
		 * The meta object literal for the '<em><b>Make Appointment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_EMPLOYEE___MAKE_APPOINTMENT = eINSTANCE.getServiceEmployee__MakeAppointment();

		/**
		 * The meta object literal for the '<em><b>Add New Employee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_EMPLOYEE___ADD_NEW_EMPLOYEE = eINSTANCE.getServiceEmployee__AddNewEmployee();

		/**
		 * The meta object literal for the '<em><b>View All Available Employees</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_EMPLOYEE___VIEW_ALL_AVAILABLE_EMPLOYEES = eINSTANCE.getServiceEmployee__ViewAllAvailableEmployees();

		/**
		 * The meta object literal for the '<em><b>View Appointments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_EMPLOYEE___VIEW_APPOINTMENTS = eINSTANCE.getServiceEmployee__ViewAppointments();

		/**
		 * The meta object literal for the '<em><b>Remove Appointment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_EMPLOYEE___REMOVE_APPOINTMENT = eINSTANCE.getServiceEmployee__RemoveAppointment();

		/**
		 * The meta object literal for the '{@link hairDressersRegSys.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hairDressersRegSys.impl.PersonImpl
		 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ADDRESS = eINSTANCE.getPerson_Address();

		/**
		 * The meta object literal for the '<em><b>Date Of Birth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__DATE_OF_BIRTH = eINSTANCE.getPerson_DateOfBirth();

		/**
		 * The meta object literal for the '<em><b>Get Age</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON___GET_AGE = eINSTANCE.getPerson__GetAge();

		/**
		 * The meta object literal for the '{@link hairDressersRegSys.impl.PaymentImpl <em>Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hairDressersRegSys.impl.PaymentImpl
		 * @see hairDressersRegSys.impl.HairDressersRegSysPackageImpl#getPayment()
		 * @generated
		 */
		EClass PAYMENT = eINSTANCE.getPayment();

		/**
		 * The meta object literal for the '<em><b>Payment Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAYMENT_METHOD = eINSTANCE.getPayment_PaymentMethod();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__DATE = eINSTANCE.getPayment_Date();

		/**
		 * The meta object literal for the '<em><b>Amount Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__AMOUNT_PAID = eINSTANCE.getPayment_AmountPaid();

		/**
		 * The meta object literal for the '<em><b>Invoice</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__INVOICE = eINSTANCE.getPayment_Invoice();

		/**
		 * The meta object literal for the '<em><b>Make Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT___MAKE_PAYMENT = eINSTANCE.getPayment__MakePayment();

	}

} //HairDressersRegSysPackage
