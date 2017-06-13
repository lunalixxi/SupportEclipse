/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl.impl;

import nl.tno.torxakis.language.torXakisDsl.ProcessBehaviour;
import nl.tno.torxakis.language.torXakisDsl.ProcessBehaviourEnable;
import nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Behaviour Enable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.ProcessBehaviourEnableImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.ProcessBehaviourEnableImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessBehaviourEnableImpl extends ProcessBehaviourImpl implements ProcessBehaviourEnable
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected ProcessBehaviour left;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected ProcessBehaviour right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcessBehaviourEnableImpl()
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
    return TorXakisDslPackage.Literals.PROCESS_BEHAVIOUR_ENABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessBehaviour getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(ProcessBehaviour newLeft, NotificationChain msgs)
  {
    ProcessBehaviour oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.PROCESS_BEHAVIOUR_ENABLE__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(ProcessBehaviour newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.PROCESS_BEHAVIOUR_ENABLE__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.PROCESS_BEHAVIOUR_ENABLE__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.PROCESS_BEHAVIOUR_ENABLE__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessBehaviour getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(ProcessBehaviour newRight, NotificationChain msgs)
  {
    ProcessBehaviour oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.PROCESS_BEHAVIOUR_ENABLE__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(ProcessBehaviour newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.PROCESS_BEHAVIOUR_ENABLE__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.PROCESS_BEHAVIOUR_ENABLE__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.PROCESS_BEHAVIOUR_ENABLE__RIGHT, newRight, newRight));
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
      case TorXakisDslPackage.PROCESS_BEHAVIOUR_ENABLE__LEFT:
        return basicSetLeft(null, msgs);
      case TorXakisDslPackage.PROCESS_BEHAVIOUR_ENABLE__RIGHT:
        return basicSetRight(null, msgs);
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
      case TorXakisDslPackage.PROCESS_BEHAVIOUR_ENABLE__LEFT:
        return getLeft();
      case TorXakisDslPackage.PROCESS_BEHAVIOUR_ENABLE__RIGHT:
        return getRight();
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
      case TorXakisDslPackage.PROCESS_BEHAVIOUR_ENABLE__LEFT:
        setLeft((ProcessBehaviour)newValue);
        return;
      case TorXakisDslPackage.PROCESS_BEHAVIOUR_ENABLE__RIGHT:
        setRight((ProcessBehaviour)newValue);
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
      case TorXakisDslPackage.PROCESS_BEHAVIOUR_ENABLE__LEFT:
        setLeft((ProcessBehaviour)null);
        return;
      case TorXakisDslPackage.PROCESS_BEHAVIOUR_ENABLE__RIGHT:
        setRight((ProcessBehaviour)null);
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
      case TorXakisDslPackage.PROCESS_BEHAVIOUR_ENABLE__LEFT:
        return left != null;
      case TorXakisDslPackage.PROCESS_BEHAVIOUR_ENABLE__RIGHT:
        return right != null;
    }
    return super.eIsSet(featureID);
  }

} //ProcessBehaviourEnableImpl
