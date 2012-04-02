/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext2.als.impl;

import fr.univartois.cril.xtext2.als.AlsPackage;
import fr.univartois.cril.xtext2.als.Block;
import fr.univartois.cril.xtext2.als.Expression;
import fr.univartois.cril.xtext2.als.LeftCurlyBracket;
import fr.univartois.cril.xtext2.als.RightCurlyBracket;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.BlockImpl#getLeftC <em>Left C</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.BlockImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.BlockImpl#getRightC <em>Right C</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockImpl extends MinimalEObjectImpl.Container implements Block
{
  /**
   * The cached value of the '{@link #getLeftC() <em>Left C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftC()
   * @generated
   * @ordered
   */
  protected LeftCurlyBracket leftC;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected EList<Expression> expr;

  /**
   * The cached value of the '{@link #getRightC() <em>Right C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightC()
   * @generated
   * @ordered
   */
  protected RightCurlyBracket rightC;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BlockImpl()
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
    return AlsPackage.Literals.BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftCurlyBracket getLeftC()
  {
    return leftC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftC(LeftCurlyBracket newLeftC, NotificationChain msgs)
  {
    LeftCurlyBracket oldLeftC = leftC;
    leftC = newLeftC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.BLOCK__LEFT_C, oldLeftC, newLeftC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftC(LeftCurlyBracket newLeftC)
  {
    if (newLeftC != leftC)
    {
      NotificationChain msgs = null;
      if (leftC != null)
        msgs = ((InternalEObject)leftC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.BLOCK__LEFT_C, null, msgs);
      if (newLeftC != null)
        msgs = ((InternalEObject)newLeftC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.BLOCK__LEFT_C, null, msgs);
      msgs = basicSetLeftC(newLeftC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.BLOCK__LEFT_C, newLeftC, newLeftC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getExpr()
  {
    if (expr == null)
    {
      expr = new EObjectContainmentEList<Expression>(Expression.class, this, AlsPackage.BLOCK__EXPR);
    }
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightCurlyBracket getRightC()
  {
    return rightC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightC(RightCurlyBracket newRightC, NotificationChain msgs)
  {
    RightCurlyBracket oldRightC = rightC;
    rightC = newRightC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.BLOCK__RIGHT_C, oldRightC, newRightC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightC(RightCurlyBracket newRightC)
  {
    if (newRightC != rightC)
    {
      NotificationChain msgs = null;
      if (rightC != null)
        msgs = ((InternalEObject)rightC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.BLOCK__RIGHT_C, null, msgs);
      if (newRightC != null)
        msgs = ((InternalEObject)newRightC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.BLOCK__RIGHT_C, null, msgs);
      msgs = basicSetRightC(newRightC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.BLOCK__RIGHT_C, newRightC, newRightC));
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
      case AlsPackage.BLOCK__LEFT_C:
        return basicSetLeftC(null, msgs);
      case AlsPackage.BLOCK__EXPR:
        return ((InternalEList<?>)getExpr()).basicRemove(otherEnd, msgs);
      case AlsPackage.BLOCK__RIGHT_C:
        return basicSetRightC(null, msgs);
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
      case AlsPackage.BLOCK__LEFT_C:
        return getLeftC();
      case AlsPackage.BLOCK__EXPR:
        return getExpr();
      case AlsPackage.BLOCK__RIGHT_C:
        return getRightC();
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
      case AlsPackage.BLOCK__LEFT_C:
        setLeftC((LeftCurlyBracket)newValue);
        return;
      case AlsPackage.BLOCK__EXPR:
        getExpr().clear();
        getExpr().addAll((Collection<? extends Expression>)newValue);
        return;
      case AlsPackage.BLOCK__RIGHT_C:
        setRightC((RightCurlyBracket)newValue);
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
      case AlsPackage.BLOCK__LEFT_C:
        setLeftC((LeftCurlyBracket)null);
        return;
      case AlsPackage.BLOCK__EXPR:
        getExpr().clear();
        return;
      case AlsPackage.BLOCK__RIGHT_C:
        setRightC((RightCurlyBracket)null);
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
      case AlsPackage.BLOCK__LEFT_C:
        return leftC != null;
      case AlsPackage.BLOCK__EXPR:
        return expr != null && !expr.isEmpty();
      case AlsPackage.BLOCK__RIGHT_C:
        return rightC != null;
    }
    return super.eIsSet(featureID);
  }

} //BlockImpl
