/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics.impl;

import fr.univartois.cril.alloyplugin.basics.BasicsPackage;
import fr.univartois.cril.alloyplugin.basics.BlockBis;
import fr.univartois.cril.alloyplugin.basics.Decl;
import fr.univartois.cril.alloyplugin.basics.Name;
import fr.univartois.cril.alloyplugin.basics.SigDecl;
import fr.univartois.cril.alloyplugin.basics.SigExt;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sig Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.SigDeclImpl#getSigName <em>Sig Name</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.SigDeclImpl#getName2 <em>Name2</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.SigDeclImpl#getSigExt <em>Sig Ext</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.SigDeclImpl#getDecl <em>Decl</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.SigDeclImpl#getDecl2 <em>Decl2</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.SigDeclImpl#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SigDeclImpl extends ParagraphImpl implements SigDecl
{
  /**
   * The cached value of the '{@link #getSigName() <em>Sig Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSigName()
   * @generated
   * @ordered
   */
  protected Name sigName;

  /**
   * The cached value of the '{@link #getName2() <em>Name2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName2()
   * @generated
   * @ordered
   */
  protected EList<Name> name2;

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
   * The cached value of the '{@link #getDecl() <em>Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecl()
   * @generated
   * @ordered
   */
  protected Decl decl;

  /**
   * The cached value of the '{@link #getDecl2() <em>Decl2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecl2()
   * @generated
   * @ordered
   */
  protected EList<Decl> decl2;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SigDeclImpl()
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
    return BasicsPackage.Literals.SIG_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getSigName()
  {
    return sigName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSigName(Name newSigName, NotificationChain msgs)
  {
    Name oldSigName = sigName;
    sigName = newSigName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.SIG_DECL__SIG_NAME, oldSigName, newSigName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSigName(Name newSigName)
  {
    if (newSigName != sigName)
    {
      NotificationChain msgs = null;
      if (sigName != null)
        msgs = ((InternalEObject)sigName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.SIG_DECL__SIG_NAME, null, msgs);
      if (newSigName != null)
        msgs = ((InternalEObject)newSigName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.SIG_DECL__SIG_NAME, null, msgs);
      msgs = basicSetSigName(newSigName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.SIG_DECL__SIG_NAME, newSigName, newSigName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Name> getName2()
  {
    if (name2 == null)
    {
      name2 = new EObjectContainmentEList<Name>(Name.class, this, BasicsPackage.SIG_DECL__NAME2);
    }
    return name2;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.SIG_DECL__SIG_EXT, oldSigExt, newSigExt);
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
        msgs = ((InternalEObject)sigExt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.SIG_DECL__SIG_EXT, null, msgs);
      if (newSigExt != null)
        msgs = ((InternalEObject)newSigExt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.SIG_DECL__SIG_EXT, null, msgs);
      msgs = basicSetSigExt(newSigExt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.SIG_DECL__SIG_EXT, newSigExt, newSigExt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decl getDecl()
  {
    return decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDecl(Decl newDecl, NotificationChain msgs)
  {
    Decl oldDecl = decl;
    decl = newDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.SIG_DECL__DECL, oldDecl, newDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecl(Decl newDecl)
  {
    if (newDecl != decl)
    {
      NotificationChain msgs = null;
      if (decl != null)
        msgs = ((InternalEObject)decl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.SIG_DECL__DECL, null, msgs);
      if (newDecl != null)
        msgs = ((InternalEObject)newDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.SIG_DECL__DECL, null, msgs);
      msgs = basicSetDecl(newDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.SIG_DECL__DECL, newDecl, newDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Decl> getDecl2()
  {
    if (decl2 == null)
    {
      decl2 = new EObjectContainmentEList<Decl>(Decl.class, this, BasicsPackage.SIG_DECL__DECL2);
    }
    return decl2;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.SIG_DECL__B, oldB, newB);
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
        msgs = ((InternalEObject)b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.SIG_DECL__B, null, msgs);
      if (newB != null)
        msgs = ((InternalEObject)newB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.SIG_DECL__B, null, msgs);
      msgs = basicSetB(newB, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.SIG_DECL__B, newB, newB));
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
      case BasicsPackage.SIG_DECL__SIG_NAME:
        return basicSetSigName(null, msgs);
      case BasicsPackage.SIG_DECL__NAME2:
        return ((InternalEList<?>)getName2()).basicRemove(otherEnd, msgs);
      case BasicsPackage.SIG_DECL__SIG_EXT:
        return basicSetSigExt(null, msgs);
      case BasicsPackage.SIG_DECL__DECL:
        return basicSetDecl(null, msgs);
      case BasicsPackage.SIG_DECL__DECL2:
        return ((InternalEList<?>)getDecl2()).basicRemove(otherEnd, msgs);
      case BasicsPackage.SIG_DECL__B:
        return basicSetB(null, msgs);
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
      case BasicsPackage.SIG_DECL__SIG_NAME:
        return getSigName();
      case BasicsPackage.SIG_DECL__NAME2:
        return getName2();
      case BasicsPackage.SIG_DECL__SIG_EXT:
        return getSigExt();
      case BasicsPackage.SIG_DECL__DECL:
        return getDecl();
      case BasicsPackage.SIG_DECL__DECL2:
        return getDecl2();
      case BasicsPackage.SIG_DECL__B:
        return getB();
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
      case BasicsPackage.SIG_DECL__SIG_NAME:
        setSigName((Name)newValue);
        return;
      case BasicsPackage.SIG_DECL__NAME2:
        getName2().clear();
        getName2().addAll((Collection<? extends Name>)newValue);
        return;
      case BasicsPackage.SIG_DECL__SIG_EXT:
        setSigExt((SigExt)newValue);
        return;
      case BasicsPackage.SIG_DECL__DECL:
        setDecl((Decl)newValue);
        return;
      case BasicsPackage.SIG_DECL__DECL2:
        getDecl2().clear();
        getDecl2().addAll((Collection<? extends Decl>)newValue);
        return;
      case BasicsPackage.SIG_DECL__B:
        setB((BlockBis)newValue);
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
      case BasicsPackage.SIG_DECL__SIG_NAME:
        setSigName((Name)null);
        return;
      case BasicsPackage.SIG_DECL__NAME2:
        getName2().clear();
        return;
      case BasicsPackage.SIG_DECL__SIG_EXT:
        setSigExt((SigExt)null);
        return;
      case BasicsPackage.SIG_DECL__DECL:
        setDecl((Decl)null);
        return;
      case BasicsPackage.SIG_DECL__DECL2:
        getDecl2().clear();
        return;
      case BasicsPackage.SIG_DECL__B:
        setB((BlockBis)null);
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
      case BasicsPackage.SIG_DECL__SIG_NAME:
        return sigName != null;
      case BasicsPackage.SIG_DECL__NAME2:
        return name2 != null && !name2.isEmpty();
      case BasicsPackage.SIG_DECL__SIG_EXT:
        return sigExt != null;
      case BasicsPackage.SIG_DECL__DECL:
        return decl != null;
      case BasicsPackage.SIG_DECL__DECL2:
        return decl2 != null && !decl2.isEmpty();
      case BasicsPackage.SIG_DECL__B:
        return b != null;
    }
    return super.eIsSet(featureID);
  }

} //SigDeclImpl
