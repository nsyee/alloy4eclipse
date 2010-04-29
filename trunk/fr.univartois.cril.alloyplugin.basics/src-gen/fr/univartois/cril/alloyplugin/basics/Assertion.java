/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Assertion#getAssertName <em>Assert Name</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Assertion#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getAssertion()
 * @model
 * @generated
 */
public interface Assertion extends Paragraph
{
  /**
   * Returns the value of the '<em><b>Assert Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assert Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assert Name</em>' containment reference.
   * @see #setAssertName(Name)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getAssertion_AssertName()
   * @model containment="true"
   * @generated
   */
  Name getAssertName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Assertion#getAssertName <em>Assert Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assert Name</em>' containment reference.
   * @see #getAssertName()
   * @generated
   */
  void setAssertName(Name value);

  /**
   * Returns the value of the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' containment reference.
   * @see #setB(BlockBis)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getAssertion_B()
   * @model containment="true"
   * @generated
   */
  BlockBis getB();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Assertion#getB <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B</em>' containment reference.
   * @see #getB()
   * @generated
   */
  void setB(BlockBis value);

} // Assertion
