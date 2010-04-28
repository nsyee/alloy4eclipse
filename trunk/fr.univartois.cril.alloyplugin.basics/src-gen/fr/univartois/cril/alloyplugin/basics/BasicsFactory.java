/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage
 * @generated
 */
public interface BasicsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BasicsFactory eINSTANCE = fr.univartois.cril.alloyplugin.basics.impl.BasicsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Specification</em>'.
   * @generated
   */
  Specification createSpecification();

  /**
   * Returns a new object of class '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module</em>'.
   * @generated
   */
  Module createModule();

  /**
   * Returns a new object of class '<em>Open</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Open</em>'.
   * @generated
   */
  Open createOpen();

  /**
   * Returns a new object of class '<em>Paragraph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Paragraph</em>'.
   * @generated
   */
  Paragraph createParagraph();

  /**
   * Returns a new object of class '<em>Fact Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fact Decl</em>'.
   * @generated
   */
  FactDecl createFactDecl();

  /**
   * Returns a new object of class '<em>Assert Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assert Decl</em>'.
   * @generated
   */
  AssertDecl createAssertDecl();

  /**
   * Returns a new object of class '<em>Fun Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fun Decl</em>'.
   * @generated
   */
  FunDecl createFunDecl();

  /**
   * Returns a new object of class '<em>Pred Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pred Decl</em>'.
   * @generated
   */
  PredDecl createPredDecl();

  /**
   * Returns a new object of class '<em>Run Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Run Decl</em>'.
   * @generated
   */
  RunDecl createRunDecl();

  /**
   * Returns a new object of class '<em>Check Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Check Decl</em>'.
   * @generated
   */
  CheckDecl createCheckDecl();

  /**
   * Returns a new object of class '<em>Scope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scope</em>'.
   * @generated
   */
  Scope createScope();

  /**
   * Returns a new object of class '<em>Typescope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typescope</em>'.
   * @generated
   */
  Typescope createTypescope();

  /**
   * Returns a new object of class '<em>Enum Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Decl</em>'.
   * @generated
   */
  EnumDecl createEnumDecl();

  /**
   * Returns a new object of class '<em>Sig Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sig Decl</em>'.
   * @generated
   */
  SigDecl createSigDecl();

  /**
   * Returns a new object of class '<em>Sig Ext</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sig Ext</em>'.
   * @generated
   */
  SigExt createSigExt();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decl</em>'.
   * @generated
   */
  Decl createDecl();

  /**
   * Returns a new object of class '<em>Decl2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decl2</em>'.
   * @generated
   */
  Decl2 createDecl2();

  /**
   * Returns a new object of class '<em>Let Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Let Decl</em>'.
   * @generated
   */
  LetDecl createLetDecl();

  /**
   * Returns a new object of class '<em>Arrow Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arrow Op</em>'.
   * @generated
   */
  ArrowOp createArrowOp();

  /**
   * Returns a new object of class '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block</em>'.
   * @generated
   */
  Block createBlock();

  /**
   * Returns a new object of class '<em>Block Bis</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Bis</em>'.
   * @generated
   */
  BlockBis createBlockBis();

  /**
   * Returns a new object of class '<em>Block Or Bar</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Or Bar</em>'.
   * @generated
   */
  BlockOrBar createBlockOrBar();

  /**
   * Returns a new object of class '<em>Block Or Bar Bis</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Or Bar Bis</em>'.
   * @generated
   */
  BlockOrBarBis createBlockOrBarBis();

  /**
   * Returns a new object of class '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name</em>'.
   * @generated
   */
  Name createName();

  /**
   * Returns a new object of class '<em>Name Bis</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name Bis</em>'.
   * @generated
   */
  NameBis createNameBis();

  /**
   * Returns a new object of class '<em>Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref</em>'.
   * @generated
   */
  Ref createRef();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BasicsPackage getBasicsPackage();

} //BasicsFactory
