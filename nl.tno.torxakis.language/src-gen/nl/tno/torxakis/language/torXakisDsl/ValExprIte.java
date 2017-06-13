/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Val Expr Ite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.ValExprIte#getConditionValExpr <em>Condition Val Expr</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.ValExprIte#getThenValExpr <em>Then Val Expr</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.ValExprIte#getElseValExpr <em>Else Val Expr</em>}</li>
 * </ul>
 *
 * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getValExprIte()
 * @model
 * @generated
 */
public interface ValExprIte extends ValExpr
{
  /**
   * Returns the value of the '<em><b>Condition Val Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition Val Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition Val Expr</em>' containment reference.
   * @see #setConditionValExpr(ValExpr)
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getValExprIte_ConditionValExpr()
   * @model containment="true"
   * @generated
   */
  ValExpr getConditionValExpr();

  /**
   * Sets the value of the '{@link nl.tno.torxakis.language.torXakisDsl.ValExprIte#getConditionValExpr <em>Condition Val Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition Val Expr</em>' containment reference.
   * @see #getConditionValExpr()
   * @generated
   */
  void setConditionValExpr(ValExpr value);

  /**
   * Returns the value of the '<em><b>Then Val Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Val Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Val Expr</em>' containment reference.
   * @see #setThenValExpr(ValExpr)
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getValExprIte_ThenValExpr()
   * @model containment="true"
   * @generated
   */
  ValExpr getThenValExpr();

  /**
   * Sets the value of the '{@link nl.tno.torxakis.language.torXakisDsl.ValExprIte#getThenValExpr <em>Then Val Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Val Expr</em>' containment reference.
   * @see #getThenValExpr()
   * @generated
   */
  void setThenValExpr(ValExpr value);

  /**
   * Returns the value of the '<em><b>Else Val Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Val Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Val Expr</em>' containment reference.
   * @see #setElseValExpr(ValExpr)
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getValExprIte_ElseValExpr()
   * @model containment="true"
   * @generated
   */
  ValExpr getElseValExpr();

  /**
   * Sets the value of the '{@link nl.tno.torxakis.language.torXakisDsl.ValExprIte#getElseValExpr <em>Else Val Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Val Expr</em>' containment reference.
   * @see #getElseValExpr()
   * @generated
   */
  void setElseValExpr(ValExpr value);

} // ValExprIte
