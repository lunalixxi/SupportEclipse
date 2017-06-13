/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl.impl;

import nl.tno.torxakis.language.torXakisDsl.FuncDef;
import nl.tno.torxakis.language.torXakisDsl.FuncName;
import nl.tno.torxakis.language.torXakisDsl.NeVarsDeclarationList;
import nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage;
import nl.tno.torxakis.language.torXakisDsl.TypeName;
import nl.tno.torxakis.language.torXakisDsl.ValExpr;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Func Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.FuncDefImpl#getFuncName <em>Func Name</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.FuncDefImpl#getNeVarsDelarationList <em>Ne Vars Delaration List</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.FuncDefImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.FuncDefImpl#getValExpr <em>Val Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuncDefImpl extends MinimalEObjectImpl.Container implements FuncDef
{
  /**
   * The cached value of the '{@link #getFuncName() <em>Func Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFuncName()
   * @generated
   * @ordered
   */
  protected FuncName funcName;

  /**
   * The cached value of the '{@link #getNeVarsDelarationList() <em>Ne Vars Delaration List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNeVarsDelarationList()
   * @generated
   * @ordered
   */
  protected NeVarsDeclarationList neVarsDelarationList;

  /**
   * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeName()
   * @generated
   * @ordered
   */
  protected TypeName typeName;

  /**
   * The cached value of the '{@link #getValExpr() <em>Val Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValExpr()
   * @generated
   * @ordered
   */
  protected ValExpr valExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FuncDefImpl()
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
    return TorXakisDslPackage.Literals.FUNC_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuncName getFuncName()
  {
    return funcName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFuncName(FuncName newFuncName, NotificationChain msgs)
  {
    FuncName oldFuncName = funcName;
    funcName = newFuncName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.FUNC_DEF__FUNC_NAME, oldFuncName, newFuncName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFuncName(FuncName newFuncName)
  {
    if (newFuncName != funcName)
    {
      NotificationChain msgs = null;
      if (funcName != null)
        msgs = ((InternalEObject)funcName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.FUNC_DEF__FUNC_NAME, null, msgs);
      if (newFuncName != null)
        msgs = ((InternalEObject)newFuncName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.FUNC_DEF__FUNC_NAME, null, msgs);
      msgs = basicSetFuncName(newFuncName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.FUNC_DEF__FUNC_NAME, newFuncName, newFuncName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NeVarsDeclarationList getNeVarsDelarationList()
  {
    return neVarsDelarationList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNeVarsDelarationList(NeVarsDeclarationList newNeVarsDelarationList, NotificationChain msgs)
  {
    NeVarsDeclarationList oldNeVarsDelarationList = neVarsDelarationList;
    neVarsDelarationList = newNeVarsDelarationList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.FUNC_DEF__NE_VARS_DELARATION_LIST, oldNeVarsDelarationList, newNeVarsDelarationList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNeVarsDelarationList(NeVarsDeclarationList newNeVarsDelarationList)
  {
    if (newNeVarsDelarationList != neVarsDelarationList)
    {
      NotificationChain msgs = null;
      if (neVarsDelarationList != null)
        msgs = ((InternalEObject)neVarsDelarationList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.FUNC_DEF__NE_VARS_DELARATION_LIST, null, msgs);
      if (newNeVarsDelarationList != null)
        msgs = ((InternalEObject)newNeVarsDelarationList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.FUNC_DEF__NE_VARS_DELARATION_LIST, null, msgs);
      msgs = basicSetNeVarsDelarationList(newNeVarsDelarationList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.FUNC_DEF__NE_VARS_DELARATION_LIST, newNeVarsDelarationList, newNeVarsDelarationList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeName getTypeName()
  {
    return typeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeName(TypeName newTypeName, NotificationChain msgs)
  {
    TypeName oldTypeName = typeName;
    typeName = newTypeName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.FUNC_DEF__TYPE_NAME, oldTypeName, newTypeName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeName(TypeName newTypeName)
  {
    if (newTypeName != typeName)
    {
      NotificationChain msgs = null;
      if (typeName != null)
        msgs = ((InternalEObject)typeName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.FUNC_DEF__TYPE_NAME, null, msgs);
      if (newTypeName != null)
        msgs = ((InternalEObject)newTypeName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.FUNC_DEF__TYPE_NAME, null, msgs);
      msgs = basicSetTypeName(newTypeName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.FUNC_DEF__TYPE_NAME, newTypeName, newTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValExpr getValExpr()
  {
    return valExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValExpr(ValExpr newValExpr, NotificationChain msgs)
  {
    ValExpr oldValExpr = valExpr;
    valExpr = newValExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.FUNC_DEF__VAL_EXPR, oldValExpr, newValExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValExpr(ValExpr newValExpr)
  {
    if (newValExpr != valExpr)
    {
      NotificationChain msgs = null;
      if (valExpr != null)
        msgs = ((InternalEObject)valExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.FUNC_DEF__VAL_EXPR, null, msgs);
      if (newValExpr != null)
        msgs = ((InternalEObject)newValExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.FUNC_DEF__VAL_EXPR, null, msgs);
      msgs = basicSetValExpr(newValExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.FUNC_DEF__VAL_EXPR, newValExpr, newValExpr));
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
      case TorXakisDslPackage.FUNC_DEF__FUNC_NAME:
        return basicSetFuncName(null, msgs);
      case TorXakisDslPackage.FUNC_DEF__NE_VARS_DELARATION_LIST:
        return basicSetNeVarsDelarationList(null, msgs);
      case TorXakisDslPackage.FUNC_DEF__TYPE_NAME:
        return basicSetTypeName(null, msgs);
      case TorXakisDslPackage.FUNC_DEF__VAL_EXPR:
        return basicSetValExpr(null, msgs);
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
      case TorXakisDslPackage.FUNC_DEF__FUNC_NAME:
        return getFuncName();
      case TorXakisDslPackage.FUNC_DEF__NE_VARS_DELARATION_LIST:
        return getNeVarsDelarationList();
      case TorXakisDslPackage.FUNC_DEF__TYPE_NAME:
        return getTypeName();
      case TorXakisDslPackage.FUNC_DEF__VAL_EXPR:
        return getValExpr();
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
      case TorXakisDslPackage.FUNC_DEF__FUNC_NAME:
        setFuncName((FuncName)newValue);
        return;
      case TorXakisDslPackage.FUNC_DEF__NE_VARS_DELARATION_LIST:
        setNeVarsDelarationList((NeVarsDeclarationList)newValue);
        return;
      case TorXakisDslPackage.FUNC_DEF__TYPE_NAME:
        setTypeName((TypeName)newValue);
        return;
      case TorXakisDslPackage.FUNC_DEF__VAL_EXPR:
        setValExpr((ValExpr)newValue);
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
      case TorXakisDslPackage.FUNC_DEF__FUNC_NAME:
        setFuncName((FuncName)null);
        return;
      case TorXakisDslPackage.FUNC_DEF__NE_VARS_DELARATION_LIST:
        setNeVarsDelarationList((NeVarsDeclarationList)null);
        return;
      case TorXakisDslPackage.FUNC_DEF__TYPE_NAME:
        setTypeName((TypeName)null);
        return;
      case TorXakisDslPackage.FUNC_DEF__VAL_EXPR:
        setValExpr((ValExpr)null);
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
      case TorXakisDslPackage.FUNC_DEF__FUNC_NAME:
        return funcName != null;
      case TorXakisDslPackage.FUNC_DEF__NE_VARS_DELARATION_LIST:
        return neVarsDelarationList != null;
      case TorXakisDslPackage.FUNC_DEF__TYPE_NAME:
        return typeName != null;
      case TorXakisDslPackage.FUNC_DEF__VAL_EXPR:
        return valExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //FuncDefImpl
