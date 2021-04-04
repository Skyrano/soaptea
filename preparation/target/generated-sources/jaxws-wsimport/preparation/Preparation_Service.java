
package preparation;

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
@WebServiceClient(name = "preparation", targetNamespace = "http://impl.server/", wsdlLocation = "http://localhost:9991/ws/preparation?wsdl")
public class Preparation_Service
    extends Service
{

    private final static URL PREPARATION_WSDL_LOCATION;
    private final static WebServiceException PREPARATION_EXCEPTION;
    private final static QName PREPARATION_QNAME = new QName("http://impl.server/", "preparation");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9991/ws/preparation?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PREPARATION_WSDL_LOCATION = url;
        PREPARATION_EXCEPTION = e;
    }

    public Preparation_Service() {
        super(__getWsdlLocation(), PREPARATION_QNAME);
    }

    public Preparation_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PREPARATION_QNAME, features);
    }

    public Preparation_Service(URL wsdlLocation) {
        super(wsdlLocation, PREPARATION_QNAME);
    }

    public Preparation_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PREPARATION_QNAME, features);
    }

    public Preparation_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Preparation_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Preparation
     */
    @WebEndpoint(name = "preparationPort")
    public Preparation getPreparationPort() {
        return super.getPort(new QName("http://impl.server/", "preparationPort"), Preparation.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Preparation
     */
    @WebEndpoint(name = "preparationPort")
    public Preparation getPreparationPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.server/", "preparationPort"), Preparation.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PREPARATION_EXCEPTION!= null) {
            throw PREPARATION_EXCEPTION;
        }
        return PREPARATION_WSDL_LOCATION;
    }

}
