/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics.impl;

import fr.univartois.cril.alloyplugin.basics.BasicsPackage;
import fr.univartois.cril.alloyplugin.basics.Module;
import fr.univartois.cril.alloyplugin.basics.Name;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.ModuleImpl#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.ModuleImpl#getSuite <em>Suite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends MinimalEObjectImpl.Container implements Module
{
  /**
   * The cached value of the '{@link #getModuleName() <em>Module Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModuleName()
   * @generated
   * @ordered
   */
  protected Name moduleName;

  /**
   * The cached value of the '{@link #getSuite() <em>Suite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuite()
   * @generated
   * @ordered
   */
  protected Name suite;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModuleImpl()
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
    return BasicsPackage.Literals.MODULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getModuleName()
  {
    return moduleName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModuleName(Name newModuleName, NotificationChain msgs)
  {
    Name oldModuleName = moduleName;
    moduleName = newModuleName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.MODULE__MODULE_NAME, oldModuleName, newModuleName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModuleName(Name newModuleName)
  {
    if (newModuleName != moduleName)
    {
      NotificationChain msgs = null;
      if (moduleName != null)
        msgs = ((InternalEObject)moduleName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.MODULE__MODULE_NAME, null, msgs);
      if (newModuleName != null)
        msgs = ((InternalEObject)newModuleName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.MODULE__MODULE_NAME, null, msgs);
      msgs = basicSetModuleName(newModuleName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.MODULE__MODULE_NAME, newModuleName, newModuleName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getSuite()
  {
    return suite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuite(Name newSuite, NotificationChain msgs)
  {
    Name oldSuite = suite;
    suite = newSuite;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.MODULE__SUITE, oldSuite, newSuite);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuite(Name newSuite)
  {
    if (newSuite != suite)
    {
      NotificationChain msgs = null;
      if (suite != null)
        msgs = ((InternalEObject)suite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.MODULE__SUITE, null, msgs);
      if (newSuite != null)
        msgs = ((InternalEObject)newSuite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.MODULE__SUITE, null, msgs);
      msgs = basicSetSuite(newSuite, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.MODULE__SUITE, newSuite, newSuite));
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
      case BasicsPackage.MODULE__MODULE_NAME:
        return basicSetModuleName(null, msgs);
      case BasicsPackage.MODULE__SUITE:
        return basicSetSuite(null, msgs);
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
      case BasicsPackage.MODULE__MODULE_NAME:
        return getModuleName();
      case BasicsPackage.MODULE__SUITE:
        return getSuite();
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
      case BasicsPackage.MODULE__MODULE_NAME:
        setModuleName((Name)newValue);
        return;
      case BasicsPackage.MODULE__SUITE:
        setSuite((Name)newValue);
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
      case BasicsPackage.MODULE__MODULE_NAME:
        setModuleName((Name)null);
        return;
      case BasicsPackage.MODULE__SUITE:
        setSuite((Name)null);
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
      case BasicsPackage.MODULE__MODULE_NAME:
        return moduleName != null;
      case BasicsPackage.MODULE__SUITE:
        return suite != null;
    }
    return super.eIsSet(featureID);
  }

} //ModuleImpl
