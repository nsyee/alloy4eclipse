/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext2.als.impl;

import fr.univartois.cril.xtext2.als.AlsPackage;
import fr.univartois.cril.xtext2.als.Comma;
import fr.univartois.cril.xtext2.als.Expectation;
import fr.univartois.cril.xtext2.als.Scope;
import fr.univartois.cril.xtext2.als.Typescope;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.ScopeImpl#getFor <em>For</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.ScopeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.ScopeImpl#getExpect <em>Expect</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.ScopeImpl#getBut <em>But</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.ScopeImpl#getTypescope <em>Typescope</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.ScopeImpl#getComma <em>Comma</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScopeImpl extends MinimalEObjectImpl.Container implements Scope
{
  /**
   * The default value of the '{@link #getFor() <em>For</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFor()
   * @generated
   * @ordered
   */
  protected static final String FOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFor() <em>For</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFor()
   * @generated
   * @ordered
   */
  protected String for_ = FOR_EDEFAULT;

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
   * The cached value of the '{@link #getExpect() <em>Expect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpect()
   * @generated
   * @ordered
   */
  protected Expectation expect;

  /**
   * The default value of the '{@link #getBut() <em>But</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBut()
   * @generated
   * @ordered
   */
  protected static final String BUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBut() <em>But</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBut()
   * @generated
   * @ordered
   */
  protected String but = BUT_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypescope() <em>Typescope</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypescope()
   * @generated
   * @ordered
   */
  protected EList<Typescope> typescope;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScopeImpl()
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
    return AlsPackage.Literals.SCOPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFor()
  {
    return for_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFor(String newFor)
  {
    String oldFor = for_;
    for_ = newFor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.SCOPE__FOR, oldFor, for_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.SCOPE__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expectation getExpect()
  {
    return expect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpect(Expectation newExpect, NotificationChain msgs)
  {
    Expectation oldExpect = expect;
    expect = newExpect;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.SCOPE__EXPECT, oldExpect, newExpect);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpect(Expectation newExpect)
  {
    if (newExpect != expect)
    {
      NotificationChain msgs = null;
      if (expect != null)
        msgs = ((InternalEObject)expect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.SCOPE__EXPECT, null, msgs);
      if (newExpect != null)
        msgs = ((InternalEObject)newExpect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.SCOPE__EXPECT, null, msgs);
      msgs = basicSetExpect(newExpect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.SCOPE__EXPECT, newExpect, newExpect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBut()
  {
    return but;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBut(String newBut)
  {
    String oldBut = but;
    but = newBut;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.SCOPE__BUT, oldBut, but));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Typescope> getTypescope()
  {
    if (typescope == null)
    {
      typescope = new EObjectContainmentEList<Typescope>(Typescope.class, this, AlsPackage.SCOPE__TYPESCOPE);
    }
    return typescope;
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
      comma = new EObjectContainmentEList<Comma>(Comma.class, this, AlsPackage.SCOPE__COMMA);
    }
    return comma;
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
      case AlsPackage.SCOPE__EXPECT:
        return basicSetExpect(null, msgs);
      case AlsPackage.SCOPE__TYPESCOPE:
        return ((InternalEList<?>)getTypescope()).basicRemove(otherEnd, msgs);
      case AlsPackage.SCOPE__COMMA:
        return ((InternalEList<?>)getComma()).basicRemove(otherEnd, msgs);
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
      case AlsPackage.SCOPE__FOR:
        return getFor();
      case AlsPackage.SCOPE__VALUE:
        return getValue();
      case AlsPackage.SCOPE__EXPECT:
        return getExpect();
      case AlsPackage.SCOPE__BUT:
        return getBut();
      case AlsPackage.SCOPE__TYPESCOPE:
        return getTypescope();
      case AlsPackage.SCOPE__COMMA:
        return getComma();
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
      case AlsPackage.SCOPE__FOR:
        setFor((String)newValue);
        return;
      case AlsPackage.SCOPE__VALUE:
        setValue((Integer)newValue);
        return;
      case AlsPackage.SCOPE__EXPECT:
        setExpect((Expectation)newValue);
        return;
      case AlsPackage.SCOPE__BUT:
        setBut((String)newValue);
        return;
      case AlsPackage.SCOPE__TYPESCOPE:
        getTypescope().clear();
        getTypescope().addAll((Collection<? extends Typescope>)newValue);
        return;
      case AlsPackage.SCOPE__COMMA:
        getComma().clear();
        getComma().addAll((Collection<? extends Comma>)newValue);
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
      case AlsPackage.SCOPE__FOR:
        setFor(FOR_EDEFAULT);
        return;
      case AlsPackage.SCOPE__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case AlsPackage.SCOPE__EXPECT:
        setExpect((Expectation)null);
        return;
      case AlsPackage.SCOPE__BUT:
        setBut(BUT_EDEFAULT);
        return;
      case AlsPackage.SCOPE__TYPESCOPE:
        getTypescope().clear();
        return;
      case AlsPackage.SCOPE__COMMA:
        getComma().clear();
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
      case AlsPackage.SCOPE__FOR:
        return FOR_EDEFAULT == null ? for_ != null : !FOR_EDEFAULT.equals(for_);
      case AlsPackage.SCOPE__VALUE:
        return value != VALUE_EDEFAULT;
      case AlsPackage.SCOPE__EXPECT:
        return expect != null;
      case AlsPackage.SCOPE__BUT:
        return BUT_EDEFAULT == null ? but != null : !BUT_EDEFAULT.equals(but);
      case AlsPackage.SCOPE__TYPESCOPE:
        return typescope != null && !typescope.isEmpty();
      case AlsPackage.SCOPE__COMMA:
        return comma != null && !comma.isEmpty();
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
    result.append(" (for: ");
    result.append(for_);
    result.append(", value: ");
    result.append(value);
    result.append(", but: ");
    result.append(but);
    result.append(')');
    return result.toString();
  }

} //ScopeImpl
