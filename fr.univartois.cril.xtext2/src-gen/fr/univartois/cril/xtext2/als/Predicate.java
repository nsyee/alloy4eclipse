/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext2.als;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext2.als.Predicate#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Predicate#getRef <em>Ref</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Predicate#getDot <em>Dot</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Predicate#getName <em>Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Predicate#getLeftS <em>Left S</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Predicate#getParam <em>Param</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Predicate#getComma <em>Comma</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Predicate#getRightS <em>Right S</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Predicate#getLeftP <em>Left P</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Predicate#getRightP <em>Right P</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Predicate#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.xtext2.als.AlsPackage#getPredicate()
 * @model
 * @generated
 */
public interface Predicate extends Paragraph
{
  /**
   * Returns the value of the '<em><b>Documentation</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Documentation</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Documentation</em>' attribute list.
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getPredicate_Documentation()
   * @model unique="false"
   * @generated
   */
  EList<String> getDocumentation();

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
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getPredicate_Ref()
   * @model containment="true"
   * @generated
   */
  Ref getRef();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.Predicate#getRef <em>Ref</em>}' containment reference.
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
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getPredicate_Dot()
   * @model containment="true"
   * @generated
   */
  Dot getDot();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.Predicate#getDot <em>Dot</em>}' containment reference.
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
   * @see #setName(PredicateName)
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getPredicate_Name()
   * @model containment="true"
   * @generated
   */
  PredicateName getName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.Predicate#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(PredicateName value);

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
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getPredicate_LeftS()
   * @model containment="true"
   * @generated
   */
  LeftSquareBracketKeyword getLeftS();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.Predicate#getLeftS <em>Left S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left S</em>' containment reference.
   * @see #getLeftS()
   * @generated
   */
  void setLeftS(LeftSquareBracketKeyword value);

  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.xtext2.als.Param}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference list.
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getPredicate_Param()
   * @model containment="true"
   * @generated
   */
  EList<Param> getParam();

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
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getPredicate_Comma()
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
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getPredicate_RightS()
   * @model containment="true"
   * @generated
   */
  RightSquareBracketKeyword getRightS();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.Predicate#getRightS <em>Right S</em>}' containment reference.
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
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getPredicate_LeftP()
   * @model containment="true"
   * @generated
   */
  LeftParenthesis getLeftP();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.Predicate#getLeftP <em>Left P</em>}' containment reference.
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
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getPredicate_RightP()
   * @model containment="true"
   * @generated
   */
  RightParenthesis getRightP();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.Predicate#getRightP <em>Right P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right P</em>' containment reference.
   * @see #getRightP()
   * @generated
   */
  void setRightP(RightParenthesis value);

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
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getPredicate_Block()
   * @model containment="true"
   * @generated
   */
  Block getBlock();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.Predicate#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(Block value);

} // Predicate
