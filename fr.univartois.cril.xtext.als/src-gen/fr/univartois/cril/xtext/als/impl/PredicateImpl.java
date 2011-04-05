/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext.als.impl;

import fr.univartois.cril.xtext.als.AlsPackage;
import fr.univartois.cril.xtext.als.Block;
import fr.univartois.cril.xtext.als.Comma;
import fr.univartois.cril.xtext.als.Decl;
import fr.univartois.cril.xtext.als.Dot;
import fr.univartois.cril.xtext.als.LeftParenthesis;
import fr.univartois.cril.xtext.als.LeftSquareBracketKeyword;
import fr.univartois.cril.xtext.als.Predicate;
import fr.univartois.cril.xtext.als.PredicateName;
import fr.univartois.cril.xtext.als.Ref;
import fr.univartois.cril.xtext.als.RightParenthesis;
import fr.univartois.cril.xtext.als.RightSquareBracketKeyword;

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
 * An implementation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.PredicateImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.PredicateImpl#getDot <em>Dot</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.PredicateImpl#getPredicateName <em>Predicate Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.PredicateImpl#getLeftS <em>Left S</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.PredicateImpl#getDecl <em>Decl</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.PredicateImpl#getComma <em>Comma</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.PredicateImpl#getRightS <em>Right S</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.PredicateImpl#getLeftP <em>Left P</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.PredicateImpl#getRightP <em>Right P</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.PredicateImpl#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PredicateImpl extends ParagraphImpl implements Predicate
{
  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected Ref ref;

  /**
   * The cached value of the '{@link #getDot() <em>Dot</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDot()
   * @generated
   * @ordered
   */
  protected Dot dot;

  /**
   * The cached value of the '{@link #getPredicateName() <em>Predicate Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredicateName()
   * @generated
   * @ordered
   */
  protected PredicateName predicateName;

  /**
   * The cached value of the '{@link #getLeftS() <em>Left S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftS()
   * @generated
   * @ordered
   */
  protected LeftSquareBracketKeyword leftS;

  /**
   * The cached value of the '{@link #getDecl() <em>Decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecl()
   * @generated
   * @ordered
   */
  protected EList<Decl> decl;

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
   * The cached value of the '{@link #getRightS() <em>Right S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightS()
   * @generated
   * @ordered
   */
  protected RightSquareBracketKeyword rightS;

  /**
   * The cached value of the '{@link #getLeftP() <em>Left P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftP()
   * @generated
   * @ordered
   */
  protected LeftParenthesis leftP;

  /**
   * The cached value of the '{@link #getRightP() <em>Right P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightP()
   * @generated
   * @ordered
   */
  protected RightParenthesis rightP;

  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected Block block;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PredicateImpl()
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
    return AlsPackage.Literals.PREDICATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ref getRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRef(Ref newRef, NotificationChain msgs)
  {
    Ref oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.PREDICATE__REF, oldRef, newRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(Ref newRef)
  {
    if (newRef != ref)
    {
      NotificationChain msgs = null;
      if (ref != null)
        msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.PREDICATE__REF, null, msgs);
      if (newRef != null)
        msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.PREDICATE__REF, null, msgs);
      msgs = basicSetRef(newRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.PREDICATE__REF, newRef, newRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dot getDot()
  {
    return dot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDot(Dot newDot, NotificationChain msgs)
  {
    Dot oldDot = dot;
    dot = newDot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.PREDICATE__DOT, oldDot, newDot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDot(Dot newDot)
  {
    if (newDot != dot)
    {
      NotificationChain msgs = null;
      if (dot != null)
        msgs = ((InternalEObject)dot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.PREDICATE__DOT, null, msgs);
      if (newDot != null)
        msgs = ((InternalEObject)newDot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.PREDICATE__DOT, null, msgs);
      msgs = basicSetDot(newDot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.PREDICATE__DOT, newDot, newDot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateName getPredicateName()
  {
    return predicateName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredicateName(PredicateName newPredicateName, NotificationChain msgs)
  {
    PredicateName oldPredicateName = predicateName;
    predicateName = newPredicateName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.PREDICATE__PREDICATE_NAME, oldPredicateName, newPredicateName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredicateName(PredicateName newPredicateName)
  {
    if (newPredicateName != predicateName)
    {
      NotificationChain msgs = null;
      if (predicateName != null)
        msgs = ((InternalEObject)predicateName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.PREDICATE__PREDICATE_NAME, null, msgs);
      if (newPredicateName != null)
        msgs = ((InternalEObject)newPredicateName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.PREDICATE__PREDICATE_NAME, null, msgs);
      msgs = basicSetPredicateName(newPredicateName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.PREDICATE__PREDICATE_NAME, newPredicateName, newPredicateName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftSquareBracketKeyword getLeftS()
  {
    return leftS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftS(LeftSquareBracketKeyword newLeftS, NotificationChain msgs)
  {
    LeftSquareBracketKeyword oldLeftS = leftS;
    leftS = newLeftS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.PREDICATE__LEFT_S, oldLeftS, newLeftS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftS(LeftSquareBracketKeyword newLeftS)
  {
    if (newLeftS != leftS)
    {
      NotificationChain msgs = null;
      if (leftS != null)
        msgs = ((InternalEObject)leftS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.PREDICATE__LEFT_S, null, msgs);
      if (newLeftS != null)
        msgs = ((InternalEObject)newLeftS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.PREDICATE__LEFT_S, null, msgs);
      msgs = basicSetLeftS(newLeftS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.PREDICATE__LEFT_S, newLeftS, newLeftS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Decl> getDecl()
  {
    if (decl == null)
    {
      decl = new EObjectContainmentEList<Decl>(Decl.class, this, AlsPackage.PREDICATE__DECL);
    }
    return decl;
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
      comma = new EObjectContainmentEList<Comma>(Comma.class, this, AlsPackage.PREDICATE__COMMA);
    }
    return comma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightSquareBracketKeyword getRightS()
  {
    return rightS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightS(RightSquareBracketKeyword newRightS, NotificationChain msgs)
  {
    RightSquareBracketKeyword oldRightS = rightS;
    rightS = newRightS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.PREDICATE__RIGHT_S, oldRightS, newRightS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightS(RightSquareBracketKeyword newRightS)
  {
    if (newRightS != rightS)
    {
      NotificationChain msgs = null;
      if (rightS != null)
        msgs = ((InternalEObject)rightS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.PREDICATE__RIGHT_S, null, msgs);
      if (newRightS != null)
        msgs = ((InternalEObject)newRightS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.PREDICATE__RIGHT_S, null, msgs);
      msgs = basicSetRightS(newRightS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.PREDICATE__RIGHT_S, newRightS, newRightS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftParenthesis getLeftP()
  {
    return leftP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftP(LeftParenthesis newLeftP, NotificationChain msgs)
  {
    LeftParenthesis oldLeftP = leftP;
    leftP = newLeftP;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.PREDICATE__LEFT_P, oldLeftP, newLeftP);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftP(LeftParenthesis newLeftP)
  {
    if (newLeftP != leftP)
    {
      NotificationChain msgs = null;
      if (leftP != null)
        msgs = ((InternalEObject)leftP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.PREDICATE__LEFT_P, null, msgs);
      if (newLeftP != null)
        msgs = ((InternalEObject)newLeftP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.PREDICATE__LEFT_P, null, msgs);
      msgs = basicSetLeftP(newLeftP, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.PREDICATE__LEFT_P, newLeftP, newLeftP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightParenthesis getRightP()
  {
    return rightP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightP(RightParenthesis newRightP, NotificationChain msgs)
  {
    RightParenthesis oldRightP = rightP;
    rightP = newRightP;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.PREDICATE__RIGHT_P, oldRightP, newRightP);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightP(RightParenthesis newRightP)
  {
    if (newRightP != rightP)
    {
      NotificationChain msgs = null;
      if (rightP != null)
        msgs = ((InternalEObject)rightP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.PREDICATE__RIGHT_P, null, msgs);
      if (newRightP != null)
        msgs = ((InternalEObject)newRightP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.PREDICATE__RIGHT_P, null, msgs);
      msgs = basicSetRightP(newRightP, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.PREDICATE__RIGHT_P, newRightP, newRightP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs)
  {
    Block oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.PREDICATE__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(Block newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.PREDICATE__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.PREDICATE__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.PREDICATE__BLOCK, newBlock, newBlock));
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
      case AlsPackage.PREDICATE__REF:
        return basicSetRef(null, msgs);
      case AlsPackage.PREDICATE__DOT:
        return basicSetDot(null, msgs);
      case AlsPackage.PREDICATE__PREDICATE_NAME:
        return basicSetPredicateName(null, msgs);
      case AlsPackage.PREDICATE__LEFT_S:
        return basicSetLeftS(null, msgs);
      case AlsPackage.PREDICATE__DECL:
        return ((InternalEList<?>)getDecl()).basicRemove(otherEnd, msgs);
      case AlsPackage.PREDICATE__COMMA:
        return ((InternalEList<?>)getComma()).basicRemove(otherEnd, msgs);
      case AlsPackage.PREDICATE__RIGHT_S:
        return basicSetRightS(null, msgs);
      case AlsPackage.PREDICATE__LEFT_P:
        return basicSetLeftP(null, msgs);
      case AlsPackage.PREDICATE__RIGHT_P:
        return basicSetRightP(null, msgs);
      case AlsPackage.PREDICATE__BLOCK:
        return basicSetBlock(null, msgs);
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
      case AlsPackage.PREDICATE__REF:
        return getRef();
      case AlsPackage.PREDICATE__DOT:
        return getDot();
      case AlsPackage.PREDICATE__PREDICATE_NAME:
        return getPredicateName();
      case AlsPackage.PREDICATE__LEFT_S:
        return getLeftS();
      case AlsPackage.PREDICATE__DECL:
        return getDecl();
      case AlsPackage.PREDICATE__COMMA:
        return getComma();
      case AlsPackage.PREDICATE__RIGHT_S:
        return getRightS();
      case AlsPackage.PREDICATE__LEFT_P:
        return getLeftP();
      case AlsPackage.PREDICATE__RIGHT_P:
        return getRightP();
      case AlsPackage.PREDICATE__BLOCK:
        return getBlock();
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
      case AlsPackage.PREDICATE__REF:
        setRef((Ref)newValue);
        return;
      case AlsPackage.PREDICATE__DOT:
        setDot((Dot)newValue);
        return;
      case AlsPackage.PREDICATE__PREDICATE_NAME:
        setPredicateName((PredicateName)newValue);
        return;
      case AlsPackage.PREDICATE__LEFT_S:
        setLeftS((LeftSquareBracketKeyword)newValue);
        return;
      case AlsPackage.PREDICATE__DECL:
        getDecl().clear();
        getDecl().addAll((Collection<? extends Decl>)newValue);
        return;
      case AlsPackage.PREDICATE__COMMA:
        getComma().clear();
        getComma().addAll((Collection<? extends Comma>)newValue);
        return;
      case AlsPackage.PREDICATE__RIGHT_S:
        setRightS((RightSquareBracketKeyword)newValue);
        return;
      case AlsPackage.PREDICATE__LEFT_P:
        setLeftP((LeftParenthesis)newValue);
        return;
      case AlsPackage.PREDICATE__RIGHT_P:
        setRightP((RightParenthesis)newValue);
        return;
      case AlsPackage.PREDICATE__BLOCK:
        setBlock((Block)newValue);
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
      case AlsPackage.PREDICATE__REF:
        setRef((Ref)null);
        return;
      case AlsPackage.PREDICATE__DOT:
        setDot((Dot)null);
        return;
      case AlsPackage.PREDICATE__PREDICATE_NAME:
        setPredicateName((PredicateName)null);
        return;
      case AlsPackage.PREDICATE__LEFT_S:
        setLeftS((LeftSquareBracketKeyword)null);
        return;
      case AlsPackage.PREDICATE__DECL:
        getDecl().clear();
        return;
      case AlsPackage.PREDICATE__COMMA:
        getComma().clear();
        return;
      case AlsPackage.PREDICATE__RIGHT_S:
        setRightS((RightSquareBracketKeyword)null);
        return;
      case AlsPackage.PREDICATE__LEFT_P:
        setLeftP((LeftParenthesis)null);
        return;
      case AlsPackage.PREDICATE__RIGHT_P:
        setRightP((RightParenthesis)null);
        return;
      case AlsPackage.PREDICATE__BLOCK:
        setBlock((Block)null);
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
      case AlsPackage.PREDICATE__REF:
        return ref != null;
      case AlsPackage.PREDICATE__DOT:
        return dot != null;
      case AlsPackage.PREDICATE__PREDICATE_NAME:
        return predicateName != null;
      case AlsPackage.PREDICATE__LEFT_S:
        return leftS != null;
      case AlsPackage.PREDICATE__DECL:
        return decl != null && !decl.isEmpty();
      case AlsPackage.PREDICATE__COMMA:
        return comma != null && !comma.isEmpty();
      case AlsPackage.PREDICATE__RIGHT_S:
        return rightS != null;
      case AlsPackage.PREDICATE__LEFT_P:
        return leftP != null;
      case AlsPackage.PREDICATE__RIGHT_P:
        return rightP != null;
      case AlsPackage.PREDICATE__BLOCK:
        return block != null;
    }
    return super.eIsSet(featureID);
  }

} //PredicateImpl
