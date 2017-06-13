/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ne Constructor List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.NeConstructorList#getConstructors <em>Constructors</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.NeConstructorList#getConstructor <em>Constructor</em>}</li>
 * </ul>
 *
 * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getNeConstructorList()
 * @model
 * @generated
 */
public interface NeConstructorList extends EObject
{
  /**
   * Returns the value of the '<em><b>Constructors</b></em>' containment reference list.
   * The list contents are of type {@link nl.tno.torxakis.language.torXakisDsl.Constructor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constructors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constructors</em>' containment reference list.
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getNeConstructorList_Constructors()
   * @model containment="true"
   * @generated
   */
  EList<Constructor> getConstructors();

  /**
   * Returns the value of the '<em><b>Constructor</b></em>' containment reference list.
   * The list contents are of type {@link nl.tno.torxakis.language.torXakisDsl.Constructor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constructor</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constructor</em>' containment reference list.
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getNeConstructorList_Constructor()
   * @model containment="true"
   * @generated
   */
  EList<Constructor> getConstructor();

} // NeConstructorList
