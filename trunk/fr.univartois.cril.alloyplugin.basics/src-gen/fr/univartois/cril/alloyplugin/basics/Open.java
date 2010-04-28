/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics;

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
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Open#getName <em>Name</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Open#getRef <em>Ref</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Open#getRef2 <em>Ref2</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Open#getName2 <em>Name2</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getOpen()
 * @model
 * @generated
 */
public interface Open extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Name)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getOpen_Name()
   * @model containment="true"
   * @generated
   */
  Name getName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Open#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Name value);

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
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getOpen_Ref()
   * @model containment="true"
   * @generated
   */
  Ref getRef();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Open#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Ref value);

  /**
   * Returns the value of the '<em><b>Ref2</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.alloyplugin.basics.Ref}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref2</em>' containment reference list.
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getOpen_Ref2()
   * @model containment="true"
   * @generated
   */
  EList<Ref> getRef2();

  /**
   * Returns the value of the '<em><b>Name2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name2</em>' containment reference.
   * @see #setName2(Name)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getOpen_Name2()
   * @model containment="true"
   * @generated
   */
  Name getName2();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Open#getName2 <em>Name2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name2</em>' containment reference.
   * @see #getName2()
   * @generated
   */
  void setName2(Name value);

} // Open
