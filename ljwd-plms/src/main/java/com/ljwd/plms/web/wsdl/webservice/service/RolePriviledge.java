
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rolePriviledge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rolePriviledge">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="functionPermission" type="{http://webservice.loan.mfbms.flinkmf.com/}functionPermission" minOccurs="0"/>
 *         &lt;element name="role" type="{http://webservice.loan.mfbms.flinkmf.com/}role" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rolePriviledge", propOrder = {
    "functionPermission",
    "role"
})
public class RolePriviledge
    extends BaseVersionableCreatorAwareEntity
{

    protected FunctionPermission functionPermission;
    protected Role role;

    /**
     * Gets the value of the functionPermission property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionPermission }
     *     
     */
    public FunctionPermission getFunctionPermission() {
        return functionPermission;
    }

    /**
     * Sets the value of the functionPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionPermission }
     *     
     */
    public void setFunctionPermission(FunctionPermission value) {
        this.functionPermission = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link Role }
     *     
     */
    public Role getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link Role }
     *     
     */
    public void setRole(Role value) {
        this.role = value;
    }

}
