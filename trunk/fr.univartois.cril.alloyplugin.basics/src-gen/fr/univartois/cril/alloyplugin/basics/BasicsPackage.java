/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics;

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
 * @see fr.univartois.cril.alloyplugin.basics.BasicsFactory
 * @model kind="package"
 * @generated
 */
public interface BasicsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "basics";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.univartois.fr/cril/alloyplugin/Basics";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "basics";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BasicsPackage eINSTANCE = fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.SpecificationImpl <em>Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.SpecificationImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getSpecification()
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
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.ModuleImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getModule()
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
   * The feature id for the '<em><b>Suite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__SUITE = 1;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.OpenImpl <em>Open</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.OpenImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getOpen()
   * @generated
   */
  int OPEN = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN__NAME = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN__REF = 1;

  /**
   * The feature id for the '<em><b>Ref2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN__REF2 = 2;

  /**
   * The feature id for the '<em><b>Name2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN__NAME2 = 3;

  /**
   * The number of structural features of the '<em>Open</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.ParagraphImpl <em>Paragraph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.ParagraphImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getParagraph()
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
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.FactImpl <em>Fact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.FactImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getFact()
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
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT__B = PARAGRAPH_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Fact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT_FEATURE_COUNT = PARAGRAPH_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.AssertionImpl <em>Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.AssertionImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getAssertion()
   * @generated
   */
  int ASSERTION = 5;

  /**
   * The feature id for the '<em><b>Assert Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__ASSERT_NAME = PARAGRAPH_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__B = PARAGRAPH_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_FEATURE_COUNT = PARAGRAPH_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.FunctionImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getFunction()
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
   * The feature id for the '<em><b>Fun Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__FUN_NAME = PARAGRAPH_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__DECL = PARAGRAPH_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Decl2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__DECL2 = PARAGRAPH_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__EXPR = PARAGRAPH_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__B = PARAGRAPH_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = PARAGRAPH_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.PredicateImpl <em>Predicate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.PredicateImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getPredicate()
   * @generated
   */
  int PREDICATE = 7;

  /**
   * The feature id for the '<em><b>Pred</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__PRED = PARAGRAPH_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__REF = PARAGRAPH_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Pred Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__PRED_NAME = PARAGRAPH_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__DECL = PARAGRAPH_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Decl2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__DECL2 = PARAGRAPH_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__B = PARAGRAPH_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Predicate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_FEATURE_COUNT = PARAGRAPH_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.RunCommandImpl <em>Run Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.RunCommandImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getRunCommand()
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
   * The feature id for the '<em><b>Run</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_COMMAND__RUN = PARAGRAPH_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_COMMAND__NAME2 = PARAGRAPH_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_COMMAND__B = PARAGRAPH_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_COMMAND__SCOPE = PARAGRAPH_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Run Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_COMMAND_FEATURE_COUNT = PARAGRAPH_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.CheckCommandImpl <em>Check Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.CheckCommandImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getCheckCommand()
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
   * The feature id for the '<em><b>Check</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_COMMAND__CHECK = PARAGRAPH_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_COMMAND__NAME2 = PARAGRAPH_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_COMMAND__B = PARAGRAPH_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_COMMAND__SCOPE = PARAGRAPH_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Check Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_COMMAND_FEATURE_COUNT = PARAGRAPH_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.ScopeImpl <em>Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.ScopeImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getScope()
   * @generated
   */
  int SCOPE = 10;

  /**
   * The feature id for the '<em><b>Typescope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__TYPESCOPE = 0;

  /**
   * The number of structural features of the '<em>Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.TypescopeImpl <em>Typescope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.TypescopeImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getTypescope()
   * @generated
   */
  int TYPESCOPE = 11;

  /**
   * The feature id for the '<em><b>N</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPESCOPE__N = 0;

  /**
   * The number of structural features of the '<em>Typescope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPESCOPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.EnumDeclImpl <em>Enum Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.EnumDeclImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getEnumDecl()
   * @generated
   */
  int ENUM_DECL = 12;

  /**
   * The feature id for the '<em><b>Enum Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL__ENUM_NAME = PARAGRAPH_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL__NAME2 = PARAGRAPH_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name3</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL__NAME3 = PARAGRAPH_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Enum Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL_FEATURE_COUNT = PARAGRAPH_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.SignatureImpl <em>Signature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.SignatureImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getSignature()
   * @generated
   */
  int SIGNATURE = 13;

  /**
   * The feature id for the '<em><b>Sig Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE__SIG_NAME = PARAGRAPH_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE__NAME2 = PARAGRAPH_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sig Ext</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE__SIG_EXT = PARAGRAPH_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE__DECL = PARAGRAPH_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Decl2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE__DECL2 = PARAGRAPH_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE__B = PARAGRAPH_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Signature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_FEATURE_COUNT = PARAGRAPH_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.SigExtImpl <em>Sig Ext</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.SigExtImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getSigExt()
   * @generated
   */
  int SIG_EXT = 14;

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
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.BlockOrBarImpl <em>Block Or Bar</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.BlockOrBarImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getBlockOrBar()
   * @generated
   */
  int BLOCK_OR_BAR = 22;

  /**
   * The number of structural features of the '<em>Block Or Bar</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_OR_BAR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.ExpressionImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 15;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__TERM = BLOCK_OR_BAR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXPR_T = BLOCK_OR_BAR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OP = BLOCK_OR_BAR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT = BLOCK_OR_BAR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Arrow Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__ARROW_OP = BLOCK_OR_BAR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__DECL = BLOCK_OR_BAR_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__B = BLOCK_OR_BAR_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__T = BLOCK_OR_BAR_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Name Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__NAME_REF = BLOCK_OR_BAR_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Block Or Bar</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__BLOCK_OR_BAR = BLOCK_OR_BAR_FEATURE_COUNT + 9;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = BLOCK_OR_BAR_FEATURE_COUNT + 10;

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.DeclImpl <em>Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.DeclImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getDecl()
   * @generated
   */
  int DECL = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Suite</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL__SUITE = 1;

  /**
   * The feature id for the '<em><b>Expr Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL__EXPR_DECL = 2;

  /**
   * The number of structural features of the '<em>Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.Decl2Impl <em>Decl2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.Decl2Impl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getDecl2()
   * @generated
   */
  int DECL2 = 17;

  /**
   * The number of structural features of the '<em>Decl2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL2_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.LetDeclImpl <em>Let Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.LetDeclImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getLetDecl()
   * @generated
   */
  int LET_DECL = 18;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_DECL__TERM = EXPRESSION__TERM;

  /**
   * The feature id for the '<em><b>Expr T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_DECL__EXPR_T = EXPRESSION__EXPR_T;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_DECL__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_DECL__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Arrow Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_DECL__ARROW_OP = EXPRESSION__ARROW_OP;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_DECL__DECL = EXPRESSION__DECL;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_DECL__B = EXPRESSION__B;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_DECL__T = EXPRESSION__T;

  /**
   * The feature id for the '<em><b>Name Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_DECL__NAME_REF = EXPRESSION__NAME_REF;

  /**
   * The feature id for the '<em><b>Block Or Bar</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_DECL__BLOCK_OR_BAR = EXPRESSION__BLOCK_OR_BAR;

  /**
   * The feature id for the '<em><b>Let Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_DECL__LET_DECL = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Block Or Bar Bis</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_DECL__BLOCK_OR_BAR_BIS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Let Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_DECL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.ArrowOpImpl <em>Arrow Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.ArrowOpImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getArrowOp()
   * @generated
   */
  int ARROW_OP = 19;

  /**
   * The feature id for the '<em><b>S</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW_OP__S = 0;

  /**
   * The number of structural features of the '<em>Arrow Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW_OP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.BlockImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 20;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__TERM = EXPRESSION__TERM;

  /**
   * The feature id for the '<em><b>Expr T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__EXPR_T = EXPRESSION__EXPR_T;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Arrow Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__ARROW_OP = EXPRESSION__ARROW_OP;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__DECL = EXPRESSION__DECL;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__B = EXPRESSION__B;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__T = EXPRESSION__T;

  /**
   * The feature id for the '<em><b>Name Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__NAME_REF = EXPRESSION__NAME_REF;

  /**
   * The feature id for the '<em><b>Block Or Bar</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__BLOCK_OR_BAR = EXPRESSION__BLOCK_OR_BAR;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.BlockBisImpl <em>Block Bis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.BlockBisImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getBlockBis()
   * @generated
   */
  int BLOCK_BIS = 21;

  /**
   * The number of structural features of the '<em>Block Bis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_BIS_FEATURE_COUNT = BLOCK_OR_BAR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.BlockOrBarBisImpl <em>Block Or Bar Bis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.BlockOrBarBisImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getBlockOrBarBis()
   * @generated
   */
  int BLOCK_OR_BAR_BIS = 23;

  /**
   * The number of structural features of the '<em>Block Or Bar Bis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_OR_BAR_BIS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.NameImpl <em>Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.NameImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getName_()
   * @generated
   */
  int NAME = 24;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__TERM = DECL2_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__EXPR_T = DECL2_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__OP = DECL2_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__RIGHT = DECL2_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Arrow Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__ARROW_OP = DECL2_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__DECL = DECL2_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__B = DECL2_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__T = DECL2_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Name Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__NAME_REF = DECL2_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Block Or Bar</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__BLOCK_OR_BAR = DECL2_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Let Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__LET_DECL = DECL2_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Block Or Bar Bis</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__BLOCK_OR_BAR_BIS = DECL2_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Expr Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__EXPR_DECL = DECL2_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Expr Let</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__EXPR_LET = DECL2_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>This</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__THIS = DECL2_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__NAME = DECL2_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Name Complete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__NAME_COMPLETE = DECL2_FEATURE_COUNT + 16;

  /**
   * The number of structural features of the '<em>Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_FEATURE_COUNT = DECL2_FEATURE_COUNT + 17;

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.NameBisImpl <em>Name Bis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.NameBisImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getNameBis()
   * @generated
   */
  int NAME_BIS = 25;

  /**
   * The feature id for the '<em><b>Suite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_BIS__SUITE = 0;

  /**
   * The number of structural features of the '<em>Name Bis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_BIS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.univartois.cril.alloyplugin.basics.impl.RefImpl <em>Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.univartois.cril.alloyplugin.basics.impl.RefImpl
   * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getRef()
   * @generated
   */
  int REF = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF__NAME = 0;

  /**
   * The number of structural features of the '<em>Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.Specification <em>Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Specification</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Specification
   * @generated
   */
  EClass getSpecification();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Specification#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Module</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Specification#getModule()
   * @see #getSpecification()
   * @generated
   */
  EReference getSpecification_Module();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.alloyplugin.basics.Specification#getOpen <em>Open</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Open</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Specification#getOpen()
   * @see #getSpecification()
   * @generated
   */
  EReference getSpecification_Open();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.alloyplugin.basics.Specification#getParagraph <em>Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Paragraph</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Specification#getParagraph()
   * @see #getSpecification()
   * @generated
   */
  EReference getSpecification_Paragraph();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Module#getModuleName <em>Module Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Module Name</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Module#getModuleName()
   * @see #getModule()
   * @generated
   */
  EReference getModule_ModuleName();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Module#getSuite <em>Suite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suite</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Module#getSuite()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Suite();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.Open <em>Open</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Open</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Open
   * @generated
   */
  EClass getOpen();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Open#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Open#getName()
   * @see #getOpen()
   * @generated
   */
  EReference getOpen_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Open#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Open#getRef()
   * @see #getOpen()
   * @generated
   */
  EReference getOpen_Ref();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.alloyplugin.basics.Open#getRef2 <em>Ref2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref2</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Open#getRef2()
   * @see #getOpen()
   * @generated
   */
  EReference getOpen_Ref2();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Open#getName2 <em>Name2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name2</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Open#getName2()
   * @see #getOpen()
   * @generated
   */
  EReference getOpen_Name2();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.Paragraph <em>Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Paragraph</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Paragraph
   * @generated
   */
  EClass getParagraph();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.Fact <em>Fact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fact</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Fact
   * @generated
   */
  EClass getFact();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Fact#getFactName <em>Fact Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fact Name</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Fact#getFactName()
   * @see #getFact()
   * @generated
   */
  EReference getFact_FactName();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Fact#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Fact#getB()
   * @see #getFact()
   * @generated
   */
  EReference getFact_B();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.Assertion <em>Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertion</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Assertion
   * @generated
   */
  EClass getAssertion();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Assertion#getAssertName <em>Assert Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assert Name</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Assertion#getAssertName()
   * @see #getAssertion()
   * @generated
   */
  EReference getAssertion_AssertName();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Assertion#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Assertion#getB()
   * @see #getAssertion()
   * @generated
   */
  EReference getAssertion_B();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Function#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Function#getRef()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Ref();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Function#getFunName <em>Fun Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fun Name</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Function#getFunName()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_FunName();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Function#getDecl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Decl</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Function#getDecl()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Decl();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.alloyplugin.basics.Function#getDecl2 <em>Decl2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decl2</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Function#getDecl2()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Decl2();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Function#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Function#getExpr()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Expr();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Function#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Function#getB()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_B();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.Predicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Predicate
   * @generated
   */
  EClass getPredicate();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.alloyplugin.basics.Predicate#getPred <em>Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pred</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Predicate#getPred()
   * @see #getPredicate()
   * @generated
   */
  EAttribute getPredicate_Pred();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Predicate#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Predicate#getRef()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_Ref();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Predicate#getPredName <em>Pred Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pred Name</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Predicate#getPredName()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_PredName();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Predicate#getDecl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Decl</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Predicate#getDecl()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_Decl();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.alloyplugin.basics.Predicate#getDecl2 <em>Decl2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decl2</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Predicate#getDecl2()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_Decl2();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Predicate#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Predicate#getB()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_B();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.RunCommand <em>Run Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Run Command</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.RunCommand
   * @generated
   */
  EClass getRunCommand();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.RunCommand#getRunName <em>Run Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Run Name</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.RunCommand#getRunName()
   * @see #getRunCommand()
   * @generated
   */
  EReference getRunCommand_RunName();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.alloyplugin.basics.RunCommand#getRun <em>Run</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Run</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.RunCommand#getRun()
   * @see #getRunCommand()
   * @generated
   */
  EAttribute getRunCommand_Run();

  /**
   * Returns the meta object for the reference '{@link fr.univartois.cril.alloyplugin.basics.RunCommand#getName2 <em>Name2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name2</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.RunCommand#getName2()
   * @see #getRunCommand()
   * @generated
   */
  EReference getRunCommand_Name2();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.RunCommand#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.RunCommand#getB()
   * @see #getRunCommand()
   * @generated
   */
  EReference getRunCommand_B();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.RunCommand#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Scope</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.RunCommand#getScope()
   * @see #getRunCommand()
   * @generated
   */
  EReference getRunCommand_Scope();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.CheckCommand <em>Check Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check Command</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.CheckCommand
   * @generated
   */
  EClass getCheckCommand();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.CheckCommand#getCheckName <em>Check Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Check Name</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.CheckCommand#getCheckName()
   * @see #getCheckCommand()
   * @generated
   */
  EReference getCheckCommand_CheckName();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.alloyplugin.basics.CheckCommand#getCheck <em>Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Check</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.CheckCommand#getCheck()
   * @see #getCheckCommand()
   * @generated
   */
  EAttribute getCheckCommand_Check();

  /**
   * Returns the meta object for the reference '{@link fr.univartois.cril.alloyplugin.basics.CheckCommand#getName2 <em>Name2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name2</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.CheckCommand#getName2()
   * @see #getCheckCommand()
   * @generated
   */
  EReference getCheckCommand_Name2();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.CheckCommand#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.CheckCommand#getB()
   * @see #getCheckCommand()
   * @generated
   */
  EReference getCheckCommand_B();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.CheckCommand#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Scope</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.CheckCommand#getScope()
   * @see #getCheckCommand()
   * @generated
   */
  EReference getCheckCommand_Scope();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.Scope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scope</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Scope
   * @generated
   */
  EClass getScope();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Scope#getTypescope <em>Typescope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Typescope</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Scope#getTypescope()
   * @see #getScope()
   * @generated
   */
  EReference getScope_Typescope();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.Typescope <em>Typescope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typescope</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Typescope
   * @generated
   */
  EClass getTypescope();

  /**
   * Returns the meta object for the reference '{@link fr.univartois.cril.alloyplugin.basics.Typescope#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>N</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Typescope#getN()
   * @see #getTypescope()
   * @generated
   */
  EReference getTypescope_N();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.EnumDecl <em>Enum Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Decl</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.EnumDecl
   * @generated
   */
  EClass getEnumDecl();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.EnumDecl#getEnumName <em>Enum Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enum Name</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.EnumDecl#getEnumName()
   * @see #getEnumDecl()
   * @generated
   */
  EReference getEnumDecl_EnumName();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.EnumDecl#getName2 <em>Name2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name2</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.EnumDecl#getName2()
   * @see #getEnumDecl()
   * @generated
   */
  EReference getEnumDecl_Name2();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.alloyplugin.basics.EnumDecl#getName3 <em>Name3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name3</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.EnumDecl#getName3()
   * @see #getEnumDecl()
   * @generated
   */
  EReference getEnumDecl_Name3();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.Signature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signature</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Signature
   * @generated
   */
  EClass getSignature();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Signature#getSigName <em>Sig Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sig Name</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Signature#getSigName()
   * @see #getSignature()
   * @generated
   */
  EReference getSignature_SigName();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.alloyplugin.basics.Signature#getName2 <em>Name2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name2</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Signature#getName2()
   * @see #getSignature()
   * @generated
   */
  EReference getSignature_Name2();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Signature#getSigExt <em>Sig Ext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sig Ext</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Signature#getSigExt()
   * @see #getSignature()
   * @generated
   */
  EReference getSignature_SigExt();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Signature#getDecl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Decl</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Signature#getDecl()
   * @see #getSignature()
   * @generated
   */
  EReference getSignature_Decl();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.alloyplugin.basics.Signature#getDecl2 <em>Decl2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decl2</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Signature#getDecl2()
   * @see #getSignature()
   * @generated
   */
  EReference getSignature_Decl2();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Signature#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Signature#getB()
   * @see #getSignature()
   * @generated
   */
  EReference getSignature_B();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.SigExt <em>Sig Ext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sig Ext</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.SigExt
   * @generated
   */
  EClass getSigExt();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.SigExt#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.SigExt#getRef()
   * @see #getSigExt()
   * @generated
   */
  EReference getSigExt_Ref();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.alloyplugin.basics.SigExt#getRef2 <em>Ref2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref2</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.SigExt#getRef2()
   * @see #getSigExt()
   * @generated
   */
  EReference getSigExt_Ref2();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Expression#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Expression#getTerm()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Term();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Expression#getExprT <em>Expr T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr T</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Expression#getExprT()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_ExprT();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.alloyplugin.basics.Expression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Expression#getOp()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Expression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Expression#getRight()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Right();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Expression#getArrowOp <em>Arrow Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arrow Op</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Expression#getArrowOp()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_ArrowOp();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Expression#getDecl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Decl</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Expression#getDecl()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Decl();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Expression#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Expression#getB()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_B();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Expression#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Expression#getT()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_T();

  /**
   * Returns the meta object for the reference '{@link fr.univartois.cril.alloyplugin.basics.Expression#getNameRef <em>Name Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name Ref</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Expression#getNameRef()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_NameRef();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Expression#getBlockOrBar <em>Block Or Bar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block Or Bar</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Expression#getBlockOrBar()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_BlockOrBar();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.Decl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decl</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Decl
   * @generated
   */
  EClass getDecl();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Decl#getName()
   * @see #getDecl()
   * @generated
   */
  EReference getDecl_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.alloyplugin.basics.Decl#getSuite <em>Suite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Suite</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Decl#getSuite()
   * @see #getDecl()
   * @generated
   */
  EReference getDecl_Suite();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Decl#getExprDecl <em>Expr Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Decl</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Decl#getExprDecl()
   * @see #getDecl()
   * @generated
   */
  EReference getDecl_ExprDecl();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.Decl2 <em>Decl2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decl2</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Decl2
   * @generated
   */
  EClass getDecl2();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.LetDecl <em>Let Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Let Decl</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.LetDecl
   * @generated
   */
  EClass getLetDecl();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.LetDecl#getLetDecl <em>Let Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Let Decl</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.LetDecl#getLetDecl()
   * @see #getLetDecl()
   * @generated
   */
  EReference getLetDecl_LetDecl();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.LetDecl#getBlockOrBarBis <em>Block Or Bar Bis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block Or Bar Bis</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.LetDecl#getBlockOrBarBis()
   * @see #getLetDecl()
   * @generated
   */
  EReference getLetDecl_BlockOrBarBis();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.ArrowOp <em>Arrow Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arrow Op</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.ArrowOp
   * @generated
   */
  EClass getArrowOp();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.alloyplugin.basics.ArrowOp#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>S</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.ArrowOp#getS()
   * @see #getArrowOp()
   * @generated
   */
  EAttribute getArrowOp_S();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference list '{@link fr.univartois.cril.alloyplugin.basics.Block#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expr</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Block#getExpr()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Expr();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.BlockBis <em>Block Bis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Bis</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.BlockBis
   * @generated
   */
  EClass getBlockBis();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.BlockOrBar <em>Block Or Bar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Or Bar</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.BlockOrBar
   * @generated
   */
  EClass getBlockOrBar();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.BlockOrBarBis <em>Block Or Bar Bis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Or Bar Bis</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.BlockOrBarBis
   * @generated
   */
  EClass getBlockOrBarBis();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Name
   * @generated
   */
  EClass getName_();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Name#getExprDecl <em>Expr Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Decl</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Name#getExprDecl()
   * @see #getName_()
   * @generated
   */
  EReference getName_ExprDecl();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Name#getExprLet <em>Expr Let</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Let</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Name#getExprLet()
   * @see #getName_()
   * @generated
   */
  EReference getName_ExprLet();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.alloyplugin.basics.Name#getThis <em>This</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>This</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Name#getThis()
   * @see #getName_()
   * @generated
   */
  EAttribute getName_This();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.alloyplugin.basics.Name#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Name#getName()
   * @see #getName_()
   * @generated
   */
  EAttribute getName_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.univartois.cril.alloyplugin.basics.Name#getNameComplete <em>Name Complete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name Complete</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Name#getNameComplete()
   * @see #getName_()
   * @generated
   */
  EReference getName_NameComplete();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.NameBis <em>Name Bis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Bis</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.NameBis
   * @generated
   */
  EClass getNameBis();

  /**
   * Returns the meta object for the attribute '{@link fr.univartois.cril.alloyplugin.basics.NameBis#getSuite <em>Suite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Suite</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.NameBis#getSuite()
   * @see #getNameBis()
   * @generated
   */
  EAttribute getNameBis_Suite();

  /**
   * Returns the meta object for class '{@link fr.univartois.cril.alloyplugin.basics.Ref <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Ref
   * @generated
   */
  EClass getRef();

  /**
   * Returns the meta object for the reference '{@link fr.univartois.cril.alloyplugin.basics.Ref#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see fr.univartois.cril.alloyplugin.basics.Ref#getName()
   * @see #getRef()
   * @generated
   */
  EReference getRef_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BasicsFactory getBasicsFactory();

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
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.SpecificationImpl <em>Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.SpecificationImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getSpecification()
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
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.ModuleImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getModule()
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
     * The meta object literal for the '<em><b>Suite</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__SUITE = eINSTANCE.getModule_Suite();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.OpenImpl <em>Open</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.OpenImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getOpen()
     * @generated
     */
    EClass OPEN = eINSTANCE.getOpen();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPEN__NAME = eINSTANCE.getOpen_Name();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPEN__REF = eINSTANCE.getOpen_Ref();

    /**
     * The meta object literal for the '<em><b>Ref2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPEN__REF2 = eINSTANCE.getOpen_Ref2();

    /**
     * The meta object literal for the '<em><b>Name2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPEN__NAME2 = eINSTANCE.getOpen_Name2();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.ParagraphImpl <em>Paragraph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.ParagraphImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getParagraph()
     * @generated
     */
    EClass PARAGRAPH = eINSTANCE.getParagraph();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.FactImpl <em>Fact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.FactImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getFact()
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
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACT__B = eINSTANCE.getFact_B();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.AssertionImpl <em>Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.AssertionImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getAssertion()
     * @generated
     */
    EClass ASSERTION = eINSTANCE.getAssertion();

    /**
     * The meta object literal for the '<em><b>Assert Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION__ASSERT_NAME = eINSTANCE.getAssertion_AssertName();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION__B = eINSTANCE.getAssertion_B();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.FunctionImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getFunction()
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
     * The meta object literal for the '<em><b>Fun Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__FUN_NAME = eINSTANCE.getFunction_FunName();

    /**
     * The meta object literal for the '<em><b>Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__DECL = eINSTANCE.getFunction_Decl();

    /**
     * The meta object literal for the '<em><b>Decl2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__DECL2 = eINSTANCE.getFunction_Decl2();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__EXPR = eINSTANCE.getFunction_Expr();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__B = eINSTANCE.getFunction_B();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.PredicateImpl <em>Predicate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.PredicateImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getPredicate()
     * @generated
     */
    EClass PREDICATE = eINSTANCE.getPredicate();

    /**
     * The meta object literal for the '<em><b>Pred</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREDICATE__PRED = eINSTANCE.getPredicate_Pred();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__REF = eINSTANCE.getPredicate_Ref();

    /**
     * The meta object literal for the '<em><b>Pred Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__PRED_NAME = eINSTANCE.getPredicate_PredName();

    /**
     * The meta object literal for the '<em><b>Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__DECL = eINSTANCE.getPredicate_Decl();

    /**
     * The meta object literal for the '<em><b>Decl2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__DECL2 = eINSTANCE.getPredicate_Decl2();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__B = eINSTANCE.getPredicate_B();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.RunCommandImpl <em>Run Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.RunCommandImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getRunCommand()
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
     * The meta object literal for the '<em><b>Run</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RUN_COMMAND__RUN = eINSTANCE.getRunCommand_Run();

    /**
     * The meta object literal for the '<em><b>Name2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RUN_COMMAND__NAME2 = eINSTANCE.getRunCommand_Name2();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RUN_COMMAND__B = eINSTANCE.getRunCommand_B();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RUN_COMMAND__SCOPE = eINSTANCE.getRunCommand_Scope();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.CheckCommandImpl <em>Check Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.CheckCommandImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getCheckCommand()
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
     * The meta object literal for the '<em><b>Check</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECK_COMMAND__CHECK = eINSTANCE.getCheckCommand_Check();

    /**
     * The meta object literal for the '<em><b>Name2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_COMMAND__NAME2 = eINSTANCE.getCheckCommand_Name2();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_COMMAND__B = eINSTANCE.getCheckCommand_B();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_COMMAND__SCOPE = eINSTANCE.getCheckCommand_Scope();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.ScopeImpl <em>Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.ScopeImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getScope()
     * @generated
     */
    EClass SCOPE = eINSTANCE.getScope();

    /**
     * The meta object literal for the '<em><b>Typescope</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPE__TYPESCOPE = eINSTANCE.getScope_Typescope();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.TypescopeImpl <em>Typescope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.TypescopeImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getTypescope()
     * @generated
     */
    EClass TYPESCOPE = eINSTANCE.getTypescope();

    /**
     * The meta object literal for the '<em><b>N</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPESCOPE__N = eINSTANCE.getTypescope_N();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.EnumDeclImpl <em>Enum Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.EnumDeclImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getEnumDecl()
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
     * The meta object literal for the '<em><b>Name2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_DECL__NAME2 = eINSTANCE.getEnumDecl_Name2();

    /**
     * The meta object literal for the '<em><b>Name3</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_DECL__NAME3 = eINSTANCE.getEnumDecl_Name3();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.SignatureImpl <em>Signature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.SignatureImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getSignature()
     * @generated
     */
    EClass SIGNATURE = eINSTANCE.getSignature();

    /**
     * The meta object literal for the '<em><b>Sig Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNATURE__SIG_NAME = eINSTANCE.getSignature_SigName();

    /**
     * The meta object literal for the '<em><b>Name2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNATURE__NAME2 = eINSTANCE.getSignature_Name2();

    /**
     * The meta object literal for the '<em><b>Sig Ext</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNATURE__SIG_EXT = eINSTANCE.getSignature_SigExt();

    /**
     * The meta object literal for the '<em><b>Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNATURE__DECL = eINSTANCE.getSignature_Decl();

    /**
     * The meta object literal for the '<em><b>Decl2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNATURE__DECL2 = eINSTANCE.getSignature_Decl2();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNATURE__B = eINSTANCE.getSignature_B();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.SigExtImpl <em>Sig Ext</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.SigExtImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getSigExt()
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
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.ExpressionImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__TERM = eINSTANCE.getExpression_Term();

    /**
     * The meta object literal for the '<em><b>Expr T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__EXPR_T = eINSTANCE.getExpression_ExprT();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__OP = eINSTANCE.getExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

    /**
     * The meta object literal for the '<em><b>Arrow Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__ARROW_OP = eINSTANCE.getExpression_ArrowOp();

    /**
     * The meta object literal for the '<em><b>Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__DECL = eINSTANCE.getExpression_Decl();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__B = eINSTANCE.getExpression_B();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__T = eINSTANCE.getExpression_T();

    /**
     * The meta object literal for the '<em><b>Name Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__NAME_REF = eINSTANCE.getExpression_NameRef();

    /**
     * The meta object literal for the '<em><b>Block Or Bar</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__BLOCK_OR_BAR = eINSTANCE.getExpression_BlockOrBar();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.DeclImpl <em>Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.DeclImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getDecl()
     * @generated
     */
    EClass DECL = eINSTANCE.getDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECL__NAME = eINSTANCE.getDecl_Name();

    /**
     * The meta object literal for the '<em><b>Suite</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECL__SUITE = eINSTANCE.getDecl_Suite();

    /**
     * The meta object literal for the '<em><b>Expr Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECL__EXPR_DECL = eINSTANCE.getDecl_ExprDecl();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.Decl2Impl <em>Decl2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.Decl2Impl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getDecl2()
     * @generated
     */
    EClass DECL2 = eINSTANCE.getDecl2();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.LetDeclImpl <em>Let Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.LetDeclImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getLetDecl()
     * @generated
     */
    EClass LET_DECL = eINSTANCE.getLetDecl();

    /**
     * The meta object literal for the '<em><b>Let Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET_DECL__LET_DECL = eINSTANCE.getLetDecl_LetDecl();

    /**
     * The meta object literal for the '<em><b>Block Or Bar Bis</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET_DECL__BLOCK_OR_BAR_BIS = eINSTANCE.getLetDecl_BlockOrBarBis();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.ArrowOpImpl <em>Arrow Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.ArrowOpImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getArrowOp()
     * @generated
     */
    EClass ARROW_OP = eINSTANCE.getArrowOp();

    /**
     * The meta object literal for the '<em><b>S</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARROW_OP__S = eINSTANCE.getArrowOp_S();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.BlockImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__EXPR = eINSTANCE.getBlock_Expr();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.BlockBisImpl <em>Block Bis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.BlockBisImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getBlockBis()
     * @generated
     */
    EClass BLOCK_BIS = eINSTANCE.getBlockBis();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.BlockOrBarImpl <em>Block Or Bar</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.BlockOrBarImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getBlockOrBar()
     * @generated
     */
    EClass BLOCK_OR_BAR = eINSTANCE.getBlockOrBar();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.BlockOrBarBisImpl <em>Block Or Bar Bis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.BlockOrBarBisImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getBlockOrBarBis()
     * @generated
     */
    EClass BLOCK_OR_BAR_BIS = eINSTANCE.getBlockOrBarBis();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.NameImpl <em>Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.NameImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getName_()
     * @generated
     */
    EClass NAME = eINSTANCE.getName_();

    /**
     * The meta object literal for the '<em><b>Expr Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME__EXPR_DECL = eINSTANCE.getName_ExprDecl();

    /**
     * The meta object literal for the '<em><b>Expr Let</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME__EXPR_LET = eINSTANCE.getName_ExprLet();

    /**
     * The meta object literal for the '<em><b>This</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME__THIS = eINSTANCE.getName_This();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME__NAME = eINSTANCE.getName_Name();

    /**
     * The meta object literal for the '<em><b>Name Complete</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME__NAME_COMPLETE = eINSTANCE.getName_NameComplete();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.NameBisImpl <em>Name Bis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.NameBisImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getNameBis()
     * @generated
     */
    EClass NAME_BIS = eINSTANCE.getNameBis();

    /**
     * The meta object literal for the '<em><b>Suite</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_BIS__SUITE = eINSTANCE.getNameBis_Suite();

    /**
     * The meta object literal for the '{@link fr.univartois.cril.alloyplugin.basics.impl.RefImpl <em>Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.univartois.cril.alloyplugin.basics.impl.RefImpl
     * @see fr.univartois.cril.alloyplugin.basics.impl.BasicsPackageImpl#getRef()
     * @generated
     */
    EClass REF = eINSTANCE.getRef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF__NAME = eINSTANCE.getRef_Name();

  }

} //BasicsPackage
