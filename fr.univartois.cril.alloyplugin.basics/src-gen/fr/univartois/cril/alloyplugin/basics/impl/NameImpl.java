/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics.impl;

import fr.univartois.cril.alloyplugin.basics.ArrowOp;
import fr.univartois.cril.alloyplugin.basics.BasicsPackage;
import fr.univartois.cril.alloyplugin.basics.BlockOrBar;
import fr.univartois.cril.alloyplugin.basics.BlockOrBarBis;
import fr.univartois.cril.alloyplugin.basics.Decl;
import fr.univartois.cril.alloyplugin.basics.Expression;
import fr.univartois.cril.alloyplugin.basics.LetDecl;
import fr.univartois.cril.alloyplugin.basics.Name;
import fr.univartois.cril.alloyplugin.basics.NameBis;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.NameImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.NameImpl#getExprT <em>Expr T</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.NameImpl#getOp <em>Op</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.NameImpl#getRight <em>Right</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.NameImpl#getArrowOp <em>Arrow Op</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.NameImpl#getDecl <em>Decl</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.NameImpl#getB <em>B</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.NameImpl#getT <em>T</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.NameImpl#getNameRef <em>Name Ref</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.NameImpl#getBlockOrBar <em>Block Or Bar</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.NameImpl#getLetDecl <em>Let Decl</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.NameImpl#getBlockOrBarBis <em>Block Or Bar Bis</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.NameImpl#getExprDecl <em>Expr Decl</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.NameImpl#getExprLet <em>Expr Let</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.NameImpl#getThis <em>This</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.NameImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.impl.NameImpl#getNameComplete <em>Name Complete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NameImpl extends Decl2Impl implements Name
{
  /**
   * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerm()
   * @generated
   * @ordered
   */
  protected Expression term;

  /**
   * The cached value of the '{@link #getExprT() <em>Expr T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprT()
   * @generated
   * @ordered
   */
  protected Expression exprT;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected Expression right;

  /**
   * The cached value of the '{@link #getArrowOp() <em>Arrow Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrowOp()
   * @generated
   * @ordered
   */
  protected ArrowOp arrowOp;

  /**
   * The cached value of the '{@link #getDecl() <em>Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecl()
   * @generated
   * @ordered
   */
  protected Decl decl;

  /**
   * The cached value of the '{@link #getB() <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected BlockOrBarBis b;

  /**
   * The cached value of the '{@link #getT() <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected Expression t;

  /**
   * The cached value of the '{@link #getNameRef() <em>Name Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameRef()
   * @generated
   * @ordered
   */
  protected Name nameRef;

  /**
   * The cached value of the '{@link #getBlockOrBar() <em>Block Or Bar</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlockOrBar()
   * @generated
   * @ordered
   */
  protected BlockOrBar blockOrBar;

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
   * The cached value of the '{@link #getExprDecl() <em>Expr Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprDecl()
   * @generated
   * @ordered
   */
  protected Expression exprDecl;

  /**
   * The cached value of the '{@link #getExprLet() <em>Expr Let</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprLet()
   * @generated
   * @ordered
   */
  protected Expression exprLet;

  /**
   * The default value of the '{@link #getThis() <em>This</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThis()
   * @generated
   * @ordered
   */
  protected static final String THIS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getThis() <em>This</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThis()
   * @generated
   * @ordered
   */
  protected String this_ = THIS_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getNameComplete() <em>Name Complete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameComplete()
   * @generated
   * @ordered
   */
  protected NameBis nameComplete;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NameImpl()
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
    return BasicsPackage.Literals.NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getTerm()
  {
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTerm(Expression newTerm, NotificationChain msgs)
  {
    Expression oldTerm = term;
    term = newTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__TERM, oldTerm, newTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTerm(Expression newTerm)
  {
    if (newTerm != term)
    {
      NotificationChain msgs = null;
      if (term != null)
        msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__TERM, null, msgs);
      if (newTerm != null)
        msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__TERM, null, msgs);
      msgs = basicSetTerm(newTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__TERM, newTerm, newTerm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExprT()
  {
    return exprT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprT(Expression newExprT, NotificationChain msgs)
  {
    Expression oldExprT = exprT;
    exprT = newExprT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__EXPR_T, oldExprT, newExprT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprT(Expression newExprT)
  {
    if (newExprT != exprT)
    {
      NotificationChain msgs = null;
      if (exprT != null)
        msgs = ((InternalEObject)exprT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__EXPR_T, null, msgs);
      if (newExprT != null)
        msgs = ((InternalEObject)newExprT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__EXPR_T, null, msgs);
      msgs = basicSetExprT(newExprT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__EXPR_T, newExprT, newExprT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(Expression newRight, NotificationChain msgs)
  {
    Expression oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(Expression newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrowOp getArrowOp()
  {
    return arrowOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrowOp(ArrowOp newArrowOp, NotificationChain msgs)
  {
    ArrowOp oldArrowOp = arrowOp;
    arrowOp = newArrowOp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__ARROW_OP, oldArrowOp, newArrowOp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrowOp(ArrowOp newArrowOp)
  {
    if (newArrowOp != arrowOp)
    {
      NotificationChain msgs = null;
      if (arrowOp != null)
        msgs = ((InternalEObject)arrowOp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__ARROW_OP, null, msgs);
      if (newArrowOp != null)
        msgs = ((InternalEObject)newArrowOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__ARROW_OP, null, msgs);
      msgs = basicSetArrowOp(newArrowOp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__ARROW_OP, newArrowOp, newArrowOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decl getDecl()
  {
    return decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDecl(Decl newDecl, NotificationChain msgs)
  {
    Decl oldDecl = decl;
    decl = newDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__DECL, oldDecl, newDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecl(Decl newDecl)
  {
    if (newDecl != decl)
    {
      NotificationChain msgs = null;
      if (decl != null)
        msgs = ((InternalEObject)decl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__DECL, null, msgs);
      if (newDecl != null)
        msgs = ((InternalEObject)newDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__DECL, null, msgs);
      msgs = basicSetDecl(newDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__DECL, newDecl, newDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockOrBarBis getB()
  {
    return b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetB(BlockOrBarBis newB, NotificationChain msgs)
  {
    BlockOrBarBis oldB = b;
    b = newB;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__B, oldB, newB);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setB(BlockOrBarBis newB)
  {
    if (newB != b)
    {
      NotificationChain msgs = null;
      if (b != null)
        msgs = ((InternalEObject)b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__B, null, msgs);
      if (newB != null)
        msgs = ((InternalEObject)newB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__B, null, msgs);
      msgs = basicSetB(newB, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__B, newB, newB));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getT()
  {
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT(Expression newT, NotificationChain msgs)
  {
    Expression oldT = t;
    t = newT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__T, oldT, newT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT(Expression newT)
  {
    if (newT != t)
    {
      NotificationChain msgs = null;
      if (t != null)
        msgs = ((InternalEObject)t).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__T, null, msgs);
      if (newT != null)
        msgs = ((InternalEObject)newT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__T, null, msgs);
      msgs = basicSetT(newT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__T, newT, newT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getNameRef()
  {
    if (nameRef != null && nameRef.eIsProxy())
    {
      InternalEObject oldNameRef = (InternalEObject)nameRef;
      nameRef = (Name)eResolveProxy(oldNameRef);
      if (nameRef != oldNameRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicsPackage.NAME__NAME_REF, oldNameRef, nameRef));
      }
    }
    return nameRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name basicGetNameRef()
  {
    return nameRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameRef(Name newNameRef)
  {
    Name oldNameRef = nameRef;
    nameRef = newNameRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__NAME_REF, oldNameRef, nameRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockOrBar getBlockOrBar()
  {
    return blockOrBar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlockOrBar(BlockOrBar newBlockOrBar, NotificationChain msgs)
  {
    BlockOrBar oldBlockOrBar = blockOrBar;
    blockOrBar = newBlockOrBar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__BLOCK_OR_BAR, oldBlockOrBar, newBlockOrBar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlockOrBar(BlockOrBar newBlockOrBar)
  {
    if (newBlockOrBar != blockOrBar)
    {
      NotificationChain msgs = null;
      if (blockOrBar != null)
        msgs = ((InternalEObject)blockOrBar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__BLOCK_OR_BAR, null, msgs);
      if (newBlockOrBar != null)
        msgs = ((InternalEObject)newBlockOrBar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__BLOCK_OR_BAR, null, msgs);
      msgs = basicSetBlockOrBar(newBlockOrBar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__BLOCK_OR_BAR, newBlockOrBar, newBlockOrBar));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__LET_DECL, oldLetDecl, newLetDecl);
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
        msgs = ((InternalEObject)letDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__LET_DECL, null, msgs);
      if (newLetDecl != null)
        msgs = ((InternalEObject)newLetDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__LET_DECL, null, msgs);
      msgs = basicSetLetDecl(newLetDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__LET_DECL, newLetDecl, newLetDecl));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__BLOCK_OR_BAR_BIS, oldBlockOrBarBis, newBlockOrBarBis);
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
        msgs = ((InternalEObject)blockOrBarBis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__BLOCK_OR_BAR_BIS, null, msgs);
      if (newBlockOrBarBis != null)
        msgs = ((InternalEObject)newBlockOrBarBis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__BLOCK_OR_BAR_BIS, null, msgs);
      msgs = basicSetBlockOrBarBis(newBlockOrBarBis, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__BLOCK_OR_BAR_BIS, newBlockOrBarBis, newBlockOrBarBis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExprDecl()
  {
    return exprDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprDecl(Expression newExprDecl, NotificationChain msgs)
  {
    Expression oldExprDecl = exprDecl;
    exprDecl = newExprDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__EXPR_DECL, oldExprDecl, newExprDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprDecl(Expression newExprDecl)
  {
    if (newExprDecl != exprDecl)
    {
      NotificationChain msgs = null;
      if (exprDecl != null)
        msgs = ((InternalEObject)exprDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__EXPR_DECL, null, msgs);
      if (newExprDecl != null)
        msgs = ((InternalEObject)newExprDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__EXPR_DECL, null, msgs);
      msgs = basicSetExprDecl(newExprDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__EXPR_DECL, newExprDecl, newExprDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExprLet()
  {
    return exprLet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprLet(Expression newExprLet, NotificationChain msgs)
  {
    Expression oldExprLet = exprLet;
    exprLet = newExprLet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__EXPR_LET, oldExprLet, newExprLet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprLet(Expression newExprLet)
  {
    if (newExprLet != exprLet)
    {
      NotificationChain msgs = null;
      if (exprLet != null)
        msgs = ((InternalEObject)exprLet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__EXPR_LET, null, msgs);
      if (newExprLet != null)
        msgs = ((InternalEObject)newExprLet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__EXPR_LET, null, msgs);
      msgs = basicSetExprLet(newExprLet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__EXPR_LET, newExprLet, newExprLet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getThis()
  {
    return this_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThis(String newThis)
  {
    String oldThis = this_;
    this_ = newThis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__THIS, oldThis, this_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameBis getNameComplete()
  {
    return nameComplete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNameComplete(NameBis newNameComplete, NotificationChain msgs)
  {
    NameBis oldNameComplete = nameComplete;
    nameComplete = newNameComplete;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__NAME_COMPLETE, oldNameComplete, newNameComplete);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameComplete(NameBis newNameComplete)
  {
    if (newNameComplete != nameComplete)
    {
      NotificationChain msgs = null;
      if (nameComplete != null)
        msgs = ((InternalEObject)nameComplete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__NAME_COMPLETE, null, msgs);
      if (newNameComplete != null)
        msgs = ((InternalEObject)newNameComplete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicsPackage.NAME__NAME_COMPLETE, null, msgs);
      msgs = basicSetNameComplete(newNameComplete, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BasicsPackage.NAME__NAME_COMPLETE, newNameComplete, newNameComplete));
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
      case BasicsPackage.NAME__TERM:
        return basicSetTerm(null, msgs);
      case BasicsPackage.NAME__EXPR_T:
        return basicSetExprT(null, msgs);
      case BasicsPackage.NAME__RIGHT:
        return basicSetRight(null, msgs);
      case BasicsPackage.NAME__ARROW_OP:
        return basicSetArrowOp(null, msgs);
      case BasicsPackage.NAME__DECL:
        return basicSetDecl(null, msgs);
      case BasicsPackage.NAME__B:
        return basicSetB(null, msgs);
      case BasicsPackage.NAME__T:
        return basicSetT(null, msgs);
      case BasicsPackage.NAME__BLOCK_OR_BAR:
        return basicSetBlockOrBar(null, msgs);
      case BasicsPackage.NAME__LET_DECL:
        return basicSetLetDecl(null, msgs);
      case BasicsPackage.NAME__BLOCK_OR_BAR_BIS:
        return basicSetBlockOrBarBis(null, msgs);
      case BasicsPackage.NAME__EXPR_DECL:
        return basicSetExprDecl(null, msgs);
      case BasicsPackage.NAME__EXPR_LET:
        return basicSetExprLet(null, msgs);
      case BasicsPackage.NAME__NAME_COMPLETE:
        return basicSetNameComplete(null, msgs);
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
      case BasicsPackage.NAME__TERM:
        return getTerm();
      case BasicsPackage.NAME__EXPR_T:
        return getExprT();
      case BasicsPackage.NAME__OP:
        return getOp();
      case BasicsPackage.NAME__RIGHT:
        return getRight();
      case BasicsPackage.NAME__ARROW_OP:
        return getArrowOp();
      case BasicsPackage.NAME__DECL:
        return getDecl();
      case BasicsPackage.NAME__B:
        return getB();
      case BasicsPackage.NAME__T:
        return getT();
      case BasicsPackage.NAME__NAME_REF:
        if (resolve) return getNameRef();
        return basicGetNameRef();
      case BasicsPackage.NAME__BLOCK_OR_BAR:
        return getBlockOrBar();
      case BasicsPackage.NAME__LET_DECL:
        return getLetDecl();
      case BasicsPackage.NAME__BLOCK_OR_BAR_BIS:
        return getBlockOrBarBis();
      case BasicsPackage.NAME__EXPR_DECL:
        return getExprDecl();
      case BasicsPackage.NAME__EXPR_LET:
        return getExprLet();
      case BasicsPackage.NAME__THIS:
        return getThis();
      case BasicsPackage.NAME__NAME:
        return getName();
      case BasicsPackage.NAME__NAME_COMPLETE:
        return getNameComplete();
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
      case BasicsPackage.NAME__TERM:
        setTerm((Expression)newValue);
        return;
      case BasicsPackage.NAME__EXPR_T:
        setExprT((Expression)newValue);
        return;
      case BasicsPackage.NAME__OP:
        setOp((String)newValue);
        return;
      case BasicsPackage.NAME__RIGHT:
        setRight((Expression)newValue);
        return;
      case BasicsPackage.NAME__ARROW_OP:
        setArrowOp((ArrowOp)newValue);
        return;
      case BasicsPackage.NAME__DECL:
        setDecl((Decl)newValue);
        return;
      case BasicsPackage.NAME__B:
        setB((BlockOrBarBis)newValue);
        return;
      case BasicsPackage.NAME__T:
        setT((Expression)newValue);
        return;
      case BasicsPackage.NAME__NAME_REF:
        setNameRef((Name)newValue);
        return;
      case BasicsPackage.NAME__BLOCK_OR_BAR:
        setBlockOrBar((BlockOrBar)newValue);
        return;
      case BasicsPackage.NAME__LET_DECL:
        setLetDecl((LetDecl)newValue);
        return;
      case BasicsPackage.NAME__BLOCK_OR_BAR_BIS:
        setBlockOrBarBis((BlockOrBarBis)newValue);
        return;
      case BasicsPackage.NAME__EXPR_DECL:
        setExprDecl((Expression)newValue);
        return;
      case BasicsPackage.NAME__EXPR_LET:
        setExprLet((Expression)newValue);
        return;
      case BasicsPackage.NAME__THIS:
        setThis((String)newValue);
        return;
      case BasicsPackage.NAME__NAME:
        setName((String)newValue);
        return;
      case BasicsPackage.NAME__NAME_COMPLETE:
        setNameComplete((NameBis)newValue);
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
      case BasicsPackage.NAME__TERM:
        setTerm((Expression)null);
        return;
      case BasicsPackage.NAME__EXPR_T:
        setExprT((Expression)null);
        return;
      case BasicsPackage.NAME__OP:
        setOp(OP_EDEFAULT);
        return;
      case BasicsPackage.NAME__RIGHT:
        setRight((Expression)null);
        return;
      case BasicsPackage.NAME__ARROW_OP:
        setArrowOp((ArrowOp)null);
        return;
      case BasicsPackage.NAME__DECL:
        setDecl((Decl)null);
        return;
      case BasicsPackage.NAME__B:
        setB((BlockOrBarBis)null);
        return;
      case BasicsPackage.NAME__T:
        setT((Expression)null);
        return;
      case BasicsPackage.NAME__NAME_REF:
        setNameRef((Name)null);
        return;
      case BasicsPackage.NAME__BLOCK_OR_BAR:
        setBlockOrBar((BlockOrBar)null);
        return;
      case BasicsPackage.NAME__LET_DECL:
        setLetDecl((LetDecl)null);
        return;
      case BasicsPackage.NAME__BLOCK_OR_BAR_BIS:
        setBlockOrBarBis((BlockOrBarBis)null);
        return;
      case BasicsPackage.NAME__EXPR_DECL:
        setExprDecl((Expression)null);
        return;
      case BasicsPackage.NAME__EXPR_LET:
        setExprLet((Expression)null);
        return;
      case BasicsPackage.NAME__THIS:
        setThis(THIS_EDEFAULT);
        return;
      case BasicsPackage.NAME__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BasicsPackage.NAME__NAME_COMPLETE:
        setNameComplete((NameBis)null);
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
      case BasicsPackage.NAME__TERM:
        return term != null;
      case BasicsPackage.NAME__EXPR_T:
        return exprT != null;
      case BasicsPackage.NAME__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case BasicsPackage.NAME__RIGHT:
        return right != null;
      case BasicsPackage.NAME__ARROW_OP:
        return arrowOp != null;
      case BasicsPackage.NAME__DECL:
        return decl != null;
      case BasicsPackage.NAME__B:
        return b != null;
      case BasicsPackage.NAME__T:
        return t != null;
      case BasicsPackage.NAME__NAME_REF:
        return nameRef != null;
      case BasicsPackage.NAME__BLOCK_OR_BAR:
        return blockOrBar != null;
      case BasicsPackage.NAME__LET_DECL:
        return letDecl != null;
      case BasicsPackage.NAME__BLOCK_OR_BAR_BIS:
        return blockOrBarBis != null;
      case BasicsPackage.NAME__EXPR_DECL:
        return exprDecl != null;
      case BasicsPackage.NAME__EXPR_LET:
        return exprLet != null;
      case BasicsPackage.NAME__THIS:
        return THIS_EDEFAULT == null ? this_ != null : !THIS_EDEFAULT.equals(this_);
      case BasicsPackage.NAME__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BasicsPackage.NAME__NAME_COMPLETE:
        return nameComplete != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == BlockOrBar.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BlockOrBarBis.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Expression.class)
    {
      switch (derivedFeatureID)
      {
        case BasicsPackage.NAME__TERM: return BasicsPackage.EXPRESSION__TERM;
        case BasicsPackage.NAME__EXPR_T: return BasicsPackage.EXPRESSION__EXPR_T;
        case BasicsPackage.NAME__OP: return BasicsPackage.EXPRESSION__OP;
        case BasicsPackage.NAME__RIGHT: return BasicsPackage.EXPRESSION__RIGHT;
        case BasicsPackage.NAME__ARROW_OP: return BasicsPackage.EXPRESSION__ARROW_OP;
        case BasicsPackage.NAME__DECL: return BasicsPackage.EXPRESSION__DECL;
        case BasicsPackage.NAME__B: return BasicsPackage.EXPRESSION__B;
        case BasicsPackage.NAME__T: return BasicsPackage.EXPRESSION__T;
        case BasicsPackage.NAME__NAME_REF: return BasicsPackage.EXPRESSION__NAME_REF;
        case BasicsPackage.NAME__BLOCK_OR_BAR: return BasicsPackage.EXPRESSION__BLOCK_OR_BAR;
        default: return -1;
      }
    }
    if (baseClass == LetDecl.class)
    {
      switch (derivedFeatureID)
      {
        case BasicsPackage.NAME__LET_DECL: return BasicsPackage.LET_DECL__LET_DECL;
        case BasicsPackage.NAME__BLOCK_OR_BAR_BIS: return BasicsPackage.LET_DECL__BLOCK_OR_BAR_BIS;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == BlockOrBar.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BlockOrBarBis.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Expression.class)
    {
      switch (baseFeatureID)
      {
        case BasicsPackage.EXPRESSION__TERM: return BasicsPackage.NAME__TERM;
        case BasicsPackage.EXPRESSION__EXPR_T: return BasicsPackage.NAME__EXPR_T;
        case BasicsPackage.EXPRESSION__OP: return BasicsPackage.NAME__OP;
        case BasicsPackage.EXPRESSION__RIGHT: return BasicsPackage.NAME__RIGHT;
        case BasicsPackage.EXPRESSION__ARROW_OP: return BasicsPackage.NAME__ARROW_OP;
        case BasicsPackage.EXPRESSION__DECL: return BasicsPackage.NAME__DECL;
        case BasicsPackage.EXPRESSION__B: return BasicsPackage.NAME__B;
        case BasicsPackage.EXPRESSION__T: return BasicsPackage.NAME__T;
        case BasicsPackage.EXPRESSION__NAME_REF: return BasicsPackage.NAME__NAME_REF;
        case BasicsPackage.EXPRESSION__BLOCK_OR_BAR: return BasicsPackage.NAME__BLOCK_OR_BAR;
        default: return -1;
      }
    }
    if (baseClass == LetDecl.class)
    {
      switch (baseFeatureID)
      {
        case BasicsPackage.LET_DECL__LET_DECL: return BasicsPackage.NAME__LET_DECL;
        case BasicsPackage.LET_DECL__BLOCK_OR_BAR_BIS: return BasicsPackage.NAME__BLOCK_OR_BAR_BIS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (op: ");
    result.append(op);
    result.append(", this: ");
    result.append(this_);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //NameImpl
