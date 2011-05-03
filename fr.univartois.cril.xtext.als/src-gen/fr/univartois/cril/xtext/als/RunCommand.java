/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext.als;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.RunCommand#getRunName <em>Run Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.RunCommand#getName2 <em>Name2</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.RunCommand#getBlock <em>Block</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.RunCommand#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.xtext.als.AlsPackage#getRunCommand()
 * @model
 * @generated
 */
public interface RunCommand extends Paragraph
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
   * @see #setRunName(Alias)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getRunCommand_RunName()
   * @model containment="true"
   * @generated
   */
  Alias getRunName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.RunCommand#getRunName <em>Run Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Run Name</em>' containment reference.
   * @see #getRunName()
   * @generated
   */
  void setRunName(Alias value);

  /**
   * Returns the value of the '<em><b>Name2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name2</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name2</em>' reference.
   * @see #setName2(ReferencesName)
   * @see fr.univartois.cril.xtext.als.AlsPackage#getRunCommand_Name2()
   * @model
   * @generated
   */
  ReferencesName getName2();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.RunCommand#getName2 <em>Name2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name2</em>' reference.
   * @see #getName2()
   * @generated
   */
  void setName2(ReferencesName value);

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
   * @see fr.univartois.cril.xtext.als.AlsPackage#getRunCommand_Block()
   * @model containment="true"
   * @generated
   */
  Block getBlock();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.RunCommand#getBlock <em>Block</em>}' containment reference.
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
   * @see fr.univartois.cril.xtext.als.AlsPackage#getRunCommand_Scope()
   * @model containment="true"
   * @generated
   */
  Scope getScope();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext.als.RunCommand#getScope <em>Scope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scope</em>' containment reference.
   * @see #getScope()
   * @generated
   */
  void setScope(Scope value);

} // RunCommand
