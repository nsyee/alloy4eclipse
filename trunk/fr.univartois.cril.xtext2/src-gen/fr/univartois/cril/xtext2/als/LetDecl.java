/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext2.als;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext2.als.LetDecl#getNameExpression <em>Name Expression</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.LetDecl#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.xtext2.als.AlsPackage#getLetDecl()
 * @model
 * @generated
 */
public interface LetDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Name Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Expression</em>' containment reference.
   * @see #setNameExpression(PropertyName)
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getLetDecl_NameExpression()
   * @model containment="true"
   * @generated
   */
  PropertyName getNameExpression();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.LetDecl#getNameExpression <em>Name Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Expression</em>' containment reference.
   * @see #getNameExpression()
   * @generated
   */
  void setNameExpression(PropertyName value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expression)
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getLetDecl_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.LetDecl#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

} // LetDecl
