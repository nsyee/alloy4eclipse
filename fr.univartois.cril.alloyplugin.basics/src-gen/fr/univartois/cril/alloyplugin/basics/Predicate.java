/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Predicate#getPred <em>Pred</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Predicate#getRef <em>Ref</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Predicate#getPredName <em>Pred Name</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Predicate#getDecl <em>Decl</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Predicate#getDecl2 <em>Decl2</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.Predicate#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getPredicate()
 * @model
 * @generated
 */
public interface Predicate extends Paragraph
{
  /**
   * Returns the value of the '<em><b>Pred</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pred</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred</em>' attribute.
   * @see #setPred(String)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getPredicate_Pred()
   * @model
   * @generated
   */
  String getPred();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Predicate#getPred <em>Pred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pred</em>' attribute.
   * @see #getPred()
   * @generated
   */
  void setPred(String value);

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
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getPredicate_Ref()
   * @model containment="true"
   * @generated
   */
  Ref getRef();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Predicate#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Ref value);

  /**
   * Returns the value of the '<em><b>Pred Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pred Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred Name</em>' containment reference.
   * @see #setPredName(Name)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getPredicate_PredName()
   * @model containment="true"
   * @generated
   */
  Name getPredName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Predicate#getPredName <em>Pred Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pred Name</em>' containment reference.
   * @see #getPredName()
   * @generated
   */
  void setPredName(Name value);

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
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getPredicate_Decl()
   * @model containment="true"
   * @generated
   */
  Decl getDecl();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Predicate#getDecl <em>Decl</em>}' containment reference.
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
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getPredicate_Decl2()
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
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getPredicate_B()
   * @model containment="true"
   * @generated
   */
  BlockBis getB();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.Predicate#getB <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B</em>' containment reference.
   * @see #getB()
   * @generated
   */
  void setB(BlockBis value);

} // Predicate
