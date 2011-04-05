/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext.als.impl;

import fr.univartois.cril.xtext.als.AlsPackage;
import fr.univartois.cril.xtext.als.Colon;
import fr.univartois.cril.xtext.als.Comma;
import fr.univartois.cril.xtext.als.Decl;
import fr.univartois.cril.xtext.als.Expression;
import fr.univartois.cril.xtext.als.PropertyName;

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
 *   <li>{@link fr.univartois.cril.xtext.als.impl.DeclImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.DeclImpl#getComma <em>Comma</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.DeclImpl#getColon <em>Colon</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.DeclImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclImpl extends MinimalEObjectImpl.Container implements Decl
{
  /**
   * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyName()
   * @generated
   * @ordered
   */
  protected EList<PropertyName> propertyName;

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
    return AlsPackage.Literals.DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PropertyName> getPropertyName()
  {
    if (propertyName == null)
    {
      propertyName = new EObjectContainmentEList<PropertyName>(PropertyName.class, this, AlsPackage.DECL__PROPERTY_NAME);
    }
    return propertyName;
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
      comma = new EObjectContainmentEList<Comma>(Comma.class, this, AlsPackage.DECL__COMMA);
    }
    return comma;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.DECL__COLON, oldColon, newColon);
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
        msgs = ((InternalEObject)colon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.DECL__COLON, null, msgs);
      if (newColon != null)
        msgs = ((InternalEObject)newColon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.DECL__COLON, null, msgs);
      msgs = basicSetColon(newColon, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.DECL__COLON, newColon, newColon));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.DECL__EXPR, oldExpr, newExpr);
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
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.DECL__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.DECL__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.DECL__EXPR, newExpr, newExpr));
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
      case AlsPackage.DECL__PROPERTY_NAME:
        return ((InternalEList<?>)getPropertyName()).basicRemove(otherEnd, msgs);
      case AlsPackage.DECL__COMMA:
        return ((InternalEList<?>)getComma()).basicRemove(otherEnd, msgs);
      case AlsPackage.DECL__COLON:
        return basicSetColon(null, msgs);
      case AlsPackage.DECL__EXPR:
        return basicSetExpr(null, msgs);
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
      case AlsPackage.DECL__PROPERTY_NAME:
        return getPropertyName();
      case AlsPackage.DECL__COMMA:
        return getComma();
      case AlsPackage.DECL__COLON:
        return getColon();
      case AlsPackage.DECL__EXPR:
        return getExpr();
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
      case AlsPackage.DECL__PROPERTY_NAME:
        getPropertyName().clear();
        getPropertyName().addAll((Collection<? extends PropertyName>)newValue);
        return;
      case AlsPackage.DECL__COMMA:
        getComma().clear();
        getComma().addAll((Collection<? extends Comma>)newValue);
        return;
      case AlsPackage.DECL__COLON:
        setColon((Colon)newValue);
        return;
      case AlsPackage.DECL__EXPR:
        setExpr((Expression)newValue);
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
      case AlsPackage.DECL__PROPERTY_NAME:
        getPropertyName().clear();
        return;
      case AlsPackage.DECL__COMMA:
        getComma().clear();
        return;
      case AlsPackage.DECL__COLON:
        setColon((Colon)null);
        return;
      case AlsPackage.DECL__EXPR:
        setExpr((Expression)null);
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
      case AlsPackage.DECL__PROPERTY_NAME:
        return propertyName != null && !propertyName.isEmpty();
      case AlsPackage.DECL__COMMA:
        return comma != null && !comma.isEmpty();
      case AlsPackage.DECL__COLON:
        return colon != null;
      case AlsPackage.DECL__EXPR:
        return expr != null;
    }
    return super.eIsSet(featureID);
  }

} //DeclImpl
