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
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ReferencesSigImpl#getAsname <em>Asname</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ReferencesSigImpl#getNameRef <em>Name Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferencesSigImpl extends MinimalEObjectImpl.Container implements ReferencesSig
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.REFERENCES_SIG__ASNAME, oldAsname, newAsname);
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
        msgs = ((InternalEObject)asname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.REFERENCES_SIG__ASNAME, null, msgs);
      if (newAsname != null)
        msgs = ((InternalEObject)newAsname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.REFERENCES_SIG__ASNAME, null, msgs);
      msgs = basicSetAsname(newAsname, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.REFERENCES_SIG__ASNAME, newAsname, newAsname));
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
      case AlsPackage.REFERENCES_SIG__ASNAME:
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
      case AlsPackage.REFERENCES_SIG__ASNAME:
        return getAsname();
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
      case AlsPackage.REFERENCES_SIG__ASNAME:
        setAsname((AsName)newValue);
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
      case AlsPackage.REFERENCES_SIG__ASNAME:
        setAsname((AsName)null);
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
      case AlsPackage.REFERENCES_SIG__ASNAME:
        return asname != null;
      case AlsPackage.REFERENCES_SIG__NAME_REF:
        return nameRef != null;
    }
    return super.eIsSet(featureID);
  }

} //ReferencesSigImpl
