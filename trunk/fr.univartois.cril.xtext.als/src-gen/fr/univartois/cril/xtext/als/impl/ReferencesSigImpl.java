/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext.als.impl;

import fr.univartois.cril.xtext.als.AlsPackage;
import fr.univartois.cril.xtext.als.AsName;
import fr.univartois.cril.xtext.als.ReferencesSig;
import fr.univartois.cril.xtext.als.SignatureName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>References Sig</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ReferencesSigImpl#getAsName <em>As Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ReferencesSigImpl#getNameRef <em>Name Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferencesSigImpl extends MinimalEObjectImpl.Container implements ReferencesSig
{
  /**
   * The cached value of the '{@link #getAsName() <em>As Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAsName()
   * @generated
   * @ordered
   */
  protected AsName asName;

  /**
   * The cached value of the '{@link #getNameRef() <em>Name Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameRef()
   * @generated
   * @ordered
   */
  protected SignatureName nameRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferencesSigImpl()
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
    return AlsPackage.Literals.REFERENCES_SIG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AsName getAsName()
  {
    return asName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAsName(AsName newAsName, NotificationChain msgs)
  {
    AsName oldAsName = asName;
    asName = newAsName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.REFERENCES_SIG__AS_NAME, oldAsName, newAsName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAsName(AsName newAsName)
  {
    if (newAsName != asName)
    {
      NotificationChain msgs = null;
      if (asName != null)
        msgs = ((InternalEObject)asName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.REFERENCES_SIG__AS_NAME, null, msgs);
      if (newAsName != null)
        msgs = ((InternalEObject)newAsName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.REFERENCES_SIG__AS_NAME, null, msgs);
      msgs = basicSetAsName(newAsName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.REFERENCES_SIG__AS_NAME, newAsName, newAsName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignatureName getNameRef()
  {
    if (nameRef != null && nameRef.eIsProxy())
    {
      InternalEObject oldNameRef = (InternalEObject)nameRef;
      nameRef = (SignatureName)eResolveProxy(oldNameRef);
      if (nameRef != oldNameRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlsPackage.REFERENCES_SIG__NAME_REF, oldNameRef, nameRef));
      }
    }
    return nameRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignatureName basicGetNameRef()
  {
    return nameRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameRef(SignatureName newNameRef)
  {
    SignatureName oldNameRef = nameRef;
    nameRef = newNameRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.REFERENCES_SIG__NAME_REF, oldNameRef, nameRef));
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
      case AlsPackage.REFERENCES_SIG__AS_NAME:
        return basicSetAsName(null, msgs);
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
      case AlsPackage.REFERENCES_SIG__AS_NAME:
        return getAsName();
      case AlsPackage.REFERENCES_SIG__NAME_REF:
        if (resolve) return getNameRef();
        return basicGetNameRef();
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
      case AlsPackage.REFERENCES_SIG__AS_NAME:
        setAsName((AsName)newValue);
        return;
      case AlsPackage.REFERENCES_SIG__NAME_REF:
        setNameRef((SignatureName)newValue);
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
      case AlsPackage.REFERENCES_SIG__AS_NAME:
        setAsName((AsName)null);
        return;
      case AlsPackage.REFERENCES_SIG__NAME_REF:
        setNameRef((SignatureName)null);
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
      case AlsPackage.REFERENCES_SIG__AS_NAME:
        return asName != null;
      case AlsPackage.REFERENCES_SIG__NAME_REF:
        return nameRef != null;
    }
    return super.eIsSet(featureID);
  }

} //ReferencesSigImpl
