/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Ref#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getRef()
 * @model
 * @generated
 */
public interface Ref extends EObject
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
   * @see #setName(Name)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getRef_Name()
   * @model
   * @generated
   */
  Name getName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Ref#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Name value);

} // Ref
