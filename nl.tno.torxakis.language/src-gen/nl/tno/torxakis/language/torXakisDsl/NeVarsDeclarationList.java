/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ne Vars Declaration List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.NeVarsDeclarationList#getVarsDeclarations <em>Vars Declarations</em>}</li>
 * </ul>
 *
 * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getNeVarsDeclarationList()
 * @model
 * @generated
 */
public interface NeVarsDeclarationList extends EObject
{
  /**
   * Returns the value of the '<em><b>Vars Declarations</b></em>' containment reference list.
   * The list contents are of type {@link nl.tno.torxakis.language.torXakisDsl.VarsDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars Declarations</em>' containment reference list.
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getNeVarsDeclarationList_VarsDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<VarsDeclaration> getVarsDeclarations();

} // NeVarsDeclarationList
