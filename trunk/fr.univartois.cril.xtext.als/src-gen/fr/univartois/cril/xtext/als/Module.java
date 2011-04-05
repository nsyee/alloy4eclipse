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
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.Module#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Module#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Module#getExactly <em>Exactly</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Module#getName <em>Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Module#getComma <em>Comma</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Module#getNumber <em>Number</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Module#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.xtext.als.AlsPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject
{
  /**
   * Returns the value of the '<em><b>Module Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module Name</em>' containment reference.
   * @see #setModuleName(ModuleName)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getModule_ModuleName()
   * @model containment="true"
   * @generated
   */
  ModuleName getModuleName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Module#getModuleName <em>Module Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module Name</em>' containment reference.
   * @see #getModuleName()
   * @generated
   */
  void setModuleName(ModuleName value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(LeftSquareBracketKeyword)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getModule_Left()
   * @model containment="true"
   * @generated
   */
  LeftSquareBracketKeyword getLeft();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Module#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(LeftSquareBracketKeyword value);

  /**
   * Returns the value of the '<em><b>Exactly</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exactly</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exactly</em>' attribute list.
   * @see fr.univartois.cril.xtext.als.AlsPackage#getModule_Exactly()
   * @model unique="false"
   * @generated
   */
  EList<String> getExactly();

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(ExactlyName)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getModule_Name()
   * @model containment="true"
   * @generated
   */
  ExactlyName getName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Module#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(ExactlyName value);

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
   * @see fr.univartois.cril.xtext.als.AlsPackage#getModule_Comma()
   * @model containment="true"
   * @generated
   */
  EList<Comma> getComma();

  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute list.
   * @see fr.univartois.cril.xtext.als.AlsPackage#getModule_Number()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getNumber();

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(RightSquareBracketKeyword)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getModule_Right()
   * @model containment="true"
   * @generated
   */
  RightSquareBracketKeyword getRight();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Module#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(RightSquareBracketKeyword value);

} // Module
