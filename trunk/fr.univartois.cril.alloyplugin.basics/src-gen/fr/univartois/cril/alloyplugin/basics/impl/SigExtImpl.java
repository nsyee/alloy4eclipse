/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics.impl;

import fr.univartois.cril.alloyplugin.basics.BasicsPackage;
import fr.univartois.cril.alloyplugin.basics.Ref;
import fr.univartois.cril.alloyplugin.basics.SigExt;

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
 * An implementation of the model object '<em><b>Sig Ext</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.SigExtImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.SigExtImpl#getRef2 <em>Ref2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SigExtImpl extends MinimalEObjectImpl.Container implements SigExt
{
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
   * The cached value of the '{@link #getRef2() <em>Ref2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef2()
   * @generated
   * @ordered
   */
  protected EList<Ref> ref2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SigExtImpl()
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
    return BasicsPackage.Literals.SIG_EXT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.SIG_EXT__REF, oldRef, newRef);
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
        msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.SIG_EXT__REF, null, msgs);
      if (newRef != null)
        msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.SIG_EXT__REF, null, msgs);
      msgs = basicSetRef(newRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.SIG_EXT__REF, newRef, newRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Ref> getRef2()
  {
    if (ref2 == null)
    {
      ref2 = new EObjectContainmentEList<Ref>(Ref.class, this, BasicsPackage.SIG_EXT__REF2);
    }
    return ref2;
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
      case BasicsPackage.SIG_EXT__REF:
        return basicSetRef(null, msgs);
      case BasicsPackage.SIG_EXT__REF2:
        return ((InternalEList<?>)getRef2()).basicRemove(otherEnd, msgs);
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
      case BasicsPackage.SIG_EXT__REF:
        return getRef();
      case BasicsPackage.SIG_EXT__REF2:
        return getRef2();
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
      case BasicsPackage.SIG_EXT__REF:
        setRef((Ref)newValue);
        return;
      case BasicsPackage.SIG_EXT__REF2:
        getRef2().clear();
        getRef2().addAll((Collection<? extends Ref>)newValue);
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
      case BasicsPackage.SIG_EXT__REF:
        setRef((Ref)null);
        return;
      case BasicsPackage.SIG_EXT__REF2:
        getRef2().clear();
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
      case BasicsPackage.SIG_EXT__REF:
        return ref != null;
      case BasicsPackage.SIG_EXT__REF2:
        return ref2 != null && !ref2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SigExtImpl
