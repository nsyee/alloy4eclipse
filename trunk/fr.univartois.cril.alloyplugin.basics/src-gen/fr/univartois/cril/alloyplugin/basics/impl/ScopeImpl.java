/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics.impl;

import fr.univartois.cril.alloyplugin.basics.BasicsPackage;
import fr.univartois.cril.alloyplugin.basics.Scope;
import fr.univartois.cril.alloyplugin.basics.Typescope;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.ScopeImpl#getTypescope <em>Typescope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScopeImpl extends MinimalEObjectImpl.Container implements Scope
{
  /**
   * The cached value of the '{@link #getTypescope() <em>Typescope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypescope()
   * @generated
   * @ordered
   */
  protected Typescope typescope;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScopeImpl()
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
    return BasicsPackage.Literals.SCOPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Typescope getTypescope()
  {
    return typescope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypescope(Typescope newTypescope, NotificationChain msgs)
  {
    Typescope oldTypescope = typescope;
    typescope = newTypescope;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.SCOPE__TYPESCOPE, oldTypescope, newTypescope);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypescope(Typescope newTypescope)
  {
    if (newTypescope != typescope)
    {
      NotificationChain msgs = null;
      if (typescope != null)
        msgs = ((InternalEObject)typescope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.SCOPE__TYPESCOPE, null, msgs);
      if (newTypescope != null)
        msgs = ((InternalEObject)newTypescope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.SCOPE__TYPESCOPE, null, msgs);
      msgs = basicSetTypescope(newTypescope, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.SCOPE__TYPESCOPE, newTypescope, newTypescope));
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
      case BasicsPackage.SCOPE__TYPESCOPE:
        return basicSetTypescope(null, msgs);
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
      case BasicsPackage.SCOPE__TYPESCOPE:
        return getTypescope();
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
      case BasicsPackage.SCOPE__TYPESCOPE:
        setTypescope((Typescope)newValue);
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
      case BasicsPackage.SCOPE__TYPESCOPE:
        setTypescope((Typescope)null);
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
      case BasicsPackage.SCOPE__TYPESCOPE:
        return typescope != null;
    }
    return super.eIsSet(featureID);
  }

} //ScopeImpl
