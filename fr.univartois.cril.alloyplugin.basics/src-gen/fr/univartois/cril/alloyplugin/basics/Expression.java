/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Expression#getTerm <em>Term</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Expression#getExprT <em>Expr T</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Expression#getOp <em>Op</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Expression#getRight <em>Right</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Expression#getArrowOp <em>Arrow Op</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Expression#getDecl <em>Decl</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Expression#getB <em>B</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Expression#getT <em>T</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Expression#getNameRef <em>Name Ref</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Expression#getBlockOrBar <em>Block Or Bar</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends BlockOrBar, BlockOrBarBis
{
  /**
   * Returns the value of the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' containment reference.
   * @see #setTerm(Expression)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getExpression_Term()
   * @model containment="true"
   * @generated
   */
  Expression getTerm();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Expression#getTerm <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' containment reference.
   * @see #getTerm()
   * @generated
   */
  void setTerm(Expression value);

  /**
   * Returns the value of the '<em><b>Expr T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr T</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr T</em>' containment reference.
   * @see #setExprT(Expression)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getExpression_ExprT()
   * @model containment="true"
   * @generated
   */
  Expression getExprT();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Expression#getExprT <em>Expr T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr T</em>' containment reference.
   * @see #getExprT()
   * @generated
   */
  void setExprT(Expression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getExpression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Expression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getExpression_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Expression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

  /**
   * Returns the value of the '<em><b>Arrow Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arrow Op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arrow Op</em>' containment reference.
   * @see #setArrowOp(ArrowOp)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getExpression_ArrowOp()
   * @model containment="true"
   * @generated
   */
  ArrowOp getArrowOp();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Expression#getArrowOp <em>Arrow Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arrow Op</em>' containment reference.
   * @see #getArrowOp()
   * @generated
   */
  void setArrowOp(ArrowOp value);

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
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getExpression_Decl()
   * @model containment="true"
   * @generated
   */
  Decl getDecl();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Expression#getDecl <em>Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decl</em>' containment reference.
   * @see #getDecl()
   * @generated
   */
  void setDecl(Decl value);

  /**
   * Returns the value of the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' containment reference.
   * @see #setB(BlockOrBarBis)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getExpression_B()
   * @model containment="true"
   * @generated
   */
  BlockOrBarBis getB();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Expression#getB <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B</em>' containment reference.
   * @see #getB()
   * @generated
   */
  void setB(BlockOrBarBis value);

  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference.
   * @see #setT(Expression)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getExpression_T()
   * @model containment="true"
   * @generated
   */
  Expression getT();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Expression#getT <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' containment reference.
   * @see #getT()
   * @generated
   */
  void setT(Expression value);

  /**
   * Returns the value of the '<em><b>Name Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Ref</em>' reference.
   * @see #setNameRef(Name)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getExpression_NameRef()
   * @model
   * @generated
   */
  Name getNameRef();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Expression#getNameRef <em>Name Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Ref</em>' reference.
   * @see #getNameRef()
   * @generated
   */
  void setNameRef(Name value);

  /**
   * Returns the value of the '<em><b>Block Or Bar</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block Or Bar</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block Or Bar</em>' containment reference.
   * @see #setBlockOrBar(BlockOrBar)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getExpression_BlockOrBar()
   * @model containment="true"
   * @generated
   */
  BlockOrBar getBlockOrBar();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Expression#getBlockOrBar <em>Block Or Bar</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block Or Bar</em>' containment reference.
   * @see #getBlockOrBar()
   * @generated
   */
  void setBlockOrBar(BlockOrBar value);

} // Expression
