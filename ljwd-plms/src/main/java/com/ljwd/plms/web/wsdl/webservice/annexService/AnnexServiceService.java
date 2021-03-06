
package com.ljwd.plms.web.wsdl.webservice.annexService;

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
 */
@WebServiceClient(name = "AnnexServiceService", targetNamespace = "http://webservice.annex.mfbms.flinkmf.com/", wsdlLocation = "http://192.168.10.188:10101/mfbms-app-web/webservice/AnnexService?wsdl")
public class AnnexServiceService extends Service {

    private final static URL ANNEXSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException ANNEXSERVICESERVICE_EXCEPTION;
    private final static QName ANNEXSERVICESERVICE_QNAME = new QName("http://webservice.annex.mfbms.flinkmf.com/", "AnnexServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.10.188:10101/mfbms-app-web/webservice/AnnexService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ANNEXSERVICESERVICE_WSDL_LOCATION = url;
        ANNEXSERVICESERVICE_EXCEPTION = e;
    }

    public AnnexServiceService() {
        super(__getWsdlLocation(), ANNEXSERVICESERVICE_QNAME);
    }

    public AnnexServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ANNEXSERVICESERVICE_QNAME, features);
    }

    public AnnexServiceService(URL wsdlLocation) {
        super(wsdlLocation, ANNEXSERVICESERVICE_QNAME);
    }

    public AnnexServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ANNEXSERVICESERVICE_QNAME, features);
    }

    public AnnexServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AnnexServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * @return
     *     returns AnnexService
     */
    @WebEndpoint(name = "AnnexServicePort")
    public AnnexService getAnnexServicePort() {
        return super.getPort(new QName("http://webservice.annex.mfbms.flinkmf.com/", "AnnexServicePort"), AnnexService.class);
    }

    /**
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AnnexService
     */
    @WebEndpoint(name = "AnnexServicePort")
    public AnnexService getAnnexServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.annex.mfbms.flinkmf.com/", "AnnexServicePort"), AnnexService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ANNEXSERVICESERVICE_EXCEPTION!= null) {
            throw ANNEXSERVICESERVICE_EXCEPTION;
        }
        return ANNEXSERVICESERVICE_WSDL_LOCATION;
    }

}
