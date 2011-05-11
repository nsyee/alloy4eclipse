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
 * A representation of the model object '<em><b>Paranthesisand Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.ParanthesisandExpression#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.xtext.als.AlsPackage#getParanthesisandExpression()
 * @model
 * @generated
 */
public interface ParanthesisandExpression extends EObject
{
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
   * @see fr.univartois.cril.xtext.als.AlsPackage#getParanthesisandExpression_Expr()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpr();

} // ParanthesisandExpression
