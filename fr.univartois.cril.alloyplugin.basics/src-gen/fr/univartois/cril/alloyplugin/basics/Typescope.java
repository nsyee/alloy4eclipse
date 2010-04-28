/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typescope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Typescope#getN <em>N</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getTypescope()
 * @model
 * @generated
 */
public interface Typescope extends EObject
{
  /**
   * Returns the value of the '<em><b>N</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' reference.
   * @see #setN(Name)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getTypescope_N()
   * @model
   * @generated
   */
  Name getN();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Typescope#getN <em>N</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' reference.
   * @see #getN()
   * @generated
   */
  void setN(Name value);

} // Typescope
