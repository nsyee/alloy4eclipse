/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fun Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.FunDecl#getRef <em>Ref</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.FunDecl#getFunName <em>Fun Name</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.FunDecl#getDecl <em>Decl</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.FunDecl#getDecl2 <em>Decl2</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.FunDecl#getExpr <em>Expr</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.FunDecl#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getFunDecl()
 * @model
 * @generated
 */
public interface FunDecl extends Paragraph
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
   * @see #setRef(Ref)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getFunDecl_Ref()
   * @model containment="true"
   * @generated
   */
  Ref getRef();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.FunDecl#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Ref value);

  /**
   * Returns the value of the '<em><b>Fun Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fun Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fun Name</em>' containment reference.
   * @see #setFunName(Name)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getFunDecl_FunName()
   * @model containment="true"
   * @generated
   */
  Name getFunName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.FunDecl#getFunName <em>Fun Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fun Name</em>' containment reference.
   * @see #getFunName()
   * @generated
   */
  void setFunName(Name value);

  /**
   * Returns the value of the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decl</em>' containment reference.
   * @see #setDecl(Decl)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getFunDecl_Decl()
   * @model containment="true"
   * @generated
   */
  Decl getDecl();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.FunDecl#getDecl <em>Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decl</em>' containment reference.
   * @see #getDecl()
   * @generated
   */
  void setDecl(Decl value);

  /**
   * Returns the value of the '<em><b>Decl2</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.alloyplugin.basics.Decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decl2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decl2</em>' containment reference list.
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getFunDecl_Decl2()
   * @model containment="true"
   * @generated
   */
  EList<Decl> getDecl2();

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
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getFunDecl_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.FunDecl#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

  /**
   * Returns the value of the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' containment reference.
   * @see #setB(BlockBis)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getFunDecl_B()
   * @model containment="true"
   * @generated
   */
  BlockBis getB();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.FunDecl#getB <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B</em>' containment reference.
   * @see #getB()
   * @generated
   */
  void setB(BlockBis value);

} // FunDecl
