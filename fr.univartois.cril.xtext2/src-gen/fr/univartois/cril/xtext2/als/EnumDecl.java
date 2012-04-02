/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext2.als;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext2.als.EnumDecl#getEnumName <em>Enum Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.EnumDecl#getLeftC <em>Left C</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.EnumDecl#getPropertyEnum <em>Property Enum</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.EnumDecl#getComma <em>Comma</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.EnumDecl#getRightC <em>Right C</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.xtext2.als.AlsPackage#getEnumDecl()
 * @model
 * @generated
 */
public interface EnumDecl extends Paragraph
{
  /**
   * Returns the value of the '<em><b>Enum Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Name</em>' containment reference.
   * @see #setEnumName(EnumName)
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getEnumDecl_EnumName()
   * @model containment="true"
   * @generated
   */
  EnumName getEnumName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.EnumDecl#getEnumName <em>Enum Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum Name</em>' containment reference.
   * @see #getEnumName()
   * @generated
   */
  void setEnumName(EnumName value);

  /**
   * Returns the value of the '<em><b>Left C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left C</em>' containment reference.
   * @see #setLeftC(LeftCurlyBracket)
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getEnumDecl_LeftC()
   * @model containment="true"
   * @generated
   */
  LeftCurlyBracket getLeftC();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.EnumDecl#getLeftC <em>Left C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left C</em>' containment reference.
   * @see #getLeftC()
   * @generated
   */
  void setLeftC(LeftCurlyBracket value);

  /**
   * Returns the value of the '<em><b>Property Enum</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.xtext2.als.EnumPropertyName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Enum</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Enum</em>' containment reference list.
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getEnumDecl_PropertyEnum()
   * @model containment="true"
   * @generated
   */
  EList<EnumPropertyName> getPropertyEnum();

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
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getEnumDecl_Comma()
   * @model containment="true"
   * @generated
   */
  EList<Comma> getComma();

  /**
   * Returns the value of the '<em><b>Right C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right C</em>' containment reference.
   * @see #setRightC(RightCurlyBracket)
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getEnumDecl_RightC()
   * @model containment="true"
   * @generated
   */
  RightCurlyBracket getRightC();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.EnumDecl#getRightC <em>Right C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right C</em>' containment reference.
   * @see #getRightC()
   * @generated
   */
  void setRightC(RightCurlyBracket value);

} // EnumDecl
