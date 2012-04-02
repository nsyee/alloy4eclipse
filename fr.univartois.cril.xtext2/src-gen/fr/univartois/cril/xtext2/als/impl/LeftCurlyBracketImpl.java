/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext2.als.impl;

import fr.univartois.cril.xtext2.als.AlsPackage;
import fr.univartois.cril.xtext2.als.LeftCurlyBracket;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Left Curly Bracket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.LeftCurlyBracketImpl#getLeftCurlyBracket <em>Left Curly Bracket</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeftCurlyBracketImpl extends MinimalEObjectImpl.Container implements LeftCurlyBracket
{
  /**
   * The default value of the '{@link #getLeftCurlyBracket() <em>Left Curly Bracket</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftCurlyBracket()
   * @generated
   * @ordered
   */
  protected static final String LEFT_CURLY_BRACKET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLeftCurlyBracket() <em>Left Curly Bracket</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftCurlyBracket()
   * @generated
   * @ordered
   */
  protected String leftCurlyBracket = LEFT_CURLY_BRACKET_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LeftCurlyBracketImpl()
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
    return AlsPackage.Literals.LEFT_CURLY_BRACKET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLeftCurlyBracket()
  {
    return leftCurlyBracket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftCurlyBracket(String newLeftCurlyBracket)
  {
    String oldLeftCurlyBracket = leftCurlyBracket;
    leftCurlyBracket = newLeftCurlyBracket;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.LEFT_CURLY_BRACKET__LEFT_CURLY_BRACKET, oldLeftCurlyBracket, leftCurlyBracket));
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
      case AlsPackage.LEFT_CURLY_BRACKET__LEFT_CURLY_BRACKET:
        return getLeftCurlyBracket();
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
      case AlsPackage.LEFT_CURLY_BRACKET__LEFT_CURLY_BRACKET:
        setLeftCurlyBracket((String)newValue);
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
      case AlsPackage.LEFT_CURLY_BRACKET__LEFT_CURLY_BRACKET:
        setLeftCurlyBracket(LEFT_CURLY_BRACKET_EDEFAULT);
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
      case AlsPackage.LEFT_CURLY_BRACKET__LEFT_CURLY_BRACKET:
        return LEFT_CURLY_BRACKET_EDEFAULT == null ? leftCurlyBracket != null : !LEFT_CURLY_BRACKET_EDEFAULT.equals(leftCurlyBracket);
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
    result.append(" (leftCurlyBracket: ");
    result.append(leftCurlyBracket);
    result.append(')');
    return result.toString();
  }

} //LeftCurlyBracketImpl
