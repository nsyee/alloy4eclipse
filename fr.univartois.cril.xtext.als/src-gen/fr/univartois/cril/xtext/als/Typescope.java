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
 *   <li>{@link fr.univartois.cril.xtext.als.Typescope#getAsname <em>Asname</em>}</li>
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
   * Returns the value of the '<em><b>Asname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Asname</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asname</em>' containment reference.
   * @see #setAsname(AsName)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getTypescope_Asname()
   * @model containment="true"
   * @generated
   */
  AsName getAsname();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Typescope#getAsname <em>Asname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asname</em>' containment reference.
   * @see #getAsname()
   * @generated
   */
  void setAsname(AsName value);

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
