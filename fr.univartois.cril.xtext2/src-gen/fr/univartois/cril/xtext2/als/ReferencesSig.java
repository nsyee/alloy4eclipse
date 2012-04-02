/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext2.als;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>References Sig</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext2.als.ReferencesSig#getAsname <em>Asname</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.ReferencesSig#getNameRef <em>Name Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.xtext2.als.AlsPackage#getReferencesSig()
 * @model
 * @generated
 */
public interface ReferencesSig extends EObject
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
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getReferencesSig_Asname()
   * @model containment="true"
   * @generated
   */
  AsName getAsname();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.ReferencesSig#getAsname <em>Asname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asname</em>' containment reference.
   * @see #getAsname()
   * @generated
   */
  void setAsname(AsName value);

  /**
   * Returns the value of the '<em><b>Name Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Ref</em>' reference.
   * @see #setNameRef(SignatureName)
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getReferencesSig_NameRef()
   * @model
   * @generated
   */
  SignatureName getNameRef();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.ReferencesSig#getNameRef <em>Name Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Ref</em>' reference.
   * @see #getNameRef()
   * @generated
   */
  void setNameRef(SignatureName value);

} // ReferencesSig
