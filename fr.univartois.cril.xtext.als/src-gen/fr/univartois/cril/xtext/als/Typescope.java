/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext.als;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typescope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.Typescope#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.xtext.als.AlsPackage#getTypescope()
 * @model
 * @generated
 */
public interface Typescope extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(ReferencesName)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getTypescope_Name()
   * @model
   * @generated
   */
  ReferencesName getName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Typescope#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(ReferencesName value);

} // Typescope
