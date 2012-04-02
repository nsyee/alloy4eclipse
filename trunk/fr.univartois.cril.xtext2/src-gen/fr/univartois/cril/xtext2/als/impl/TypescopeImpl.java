/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext2.als.impl;

import fr.univartois.cril.xtext2.als.AlsPackage;
import fr.univartois.cril.xtext2.als.AsName;
import fr.univartois.cril.xtext2.als.ReferencesName;
import fr.univartois.cril.xtext2.als.Typescope;

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
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.TypescopeImpl#getExactly <em>Exactly</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.TypescopeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.TypescopeImpl#getAsname <em>Asname</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.TypescopeImpl#getPrev <em>Prev</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.TypescopeImpl#getSl <em>Sl</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.TypescopeImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.TypescopeImpl#getPost <em>Post</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypescopeImpl extends MinimalEObjectImpl.Container implements Typescope
{
  /**
   * The default value of the '{@link #getExactly() <em>Exactly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExactly()
   * @generated
   * @ordered
   */
  protected static final String EXACTLY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExactly() <em>Exactly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExactly()
   * @generated
   * @ordered
   */
  protected String exactly = EXACTLY_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final int VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected int value = VALUE_EDEFAULT;

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
   * The default value of the '{@link #getPrev() <em>Prev</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrev()
   * @generated
   * @ordered
   */
  protected static final String PREV_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrev() <em>Prev</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrev()
   * @generated
   * @ordered
   */
  protected String prev = PREV_EDEFAULT;

  /**
   * The default value of the '{@link #getSl() <em>Sl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSl()
   * @generated
   * @ordered
   */
  protected static final String SL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSl() <em>Sl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSl()
   * @generated
   * @ordered
   */
  protected String sl = SL_EDEFAULT;

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
   * The default value of the '{@link #getPost() <em>Post</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPost()
   * @generated
   * @ordered
   */
  protected static final String POST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPost() <em>Post</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPost()
   * @generated
   * @ordered
   */
  protected String post = POST_EDEFAULT;

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
  public String getExactly()
  {
    return exactly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExactly(String newExactly)
  {
    String oldExactly = exactly;
    exactly = newExactly;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.TYPESCOPE__EXACTLY, oldExactly, exactly));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(int newValue)
  {
    int oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.TYPESCOPE__VALUE, oldValue, value));
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
  public String getPrev()
  {
    return prev;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrev(String newPrev)
  {
    String oldPrev = prev;
    prev = newPrev;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.TYPESCOPE__PREV, oldPrev, prev));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSl()
  {
    return sl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSl(String newSl)
  {
    String oldSl = sl;
    sl = newSl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.TYPESCOPE__SL, oldSl, sl));
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
  public String getPost()
  {
    return post;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPost(String newPost)
  {
    String oldPost = post;
    post = newPost;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.TYPESCOPE__POST, oldPost, post));
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
      case AlsPackage.TYPESCOPE__EXACTLY:
        return getExactly();
      case AlsPackage.TYPESCOPE__VALUE:
        return getValue();
      case AlsPackage.TYPESCOPE__ASNAME:
        return getAsname();
      case AlsPackage.TYPESCOPE__PREV:
        return getPrev();
      case AlsPackage.TYPESCOPE__SL:
        return getSl();
      case AlsPackage.TYPESCOPE__NAME:
        if (resolve) return getName();
        return basicGetName();
      case AlsPackage.TYPESCOPE__POST:
        return getPost();
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
      case AlsPackage.TYPESCOPE__EXACTLY:
        setExactly((String)newValue);
        return;
      case AlsPackage.TYPESCOPE__VALUE:
        setValue((Integer)newValue);
        return;
      case AlsPackage.TYPESCOPE__ASNAME:
        setAsname((AsName)newValue);
        return;
      case AlsPackage.TYPESCOPE__PREV:
        setPrev((String)newValue);
        return;
      case AlsPackage.TYPESCOPE__SL:
        setSl((String)newValue);
        return;
      case AlsPackage.TYPESCOPE__NAME:
        setName((ReferencesName)newValue);
        return;
      case AlsPackage.TYPESCOPE__POST:
        setPost((String)newValue);
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
      case AlsPackage.TYPESCOPE__EXACTLY:
        setExactly(EXACTLY_EDEFAULT);
        return;
      case AlsPackage.TYPESCOPE__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case AlsPackage.TYPESCOPE__ASNAME:
        setAsname((AsName)null);
        return;
      case AlsPackage.TYPESCOPE__PREV:
        setPrev(PREV_EDEFAULT);
        return;
      case AlsPackage.TYPESCOPE__SL:
        setSl(SL_EDEFAULT);
        return;
      case AlsPackage.TYPESCOPE__NAME:
        setName((ReferencesName)null);
        return;
      case AlsPackage.TYPESCOPE__POST:
        setPost(POST_EDEFAULT);
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
      case AlsPackage.TYPESCOPE__EXACTLY:
        return EXACTLY_EDEFAULT == null ? exactly != null : !EXACTLY_EDEFAULT.equals(exactly);
      case AlsPackage.TYPESCOPE__VALUE:
        return value != VALUE_EDEFAULT;
      case AlsPackage.TYPESCOPE__ASNAME:
        return asname != null;
      case AlsPackage.TYPESCOPE__PREV:
        return PREV_EDEFAULT == null ? prev != null : !PREV_EDEFAULT.equals(prev);
      case AlsPackage.TYPESCOPE__SL:
        return SL_EDEFAULT == null ? sl != null : !SL_EDEFAULT.equals(sl);
      case AlsPackage.TYPESCOPE__NAME:
        return name != null;
      case AlsPackage.TYPESCOPE__POST:
        return POST_EDEFAULT == null ? post != null : !POST_EDEFAULT.equals(post);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (exactly: ");
    result.append(exactly);
    result.append(", value: ");
    result.append(value);
    result.append(", prev: ");
    result.append(prev);
    result.append(", sl: ");
    result.append(sl);
    result.append(", post: ");
    result.append(post);
    result.append(')');
    return result.toString();
  }

} //TypescopeImpl
