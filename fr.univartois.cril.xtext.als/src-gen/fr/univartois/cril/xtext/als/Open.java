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
 * A representation of the model object '<em><b>Open</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.Open#getOpenName <em>Open Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Open#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Open#getRef <em>Ref</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Open#getComma <em>Comma</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Open#getRight <em>Right</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Open#getNameAs <em>Name As</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.xtext.als.AlsPackage#getOpen()
 * @model
 * @generated
 */
public interface Open extends EObject
{
  /**
   * Returns the value of the '<em><b>Open Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Open Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Open Name</em>' containment reference.
   * @see #setOpenName(OpenName)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getOpen_OpenName()
   * @model containment="true"
   * @generated
   */
  OpenName getOpenName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Open#getOpenName <em>Open Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Open Name</em>' containment reference.
   * @see #getOpenName()
   * @generated
   */
  void setOpenName(OpenName value);

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
   * @see fr.univartois.cril.xtext.als.AlsPackage#getOpen_Left()
   * @model containment="true"
   * @generated
   */
  LeftSquareBracketKeyword getLeft();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Open#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(LeftSquareBracketKeyword value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.xtext.als.Ref}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference list.
   * @see fr.univartois.cril.xtext.als.AlsPackage#getOpen_Ref()
   * @model containment="true"
   * @generated
   */
  EList<Ref> getRef();

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
   * @see fr.univartois.cril.xtext.als.AlsPackage#getOpen_Comma()
   * @model containment="true"
   * @generated
   */
  EList<Comma> getComma();

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
   * @see fr.univartois.cril.xtext.als.AlsPackage#getOpen_Right()
   * @model containment="true"
   * @generated
   */
  RightSquareBracketKeyword getRight();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Open#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(RightSquareBracketKeyword value);

  /**
   * Returns the value of the '<em><b>Name As</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name As</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name As</em>' containment reference.
   * @see #setNameAs(ExactlyName)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getOpen_NameAs()
   * @model containment="true"
   * @generated
   */
  ExactlyName getNameAs();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Open#getNameAs <em>Name As</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name As</em>' containment reference.
   * @see #getNameAs()
   * @generated
   */
  void setNameAs(ExactlyName value);

} // Open
