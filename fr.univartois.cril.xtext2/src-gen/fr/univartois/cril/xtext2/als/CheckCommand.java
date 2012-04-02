/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext2.als;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext2.als.CheckCommand#getCheckName <em>Check Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.CheckCommand#getName <em>Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.CheckCommand#getBlock <em>Block</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.CheckCommand#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.xtext2.als.AlsPackage#getCheckCommand()
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
   * @see #setCheckName(Alias)
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getCheckCommand_CheckName()
   * @model containment="true"
   * @generated
   */
  Alias getCheckName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.CheckCommand#getCheckName <em>Check Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Check Name</em>' containment reference.
   * @see #getCheckName()
   * @generated
   */
  void setCheckName(Alias value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(AssertionName)
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getCheckCommand_Name()
   * @model
   * @generated
   */
  AssertionName getName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.CheckCommand#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(AssertionName value);

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
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getCheckCommand_Block()
   * @model containment="true"
   * @generated
   */
  Block getBlock();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.CheckCommand#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(Block value);

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
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getCheckCommand_Scope()
   * @model containment="true"
   * @generated
   */
  Scope getScope();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.CheckCommand#getScope <em>Scope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scope</em>' containment reference.
   * @see #getScope()
   * @generated
   */
  void setScope(Scope value);

} // CheckCommand
