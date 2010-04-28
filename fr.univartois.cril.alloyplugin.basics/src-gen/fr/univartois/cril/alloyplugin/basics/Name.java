/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Name#getExprDecl <em>Expr Decl</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Name#getExprLet <em>Expr Let</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Name#getThis <em>This</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Name#getName <em>Name</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Name#getNameComplete <em>Name Complete</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getName_()
 * @model
 * @generated
 */
public interface Name extends Decl2, LetDecl
{
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
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getName_ExprDecl()
   * @model containment="true"
   * @generated
   */
  Expression getExprDecl();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Name#getExprDecl <em>Expr Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Decl</em>' containment reference.
   * @see #getExprDecl()
   * @generated
   */
  void setExprDecl(Expression value);

  /**
   * Returns the value of the '<em><b>Expr Let</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Let</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Let</em>' containment reference.
   * @see #setExprLet(Expression)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getName_ExprLet()
   * @model containment="true"
   * @generated
   */
  Expression getExprLet();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Name#getExprLet <em>Expr Let</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Let</em>' containment reference.
   * @see #getExprLet()
   * @generated
   */
  void setExprLet(Expression value);

  /**
   * Returns the value of the '<em><b>This</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>This</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>This</em>' attribute.
   * @see #setThis(String)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getName_This()
   * @model
   * @generated
   */
  String getThis();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Name#getThis <em>This</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>This</em>' attribute.
   * @see #getThis()
   * @generated
   */
  void setThis(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getName_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Name#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Name Complete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Complete</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Complete</em>' containment reference.
   * @see #setNameComplete(NameBis)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getName_NameComplete()
   * @model containment="true"
   * @generated
   */
  NameBis getNameComplete();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Name#getNameComplete <em>Name Complete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Complete</em>' containment reference.
   * @see #getNameComplete()
   * @generated
   */
  void setNameComplete(NameBis value);

} // Name
