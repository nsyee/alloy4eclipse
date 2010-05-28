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
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.Block#getLeftC <em>Left C</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Block#getExpr <em>Expr</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Block#getRightC <em>Right C</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.xtext.als.AlsPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject
{
  /**
   * Returns the value of the '<em><b>Left C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left C</em>' containment reference.
   * @see #setLeftC(LeftCurlyBracket)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getBlock_LeftC()
   * @model containment="true"
   * @generated
   */
  LeftCurlyBracket getLeftC();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Block#getLeftC <em>Left C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left C</em>' containment reference.
   * @see #getLeftC()
   * @generated
   */
  void setLeftC(LeftCurlyBracket value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.xtext.als.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference list.
   * @see fr.univartois.cril.xtext.als.AlsPackage#getBlock_Expr()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpr();

  /**
   * Returns the value of the '<em><b>Right C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right C</em>' containment reference.
   * @see #setRightC(RightCurlyBracket)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getBlock_RightC()
   * @model containment="true"
   * @generated
   */
  RightCurlyBracket getRightC();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Block#getRightC <em>Right C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right C</em>' containment reference.
   * @see #getRightC()
   * @generated
   */
  void setRightC(RightCurlyBracket value);

} // Block
