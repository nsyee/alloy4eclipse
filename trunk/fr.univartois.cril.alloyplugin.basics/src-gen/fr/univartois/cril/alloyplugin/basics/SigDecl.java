/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sig Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.SigDecl#getSigName <em>Sig Name</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.SigDecl#getName2 <em>Name2</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.SigDecl#getSigExt <em>Sig Ext</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.SigDecl#getDecl <em>Decl</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.SigDecl#getDecl2 <em>Decl2</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.SigDecl#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getSigDecl()
 * @model
 * @generated
 */
public interface SigDecl extends Paragraph
{
  /**
   * Returns the value of the '<em><b>Sig Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sig Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sig Name</em>' containment reference.
   * @see #setSigName(Name)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getSigDecl_SigName()
   * @model containment="true"
   * @generated
   */
  Name getSigName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.SigDecl#getSigName <em>Sig Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sig Name</em>' containment reference.
   * @see #getSigName()
   * @generated
   */
  void setSigName(Name value);

  /**
   * Returns the value of the '<em><b>Name2</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.alloyplugin.basics.Name}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name2</em>' containment reference list.
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getSigDecl_Name2()
   * @model containment="true"
   * @generated
   */
  EList<Name> getName2();

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
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getSigDecl_SigExt()
   * @model containment="true"
   * @generated
   */
  SigExt getSigExt();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.SigDecl#getSigExt <em>Sig Ext</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sig Ext</em>' containment reference.
   * @see #getSigExt()
   * @generated
   */
  void setSigExt(SigExt value);

  /**
   * Returns the value of the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decl</em>' containment reference.
   * @see #setDecl(Decl)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getSigDecl_Decl()
   * @model containment="true"
   * @generated
   */
  Decl getDecl();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.SigDecl#getDecl <em>Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decl</em>' containment reference.
   * @see #getDecl()
   * @generated
   */
  void setDecl(Decl value);

  /**
   * Returns the value of the '<em><b>Decl2</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.alloyplugin.basics.Decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decl2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decl2</em>' containment reference list.
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getSigDecl_Decl2()
   * @model containment="true"
   * @generated
   */
  EList<Decl> getDecl2();

  /**
   * Returns the value of the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' containment reference.
   * @see #setB(BlockBis)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getSigDecl_B()
   * @model containment="true"
   * @generated
   */
  BlockBis getB();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.SigDecl#getB <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B</em>' containment reference.
   * @see #getB()
   * @generated
   */
  void setB(BlockBis value);

} // SigDecl
