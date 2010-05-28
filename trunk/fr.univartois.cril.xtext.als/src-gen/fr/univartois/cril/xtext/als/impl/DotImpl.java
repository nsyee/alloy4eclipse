/**
 * <copyright>
 * </copyright>
 *

 */
package fr.univartois.cril.xtext.als.impl;

import fr.univartois.cril.xtext.als.AlsPackage;
import fr.univartois.cril.xtext.als.Dot;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.DotImpl#getDot <em>Dot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DotImpl extends MinimalEObjectImpl.Container implements Dot
{
  /**
   * The default value of the '{@link #getDot() <em>Dot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDot()
   * @generated
   * @ordered
   */
  protected static final String DOT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDot() <em>Dot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDot()
   * @generated
   * @ordered
   */
  protected String dot = DOT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DotImpl()
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
    return AlsPackage.Literals.DOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDot()
  {
    return dot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDot(String newDot)
  {
    String oldDot = dot;
    dot = newDot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.DOT__DOT, oldDot, dot));
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
      case AlsPackage.DOT__DOT:
        return getDot();
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
      case AlsPackage.DOT__DOT:
        setDot((String)newValue);
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
      case AlsPackage.DOT__DOT:
        setDot(DOT_EDEFAULT);
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
      case AlsPackage.DOT__DOT:
        return DOT_EDEFAULT == null ? dot != null : !DOT_EDEFAULT.equals(dot);
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
    result.append(" (dot: ");
    result.append(dot);
    result.append(')');
    return result.toString();
  }

} //DotImpl
