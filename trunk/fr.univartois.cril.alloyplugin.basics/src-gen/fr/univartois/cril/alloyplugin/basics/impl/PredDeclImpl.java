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
import fr.univartois.cril.alloyplugin.basics.PredDecl;
import fr.univartois.cril.alloyplugin.basics.Ref;

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
 * An implementation of the model object '<em><b>Pred Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.PredDeclImpl#getPred <em>Pred</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.PredDeclImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.PredDeclImpl#getPredName <em>Pred Name</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.PredDeclImpl#getDecl <em>Decl</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.PredDeclImpl#getDecl2 <em>Decl2</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.PredDeclImpl#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PredDeclImpl extends ParagraphImpl implements PredDecl
{
  /**
   * The default value of the '{@link #getPred() <em>Pred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPred()
   * @generated
   * @ordered
   */
  protected static final String PRED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPred() <em>Pred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPred()
   * @generated
   * @ordered
   */
  protected String pred = PRED_EDEFAULT;

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
   * The cached value of the '{@link #getPredName() <em>Pred Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredName()
   * @generated
   * @ordered
   */
  protected Name predName;

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
  protected PredDeclImpl()
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
    return BasicsPackage.Literals.PRED_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPred()
  {
    return pred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPred(String newPred)
  {
    String oldPred = pred;
    pred = newPred;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.PRED_DECL__PRED, oldPred, pred));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.PRED_DECL__REF, oldRef, newRef);
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
        msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.PRED_DECL__REF, null, msgs);
      if (newRef != null)
        msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.PRED_DECL__REF, null, msgs);
      msgs = basicSetRef(newRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.PRED_DECL__REF, newRef, newRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getPredName()
  {
    return predName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredName(Name newPredName, NotificationChain msgs)
  {
    Name oldPredName = predName;
    predName = newPredName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.PRED_DECL__PRED_NAME, oldPredName, newPredName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredName(Name newPredName)
  {
    if (newPredName != predName)
    {
      NotificationChain msgs = null;
      if (predName != null)
        msgs = ((InternalEObject)predName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.PRED_DECL__PRED_NAME, null, msgs);
      if (newPredName != null)
        msgs = ((InternalEObject)newPredName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.PRED_DECL__PRED_NAME, null, msgs);
      msgs = basicSetPredName(newPredName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.PRED_DECL__PRED_NAME, newPredName, newPredName));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.PRED_DECL__DECL, oldDecl, newDecl);
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
        msgs = ((InternalEObject)decl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.PRED_DECL__DECL, null, msgs);
      if (newDecl != null)
        msgs = ((InternalEObject)newDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.PRED_DECL__DECL, null, msgs);
      msgs = basicSetDecl(newDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.PRED_DECL__DECL, newDecl, newDecl));
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
      decl2 = new EObjectContainmentEList<Decl>(Decl.class, this, BasicsPackage.PRED_DECL__DECL2);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.PRED_DECL__B, oldB, newB);
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
        msgs = ((InternalEObject)b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.PRED_DECL__B, null, msgs);
      if (newB != null)
        msgs = ((InternalEObject)newB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.PRED_DECL__B, null, msgs);
      msgs = basicSetB(newB, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.PRED_DECL__B, newB, newB));
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
      case BasicsPackage.PRED_DECL__REF:
        return basicSetRef(null, msgs);
      case BasicsPackage.PRED_DECL__PRED_NAME:
        return basicSetPredName(null, msgs);
      case BasicsPackage.PRED_DECL__DECL:
        return basicSetDecl(null, msgs);
      case BasicsPackage.PRED_DECL__DECL2:
        return ((InternalEList<?>)getDecl2()).basicRemove(otherEnd, msgs);
      case BasicsPackage.PRED_DECL__B:
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
      case BasicsPackage.PRED_DECL__PRED:
        return getPred();
      case BasicsPackage.PRED_DECL__REF:
        return getRef();
      case BasicsPackage.PRED_DECL__PRED_NAME:
        return getPredName();
      case BasicsPackage.PRED_DECL__DECL:
        return getDecl();
      case BasicsPackage.PRED_DECL__DECL2:
        return getDecl2();
      case BasicsPackage.PRED_DECL__B:
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
      case BasicsPackage.PRED_DECL__PRED:
        setPred((String)newValue);
        return;
      case BasicsPackage.PRED_DECL__REF:
        setRef((Ref)newValue);
        return;
      case BasicsPackage.PRED_DECL__PRED_NAME:
        setPredName((Name)newValue);
        return;
      case BasicsPackage.PRED_DECL__DECL:
        setDecl((Decl)newValue);
        return;
      case BasicsPackage.PRED_DECL__DECL2:
        getDecl2().clear();
        getDecl2().addAll((Collection<? extends Decl>)newValue);
        return;
      case BasicsPackage.PRED_DECL__B:
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
      case BasicsPackage.PRED_DECL__PRED:
        setPred(PRED_EDEFAULT);
        return;
      case BasicsPackage.PRED_DECL__REF:
        setRef((Ref)null);
        return;
      case BasicsPackage.PRED_DECL__PRED_NAME:
        setPredName((Name)null);
        return;
      case BasicsPackage.PRED_DECL__DECL:
        setDecl((Decl)null);
        return;
      case BasicsPackage.PRED_DECL__DECL2:
        getDecl2().clear();
        return;
      case BasicsPackage.PRED_DECL__B:
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
      case BasicsPackage.PRED_DECL__PRED:
        return PRED_EDEFAULT == null ? pred != null : !PRED_EDEFAULT.equals(pred);
      case BasicsPackage.PRED_DECL__REF:
        return ref != null;
      case BasicsPackage.PRED_DECL__PRED_NAME:
        return predName != null;
      case BasicsPackage.PRED_DECL__DECL:
        return decl != null;
      case BasicsPackage.PRED_DECL__DECL2:
        return decl2 != null && !decl2.isEmpty();
      case BasicsPackage.PRED_DECL__B:
        return b != null;
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
    result.append(" (pred: ");
    result.append(pred);
    result.append(')');
    return result.toString();
  }

} //PredDeclImpl
