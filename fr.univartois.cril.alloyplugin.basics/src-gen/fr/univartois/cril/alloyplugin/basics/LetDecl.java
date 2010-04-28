/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.alloyplugin.basics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.LetDecl#getLetDecl <em>Let Decl</em>}</li>
 *   <li>{@link fr.univartois.cril.alloyplugin.basics.LetDecl#getBlockOrBarBis <em>Block Or Bar Bis</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getLetDecl()
 * @model
 * @generated
 */
public interface LetDecl extends Expression
{
  /**
   * Returns the value of the '<em><b>Let Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Let Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Let Decl</em>' containment reference.
   * @see #setLetDecl(LetDecl)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getLetDecl_LetDecl()
   * @model containment="true"
   * @generated
   */
  LetDecl getLetDecl();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.LetDecl#getLetDecl <em>Let Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Let Decl</em>' containment reference.
   * @see #getLetDecl()
   * @generated
   */
  void setLetDecl(LetDecl value);

  /**
   * Returns the value of the '<em><b>Block Or Bar Bis</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block Or Bar Bis</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block Or Bar Bis</em>' containment reference.
   * @see #setBlockOrBarBis(BlockOrBarBis)
   * @see fr.univartois.cril.alloyplugin.basics.BasicsPackage#getLetDecl_BlockOrBarBis()
   * @model containment="true"
   * @generated
   */
  BlockOrBarBis getBlockOrBarBis();

  /**
   * Sets the value of the '{@link fr.univartois.cril.alloyplugin.basics.LetDecl#getBlockOrBarBis <em>Block Or Bar Bis</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block Or Bar Bis</em>' containment reference.
   * @see #getBlockOrBarBis()
   * @generated
   */
  void setBlockOrBarBis(BlockOrBarBis value);

} // LetDecl
