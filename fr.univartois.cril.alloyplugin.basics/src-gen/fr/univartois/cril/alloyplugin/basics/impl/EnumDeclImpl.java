/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics.impl;

import fr.univartois.cril.alloyplugin.basics.BasicsPackage;
import fr.univartois.cril.alloyplugin.basics.EnumDecl;
import fr.univartois.cril.alloyplugin.basics.Name;

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
 * An implementation of the model object '<em><b>Enum Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.EnumDeclImpl#getEnumName <em>Enum Name</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.EnumDeclImpl#getName2 <em>Name2</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.EnumDeclImpl#getName3 <em>Name3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumDeclImpl extends ParagraphImpl implements EnumDecl
{
  /**
   * The cached value of the '{@link #getEnumName() <em>Enum Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumName()
   * @generated
   * @ordered
   */
  protected Name enumName;

  /**
   * The cached value of the '{@link #getName2() <em>Name2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName2()
   * @generated
   * @ordered
   */
  protected Name name2;

  /**
   * The cached value of the '{@link #getName3() <em>Name3</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName3()
   * @generated
   * @ordered
   */
  protected EList<Name> name3;

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
    return BasicsPackage.Literals.ENUM_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getEnumName()
  {
    return enumName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnumName(Name newEnumName, NotificationChain msgs)
  {
    Name oldEnumName = enumName;
    enumName = newEnumName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.ENUM_DECL__ENUM_NAME, oldEnumName, newEnumName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumName(Name newEnumName)
  {
    if (newEnumName != enumName)
    {
      NotificationChain msgs = null;
      if (enumName != null)
        msgs = ((InternalEObject)enumName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.ENUM_DECL__ENUM_NAME, null, msgs);
      if (newEnumName != null)
        msgs = ((InternalEObject)newEnumName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.ENUM_DECL__ENUM_NAME, null, msgs);
      msgs = basicSetEnumName(newEnumName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.ENUM_DECL__ENUM_NAME, newEnumName, newEnumName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getName2()
  {
    return name2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName2(Name newName2, NotificationChain msgs)
  {
    Name oldName2 = name2;
    name2 = newName2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.ENUM_DECL__NAME2, oldName2, newName2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName2(Name newName2)
  {
    if (newName2 != name2)
    {
      NotificationChain msgs = null;
      if (name2 != null)
        msgs = ((InternalEObject)name2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.ENUM_DECL__NAME2, null, msgs);
      if (newName2 != null)
        msgs = ((InternalEObject)newName2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.ENUM_DECL__NAME2, null, msgs);
      msgs = basicSetName2(newName2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.ENUM_DECL__NAME2, newName2, newName2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Name> getName3()
  {
    if (name3 == null)
    {
      name3 = new EObjectContainmentEList<Name>(Name.class, this, BasicsPackage.ENUM_DECL__NAME3);
    }
    return name3;
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
      case BasicsPackage.ENUM_DECL__ENUM_NAME:
        return basicSetEnumName(null, msgs);
      case BasicsPackage.ENUM_DECL__NAME2:
        return basicSetName2(null, msgs);
      case BasicsPackage.ENUM_DECL__NAME3:
        return ((InternalEList<?>)getName3()).basicRemove(otherEnd, msgs);
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
      case BasicsPackage.ENUM_DECL__ENUM_NAME:
        return getEnumName();
      case BasicsPackage.ENUM_DECL__NAME2:
        return getName2();
      case BasicsPackage.ENUM_DECL__NAME3:
        return getName3();
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
      case BasicsPackage.ENUM_DECL__ENUM_NAME:
        setEnumName((Name)newValue);
        return;
      case BasicsPackage.ENUM_DECL__NAME2:
        setName2((Name)newValue);
        return;
      case BasicsPackage.ENUM_DECL__NAME3:
        getName3().clear();
        getName3().addAll((Collection<? extends Name>)newValue);
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
      case BasicsPackage.ENUM_DECL__ENUM_NAME:
        setEnumName((Name)null);
        return;
      case BasicsPackage.ENUM_DECL__NAME2:
        setName2((Name)null);
        return;
      case BasicsPackage.ENUM_DECL__NAME3:
        getName3().clear();
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
      case BasicsPackage.ENUM_DECL__ENUM_NAME:
        return enumName != null;
      case BasicsPackage.ENUM_DECL__NAME2:
        return name2 != null;
      case BasicsPackage.ENUM_DECL__NAME3:
        return name3 != null && !name3.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EnumDeclImpl
