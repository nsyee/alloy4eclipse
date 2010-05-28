/**
 * <copyright>
 * </copyright>
 *

 */
package fr.univartois.cril.xtext.als;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.Scope#getExpect <em>Expect</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Scope#getTypescope <em>Typescope</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Scope#getComma <em>Comma</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.xtext.als.AlsPackage#getScope()
 * @model
 * @generated
 */
public interface Scope extends EObject
{
  /**
   * Returns the value of the '<em><b>Expect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expect</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expect</em>' containment reference.
   * @see #setExpect(Expectation)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getScope_Expect()
   * @model containment="true"
   * @generated
   */
  Expectation getExpect();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Scope#getExpect <em>Expect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expect</em>' containment reference.
   * @see #getExpect()
   * @generated
   */
  void setExpect(Expectation value);

  /**
   * Returns the value of the '<em><b>Typescope</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.xtext.als.Typescope}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typescope</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typescope</em>' containment reference list.
   * @see fr.univartois.cril.xtext.als.AlsPackage#getScope_Typescope()
   * @model containment="true"
   * @generated
   */
  EList<Typescope> getTypescope();

  /**
   * Returns the value of the '<em><b>Comma</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.xtext.als.Comma}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comma</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comma</em>' containment reference list.
   * @see fr.univartois.cril.xtext.als.AlsPackage#getScope_Comma()
   * @model containment="true"
   * @generated
   */
  EList<Comma> getComma();

} // Scope
