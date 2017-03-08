/**
 */
package HairDressersRegistrationSystem.hairDressersRegSys;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see HairDressersRegistrationSystem.hairDressersRegSys.HairDressersRegSysPackage
 * @generated
 */
public interface HairDressersRegSysFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HairDressersRegSysFactory eINSTANCE = HairDressersRegistrationSystem.hairDressersRegSys.impl.HairDressersRegSysFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Appointment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appointment</em>'.
	 * @generated
	 */
	Appointment createAppointment();

	/**
	 * Returns a new object of class '<em>Products</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Products</em>'.
	 * @generated
	 */
	Products createProducts();

	/**
	 * Returns a new object of class '<em>Invoice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invoice</em>'.
	 * @generated
	 */
	Invoice createInvoice();

	/**
	 * Returns a new object of class '<em>Discounts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discounts</em>'.
	 * @generated
	 */
	Discounts createDiscounts();

	/**
	 * Returns a new object of class '<em>Styling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Styling</em>'.
	 * @generated
	 */
	Styling createStyling();

	/**
	 * Returns a new object of class '<em>Haircuts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Haircuts</em>'.
	 * @generated
	 */
	Haircuts createHaircuts();

	/**
	 * Returns a new object of class '<em>Other</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Other</em>'.
	 * @generated
	 */
	Other createOther();

	/**
	 * Returns a new object of class '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer</em>'.
	 * @generated
	 */
	Customer createCustomer();

	/**
	 * Returns a new object of class '<em>Service Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Employee</em>'.
	 * @generated
	 */
	ServiceEmployee createServiceEmployee();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Payment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment</em>'.
	 * @generated
	 */
	Payment createPayment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HairDressersRegSysPackage getHairDressersRegSysPackage();

} //HairDressersRegSysFactory
