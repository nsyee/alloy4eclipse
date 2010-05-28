/**
 * <copyright>
 * </copyright>
 *

 */
package fr.univartois.cril.xtext.als.impl;

import fr.univartois.cril.xtext.als.Alias;
import fr.univartois.cril.xtext.als.AlsPackage;
import fr.univartois.cril.xtext.als.Block;
import fr.univartois.cril.xtext.als.PredicateName;
import fr.univartois.cril.xtext.als.RunCommand;
import fr.univartois.cril.xtext.als.Scope;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Run Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.RunCommandImpl#getRunName <em>Run Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.RunCommandImpl#getRun <em>Run</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.RunCommandImpl#getName2 <em>Name2</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.RunCommandImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.RunCommandImpl#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RunCommandImpl extends ParagraphImpl implements RunCommand
{
  /**
   * The cached value of the '{@link #getRunName() <em>Run Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRunName()
   * @generated
   * @ordered
   */
  protected Alias runName;

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
  protected PredicateName name2;

  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected Block block;

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
  protected RunCommandImpl()
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
    return AlsPackage.Literals.RUN_COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alias getRunName()
  {
    return runName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRunName(Alias newRunName, NotificationChain msgs)
  {
    Alias oldRunName = runName;
    runName = newRunName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.RUN_COMMAND__RUN_NAME, oldRunName, newRunName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRunName(Alias newRunName)
  {
    if (newRunName != runName)
    {
      NotificationChain msgs = null;
      if (runName != null)
        msgs = ((InternalEObject)runName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.RUN_COMMAND__RUN_NAME, null, msgs);
      if (newRunName != null)
        msgs = ((InternalEObject)newRunName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.RUN_COMMAND__RUN_NAME, null, msgs);
      msgs = basicSetRunName(newRunName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.RUN_COMMAND__RUN_NAME, newRunName, newRunName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.RUN_COMMAND__RUN, oldRun, run));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateName getName2()
  {
    if (name2 != null && name2.eIsProxy())
    {
      InternalEObject oldName2 = (InternalEObject)name2;
      name2 = (PredicateName)eResolveProxy(oldName2);
      if (name2 != oldName2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlsPackage.RUN_COMMAND__NAME2, oldName2, name2));
      }
    }
    return name2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateName basicGetName2()
  {
    return name2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName2(PredicateName newName2)
  {
    PredicateName oldName2 = name2;
    name2 = newName2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.RUN_COMMAND__NAME2, oldName2, name2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs)
  {
    Block oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.RUN_COMMAND__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(Block newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.RUN_COMMAND__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.RUN_COMMAND__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.RUN_COMMAND__BLOCK, newBlock, newBlock));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.RUN_COMMAND__SCOPE, oldScope, newScope);
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
        msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.RUN_COMMAND__SCOPE, null, msgs);
      if (newScope != null)
        msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.RUN_COMMAND__SCOPE, null, msgs);
      msgs = basicSetScope(newScope, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.RUN_COMMAND__SCOPE, newScope, newScope));
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
      case AlsPackage.RUN_COMMAND__RUN_NAME:
        return basicSetRunName(null, msgs);
      case AlsPackage.RUN_COMMAND__BLOCK:
        return basicSetBlock(null, msgs);
      case AlsPackage.RUN_COMMAND__SCOPE:
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
      case AlsPackage.RUN_COMMAND__RUN_NAME:
        return getRunName();
      case AlsPackage.RUN_COMMAND__RUN:
        return getRun();
      case AlsPackage.RUN_COMMAND__NAME2:
        if (resolve) return getName2();
        return basicGetName2();
      case AlsPackage.RUN_COMMAND__BLOCK:
        return getBlock();
      case AlsPackage.RUN_COMMAND__SCOPE:
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
      case AlsPackage.RUN_COMMAND__RUN_NAME:
        setRunName((Alias)newValue);
        return;
      case AlsPackage.RUN_COMMAND__RUN:
        setRun((String)newValue);
        return;
      case AlsPackage.RUN_COMMAND__NAME2:
        setName2((PredicateName)newValue);
        return;
      case AlsPackage.RUN_COMMAND__BLOCK:
        setBlock((Block)newValue);
        return;
      case AlsPackage.RUN_COMMAND__SCOPE:
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
      case AlsPackage.RUN_COMMAND__RUN_NAME:
        setRunName((Alias)null);
        return;
      case AlsPackage.RUN_COMMAND__RUN:
        setRun(RUN_EDEFAULT);
        return;
      case AlsPackage.RUN_COMMAND__NAME2:
        setName2((PredicateName)null);
        return;
      case AlsPackage.RUN_COMMAND__BLOCK:
        setBlock((Block)null);
        return;
      case AlsPackage.RUN_COMMAND__SCOPE:
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
      case AlsPackage.RUN_COMMAND__RUN_NAME:
        return runName != null;
      case AlsPackage.RUN_COMMAND__RUN:
        return RUN_EDEFAULT == null ? run != null : !RUN_EDEFAULT.equals(run);
      case AlsPackage.RUN_COMMAND__NAME2:
        return name2 != null;
      case AlsPackage.RUN_COMMAND__BLOCK:
        return block != null;
      case AlsPackage.RUN_COMMAND__SCOPE:
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

} //RunCommandImpl
