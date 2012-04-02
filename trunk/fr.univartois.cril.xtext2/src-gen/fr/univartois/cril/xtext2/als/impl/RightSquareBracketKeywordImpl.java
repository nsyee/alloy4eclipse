/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext2.als.impl;

import fr.univartois.cril.xtext2.als.AlsPackage;
import fr.univartois.cril.xtext2.als.RightSquareBracketKeyword;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Right Square Bracket Keyword</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.RightSquareBracketKeywordImpl#getRightSquareBracketKeyword <em>Right Square Bracket Keyword</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RightSquareBracketKeywordImpl extends MinimalEObjectImpl.Container implements RightSquareBracketKeyword
{
  /**
   * The default value of the '{@link #getRightSquareBracketKeyword() <em>Right Square Bracket Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightSquareBracketKeyword()
   * @generated
   * @ordered
   */
  protected static final String RIGHT_SQUARE_BRACKET_KEYWORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRightSquareBracketKeyword() <em>Right Square Bracket Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightSquareBracketKeyword()
   * @generated
   * @ordered
   */
  protected String rightSquareBracketKeyword = RIGHT_SQUARE_BRACKET_KEYWORD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RightSquareBracketKeywordImpl()
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
    return AlsPackage.Literals.RIGHT_SQUARE_BRACKET_KEYWORD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRightSquareBracketKeyword()
  {
    return rightSquareBracketKeyword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightSquareBracketKeyword(String newRightSquareBracketKeyword)
  {
    String oldRightSquareBracketKeyword = rightSquareBracketKeyword;
    rightSquareBracketKeyword = newRightSquareBracketKeyword;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.RIGHT_SQUARE_BRACKET_KEYWORD__RIGHT_SQUARE_BRACKET_KEYWORD, oldRightSquareBracketKeyword, rightSquareBracketKeyword));
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
      case AlsPackage.RIGHT_SQUARE_BRACKET_KEYWORD__RIGHT_SQUARE_BRACKET_KEYWORD:
        return getRightSquareBracketKeyword();
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
      case AlsPackage.RIGHT_SQUARE_BRACKET_KEYWORD__RIGHT_SQUARE_BRACKET_KEYWORD:
        setRightSquareBracketKeyword((String)newValue);
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
      case AlsPackage.RIGHT_SQUARE_BRACKET_KEYWORD__RIGHT_SQUARE_BRACKET_KEYWORD:
        setRightSquareBracketKeyword(RIGHT_SQUARE_BRACKET_KEYWORD_EDEFAULT);
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
      case AlsPackage.RIGHT_SQUARE_BRACKET_KEYWORD__RIGHT_SQUARE_BRACKET_KEYWORD:
        return RIGHT_SQUARE_BRACKET_KEYWORD_EDEFAULT == null ? rightSquareBracketKeyword != null : !RIGHT_SQUARE_BRACKET_KEYWORD_EDEFAULT.equals(rightSquareBracketKeyword);
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
    result.append(" (rightSquareBracketKeyword: ");
    result.append(rightSquareBracketKeyword);
    result.append(')');
    return result.toString();
  }

} //RightSquareBracketKeywordImpl
