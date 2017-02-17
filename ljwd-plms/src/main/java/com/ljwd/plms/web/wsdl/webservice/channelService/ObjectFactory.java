
package com.ljwd.plms.web.wsdl.webservice.channelService;

import com.ljwd.plms.web.wsdl.webservice.Login;
import com.ljwd.plms.web.wsdl.webservice.LoginResponse;
import com.ljwd.plms.web.wsdl.webservice.exception.ErrorInfo;
import com.ljwd.plms.web.wsdl.webservice.exception.ErrorInfoException;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
* This object contains factory methods for each
* Java content interface and Java element interface
* generated in the com.ljwd.plms.web.wsdl.webservice package.
* <p>An ObjectFactory allows you to programatically
* construct new instances of the Java representation
* for XML content. The Java representation of XML
* content can consist of schema derived interfaces
* and classes representing the binding of schema
* type definitions, element declarations and model
* groups.  Factory methods for each of these are
* provided in this class.
*
*/
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllPaymentType_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "getAllPaymentType");
    private final static QName _SyncOrganization_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "syncOrganization");
    private final static QName _AddBookingsResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "addBookingsResponse");
    private final static QName _SearchReprotUrlByParam_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchReprotUrlByParam");
    private final static QName _CarInfoDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "carInfoDto");
    private final static QName _GetApplicationInfoApplyProgressResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "getApplicationInfoApplyProgressResponse");
    private final static QName _PolicyInfoDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "policyInfoDto");
    private final static QName _BaseEnquiryResultDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "baseEnquiryResultDto");
    private final static QName _ChApplInfoOtherSyncDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "chApplInfoOtherSyncDto");
    private final static QName _GetAllProducts_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "getAllProducts");
    private final static QName _GetApplicationInfoApplyProgress_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "getApplicationInfoApplyProgress");
    private final static QName _CompanyCustomerInfoSearchDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "companyCustomerInfoSearchDto");
    private final static QName _SyncApplicationInfo_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "syncApplicationInfo");
    private final static QName _AppIdNameSearchParamDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "appIdNameSearchParamDto");
    private final static QName _MoonlightApplicationInfoDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "moonlightApplicationInfoDto");
    private final static QName _GetLovListResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "getLovListResponse");
    private final static QName _ChOrganizationDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "chOrganizationDto");
    private final static QName _ChAnnexDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "chAnnexDto");
    private final static QName _LogoutResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "logoutResponse");
    private final static QName _AddAnnex_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "addAnnex");
    private final static QName _Login_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "login");
    private final static QName _AddApplicationInfo_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "addApplicationInfo");
    private final static QName _ChReturnApplInfoSyncDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "chReturnApplInfoSyncDto");
    private final static QName _SyncUserResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "syncUserResponse");
    private final static QName _GetMoonlightLoanStatusResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "getMoonlightLoanStatusResponse");
    private final static QName _PaymentTypeDetailDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "paymentTypeDetailDto");
    private final static QName _SiteSearchParamDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "siteSearchParamDto");
    private final static QName _ProductDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "productDto");
    private final static QName _SearchAdminRegionByParam_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchAdminRegionByParam");
    private final static QName _ApprovalProgressDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "approvalProgressDto");
    private final static QName _ProfessionDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "professionDto");
    private final static QName _SiteDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "siteDto");
    private final static QName _AuthenticateUser_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "authenticateUser");
    private final static QName _ChApplInfoResultDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "chApplInfoResultDto");
    private final static QName _AuthenticateUserResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "authenticateUserResponse");
    private final static QName _SearchProfLevelList_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchProfLevelList");
    private final static QName _ChUserDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "chUserDto");
    private final static QName _SearchProfLevelListResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchProfLevelListResponse");
    private final static QName _SearchUnitNatureList_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchUnitNatureList");
    private final static QName _AddAnnexResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "addAnnexResponse");
    private final static QName _CommonLovDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "commonLovDto");
    private final static QName _SyncApplicationInfoResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "syncApplicationInfoResponse");
    private final static QName _SearchCompanyCustomerInfo_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchCompanyCustomerInfo");
    private final static QName _GetAllProductsResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "getAllProductsResponse");
    private final static QName _AppIdNameSearchResultDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "appIdNameSearchResultDto");
    private final static QName _CompanyCustomerInfoSearchParamDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "companyCustomerInfoSearchParamDto");
    private final static QName _SearchAdminRegionZipListResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchAdminRegionZipListResponse");
    private final static QName _BaseValueDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "baseValueDto");
    private final static QName _SearchAdminRegionAreaListResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchAdminRegionAreaListResponse");
    private final static QName _SearchFuncTypeList_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchFuncTypeList");
    private final static QName _ChDataSyncParamDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "chDataSyncParamDto");
    private final static QName _CustomerDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "customerDto");
    private final static QName _GetAllLoanPeriodResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "getAllLoanPeriodResponse");
    private final static QName _SyncOrganizationResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "syncOrganizationResponse");
    private final static QName _SearchEnterpriseTypeList_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchEnterpriseTypeList");
    private final static QName _SearchAdminRegionProvinceList_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchAdminRegionProvinceList");
    private final static QName _MoonlightLoanStatusDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "moonlightLoanStatusDto");
    private final static QName _CompanyCustomerInfoSearchResultDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "companyCustomerInfoSearchResultDto");
    private final static QName _ChangeUserPassword_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "changeUserPassword");
    private final static QName _SyncUser_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "syncUser");
    private final static QName _SearchSiteRegionMapListResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchSiteRegionMapListResponse");
    private final static QName _SearchEnterpriseTypeListResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchEnterpriseTypeListResponse");
    private final static QName _SearchAdminRegionCityList_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchAdminRegionCityList");
    private final static QName _BaseVersionableCreatorAwareEntityDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "baseVersionableCreatorAwareEntityDto");
    private final static QName _SearchIndustryTypeListResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchIndustryTypeListResponse");
    private final static QName _ChangeUserPasswordResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "changeUserPasswordResponse");
    private final static QName _SearchAdminRegionByParamResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchAdminRegionByParamResponse");
    private final static QName _ChOrganizationListSyncDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "chOrganizationListSyncDto");
    private final static QName _ChApplInfoSyncDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "chApplInfoSyncDto");
    private final static QName _SiteSearchResultDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "siteSearchResultDto");
    private final static QName _SearchUnitNatureListResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchUnitNatureListResponse");
    private final static QName _BaseEnquiryParamDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "baseEnquiryParamDto");
    private final static QName _ErrorInfoException_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "ErrorInfoException");
    private final static QName _SearchAdminRegionProvinceListResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchAdminRegionProvinceListResponse");
    private final static QName _GetMoonlightLoanStatus_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "getMoonlightLoanStatus");
    private final static QName _GetAllPaymentTypeResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "getAllPaymentTypeResponse");
    private final static QName _AddMoonlightApplicationInfoResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "addMoonlightApplicationInfoResponse");
    private final static QName _AddMoonlightApplicationInfo_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "addMoonlightApplicationInfo");
    private final static QName _SearchPwdByUserIDResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchPwdByUserIDResponse");
    private final static QName _ChUserListSyncDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "chUserListSyncDto");
    private final static QName _SearchAdminRegionByNameListResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchAdminRegionByNameListResponse");
    private final static QName _SortField_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "sortField");
    private final static QName _SearchAdminRegionZipList_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchAdminRegionZipList");
    private final static QName _OfferRequestParamDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "offerRequestParamDto");
    private final static QName _SearchSiteRegionMapList_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchSiteRegionMapList");
    private final static QName _HouseInfoDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "houseInfoDto");
    private final static QName _SearchCompanyCustomerInfoResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchCompanyCustomerInfoResponse");
    private final static QName _ChApplInfoParamSyncDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "chApplInfoParamSyncDto");
    private final static QName _GetSiteListOnBranch_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "getSiteListOnBranch");
    private final static QName _ChApplInfoDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "chApplInfoDto");
    private final static QName _BookingDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "bookingDto");
    private final static QName _BaseEntityDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "baseEntityDto");
    private final static QName _SearchFuncTypeListResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchFuncTypeListResponse");
    private final static QName _GetAllLoanPeriod_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "getAllLoanPeriod");
    private final static QName _ChApplInfoListSyncDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "chApplInfoListSyncDto");
    private final static QName _AddApplicationInfoResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "addApplicationInfoResponse");
    private final static QName _SearchAdminRegionByNameList_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchAdminRegionByNameList");
    private final static QName _SearchSiteListResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchSiteListResponse");
    private final static QName _Logout_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "logout");
    private final static QName _MoonlightApplInfoResultDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "moonlightApplInfoResultDto");
    private final static QName _GetIntradayOrderFeedbackResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "getIntradayOrderFeedbackResponse");
    private final static QName _SearchSiteList_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchSiteList");
    private final static QName _SearchAdminRegionAreaList_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchAdminRegionAreaList");
    private final static QName _GetSiteListOnBranchResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "getSiteListOnBranchResponse");
    private final static QName _ChApplInfoStatusSyncDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "chApplInfoStatusSyncDto");
    private final static QName _UserProfileDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "userProfileDto");
    private final static QName _LoginResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "loginResponse");
    private final static QName _SearchIndustryTypeList_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchIndustryTypeList");
    private final static QName _SearchAdminRegionCityListResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchAdminRegionCityListResponse");
    private final static QName _SearchPwdByUserID_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchPwdByUserID");
    private final static QName _SearchReprotUrlByParamResponse_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "searchReprotUrlByParamResponse");
    private final static QName _GetIntradayOrderFeedback_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "getIntradayOrderFeedback");
    private final static QName _OrderFeedbackDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "orderFeedbackDto");
    private final static QName _GetLovList_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "getLovList");
    private final static QName _AccountInfoDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "accountInfoDto");
    private final static QName _BaseCreatorAwareEntityDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "baseCreatorAwareEntityDto");
    private final static QName _ContactorDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "contactorDto");
    private final static QName _SiteRegionMapDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "siteRegionMapDto");
    private final static QName _PaymentTypeDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "paymentTypeDto");
    private final static QName _AddBookings_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "addBookings");
    private final static QName _SiteRegionMapSearchParamDto_QNAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "siteRegionMapSearchParamDto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ljwd.plms.web.wsdl.webservice
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookingDto }
     *
     */
    public BookingDto createBookingDto() {
        return new BookingDto();
    }

    /**
     * Create an instance of {@link ChApplInfoDto }
     *
     */
    public ChApplInfoDto createChApplInfoDto() {
        return new ChApplInfoDto();
    }

    /**
     * Create an instance of {@link GetSiteListOnBranch }
     *
     */
    public GetSiteListOnBranch createGetSiteListOnBranch() {
        return new GetSiteListOnBranch();
    }

    /**
     * Create an instance of {@link HouseInfoDto }
     *
     */
    public HouseInfoDto createHouseInfoDto() {
        return new HouseInfoDto();
    }

    /**
     * Create an instance of {@link ChApplInfoParamSyncDto }
     *
     */
    public ChApplInfoParamSyncDto createChApplInfoParamSyncDto() {
        return new ChApplInfoParamSyncDto();
    }

    /**
     * Create an instance of {@link SearchCompanyCustomerInfoResponse }
     *
     */
    public SearchCompanyCustomerInfoResponse createSearchCompanyCustomerInfoResponse() {
        return new SearchCompanyCustomerInfoResponse();
    }

    /**
     * Create an instance of {@link SortField }
     *
     */
    public SortField createSortField() {
        return new SortField();
    }

    /**
     * Create an instance of {@link SearchAdminRegionZipList }
     *
     */
    public SearchAdminRegionZipList createSearchAdminRegionZipList() {
        return new SearchAdminRegionZipList();
    }

    /**
     * Create an instance of {@link SearchSiteRegionMapList }
     *
     */
    public SearchSiteRegionMapList createSearchSiteRegionMapList() {
        return new SearchSiteRegionMapList();
    }

    /**
     * Create an instance of {@link OfferRequestParamDto }
     *
     */
    public OfferRequestParamDto createOfferRequestParamDto() {
        return new OfferRequestParamDto();
    }

    /**
     * Create an instance of {@link SearchPwdByUserIDResponse }
     *
     */
    public SearchPwdByUserIDResponse createSearchPwdByUserIDResponse() {
        return new SearchPwdByUserIDResponse();
    }

    /**
     * Create an instance of {@link ChUserListSyncDto }
     *
     */
    public ChUserListSyncDto createChUserListSyncDto() {
        return new ChUserListSyncDto();
    }

    /**
     * Create an instance of {@link SearchAdminRegionByNameListResponse }
     *
     */
    public SearchAdminRegionByNameListResponse createSearchAdminRegionByNameListResponse() {
        return new SearchAdminRegionByNameListResponse();
    }

    /**
     * Create an instance of {@link AddMoonlightApplicationInfoResponse }
     *
     */
    public AddMoonlightApplicationInfoResponse createAddMoonlightApplicationInfoResponse() {
        return new AddMoonlightApplicationInfoResponse();
    }

    /**
     * Create an instance of {@link AddMoonlightApplicationInfo }
     *
     */
    public AddMoonlightApplicationInfo createAddMoonlightApplicationInfo() {
        return new AddMoonlightApplicationInfo();
    }

    /**
     * Create an instance of {@link GetAllPaymentTypeResponse }
     *
     */
    public GetAllPaymentTypeResponse createGetAllPaymentTypeResponse() {
        return new GetAllPaymentTypeResponse();
    }

    /**
     * Create an instance of {@link SearchAdminRegionProvinceListResponse }
     *
     */
    public SearchAdminRegionProvinceListResponse createSearchAdminRegionProvinceListResponse() {
        return new SearchAdminRegionProvinceListResponse();
    }

    /**
     * Create an instance of {@link GetMoonlightLoanStatus }
     *
     */
    public GetMoonlightLoanStatus createGetMoonlightLoanStatus() {
        return new GetMoonlightLoanStatus();
    }

    /**
     * Create an instance of {@link SiteSearchResultDto }
     *
     */
    public SiteSearchResultDto createSiteSearchResultDto() {
        return new SiteSearchResultDto();
    }

    /**
     * Create an instance of {@link SearchUnitNatureListResponse }
     *
     */
    public SearchUnitNatureListResponse createSearchUnitNatureListResponse() {
        return new SearchUnitNatureListResponse();
    }

    /**
     *
     */
    public ErrorInfoException createErrorInfoException() {
        return new ErrorInfoException();
    }

    /**
     * Create an instance of {@link ChApplInfoSyncDto }
     *
     */
    public ChApplInfoSyncDto createChApplInfoSyncDto() {
        return new ChApplInfoSyncDto();
    }

    /**
     * Create an instance of {@link ChOrganizationListSyncDto }
     *
     */
    public ChOrganizationListSyncDto createChOrganizationListSyncDto() {
        return new ChOrganizationListSyncDto();
    }

    /**
     * Create an instance of {@link SearchAdminRegionByParamResponse }
     *
     */
    public SearchAdminRegionByParamResponse createSearchAdminRegionByParamResponse() {
        return new SearchAdminRegionByParamResponse();
    }

    /**
     * Create an instance of {@link SearchAdminRegionCityList }
     *
     */
    public SearchAdminRegionCityList createSearchAdminRegionCityList() {
        return new SearchAdminRegionCityList();
    }

    /**
     * Create an instance of {@link SearchIndustryTypeListResponse }
     *
     */
    public SearchIndustryTypeListResponse createSearchIndustryTypeListResponse() {
        return new SearchIndustryTypeListResponse();
    }

    /**
     * Create an instance of {@link ChangeUserPasswordResponse }
     *
     */
    public ChangeUserPasswordResponse createChangeUserPasswordResponse() {
        return new ChangeUserPasswordResponse();
    }

    /**
     * Create an instance of {@link SiteRegionMapSearchParamDto }
     *
     */
    public SiteRegionMapSearchParamDto createSiteRegionMapSearchParamDto() {
        return new SiteRegionMapSearchParamDto();
    }

    /**
     * Create an instance of {@link AddBookings }
     *
     */
    public AddBookings createAddBookings() {
        return new AddBookings();
    }

    /**
     * Create an instance of {@link PaymentTypeDto }
     *
     */
    public PaymentTypeDto createPaymentTypeDto() {
        return new PaymentTypeDto();
    }

    /**
     * Create an instance of {@link SiteRegionMapDto }
     *
     */
    public SiteRegionMapDto createSiteRegionMapDto() {
        return new SiteRegionMapDto();
    }

    /**
     * Create an instance of {@link AccountInfoDto }
     *
     */
    public AccountInfoDto createAccountInfoDto() {
        return new AccountInfoDto();
    }

    /**
     * Create an instance of {@link ContactorDto }
     *
     */
    public ContactorDto createContactorDto() {
        return new ContactorDto();
    }

    /**
     * Create an instance of {@link SearchReprotUrlByParamResponse }
     *
     */
    public SearchReprotUrlByParamResponse createSearchReprotUrlByParamResponse() {
        return new SearchReprotUrlByParamResponse();
    }

    /**
     * Create an instance of {@link SearchPwdByUserID }
     *
     */
    public SearchPwdByUserID createSearchPwdByUserID() {
        return new SearchPwdByUserID();
    }

    /**
     * Create an instance of {@link SearchAdminRegionCityListResponse }
     *
     */
    public SearchAdminRegionCityListResponse createSearchAdminRegionCityListResponse() {
        return new SearchAdminRegionCityListResponse();
    }

    /**
     * Create an instance of {@link GetIntradayOrderFeedback }
     *
     */
    public GetIntradayOrderFeedback createGetIntradayOrderFeedback() {
        return new GetIntradayOrderFeedback();
    }

    /**
     * Create an instance of {@link OrderFeedbackDto }
     *
     */
    public OrderFeedbackDto createOrderFeedbackDto() {
        return new OrderFeedbackDto();
    }

    /**
     * Create an instance of {@link GetLovList }
     *
     */
    public GetLovList createGetLovList() {
        return new GetLovList();
    }

    /**
     * Create an instance of {@link SearchIndustryTypeList }
     *
     */
    public SearchIndustryTypeList createSearchIndustryTypeList() {
        return new SearchIndustryTypeList();
    }

    /**
     * Create an instance of {@link com.ljwd.plms.web.wsdl.webservice.LoginResponse }
     *
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link UserProfileDto }
     *
     */
    public UserProfileDto createUserProfileDto() {
        return new UserProfileDto();
    }

    /**
     * Create an instance of {@link ChApplInfoStatusSyncDto }
     *
     */
    public ChApplInfoStatusSyncDto createChApplInfoStatusSyncDto() {
        return new ChApplInfoStatusSyncDto();
    }

    /**
     * Create an instance of {@link GetIntradayOrderFeedbackResponse }
     *
     */
    public GetIntradayOrderFeedbackResponse createGetIntradayOrderFeedbackResponse() {
        return new GetIntradayOrderFeedbackResponse();
    }

    /**
     * Create an instance of {@link SearchSiteList }
     *
     */
    public SearchSiteList createSearchSiteList() {
        return new SearchSiteList();
    }

    /**
     * Create an instance of {@link SearchAdminRegionAreaList }
     *
     */
    public SearchAdminRegionAreaList createSearchAdminRegionAreaList() {
        return new SearchAdminRegionAreaList();
    }

    /**
     * Create an instance of {@link GetSiteListOnBranchResponse }
     *
     */
    public GetSiteListOnBranchResponse createGetSiteListOnBranchResponse() {
        return new GetSiteListOnBranchResponse();
    }

    /**
     * Create an instance of {@link ChApplInfoListSyncDto }
     *
     */
    public ChApplInfoListSyncDto createChApplInfoListSyncDto() {
        return new ChApplInfoListSyncDto();
    }

    /**
     * Create an instance of {@link AddApplicationInfoResponse }
     *
     */
    public AddApplicationInfoResponse createAddApplicationInfoResponse() {
        return new AddApplicationInfoResponse();
    }

    /**
     * Create an instance of {@link SearchAdminRegionByNameList }
     *
     */
    public SearchAdminRegionByNameList createSearchAdminRegionByNameList() {
        return new SearchAdminRegionByNameList();
    }

    /**
     * Create an instance of {@link SearchSiteListResponse }
     *
     */
    public SearchSiteListResponse createSearchSiteListResponse() {
        return new SearchSiteListResponse();
    }

    /**
     * Create an instance of {@link Logout }
     *
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link MoonlightApplInfoResultDto }
     *
     */
    public MoonlightApplInfoResultDto createMoonlightApplInfoResultDto() {
        return new MoonlightApplInfoResultDto();
    }

    /**
     * Create an instance of {@link SearchFuncTypeListResponse }
     *
     */
    public SearchFuncTypeListResponse createSearchFuncTypeListResponse() {
        return new SearchFuncTypeListResponse();
    }

    /**
     * Create an instance of {@link GetAllLoanPeriod }
     *
     */
    public GetAllLoanPeriod createGetAllLoanPeriod() {
        return new GetAllLoanPeriod();
    }

    /**
     * Create an instance of {@link ProfessionDto }
     *
     */
    public ProfessionDto createProfessionDto() {
        return new ProfessionDto();
    }

    /**
     * Create an instance of {@link SiteSearchParamDto }
     *
     */
    public SiteSearchParamDto createSiteSearchParamDto() {
        return new SiteSearchParamDto();
    }

    /**
     * Create an instance of {@link ProductDto }
     *
     */
    public ProductDto createProductDto() {
        return new ProductDto();
    }

    /**
     * Create an instance of {@link SearchAdminRegionByParam }
     *
     */
    public SearchAdminRegionByParam createSearchAdminRegionByParam() {
        return new SearchAdminRegionByParam();
    }

    /**
     * Create an instance of {@link ApprovalProgressDto }
     *
     */
    public ApprovalProgressDto createApprovalProgressDto() {
        return new ApprovalProgressDto();
    }

    /**
     * Create an instance of {@link GetMoonlightLoanStatusResponse }
     *
     */
    public GetMoonlightLoanStatusResponse createGetMoonlightLoanStatusResponse() {
        return new GetMoonlightLoanStatusResponse();
    }

    /**
     * Create an instance of {@link PaymentTypeDetailDto }
     *
     */
    public PaymentTypeDetailDto createPaymentTypeDetailDto() {
        return new PaymentTypeDetailDto();
    }

    /**
     * Create an instance of {@link AddApplicationInfo }
     *
     */
    public AddApplicationInfo createAddApplicationInfo() {
        return new AddApplicationInfo();
    }

    /**
     * Create an instance of {@link ChReturnApplInfoSyncDto }
     *
     */
    public ChReturnApplInfoSyncDto createChReturnApplInfoSyncDto() {
        return new ChReturnApplInfoSyncDto();
    }

    /**
     * Create an instance of {@link SyncUserResponse }
     *
     */
    public SyncUserResponse createSyncUserResponse() {
        return new SyncUserResponse();
    }

    /**
     * Create an instance of {@link AddAnnex }
     *
     */
    public AddAnnex createAddAnnex() {
        return new AddAnnex();
    }

    /**
     * Create an instance of {@link com.ljwd.plms.web.wsdl.webservice.Login }
     *
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link ChAnnexDto }
     *
     */
    public ChAnnexDto createChAnnexDto() {
        return new ChAnnexDto();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     *
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link MoonlightApplicationInfoDto }
     *
     */
    public MoonlightApplicationInfoDto createMoonlightApplicationInfoDto() {
        return new MoonlightApplicationInfoDto();
    }

    /**
     * Create an instance of {@link GetLovListResponse }
     *
     */
    public GetLovListResponse createGetLovListResponse() {
        return new GetLovListResponse();
    }

    /**
     * Create an instance of {@link ChOrganizationDto }
     *
     */
    public ChOrganizationDto createChOrganizationDto() {
        return new ChOrganizationDto();
    }

    /**
     * Create an instance of {@link GetApplicationInfoApplyProgress }
     *
     */
    public GetApplicationInfoApplyProgress createGetApplicationInfoApplyProgress() {
        return new GetApplicationInfoApplyProgress();
    }

    /**
     * Create an instance of {@link CompanyCustomerInfoSearchDto }
     *
     */
    public CompanyCustomerInfoSearchDto createCompanyCustomerInfoSearchDto() {
        return new CompanyCustomerInfoSearchDto();
    }

    /**
     * Create an instance of {@link SyncApplicationInfo }
     *
     */
    public SyncApplicationInfo createSyncApplicationInfo() {
        return new SyncApplicationInfo();
    }

    /**
     * Create an instance of {@link AppIdNameSearchParamDto }
     *
     */
    public AppIdNameSearchParamDto createAppIdNameSearchParamDto() {
        return new AppIdNameSearchParamDto();
    }

    /**
     * Create an instance of {@link GetAllProducts }
     *
     */
    public GetAllProducts createGetAllProducts() {
        return new GetAllProducts();
    }

    /**
     * Create an instance of {@link ChApplInfoOtherSyncDto }
     *
     */
    public ChApplInfoOtherSyncDto createChApplInfoOtherSyncDto() {
        return new ChApplInfoOtherSyncDto();
    }

    /**
     * Create an instance of {@link GetApplicationInfoApplyProgressResponse }
     *
     */
    public GetApplicationInfoApplyProgressResponse createGetApplicationInfoApplyProgressResponse() {
        return new GetApplicationInfoApplyProgressResponse();
    }

    /**
     * Create an instance of {@link PolicyInfoDto }
     *
     */
    public PolicyInfoDto createPolicyInfoDto() {
        return new PolicyInfoDto();
    }

    /**
     * Create an instance of {@link CarInfoDto }
     *
     */
    public CarInfoDto createCarInfoDto() {
        return new CarInfoDto();
    }

    /**
     * Create an instance of {@link GetAllPaymentType }
     *
     */
    public GetAllPaymentType createGetAllPaymentType() {
        return new GetAllPaymentType();
    }

    /**
     * Create an instance of {@link SyncOrganization }
     *
     */
    public SyncOrganization createSyncOrganization() {
        return new SyncOrganization();
    }

    /**
     * Create an instance of {@link AddBookingsResponse }
     *
     */
    public AddBookingsResponse createAddBookingsResponse() {
        return new AddBookingsResponse();
    }

    /**
     * Create an instance of {@link SearchReprotUrlByParam }
     *
     */
    public SearchReprotUrlByParam createSearchReprotUrlByParam() {
        return new SearchReprotUrlByParam();
    }

    /**
     * Create an instance of {@link SyncUser }
     *
     */
    public SyncUser createSyncUser() {
        return new SyncUser();
    }

    /**
     * Create an instance of {@link SearchSiteRegionMapListResponse }
     *
     */
    public SearchSiteRegionMapListResponse createSearchSiteRegionMapListResponse() {
        return new SearchSiteRegionMapListResponse();
    }

    /**
     * Create an instance of {@link SearchEnterpriseTypeListResponse }
     *
     */
    public SearchEnterpriseTypeListResponse createSearchEnterpriseTypeListResponse() {
        return new SearchEnterpriseTypeListResponse();
    }

    /**
     * Create an instance of {@link MoonlightLoanStatusDto }
     *
     */
    public MoonlightLoanStatusDto createMoonlightLoanStatusDto() {
        return new MoonlightLoanStatusDto();
    }

    /**
     * Create an instance of {@link CompanyCustomerInfoSearchResultDto }
     *
     */
    public CompanyCustomerInfoSearchResultDto createCompanyCustomerInfoSearchResultDto() {
        return new CompanyCustomerInfoSearchResultDto();
    }

    /**
     * Create an instance of {@link ChangeUserPassword }
     *
     */
    public ChangeUserPassword createChangeUserPassword() {
        return new ChangeUserPassword();
    }

    /**
     * Create an instance of {@link SearchEnterpriseTypeList }
     *
     */
    public SearchEnterpriseTypeList createSearchEnterpriseTypeList() {
        return new SearchEnterpriseTypeList();
    }

    /**
     * Create an instance of {@link SearchAdminRegionProvinceList }
     *
     */
    public SearchAdminRegionProvinceList createSearchAdminRegionProvinceList() {
        return new SearchAdminRegionProvinceList();
    }

    /**
     * Create an instance of {@link SearchFuncTypeList }
     *
     */
    public SearchFuncTypeList createSearchFuncTypeList() {
        return new SearchFuncTypeList();
    }

    /**
     * Create an instance of {@link CustomerDto }
     *
     */
    public CustomerDto createCustomerDto() {
        return new CustomerDto();
    }

    /**
     * Create an instance of {@link ChDataSyncParamDto }
     *
     */
    public ChDataSyncParamDto createChDataSyncParamDto() {
        return new ChDataSyncParamDto();
    }

    /**
     * Create an instance of {@link SyncOrganizationResponse }
     *
     */
    public SyncOrganizationResponse createSyncOrganizationResponse() {
        return new SyncOrganizationResponse();
    }

    /**
     * Create an instance of {@link GetAllLoanPeriodResponse }
     *
     */
    public GetAllLoanPeriodResponse createGetAllLoanPeriodResponse() {
        return new GetAllLoanPeriodResponse();
    }

    /**
     * Create an instance of {@link SearchAdminRegionAreaListResponse }
     *
     */
    public SearchAdminRegionAreaListResponse createSearchAdminRegionAreaListResponse() {
        return new SearchAdminRegionAreaListResponse();
    }

    /**
     * Create an instance of {@link CompanyCustomerInfoSearchParamDto }
     *
     */
    public CompanyCustomerInfoSearchParamDto createCompanyCustomerInfoSearchParamDto() {
        return new CompanyCustomerInfoSearchParamDto();
    }

    /**
     * Create an instance of {@link SearchAdminRegionZipListResponse }
     *
     */
    public SearchAdminRegionZipListResponse createSearchAdminRegionZipListResponse() {
        return new SearchAdminRegionZipListResponse();
    }

    /**
     * Create an instance of {@link AppIdNameSearchResultDto }
     *
     */
    public AppIdNameSearchResultDto createAppIdNameSearchResultDto() {
        return new AppIdNameSearchResultDto();
    }

    /**
     * Create an instance of {@link GetAllProductsResponse }
     *
     */
    public GetAllProductsResponse createGetAllProductsResponse() {
        return new GetAllProductsResponse();
    }

    /**
     * Create an instance of {@link SearchCompanyCustomerInfo }
     *
     */
    public SearchCompanyCustomerInfo createSearchCompanyCustomerInfo() {
        return new SearchCompanyCustomerInfo();
    }

    /**
     * Create an instance of {@link CommonLovDto }
     *
     */
    public CommonLovDto createCommonLovDto() {
        return new CommonLovDto();
    }

    /**
     * Create an instance of {@link AddAnnexResponse }
     *
     */
    public AddAnnexResponse createAddAnnexResponse() {
        return new AddAnnexResponse();
    }

    /**
     * Create an instance of {@link SyncApplicationInfoResponse }
     *
     */
    public SyncApplicationInfoResponse createSyncApplicationInfoResponse() {
        return new SyncApplicationInfoResponse();
    }

    /**
     * Create an instance of {@link SearchUnitNatureList }
     *
     */
    public SearchUnitNatureList createSearchUnitNatureList() {
        return new SearchUnitNatureList();
    }

    /**
     * Create an instance of {@link ChUserDto }
     *
     */
    public ChUserDto createChUserDto() {
        return new ChUserDto();
    }

    /**
     * Create an instance of {@link SearchProfLevelListResponse }
     *
     */
    public SearchProfLevelListResponse createSearchProfLevelListResponse() {
        return new SearchProfLevelListResponse();
    }

    /**
     * Create an instance of {@link SearchProfLevelList }
     *
     */
    public SearchProfLevelList createSearchProfLevelList() {
        return new SearchProfLevelList();
    }

    /**
     * Create an instance of {@link AuthenticateUserResponse }
     *
     */
    public AuthenticateUserResponse createAuthenticateUserResponse() {
        return new AuthenticateUserResponse();
    }

    /**
     * Create an instance of {@link SiteDto }
     *
     */
    public SiteDto createSiteDto() {
        return new SiteDto();
    }

    /**
     * Create an instance of {@link ChApplInfoResultDto }
     *
     */
    public ChApplInfoResultDto createChApplInfoResultDto() {
        return new ChApplInfoResultDto();
    }

    /**
     * Create an instance of {@link AuthenticateUser }
     *
     */
    public AuthenticateUser createAuthenticateUser() {
        return new AuthenticateUser();
    }

    /**
     * Create an instance of {@link BaseDataControlDto }
     *
     */
    public BaseDataControlDto createBaseDataControlDto() {
        return new BaseDataControlDto();
    }

    /**
     * Create an instance of {@link ApplicationInfoApplyProgressResultDto }
     *
     */
    public ApplicationInfoApplyProgressResultDto createApplicationInfoApplyProgressResultDto() {
        return new ApplicationInfoApplyProgressResultDto();
    }

    /**
     *
     */
    public ErrorInfo createErrorInfo() {
        return new ErrorInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPaymentType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "getAllPaymentType")
    public JAXBElement<GetAllPaymentType> createGetAllPaymentType(GetAllPaymentType value) {
        return new JAXBElement<GetAllPaymentType>(_GetAllPaymentType_QNAME, GetAllPaymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncOrganization }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "syncOrganization")
    public JAXBElement<SyncOrganization> createSyncOrganization(SyncOrganization value) {
        return new JAXBElement<SyncOrganization>(_SyncOrganization_QNAME, SyncOrganization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookingsResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "addBookingsResponse")
    public JAXBElement<AddBookingsResponse> createAddBookingsResponse(AddBookingsResponse value) {
        return new JAXBElement<AddBookingsResponse>(_AddBookingsResponse_QNAME, AddBookingsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchReprotUrlByParam }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchReprotUrlByParam")
    public JAXBElement<SearchReprotUrlByParam> createSearchReprotUrlByParam(SearchReprotUrlByParam value) {
        return new JAXBElement<SearchReprotUrlByParam>(_SearchReprotUrlByParam_QNAME, SearchReprotUrlByParam.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarInfoDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "carInfoDto")
    public JAXBElement<CarInfoDto> createCarInfoDto(CarInfoDto value) {
        return new JAXBElement<CarInfoDto>(_CarInfoDto_QNAME, CarInfoDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationInfoApplyProgressResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "getApplicationInfoApplyProgressResponse")
    public JAXBElement<GetApplicationInfoApplyProgressResponse> createGetApplicationInfoApplyProgressResponse(GetApplicationInfoApplyProgressResponse value) {
        return new JAXBElement<GetApplicationInfoApplyProgressResponse>(_GetApplicationInfoApplyProgressResponse_QNAME, GetApplicationInfoApplyProgressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyInfoDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "policyInfoDto")
    public JAXBElement<PolicyInfoDto> createPolicyInfoDto(PolicyInfoDto value) {
        return new JAXBElement<PolicyInfoDto>(_PolicyInfoDto_QNAME, PolicyInfoDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseEnquiryResultDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "baseEnquiryResultDto")
    public JAXBElement<BaseEnquiryResultDto> createBaseEnquiryResultDto(BaseEnquiryResultDto value) {
        return new JAXBElement<BaseEnquiryResultDto>(_BaseEnquiryResultDto_QNAME, BaseEnquiryResultDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChApplInfoOtherSyncDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "chApplInfoOtherSyncDto")
    public JAXBElement<ChApplInfoOtherSyncDto> createChApplInfoOtherSyncDto(ChApplInfoOtherSyncDto value) {
        return new JAXBElement<ChApplInfoOtherSyncDto>(_ChApplInfoOtherSyncDto_QNAME, ChApplInfoOtherSyncDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProducts }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "getAllProducts")
    public JAXBElement<GetAllProducts> createGetAllProducts(GetAllProducts value) {
        return new JAXBElement<GetAllProducts>(_GetAllProducts_QNAME, GetAllProducts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationInfoApplyProgress }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "getApplicationInfoApplyProgress")
    public JAXBElement<GetApplicationInfoApplyProgress> createGetApplicationInfoApplyProgress(GetApplicationInfoApplyProgress value) {
        return new JAXBElement<GetApplicationInfoApplyProgress>(_GetApplicationInfoApplyProgress_QNAME, GetApplicationInfoApplyProgress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyCustomerInfoSearchDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "companyCustomerInfoSearchDto")
    public JAXBElement<CompanyCustomerInfoSearchDto> createCompanyCustomerInfoSearchDto(CompanyCustomerInfoSearchDto value) {
        return new JAXBElement<CompanyCustomerInfoSearchDto>(_CompanyCustomerInfoSearchDto_QNAME, CompanyCustomerInfoSearchDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncApplicationInfo }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "syncApplicationInfo")
    public JAXBElement<SyncApplicationInfo> createSyncApplicationInfo(SyncApplicationInfo value) {
        return new JAXBElement<SyncApplicationInfo>(_SyncApplicationInfo_QNAME, SyncApplicationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppIdNameSearchParamDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "appIdNameSearchParamDto")
    public JAXBElement<AppIdNameSearchParamDto> createAppIdNameSearchParamDto(AppIdNameSearchParamDto value) {
        return new JAXBElement<AppIdNameSearchParamDto>(_AppIdNameSearchParamDto_QNAME, AppIdNameSearchParamDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoonlightApplicationInfoDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "moonlightApplicationInfoDto")
    public JAXBElement<MoonlightApplicationInfoDto> createMoonlightApplicationInfoDto(MoonlightApplicationInfoDto value) {
        return new JAXBElement<MoonlightApplicationInfoDto>(_MoonlightApplicationInfoDto_QNAME, MoonlightApplicationInfoDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLovListResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "getLovListResponse")
    public JAXBElement<GetLovListResponse> createGetLovListResponse(GetLovListResponse value) {
        return new JAXBElement<GetLovListResponse>(_GetLovListResponse_QNAME, GetLovListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChOrganizationDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "chOrganizationDto")
    public JAXBElement<ChOrganizationDto> createChOrganizationDto(ChOrganizationDto value) {
        return new JAXBElement<ChOrganizationDto>(_ChOrganizationDto_QNAME, ChOrganizationDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChAnnexDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "chAnnexDto")
    public JAXBElement<ChAnnexDto> createChAnnexDto(ChAnnexDto value) {
        return new JAXBElement<ChAnnexDto>(_ChAnnexDto_QNAME, ChAnnexDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAnnex }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "addAnnex")
    public JAXBElement<AddAnnex> createAddAnnex(AddAnnex value) {
        return new JAXBElement<AddAnnex>(_AddAnnex_QNAME, AddAnnex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddApplicationInfo }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "addApplicationInfo")
    public JAXBElement<AddApplicationInfo> createAddApplicationInfo(AddApplicationInfo value) {
        return new JAXBElement<AddApplicationInfo>(_AddApplicationInfo_QNAME, AddApplicationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChReturnApplInfoSyncDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "chReturnApplInfoSyncDto")
    public JAXBElement<ChReturnApplInfoSyncDto> createChReturnApplInfoSyncDto(ChReturnApplInfoSyncDto value) {
        return new JAXBElement<ChReturnApplInfoSyncDto>(_ChReturnApplInfoSyncDto_QNAME, ChReturnApplInfoSyncDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncUserResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "syncUserResponse")
    public JAXBElement<SyncUserResponse> createSyncUserResponse(SyncUserResponse value) {
        return new JAXBElement<SyncUserResponse>(_SyncUserResponse_QNAME, SyncUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMoonlightLoanStatusResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "getMoonlightLoanStatusResponse")
    public JAXBElement<GetMoonlightLoanStatusResponse> createGetMoonlightLoanStatusResponse(GetMoonlightLoanStatusResponse value) {
        return new JAXBElement<GetMoonlightLoanStatusResponse>(_GetMoonlightLoanStatusResponse_QNAME, GetMoonlightLoanStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTypeDetailDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "paymentTypeDetailDto")
    public JAXBElement<PaymentTypeDetailDto> createPaymentTypeDetailDto(PaymentTypeDetailDto value) {
        return new JAXBElement<PaymentTypeDetailDto>(_PaymentTypeDetailDto_QNAME, PaymentTypeDetailDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiteSearchParamDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "siteSearchParamDto")
    public JAXBElement<SiteSearchParamDto> createSiteSearchParamDto(SiteSearchParamDto value) {
        return new JAXBElement<SiteSearchParamDto>(_SiteSearchParamDto_QNAME, SiteSearchParamDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "productDto")
    public JAXBElement<ProductDto> createProductDto(ProductDto value) {
        return new JAXBElement<ProductDto>(_ProductDto_QNAME, ProductDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAdminRegionByParam }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchAdminRegionByParam")
    public JAXBElement<SearchAdminRegionByParam> createSearchAdminRegionByParam(SearchAdminRegionByParam value) {
        return new JAXBElement<SearchAdminRegionByParam>(_SearchAdminRegionByParam_QNAME, SearchAdminRegionByParam.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApprovalProgressDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "approvalProgressDto")
    public JAXBElement<ApprovalProgressDto> createApprovalProgressDto(ApprovalProgressDto value) {
        return new JAXBElement<ApprovalProgressDto>(_ApprovalProgressDto_QNAME, ApprovalProgressDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfessionDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "professionDto")
    public JAXBElement<ProfessionDto> createProfessionDto(ProfessionDto value) {
        return new JAXBElement<ProfessionDto>(_ProfessionDto_QNAME, ProfessionDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiteDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "siteDto")
    public JAXBElement<SiteDto> createSiteDto(SiteDto value) {
        return new JAXBElement<SiteDto>(_SiteDto_QNAME, SiteDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateUser }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "authenticateUser")
    public JAXBElement<AuthenticateUser> createAuthenticateUser(AuthenticateUser value) {
        return new JAXBElement<AuthenticateUser>(_AuthenticateUser_QNAME, AuthenticateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChApplInfoResultDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "chApplInfoResultDto")
    public JAXBElement<ChApplInfoResultDto> createChApplInfoResultDto(ChApplInfoResultDto value) {
        return new JAXBElement<ChApplInfoResultDto>(_ChApplInfoResultDto_QNAME, ChApplInfoResultDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateUserResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "authenticateUserResponse")
    public JAXBElement<AuthenticateUserResponse> createAuthenticateUserResponse(AuthenticateUserResponse value) {
        return new JAXBElement<AuthenticateUserResponse>(_AuthenticateUserResponse_QNAME, AuthenticateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProfLevelList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchProfLevelList")
    public JAXBElement<SearchProfLevelList> createSearchProfLevelList(SearchProfLevelList value) {
        return new JAXBElement<SearchProfLevelList>(_SearchProfLevelList_QNAME, SearchProfLevelList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChUserDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "chUserDto")
    public JAXBElement<ChUserDto> createChUserDto(ChUserDto value) {
        return new JAXBElement<ChUserDto>(_ChUserDto_QNAME, ChUserDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProfLevelListResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchProfLevelListResponse")
    public JAXBElement<SearchProfLevelListResponse> createSearchProfLevelListResponse(SearchProfLevelListResponse value) {
        return new JAXBElement<SearchProfLevelListResponse>(_SearchProfLevelListResponse_QNAME, SearchProfLevelListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchUnitNatureList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchUnitNatureList")
    public JAXBElement<SearchUnitNatureList> createSearchUnitNatureList(SearchUnitNatureList value) {
        return new JAXBElement<SearchUnitNatureList>(_SearchUnitNatureList_QNAME, SearchUnitNatureList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAnnexResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "addAnnexResponse")
    public JAXBElement<AddAnnexResponse> createAddAnnexResponse(AddAnnexResponse value) {
        return new JAXBElement<AddAnnexResponse>(_AddAnnexResponse_QNAME, AddAnnexResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommonLovDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "commonLovDto")
    public JAXBElement<CommonLovDto> createCommonLovDto(CommonLovDto value) {
        return new JAXBElement<CommonLovDto>(_CommonLovDto_QNAME, CommonLovDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncApplicationInfoResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "syncApplicationInfoResponse")
    public JAXBElement<SyncApplicationInfoResponse> createSyncApplicationInfoResponse(SyncApplicationInfoResponse value) {
        return new JAXBElement<SyncApplicationInfoResponse>(_SyncApplicationInfoResponse_QNAME, SyncApplicationInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCompanyCustomerInfo }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchCompanyCustomerInfo")
    public JAXBElement<SearchCompanyCustomerInfo> createSearchCompanyCustomerInfo(SearchCompanyCustomerInfo value) {
        return new JAXBElement<SearchCompanyCustomerInfo>(_SearchCompanyCustomerInfo_QNAME, SearchCompanyCustomerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProductsResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "getAllProductsResponse")
    public JAXBElement<GetAllProductsResponse> createGetAllProductsResponse(GetAllProductsResponse value) {
        return new JAXBElement<GetAllProductsResponse>(_GetAllProductsResponse_QNAME, GetAllProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppIdNameSearchResultDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "appIdNameSearchResultDto")
    public JAXBElement<AppIdNameSearchResultDto> createAppIdNameSearchResultDto(AppIdNameSearchResultDto value) {
        return new JAXBElement<AppIdNameSearchResultDto>(_AppIdNameSearchResultDto_QNAME, AppIdNameSearchResultDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyCustomerInfoSearchParamDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "companyCustomerInfoSearchParamDto")
    public JAXBElement<CompanyCustomerInfoSearchParamDto> createCompanyCustomerInfoSearchParamDto(CompanyCustomerInfoSearchParamDto value) {
        return new JAXBElement<CompanyCustomerInfoSearchParamDto>(_CompanyCustomerInfoSearchParamDto_QNAME, CompanyCustomerInfoSearchParamDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAdminRegionZipListResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchAdminRegionZipListResponse")
    public JAXBElement<SearchAdminRegionZipListResponse> createSearchAdminRegionZipListResponse(SearchAdminRegionZipListResponse value) {
        return new JAXBElement<SearchAdminRegionZipListResponse>(_SearchAdminRegionZipListResponse_QNAME, SearchAdminRegionZipListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseValueDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "baseValueDto")
    public JAXBElement<BaseValueDto> createBaseValueDto(BaseValueDto value) {
        return new JAXBElement<BaseValueDto>(_BaseValueDto_QNAME, BaseValueDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAdminRegionAreaListResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchAdminRegionAreaListResponse")
    public JAXBElement<SearchAdminRegionAreaListResponse> createSearchAdminRegionAreaListResponse(SearchAdminRegionAreaListResponse value) {
        return new JAXBElement<SearchAdminRegionAreaListResponse>(_SearchAdminRegionAreaListResponse_QNAME, SearchAdminRegionAreaListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFuncTypeList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchFuncTypeList")
    public JAXBElement<SearchFuncTypeList> createSearchFuncTypeList(SearchFuncTypeList value) {
        return new JAXBElement<SearchFuncTypeList>(_SearchFuncTypeList_QNAME, SearchFuncTypeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChDataSyncParamDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "chDataSyncParamDto")
    public JAXBElement<ChDataSyncParamDto> createChDataSyncParamDto(ChDataSyncParamDto value) {
        return new JAXBElement<ChDataSyncParamDto>(_ChDataSyncParamDto_QNAME, ChDataSyncParamDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "customerDto")
    public JAXBElement<CustomerDto> createCustomerDto(CustomerDto value) {
        return new JAXBElement<CustomerDto>(_CustomerDto_QNAME, CustomerDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllLoanPeriodResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "getAllLoanPeriodResponse")
    public JAXBElement<GetAllLoanPeriodResponse> createGetAllLoanPeriodResponse(GetAllLoanPeriodResponse value) {
        return new JAXBElement<GetAllLoanPeriodResponse>(_GetAllLoanPeriodResponse_QNAME, GetAllLoanPeriodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncOrganizationResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "syncOrganizationResponse")
    public JAXBElement<SyncOrganizationResponse> createSyncOrganizationResponse(SyncOrganizationResponse value) {
        return new JAXBElement<SyncOrganizationResponse>(_SyncOrganizationResponse_QNAME, SyncOrganizationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchEnterpriseTypeList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchEnterpriseTypeList")
    public JAXBElement<SearchEnterpriseTypeList> createSearchEnterpriseTypeList(SearchEnterpriseTypeList value) {
        return new JAXBElement<SearchEnterpriseTypeList>(_SearchEnterpriseTypeList_QNAME, SearchEnterpriseTypeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAdminRegionProvinceList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchAdminRegionProvinceList")
    public JAXBElement<SearchAdminRegionProvinceList> createSearchAdminRegionProvinceList(SearchAdminRegionProvinceList value) {
        return new JAXBElement<SearchAdminRegionProvinceList>(_SearchAdminRegionProvinceList_QNAME, SearchAdminRegionProvinceList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoonlightLoanStatusDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "moonlightLoanStatusDto")
    public JAXBElement<MoonlightLoanStatusDto> createMoonlightLoanStatusDto(MoonlightLoanStatusDto value) {
        return new JAXBElement<MoonlightLoanStatusDto>(_MoonlightLoanStatusDto_QNAME, MoonlightLoanStatusDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyCustomerInfoSearchResultDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "companyCustomerInfoSearchResultDto")
    public JAXBElement<CompanyCustomerInfoSearchResultDto> createCompanyCustomerInfoSearchResultDto(CompanyCustomerInfoSearchResultDto value) {
        return new JAXBElement<CompanyCustomerInfoSearchResultDto>(_CompanyCustomerInfoSearchResultDto_QNAME, CompanyCustomerInfoSearchResultDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeUserPassword }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "changeUserPassword")
    public JAXBElement<ChangeUserPassword> createChangeUserPassword(ChangeUserPassword value) {
        return new JAXBElement<ChangeUserPassword>(_ChangeUserPassword_QNAME, ChangeUserPassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncUser }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "syncUser")
    public JAXBElement<SyncUser> createSyncUser(SyncUser value) {
        return new JAXBElement<SyncUser>(_SyncUser_QNAME, SyncUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSiteRegionMapListResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchSiteRegionMapListResponse")
    public JAXBElement<SearchSiteRegionMapListResponse> createSearchSiteRegionMapListResponse(SearchSiteRegionMapListResponse value) {
        return new JAXBElement<SearchSiteRegionMapListResponse>(_SearchSiteRegionMapListResponse_QNAME, SearchSiteRegionMapListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchEnterpriseTypeListResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchEnterpriseTypeListResponse")
    public JAXBElement<SearchEnterpriseTypeListResponse> createSearchEnterpriseTypeListResponse(SearchEnterpriseTypeListResponse value) {
        return new JAXBElement<SearchEnterpriseTypeListResponse>(_SearchEnterpriseTypeListResponse_QNAME, SearchEnterpriseTypeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAdminRegionCityList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchAdminRegionCityList")
    public JAXBElement<SearchAdminRegionCityList> createSearchAdminRegionCityList(SearchAdminRegionCityList value) {
        return new JAXBElement<SearchAdminRegionCityList>(_SearchAdminRegionCityList_QNAME, SearchAdminRegionCityList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseVersionableCreatorAwareEntityDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "baseVersionableCreatorAwareEntityDto")
    public JAXBElement<BaseVersionableCreatorAwareEntityDto> createBaseVersionableCreatorAwareEntityDto(BaseVersionableCreatorAwareEntityDto value) {
        return new JAXBElement<BaseVersionableCreatorAwareEntityDto>(_BaseVersionableCreatorAwareEntityDto_QNAME, BaseVersionableCreatorAwareEntityDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchIndustryTypeListResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchIndustryTypeListResponse")
    public JAXBElement<SearchIndustryTypeListResponse> createSearchIndustryTypeListResponse(SearchIndustryTypeListResponse value) {
        return new JAXBElement<SearchIndustryTypeListResponse>(_SearchIndustryTypeListResponse_QNAME, SearchIndustryTypeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeUserPasswordResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "changeUserPasswordResponse")
    public JAXBElement<ChangeUserPasswordResponse> createChangeUserPasswordResponse(ChangeUserPasswordResponse value) {
        return new JAXBElement<ChangeUserPasswordResponse>(_ChangeUserPasswordResponse_QNAME, ChangeUserPasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAdminRegionByParamResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchAdminRegionByParamResponse")
    public JAXBElement<SearchAdminRegionByParamResponse> createSearchAdminRegionByParamResponse(SearchAdminRegionByParamResponse value) {
        return new JAXBElement<SearchAdminRegionByParamResponse>(_SearchAdminRegionByParamResponse_QNAME, SearchAdminRegionByParamResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChOrganizationListSyncDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "chOrganizationListSyncDto")
    public JAXBElement<ChOrganizationListSyncDto> createChOrganizationListSyncDto(ChOrganizationListSyncDto value) {
        return new JAXBElement<ChOrganizationListSyncDto>(_ChOrganizationListSyncDto_QNAME, ChOrganizationListSyncDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChApplInfoSyncDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "chApplInfoSyncDto")
    public JAXBElement<ChApplInfoSyncDto> createChApplInfoSyncDto(ChApplInfoSyncDto value) {
        return new JAXBElement<ChApplInfoSyncDto>(_ChApplInfoSyncDto_QNAME, ChApplInfoSyncDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiteSearchResultDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "siteSearchResultDto")
    public JAXBElement<SiteSearchResultDto> createSiteSearchResultDto(SiteSearchResultDto value) {
        return new JAXBElement<SiteSearchResultDto>(_SiteSearchResultDto_QNAME, SiteSearchResultDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchUnitNatureListResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchUnitNatureListResponse")
    public JAXBElement<SearchUnitNatureListResponse> createSearchUnitNatureListResponse(SearchUnitNatureListResponse value) {
        return new JAXBElement<SearchUnitNatureListResponse>(_SearchUnitNatureListResponse_QNAME, SearchUnitNatureListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseEnquiryParamDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "baseEnquiryParamDto")
    public JAXBElement<BaseEnquiryParamDto> createBaseEnquiryParamDto(BaseEnquiryParamDto value) {
        return new JAXBElement<BaseEnquiryParamDto>(_BaseEnquiryParamDto_QNAME, BaseEnquiryParamDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorInfoException }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "ErrorInfoException")
    public JAXBElement<ErrorInfoException> createErrorInfoException(ErrorInfoException value) {
        return new JAXBElement<ErrorInfoException>(_ErrorInfoException_QNAME, ErrorInfoException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAdminRegionProvinceListResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchAdminRegionProvinceListResponse")
    public JAXBElement<SearchAdminRegionProvinceListResponse> createSearchAdminRegionProvinceListResponse(SearchAdminRegionProvinceListResponse value) {
        return new JAXBElement<SearchAdminRegionProvinceListResponse>(_SearchAdminRegionProvinceListResponse_QNAME, SearchAdminRegionProvinceListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMoonlightLoanStatus }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "getMoonlightLoanStatus")
    public JAXBElement<GetMoonlightLoanStatus> createGetMoonlightLoanStatus(GetMoonlightLoanStatus value) {
        return new JAXBElement<GetMoonlightLoanStatus>(_GetMoonlightLoanStatus_QNAME, GetMoonlightLoanStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPaymentTypeResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "getAllPaymentTypeResponse")
    public JAXBElement<GetAllPaymentTypeResponse> createGetAllPaymentTypeResponse(GetAllPaymentTypeResponse value) {
        return new JAXBElement<GetAllPaymentTypeResponse>(_GetAllPaymentTypeResponse_QNAME, GetAllPaymentTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMoonlightApplicationInfoResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "addMoonlightApplicationInfoResponse")
    public JAXBElement<AddMoonlightApplicationInfoResponse> createAddMoonlightApplicationInfoResponse(AddMoonlightApplicationInfoResponse value) {
        return new JAXBElement<AddMoonlightApplicationInfoResponse>(_AddMoonlightApplicationInfoResponse_QNAME, AddMoonlightApplicationInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMoonlightApplicationInfo }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "addMoonlightApplicationInfo")
    public JAXBElement<AddMoonlightApplicationInfo> createAddMoonlightApplicationInfo(AddMoonlightApplicationInfo value) {
        return new JAXBElement<AddMoonlightApplicationInfo>(_AddMoonlightApplicationInfo_QNAME, AddMoonlightApplicationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPwdByUserIDResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchPwdByUserIDResponse")
    public JAXBElement<SearchPwdByUserIDResponse> createSearchPwdByUserIDResponse(SearchPwdByUserIDResponse value) {
        return new JAXBElement<SearchPwdByUserIDResponse>(_SearchPwdByUserIDResponse_QNAME, SearchPwdByUserIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChUserListSyncDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "chUserListSyncDto")
    public JAXBElement<ChUserListSyncDto> createChUserListSyncDto(ChUserListSyncDto value) {
        return new JAXBElement<ChUserListSyncDto>(_ChUserListSyncDto_QNAME, ChUserListSyncDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAdminRegionByNameListResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchAdminRegionByNameListResponse")
    public JAXBElement<SearchAdminRegionByNameListResponse> createSearchAdminRegionByNameListResponse(SearchAdminRegionByNameListResponse value) {
        return new JAXBElement<SearchAdminRegionByNameListResponse>(_SearchAdminRegionByNameListResponse_QNAME, SearchAdminRegionByNameListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortField }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "sortField")
    public JAXBElement<SortField> createSortField(SortField value) {
        return new JAXBElement<SortField>(_SortField_QNAME, SortField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAdminRegionZipList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchAdminRegionZipList")
    public JAXBElement<SearchAdminRegionZipList> createSearchAdminRegionZipList(SearchAdminRegionZipList value) {
        return new JAXBElement<SearchAdminRegionZipList>(_SearchAdminRegionZipList_QNAME, SearchAdminRegionZipList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferRequestParamDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "offerRequestParamDto")
    public JAXBElement<OfferRequestParamDto> createOfferRequestParamDto(OfferRequestParamDto value) {
        return new JAXBElement<OfferRequestParamDto>(_OfferRequestParamDto_QNAME, OfferRequestParamDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSiteRegionMapList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchSiteRegionMapList")
    public JAXBElement<SearchSiteRegionMapList> createSearchSiteRegionMapList(SearchSiteRegionMapList value) {
        return new JAXBElement<SearchSiteRegionMapList>(_SearchSiteRegionMapList_QNAME, SearchSiteRegionMapList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HouseInfoDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "houseInfoDto")
    public JAXBElement<HouseInfoDto> createHouseInfoDto(HouseInfoDto value) {
        return new JAXBElement<HouseInfoDto>(_HouseInfoDto_QNAME, HouseInfoDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCompanyCustomerInfoResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchCompanyCustomerInfoResponse")
    public JAXBElement<SearchCompanyCustomerInfoResponse> createSearchCompanyCustomerInfoResponse(SearchCompanyCustomerInfoResponse value) {
        return new JAXBElement<SearchCompanyCustomerInfoResponse>(_SearchCompanyCustomerInfoResponse_QNAME, SearchCompanyCustomerInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChApplInfoParamSyncDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "chApplInfoParamSyncDto")
    public JAXBElement<ChApplInfoParamSyncDto> createChApplInfoParamSyncDto(ChApplInfoParamSyncDto value) {
        return new JAXBElement<ChApplInfoParamSyncDto>(_ChApplInfoParamSyncDto_QNAME, ChApplInfoParamSyncDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSiteListOnBranch }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "getSiteListOnBranch")
    public JAXBElement<GetSiteListOnBranch> createGetSiteListOnBranch(GetSiteListOnBranch value) {
        return new JAXBElement<GetSiteListOnBranch>(_GetSiteListOnBranch_QNAME, GetSiteListOnBranch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChApplInfoDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "chApplInfoDto")
    public JAXBElement<ChApplInfoDto> createChApplInfoDto(ChApplInfoDto value) {
        return new JAXBElement<ChApplInfoDto>(_ChApplInfoDto_QNAME, ChApplInfoDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookingDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "bookingDto")
    public JAXBElement<BookingDto> createBookingDto(BookingDto value) {
        return new JAXBElement<BookingDto>(_BookingDto_QNAME, BookingDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseEntityDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "baseEntityDto")
    public JAXBElement<BaseEntityDto> createBaseEntityDto(BaseEntityDto value) {
        return new JAXBElement<BaseEntityDto>(_BaseEntityDto_QNAME, BaseEntityDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFuncTypeListResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchFuncTypeListResponse")
    public JAXBElement<SearchFuncTypeListResponse> createSearchFuncTypeListResponse(SearchFuncTypeListResponse value) {
        return new JAXBElement<SearchFuncTypeListResponse>(_SearchFuncTypeListResponse_QNAME, SearchFuncTypeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllLoanPeriod }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "getAllLoanPeriod")
    public JAXBElement<GetAllLoanPeriod> createGetAllLoanPeriod(GetAllLoanPeriod value) {
        return new JAXBElement<GetAllLoanPeriod>(_GetAllLoanPeriod_QNAME, GetAllLoanPeriod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChApplInfoListSyncDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "chApplInfoListSyncDto")
    public JAXBElement<ChApplInfoListSyncDto> createChApplInfoListSyncDto(ChApplInfoListSyncDto value) {
        return new JAXBElement<ChApplInfoListSyncDto>(_ChApplInfoListSyncDto_QNAME, ChApplInfoListSyncDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddApplicationInfoResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "addApplicationInfoResponse")
    public JAXBElement<AddApplicationInfoResponse> createAddApplicationInfoResponse(AddApplicationInfoResponse value) {
        return new JAXBElement<AddApplicationInfoResponse>(_AddApplicationInfoResponse_QNAME, AddApplicationInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAdminRegionByNameList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchAdminRegionByNameList")
    public JAXBElement<SearchAdminRegionByNameList> createSearchAdminRegionByNameList(SearchAdminRegionByNameList value) {
        return new JAXBElement<SearchAdminRegionByNameList>(_SearchAdminRegionByNameList_QNAME, SearchAdminRegionByNameList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSiteListResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchSiteListResponse")
    public JAXBElement<SearchSiteListResponse> createSearchSiteListResponse(SearchSiteListResponse value) {
        return new JAXBElement<SearchSiteListResponse>(_SearchSiteListResponse_QNAME, SearchSiteListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoonlightApplInfoResultDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "moonlightApplInfoResultDto")
    public JAXBElement<MoonlightApplInfoResultDto> createMoonlightApplInfoResultDto(MoonlightApplInfoResultDto value) {
        return new JAXBElement<MoonlightApplInfoResultDto>(_MoonlightApplInfoResultDto_QNAME, MoonlightApplInfoResultDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIntradayOrderFeedbackResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "getIntradayOrderFeedbackResponse")
    public JAXBElement<GetIntradayOrderFeedbackResponse> createGetIntradayOrderFeedbackResponse(GetIntradayOrderFeedbackResponse value) {
        return new JAXBElement<GetIntradayOrderFeedbackResponse>(_GetIntradayOrderFeedbackResponse_QNAME, GetIntradayOrderFeedbackResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSiteList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchSiteList")
    public JAXBElement<SearchSiteList> createSearchSiteList(SearchSiteList value) {
        return new JAXBElement<SearchSiteList>(_SearchSiteList_QNAME, SearchSiteList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAdminRegionAreaList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchAdminRegionAreaList")
    public JAXBElement<SearchAdminRegionAreaList> createSearchAdminRegionAreaList(SearchAdminRegionAreaList value) {
        return new JAXBElement<SearchAdminRegionAreaList>(_SearchAdminRegionAreaList_QNAME, SearchAdminRegionAreaList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSiteListOnBranchResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "getSiteListOnBranchResponse")
    public JAXBElement<GetSiteListOnBranchResponse> createGetSiteListOnBranchResponse(GetSiteListOnBranchResponse value) {
        return new JAXBElement<GetSiteListOnBranchResponse>(_GetSiteListOnBranchResponse_QNAME, GetSiteListOnBranchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChApplInfoStatusSyncDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "chApplInfoStatusSyncDto")
    public JAXBElement<ChApplInfoStatusSyncDto> createChApplInfoStatusSyncDto(ChApplInfoStatusSyncDto value) {
        return new JAXBElement<ChApplInfoStatusSyncDto>(_ChApplInfoStatusSyncDto_QNAME, ChApplInfoStatusSyncDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserProfileDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "userProfileDto")
    public JAXBElement<UserProfileDto> createUserProfileDto(UserProfileDto value) {
        return new JAXBElement<UserProfileDto>(_UserProfileDto_QNAME, UserProfileDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchIndustryTypeList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchIndustryTypeList")
    public JAXBElement<SearchIndustryTypeList> createSearchIndustryTypeList(SearchIndustryTypeList value) {
        return new JAXBElement<SearchIndustryTypeList>(_SearchIndustryTypeList_QNAME, SearchIndustryTypeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAdminRegionCityListResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchAdminRegionCityListResponse")
    public JAXBElement<SearchAdminRegionCityListResponse> createSearchAdminRegionCityListResponse(SearchAdminRegionCityListResponse value) {
        return new JAXBElement<SearchAdminRegionCityListResponse>(_SearchAdminRegionCityListResponse_QNAME, SearchAdminRegionCityListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPwdByUserID }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchPwdByUserID")
    public JAXBElement<SearchPwdByUserID> createSearchPwdByUserID(SearchPwdByUserID value) {
        return new JAXBElement<SearchPwdByUserID>(_SearchPwdByUserID_QNAME, SearchPwdByUserID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchReprotUrlByParamResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "searchReprotUrlByParamResponse")
    public JAXBElement<SearchReprotUrlByParamResponse> createSearchReprotUrlByParamResponse(SearchReprotUrlByParamResponse value) {
        return new JAXBElement<SearchReprotUrlByParamResponse>(_SearchReprotUrlByParamResponse_QNAME, SearchReprotUrlByParamResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIntradayOrderFeedback }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "getIntradayOrderFeedback")
    public JAXBElement<GetIntradayOrderFeedback> createGetIntradayOrderFeedback(GetIntradayOrderFeedback value) {
        return new JAXBElement<GetIntradayOrderFeedback>(_GetIntradayOrderFeedback_QNAME, GetIntradayOrderFeedback.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderFeedbackDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "orderFeedbackDto")
    public JAXBElement<OrderFeedbackDto> createOrderFeedbackDto(OrderFeedbackDto value) {
        return new JAXBElement<OrderFeedbackDto>(_OrderFeedbackDto_QNAME, OrderFeedbackDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLovList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "getLovList")
    public JAXBElement<GetLovList> createGetLovList(GetLovList value) {
        return new JAXBElement<GetLovList>(_GetLovList_QNAME, GetLovList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountInfoDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "accountInfoDto")
    public JAXBElement<AccountInfoDto> createAccountInfoDto(AccountInfoDto value) {
        return new JAXBElement<AccountInfoDto>(_AccountInfoDto_QNAME, AccountInfoDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseCreatorAwareEntityDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "baseCreatorAwareEntityDto")
    public JAXBElement<BaseCreatorAwareEntityDto> createBaseCreatorAwareEntityDto(BaseCreatorAwareEntityDto value) {
        return new JAXBElement<BaseCreatorAwareEntityDto>(_BaseCreatorAwareEntityDto_QNAME, BaseCreatorAwareEntityDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactorDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "contactorDto")
    public JAXBElement<ContactorDto> createContactorDto(ContactorDto value) {
        return new JAXBElement<ContactorDto>(_ContactorDto_QNAME, ContactorDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiteRegionMapDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "siteRegionMapDto")
    public JAXBElement<SiteRegionMapDto> createSiteRegionMapDto(SiteRegionMapDto value) {
        return new JAXBElement<SiteRegionMapDto>(_SiteRegionMapDto_QNAME, SiteRegionMapDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTypeDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "paymentTypeDto")
    public JAXBElement<PaymentTypeDto> createPaymentTypeDto(PaymentTypeDto value) {
        return new JAXBElement<PaymentTypeDto>(_PaymentTypeDto_QNAME, PaymentTypeDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookings }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "addBookings")
    public JAXBElement<AddBookings> createAddBookings(AddBookings value) {
        return new JAXBElement<AddBookings>(_AddBookings_QNAME, AddBookings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiteRegionMapSearchParamDto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice.loan.mfbms.flinkmf.com/", name = "siteRegionMapSearchParamDto")
    public JAXBElement<SiteRegionMapSearchParamDto> createSiteRegionMapSearchParamDto(SiteRegionMapSearchParamDto value) {
        return new JAXBElement<SiteRegionMapSearchParamDto>(_SiteRegionMapSearchParamDto_QNAME, SiteRegionMapSearchParamDto.class, null, value);
    }

}
