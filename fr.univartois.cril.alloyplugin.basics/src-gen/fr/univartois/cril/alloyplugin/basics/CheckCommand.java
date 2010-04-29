/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.CheckCommand#getCheckName <em>Check Name</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.CheckCommand#getCheck <em>Check</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.CheckCommand#getName2 <em>Name2</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.CheckCommand#getB <em>B</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.CheckCommand#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getCheckCommand()
 * @model
 * @generated
 */
public interface CheckCommand extends Paragraph
{
  /**
   * Returns the value of the '<em><b>Check Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Check Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Check Name</em>' containment reference.
   * @see #setCheckName(Name)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getCheckCommand_CheckName()
   * @model containment="true"
   * @generated
   */
  Name getCheckName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.CheckCommand#getCheckName <em>Check Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Check Name</em>' containment reference.
   * @see #getCheckName()
   * @generated
   */
  void setCheckName(Name value);

  /**
   * Returns the value of the '<em><b>Check</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Check</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Check</em>' attribute.
   * @see #setCheck(String)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getCheckCommand_Check()
   * @model
   * @generated
   */
  String getCheck();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.CheckCommand#getCheck <em>Check</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Check</em>' attribute.
   * @see #getCheck()
   * @generated
   */
  void setCheck(String value);

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
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getCheckCommand_Name2()
   * @model
   * @generated
   */
  Name getName2();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.CheckCommand#getName2 <em>Name2</em>}' reference.
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
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getCheckCommand_B()
   * @model containment="true"
   * @generated
   */
  BlockBis getB();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.CheckCommand#getB <em>B</em>}' containment reference.
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
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getCheckCommand_Scope()
   * @model containment="true"
   * @generated
   */
  Scope getScope();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.CheckCommand#getScope <em>Scope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scope</em>' containment reference.
   * @see #getScope()
   * @generated
   */
  void setScope(Scope value);

} // CheckCommand
