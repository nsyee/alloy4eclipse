/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext.als.impl;

import fr.univartois.cril.xtext.als.AlsPackage;
import fr.univartois.cril.xtext.als.Comma;
import fr.univartois.cril.xtext.als.ExactlyName;
import fr.univartois.cril.xtext.als.LeftSquareBracketKeyword;
import fr.univartois.cril.xtext.als.Module;
import fr.univartois.cril.xtext.als.RightSquareBracketKeyword;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ModuleImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ModuleImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ModuleImpl#getExactly <em>Exactly</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ModuleImpl#getComma <em>Comma</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ModuleImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ModuleImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends MinimalEObjectImpl.Container implements Module
{
  /**
   * The default value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNamespace()
   * @generated
   * @ordered
   */
  protected static final String IMPORTED_NAMESPACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNamespace()
   * @generated
   * @ordered
   */
  protected String importedNamespace = IMPORTED_NAMESPACE_EDEFAULT;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected LeftSquareBracketKeyword left;

  /**
   * The cached value of the '{@link #getExactly() <em>Exactly</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExactly()
   * @generated
   * @ordered
   */
  protected EList<String> exactly;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected ExactlyName name;

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
   * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected EList<Integer> number;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected RightSquareBracketKeyword right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModuleImpl()
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
    return AlsPackage.Literals.MODULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImportedNamespace()
  {
    return importedNamespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportedNamespace(String newImportedNamespace)
  {
    String oldImportedNamespace = importedNamespace;
    importedNamespace = newImportedNamespace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.MODULE__IMPORTED_NAMESPACE, oldImportedNamespace, importedNamespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftSquareBracketKeyword getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(LeftSquareBracketKeyword newLeft, NotificationChain msgs)
  {
    LeftSquareBracketKeyword oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.MODULE__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(LeftSquareBracketKeyword newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.MODULE__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.MODULE__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.MODULE__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getExactly()
  {
    if (exactly == null)
    {
      exactly = new EDataTypeEList<String>(String.class, this, AlsPackage.MODULE__EXACTLY);
    }
    return exactly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExactlyName getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(ExactlyName newName, NotificationChain msgs)
  {
    ExactlyName oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.MODULE__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(ExactlyName newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.MODULE__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.MODULE__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.MODULE__NAME, newName, newName));
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
      comma = new EObjectContainmentEList<Comma>(Comma.class, this, AlsPackage.MODULE__COMMA);
    }
    return comma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getNumber()
  {
    if (number == null)
    {
      number = new EDataTypeEList<Integer>(Integer.class, this, AlsPackage.MODULE__NUMBER);
    }
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightSquareBracketKeyword getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(RightSquareBracketKeyword newRight, NotificationChain msgs)
  {
    RightSquareBracketKeyword oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.MODULE__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(RightSquareBracketKeyword newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.MODULE__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.MODULE__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.MODULE__RIGHT, newRight, newRight));
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
      case AlsPackage.MODULE__LEFT:
        return basicSetLeft(null, msgs);
      case AlsPackage.MODULE__NAME:
        return basicSetName(null, msgs);
      case AlsPackage.MODULE__COMMA:
        return ((InternalEList<?>)getComma()).basicRemove(otherEnd, msgs);
      case AlsPackage.MODULE__RIGHT:
        return basicSetRight(null, msgs);
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
      case AlsPackage.MODULE__IMPORTED_NAMESPACE:
        return getImportedNamespace();
      case AlsPackage.MODULE__LEFT:
        return getLeft();
      case AlsPackage.MODULE__EXACTLY:
        return getExactly();
      case AlsPackage.MODULE__NAME:
        return getName();
      case AlsPackage.MODULE__COMMA:
        return getComma();
      case AlsPackage.MODULE__NUMBER:
        return getNumber();
      case AlsPackage.MODULE__RIGHT:
        return getRight();
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
      case AlsPackage.MODULE__IMPORTED_NAMESPACE:
        setImportedNamespace((String)newValue);
        return;
      case AlsPackage.MODULE__LEFT:
        setLeft((LeftSquareBracketKeyword)newValue);
        return;
      case AlsPackage.MODULE__EXACTLY:
        getExactly().clear();
        getExactly().addAll((Collection<? extends String>)newValue);
        return;
      case AlsPackage.MODULE__NAME:
        setName((ExactlyName)newValue);
        return;
      case AlsPackage.MODULE__COMMA:
        getComma().clear();
        getComma().addAll((Collection<? extends Comma>)newValue);
        return;
      case AlsPackage.MODULE__NUMBER:
        getNumber().clear();
        getNumber().addAll((Collection<? extends Integer>)newValue);
        return;
      case AlsPackage.MODULE__RIGHT:
        setRight((RightSquareBracketKeyword)newValue);
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
      case AlsPackage.MODULE__IMPORTED_NAMESPACE:
        setImportedNamespace(IMPORTED_NAMESPACE_EDEFAULT);
        return;
      case AlsPackage.MODULE__LEFT:
        setLeft((LeftSquareBracketKeyword)null);
        return;
      case AlsPackage.MODULE__EXACTLY:
        getExactly().clear();
        return;
      case AlsPackage.MODULE__NAME:
        setName((ExactlyName)null);
        return;
      case AlsPackage.MODULE__COMMA:
        getComma().clear();
        return;
      case AlsPackage.MODULE__NUMBER:
        getNumber().clear();
        return;
      case AlsPackage.MODULE__RIGHT:
        setRight((RightSquareBracketKeyword)null);
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
      case AlsPackage.MODULE__IMPORTED_NAMESPACE:
        return IMPORTED_NAMESPACE_EDEFAULT == null ? importedNamespace != null : !IMPORTED_NAMESPACE_EDEFAULT.equals(importedNamespace);
      case AlsPackage.MODULE__LEFT:
        return left != null;
      case AlsPackage.MODULE__EXACTLY:
        return exactly != null && !exactly.isEmpty();
      case AlsPackage.MODULE__NAME:
        return name != null;
      case AlsPackage.MODULE__COMMA:
        return comma != null && !comma.isEmpty();
      case AlsPackage.MODULE__NUMBER:
        return number != null && !number.isEmpty();
      case AlsPackage.MODULE__RIGHT:
        return right != null;
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
    result.append(" (importedNamespace: ");
    result.append(importedNamespace);
    result.append(", exactly: ");
    result.append(exactly);
    result.append(", number: ");
    result.append(number);
    result.append(')');
    return result.toString();
  }

} //ModuleImpl
