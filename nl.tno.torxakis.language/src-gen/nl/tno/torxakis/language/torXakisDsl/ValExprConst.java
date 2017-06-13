/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Val Expr Const</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.ValExprConst#getConst <em>Const</em>}</li>
 * </ul>
 *
 * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getValExprConst()
 * @model
 * @generated
 */
public interface ValExprConst extends EObject
{
  /**
   * Returns the value of the '<em><b>Const</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const</em>' containment reference.
   * @see #setConst(ConstName)
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getValExprConst_Const()
   * @model containment="true"
   * @generated
   */
  ConstName getConst();

  /**
   * Sets the value of the '{@link nl.tno.torxakis.language.torXakisDsl.ValExprConst#getConst <em>Const</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const</em>' containment reference.
   * @see #getConst()
   * @generated
   */
  void setConst(ConstName value);

} // ValExprConst
