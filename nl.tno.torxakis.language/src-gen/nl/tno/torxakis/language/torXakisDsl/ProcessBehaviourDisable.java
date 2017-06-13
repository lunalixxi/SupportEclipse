/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Behaviour Disable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.ProcessBehaviourDisable#getLeft <em>Left</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.ProcessBehaviourDisable#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getProcessBehaviourDisable()
 * @model
 * @generated
 */
public interface ProcessBehaviourDisable extends ProcessBehaviour
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(ProcessBehaviour)
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getProcessBehaviourDisable_Left()
   * @model containment="true"
   * @generated
   */
  ProcessBehaviour getLeft();

  /**
   * Sets the value of the '{@link nl.tno.torxakis.language.torXakisDsl.ProcessBehaviourDisable#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ProcessBehaviour value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ProcessBehaviour)
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getProcessBehaviourDisable_Right()
   * @model containment="true"
   * @generated
   */
  ProcessBehaviour getRight();

  /**
   * Sets the value of the '{@link nl.tno.torxakis.language.torXakisDsl.ProcessBehaviourDisable#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ProcessBehaviour value);

} // ProcessBehaviourDisable
