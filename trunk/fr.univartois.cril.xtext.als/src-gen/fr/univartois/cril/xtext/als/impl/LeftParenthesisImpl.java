/**
 * <copyright>
 * </copyright>
 *

 */
package fr.univartois.cril.xtext.als.impl;

import fr.univartois.cril.xtext.als.AlsPackage;
import fr.univartois.cril.xtext.als.LeftParenthesis;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Left Parenthesis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.LeftParenthesisImpl#getLeftParenthesis <em>Left Parenthesis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeftParenthesisImpl extends MinimalEObjectImpl.Container implements LeftParenthesis
{
  /**
   * The default value of the '{@link #getLeftParenthesis() <em>Left Parenthesis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftParenthesis()
   * @generated
   * @ordered
   */
  protected static final String LEFT_PARENTHESIS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLeftParenthesis() <em>Left Parenthesis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftParenthesis()
   * @generated
   * @ordered
   */
  protected String leftParenthesis = LEFT_PARENTHESIS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LeftParenthesisImpl()
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
    return AlsPackage.Literals.LEFT_PARENTHESIS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLeftParenthesis()
  {
    return leftParenthesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftParenthesis(String newLeftParenthesis)
  {
    String oldLeftParenthesis = leftParenthesis;
    leftParenthesis = newLeftParenthesis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.LEFT_PARENTHESIS__LEFT_PARENTHESIS, oldLeftParenthesis, leftParenthesis));
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
      case AlsPackage.LEFT_PARENTHESIS__LEFT_PARENTHESIS:
        return getLeftParenthesis();
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
      case AlsPackage.LEFT_PARENTHESIS__LEFT_PARENTHESIS:
        setLeftParenthesis((String)newValue);
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
      case AlsPackage.LEFT_PARENTHESIS__LEFT_PARENTHESIS:
        setLeftParenthesis(LEFT_PARENTHESIS_EDEFAULT);
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
      case AlsPackage.LEFT_PARENTHESIS__LEFT_PARENTHESIS:
        return LEFT_PARENTHESIS_EDEFAULT == null ? leftParenthesis != null : !LEFT_PARENTHESIS_EDEFAULT.equals(leftParenthesis);
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
    result.append(" (leftParenthesis: ");
    result.append(leftParenthesis);
    result.append(')');
    return result.toString();
  }

} //LeftParenthesisImpl
