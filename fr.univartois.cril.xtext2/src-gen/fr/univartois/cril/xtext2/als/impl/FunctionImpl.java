/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext2.als.impl;

import fr.univartois.cril.xtext2.als.AlsPackage;
import fr.univartois.cril.xtext2.als.Block;
import fr.univartois.cril.xtext2.als.Colon;
import fr.univartois.cril.xtext2.als.Comma;
import fr.univartois.cril.xtext2.als.Decl;
import fr.univartois.cril.xtext2.als.Dot;
import fr.univartois.cril.xtext2.als.Expression;
import fr.univartois.cril.xtext2.als.Function;
import fr.univartois.cril.xtext2.als.LeftParenthesis;
import fr.univartois.cril.xtext2.als.LeftSquareBracketKeyword;
import fr.univartois.cril.xtext2.als.Param;
import fr.univartois.cril.xtext2.als.Ref;
import fr.univartois.cril.xtext2.als.ReferencesName;
import fr.univartois.cril.xtext2.als.RightParenthesis;
import fr.univartois.cril.xtext2.als.RightSquareBracketKeyword;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.FunctionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.FunctionImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.FunctionImpl#getDot <em>Dot</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.FunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.FunctionImpl#getLeftS <em>Left S</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.FunctionImpl#getParam <em>Param</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.FunctionImpl#getComma <em>Comma</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.FunctionImpl#getRightS <em>Right S</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.FunctionImpl#getLeftP <em>Left P</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.FunctionImpl#getDecl <em>Decl</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.FunctionImpl#getRightP <em>Right P</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.FunctionImpl#getColon <em>Colon</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.FunctionImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.FunctionImpl#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionImpl extends ParagraphImpl implements Function
{
  /**
   * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected EList<String> documentation;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected Ref ref;

  /**
   * The cached value of the '{@link #getDot() <em>Dot</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDot()
   * @generated
   * @ordered
   */
  protected Dot dot;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected ReferencesName name;

  /**
   * The cached value of the '{@link #getLeftS() <em>Left S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftS()
   * @generated
   * @ordered
   */
  protected LeftSquareBracketKeyword leftS;

  /**
   * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected EList<Param> param;

  /**
   * The cached value of the '{@link #getComma() <em>Comma</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComma()
   * @generated
   * @ordered
   */
  protected EList<Comma> comma;

  /**
   * The cached value of the '{@link #getRightS() <em>Right S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightS()
   * @generated
   * @ordered
   */
  protected RightSquareBracketKeyword rightS;

  /**
   * The cached value of the '{@link #getLeftP() <em>Left P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftP()
   * @generated
   * @ordered
   */
  protected LeftParenthesis leftP;

  /**
   * The cached value of the '{@link #getDecl() <em>Decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecl()
   * @generated
   * @ordered
   */
  protected EList<Decl> decl;

  /**
   * The cached value of the '{@link #getRightP() <em>Right P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightP()
   * @generated
   * @ordered
   */
  protected RightParenthesis rightP;

  /**
   * The cached value of the '{@link #getColon() <em>Colon</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColon()
   * @generated
   * @ordered
   */
  protected Colon colon;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expression expr;

  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected Block block;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionImpl()
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
    return AlsPackage.Literals.FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDocumentation()
  {
    if (documentation == null)
    {
      documentation = new EDataTypeEList<String>(String.class, this, AlsPackage.FUNCTION__DOCUMENTATION);
    }
    return documentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ref getRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRef(Ref newRef, NotificationChain msgs)
  {
    Ref oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.FUNCTION__REF, oldRef, newRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(Ref newRef)
  {
    if (newRef != ref)
    {
      NotificationChain msgs = null;
      if (ref != null)
        msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FUNCTION__REF, null, msgs);
      if (newRef != null)
        msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FUNCTION__REF, null, msgs);
      msgs = basicSetRef(newRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.FUNCTION__REF, newRef, newRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dot getDot()
  {
    return dot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDot(Dot newDot, NotificationChain msgs)
  {
    Dot oldDot = dot;
    dot = newDot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.FUNCTION__DOT, oldDot, newDot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDot(Dot newDot)
  {
    if (newDot != dot)
    {
      NotificationChain msgs = null;
      if (dot != null)
        msgs = ((InternalEObject)dot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FUNCTION__DOT, null, msgs);
      if (newDot != null)
        msgs = ((InternalEObject)newDot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FUNCTION__DOT, null, msgs);
      msgs = basicSetDot(newDot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.FUNCTION__DOT, newDot, newDot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferencesName getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(ReferencesName newName, NotificationChain msgs)
  {
    ReferencesName oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.FUNCTION__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(ReferencesName newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FUNCTION__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FUNCTION__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.FUNCTION__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftSquareBracketKeyword getLeftS()
  {
    return leftS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftS(LeftSquareBracketKeyword newLeftS, NotificationChain msgs)
  {
    LeftSquareBracketKeyword oldLeftS = leftS;
    leftS = newLeftS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.FUNCTION__LEFT_S, oldLeftS, newLeftS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftS(LeftSquareBracketKeyword newLeftS)
  {
    if (newLeftS != leftS)
    {
      NotificationChain msgs = null;
      if (leftS != null)
        msgs = ((InternalEObject)leftS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FUNCTION__LEFT_S, null, msgs);
      if (newLeftS != null)
        msgs = ((InternalEObject)newLeftS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FUNCTION__LEFT_S, null, msgs);
      msgs = basicSetLeftS(newLeftS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.FUNCTION__LEFT_S, newLeftS, newLeftS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Param> getParam()
  {
    if (param == null)
    {
      param = new EObjectContainmentEList<Param>(Param.class, this, AlsPackage.FUNCTION__PARAM);
    }
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Comma> getComma()
  {
    if (comma == null)
    {
      comma = new EObjectContainmentEList<Comma>(Comma.class, this, AlsPackage.FUNCTION__COMMA);
    }
    return comma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightSquareBracketKeyword getRightS()
  {
    return rightS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightS(RightSquareBracketKeyword newRightS, NotificationChain msgs)
  {
    RightSquareBracketKeyword oldRightS = rightS;
    rightS = newRightS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.FUNCTION__RIGHT_S, oldRightS, newRightS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightS(RightSquareBracketKeyword newRightS)
  {
    if (newRightS != rightS)
    {
      NotificationChain msgs = null;
      if (rightS != null)
        msgs = ((InternalEObject)rightS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FUNCTION__RIGHT_S, null, msgs);
      if (newRightS != null)
        msgs = ((InternalEObject)newRightS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FUNCTION__RIGHT_S, null, msgs);
      msgs = basicSetRightS(newRightS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.FUNCTION__RIGHT_S, newRightS, newRightS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftParenthesis getLeftP()
  {
    return leftP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftP(LeftParenthesis newLeftP, NotificationChain msgs)
  {
    LeftParenthesis oldLeftP = leftP;
    leftP = newLeftP;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.FUNCTION__LEFT_P, oldLeftP, newLeftP);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftP(LeftParenthesis newLeftP)
  {
    if (newLeftP != leftP)
    {
      NotificationChain msgs = null;
      if (leftP != null)
        msgs = ((InternalEObject)leftP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FUNCTION__LEFT_P, null, msgs);
      if (newLeftP != null)
        msgs = ((InternalEObject)newLeftP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FUNCTION__LEFT_P, null, msgs);
      msgs = basicSetLeftP(newLeftP, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.FUNCTION__LEFT_P, newLeftP, newLeftP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Decl> getDecl()
  {
    if (decl == null)
    {
      decl = new EObjectContainmentEList<Decl>(Decl.class, this, AlsPackage.FUNCTION__DECL);
    }
    return decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightParenthesis getRightP()
  {
    return rightP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightP(RightParenthesis newRightP, NotificationChain msgs)
  {
    RightParenthesis oldRightP = rightP;
    rightP = newRightP;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.FUNCTION__RIGHT_P, oldRightP, newRightP);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightP(RightParenthesis newRightP)
  {
    if (newRightP != rightP)
    {
      NotificationChain msgs = null;
      if (rightP != null)
        msgs = ((InternalEObject)rightP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FUNCTION__RIGHT_P, null, msgs);
      if (newRightP != null)
        msgs = ((InternalEObject)newRightP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FUNCTION__RIGHT_P, null, msgs);
      msgs = basicSetRightP(newRightP, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.FUNCTION__RIGHT_P, newRightP, newRightP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Colon getColon()
  {
    return colon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColon(Colon newColon, NotificationChain msgs)
  {
    Colon oldColon = colon;
    colon = newColon;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.FUNCTION__COLON, oldColon, newColon);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColon(Colon newColon)
  {
    if (newColon != colon)
    {
      NotificationChain msgs = null;
      if (colon != null)
        msgs = ((InternalEObject)colon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FUNCTION__COLON, null, msgs);
      if (newColon != null)
        msgs = ((InternalEObject)newColon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FUNCTION__COLON, null, msgs);
      msgs = basicSetColon(newColon, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.FUNCTION__COLON, newColon, newColon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expression newExpr, NotificationChain msgs)
  {
    Expression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.FUNCTION__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FUNCTION__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FUNCTION__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.FUNCTION__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs)
  {
    Block oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.FUNCTION__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(Block newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FUNCTION__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FUNCTION__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.FUNCTION__BLOCK, newBlock, newBlock));
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
      case AlsPackage.FUNCTION__REF:
        return basicSetRef(null, msgs);
      case AlsPackage.FUNCTION__DOT:
        return basicSetDot(null, msgs);
      case AlsPackage.FUNCTION__NAME:
        return basicSetName(null, msgs);
      case AlsPackage.FUNCTION__LEFT_S:
        return basicSetLeftS(null, msgs);
      case AlsPackage.FUNCTION__PARAM:
        return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
      case AlsPackage.FUNCTION__COMMA:
        return ((InternalEList<?>)getComma()).basicRemove(otherEnd, msgs);
      case AlsPackage.FUNCTION__RIGHT_S:
        return basicSetRightS(null, msgs);
      case AlsPackage.FUNCTION__LEFT_P:
        return basicSetLeftP(null, msgs);
      case AlsPackage.FUNCTION__DECL:
        return ((InternalEList<?>)getDecl()).basicRemove(otherEnd, msgs);
      case AlsPackage.FUNCTION__RIGHT_P:
        return basicSetRightP(null, msgs);
      case AlsPackage.FUNCTION__COLON:
        return basicSetColon(null, msgs);
      case AlsPackage.FUNCTION__EXPR:
        return basicSetExpr(null, msgs);
      case AlsPackage.FUNCTION__BLOCK:
        return basicSetBlock(null, msgs);
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
      case AlsPackage.FUNCTION__DOCUMENTATION:
        return getDocumentation();
      case AlsPackage.FUNCTION__REF:
        return getRef();
      case AlsPackage.FUNCTION__DOT:
        return getDot();
      case AlsPackage.FUNCTION__NAME:
        return getName();
      case AlsPackage.FUNCTION__LEFT_S:
        return getLeftS();
      case AlsPackage.FUNCTION__PARAM:
        return getParam();
      case AlsPackage.FUNCTION__COMMA:
        return getComma();
      case AlsPackage.FUNCTION__RIGHT_S:
        return getRightS();
      case AlsPackage.FUNCTION__LEFT_P:
        return getLeftP();
      case AlsPackage.FUNCTION__DECL:
        return getDecl();
      case AlsPackage.FUNCTION__RIGHT_P:
        return getRightP();
      case AlsPackage.FUNCTION__COLON:
        return getColon();
      case AlsPackage.FUNCTION__EXPR:
        return getExpr();
      case AlsPackage.FUNCTION__BLOCK:
        return getBlock();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AlsPackage.FUNCTION__DOCUMENTATION:
        getDocumentation().clear();
        getDocumentation().addAll((Collection<? extends String>)newValue);
        return;
      case AlsPackage.FUNCTION__REF:
        setRef((Ref)newValue);
        return;
      case AlsPackage.FUNCTION__DOT:
        setDot((Dot)newValue);
        return;
      case AlsPackage.FUNCTION__NAME:
        setName((ReferencesName)newValue);
        return;
      case AlsPackage.FUNCTION__LEFT_S:
        setLeftS((LeftSquareBracketKeyword)newValue);
        return;
      case AlsPackage.FUNCTION__PARAM:
        getParam().clear();
        getParam().addAll((Collection<? extends Param>)newValue);
        return;
      case AlsPackage.FUNCTION__COMMA:
        getComma().clear();
        getComma().addAll((Collection<? extends Comma>)newValue);
        return;
      case AlsPackage.FUNCTION__RIGHT_S:
        setRightS((RightSquareBracketKeyword)newValue);
        return;
      case AlsPackage.FUNCTION__LEFT_P:
        setLeftP((LeftParenthesis)newValue);
        return;
      case AlsPackage.FUNCTION__DECL:
        getDecl().clear();
        getDecl().addAll((Collection<? extends Decl>)newValue);
        return;
      case AlsPackage.FUNCTION__RIGHT_P:
        setRightP((RightParenthesis)newValue);
        return;
      case AlsPackage.FUNCTION__COLON:
        setColon((Colon)newValue);
        return;
      case AlsPackage.FUNCTION__EXPR:
        setExpr((Expression)newValue);
        return;
      case AlsPackage.FUNCTION__BLOCK:
        setBlock((Block)newValue);
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
      case AlsPackage.FUNCTION__DOCUMENTATION:
        getDocumentation().clear();
        return;
      case AlsPackage.FUNCTION__REF:
        setRef((Ref)null);
        return;
      case AlsPackage.FUNCTION__DOT:
        setDot((Dot)null);
        return;
      case AlsPackage.FUNCTION__NAME:
        setName((ReferencesName)null);
        return;
      case AlsPackage.FUNCTION__LEFT_S:
        setLeftS((LeftSquareBracketKeyword)null);
        return;
      case AlsPackage.FUNCTION__PARAM:
        getParam().clear();
        return;
      case AlsPackage.FUNCTION__COMMA:
        getComma().clear();
        return;
      case AlsPackage.FUNCTION__RIGHT_S:
        setRightS((RightSquareBracketKeyword)null);
        return;
      case AlsPackage.FUNCTION__LEFT_P:
        setLeftP((LeftParenthesis)null);
        return;
      case AlsPackage.FUNCTION__DECL:
        getDecl().clear();
        return;
      case AlsPackage.FUNCTION__RIGHT_P:
        setRightP((RightParenthesis)null);
        return;
      case AlsPackage.FUNCTION__COLON:
        setColon((Colon)null);
        return;
      case AlsPackage.FUNCTION__EXPR:
        setExpr((Expression)null);
        return;
      case AlsPackage.FUNCTION__BLOCK:
        setBlock((Block)null);
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
      case AlsPackage.FUNCTION__DOCUMENTATION:
        return documentation != null && !documentation.isEmpty();
      case AlsPackage.FUNCTION__REF:
        return ref != null;
      case AlsPackage.FUNCTION__DOT:
        return dot != null;
      case AlsPackage.FUNCTION__NAME:
        return name != null;
      case AlsPackage.FUNCTION__LEFT_S:
        return leftS != null;
      case AlsPackage.FUNCTION__PARAM:
        return param != null && !param.isEmpty();
      case AlsPackage.FUNCTION__COMMA:
        return comma != null && !comma.isEmpty();
      case AlsPackage.FUNCTION__RIGHT_S:
        return rightS != null;
      case AlsPackage.FUNCTION__LEFT_P:
        return leftP != null;
      case AlsPackage.FUNCTION__DECL:
        return decl != null && !decl.isEmpty();
      case AlsPackage.FUNCTION__RIGHT_P:
        return rightP != null;
      case AlsPackage.FUNCTION__COLON:
        return colon != null;
      case AlsPackage.FUNCTION__EXPR:
        return expr != null;
      case AlsPackage.FUNCTION__BLOCK:
        return block != null;
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
    result.append(" (documentation: ");
    result.append(documentation);
    result.append(')');
    return result.toString();
  }

} //FunctionImpl
