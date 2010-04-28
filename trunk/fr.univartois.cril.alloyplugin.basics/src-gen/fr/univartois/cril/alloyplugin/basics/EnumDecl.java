/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.EnumDecl#getEnumName <em>Enum Name</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.EnumDecl#getName2 <em>Name2</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.EnumDecl#getName3 <em>Name3</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getEnumDecl()
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
   * @see #setEnumName(Name)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getEnumDecl_EnumName()
   * @model containment="true"
   * @generated
   */
  Name getEnumName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.EnumDecl#getEnumName <em>Enum Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum Name</em>' containment reference.
   * @see #getEnumName()
   * @generated
   */
  void setEnumName(Name value);

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
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getEnumDecl_Name2()
   * @model containment="true"
   * @generated
   */
  Name getName2();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.EnumDecl#getName2 <em>Name2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name2</em>' containment reference.
   * @see #getName2()
   * @generated
   */
  void setName2(Name value);

  /**
   * Returns the value of the '<em><b>Name3</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.alloyplugin.basics.Name}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name3</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name3</em>' containment reference list.
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getEnumDecl_Name3()
   * @model containment="true"
   * @generated
   */
  EList<Name> getName3();

} // EnumDecl
