/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decoding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.Decoding#getCommunication <em>Communication</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.Decoding#getChannelOffer <em>Channel Offer</em>}</li>
 * </ul>
 *
 * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getDecoding()
 * @model
 * @generated
 */
public interface Decoding extends ConnectionItem
{
  /**
   * Returns the value of the '<em><b>Communication</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Communication</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Communication</em>' containment reference.
   * @see #setCommunication(Communication)
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getDecoding_Communication()
   * @model containment="true"
   * @generated
   */
  Communication getCommunication();

  /**
   * Sets the value of the '{@link nl.tno.torxakis.language.torXakisDsl.Decoding#getCommunication <em>Communication</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Communication</em>' containment reference.
   * @see #getCommunication()
   * @generated
   */
  void setCommunication(Communication value);

  /**
   * Returns the value of the '<em><b>Channel Offer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Channel Offer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Channel Offer</em>' containment reference.
   * @see #setChannelOffer(ChannelOffer)
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getDecoding_ChannelOffer()
   * @model containment="true"
   * @generated
   */
  ChannelOffer getChannelOffer();

  /**
   * Sets the value of the '{@link nl.tno.torxakis.language.torXakisDsl.Decoding#getChannelOffer <em>Channel Offer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Channel Offer</em>' containment reference.
   * @see #getChannelOffer()
   * @generated
   */
  void setChannelOffer(ChannelOffer value);

} // Decoding
