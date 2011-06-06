/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext.als;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.Signature#getSignatureName <em>Signature Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Signature#getComma <em>Comma</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Signature#getSigExt <em>Sig Ext</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Signature#getDecl <em>Decl</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Signature#getComma2 <em>Comma2</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Signature#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.xtext.als.AlsPackage#getSignature()
 * @model
 * @generated
 */
public interface Signature extends Paragraph
{
  /**
   * Returns the value of the '<em><b>Signature Name</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.xtext.als.SignatureName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature Name</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature Name</em>' containment reference list.
   * @see fr.univartois.cril.xtext.als.AlsPackage#getSignature_SignatureName()
   * @model containment="true"
   * @generated
   */
  EList<SignatureName> getSignatureName();

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
   * @see fr.univartois.cril.xtext.als.AlsPackage#getSignature_Comma()
   * @model containment="true"
   * @generated
   */
  EList<Comma> getComma();

  /**
   * Returns the value of the '<em><b>Sig Ext</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sig Ext</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sig Ext</em>' containment reference.
   * @see #setSigExt(SigExt)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getSignature_SigExt()
   * @model containment="true"
   * @generated
   */
  SigExt getSigExt();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Signature#getSigExt <em>Sig Ext</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sig Ext</em>' containment reference.
   * @see #getSigExt()
   * @generated
   */
  void setSigExt(SigExt value);

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
   * @see fr.univartois.cril.xtext.als.AlsPackage#getSignature_Decl()
   * @model containment="true"
   * @generated
   */
  EList<Decl> getDecl();

  /**
   * Returns the value of the '<em><b>Comma2</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comma2</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comma2</em>' attribute list.
   * @see fr.univartois.cril.xtext.als.AlsPackage#getSignature_Comma2()
   * @model unique="false"
   * @generated
   */
  EList<String> getComma2();

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
   * @see fr.univartois.cril.xtext.als.AlsPackage#getSignature_Block()
   * @model containment="true"
   * @generated
   */
  Block getBlock();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Signature#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(Block value);

} // Signature
