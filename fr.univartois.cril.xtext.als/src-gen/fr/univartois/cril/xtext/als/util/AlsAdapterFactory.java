/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext.als.util;

import fr.univartois.cril.xtext.als.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.univartois.cril.xtext.als.AlsPackage
 * @generated
 */
public class AlsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AlsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AlsPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlsSwitch<Adapter> modelSwitch =
    new AlsSwitch<Adapter>()
    {
      @Override
      public Adapter caseSpecification(Specification object)
      {
        return createSpecificationAdapter();
      }
      @Override
      public Adapter caseModule(Module object)
      {
        return createModuleAdapter();
      }
      @Override
      public Adapter caseOpen(Open object)
      {
        return createOpenAdapter();
      }
      @Override
      public Adapter caseParagraph(Paragraph object)
      {
        return createParagraphAdapter();
      }
      @Override
      public Adapter caseFact(Fact object)
      {
        return createFactAdapter();
      }
      @Override
      public Adapter caseAssertion(Assertion object)
      {
        return createAssertionAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter casePredicate(Predicate object)
      {
        return createPredicateAdapter();
      }
      @Override
      public Adapter caseRunCommand(RunCommand object)
      {
        return createRunCommandAdapter();
      }
      @Override
      public Adapter caseCheckCommand(CheckCommand object)
      {
        return createCheckCommandAdapter();
      }
      @Override
      public Adapter caseScope(Scope object)
      {
        return createScopeAdapter();
      }
      @Override
      public Adapter caseExpectation(Expectation object)
      {
        return createExpectationAdapter();
      }
      @Override
      public Adapter caseTypescope(Typescope object)
      {
        return createTypescopeAdapter();
      }
      @Override
      public Adapter caseEnumDecl(EnumDecl object)
      {
        return createEnumDeclAdapter();
      }
      @Override
      public Adapter caseLet(Let object)
      {
        return createLetAdapter();
      }
      @Override
      public Adapter caseSignature(Signature object)
      {
        return createSignatureAdapter();
      }
      @Override
      public Adapter caseSigQual(SigQual object)
      {
        return createSigQualAdapter();
      }
      @Override
      public Adapter caseSigExt(SigExt object)
      {
        return createSigExtAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseDecl(Decl object)
      {
        return createDeclAdapter();
      }
      @Override
      public Adapter caseLetDecl(LetDecl object)
      {
        return createLetDeclAdapter();
      }
      @Override
      public Adapter caseBinOp(BinOp object)
      {
        return createBinOpAdapter();
      }
      @Override
      public Adapter caseUnOp(UnOp object)
      {
        return createUnOpAdapter();
      }
      @Override
      public Adapter caseCommonQuantUnOp(CommonQuantUnOp object)
      {
        return createCommonQuantUnOpAdapter();
      }
      @Override
      public Adapter caseArrowOp(ArrowOp object)
      {
        return createArrowOpAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseBlockOrBar(BlockOrBar object)
      {
        return createBlockOrBarAdapter();
      }
      @Override
      public Adapter caseBlockOrPossibleBar(BlockOrPossibleBar object)
      {
        return createBlockOrPossibleBarAdapter();
      }
      @Override
      public Adapter caseOpenName(OpenName object)
      {
        return createOpenNameAdapter();
      }
      @Override
      public Adapter caseFactName(FactName object)
      {
        return createFactNameAdapter();
      }
      @Override
      public Adapter caseAssertionName(AssertionName object)
      {
        return createAssertionNameAdapter();
      }
      @Override
      public Adapter caseFunctionName(FunctionName object)
      {
        return createFunctionNameAdapter();
      }
      @Override
      public Adapter caseFunctionNamewParam(FunctionNamewParam object)
      {
        return createFunctionNamewParamAdapter();
      }
      @Override
      public Adapter casePredicateName(PredicateName object)
      {
        return createPredicateNameAdapter();
      }
      @Override
      public Adapter caseAlias(Alias object)
      {
        return createAliasAdapter();
      }
      @Override
      public Adapter caseEnumName(EnumName object)
      {
        return createEnumNameAdapter();
      }
      @Override
      public Adapter caseEnumPropertyName(EnumPropertyName object)
      {
        return createEnumPropertyNameAdapter();
      }
      @Override
      public Adapter caseLetName(LetName object)
      {
        return createLetNameAdapter();
      }
      @Override
      public Adapter caseSignatureName(SignatureName object)
      {
        return createSignatureNameAdapter();
      }
      @Override
      public Adapter casePropertyName(PropertyName object)
      {
        return createPropertyNameAdapter();
      }
      @Override
      public Adapter caseExactlyName(ExactlyName object)
      {
        return createExactlyNameAdapter();
      }
      @Override
      public Adapter caseAsName(AsName object)
      {
        return createAsNameAdapter();
      }
      @Override
      public Adapter caseReferencesName(ReferencesName object)
      {
        return createReferencesNameAdapter();
      }
      @Override
      public Adapter caseReferencesSig(ReferencesSig object)
      {
        return createReferencesSigAdapter();
      }
      @Override
      public Adapter caseRef(Ref object)
      {
        return createRefAdapter();
      }
      @Override
      public Adapter caseLeftCurlyBracket(LeftCurlyBracket object)
      {
        return createLeftCurlyBracketAdapter();
      }
      @Override
      public Adapter caseRightCurlyBracket(RightCurlyBracket object)
      {
        return createRightCurlyBracketAdapter();
      }
      @Override
      public Adapter caseDot(Dot object)
      {
        return createDotAdapter();
      }
      @Override
      public Adapter caseComma(Comma object)
      {
        return createCommaAdapter();
      }
      @Override
      public Adapter caseColon(Colon object)
      {
        return createColonAdapter();
      }
      @Override
      public Adapter caseLeftParenthesis(LeftParenthesis object)
      {
        return createLeftParenthesisAdapter();
      }
      @Override
      public Adapter caseRightParenthesis(RightParenthesis object)
      {
        return createRightParenthesisAdapter();
      }
      @Override
      public Adapter caseLeftSquareBracketKeyword(LeftSquareBracketKeyword object)
      {
        return createLeftSquareBracketKeywordAdapter();
      }
      @Override
      public Adapter caseRightSquareBracketKeyword(RightSquareBracketKeyword object)
      {
        return createRightSquareBracketKeywordAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.Specification <em>Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.Specification
   * @generated
   */
  public Adapter createSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.Module
   * @generated
   */
  public Adapter createModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.Open <em>Open</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.Open
   * @generated
   */
  public Adapter createOpenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.Paragraph <em>Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.Paragraph
   * @generated
   */
  public Adapter createParagraphAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.Fact <em>Fact</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.Fact
   * @generated
   */
  public Adapter createFactAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.Assertion <em>Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.Assertion
   * @generated
   */
  public Adapter createAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.Predicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.Predicate
   * @generated
   */
  public Adapter createPredicateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.RunCommand <em>Run Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.RunCommand
   * @generated
   */
  public Adapter createRunCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.CheckCommand <em>Check Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.CheckCommand
   * @generated
   */
  public Adapter createCheckCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.Scope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.Scope
   * @generated
   */
  public Adapter createScopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.Expectation <em>Expectation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.Expectation
   * @generated
   */
  public Adapter createExpectationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.Typescope <em>Typescope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.Typescope
   * @generated
   */
  public Adapter createTypescopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.EnumDecl <em>Enum Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.EnumDecl
   * @generated
   */
  public Adapter createEnumDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.Let <em>Let</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.Let
   * @generated
   */
  public Adapter createLetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.Signature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.Signature
   * @generated
   */
  public Adapter createSignatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.SigQual <em>Sig Qual</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.SigQual
   * @generated
   */
  public Adapter createSigQualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.SigExt <em>Sig Ext</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.SigExt
   * @generated
   */
  public Adapter createSigExtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.Decl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.Decl
   * @generated
   */
  public Adapter createDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.LetDecl <em>Let Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.LetDecl
   * @generated
   */
  public Adapter createLetDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.BinOp <em>Bin Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.BinOp
   * @generated
   */
  public Adapter createBinOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.UnOp <em>Un Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.UnOp
   * @generated
   */
  public Adapter createUnOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.CommonQuantUnOp <em>Common Quant Un Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.CommonQuantUnOp
   * @generated
   */
  public Adapter createCommonQuantUnOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.ArrowOp <em>Arrow Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.ArrowOp
   * @generated
   */
  public Adapter createArrowOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.BlockOrBar <em>Block Or Bar</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.BlockOrBar
   * @generated
   */
  public Adapter createBlockOrBarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.BlockOrPossibleBar <em>Block Or Possible Bar</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.BlockOrPossibleBar
   * @generated
   */
  public Adapter createBlockOrPossibleBarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.OpenName <em>Open Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.OpenName
   * @generated
   */
  public Adapter createOpenNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.FactName <em>Fact Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.FactName
   * @generated
   */
  public Adapter createFactNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.AssertionName <em>Assertion Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.AssertionName
   * @generated
   */
  public Adapter createAssertionNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.FunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.FunctionName
   * @generated
   */
  public Adapter createFunctionNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.FunctionNamewParam <em>Function Namew Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.FunctionNamewParam
   * @generated
   */
  public Adapter createFunctionNamewParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.PredicateName <em>Predicate Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.PredicateName
   * @generated
   */
  public Adapter createPredicateNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.Alias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.Alias
   * @generated
   */
  public Adapter createAliasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.EnumName <em>Enum Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.EnumName
   * @generated
   */
  public Adapter createEnumNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.EnumPropertyName <em>Enum Property Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.EnumPropertyName
   * @generated
   */
  public Adapter createEnumPropertyNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.LetName <em>Let Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.LetName
   * @generated
   */
  public Adapter createLetNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.SignatureName <em>Signature Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.SignatureName
   * @generated
   */
  public Adapter createSignatureNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.PropertyName <em>Property Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.PropertyName
   * @generated
   */
  public Adapter createPropertyNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.ExactlyName <em>Exactly Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.ExactlyName
   * @generated
   */
  public Adapter createExactlyNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.AsName <em>As Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.AsName
   * @generated
   */
  public Adapter createAsNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.ReferencesName <em>References Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.ReferencesName
   * @generated
   */
  public Adapter createReferencesNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.ReferencesSig <em>References Sig</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.ReferencesSig
   * @generated
   */
  public Adapter createReferencesSigAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.Ref <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.Ref
   * @generated
   */
  public Adapter createRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.LeftCurlyBracket <em>Left Curly Bracket</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.LeftCurlyBracket
   * @generated
   */
  public Adapter createLeftCurlyBracketAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.RightCurlyBracket <em>Right Curly Bracket</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.RightCurlyBracket
   * @generated
   */
  public Adapter createRightCurlyBracketAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.Dot <em>Dot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.Dot
   * @generated
   */
  public Adapter createDotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.Comma <em>Comma</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.Comma
   * @generated
   */
  public Adapter createCommaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.Colon <em>Colon</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.Colon
   * @generated
   */
  public Adapter createColonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.LeftParenthesis <em>Left Parenthesis</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.LeftParenthesis
   * @generated
   */
  public Adapter createLeftParenthesisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.RightParenthesis <em>Right Parenthesis</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.RightParenthesis
   * @generated
   */
  public Adapter createRightParenthesisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.LeftSquareBracketKeyword <em>Left Square Bracket Keyword</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.LeftSquareBracketKeyword
   * @generated
   */
  public Adapter createLeftSquareBracketKeywordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.univartois.cril.xtext.als.RightSquareBracketKeyword <em>Right Square Bracket Keyword</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.univartois.cril.xtext.als.RightSquareBracketKeyword
   * @generated
   */
  public Adapter createRightSquareBracketKeywordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AlsAdapterFactory
