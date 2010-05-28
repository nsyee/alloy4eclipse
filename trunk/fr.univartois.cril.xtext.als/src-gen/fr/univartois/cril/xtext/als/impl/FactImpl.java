/**
 * <copyright>
 * </copyright>
 *

 */
package fr.univartois.cril.xtext.als.impl;

import fr.univartois.cril.xtext.als.AlsPackage;
import fr.univartois.cril.xtext.als.Block;
import fr.univartois.cril.xtext.als.Fact;
import fr.univartois.cril.xtext.als.FactName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.FactImpl#getFactName <em>Fact Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.FactImpl#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FactImpl extends ParagraphImpl implements Fact
{
  /**
   * The cached value of the '{@link #getFactName() <em>Fact Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactName()
   * @generated
   * @ordered
   */
  protected FactName factName;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FactImpl()
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
    return AlsPackage.Literals.FACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FactName getFactName()
  {
    return factName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFactName(FactName newFactName, NotificationChain msgs)
  {
    FactName oldFactName = factName;
    factName = newFactName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.FACT__FACT_NAME, oldFactName, newFactName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFactName(FactName newFactName)
  {
    if (newFactName != factName)
    {
      NotificationChain msgs = null;
      if (factName != null)
        msgs = ((InternalEObject)factName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FACT__FACT_NAME, null, msgs);
      if (newFactName != null)
        msgs = ((InternalEObject)newFactName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FACT__FACT_NAME, null, msgs);
      msgs = basicSetFactName(newFactName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.FACT__FACT_NAME, newFactName, newFactName));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.FACT__BLOCK, oldBlock, newBlock);
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
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FACT__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.FACT__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.FACT__BLOCK, newBlock, newBlock));
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
      case AlsPackage.FACT__FACT_NAME:
        return basicSetFactName(null, msgs);
      case AlsPackage.FACT__BLOCK:
        return basicSetBlock(null, msgs);
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
      case AlsPackage.FACT__FACT_NAME:
        return getFactName();
      case AlsPackage.FACT__BLOCK:
        return getBlock();
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
      case AlsPackage.FACT__FACT_NAME:
        setFactName((FactName)newValue);
        return;
      case AlsPackage.FACT__BLOCK:
        setBlock((Block)newValue);
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
      case AlsPackage.FACT__FACT_NAME:
        setFactName((FactName)null);
        return;
      case AlsPackage.FACT__BLOCK:
        setBlock((Block)null);
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
      case AlsPackage.FACT__FACT_NAME:
        return factName != null;
      case AlsPackage.FACT__BLOCK:
        return block != null;
    }
    return super.eIsSet(featureID);
  }

} //FactImpl
