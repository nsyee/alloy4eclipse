/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext.als;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.Let#getLetName <em>Let Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Let#getLeftS <em>Left S</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Let#getNameRef <em>Name Ref</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Let#getComma <em>Comma</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Let#getRightS <em>Right S</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Let#getBlock <em>Block</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Let#getExprName <em>Expr Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.xtext.als.AlsPackage#getLet()
 * @model
 * @generated
 */
public interface Let extends Paragraph
{
  /**
   * Returns the value of the '<em><b>Let Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Let Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Let Name</em>' containment reference.
   * @see #setLetName(LetName)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getLet_LetName()
   * @model containment="true"
   * @generated
   */
  LetName getLetName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Let#getLetName <em>Let Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Let Name</em>' containment reference.
   * @see #getLetName()
   * @generated
   */
  void setLetName(LetName value);

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
   * @see fr.univartois.cril.xtext.als.AlsPackage#getLet_LeftS()
   * @model containment="true"
   * @generated
   */
  LeftSquareBracketKeyword getLeftS();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Let#getLeftS <em>Left S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left S</em>' containment reference.
   * @see #getLeftS()
   * @generated
   */
  void setLeftS(LeftSquareBracketKeyword value);

  /**
   * Returns the value of the '<em><b>Name Ref</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.xtext.als.ReferencesName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Ref</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Ref</em>' containment reference list.
   * @see fr.univartois.cril.xtext.als.AlsPackage#getLet_NameRef()
   * @model containment="true"
   * @generated
   */
  EList<ReferencesName> getNameRef();

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
   * @see fr.univartois.cril.xtext.als.AlsPackage#getLet_Comma()
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
   * @see fr.univartois.cril.xtext.als.AlsPackage#getLet_RightS()
   * @model containment="true"
   * @generated
   */
  RightSquareBracketKeyword getRightS();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Let#getRightS <em>Right S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right S</em>' containment reference.
   * @see #getRightS()
   * @generated
   */
  void setRightS(RightSquareBracketKeyword value);

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
   * @see fr.univartois.cril.xtext.als.AlsPackage#getLet_Block()
   * @model containment="true"
   * @generated
   */
  Block getBlock();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Let#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(Block value);

  /**
   * Returns the value of the '<em><b>Expr Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Name</em>' containment reference.
   * @see #setExprName(Expression)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getLet_ExprName()
   * @model containment="true"
   * @generated
   */
  Expression getExprName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Let#getExprName <em>Expr Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Name</em>' containment reference.
   * @see #getExprName()
   * @generated
   */
  void setExprName(Expression value);

} // Let
