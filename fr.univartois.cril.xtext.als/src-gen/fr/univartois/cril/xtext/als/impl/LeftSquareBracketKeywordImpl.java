/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext.als.impl;

import fr.univartois.cril.xtext.als.AlsPackage;
import fr.univartois.cril.xtext.als.LeftSquareBracketKeyword;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Left Square Bracket Keyword</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.LeftSquareBracketKeywordImpl#getLeftSquareBracketKeyword <em>Left Square Bracket Keyword</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeftSquareBracketKeywordImpl extends MinimalEObjectImpl.Container implements LeftSquareBracketKeyword
{
  /**
   * The default value of the '{@link #getLeftSquareBracketKeyword() <em>Left Square Bracket Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftSquareBracketKeyword()
   * @generated
   * @ordered
   */
  protected static final String LEFT_SQUARE_BRACKET_KEYWORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLeftSquareBracketKeyword() <em>Left Square Bracket Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftSquareBracketKeyword()
   * @generated
   * @ordered
   */
  protected String leftSquareBracketKeyword = LEFT_SQUARE_BRACKET_KEYWORD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LeftSquareBracketKeywordImpl()
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
    return AlsPackage.Literals.LEFT_SQUARE_BRACKET_KEYWORD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLeftSquareBracketKeyword()
  {
    return leftSquareBracketKeyword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftSquareBracketKeyword(String newLeftSquareBracketKeyword)
  {
    String oldLeftSquareBracketKeyword = leftSquareBracketKeyword;
    leftSquareBracketKeyword = newLeftSquareBracketKeyword;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.LEFT_SQUARE_BRACKET_KEYWORD__LEFT_SQUARE_BRACKET_KEYWORD, oldLeftSquareBracketKeyword, leftSquareBracketKeyword));
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
      case AlsPackage.LEFT_SQUARE_BRACKET_KEYWORD__LEFT_SQUARE_BRACKET_KEYWORD:
        return getLeftSquareBracketKeyword();
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
      case AlsPackage.LEFT_SQUARE_BRACKET_KEYWORD__LEFT_SQUARE_BRACKET_KEYWORD:
        setLeftSquareBracketKeyword((String)newValue);
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
      case AlsPackage.LEFT_SQUARE_BRACKET_KEYWORD__LEFT_SQUARE_BRACKET_KEYWORD:
        setLeftSquareBracketKeyword(LEFT_SQUARE_BRACKET_KEYWORD_EDEFAULT);
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
      case AlsPackage.LEFT_SQUARE_BRACKET_KEYWORD__LEFT_SQUARE_BRACKET_KEYWORD:
        return LEFT_SQUARE_BRACKET_KEYWORD_EDEFAULT == null ? leftSquareBracketKeyword != null : !LEFT_SQUARE_BRACKET_KEYWORD_EDEFAULT.equals(leftSquareBracketKeyword);
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
    result.append(" (leftSquareBracketKeyword: ");
    result.append(leftSquareBracketKeyword);
    result.append(')');
    return result.toString();
  }

} //LeftSquareBracketKeywordImpl
