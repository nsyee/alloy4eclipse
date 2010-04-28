/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics.impl;

import fr.univartois.cril.alloyplugin.basics.BasicsPackage;
import fr.univartois.cril.alloyplugin.basics.Module;
import fr.univartois.cril.alloyplugin.basics.Open;
import fr.univartois.cril.alloyplugin.basics.Paragraph;
import fr.univartois.cril.alloyplugin.basics.Specification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.SpecificationImpl#getModule <em>Module</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.SpecificationImpl#getOpen <em>Open</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.SpecificationImpl#getParagraph <em>Paragraph</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecificationImpl extends MinimalEObjectImpl.Container implements Specification
{
  /**
   * The cached value of the '{@link #getModule() <em>Module</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModule()
   * @generated
   * @ordered
   */
  protected Module module;

  /**
   * The cached value of the '{@link #getOpen() <em>Open</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpen()
   * @generated
   * @ordered
   */
  protected EList<Open> open;

  /**
   * The cached value of the '{@link #getParagraph() <em>Paragraph</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParagraph()
   * @generated
   * @ordered
   */
  protected EList<Paragraph> paragraph;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpecificationImpl()
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
    return BasicsPackage.Literals.SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module getModule()
  {
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModule(Module newModule, NotificationChain msgs)
  {
    Module oldModule = module;
    module = newModule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.SPECIFICATION__MODULE, oldModule, newModule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModule(Module newModule)
  {
    if (newModule != module)
    {
      NotificationChain msgs = null;
      if (module != null)
        msgs = ((InternalEObject)module).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.SPECIFICATION__MODULE, null, msgs);
      if (newModule != null)
        msgs = ((InternalEObject)newModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.SPECIFICATION__MODULE, null, msgs);
      msgs = basicSetModule(newModule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.SPECIFICATION__MODULE, newModule, newModule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Open> getOpen()
  {
    if (open == null)
    {
      open = new EObjectContainmentEList<Open>(Open.class, this, BasicsPackage.SPECIFICATION__OPEN);
    }
    return open;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Paragraph> getParagraph()
  {
    if (paragraph == null)
    {
      paragraph = new EObjectContainmentEList<Paragraph>(Paragraph.class, this, BasicsPackage.SPECIFICATION__PARAGRAPH);
    }
    return paragraph;
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
      case BasicsPackage.SPECIFICATION__MODULE:
        return basicSetModule(null, msgs);
      case BasicsPackage.SPECIFICATION__OPEN:
        return ((InternalEList<?>)getOpen()).basicRemove(otherEnd, msgs);
      case BasicsPackage.SPECIFICATION__PARAGRAPH:
        return ((InternalEList<?>)getParagraph()).basicRemove(otherEnd, msgs);
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
      case BasicsPackage.SPECIFICATION__MODULE:
        return getModule();
      case BasicsPackage.SPECIFICATION__OPEN:
        return getOpen();
      case BasicsPackage.SPECIFICATION__PARAGRAPH:
        return getParagraph();
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
      case BasicsPackage.SPECIFICATION__MODULE:
        setModule((Module)newValue);
        return;
      case BasicsPackage.SPECIFICATION__OPEN:
        getOpen().clear();
        getOpen().addAll((Collection<? extends Open>)newValue);
        return;
      case BasicsPackage.SPECIFICATION__PARAGRAPH:
        getParagraph().clear();
        getParagraph().addAll((Collection<? extends Paragraph>)newValue);
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
      case BasicsPackage.SPECIFICATION__MODULE:
        setModule((Module)null);
        return;
      case BasicsPackage.SPECIFICATION__OPEN:
        getOpen().clear();
        return;
      case BasicsPackage.SPECIFICATION__PARAGRAPH:
        getParagraph().clear();
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
      case BasicsPackage.SPECIFICATION__MODULE:
        return module != null;
      case BasicsPackage.SPECIFICATION__OPEN:
        return open != null && !open.isEmpty();
      case BasicsPackage.SPECIFICATION__PARAGRAPH:
        return paragraph != null && !paragraph.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SpecificationImpl
