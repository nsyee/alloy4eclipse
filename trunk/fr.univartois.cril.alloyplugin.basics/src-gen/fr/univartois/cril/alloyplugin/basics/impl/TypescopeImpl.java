/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics.impl;

import fr.univartois.cril.alloyplugin.basics.BasicsPackage;
import fr.univartois.cril.alloyplugin.basics.Name;
import fr.univartois.cril.alloyplugin.basics.Typescope;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typescope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.TypescopeImpl#getN <em>N</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypescopeImpl extends MinimalEObjectImpl.Container implements Typescope
{
  /**
   * The cached value of the '{@link #getN() <em>N</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected Name n;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypescopeImpl()
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
    return BasicsPackage.Literals.TYPESCOPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getN()
  {
    if (n != null && n.eIsProxy())
    {
      InternalEObject oldN = (InternalEObject)n;
      n = (Name)eResolveProxy(oldN);
      if (n != oldN)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicsPackage.TYPESCOPE__N, oldN, n));
      }
    }
    return n;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name basicGetN()
  {
    return n;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setN(Name newN)
  {
    Name oldN = n;
    n = newN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.TYPESCOPE__N, oldN, n));
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
      case BasicsPackage.TYPESCOPE__N:
        if (resolve) return getN();
        return basicGetN();
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
      case BasicsPackage.TYPESCOPE__N:
        setN((Name)newValue);
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
      case BasicsPackage.TYPESCOPE__N:
        setN((Name)null);
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
      case BasicsPackage.TYPESCOPE__N:
        return n != null;
    }
    return super.eIsSet(featureID);
  }

} //TypescopeImpl
