/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics.impl;

import fr.univartois.cril.alloyplugin.basics.ArrowOp;
import fr.univartois.cril.alloyplugin.basics.AssertDecl;
import fr.univartois.cril.alloyplugin.basics.BasicsFactory;
import fr.univartois.cril.alloyplugin.basics.BasicsPackage;
import fr.univartois.cril.alloyplugin.basics.Block;
import fr.univartois.cril.alloyplugin.basics.BlockBis;
import fr.univartois.cril.alloyplugin.basics.BlockOrBar;
import fr.univartois.cril.alloyplugin.basics.BlockOrBarBis;
import fr.univartois.cril.alloyplugin.basics.CheckDecl;
import fr.univartois.cril.alloyplugin.basics.Decl;
import fr.univartois.cril.alloyplugin.basics.Decl2;
import fr.univartois.cril.alloyplugin.basics.EnumDecl;
import fr.univartois.cril.alloyplugin.basics.Expression;
import fr.univartois.cril.alloyplugin.basics.FactDecl;
import fr.univartois.cril.alloyplugin.basics.FunDecl;
import fr.univartois.cril.alloyplugin.basics.LetDecl;
import fr.univartois.cril.alloyplugin.basics.Module;
import fr.univartois.cril.alloyplugin.basics.Name;
import fr.univartois.cril.alloyplugin.basics.NameBis;
import fr.univartois.cril.alloyplugin.basics.Open;
import fr.univartois.cril.alloyplugin.basics.Paragraph;
import fr.univartois.cril.alloyplugin.basics.PredDecl;
import fr.univartois.cril.alloyplugin.basics.Ref;
import fr.univartois.cril.alloyplugin.basics.RunDecl;
import fr.univartois.cril.alloyplugin.basics.Scope;
import fr.univartois.cril.alloyplugin.basics.SigDecl;
import fr.univartois.cril.alloyplugin.basics.SigExt;
import fr.univartois.cril.alloyplugin.basics.Specification;
import fr.univartois.cril.alloyplugin.basics.Typescope;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicsPackageImpl extends EPackageImpl implements BasicsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass specificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass openEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paragraphEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass factDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assertDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass funDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass runDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass checkDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typescopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sigDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sigExtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decl2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass letDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrowOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockBisEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockOrBarEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockOrBarBisEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameBisEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BasicsPackageImpl()
  {
    super(eNS_URI, BasicsFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link BasicsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BasicsPackage init()
  {
    if (isInited) return (BasicsPackage)EPackage.Registry.INSTANCE.getEPackage(BasicsPackage.eNS_URI);

    // Obtain or create and register package
    BasicsPackageImpl theBasicsPackage = (BasicsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BasicsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BasicsPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theBasicsPackage.createPackageContents();

    // Initialize created meta-data
    theBasicsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBasicsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BasicsPackage.eNS_URI, theBasicsPackage);
    return theBasicsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpecification()
  {
    return specificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpecification_Module()
  {
    return (EReference)specificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpecification_Open()
  {
    return (EReference)specificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpecification_Paragraph()
  {
    return (EReference)specificationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModule()
  {
    return moduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_ModuleName()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Suite()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOpen()
  {
    return openEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOpen_Name()
  {
    return (EReference)openEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOpen_Ref()
  {
    return (EReference)openEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOpen_Ref2()
  {
    return (EReference)openEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOpen_Name2()
  {
    return (EReference)openEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParagraph()
  {
    return paragraphEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFactDecl()
  {
    return factDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFactDecl_FactName()
  {
    return (EReference)factDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFactDecl_B()
  {
    return (EReference)factDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssertDecl()
  {
    return assertDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertDecl_AssertName()
  {
    return (EReference)assertDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertDecl_B()
  {
    return (EReference)assertDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunDecl()
  {
    return funDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunDecl_Ref()
  {
    return (EReference)funDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunDecl_FunName()
  {
    return (EReference)funDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunDecl_Decl()
  {
    return (EReference)funDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunDecl_Decl2()
  {
    return (EReference)funDeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunDecl_Expr()
  {
    return (EReference)funDeclEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunDecl_B()
  {
    return (EReference)funDeclEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPredDecl()
  {
    return predDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPredDecl_Pred()
  {
    return (EAttribute)predDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredDecl_Ref()
  {
    return (EReference)predDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredDecl_PredName()
  {
    return (EReference)predDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredDecl_Decl()
  {
    return (EReference)predDeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredDecl_Decl2()
  {
    return (EReference)predDeclEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredDecl_B()
  {
    return (EReference)predDeclEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRunDecl()
  {
    return runDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRunDecl_RunName()
  {
    return (EReference)runDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRunDecl_Run()
  {
    return (EAttribute)runDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRunDecl_Name2()
  {
    return (EReference)runDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRunDecl_B()
  {
    return (EReference)runDeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRunDecl_Scope()
  {
    return (EReference)runDeclEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCheckDecl()
  {
    return checkDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckDecl_CheckName()
  {
    return (EReference)checkDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCheckDecl_Check()
  {
    return (EAttribute)checkDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckDecl_Name2()
  {
    return (EReference)checkDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckDecl_B()
  {
    return (EReference)checkDeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckDecl_Scope()
  {
    return (EReference)checkDeclEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScope()
  {
    return scopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScope_Typescope()
  {
    return (EReference)scopeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypescope()
  {
    return typescopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypescope_N()
  {
    return (EReference)typescopeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumDecl()
  {
    return enumDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumDecl_EnumName()
  {
    return (EReference)enumDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumDecl_Name2()
  {
    return (EReference)enumDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumDecl_Name3()
  {
    return (EReference)enumDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSigDecl()
  {
    return sigDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSigDecl_SigName()
  {
    return (EReference)sigDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSigDecl_Name2()
  {
    return (EReference)sigDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSigDecl_SigExt()
  {
    return (EReference)sigDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSigDecl_Decl()
  {
    return (EReference)sigDeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSigDecl_Decl2()
  {
    return (EReference)sigDeclEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSigDecl_B()
  {
    return (EReference)sigDeclEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSigExt()
  {
    return sigExtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSigExt_Ref()
  {
    return (EReference)sigExtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSigExt_Ref2()
  {
    return (EReference)sigExtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Term()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_ExprT()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_Op()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Right()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_ArrowOp()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Decl()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_B()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_T()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_NameRef()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_BlockOrBar()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecl()
  {
    return declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecl_Name()
  {
    return (EReference)declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecl_Suite()
  {
    return (EReference)declEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecl_ExprDecl()
  {
    return (EReference)declEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecl2()
  {
    return decl2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLetDecl()
  {
    return letDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLetDecl_LetDecl()
  {
    return (EReference)letDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLetDecl_BlockOrBarBis()
  {
    return (EReference)letDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrowOp()
  {
    return arrowOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrowOp_S()
  {
    return (EAttribute)arrowOpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlock()
  {
    return blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlock_Expr()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlockBis()
  {
    return blockBisEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlockOrBar()
  {
    return blockOrBarEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlockOrBarBis()
  {
    return blockOrBarBisEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getName_()
  {
    return nameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getName_ExprDecl()
  {
    return (EReference)nameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getName_ExprLet()
  {
    return (EReference)nameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getName_This()
  {
    return (EAttribute)nameEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getName_Name()
  {
    return (EAttribute)nameEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getName_NameComplete()
  {
    return (EReference)nameEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameBis()
  {
    return nameBisEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameBis_Suite()
  {
    return (EAttribute)nameBisEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRef()
  {
    return refEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRef_Name()
  {
    return (EReference)refEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicsFactory getBasicsFactory()
  {
    return (BasicsFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    specificationEClass = createEClass(SPECIFICATION);
    createEReference(specificationEClass, SPECIFICATION__MODULE);
    createEReference(specificationEClass, SPECIFICATION__OPEN);
    createEReference(specificationEClass, SPECIFICATION__PARAGRAPH);

    moduleEClass = createEClass(MODULE);
    createEReference(moduleEClass, MODULE__MODULE_NAME);
    createEReference(moduleEClass, MODULE__SUITE);

    openEClass = createEClass(OPEN);
    createEReference(openEClass, OPEN__NAME);
    createEReference(openEClass, OPEN__REF);
    createEReference(openEClass, OPEN__REF2);
    createEReference(openEClass, OPEN__NAME2);

    paragraphEClass = createEClass(PARAGRAPH);

    factDeclEClass = createEClass(FACT_DECL);
    createEReference(factDeclEClass, FACT_DECL__FACT_NAME);
    createEReference(factDeclEClass, FACT_DECL__B);

    assertDeclEClass = createEClass(ASSERT_DECL);
    createEReference(assertDeclEClass, ASSERT_DECL__ASSERT_NAME);
    createEReference(assertDeclEClass, ASSERT_DECL__B);

    funDeclEClass = createEClass(FUN_DECL);
    createEReference(funDeclEClass, FUN_DECL__REF);
    createEReference(funDeclEClass, FUN_DECL__FUN_NAME);
    createEReference(funDeclEClass, FUN_DECL__DECL);
    createEReference(funDeclEClass, FUN_DECL__DECL2);
    createEReference(funDeclEClass, FUN_DECL__EXPR);
    createEReference(funDeclEClass, FUN_DECL__B);

    predDeclEClass = createEClass(PRED_DECL);
    createEAttribute(predDeclEClass, PRED_DECL__PRED);
    createEReference(predDeclEClass, PRED_DECL__REF);
    createEReference(predDeclEClass, PRED_DECL__PRED_NAME);
    createEReference(predDeclEClass, PRED_DECL__DECL);
    createEReference(predDeclEClass, PRED_DECL__DECL2);
    createEReference(predDeclEClass, PRED_DECL__B);

    runDeclEClass = createEClass(RUN_DECL);
    createEReference(runDeclEClass, RUN_DECL__RUN_NAME);
    createEAttribute(runDeclEClass, RUN_DECL__RUN);
    createEReference(runDeclEClass, RUN_DECL__NAME2);
    createEReference(runDeclEClass, RUN_DECL__B);
    createEReference(runDeclEClass, RUN_DECL__SCOPE);

    checkDeclEClass = createEClass(CHECK_DECL);
    createEReference(checkDeclEClass, CHECK_DECL__CHECK_NAME);
    createEAttribute(checkDeclEClass, CHECK_DECL__CHECK);
    createEReference(checkDeclEClass, CHECK_DECL__NAME2);
    createEReference(checkDeclEClass, CHECK_DECL__B);
    createEReference(checkDeclEClass, CHECK_DECL__SCOPE);

    scopeEClass = createEClass(SCOPE);
    createEReference(scopeEClass, SCOPE__TYPESCOPE);

    typescopeEClass = createEClass(TYPESCOPE);
    createEReference(typescopeEClass, TYPESCOPE__N);

    enumDeclEClass = createEClass(ENUM_DECL);
    createEReference(enumDeclEClass, ENUM_DECL__ENUM_NAME);
    createEReference(enumDeclEClass, ENUM_DECL__NAME2);
    createEReference(enumDeclEClass, ENUM_DECL__NAME3);

    sigDeclEClass = createEClass(SIG_DECL);
    createEReference(sigDeclEClass, SIG_DECL__SIG_NAME);
    createEReference(sigDeclEClass, SIG_DECL__NAME2);
    createEReference(sigDeclEClass, SIG_DECL__SIG_EXT);
    createEReference(sigDeclEClass, SIG_DECL__DECL);
    createEReference(sigDeclEClass, SIG_DECL__DECL2);
    createEReference(sigDeclEClass, SIG_DECL__B);

    sigExtEClass = createEClass(SIG_EXT);
    createEReference(sigExtEClass, SIG_EXT__REF);
    createEReference(sigExtEClass, SIG_EXT__REF2);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__TERM);
    createEReference(expressionEClass, EXPRESSION__EXPR_T);
    createEAttribute(expressionEClass, EXPRESSION__OP);
    createEReference(expressionEClass, EXPRESSION__RIGHT);
    createEReference(expressionEClass, EXPRESSION__ARROW_OP);
    createEReference(expressionEClass, EXPRESSION__DECL);
    createEReference(expressionEClass, EXPRESSION__B);
    createEReference(expressionEClass, EXPRESSION__T);
    createEReference(expressionEClass, EXPRESSION__NAME_REF);
    createEReference(expressionEClass, EXPRESSION__BLOCK_OR_BAR);

    declEClass = createEClass(DECL);
    createEReference(declEClass, DECL__NAME);
    createEReference(declEClass, DECL__SUITE);
    createEReference(declEClass, DECL__EXPR_DECL);

    decl2EClass = createEClass(DECL2);

    letDeclEClass = createEClass(LET_DECL);
    createEReference(letDeclEClass, LET_DECL__LET_DECL);
    createEReference(letDeclEClass, LET_DECL__BLOCK_OR_BAR_BIS);

    arrowOpEClass = createEClass(ARROW_OP);
    createEAttribute(arrowOpEClass, ARROW_OP__S);

    blockEClass = createEClass(BLOCK);
    createEReference(blockEClass, BLOCK__EXPR);

    blockBisEClass = createEClass(BLOCK_BIS);

    blockOrBarEClass = createEClass(BLOCK_OR_BAR);

    blockOrBarBisEClass = createEClass(BLOCK_OR_BAR_BIS);

    nameEClass = createEClass(NAME);
    createEReference(nameEClass, NAME__EXPR_DECL);
    createEReference(nameEClass, NAME__EXPR_LET);
    createEAttribute(nameEClass, NAME__THIS);
    createEAttribute(nameEClass, NAME__NAME);
    createEReference(nameEClass, NAME__NAME_COMPLETE);

    nameBisEClass = createEClass(NAME_BIS);
    createEAttribute(nameBisEClass, NAME_BIS__SUITE);

    refEClass = createEClass(REF);
    createEReference(refEClass, REF__NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    factDeclEClass.getESuperTypes().add(this.getParagraph());
    assertDeclEClass.getESuperTypes().add(this.getParagraph());
    funDeclEClass.getESuperTypes().add(this.getParagraph());
    predDeclEClass.getESuperTypes().add(this.getParagraph());
    runDeclEClass.getESuperTypes().add(this.getParagraph());
    checkDeclEClass.getESuperTypes().add(this.getParagraph());
    enumDeclEClass.getESuperTypes().add(this.getParagraph());
    sigDeclEClass.getESuperTypes().add(this.getParagraph());
    expressionEClass.getESuperTypes().add(this.getBlockOrBar());
    expressionEClass.getESuperTypes().add(this.getBlockOrBarBis());
    letDeclEClass.getESuperTypes().add(this.getExpression());
    blockEClass.getESuperTypes().add(this.getExpression());
    blockEClass.getESuperTypes().add(this.getBlockBis());
    blockBisEClass.getESuperTypes().add(this.getBlockOrBar());
    blockBisEClass.getESuperTypes().add(this.getBlockOrBarBis());
    nameEClass.getESuperTypes().add(this.getDecl2());
    nameEClass.getESuperTypes().add(this.getLetDecl());

    // Initialize classes and features; add operations and parameters
    initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSpecification_Module(), this.getModule(), null, "module", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecification_Open(), this.getOpen(), null, "open", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecification_Paragraph(), this.getParagraph(), null, "paragraph", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModule_ModuleName(), this.getName_(), null, "moduleName", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Suite(), this.getName_(), null, "suite", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(openEClass, Open.class, "Open", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOpen_Name(), this.getName_(), null, "name", null, 0, 1, Open.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOpen_Ref(), this.getRef(), null, "ref", null, 0, 1, Open.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOpen_Ref2(), this.getRef(), null, "ref2", null, 0, -1, Open.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOpen_Name2(), this.getName_(), null, "name2", null, 0, 1, Open.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(factDeclEClass, FactDecl.class, "FactDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFactDecl_FactName(), this.getName_(), null, "factName", null, 0, 1, FactDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFactDecl_B(), this.getBlockBis(), null, "b", null, 0, 1, FactDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assertDeclEClass, AssertDecl.class, "AssertDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssertDecl_AssertName(), this.getName_(), null, "assertName", null, 0, 1, AssertDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssertDecl_B(), this.getBlockBis(), null, "b", null, 0, 1, AssertDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(funDeclEClass, FunDecl.class, "FunDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunDecl_Ref(), this.getRef(), null, "ref", null, 0, 1, FunDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunDecl_FunName(), this.getName_(), null, "funName", null, 0, 1, FunDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunDecl_Decl(), this.getDecl(), null, "decl", null, 0, 1, FunDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunDecl_Decl2(), this.getDecl(), null, "decl2", null, 0, -1, FunDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunDecl_Expr(), this.getExpression(), null, "expr", null, 0, 1, FunDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunDecl_B(), this.getBlockBis(), null, "b", null, 0, 1, FunDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(predDeclEClass, PredDecl.class, "PredDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPredDecl_Pred(), ecorePackage.getEString(), "pred", null, 0, 1, PredDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredDecl_Ref(), this.getRef(), null, "ref", null, 0, 1, PredDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredDecl_PredName(), this.getName_(), null, "predName", null, 0, 1, PredDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredDecl_Decl(), this.getDecl(), null, "decl", null, 0, 1, PredDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredDecl_Decl2(), this.getDecl(), null, "decl2", null, 0, -1, PredDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredDecl_B(), this.getBlockBis(), null, "b", null, 0, 1, PredDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(runDeclEClass, RunDecl.class, "RunDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRunDecl_RunName(), this.getName_(), null, "runName", null, 0, 1, RunDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRunDecl_Run(), ecorePackage.getEString(), "run", null, 0, 1, RunDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRunDecl_Name2(), this.getName_(), null, "name2", null, 0, 1, RunDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRunDecl_B(), this.getBlockBis(), null, "b", null, 0, 1, RunDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRunDecl_Scope(), this.getScope(), null, "scope", null, 0, 1, RunDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(checkDeclEClass, CheckDecl.class, "CheckDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCheckDecl_CheckName(), this.getName_(), null, "checkName", null, 0, 1, CheckDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCheckDecl_Check(), ecorePackage.getEString(), "check", null, 0, 1, CheckDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCheckDecl_Name2(), this.getName_(), null, "name2", null, 0, 1, CheckDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCheckDecl_B(), this.getBlockBis(), null, "b", null, 0, 1, CheckDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCheckDecl_Scope(), this.getScope(), null, "scope", null, 0, 1, CheckDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scopeEClass, Scope.class, "Scope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScope_Typescope(), this.getTypescope(), null, "typescope", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typescopeEClass, Typescope.class, "Typescope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypescope_N(), this.getName_(), null, "n", null, 0, 1, Typescope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumDeclEClass, EnumDecl.class, "EnumDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumDecl_EnumName(), this.getName_(), null, "enumName", null, 0, 1, EnumDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumDecl_Name2(), this.getName_(), null, "name2", null, 0, 1, EnumDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumDecl_Name3(), this.getName_(), null, "name3", null, 0, -1, EnumDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sigDeclEClass, SigDecl.class, "SigDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSigDecl_SigName(), this.getName_(), null, "sigName", null, 0, 1, SigDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSigDecl_Name2(), this.getName_(), null, "name2", null, 0, -1, SigDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSigDecl_SigExt(), this.getSigExt(), null, "sigExt", null, 0, 1, SigDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSigDecl_Decl(), this.getDecl(), null, "decl", null, 0, 1, SigDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSigDecl_Decl2(), this.getDecl(), null, "decl2", null, 0, -1, SigDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSigDecl_B(), this.getBlockBis(), null, "b", null, 0, 1, SigDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sigExtEClass, SigExt.class, "SigExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSigExt_Ref(), this.getRef(), null, "ref", null, 0, 1, SigExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSigExt_Ref2(), this.getRef(), null, "ref2", null, 0, -1, SigExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_Term(), this.getExpression(), null, "term", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_ExprT(), this.getExpression(), null, "exprT", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Right(), this.getExpression(), null, "right", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_ArrowOp(), this.getArrowOp(), null, "arrowOp", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Decl(), this.getDecl(), null, "decl", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_B(), this.getBlockOrBarBis(), null, "b", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_T(), this.getExpression(), null, "t", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_NameRef(), this.getName_(), null, "nameRef", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_BlockOrBar(), this.getBlockOrBar(), null, "blockOrBar", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declEClass, Decl.class, "Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDecl_Name(), this.getName_(), null, "name", null, 0, 1, Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDecl_Suite(), this.getName_(), null, "suite", null, 0, -1, Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDecl_ExprDecl(), this.getExpression(), null, "exprDecl", null, 0, 1, Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(decl2EClass, Decl2.class, "Decl2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(letDeclEClass, LetDecl.class, "LetDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLetDecl_LetDecl(), this.getLetDecl(), null, "letDecl", null, 0, 1, LetDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLetDecl_BlockOrBarBis(), this.getBlockOrBarBis(), null, "blockOrBarBis", null, 0, 1, LetDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrowOpEClass, ArrowOp.class, "ArrowOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArrowOp_S(), ecorePackage.getEString(), "s", null, 0, 1, ArrowOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBlock_Expr(), this.getExpression(), null, "expr", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blockBisEClass, BlockBis.class, "BlockBis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(blockOrBarEClass, BlockOrBar.class, "BlockOrBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(blockOrBarBisEClass, BlockOrBarBis.class, "BlockOrBarBis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nameEClass, Name.class, "Name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getName_ExprDecl(), this.getExpression(), null, "exprDecl", null, 0, 1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getName_ExprLet(), this.getExpression(), null, "exprLet", null, 0, 1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getName_This(), ecorePackage.getEString(), "this", null, 0, 1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getName_Name(), ecorePackage.getEString(), "name", null, 0, 1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getName_NameComplete(), this.getNameBis(), null, "nameComplete", null, 0, 1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameBisEClass, NameBis.class, "NameBis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNameBis_Suite(), ecorePackage.getEString(), "suite", null, 0, 1, NameBis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refEClass, Ref.class, "Ref", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRef_Name(), this.getName_(), null, "name", null, 0, 1, Ref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //BasicsPackageImpl
