
package com.ljwd.plms.web.wsdl.webservice.channelService;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import com.ljwd.plms.web.wsdl.webservice.exception.ErrorInfoException_Exception;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 2.7.7
 * 2014-08-13T16:04:42.868+08:00
 * Generated source version: 2.7.7
 * 
 */
public final class ChannelService_ChannelServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://webservice.loan.mfbms.flinkmf.com/", "ChannelServiceService");

    private ChannelService_ChannelServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ChannelServiceService.CHANNELSERVICESERVICE_WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ChannelServiceService ss = new ChannelServiceService(wsdlURL, SERVICE_NAME);
        ChannelService port = ss.getChannelServicePort();  
        
        {
        System.out.println("Invoking syncApplicationInfo...");
        ChApplInfoParamSyncDto _syncApplicationInfo_applInfoParamSyncDto = null;
        try {
            ChApplInfoListSyncDto _syncApplicationInfo__return = port.syncApplicationInfo(_syncApplicationInfo_applInfoParamSyncDto);
            System.out.println("syncApplicationInfo.result=" + _syncApplicationInfo__return);

        } catch (ErrorInfoException_Exception e) { 
            System.out.println("Expected exception: ErrorInfoException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking logout...");
        try {
            port.logout();

        } catch (ErrorInfoException_Exception e) { 
            System.out.println("Expected exception: ErrorInfoException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking addAnnex...");
        ChAnnexDto _addAnnex_annexDto = null;
        try {
            port.addAnnex(_addAnnex_annexDto);

        } catch (ErrorInfoException_Exception e) { 
            System.out.println("Expected exception: ErrorInfoException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking changeUserPassword...");
        java.lang.String _changeUserPassword_employeeNo = "";
        java.lang.String _changeUserPassword_password = "";
        java.lang.String _changeUserPassword_oldPassword = "";
        try {
            port.changeUserPassword(_changeUserPassword_employeeNo, _changeUserPassword_password, _changeUserPassword_oldPassword);

        } catch (ErrorInfoException_Exception e) { 
            System.out.println("Expected exception: ErrorInfoException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking searchSiteList...");
        SiteSearchParamDto _searchSiteList_param = null;
        try {
            SiteSearchResultDto _searchSiteList__return = port.searchSiteList(_searchSiteList_param);
            System.out.println("searchSiteList.result=" + _searchSiteList__return);

        } catch (ErrorInfoException_Exception e) { 
            System.out.println("Expected exception: ErrorInfoException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking authenticateUser...");
        java.lang.String _authenticateUser_employeeNo = "";
        java.lang.String _authenticateUser_password = "";
        try {
            UserProfileDto _authenticateUser__return = port.authenticateUser(_authenticateUser_employeeNo, _authenticateUser_password);
            System.out.println("authenticateUser.result=" + _authenticateUser__return);

        } catch (ErrorInfoException_Exception e) { 
            System.out.println("Expected exception: ErrorInfoException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getAllProducts...");
        try {
            java.util.List<ProductDto> _getAllProducts__return = port.getAllProducts();
            System.out.println("getAllProducts.result=" + _getAllProducts__return);

        } catch (ErrorInfoException_Exception e) { 
            System.out.println("Expected exception: ErrorInfoException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking login...");
        java.lang.String _login_plainPwd = "";
        java.lang.String _login_userId = "";
        try {
            UserProfileDto _login__return = port.login(_login_plainPwd, _login_userId);
            System.out.println("login.result=" + _login__return);

        } catch (ErrorInfoException_Exception e) { 
            System.out.println("Expected exception: ErrorInfoException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking searchCompanyCustomerInfo...");
        CompanyCustomerInfoSearchParamDto _searchCompanyCustomerInfo_param = null;
        try {
            CompanyCustomerInfoSearchResultDto _searchCompanyCustomerInfo__return = port.searchCompanyCustomerInfo(_searchCompanyCustomerInfo_param);
            System.out.println("searchCompanyCustomerInfo.result=" + _searchCompanyCustomerInfo__return);

        } catch (ErrorInfoException_Exception e) { 
            System.out.println("Expected exception: ErrorInfoException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getApplicationInfoApplyProgress...");
        long _getApplicationInfoApplyProgress_applId = 0;
        try {
            ApplicationInfoApplyProgressResultDto _getApplicationInfoApplyProgress__return = port.getApplicationInfoApplyProgress(_getApplicationInfoApplyProgress_applId);
            System.out.println("getApplicationInfoApplyProgress.result=" + _getApplicationInfoApplyProgress__return);

        } catch (ErrorInfoException_Exception e) { 
            System.out.println("Expected exception: ErrorInfoException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking syncUser...");
        ChDataSyncParamDto _syncUser_syncParamDto = null;
        try {
            ChUserListSyncDto _syncUser__return = port.syncUser(_syncUser_syncParamDto);
            System.out.println("syncUser.result=" + _syncUser__return);

        } catch (ErrorInfoException_Exception e) { 
            System.out.println("Expected exception: ErrorInfoException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking addApplicationInfo...");
        ChApplInfoDto _addApplicationInfo_applicationInfoDto = null;
        try {
            ChApplInfoResultDto _addApplicationInfo__return = port.addApplicationInfo(_addApplicationInfo_applicationInfoDto);
            System.out.println("addApplicationInfo.result=" + _addApplicationInfo__return);

        } catch (ErrorInfoException_Exception e) { 
            System.out.println("Expected exception: ErrorInfoException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getLovList...");
        LovType _getLovList_lovType = null;
        try {
            java.util.List<CommonLovDto> _getLovList__return = port.getLovList(_getLovList_lovType);
            System.out.println("getLovList.result=" + _getLovList__return);

        } catch (ErrorInfoException_Exception e) { 
            System.out.println("Expected exception: ErrorInfoException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking syncOrganization...");
        ChDataSyncParamDto _syncOrganization_syncParamDto = null;
        try {
            ChOrganizationListSyncDto _syncOrganization__return = port.syncOrganization(_syncOrganization_syncParamDto);
            System.out.println("syncOrganization.result=" + _syncOrganization__return);

        } catch (ErrorInfoException_Exception e) { 
            System.out.println("Expected exception: ErrorInfoException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getAllPaymentType...");
        try {
            java.util.List<PaymentTypeDto> _getAllPaymentType__return = port.getAllPaymentType();
            System.out.println("getAllPaymentType.result=" + _getAllPaymentType__return);

        } catch (ErrorInfoException_Exception e) {
            System.out.println("Expected exception: ErrorInfoException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
