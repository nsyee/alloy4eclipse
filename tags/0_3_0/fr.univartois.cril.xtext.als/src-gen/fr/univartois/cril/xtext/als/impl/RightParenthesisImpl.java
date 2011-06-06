/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext.als.impl;

import fr.univartois.cril.xtext.als.AlsPackage;
import fr.univartois.cril.xtext.als.RightParenthesis;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Right Parenthesis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.RightParenthesisImpl#getRightParenthesis <em>Right Parenthesis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RightParenthesisImpl extends MinimalEObjectImpl.Container implements RightParenthesis
{
  /**
   * The default value of the '{@link #getRightParenthesis() <em>Right Parenthesis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightParenthesis()
   * @generated
   * @ordered
   */
  protected static final String RIGHT_PARENTHESIS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRightParenthesis() <em>Right Parenthesis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightParenthesis()
   * @generated
   * @ordered
   */
  protected String rightParenthesis = RIGHT_PARENTHESIS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RightParenthesisImpl()
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
    return AlsPackage.Literals.RIGHT_PARENTHESIS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRightParenthesis()
  {
    return rightParenthesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightParenthesis(String newRightParenthesis)
  {
    String oldRightParenthesis = rightParenthesis;
    rightParenthesis = newRightParenthesis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.RIGHT_PARENTHESIS__RIGHT_PARENTHESIS, oldRightParenthesis, rightParenthesis));
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
      case AlsPackage.RIGHT_PARENTHESIS__RIGHT_PARENTHESIS:
        return getRightParenthesis();
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
      case AlsPackage.RIGHT_PARENTHESIS__RIGHT_PARENTHESIS:
        setRightParenthesis((String)newValue);
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
      case AlsPackage.RIGHT_PARENTHESIS__RIGHT_PARENTHESIS:
        setRightParenthesis(RIGHT_PARENTHESIS_EDEFAULT);
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
      case AlsPackage.RIGHT_PARENTHESIS__RIGHT_PARENTHESIS:
        return RIGHT_PARENTHESIS_EDEFAULT == null ? rightParenthesis != null : !RIGHT_PARENTHESIS_EDEFAULT.equals(rightParenthesis);
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
    result.append(" (rightParenthesis: ");
    result.append(rightParenthesis);
    result.append(')');
    return result.toString();
  }

} //RightParenthesisImpl
