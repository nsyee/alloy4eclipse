/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics.impl;

import fr.univartois.cril.alloyplugin.basics.BasicsPackage;
import fr.univartois.cril.alloyplugin.basics.BlockBis;
import fr.univartois.cril.alloyplugin.basics.CheckDecl;
import fr.univartois.cril.alloyplugin.basics.Name;
import fr.univartois.cril.alloyplugin.basics.Scope;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.CheckDeclImpl#getCheckName <em>Check Name</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.CheckDeclImpl#getCheck <em>Check</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.CheckDeclImpl#getName2 <em>Name2</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.CheckDeclImpl#getB <em>B</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.CheckDeclImpl#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckDeclImpl extends ParagraphImpl implements CheckDecl
{
  /**
   * The cached value of the '{@link #getCheckName() <em>Check Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCheckName()
   * @generated
   * @ordered
   */
  protected Name checkName;

  /**
   * The default value of the '{@link #getCheck() <em>Check</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCheck()
   * @generated
   * @ordered
   */
  protected static final String CHECK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCheck() <em>Check</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCheck()
   * @generated
   * @ordered
   */
  protected String check = CHECK_EDEFAULT;

  /**
   * The cached value of the '{@link #getName2() <em>Name2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName2()
   * @generated
   * @ordered
   */
  protected Name name2;

  /**
   * The cached value of the '{@link #getB() <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected BlockBis b;

  /**
   * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScope()
   * @generated
   * @ordered
   */
  protected Scope scope;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CheckDeclImpl()
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
    return BasicsPackage.Literals.CHECK_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getCheckName()
  {
    return checkName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCheckName(Name newCheckName, NotificationChain msgs)
  {
    Name oldCheckName = checkName;
    checkName = newCheckName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.CHECK_DECL__CHECK_NAME, oldCheckName, newCheckName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCheckName(Name newCheckName)
  {
    if (newCheckName != checkName)
    {
      NotificationChain msgs = null;
      if (checkName != null)
        msgs = ((InternalEObject)checkName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.CHECK_DECL__CHECK_NAME, null, msgs);
      if (newCheckName != null)
        msgs = ((InternalEObject)newCheckName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.CHECK_DECL__CHECK_NAME, null, msgs);
      msgs = basicSetCheckName(newCheckName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.CHECK_DECL__CHECK_NAME, newCheckName, newCheckName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCheck()
  {
    return check;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCheck(String newCheck)
  {
    String oldCheck = check;
    check = newCheck;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.CHECK_DECL__CHECK, oldCheck, check));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getName2()
  {
    if (name2 != null && name2.eIsProxy())
    {
      InternalEObject oldName2 = (InternalEObject)name2;
      name2 = (Name)eResolveProxy(oldName2);
      if (name2 != oldName2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicsPackage.CHECK_DECL__NAME2, oldName2, name2));
      }
    }
    return name2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name basicGetName2()
  {
    return name2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName2(Name newName2)
  {
    Name oldName2 = name2;
    name2 = newName2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.CHECK_DECL__NAME2, oldName2, name2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockBis getB()
  {
    return b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetB(BlockBis newB, NotificationChain msgs)
  {
    BlockBis oldB = b;
    b = newB;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.CHECK_DECL__B, oldB, newB);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setB(BlockBis newB)
  {
    if (newB != b)
    {
      NotificationChain msgs = null;
      if (b != null)
        msgs = ((InternalEObject)b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.CHECK_DECL__B, null, msgs);
      if (newB != null)
        msgs = ((InternalEObject)newB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.CHECK_DECL__B, null, msgs);
      msgs = basicSetB(newB, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.CHECK_DECL__B, newB, newB));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scope getScope()
  {
    return scope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScope(Scope newScope, NotificationChain msgs)
  {
    Scope oldScope = scope;
    scope = newScope;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.CHECK_DECL__SCOPE, oldScope, newScope);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScope(Scope newScope)
  {
    if (newScope != scope)
    {
      NotificationChain msgs = null;
      if (scope != null)
        msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.CHECK_DECL__SCOPE, null, msgs);
      if (newScope != null)
        msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.CHECK_DECL__SCOPE, null, msgs);
      msgs = basicSetScope(newScope, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.CHECK_DECL__SCOPE, newScope, newScope));
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
      case BasicsPackage.CHECK_DECL__CHECK_NAME:
        return basicSetCheckName(null, msgs);
      case BasicsPackage.CHECK_DECL__B:
        return basicSetB(null, msgs);
      case BasicsPackage.CHECK_DECL__SCOPE:
        return basicSetScope(null, msgs);
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
      case BasicsPackage.CHECK_DECL__CHECK_NAME:
        return getCheckName();
      case BasicsPackage.CHECK_DECL__CHECK:
        return getCheck();
      case BasicsPackage.CHECK_DECL__NAME2:
        if (resolve) return getName2();
        return basicGetName2();
      case BasicsPackage.CHECK_DECL__B:
        return getB();
      case BasicsPackage.CHECK_DECL__SCOPE:
        return getScope();
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
      case BasicsPackage.CHECK_DECL__CHECK_NAME:
        setCheckName((Name)newValue);
        return;
      case BasicsPackage.CHECK_DECL__CHECK:
        setCheck((String)newValue);
        return;
      case BasicsPackage.CHECK_DECL__NAME2:
        setName2((Name)newValue);
        return;
      case BasicsPackage.CHECK_DECL__B:
        setB((BlockBis)newValue);
        return;
      case BasicsPackage.CHECK_DECL__SCOPE:
        setScope((Scope)newValue);
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
      case BasicsPackage.CHECK_DECL__CHECK_NAME:
        setCheckName((Name)null);
        return;
      case BasicsPackage.CHECK_DECL__CHECK:
        setCheck(CHECK_EDEFAULT);
        return;
      case BasicsPackage.CHECK_DECL__NAME2:
        setName2((Name)null);
        return;
      case BasicsPackage.CHECK_DECL__B:
        setB((BlockBis)null);
        return;
      case BasicsPackage.CHECK_DECL__SCOPE:
        setScope((Scope)null);
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
      case BasicsPackage.CHECK_DECL__CHECK_NAME:
        return checkName != null;
      case BasicsPackage.CHECK_DECL__CHECK:
        return CHECK_EDEFAULT == null ? check != null : !CHECK_EDEFAULT.equals(check);
      case BasicsPackage.CHECK_DECL__NAME2:
        return name2 != null;
      case BasicsPackage.CHECK_DECL__B:
        return b != null;
      case BasicsPackage.CHECK_DECL__SCOPE:
        return scope != null;
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
    result.append(" (check: ");
    result.append(check);
    result.append(')');
    return result.toString();
  }

} //CheckDeclImpl
