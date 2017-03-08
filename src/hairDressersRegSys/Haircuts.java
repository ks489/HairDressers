/**
 */
package hairDressersRegSys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Haircuts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hairDressersRegSys.Haircuts#isIsWash <em>Is Wash</em>}</li>
 *   <li>{@link hairDressersRegSys.Haircuts#isIsShave <em>Is Shave</em>}</li>
 *   <li>{@link hairDressersRegSys.Haircuts#isIsCut <em>Is Cut</em>}</li>
 * </ul>
 *
 * @see hairDressersRegSys.HairDressersRegSysPackage#getHaircuts()
 * @model
 * @generated
 */
public interface Haircuts extends Service {
	/**
	 * Returns the value of the '<em><b>Is Wash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Wash</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Wash</em>' attribute.
	 * @see #setIsWash(boolean)
	 * @see hairDressersRegSys.HairDressersRegSysPackage#getHaircuts_IsWash()
	 * @model
	 * @generated
	 */
	boolean isIsWash();

	/**
	 * Sets the value of the '{@link hairDressersRegSys.Haircuts#isIsWash <em>Is Wash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Wash</em>' attribute.
	 * @see #isIsWash()
	 * @generated
	 */
	void setIsWash(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Shave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Shave</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Shave</em>' attribute.
	 * @see #setIsShave(boolean)
	 * @see hairDressersRegSys.HairDressersRegSysPackage#getHaircuts_IsShave()
	 * @model
	 * @generated
	 */
	boolean isIsShave();

	/**
	 * Sets the value of the '{@link hairDressersRegSys.Haircuts#isIsShave <em>Is Shave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Shave</em>' attribute.
	 * @see #isIsShave()
	 * @generated
	 */
	void setIsShave(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Cut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Cut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Cut</em>' attribute.
	 * @see #setIsCut(boolean)
	 * @see hairDressersRegSys.HairDressersRegSysPackage#getHaircuts_IsCut()
	 * @model
	 * @generated
	 */
	boolean isIsCut();

	/**
	 * Sets the value of the '{@link hairDressersRegSys.Haircuts#isIsCut <em>Is Cut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Cut</em>' attribute.
	 * @see #isIsCut()
	 * @generated
	 */
	void setIsCut(boolean value);

} // Haircuts
