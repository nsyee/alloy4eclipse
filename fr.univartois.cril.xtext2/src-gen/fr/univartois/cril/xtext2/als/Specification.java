/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext2.als;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext2.als.Specification#getModule <em>Module</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Specification#getOpen <em>Open</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.Specification#getParagraph <em>Paragraph</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.xtext2.als.AlsPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends EObject
{
  /**
   * Returns the value of the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' containment reference.
   * @see #setModule(Module)
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getSpecification_Module()
   * @model containment="true"
   * @generated
   */
  Module getModule();

  /**
   * Sets the value of the '{@link fr.univartois.cril.xtext2.als.Specification#getModule <em>Module</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module</em>' containment reference.
   * @see #getModule()
   * @generated
   */
  void setModule(Module value);

  /**
   * Returns the value of the '<em><b>Open</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.xtext2.als.Open}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Open</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Open</em>' containment reference list.
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getSpecification_Open()
   * @model containment="true"
   * @generated
   */
  EList<Open> getOpen();

  /**
   * Returns the value of the '<em><b>Paragraph</b></em>' containment reference list.
   * The list contents are of type {@link fr.univartois.cril.xtext2.als.Paragraph}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paragraph</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paragraph</em>' containment reference list.
   * @see fr.univartois.cril.xtext2.als.AlsPackage#getSpecification_Paragraph()
   * @model containment="true"
   * @generated
   */
  EList<Paragraph> getParagraph();

} // Specification
