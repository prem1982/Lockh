
package gov.gsa.fas.services.order.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import gov.gsa.fas.services.messages.v1.CancelOrderRequest;
import gov.gsa.fas.services.messages.v1.CscPORequest;
import gov.gsa.fas.services.messages.v1.CscPOResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "OrderDetails", targetNamespace = "http://fas.gsa.gov/services/Order/v1.0")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface OrderDetails {


    /**
     * 
     * @param parameters
     * @return
     *     returns gov.gsa.fas.services.order.v1.GetOrderDetailsResponse
     * @throws ServiceFault
     */
    @WebMethod(operationName = "GetOrderDetails", action = "http://fas.gsa.gov/services/Order/v1.0/GetOrder")
    @WebResult(name = "GetOrderDetailsResponse", targetNamespace = "http://fas.gsa.gov/services/Order/v1.0", partName = "parameters")
    public GetOrderDetailsResponse getOrderDetails(
        @WebParam(name = "GetOrderDetailsRequest", targetNamespace = "http://fas.gsa.gov/services/Order/v1.0", partName = "parameters")
        GetOrderDetailsRequest parameters)
        throws ServiceFault
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns gov.gsa.fas.services.order.v1.GetOrderSessionResponse
     * @throws ServiceFault
     */
    @WebMethod(operationName = "GetOrderSession", action = "http://fas.gsa.gov/services/Order/v1.0/GetOrderSession")
    @WebResult(name = "GetOrderSessionResponse", targetNamespace = "http://fas.gsa.gov/services/Order/v1.0", partName = "parameters")
    public GetOrderSessionResponse getOrderSession(
        @WebParam(name = "GetOrderSessionRequest", targetNamespace = "http://fas.gsa.gov/services/Order/v1.0", partName = "parameters")
        GetOrderSessionRequest parameters)
        throws ServiceFault
    ;

    /**
     * 
     * @param orderItem
     * @return
     *     returns boolean
     * @throws ServiceFault
     */
    @WebMethod(action = "http://fas.gsa.gov/services/Order/v1.0/CancelOrder")
    @WebResult(name = "CancelOrderResponse", targetNamespace = "http://fas.gsa.gov/services/Order/v1.0", partName = "isCancelled")
    public boolean cancelOrder(
        @WebParam(name = "CancelOrderRequest", targetNamespace = "http://fas.gsa.gov/services/Order/v1.0", partName = "orderItem")
        CancelOrderRequest orderItem)
        throws ServiceFault
    ;

    /**
     * 
     * @param poDetailsRequest
     * @return
     *     returns gov.gsa.fas.services.messages.v1.CscPOResponse
     * @throws ServiceFault
     */
    @WebMethod(action = "http://fas.gsa.gov/services/Order/v1.0/getPODetails")
    @WebResult(name = "GetPODetailsResponse", targetNamespace = "http://fas.gsa.gov/services/Order/v1.0", partName = "poDetailsResponse")
    public CscPOResponse getPODetails(
        @WebParam(name = "GetPODetailsRequest", targetNamespace = "http://fas.gsa.gov/services/Order/v1.0", partName = "poDetailsRequest")
        CscPORequest poDetailsRequest)
        throws ServiceFault
    ;

}