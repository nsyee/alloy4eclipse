/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext.als;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.univartois.cril.xtext.als.AlsPackage
 * @generated
 */
public interface AlsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AlsFactory eINSTANCE = fr.univartois.cril.xtext.als.impl.AlsFactoryImpl.init();

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
   * Returns a new object of class '<em>Fact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fact</em>'.
   * @generated
   */
  Fact createFact();

  /**
   * Returns a new object of class '<em>Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assertion</em>'.
   * @generated
   */
  Assertion createAssertion();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns a new object of class '<em>Predicate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate</em>'.
   * @generated
   */
  Predicate createPredicate();

  /**
   * Returns a new object of class '<em>Run Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Run Command</em>'.
   * @generated
   */
  RunCommand createRunCommand();

  /**
   * Returns a new object of class '<em>Check Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Check Command</em>'.
   * @generated
   */
  CheckCommand createCheckCommand();

  /**
   * Returns a new object of class '<em>Scope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scope</em>'.
   * @generated
   */
  Scope createScope();

  /**
   * Returns a new object of class '<em>Expectation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expectation</em>'.
   * @generated
   */
  Expectation createExpectation();

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
   * Returns a new object of class '<em>Let</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Let</em>'.
   * @generated
   */
  Let createLet();

  /**
   * Returns a new object of class '<em>Signature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signature</em>'.
   * @generated
   */
  Signature createSignature();

  /**
   * Returns a new object of class '<em>Sig Qual</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sig Qual</em>'.
   * @generated
   */
  SigQual createSigQual();

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
   * Returns a new object of class '<em>Let Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Let Decl</em>'.
   * @generated
   */
  LetDecl createLetDecl();

  /**
   * Returns a new object of class '<em>Bin Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bin Op</em>'.
   * @generated
   */
  BinOp createBinOp();

  /**
   * Returns a new object of class '<em>Un Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Un Op</em>'.
   * @generated
   */
  UnOp createUnOp();

  /**
   * Returns a new object of class '<em>Common Quant Un Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Common Quant Un Op</em>'.
   * @generated
   */
  CommonQuantUnOp createCommonQuantUnOp();

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
   * Returns a new object of class '<em>Block Or Bar</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Or Bar</em>'.
   * @generated
   */
  BlockOrBar createBlockOrBar();

  /**
   * Returns a new object of class '<em>Open Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Open Name</em>'.
   * @generated
   */
  OpenName createOpenName();

  /**
   * Returns a new object of class '<em>Fact Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fact Name</em>'.
   * @generated
   */
  FactName createFactName();

  /**
   * Returns a new object of class '<em>Assertion Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assertion Name</em>'.
   * @generated
   */
  AssertionName createAssertionName();

  /**
   * Returns a new object of class '<em>Function Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Name</em>'.
   * @generated
   */
  FunctionName createFunctionName();

  /**
   * Returns a new object of class '<em>Function Namew Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Namew Param</em>'.
   * @generated
   */
  FunctionNamewParam createFunctionNamewParam();

  /**
   * Returns a new object of class '<em>Predicate Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate Name</em>'.
   * @generated
   */
  PredicateName createPredicateName();

  /**
   * Returns a new object of class '<em>Alias</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alias</em>'.
   * @generated
   */
  Alias createAlias();

  /**
   * Returns a new object of class '<em>Enum Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Name</em>'.
   * @generated
   */
  EnumName createEnumName();

  /**
   * Returns a new object of class '<em>Enum Property Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Property Name</em>'.
   * @generated
   */
  EnumPropertyName createEnumPropertyName();

  /**
   * Returns a new object of class '<em>Let Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Let Name</em>'.
   * @generated
   */
  LetName createLetName();

  /**
   * Returns a new object of class '<em>Signature Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signature Name</em>'.
   * @generated
   */
  SignatureName createSignatureName();

  /**
   * Returns a new object of class '<em>Property Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Name</em>'.
   * @generated
   */
  PropertyName createPropertyName();

  /**
   * Returns a new object of class '<em>Exactly Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exactly Name</em>'.
   * @generated
   */
  ExactlyName createExactlyName();

  /**
   * Returns a new object of class '<em>As Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>As Name</em>'.
   * @generated
   */
  AsName createAsName();

  /**
   * Returns a new object of class '<em>References Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>References Name</em>'.
   * @generated
   */
  ReferencesName createReferencesName();

  /**
   * Returns a new object of class '<em>References Sig</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>References Sig</em>'.
   * @generated
   */
  ReferencesSig createReferencesSig();

  /**
   * Returns a new object of class '<em>Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref</em>'.
   * @generated
   */
  Ref createRef();

  /**
   * Returns a new object of class '<em>Left Curly Bracket</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Left Curly Bracket</em>'.
   * @generated
   */
  LeftCurlyBracket createLeftCurlyBracket();

  /**
   * Returns a new object of class '<em>Right Curly Bracket</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Right Curly Bracket</em>'.
   * @generated
   */
  RightCurlyBracket createRightCurlyBracket();

  /**
   * Returns a new object of class '<em>Dot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dot</em>'.
   * @generated
   */
  Dot createDot();

  /**
   * Returns a new object of class '<em>Comma</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comma</em>'.
   * @generated
   */
  Comma createComma();

  /**
   * Returns a new object of class '<em>Colon</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Colon</em>'.
   * @generated
   */
  Colon createColon();

  /**
   * Returns a new object of class '<em>Left Parenthesis</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Left Parenthesis</em>'.
   * @generated
   */
  LeftParenthesis createLeftParenthesis();

  /**
   * Returns a new object of class '<em>Right Parenthesis</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Right Parenthesis</em>'.
   * @generated
   */
  RightParenthesis createRightParenthesis();

  /**
   * Returns a new object of class '<em>Left Square Bracket Keyword</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Left Square Bracket Keyword</em>'.
   * @generated
   */
  LeftSquareBracketKeyword createLeftSquareBracketKeyword();

  /**
   * Returns a new object of class '<em>Right Square Bracket Keyword</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Right Square Bracket Keyword</em>'.
   * @generated
   */
  RightSquareBracketKeyword createRightSquareBracketKeyword();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AlsPackage getAlsPackage();

} //AlsFactory
