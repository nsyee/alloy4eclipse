/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext.als.impl;

import fr.univartois.cril.xtext.als.AlsPackage;
import fr.univartois.cril.xtext.als.ArrowOp;
import fr.univartois.cril.xtext.als.BinOp;
import fr.univartois.cril.xtext.als.Block;
import fr.univartois.cril.xtext.als.BlockOrBar;
import fr.univartois.cril.xtext.als.Comma;
import fr.univartois.cril.xtext.als.CommonQuantUnOp;
import fr.univartois.cril.xtext.als.Decl;
import fr.univartois.cril.xtext.als.Expression;
import fr.univartois.cril.xtext.als.LeftCurlyBracket;
import fr.univartois.cril.xtext.als.LeftSquareBracketKeyword;
import fr.univartois.cril.xtext.als.LetDecl;
import fr.univartois.cril.xtext.als.ReferencesName;
import fr.univartois.cril.xtext.als.RightCurlyBracket;
import fr.univartois.cril.xtext.als.RightSquareBracketKeyword;
import fr.univartois.cril.xtext.als.UnOp;

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
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getBinOp <em>Bin Op</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getArrowOp <em>Arrow Op</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getCmp <em>Cmp</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getComma <em>Comma</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getLet <em>Let</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getLetdecl <em>Letdecl</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getBlockOrBar <em>Block Or Bar</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getQuant <em>Quant</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getDecl <em>Decl</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getUnOp <em>Un Op</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getCommon <em>Common</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getNone <em>None</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getIden <em>Iden</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getUniv <em>Univ</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getInt <em>Int</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getSeq <em>Seq</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getParO <em>Par O</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getParF <em>Par F</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getNameRef <em>Name Ref</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getLeftCurlyBracket <em>Left Curly Bracket</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.ExpressionImpl#getRightCurlyBracket <em>Right Curly Bracket</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
{
  /**
   * The cached value of the '{@link #getBinOp() <em>Bin Op</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinOp()
   * @generated
   * @ordered
   */
  protected EList<BinOp> binOp;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected EList<Expression> expr;

  /**
   * The cached value of the '{@link #getArrowOp() <em>Arrow Op</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrowOp()
   * @generated
   * @ordered
   */
  protected EList<ArrowOp> arrowOp;

  /**
   * The cached value of the '{@link #getCmp() <em>Cmp</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmp()
   * @generated
   * @ordered
   */
  protected EList<String> cmp;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected EList<LeftSquareBracketKeyword> left;

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
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected EList<RightSquareBracketKeyword> right;

  /**
   * The default value of the '{@link #getLet() <em>Let</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLet()
   * @generated
   * @ordered
   */
  protected static final String LET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLet() <em>Let</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLet()
   * @generated
   * @ordered
   */
  protected String let = LET_EDEFAULT;

  /**
   * The cached value of the '{@link #getLetdecl() <em>Letdecl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLetdecl()
   * @generated
   * @ordered
   */
  protected EList<LetDecl> letdecl;

  /**
   * The cached value of the '{@link #getBlockOrBar() <em>Block Or Bar</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlockOrBar()
   * @generated
   * @ordered
   */
  protected EList<BlockOrBar> blockOrBar;

  /**
   * The default value of the '{@link #getQuant() <em>Quant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuant()
   * @generated
   * @ordered
   */
  protected static final String QUANT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQuant() <em>Quant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuant()
   * @generated
   * @ordered
   */
  protected String quant = QUANT_EDEFAULT;

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
   * The cached value of the '{@link #getUnOp() <em>Un Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnOp()
   * @generated
   * @ordered
   */
  protected UnOp unOp;

  /**
   * The cached value of the '{@link #getCommon() <em>Common</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommon()
   * @generated
   * @ordered
   */
  protected EList<CommonQuantUnOp> common;

  /**
   * The default value of the '{@link #getNone() <em>None</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNone()
   * @generated
   * @ordered
   */
  protected static final String NONE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNone() <em>None</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNone()
   * @generated
   * @ordered
   */
  protected String none = NONE_EDEFAULT;

  /**
   * The default value of the '{@link #getIden() <em>Iden</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIden()
   * @generated
   * @ordered
   */
  protected static final String IDEN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIden() <em>Iden</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIden()
   * @generated
   * @ordered
   */
  protected String iden = IDEN_EDEFAULT;

  /**
   * The default value of the '{@link #getUniv() <em>Univ</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUniv()
   * @generated
   * @ordered
   */
  protected static final String UNIV_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUniv() <em>Univ</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUniv()
   * @generated
   * @ordered
   */
  protected String univ = UNIV_EDEFAULT;

  /**
   * The default value of the '{@link #getInt() <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt()
   * @generated
   * @ordered
   */
  protected static final String INT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInt() <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt()
   * @generated
   * @ordered
   */
  protected String int_ = INT_EDEFAULT;

  /**
   * The default value of the '{@link #getSeq() <em>Seq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeq()
   * @generated
   * @ordered
   */
  protected static final String SEQ_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSeq() <em>Seq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeq()
   * @generated
   * @ordered
   */
  protected String seq = SEQ_EDEFAULT;

  /**
   * The default value of the '{@link #getParO() <em>Par O</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParO()
   * @generated
   * @ordered
   */
  protected static final String PAR_O_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParO() <em>Par O</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParO()
   * @generated
   * @ordered
   */
  protected String parO = PAR_O_EDEFAULT;

  /**
   * The default value of the '{@link #getParF() <em>Par F</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParF()
   * @generated
   * @ordered
   */
  protected static final String PAR_F_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParF() <em>Par F</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParF()
   * @generated
   * @ordered
   */
  protected String parF = PAR_F_EDEFAULT;

  /**
   * The cached value of the '{@link #getNameRef() <em>Name Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameRef()
   * @generated
   * @ordered
   */
  protected ReferencesName nameRef;

  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected EList<Block> block;

  /**
   * The cached value of the '{@link #getLeftCurlyBracket() <em>Left Curly Bracket</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftCurlyBracket()
   * @generated
   * @ordered
   */
  protected LeftCurlyBracket leftCurlyBracket;

  /**
   * The cached value of the '{@link #getRightCurlyBracket() <em>Right Curly Bracket</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightCurlyBracket()
   * @generated
   * @ordered
   */
  protected RightCurlyBracket rightCurlyBracket;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return AlsPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BinOp> getBinOp()
  {
    if (binOp == null)
    {
      binOp = new EObjectContainmentEList<BinOp>(BinOp.class, this, AlsPackage.EXPRESSION__BIN_OP);
    }
    return binOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getExpr()
  {
    if (expr == null)
    {
      expr = new EObjectContainmentEList<Expression>(Expression.class, this, AlsPackage.EXPRESSION__EXPR);
    }
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArrowOp> getArrowOp()
  {
    if (arrowOp == null)
    {
      arrowOp = new EObjectContainmentEList<ArrowOp>(ArrowOp.class, this, AlsPackage.EXPRESSION__ARROW_OP);
    }
    return arrowOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getCmp()
  {
    if (cmp == null)
    {
      cmp = new EDataTypeEList<String>(String.class, this, AlsPackage.EXPRESSION__CMP);
    }
    return cmp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LeftSquareBracketKeyword> getLeft()
  {
    if (left == null)
    {
      left = new EObjectContainmentEList<LeftSquareBracketKeyword>(LeftSquareBracketKeyword.class, this, AlsPackage.EXPRESSION__LEFT);
    }
    return left;
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
      comma = new EObjectContainmentEList<Comma>(Comma.class, this, AlsPackage.EXPRESSION__COMMA);
    }
    return comma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RightSquareBracketKeyword> getRight()
  {
    if (right == null)
    {
      right = new EObjectContainmentEList<RightSquareBracketKeyword>(RightSquareBracketKeyword.class, this, AlsPackage.EXPRESSION__RIGHT);
    }
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLet()
  {
    return let;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLet(String newLet)
  {
    String oldLet = let;
    let = newLet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.EXPRESSION__LET, oldLet, let));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LetDecl> getLetdecl()
  {
    if (letdecl == null)
    {
      letdecl = new EObjectContainmentEList<LetDecl>(LetDecl.class, this, AlsPackage.EXPRESSION__LETDECL);
    }
    return letdecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BlockOrBar> getBlockOrBar()
  {
    if (blockOrBar == null)
    {
      blockOrBar = new EObjectContainmentEList<BlockOrBar>(BlockOrBar.class, this, AlsPackage.EXPRESSION__BLOCK_OR_BAR);
    }
    return blockOrBar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQuant()
  {
    return quant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuant(String newQuant)
  {
    String oldQuant = quant;
    quant = newQuant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.EXPRESSION__QUANT, oldQuant, quant));
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
      decl = new EObjectContainmentEList<Decl>(Decl.class, this, AlsPackage.EXPRESSION__DECL);
    }
    return decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnOp getUnOp()
  {
    return unOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnOp(UnOp newUnOp, NotificationChain msgs)
  {
    UnOp oldUnOp = unOp;
    unOp = newUnOp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.EXPRESSION__UN_OP, oldUnOp, newUnOp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnOp(UnOp newUnOp)
  {
    if (newUnOp != unOp)
    {
      NotificationChain msgs = null;
      if (unOp != null)
        msgs = ((InternalEObject)unOp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.EXPRESSION__UN_OP, null, msgs);
      if (newUnOp != null)
        msgs = ((InternalEObject)newUnOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.EXPRESSION__UN_OP, null, msgs);
      msgs = basicSetUnOp(newUnOp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.EXPRESSION__UN_OP, newUnOp, newUnOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CommonQuantUnOp> getCommon()
  {
    if (common == null)
    {
      common = new EObjectContainmentEList<CommonQuantUnOp>(CommonQuantUnOp.class, this, AlsPackage.EXPRESSION__COMMON);
    }
    return common;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNone()
  {
    return none;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNone(String newNone)
  {
    String oldNone = none;
    none = newNone;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.EXPRESSION__NONE, oldNone, none));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIden()
  {
    return iden;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIden(String newIden)
  {
    String oldIden = iden;
    iden = newIden;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.EXPRESSION__IDEN, oldIden, iden));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUniv()
  {
    return univ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUniv(String newUniv)
  {
    String oldUniv = univ;
    univ = newUniv;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.EXPRESSION__UNIV, oldUniv, univ));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInt()
  {
    return int_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInt(String newInt)
  {
    String oldInt = int_;
    int_ = newInt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.EXPRESSION__INT, oldInt, int_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSeq()
  {
    return seq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeq(String newSeq)
  {
    String oldSeq = seq;
    seq = newSeq;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.EXPRESSION__SEQ, oldSeq, seq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParO()
  {
    return parO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParO(String newParO)
  {
    String oldParO = parO;
    parO = newParO;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.EXPRESSION__PAR_O, oldParO, parO));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParF()
  {
    return parF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParF(String newParF)
  {
    String oldParF = parF;
    parF = newParF;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.EXPRESSION__PAR_F, oldParF, parF));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferencesName getNameRef()
  {
    if (nameRef != null && nameRef.eIsProxy())
    {
      InternalEObject oldNameRef = (InternalEObject)nameRef;
      nameRef = (ReferencesName)eResolveProxy(oldNameRef);
      if (nameRef != oldNameRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlsPackage.EXPRESSION__NAME_REF, oldNameRef, nameRef));
      }
    }
    return nameRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferencesName basicGetNameRef()
  {
    return nameRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameRef(ReferencesName newNameRef)
  {
    ReferencesName oldNameRef = nameRef;
    nameRef = newNameRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.EXPRESSION__NAME_REF, oldNameRef, nameRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Block> getBlock()
  {
    if (block == null)
    {
      block = new EObjectContainmentEList<Block>(Block.class, this, AlsPackage.EXPRESSION__BLOCK);
    }
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftCurlyBracket getLeftCurlyBracket()
  {
    return leftCurlyBracket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftCurlyBracket(LeftCurlyBracket newLeftCurlyBracket, NotificationChain msgs)
  {
    LeftCurlyBracket oldLeftCurlyBracket = leftCurlyBracket;
    leftCurlyBracket = newLeftCurlyBracket;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.EXPRESSION__LEFT_CURLY_BRACKET, oldLeftCurlyBracket, newLeftCurlyBracket);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftCurlyBracket(LeftCurlyBracket newLeftCurlyBracket)
  {
    if (newLeftCurlyBracket != leftCurlyBracket)
    {
      NotificationChain msgs = null;
      if (leftCurlyBracket != null)
        msgs = ((InternalEObject)leftCurlyBracket).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.EXPRESSION__LEFT_CURLY_BRACKET, null, msgs);
      if (newLeftCurlyBracket != null)
        msgs = ((InternalEObject)newLeftCurlyBracket).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.EXPRESSION__LEFT_CURLY_BRACKET, null, msgs);
      msgs = basicSetLeftCurlyBracket(newLeftCurlyBracket, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.EXPRESSION__LEFT_CURLY_BRACKET, newLeftCurlyBracket, newLeftCurlyBracket));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightCurlyBracket getRightCurlyBracket()
  {
    return rightCurlyBracket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightCurlyBracket(RightCurlyBracket newRightCurlyBracket, NotificationChain msgs)
  {
    RightCurlyBracket oldRightCurlyBracket = rightCurlyBracket;
    rightCurlyBracket = newRightCurlyBracket;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.EXPRESSION__RIGHT_CURLY_BRACKET, oldRightCurlyBracket, newRightCurlyBracket);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightCurlyBracket(RightCurlyBracket newRightCurlyBracket)
  {
    if (newRightCurlyBracket != rightCurlyBracket)
    {
      NotificationChain msgs = null;
      if (rightCurlyBracket != null)
        msgs = ((InternalEObject)rightCurlyBracket).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.EXPRESSION__RIGHT_CURLY_BRACKET, null, msgs);
      if (newRightCurlyBracket != null)
        msgs = ((InternalEObject)newRightCurlyBracket).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.EXPRESSION__RIGHT_CURLY_BRACKET, null, msgs);
      msgs = basicSetRightCurlyBracket(newRightCurlyBracket, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.EXPRESSION__RIGHT_CURLY_BRACKET, newRightCurlyBracket, newRightCurlyBracket));
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
      case AlsPackage.EXPRESSION__BIN_OP:
        return ((InternalEList<?>)getBinOp()).basicRemove(otherEnd, msgs);
      case AlsPackage.EXPRESSION__EXPR:
        return ((InternalEList<?>)getExpr()).basicRemove(otherEnd, msgs);
      case AlsPackage.EXPRESSION__ARROW_OP:
        return ((InternalEList<?>)getArrowOp()).basicRemove(otherEnd, msgs);
      case AlsPackage.EXPRESSION__LEFT:
        return ((InternalEList<?>)getLeft()).basicRemove(otherEnd, msgs);
      case AlsPackage.EXPRESSION__COMMA:
        return ((InternalEList<?>)getComma()).basicRemove(otherEnd, msgs);
      case AlsPackage.EXPRESSION__RIGHT:
        return ((InternalEList<?>)getRight()).basicRemove(otherEnd, msgs);
      case AlsPackage.EXPRESSION__LETDECL:
        return ((InternalEList<?>)getLetdecl()).basicRemove(otherEnd, msgs);
      case AlsPackage.EXPRESSION__BLOCK_OR_BAR:
        return ((InternalEList<?>)getBlockOrBar()).basicRemove(otherEnd, msgs);
      case AlsPackage.EXPRESSION__DECL:
        return ((InternalEList<?>)getDecl()).basicRemove(otherEnd, msgs);
      case AlsPackage.EXPRESSION__UN_OP:
        return basicSetUnOp(null, msgs);
      case AlsPackage.EXPRESSION__COMMON:
        return ((InternalEList<?>)getCommon()).basicRemove(otherEnd, msgs);
      case AlsPackage.EXPRESSION__BLOCK:
        return ((InternalEList<?>)getBlock()).basicRemove(otherEnd, msgs);
      case AlsPackage.EXPRESSION__LEFT_CURLY_BRACKET:
        return basicSetLeftCurlyBracket(null, msgs);
      case AlsPackage.EXPRESSION__RIGHT_CURLY_BRACKET:
        return basicSetRightCurlyBracket(null, msgs);
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
      case AlsPackage.EXPRESSION__BIN_OP:
        return getBinOp();
      case AlsPackage.EXPRESSION__EXPR:
        return getExpr();
      case AlsPackage.EXPRESSION__ARROW_OP:
        return getArrowOp();
      case AlsPackage.EXPRESSION__CMP:
        return getCmp();
      case AlsPackage.EXPRESSION__LEFT:
        return getLeft();
      case AlsPackage.EXPRESSION__COMMA:
        return getComma();
      case AlsPackage.EXPRESSION__RIGHT:
        return getRight();
      case AlsPackage.EXPRESSION__LET:
        return getLet();
      case AlsPackage.EXPRESSION__LETDECL:
        return getLetdecl();
      case AlsPackage.EXPRESSION__BLOCK_OR_BAR:
        return getBlockOrBar();
      case AlsPackage.EXPRESSION__QUANT:
        return getQuant();
      case AlsPackage.EXPRESSION__DECL:
        return getDecl();
      case AlsPackage.EXPRESSION__UN_OP:
        return getUnOp();
      case AlsPackage.EXPRESSION__COMMON:
        return getCommon();
      case AlsPackage.EXPRESSION__NONE:
        return getNone();
      case AlsPackage.EXPRESSION__IDEN:
        return getIden();
      case AlsPackage.EXPRESSION__UNIV:
        return getUniv();
      case AlsPackage.EXPRESSION__INT:
        return getInt();
      case AlsPackage.EXPRESSION__SEQ:
        return getSeq();
      case AlsPackage.EXPRESSION__PAR_O:
        return getParO();
      case AlsPackage.EXPRESSION__PAR_F:
        return getParF();
      case AlsPackage.EXPRESSION__NAME_REF:
        if (resolve) return getNameRef();
        return basicGetNameRef();
      case AlsPackage.EXPRESSION__BLOCK:
        return getBlock();
      case AlsPackage.EXPRESSION__LEFT_CURLY_BRACKET:
        return getLeftCurlyBracket();
      case AlsPackage.EXPRESSION__RIGHT_CURLY_BRACKET:
        return getRightCurlyBracket();
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
      case AlsPackage.EXPRESSION__BIN_OP:
        getBinOp().clear();
        getBinOp().addAll((Collection<? extends BinOp>)newValue);
        return;
      case AlsPackage.EXPRESSION__EXPR:
        getExpr().clear();
        getExpr().addAll((Collection<? extends Expression>)newValue);
        return;
      case AlsPackage.EXPRESSION__ARROW_OP:
        getArrowOp().clear();
        getArrowOp().addAll((Collection<? extends ArrowOp>)newValue);
        return;
      case AlsPackage.EXPRESSION__CMP:
        getCmp().clear();
        getCmp().addAll((Collection<? extends String>)newValue);
        return;
      case AlsPackage.EXPRESSION__LEFT:
        getLeft().clear();
        getLeft().addAll((Collection<? extends LeftSquareBracketKeyword>)newValue);
        return;
      case AlsPackage.EXPRESSION__COMMA:
        getComma().clear();
        getComma().addAll((Collection<? extends Comma>)newValue);
        return;
      case AlsPackage.EXPRESSION__RIGHT:
        getRight().clear();
        getRight().addAll((Collection<? extends RightSquareBracketKeyword>)newValue);
        return;
      case AlsPackage.EXPRESSION__LET:
        setLet((String)newValue);
        return;
      case AlsPackage.EXPRESSION__LETDECL:
        getLetdecl().clear();
        getLetdecl().addAll((Collection<? extends LetDecl>)newValue);
        return;
      case AlsPackage.EXPRESSION__BLOCK_OR_BAR:
        getBlockOrBar().clear();
        getBlockOrBar().addAll((Collection<? extends BlockOrBar>)newValue);
        return;
      case AlsPackage.EXPRESSION__QUANT:
        setQuant((String)newValue);
        return;
      case AlsPackage.EXPRESSION__DECL:
        getDecl().clear();
        getDecl().addAll((Collection<? extends Decl>)newValue);
        return;
      case AlsPackage.EXPRESSION__UN_OP:
        setUnOp((UnOp)newValue);
        return;
      case AlsPackage.EXPRESSION__COMMON:
        getCommon().clear();
        getCommon().addAll((Collection<? extends CommonQuantUnOp>)newValue);
        return;
      case AlsPackage.EXPRESSION__NONE:
        setNone((String)newValue);
        return;
      case AlsPackage.EXPRESSION__IDEN:
        setIden((String)newValue);
        return;
      case AlsPackage.EXPRESSION__UNIV:
        setUniv((String)newValue);
        return;
      case AlsPackage.EXPRESSION__INT:
        setInt((String)newValue);
        return;
      case AlsPackage.EXPRESSION__SEQ:
        setSeq((String)newValue);
        return;
      case AlsPackage.EXPRESSION__PAR_O:
        setParO((String)newValue);
        return;
      case AlsPackage.EXPRESSION__PAR_F:
        setParF((String)newValue);
        return;
      case AlsPackage.EXPRESSION__NAME_REF:
        setNameRef((ReferencesName)newValue);
        return;
      case AlsPackage.EXPRESSION__BLOCK:
        getBlock().clear();
        getBlock().addAll((Collection<? extends Block>)newValue);
        return;
      case AlsPackage.EXPRESSION__LEFT_CURLY_BRACKET:
        setLeftCurlyBracket((LeftCurlyBracket)newValue);
        return;
      case AlsPackage.EXPRESSION__RIGHT_CURLY_BRACKET:
        setRightCurlyBracket((RightCurlyBracket)newValue);
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
      case AlsPackage.EXPRESSION__BIN_OP:
        getBinOp().clear();
        return;
      case AlsPackage.EXPRESSION__EXPR:
        getExpr().clear();
        return;
      case AlsPackage.EXPRESSION__ARROW_OP:
        getArrowOp().clear();
        return;
      case AlsPackage.EXPRESSION__CMP:
        getCmp().clear();
        return;
      case AlsPackage.EXPRESSION__LEFT:
        getLeft().clear();
        return;
      case AlsPackage.EXPRESSION__COMMA:
        getComma().clear();
        return;
      case AlsPackage.EXPRESSION__RIGHT:
        getRight().clear();
        return;
      case AlsPackage.EXPRESSION__LET:
        setLet(LET_EDEFAULT);
        return;
      case AlsPackage.EXPRESSION__LETDECL:
        getLetdecl().clear();
        return;
      case AlsPackage.EXPRESSION__BLOCK_OR_BAR:
        getBlockOrBar().clear();
        return;
      case AlsPackage.EXPRESSION__QUANT:
        setQuant(QUANT_EDEFAULT);
        return;
      case AlsPackage.EXPRESSION__DECL:
        getDecl().clear();
        return;
      case AlsPackage.EXPRESSION__UN_OP:
        setUnOp((UnOp)null);
        return;
      case AlsPackage.EXPRESSION__COMMON:
        getCommon().clear();
        return;
      case AlsPackage.EXPRESSION__NONE:
        setNone(NONE_EDEFAULT);
        return;
      case AlsPackage.EXPRESSION__IDEN:
        setIden(IDEN_EDEFAULT);
        return;
      case AlsPackage.EXPRESSION__UNIV:
        setUniv(UNIV_EDEFAULT);
        return;
      case AlsPackage.EXPRESSION__INT:
        setInt(INT_EDEFAULT);
        return;
      case AlsPackage.EXPRESSION__SEQ:
        setSeq(SEQ_EDEFAULT);
        return;
      case AlsPackage.EXPRESSION__PAR_O:
        setParO(PAR_O_EDEFAULT);
        return;
      case AlsPackage.EXPRESSION__PAR_F:
        setParF(PAR_F_EDEFAULT);
        return;
      case AlsPackage.EXPRESSION__NAME_REF:
        setNameRef((ReferencesName)null);
        return;
      case AlsPackage.EXPRESSION__BLOCK:
        getBlock().clear();
        return;
      case AlsPackage.EXPRESSION__LEFT_CURLY_BRACKET:
        setLeftCurlyBracket((LeftCurlyBracket)null);
        return;
      case AlsPackage.EXPRESSION__RIGHT_CURLY_BRACKET:
        setRightCurlyBracket((RightCurlyBracket)null);
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
      case AlsPackage.EXPRESSION__BIN_OP:
        return binOp != null && !binOp.isEmpty();
      case AlsPackage.EXPRESSION__EXPR:
        return expr != null && !expr.isEmpty();
      case AlsPackage.EXPRESSION__ARROW_OP:
        return arrowOp != null && !arrowOp.isEmpty();
      case AlsPackage.EXPRESSION__CMP:
        return cmp != null && !cmp.isEmpty();
      case AlsPackage.EXPRESSION__LEFT:
        return left != null && !left.isEmpty();
      case AlsPackage.EXPRESSION__COMMA:
        return comma != null && !comma.isEmpty();
      case AlsPackage.EXPRESSION__RIGHT:
        return right != null && !right.isEmpty();
      case AlsPackage.EXPRESSION__LET:
        return LET_EDEFAULT == null ? let != null : !LET_EDEFAULT.equals(let);
      case AlsPackage.EXPRESSION__LETDECL:
        return letdecl != null && !letdecl.isEmpty();
      case AlsPackage.EXPRESSION__BLOCK_OR_BAR:
        return blockOrBar != null && !blockOrBar.isEmpty();
      case AlsPackage.EXPRESSION__QUANT:
        return QUANT_EDEFAULT == null ? quant != null : !QUANT_EDEFAULT.equals(quant);
      case AlsPackage.EXPRESSION__DECL:
        return decl != null && !decl.isEmpty();
      case AlsPackage.EXPRESSION__UN_OP:
        return unOp != null;
      case AlsPackage.EXPRESSION__COMMON:
        return common != null && !common.isEmpty();
      case AlsPackage.EXPRESSION__NONE:
        return NONE_EDEFAULT == null ? none != null : !NONE_EDEFAULT.equals(none);
      case AlsPackage.EXPRESSION__IDEN:
        return IDEN_EDEFAULT == null ? iden != null : !IDEN_EDEFAULT.equals(iden);
      case AlsPackage.EXPRESSION__UNIV:
        return UNIV_EDEFAULT == null ? univ != null : !UNIV_EDEFAULT.equals(univ);
      case AlsPackage.EXPRESSION__INT:
        return INT_EDEFAULT == null ? int_ != null : !INT_EDEFAULT.equals(int_);
      case AlsPackage.EXPRESSION__SEQ:
        return SEQ_EDEFAULT == null ? seq != null : !SEQ_EDEFAULT.equals(seq);
      case AlsPackage.EXPRESSION__PAR_O:
        return PAR_O_EDEFAULT == null ? parO != null : !PAR_O_EDEFAULT.equals(parO);
      case AlsPackage.EXPRESSION__PAR_F:
        return PAR_F_EDEFAULT == null ? parF != null : !PAR_F_EDEFAULT.equals(parF);
      case AlsPackage.EXPRESSION__NAME_REF:
        return nameRef != null;
      case AlsPackage.EXPRESSION__BLOCK:
        return block != null && !block.isEmpty();
      case AlsPackage.EXPRESSION__LEFT_CURLY_BRACKET:
        return leftCurlyBracket != null;
      case AlsPackage.EXPRESSION__RIGHT_CURLY_BRACKET:
        return rightCurlyBracket != null;
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
    result.append(" (cmp: ");
    result.append(cmp);
    result.append(", let: ");
    result.append(let);
    result.append(", quant: ");
    result.append(quant);
    result.append(", none: ");
    result.append(none);
    result.append(", iden: ");
    result.append(iden);
    result.append(", univ: ");
    result.append(univ);
    result.append(", int: ");
    result.append(int_);
    result.append(", seq: ");
    result.append(seq);
    result.append(", parO: ");
    result.append(parO);
    result.append(", parF: ");
    result.append(parF);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl
