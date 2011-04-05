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
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getBinOp <em>Bin Op</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getExpr <em>Expr</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getArrowOp <em>Arrow Op</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getCmp <em>Cmp</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getComma <em>Comma</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getRight <em>Right</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getLet <em>Let</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getLetdecl <em>Letdecl</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getBlockOrBar <em>Block Or Bar</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getQuant <em>Quant</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getDecl <em>Decl</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getUnOp <em>Un Op</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getCommon <em>Common</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getNone <em>None</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getIden <em>Iden</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getUniv <em>Univ</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getInt <em>Int</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getSeq <em>Seq</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getParO <em>Par O</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getParF <em>Par F</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getNameRef <em>Name Ref</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getBlock <em>Block</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getLeftCurlyBracket <em>Left Curly Bracket</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Expression#getRightCurlyBracket <em>Right Curly Bracket</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Bin Op</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.xtext.als.BinOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bin Op</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bin Op</em>' containment reference list.
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_BinOp()
   * @model containment="true"
   * @generated
   */
  EList<BinOp> getBinOp();

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
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_Expr()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpr();

  /**
   * Returns the value of the '<em><b>Arrow Op</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.xtext.als.ArrowOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arrow Op</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arrow Op</em>' containment reference list.
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_ArrowOp()
   * @model containment="true"
   * @generated
   */
  EList<ArrowOp> getArrowOp();

  /**
   * Returns the value of the '<em><b>Cmp</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cmp</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmp</em>' attribute list.
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_Cmp()
   * @model unique="false"
   * @generated
   */
  EList<String> getCmp();

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.xtext.als.LeftSquareBracketKeyword}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference list.
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_Left()
   * @model containment="true"
   * @generated
   */
  EList<LeftSquareBracketKeyword> getLeft();

  /**
   * Returns the value of the '<em><b>Comma</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.xtext.als.Comma}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comma</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comma</em>' containment reference list.
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_Comma()
   * @model containment="true"
   * @generated
   */
  EList<Comma> getComma();

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.xtext.als.RightSquareBracketKeyword}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference list.
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_Right()
   * @model containment="true"
   * @generated
   */
  EList<RightSquareBracketKeyword> getRight();

  /**
   * Returns the value of the '<em><b>Let</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Let</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Let</em>' attribute.
   * @see #setLet(String)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_Let()
   * @model
   * @generated
   */
  String getLet();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Expression#getLet <em>Let</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Let</em>' attribute.
   * @see #getLet()
   * @generated
   */
  void setLet(String value);

  /**
   * Returns the value of the '<em><b>Letdecl</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.xtext.als.LetDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Letdecl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Letdecl</em>' containment reference list.
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_Letdecl()
   * @model containment="true"
   * @generated
   */
  EList<LetDecl> getLetdecl();

  /**
   * Returns the value of the '<em><b>Block Or Bar</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.xtext.als.BlockOrBar}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block Or Bar</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block Or Bar</em>' containment reference list.
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_BlockOrBar()
   * @model containment="true"
   * @generated
   */
  EList<BlockOrBar> getBlockOrBar();

  /**
   * Returns the value of the '<em><b>Quant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quant</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quant</em>' attribute.
   * @see #setQuant(String)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_Quant()
   * @model
   * @generated
   */
  String getQuant();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Expression#getQuant <em>Quant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quant</em>' attribute.
   * @see #getQuant()
   * @generated
   */
  void setQuant(String value);

  /**
   * Returns the value of the '<em><b>Decl</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.xtext.als.Decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decl</em>' containment reference list.
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_Decl()
   * @model containment="true"
   * @generated
   */
  EList<Decl> getDecl();

  /**
   * Returns the value of the '<em><b>Un Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Un Op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Un Op</em>' containment reference.
   * @see #setUnOp(UnOp)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_UnOp()
   * @model containment="true"
   * @generated
   */
  UnOp getUnOp();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Expression#getUnOp <em>Un Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Un Op</em>' containment reference.
   * @see #getUnOp()
   * @generated
   */
  void setUnOp(UnOp value);

  /**
   * Returns the value of the '<em><b>Common</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.xtext.als.CommonQuantUnOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Common</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Common</em>' containment reference list.
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_Common()
   * @model containment="true"
   * @generated
   */
  EList<CommonQuantUnOp> getCommon();

  /**
   * Returns the value of the '<em><b>None</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>None</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>None</em>' attribute.
   * @see #setNone(String)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_None()
   * @model
   * @generated
   */
  String getNone();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Expression#getNone <em>None</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>None</em>' attribute.
   * @see #getNone()
   * @generated
   */
  void setNone(String value);

  /**
   * Returns the value of the '<em><b>Iden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iden</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iden</em>' attribute.
   * @see #setIden(String)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_Iden()
   * @model
   * @generated
   */
  String getIden();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Expression#getIden <em>Iden</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iden</em>' attribute.
   * @see #getIden()
   * @generated
   */
  void setIden(String value);

  /**
   * Returns the value of the '<em><b>Univ</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Univ</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Univ</em>' attribute.
   * @see #setUniv(String)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_Univ()
   * @model
   * @generated
   */
  String getUniv();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Expression#getUniv <em>Univ</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Univ</em>' attribute.
   * @see #getUniv()
   * @generated
   */
  void setUniv(String value);

  /**
   * Returns the value of the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int</em>' attribute.
   * @see #setInt(String)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_Int()
   * @model
   * @generated
   */
  String getInt();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Expression#getInt <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int</em>' attribute.
   * @see #getInt()
   * @generated
   */
  void setInt(String value);

  /**
   * Returns the value of the '<em><b>Seq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Seq</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Seq</em>' attribute.
   * @see #setSeq(String)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_Seq()
   * @model
   * @generated
   */
  String getSeq();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Expression#getSeq <em>Seq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Seq</em>' attribute.
   * @see #getSeq()
   * @generated
   */
  void setSeq(String value);

  /**
   * Returns the value of the '<em><b>Par O</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par O</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par O</em>' attribute.
   * @see #setParO(String)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_ParO()
   * @model
   * @generated
   */
  String getParO();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Expression#getParO <em>Par O</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Par O</em>' attribute.
   * @see #getParO()
   * @generated
   */
  void setParO(String value);

  /**
   * Returns the value of the '<em><b>Par F</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par F</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par F</em>' attribute.
   * @see #setParF(String)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_ParF()
   * @model
   * @generated
   */
  String getParF();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Expression#getParF <em>Par F</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Par F</em>' attribute.
   * @see #getParF()
   * @generated
   */
  void setParF(String value);

  /**
   * Returns the value of the '<em><b>Name Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Ref</em>' reference.
   * @see #setNameRef(ReferencesName)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_NameRef()
   * @model
   * @generated
   */
  ReferencesName getNameRef();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Expression#getNameRef <em>Name Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Ref</em>' reference.
   * @see #getNameRef()
   * @generated
   */
  void setNameRef(ReferencesName value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.xtext.als.Block}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference list.
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_Block()
   * @model containment="true"
   * @generated
   */
  EList<Block> getBlock();

  /**
   * Returns the value of the '<em><b>Left Curly Bracket</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Curly Bracket</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Curly Bracket</em>' containment reference.
   * @see #setLeftCurlyBracket(LeftCurlyBracket)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_LeftCurlyBracket()
   * @model containment="true"
   * @generated
   */
  LeftCurlyBracket getLeftCurlyBracket();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Expression#getLeftCurlyBracket <em>Left Curly Bracket</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Curly Bracket</em>' containment reference.
   * @see #getLeftCurlyBracket()
   * @generated
   */
  void setLeftCurlyBracket(LeftCurlyBracket value);

  /**
   * Returns the value of the '<em><b>Right Curly Bracket</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Curly Bracket</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Curly Bracket</em>' containment reference.
   * @see #setRightCurlyBracket(RightCurlyBracket)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getExpression_RightCurlyBracket()
   * @model containment="true"
   * @generated
   */
  RightCurlyBracket getRightCurlyBracket();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Expression#getRightCurlyBracket <em>Right Curly Bracket</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Curly Bracket</em>' containment reference.
   * @see #getRightCurlyBracket()
   * @generated
   */
  void setRightCurlyBracket(RightCurlyBracket value);

} // Expression
