
package gov.gsa.fas.services.discrepancyoutcome.v1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "OrderDiscrepancyOutcome", targetNamespace = "http://fas.gsa.gov/services/DiscrepancyOutcome/v1.0", wsdlLocation = "file:/C:/Users/premanandpeddachetty/workspace/VisionDLA/resources/wsdl/OrderDiscrepancyOutcome.wsdl")
public class OrderDiscrepancyOutcome_Service
    extends Service
{

    private final static URL ORDERDISCREPANCYOUTCOME_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(gov.gsa.fas.services.discrepancyoutcome.v1.OrderDiscrepancyOutcome_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = gov.gsa.fas.services.discrepancyoutcome.v1.OrderDiscrepancyOutcome_Service.class.getResource(".");
            url = new URL(baseUrl, "file:/C:/Users/premanandpeddachetty/workspace/VisionDLA/resources/wsdl/OrderDiscrepancyOutcome.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/Users/premanandpeddachetty/workspace/VisionDLA/resources/wsdl/OrderDiscrepancyOutcome.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        ORDERDISCREPANCYOUTCOME_WSDL_LOCATION = url;
    }

    public OrderDiscrepancyOutcome_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrderDiscrepancyOutcome_Service() {
        super(ORDERDISCREPANCYOUTCOME_WSDL_LOCATION, new QName("http://fas.gsa.gov/services/DiscrepancyOutcome/v1.0", "OrderDiscrepancyOutcome"));
    }

    /**
     * 
     * @return
     *     returns OrderDiscrepancyOutcome
     */
    @WebEndpoint(name = "OrderDiscrepancyOutcomeBinding")
    public OrderDiscrepancyOutcome getOrderDiscrepancyOutcomeBinding() {
        return super.getPort(new QName("http://fas.gsa.gov/services/DiscrepancyOutcome/v1.0", "OrderDiscrepancyOutcomeBinding"), OrderDiscrepancyOutcome.class);
    }

}
