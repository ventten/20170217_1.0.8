
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for functionPermission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="functionPermission">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="function" type="{http://webservice.loan.mfbms.flinkmf.com/}function" minOccurs="0"/>
 *         &lt;element name="permission" type="{http://webservice.loan.mfbms.flinkmf.com/}permission" minOccurs="0"/>
 *         &lt;element name="rolePriviledges" type="{http://webservice.loan.mfbms.flinkmf.com/}rolePriviledge" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "functionPermission", propOrder = {
    "function",
    "permission",
    "rolePriviledges"
})
public class FunctionPermission
    extends BaseVersionableCreatorAwareEntity
{

    protected Function function;
    protected Permission permission;
    @XmlElement(nillable = true)
    protected List<RolePriviledge> rolePriviledges;

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link Function }
     *     
     */
    public Function getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link Function }
     *     
     */
    public void setFunction(Function value) {
        this.function = value;
    }

    /**
     * Gets the value of the permission property.
     * 
     * @return
     *     possible object is
     *     {@link Permission }
     *     
     */
    public Permission getPermission() {
        return permission;
    }

    /**
     * Sets the value of the permission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Permission }
     *     
     */
    public void setPermission(Permission value) {
        this.permission = value;
    }

    /**
     * Gets the value of the rolePriviledges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolePriviledges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolePriviledges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RolePriviledge }
     * 
     * 
     */
    public List<RolePriviledge> getRolePriviledges() {
        if (rolePriviledges == null) {
            rolePriviledges = new ArrayList<RolePriviledge>();
        }
        return this.rolePriviledges;
    }

}
