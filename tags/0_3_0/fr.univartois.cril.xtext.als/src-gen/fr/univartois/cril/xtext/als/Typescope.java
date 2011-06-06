/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext.als;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typescope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.Typescope#getExactly <em>Exactly</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Typescope#getValue <em>Value</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Typescope#getAsname <em>Asname</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Typescope#getPrev <em>Prev</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Typescope#getSl <em>Sl</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Typescope#getName <em>Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.Typescope#getPost <em>Post</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.xtext.als.AlsPackage#getTypescope()
 * @model
 * @generated
 */
public interface Typescope extends EObject
{
  /**
   * Returns the value of the '<em><b>Exactly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exactly</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exactly</em>' attribute.
   * @see #setExactly(String)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getTypescope_Exactly()
   * @model
   * @generated
   */
  String getExactly();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Typescope#getExactly <em>Exactly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exactly</em>' attribute.
   * @see #getExactly()
   * @generated
   */
  void setExactly(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getTypescope_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Typescope#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Asname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Asname</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asname</em>' containment reference.
   * @see #setAsname(AsName)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getTypescope_Asname()
   * @model containment="true"
   * @generated
   */
  AsName getAsname();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Typescope#getAsname <em>Asname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asname</em>' containment reference.
   * @see #getAsname()
   * @generated
   */
  void setAsname(AsName value);

  /**
   * Returns the value of the '<em><b>Prev</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prev</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prev</em>' attribute.
   * @see #setPrev(String)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getTypescope_Prev()
   * @model
   * @generated
   */
  String getPrev();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Typescope#getPrev <em>Prev</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prev</em>' attribute.
   * @see #getPrev()
   * @generated
   */
  void setPrev(String value);

  /**
   * Returns the value of the '<em><b>Sl</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sl</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sl</em>' attribute.
   * @see #setSl(String)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getTypescope_Sl()
   * @model
   * @generated
   */
  String getSl();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Typescope#getSl <em>Sl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sl</em>' attribute.
   * @see #getSl()
   * @generated
   */
  void setSl(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(ReferencesName)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getTypescope_Name()
   * @model
   * @generated
   */
  ReferencesName getName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Typescope#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(ReferencesName value);

  /**
   * Returns the value of the '<em><b>Post</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Post</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post</em>' attribute.
   * @see #setPost(String)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getTypescope_Post()
   * @model
   * @generated
   */
  String getPost();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.Typescope#getPost <em>Post</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Post</em>' attribute.
   * @see #getPost()
   * @generated
   */
  void setPost(String value);

} // Typescope
