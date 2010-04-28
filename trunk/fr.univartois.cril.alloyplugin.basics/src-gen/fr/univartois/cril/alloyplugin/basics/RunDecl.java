/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.RunDecl#getRunName <em>Run Name</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.RunDecl#getRun <em>Run</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.RunDecl#getName2 <em>Name2</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.RunDecl#getB <em>B</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.RunDecl#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getRunDecl()
 * @model
 * @generated
 */
public interface RunDecl extends Paragraph
{
  /**
   * Returns the value of the '<em><b>Run Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Run Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Run Name</em>' containment reference.
   * @see #setRunName(Name)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getRunDecl_RunName()
   * @model containment="true"
   * @generated
   */
  Name getRunName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.RunDecl#getRunName <em>Run Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Run Name</em>' containment reference.
   * @see #getRunName()
   * @generated
   */
  void setRunName(Name value);

  /**
   * Returns the value of the '<em><b>Run</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Run</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Run</em>' attribute.
   * @see #setRun(String)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getRunDecl_Run()
   * @model
   * @generated
   */
  String getRun();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.RunDecl#getRun <em>Run</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Run</em>' attribute.
   * @see #getRun()
   * @generated
   */
  void setRun(String value);

  /**
   * Returns the value of the '<em><b>Name2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name2</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name2</em>' reference.
   * @see #setName2(Name)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getRunDecl_Name2()
   * @model
   * @generated
   */
  Name getName2();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.RunDecl#getName2 <em>Name2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name2</em>' reference.
   * @see #getName2()
   * @generated
   */
  void setName2(Name value);

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
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getRunDecl_B()
   * @model containment="true"
   * @generated
   */
  BlockBis getB();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.RunDecl#getB <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B</em>' containment reference.
   * @see #getB()
   * @generated
   */
  void setB(BlockBis value);

  /**
   * Returns the value of the '<em><b>Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scope</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scope</em>' containment reference.
   * @see #setScope(Scope)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getRunDecl_Scope()
   * @model containment="true"
   * @generated
   */
  Scope getScope();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.RunDecl#getScope <em>Scope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scope</em>' containment reference.
   * @see #getScope()
   * @generated
   */
  void setScope(Scope value);

} // RunDecl
