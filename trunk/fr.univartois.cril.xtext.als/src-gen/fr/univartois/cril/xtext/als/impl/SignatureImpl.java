/**
 * <copyright>
 * </copyright>
 *

 */
package fr.univartois.cril.xtext.als.impl;

import fr.univartois.cril.xtext.als.AlsPackage;
import fr.univartois.cril.xtext.als.Block;
import fr.univartois.cril.xtext.als.Comma;
import fr.univartois.cril.xtext.als.Decl;
import fr.univartois.cril.xtext.als.SigExt;
import fr.univartois.cril.xtext.als.Signature;
import fr.univartois.cril.xtext.als.SignatureName;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.SignatureImpl#getSignatureName <em>Signature Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.SignatureImpl#getComma <em>Comma</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.SignatureImpl#getSigExt <em>Sig Ext</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.SignatureImpl#getDecl <em>Decl</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.SignatureImpl#getComma2 <em>Comma2</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.SignatureImpl#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignatureImpl extends ParagraphImpl implements Signature
{
  /**
   * The cached value of the '{@link #getSignatureName() <em>Signature Name</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignatureName()
   * @generated
   * @ordered
   */
  protected EList<SignatureName> signatureName;

  /**
   * The cached value of the '{@link #getComma() <em>Comma</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComma()
   * @generated
   * @ordered
   */
  protected EList<Comma> comma;

  /**
   * The cached value of the '{@link #getSigExt() <em>Sig Ext</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSigExt()
   * @generated
   * @ordered
   */
  protected SigExt sigExt;

  /**
   * The cached value of the '{@link #getDecl() <em>Decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecl()
   * @generated
   * @ordered
   */
  protected EList<Decl> decl;

  /**
   * The cached value of the '{@link #getComma2() <em>Comma2</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComma2()
   * @generated
   * @ordered
   */
  protected EList<String> comma2;

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
  protected SignatureImpl()
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
    return AlsPackage.Literals.SIGNATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SignatureName> getSignatureName()
  {
    if (signatureName == null)
    {
      signatureName = new EObjectContainmentEList<SignatureName>(SignatureName.class, this, AlsPackage.SIGNATURE__SIGNATURE_NAME);
    }
    return signatureName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Comma> getComma()
  {
    if (comma == null)
    {
      comma = new EObjectContainmentEList<Comma>(Comma.class, this, AlsPackage.SIGNATURE__COMMA);
    }
    return comma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SigExt getSigExt()
  {
    return sigExt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSigExt(SigExt newSigExt, NotificationChain msgs)
  {
    SigExt oldSigExt = sigExt;
    sigExt = newSigExt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.SIGNATURE__SIG_EXT, oldSigExt, newSigExt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSigExt(SigExt newSigExt)
  {
    if (newSigExt != sigExt)
    {
      NotificationChain msgs = null;
      if (sigExt != null)
        msgs = ((InternalEObject)sigExt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.SIGNATURE__SIG_EXT, null, msgs);
      if (newSigExt != null)
        msgs = ((InternalEObject)newSigExt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.SIGNATURE__SIG_EXT, null, msgs);
      msgs = basicSetSigExt(newSigExt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.SIGNATURE__SIG_EXT, newSigExt, newSigExt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Decl> getDecl()
  {
    if (decl == null)
    {
      decl = new EObjectContainmentEList<Decl>(Decl.class, this, AlsPackage.SIGNATURE__DECL);
    }
    return decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getComma2()
  {
    if (comma2 == null)
    {
      comma2 = new EDataTypeEList<String>(String.class, this, AlsPackage.SIGNATURE__COMMA2);
    }
    return comma2;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.SIGNATURE__BLOCK, oldBlock, newBlock);
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
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.SIGNATURE__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.SIGNATURE__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.SIGNATURE__BLOCK, newBlock, newBlock));
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
      case AlsPackage.SIGNATURE__SIGNATURE_NAME:
        return ((InternalEList<?>)getSignatureName()).basicRemove(otherEnd, msgs);
      case AlsPackage.SIGNATURE__COMMA:
        return ((InternalEList<?>)getComma()).basicRemove(otherEnd, msgs);
      case AlsPackage.SIGNATURE__SIG_EXT:
        return basicSetSigExt(null, msgs);
      case AlsPackage.SIGNATURE__DECL:
        return ((InternalEList<?>)getDecl()).basicRemove(otherEnd, msgs);
      case AlsPackage.SIGNATURE__BLOCK:
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
      case AlsPackage.SIGNATURE__SIGNATURE_NAME:
        return getSignatureName();
      case AlsPackage.SIGNATURE__COMMA:
        return getComma();
      case AlsPackage.SIGNATURE__SIG_EXT:
        return getSigExt();
      case AlsPackage.SIGNATURE__DECL:
        return getDecl();
      case AlsPackage.SIGNATURE__COMMA2:
        return getComma2();
      case AlsPackage.SIGNATURE__BLOCK:
        return getBlock();
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
      case AlsPackage.SIGNATURE__SIGNATURE_NAME:
        getSignatureName().clear();
        getSignatureName().addAll((Collection<? extends SignatureName>)newValue);
        return;
      case AlsPackage.SIGNATURE__COMMA:
        getComma().clear();
        getComma().addAll((Collection<? extends Comma>)newValue);
        return;
      case AlsPackage.SIGNATURE__SIG_EXT:
        setSigExt((SigExt)newValue);
        return;
      case AlsPackage.SIGNATURE__DECL:
        getDecl().clear();
        getDecl().addAll((Collection<? extends Decl>)newValue);
        return;
      case AlsPackage.SIGNATURE__COMMA2:
        getComma2().clear();
        getComma2().addAll((Collection<? extends String>)newValue);
        return;
      case AlsPackage.SIGNATURE__BLOCK:
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
      case AlsPackage.SIGNATURE__SIGNATURE_NAME:
        getSignatureName().clear();
        return;
      case AlsPackage.SIGNATURE__COMMA:
        getComma().clear();
        return;
      case AlsPackage.SIGNATURE__SIG_EXT:
        setSigExt((SigExt)null);
        return;
      case AlsPackage.SIGNATURE__DECL:
        getDecl().clear();
        return;
      case AlsPackage.SIGNATURE__COMMA2:
        getComma2().clear();
        return;
      case AlsPackage.SIGNATURE__BLOCK:
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
      case AlsPackage.SIGNATURE__SIGNATURE_NAME:
        return signatureName != null && !signatureName.isEmpty();
      case AlsPackage.SIGNATURE__COMMA:
        return comma != null && !comma.isEmpty();
      case AlsPackage.SIGNATURE__SIG_EXT:
        return sigExt != null;
      case AlsPackage.SIGNATURE__DECL:
        return decl != null && !decl.isEmpty();
      case AlsPackage.SIGNATURE__COMMA2:
        return comma2 != null && !comma2.isEmpty();
      case AlsPackage.SIGNATURE__BLOCK:
        return block != null;
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
    result.append(" (comma2: ");
    result.append(comma2);
    result.append(')');
    return result.toString();
  }

} //SignatureImpl
