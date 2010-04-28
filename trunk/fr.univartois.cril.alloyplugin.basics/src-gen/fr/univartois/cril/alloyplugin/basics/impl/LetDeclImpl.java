/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics.impl;

import fr.univartois.cril.alloyplugin.basics.BasicsPackage;
import fr.univartois.cril.alloyplugin.basics.BlockOrBarBis;
import fr.univartois.cril.alloyplugin.basics.LetDecl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Let Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.LetDeclImpl#getLetDecl <em>Let Decl</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.LetDeclImpl#getBlockOrBarBis <em>Block Or Bar Bis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LetDeclImpl extends ExpressionImpl implements LetDecl
{
  /**
   * The cached value of the '{@link #getLetDecl() <em>Let Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLetDecl()
   * @generated
   * @ordered
   */
  protected LetDecl letDecl;

  /**
   * The cached value of the '{@link #getBlockOrBarBis() <em>Block Or Bar Bis</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlockOrBarBis()
   * @generated
   * @ordered
   */
  protected BlockOrBarBis blockOrBarBis;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LetDeclImpl()
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
    return BasicsPackage.Literals.LET_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LetDecl getLetDecl()
  {
    return letDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLetDecl(LetDecl newLetDecl, NotificationChain msgs)
  {
    LetDecl oldLetDecl = letDecl;
    letDecl = newLetDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.LET_DECL__LET_DECL, oldLetDecl, newLetDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLetDecl(LetDecl newLetDecl)
  {
    if (newLetDecl != letDecl)
    {
      NotificationChain msgs = null;
      if (letDecl != null)
        msgs = ((InternalEObject)letDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.LET_DECL__LET_DECL, null, msgs);
      if (newLetDecl != null)
        msgs = ((InternalEObject)newLetDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.LET_DECL__LET_DECL, null, msgs);
      msgs = basicSetLetDecl(newLetDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.LET_DECL__LET_DECL, newLetDecl, newLetDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockOrBarBis getBlockOrBarBis()
  {
    return blockOrBarBis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlockOrBarBis(BlockOrBarBis newBlockOrBarBis, NotificationChain msgs)
  {
    BlockOrBarBis oldBlockOrBarBis = blockOrBarBis;
    blockOrBarBis = newBlockOrBarBis;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.LET_DECL__BLOCK_OR_BAR_BIS, oldBlockOrBarBis, newBlockOrBarBis);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlockOrBarBis(BlockOrBarBis newBlockOrBarBis)
  {
    if (newBlockOrBarBis != blockOrBarBis)
    {
      NotificationChain msgs = null;
      if (blockOrBarBis != null)
        msgs = ((InternalEObject)blockOrBarBis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.LET_DECL__BLOCK_OR_BAR_BIS, null, msgs);
      if (newBlockOrBarBis != null)
        msgs = ((InternalEObject)newBlockOrBarBis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.LET_DECL__BLOCK_OR_BAR_BIS, null, msgs);
      msgs = basicSetBlockOrBarBis(newBlockOrBarBis, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.LET_DECL__BLOCK_OR_BAR_BIS, newBlockOrBarBis, newBlockOrBarBis));
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
      case BasicsPackage.LET_DECL__LET_DECL:
        return basicSetLetDecl(null, msgs);
      case BasicsPackage.LET_DECL__BLOCK_OR_BAR_BIS:
        return basicSetBlockOrBarBis(null, msgs);
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
      case BasicsPackage.LET_DECL__LET_DECL:
        return getLetDecl();
      case BasicsPackage.LET_DECL__BLOCK_OR_BAR_BIS:
        return getBlockOrBarBis();
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
      case BasicsPackage.LET_DECL__LET_DECL:
        setLetDecl((LetDecl)newValue);
        return;
      case BasicsPackage.LET_DECL__BLOCK_OR_BAR_BIS:
        setBlockOrBarBis((BlockOrBarBis)newValue);
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
      case BasicsPackage.LET_DECL__LET_DECL:
        setLetDecl((LetDecl)null);
        return;
      case BasicsPackage.LET_DECL__BLOCK_OR_BAR_BIS:
        setBlockOrBarBis((BlockOrBarBis)null);
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
      case BasicsPackage.LET_DECL__LET_DECL:
        return letDecl != null;
      case BasicsPackage.LET_DECL__BLOCK_OR_BAR_BIS:
        return blockOrBarBis != null;
    }
    return super.eIsSet(featureID);
  }

} //LetDeclImpl
