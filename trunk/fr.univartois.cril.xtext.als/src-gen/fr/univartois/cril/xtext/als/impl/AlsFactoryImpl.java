/**
 * <copyright>
 * </copyright>
 *

 */
package fr.univartois.cril.xtext.als.impl;

import fr.univartois.cril.xtext.als.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlsFactoryImpl extends EFactoryImpl implements AlsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AlsFactory init()
  {
    try
    {
      AlsFactory theAlsFactory = (AlsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.univartois.fr/cril/xtext/Als"); 
      if (theAlsFactory != null)
      {
        return theAlsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AlsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlsFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AlsPackage.SPECIFICATION: return createSpecification();
      case AlsPackage.MODULE: return createModule();
      case AlsPackage.OPEN: return createOpen();
      case AlsPackage.PARAGRAPH: return createParagraph();
      case AlsPackage.FACT: return createFact();
      case AlsPackage.ASSERTION: return createAssertion();
      case AlsPackage.FUNCTION: return createFunction();
      case AlsPackage.PREDICATE: return createPredicate();
      case AlsPackage.RUN_COMMAND: return createRunCommand();
      case AlsPackage.CHECK_COMMAND: return createCheckCommand();
      case AlsPackage.SCOPE: return createScope();
      case AlsPackage.EXPECTATION: return createExpectation();
      case AlsPackage.TYPESCOPE: return createTypescope();
      case AlsPackage.ENUM_DECL: return createEnumDecl();
      case AlsPackage.SIGNATURE: return createSignature();
      case AlsPackage.SIG_QUAL: return createSigQual();
      case AlsPackage.SIG_EXT: return createSigExt();
      case AlsPackage.EXPRESSION: return createExpression();
      case AlsPackage.DECL: return createDecl();
      case AlsPackage.LET_DECL: return createLetDecl();
      case AlsPackage.BIN_OP: return createBinOp();
      case AlsPackage.UN_OP: return createUnOp();
      case AlsPackage.COMMON_QUANT_UN_OP: return createCommonQuantUnOp();
      case AlsPackage.ARROW_OP: return createArrowOp();
      case AlsPackage.BLOCK: return createBlock();
      case AlsPackage.BLOCK_OR_BAR: return createBlockOrBar();
      case AlsPackage.MODULE_NAME: return createModuleName();
      case AlsPackage.OPEN_NAME: return createOpenName();
      case AlsPackage.FACT_NAME: return createFactName();
      case AlsPackage.ASSERTION_NAME: return createAssertionName();
      case AlsPackage.FUNCTION_NAME: return createFunctionName();
      case AlsPackage.PREDICATE_NAME: return createPredicateName();
      case AlsPackage.ALIAS: return createAlias();
      case AlsPackage.ENUM_NAME: return createEnumName();
      case AlsPackage.ENUM_PROPERTY_NAME: return createEnumPropertyName();
      case AlsPackage.SIGNATURE_NAME: return createSignatureName();
      case AlsPackage.PROPERTY_NAME: return createPropertyName();
      case AlsPackage.EXACTLY_NAME: return createExactlyName();
      case AlsPackage.REFERENCES_NAME: return createReferencesName();
      case AlsPackage.REFERENCES_SIG: return createReferencesSig();
      case AlsPackage.REF: return createRef();
      case AlsPackage.LEFT_CURLY_BRACKET: return createLeftCurlyBracket();
      case AlsPackage.RIGHT_CURLY_BRACKET: return createRightCurlyBracket();
      case AlsPackage.DOT: return createDot();
      case AlsPackage.COMMA: return createComma();
      case AlsPackage.COLON: return createColon();
      case AlsPackage.LEFT_PARENTHESIS: return createLeftParenthesis();
      case AlsPackage.RIGHT_PARENTHESIS: return createRightParenthesis();
      case AlsPackage.LEFT_SQUARE_BRACKET_KEYWORD: return createLeftSquareBracketKeyword();
      case AlsPackage.RIGHT_SQUARE_BRACKET_KEYWORD: return createRightSquareBracketKeyword();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Specification createSpecification()
  {
    SpecificationImpl specification = new SpecificationImpl();
    return specification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Open createOpen()
  {
    OpenImpl open = new OpenImpl();
    return open;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Paragraph createParagraph()
  {
    ParagraphImpl paragraph = new ParagraphImpl();
    return paragraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fact createFact()
  {
    FactImpl fact = new FactImpl();
    return fact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assertion createAssertion()
  {
    AssertionImpl assertion = new AssertionImpl();
    return assertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Predicate createPredicate()
  {
    PredicateImpl predicate = new PredicateImpl();
    return predicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RunCommand createRunCommand()
  {
    RunCommandImpl runCommand = new RunCommandImpl();
    return runCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckCommand createCheckCommand()
  {
    CheckCommandImpl checkCommand = new CheckCommandImpl();
    return checkCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scope createScope()
  {
    ScopeImpl scope = new ScopeImpl();
    return scope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expectation createExpectation()
  {
    ExpectationImpl expectation = new ExpectationImpl();
    return expectation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Typescope createTypescope()
  {
    TypescopeImpl typescope = new TypescopeImpl();
    return typescope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumDecl createEnumDecl()
  {
    EnumDeclImpl enumDecl = new EnumDeclImpl();
    return enumDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signature createSignature()
  {
    SignatureImpl signature = new SignatureImpl();
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SigQual createSigQual()
  {
    SigQualImpl sigQual = new SigQualImpl();
    return sigQual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SigExt createSigExt()
  {
    SigExtImpl sigExt = new SigExtImpl();
    return sigExt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decl createDecl()
  {
    DeclImpl decl = new DeclImpl();
    return decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LetDecl createLetDecl()
  {
    LetDeclImpl letDecl = new LetDeclImpl();
    return letDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinOp createBinOp()
  {
    BinOpImpl binOp = new BinOpImpl();
    return binOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnOp createUnOp()
  {
    UnOpImpl unOp = new UnOpImpl();
    return unOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommonQuantUnOp createCommonQuantUnOp()
  {
    CommonQuantUnOpImpl commonQuantUnOp = new CommonQuantUnOpImpl();
    return commonQuantUnOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrowOp createArrowOp()
  {
    ArrowOpImpl arrowOp = new ArrowOpImpl();
    return arrowOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockOrBar createBlockOrBar()
  {
    BlockOrBarImpl blockOrBar = new BlockOrBarImpl();
    return blockOrBar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleName createModuleName()
  {
    ModuleNameImpl moduleName = new ModuleNameImpl();
    return moduleName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpenName createOpenName()
  {
    OpenNameImpl openName = new OpenNameImpl();
    return openName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FactName createFactName()
  {
    FactNameImpl factName = new FactNameImpl();
    return factName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertionName createAssertionName()
  {
    AssertionNameImpl assertionName = new AssertionNameImpl();
    return assertionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionName createFunctionName()
  {
    FunctionNameImpl functionName = new FunctionNameImpl();
    return functionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateName createPredicateName()
  {
    PredicateNameImpl predicateName = new PredicateNameImpl();
    return predicateName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alias createAlias()
  {
    AliasImpl alias = new AliasImpl();
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumName createEnumName()
  {
    EnumNameImpl enumName = new EnumNameImpl();
    return enumName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumPropertyName createEnumPropertyName()
  {
    EnumPropertyNameImpl enumPropertyName = new EnumPropertyNameImpl();
    return enumPropertyName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignatureName createSignatureName()
  {
    SignatureNameImpl signatureName = new SignatureNameImpl();
    return signatureName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyName createPropertyName()
  {
    PropertyNameImpl propertyName = new PropertyNameImpl();
    return propertyName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExactlyName createExactlyName()
  {
    ExactlyNameImpl exactlyName = new ExactlyNameImpl();
    return exactlyName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferencesName createReferencesName()
  {
    ReferencesNameImpl referencesName = new ReferencesNameImpl();
    return referencesName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferencesSig createReferencesSig()
  {
    ReferencesSigImpl referencesSig = new ReferencesSigImpl();
    return referencesSig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ref createRef()
  {
    RefImpl ref = new RefImpl();
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftCurlyBracket createLeftCurlyBracket()
  {
    LeftCurlyBracketImpl leftCurlyBracket = new LeftCurlyBracketImpl();
    return leftCurlyBracket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightCurlyBracket createRightCurlyBracket()
  {
    RightCurlyBracketImpl rightCurlyBracket = new RightCurlyBracketImpl();
    return rightCurlyBracket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dot createDot()
  {
    DotImpl dot = new DotImpl();
    return dot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comma createComma()
  {
    CommaImpl comma = new CommaImpl();
    return comma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Colon createColon()
  {
    ColonImpl colon = new ColonImpl();
    return colon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftParenthesis createLeftParenthesis()
  {
    LeftParenthesisImpl leftParenthesis = new LeftParenthesisImpl();
    return leftParenthesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightParenthesis createRightParenthesis()
  {
    RightParenthesisImpl rightParenthesis = new RightParenthesisImpl();
    return rightParenthesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftSquareBracketKeyword createLeftSquareBracketKeyword()
  {
    LeftSquareBracketKeywordImpl leftSquareBracketKeyword = new LeftSquareBracketKeywordImpl();
    return leftSquareBracketKeyword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightSquareBracketKeyword createRightSquareBracketKeyword()
  {
    RightSquareBracketKeywordImpl rightSquareBracketKeyword = new RightSquareBracketKeywordImpl();
    return rightSquareBracketKeyword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlsPackage getAlsPackage()
  {
    return (AlsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AlsPackage getPackage()
  {
    return AlsPackage.eINSTANCE;
  }

} //AlsFactoryImpl
