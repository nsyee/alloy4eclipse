/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics.impl;

import fr.univartois.cril.alloyplugin.basics.BasicsPackage;
import fr.univartois.cril.alloyplugin.basics.BlockBis;
import fr.univartois.cril.alloyplugin.basics.Name;
import fr.univartois.cril.alloyplugin.basics.RunDecl;
import fr.univartois.cril.alloyplugin.basics.Scope;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Run Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.RunDeclImpl#getRunName <em>Run Name</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.RunDeclImpl#getRun <em>Run</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.RunDeclImpl#getName2 <em>Name2</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.RunDeclImpl#getB <em>B</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.RunDeclImpl#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RunDeclImpl extends ParagraphImpl implements RunDecl
{
  /**
   * The cached value of the '{@link #getRunName() <em>Run Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRunName()
   * @generated
   * @ordered
   */
  protected Name runName;

  /**
   * The default value of the '{@link #getRun() <em>Run</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRun()
   * @generated
   * @ordered
   */
  protected static final String RUN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRun() <em>Run</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRun()
   * @generated
   * @ordered
   */
  protected String run = RUN_EDEFAULT;

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
  protected RunDeclImpl()
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
    return BasicsPackage.Literals.RUN_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getRunName()
  {
    return runName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRunName(Name newRunName, NotificationChain msgs)
  {
    Name oldRunName = runName;
    runName = newRunName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.RUN_DECL__RUN_NAME, oldRunName, newRunName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRunName(Name newRunName)
  {
    if (newRunName != runName)
    {
      NotificationChain msgs = null;
      if (runName != null)
        msgs = ((InternalEObject)runName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.RUN_DECL__RUN_NAME, null, msgs);
      if (newRunName != null)
        msgs = ((InternalEObject)newRunName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.RUN_DECL__RUN_NAME, null, msgs);
      msgs = basicSetRunName(newRunName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.RUN_DECL__RUN_NAME, newRunName, newRunName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRun()
  {
    return run;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRun(String newRun)
  {
    String oldRun = run;
    run = newRun;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.RUN_DECL__RUN, oldRun, run));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicsPackage.RUN_DECL__NAME2, oldName2, name2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.RUN_DECL__NAME2, oldName2, name2));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.RUN_DECL__B, oldB, newB);
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
        msgs = ((InternalEObject)b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.RUN_DECL__B, null, msgs);
      if (newB != null)
        msgs = ((InternalEObject)newB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.RUN_DECL__B, null, msgs);
      msgs = basicSetB(newB, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.RUN_DECL__B, newB, newB));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.RUN_DECL__SCOPE, oldScope, newScope);
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
        msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.RUN_DECL__SCOPE, null, msgs);
      if (newScope != null)
        msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.RUN_DECL__SCOPE, null, msgs);
      msgs = basicSetScope(newScope, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.RUN_DECL__SCOPE, newScope, newScope));
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
      case BasicsPackage.RUN_DECL__RUN_NAME:
        return basicSetRunName(null, msgs);
      case BasicsPackage.RUN_DECL__B:
        return basicSetB(null, msgs);
      case BasicsPackage.RUN_DECL__SCOPE:
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
      case BasicsPackage.RUN_DECL__RUN_NAME:
        return getRunName();
      case BasicsPackage.RUN_DECL__RUN:
        return getRun();
      case BasicsPackage.RUN_DECL__NAME2:
        if (resolve) return getName2();
        return basicGetName2();
      case BasicsPackage.RUN_DECL__B:
        return getB();
      case BasicsPackage.RUN_DECL__SCOPE:
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
      case BasicsPackage.RUN_DECL__RUN_NAME:
        setRunName((Name)newValue);
        return;
      case BasicsPackage.RUN_DECL__RUN:
        setRun((String)newValue);
        return;
      case BasicsPackage.RUN_DECL__NAME2:
        setName2((Name)newValue);
        return;
      case BasicsPackage.RUN_DECL__B:
        setB((BlockBis)newValue);
        return;
      case BasicsPackage.RUN_DECL__SCOPE:
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
      case BasicsPackage.RUN_DECL__RUN_NAME:
        setRunName((Name)null);
        return;
      case BasicsPackage.RUN_DECL__RUN:
        setRun(RUN_EDEFAULT);
        return;
      case BasicsPackage.RUN_DECL__NAME2:
        setName2((Name)null);
        return;
      case BasicsPackage.RUN_DECL__B:
        setB((BlockBis)null);
        return;
      case BasicsPackage.RUN_DECL__SCOPE:
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
      case BasicsPackage.RUN_DECL__RUN_NAME:
        return runName != null;
      case BasicsPackage.RUN_DECL__RUN:
        return RUN_EDEFAULT == null ? run != null : !RUN_EDEFAULT.equals(run);
      case BasicsPackage.RUN_DECL__NAME2:
        return name2 != null;
      case BasicsPackage.RUN_DECL__B:
        return b != null;
      case BasicsPackage.RUN_DECL__SCOPE:
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
    result.append(" (run: ");
    result.append(run);
    result.append(')');
    return result.toString();
  }

} //RunDeclImpl
