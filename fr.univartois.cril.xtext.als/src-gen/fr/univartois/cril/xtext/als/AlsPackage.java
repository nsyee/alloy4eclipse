/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext.als;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.univartois.cril.xtext.als.AlsFactory
 * @model kind="package"
 * @generated
 */
public interface AlsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "als";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.univartois.fr/cril/xtext/Als";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "als";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AlsPackage eINSTANCE = fr.univartois.cril.xtext.als.impl.AlsPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.SpecificationImpl <em>Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.SpecificationImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getSpecification()
   * @generated
   */
  int SPECIFICATION = 0;

  /**
   * The feature id for the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION__MODULE = 0;

  /**
   * The feature id for the '<em><b>Open</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION__OPEN = 1;

  /**
   * The feature id for the '<em><b>Paragraph</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION__PARAGRAPH = 2;

  /**
   * The number of structural features of the '<em>Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.ModuleImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getModule()
   * @generated
   */
  int MODULE = 1;

  /**
   * The feature id for the '<em><b>Module Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__MODULE_NAME = 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__LEFT = 1;

  /**
   * The feature id for the '<em><b>Exactly</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__EXACTLY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = 3;

  /**
   * The feature id for the '<em><b>Comma</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__COMMA = 4;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NUMBER = 5;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__RIGHT = 6;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.OpenImpl <em>Open</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.OpenImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getOpen()
   * @generated
   */
  int OPEN = 2;

  /**
   * The feature id for the '<em><b>Open Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN__OPEN_NAME = 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN__LEFT = 1;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN__REF = 2;

  /**
   * The feature id for the '<em><b>Comma</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN__COMMA = 3;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN__RIGHT = 4;

  /**
   * The feature id for the '<em><b>Name As</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN__NAME_AS = 5;

  /**
   * The number of structural features of the '<em>Open</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.ParagraphImpl <em>Paragraph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.ParagraphImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getParagraph()
   * @generated
   */
  int PARAGRAPH = 3;

  /**
   * The number of structural features of the '<em>Paragraph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAGRAPH_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.FactImpl <em>Fact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.FactImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getFact()
   * @generated
   */
  int FACT = 4;

  /**
   * The feature id for the '<em><b>Fact Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT__FACT_NAME = PARAGRAPH_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT__BLOCK = PARAGRAPH_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Fact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT_FEATURE_COUNT = PARAGRAPH_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.AssertionImpl <em>Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.AssertionImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getAssertion()
   * @generated
   */
  int ASSERTION = 5;

  /**
   * The feature id for the '<em><b>Assertion Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__ASSERTION_NAME = PARAGRAPH_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__BLOCK = PARAGRAPH_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_FEATURE_COUNT = PARAGRAPH_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.FunctionImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 6;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__REF = PARAGRAPH_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dot</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__DOT = PARAGRAPH_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Function Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__FUNCTION_NAME = PARAGRAPH_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Left S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__LEFT_S = PARAGRAPH_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__DECL = PARAGRAPH_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Comma</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__COMMA = PARAGRAPH_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Right S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__RIGHT_S = PARAGRAPH_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Left P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__LEFT_P = PARAGRAPH_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Right P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__RIGHT_P = PARAGRAPH_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Colon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__COLON = PARAGRAPH_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__EXPR = PARAGRAPH_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__BLOCK = PARAGRAPH_FEATURE_COUNT + 11;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = PARAGRAPH_FEATURE_COUNT + 12;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.PredicateImpl <em>Predicate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.PredicateImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getPredicate()
   * @generated
   */
  int PREDICATE = 7;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__REF = PARAGRAPH_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dot</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__DOT = PARAGRAPH_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Predicate Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__PREDICATE_NAME = PARAGRAPH_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Left S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__LEFT_S = PARAGRAPH_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__DECL = PARAGRAPH_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Comma</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__COMMA = PARAGRAPH_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Right S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__RIGHT_S = PARAGRAPH_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Left P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__LEFT_P = PARAGRAPH_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Right P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__RIGHT_P = PARAGRAPH_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__BLOCK = PARAGRAPH_FEATURE_COUNT + 9;

  /**
   * The number of structural features of the '<em>Predicate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_FEATURE_COUNT = PARAGRAPH_FEATURE_COUNT + 10;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.RunCommandImpl <em>Run Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.RunCommandImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getRunCommand()
   * @generated
   */
  int RUN_COMMAND = 8;

  /**
   * The feature id for the '<em><b>Run Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_COMMAND__RUN_NAME = PARAGRAPH_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_COMMAND__NAME2 = PARAGRAPH_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_COMMAND__BLOCK = PARAGRAPH_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_COMMAND__SCOPE = PARAGRAPH_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Run Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_COMMAND_FEATURE_COUNT = PARAGRAPH_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.CheckCommandImpl <em>Check Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.CheckCommandImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getCheckCommand()
   * @generated
   */
  int CHECK_COMMAND = 9;

  /**
   * The feature id for the '<em><b>Check Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_COMMAND__CHECK_NAME = PARAGRAPH_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_COMMAND__NAME = PARAGRAPH_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_COMMAND__BLOCK = PARAGRAPH_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_COMMAND__SCOPE = PARAGRAPH_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Check Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_COMMAND_FEATURE_COUNT = PARAGRAPH_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.ScopeImpl <em>Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.ScopeImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getScope()
   * @generated
   */
  int SCOPE = 10;

  /**
   * The feature id for the '<em><b>Expect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__EXPECT = 0;

  /**
   * The feature id for the '<em><b>Typescope</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__TYPESCOPE = 1;

  /**
   * The feature id for the '<em><b>Comma</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__COMMA = 2;

  /**
   * The number of structural features of the '<em>Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.ExpectationImpl <em>Expectation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.ExpectationImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getExpectation()
   * @generated
   */
  int EXPECTATION = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPECTATION__VALUE = 0;

  /**
   * The number of structural features of the '<em>Expectation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPECTATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.TypescopeImpl <em>Typescope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.TypescopeImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getTypescope()
   * @generated
   */
  int TYPESCOPE = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPESCOPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Typescope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPESCOPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.EnumDeclImpl <em>Enum Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.EnumDeclImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getEnumDecl()
   * @generated
   */
  int ENUM_DECL = 13;

  /**
   * The feature id for the '<em><b>Enum Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL__ENUM_NAME = PARAGRAPH_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Left C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL__LEFT_C = PARAGRAPH_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Property Enum</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL__PROPERTY_ENUM = PARAGRAPH_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Comma</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL__COMMA = PARAGRAPH_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Right C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL__RIGHT_C = PARAGRAPH_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Enum Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL_FEATURE_COUNT = PARAGRAPH_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.SignatureImpl <em>Signature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.SignatureImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getSignature()
   * @generated
   */
  int SIGNATURE = 14;

  /**
   * The feature id for the '<em><b>Signature Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE__SIGNATURE_NAME = PARAGRAPH_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Comma</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE__COMMA = PARAGRAPH_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sig Ext</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE__SIG_EXT = PARAGRAPH_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE__DECL = PARAGRAPH_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Comma2</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE__COMMA2 = PARAGRAPH_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE__BLOCK = PARAGRAPH_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Signature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_FEATURE_COUNT = PARAGRAPH_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.SigQualImpl <em>Sig Qual</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.SigQualImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getSigQual()
   * @generated
   */
  int SIG_QUAL = 15;

  /**
   * The feature id for the '<em><b>Signature Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_QUAL__SIGNATURE_NAME = SIGNATURE__SIGNATURE_NAME;

  /**
   * The feature id for the '<em><b>Comma</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_QUAL__COMMA = SIGNATURE__COMMA;

  /**
   * The feature id for the '<em><b>Sig Ext</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_QUAL__SIG_EXT = SIGNATURE__SIG_EXT;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_QUAL__DECL = SIGNATURE__DECL;

  /**
   * The feature id for the '<em><b>Comma2</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_QUAL__COMMA2 = SIGNATURE__COMMA2;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_QUAL__BLOCK = SIGNATURE__BLOCK;

  /**
   * The feature id for the '<em><b>Sigq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_QUAL__SIGQ = SIGNATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sig Qual</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_QUAL_FEATURE_COUNT = SIGNATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.SigExtImpl <em>Sig Ext</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.SigExtImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getSigExt()
   * @generated
   */
  int SIG_EXT = 16;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_EXT__REF = 0;

  /**
   * The feature id for the '<em><b>Ref2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_EXT__REF2 = 1;

  /**
   * The number of structural features of the '<em>Sig Ext</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_EXT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.ExpressionImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 17;

  /**
   * The feature id for the '<em><b>Bin Op</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__BIN_OP = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXPR = 1;

  /**
   * The feature id for the '<em><b>Arrow Op</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__ARROW_OP = 2;

  /**
   * The feature id for the '<em><b>Cmp</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__CMP = 3;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT = 4;

  /**
   * The feature id for the '<em><b>Comma</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__COMMA = 5;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT = 6;

  /**
   * The feature id for the '<em><b>Let</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LET = 7;

  /**
   * The feature id for the '<em><b>Letdecl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LETDECL = 8;

  /**
   * The feature id for the '<em><b>Block Or Bar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__BLOCK_OR_BAR = 9;

  /**
   * The feature id for the '<em><b>Quant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__QUANT = 10;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__DECL = 11;

  /**
   * The feature id for the '<em><b>Un Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__UN_OP = 12;

  /**
   * The feature id for the '<em><b>Common</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__COMMON = 13;

  /**
   * The feature id for the '<em><b>None</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__NONE = 14;

  /**
   * The feature id for the '<em><b>Iden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__IDEN = 15;

  /**
   * The feature id for the '<em><b>Univ</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__UNIV = 16;

  /**
   * The feature id for the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__INT = 17;

  /**
   * The feature id for the '<em><b>Seq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__SEQ = 18;

  /**
   * The feature id for the '<em><b>Par O</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__PAR_O = 19;

  /**
   * The feature id for the '<em><b>Par F</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__PAR_F = 20;

  /**
   * The feature id for the '<em><b>Name Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__NAME_REF = 21;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__BLOCK = 22;

  /**
   * The feature id for the '<em><b>Left Curly Bracket</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT_CURLY_BRACKET = 23;

  /**
   * The feature id for the '<em><b>Right Curly Bracket</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT_CURLY_BRACKET = 24;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 25;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.DeclImpl <em>Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.DeclImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getDecl()
   * @generated
   */
  int DECL = 18;

  /**
   * The feature id for the '<em><b>Property Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL__PROPERTY_NAME = 0;

  /**
   * The feature id for the '<em><b>Comma</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL__COMMA = 1;

  /**
   * The feature id for the '<em><b>Colon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL__COLON = 2;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL__EXPR = 3;

  /**
   * The number of structural features of the '<em>Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.LetDeclImpl <em>Let Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.LetDeclImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getLetDecl()
   * @generated
   */
  int LET_DECL = 19;

  /**
   * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_DECL__NAME_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_DECL__EXPR = 1;

  /**
   * The number of structural features of the '<em>Let Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.BinOpImpl <em>Bin Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.BinOpImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getBinOp()
   * @generated
   */
  int BIN_OP = 20;

  /**
   * The feature id for the '<em><b>Dot</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_OP__DOT = 0;

  /**
   * The number of structural features of the '<em>Bin Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_OP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.UnOpImpl <em>Un Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.UnOpImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getUnOp()
   * @generated
   */
  int UN_OP = 21;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_OP__OP = 0;

  /**
   * The number of structural features of the '<em>Un Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_OP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.CommonQuantUnOpImpl <em>Common Quant Un Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.CommonQuantUnOpImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getCommonQuantUnOp()
   * @generated
   */
  int COMMON_QUANT_UN_OP = 22;

  /**
   * The number of structural features of the '<em>Common Quant Un Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_QUANT_UN_OP_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.ArrowOpImpl <em>Arrow Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.ArrowOpImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getArrowOp()
   * @generated
   */
  int ARROW_OP = 23;

  /**
   * The feature id for the '<em><b>Arrow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW_OP__ARROW = 0;

  /**
   * The number of structural features of the '<em>Arrow Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW_OP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.BlockImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 24;

  /**
   * The feature id for the '<em><b>Left C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__LEFT_C = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__EXPR = 1;

  /**
   * The feature id for the '<em><b>Right C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__RIGHT_C = 2;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.BlockOrBarImpl <em>Block Or Bar</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.BlockOrBarImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getBlockOrBar()
   * @generated
   */
  int BLOCK_OR_BAR = 25;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_OR_BAR__BLOCK = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_OR_BAR__EXPR = 1;

  /**
   * The number of structural features of the '<em>Block Or Bar</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_OR_BAR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.ModuleNameImpl <em>Module Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.ModuleNameImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getModuleName()
   * @generated
   */
  int MODULE_NAME = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Module Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.OpenNameImpl <em>Open Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.OpenNameImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getOpenName()
   * @generated
   */
  int OPEN_NAME = 27;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_NAME__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Open Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.ReferencesNameImpl <em>References Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.ReferencesNameImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getReferencesName()
   * @generated
   */
  int REFERENCES_NAME = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCES_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>References Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCES_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.FactNameImpl <em>Fact Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.FactNameImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getFactName()
   * @generated
   */
  int FACT_NAME = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT_NAME__NAME = REFERENCES_NAME__NAME;

  /**
   * The number of structural features of the '<em>Fact Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT_NAME_FEATURE_COUNT = REFERENCES_NAME_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.AssertionNameImpl <em>Assertion Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.AssertionNameImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getAssertionName()
   * @generated
   */
  int ASSERTION_NAME = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Assertion Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.FunctionNameImpl <em>Function Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.FunctionNameImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getFunctionName()
   * @generated
   */
  int FUNCTION_NAME = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_NAME__NAME = REFERENCES_NAME__NAME;

  /**
   * The number of structural features of the '<em>Function Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_NAME_FEATURE_COUNT = REFERENCES_NAME_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.PredicateNameImpl <em>Predicate Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.PredicateNameImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getPredicateName()
   * @generated
   */
  int PREDICATE_NAME = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_NAME__NAME = REFERENCES_NAME__NAME;

  /**
   * The number of structural features of the '<em>Predicate Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_NAME_FEATURE_COUNT = REFERENCES_NAME_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.AliasImpl <em>Alias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.AliasImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getAlias()
   * @generated
   */
  int ALIAS = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS__NAME = 0;

  /**
   * The number of structural features of the '<em>Alias</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.EnumNameImpl <em>Enum Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.EnumNameImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getEnumName()
   * @generated
   */
  int ENUM_NAME = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_NAME__NAME = REFERENCES_NAME__NAME;

  /**
   * The number of structural features of the '<em>Enum Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_NAME_FEATURE_COUNT = REFERENCES_NAME_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.EnumPropertyNameImpl <em>Enum Property Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.EnumPropertyNameImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getEnumPropertyName()
   * @generated
   */
  int ENUM_PROPERTY_NAME = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_PROPERTY_NAME__NAME = REFERENCES_NAME__NAME;

  /**
   * The number of structural features of the '<em>Enum Property Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_PROPERTY_NAME_FEATURE_COUNT = REFERENCES_NAME_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.SignatureNameImpl <em>Signature Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.SignatureNameImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getSignatureName()
   * @generated
   */
  int SIGNATURE_NAME = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_NAME__NAME = REFERENCES_NAME__NAME;

  /**
   * The number of structural features of the '<em>Signature Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_NAME_FEATURE_COUNT = REFERENCES_NAME_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.PropertyNameImpl <em>Property Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.PropertyNameImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getPropertyName()
   * @generated
   */
  int PROPERTY_NAME = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_NAME__NAME = REFERENCES_NAME__NAME;

  /**
   * The number of structural features of the '<em>Property Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_NAME_FEATURE_COUNT = REFERENCES_NAME_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.ExactlyNameImpl <em>Exactly Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.ExactlyNameImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getExactlyName()
   * @generated
   */
  int EXACTLY_NAME = 37;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXACTLY_NAME__NAME = REFERENCES_NAME__NAME;

  /**
   * The number of structural features of the '<em>Exactly Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXACTLY_NAME_FEATURE_COUNT = REFERENCES_NAME_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.ReferencesSigImpl <em>References Sig</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.ReferencesSigImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getReferencesSig()
   * @generated
   */
  int REFERENCES_SIG = 39;

  /**
   * The feature id for the '<em><b>Name Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCES_SIG__NAME_REF = 0;

  /**
   * The number of structural features of the '<em>References Sig</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCES_SIG_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.RefImpl <em>Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.RefImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getRef()
   * @generated
   */
  int REF = 40;

  /**
   * The feature id for the '<em><b>Name Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF__NAME_REF = 0;

  /**
   * The number of structural features of the '<em>Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.LeftCurlyBracketImpl <em>Left Curly Bracket</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.LeftCurlyBracketImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getLeftCurlyBracket()
   * @generated
   */
  int LEFT_CURLY_BRACKET = 41;

  /**
   * The feature id for the '<em><b>Left Curly Bracket</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_CURLY_BRACKET__LEFT_CURLY_BRACKET = 0;

  /**
   * The number of structural features of the '<em>Left Curly Bracket</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_CURLY_BRACKET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.RightCurlyBracketImpl <em>Right Curly Bracket</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.RightCurlyBracketImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getRightCurlyBracket()
   * @generated
   */
  int RIGHT_CURLY_BRACKET = 42;

  /**
   * The feature id for the '<em><b>Right Curly Bracket</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_CURLY_BRACKET__RIGHT_CURLY_BRACKET = 0;

  /**
   * The number of structural features of the '<em>Right Curly Bracket</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_CURLY_BRACKET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.DotImpl <em>Dot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.DotImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getDot()
   * @generated
   */
  int DOT = 43;

  /**
   * The feature id for the '<em><b>Dot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOT__DOT = 0;

  /**
   * The number of structural features of the '<em>Dot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.CommaImpl <em>Comma</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.CommaImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getComma()
   * @generated
   */
  int COMMA = 44;

  /**
   * The feature id for the '<em><b>Comma</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMA__COMMA = 0;

  /**
   * The number of structural features of the '<em>Comma</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.ColonImpl <em>Colon</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.ColonImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getColon()
   * @generated
   */
  int COLON = 45;

  /**
   * The feature id for the '<em><b>Colon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLON__COLON = 0;

  /**
   * The number of structural features of the '<em>Colon</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLON_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.LeftParenthesisImpl <em>Left Parenthesis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.LeftParenthesisImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getLeftParenthesis()
   * @generated
   */
  int LEFT_PARENTHESIS = 46;

  /**
   * The feature id for the '<em><b>Left Parenthesis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_PARENTHESIS__LEFT_PARENTHESIS = 0;

  /**
   * The number of structural features of the '<em>Left Parenthesis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_PARENTHESIS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.RightParenthesisImpl <em>Right Parenthesis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.RightParenthesisImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getRightParenthesis()
   * @generated
   */
  int RIGHT_PARENTHESIS = 47;

  /**
   * The feature id for the '<em><b>Right Parenthesis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_PARENTHESIS__RIGHT_PARENTHESIS = 0;

  /**
   * The number of structural features of the '<em>Right Parenthesis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_PARENTHESIS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.LeftSquareBracketKeywordImpl <em>Left Square Bracket Keyword</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.LeftSquareBracketKeywordImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getLeftSquareBracketKeyword()
   * @generated
   */
  int LEFT_SQUARE_BRACKET_KEYWORD = 48;

  /**
   * The feature id for the '<em><b>Left Square Bracket Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_SQUARE_BRACKET_KEYWORD__LEFT_SQUARE_BRACKET_KEYWORD = 0;

  /**
   * The number of structural features of the '<em>Left Square Bracket Keyword</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_SQUARE_BRACKET_KEYWORD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.xtext.als.impl.RightSquareBracketKeywordImpl <em>Right Square Bracket Keyword</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.xtext.als.impl.RightSquareBracketKeywordImpl
   * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getRightSquareBracketKeyword()
   * @generated
   */
  int RIGHT_SQUARE_BRACKET_KEYWORD = 49;

  /**
   * The feature id for the '<em><b>Right Square Bracket Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_SQUARE_BRACKET_KEYWORD__RIGHT_SQUARE_BRACKET_KEYWORD = 0;

  /**
   * The number of structural features of the '<em>Right Square Bracket Keyword</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_SQUARE_BRACKET_KEYWORD_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.Specification <em>Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Specification</em>'.
   * @see fr.univartois.cril.xtext.als.Specification
   * @generated
   */
  EClass getSpecification();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Specification#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Module</em>'.
   * @see fr.univartois.cril.xtext.als.Specification#getModule()
   * @see #getSpecification()
   * @generated
   */
  EReference getSpecification_Module();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Specification#getOpen <em>Open</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Open</em>'.
   * @see fr.univartois.cril.xtext.als.Specification#getOpen()
   * @see #getSpecification()
   * @generated
   */
  EReference getSpecification_Open();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Specification#getParagraph <em>Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Paragraph</em>'.
   * @see fr.univartois.cril.xtext.als.Specification#getParagraph()
   * @see #getSpecification()
   * @generated
   */
  EReference getSpecification_Paragraph();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see fr.univartois.cril.xtext.als.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Module#getModuleName <em>Module Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Module Name</em>'.
   * @see fr.univartois.cril.xtext.als.Module#getModuleName()
   * @see #getModule()
   * @generated
   */
  EReference getModule_ModuleName();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Module#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see fr.univartois.cril.xtext.als.Module#getLeft()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Left();

  /**
   * Returns the meta object for the attribute list '{@link fr.univartois.cril.xtext.als.Module#getExactly <em>Exactly</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Exactly</em>'.
   * @see fr.univartois.cril.xtext.als.Module#getExactly()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Exactly();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Module#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see fr.univartois.cril.xtext.als.Module#getName()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Module#getComma <em>Comma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comma</em>'.
   * @see fr.univartois.cril.xtext.als.Module#getComma()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Comma();

  /**
   * Returns the meta object for the attribute list '{@link fr.univartois.cril.xtext.als.Module#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Number</em>'.
   * @see fr.univartois.cril.xtext.als.Module#getNumber()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Number();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Module#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.univartois.cril.xtext.als.Module#getRight()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Right();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.Open <em>Open</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Open</em>'.
   * @see fr.univartois.cril.xtext.als.Open
   * @generated
   */
  EClass getOpen();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Open#getOpenName <em>Open Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Open Name</em>'.
   * @see fr.univartois.cril.xtext.als.Open#getOpenName()
   * @see #getOpen()
   * @generated
   */
  EReference getOpen_OpenName();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Open#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see fr.univartois.cril.xtext.als.Open#getLeft()
   * @see #getOpen()
   * @generated
   */
  EReference getOpen_Left();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Open#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref</em>'.
   * @see fr.univartois.cril.xtext.als.Open#getRef()
   * @see #getOpen()
   * @generated
   */
  EReference getOpen_Ref();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Open#getComma <em>Comma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comma</em>'.
   * @see fr.univartois.cril.xtext.als.Open#getComma()
   * @see #getOpen()
   * @generated
   */
  EReference getOpen_Comma();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Open#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.univartois.cril.xtext.als.Open#getRight()
   * @see #getOpen()
   * @generated
   */
  EReference getOpen_Right();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Open#getNameAs <em>Name As</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name As</em>'.
   * @see fr.univartois.cril.xtext.als.Open#getNameAs()
   * @see #getOpen()
   * @generated
   */
  EReference getOpen_NameAs();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.Paragraph <em>Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Paragraph</em>'.
   * @see fr.univartois.cril.xtext.als.Paragraph
   * @generated
   */
  EClass getParagraph();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.Fact <em>Fact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fact</em>'.
   * @see fr.univartois.cril.xtext.als.Fact
   * @generated
   */
  EClass getFact();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Fact#getFactName <em>Fact Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fact Name</em>'.
   * @see fr.univartois.cril.xtext.als.Fact#getFactName()
   * @see #getFact()
   * @generated
   */
  EReference getFact_FactName();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Fact#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see fr.univartois.cril.xtext.als.Fact#getBlock()
   * @see #getFact()
   * @generated
   */
  EReference getFact_Block();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.Assertion <em>Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertion</em>'.
   * @see fr.univartois.cril.xtext.als.Assertion
   * @generated
   */
  EClass getAssertion();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Assertion#getAssertionName <em>Assertion Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assertion Name</em>'.
   * @see fr.univartois.cril.xtext.als.Assertion#getAssertionName()
   * @see #getAssertion()
   * @generated
   */
  EReference getAssertion_AssertionName();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Assertion#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see fr.univartois.cril.xtext.als.Assertion#getBlock()
   * @see #getAssertion()
   * @generated
   */
  EReference getAssertion_Block();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see fr.univartois.cril.xtext.als.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Function#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see fr.univartois.cril.xtext.als.Function#getRef()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Ref();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Function#getDot <em>Dot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dot</em>'.
   * @see fr.univartois.cril.xtext.als.Function#getDot()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Dot();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Function#getFunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function Name</em>'.
   * @see fr.univartois.cril.xtext.als.Function#getFunctionName()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_FunctionName();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Function#getLeftS <em>Left S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left S</em>'.
   * @see fr.univartois.cril.xtext.als.Function#getLeftS()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_LeftS();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Function#getDecl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decl</em>'.
   * @see fr.univartois.cril.xtext.als.Function#getDecl()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Decl();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Function#getComma <em>Comma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comma</em>'.
   * @see fr.univartois.cril.xtext.als.Function#getComma()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Comma();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Function#getRightS <em>Right S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right S</em>'.
   * @see fr.univartois.cril.xtext.als.Function#getRightS()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_RightS();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Function#getLeftP <em>Left P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left P</em>'.
   * @see fr.univartois.cril.xtext.als.Function#getLeftP()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_LeftP();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Function#getRightP <em>Right P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right P</em>'.
   * @see fr.univartois.cril.xtext.als.Function#getRightP()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_RightP();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Function#getColon <em>Colon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Colon</em>'.
   * @see fr.univartois.cril.xtext.als.Function#getColon()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Colon();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Function#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see fr.univartois.cril.xtext.als.Function#getExpr()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Expr();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Function#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see fr.univartois.cril.xtext.als.Function#getBlock()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Block();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.Predicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate</em>'.
   * @see fr.univartois.cril.xtext.als.Predicate
   * @generated
   */
  EClass getPredicate();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Predicate#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see fr.univartois.cril.xtext.als.Predicate#getRef()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_Ref();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Predicate#getDot <em>Dot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dot</em>'.
   * @see fr.univartois.cril.xtext.als.Predicate#getDot()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_Dot();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Predicate#getPredicateName <em>Predicate Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate Name</em>'.
   * @see fr.univartois.cril.xtext.als.Predicate#getPredicateName()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_PredicateName();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Predicate#getLeftS <em>Left S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left S</em>'.
   * @see fr.univartois.cril.xtext.als.Predicate#getLeftS()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_LeftS();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Predicate#getDecl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decl</em>'.
   * @see fr.univartois.cril.xtext.als.Predicate#getDecl()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_Decl();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Predicate#getComma <em>Comma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comma</em>'.
   * @see fr.univartois.cril.xtext.als.Predicate#getComma()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_Comma();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Predicate#getRightS <em>Right S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right S</em>'.
   * @see fr.univartois.cril.xtext.als.Predicate#getRightS()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_RightS();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Predicate#getLeftP <em>Left P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left P</em>'.
   * @see fr.univartois.cril.xtext.als.Predicate#getLeftP()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_LeftP();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Predicate#getRightP <em>Right P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right P</em>'.
   * @see fr.univartois.cril.xtext.als.Predicate#getRightP()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_RightP();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Predicate#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see fr.univartois.cril.xtext.als.Predicate#getBlock()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_Block();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.RunCommand <em>Run Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Run Command</em>'.
   * @see fr.univartois.cril.xtext.als.RunCommand
   * @generated
   */
  EClass getRunCommand();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.RunCommand#getRunName <em>Run Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Run Name</em>'.
   * @see fr.univartois.cril.xtext.als.RunCommand#getRunName()
   * @see #getRunCommand()
   * @generated
   */
  EReference getRunCommand_RunName();

  /**
   * Returns the meta object for the reference '{@link fr.univartois.cril.xtext.als.RunCommand#getName2 <em>Name2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name2</em>'.
   * @see fr.univartois.cril.xtext.als.RunCommand#getName2()
   * @see #getRunCommand()
   * @generated
   */
  EReference getRunCommand_Name2();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.RunCommand#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see fr.univartois.cril.xtext.als.RunCommand#getBlock()
   * @see #getRunCommand()
   * @generated
   */
  EReference getRunCommand_Block();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.RunCommand#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Scope</em>'.
   * @see fr.univartois.cril.xtext.als.RunCommand#getScope()
   * @see #getRunCommand()
   * @generated
   */
  EReference getRunCommand_Scope();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.CheckCommand <em>Check Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check Command</em>'.
   * @see fr.univartois.cril.xtext.als.CheckCommand
   * @generated
   */
  EClass getCheckCommand();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.CheckCommand#getCheckName <em>Check Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Check Name</em>'.
   * @see fr.univartois.cril.xtext.als.CheckCommand#getCheckName()
   * @see #getCheckCommand()
   * @generated
   */
  EReference getCheckCommand_CheckName();

  /**
   * Returns the meta object for the reference '{@link fr.univartois.cril.xtext.als.CheckCommand#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see fr.univartois.cril.xtext.als.CheckCommand#getName()
   * @see #getCheckCommand()
   * @generated
   */
  EReference getCheckCommand_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.CheckCommand#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see fr.univartois.cril.xtext.als.CheckCommand#getBlock()
   * @see #getCheckCommand()
   * @generated
   */
  EReference getCheckCommand_Block();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.CheckCommand#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Scope</em>'.
   * @see fr.univartois.cril.xtext.als.CheckCommand#getScope()
   * @see #getCheckCommand()
   * @generated
   */
  EReference getCheckCommand_Scope();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.Scope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scope</em>'.
   * @see fr.univartois.cril.xtext.als.Scope
   * @generated
   */
  EClass getScope();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Scope#getExpect <em>Expect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expect</em>'.
   * @see fr.univartois.cril.xtext.als.Scope#getExpect()
   * @see #getScope()
   * @generated
   */
  EReference getScope_Expect();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Scope#getTypescope <em>Typescope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Typescope</em>'.
   * @see fr.univartois.cril.xtext.als.Scope#getTypescope()
   * @see #getScope()
   * @generated
   */
  EReference getScope_Typescope();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Scope#getComma <em>Comma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comma</em>'.
   * @see fr.univartois.cril.xtext.als.Scope#getComma()
   * @see #getScope()
   * @generated
   */
  EReference getScope_Comma();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.Expectation <em>Expectation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expectation</em>'.
   * @see fr.univartois.cril.xtext.als.Expectation
   * @generated
   */
  EClass getExpectation();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.Expectation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.univartois.cril.xtext.als.Expectation#getValue()
   * @see #getExpectation()
   * @generated
   */
  EAttribute getExpectation_Value();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.Typescope <em>Typescope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typescope</em>'.
   * @see fr.univartois.cril.xtext.als.Typescope
   * @generated
   */
  EClass getTypescope();

  /**
   * Returns the meta object for the reference '{@link fr.univartois.cril.xtext.als.Typescope#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see fr.univartois.cril.xtext.als.Typescope#getName()
   * @see #getTypescope()
   * @generated
   */
  EReference getTypescope_Name();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.EnumDecl <em>Enum Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Decl</em>'.
   * @see fr.univartois.cril.xtext.als.EnumDecl
   * @generated
   */
  EClass getEnumDecl();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.EnumDecl#getEnumName <em>Enum Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enum Name</em>'.
   * @see fr.univartois.cril.xtext.als.EnumDecl#getEnumName()
   * @see #getEnumDecl()
   * @generated
   */
  EReference getEnumDecl_EnumName();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.EnumDecl#getLeftC <em>Left C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left C</em>'.
   * @see fr.univartois.cril.xtext.als.EnumDecl#getLeftC()
   * @see #getEnumDecl()
   * @generated
   */
  EReference getEnumDecl_LeftC();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.EnumDecl#getPropertyEnum <em>Property Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property Enum</em>'.
   * @see fr.univartois.cril.xtext.als.EnumDecl#getPropertyEnum()
   * @see #getEnumDecl()
   * @generated
   */
  EReference getEnumDecl_PropertyEnum();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.EnumDecl#getComma <em>Comma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comma</em>'.
   * @see fr.univartois.cril.xtext.als.EnumDecl#getComma()
   * @see #getEnumDecl()
   * @generated
   */
  EReference getEnumDecl_Comma();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.EnumDecl#getRightC <em>Right C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right C</em>'.
   * @see fr.univartois.cril.xtext.als.EnumDecl#getRightC()
   * @see #getEnumDecl()
   * @generated
   */
  EReference getEnumDecl_RightC();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.Signature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signature</em>'.
   * @see fr.univartois.cril.xtext.als.Signature
   * @generated
   */
  EClass getSignature();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Signature#getSignatureName <em>Signature Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signature Name</em>'.
   * @see fr.univartois.cril.xtext.als.Signature#getSignatureName()
   * @see #getSignature()
   * @generated
   */
  EReference getSignature_SignatureName();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Signature#getComma <em>Comma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comma</em>'.
   * @see fr.univartois.cril.xtext.als.Signature#getComma()
   * @see #getSignature()
   * @generated
   */
  EReference getSignature_Comma();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Signature#getSigExt <em>Sig Ext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sig Ext</em>'.
   * @see fr.univartois.cril.xtext.als.Signature#getSigExt()
   * @see #getSignature()
   * @generated
   */
  EReference getSignature_SigExt();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Signature#getDecl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decl</em>'.
   * @see fr.univartois.cril.xtext.als.Signature#getDecl()
   * @see #getSignature()
   * @generated
   */
  EReference getSignature_Decl();

  /**
   * Returns the meta object for the attribute list '{@link fr.univartois.cril.xtext.als.Signature#getComma2 <em>Comma2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Comma2</em>'.
   * @see fr.univartois.cril.xtext.als.Signature#getComma2()
   * @see #getSignature()
   * @generated
   */
  EAttribute getSignature_Comma2();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Signature#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see fr.univartois.cril.xtext.als.Signature#getBlock()
   * @see #getSignature()
   * @generated
   */
  EReference getSignature_Block();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.SigQual <em>Sig Qual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sig Qual</em>'.
   * @see fr.univartois.cril.xtext.als.SigQual
   * @generated
   */
  EClass getSigQual();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.SigQual#getSigq <em>Sigq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sigq</em>'.
   * @see fr.univartois.cril.xtext.als.SigQual#getSigq()
   * @see #getSigQual()
   * @generated
   */
  EAttribute getSigQual_Sigq();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.SigExt <em>Sig Ext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sig Ext</em>'.
   * @see fr.univartois.cril.xtext.als.SigExt
   * @generated
   */
  EClass getSigExt();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.SigExt#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see fr.univartois.cril.xtext.als.SigExt#getRef()
   * @see #getSigExt()
   * @generated
   */
  EReference getSigExt_Ref();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.SigExt#getRef2 <em>Ref2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref2</em>'.
   * @see fr.univartois.cril.xtext.als.SigExt#getRef2()
   * @see #getSigExt()
   * @generated
   */
  EReference getSigExt_Ref2();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see fr.univartois.cril.xtext.als.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Expression#getBinOp <em>Bin Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bin Op</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getBinOp()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_BinOp();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Expression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expr</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getExpr()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Expr();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Expression#getArrowOp <em>Arrow Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arrow Op</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getArrowOp()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_ArrowOp();

  /**
   * Returns the meta object for the attribute list '{@link fr.univartois.cril.xtext.als.Expression#getCmp <em>Cmp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Cmp</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getCmp()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Cmp();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Expression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Left</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getLeft()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Left();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Expression#getComma <em>Comma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comma</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getComma()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Comma();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Expression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Right</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getRight()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Right();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.Expression#getLet <em>Let</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Let</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getLet()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Let();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Expression#getLetdecl <em>Letdecl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Letdecl</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getLetdecl()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Letdecl();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Expression#getBlockOrBar <em>Block Or Bar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Block Or Bar</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getBlockOrBar()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_BlockOrBar();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.Expression#getQuant <em>Quant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quant</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getQuant()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Quant();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Expression#getDecl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decl</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getDecl()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Decl();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Expression#getUnOp <em>Un Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Un Op</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getUnOp()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_UnOp();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Expression#getCommon <em>Common</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Common</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getCommon()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Common();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.Expression#getNone <em>None</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>None</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getNone()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_None();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.Expression#getIden <em>Iden</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Iden</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getIden()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Iden();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.Expression#getUniv <em>Univ</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Univ</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getUniv()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Univ();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.Expression#getInt <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getInt()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Int();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.Expression#getSeq <em>Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Seq</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getSeq()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Seq();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.Expression#getParO <em>Par O</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Par O</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getParO()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_ParO();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.Expression#getParF <em>Par F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Par F</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getParF()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_ParF();

  /**
   * Returns the meta object for the reference '{@link fr.univartois.cril.xtext.als.Expression#getNameRef <em>Name Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name Ref</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getNameRef()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_NameRef();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Expression#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Block</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getBlock()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Block();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Expression#getLeftCurlyBracket <em>Left Curly Bracket</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Curly Bracket</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getLeftCurlyBracket()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_LeftCurlyBracket();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Expression#getRightCurlyBracket <em>Right Curly Bracket</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Curly Bracket</em>'.
   * @see fr.univartois.cril.xtext.als.Expression#getRightCurlyBracket()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_RightCurlyBracket();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.Decl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decl</em>'.
   * @see fr.univartois.cril.xtext.als.Decl
   * @generated
   */
  EClass getDecl();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Decl#getPropertyName <em>Property Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property Name</em>'.
   * @see fr.univartois.cril.xtext.als.Decl#getPropertyName()
   * @see #getDecl()
   * @generated
   */
  EReference getDecl_PropertyName();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Decl#getComma <em>Comma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comma</em>'.
   * @see fr.univartois.cril.xtext.als.Decl#getComma()
   * @see #getDecl()
   * @generated
   */
  EReference getDecl_Comma();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Decl#getColon <em>Colon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Colon</em>'.
   * @see fr.univartois.cril.xtext.als.Decl#getColon()
   * @see #getDecl()
   * @generated
   */
  EReference getDecl_Colon();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Decl#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see fr.univartois.cril.xtext.als.Decl#getExpr()
   * @see #getDecl()
   * @generated
   */
  EReference getDecl_Expr();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.LetDecl <em>Let Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Let Decl</em>'.
   * @see fr.univartois.cril.xtext.als.LetDecl
   * @generated
   */
  EClass getLetDecl();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.LetDecl#getNameExpression <em>Name Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name Expression</em>'.
   * @see fr.univartois.cril.xtext.als.LetDecl#getNameExpression()
   * @see #getLetDecl()
   * @generated
   */
  EReference getLetDecl_NameExpression();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.LetDecl#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see fr.univartois.cril.xtext.als.LetDecl#getExpr()
   * @see #getLetDecl()
   * @generated
   */
  EReference getLetDecl_Expr();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.BinOp <em>Bin Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bin Op</em>'.
   * @see fr.univartois.cril.xtext.als.BinOp
   * @generated
   */
  EClass getBinOp();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.BinOp#getDot <em>Dot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dot</em>'.
   * @see fr.univartois.cril.xtext.als.BinOp#getDot()
   * @see #getBinOp()
   * @generated
   */
  EReference getBinOp_Dot();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.UnOp <em>Un Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Un Op</em>'.
   * @see fr.univartois.cril.xtext.als.UnOp
   * @generated
   */
  EClass getUnOp();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.UnOp#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see fr.univartois.cril.xtext.als.UnOp#getOp()
   * @see #getUnOp()
   * @generated
   */
  EAttribute getUnOp_Op();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.CommonQuantUnOp <em>Common Quant Un Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Common Quant Un Op</em>'.
   * @see fr.univartois.cril.xtext.als.CommonQuantUnOp
   * @generated
   */
  EClass getCommonQuantUnOp();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.ArrowOp <em>Arrow Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arrow Op</em>'.
   * @see fr.univartois.cril.xtext.als.ArrowOp
   * @generated
   */
  EClass getArrowOp();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.ArrowOp#getArrow <em>Arrow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arrow</em>'.
   * @see fr.univartois.cril.xtext.als.ArrowOp#getArrow()
   * @see #getArrowOp()
   * @generated
   */
  EAttribute getArrowOp_Arrow();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see fr.univartois.cril.xtext.als.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Block#getLeftC <em>Left C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left C</em>'.
   * @see fr.univartois.cril.xtext.als.Block#getLeftC()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_LeftC();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.xtext.als.Block#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expr</em>'.
   * @see fr.univartois.cril.xtext.als.Block#getExpr()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Expr();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.Block#getRightC <em>Right C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right C</em>'.
   * @see fr.univartois.cril.xtext.als.Block#getRightC()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_RightC();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.BlockOrBar <em>Block Or Bar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Or Bar</em>'.
   * @see fr.univartois.cril.xtext.als.BlockOrBar
   * @generated
   */
  EClass getBlockOrBar();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.BlockOrBar#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see fr.univartois.cril.xtext.als.BlockOrBar#getBlock()
   * @see #getBlockOrBar()
   * @generated
   */
  EReference getBlockOrBar_Block();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.xtext.als.BlockOrBar#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see fr.univartois.cril.xtext.als.BlockOrBar#getExpr()
   * @see #getBlockOrBar()
   * @generated
   */
  EReference getBlockOrBar_Expr();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.ModuleName <em>Module Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Name</em>'.
   * @see fr.univartois.cril.xtext.als.ModuleName
   * @generated
   */
  EClass getModuleName();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.ModuleName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.univartois.cril.xtext.als.ModuleName#getName()
   * @see #getModuleName()
   * @generated
   */
  EAttribute getModuleName_Name();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.OpenName <em>Open Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Open Name</em>'.
   * @see fr.univartois.cril.xtext.als.OpenName
   * @generated
   */
  EClass getOpenName();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.OpenName#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see fr.univartois.cril.xtext.als.OpenName#getImportedNamespace()
   * @see #getOpenName()
   * @generated
   */
  EAttribute getOpenName_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.FactName <em>Fact Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fact Name</em>'.
   * @see fr.univartois.cril.xtext.als.FactName
   * @generated
   */
  EClass getFactName();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.AssertionName <em>Assertion Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertion Name</em>'.
   * @see fr.univartois.cril.xtext.als.AssertionName
   * @generated
   */
  EClass getAssertionName();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.AssertionName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.univartois.cril.xtext.als.AssertionName#getName()
   * @see #getAssertionName()
   * @generated
   */
  EAttribute getAssertionName_Name();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.FunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Name</em>'.
   * @see fr.univartois.cril.xtext.als.FunctionName
   * @generated
   */
  EClass getFunctionName();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.PredicateName <em>Predicate Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate Name</em>'.
   * @see fr.univartois.cril.xtext.als.PredicateName
   * @generated
   */
  EClass getPredicateName();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.Alias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alias</em>'.
   * @see fr.univartois.cril.xtext.als.Alias
   * @generated
   */
  EClass getAlias();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.Alias#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.univartois.cril.xtext.als.Alias#getName()
   * @see #getAlias()
   * @generated
   */
  EAttribute getAlias_Name();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.EnumName <em>Enum Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Name</em>'.
   * @see fr.univartois.cril.xtext.als.EnumName
   * @generated
   */
  EClass getEnumName();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.EnumPropertyName <em>Enum Property Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Property Name</em>'.
   * @see fr.univartois.cril.xtext.als.EnumPropertyName
   * @generated
   */
  EClass getEnumPropertyName();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.SignatureName <em>Signature Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signature Name</em>'.
   * @see fr.univartois.cril.xtext.als.SignatureName
   * @generated
   */
  EClass getSignatureName();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.PropertyName <em>Property Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Name</em>'.
   * @see fr.univartois.cril.xtext.als.PropertyName
   * @generated
   */
  EClass getPropertyName();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.ExactlyName <em>Exactly Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exactly Name</em>'.
   * @see fr.univartois.cril.xtext.als.ExactlyName
   * @generated
   */
  EClass getExactlyName();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.ReferencesName <em>References Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>References Name</em>'.
   * @see fr.univartois.cril.xtext.als.ReferencesName
   * @generated
   */
  EClass getReferencesName();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.ReferencesName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.univartois.cril.xtext.als.ReferencesName#getName()
   * @see #getReferencesName()
   * @generated
   */
  EAttribute getReferencesName_Name();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.ReferencesSig <em>References Sig</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>References Sig</em>'.
   * @see fr.univartois.cril.xtext.als.ReferencesSig
   * @generated
   */
  EClass getReferencesSig();

  /**
   * Returns the meta object for the reference '{@link fr.univartois.cril.xtext.als.ReferencesSig#getNameRef <em>Name Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name Ref</em>'.
   * @see fr.univartois.cril.xtext.als.ReferencesSig#getNameRef()
   * @see #getReferencesSig()
   * @generated
   */
  EReference getReferencesSig_NameRef();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.Ref <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref</em>'.
   * @see fr.univartois.cril.xtext.als.Ref
   * @generated
   */
  EClass getRef();

  /**
   * Returns the meta object for the reference '{@link fr.univartois.cril.xtext.als.Ref#getNameRef <em>Name Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name Ref</em>'.
   * @see fr.univartois.cril.xtext.als.Ref#getNameRef()
   * @see #getRef()
   * @generated
   */
  EReference getRef_NameRef();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.LeftCurlyBracket <em>Left Curly Bracket</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Left Curly Bracket</em>'.
   * @see fr.univartois.cril.xtext.als.LeftCurlyBracket
   * @generated
   */
  EClass getLeftCurlyBracket();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.LeftCurlyBracket#getLeftCurlyBracket <em>Left Curly Bracket</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left Curly Bracket</em>'.
   * @see fr.univartois.cril.xtext.als.LeftCurlyBracket#getLeftCurlyBracket()
   * @see #getLeftCurlyBracket()
   * @generated
   */
  EAttribute getLeftCurlyBracket_LeftCurlyBracket();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.RightCurlyBracket <em>Right Curly Bracket</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Right Curly Bracket</em>'.
   * @see fr.univartois.cril.xtext.als.RightCurlyBracket
   * @generated
   */
  EClass getRightCurlyBracket();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.RightCurlyBracket#getRightCurlyBracket <em>Right Curly Bracket</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right Curly Bracket</em>'.
   * @see fr.univartois.cril.xtext.als.RightCurlyBracket#getRightCurlyBracket()
   * @see #getRightCurlyBracket()
   * @generated
   */
  EAttribute getRightCurlyBracket_RightCurlyBracket();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.Dot <em>Dot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dot</em>'.
   * @see fr.univartois.cril.xtext.als.Dot
   * @generated
   */
  EClass getDot();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.Dot#getDot <em>Dot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dot</em>'.
   * @see fr.univartois.cril.xtext.als.Dot#getDot()
   * @see #getDot()
   * @generated
   */
  EAttribute getDot_Dot();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.Comma <em>Comma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comma</em>'.
   * @see fr.univartois.cril.xtext.als.Comma
   * @generated
   */
  EClass getComma();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.Comma#getComma <em>Comma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comma</em>'.
   * @see fr.univartois.cril.xtext.als.Comma#getComma()
   * @see #getComma()
   * @generated
   */
  EAttribute getComma_Comma();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.Colon <em>Colon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Colon</em>'.
   * @see fr.univartois.cril.xtext.als.Colon
   * @generated
   */
  EClass getColon();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.Colon#getColon <em>Colon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Colon</em>'.
   * @see fr.univartois.cril.xtext.als.Colon#getColon()
   * @see #getColon()
   * @generated
   */
  EAttribute getColon_Colon();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.LeftParenthesis <em>Left Parenthesis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Left Parenthesis</em>'.
   * @see fr.univartois.cril.xtext.als.LeftParenthesis
   * @generated
   */
  EClass getLeftParenthesis();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.LeftParenthesis#getLeftParenthesis <em>Left Parenthesis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left Parenthesis</em>'.
   * @see fr.univartois.cril.xtext.als.LeftParenthesis#getLeftParenthesis()
   * @see #getLeftParenthesis()
   * @generated
   */
  EAttribute getLeftParenthesis_LeftParenthesis();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.RightParenthesis <em>Right Parenthesis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Right Parenthesis</em>'.
   * @see fr.univartois.cril.xtext.als.RightParenthesis
   * @generated
   */
  EClass getRightParenthesis();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.RightParenthesis#getRightParenthesis <em>Right Parenthesis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right Parenthesis</em>'.
   * @see fr.univartois.cril.xtext.als.RightParenthesis#getRightParenthesis()
   * @see #getRightParenthesis()
   * @generated
   */
  EAttribute getRightParenthesis_RightParenthesis();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.LeftSquareBracketKeyword <em>Left Square Bracket Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Left Square Bracket Keyword</em>'.
   * @see fr.univartois.cril.xtext.als.LeftSquareBracketKeyword
   * @generated
   */
  EClass getLeftSquareBracketKeyword();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.LeftSquareBracketKeyword#getLeftSquareBracketKeyword <em>Left Square Bracket Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left Square Bracket Keyword</em>'.
   * @see fr.univartois.cril.xtext.als.LeftSquareBracketKeyword#getLeftSquareBracketKeyword()
   * @see #getLeftSquareBracketKeyword()
   * @generated
   */
  EAttribute getLeftSquareBracketKeyword_LeftSquareBracketKeyword();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.xtext.als.RightSquareBracketKeyword <em>Right Square Bracket Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Right Square Bracket Keyword</em>'.
   * @see fr.univartois.cril.xtext.als.RightSquareBracketKeyword
   * @generated
   */
  EClass getRightSquareBracketKeyword();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.xtext.als.RightSquareBracketKeyword#getRightSquareBracketKeyword <em>Right Square Bracket Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right Square Bracket Keyword</em>'.
   * @see fr.univartois.cril.xtext.als.RightSquareBracketKeyword#getRightSquareBracketKeyword()
   * @see #getRightSquareBracketKeyword()
   * @generated
   */
  EAttribute getRightSquareBracketKeyword_RightSquareBracketKeyword();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AlsFactory getAlsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.SpecificationImpl <em>Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.SpecificationImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getSpecification()
     * @generated
     */
    EClass SPECIFICATION = eINSTANCE.getSpecification();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFICATION__MODULE = eINSTANCE.getSpecification_Module();

    /**
     * The meta object literal for the '<em><b>Open</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFICATION__OPEN = eINSTANCE.getSpecification_Open();

    /**
     * The meta object literal for the '<em><b>Paragraph</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFICATION__PARAGRAPH = eINSTANCE.getSpecification_Paragraph();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.ModuleImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Module Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__MODULE_NAME = eINSTANCE.getModule_ModuleName();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__LEFT = eINSTANCE.getModule_Left();

    /**
     * The meta object literal for the '<em><b>Exactly</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__EXACTLY = eINSTANCE.getModule_Exactly();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__NAME = eINSTANCE.getModule_Name();

    /**
     * The meta object literal for the '<em><b>Comma</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__COMMA = eINSTANCE.getModule_Comma();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__NUMBER = eINSTANCE.getModule_Number();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__RIGHT = eINSTANCE.getModule_Right();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.OpenImpl <em>Open</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.OpenImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getOpen()
     * @generated
     */
    EClass OPEN = eINSTANCE.getOpen();

    /**
     * The meta object literal for the '<em><b>Open Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPEN__OPEN_NAME = eINSTANCE.getOpen_OpenName();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPEN__LEFT = eINSTANCE.getOpen_Left();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPEN__REF = eINSTANCE.getOpen_Ref();

    /**
     * The meta object literal for the '<em><b>Comma</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPEN__COMMA = eINSTANCE.getOpen_Comma();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPEN__RIGHT = eINSTANCE.getOpen_Right();

    /**
     * The meta object literal for the '<em><b>Name As</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPEN__NAME_AS = eINSTANCE.getOpen_NameAs();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.ParagraphImpl <em>Paragraph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.ParagraphImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getParagraph()
     * @generated
     */
    EClass PARAGRAPH = eINSTANCE.getParagraph();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.FactImpl <em>Fact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.FactImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getFact()
     * @generated
     */
    EClass FACT = eINSTANCE.getFact();

    /**
     * The meta object literal for the '<em><b>Fact Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACT__FACT_NAME = eINSTANCE.getFact_FactName();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACT__BLOCK = eINSTANCE.getFact_Block();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.AssertionImpl <em>Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.AssertionImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getAssertion()
     * @generated
     */
    EClass ASSERTION = eINSTANCE.getAssertion();

    /**
     * The meta object literal for the '<em><b>Assertion Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION__ASSERTION_NAME = eINSTANCE.getAssertion_AssertionName();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION__BLOCK = eINSTANCE.getAssertion_Block();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.FunctionImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__REF = eINSTANCE.getFunction_Ref();

    /**
     * The meta object literal for the '<em><b>Dot</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__DOT = eINSTANCE.getFunction_Dot();

    /**
     * The meta object literal for the '<em><b>Function Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__FUNCTION_NAME = eINSTANCE.getFunction_FunctionName();

    /**
     * The meta object literal for the '<em><b>Left S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__LEFT_S = eINSTANCE.getFunction_LeftS();

    /**
     * The meta object literal for the '<em><b>Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__DECL = eINSTANCE.getFunction_Decl();

    /**
     * The meta object literal for the '<em><b>Comma</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__COMMA = eINSTANCE.getFunction_Comma();

    /**
     * The meta object literal for the '<em><b>Right S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__RIGHT_S = eINSTANCE.getFunction_RightS();

    /**
     * The meta object literal for the '<em><b>Left P</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__LEFT_P = eINSTANCE.getFunction_LeftP();

    /**
     * The meta object literal for the '<em><b>Right P</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__RIGHT_P = eINSTANCE.getFunction_RightP();

    /**
     * The meta object literal for the '<em><b>Colon</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__COLON = eINSTANCE.getFunction_Colon();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__EXPR = eINSTANCE.getFunction_Expr();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__BLOCK = eINSTANCE.getFunction_Block();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.PredicateImpl <em>Predicate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.PredicateImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getPredicate()
     * @generated
     */
    EClass PREDICATE = eINSTANCE.getPredicate();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__REF = eINSTANCE.getPredicate_Ref();

    /**
     * The meta object literal for the '<em><b>Dot</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__DOT = eINSTANCE.getPredicate_Dot();

    /**
     * The meta object literal for the '<em><b>Predicate Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__PREDICATE_NAME = eINSTANCE.getPredicate_PredicateName();

    /**
     * The meta object literal for the '<em><b>Left S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__LEFT_S = eINSTANCE.getPredicate_LeftS();

    /**
     * The meta object literal for the '<em><b>Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__DECL = eINSTANCE.getPredicate_Decl();

    /**
     * The meta object literal for the '<em><b>Comma</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__COMMA = eINSTANCE.getPredicate_Comma();

    /**
     * The meta object literal for the '<em><b>Right S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__RIGHT_S = eINSTANCE.getPredicate_RightS();

    /**
     * The meta object literal for the '<em><b>Left P</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__LEFT_P = eINSTANCE.getPredicate_LeftP();

    /**
     * The meta object literal for the '<em><b>Right P</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__RIGHT_P = eINSTANCE.getPredicate_RightP();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__BLOCK = eINSTANCE.getPredicate_Block();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.RunCommandImpl <em>Run Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.RunCommandImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getRunCommand()
     * @generated
     */
    EClass RUN_COMMAND = eINSTANCE.getRunCommand();

    /**
     * The meta object literal for the '<em><b>Run Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RUN_COMMAND__RUN_NAME = eINSTANCE.getRunCommand_RunName();

    /**
     * The meta object literal for the '<em><b>Name2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RUN_COMMAND__NAME2 = eINSTANCE.getRunCommand_Name2();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RUN_COMMAND__BLOCK = eINSTANCE.getRunCommand_Block();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RUN_COMMAND__SCOPE = eINSTANCE.getRunCommand_Scope();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.CheckCommandImpl <em>Check Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.CheckCommandImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getCheckCommand()
     * @generated
     */
    EClass CHECK_COMMAND = eINSTANCE.getCheckCommand();

    /**
     * The meta object literal for the '<em><b>Check Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_COMMAND__CHECK_NAME = eINSTANCE.getCheckCommand_CheckName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_COMMAND__NAME = eINSTANCE.getCheckCommand_Name();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_COMMAND__BLOCK = eINSTANCE.getCheckCommand_Block();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_COMMAND__SCOPE = eINSTANCE.getCheckCommand_Scope();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.ScopeImpl <em>Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.ScopeImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getScope()
     * @generated
     */
    EClass SCOPE = eINSTANCE.getScope();

    /**
     * The meta object literal for the '<em><b>Expect</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPE__EXPECT = eINSTANCE.getScope_Expect();

    /**
     * The meta object literal for the '<em><b>Typescope</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPE__TYPESCOPE = eINSTANCE.getScope_Typescope();

    /**
     * The meta object literal for the '<em><b>Comma</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPE__COMMA = eINSTANCE.getScope_Comma();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.ExpectationImpl <em>Expectation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.ExpectationImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getExpectation()
     * @generated
     */
    EClass EXPECTATION = eINSTANCE.getExpectation();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPECTATION__VALUE = eINSTANCE.getExpectation_Value();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.TypescopeImpl <em>Typescope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.TypescopeImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getTypescope()
     * @generated
     */
    EClass TYPESCOPE = eINSTANCE.getTypescope();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPESCOPE__NAME = eINSTANCE.getTypescope_Name();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.EnumDeclImpl <em>Enum Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.EnumDeclImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getEnumDecl()
     * @generated
     */
    EClass ENUM_DECL = eINSTANCE.getEnumDecl();

    /**
     * The meta object literal for the '<em><b>Enum Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_DECL__ENUM_NAME = eINSTANCE.getEnumDecl_EnumName();

    /**
     * The meta object literal for the '<em><b>Left C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_DECL__LEFT_C = eINSTANCE.getEnumDecl_LeftC();

    /**
     * The meta object literal for the '<em><b>Property Enum</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_DECL__PROPERTY_ENUM = eINSTANCE.getEnumDecl_PropertyEnum();

    /**
     * The meta object literal for the '<em><b>Comma</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_DECL__COMMA = eINSTANCE.getEnumDecl_Comma();

    /**
     * The meta object literal for the '<em><b>Right C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_DECL__RIGHT_C = eINSTANCE.getEnumDecl_RightC();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.SignatureImpl <em>Signature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.SignatureImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getSignature()
     * @generated
     */
    EClass SIGNATURE = eINSTANCE.getSignature();

    /**
     * The meta object literal for the '<em><b>Signature Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNATURE__SIGNATURE_NAME = eINSTANCE.getSignature_SignatureName();

    /**
     * The meta object literal for the '<em><b>Comma</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNATURE__COMMA = eINSTANCE.getSignature_Comma();

    /**
     * The meta object literal for the '<em><b>Sig Ext</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNATURE__SIG_EXT = eINSTANCE.getSignature_SigExt();

    /**
     * The meta object literal for the '<em><b>Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNATURE__DECL = eINSTANCE.getSignature_Decl();

    /**
     * The meta object literal for the '<em><b>Comma2</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNATURE__COMMA2 = eINSTANCE.getSignature_Comma2();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNATURE__BLOCK = eINSTANCE.getSignature_Block();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.SigQualImpl <em>Sig Qual</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.SigQualImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getSigQual()
     * @generated
     */
    EClass SIG_QUAL = eINSTANCE.getSigQual();

    /**
     * The meta object literal for the '<em><b>Sigq</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIG_QUAL__SIGQ = eINSTANCE.getSigQual_Sigq();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.SigExtImpl <em>Sig Ext</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.SigExtImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getSigExt()
     * @generated
     */
    EClass SIG_EXT = eINSTANCE.getSigExt();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIG_EXT__REF = eINSTANCE.getSigExt_Ref();

    /**
     * The meta object literal for the '<em><b>Ref2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIG_EXT__REF2 = eINSTANCE.getSigExt_Ref2();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.ExpressionImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Bin Op</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__BIN_OP = eINSTANCE.getExpression_BinOp();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__EXPR = eINSTANCE.getExpression_Expr();

    /**
     * The meta object literal for the '<em><b>Arrow Op</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__ARROW_OP = eINSTANCE.getExpression_ArrowOp();

    /**
     * The meta object literal for the '<em><b>Cmp</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__CMP = eINSTANCE.getExpression_Cmp();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LEFT = eINSTANCE.getExpression_Left();

    /**
     * The meta object literal for the '<em><b>Comma</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__COMMA = eINSTANCE.getExpression_Comma();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

    /**
     * The meta object literal for the '<em><b>Let</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__LET = eINSTANCE.getExpression_Let();

    /**
     * The meta object literal for the '<em><b>Letdecl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LETDECL = eINSTANCE.getExpression_Letdecl();

    /**
     * The meta object literal for the '<em><b>Block Or Bar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__BLOCK_OR_BAR = eINSTANCE.getExpression_BlockOrBar();

    /**
     * The meta object literal for the '<em><b>Quant</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__QUANT = eINSTANCE.getExpression_Quant();

    /**
     * The meta object literal for the '<em><b>Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__DECL = eINSTANCE.getExpression_Decl();

    /**
     * The meta object literal for the '<em><b>Un Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__UN_OP = eINSTANCE.getExpression_UnOp();

    /**
     * The meta object literal for the '<em><b>Common</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__COMMON = eINSTANCE.getExpression_Common();

    /**
     * The meta object literal for the '<em><b>None</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__NONE = eINSTANCE.getExpression_None();

    /**
     * The meta object literal for the '<em><b>Iden</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__IDEN = eINSTANCE.getExpression_Iden();

    /**
     * The meta object literal for the '<em><b>Univ</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__UNIV = eINSTANCE.getExpression_Univ();

    /**
     * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__INT = eINSTANCE.getExpression_Int();

    /**
     * The meta object literal for the '<em><b>Seq</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__SEQ = eINSTANCE.getExpression_Seq();

    /**
     * The meta object literal for the '<em><b>Par O</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__PAR_O = eINSTANCE.getExpression_ParO();

    /**
     * The meta object literal for the '<em><b>Par F</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__PAR_F = eINSTANCE.getExpression_ParF();

    /**
     * The meta object literal for the '<em><b>Name Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__NAME_REF = eINSTANCE.getExpression_NameRef();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__BLOCK = eINSTANCE.getExpression_Block();

    /**
     * The meta object literal for the '<em><b>Left Curly Bracket</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LEFT_CURLY_BRACKET = eINSTANCE.getExpression_LeftCurlyBracket();

    /**
     * The meta object literal for the '<em><b>Right Curly Bracket</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT_CURLY_BRACKET = eINSTANCE.getExpression_RightCurlyBracket();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.DeclImpl <em>Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.DeclImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getDecl()
     * @generated
     */
    EClass DECL = eINSTANCE.getDecl();

    /**
     * The meta object literal for the '<em><b>Property Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECL__PROPERTY_NAME = eINSTANCE.getDecl_PropertyName();

    /**
     * The meta object literal for the '<em><b>Comma</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECL__COMMA = eINSTANCE.getDecl_Comma();

    /**
     * The meta object literal for the '<em><b>Colon</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECL__COLON = eINSTANCE.getDecl_Colon();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECL__EXPR = eINSTANCE.getDecl_Expr();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.LetDeclImpl <em>Let Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.LetDeclImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getLetDecl()
     * @generated
     */
    EClass LET_DECL = eINSTANCE.getLetDecl();

    /**
     * The meta object literal for the '<em><b>Name Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET_DECL__NAME_EXPRESSION = eINSTANCE.getLetDecl_NameExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET_DECL__EXPR = eINSTANCE.getLetDecl_Expr();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.BinOpImpl <em>Bin Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.BinOpImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getBinOp()
     * @generated
     */
    EClass BIN_OP = eINSTANCE.getBinOp();

    /**
     * The meta object literal for the '<em><b>Dot</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIN_OP__DOT = eINSTANCE.getBinOp_Dot();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.UnOpImpl <em>Un Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.UnOpImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getUnOp()
     * @generated
     */
    EClass UN_OP = eINSTANCE.getUnOp();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UN_OP__OP = eINSTANCE.getUnOp_Op();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.CommonQuantUnOpImpl <em>Common Quant Un Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.CommonQuantUnOpImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getCommonQuantUnOp()
     * @generated
     */
    EClass COMMON_QUANT_UN_OP = eINSTANCE.getCommonQuantUnOp();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.ArrowOpImpl <em>Arrow Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.ArrowOpImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getArrowOp()
     * @generated
     */
    EClass ARROW_OP = eINSTANCE.getArrowOp();

    /**
     * The meta object literal for the '<em><b>Arrow</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARROW_OP__ARROW = eINSTANCE.getArrowOp_Arrow();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.BlockImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Left C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__LEFT_C = eINSTANCE.getBlock_LeftC();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__EXPR = eINSTANCE.getBlock_Expr();

    /**
     * The meta object literal for the '<em><b>Right C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__RIGHT_C = eINSTANCE.getBlock_RightC();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.BlockOrBarImpl <em>Block Or Bar</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.BlockOrBarImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getBlockOrBar()
     * @generated
     */
    EClass BLOCK_OR_BAR = eINSTANCE.getBlockOrBar();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK_OR_BAR__BLOCK = eINSTANCE.getBlockOrBar_Block();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK_OR_BAR__EXPR = eINSTANCE.getBlockOrBar_Expr();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.ModuleNameImpl <em>Module Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.ModuleNameImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getModuleName()
     * @generated
     */
    EClass MODULE_NAME = eINSTANCE.getModuleName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE_NAME__NAME = eINSTANCE.getModuleName_Name();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.OpenNameImpl <em>Open Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.OpenNameImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getOpenName()
     * @generated
     */
    EClass OPEN_NAME = eINSTANCE.getOpenName();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPEN_NAME__IMPORTED_NAMESPACE = eINSTANCE.getOpenName_ImportedNamespace();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.FactNameImpl <em>Fact Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.FactNameImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getFactName()
     * @generated
     */
    EClass FACT_NAME = eINSTANCE.getFactName();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.AssertionNameImpl <em>Assertion Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.AssertionNameImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getAssertionName()
     * @generated
     */
    EClass ASSERTION_NAME = eINSTANCE.getAssertionName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSERTION_NAME__NAME = eINSTANCE.getAssertionName_Name();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.FunctionNameImpl <em>Function Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.FunctionNameImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getFunctionName()
     * @generated
     */
    EClass FUNCTION_NAME = eINSTANCE.getFunctionName();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.PredicateNameImpl <em>Predicate Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.PredicateNameImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getPredicateName()
     * @generated
     */
    EClass PREDICATE_NAME = eINSTANCE.getPredicateName();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.AliasImpl <em>Alias</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.AliasImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getAlias()
     * @generated
     */
    EClass ALIAS = eINSTANCE.getAlias();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIAS__NAME = eINSTANCE.getAlias_Name();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.EnumNameImpl <em>Enum Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.EnumNameImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getEnumName()
     * @generated
     */
    EClass ENUM_NAME = eINSTANCE.getEnumName();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.EnumPropertyNameImpl <em>Enum Property Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.EnumPropertyNameImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getEnumPropertyName()
     * @generated
     */
    EClass ENUM_PROPERTY_NAME = eINSTANCE.getEnumPropertyName();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.SignatureNameImpl <em>Signature Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.SignatureNameImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getSignatureName()
     * @generated
     */
    EClass SIGNATURE_NAME = eINSTANCE.getSignatureName();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.PropertyNameImpl <em>Property Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.PropertyNameImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getPropertyName()
     * @generated
     */
    EClass PROPERTY_NAME = eINSTANCE.getPropertyName();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.ExactlyNameImpl <em>Exactly Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.ExactlyNameImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getExactlyName()
     * @generated
     */
    EClass EXACTLY_NAME = eINSTANCE.getExactlyName();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.ReferencesNameImpl <em>References Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.ReferencesNameImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getReferencesName()
     * @generated
     */
    EClass REFERENCES_NAME = eINSTANCE.getReferencesName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCES_NAME__NAME = eINSTANCE.getReferencesName_Name();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.ReferencesSigImpl <em>References Sig</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.ReferencesSigImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getReferencesSig()
     * @generated
     */
    EClass REFERENCES_SIG = eINSTANCE.getReferencesSig();

    /**
     * The meta object literal for the '<em><b>Name Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCES_SIG__NAME_REF = eINSTANCE.getReferencesSig_NameRef();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.RefImpl <em>Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.RefImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getRef()
     * @generated
     */
    EClass REF = eINSTANCE.getRef();

    /**
     * The meta object literal for the '<em><b>Name Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF__NAME_REF = eINSTANCE.getRef_NameRef();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.LeftCurlyBracketImpl <em>Left Curly Bracket</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.LeftCurlyBracketImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getLeftCurlyBracket()
     * @generated
     */
    EClass LEFT_CURLY_BRACKET = eINSTANCE.getLeftCurlyBracket();

    /**
     * The meta object literal for the '<em><b>Left Curly Bracket</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LEFT_CURLY_BRACKET__LEFT_CURLY_BRACKET = eINSTANCE.getLeftCurlyBracket_LeftCurlyBracket();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.RightCurlyBracketImpl <em>Right Curly Bracket</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.RightCurlyBracketImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getRightCurlyBracket()
     * @generated
     */
    EClass RIGHT_CURLY_BRACKET = eINSTANCE.getRightCurlyBracket();

    /**
     * The meta object literal for the '<em><b>Right Curly Bracket</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RIGHT_CURLY_BRACKET__RIGHT_CURLY_BRACKET = eINSTANCE.getRightCurlyBracket_RightCurlyBracket();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.DotImpl <em>Dot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.DotImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getDot()
     * @generated
     */
    EClass DOT = eINSTANCE.getDot();

    /**
     * The meta object literal for the '<em><b>Dot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOT__DOT = eINSTANCE.getDot_Dot();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.CommaImpl <em>Comma</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.CommaImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getComma()
     * @generated
     */
    EClass COMMA = eINSTANCE.getComma();

    /**
     * The meta object literal for the '<em><b>Comma</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMA__COMMA = eINSTANCE.getComma_Comma();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.ColonImpl <em>Colon</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.ColonImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getColon()
     * @generated
     */
    EClass COLON = eINSTANCE.getColon();

    /**
     * The meta object literal for the '<em><b>Colon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLON__COLON = eINSTANCE.getColon_Colon();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.LeftParenthesisImpl <em>Left Parenthesis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.LeftParenthesisImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getLeftParenthesis()
     * @generated
     */
    EClass LEFT_PARENTHESIS = eINSTANCE.getLeftParenthesis();

    /**
     * The meta object literal for the '<em><b>Left Parenthesis</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LEFT_PARENTHESIS__LEFT_PARENTHESIS = eINSTANCE.getLeftParenthesis_LeftParenthesis();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.RightParenthesisImpl <em>Right Parenthesis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.RightParenthesisImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getRightParenthesis()
     * @generated
     */
    EClass RIGHT_PARENTHESIS = eINSTANCE.getRightParenthesis();

    /**
     * The meta object literal for the '<em><b>Right Parenthesis</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RIGHT_PARENTHESIS__RIGHT_PARENTHESIS = eINSTANCE.getRightParenthesis_RightParenthesis();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.LeftSquareBracketKeywordImpl <em>Left Square Bracket Keyword</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.LeftSquareBracketKeywordImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getLeftSquareBracketKeyword()
     * @generated
     */
    EClass LEFT_SQUARE_BRACKET_KEYWORD = eINSTANCE.getLeftSquareBracketKeyword();

    /**
     * The meta object literal for the '<em><b>Left Square Bracket Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LEFT_SQUARE_BRACKET_KEYWORD__LEFT_SQUARE_BRACKET_KEYWORD = eINSTANCE.getLeftSquareBracketKeyword_LeftSquareBracketKeyword();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.xtext.als.impl.RightSquareBracketKeywordImpl <em>Right Square Bracket Keyword</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.xtext.als.impl.RightSquareBracketKeywordImpl
     * @see fr.univartois.cril.xtext.als.impl.AlsPackageImpl#getRightSquareBracketKeyword()
     * @generated
     */
    EClass RIGHT_SQUARE_BRACKET_KEYWORD = eINSTANCE.getRightSquareBracketKeyword();

    /**
     * The meta object literal for the '<em><b>Right Square Bracket Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RIGHT_SQUARE_BRACKET_KEYWORD__RIGHT_SQUARE_BRACKET_KEYWORD = eINSTANCE.getRightSquareBracketKeyword_RightSquareBracketKeyword();

  }

} //AlsPackage
