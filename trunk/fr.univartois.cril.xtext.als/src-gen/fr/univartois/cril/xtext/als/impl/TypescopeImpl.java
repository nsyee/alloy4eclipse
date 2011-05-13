/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext.als.impl;

import fr.univartois.cril.xtext.als.AlsPackage;
import fr.univartois.cril.xtext.als.AsName;
import fr.univartois.cril.xtext.als.ReferencesName;
import fr.univartois.cril.xtext.als.Typescope;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 *   <li>{@link fr.univartois.cril.xtext.als.impl.TypescopeImpl#getAsname <em>Asname</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.TypescopeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypescopeImpl extends MinimalEObjectImpl.Container implements Typescope
{
  /**
   * The cached value of the '{@link #getAsname() <em>Asname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAsname()
   * @generated
   * @ordered
   */
  protected AsName asname;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected ReferencesName name;

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
    return AlsPackage.Literals.TYPESCOPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AsName getAsname()
  {
    return asname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAsname(AsName newAsname, NotificationChain msgs)
  {
    AsName oldAsname = asname;
    asname = newAsname;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.TYPESCOPE__ASNAME, oldAsname, newAsname);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAsname(AsName newAsname)
  {
    if (newAsname != asname)
    {
      NotificationChain msgs = null;
      if (asname != null)
        msgs = ((InternalEObject)asname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.TYPESCOPE__ASNAME, null, msgs);
      if (newAsname != null)
        msgs = ((InternalEObject)newAsname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.TYPESCOPE__ASNAME, null, msgs);
      msgs = basicSetAsname(newAsname, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.TYPESCOPE__ASNAME, newAsname, newAsname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferencesName getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (ReferencesName)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlsPackage.TYPESCOPE__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferencesName basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(ReferencesName newName)
  {
    ReferencesName oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.TYPESCOPE__NAME, oldName, name));
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
      case AlsPackage.TYPESCOPE__ASNAME:
        return basicSetAsname(null, msgs);
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
      case AlsPackage.TYPESCOPE__ASNAME:
        return getAsname();
      case AlsPackage.TYPESCOPE__NAME:
        if (resolve) return getName();
        return basicGetName();
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
      case AlsPackage.TYPESCOPE__ASNAME:
        setAsname((AsName)newValue);
        return;
      case AlsPackage.TYPESCOPE__NAME:
        setName((ReferencesName)newValue);
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
      case AlsPackage.TYPESCOPE__ASNAME:
        setAsname((AsName)null);
        return;
      case AlsPackage.TYPESCOPE__NAME:
        setName((ReferencesName)null);
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
      case AlsPackage.TYPESCOPE__ASNAME:
        return asname != null;
      case AlsPackage.TYPESCOPE__NAME:
        return name != null;
    }
    return super.eIsSet(featureID);
  }

} //TypescopeImpl
