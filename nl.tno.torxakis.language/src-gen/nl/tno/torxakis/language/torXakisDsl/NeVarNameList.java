/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ne Var Name List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.NeVarNameList#getVarNames <em>Var Names</em>}</li>
 * </ul>
 *
 * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getNeVarNameList()
 * @model
 * @generated
 */
public interface NeVarNameList extends EObject
{
  /**
   * Returns the value of the '<em><b>Var Names</b></em>' containment reference list.
   * The list contents are of type {@link nl.tno.torxakis.language.torXakisDsl.VarName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Names</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Names</em>' containment reference list.
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getNeVarNameList_VarNames()
   * @model containment="true"
   * @generated
   */
  EList<VarName> getVarNames();

} // NeVarNameList
