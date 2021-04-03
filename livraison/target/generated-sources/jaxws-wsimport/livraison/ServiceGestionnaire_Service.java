
package livraison;

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
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServiceGestionnaire", targetNamespace = "http://gestionnaire/", wsdlLocation = "http://localhost:9991/ws/ServiceGestionnaire?wsdl")
public class ServiceGestionnaire_Service
    extends Service
{

    private final static URL SERVICEGESTIONNAIRE_WSDL_LOCATION;
    private final static WebServiceException SERVICEGESTIONNAIRE_EXCEPTION;
    private final static QName SERVICEGESTIONNAIRE_QNAME = new QName("http://gestionnaire/", "ServiceGestionnaire");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9991/ws/ServiceGestionnaire?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICEGESTIONNAIRE_WSDL_LOCATION = url;
        SERVICEGESTIONNAIRE_EXCEPTION = e;
    }

    public ServiceGestionnaire_Service() {
        super(__getWsdlLocation(), SERVICEGESTIONNAIRE_QNAME);
    }

    public ServiceGestionnaire_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICEGESTIONNAIRE_QNAME, features);
    }

    public ServiceGestionnaire_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICEGESTIONNAIRE_QNAME);
    }

    public ServiceGestionnaire_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICEGESTIONNAIRE_QNAME, features);
    }

    public ServiceGestionnaire_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceGestionnaire_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceGestionnaire
     */
    @WebEndpoint(name = "GestionnairePort")
    public ServiceGestionnaire getGestionnairePort() {
        return super.getPort(new QName("http://gestionnaire/", "GestionnairePort"), ServiceGestionnaire.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceGestionnaire
     */
    @WebEndpoint(name = "GestionnairePort")
    public ServiceGestionnaire getGestionnairePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://gestionnaire/", "GestionnairePort"), ServiceGestionnaire.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICEGESTIONNAIRE_EXCEPTION!= null) {
            throw SERVICEGESTIONNAIRE_EXCEPTION;
        }
        return SERVICEGESTIONNAIRE_WSDL_LOCATION;
    }

}