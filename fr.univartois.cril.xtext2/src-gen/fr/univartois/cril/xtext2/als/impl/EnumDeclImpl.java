/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext2.als.impl;

import fr.univartois.cril.xtext2.als.AlsPackage;
import fr.univartois.cril.xtext2.als.Comma;
import fr.univartois.cril.xtext2.als.EnumDecl;
import fr.univartois.cril.xtext2.als.EnumName;
import fr.univartois.cril.xtext2.als.EnumPropertyName;
import fr.univartois.cril.xtext2.als.LeftCurlyBracket;
import fr.univartois.cril.xtext2.als.RightCurlyBracket;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.EnumDeclImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.EnumDeclImpl#getEnumName <em>Enum Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.EnumDeclImpl#getLeftC <em>Left C</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.EnumDeclImpl#getPropertyEnum <em>Property Enum</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.EnumDeclImpl#getComma <em>Comma</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext2.als.impl.EnumDeclImpl#getRightC <em>Right C</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumDeclImpl extends ParagraphImpl implements EnumDecl
{
  /**
   * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected EList<String> documentation;

  /**
   * The cached value of the '{@link #getEnumName() <em>Enum Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumName()
   * @generated
   * @ordered
   */
  protected EnumName enumName;

  /**
   * The cached value of the '{@link #getLeftC() <em>Left C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftC()
   * @generated
   * @ordered
   */
  protected LeftCurlyBracket leftC;

  /**
   * The cached value of the '{@link #getPropertyEnum() <em>Property Enum</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyEnum()
   * @generated
   * @ordered
   */
  protected EList<EnumPropertyName> propertyEnum;

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
   * The cached value of the '{@link #getRightC() <em>Right C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightC()
   * @generated
   * @ordered
   */
  protected RightCurlyBracket rightC;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumDeclImpl()
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
    return AlsPackage.Literals.ENUM_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDocumentation()
  {
    if (documentation == null)
    {
      documentation = new EDataTypeEList<String>(String.class, this, AlsPackage.ENUM_DECL__DOCUMENTATION);
    }
    return documentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumName getEnumName()
  {
    return enumName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnumName(EnumName newEnumName, NotificationChain msgs)
  {
    EnumName oldEnumName = enumName;
    enumName = newEnumName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.ENUM_DECL__ENUM_NAME, oldEnumName, newEnumName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumName(EnumName newEnumName)
  {
    if (newEnumName != enumName)
    {
      NotificationChain msgs = null;
      if (enumName != null)
        msgs = ((InternalEObject)enumName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.ENUM_DECL__ENUM_NAME, null, msgs);
      if (newEnumName != null)
        msgs = ((InternalEObject)newEnumName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.ENUM_DECL__ENUM_NAME, null, msgs);
      msgs = basicSetEnumName(newEnumName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.ENUM_DECL__ENUM_NAME, newEnumName, newEnumName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftCurlyBracket getLeftC()
  {
    return leftC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftC(LeftCurlyBracket newLeftC, NotificationChain msgs)
  {
    LeftCurlyBracket oldLeftC = leftC;
    leftC = newLeftC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.ENUM_DECL__LEFT_C, oldLeftC, newLeftC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftC(LeftCurlyBracket newLeftC)
  {
    if (newLeftC != leftC)
    {
      NotificationChain msgs = null;
      if (leftC != null)
        msgs = ((InternalEObject)leftC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.ENUM_DECL__LEFT_C, null, msgs);
      if (newLeftC != null)
        msgs = ((InternalEObject)newLeftC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.ENUM_DECL__LEFT_C, null, msgs);
      msgs = basicSetLeftC(newLeftC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.ENUM_DECL__LEFT_C, newLeftC, newLeftC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EnumPropertyName> getPropertyEnum()
  {
    if (propertyEnum == null)
    {
      propertyEnum = new EObjectContainmentEList<EnumPropertyName>(EnumPropertyName.class, this, AlsPackage.ENUM_DECL__PROPERTY_ENUM);
    }
    return propertyEnum;
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
      comma = new EObjectContainmentEList<Comma>(Comma.class, this, AlsPackage.ENUM_DECL__COMMA);
    }
    return comma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightCurlyBracket getRightC()
  {
    return rightC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightC(RightCurlyBracket newRightC, NotificationChain msgs)
  {
    RightCurlyBracket oldRightC = rightC;
    rightC = newRightC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.ENUM_DECL__RIGHT_C, oldRightC, newRightC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightC(RightCurlyBracket newRightC)
  {
    if (newRightC != rightC)
    {
      NotificationChain msgs = null;
      if (rightC != null)
        msgs = ((InternalEObject)rightC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.ENUM_DECL__RIGHT_C, null, msgs);
      if (newRightC != null)
        msgs = ((InternalEObject)newRightC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.ENUM_DECL__RIGHT_C, null, msgs);
      msgs = basicSetRightC(newRightC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.ENUM_DECL__RIGHT_C, newRightC, newRightC));
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
      case AlsPackage.ENUM_DECL__ENUM_NAME:
        return basicSetEnumName(null, msgs);
      case AlsPackage.ENUM_DECL__LEFT_C:
        return basicSetLeftC(null, msgs);
      case AlsPackage.ENUM_DECL__PROPERTY_ENUM:
        return ((InternalEList<?>)getPropertyEnum()).basicRemove(otherEnd, msgs);
      case AlsPackage.ENUM_DECL__COMMA:
        return ((InternalEList<?>)getComma()).basicRemove(otherEnd, msgs);
      case AlsPackage.ENUM_DECL__RIGHT_C:
        return basicSetRightC(null, msgs);
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
      case AlsPackage.ENUM_DECL__DOCUMENTATION:
        return getDocumentation();
      case AlsPackage.ENUM_DECL__ENUM_NAME:
        return getEnumName();
      case AlsPackage.ENUM_DECL__LEFT_C:
        return getLeftC();
      case AlsPackage.ENUM_DECL__PROPERTY_ENUM:
        return getPropertyEnum();
      case AlsPackage.ENUM_DECL__COMMA:
        return getComma();
      case AlsPackage.ENUM_DECL__RIGHT_C:
        return getRightC();
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
      case AlsPackage.ENUM_DECL__DOCUMENTATION:
        getDocumentation().clear();
        getDocumentation().addAll((Collection<? extends String>)newValue);
        return;
      case AlsPackage.ENUM_DECL__ENUM_NAME:
        setEnumName((EnumName)newValue);
        return;
      case AlsPackage.ENUM_DECL__LEFT_C:
        setLeftC((LeftCurlyBracket)newValue);
        return;
      case AlsPackage.ENUM_DECL__PROPERTY_ENUM:
        getPropertyEnum().clear();
        getPropertyEnum().addAll((Collection<? extends EnumPropertyName>)newValue);
        return;
      case AlsPackage.ENUM_DECL__COMMA:
        getComma().clear();
        getComma().addAll((Collection<? extends Comma>)newValue);
        return;
      case AlsPackage.ENUM_DECL__RIGHT_C:
        setRightC((RightCurlyBracket)newValue);
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
      case AlsPackage.ENUM_DECL__DOCUMENTATION:
        getDocumentation().clear();
        return;
      case AlsPackage.ENUM_DECL__ENUM_NAME:
        setEnumName((EnumName)null);
        return;
      case AlsPackage.ENUM_DECL__LEFT_C:
        setLeftC((LeftCurlyBracket)null);
        return;
      case AlsPackage.ENUM_DECL__PROPERTY_ENUM:
        getPropertyEnum().clear();
        return;
      case AlsPackage.ENUM_DECL__COMMA:
        getComma().clear();
        return;
      case AlsPackage.ENUM_DECL__RIGHT_C:
        setRightC((RightCurlyBracket)null);
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
      case AlsPackage.ENUM_DECL__DOCUMENTATION:
        return documentation != null && !documentation.isEmpty();
      case AlsPackage.ENUM_DECL__ENUM_NAME:
        return enumName != null;
      case AlsPackage.ENUM_DECL__LEFT_C:
        return leftC != null;
      case AlsPackage.ENUM_DECL__PROPERTY_ENUM:
        return propertyEnum != null && !propertyEnum.isEmpty();
      case AlsPackage.ENUM_DECL__COMMA:
        return comma != null && !comma.isEmpty();
      case AlsPackage.ENUM_DECL__RIGHT_C:
        return rightC != null;
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
    result.append(" (documentation: ");
    result.append(documentation);
    result.append(')');
    return result.toString();
  }

} //EnumDeclImpl
