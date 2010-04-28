/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Scope#getTypescope <em>Typescope</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getScope()
 * @model
 * @generated
 */
public interface Scope extends EObject
{
  /**
   * Returns the value of the '<em><b>Typescope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typescope</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typescope</em>' containment reference.
   * @see #setTypescope(Typescope)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getScope_Typescope()
   * @model containment="true"
   * @generated
   */
  Typescope getTypescope();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Scope#getTypescope <em>Typescope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typescope</em>' containment reference.
   * @see #getTypescope()
   * @generated
   */
  void setTypescope(Typescope value);

} // Scope
