/**
 * <copyright>
 * </copyright>
 *

 */
package fr.univartois.cril.xtext.als;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.Ref#getNameRef <em>Name Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.xtext.als.AlsPackage#getRef()
 * @model
 * @generated
 */
public interface Ref extends EObject
{
  /**
   * Returns the value of the '<em><b>Name Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Ref</em>' reference.
   * @see #setNameRef(ReferencesName)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getRef_NameRef()
   * @model
   * @generated
   */
  ReferencesName getNameRef();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Ref#getNameRef <em>Name Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Ref</em>' reference.
   * @see #getNameRef()
   * @generated
   */
  void setNameRef(ReferencesName value);

} // Ref
