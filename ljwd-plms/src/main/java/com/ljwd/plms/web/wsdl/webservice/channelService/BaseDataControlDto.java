
package com.ljwd.plms.web.wsdl.webservice.channelService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseDataControlDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseDataControlDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseEnquiryParamDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseDataControlDto")
@XmlSeeAlso({
    AppIdNameSearchParamDto.class,
    CompanyCustomerInfoSearchParamDto.class
})
public class BaseDataControlDto
    extends BaseEnquiryParamDto
{


}
