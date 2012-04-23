/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext2.als;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext2.als.Fact#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Fact#getName <em>Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Fact#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.xtext2.als.AlsPackage#getFact()
 * @model
 * @generated
 */
public interface Fact extends Paragraph
{
  /**
   * Returns the value of the '<em><b>Documentation</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Documentation</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Documentation</em>' attribute list.
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getFact_Documentation()
   * @model unique="false"
   * @generated
   */
  EList<String> getDocumentation();

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(FactName)
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getFact_Name()
   * @model containment="true"
   * @generated
   */
  FactName getName();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.Fact#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(FactName value);

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
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getFact_Block()
   * @model containment="true"
   * @generated
   */
  Block getBlock();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.Fact#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(Block value);

} // Fact
