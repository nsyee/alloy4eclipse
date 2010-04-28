/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Module#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Module#getSuite <em>Suite</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject
{
  /**
   * Returns the value of the '<em><b>Module Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module Name</em>' containment reference.
   * @see #setModuleName(Name)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getModule_ModuleName()
   * @model containment="true"
   * @generated
   */
  Name getModuleName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Module#getModuleName <em>Module Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module Name</em>' containment reference.
   * @see #getModuleName()
   * @generated
   */
  void setModuleName(Name value);

  /**
   * Returns the value of the '<em><b>Suite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Suite</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Suite</em>' containment reference.
   * @see #setSuite(Name)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getModule_Suite()
   * @model containment="true"
   * @generated
   */
  Name getSuite();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Module#getSuite <em>Suite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Suite</em>' containment reference.
   * @see #getSuite()
   * @generated
   */
  void setSuite(Name value);

} // Module
