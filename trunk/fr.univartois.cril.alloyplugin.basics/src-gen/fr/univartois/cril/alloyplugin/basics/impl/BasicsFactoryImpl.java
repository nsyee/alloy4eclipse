/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics.impl;

import fr.univartois.cril.alloyplugin.basics.*;

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
public class BasicsFactoryImpl extends EFactoryImpl implements BasicsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BasicsFactory init()
  {
    try
    {
      BasicsFactory theBasicsFactory = (BasicsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.univartois.fr/cril/alloyplugin/Basics"); 
      if (theBasicsFactory != null)
      {
        return theBasicsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BasicsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicsFactoryImpl()
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
      case BasicsPackage.SPECIFICATION: return createSpecification();
      case BasicsPackage.MODULE: return createModule();
      case BasicsPackage.OPEN: return createOpen();
      case BasicsPackage.PARAGRAPH: return createParagraph();
      case BasicsPackage.FACT: return createFact();
      case BasicsPackage.ASSERTION: return createAssertion();
      case BasicsPackage.FUNCTION: return createFunction();
      case BasicsPackage.PREDICATE: return createPredicate();
      case BasicsPackage.RUN_COMMAND: return createRunCommand();
      case BasicsPackage.CHECK_COMMAND: return createCheckCommand();
      case BasicsPackage.SCOPE: return createScope();
      case BasicsPackage.TYPESCOPE: return createTypescope();
      case BasicsPackage.ENUM_DECL: return createEnumDecl();
      case BasicsPackage.SIGNATURE: return createSignature();
      case BasicsPackage.SIG_EXT: return createSigExt();
      case BasicsPackage.EXPRESSION: return createExpression();
      case BasicsPackage.DECL: return createDecl();
      case BasicsPackage.DECL2: return createDecl2();
      case BasicsPackage.LET_DECL: return createLetDecl();
      case BasicsPackage.ARROW_OP: return createArrowOp();
      case BasicsPackage.BLOCK: return createBlock();
      case BasicsPackage.BLOCK_BIS: return createBlockBis();
      case BasicsPackage.BLOCK_OR_BAR: return createBlockOrBar();
      case BasicsPackage.BLOCK_OR_BAR_BIS: return createBlockOrBarBis();
      case BasicsPackage.NAME: return createName();
      case BasicsPackage.NAME_BIS: return createNameBis();
      case BasicsPackage.REF: return createRef();
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
  public Decl2 createDecl2()
  {
    Decl2Impl decl2 = new Decl2Impl();
    return decl2;
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
  public BlockBis createBlockBis()
  {
    BlockBisImpl blockBis = new BlockBisImpl();
    return blockBis;
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
  public BlockOrBarBis createBlockOrBarBis()
  {
    BlockOrBarBisImpl blockOrBarBis = new BlockOrBarBisImpl();
    return blockOrBarBis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name createName()
  {
    NameImpl name = new NameImpl();
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameBis createNameBis()
  {
    NameBisImpl nameBis = new NameBisImpl();
    return nameBis;
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
  public BasicsPackage getBasicsPackage()
  {
    return (BasicsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BasicsPackage getPackage()
  {
    return BasicsPackage.eINSTANCE;
  }

} //BasicsFactoryImpl
