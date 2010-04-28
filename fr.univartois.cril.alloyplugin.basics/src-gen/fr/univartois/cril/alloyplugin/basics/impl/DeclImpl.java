/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics.impl;

import fr.univartois.cril.alloyplugin.basics.BasicsPackage;
import fr.univartois.cril.alloyplugin.basics.Decl;
import fr.univartois.cril.alloyplugin.basics.Expression;
import fr.univartois.cril.alloyplugin.basics.Name;

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
 * An implementation of the model object '<em><b>Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.DeclImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.DeclImpl#getSuite <em>Suite</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.DeclImpl#getExprDecl <em>Expr Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclImpl extends MinimalEObjectImpl.Container implements Decl
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Name name;

  /**
   * The cached value of the '{@link #getSuite() <em>Suite</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuite()
   * @generated
   * @ordered
   */
  protected EList<Name> suite;

  /**
   * The cached value of the '{@link #getExprDecl() <em>Expr Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprDecl()
   * @generated
   * @ordered
   */
  protected Expression exprDecl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclImpl()
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
    return BasicsPackage.Literals.DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(Name newName, NotificationChain msgs)
  {
    Name oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.DECL__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Name newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.DECL__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.DECL__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.DECL__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Name> getSuite()
  {
    if (suite == null)
    {
      suite = new EObjectContainmentEList<Name>(Name.class, this, BasicsPackage.DECL__SUITE);
    }
    return suite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExprDecl()
  {
    return exprDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprDecl(Expression newExprDecl, NotificationChain msgs)
  {
    Expression oldExprDecl = exprDecl;
    exprDecl = newExprDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.DECL__EXPR_DECL, oldExprDecl, newExprDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprDecl(Expression newExprDecl)
  {
    if (newExprDecl != exprDecl)
    {
      NotificationChain msgs = null;
      if (exprDecl != null)
        msgs = ((InternalEObject)exprDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.DECL__EXPR_DECL, null, msgs);
      if (newExprDecl != null)
        msgs = ((InternalEObject)newExprDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.DECL__EXPR_DECL, null, msgs);
      msgs = basicSetExprDecl(newExprDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.DECL__EXPR_DECL, newExprDecl, newExprDecl));
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
      case BasicsPackage.DECL__NAME:
        return basicSetName(null, msgs);
      case BasicsPackage.DECL__SUITE:
        return ((InternalEList<?>)getSuite()).basicRemove(otherEnd, msgs);
      case BasicsPackage.DECL__EXPR_DECL:
        return basicSetExprDecl(null, msgs);
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
      case BasicsPackage.DECL__NAME:
        return getName();
      case BasicsPackage.DECL__SUITE:
        return getSuite();
      case BasicsPackage.DECL__EXPR_DECL:
        return getExprDecl();
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
      case BasicsPackage.DECL__NAME:
        setName((Name)newValue);
        return;
      case BasicsPackage.DECL__SUITE:
        getSuite().clear();
        getSuite().addAll((Collection<? extends Name>)newValue);
        return;
      case BasicsPackage.DECL__EXPR_DECL:
        setExprDecl((Expression)newValue);
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
      case BasicsPackage.DECL__NAME:
        setName((Name)null);
        return;
      case BasicsPackage.DECL__SUITE:
        getSuite().clear();
        return;
      case BasicsPackage.DECL__EXPR_DECL:
        setExprDecl((Expression)null);
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
      case BasicsPackage.DECL__NAME:
        return name != null;
      case BasicsPackage.DECL__SUITE:
        return suite != null && !suite.isEmpty();
      case BasicsPackage.DECL__EXPR_DECL:
        return exprDecl != null;
    }
    return super.eIsSet(featureID);
  }

} //DeclImpl
