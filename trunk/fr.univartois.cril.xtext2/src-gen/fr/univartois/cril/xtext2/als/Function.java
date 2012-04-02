/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext2.als;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext2.als.Function#getRef <em>Ref</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Function#getDot <em>Dot</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Function#getName <em>Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Function#getLeftS <em>Left S</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Function#getDecl <em>Decl</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Function#getComma <em>Comma</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Function#getRightS <em>Right S</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Function#getLeftP <em>Left P</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Function#getRightP <em>Right P</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Function#getColon <em>Colon</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Function#getExpr <em>Expr</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Function#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.xtext2.als.AlsPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Paragraph
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
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getFunction_Ref()
   * @model containment="true"
   * @generated
   */
  Ref getRef();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.Function#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Ref value);

  /**
   * Returns the value of the '<em><b>Dot</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dot</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dot</em>' containment reference.
   * @see #setDot(Dot)
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getFunction_Dot()
   * @model containment="true"
   * @generated
   */
  Dot getDot();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.Function#getDot <em>Dot</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dot</em>' containment reference.
   * @see #getDot()
   * @generated
   */
  void setDot(Dot value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(ReferencesName)
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getFunction_Name()
   * @model containment="true"
   * @generated
   */
  ReferencesName getName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.Function#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(ReferencesName value);

  /**
   * Returns the value of the '<em><b>Left S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left S</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left S</em>' containment reference.
   * @see #setLeftS(LeftSquareBracketKeyword)
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getFunction_LeftS()
   * @model containment="true"
   * @generated
   */
  LeftSquareBracketKeyword getLeftS();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.Function#getLeftS <em>Left S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left S</em>' containment reference.
   * @see #getLeftS()
   * @generated
   */
  void setLeftS(LeftSquareBracketKeyword value);

  /**
   * Returns the value of the '<em><b>Decl</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.xtext2.als.Decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decl</em>' containment reference list.
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getFunction_Decl()
   * @model containment="true"
   * @generated
   */
  EList<Decl> getDecl();

  /**
   * Returns the value of the '<em><b>Comma</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.xtext2.als.Comma}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comma</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comma</em>' containment reference list.
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getFunction_Comma()
   * @model containment="true"
   * @generated
   */
  EList<Comma> getComma();

  /**
   * Returns the value of the '<em><b>Right S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right S</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right S</em>' containment reference.
   * @see #setRightS(RightSquareBracketKeyword)
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getFunction_RightS()
   * @model containment="true"
   * @generated
   */
  RightSquareBracketKeyword getRightS();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.Function#getRightS <em>Right S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right S</em>' containment reference.
   * @see #getRightS()
   * @generated
   */
  void setRightS(RightSquareBracketKeyword value);

  /**
   * Returns the value of the '<em><b>Left P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left P</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left P</em>' containment reference.
   * @see #setLeftP(LeftParenthesis)
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getFunction_LeftP()
   * @model containment="true"
   * @generated
   */
  LeftParenthesis getLeftP();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.Function#getLeftP <em>Left P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left P</em>' containment reference.
   * @see #getLeftP()
   * @generated
   */
  void setLeftP(LeftParenthesis value);

  /**
   * Returns the value of the '<em><b>Right P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right P</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right P</em>' containment reference.
   * @see #setRightP(RightParenthesis)
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getFunction_RightP()
   * @model containment="true"
   * @generated
   */
  RightParenthesis getRightP();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.Function#getRightP <em>Right P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right P</em>' containment reference.
   * @see #getRightP()
   * @generated
   */
  void setRightP(RightParenthesis value);

  /**
   * Returns the value of the '<em><b>Colon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Colon</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Colon</em>' containment reference.
   * @see #setColon(Colon)
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getFunction_Colon()
   * @model containment="true"
   * @generated
   */
  Colon getColon();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.Function#getColon <em>Colon</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Colon</em>' containment reference.
   * @see #getColon()
   * @generated
   */
  void setColon(Colon value);

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
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getFunction_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.Function#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(Block)
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getFunction_Block()
   * @model containment="true"
   * @generated
   */
  Block getBlock();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.Function#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(Block value);

} // Function
