/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl.impl;

import java.util.Collection;

import nl.tno.torxakis.language.torXakisDsl.NeVarsDeclarationList;
import nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage;
import nl.tno.torxakis.language.torXakisDsl.VarsDeclaration;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ne Vars Declaration List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.NeVarsDeclarationListImpl#getVarsDeclarations <em>Vars Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeVarsDeclarationListImpl extends MinimalEObjectImpl.Container implements NeVarsDeclarationList
{
  /**
   * The cached value of the '{@link #getVarsDeclarations() <em>Vars Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarsDeclarations()
   * @generated
   * @ordered
   */
  protected EList<VarsDeclaration> varsDeclarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NeVarsDeclarationListImpl()
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
    return TorXakisDslPackage.Literals.NE_VARS_DECLARATION_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VarsDeclaration> getVarsDeclarations()
  {
    if (varsDeclarations == null)
    {
      varsDeclarations = new EObjectContainmentEList<VarsDeclaration>(VarsDeclaration.class, this, TorXakisDslPackage.NE_VARS_DECLARATION_LIST__VARS_DECLARATIONS);
    }
    return varsDeclarations;
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
      case TorXakisDslPackage.NE_VARS_DECLARATION_LIST__VARS_DECLARATIONS:
        return ((InternalEList<?>)getVarsDeclarations()).basicRemove(otherEnd, msgs);
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
      case TorXakisDslPackage.NE_VARS_DECLARATION_LIST__VARS_DECLARATIONS:
        return getVarsDeclarations();
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
      case TorXakisDslPackage.NE_VARS_DECLARATION_LIST__VARS_DECLARATIONS:
        getVarsDeclarations().clear();
        getVarsDeclarations().addAll((Collection<? extends VarsDeclaration>)newValue);
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
      case TorXakisDslPackage.NE_VARS_DECLARATION_LIST__VARS_DECLARATIONS:
        getVarsDeclarations().clear();
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
      case TorXakisDslPackage.NE_VARS_DECLARATION_LIST__VARS_DECLARATIONS:
        return varsDeclarations != null && !varsDeclarations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NeVarsDeclarationListImpl
