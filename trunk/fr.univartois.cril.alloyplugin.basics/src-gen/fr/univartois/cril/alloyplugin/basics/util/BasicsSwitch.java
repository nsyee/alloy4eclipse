/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics.util;

import fr.univartois.cril.alloyplugin.basics.*;

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
 * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage
 * @generated
 */
public class BasicsSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BasicsPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicsSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BasicsPackage.eINSTANCE;
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
      case BasicsPackage.SPECIFICATION:
      {
        Specification specification = (Specification)theEObject;
        T result = caseSpecification(specification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.MODULE:
      {
        Module module = (Module)theEObject;
        T result = caseModule(module);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.OPEN:
      {
        Open open = (Open)theEObject;
        T result = caseOpen(open);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.PARAGRAPH:
      {
        Paragraph paragraph = (Paragraph)theEObject;
        T result = caseParagraph(paragraph);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.FACT_DECL:
      {
        FactDecl factDecl = (FactDecl)theEObject;
        T result = caseFactDecl(factDecl);
        if (result == null) result = caseParagraph(factDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.ASSERT_DECL:
      {
        AssertDecl assertDecl = (AssertDecl)theEObject;
        T result = caseAssertDecl(assertDecl);
        if (result == null) result = caseParagraph(assertDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.FUN_DECL:
      {
        FunDecl funDecl = (FunDecl)theEObject;
        T result = caseFunDecl(funDecl);
        if (result == null) result = caseParagraph(funDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.PRED_DECL:
      {
        PredDecl predDecl = (PredDecl)theEObject;
        T result = casePredDecl(predDecl);
        if (result == null) result = caseParagraph(predDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.RUN_DECL:
      {
        RunDecl runDecl = (RunDecl)theEObject;
        T result = caseRunDecl(runDecl);
        if (result == null) result = caseParagraph(runDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.CHECK_DECL:
      {
        CheckDecl checkDecl = (CheckDecl)theEObject;
        T result = caseCheckDecl(checkDecl);
        if (result == null) result = caseParagraph(checkDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.SCOPE:
      {
        Scope scope = (Scope)theEObject;
        T result = caseScope(scope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.TYPESCOPE:
      {
        Typescope typescope = (Typescope)theEObject;
        T result = caseTypescope(typescope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.ENUM_DECL:
      {
        EnumDecl enumDecl = (EnumDecl)theEObject;
        T result = caseEnumDecl(enumDecl);
        if (result == null) result = caseParagraph(enumDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.SIG_DECL:
      {
        SigDecl sigDecl = (SigDecl)theEObject;
        T result = caseSigDecl(sigDecl);
        if (result == null) result = caseParagraph(sigDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.SIG_EXT:
      {
        SigExt sigExt = (SigExt)theEObject;
        T result = caseSigExt(sigExt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseBlockOrBar(expression);
        if (result == null) result = caseBlockOrBarBis(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.DECL:
      {
        Decl decl = (Decl)theEObject;
        T result = caseDecl(decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.DECL2:
      {
        Decl2 decl2 = (Decl2)theEObject;
        T result = caseDecl2(decl2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.LET_DECL:
      {
        LetDecl letDecl = (LetDecl)theEObject;
        T result = caseLetDecl(letDecl);
        if (result == null) result = caseExpression(letDecl);
        if (result == null) result = caseBlockOrBar(letDecl);
        if (result == null) result = caseBlockOrBarBis(letDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.ARROW_OP:
      {
        ArrowOp arrowOp = (ArrowOp)theEObject;
        T result = caseArrowOp(arrowOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = caseExpression(block);
        if (result == null) result = caseBlockBis(block);
        if (result == null) result = caseBlockOrBar(block);
        if (result == null) result = caseBlockOrBarBis(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.BLOCK_BIS:
      {
        BlockBis blockBis = (BlockBis)theEObject;
        T result = caseBlockBis(blockBis);
        if (result == null) result = caseBlockOrBar(blockBis);
        if (result == null) result = caseBlockOrBarBis(blockBis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.BLOCK_OR_BAR:
      {
        BlockOrBar blockOrBar = (BlockOrBar)theEObject;
        T result = caseBlockOrBar(blockOrBar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.BLOCK_OR_BAR_BIS:
      {
        BlockOrBarBis blockOrBarBis = (BlockOrBarBis)theEObject;
        T result = caseBlockOrBarBis(blockOrBarBis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.NAME:
      {
        Name name = (Name)theEObject;
        T result = caseName(name);
        if (result == null) result = caseDecl2(name);
        if (result == null) result = caseLetDecl(name);
        if (result == null) result = caseExpression(name);
        if (result == null) result = caseBlockOrBar(name);
        if (result == null) result = caseBlockOrBarBis(name);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.NAME_BIS:
      {
        NameBis nameBis = (NameBis)theEObject;
        T result = caseNameBis(nameBis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BasicsPackage.REF:
      {
        Ref ref = (Ref)theEObject;
        T result = caseRef(ref);
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
   * Returns the result of interpreting the object as an instance of '<em>Fact Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fact Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFactDecl(FactDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assert Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assert Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssertDecl(AssertDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fun Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fun Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunDecl(FunDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pred Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pred Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredDecl(PredDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Run Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Run Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRunDecl(RunDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckDecl(CheckDecl object)
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
   * Returns the result of interpreting the object as an instance of '<em>Sig Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sig Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSigDecl(SigDecl object)
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
   * Returns the result of interpreting the object as an instance of '<em>Decl2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decl2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecl2(Decl2 object)
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
   * Returns the result of interpreting the object as an instance of '<em>Block Bis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block Bis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlockBis(BlockBis object)
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
   * Returns the result of interpreting the object as an instance of '<em>Block Or Bar Bis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block Or Bar Bis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlockOrBarBis(BlockOrBarBis object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseName(Name object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Bis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Bis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameBis(NameBis object)
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

} //BasicsSwitch
