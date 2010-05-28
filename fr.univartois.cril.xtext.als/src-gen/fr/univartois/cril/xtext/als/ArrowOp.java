/**
 * <copyright>
 * </copyright>
 *

 */
package fr.univartois.cril.xtext.als;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrow Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.ArrowOp#getArrow <em>Arrow</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.xtext.als.AlsPackage#getArrowOp()
 * @model
 * @generated
 */
public interface ArrowOp extends EObject
{
  /**
   * Returns the value of the '<em><b>Arrow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arrow</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arrow</em>' attribute.
   * @see #setArrow(String)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getArrowOp_Arrow()
   * @model
   * @generated
   */
  String getArrow();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.ArrowOp#getArrow <em>Arrow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arrow</em>' attribute.
   * @see #getArrow()
   * @generated
   */
  void setArrow(String value);

} // ArrowOp
