/**
 * <copyright>
 * </copyright>
 *

 */
package fr.univartois.cril.xtext.als.impl;

import fr.univartois.cril.xtext.als.AlsPackage;
import fr.univartois.cril.xtext.als.RightCurlyBracket;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Right Curly Bracket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.RightCurlyBracketImpl#getRightCurlyBracket <em>Right Curly Bracket</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RightCurlyBracketImpl extends MinimalEObjectImpl.Container implements RightCurlyBracket
{
  /**
   * The default value of the '{@link #getRightCurlyBracket() <em>Right Curly Bracket</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightCurlyBracket()
   * @generated
   * @ordered
   */
  protected static final String RIGHT_CURLY_BRACKET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRightCurlyBracket() <em>Right Curly Bracket</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightCurlyBracket()
   * @generated
   * @ordered
   */
  protected String rightCurlyBracket = RIGHT_CURLY_BRACKET_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RightCurlyBracketImpl()
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
    return AlsPackage.Literals.RIGHT_CURLY_BRACKET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRightCurlyBracket()
  {
    return rightCurlyBracket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightCurlyBracket(String newRightCurlyBracket)
  {
    String oldRightCurlyBracket = rightCurlyBracket;
    rightCurlyBracket = newRightCurlyBracket;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.RIGHT_CURLY_BRACKET__RIGHT_CURLY_BRACKET, oldRightCurlyBracket, rightCurlyBracket));
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
      case AlsPackage.RIGHT_CURLY_BRACKET__RIGHT_CURLY_BRACKET:
        return getRightCurlyBracket();
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
      case AlsPackage.RIGHT_CURLY_BRACKET__RIGHT_CURLY_BRACKET:
        setRightCurlyBracket((String)newValue);
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
      case AlsPackage.RIGHT_CURLY_BRACKET__RIGHT_CURLY_BRACKET:
        setRightCurlyBracket(RIGHT_CURLY_BRACKET_EDEFAULT);
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
      case AlsPackage.RIGHT_CURLY_BRACKET__RIGHT_CURLY_BRACKET:
        return RIGHT_CURLY_BRACKET_EDEFAULT == null ? rightCurlyBracket != null : !RIGHT_CURLY_BRACKET_EDEFAULT.equals(rightCurlyBracket);
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
    result.append(" (rightCurlyBracket: ");
    result.append(rightCurlyBracket);
    result.append(')');
    return result.toString();
  }

} //RightCurlyBracketImpl
