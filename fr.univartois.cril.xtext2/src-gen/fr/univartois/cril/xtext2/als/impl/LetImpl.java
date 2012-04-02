/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext2.als.impl;

import fr.univartois.cril.xtext2.als.AlsPackage;
import fr.univartois.cril.xtext2.als.Block;
import fr.univartois.cril.xtext2.als.Comma;
import fr.univartois.cril.xtext2.als.Expression;
import fr.univartois.cril.xtext2.als.LeftSquareBracketKeyword;
import fr.univartois.cril.xtext2.als.Let;
import fr.univartois.cril.xtext2.als.LetName;
import fr.univartois.cril.xtext2.als.ReferencesName;
import fr.univartois.cril.xtext2.als.RightSquareBracketKeyword;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Let</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.LetImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.LetImpl#getLeftS <em>Left S</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.LetImpl#getNameRef <em>Name Ref</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.LetImpl#getComma <em>Comma</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.LetImpl#getRightS <em>Right S</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.LetImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.LetImpl#getExprName <em>Expr Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LetImpl extends ParagraphImpl implements Let
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected LetName name;

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
   * The cached value of the '{@link #getNameRef() <em>Name Ref</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameRef()
   * @generated
   * @ordered
   */
  protected EList<ReferencesName> nameRef;

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
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected Block block;

  /**
   * The cached value of the '{@link #getExprName() <em>Expr Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprName()
   * @generated
   * @ordered
   */
  protected Expression exprName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LetImpl()
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
    return AlsPackage.Literals.LET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LetName getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(LetName newName, NotificationChain msgs)
  {
    LetName oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.LET__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(LetName newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.LET__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.LET__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.LET__NAME, newName, newName));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.LET__LEFT_S, oldLeftS, newLeftS);
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
        msgs = ((InternalEObject)leftS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.LET__LEFT_S, null, msgs);
      if (newLeftS != null)
        msgs = ((InternalEObject)newLeftS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.LET__LEFT_S, null, msgs);
      msgs = basicSetLeftS(newLeftS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.LET__LEFT_S, newLeftS, newLeftS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferencesName> getNameRef()
  {
    if (nameRef == null)
    {
      nameRef = new EObjectContainmentEList<ReferencesName>(ReferencesName.class, this, AlsPackage.LET__NAME_REF);
    }
    return nameRef;
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
      comma = new EObjectContainmentEList<Comma>(Comma.class, this, AlsPackage.LET__COMMA);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.LET__RIGHT_S, oldRightS, newRightS);
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
        msgs = ((InternalEObject)rightS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.LET__RIGHT_S, null, msgs);
      if (newRightS != null)
        msgs = ((InternalEObject)newRightS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.LET__RIGHT_S, null, msgs);
      msgs = basicSetRightS(newRightS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.LET__RIGHT_S, newRightS, newRightS));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.LET__BLOCK, oldBlock, newBlock);
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
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.LET__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.LET__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.LET__BLOCK, newBlock, newBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExprName()
  {
    return exprName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprName(Expression newExprName, NotificationChain msgs)
  {
    Expression oldExprName = exprName;
    exprName = newExprName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.LET__EXPR_NAME, oldExprName, newExprName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprName(Expression newExprName)
  {
    if (newExprName != exprName)
    {
      NotificationChain msgs = null;
      if (exprName != null)
        msgs = ((InternalEObject)exprName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.LET__EXPR_NAME, null, msgs);
      if (newExprName != null)
        msgs = ((InternalEObject)newExprName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.LET__EXPR_NAME, null, msgs);
      msgs = basicSetExprName(newExprName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.LET__EXPR_NAME, newExprName, newExprName));
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
      case AlsPackage.LET__NAME:
        return basicSetName(null, msgs);
      case AlsPackage.LET__LEFT_S:
        return basicSetLeftS(null, msgs);
      case AlsPackage.LET__NAME_REF:
        return ((InternalEList<?>)getNameRef()).basicRemove(otherEnd, msgs);
      case AlsPackage.LET__COMMA:
        return ((InternalEList<?>)getComma()).basicRemove(otherEnd, msgs);
      case AlsPackage.LET__RIGHT_S:
        return basicSetRightS(null, msgs);
      case AlsPackage.LET__BLOCK:
        return basicSetBlock(null, msgs);
      case AlsPackage.LET__EXPR_NAME:
        return basicSetExprName(null, msgs);
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
      case AlsPackage.LET__NAME:
        return getName();
      case AlsPackage.LET__LEFT_S:
        return getLeftS();
      case AlsPackage.LET__NAME_REF:
        return getNameRef();
      case AlsPackage.LET__COMMA:
        return getComma();
      case AlsPackage.LET__RIGHT_S:
        return getRightS();
      case AlsPackage.LET__BLOCK:
        return getBlock();
      case AlsPackage.LET__EXPR_NAME:
        return getExprName();
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
      case AlsPackage.LET__NAME:
        setName((LetName)newValue);
        return;
      case AlsPackage.LET__LEFT_S:
        setLeftS((LeftSquareBracketKeyword)newValue);
        return;
      case AlsPackage.LET__NAME_REF:
        getNameRef().clear();
        getNameRef().addAll((Collection<? extends ReferencesName>)newValue);
        return;
      case AlsPackage.LET__COMMA:
        getComma().clear();
        getComma().addAll((Collection<? extends Comma>)newValue);
        return;
      case AlsPackage.LET__RIGHT_S:
        setRightS((RightSquareBracketKeyword)newValue);
        return;
      case AlsPackage.LET__BLOCK:
        setBlock((Block)newValue);
        return;
      case AlsPackage.LET__EXPR_NAME:
        setExprName((Expression)newValue);
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
      case AlsPackage.LET__NAME:
        setName((LetName)null);
        return;
      case AlsPackage.LET__LEFT_S:
        setLeftS((LeftSquareBracketKeyword)null);
        return;
      case AlsPackage.LET__NAME_REF:
        getNameRef().clear();
        return;
      case AlsPackage.LET__COMMA:
        getComma().clear();
        return;
      case AlsPackage.LET__RIGHT_S:
        setRightS((RightSquareBracketKeyword)null);
        return;
      case AlsPackage.LET__BLOCK:
        setBlock((Block)null);
        return;
      case AlsPackage.LET__EXPR_NAME:
        setExprName((Expression)null);
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
      case AlsPackage.LET__NAME:
        return name != null;
      case AlsPackage.LET__LEFT_S:
        return leftS != null;
      case AlsPackage.LET__NAME_REF:
        return nameRef != null && !nameRef.isEmpty();
      case AlsPackage.LET__COMMA:
        return comma != null && !comma.isEmpty();
      case AlsPackage.LET__RIGHT_S:
        return rightS != null;
      case AlsPackage.LET__BLOCK:
        return block != null;
      case AlsPackage.LET__EXPR_NAME:
        return exprName != null;
    }
    return super.eIsSet(featureID);
  }

} //LetImpl
