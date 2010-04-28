/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Decl#getName <em>Name</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Decl#getSuite <em>Suite</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Decl#getExprDecl <em>Expr Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getDecl()
 * @model
 * @generated
 */
public interface Decl extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Name)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getDecl_Name()
   * @model containment="true"
   * @generated
   */
  Name getName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Decl#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Name value);

  /**
   * Returns the value of the '<em><b>Suite</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.alloyplugin.basics.Name}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Suite</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Suite</em>' containment reference list.
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getDecl_Suite()
   * @model containment="true"
   * @generated
   */
  EList<Name> getSuite();

  /**
   * Returns the value of the '<em><b>Expr Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Decl</em>' containment reference.
   * @see #setExprDecl(Expression)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getDecl_ExprDecl()
   * @model containment="true"
   * @generated
   */
  Expression getExprDecl();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Decl#getExprDecl <em>Expr Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Decl</em>' containment reference.
   * @see #getExprDecl()
   * @generated
   */
  void setExprDecl(Expression value);

} // Decl
