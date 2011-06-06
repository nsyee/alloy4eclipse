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
 * A representation of the model object '<em><b>Sig Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.SigExt#getRef <em>Ref</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.SigExt#getRef2 <em>Ref2</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.xtext.als.AlsPackage#getSigExt()
 * @model
 * @generated
 */
public interface SigExt extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(ReferencesSig)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getSigExt_Ref()
   * @model containment="true"
   * @generated
   */
  ReferencesSig getRef();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.SigExt#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(ReferencesSig value);

  /**
   * Returns the value of the '<em><b>Ref2</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.xtext.als.ReferencesSig}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref2</em>' containment reference list.
   * @see fr.univartois.cril.xtext.als.AlsPackage#getSigExt_Ref2()
   * @model containment="true"
   * @generated
   */
  EList<ReferencesSig> getRef2();

} // SigExt
