/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics.impl;

import fr.univartois.cril.alloyplugin.basics.ArrowOp;
import fr.univartois.cril.alloyplugin.basics.BasicsPackage;
import fr.univartois.cril.alloyplugin.basics.BlockOrBar;
import fr.univartois.cril.alloyplugin.basics.BlockOrBarBis;
import fr.univartois.cril.alloyplugin.basics.Decl;
import fr.univartois.cril.alloyplugin.basics.Expression;
import fr.univartois.cril.alloyplugin.basics.Name;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.ExpressionImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.ExpressionImpl#getExprT <em>Expr T</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.ExpressionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.ExpressionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.ExpressionImpl#getArrowOp <em>Arrow Op</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.ExpressionImpl#getDecl <em>Decl</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.ExpressionImpl#getB <em>B</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.ExpressionImpl#getT <em>T</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.ExpressionImpl#getNameRef <em>Name Ref</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.ExpressionImpl#getBlockOrBar <em>Block Or Bar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends BlockOrBarImpl implements Expression
{
  /**
   * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerm()
   * @generated
   * @ordered
   */
  protected Expression term;

  /**
   * The cached value of the '{@link #getExprT() <em>Expr T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprT()
   * @generated
   * @ordered
   */
  protected Expression exprT;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected Expression right;

  /**
   * The cached value of the '{@link #getArrowOp() <em>Arrow Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrowOp()
   * @generated
   * @ordered
   */
  protected ArrowOp arrowOp;

  /**
   * The cached value of the '{@link #getDecl() <em>Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecl()
   * @generated
   * @ordered
   */
  protected Decl decl;

  /**
   * The cached value of the '{@link #getB() <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected BlockOrBarBis b;

  /**
   * The cached value of the '{@link #getT() <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected Expression t;

  /**
   * The cached value of the '{@link #getNameRef() <em>Name Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameRef()
   * @generated
   * @ordered
   */
  protected Name nameRef;

  /**
   * The cached value of the '{@link #getBlockOrBar() <em>Block Or Bar</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlockOrBar()
   * @generated
   * @ordered
   */
  protected BlockOrBar blockOrBar;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BasicsPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getTerm()
  {
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTerm(Expression newTerm, NotificationChain msgs)
  {
    Expression oldTerm = term;
    term = newTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.EXPRESSION__TERM, oldTerm, newTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTerm(Expression newTerm)
  {
    if (newTerm != term)
    {
      NotificationChain msgs = null;
      if (term != null)
        msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.EXPRESSION__TERM, null, msgs);
      if (newTerm != null)
        msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.EXPRESSION__TERM, null, msgs);
      msgs = basicSetTerm(newTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.EXPRESSION__TERM, newTerm, newTerm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExprT()
  {
    return exprT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprT(Expression newExprT, NotificationChain msgs)
  {
    Expression oldExprT = exprT;
    exprT = newExprT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.EXPRESSION__EXPR_T, oldExprT, newExprT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprT(Expression newExprT)
  {
    if (newExprT != exprT)
    {
      NotificationChain msgs = null;
      if (exprT != null)
        msgs = ((InternalEObject)exprT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.EXPRESSION__EXPR_T, null, msgs);
      if (newExprT != null)
        msgs = ((InternalEObject)newExprT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.EXPRESSION__EXPR_T, null, msgs);
      msgs = basicSetExprT(newExprT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.EXPRESSION__EXPR_T, newExprT, newExprT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.EXPRESSION__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(Expression newRight, NotificationChain msgs)
  {
    Expression oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.EXPRESSION__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(Expression newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.EXPRESSION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.EXPRESSION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.EXPRESSION__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrowOp getArrowOp()
  {
    return arrowOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrowOp(ArrowOp newArrowOp, NotificationChain msgs)
  {
    ArrowOp oldArrowOp = arrowOp;
    arrowOp = newArrowOp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.EXPRESSION__ARROW_OP, oldArrowOp, newArrowOp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrowOp(ArrowOp newArrowOp)
  {
    if (newArrowOp != arrowOp)
    {
      NotificationChain msgs = null;
      if (arrowOp != null)
        msgs = ((InternalEObject)arrowOp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.EXPRESSION__ARROW_OP, null, msgs);
      if (newArrowOp != null)
        msgs = ((InternalEObject)newArrowOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.EXPRESSION__ARROW_OP, null, msgs);
      msgs = basicSetArrowOp(newArrowOp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.EXPRESSION__ARROW_OP, newArrowOp, newArrowOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decl getDecl()
  {
    return decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDecl(Decl newDecl, NotificationChain msgs)
  {
    Decl oldDecl = decl;
    decl = newDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.EXPRESSION__DECL, oldDecl, newDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecl(Decl newDecl)
  {
    if (newDecl != decl)
    {
      NotificationChain msgs = null;
      if (decl != null)
        msgs = ((InternalEObject)decl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.EXPRESSION__DECL, null, msgs);
      if (newDecl != null)
        msgs = ((InternalEObject)newDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.EXPRESSION__DECL, null, msgs);
      msgs = basicSetDecl(newDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.EXPRESSION__DECL, newDecl, newDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockOrBarBis getB()
  {
    return b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetB(BlockOrBarBis newB, NotificationChain msgs)
  {
    BlockOrBarBis oldB = b;
    b = newB;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.EXPRESSION__B, oldB, newB);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setB(BlockOrBarBis newB)
  {
    if (newB != b)
    {
      NotificationChain msgs = null;
      if (b != null)
        msgs = ((InternalEObject)b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.EXPRESSION__B, null, msgs);
      if (newB != null)
        msgs = ((InternalEObject)newB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.EXPRESSION__B, null, msgs);
      msgs = basicSetB(newB, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.EXPRESSION__B, newB, newB));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getT()
  {
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT(Expression newT, NotificationChain msgs)
  {
    Expression oldT = t;
    t = newT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.EXPRESSION__T, oldT, newT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT(Expression newT)
  {
    if (newT != t)
    {
      NotificationChain msgs = null;
      if (t != null)
        msgs = ((InternalEObject)t).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.EXPRESSION__T, null, msgs);
      if (newT != null)
        msgs = ((InternalEObject)newT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.EXPRESSION__T, null, msgs);
      msgs = basicSetT(newT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.EXPRESSION__T, newT, newT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getNameRef()
  {
    if (nameRef != null && nameRef.eIsProxy())
    {
      InternalEObject oldNameRef = (InternalEObject)nameRef;
      nameRef = (Name)eResolveProxy(oldNameRef);
      if (nameRef != oldNameRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicsPackage.EXPRESSION__NAME_REF, oldNameRef, nameRef));
      }
    }
    return nameRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name basicGetNameRef()
  {
    return nameRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameRef(Name newNameRef)
  {
    Name oldNameRef = nameRef;
    nameRef = newNameRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.EXPRESSION__NAME_REF, oldNameRef, nameRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockOrBar getBlockOrBar()
  {
    return blockOrBar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlockOrBar(BlockOrBar newBlockOrBar, NotificationChain msgs)
  {
    BlockOrBar oldBlockOrBar = blockOrBar;
    blockOrBar = newBlockOrBar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.EXPRESSION__BLOCK_OR_BAR, oldBlockOrBar, newBlockOrBar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlockOrBar(BlockOrBar newBlockOrBar)
  {
    if (newBlockOrBar != blockOrBar)
    {
      NotificationChain msgs = null;
      if (blockOrBar != null)
        msgs = ((InternalEObject)blockOrBar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.EXPRESSION__BLOCK_OR_BAR, null, msgs);
      if (newBlockOrBar != null)
        msgs = ((InternalEObject)newBlockOrBar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.EXPRESSION__BLOCK_OR_BAR, null, msgs);
      msgs = basicSetBlockOrBar(newBlockOrBar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.EXPRESSION__BLOCK_OR_BAR, newBlockOrBar, newBlockOrBar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BasicsPackage.EXPRESSION__TERM:
        return basicSetTerm(null, msgs);
      case BasicsPackage.EXPRESSION__EXPR_T:
        return basicSetExprT(null, msgs);
      case BasicsPackage.EXPRESSION__RIGHT:
        return basicSetRight(null, msgs);
      case BasicsPackage.EXPRESSION__ARROW_OP:
        return basicSetArrowOp(null, msgs);
      case BasicsPackage.EXPRESSION__DECL:
        return basicSetDecl(null, msgs);
      case BasicsPackage.EXPRESSION__B:
        return basicSetB(null, msgs);
      case BasicsPackage.EXPRESSION__T:
        return basicSetT(null, msgs);
      case BasicsPackage.EXPRESSION__BLOCK_OR_BAR:
        return basicSetBlockOrBar(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BasicsPackage.EXPRESSION__TERM:
        return getTerm();
      case BasicsPackage.EXPRESSION__EXPR_T:
        return getExprT();
      case BasicsPackage.EXPRESSION__OP:
        return getOp();
      case BasicsPackage.EXPRESSION__RIGHT:
        return getRight();
      case BasicsPackage.EXPRESSION__ARROW_OP:
        return getArrowOp();
      case BasicsPackage.EXPRESSION__DECL:
        return getDecl();
      case BasicsPackage.EXPRESSION__B:
        return getB();
      case BasicsPackage.EXPRESSION__T:
        return getT();
      case BasicsPackage.EXPRESSION__NAME_REF:
        if (resolve) return getNameRef();
        return basicGetNameRef();
      case BasicsPackage.EXPRESSION__BLOCK_OR_BAR:
        return getBlockOrBar();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BasicsPackage.EXPRESSION__TERM:
        setTerm((Expression)newValue);
        return;
      case BasicsPackage.EXPRESSION__EXPR_T:
        setExprT((Expression)newValue);
        return;
      case BasicsPackage.EXPRESSION__OP:
        setOp((String)newValue);
        return;
      case BasicsPackage.EXPRESSION__RIGHT:
        setRight((Expression)newValue);
        return;
      case BasicsPackage.EXPRESSION__ARROW_OP:
        setArrowOp((ArrowOp)newValue);
        return;
      case BasicsPackage.EXPRESSION__DECL:
        setDecl((Decl)newValue);
        return;
      case BasicsPackage.EXPRESSION__B:
        setB((BlockOrBarBis)newValue);
        return;
      case BasicsPackage.EXPRESSION__T:
        setT((Expression)newValue);
        return;
      case BasicsPackage.EXPRESSION__NAME_REF:
        setNameRef((Name)newValue);
        return;
      case BasicsPackage.EXPRESSION__BLOCK_OR_BAR:
        setBlockOrBar((BlockOrBar)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BasicsPackage.EXPRESSION__TERM:
        setTerm((Expression)null);
        return;
      case BasicsPackage.EXPRESSION__EXPR_T:
        setExprT((Expression)null);
        return;
      case BasicsPackage.EXPRESSION__OP:
        setOp(OP_EDEFAULT);
        return;
      case BasicsPackage.EXPRESSION__RIGHT:
        setRight((Expression)null);
        return;
      case BasicsPackage.EXPRESSION__ARROW_OP:
        setArrowOp((ArrowOp)null);
        return;
      case BasicsPackage.EXPRESSION__DECL:
        setDecl((Decl)null);
        return;
      case BasicsPackage.EXPRESSION__B:
        setB((BlockOrBarBis)null);
        return;
      case BasicsPackage.EXPRESSION__T:
        setT((Expression)null);
        return;
      case BasicsPackage.EXPRESSION__NAME_REF:
        setNameRef((Name)null);
        return;
      case BasicsPackage.EXPRESSION__BLOCK_OR_BAR:
        setBlockOrBar((BlockOrBar)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BasicsPackage.EXPRESSION__TERM:
        return term != null;
      case BasicsPackage.EXPRESSION__EXPR_T:
        return exprT != null;
      case BasicsPackage.EXPRESSION__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case BasicsPackage.EXPRESSION__RIGHT:
        return right != null;
      case BasicsPackage.EXPRESSION__ARROW_OP:
        return arrowOp != null;
      case BasicsPackage.EXPRESSION__DECL:
        return decl != null;
      case BasicsPackage.EXPRESSION__B:
        return b != null;
      case BasicsPackage.EXPRESSION__T:
        return t != null;
      case BasicsPackage.EXPRESSION__NAME_REF:
        return nameRef != null;
      case BasicsPackage.EXPRESSION__BLOCK_OR_BAR:
        return blockOrBar != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl
