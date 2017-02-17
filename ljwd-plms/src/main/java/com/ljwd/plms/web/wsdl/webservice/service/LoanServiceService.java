
package com.ljwd.plms.web.wsdl.webservice.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "LoanServiceService", targetNamespace = "http://webservice.loan.mfbms.flinkmf.com/", wsdlLocation = "http://192.168.11.189:10101/mfbms-app-web/webservice/LoanService?wsdl")
public class LoanServiceService
    extends Service
{

    private final static URL LOANSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException LOANSERVICESERVICE_EXCEPTION;
    private final static QName LOANSERVICESERVICE_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "LoanServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.11.189:10101/mfbms-app-web/webservice/LoanService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LOANSERVICESERVICE_WSDL_LOCATION = url;
        LOANSERVICESERVICE_EXCEPTION = e;
    }

    public LoanServiceService() {
        super(__getWsdlLocation(), LOANSERVICESERVICE_QNAME);
    }

    public LoanServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), LOANSERVICESERVICE_QNAME, features);
    }

    public LoanServiceService(URL wsdlLocation) {
        super(wsdlLocation, LOANSERVICESERVICE_QNAME);
    }

    public LoanServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LOANSERVICESERVICE_QNAME, features);
    }

    public LoanServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LoanServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LoanService
     */
    @WebEndpoint(name = "LoanServicePort")
    public LoanService getLoanServicePort() {
        return super.getPort(new QName("http://webservice.loan.mfbms.flinkmf.com/", "LoanServicePort"), LoanService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LoanService
     */
    @WebEndpoint(name = "LoanServicePort")
    public LoanService getLoanServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.loan.mfbms.flinkmf.com/", "LoanServicePort"), LoanService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LOANSERVICESERVICE_EXCEPTION!= null) {
            throw LOANSERVICESERVICE_EXCEPTION;
        }
        return LOANSERVICESERVICE_WSDL_LOCATION;
    }

}
