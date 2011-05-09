/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext.als.util;

import fr.univartois.cril.xtext.als.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.univartois.cril.xtext.als.AlsPackage
 * @generated
 */
public class AlsSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AlsPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlsSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AlsPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AlsPackage.SPECIFICATION:
      {
        Specification specification = (Specification)theEObject;
        T result = caseSpecification(specification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.MODULE:
      {
        Module module = (Module)theEObject;
        T result = caseModule(module);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.OPEN:
      {
        Open open = (Open)theEObject;
        T result = caseOpen(open);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.PARAGRAPH:
      {
        Paragraph paragraph = (Paragraph)theEObject;
        T result = caseParagraph(paragraph);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.FACT:
      {
        Fact fact = (Fact)theEObject;
        T result = caseFact(fact);
        if (result == null) result = caseParagraph(fact);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.ASSERTION:
      {
        Assertion assertion = (Assertion)theEObject;
        T result = caseAssertion(assertion);
        if (result == null) result = caseParagraph(assertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = caseParagraph(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.PREDICATE:
      {
        Predicate predicate = (Predicate)theEObject;
        T result = casePredicate(predicate);
        if (result == null) result = caseParagraph(predicate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.RUN_COMMAND:
      {
        RunCommand runCommand = (RunCommand)theEObject;
        T result = caseRunCommand(runCommand);
        if (result == null) result = caseParagraph(runCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.CHECK_COMMAND:
      {
        CheckCommand checkCommand = (CheckCommand)theEObject;
        T result = caseCheckCommand(checkCommand);
        if (result == null) result = caseParagraph(checkCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.SCOPE:
      {
        Scope scope = (Scope)theEObject;
        T result = caseScope(scope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.EXPECTATION:
      {
        Expectation expectation = (Expectation)theEObject;
        T result = caseExpectation(expectation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.TYPESCOPE:
      {
        Typescope typescope = (Typescope)theEObject;
        T result = caseTypescope(typescope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.ENUM_DECL:
      {
        EnumDecl enumDecl = (EnumDecl)theEObject;
        T result = caseEnumDecl(enumDecl);
        if (result == null) result = caseParagraph(enumDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.LET:
      {
        Let let = (Let)theEObject;
        T result = caseLet(let);
        if (result == null) result = caseParagraph(let);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.SIGNATURE:
      {
        Signature signature = (Signature)theEObject;
        T result = caseSignature(signature);
        if (result == null) result = caseParagraph(signature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.SIG_QUAL:
      {
        SigQual sigQual = (SigQual)theEObject;
        T result = caseSigQual(sigQual);
        if (result == null) result = caseSignature(sigQual);
        if (result == null) result = caseParagraph(sigQual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.SIG_EXT:
      {
        SigExt sigExt = (SigExt)theEObject;
        T result = caseSigExt(sigExt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.DECL:
      {
        Decl decl = (Decl)theEObject;
        T result = caseDecl(decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.LET_DECL:
      {
        LetDecl letDecl = (LetDecl)theEObject;
        T result = caseLetDecl(letDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.BIN_OP:
      {
        BinOp binOp = (BinOp)theEObject;
        T result = caseBinOp(binOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.UN_OP:
      {
        UnOp unOp = (UnOp)theEObject;
        T result = caseUnOp(unOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.COMMON_QUANT_UN_OP:
      {
        CommonQuantUnOp commonQuantUnOp = (CommonQuantUnOp)theEObject;
        T result = caseCommonQuantUnOp(commonQuantUnOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.ARROW_OP:
      {
        ArrowOp arrowOp = (ArrowOp)theEObject;
        T result = caseArrowOp(arrowOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.BLOCK_OR_BAR:
      {
        BlockOrBar blockOrBar = (BlockOrBar)theEObject;
        T result = caseBlockOrBar(blockOrBar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.BLOCK_OR_POSSIBLE_BAR:
      {
        BlockOrPossibleBar blockOrPossibleBar = (BlockOrPossibleBar)theEObject;
        T result = caseBlockOrPossibleBar(blockOrPossibleBar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.OPEN_NAME:
      {
        OpenName openName = (OpenName)theEObject;
        T result = caseOpenName(openName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.FACT_NAME:
      {
        FactName factName = (FactName)theEObject;
        T result = caseFactName(factName);
        if (result == null) result = caseReferencesName(factName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.ASSERTION_NAME:
      {
        AssertionName assertionName = (AssertionName)theEObject;
        T result = caseAssertionName(assertionName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.FUNCTION_NAME:
      {
        FunctionName functionName = (FunctionName)theEObject;
        T result = caseFunctionName(functionName);
        if (result == null) result = caseReferencesName(functionName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.FUNCTION_NAMEW_PARAM:
      {
        FunctionNamewParam functionNamewParam = (FunctionNamewParam)theEObject;
        T result = caseFunctionNamewParam(functionNamewParam);
        if (result == null) result = caseReferencesName(functionNamewParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.PREDICATE_NAME:
      {
        PredicateName predicateName = (PredicateName)theEObject;
        T result = casePredicateName(predicateName);
        if (result == null) result = caseReferencesName(predicateName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.ALIAS:
      {
        Alias alias = (Alias)theEObject;
        T result = caseAlias(alias);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.ENUM_NAME:
      {
        EnumName enumName = (EnumName)theEObject;
        T result = caseEnumName(enumName);
        if (result == null) result = caseReferencesName(enumName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.ENUM_PROPERTY_NAME:
      {
        EnumPropertyName enumPropertyName = (EnumPropertyName)theEObject;
        T result = caseEnumPropertyName(enumPropertyName);
        if (result == null) result = caseReferencesName(enumPropertyName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.LET_NAME:
      {
        LetName letName = (LetName)theEObject;
        T result = caseLetName(letName);
        if (result == null) result = caseReferencesName(letName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.SIGNATURE_NAME:
      {
        SignatureName signatureName = (SignatureName)theEObject;
        T result = caseSignatureName(signatureName);
        if (result == null) result = caseReferencesName(signatureName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.PROPERTY_NAME:
      {
        PropertyName propertyName = (PropertyName)theEObject;
        T result = casePropertyName(propertyName);
        if (result == null) result = caseReferencesName(propertyName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.EXACTLY_NAME:
      {
        ExactlyName exactlyName = (ExactlyName)theEObject;
        T result = caseExactlyName(exactlyName);
        if (result == null) result = caseReferencesName(exactlyName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.AS_NAME:
      {
        AsName asName = (AsName)theEObject;
        T result = caseAsName(asName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.REFERENCES_NAME:
      {
        ReferencesName referencesName = (ReferencesName)theEObject;
        T result = caseReferencesName(referencesName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.REFERENCES_SIG:
      {
        ReferencesSig referencesSig = (ReferencesSig)theEObject;
        T result = caseReferencesSig(referencesSig);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.REF:
      {
        Ref ref = (Ref)theEObject;
        T result = caseRef(ref);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.LEFT_CURLY_BRACKET:
      {
        LeftCurlyBracket leftCurlyBracket = (LeftCurlyBracket)theEObject;
        T result = caseLeftCurlyBracket(leftCurlyBracket);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.RIGHT_CURLY_BRACKET:
      {
        RightCurlyBracket rightCurlyBracket = (RightCurlyBracket)theEObject;
        T result = caseRightCurlyBracket(rightCurlyBracket);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.DOT:
      {
        Dot dot = (Dot)theEObject;
        T result = caseDot(dot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.COMMA:
      {
        Comma comma = (Comma)theEObject;
        T result = caseComma(comma);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.COLON:
      {
        Colon colon = (Colon)theEObject;
        T result = caseColon(colon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.LEFT_PARENTHESIS:
      {
        LeftParenthesis leftParenthesis = (LeftParenthesis)theEObject;
        T result = caseLeftParenthesis(leftParenthesis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.RIGHT_PARENTHESIS:
      {
        RightParenthesis rightParenthesis = (RightParenthesis)theEObject;
        T result = caseRightParenthesis(rightParenthesis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.LEFT_SQUARE_BRACKET_KEYWORD:
      {
        LeftSquareBracketKeyword leftSquareBracketKeyword = (LeftSquareBracketKeyword)theEObject;
        T result = caseLeftSquareBracketKeyword(leftSquareBracketKeyword);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlsPackage.RIGHT_SQUARE_BRACKET_KEYWORD:
      {
        RightSquareBracketKeyword rightSquareBracketKeyword = (RightSquareBracketKeyword)theEObject;
        T result = caseRightSquareBracketKeyword(rightSquareBracketKeyword);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpecification(Specification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModule(Module object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Open</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Open</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOpen(Open object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Paragraph</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Paragraph</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParagraph(Paragraph object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fact</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fact</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFact(Fact object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssertion(Assertion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicate(Predicate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Run Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Run Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRunCommand(RunCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckCommand(CheckCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScope(Scope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expectation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expectation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpectation(Expectation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typescope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typescope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypescope(Typescope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumDecl(EnumDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Let</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Let</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLet(Let object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignature(Signature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sig Qual</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sig Qual</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSigQual(SigQual object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sig Ext</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sig Ext</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSigExt(SigExt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecl(Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Let Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Let Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLetDecl(LetDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bin Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bin Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinOp(BinOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Un Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Un Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnOp(UnOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Common Quant Un Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Common Quant Un Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommonQuantUnOp(CommonQuantUnOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arrow Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arrow Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrowOp(ArrowOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlock(Block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block Or Bar</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block Or Bar</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlockOrBar(BlockOrBar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block Or Possible Bar</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block Or Possible Bar</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlockOrPossibleBar(BlockOrPossibleBar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Open Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Open Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOpenName(OpenName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fact Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fact Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFactName(FactName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assertion Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assertion Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssertionName(AssertionName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionName(FunctionName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Namew Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Namew Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionNamewParam(FunctionNamewParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateName(PredicateName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alias</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alias</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlias(Alias object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumName(EnumName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Property Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Property Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumPropertyName(EnumPropertyName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Let Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Let Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLetName(LetName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signature Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signature Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignatureName(SignatureName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyName(PropertyName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exactly Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exactly Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExactlyName(ExactlyName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>As Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>As Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAsName(AsName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>References Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>References Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferencesName(ReferencesName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>References Sig</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>References Sig</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferencesSig(ReferencesSig object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRef(Ref object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Left Curly Bracket</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Left Curly Bracket</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeftCurlyBracket(LeftCurlyBracket object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Right Curly Bracket</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Right Curly Bracket</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRightCurlyBracket(RightCurlyBracket object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDot(Dot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comma</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comma</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComma(Comma object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Colon</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Colon</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColon(Colon object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Left Parenthesis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Left Parenthesis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeftParenthesis(LeftParenthesis object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Right Parenthesis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Right Parenthesis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRightParenthesis(RightParenthesis object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Left Square Bracket Keyword</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Left Square Bracket Keyword</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeftSquareBracketKeyword(LeftSquareBracketKeyword object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Right Square Bracket Keyword</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Right Square Bracket Keyword</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRightSquareBracketKeyword(RightSquareBracketKeyword object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AlsSwitch
