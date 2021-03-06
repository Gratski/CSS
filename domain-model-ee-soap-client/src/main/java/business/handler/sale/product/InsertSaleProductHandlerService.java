
package business.handler.sale.product;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "InsertSaleProductHandlerService", targetNamespace = "http://product.sale.handler.business/", wsdlLocation = "http://localhost:8080/domain-model-ee-business/InsertSaleProductHandler?wsdl")
public class InsertSaleProductHandlerService
    extends Service
{

    private final static URL INSERTSALEPRODUCTHANDLERSERVICE_WSDL_LOCATION;
    private final static WebServiceException INSERTSALEPRODUCTHANDLERSERVICE_EXCEPTION;
    private final static QName INSERTSALEPRODUCTHANDLERSERVICE_QNAME = new QName("http://product.sale.handler.business/", "InsertSaleProductHandlerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/domain-model-ee-business/InsertSaleProductHandler?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INSERTSALEPRODUCTHANDLERSERVICE_WSDL_LOCATION = url;
        INSERTSALEPRODUCTHANDLERSERVICE_EXCEPTION = e;
    }

    public InsertSaleProductHandlerService() {
        super(__getWsdlLocation(), INSERTSALEPRODUCTHANDLERSERVICE_QNAME);
    }

    public InsertSaleProductHandlerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), INSERTSALEPRODUCTHANDLERSERVICE_QNAME, features);
    }

    public InsertSaleProductHandlerService(URL wsdlLocation) {
        super(wsdlLocation, INSERTSALEPRODUCTHANDLERSERVICE_QNAME);
    }

    public InsertSaleProductHandlerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INSERTSALEPRODUCTHANDLERSERVICE_QNAME, features);
    }

    public InsertSaleProductHandlerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InsertSaleProductHandlerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns InsertSaleProductHandler
     */
    @WebEndpoint(name = "InsertSaleProductHandlerPort")
    public InsertSaleProductHandler getInsertSaleProductHandlerPort() {
        return super.getPort(new QName("http://product.sale.handler.business/", "InsertSaleProductHandlerPort"), InsertSaleProductHandler.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InsertSaleProductHandler
     */
    @WebEndpoint(name = "InsertSaleProductHandlerPort")
    public InsertSaleProductHandler getInsertSaleProductHandlerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://product.sale.handler.business/", "InsertSaleProductHandlerPort"), InsertSaleProductHandler.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INSERTSALEPRODUCTHANDLERSERVICE_EXCEPTION!= null) {
            throw INSERTSALEPRODUCTHANDLERSERVICE_EXCEPTION;
        }
        return INSERTSALEPRODUCTHANDLERSERVICE_WSDL_LOCATION;
    }

}
