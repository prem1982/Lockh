
package gov.gsa.fas.vision.dla.sf.login;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "Soap", targetNamespace = "urn:partner.soap.sforce.com")
public interface Soap {


    /**
     * Login to the Salesforce.com SOAP Api
     * 
     * @param username
     * @param password
     * @return
     *     returns gov.gsa.fas.vision.dla.sf.login.LoginResult
     * @throws UnexpectedErrorFault_Exception
     * @throws InvalidIdFault_Exception
     * @throws LoginFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "login", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.LoginResponse")
    public LoginResult login(
        @WebParam(name = "username", targetNamespace = "urn:partner.soap.sforce.com")
        String username,
        @WebParam(name = "password", targetNamespace = "urn:partner.soap.sforce.com")
        String password)
        throws InvalidIdFault_Exception, LoginFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Describe an sObject
     * 
     * @param sObjectType
     * @return
     *     returns gov.gsa.fas.vision.dla.sf.login.DescribeSObjectResult
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeSObject", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.DescribeSObject")
    @ResponseWrapper(localName = "describeSObjectResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.DescribeSObjectResponse")
    public DescribeSObjectResult describeSObject(
        @WebParam(name = "sObjectType", targetNamespace = "urn:partner.soap.sforce.com")
        String sObjectType)
        throws InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Describe a number sObjects
     * 
     * @param sObjectType
     * @return
     *     returns java.util.List<gov.gsa.fas.vision.dla.sf.login.DescribeSObjectResult>
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeSObjects", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.DescribeSObjects")
    @ResponseWrapper(localName = "describeSObjectsResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.DescribeSObjectsResponse")
    public List<DescribeSObjectResult> describeSObjects(
        @WebParam(name = "sObjectType", targetNamespace = "urn:partner.soap.sforce.com")
        List<String> sObjectType)
        throws InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Describe the Global state
     * 
     * @return
     *     returns gov.gsa.fas.vision.dla.sf.login.DescribeGlobalResult
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeGlobal", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.DescribeGlobal")
    @ResponseWrapper(localName = "describeGlobalResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.DescribeGlobalResponse")
    public DescribeGlobalResult describeGlobal()
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Describe all the data category groups available for a given set of types
     * 
     * @param sObjectType
     * @return
     *     returns java.util.List<gov.gsa.fas.vision.dla.sf.login.DescribeDataCategoryGroupResult>
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeDataCategoryGroups", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.DescribeDataCategoryGroups")
    @ResponseWrapper(localName = "describeDataCategoryGroupsResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.DescribeDataCategoryGroupsResponse")
    public List<DescribeDataCategoryGroupResult> describeDataCategoryGroups(
        @WebParam(name = "sObjectType", targetNamespace = "urn:partner.soap.sforce.com")
        List<String> sObjectType)
        throws InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Describe the data category group structures for a given set of pair of types and data category group name
     * 
     * @param pairs
     * @param topCategoriesOnly
     * @return
     *     returns java.util.List<gov.gsa.fas.vision.dla.sf.login.DescribeDataCategoryGroupStructureResult>
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeDataCategoryGroupStructures", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.DescribeDataCategoryGroupStructures")
    @ResponseWrapper(localName = "describeDataCategoryGroupStructuresResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.DescribeDataCategoryGroupStructuresResponse")
    public List<DescribeDataCategoryGroupStructureResult> describeDataCategoryGroupStructures(
        @WebParam(name = "pairs", targetNamespace = "urn:partner.soap.sforce.com")
        List<DataCategoryGroupSobjectTypePair> pairs,
        @WebParam(name = "topCategoriesOnly", targetNamespace = "urn:partner.soap.sforce.com")
        boolean topCategoriesOnly)
        throws InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Describe the layout of the given sObject or the given actionable global page.
     * 
     * @param parameters
     * @return
     *     returns gov.gsa.fas.vision.dla.sf.login.DescribeLayoutResponse
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     * @throws InvalidIdFault_Exception
     */
    @WebMethod
    @WebResult(name = "describeLayoutResponse", targetNamespace = "urn:partner.soap.sforce.com", partName = "parameters")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public DescribeLayoutResponse describeLayout(
        @WebParam(name = "describeLayoutElem", targetNamespace = "urn:partner.soap.sforce.com", partName = "parameters")
        DescribeLayoutElem parameters)
        throws InvalidIdFault_Exception, InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Describe the layout of the SoftPhone
     * 
     * @return
     *     returns gov.gsa.fas.vision.dla.sf.login.DescribeSoftphoneLayoutResult
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeSoftphoneLayout", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.DescribeSoftphoneLayout")
    @ResponseWrapper(localName = "describeSoftphoneLayoutResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.DescribeSoftphoneLayoutResponse")
    public DescribeSoftphoneLayoutResult describeSoftphoneLayout()
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Describe the search view of an sObject
     * 
     * @param sObjectType
     * @return
     *     returns java.util.List<gov.gsa.fas.vision.dla.sf.login.DescribeSearchLayoutResult>
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeSearchLayouts", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.DescribeSearchLayouts")
    @ResponseWrapper(localName = "describeSearchLayoutsResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.DescribeSearchLayoutsResponse")
    public List<DescribeSearchLayoutResult> describeSearchLayouts(
        @WebParam(name = "sObjectType", targetNamespace = "urn:partner.soap.sforce.com")
        List<String> sObjectType)
        throws InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Describe a list of objects representing the order and scope of objects on a users search result page
     * 
     * @return
     *     returns java.util.List<gov.gsa.fas.vision.dla.sf.login.DescribeSearchScopeOrderResult>
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeSearchScopeOrder", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.DescribeSearchScopeOrder")
    @ResponseWrapper(localName = "describeSearchScopeOrderResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.DescribeSearchScopeOrderResponse")
    public List<DescribeSearchScopeOrderResult> describeSearchScopeOrder();

    /**
     * Describe the tabs that appear on a users page
     * 
     * @return
     *     returns java.util.List<gov.gsa.fas.vision.dla.sf.login.DescribeTabSetResult>
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeTabs", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.DescribeTabs")
    @ResponseWrapper(localName = "describeTabsResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.DescribeTabsResponse")
    public List<DescribeTabSetResult> describeTabs()
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Create a set of new sObjects
     * 
     * @param sObjects
     * @return
     *     returns java.util.List<gov.gsa.fas.vision.dla.sf.login.SaveResult>
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     * @throws InvalidFieldFault_Exception
     * @throws InvalidIdFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "create", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.Create")
    @ResponseWrapper(localName = "createResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.CreateResponse")
    public List<SaveResult> create(
        @WebParam(name = "sObjects", targetNamespace = "urn:partner.soap.sforce.com")
        List<SObject> sObjects)
        throws InvalidFieldFault_Exception, InvalidIdFault_Exception, InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Update a set of sObjects
     * 
     * @param sObjects
     * @return
     *     returns java.util.List<gov.gsa.fas.vision.dla.sf.login.SaveResult>
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     * @throws InvalidFieldFault_Exception
     * @throws InvalidIdFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "update", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.Update")
    @ResponseWrapper(localName = "updateResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.UpdateResponse")
    public List<SaveResult> update(
        @WebParam(name = "sObjects", targetNamespace = "urn:partner.soap.sforce.com")
        List<SObject> sObjects)
        throws InvalidFieldFault_Exception, InvalidIdFault_Exception, InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Update or insert a set of sObjects based on object id
     * 
     * @param externalIDFieldName
     * @param sObjects
     * @return
     *     returns java.util.List<gov.gsa.fas.vision.dla.sf.login.UpsertResult>
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     * @throws InvalidFieldFault_Exception
     * @throws InvalidIdFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "upsert", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.Upsert")
    @ResponseWrapper(localName = "upsertResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.UpsertResponse")
    public List<UpsertResult> upsert(
        @WebParam(name = "externalIDFieldName", targetNamespace = "urn:partner.soap.sforce.com")
        String externalIDFieldName,
        @WebParam(name = "sObjects", targetNamespace = "urn:partner.soap.sforce.com")
        List<SObject> sObjects)
        throws InvalidFieldFault_Exception, InvalidIdFault_Exception, InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Merge and update a set of sObjects based on object id
     * 
     * @param request
     * @return
     *     returns java.util.List<gov.gsa.fas.vision.dla.sf.login.MergeResult>
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     * @throws InvalidFieldFault_Exception
     * @throws InvalidIdFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "merge", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.Merge")
    @ResponseWrapper(localName = "mergeResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.MergeResponse")
    public List<MergeResult> merge(
        @WebParam(name = "request", targetNamespace = "urn:partner.soap.sforce.com")
        List<MergeRequest> request)
        throws InvalidFieldFault_Exception, InvalidIdFault_Exception, InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Delete a set of sObjects
     * 
     * @param ids
     * @return
     *     returns java.util.List<gov.gsa.fas.vision.dla.sf.login.DeleteResult>
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "delete", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.DeleteResponse")
    public List<DeleteResult> delete(
        @WebParam(name = "ids", targetNamespace = "urn:partner.soap.sforce.com")
        List<ID> ids)
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Undelete a set of sObjects
     * 
     * @param ids
     * @return
     *     returns java.util.List<gov.gsa.fas.vision.dla.sf.login.UndeleteResult>
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "undelete", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.Undelete")
    @ResponseWrapper(localName = "undeleteResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.UndeleteResponse")
    public List<UndeleteResult> undelete(
        @WebParam(name = "ids", targetNamespace = "urn:partner.soap.sforce.com")
        List<ID> ids)
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Empty a set of sObjects from the recycle bin
     * 
     * @param ids
     * @return
     *     returns java.util.List<gov.gsa.fas.vision.dla.sf.login.EmptyRecycleBinResult>
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "emptyRecycleBin", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.EmptyRecycleBin")
    @ResponseWrapper(localName = "emptyRecycleBinResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.EmptyRecycleBinResponse")
    public List<EmptyRecycleBinResult> emptyRecycleBin(
        @WebParam(name = "ids", targetNamespace = "urn:partner.soap.sforce.com")
        List<ID> ids)
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Get a set of sObjects
     * 
     * @param fieldList
     * @param sObjectType
     * @param ids
     * @return
     *     returns java.util.List<gov.gsa.fas.vision.dla.sf.login.SObject>
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     * @throws MalformedQueryFault_Exception
     * @throws InvalidFieldFault_Exception
     * @throws InvalidIdFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "retrieve", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.Retrieve")
    @ResponseWrapper(localName = "retrieveResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.RetrieveResponse")
    public List<SObject> retrieve(
        @WebParam(name = "fieldList", targetNamespace = "urn:partner.soap.sforce.com")
        String fieldList,
        @WebParam(name = "sObjectType", targetNamespace = "urn:partner.soap.sforce.com")
        String sObjectType,
        @WebParam(name = "ids", targetNamespace = "urn:partner.soap.sforce.com")
        List<ID> ids)
        throws InvalidFieldFault_Exception, InvalidIdFault_Exception, InvalidSObjectFault_Exception, MalformedQueryFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Submit an entity to a workflow process or process a workitem
     * 
     * @param actions
     * @return
     *     returns java.util.List<gov.gsa.fas.vision.dla.sf.login.ProcessResult>
     * @throws UnexpectedErrorFault_Exception
     * @throws InvalidIdFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "process", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.Process")
    @ResponseWrapper(localName = "processResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.ProcessResponse")
    public List<ProcessResult> process(
        @WebParam(name = "actions", targetNamespace = "urn:partner.soap.sforce.com")
        List<ProcessRequest> actions)
        throws InvalidIdFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * convert a set of leads
     * 
     * @param leadConverts
     * @return
     *     returns java.util.List<gov.gsa.fas.vision.dla.sf.login.LeadConvertResult>
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "convertLead", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.ConvertLead")
    @ResponseWrapper(localName = "convertLeadResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.ConvertLeadResponse")
    public List<LeadConvertResult> convertLead(
        @WebParam(name = "leadConverts", targetNamespace = "urn:partner.soap.sforce.com")
        List<LeadConvert> leadConverts)
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Logout the current user, invalidating the current session.
     * 
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "logout", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.Logout")
    @ResponseWrapper(localName = "logoutResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.LogoutResponse")
    public void logout()
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Logs out and invalidates session ids
     * 
     * @param sessionIds
     * @return
     *     returns java.util.List<gov.gsa.fas.vision.dla.sf.login.InvalidateSessionsResult>
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "invalidateSessions", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.InvalidateSessions")
    @ResponseWrapper(localName = "invalidateSessionsResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.InvalidateSessionsResponse")
    public List<InvalidateSessionsResult> invalidateSessions(
        @WebParam(name = "sessionIds", targetNamespace = "urn:partner.soap.sforce.com")
        List<String> sessionIds)
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Get the IDs for deleted sObjects
     * 
     * @param startDate
     * @param sObjectType
     * @param endDate
     * @return
     *     returns gov.gsa.fas.vision.dla.sf.login.GetDeletedResult
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "getDeleted", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.GetDeleted")
    @ResponseWrapper(localName = "getDeletedResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.GetDeletedResponse")
    public GetDeletedResult getDeleted(
        @WebParam(name = "sObjectType", targetNamespace = "urn:partner.soap.sforce.com")
        String sObjectType,
        @WebParam(name = "startDate", targetNamespace = "urn:partner.soap.sforce.com")
        XMLGregorianCalendar startDate,
        @WebParam(name = "endDate", targetNamespace = "urn:partner.soap.sforce.com")
        XMLGregorianCalendar endDate)
        throws InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Get the IDs for updated sObjects
     * 
     * @param startDate
     * @param sObjectType
     * @param endDate
     * @return
     *     returns gov.gsa.fas.vision.dla.sf.login.GetUpdatedResult
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "getUpdated", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.GetUpdated")
    @ResponseWrapper(localName = "getUpdatedResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.GetUpdatedResponse")
    public GetUpdatedResult getUpdated(
        @WebParam(name = "sObjectType", targetNamespace = "urn:partner.soap.sforce.com")
        String sObjectType,
        @WebParam(name = "startDate", targetNamespace = "urn:partner.soap.sforce.com")
        XMLGregorianCalendar startDate,
        @WebParam(name = "endDate", targetNamespace = "urn:partner.soap.sforce.com")
        XMLGregorianCalendar endDate)
        throws InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Create a Query Cursor
     * 
     * @param queryString
     * @return
     *     returns gov.gsa.fas.vision.dla.sf.login.QueryResult
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     * @throws MalformedQueryFault_Exception
     * @throws InvalidFieldFault_Exception
     * @throws InvalidIdFault_Exception
     * @throws InvalidQueryLocatorFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "query", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.Query")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.QueryResponse")
    public QueryResult query(
        @WebParam(name = "queryString", targetNamespace = "urn:partner.soap.sforce.com")
        String queryString)
        throws InvalidFieldFault_Exception, InvalidIdFault_Exception, InvalidQueryLocatorFault_Exception, InvalidSObjectFault_Exception, MalformedQueryFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Create a Query Cursor, including deleted sObjects
     * 
     * @param queryString
     * @return
     *     returns gov.gsa.fas.vision.dla.sf.login.QueryResult
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     * @throws MalformedQueryFault_Exception
     * @throws InvalidFieldFault_Exception
     * @throws InvalidIdFault_Exception
     * @throws InvalidQueryLocatorFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "queryAll", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.QueryAll")
    @ResponseWrapper(localName = "queryAllResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.QueryAllResponse")
    public QueryResult queryAll(
        @WebParam(name = "queryString", targetNamespace = "urn:partner.soap.sforce.com")
        String queryString)
        throws InvalidFieldFault_Exception, InvalidIdFault_Exception, InvalidQueryLocatorFault_Exception, InvalidSObjectFault_Exception, MalformedQueryFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Gets the next batch of sObjects from a query
     * 
     * @param queryLocator
     * @return
     *     returns gov.gsa.fas.vision.dla.sf.login.QueryResult
     * @throws UnexpectedErrorFault_Exception
     * @throws MalformedQueryFault_Exception
     * @throws InvalidFieldFault_Exception
     * @throws InvalidQueryLocatorFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "queryMore", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.QueryMore")
    @ResponseWrapper(localName = "queryMoreResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.QueryMoreResponse")
    public QueryResult queryMore(
        @WebParam(name = "queryLocator", targetNamespace = "urn:partner.soap.sforce.com")
        QueryLocator queryLocator)
        throws InvalidFieldFault_Exception, InvalidQueryLocatorFault_Exception, MalformedQueryFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Search for sObjects
     * 
     * @param searchString
     * @return
     *     returns gov.gsa.fas.vision.dla.sf.login.SearchResult
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     * @throws InvalidFieldFault_Exception
     * @throws MalformedSearchFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "search", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.Search")
    @ResponseWrapper(localName = "searchResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.SearchResponse")
    public SearchResult search(
        @WebParam(name = "searchString", targetNamespace = "urn:partner.soap.sforce.com")
        String searchString)
        throws InvalidFieldFault_Exception, InvalidSObjectFault_Exception, MalformedSearchFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Gets server timestamp
     * 
     * @return
     *     returns gov.gsa.fas.vision.dla.sf.login.GetServerTimestampResult
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "getServerTimestamp", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.GetServerTimestamp")
    @ResponseWrapper(localName = "getServerTimestampResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.GetServerTimestampResponse")
    public GetServerTimestampResult getServerTimestamp()
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Set a user's password
     * 
     * @param userId
     * @param password
     * @return
     *     returns gov.gsa.fas.vision.dla.sf.login.SetPasswordResult
     * @throws UnexpectedErrorFault_Exception
     * @throws InvalidNewPasswordFault_Exception
     * @throws InvalidIdFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "setPassword", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.SetPassword")
    @ResponseWrapper(localName = "setPasswordResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.SetPasswordResponse")
    public SetPasswordResult setPassword(
        @WebParam(name = "userId", targetNamespace = "urn:partner.soap.sforce.com")
        ID userId,
        @WebParam(name = "password", targetNamespace = "urn:partner.soap.sforce.com")
        String password)
        throws InvalidIdFault_Exception, InvalidNewPasswordFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Reset a user's password
     * 
     * @param userId
     * @return
     *     returns gov.gsa.fas.vision.dla.sf.login.ResetPasswordResult
     * @throws UnexpectedErrorFault_Exception
     * @throws InvalidIdFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "resetPassword", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.ResetPassword")
    @ResponseWrapper(localName = "resetPasswordResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.ResetPasswordResponse")
    public ResetPasswordResult resetPassword(
        @WebParam(name = "userId", targetNamespace = "urn:partner.soap.sforce.com")
        ID userId)
        throws InvalidIdFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Returns standard information relevant to the current user
     * 
     * @return
     *     returns gov.gsa.fas.vision.dla.sf.login.GetUserInfoResult
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "getUserInfo", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.GetUserInfo")
    @ResponseWrapper(localName = "getUserInfoResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.GetUserInfoResponse")
    public GetUserInfoResult getUserInfo()
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Send existing draft EmailMessage
     * 
     * @param ids
     * @return
     *     returns java.util.List<gov.gsa.fas.vision.dla.sf.login.SendEmailResult>
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "sendEmailMessage", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.SendEmailMessage")
    @ResponseWrapper(localName = "sendEmailMessageResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.SendEmailMessageResponse")
    public List<SendEmailResult> sendEmailMessage(
        @WebParam(name = "ids", targetNamespace = "urn:partner.soap.sforce.com")
        List<ID> ids)
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Send outbound email
     * 
     * @param messages
     * @return
     *     returns java.util.List<gov.gsa.fas.vision.dla.sf.login.SendEmailResult>
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "sendEmail", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.SendEmail")
    @ResponseWrapper(localName = "sendEmailResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.SendEmailResponse")
    public List<SendEmailResult> sendEmail(
        @WebParam(name = "messages", targetNamespace = "urn:partner.soap.sforce.com")
        List<Email> messages)
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Perform a series of predefined actions such as quick create or log a task
     * 
     * @param quickActions
     * @return
     *     returns java.util.List<gov.gsa.fas.vision.dla.sf.login.PerformQuickActionResult>
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "performQuickActions", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.PerformQuickActions")
    @ResponseWrapper(localName = "performQuickActionsResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.PerformQuickActionsResponse")
    public List<PerformQuickActionResult> performQuickActions(
        @WebParam(name = "quickActions", targetNamespace = "urn:partner.soap.sforce.com")
        List<PerformQuickActionRequest> quickActions);

    /**
     * Describe the details of a series of quick actions
     * 
     * @param quickActions
     * @return
     *     returns java.util.List<gov.gsa.fas.vision.dla.sf.login.DescribeQuickActionResult>
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeQuickActions", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.DescribeQuickActions")
    @ResponseWrapper(localName = "describeQuickActionsResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.DescribeQuickActionsResponse")
    public List<DescribeQuickActionResult> describeQuickActions(
        @WebParam(name = "quickActions", targetNamespace = "urn:partner.soap.sforce.com")
        List<String> quickActions);

    /**
     * Describe the details of a series of quick actions available for the given parentType
     * 
     * @param parentType
     * @return
     *     returns java.util.List<gov.gsa.fas.vision.dla.sf.login.DescribeAvailableQuickActionResult>
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeAvailableQuickActions", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.DescribeAvailableQuickActions")
    @ResponseWrapper(localName = "describeAvailableQuickActionsResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "gov.gsa.fas.vision.dla.sf.login.DescribeAvailableQuickActionsResponse")
    public List<DescribeAvailableQuickActionResult> describeAvailableQuickActions(
        @WebParam(name = "parentType", targetNamespace = "urn:partner.soap.sforce.com")
        String parentType);

}
