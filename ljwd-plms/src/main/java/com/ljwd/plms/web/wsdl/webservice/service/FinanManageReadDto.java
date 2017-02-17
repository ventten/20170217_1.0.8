
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for finanManageReadDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="finanManageReadDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applinfoid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="finanid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="senttime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="finanstatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="finansigntime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="finansigntimes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="signTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prdNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gender" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="age" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="education" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="marriage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="son" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="houseHold" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="salary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="servYears" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="staffType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="induStryVal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="copyTypeVal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="position" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="capital" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="income" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="practitionersAge" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="placeType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="shareHold" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="housePurchase" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="houseAmtMode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="houseYear" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="carPurchase" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crdtCard" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creditLoan" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="registrationName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="registrationMi" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctAmt" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="cntrctPeriod" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="reward" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="repaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="interestRate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="raiseStandard" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="guaranteeTypes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="guarantee" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankVal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankBranch" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankAC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctPayNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="queryCost" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="investigateCost" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inquiry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ledgerVal" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="loanPurposeVal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="jinYingOne" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dbCntrctNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prdNoYou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="purposeVal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custNameYou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNoYou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="genderYou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="birthday" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobile2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="marriageYou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sonYou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="houseHoldYou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="educationYou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="salary2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteCityName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="staffTypeYou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="induStryVal2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="copyTypeValYou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="servYrars" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitAddr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="positon2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="professionDept" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="salary3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteUnitName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitInduStryVal2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitTypeVal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitStartTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="staffName2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="staffAddr2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="yueSalary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="housePurchaseYou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="houseAmtModeYou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="carPurchaseYou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="carAmtMode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creditLoanMax" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creditLoanChi" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creditLoanLv" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creditLoanCha" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creditLoanYou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crdtCardTtlNum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ccName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ccVal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ccMobile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ccAddr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="registrationNameYou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="registrationMiYou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanAmt2" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="cntrctPeriodYou" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="bankValYou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankACYou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctNoHe" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="feeAmtYou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctNoYou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="guaranteeTypesYou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="no1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="no2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="no3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="productType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prdNameJun" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="purposeValJun" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custNameJun" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNoJun" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="genderJun" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="birthdayJun" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobileJun" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="placeJun" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addrJun" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="registrationNameJun" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="registrationMiJun" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanAmtJun" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanPeriorJun" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="bankValJun" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="branchJun" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="provinceNameJun" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteNameJun" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="duiJun" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankACJun" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctNoJun" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ledgenValJun" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeValJin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codevalamtJin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inquiryJin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="daKuanJin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prdNoSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctNoSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctAmtSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctPeriodSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanPurposeValSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remark1Sou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remark2SouSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custNameSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNoSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobilesou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="genderSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="birthDaySou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="marriageSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sonSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="birthPlaceSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="educationSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="houseHoldSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="salarySou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="staffTypeSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="industryValSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="industryValMSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="copyTypeValSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="servYearsSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitNameSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitAddrSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="positon2Sou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="professionDeptSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="salary32Sou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitType2Sou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="industryVal2Sou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="industryValM2Sou2Sou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="copyTypeVal2Sou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="servYears2Sou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitName2Sou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitAddr2Sou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="yueSalary2Sou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="housePurchaseSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="houseAmtModeSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="carPurchaseSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="carAmtModeSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creditLoanMaxSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creditLoanChiSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creditLoanLvSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creditLoanChaSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ccNameSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ccValSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankNameSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankValSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankACSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctNoHeSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="guaranteeTypesSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="productTypeSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeValSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeValAmtSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inquirySou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="daKuanSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rownumgf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="entrydategf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="titlegf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custnamegf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="registrationNamegf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="registrationMigf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctNoHegf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idcardgf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gendergf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankValgf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankACgf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="purposegf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanAmtgf" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="cntrctPeriodgf" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="consultationgf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inquirygf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="realityAmtgf" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="perpertyAmtgf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vehicleAmtgf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="assetsAmtgf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="liabilitiesAmtgf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="othercreditgf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="overduegf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="educationgf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="marriagegf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="songf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="houseHoldgf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="salarygf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="induStryValgf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="copyTypeValgf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="positongf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addrgf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="servYearsgf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prdName360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanAmt2360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctPeriod360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rate360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankVal360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="provinceName360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteName360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dui360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankAC360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loantypexin360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="productType360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="purposeVal360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctNoHe360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dicntrctno360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dancntrctno360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custName360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gender360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="birthday360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobile2360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="marriage360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="houseHold360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="education360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addr360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitName360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteCityName360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="salary2360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="positon2360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitAddr360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="copyTypeVal360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="staffType360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="professionDept360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="servYrars360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="induStryVal2360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="housePurchase360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="houseAmtMode360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creditLoan360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="carPurchase360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="carAmtMode360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crdtCardTtlNum360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ccName360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ccVal360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ccMobile360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ccAddr360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ledgerval360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ledger360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inquiry360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dakuan360" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prdNoGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="purposeValGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custNameGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNoGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="genderGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="birthdayGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobile2Gao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="marriageGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sonGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="houseHoldGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="educationGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addrGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="salary2Gao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteCityNameGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="staffTypeGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="induStryVal2Gao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="copyTypeValGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="servYrarsGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitNameGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitAddrGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="positon2Gao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="professionDeptGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="salary3Gao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteUnitNameGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitTypeGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitInduStryVal2Gao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitTypeValGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitStartTimeGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="staffName2Gao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="staffAddr2Gao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="yueSalaryGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ccNameGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ccValGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ccMobileGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ccAddrGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="registrationNameGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="registrationMiGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanAmt2Gao" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="cntrctPeriodGao" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="bankValGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankACGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctNoHeGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctNoGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="guaranteeTypesGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="productTypeGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeValGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeValAmtGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inquiryGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="daKuanGao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeValMaMa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeValAmtMaMa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inquiryMaMa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="daKuanMaMa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctnoMao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pednameMao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="categoryMao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applcodeMao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custnameMao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idcardnoMao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanamtMao" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="periodMao" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="appramtMao" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="actualPayAmtMao" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="consultLW" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="manageLW" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="codeGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mechanGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custnameGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idcardtypeGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNoGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobileGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankvalGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankacGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="genderGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="enucationGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="marriageGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sitenameGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="householdGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="salaryGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="servyearsGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitnameGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="industryvalGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stafftypeGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="positionGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="copytypevalGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="guaranteetypesGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="guaranteeGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appramtGjs" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="periodpGjs" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="periodtypeGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="assetrateGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="repaymentmethodGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="periodcGjs" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="srevicerateGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fixedcostGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanpurposevalGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mortGjs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inquiryDing" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="consultationFeeDing" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="manageFeeDing" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dakuanljx" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="serialEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="datastatusEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custnameEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="genderelEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ageEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idcardtypeELdis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idcardtypeEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idcardnoEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idcardenddateEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="birthplaceEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="marriageELdis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="marriageEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="e1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="housetypeELdis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="housetypeEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="educationELdis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="educationEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="e3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="e4" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crdtNulEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crdtLmtEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="carMthdEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="estateModeEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobileEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="householdEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="provinceEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cityareaEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mailEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="qqEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="e5" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="telEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prounitnameEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prounitaddrEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="positionEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="copytypevalELdis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="copytypevalEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="industryvalEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stafftypeEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="e6" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="salaryEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prvtmoncostEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="e7" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="e8" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="e9" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="e10" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctnoEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="e11" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanpurposevalel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanamtel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanperiodel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymenttypeELdis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymenttypeEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="intervaldateELdis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="intervaldateEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rpmntmthdELdis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rpmntmthEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="consultingEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appldateEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankacEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="banknameEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="citycodeEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remark1EL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remark2EL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custnameYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sexYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sexYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="certtypeYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="certtypeYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="certnoYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ismarYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ismarYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="birthdayYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="houseYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="islocalYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="islocalYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="regioncodeYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="teladdrYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="famzipYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="famtelYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mtelYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="emailYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="famaddrYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="famstatYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="famstatYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eduYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eduYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="degreeYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="degreeYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="occupationYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="occupationYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="workcorpYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="jobtypeYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="jobtypeYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="positiontypeYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="positiontypeYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="workcorptypeYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="workcorptypeYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="jobadrYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="workcorpzipYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="workcorptelYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="headshipYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="headshipYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="positionYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="positionYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="jobedateYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="familyincomeYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="workstsYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="workstsYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="relationYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="relationYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="orgnatureYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="orgnatureYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="iptdateYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="upddateYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="brfYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spousenameYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spousecerttypeYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spousecerttypeYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spousecertnoYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spousemtelYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spousejobadrYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spousesexYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spousesexYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spouseiptdateYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spouseupddateYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isfarmYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isfarmYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="iszmYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="iszmYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="apprepaysrcYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appbegindateYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="purposeYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="purposeYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contnoYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="termYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prdtnoYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="occurtypeYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="occurtypeYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bussumYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="begindateYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="enddateYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="arateYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="termtypeYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="busbalYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="signdateYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="accounttypeYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="accounttypeYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bussum2Ygyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="termtype2Ygyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="repaydayYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="purpose2Ygyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="purpose2YgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="busbal2Ygyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="clsfiveYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="clsfiveYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="apptermtypeYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="apptermtypeYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="apptermYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="occurdateYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appsumYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="repaytypeYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="repaytypeYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="guartypeYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="guartypeYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appdateYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ibtypeYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ibtypeYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bustypeYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bustypeYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="surveyoperidYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checkoperidYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="manageoperidYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="baloperidYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="manageinstcodeYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loantypeYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loantypeYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paytypeYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paytypeYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reppriacnaYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reppriacnoYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="depaccnaYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="depaccnoYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isautorepintYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isautorepintYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isautoreppriYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isautoreppriYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="islfYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="islfYgydDis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payamtYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="realamtYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custbanknoYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custunitednoYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custacctypeYgyd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "finanManageReadDto")
public class FinanManageReadDto {

    @XmlAttribute(name = "applinfoid")
    protected Long applinfoid;
    @XmlAttribute(name = "finanid")
    protected Long finanid;
    @XmlAttribute(name = "senttime")
    protected String senttime;
    @XmlAttribute(name = "finanstatus")
    protected String finanstatus;
    @XmlAttribute(name = "finansigntime")
    protected String finansigntime;
    @XmlAttribute(name = "finansigntimes")
    protected String finansigntimes;
    @XmlAttribute(name = "signTime")
    protected String signTime;
    @XmlAttribute(name = "prdNo")
    protected String prdNo;
    @XmlAttribute(name = "custName")
    protected String custName;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "mobile")
    protected String mobile;
    @XmlAttribute(name = "gender")
    protected String gender;
    @XmlAttribute(name = "age")
    protected Long age;
    @XmlAttribute(name = "education")
    protected String education;
    @XmlAttribute(name = "marriage")
    protected String marriage;
    @XmlAttribute(name = "son")
    protected String son;
    @XmlAttribute(name = "houseHold")
    protected String houseHold;
    @XmlAttribute(name = "salary")
    protected String salary;
    @XmlAttribute(name = "siteName")
    protected String siteName;
    @XmlAttribute(name = "servYears")
    protected String servYears;
    @XmlAttribute(name = "staffType")
    protected String staffType;
    @XmlAttribute(name = "induStryVal")
    protected String induStryVal;
    @XmlAttribute(name = "copyTypeVal")
    protected String copyTypeVal;
    @XmlAttribute(name = "position")
    protected String position;
    @XmlAttribute(name = "capital")
    protected String capital;
    @XmlAttribute(name = "income")
    protected String income;
    @XmlAttribute(name = "practitionersAge")
    protected String practitionersAge;
    @XmlAttribute(name = "placeType")
    protected String placeType;
    @XmlAttribute(name = "shareHold")
    protected String shareHold;
    @XmlAttribute(name = "housePurchase")
    protected String housePurchase;
    @XmlAttribute(name = "houseAmtMode")
    protected String houseAmtMode;
    @XmlAttribute(name = "houseYear")
    protected String houseYear;
    @XmlAttribute(name = "carPurchase")
    protected String carPurchase;
    @XmlAttribute(name = "crdtCard")
    protected String crdtCard;
    @XmlAttribute(name = "creditLoan")
    protected String creditLoan;
    @XmlAttribute(name = "registrationName")
    protected String registrationName;
    @XmlAttribute(name = "registrationMi")
    protected String registrationMi;
    @XmlAttribute(name = "cntrctNo")
    protected String cntrctNo;
    @XmlAttribute(name = "cntrctAmt")
    protected Long cntrctAmt;
    @XmlAttribute(name = "cntrctPeriod")
    protected Long cntrctPeriod;
    @XmlAttribute(name = "reward")
    protected String reward;
    @XmlAttribute(name = "repaymentMethod")
    protected String repaymentMethod;
    @XmlAttribute(name = "interestRate")
    protected String interestRate;
    @XmlAttribute(name = "raiseStandard")
    protected String raiseStandard;
    @XmlAttribute(name = "guaranteeTypes")
    protected String guaranteeTypes;
    @XmlAttribute(name = "guarantee")
    protected String guarantee;
    @XmlAttribute(name = "bankVal")
    protected String bankVal;
    @XmlAttribute(name = "bankBranch")
    protected String bankBranch;
    @XmlAttribute(name = "bankAC")
    protected String bankAC;
    @XmlAttribute(name = "cntrctPayNo")
    protected String cntrctPayNo;
    @XmlAttribute(name = "queryCost")
    protected String queryCost;
    @XmlAttribute(name = "investigateCost")
    protected String investigateCost;
    @XmlAttribute(name = "inquiry")
    protected String inquiry;
    @XmlAttribute(name = "ledgerVal")
    protected Long ledgerVal;
    @XmlAttribute(name = "loanPurposeVal")
    protected String loanPurposeVal;
    @XmlAttribute(name = "jinYingOne")
    protected String jinYingOne;
    @XmlAttribute(name = "dbCntrctNo")
    protected String dbCntrctNo;
    @XmlAttribute(name = "cityCode")
    protected String cityCode;
    @XmlAttribute(name = "prdNoYou")
    protected String prdNoYou;
    @XmlAttribute(name = "purposeVal")
    protected String purposeVal;
    @XmlAttribute(name = "custNameYou")
    protected String custNameYou;
    @XmlAttribute(name = "idCardNoYou")
    protected String idCardNoYou;
    @XmlAttribute(name = "genderYou")
    protected String genderYou;
    @XmlAttribute(name = "birthday")
    protected String birthday;
    @XmlAttribute(name = "mobile2")
    protected String mobile2;
    @XmlAttribute(name = "marriageYou")
    protected String marriageYou;
    @XmlAttribute(name = "sonYou")
    protected String sonYou;
    @XmlAttribute(name = "houseHoldYou")
    protected String houseHoldYou;
    @XmlAttribute(name = "educationYou")
    protected String educationYou;
    @XmlAttribute(name = "addr")
    protected String addr;
    @XmlAttribute(name = "salary2")
    protected String salary2;
    @XmlAttribute(name = "siteCityName")
    protected String siteCityName;
    @XmlAttribute(name = "staffTypeYou")
    protected String staffTypeYou;
    @XmlAttribute(name = "induStryVal2")
    protected String induStryVal2;
    @XmlAttribute(name = "copyTypeValYou")
    protected String copyTypeValYou;
    @XmlAttribute(name = "servYrars")
    protected String servYrars;
    @XmlAttribute(name = "unitName")
    protected String unitName;
    @XmlAttribute(name = "unitAddr")
    protected String unitAddr;
    @XmlAttribute(name = "positon2")
    protected String positon2;
    @XmlAttribute(name = "professionDept")
    protected String professionDept;
    @XmlAttribute(name = "salary3")
    protected String salary3;
    @XmlAttribute(name = "siteUnitName")
    protected String siteUnitName;
    @XmlAttribute(name = "unitType")
    protected String unitType;
    @XmlAttribute(name = "unitInduStryVal2")
    protected String unitInduStryVal2;
    @XmlAttribute(name = "unitTypeVal")
    protected String unitTypeVal;
    @XmlAttribute(name = "unitStartTime")
    protected String unitStartTime;
    @XmlAttribute(name = "staffName2")
    protected String staffName2;
    @XmlAttribute(name = "staffAddr2")
    protected String staffAddr2;
    @XmlAttribute(name = "yueSalary")
    protected String yueSalary;
    @XmlAttribute(name = "housePurchaseYou")
    protected String housePurchaseYou;
    @XmlAttribute(name = "houseAmtModeYou")
    protected String houseAmtModeYou;
    @XmlAttribute(name = "carPurchaseYou")
    protected String carPurchaseYou;
    @XmlAttribute(name = "carAmtMode")
    protected String carAmtMode;
    @XmlAttribute(name = "creditLoanMax")
    protected String creditLoanMax;
    @XmlAttribute(name = "creditLoanChi")
    protected String creditLoanChi;
    @XmlAttribute(name = "creditLoanLv")
    protected String creditLoanLv;
    @XmlAttribute(name = "creditLoanCha")
    protected String creditLoanCha;
    @XmlAttribute(name = "creditLoanYou")
    protected String creditLoanYou;
    @XmlAttribute(name = "crdtCardTtlNum")
    protected String crdtCardTtlNum;
    @XmlAttribute(name = "ccName")
    protected String ccName;
    @XmlAttribute(name = "ccVal")
    protected String ccVal;
    @XmlAttribute(name = "ccMobile")
    protected String ccMobile;
    @XmlAttribute(name = "ccAddr")
    protected String ccAddr;
    @XmlAttribute(name = "registrationNameYou")
    protected String registrationNameYou;
    @XmlAttribute(name = "registrationMiYou")
    protected String registrationMiYou;
    @XmlAttribute(name = "loanAmt2")
    protected Long loanAmt2;
    @XmlAttribute(name = "cntrctPeriodYou")
    protected Long cntrctPeriodYou;
    @XmlAttribute(name = "bankValYou")
    protected String bankValYou;
    @XmlAttribute(name = "bankACYou")
    protected String bankACYou;
    @XmlAttribute(name = "cntrctNoHe")
    protected String cntrctNoHe;
    @XmlAttribute(name = "feeAmtYou")
    protected String feeAmtYou;
    @XmlAttribute(name = "cntrctNoYou")
    protected String cntrctNoYou;
    @XmlAttribute(name = "guaranteeTypesYou")
    protected String guaranteeTypesYou;
    @XmlAttribute(name = "no1")
    protected String no1;
    @XmlAttribute(name = "no2")
    protected String no2;
    @XmlAttribute(name = "no3")
    protected String no3;
    @XmlAttribute(name = "productType")
    protected String productType;
    @XmlAttribute(name = "prdNameJun")
    protected String prdNameJun;
    @XmlAttribute(name = "purposeValJun")
    protected String purposeValJun;
    @XmlAttribute(name = "custNameJun")
    protected String custNameJun;
    @XmlAttribute(name = "idCardNoJun")
    protected String idCardNoJun;
    @XmlAttribute(name = "genderJun")
    protected String genderJun;
    @XmlAttribute(name = "birthdayJun")
    protected String birthdayJun;
    @XmlAttribute(name = "mobileJun")
    protected String mobileJun;
    @XmlAttribute(name = "placeJun")
    protected String placeJun;
    @XmlAttribute(name = "addrJun")
    protected String addrJun;
    @XmlAttribute(name = "registrationNameJun")
    protected String registrationNameJun;
    @XmlAttribute(name = "registrationMiJun")
    protected String registrationMiJun;
    @XmlAttribute(name = "loanAmtJun")
    protected String loanAmtJun;
    @XmlAttribute(name = "loanPeriorJun")
    protected Long loanPeriorJun;
    @XmlAttribute(name = "bankValJun")
    protected String bankValJun;
    @XmlAttribute(name = "branchJun")
    protected String branchJun;
    @XmlAttribute(name = "provinceNameJun")
    protected String provinceNameJun;
    @XmlAttribute(name = "siteNameJun")
    protected String siteNameJun;
    @XmlAttribute(name = "duiJun")
    protected String duiJun;
    @XmlAttribute(name = "bankACJun")
    protected String bankACJun;
    @XmlAttribute(name = "cntrctNoJun")
    protected String cntrctNoJun;
    @XmlAttribute(name = "ledgenValJun")
    protected String ledgenValJun;
    @XmlAttribute(name = "codeValJin")
    protected String codeValJin;
    @XmlAttribute(name = "codevalamtJin")
    protected String codevalamtJin;
    @XmlAttribute(name = "inquiryJin")
    protected String inquiryJin;
    @XmlAttribute(name = "daKuanJin")
    protected String daKuanJin;
    @XmlAttribute(name = "prdNoSou")
    protected String prdNoSou;
    @XmlAttribute(name = "cntrctNoSou")
    protected String cntrctNoSou;
    @XmlAttribute(name = "cntrctAmtSou")
    protected String cntrctAmtSou;
    @XmlAttribute(name = "cntrctPeriodSou")
    protected String cntrctPeriodSou;
    @XmlAttribute(name = "loanPurposeValSou")
    protected String loanPurposeValSou;
    @XmlAttribute(name = "remark1Sou")
    protected String remark1Sou;
    @XmlAttribute(name = "remark2SouSou")
    protected String remark2SouSou;
    @XmlAttribute(name = "custNameSou")
    protected String custNameSou;
    @XmlAttribute(name = "idCardNoSou")
    protected String idCardNoSou;
    @XmlAttribute(name = "mobilesou")
    protected String mobilesou;
    @XmlAttribute(name = "genderSou")
    protected String genderSou;
    @XmlAttribute(name = "birthDaySou")
    protected String birthDaySou;
    @XmlAttribute(name = "marriageSou")
    protected String marriageSou;
    @XmlAttribute(name = "sonSou")
    protected String sonSou;
    @XmlAttribute(name = "birthPlaceSou")
    protected String birthPlaceSou;
    @XmlAttribute(name = "educationSou")
    protected String educationSou;
    @XmlAttribute(name = "houseHoldSou")
    protected String houseHoldSou;
    @XmlAttribute(name = "salarySou")
    protected String salarySou;
    @XmlAttribute(name = "staffTypeSou")
    protected String staffTypeSou;
    @XmlAttribute(name = "industryValSou")
    protected String industryValSou;
    @XmlAttribute(name = "industryValMSou")
    protected String industryValMSou;
    @XmlAttribute(name = "copyTypeValSou")
    protected String copyTypeValSou;
    @XmlAttribute(name = "servYearsSou")
    protected String servYearsSou;
    @XmlAttribute(name = "unitNameSou")
    protected String unitNameSou;
    @XmlAttribute(name = "unitAddrSou")
    protected String unitAddrSou;
    @XmlAttribute(name = "positon2Sou")
    protected String positon2Sou;
    @XmlAttribute(name = "professionDeptSou")
    protected String professionDeptSou;
    @XmlAttribute(name = "salary32Sou")
    protected String salary32Sou;
    @XmlAttribute(name = "unitType2Sou")
    protected String unitType2Sou;
    @XmlAttribute(name = "industryVal2Sou")
    protected String industryVal2Sou;
    @XmlAttribute(name = "industryValM2Sou2Sou")
    protected String industryValM2Sou2Sou;
    @XmlAttribute(name = "copyTypeVal2Sou")
    protected String copyTypeVal2Sou;
    @XmlAttribute(name = "servYears2Sou")
    protected String servYears2Sou;
    @XmlAttribute(name = "unitName2Sou")
    protected String unitName2Sou;
    @XmlAttribute(name = "unitAddr2Sou")
    protected String unitAddr2Sou;
    @XmlAttribute(name = "yueSalary2Sou")
    protected String yueSalary2Sou;
    @XmlAttribute(name = "housePurchaseSou")
    protected String housePurchaseSou;
    @XmlAttribute(name = "houseAmtModeSou")
    protected String houseAmtModeSou;
    @XmlAttribute(name = "carPurchaseSou")
    protected String carPurchaseSou;
    @XmlAttribute(name = "carAmtModeSou")
    protected String carAmtModeSou;
    @XmlAttribute(name = "creditLoanMaxSou")
    protected String creditLoanMaxSou;
    @XmlAttribute(name = "creditLoanChiSou")
    protected String creditLoanChiSou;
    @XmlAttribute(name = "creditLoanLvSou")
    protected String creditLoanLvSou;
    @XmlAttribute(name = "creditLoanChaSou")
    protected String creditLoanChaSou;
    @XmlAttribute(name = "ccNameSou")
    protected String ccNameSou;
    @XmlAttribute(name = "ccValSou")
    protected String ccValSou;
    @XmlAttribute(name = "bankNameSou")
    protected String bankNameSou;
    @XmlAttribute(name = "bankValSou")
    protected String bankValSou;
    @XmlAttribute(name = "bankACSou")
    protected String bankACSou;
    @XmlAttribute(name = "cntrctNoHeSou")
    protected String cntrctNoHeSou;
    @XmlAttribute(name = "guaranteeTypesSou")
    protected String guaranteeTypesSou;
    @XmlAttribute(name = "productTypeSou")
    protected String productTypeSou;
    @XmlAttribute(name = "codeValSou")
    protected String codeValSou;
    @XmlAttribute(name = "codeValAmtSou")
    protected String codeValAmtSou;
    @XmlAttribute(name = "inquirySou")
    protected String inquirySou;
    @XmlAttribute(name = "daKuanSou")
    protected String daKuanSou;
    @XmlAttribute(name = "rownumgf")
    protected String rownumgf;
    @XmlAttribute(name = "entrydategf")
    protected String entrydategf;
    @XmlAttribute(name = "titlegf")
    protected String titlegf;
    @XmlAttribute(name = "custnamegf")
    protected String custnamegf;
    @XmlAttribute(name = "registrationNamegf")
    protected String registrationNamegf;
    @XmlAttribute(name = "registrationMigf")
    protected String registrationMigf;
    @XmlAttribute(name = "cntrctNoHegf")
    protected String cntrctNoHegf;
    @XmlAttribute(name = "idcardgf")
    protected String idcardgf;
    @XmlAttribute(name = "gendergf")
    protected String gendergf;
    @XmlAttribute(name = "bankValgf")
    protected String bankValgf;
    @XmlAttribute(name = "bankACgf")
    protected String bankACgf;
    @XmlAttribute(name = "purposegf")
    protected String purposegf;
    @XmlAttribute(name = "loanAmtgf")
    protected Long loanAmtgf;
    @XmlAttribute(name = "cntrctPeriodgf")
    protected Long cntrctPeriodgf;
    @XmlAttribute(name = "consultationgf")
    protected String consultationgf;
    @XmlAttribute(name = "inquirygf")
    protected String inquirygf;
    @XmlAttribute(name = "realityAmtgf")
    protected Long realityAmtgf;
    @XmlAttribute(name = "perpertyAmtgf")
    protected String perpertyAmtgf;
    @XmlAttribute(name = "vehicleAmtgf")
    protected String vehicleAmtgf;
    @XmlAttribute(name = "assetsAmtgf")
    protected String assetsAmtgf;
    @XmlAttribute(name = "liabilitiesAmtgf")
    protected String liabilitiesAmtgf;
    @XmlAttribute(name = "othercreditgf")
    protected String othercreditgf;
    @XmlAttribute(name = "overduegf")
    protected String overduegf;
    @XmlAttribute(name = "educationgf")
    protected String educationgf;
    @XmlAttribute(name = "marriagegf")
    protected String marriagegf;
    @XmlAttribute(name = "songf")
    protected String songf;
    @XmlAttribute(name = "houseHoldgf")
    protected String houseHoldgf;
    @XmlAttribute(name = "salarygf")
    protected String salarygf;
    @XmlAttribute(name = "induStryValgf")
    protected String induStryValgf;
    @XmlAttribute(name = "copyTypeValgf")
    protected String copyTypeValgf;
    @XmlAttribute(name = "positongf")
    protected String positongf;
    @XmlAttribute(name = "addrgf")
    protected String addrgf;
    @XmlAttribute(name = "servYearsgf")
    protected String servYearsgf;
    @XmlAttribute(name = "prdName360")
    protected String prdName360;
    @XmlAttribute(name = "loanAmt2360")
    protected String loanAmt2360;
    @XmlAttribute(name = "cntrctPeriod360")
    protected String cntrctPeriod360;
    @XmlAttribute(name = "rate360")
    protected String rate360;
    @XmlAttribute(name = "bankVal360")
    protected String bankVal360;
    @XmlAttribute(name = "provinceName360")
    protected String provinceName360;
    @XmlAttribute(name = "siteName360")
    protected String siteName360;
    @XmlAttribute(name = "dui360")
    protected String dui360;
    @XmlAttribute(name = "bankAC360")
    protected String bankAC360;
    @XmlAttribute(name = "loantypexin360")
    protected String loantypexin360;
    @XmlAttribute(name = "productType360")
    protected String productType360;
    @XmlAttribute(name = "purposeVal360")
    protected String purposeVal360;
    @XmlAttribute(name = "cntrctNoHe360")
    protected String cntrctNoHe360;
    @XmlAttribute(name = "dicntrctno360")
    protected String dicntrctno360;
    @XmlAttribute(name = "dancntrctno360")
    protected String dancntrctno360;
    @XmlAttribute(name = "custName360")
    protected String custName360;
    @XmlAttribute(name = "idCardNo360")
    protected String idCardNo360;
    @XmlAttribute(name = "gender360")
    protected String gender360;
    @XmlAttribute(name = "birthday360")
    protected String birthday360;
    @XmlAttribute(name = "mobile2360")
    protected String mobile2360;
    @XmlAttribute(name = "marriage360")
    protected String marriage360;
    @XmlAttribute(name = "houseHold360")
    protected String houseHold360;
    @XmlAttribute(name = "education360")
    protected String education360;
    @XmlAttribute(name = "addr360")
    protected String addr360;
    @XmlAttribute(name = "unitName360")
    protected String unitName360;
    @XmlAttribute(name = "siteCityName360")
    protected String siteCityName360;
    @XmlAttribute(name = "salary2360")
    protected String salary2360;
    @XmlAttribute(name = "positon2360")
    protected String positon2360;
    @XmlAttribute(name = "unitAddr360")
    protected String unitAddr360;
    @XmlAttribute(name = "copyTypeVal360")
    protected String copyTypeVal360;
    @XmlAttribute(name = "staffType360")
    protected String staffType360;
    @XmlAttribute(name = "professionDept360")
    protected String professionDept360;
    @XmlAttribute(name = "servYrars360")
    protected String servYrars360;
    @XmlAttribute(name = "induStryVal2360")
    protected String induStryVal2360;
    @XmlAttribute(name = "housePurchase360")
    protected String housePurchase360;
    @XmlAttribute(name = "houseAmtMode360")
    protected String houseAmtMode360;
    @XmlAttribute(name = "creditLoan360")
    protected String creditLoan360;
    @XmlAttribute(name = "carPurchase360")
    protected String carPurchase360;
    @XmlAttribute(name = "carAmtMode360")
    protected String carAmtMode360;
    @XmlAttribute(name = "crdtCardTtlNum360")
    protected String crdtCardTtlNum360;
    @XmlAttribute(name = "ccName360")
    protected String ccName360;
    @XmlAttribute(name = "ccVal360")
    protected String ccVal360;
    @XmlAttribute(name = "ccMobile360")
    protected String ccMobile360;
    @XmlAttribute(name = "ccAddr360")
    protected String ccAddr360;
    @XmlAttribute(name = "ledgerval360")
    protected String ledgerval360;
    @XmlAttribute(name = "ledger360")
    protected String ledger360;
    @XmlAttribute(name = "inquiry360")
    protected String inquiry360;
    @XmlAttribute(name = "dakuan360")
    protected String dakuan360;
    @XmlAttribute(name = "prdNoGao")
    protected String prdNoGao;
    @XmlAttribute(name = "purposeValGao")
    protected String purposeValGao;
    @XmlAttribute(name = "custNameGao")
    protected String custNameGao;
    @XmlAttribute(name = "idCardNoGao")
    protected String idCardNoGao;
    @XmlAttribute(name = "genderGao")
    protected String genderGao;
    @XmlAttribute(name = "birthdayGao")
    protected String birthdayGao;
    @XmlAttribute(name = "mobile2Gao")
    protected String mobile2Gao;
    @XmlAttribute(name = "marriageGao")
    protected String marriageGao;
    @XmlAttribute(name = "sonGao")
    protected String sonGao;
    @XmlAttribute(name = "houseHoldGao")
    protected String houseHoldGao;
    @XmlAttribute(name = "educationGao")
    protected String educationGao;
    @XmlAttribute(name = "addrGao")
    protected String addrGao;
    @XmlAttribute(name = "salary2Gao")
    protected String salary2Gao;
    @XmlAttribute(name = "siteCityNameGao")
    protected String siteCityNameGao;
    @XmlAttribute(name = "staffTypeGao")
    protected String staffTypeGao;
    @XmlAttribute(name = "induStryVal2Gao")
    protected String induStryVal2Gao;
    @XmlAttribute(name = "copyTypeValGao")
    protected String copyTypeValGao;
    @XmlAttribute(name = "servYrarsGao")
    protected String servYrarsGao;
    @XmlAttribute(name = "unitNameGao")
    protected String unitNameGao;
    @XmlAttribute(name = "unitAddrGao")
    protected String unitAddrGao;
    @XmlAttribute(name = "positon2Gao")
    protected String positon2Gao;
    @XmlAttribute(name = "professionDeptGao")
    protected String professionDeptGao;
    @XmlAttribute(name = "salary3Gao")
    protected String salary3Gao;
    @XmlAttribute(name = "siteUnitNameGao")
    protected String siteUnitNameGao;
    @XmlAttribute(name = "unitTypeGao")
    protected String unitTypeGao;
    @XmlAttribute(name = "unitInduStryVal2Gao")
    protected String unitInduStryVal2Gao;
    @XmlAttribute(name = "unitTypeValGao")
    protected String unitTypeValGao;
    @XmlAttribute(name = "unitStartTimeGao")
    protected String unitStartTimeGao;
    @XmlAttribute(name = "staffName2Gao")
    protected String staffName2Gao;
    @XmlAttribute(name = "staffAddr2Gao")
    protected String staffAddr2Gao;
    @XmlAttribute(name = "yueSalaryGao")
    protected String yueSalaryGao;
    @XmlAttribute(name = "ccNameGao")
    protected String ccNameGao;
    @XmlAttribute(name = "ccValGao")
    protected String ccValGao;
    @XmlAttribute(name = "ccMobileGao")
    protected String ccMobileGao;
    @XmlAttribute(name = "ccAddrGao")
    protected String ccAddrGao;
    @XmlAttribute(name = "registrationNameGao")
    protected String registrationNameGao;
    @XmlAttribute(name = "registrationMiGao")
    protected String registrationMiGao;
    @XmlAttribute(name = "loanAmt2Gao")
    protected Long loanAmt2Gao;
    @XmlAttribute(name = "cntrctPeriodGao")
    protected Long cntrctPeriodGao;
    @XmlAttribute(name = "bankValGao")
    protected String bankValGao;
    @XmlAttribute(name = "bankACGao")
    protected String bankACGao;
    @XmlAttribute(name = "cntrctNoHeGao")
    protected String cntrctNoHeGao;
    @XmlAttribute(name = "cntrctNoGao")
    protected String cntrctNoGao;
    @XmlAttribute(name = "guaranteeTypesGao")
    protected String guaranteeTypesGao;
    @XmlAttribute(name = "productTypeGao")
    protected String productTypeGao;
    @XmlAttribute(name = "codeValGao")
    protected String codeValGao;
    @XmlAttribute(name = "codeValAmtGao")
    protected String codeValAmtGao;
    @XmlAttribute(name = "inquiryGao")
    protected String inquiryGao;
    @XmlAttribute(name = "daKuanGao")
    protected String daKuanGao;
    @XmlAttribute(name = "codeValMaMa")
    protected String codeValMaMa;
    @XmlAttribute(name = "codeValAmtMaMa")
    protected String codeValAmtMaMa;
    @XmlAttribute(name = "inquiryMaMa")
    protected String inquiryMaMa;
    @XmlAttribute(name = "daKuanMaMa")
    protected String daKuanMaMa;
    @XmlAttribute(name = "cntrctnoMao")
    protected String cntrctnoMao;
    @XmlAttribute(name = "pednameMao")
    protected String pednameMao;
    @XmlAttribute(name = "categoryMao")
    protected String categoryMao;
    @XmlAttribute(name = "applcodeMao")
    protected String applcodeMao;
    @XmlAttribute(name = "custnameMao")
    protected String custnameMao;
    @XmlAttribute(name = "idcardnoMao")
    protected String idcardnoMao;
    @XmlAttribute(name = "loanamtMao")
    protected BigDecimal loanamtMao;
    @XmlAttribute(name = "periodMao")
    protected Integer periodMao;
    @XmlAttribute(name = "appramtMao")
    protected BigDecimal appramtMao;
    @XmlAttribute(name = "actualPayAmtMao")
    protected BigDecimal actualPayAmtMao;
    @XmlAttribute(name = "consultLW")
    protected BigDecimal consultLW;
    @XmlAttribute(name = "manageLW")
    protected BigDecimal manageLW;
    @XmlAttribute(name = "codeGjs")
    protected String codeGjs;
    @XmlAttribute(name = "mechanGjs")
    protected String mechanGjs;
    @XmlAttribute(name = "custnameGjs")
    protected String custnameGjs;
    @XmlAttribute(name = "idcardtypeGjs")
    protected String idcardtypeGjs;
    @XmlAttribute(name = "idCardNoGjs")
    protected String idCardNoGjs;
    @XmlAttribute(name = "mobileGjs")
    protected String mobileGjs;
    @XmlAttribute(name = "bankvalGjs")
    protected String bankvalGjs;
    @XmlAttribute(name = "bankacGjs")
    protected String bankacGjs;
    @XmlAttribute(name = "genderGjs")
    protected String genderGjs;
    @XmlAttribute(name = "enucationGjs")
    protected String enucationGjs;
    @XmlAttribute(name = "marriageGjs")
    protected String marriageGjs;
    @XmlAttribute(name = "sitenameGjs")
    protected String sitenameGjs;
    @XmlAttribute(name = "householdGjs")
    protected String householdGjs;
    @XmlAttribute(name = "salaryGjs")
    protected String salaryGjs;
    @XmlAttribute(name = "servyearsGjs")
    protected String servyearsGjs;
    @XmlAttribute(name = "unitnameGjs")
    protected String unitnameGjs;
    @XmlAttribute(name = "industryvalGjs")
    protected String industryvalGjs;
    @XmlAttribute(name = "stafftypeGjs")
    protected String stafftypeGjs;
    @XmlAttribute(name = "positionGjs")
    protected String positionGjs;
    @XmlAttribute(name = "copytypevalGjs")
    protected String copytypevalGjs;
    @XmlAttribute(name = "guaranteetypesGjs")
    protected String guaranteetypesGjs;
    @XmlAttribute(name = "guaranteeGjs")
    protected String guaranteeGjs;
    @XmlAttribute(name = "appramtGjs")
    protected BigDecimal appramtGjs;
    @XmlAttribute(name = "periodpGjs")
    protected Integer periodpGjs;
    @XmlAttribute(name = "periodtypeGjs")
    protected String periodtypeGjs;
    @XmlAttribute(name = "assetrateGjs")
    protected String assetrateGjs;
    @XmlAttribute(name = "repaymentmethodGjs")
    protected String repaymentmethodGjs;
    @XmlAttribute(name = "periodcGjs")
    protected Integer periodcGjs;
    @XmlAttribute(name = "srevicerateGjs")
    protected String srevicerateGjs;
    @XmlAttribute(name = "fixedcostGjs")
    protected String fixedcostGjs;
    @XmlAttribute(name = "loanpurposevalGjs")
    protected String loanpurposevalGjs;
    @XmlAttribute(name = "mortGjs")
    protected String mortGjs;
    @XmlAttribute(name = "inquiryDing")
    protected String inquiryDing;
    @XmlAttribute(name = "consultationFeeDing")
    protected String consultationFeeDing;
    @XmlAttribute(name = "manageFeeDing")
    protected String manageFeeDing;
    @XmlAttribute(name = "dakuanljx")
    protected String dakuanljx;
    @XmlAttribute(name = "serialEL")
    protected String serialEL;
    @XmlAttribute(name = "datastatusEL")
    protected String datastatusEL;
    @XmlAttribute(name = "custnameEL")
    protected String custnameEL;
    @XmlAttribute(name = "genderelEL")
    protected String genderelEL;
    @XmlAttribute(name = "ageEL")
    protected String ageEL;
    @XmlAttribute(name = "idcardtypeELdis")
    protected String idcardtypeELdis;
    @XmlAttribute(name = "idcardtypeEL")
    protected String idcardtypeEL;
    @XmlAttribute(name = "idcardnoEL")
    protected String idcardnoEL;
    @XmlAttribute(name = "idcardenddateEL")
    protected String idcardenddateEL;
    @XmlAttribute(name = "birthplaceEL")
    protected String birthplaceEL;
    @XmlAttribute(name = "marriageELdis")
    protected String marriageELdis;
    @XmlAttribute(name = "marriageEL")
    protected String marriageEL;
    @XmlAttribute(name = "e1")
    protected String e1;
    @XmlAttribute(name = "housetypeELdis")
    protected String housetypeELdis;
    @XmlAttribute(name = "housetypeEL")
    protected String housetypeEL;
    @XmlAttribute(name = "educationELdis")
    protected String educationELdis;
    @XmlAttribute(name = "educationEL")
    protected String educationEL;
    @XmlAttribute(name = "e3")
    protected String e3;
    @XmlAttribute(name = "e4")
    protected String e4;
    @XmlAttribute(name = "crdtNulEL")
    protected String crdtNulEL;
    @XmlAttribute(name = "crdtLmtEL")
    protected String crdtLmtEL;
    @XmlAttribute(name = "carMthdEL")
    protected String carMthdEL;
    @XmlAttribute(name = "estateModeEL")
    protected String estateModeEL;
    @XmlAttribute(name = "mobileEL")
    protected String mobileEL;
    @XmlAttribute(name = "householdEL")
    protected String householdEL;
    @XmlAttribute(name = "provinceEL")
    protected String provinceEL;
    @XmlAttribute(name = "cityareaEL")
    protected String cityareaEL;
    @XmlAttribute(name = "mailEL")
    protected String mailEL;
    @XmlAttribute(name = "qqEL")
    protected String qqEL;
    @XmlAttribute(name = "e5")
    protected String e5;
    @XmlAttribute(name = "telEL")
    protected String telEL;
    @XmlAttribute(name = "prounitnameEL")
    protected String prounitnameEL;
    @XmlAttribute(name = "prounitaddrEL")
    protected String prounitaddrEL;
    @XmlAttribute(name = "positionEL")
    protected String positionEL;
    @XmlAttribute(name = "copytypevalELdis")
    protected String copytypevalELdis;
    @XmlAttribute(name = "copytypevalEL")
    protected String copytypevalEL;
    @XmlAttribute(name = "industryvalEL")
    protected String industryvalEL;
    @XmlAttribute(name = "stafftypeEL")
    protected String stafftypeEL;
    @XmlAttribute(name = "e6")
    protected String e6;
    @XmlAttribute(name = "salaryEL")
    protected String salaryEL;
    @XmlAttribute(name = "prvtmoncostEL")
    protected String prvtmoncostEL;
    @XmlAttribute(name = "e7")
    protected String e7;
    @XmlAttribute(name = "e8")
    protected String e8;
    @XmlAttribute(name = "e9")
    protected String e9;
    @XmlAttribute(name = "e10")
    protected String e10;
    @XmlAttribute(name = "cntrctnoEL")
    protected String cntrctnoEL;
    @XmlAttribute(name = "e11")
    protected String e11;
    @XmlAttribute(name = "loanpurposevalel")
    protected String loanpurposevalel;
    @XmlAttribute(name = "loanamtel")
    protected String loanamtel;
    @XmlAttribute(name = "loanperiodel")
    protected String loanperiodel;
    @XmlAttribute(name = "paymenttypeELdis")
    protected String paymenttypeELdis;
    @XmlAttribute(name = "paymenttypeEL")
    protected String paymenttypeEL;
    @XmlAttribute(name = "intervaldateELdis")
    protected String intervaldateELdis;
    @XmlAttribute(name = "intervaldateEL")
    protected String intervaldateEL;
    @XmlAttribute(name = "rpmntmthdELdis")
    protected String rpmntmthdELdis;
    @XmlAttribute(name = "rpmntmthEL")
    protected String rpmntmthEL;
    @XmlAttribute(name = "consultingEL")
    protected String consultingEL;
    @XmlAttribute(name = "appldateEL")
    protected String appldateEL;
    @XmlAttribute(name = "bankacEL")
    protected String bankacEL;
    @XmlAttribute(name = "banknameEL")
    protected String banknameEL;
    @XmlAttribute(name = "citycodeEL")
    protected String citycodeEL;
    @XmlAttribute(name = "remark1EL")
    protected String remark1EL;
    @XmlAttribute(name = "remark2EL")
    protected String remark2EL;
    @XmlAttribute(name = "custnameYgyd")
    protected String custnameYgyd;
    @XmlAttribute(name = "sexYgyd")
    protected String sexYgyd;
    @XmlAttribute(name = "sexYgydDis")
    protected String sexYgydDis;
    @XmlAttribute(name = "certtypeYgyd")
    protected String certtypeYgyd;
    @XmlAttribute(name = "certtypeYgydDis")
    protected String certtypeYgydDis;
    @XmlAttribute(name = "certnoYgyd")
    protected String certnoYgyd;
    @XmlAttribute(name = "ismarYgyd")
    protected String ismarYgyd;
    @XmlAttribute(name = "ismarYgydDis")
    protected String ismarYgydDis;
    @XmlAttribute(name = "birthdayYgyd")
    protected String birthdayYgyd;
    @XmlAttribute(name = "houseYgyd")
    protected String houseYgyd;
    @XmlAttribute(name = "islocalYgyd")
    protected String islocalYgyd;
    @XmlAttribute(name = "islocalYgydDis")
    protected String islocalYgydDis;
    @XmlAttribute(name = "regioncodeYgyd")
    protected String regioncodeYgyd;
    @XmlAttribute(name = "teladdrYgyd")
    protected String teladdrYgyd;
    @XmlAttribute(name = "famzipYgyd")
    protected String famzipYgyd;
    @XmlAttribute(name = "famtelYgyd")
    protected String famtelYgyd;
    @XmlAttribute(name = "mtelYgyd")
    protected String mtelYgyd;
    @XmlAttribute(name = "emailYgyd")
    protected String emailYgyd;
    @XmlAttribute(name = "famaddrYgyd")
    protected String famaddrYgyd;
    @XmlAttribute(name = "famstatYgyd")
    protected String famstatYgyd;
    @XmlAttribute(name = "famstatYgydDis")
    protected String famstatYgydDis;
    @XmlAttribute(name = "eduYgyd")
    protected String eduYgyd;
    @XmlAttribute(name = "eduYgydDis")
    protected String eduYgydDis;
    @XmlAttribute(name = "degreeYgyd")
    protected String degreeYgyd;
    @XmlAttribute(name = "degreeYgydDis")
    protected String degreeYgydDis;
    @XmlAttribute(name = "occupationYgyd")
    protected String occupationYgyd;
    @XmlAttribute(name = "occupationYgydDis")
    protected String occupationYgydDis;
    @XmlAttribute(name = "workcorpYgyd")
    protected String workcorpYgyd;
    @XmlAttribute(name = "jobtypeYgyd")
    protected String jobtypeYgyd;
    @XmlAttribute(name = "jobtypeYgydDis")
    protected String jobtypeYgydDis;
    @XmlAttribute(name = "positiontypeYgyd")
    protected String positiontypeYgyd;
    @XmlAttribute(name = "positiontypeYgydDis")
    protected String positiontypeYgydDis;
    @XmlAttribute(name = "workcorptypeYgyd")
    protected String workcorptypeYgyd;
    @XmlAttribute(name = "workcorptypeYgydDis")
    protected String workcorptypeYgydDis;
    @XmlAttribute(name = "jobadrYgyd")
    protected String jobadrYgyd;
    @XmlAttribute(name = "workcorpzipYgyd")
    protected String workcorpzipYgyd;
    @XmlAttribute(name = "workcorptelYgyd")
    protected String workcorptelYgyd;
    @XmlAttribute(name = "headshipYgyd")
    protected String headshipYgyd;
    @XmlAttribute(name = "headshipYgydDis")
    protected String headshipYgydDis;
    @XmlAttribute(name = "positionYgyd")
    protected String positionYgyd;
    @XmlAttribute(name = "positionYgydDis")
    protected String positionYgydDis;
    @XmlAttribute(name = "jobedateYgyd")
    protected String jobedateYgyd;
    @XmlAttribute(name = "familyincomeYgyd")
    protected String familyincomeYgyd;
    @XmlAttribute(name = "workstsYgyd")
    protected String workstsYgyd;
    @XmlAttribute(name = "workstsYgydDis")
    protected String workstsYgydDis;
    @XmlAttribute(name = "relationYgyd")
    protected String relationYgyd;
    @XmlAttribute(name = "relationYgydDis")
    protected String relationYgydDis;
    @XmlAttribute(name = "orgnatureYgyd")
    protected String orgnatureYgyd;
    @XmlAttribute(name = "orgnatureYgydDis")
    protected String orgnatureYgydDis;
    @XmlAttribute(name = "iptdateYgyd")
    protected String iptdateYgyd;
    @XmlAttribute(name = "upddateYgyd")
    protected String upddateYgyd;
    @XmlAttribute(name = "brfYgyd")
    protected String brfYgyd;
    @XmlAttribute(name = "spousenameYgyd")
    protected String spousenameYgyd;
    @XmlAttribute(name = "spousecerttypeYgyd")
    protected String spousecerttypeYgyd;
    @XmlAttribute(name = "spousecerttypeYgydDis")
    protected String spousecerttypeYgydDis;
    @XmlAttribute(name = "spousecertnoYgyd")
    protected String spousecertnoYgyd;
    @XmlAttribute(name = "spousemtelYgyd")
    protected String spousemtelYgyd;
    @XmlAttribute(name = "spousejobadrYgyd")
    protected String spousejobadrYgyd;
    @XmlAttribute(name = "spousesexYgyd")
    protected String spousesexYgyd;
    @XmlAttribute(name = "spousesexYgydDis")
    protected String spousesexYgydDis;
    @XmlAttribute(name = "spouseiptdateYgyd")
    protected String spouseiptdateYgyd;
    @XmlAttribute(name = "spouseupddateYgyd")
    protected String spouseupddateYgyd;
    @XmlAttribute(name = "isfarmYgyd")
    protected String isfarmYgyd;
    @XmlAttribute(name = "isfarmYgydDis")
    protected String isfarmYgydDis;
    @XmlAttribute(name = "iszmYgyd")
    protected String iszmYgyd;
    @XmlAttribute(name = "iszmYgydDis")
    protected String iszmYgydDis;
    @XmlAttribute(name = "apprepaysrcYgyd")
    protected String apprepaysrcYgyd;
    @XmlAttribute(name = "appbegindateYgyd")
    protected String appbegindateYgyd;
    @XmlAttribute(name = "purposeYgyd")
    protected String purposeYgyd;
    @XmlAttribute(name = "purposeYgydDis")
    protected String purposeYgydDis;
    @XmlAttribute(name = "contnoYgyd")
    protected String contnoYgyd;
    @XmlAttribute(name = "termYgyd")
    protected String termYgyd;
    @XmlAttribute(name = "prdtnoYgyd")
    protected String prdtnoYgyd;
    @XmlAttribute(name = "occurtypeYgyd")
    protected String occurtypeYgyd;
    @XmlAttribute(name = "occurtypeYgydDis")
    protected String occurtypeYgydDis;
    @XmlAttribute(name = "bussumYgyd")
    protected String bussumYgyd;
    @XmlAttribute(name = "begindateYgyd")
    protected String begindateYgyd;
    @XmlAttribute(name = "enddateYgyd")
    protected String enddateYgyd;
    @XmlAttribute(name = "arateYgyd")
    protected String arateYgyd;
    @XmlAttribute(name = "termtypeYgyd")
    protected String termtypeYgyd;
    @XmlAttribute(name = "busbalYgyd")
    protected String busbalYgyd;
    @XmlAttribute(name = "signdateYgyd")
    protected String signdateYgyd;
    @XmlAttribute(name = "accounttypeYgyd")
    protected String accounttypeYgyd;
    @XmlAttribute(name = "accounttypeYgydDis")
    protected String accounttypeYgydDis;
    @XmlAttribute(name = "bussum2Ygyd")
    protected String bussum2Ygyd;
    @XmlAttribute(name = "termtype2Ygyd")
    protected String termtype2Ygyd;
    @XmlAttribute(name = "repaydayYgyd")
    protected String repaydayYgyd;
    @XmlAttribute(name = "purpose2Ygyd")
    protected String purpose2Ygyd;
    @XmlAttribute(name = "purpose2YgydDis")
    protected String purpose2YgydDis;
    @XmlAttribute(name = "busbal2Ygyd")
    protected String busbal2Ygyd;
    @XmlAttribute(name = "clsfiveYgyd")
    protected String clsfiveYgyd;
    @XmlAttribute(name = "clsfiveYgydDis")
    protected String clsfiveYgydDis;
    @XmlAttribute(name = "apptermtypeYgyd")
    protected String apptermtypeYgyd;
    @XmlAttribute(name = "apptermtypeYgydDis")
    protected String apptermtypeYgydDis;
    @XmlAttribute(name = "apptermYgyd")
    protected String apptermYgyd;
    @XmlAttribute(name = "occurdateYgyd")
    protected String occurdateYgyd;
    @XmlAttribute(name = "appsumYgyd")
    protected String appsumYgyd;
    @XmlAttribute(name = "repaytypeYgyd")
    protected String repaytypeYgyd;
    @XmlAttribute(name = "repaytypeYgydDis")
    protected String repaytypeYgydDis;
    @XmlAttribute(name = "guartypeYgyd")
    protected String guartypeYgyd;
    @XmlAttribute(name = "guartypeYgydDis")
    protected String guartypeYgydDis;
    @XmlAttribute(name = "appdateYgyd")
    protected String appdateYgyd;
    @XmlAttribute(name = "ibtypeYgyd")
    protected String ibtypeYgyd;
    @XmlAttribute(name = "ibtypeYgydDis")
    protected String ibtypeYgydDis;
    @XmlAttribute(name = "bustypeYgyd")
    protected String bustypeYgyd;
    @XmlAttribute(name = "bustypeYgydDis")
    protected String bustypeYgydDis;
    @XmlAttribute(name = "surveyoperidYgyd")
    protected String surveyoperidYgyd;
    @XmlAttribute(name = "checkoperidYgyd")
    protected String checkoperidYgyd;
    @XmlAttribute(name = "manageoperidYgyd")
    protected String manageoperidYgyd;
    @XmlAttribute(name = "baloperidYgyd")
    protected String baloperidYgyd;
    @XmlAttribute(name = "manageinstcodeYgyd")
    protected String manageinstcodeYgyd;
    @XmlAttribute(name = "loantypeYgyd")
    protected String loantypeYgyd;
    @XmlAttribute(name = "loantypeYgydDis")
    protected String loantypeYgydDis;
    @XmlAttribute(name = "paytypeYgyd")
    protected String paytypeYgyd;
    @XmlAttribute(name = "paytypeYgydDis")
    protected String paytypeYgydDis;
    @XmlAttribute(name = "reppriacnaYgyd")
    protected String reppriacnaYgyd;
    @XmlAttribute(name = "reppriacnoYgyd")
    protected String reppriacnoYgyd;
    @XmlAttribute(name = "depaccnaYgyd")
    protected String depaccnaYgyd;
    @XmlAttribute(name = "depaccnoYgyd")
    protected String depaccnoYgyd;
    @XmlAttribute(name = "isautorepintYgyd")
    protected String isautorepintYgyd;
    @XmlAttribute(name = "isautorepintYgydDis")
    protected String isautorepintYgydDis;
    @XmlAttribute(name = "isautoreppriYgyd")
    protected String isautoreppriYgyd;
    @XmlAttribute(name = "isautoreppriYgydDis")
    protected String isautoreppriYgydDis;
    @XmlAttribute(name = "islfYgyd")
    protected String islfYgyd;
    @XmlAttribute(name = "islfYgydDis")
    protected String islfYgydDis;
    @XmlAttribute(name = "payamtYgyd")
    protected String payamtYgyd;
    @XmlAttribute(name = "realamtYgyd")
    protected String realamtYgyd;
    @XmlAttribute(name = "custbanknoYgyd")
    protected String custbanknoYgyd;
    @XmlAttribute(name = "custunitednoYgyd")
    protected String custunitednoYgyd;
    @XmlAttribute(name = "custacctypeYgyd")
    protected String custacctypeYgyd;

    /**
     * Gets the value of the applinfoid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplinfoid() {
        return applinfoid;
    }

    /**
     * Sets the value of the applinfoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplinfoid(Long value) {
        this.applinfoid = value;
    }

    /**
     * Gets the value of the finanid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFinanid() {
        return finanid;
    }

    /**
     * Sets the value of the finanid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFinanid(Long value) {
        this.finanid = value;
    }

    /**
     * Gets the value of the senttime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenttime() {
        return senttime;
    }

    /**
     * Sets the value of the senttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenttime(String value) {
        this.senttime = value;
    }

    /**
     * Gets the value of the finanstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanstatus() {
        return finanstatus;
    }

    /**
     * Sets the value of the finanstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanstatus(String value) {
        this.finanstatus = value;
    }

    /**
     * Gets the value of the finansigntime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinansigntime() {
        return finansigntime;
    }

    /**
     * Sets the value of the finansigntime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinansigntime(String value) {
        this.finansigntime = value;
    }

    /**
     * Gets the value of the finansigntimes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinansigntimes() {
        return finansigntimes;
    }

    /**
     * Sets the value of the finansigntimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinansigntimes(String value) {
        this.finansigntimes = value;
    }

    /**
     * Gets the value of the signTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignTime() {
        return signTime;
    }

    /**
     * Sets the value of the signTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignTime(String value) {
        this.signTime = value;
    }

    /**
     * Gets the value of the prdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdNo() {
        return prdNo;
    }

    /**
     * Sets the value of the prdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdNo(String value) {
        this.prdNo = value;
    }

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustName(String value) {
        this.custName = value;
    }

    /**
     * Gets the value of the idCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCardNo() {
        return idCardNo;
    }

    /**
     * Sets the value of the idCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCardNo(String value) {
        this.idCardNo = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAge(Long value) {
        this.age = value;
    }

    /**
     * Gets the value of the education property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducation() {
        return education;
    }

    /**
     * Sets the value of the education property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducation(String value) {
        this.education = value;
    }

    /**
     * Gets the value of the marriage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriage() {
        return marriage;
    }

    /**
     * Sets the value of the marriage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriage(String value) {
        this.marriage = value;
    }

    /**
     * Gets the value of the son property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSon() {
        return son;
    }

    /**
     * Sets the value of the son property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSon(String value) {
        this.son = value;
    }

    /**
     * Gets the value of the houseHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseHold() {
        return houseHold;
    }

    /**
     * Sets the value of the houseHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseHold(String value) {
        this.houseHold = value;
    }

    /**
     * Gets the value of the salary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalary(String value) {
        this.salary = value;
    }

    /**
     * Gets the value of the siteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * Sets the value of the siteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteName(String value) {
        this.siteName = value;
    }

    /**
     * Gets the value of the servYears property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServYears() {
        return servYears;
    }

    /**
     * Sets the value of the servYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServYears(String value) {
        this.servYears = value;
    }

    /**
     * Gets the value of the staffType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffType() {
        return staffType;
    }

    /**
     * Sets the value of the staffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffType(String value) {
        this.staffType = value;
    }

    /**
     * Gets the value of the induStryVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInduStryVal() {
        return induStryVal;
    }

    /**
     * Sets the value of the induStryVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInduStryVal(String value) {
        this.induStryVal = value;
    }

    /**
     * Gets the value of the copyTypeVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyTypeVal() {
        return copyTypeVal;
    }

    /**
     * Sets the value of the copyTypeVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyTypeVal(String value) {
        this.copyTypeVal = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the capital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapital() {
        return capital;
    }

    /**
     * Sets the value of the capital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapital(String value) {
        this.capital = value;
    }

    /**
     * Gets the value of the income property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncome() {
        return income;
    }

    /**
     * Sets the value of the income property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncome(String value) {
        this.income = value;
    }

    /**
     * Gets the value of the practitionersAge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPractitionersAge() {
        return practitionersAge;
    }

    /**
     * Sets the value of the practitionersAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPractitionersAge(String value) {
        this.practitionersAge = value;
    }

    /**
     * Gets the value of the placeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceType() {
        return placeType;
    }

    /**
     * Sets the value of the placeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceType(String value) {
        this.placeType = value;
    }

    /**
     * Gets the value of the shareHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareHold() {
        return shareHold;
    }

    /**
     * Sets the value of the shareHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareHold(String value) {
        this.shareHold = value;
    }

    /**
     * Gets the value of the housePurchase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHousePurchase() {
        return housePurchase;
    }

    /**
     * Sets the value of the housePurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHousePurchase(String value) {
        this.housePurchase = value;
    }

    /**
     * Gets the value of the houseAmtMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseAmtMode() {
        return houseAmtMode;
    }

    /**
     * Sets the value of the houseAmtMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseAmtMode(String value) {
        this.houseAmtMode = value;
    }

    /**
     * Gets the value of the houseYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseYear() {
        return houseYear;
    }

    /**
     * Sets the value of the houseYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseYear(String value) {
        this.houseYear = value;
    }

    /**
     * Gets the value of the carPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarPurchase() {
        return carPurchase;
    }

    /**
     * Sets the value of the carPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarPurchase(String value) {
        this.carPurchase = value;
    }

    /**
     * Gets the value of the crdtCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdtCard() {
        return crdtCard;
    }

    /**
     * Sets the value of the crdtCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrdtCard(String value) {
        this.crdtCard = value;
    }

    /**
     * Gets the value of the creditLoan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLoan() {
        return creditLoan;
    }

    /**
     * Sets the value of the creditLoan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLoan(String value) {
        this.creditLoan = value;
    }

    /**
     * Gets the value of the registrationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationName() {
        return registrationName;
    }

    /**
     * Sets the value of the registrationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationName(String value) {
        this.registrationName = value;
    }

    /**
     * Gets the value of the registrationMi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationMi() {
        return registrationMi;
    }

    /**
     * Sets the value of the registrationMi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationMi(String value) {
        this.registrationMi = value;
    }

    /**
     * Gets the value of the cntrctNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctNo() {
        return cntrctNo;
    }

    /**
     * Sets the value of the cntrctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctNo(String value) {
        this.cntrctNo = value;
    }

    /**
     * Gets the value of the cntrctAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCntrctAmt() {
        return cntrctAmt;
    }

    /**
     * Sets the value of the cntrctAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCntrctAmt(Long value) {
        this.cntrctAmt = value;
    }

    /**
     * Gets the value of the cntrctPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCntrctPeriod() {
        return cntrctPeriod;
    }

    /**
     * Sets the value of the cntrctPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCntrctPeriod(Long value) {
        this.cntrctPeriod = value;
    }

    /**
     * Gets the value of the reward property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReward() {
        return reward;
    }

    /**
     * Sets the value of the reward property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReward(String value) {
        this.reward = value;
    }

    /**
     * Gets the value of the repaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepaymentMethod() {
        return repaymentMethod;
    }

    /**
     * Sets the value of the repaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepaymentMethod(String value) {
        this.repaymentMethod = value;
    }

    /**
     * Gets the value of the interestRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestRate() {
        return interestRate;
    }

    /**
     * Sets the value of the interestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestRate(String value) {
        this.interestRate = value;
    }

    /**
     * Gets the value of the raiseStandard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaiseStandard() {
        return raiseStandard;
    }

    /**
     * Sets the value of the raiseStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaiseStandard(String value) {
        this.raiseStandard = value;
    }

    /**
     * Gets the value of the guaranteeTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeTypes() {
        return guaranteeTypes;
    }

    /**
     * Sets the value of the guaranteeTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeTypes(String value) {
        this.guaranteeTypes = value;
    }

    /**
     * Gets the value of the guarantee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarantee() {
        return guarantee;
    }

    /**
     * Sets the value of the guarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarantee(String value) {
        this.guarantee = value;
    }

    /**
     * Gets the value of the bankVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankVal() {
        return bankVal;
    }

    /**
     * Sets the value of the bankVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankVal(String value) {
        this.bankVal = value;
    }

    /**
     * Gets the value of the bankBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBranch() {
        return bankBranch;
    }

    /**
     * Sets the value of the bankBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBranch(String value) {
        this.bankBranch = value;
    }

    /**
     * Gets the value of the bankAC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAC() {
        return bankAC;
    }

    /**
     * Sets the value of the bankAC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAC(String value) {
        this.bankAC = value;
    }

    /**
     * Gets the value of the cntrctPayNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctPayNo() {
        return cntrctPayNo;
    }

    /**
     * Sets the value of the cntrctPayNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctPayNo(String value) {
        this.cntrctPayNo = value;
    }

    /**
     * Gets the value of the queryCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryCost() {
        return queryCost;
    }

    /**
     * Sets the value of the queryCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryCost(String value) {
        this.queryCost = value;
    }

    /**
     * Gets the value of the investigateCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvestigateCost() {
        return investigateCost;
    }

    /**
     * Sets the value of the investigateCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvestigateCost(String value) {
        this.investigateCost = value;
    }

    /**
     * Gets the value of the inquiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquiry() {
        return inquiry;
    }

    /**
     * Sets the value of the inquiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquiry(String value) {
        this.inquiry = value;
    }

    /**
     * Gets the value of the ledgerVal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLedgerVal() {
        return ledgerVal;
    }

    /**
     * Sets the value of the ledgerVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLedgerVal(Long value) {
        this.ledgerVal = value;
    }

    /**
     * Gets the value of the loanPurposeVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanPurposeVal() {
        return loanPurposeVal;
    }

    /**
     * Sets the value of the loanPurposeVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanPurposeVal(String value) {
        this.loanPurposeVal = value;
    }

    /**
     * Gets the value of the jinYingOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJinYingOne() {
        return jinYingOne;
    }

    /**
     * Sets the value of the jinYingOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJinYingOne(String value) {
        this.jinYingOne = value;
    }

    /**
     * Gets the value of the dbCntrctNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbCntrctNo() {
        return dbCntrctNo;
    }

    /**
     * Sets the value of the dbCntrctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbCntrctNo(String value) {
        this.dbCntrctNo = value;
    }

    /**
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Gets the value of the prdNoYou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdNoYou() {
        return prdNoYou;
    }

    /**
     * Sets the value of the prdNoYou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdNoYou(String value) {
        this.prdNoYou = value;
    }

    /**
     * Gets the value of the purposeVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeVal() {
        return purposeVal;
    }

    /**
     * Sets the value of the purposeVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeVal(String value) {
        this.purposeVal = value;
    }

    /**
     * Gets the value of the custNameYou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustNameYou() {
        return custNameYou;
    }

    /**
     * Sets the value of the custNameYou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustNameYou(String value) {
        this.custNameYou = value;
    }

    /**
     * Gets the value of the idCardNoYou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCardNoYou() {
        return idCardNoYou;
    }

    /**
     * Sets the value of the idCardNoYou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCardNoYou(String value) {
        this.idCardNoYou = value;
    }

    /**
     * Gets the value of the genderYou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderYou() {
        return genderYou;
    }

    /**
     * Sets the value of the genderYou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderYou(String value) {
        this.genderYou = value;
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthday(String value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the mobile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile2() {
        return mobile2;
    }

    /**
     * Sets the value of the mobile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile2(String value) {
        this.mobile2 = value;
    }

    /**
     * Gets the value of the marriageYou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageYou() {
        return marriageYou;
    }

    /**
     * Sets the value of the marriageYou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageYou(String value) {
        this.marriageYou = value;
    }

    /**
     * Gets the value of the sonYou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonYou() {
        return sonYou;
    }

    /**
     * Sets the value of the sonYou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonYou(String value) {
        this.sonYou = value;
    }

    /**
     * Gets the value of the houseHoldYou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseHoldYou() {
        return houseHoldYou;
    }

    /**
     * Sets the value of the houseHoldYou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseHoldYou(String value) {
        this.houseHoldYou = value;
    }

    /**
     * Gets the value of the educationYou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationYou() {
        return educationYou;
    }

    /**
     * Sets the value of the educationYou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationYou(String value) {
        this.educationYou = value;
    }

    /**
     * Gets the value of the addr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr() {
        return addr;
    }

    /**
     * Sets the value of the addr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr(String value) {
        this.addr = value;
    }

    /**
     * Gets the value of the salary2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalary2() {
        return salary2;
    }

    /**
     * Sets the value of the salary2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalary2(String value) {
        this.salary2 = value;
    }

    /**
     * Gets the value of the siteCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteCityName() {
        return siteCityName;
    }

    /**
     * Sets the value of the siteCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteCityName(String value) {
        this.siteCityName = value;
    }

    /**
     * Gets the value of the staffTypeYou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffTypeYou() {
        return staffTypeYou;
    }

    /**
     * Sets the value of the staffTypeYou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffTypeYou(String value) {
        this.staffTypeYou = value;
    }

    /**
     * Gets the value of the induStryVal2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInduStryVal2() {
        return induStryVal2;
    }

    /**
     * Sets the value of the induStryVal2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInduStryVal2(String value) {
        this.induStryVal2 = value;
    }

    /**
     * Gets the value of the copyTypeValYou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyTypeValYou() {
        return copyTypeValYou;
    }

    /**
     * Sets the value of the copyTypeValYou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyTypeValYou(String value) {
        this.copyTypeValYou = value;
    }

    /**
     * Gets the value of the servYrars property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServYrars() {
        return servYrars;
    }

    /**
     * Sets the value of the servYrars property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServYrars(String value) {
        this.servYrars = value;
    }

    /**
     * Gets the value of the unitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * Sets the value of the unitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitName(String value) {
        this.unitName = value;
    }

    /**
     * Gets the value of the unitAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitAddr() {
        return unitAddr;
    }

    /**
     * Sets the value of the unitAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitAddr(String value) {
        this.unitAddr = value;
    }

    /**
     * Gets the value of the positon2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositon2() {
        return positon2;
    }

    /**
     * Sets the value of the positon2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositon2(String value) {
        this.positon2 = value;
    }

    /**
     * Gets the value of the professionDept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionDept() {
        return professionDept;
    }

    /**
     * Sets the value of the professionDept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionDept(String value) {
        this.professionDept = value;
    }

    /**
     * Gets the value of the salary3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalary3() {
        return salary3;
    }

    /**
     * Sets the value of the salary3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalary3(String value) {
        this.salary3 = value;
    }

    /**
     * Gets the value of the siteUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteUnitName() {
        return siteUnitName;
    }

    /**
     * Sets the value of the siteUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteUnitName(String value) {
        this.siteUnitName = value;
    }

    /**
     * Gets the value of the unitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitType() {
        return unitType;
    }

    /**
     * Sets the value of the unitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitType(String value) {
        this.unitType = value;
    }

    /**
     * Gets the value of the unitInduStryVal2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitInduStryVal2() {
        return unitInduStryVal2;
    }

    /**
     * Sets the value of the unitInduStryVal2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitInduStryVal2(String value) {
        this.unitInduStryVal2 = value;
    }

    /**
     * Gets the value of the unitTypeVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitTypeVal() {
        return unitTypeVal;
    }

    /**
     * Sets the value of the unitTypeVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitTypeVal(String value) {
        this.unitTypeVal = value;
    }

    /**
     * Gets the value of the unitStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitStartTime() {
        return unitStartTime;
    }

    /**
     * Sets the value of the unitStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitStartTime(String value) {
        this.unitStartTime = value;
    }

    /**
     * Gets the value of the staffName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffName2() {
        return staffName2;
    }

    /**
     * Sets the value of the staffName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffName2(String value) {
        this.staffName2 = value;
    }

    /**
     * Gets the value of the staffAddr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffAddr2() {
        return staffAddr2;
    }

    /**
     * Sets the value of the staffAddr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffAddr2(String value) {
        this.staffAddr2 = value;
    }

    /**
     * Gets the value of the yueSalary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYueSalary() {
        return yueSalary;
    }

    /**
     * Sets the value of the yueSalary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYueSalary(String value) {
        this.yueSalary = value;
    }

    /**
     * Gets the value of the housePurchaseYou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHousePurchaseYou() {
        return housePurchaseYou;
    }

    /**
     * Sets the value of the housePurchaseYou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHousePurchaseYou(String value) {
        this.housePurchaseYou = value;
    }

    /**
     * Gets the value of the houseAmtModeYou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseAmtModeYou() {
        return houseAmtModeYou;
    }

    /**
     * Sets the value of the houseAmtModeYou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseAmtModeYou(String value) {
        this.houseAmtModeYou = value;
    }

    /**
     * Gets the value of the carPurchaseYou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarPurchaseYou() {
        return carPurchaseYou;
    }

    /**
     * Sets the value of the carPurchaseYou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarPurchaseYou(String value) {
        this.carPurchaseYou = value;
    }

    /**
     * Gets the value of the carAmtMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarAmtMode() {
        return carAmtMode;
    }

    /**
     * Sets the value of the carAmtMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarAmtMode(String value) {
        this.carAmtMode = value;
    }

    /**
     * Gets the value of the creditLoanMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLoanMax() {
        return creditLoanMax;
    }

    /**
     * Sets the value of the creditLoanMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLoanMax(String value) {
        this.creditLoanMax = value;
    }

    /**
     * Gets the value of the creditLoanChi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLoanChi() {
        return creditLoanChi;
    }

    /**
     * Sets the value of the creditLoanChi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLoanChi(String value) {
        this.creditLoanChi = value;
    }

    /**
     * Gets the value of the creditLoanLv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLoanLv() {
        return creditLoanLv;
    }

    /**
     * Sets the value of the creditLoanLv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLoanLv(String value) {
        this.creditLoanLv = value;
    }

    /**
     * Gets the value of the creditLoanCha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLoanCha() {
        return creditLoanCha;
    }

    /**
     * Sets the value of the creditLoanCha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLoanCha(String value) {
        this.creditLoanCha = value;
    }

    /**
     * Gets the value of the creditLoanYou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLoanYou() {
        return creditLoanYou;
    }

    /**
     * Sets the value of the creditLoanYou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLoanYou(String value) {
        this.creditLoanYou = value;
    }

    /**
     * Gets the value of the crdtCardTtlNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdtCardTtlNum() {
        return crdtCardTtlNum;
    }

    /**
     * Sets the value of the crdtCardTtlNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrdtCardTtlNum(String value) {
        this.crdtCardTtlNum = value;
    }

    /**
     * Gets the value of the ccName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcName() {
        return ccName;
    }

    /**
     * Sets the value of the ccName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcName(String value) {
        this.ccName = value;
    }

    /**
     * Gets the value of the ccVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcVal() {
        return ccVal;
    }

    /**
     * Sets the value of the ccVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcVal(String value) {
        this.ccVal = value;
    }

    /**
     * Gets the value of the ccMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcMobile() {
        return ccMobile;
    }

    /**
     * Sets the value of the ccMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcMobile(String value) {
        this.ccMobile = value;
    }

    /**
     * Gets the value of the ccAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcAddr() {
        return ccAddr;
    }

    /**
     * Sets the value of the ccAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcAddr(String value) {
        this.ccAddr = value;
    }

    /**
     * Gets the value of the registrationNameYou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNameYou() {
        return registrationNameYou;
    }

    /**
     * Sets the value of the registrationNameYou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNameYou(String value) {
        this.registrationNameYou = value;
    }

    /**
     * Gets the value of the registrationMiYou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationMiYou() {
        return registrationMiYou;
    }

    /**
     * Sets the value of the registrationMiYou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationMiYou(String value) {
        this.registrationMiYou = value;
    }

    /**
     * Gets the value of the loanAmt2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLoanAmt2() {
        return loanAmt2;
    }

    /**
     * Sets the value of the loanAmt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLoanAmt2(Long value) {
        this.loanAmt2 = value;
    }

    /**
     * Gets the value of the cntrctPeriodYou property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCntrctPeriodYou() {
        return cntrctPeriodYou;
    }

    /**
     * Sets the value of the cntrctPeriodYou property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCntrctPeriodYou(Long value) {
        this.cntrctPeriodYou = value;
    }

    /**
     * Gets the value of the bankValYou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankValYou() {
        return bankValYou;
    }

    /**
     * Sets the value of the bankValYou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankValYou(String value) {
        this.bankValYou = value;
    }

    /**
     * Gets the value of the bankACYou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankACYou() {
        return bankACYou;
    }

    /**
     * Sets the value of the bankACYou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankACYou(String value) {
        this.bankACYou = value;
    }

    /**
     * Gets the value of the cntrctNoHe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctNoHe() {
        return cntrctNoHe;
    }

    /**
     * Sets the value of the cntrctNoHe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctNoHe(String value) {
        this.cntrctNoHe = value;
    }

    /**
     * Gets the value of the feeAmtYou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeAmtYou() {
        return feeAmtYou;
    }

    /**
     * Sets the value of the feeAmtYou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeAmtYou(String value) {
        this.feeAmtYou = value;
    }

    /**
     * Gets the value of the cntrctNoYou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctNoYou() {
        return cntrctNoYou;
    }

    /**
     * Sets the value of the cntrctNoYou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctNoYou(String value) {
        this.cntrctNoYou = value;
    }

    /**
     * Gets the value of the guaranteeTypesYou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeTypesYou() {
        return guaranteeTypesYou;
    }

    /**
     * Sets the value of the guaranteeTypesYou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeTypesYou(String value) {
        this.guaranteeTypesYou = value;
    }

    /**
     * Gets the value of the no1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNo1() {
        return no1;
    }

    /**
     * Sets the value of the no1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNo1(String value) {
        this.no1 = value;
    }

    /**
     * Gets the value of the no2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNo2() {
        return no2;
    }

    /**
     * Sets the value of the no2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNo2(String value) {
        this.no2 = value;
    }

    /**
     * Gets the value of the no3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNo3() {
        return no3;
    }

    /**
     * Sets the value of the no3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNo3(String value) {
        this.no3 = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the prdNameJun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdNameJun() {
        return prdNameJun;
    }

    /**
     * Sets the value of the prdNameJun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdNameJun(String value) {
        this.prdNameJun = value;
    }

    /**
     * Gets the value of the purposeValJun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeValJun() {
        return purposeValJun;
    }

    /**
     * Sets the value of the purposeValJun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeValJun(String value) {
        this.purposeValJun = value;
    }

    /**
     * Gets the value of the custNameJun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustNameJun() {
        return custNameJun;
    }

    /**
     * Sets the value of the custNameJun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustNameJun(String value) {
        this.custNameJun = value;
    }

    /**
     * Gets the value of the idCardNoJun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCardNoJun() {
        return idCardNoJun;
    }

    /**
     * Sets the value of the idCardNoJun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCardNoJun(String value) {
        this.idCardNoJun = value;
    }

    /**
     * Gets the value of the genderJun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderJun() {
        return genderJun;
    }

    /**
     * Sets the value of the genderJun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderJun(String value) {
        this.genderJun = value;
    }

    /**
     * Gets the value of the birthdayJun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthdayJun() {
        return birthdayJun;
    }

    /**
     * Sets the value of the birthdayJun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthdayJun(String value) {
        this.birthdayJun = value;
    }

    /**
     * Gets the value of the mobileJun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileJun() {
        return mobileJun;
    }

    /**
     * Sets the value of the mobileJun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileJun(String value) {
        this.mobileJun = value;
    }

    /**
     * Gets the value of the placeJun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceJun() {
        return placeJun;
    }

    /**
     * Sets the value of the placeJun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceJun(String value) {
        this.placeJun = value;
    }

    /**
     * Gets the value of the addrJun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrJun() {
        return addrJun;
    }

    /**
     * Sets the value of the addrJun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrJun(String value) {
        this.addrJun = value;
    }

    /**
     * Gets the value of the registrationNameJun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNameJun() {
        return registrationNameJun;
    }

    /**
     * Sets the value of the registrationNameJun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNameJun(String value) {
        this.registrationNameJun = value;
    }

    /**
     * Gets the value of the registrationMiJun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationMiJun() {
        return registrationMiJun;
    }

    /**
     * Sets the value of the registrationMiJun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationMiJun(String value) {
        this.registrationMiJun = value;
    }

    /**
     * Gets the value of the loanAmtJun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanAmtJun() {
        return loanAmtJun;
    }

    /**
     * Sets the value of the loanAmtJun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanAmtJun(String value) {
        this.loanAmtJun = value;
    }

    /**
     * Gets the value of the loanPeriorJun property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLoanPeriorJun() {
        return loanPeriorJun;
    }

    /**
     * Sets the value of the loanPeriorJun property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLoanPeriorJun(Long value) {
        this.loanPeriorJun = value;
    }

    /**
     * Gets the value of the bankValJun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankValJun() {
        return bankValJun;
    }

    /**
     * Sets the value of the bankValJun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankValJun(String value) {
        this.bankValJun = value;
    }

    /**
     * Gets the value of the branchJun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchJun() {
        return branchJun;
    }

    /**
     * Sets the value of the branchJun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchJun(String value) {
        this.branchJun = value;
    }

    /**
     * Gets the value of the provinceNameJun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceNameJun() {
        return provinceNameJun;
    }

    /**
     * Sets the value of the provinceNameJun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceNameJun(String value) {
        this.provinceNameJun = value;
    }

    /**
     * Gets the value of the siteNameJun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteNameJun() {
        return siteNameJun;
    }

    /**
     * Sets the value of the siteNameJun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteNameJun(String value) {
        this.siteNameJun = value;
    }

    /**
     * Gets the value of the duiJun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuiJun() {
        return duiJun;
    }

    /**
     * Sets the value of the duiJun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuiJun(String value) {
        this.duiJun = value;
    }

    /**
     * Gets the value of the bankACJun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankACJun() {
        return bankACJun;
    }

    /**
     * Sets the value of the bankACJun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankACJun(String value) {
        this.bankACJun = value;
    }

    /**
     * Gets the value of the cntrctNoJun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctNoJun() {
        return cntrctNoJun;
    }

    /**
     * Sets the value of the cntrctNoJun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctNoJun(String value) {
        this.cntrctNoJun = value;
    }

    /**
     * Gets the value of the ledgenValJun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLedgenValJun() {
        return ledgenValJun;
    }

    /**
     * Sets the value of the ledgenValJun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLedgenValJun(String value) {
        this.ledgenValJun = value;
    }

    /**
     * Gets the value of the codeValJin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeValJin() {
        return codeValJin;
    }

    /**
     * Sets the value of the codeValJin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeValJin(String value) {
        this.codeValJin = value;
    }

    /**
     * Gets the value of the codevalamtJin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodevalamtJin() {
        return codevalamtJin;
    }

    /**
     * Sets the value of the codevalamtJin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodevalamtJin(String value) {
        this.codevalamtJin = value;
    }

    /**
     * Gets the value of the inquiryJin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquiryJin() {
        return inquiryJin;
    }

    /**
     * Sets the value of the inquiryJin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquiryJin(String value) {
        this.inquiryJin = value;
    }

    /**
     * Gets the value of the daKuanJin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaKuanJin() {
        return daKuanJin;
    }

    /**
     * Sets the value of the daKuanJin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaKuanJin(String value) {
        this.daKuanJin = value;
    }

    /**
     * Gets the value of the prdNoSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdNoSou() {
        return prdNoSou;
    }

    /**
     * Sets the value of the prdNoSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdNoSou(String value) {
        this.prdNoSou = value;
    }

    /**
     * Gets the value of the cntrctNoSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctNoSou() {
        return cntrctNoSou;
    }

    /**
     * Sets the value of the cntrctNoSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctNoSou(String value) {
        this.cntrctNoSou = value;
    }

    /**
     * Gets the value of the cntrctAmtSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctAmtSou() {
        return cntrctAmtSou;
    }

    /**
     * Sets the value of the cntrctAmtSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctAmtSou(String value) {
        this.cntrctAmtSou = value;
    }

    /**
     * Gets the value of the cntrctPeriodSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctPeriodSou() {
        return cntrctPeriodSou;
    }

    /**
     * Sets the value of the cntrctPeriodSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctPeriodSou(String value) {
        this.cntrctPeriodSou = value;
    }

    /**
     * Gets the value of the loanPurposeValSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanPurposeValSou() {
        return loanPurposeValSou;
    }

    /**
     * Sets the value of the loanPurposeValSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanPurposeValSou(String value) {
        this.loanPurposeValSou = value;
    }

    /**
     * Gets the value of the remark1Sou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark1Sou() {
        return remark1Sou;
    }

    /**
     * Sets the value of the remark1Sou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark1Sou(String value) {
        this.remark1Sou = value;
    }

    /**
     * Gets the value of the remark2SouSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark2SouSou() {
        return remark2SouSou;
    }

    /**
     * Sets the value of the remark2SouSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark2SouSou(String value) {
        this.remark2SouSou = value;
    }

    /**
     * Gets the value of the custNameSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustNameSou() {
        return custNameSou;
    }

    /**
     * Sets the value of the custNameSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustNameSou(String value) {
        this.custNameSou = value;
    }

    /**
     * Gets the value of the idCardNoSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCardNoSou() {
        return idCardNoSou;
    }

    /**
     * Sets the value of the idCardNoSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCardNoSou(String value) {
        this.idCardNoSou = value;
    }

    /**
     * Gets the value of the mobilesou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilesou() {
        return mobilesou;
    }

    /**
     * Sets the value of the mobilesou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilesou(String value) {
        this.mobilesou = value;
    }

    /**
     * Gets the value of the genderSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderSou() {
        return genderSou;
    }

    /**
     * Sets the value of the genderSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderSou(String value) {
        this.genderSou = value;
    }

    /**
     * Gets the value of the birthDaySou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDaySou() {
        return birthDaySou;
    }

    /**
     * Sets the value of the birthDaySou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDaySou(String value) {
        this.birthDaySou = value;
    }

    /**
     * Gets the value of the marriageSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageSou() {
        return marriageSou;
    }

    /**
     * Sets the value of the marriageSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageSou(String value) {
        this.marriageSou = value;
    }

    /**
     * Gets the value of the sonSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonSou() {
        return sonSou;
    }

    /**
     * Sets the value of the sonSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonSou(String value) {
        this.sonSou = value;
    }

    /**
     * Gets the value of the birthPlaceSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlaceSou() {
        return birthPlaceSou;
    }

    /**
     * Sets the value of the birthPlaceSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlaceSou(String value) {
        this.birthPlaceSou = value;
    }

    /**
     * Gets the value of the educationSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationSou() {
        return educationSou;
    }

    /**
     * Sets the value of the educationSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationSou(String value) {
        this.educationSou = value;
    }

    /**
     * Gets the value of the houseHoldSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseHoldSou() {
        return houseHoldSou;
    }

    /**
     * Sets the value of the houseHoldSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseHoldSou(String value) {
        this.houseHoldSou = value;
    }

    /**
     * Gets the value of the salarySou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalarySou() {
        return salarySou;
    }

    /**
     * Sets the value of the salarySou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalarySou(String value) {
        this.salarySou = value;
    }

    /**
     * Gets the value of the staffTypeSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffTypeSou() {
        return staffTypeSou;
    }

    /**
     * Sets the value of the staffTypeSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffTypeSou(String value) {
        this.staffTypeSou = value;
    }

    /**
     * Gets the value of the industryValSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryValSou() {
        return industryValSou;
    }

    /**
     * Sets the value of the industryValSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryValSou(String value) {
        this.industryValSou = value;
    }

    /**
     * Gets the value of the industryValMSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryValMSou() {
        return industryValMSou;
    }

    /**
     * Sets the value of the industryValMSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryValMSou(String value) {
        this.industryValMSou = value;
    }

    /**
     * Gets the value of the copyTypeValSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyTypeValSou() {
        return copyTypeValSou;
    }

    /**
     * Sets the value of the copyTypeValSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyTypeValSou(String value) {
        this.copyTypeValSou = value;
    }

    /**
     * Gets the value of the servYearsSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServYearsSou() {
        return servYearsSou;
    }

    /**
     * Sets the value of the servYearsSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServYearsSou(String value) {
        this.servYearsSou = value;
    }

    /**
     * Gets the value of the unitNameSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitNameSou() {
        return unitNameSou;
    }

    /**
     * Sets the value of the unitNameSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitNameSou(String value) {
        this.unitNameSou = value;
    }

    /**
     * Gets the value of the unitAddrSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitAddrSou() {
        return unitAddrSou;
    }

    /**
     * Sets the value of the unitAddrSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitAddrSou(String value) {
        this.unitAddrSou = value;
    }

    /**
     * Gets the value of the positon2Sou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositon2Sou() {
        return positon2Sou;
    }

    /**
     * Sets the value of the positon2Sou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositon2Sou(String value) {
        this.positon2Sou = value;
    }

    /**
     * Gets the value of the professionDeptSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionDeptSou() {
        return professionDeptSou;
    }

    /**
     * Sets the value of the professionDeptSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionDeptSou(String value) {
        this.professionDeptSou = value;
    }

    /**
     * Gets the value of the salary32Sou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalary32Sou() {
        return salary32Sou;
    }

    /**
     * Sets the value of the salary32Sou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalary32Sou(String value) {
        this.salary32Sou = value;
    }

    /**
     * Gets the value of the unitType2Sou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitType2Sou() {
        return unitType2Sou;
    }

    /**
     * Sets the value of the unitType2Sou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitType2Sou(String value) {
        this.unitType2Sou = value;
    }

    /**
     * Gets the value of the industryVal2Sou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryVal2Sou() {
        return industryVal2Sou;
    }

    /**
     * Sets the value of the industryVal2Sou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryVal2Sou(String value) {
        this.industryVal2Sou = value;
    }

    /**
     * Gets the value of the industryValM2Sou2Sou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryValM2Sou2Sou() {
        return industryValM2Sou2Sou;
    }

    /**
     * Sets the value of the industryValM2Sou2Sou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryValM2Sou2Sou(String value) {
        this.industryValM2Sou2Sou = value;
    }

    /**
     * Gets the value of the copyTypeVal2Sou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyTypeVal2Sou() {
        return copyTypeVal2Sou;
    }

    /**
     * Sets the value of the copyTypeVal2Sou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyTypeVal2Sou(String value) {
        this.copyTypeVal2Sou = value;
    }

    /**
     * Gets the value of the servYears2Sou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServYears2Sou() {
        return servYears2Sou;
    }

    /**
     * Sets the value of the servYears2Sou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServYears2Sou(String value) {
        this.servYears2Sou = value;
    }

    /**
     * Gets the value of the unitName2Sou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitName2Sou() {
        return unitName2Sou;
    }

    /**
     * Sets the value of the unitName2Sou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitName2Sou(String value) {
        this.unitName2Sou = value;
    }

    /**
     * Gets the value of the unitAddr2Sou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitAddr2Sou() {
        return unitAddr2Sou;
    }

    /**
     * Sets the value of the unitAddr2Sou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitAddr2Sou(String value) {
        this.unitAddr2Sou = value;
    }

    /**
     * Gets the value of the yueSalary2Sou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYueSalary2Sou() {
        return yueSalary2Sou;
    }

    /**
     * Sets the value of the yueSalary2Sou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYueSalary2Sou(String value) {
        this.yueSalary2Sou = value;
    }

    /**
     * Gets the value of the housePurchaseSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHousePurchaseSou() {
        return housePurchaseSou;
    }

    /**
     * Sets the value of the housePurchaseSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHousePurchaseSou(String value) {
        this.housePurchaseSou = value;
    }

    /**
     * Gets the value of the houseAmtModeSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseAmtModeSou() {
        return houseAmtModeSou;
    }

    /**
     * Sets the value of the houseAmtModeSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseAmtModeSou(String value) {
        this.houseAmtModeSou = value;
    }

    /**
     * Gets the value of the carPurchaseSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarPurchaseSou() {
        return carPurchaseSou;
    }

    /**
     * Sets the value of the carPurchaseSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarPurchaseSou(String value) {
        this.carPurchaseSou = value;
    }

    /**
     * Gets the value of the carAmtModeSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarAmtModeSou() {
        return carAmtModeSou;
    }

    /**
     * Sets the value of the carAmtModeSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarAmtModeSou(String value) {
        this.carAmtModeSou = value;
    }

    /**
     * Gets the value of the creditLoanMaxSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLoanMaxSou() {
        return creditLoanMaxSou;
    }

    /**
     * Sets the value of the creditLoanMaxSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLoanMaxSou(String value) {
        this.creditLoanMaxSou = value;
    }

    /**
     * Gets the value of the creditLoanChiSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLoanChiSou() {
        return creditLoanChiSou;
    }

    /**
     * Sets the value of the creditLoanChiSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLoanChiSou(String value) {
        this.creditLoanChiSou = value;
    }

    /**
     * Gets the value of the creditLoanLvSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLoanLvSou() {
        return creditLoanLvSou;
    }

    /**
     * Sets the value of the creditLoanLvSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLoanLvSou(String value) {
        this.creditLoanLvSou = value;
    }

    /**
     * Gets the value of the creditLoanChaSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLoanChaSou() {
        return creditLoanChaSou;
    }

    /**
     * Sets the value of the creditLoanChaSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLoanChaSou(String value) {
        this.creditLoanChaSou = value;
    }

    /**
     * Gets the value of the ccNameSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcNameSou() {
        return ccNameSou;
    }

    /**
     * Sets the value of the ccNameSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcNameSou(String value) {
        this.ccNameSou = value;
    }

    /**
     * Gets the value of the ccValSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcValSou() {
        return ccValSou;
    }

    /**
     * Sets the value of the ccValSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcValSou(String value) {
        this.ccValSou = value;
    }

    /**
     * Gets the value of the bankNameSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankNameSou() {
        return bankNameSou;
    }

    /**
     * Sets the value of the bankNameSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankNameSou(String value) {
        this.bankNameSou = value;
    }

    /**
     * Gets the value of the bankValSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankValSou() {
        return bankValSou;
    }

    /**
     * Sets the value of the bankValSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankValSou(String value) {
        this.bankValSou = value;
    }

    /**
     * Gets the value of the bankACSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankACSou() {
        return bankACSou;
    }

    /**
     * Sets the value of the bankACSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankACSou(String value) {
        this.bankACSou = value;
    }

    /**
     * Gets the value of the cntrctNoHeSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctNoHeSou() {
        return cntrctNoHeSou;
    }

    /**
     * Sets the value of the cntrctNoHeSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctNoHeSou(String value) {
        this.cntrctNoHeSou = value;
    }

    /**
     * Gets the value of the guaranteeTypesSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeTypesSou() {
        return guaranteeTypesSou;
    }

    /**
     * Sets the value of the guaranteeTypesSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeTypesSou(String value) {
        this.guaranteeTypesSou = value;
    }

    /**
     * Gets the value of the productTypeSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeSou() {
        return productTypeSou;
    }

    /**
     * Sets the value of the productTypeSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeSou(String value) {
        this.productTypeSou = value;
    }

    /**
     * Gets the value of the codeValSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeValSou() {
        return codeValSou;
    }

    /**
     * Sets the value of the codeValSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeValSou(String value) {
        this.codeValSou = value;
    }

    /**
     * Gets the value of the codeValAmtSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeValAmtSou() {
        return codeValAmtSou;
    }

    /**
     * Sets the value of the codeValAmtSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeValAmtSou(String value) {
        this.codeValAmtSou = value;
    }

    /**
     * Gets the value of the inquirySou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquirySou() {
        return inquirySou;
    }

    /**
     * Sets the value of the inquirySou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquirySou(String value) {
        this.inquirySou = value;
    }

    /**
     * Gets the value of the daKuanSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaKuanSou() {
        return daKuanSou;
    }

    /**
     * Sets the value of the daKuanSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaKuanSou(String value) {
        this.daKuanSou = value;
    }

    /**
     * Gets the value of the rownumgf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRownumgf() {
        return rownumgf;
    }

    /**
     * Sets the value of the rownumgf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRownumgf(String value) {
        this.rownumgf = value;
    }

    /**
     * Gets the value of the entrydategf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrydategf() {
        return entrydategf;
    }

    /**
     * Sets the value of the entrydategf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrydategf(String value) {
        this.entrydategf = value;
    }

    /**
     * Gets the value of the titlegf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitlegf() {
        return titlegf;
    }

    /**
     * Sets the value of the titlegf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitlegf(String value) {
        this.titlegf = value;
    }

    /**
     * Gets the value of the custnamegf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustnamegf() {
        return custnamegf;
    }

    /**
     * Sets the value of the custnamegf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustnamegf(String value) {
        this.custnamegf = value;
    }

    /**
     * Gets the value of the registrationNamegf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNamegf() {
        return registrationNamegf;
    }

    /**
     * Sets the value of the registrationNamegf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNamegf(String value) {
        this.registrationNamegf = value;
    }

    /**
     * Gets the value of the registrationMigf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationMigf() {
        return registrationMigf;
    }

    /**
     * Sets the value of the registrationMigf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationMigf(String value) {
        this.registrationMigf = value;
    }

    /**
     * Gets the value of the cntrctNoHegf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctNoHegf() {
        return cntrctNoHegf;
    }

    /**
     * Sets the value of the cntrctNoHegf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctNoHegf(String value) {
        this.cntrctNoHegf = value;
    }

    /**
     * Gets the value of the idcardgf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcardgf() {
        return idcardgf;
    }

    /**
     * Sets the value of the idcardgf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcardgf(String value) {
        this.idcardgf = value;
    }

    /**
     * Gets the value of the gendergf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGendergf() {
        return gendergf;
    }

    /**
     * Sets the value of the gendergf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGendergf(String value) {
        this.gendergf = value;
    }

    /**
     * Gets the value of the bankValgf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankValgf() {
        return bankValgf;
    }

    /**
     * Sets the value of the bankValgf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankValgf(String value) {
        this.bankValgf = value;
    }

    /**
     * Gets the value of the bankACgf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankACgf() {
        return bankACgf;
    }

    /**
     * Sets the value of the bankACgf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankACgf(String value) {
        this.bankACgf = value;
    }

    /**
     * Gets the value of the purposegf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposegf() {
        return purposegf;
    }

    /**
     * Sets the value of the purposegf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposegf(String value) {
        this.purposegf = value;
    }

    /**
     * Gets the value of the loanAmtgf property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLoanAmtgf() {
        return loanAmtgf;
    }

    /**
     * Sets the value of the loanAmtgf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLoanAmtgf(Long value) {
        this.loanAmtgf = value;
    }

    /**
     * Gets the value of the cntrctPeriodgf property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCntrctPeriodgf() {
        return cntrctPeriodgf;
    }

    /**
     * Sets the value of the cntrctPeriodgf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCntrctPeriodgf(Long value) {
        this.cntrctPeriodgf = value;
    }

    /**
     * Gets the value of the consultationgf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultationgf() {
        return consultationgf;
    }

    /**
     * Sets the value of the consultationgf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultationgf(String value) {
        this.consultationgf = value;
    }

    /**
     * Gets the value of the inquirygf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquirygf() {
        return inquirygf;
    }

    /**
     * Sets the value of the inquirygf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquirygf(String value) {
        this.inquirygf = value;
    }

    /**
     * Gets the value of the realityAmtgf property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRealityAmtgf() {
        return realityAmtgf;
    }

    /**
     * Sets the value of the realityAmtgf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRealityAmtgf(Long value) {
        this.realityAmtgf = value;
    }

    /**
     * Gets the value of the perpertyAmtgf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerpertyAmtgf() {
        return perpertyAmtgf;
    }

    /**
     * Sets the value of the perpertyAmtgf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerpertyAmtgf(String value) {
        this.perpertyAmtgf = value;
    }

    /**
     * Gets the value of the vehicleAmtgf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleAmtgf() {
        return vehicleAmtgf;
    }

    /**
     * Sets the value of the vehicleAmtgf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleAmtgf(String value) {
        this.vehicleAmtgf = value;
    }

    /**
     * Gets the value of the assetsAmtgf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetsAmtgf() {
        return assetsAmtgf;
    }

    /**
     * Sets the value of the assetsAmtgf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetsAmtgf(String value) {
        this.assetsAmtgf = value;
    }

    /**
     * Gets the value of the liabilitiesAmtgf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiabilitiesAmtgf() {
        return liabilitiesAmtgf;
    }

    /**
     * Sets the value of the liabilitiesAmtgf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiabilitiesAmtgf(String value) {
        this.liabilitiesAmtgf = value;
    }

    /**
     * Gets the value of the othercreditgf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthercreditgf() {
        return othercreditgf;
    }

    /**
     * Sets the value of the othercreditgf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthercreditgf(String value) {
        this.othercreditgf = value;
    }

    /**
     * Gets the value of the overduegf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverduegf() {
        return overduegf;
    }

    /**
     * Sets the value of the overduegf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverduegf(String value) {
        this.overduegf = value;
    }

    /**
     * Gets the value of the educationgf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationgf() {
        return educationgf;
    }

    /**
     * Sets the value of the educationgf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationgf(String value) {
        this.educationgf = value;
    }

    /**
     * Gets the value of the marriagegf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriagegf() {
        return marriagegf;
    }

    /**
     * Sets the value of the marriagegf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriagegf(String value) {
        this.marriagegf = value;
    }

    /**
     * Gets the value of the songf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSongf() {
        return songf;
    }

    /**
     * Sets the value of the songf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSongf(String value) {
        this.songf = value;
    }

    /**
     * Gets the value of the houseHoldgf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseHoldgf() {
        return houseHoldgf;
    }

    /**
     * Sets the value of the houseHoldgf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseHoldgf(String value) {
        this.houseHoldgf = value;
    }

    /**
     * Gets the value of the salarygf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalarygf() {
        return salarygf;
    }

    /**
     * Sets the value of the salarygf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalarygf(String value) {
        this.salarygf = value;
    }

    /**
     * Gets the value of the induStryValgf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInduStryValgf() {
        return induStryValgf;
    }

    /**
     * Sets the value of the induStryValgf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInduStryValgf(String value) {
        this.induStryValgf = value;
    }

    /**
     * Gets the value of the copyTypeValgf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyTypeValgf() {
        return copyTypeValgf;
    }

    /**
     * Sets the value of the copyTypeValgf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyTypeValgf(String value) {
        this.copyTypeValgf = value;
    }

    /**
     * Gets the value of the positongf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositongf() {
        return positongf;
    }

    /**
     * Sets the value of the positongf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositongf(String value) {
        this.positongf = value;
    }

    /**
     * Gets the value of the addrgf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrgf() {
        return addrgf;
    }

    /**
     * Sets the value of the addrgf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrgf(String value) {
        this.addrgf = value;
    }

    /**
     * Gets the value of the servYearsgf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServYearsgf() {
        return servYearsgf;
    }

    /**
     * Sets the value of the servYearsgf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServYearsgf(String value) {
        this.servYearsgf = value;
    }

    /**
     * Gets the value of the prdName360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdName360() {
        return prdName360;
    }

    /**
     * Sets the value of the prdName360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdName360(String value) {
        this.prdName360 = value;
    }

    /**
     * Gets the value of the loanAmt2360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanAmt2360() {
        return loanAmt2360;
    }

    /**
     * Sets the value of the loanAmt2360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanAmt2360(String value) {
        this.loanAmt2360 = value;
    }

    /**
     * Gets the value of the cntrctPeriod360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctPeriod360() {
        return cntrctPeriod360;
    }

    /**
     * Sets the value of the cntrctPeriod360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctPeriod360(String value) {
        this.cntrctPeriod360 = value;
    }

    /**
     * Gets the value of the rate360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRate360() {
        return rate360;
    }

    /**
     * Sets the value of the rate360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRate360(String value) {
        this.rate360 = value;
    }

    /**
     * Gets the value of the bankVal360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankVal360() {
        return bankVal360;
    }

    /**
     * Sets the value of the bankVal360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankVal360(String value) {
        this.bankVal360 = value;
    }

    /**
     * Gets the value of the provinceName360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceName360() {
        return provinceName360;
    }

    /**
     * Sets the value of the provinceName360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceName360(String value) {
        this.provinceName360 = value;
    }

    /**
     * Gets the value of the siteName360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteName360() {
        return siteName360;
    }

    /**
     * Sets the value of the siteName360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteName360(String value) {
        this.siteName360 = value;
    }

    /**
     * Gets the value of the dui360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDui360() {
        return dui360;
    }

    /**
     * Sets the value of the dui360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDui360(String value) {
        this.dui360 = value;
    }

    /**
     * Gets the value of the bankAC360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAC360() {
        return bankAC360;
    }

    /**
     * Sets the value of the bankAC360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAC360(String value) {
        this.bankAC360 = value;
    }

    /**
     * Gets the value of the loantypexin360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoantypexin360() {
        return loantypexin360;
    }

    /**
     * Sets the value of the loantypexin360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoantypexin360(String value) {
        this.loantypexin360 = value;
    }

    /**
     * Gets the value of the productType360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType360() {
        return productType360;
    }

    /**
     * Sets the value of the productType360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType360(String value) {
        this.productType360 = value;
    }

    /**
     * Gets the value of the purposeVal360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeVal360() {
        return purposeVal360;
    }

    /**
     * Sets the value of the purposeVal360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeVal360(String value) {
        this.purposeVal360 = value;
    }

    /**
     * Gets the value of the cntrctNoHe360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctNoHe360() {
        return cntrctNoHe360;
    }

    /**
     * Sets the value of the cntrctNoHe360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctNoHe360(String value) {
        this.cntrctNoHe360 = value;
    }

    /**
     * Gets the value of the dicntrctno360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicntrctno360() {
        return dicntrctno360;
    }

    /**
     * Sets the value of the dicntrctno360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicntrctno360(String value) {
        this.dicntrctno360 = value;
    }

    /**
     * Gets the value of the dancntrctno360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDancntrctno360() {
        return dancntrctno360;
    }

    /**
     * Sets the value of the dancntrctno360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDancntrctno360(String value) {
        this.dancntrctno360 = value;
    }

    /**
     * Gets the value of the custName360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustName360() {
        return custName360;
    }

    /**
     * Sets the value of the custName360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustName360(String value) {
        this.custName360 = value;
    }

    /**
     * Gets the value of the idCardNo360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCardNo360() {
        return idCardNo360;
    }

    /**
     * Sets the value of the idCardNo360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCardNo360(String value) {
        this.idCardNo360 = value;
    }

    /**
     * Gets the value of the gender360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender360() {
        return gender360;
    }

    /**
     * Sets the value of the gender360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender360(String value) {
        this.gender360 = value;
    }

    /**
     * Gets the value of the birthday360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthday360() {
        return birthday360;
    }

    /**
     * Sets the value of the birthday360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthday360(String value) {
        this.birthday360 = value;
    }

    /**
     * Gets the value of the mobile2360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile2360() {
        return mobile2360;
    }

    /**
     * Sets the value of the mobile2360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile2360(String value) {
        this.mobile2360 = value;
    }

    /**
     * Gets the value of the marriage360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriage360() {
        return marriage360;
    }

    /**
     * Sets the value of the marriage360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriage360(String value) {
        this.marriage360 = value;
    }

    /**
     * Gets the value of the houseHold360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseHold360() {
        return houseHold360;
    }

    /**
     * Sets the value of the houseHold360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseHold360(String value) {
        this.houseHold360 = value;
    }

    /**
     * Gets the value of the education360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducation360() {
        return education360;
    }

    /**
     * Sets the value of the education360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducation360(String value) {
        this.education360 = value;
    }

    /**
     * Gets the value of the addr360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr360() {
        return addr360;
    }

    /**
     * Sets the value of the addr360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr360(String value) {
        this.addr360 = value;
    }

    /**
     * Gets the value of the unitName360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitName360() {
        return unitName360;
    }

    /**
     * Sets the value of the unitName360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitName360(String value) {
        this.unitName360 = value;
    }

    /**
     * Gets the value of the siteCityName360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteCityName360() {
        return siteCityName360;
    }

    /**
     * Sets the value of the siteCityName360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteCityName360(String value) {
        this.siteCityName360 = value;
    }

    /**
     * Gets the value of the salary2360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalary2360() {
        return salary2360;
    }

    /**
     * Sets the value of the salary2360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalary2360(String value) {
        this.salary2360 = value;
    }

    /**
     * Gets the value of the positon2360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositon2360() {
        return positon2360;
    }

    /**
     * Sets the value of the positon2360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositon2360(String value) {
        this.positon2360 = value;
    }

    /**
     * Gets the value of the unitAddr360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitAddr360() {
        return unitAddr360;
    }

    /**
     * Sets the value of the unitAddr360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitAddr360(String value) {
        this.unitAddr360 = value;
    }

    /**
     * Gets the value of the copyTypeVal360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyTypeVal360() {
        return copyTypeVal360;
    }

    /**
     * Sets the value of the copyTypeVal360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyTypeVal360(String value) {
        this.copyTypeVal360 = value;
    }

    /**
     * Gets the value of the staffType360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffType360() {
        return staffType360;
    }

    /**
     * Sets the value of the staffType360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffType360(String value) {
        this.staffType360 = value;
    }

    /**
     * Gets the value of the professionDept360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionDept360() {
        return professionDept360;
    }

    /**
     * Sets the value of the professionDept360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionDept360(String value) {
        this.professionDept360 = value;
    }

    /**
     * Gets the value of the servYrars360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServYrars360() {
        return servYrars360;
    }

    /**
     * Sets the value of the servYrars360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServYrars360(String value) {
        this.servYrars360 = value;
    }

    /**
     * Gets the value of the induStryVal2360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInduStryVal2360() {
        return induStryVal2360;
    }

    /**
     * Sets the value of the induStryVal2360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInduStryVal2360(String value) {
        this.induStryVal2360 = value;
    }

    /**
     * Gets the value of the housePurchase360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHousePurchase360() {
        return housePurchase360;
    }

    /**
     * Sets the value of the housePurchase360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHousePurchase360(String value) {
        this.housePurchase360 = value;
    }

    /**
     * Gets the value of the houseAmtMode360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseAmtMode360() {
        return houseAmtMode360;
    }

    /**
     * Sets the value of the houseAmtMode360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseAmtMode360(String value) {
        this.houseAmtMode360 = value;
    }

    /**
     * Gets the value of the creditLoan360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLoan360() {
        return creditLoan360;
    }

    /**
     * Sets the value of the creditLoan360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLoan360(String value) {
        this.creditLoan360 = value;
    }

    /**
     * Gets the value of the carPurchase360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarPurchase360() {
        return carPurchase360;
    }

    /**
     * Sets the value of the carPurchase360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarPurchase360(String value) {
        this.carPurchase360 = value;
    }

    /**
     * Gets the value of the carAmtMode360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarAmtMode360() {
        return carAmtMode360;
    }

    /**
     * Sets the value of the carAmtMode360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarAmtMode360(String value) {
        this.carAmtMode360 = value;
    }

    /**
     * Gets the value of the crdtCardTtlNum360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdtCardTtlNum360() {
        return crdtCardTtlNum360;
    }

    /**
     * Sets the value of the crdtCardTtlNum360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrdtCardTtlNum360(String value) {
        this.crdtCardTtlNum360 = value;
    }

    /**
     * Gets the value of the ccName360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcName360() {
        return ccName360;
    }

    /**
     * Sets the value of the ccName360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcName360(String value) {
        this.ccName360 = value;
    }

    /**
     * Gets the value of the ccVal360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcVal360() {
        return ccVal360;
    }

    /**
     * Sets the value of the ccVal360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcVal360(String value) {
        this.ccVal360 = value;
    }

    /**
     * Gets the value of the ccMobile360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcMobile360() {
        return ccMobile360;
    }

    /**
     * Sets the value of the ccMobile360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcMobile360(String value) {
        this.ccMobile360 = value;
    }

    /**
     * Gets the value of the ccAddr360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcAddr360() {
        return ccAddr360;
    }

    /**
     * Sets the value of the ccAddr360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcAddr360(String value) {
        this.ccAddr360 = value;
    }

    /**
     * Gets the value of the ledgerval360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLedgerval360() {
        return ledgerval360;
    }

    /**
     * Sets the value of the ledgerval360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLedgerval360(String value) {
        this.ledgerval360 = value;
    }

    /**
     * Gets the value of the ledger360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLedger360() {
        return ledger360;
    }

    /**
     * Sets the value of the ledger360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLedger360(String value) {
        this.ledger360 = value;
    }

    /**
     * Gets the value of the inquiry360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquiry360() {
        return inquiry360;
    }

    /**
     * Sets the value of the inquiry360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquiry360(String value) {
        this.inquiry360 = value;
    }

    /**
     * Gets the value of the dakuan360 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDakuan360() {
        return dakuan360;
    }

    /**
     * Sets the value of the dakuan360 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDakuan360(String value) {
        this.dakuan360 = value;
    }

    /**
     * Gets the value of the prdNoGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdNoGao() {
        return prdNoGao;
    }

    /**
     * Sets the value of the prdNoGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdNoGao(String value) {
        this.prdNoGao = value;
    }

    /**
     * Gets the value of the purposeValGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeValGao() {
        return purposeValGao;
    }

    /**
     * Sets the value of the purposeValGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeValGao(String value) {
        this.purposeValGao = value;
    }

    /**
     * Gets the value of the custNameGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustNameGao() {
        return custNameGao;
    }

    /**
     * Sets the value of the custNameGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustNameGao(String value) {
        this.custNameGao = value;
    }

    /**
     * Gets the value of the idCardNoGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCardNoGao() {
        return idCardNoGao;
    }

    /**
     * Sets the value of the idCardNoGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCardNoGao(String value) {
        this.idCardNoGao = value;
    }

    /**
     * Gets the value of the genderGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderGao() {
        return genderGao;
    }

    /**
     * Sets the value of the genderGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderGao(String value) {
        this.genderGao = value;
    }

    /**
     * Gets the value of the birthdayGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthdayGao() {
        return birthdayGao;
    }

    /**
     * Sets the value of the birthdayGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthdayGao(String value) {
        this.birthdayGao = value;
    }

    /**
     * Gets the value of the mobile2Gao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile2Gao() {
        return mobile2Gao;
    }

    /**
     * Sets the value of the mobile2Gao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile2Gao(String value) {
        this.mobile2Gao = value;
    }

    /**
     * Gets the value of the marriageGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageGao() {
        return marriageGao;
    }

    /**
     * Sets the value of the marriageGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageGao(String value) {
        this.marriageGao = value;
    }

    /**
     * Gets the value of the sonGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonGao() {
        return sonGao;
    }

    /**
     * Sets the value of the sonGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonGao(String value) {
        this.sonGao = value;
    }

    /**
     * Gets the value of the houseHoldGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseHoldGao() {
        return houseHoldGao;
    }

    /**
     * Sets the value of the houseHoldGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseHoldGao(String value) {
        this.houseHoldGao = value;
    }

    /**
     * Gets the value of the educationGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationGao() {
        return educationGao;
    }

    /**
     * Sets the value of the educationGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationGao(String value) {
        this.educationGao = value;
    }

    /**
     * Gets the value of the addrGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrGao() {
        return addrGao;
    }

    /**
     * Sets the value of the addrGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrGao(String value) {
        this.addrGao = value;
    }

    /**
     * Gets the value of the salary2Gao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalary2Gao() {
        return salary2Gao;
    }

    /**
     * Sets the value of the salary2Gao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalary2Gao(String value) {
        this.salary2Gao = value;
    }

    /**
     * Gets the value of the siteCityNameGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteCityNameGao() {
        return siteCityNameGao;
    }

    /**
     * Sets the value of the siteCityNameGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteCityNameGao(String value) {
        this.siteCityNameGao = value;
    }

    /**
     * Gets the value of the staffTypeGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffTypeGao() {
        return staffTypeGao;
    }

    /**
     * Sets the value of the staffTypeGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffTypeGao(String value) {
        this.staffTypeGao = value;
    }

    /**
     * Gets the value of the induStryVal2Gao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInduStryVal2Gao() {
        return induStryVal2Gao;
    }

    /**
     * Sets the value of the induStryVal2Gao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInduStryVal2Gao(String value) {
        this.induStryVal2Gao = value;
    }

    /**
     * Gets the value of the copyTypeValGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyTypeValGao() {
        return copyTypeValGao;
    }

    /**
     * Sets the value of the copyTypeValGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyTypeValGao(String value) {
        this.copyTypeValGao = value;
    }

    /**
     * Gets the value of the servYrarsGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServYrarsGao() {
        return servYrarsGao;
    }

    /**
     * Sets the value of the servYrarsGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServYrarsGao(String value) {
        this.servYrarsGao = value;
    }

    /**
     * Gets the value of the unitNameGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitNameGao() {
        return unitNameGao;
    }

    /**
     * Sets the value of the unitNameGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitNameGao(String value) {
        this.unitNameGao = value;
    }

    /**
     * Gets the value of the unitAddrGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitAddrGao() {
        return unitAddrGao;
    }

    /**
     * Sets the value of the unitAddrGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitAddrGao(String value) {
        this.unitAddrGao = value;
    }

    /**
     * Gets the value of the positon2Gao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositon2Gao() {
        return positon2Gao;
    }

    /**
     * Sets the value of the positon2Gao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositon2Gao(String value) {
        this.positon2Gao = value;
    }

    /**
     * Gets the value of the professionDeptGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionDeptGao() {
        return professionDeptGao;
    }

    /**
     * Sets the value of the professionDeptGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionDeptGao(String value) {
        this.professionDeptGao = value;
    }

    /**
     * Gets the value of the salary3Gao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalary3Gao() {
        return salary3Gao;
    }

    /**
     * Sets the value of the salary3Gao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalary3Gao(String value) {
        this.salary3Gao = value;
    }

    /**
     * Gets the value of the siteUnitNameGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteUnitNameGao() {
        return siteUnitNameGao;
    }

    /**
     * Sets the value of the siteUnitNameGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteUnitNameGao(String value) {
        this.siteUnitNameGao = value;
    }

    /**
     * Gets the value of the unitTypeGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitTypeGao() {
        return unitTypeGao;
    }

    /**
     * Sets the value of the unitTypeGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitTypeGao(String value) {
        this.unitTypeGao = value;
    }

    /**
     * Gets the value of the unitInduStryVal2Gao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitInduStryVal2Gao() {
        return unitInduStryVal2Gao;
    }

    /**
     * Sets the value of the unitInduStryVal2Gao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitInduStryVal2Gao(String value) {
        this.unitInduStryVal2Gao = value;
    }

    /**
     * Gets the value of the unitTypeValGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitTypeValGao() {
        return unitTypeValGao;
    }

    /**
     * Sets the value of the unitTypeValGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitTypeValGao(String value) {
        this.unitTypeValGao = value;
    }

    /**
     * Gets the value of the unitStartTimeGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitStartTimeGao() {
        return unitStartTimeGao;
    }

    /**
     * Sets the value of the unitStartTimeGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitStartTimeGao(String value) {
        this.unitStartTimeGao = value;
    }

    /**
     * Gets the value of the staffName2Gao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffName2Gao() {
        return staffName2Gao;
    }

    /**
     * Sets the value of the staffName2Gao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffName2Gao(String value) {
        this.staffName2Gao = value;
    }

    /**
     * Gets the value of the staffAddr2Gao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffAddr2Gao() {
        return staffAddr2Gao;
    }

    /**
     * Sets the value of the staffAddr2Gao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffAddr2Gao(String value) {
        this.staffAddr2Gao = value;
    }

    /**
     * Gets the value of the yueSalaryGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYueSalaryGao() {
        return yueSalaryGao;
    }

    /**
     * Sets the value of the yueSalaryGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYueSalaryGao(String value) {
        this.yueSalaryGao = value;
    }

    /**
     * Gets the value of the ccNameGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcNameGao() {
        return ccNameGao;
    }

    /**
     * Sets the value of the ccNameGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcNameGao(String value) {
        this.ccNameGao = value;
    }

    /**
     * Gets the value of the ccValGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcValGao() {
        return ccValGao;
    }

    /**
     * Sets the value of the ccValGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcValGao(String value) {
        this.ccValGao = value;
    }

    /**
     * Gets the value of the ccMobileGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcMobileGao() {
        return ccMobileGao;
    }

    /**
     * Sets the value of the ccMobileGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcMobileGao(String value) {
        this.ccMobileGao = value;
    }

    /**
     * Gets the value of the ccAddrGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcAddrGao() {
        return ccAddrGao;
    }

    /**
     * Sets the value of the ccAddrGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcAddrGao(String value) {
        this.ccAddrGao = value;
    }

    /**
     * Gets the value of the registrationNameGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNameGao() {
        return registrationNameGao;
    }

    /**
     * Sets the value of the registrationNameGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNameGao(String value) {
        this.registrationNameGao = value;
    }

    /**
     * Gets the value of the registrationMiGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationMiGao() {
        return registrationMiGao;
    }

    /**
     * Sets the value of the registrationMiGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationMiGao(String value) {
        this.registrationMiGao = value;
    }

    /**
     * Gets the value of the loanAmt2Gao property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLoanAmt2Gao() {
        return loanAmt2Gao;
    }

    /**
     * Sets the value of the loanAmt2Gao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLoanAmt2Gao(Long value) {
        this.loanAmt2Gao = value;
    }

    /**
     * Gets the value of the cntrctPeriodGao property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCntrctPeriodGao() {
        return cntrctPeriodGao;
    }

    /**
     * Sets the value of the cntrctPeriodGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCntrctPeriodGao(Long value) {
        this.cntrctPeriodGao = value;
    }

    /**
     * Gets the value of the bankValGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankValGao() {
        return bankValGao;
    }

    /**
     * Sets the value of the bankValGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankValGao(String value) {
        this.bankValGao = value;
    }

    /**
     * Gets the value of the bankACGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankACGao() {
        return bankACGao;
    }

    /**
     * Sets the value of the bankACGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankACGao(String value) {
        this.bankACGao = value;
    }

    /**
     * Gets the value of the cntrctNoHeGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctNoHeGao() {
        return cntrctNoHeGao;
    }

    /**
     * Sets the value of the cntrctNoHeGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctNoHeGao(String value) {
        this.cntrctNoHeGao = value;
    }

    /**
     * Gets the value of the cntrctNoGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctNoGao() {
        return cntrctNoGao;
    }

    /**
     * Sets the value of the cntrctNoGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctNoGao(String value) {
        this.cntrctNoGao = value;
    }

    /**
     * Gets the value of the guaranteeTypesGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeTypesGao() {
        return guaranteeTypesGao;
    }

    /**
     * Sets the value of the guaranteeTypesGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeTypesGao(String value) {
        this.guaranteeTypesGao = value;
    }

    /**
     * Gets the value of the productTypeGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeGao() {
        return productTypeGao;
    }

    /**
     * Sets the value of the productTypeGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeGao(String value) {
        this.productTypeGao = value;
    }

    /**
     * Gets the value of the codeValGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeValGao() {
        return codeValGao;
    }

    /**
     * Sets the value of the codeValGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeValGao(String value) {
        this.codeValGao = value;
    }

    /**
     * Gets the value of the codeValAmtGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeValAmtGao() {
        return codeValAmtGao;
    }

    /**
     * Sets the value of the codeValAmtGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeValAmtGao(String value) {
        this.codeValAmtGao = value;
    }

    /**
     * Gets the value of the inquiryGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquiryGao() {
        return inquiryGao;
    }

    /**
     * Sets the value of the inquiryGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquiryGao(String value) {
        this.inquiryGao = value;
    }

    /**
     * Gets the value of the daKuanGao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaKuanGao() {
        return daKuanGao;
    }

    /**
     * Sets the value of the daKuanGao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaKuanGao(String value) {
        this.daKuanGao = value;
    }

    /**
     * Gets the value of the codeValMaMa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeValMaMa() {
        return codeValMaMa;
    }

    /**
     * Sets the value of the codeValMaMa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeValMaMa(String value) {
        this.codeValMaMa = value;
    }

    /**
     * Gets the value of the codeValAmtMaMa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeValAmtMaMa() {
        return codeValAmtMaMa;
    }

    /**
     * Sets the value of the codeValAmtMaMa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeValAmtMaMa(String value) {
        this.codeValAmtMaMa = value;
    }

    /**
     * Gets the value of the inquiryMaMa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquiryMaMa() {
        return inquiryMaMa;
    }

    /**
     * Sets the value of the inquiryMaMa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquiryMaMa(String value) {
        this.inquiryMaMa = value;
    }

    /**
     * Gets the value of the daKuanMaMa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaKuanMaMa() {
        return daKuanMaMa;
    }

    /**
     * Sets the value of the daKuanMaMa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaKuanMaMa(String value) {
        this.daKuanMaMa = value;
    }

    /**
     * Gets the value of the cntrctnoMao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctnoMao() {
        return cntrctnoMao;
    }

    /**
     * Sets the value of the cntrctnoMao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctnoMao(String value) {
        this.cntrctnoMao = value;
    }

    /**
     * Gets the value of the pednameMao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPednameMao() {
        return pednameMao;
    }

    /**
     * Sets the value of the pednameMao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPednameMao(String value) {
        this.pednameMao = value;
    }

    /**
     * Gets the value of the categoryMao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryMao() {
        return categoryMao;
    }

    /**
     * Sets the value of the categoryMao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryMao(String value) {
        this.categoryMao = value;
    }

    /**
     * Gets the value of the applcodeMao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplcodeMao() {
        return applcodeMao;
    }

    /**
     * Sets the value of the applcodeMao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplcodeMao(String value) {
        this.applcodeMao = value;
    }

    /**
     * Gets the value of the custnameMao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustnameMao() {
        return custnameMao;
    }

    /**
     * Sets the value of the custnameMao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustnameMao(String value) {
        this.custnameMao = value;
    }

    /**
     * Gets the value of the idcardnoMao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcardnoMao() {
        return idcardnoMao;
    }

    /**
     * Sets the value of the idcardnoMao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcardnoMao(String value) {
        this.idcardnoMao = value;
    }

    /**
     * Gets the value of the loanamtMao property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanamtMao() {
        return loanamtMao;
    }

    /**
     * Sets the value of the loanamtMao property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanamtMao(BigDecimal value) {
        this.loanamtMao = value;
    }

    /**
     * Gets the value of the periodMao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodMao() {
        return periodMao;
    }

    /**
     * Sets the value of the periodMao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodMao(Integer value) {
        this.periodMao = value;
    }

    /**
     * Gets the value of the appramtMao property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAppramtMao() {
        return appramtMao;
    }

    /**
     * Sets the value of the appramtMao property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAppramtMao(BigDecimal value) {
        this.appramtMao = value;
    }

    /**
     * Gets the value of the actualPayAmtMao property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualPayAmtMao() {
        return actualPayAmtMao;
    }

    /**
     * Sets the value of the actualPayAmtMao property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualPayAmtMao(BigDecimal value) {
        this.actualPayAmtMao = value;
    }

    /**
     * Gets the value of the consultLW property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsultLW() {
        return consultLW;
    }

    /**
     * Sets the value of the consultLW property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsultLW(BigDecimal value) {
        this.consultLW = value;
    }

    /**
     * Gets the value of the manageLW property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getManageLW() {
        return manageLW;
    }

    /**
     * Sets the value of the manageLW property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setManageLW(BigDecimal value) {
        this.manageLW = value;
    }

    /**
     * Gets the value of the codeGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeGjs() {
        return codeGjs;
    }

    /**
     * Sets the value of the codeGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeGjs(String value) {
        this.codeGjs = value;
    }

    /**
     * Gets the value of the mechanGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMechanGjs() {
        return mechanGjs;
    }

    /**
     * Sets the value of the mechanGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMechanGjs(String value) {
        this.mechanGjs = value;
    }

    /**
     * Gets the value of the custnameGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustnameGjs() {
        return custnameGjs;
    }

    /**
     * Sets the value of the custnameGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustnameGjs(String value) {
        this.custnameGjs = value;
    }

    /**
     * Gets the value of the idcardtypeGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcardtypeGjs() {
        return idcardtypeGjs;
    }

    /**
     * Sets the value of the idcardtypeGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcardtypeGjs(String value) {
        this.idcardtypeGjs = value;
    }

    /**
     * Gets the value of the idCardNoGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCardNoGjs() {
        return idCardNoGjs;
    }

    /**
     * Sets the value of the idCardNoGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCardNoGjs(String value) {
        this.idCardNoGjs = value;
    }

    /**
     * Gets the value of the mobileGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileGjs() {
        return mobileGjs;
    }

    /**
     * Sets the value of the mobileGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileGjs(String value) {
        this.mobileGjs = value;
    }

    /**
     * Gets the value of the bankvalGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankvalGjs() {
        return bankvalGjs;
    }

    /**
     * Sets the value of the bankvalGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankvalGjs(String value) {
        this.bankvalGjs = value;
    }

    /**
     * Gets the value of the bankacGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankacGjs() {
        return bankacGjs;
    }

    /**
     * Sets the value of the bankacGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankacGjs(String value) {
        this.bankacGjs = value;
    }

    /**
     * Gets the value of the genderGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderGjs() {
        return genderGjs;
    }

    /**
     * Sets the value of the genderGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderGjs(String value) {
        this.genderGjs = value;
    }

    /**
     * Gets the value of the enucationGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnucationGjs() {
        return enucationGjs;
    }

    /**
     * Sets the value of the enucationGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnucationGjs(String value) {
        this.enucationGjs = value;
    }

    /**
     * Gets the value of the marriageGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageGjs() {
        return marriageGjs;
    }

    /**
     * Sets the value of the marriageGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageGjs(String value) {
        this.marriageGjs = value;
    }

    /**
     * Gets the value of the sitenameGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitenameGjs() {
        return sitenameGjs;
    }

    /**
     * Sets the value of the sitenameGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitenameGjs(String value) {
        this.sitenameGjs = value;
    }

    /**
     * Gets the value of the householdGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseholdGjs() {
        return householdGjs;
    }

    /**
     * Sets the value of the householdGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseholdGjs(String value) {
        this.householdGjs = value;
    }

    /**
     * Gets the value of the salaryGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalaryGjs() {
        return salaryGjs;
    }

    /**
     * Sets the value of the salaryGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaryGjs(String value) {
        this.salaryGjs = value;
    }

    /**
     * Gets the value of the servyearsGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServyearsGjs() {
        return servyearsGjs;
    }

    /**
     * Sets the value of the servyearsGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServyearsGjs(String value) {
        this.servyearsGjs = value;
    }

    /**
     * Gets the value of the unitnameGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitnameGjs() {
        return unitnameGjs;
    }

    /**
     * Sets the value of the unitnameGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitnameGjs(String value) {
        this.unitnameGjs = value;
    }

    /**
     * Gets the value of the industryvalGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryvalGjs() {
        return industryvalGjs;
    }

    /**
     * Sets the value of the industryvalGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryvalGjs(String value) {
        this.industryvalGjs = value;
    }

    /**
     * Gets the value of the stafftypeGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStafftypeGjs() {
        return stafftypeGjs;
    }

    /**
     * Sets the value of the stafftypeGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStafftypeGjs(String value) {
        this.stafftypeGjs = value;
    }

    /**
     * Gets the value of the positionGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionGjs() {
        return positionGjs;
    }

    /**
     * Sets the value of the positionGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionGjs(String value) {
        this.positionGjs = value;
    }

    /**
     * Gets the value of the copytypevalGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopytypevalGjs() {
        return copytypevalGjs;
    }

    /**
     * Sets the value of the copytypevalGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopytypevalGjs(String value) {
        this.copytypevalGjs = value;
    }

    /**
     * Gets the value of the guaranteetypesGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteetypesGjs() {
        return guaranteetypesGjs;
    }

    /**
     * Sets the value of the guaranteetypesGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteetypesGjs(String value) {
        this.guaranteetypesGjs = value;
    }

    /**
     * Gets the value of the guaranteeGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeGjs() {
        return guaranteeGjs;
    }

    /**
     * Sets the value of the guaranteeGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeGjs(String value) {
        this.guaranteeGjs = value;
    }

    /**
     * Gets the value of the appramtGjs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAppramtGjs() {
        return appramtGjs;
    }

    /**
     * Sets the value of the appramtGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAppramtGjs(BigDecimal value) {
        this.appramtGjs = value;
    }

    /**
     * Gets the value of the periodpGjs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodpGjs() {
        return periodpGjs;
    }

    /**
     * Sets the value of the periodpGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodpGjs(Integer value) {
        this.periodpGjs = value;
    }

    /**
     * Gets the value of the periodtypeGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodtypeGjs() {
        return periodtypeGjs;
    }

    /**
     * Sets the value of the periodtypeGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodtypeGjs(String value) {
        this.periodtypeGjs = value;
    }

    /**
     * Gets the value of the assetrateGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetrateGjs() {
        return assetrateGjs;
    }

    /**
     * Sets the value of the assetrateGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetrateGjs(String value) {
        this.assetrateGjs = value;
    }

    /**
     * Gets the value of the repaymentmethodGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepaymentmethodGjs() {
        return repaymentmethodGjs;
    }

    /**
     * Sets the value of the repaymentmethodGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepaymentmethodGjs(String value) {
        this.repaymentmethodGjs = value;
    }

    /**
     * Gets the value of the periodcGjs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodcGjs() {
        return periodcGjs;
    }

    /**
     * Sets the value of the periodcGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodcGjs(Integer value) {
        this.periodcGjs = value;
    }

    /**
     * Gets the value of the srevicerateGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrevicerateGjs() {
        return srevicerateGjs;
    }

    /**
     * Sets the value of the srevicerateGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrevicerateGjs(String value) {
        this.srevicerateGjs = value;
    }

    /**
     * Gets the value of the fixedcostGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedcostGjs() {
        return fixedcostGjs;
    }

    /**
     * Sets the value of the fixedcostGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedcostGjs(String value) {
        this.fixedcostGjs = value;
    }

    /**
     * Gets the value of the loanpurposevalGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanpurposevalGjs() {
        return loanpurposevalGjs;
    }

    /**
     * Sets the value of the loanpurposevalGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanpurposevalGjs(String value) {
        this.loanpurposevalGjs = value;
    }

    /**
     * Gets the value of the mortGjs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMortGjs() {
        return mortGjs;
    }

    /**
     * Sets the value of the mortGjs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMortGjs(String value) {
        this.mortGjs = value;
    }

    /**
     * Gets the value of the inquiryDing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquiryDing() {
        return inquiryDing;
    }

    /**
     * Sets the value of the inquiryDing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquiryDing(String value) {
        this.inquiryDing = value;
    }

    /**
     * Gets the value of the consultationFeeDing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultationFeeDing() {
        return consultationFeeDing;
    }

    /**
     * Sets the value of the consultationFeeDing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultationFeeDing(String value) {
        this.consultationFeeDing = value;
    }

    /**
     * Gets the value of the manageFeeDing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManageFeeDing() {
        return manageFeeDing;
    }

    /**
     * Sets the value of the manageFeeDing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManageFeeDing(String value) {
        this.manageFeeDing = value;
    }

    /**
     * Gets the value of the dakuanljx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDakuanljx() {
        return dakuanljx;
    }

    /**
     * Sets the value of the dakuanljx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDakuanljx(String value) {
        this.dakuanljx = value;
    }

    /**
     * Gets the value of the serialEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialEL() {
        return serialEL;
    }

    /**
     * Sets the value of the serialEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialEL(String value) {
        this.serialEL = value;
    }

    /**
     * Gets the value of the datastatusEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatastatusEL() {
        return datastatusEL;
    }

    /**
     * Sets the value of the datastatusEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatastatusEL(String value) {
        this.datastatusEL = value;
    }

    /**
     * Gets the value of the custnameEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustnameEL() {
        return custnameEL;
    }

    /**
     * Sets the value of the custnameEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustnameEL(String value) {
        this.custnameEL = value;
    }

    /**
     * Gets the value of the genderelEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderelEL() {
        return genderelEL;
    }

    /**
     * Sets the value of the genderelEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderelEL(String value) {
        this.genderelEL = value;
    }

    /**
     * Gets the value of the ageEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeEL() {
        return ageEL;
    }

    /**
     * Sets the value of the ageEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeEL(String value) {
        this.ageEL = value;
    }

    /**
     * Gets the value of the idcardtypeELdis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcardtypeELdis() {
        return idcardtypeELdis;
    }

    /**
     * Sets the value of the idcardtypeELdis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcardtypeELdis(String value) {
        this.idcardtypeELdis = value;
    }

    /**
     * Gets the value of the idcardtypeEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcardtypeEL() {
        return idcardtypeEL;
    }

    /**
     * Sets the value of the idcardtypeEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcardtypeEL(String value) {
        this.idcardtypeEL = value;
    }

    /**
     * Gets the value of the idcardnoEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcardnoEL() {
        return idcardnoEL;
    }

    /**
     * Sets the value of the idcardnoEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcardnoEL(String value) {
        this.idcardnoEL = value;
    }

    /**
     * Gets the value of the idcardenddateEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcardenddateEL() {
        return idcardenddateEL;
    }

    /**
     * Sets the value of the idcardenddateEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcardenddateEL(String value) {
        this.idcardenddateEL = value;
    }

    /**
     * Gets the value of the birthplaceEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthplaceEL() {
        return birthplaceEL;
    }

    /**
     * Sets the value of the birthplaceEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthplaceEL(String value) {
        this.birthplaceEL = value;
    }

    /**
     * Gets the value of the marriageELdis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageELdis() {
        return marriageELdis;
    }

    /**
     * Sets the value of the marriageELdis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageELdis(String value) {
        this.marriageELdis = value;
    }

    /**
     * Gets the value of the marriageEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageEL() {
        return marriageEL;
    }

    /**
     * Sets the value of the marriageEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageEL(String value) {
        this.marriageEL = value;
    }

    /**
     * Gets the value of the e1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE1() {
        return e1;
    }

    /**
     * Sets the value of the e1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE1(String value) {
        this.e1 = value;
    }

    /**
     * Gets the value of the housetypeELdis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHousetypeELdis() {
        return housetypeELdis;
    }

    /**
     * Sets the value of the housetypeELdis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHousetypeELdis(String value) {
        this.housetypeELdis = value;
    }

    /**
     * Gets the value of the housetypeEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHousetypeEL() {
        return housetypeEL;
    }

    /**
     * Sets the value of the housetypeEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHousetypeEL(String value) {
        this.housetypeEL = value;
    }

    /**
     * Gets the value of the educationELdis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationELdis() {
        return educationELdis;
    }

    /**
     * Sets the value of the educationELdis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationELdis(String value) {
        this.educationELdis = value;
    }

    /**
     * Gets the value of the educationEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationEL() {
        return educationEL;
    }

    /**
     * Sets the value of the educationEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationEL(String value) {
        this.educationEL = value;
    }

    /**
     * Gets the value of the e3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE3() {
        return e3;
    }

    /**
     * Sets the value of the e3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE3(String value) {
        this.e3 = value;
    }

    /**
     * Gets the value of the e4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE4() {
        return e4;
    }

    /**
     * Sets the value of the e4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE4(String value) {
        this.e4 = value;
    }

    /**
     * Gets the value of the crdtNulEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdtNulEL() {
        return crdtNulEL;
    }

    /**
     * Sets the value of the crdtNulEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrdtNulEL(String value) {
        this.crdtNulEL = value;
    }

    /**
     * Gets the value of the crdtLmtEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdtLmtEL() {
        return crdtLmtEL;
    }

    /**
     * Sets the value of the crdtLmtEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrdtLmtEL(String value) {
        this.crdtLmtEL = value;
    }

    /**
     * Gets the value of the carMthdEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarMthdEL() {
        return carMthdEL;
    }

    /**
     * Sets the value of the carMthdEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarMthdEL(String value) {
        this.carMthdEL = value;
    }

    /**
     * Gets the value of the estateModeEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstateModeEL() {
        return estateModeEL;
    }

    /**
     * Sets the value of the estateModeEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstateModeEL(String value) {
        this.estateModeEL = value;
    }

    /**
     * Gets the value of the mobileEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileEL() {
        return mobileEL;
    }

    /**
     * Sets the value of the mobileEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileEL(String value) {
        this.mobileEL = value;
    }

    /**
     * Gets the value of the householdEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseholdEL() {
        return householdEL;
    }

    /**
     * Sets the value of the householdEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseholdEL(String value) {
        this.householdEL = value;
    }

    /**
     * Gets the value of the provinceEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceEL() {
        return provinceEL;
    }

    /**
     * Sets the value of the provinceEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceEL(String value) {
        this.provinceEL = value;
    }

    /**
     * Gets the value of the cityareaEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityareaEL() {
        return cityareaEL;
    }

    /**
     * Sets the value of the cityareaEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityareaEL(String value) {
        this.cityareaEL = value;
    }

    /**
     * Gets the value of the mailEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailEL() {
        return mailEL;
    }

    /**
     * Sets the value of the mailEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailEL(String value) {
        this.mailEL = value;
    }

    /**
     * Gets the value of the qqEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQqEL() {
        return qqEL;
    }

    /**
     * Sets the value of the qqEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQqEL(String value) {
        this.qqEL = value;
    }

    /**
     * Gets the value of the e5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE5() {
        return e5;
    }

    /**
     * Sets the value of the e5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE5(String value) {
        this.e5 = value;
    }

    /**
     * Gets the value of the telEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelEL() {
        return telEL;
    }

    /**
     * Sets the value of the telEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelEL(String value) {
        this.telEL = value;
    }

    /**
     * Gets the value of the prounitnameEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProunitnameEL() {
        return prounitnameEL;
    }

    /**
     * Sets the value of the prounitnameEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProunitnameEL(String value) {
        this.prounitnameEL = value;
    }

    /**
     * Gets the value of the prounitaddrEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProunitaddrEL() {
        return prounitaddrEL;
    }

    /**
     * Sets the value of the prounitaddrEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProunitaddrEL(String value) {
        this.prounitaddrEL = value;
    }

    /**
     * Gets the value of the positionEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionEL() {
        return positionEL;
    }

    /**
     * Sets the value of the positionEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionEL(String value) {
        this.positionEL = value;
    }

    /**
     * Gets the value of the copytypevalELdis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopytypevalELdis() {
        return copytypevalELdis;
    }

    /**
     * Sets the value of the copytypevalELdis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopytypevalELdis(String value) {
        this.copytypevalELdis = value;
    }

    /**
     * Gets the value of the copytypevalEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopytypevalEL() {
        return copytypevalEL;
    }

    /**
     * Sets the value of the copytypevalEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopytypevalEL(String value) {
        this.copytypevalEL = value;
    }

    /**
     * Gets the value of the industryvalEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryvalEL() {
        return industryvalEL;
    }

    /**
     * Sets the value of the industryvalEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryvalEL(String value) {
        this.industryvalEL = value;
    }

    /**
     * Gets the value of the stafftypeEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStafftypeEL() {
        return stafftypeEL;
    }

    /**
     * Sets the value of the stafftypeEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStafftypeEL(String value) {
        this.stafftypeEL = value;
    }

    /**
     * Gets the value of the e6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE6() {
        return e6;
    }

    /**
     * Sets the value of the e6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE6(String value) {
        this.e6 = value;
    }

    /**
     * Gets the value of the salaryEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalaryEL() {
        return salaryEL;
    }

    /**
     * Sets the value of the salaryEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaryEL(String value) {
        this.salaryEL = value;
    }

    /**
     * Gets the value of the prvtmoncostEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvtmoncostEL() {
        return prvtmoncostEL;
    }

    /**
     * Sets the value of the prvtmoncostEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvtmoncostEL(String value) {
        this.prvtmoncostEL = value;
    }

    /**
     * Gets the value of the e7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE7() {
        return e7;
    }

    /**
     * Sets the value of the e7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE7(String value) {
        this.e7 = value;
    }

    /**
     * Gets the value of the e8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE8() {
        return e8;
    }

    /**
     * Sets the value of the e8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE8(String value) {
        this.e8 = value;
    }

    /**
     * Gets the value of the e9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE9() {
        return e9;
    }

    /**
     * Sets the value of the e9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE9(String value) {
        this.e9 = value;
    }

    /**
     * Gets the value of the e10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE10() {
        return e10;
    }

    /**
     * Sets the value of the e10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE10(String value) {
        this.e10 = value;
    }

    /**
     * Gets the value of the cntrctnoEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctnoEL() {
        return cntrctnoEL;
    }

    /**
     * Sets the value of the cntrctnoEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctnoEL(String value) {
        this.cntrctnoEL = value;
    }

    /**
     * Gets the value of the e11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE11() {
        return e11;
    }

    /**
     * Sets the value of the e11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE11(String value) {
        this.e11 = value;
    }

    /**
     * Gets the value of the loanpurposevalel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanpurposevalel() {
        return loanpurposevalel;
    }

    /**
     * Sets the value of the loanpurposevalel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanpurposevalel(String value) {
        this.loanpurposevalel = value;
    }

    /**
     * Gets the value of the loanamtel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanamtel() {
        return loanamtel;
    }

    /**
     * Sets the value of the loanamtel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanamtel(String value) {
        this.loanamtel = value;
    }

    /**
     * Gets the value of the loanperiodel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanperiodel() {
        return loanperiodel;
    }

    /**
     * Sets the value of the loanperiodel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanperiodel(String value) {
        this.loanperiodel = value;
    }

    /**
     * Gets the value of the paymenttypeELdis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymenttypeELdis() {
        return paymenttypeELdis;
    }

    /**
     * Sets the value of the paymenttypeELdis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymenttypeELdis(String value) {
        this.paymenttypeELdis = value;
    }

    /**
     * Gets the value of the paymenttypeEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymenttypeEL() {
        return paymenttypeEL;
    }

    /**
     * Sets the value of the paymenttypeEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymenttypeEL(String value) {
        this.paymenttypeEL = value;
    }

    /**
     * Gets the value of the intervaldateELdis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntervaldateELdis() {
        return intervaldateELdis;
    }

    /**
     * Sets the value of the intervaldateELdis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntervaldateELdis(String value) {
        this.intervaldateELdis = value;
    }

    /**
     * Gets the value of the intervaldateEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntervaldateEL() {
        return intervaldateEL;
    }

    /**
     * Sets the value of the intervaldateEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntervaldateEL(String value) {
        this.intervaldateEL = value;
    }

    /**
     * Gets the value of the rpmntmthdELdis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRpmntmthdELdis() {
        return rpmntmthdELdis;
    }

    /**
     * Sets the value of the rpmntmthdELdis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRpmntmthdELdis(String value) {
        this.rpmntmthdELdis = value;
    }

    /**
     * Gets the value of the rpmntmthEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRpmntmthEL() {
        return rpmntmthEL;
    }

    /**
     * Sets the value of the rpmntmthEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRpmntmthEL(String value) {
        this.rpmntmthEL = value;
    }

    /**
     * Gets the value of the consultingEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultingEL() {
        return consultingEL;
    }

    /**
     * Sets the value of the consultingEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultingEL(String value) {
        this.consultingEL = value;
    }

    /**
     * Gets the value of the appldateEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppldateEL() {
        return appldateEL;
    }

    /**
     * Sets the value of the appldateEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppldateEL(String value) {
        this.appldateEL = value;
    }

    /**
     * Gets the value of the bankacEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankacEL() {
        return bankacEL;
    }

    /**
     * Sets the value of the bankacEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankacEL(String value) {
        this.bankacEL = value;
    }

    /**
     * Gets the value of the banknameEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanknameEL() {
        return banknameEL;
    }

    /**
     * Sets the value of the banknameEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanknameEL(String value) {
        this.banknameEL = value;
    }

    /**
     * Gets the value of the citycodeEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitycodeEL() {
        return citycodeEL;
    }

    /**
     * Sets the value of the citycodeEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitycodeEL(String value) {
        this.citycodeEL = value;
    }

    /**
     * Gets the value of the remark1EL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark1EL() {
        return remark1EL;
    }

    /**
     * Sets the value of the remark1EL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark1EL(String value) {
        this.remark1EL = value;
    }

    /**
     * Gets the value of the remark2EL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark2EL() {
        return remark2EL;
    }

    /**
     * Sets the value of the remark2EL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark2EL(String value) {
        this.remark2EL = value;
    }

    /**
     * Gets the value of the custnameYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustnameYgyd() {
        return custnameYgyd;
    }

    /**
     * Sets the value of the custnameYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustnameYgyd(String value) {
        this.custnameYgyd = value;
    }

    /**
     * Gets the value of the sexYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexYgyd() {
        return sexYgyd;
    }

    /**
     * Sets the value of the sexYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexYgyd(String value) {
        this.sexYgyd = value;
    }

    /**
     * Gets the value of the sexYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexYgydDis() {
        return sexYgydDis;
    }

    /**
     * Sets the value of the sexYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexYgydDis(String value) {
        this.sexYgydDis = value;
    }

    /**
     * Gets the value of the certtypeYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCerttypeYgyd() {
        return certtypeYgyd;
    }

    /**
     * Sets the value of the certtypeYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCerttypeYgyd(String value) {
        this.certtypeYgyd = value;
    }

    /**
     * Gets the value of the certtypeYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCerttypeYgydDis() {
        return certtypeYgydDis;
    }

    /**
     * Sets the value of the certtypeYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCerttypeYgydDis(String value) {
        this.certtypeYgydDis = value;
    }

    /**
     * Gets the value of the certnoYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertnoYgyd() {
        return certnoYgyd;
    }

    /**
     * Sets the value of the certnoYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertnoYgyd(String value) {
        this.certnoYgyd = value;
    }

    /**
     * Gets the value of the ismarYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsmarYgyd() {
        return ismarYgyd;
    }

    /**
     * Sets the value of the ismarYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsmarYgyd(String value) {
        this.ismarYgyd = value;
    }

    /**
     * Gets the value of the ismarYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsmarYgydDis() {
        return ismarYgydDis;
    }

    /**
     * Sets the value of the ismarYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsmarYgydDis(String value) {
        this.ismarYgydDis = value;
    }

    /**
     * Gets the value of the birthdayYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthdayYgyd() {
        return birthdayYgyd;
    }

    /**
     * Sets the value of the birthdayYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthdayYgyd(String value) {
        this.birthdayYgyd = value;
    }

    /**
     * Gets the value of the houseYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseYgyd() {
        return houseYgyd;
    }

    /**
     * Sets the value of the houseYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseYgyd(String value) {
        this.houseYgyd = value;
    }

    /**
     * Gets the value of the islocalYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIslocalYgyd() {
        return islocalYgyd;
    }

    /**
     * Sets the value of the islocalYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIslocalYgyd(String value) {
        this.islocalYgyd = value;
    }

    /**
     * Gets the value of the islocalYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIslocalYgydDis() {
        return islocalYgydDis;
    }

    /**
     * Sets the value of the islocalYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIslocalYgydDis(String value) {
        this.islocalYgydDis = value;
    }

    /**
     * Gets the value of the regioncodeYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegioncodeYgyd() {
        return regioncodeYgyd;
    }

    /**
     * Sets the value of the regioncodeYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegioncodeYgyd(String value) {
        this.regioncodeYgyd = value;
    }

    /**
     * Gets the value of the teladdrYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeladdrYgyd() {
        return teladdrYgyd;
    }

    /**
     * Sets the value of the teladdrYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeladdrYgyd(String value) {
        this.teladdrYgyd = value;
    }

    /**
     * Gets the value of the famzipYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamzipYgyd() {
        return famzipYgyd;
    }

    /**
     * Sets the value of the famzipYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamzipYgyd(String value) {
        this.famzipYgyd = value;
    }

    /**
     * Gets the value of the famtelYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamtelYgyd() {
        return famtelYgyd;
    }

    /**
     * Sets the value of the famtelYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamtelYgyd(String value) {
        this.famtelYgyd = value;
    }

    /**
     * Gets the value of the mtelYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtelYgyd() {
        return mtelYgyd;
    }

    /**
     * Sets the value of the mtelYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtelYgyd(String value) {
        this.mtelYgyd = value;
    }

    /**
     * Gets the value of the emailYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailYgyd() {
        return emailYgyd;
    }

    /**
     * Sets the value of the emailYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailYgyd(String value) {
        this.emailYgyd = value;
    }

    /**
     * Gets the value of the famaddrYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamaddrYgyd() {
        return famaddrYgyd;
    }

    /**
     * Sets the value of the famaddrYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamaddrYgyd(String value) {
        this.famaddrYgyd = value;
    }

    /**
     * Gets the value of the famstatYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamstatYgyd() {
        return famstatYgyd;
    }

    /**
     * Sets the value of the famstatYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamstatYgyd(String value) {
        this.famstatYgyd = value;
    }

    /**
     * Gets the value of the famstatYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamstatYgydDis() {
        return famstatYgydDis;
    }

    /**
     * Sets the value of the famstatYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamstatYgydDis(String value) {
        this.famstatYgydDis = value;
    }

    /**
     * Gets the value of the eduYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEduYgyd() {
        return eduYgyd;
    }

    /**
     * Sets the value of the eduYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEduYgyd(String value) {
        this.eduYgyd = value;
    }

    /**
     * Gets the value of the eduYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEduYgydDis() {
        return eduYgydDis;
    }

    /**
     * Sets the value of the eduYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEduYgydDis(String value) {
        this.eduYgydDis = value;
    }

    /**
     * Gets the value of the degreeYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDegreeYgyd() {
        return degreeYgyd;
    }

    /**
     * Sets the value of the degreeYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDegreeYgyd(String value) {
        this.degreeYgyd = value;
    }

    /**
     * Gets the value of the degreeYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDegreeYgydDis() {
        return degreeYgydDis;
    }

    /**
     * Sets the value of the degreeYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDegreeYgydDis(String value) {
        this.degreeYgydDis = value;
    }

    /**
     * Gets the value of the occupationYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupationYgyd() {
        return occupationYgyd;
    }

    /**
     * Sets the value of the occupationYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupationYgyd(String value) {
        this.occupationYgyd = value;
    }

    /**
     * Gets the value of the occupationYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupationYgydDis() {
        return occupationYgydDis;
    }

    /**
     * Sets the value of the occupationYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupationYgydDis(String value) {
        this.occupationYgydDis = value;
    }

    /**
     * Gets the value of the workcorpYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkcorpYgyd() {
        return workcorpYgyd;
    }

    /**
     * Sets the value of the workcorpYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkcorpYgyd(String value) {
        this.workcorpYgyd = value;
    }

    /**
     * Gets the value of the jobtypeYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobtypeYgyd() {
        return jobtypeYgyd;
    }

    /**
     * Sets the value of the jobtypeYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobtypeYgyd(String value) {
        this.jobtypeYgyd = value;
    }

    /**
     * Gets the value of the jobtypeYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobtypeYgydDis() {
        return jobtypeYgydDis;
    }

    /**
     * Sets the value of the jobtypeYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobtypeYgydDis(String value) {
        this.jobtypeYgydDis = value;
    }

    /**
     * Gets the value of the positiontypeYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositiontypeYgyd() {
        return positiontypeYgyd;
    }

    /**
     * Sets the value of the positiontypeYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositiontypeYgyd(String value) {
        this.positiontypeYgyd = value;
    }

    /**
     * Gets the value of the positiontypeYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositiontypeYgydDis() {
        return positiontypeYgydDis;
    }

    /**
     * Sets the value of the positiontypeYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositiontypeYgydDis(String value) {
        this.positiontypeYgydDis = value;
    }

    /**
     * Gets the value of the workcorptypeYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkcorptypeYgyd() {
        return workcorptypeYgyd;
    }

    /**
     * Sets the value of the workcorptypeYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkcorptypeYgyd(String value) {
        this.workcorptypeYgyd = value;
    }

    /**
     * Gets the value of the workcorptypeYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkcorptypeYgydDis() {
        return workcorptypeYgydDis;
    }

    /**
     * Sets the value of the workcorptypeYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkcorptypeYgydDis(String value) {
        this.workcorptypeYgydDis = value;
    }

    /**
     * Gets the value of the jobadrYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobadrYgyd() {
        return jobadrYgyd;
    }

    /**
     * Sets the value of the jobadrYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobadrYgyd(String value) {
        this.jobadrYgyd = value;
    }

    /**
     * Gets the value of the workcorpzipYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkcorpzipYgyd() {
        return workcorpzipYgyd;
    }

    /**
     * Sets the value of the workcorpzipYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkcorpzipYgyd(String value) {
        this.workcorpzipYgyd = value;
    }

    /**
     * Gets the value of the workcorptelYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkcorptelYgyd() {
        return workcorptelYgyd;
    }

    /**
     * Sets the value of the workcorptelYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkcorptelYgyd(String value) {
        this.workcorptelYgyd = value;
    }

    /**
     * Gets the value of the headshipYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadshipYgyd() {
        return headshipYgyd;
    }

    /**
     * Sets the value of the headshipYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadshipYgyd(String value) {
        this.headshipYgyd = value;
    }

    /**
     * Gets the value of the headshipYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadshipYgydDis() {
        return headshipYgydDis;
    }

    /**
     * Sets the value of the headshipYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadshipYgydDis(String value) {
        this.headshipYgydDis = value;
    }

    /**
     * Gets the value of the positionYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionYgyd() {
        return positionYgyd;
    }

    /**
     * Sets the value of the positionYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionYgyd(String value) {
        this.positionYgyd = value;
    }

    /**
     * Gets the value of the positionYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionYgydDis() {
        return positionYgydDis;
    }

    /**
     * Sets the value of the positionYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionYgydDis(String value) {
        this.positionYgydDis = value;
    }

    /**
     * Gets the value of the jobedateYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobedateYgyd() {
        return jobedateYgyd;
    }

    /**
     * Sets the value of the jobedateYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobedateYgyd(String value) {
        this.jobedateYgyd = value;
    }

    /**
     * Gets the value of the familyincomeYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyincomeYgyd() {
        return familyincomeYgyd;
    }

    /**
     * Sets the value of the familyincomeYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyincomeYgyd(String value) {
        this.familyincomeYgyd = value;
    }

    /**
     * Gets the value of the workstsYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkstsYgyd() {
        return workstsYgyd;
    }

    /**
     * Sets the value of the workstsYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkstsYgyd(String value) {
        this.workstsYgyd = value;
    }

    /**
     * Gets the value of the workstsYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkstsYgydDis() {
        return workstsYgydDis;
    }

    /**
     * Sets the value of the workstsYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkstsYgydDis(String value) {
        this.workstsYgydDis = value;
    }

    /**
     * Gets the value of the relationYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationYgyd() {
        return relationYgyd;
    }

    /**
     * Sets the value of the relationYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationYgyd(String value) {
        this.relationYgyd = value;
    }

    /**
     * Gets the value of the relationYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationYgydDis() {
        return relationYgydDis;
    }

    /**
     * Sets the value of the relationYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationYgydDis(String value) {
        this.relationYgydDis = value;
    }

    /**
     * Gets the value of the orgnatureYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnatureYgyd() {
        return orgnatureYgyd;
    }

    /**
     * Sets the value of the orgnatureYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnatureYgyd(String value) {
        this.orgnatureYgyd = value;
    }

    /**
     * Gets the value of the orgnatureYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnatureYgydDis() {
        return orgnatureYgydDis;
    }

    /**
     * Sets the value of the orgnatureYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnatureYgydDis(String value) {
        this.orgnatureYgydDis = value;
    }

    /**
     * Gets the value of the iptdateYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIptdateYgyd() {
        return iptdateYgyd;
    }

    /**
     * Sets the value of the iptdateYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIptdateYgyd(String value) {
        this.iptdateYgyd = value;
    }

    /**
     * Gets the value of the upddateYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpddateYgyd() {
        return upddateYgyd;
    }

    /**
     * Sets the value of the upddateYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpddateYgyd(String value) {
        this.upddateYgyd = value;
    }

    /**
     * Gets the value of the brfYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrfYgyd() {
        return brfYgyd;
    }

    /**
     * Sets the value of the brfYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrfYgyd(String value) {
        this.brfYgyd = value;
    }

    /**
     * Gets the value of the spousenameYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpousenameYgyd() {
        return spousenameYgyd;
    }

    /**
     * Sets the value of the spousenameYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpousenameYgyd(String value) {
        this.spousenameYgyd = value;
    }

    /**
     * Gets the value of the spousecerttypeYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpousecerttypeYgyd() {
        return spousecerttypeYgyd;
    }

    /**
     * Sets the value of the spousecerttypeYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpousecerttypeYgyd(String value) {
        this.spousecerttypeYgyd = value;
    }

    /**
     * Gets the value of the spousecerttypeYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpousecerttypeYgydDis() {
        return spousecerttypeYgydDis;
    }

    /**
     * Sets the value of the spousecerttypeYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpousecerttypeYgydDis(String value) {
        this.spousecerttypeYgydDis = value;
    }

    /**
     * Gets the value of the spousecertnoYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpousecertnoYgyd() {
        return spousecertnoYgyd;
    }

    /**
     * Sets the value of the spousecertnoYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpousecertnoYgyd(String value) {
        this.spousecertnoYgyd = value;
    }

    /**
     * Gets the value of the spousemtelYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpousemtelYgyd() {
        return spousemtelYgyd;
    }

    /**
     * Sets the value of the spousemtelYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpousemtelYgyd(String value) {
        this.spousemtelYgyd = value;
    }

    /**
     * Gets the value of the spousejobadrYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpousejobadrYgyd() {
        return spousejobadrYgyd;
    }

    /**
     * Sets the value of the spousejobadrYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpousejobadrYgyd(String value) {
        this.spousejobadrYgyd = value;
    }

    /**
     * Gets the value of the spousesexYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpousesexYgyd() {
        return spousesexYgyd;
    }

    /**
     * Sets the value of the spousesexYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpousesexYgyd(String value) {
        this.spousesexYgyd = value;
    }

    /**
     * Gets the value of the spousesexYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpousesexYgydDis() {
        return spousesexYgydDis;
    }

    /**
     * Sets the value of the spousesexYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpousesexYgydDis(String value) {
        this.spousesexYgydDis = value;
    }

    /**
     * Gets the value of the spouseiptdateYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseiptdateYgyd() {
        return spouseiptdateYgyd;
    }

    /**
     * Sets the value of the spouseiptdateYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseiptdateYgyd(String value) {
        this.spouseiptdateYgyd = value;
    }

    /**
     * Gets the value of the spouseupddateYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseupddateYgyd() {
        return spouseupddateYgyd;
    }

    /**
     * Sets the value of the spouseupddateYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseupddateYgyd(String value) {
        this.spouseupddateYgyd = value;
    }

    /**
     * Gets the value of the isfarmYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsfarmYgyd() {
        return isfarmYgyd;
    }

    /**
     * Sets the value of the isfarmYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsfarmYgyd(String value) {
        this.isfarmYgyd = value;
    }

    /**
     * Gets the value of the isfarmYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsfarmYgydDis() {
        return isfarmYgydDis;
    }

    /**
     * Sets the value of the isfarmYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsfarmYgydDis(String value) {
        this.isfarmYgydDis = value;
    }

    /**
     * Gets the value of the iszmYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIszmYgyd() {
        return iszmYgyd;
    }

    /**
     * Sets the value of the iszmYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIszmYgyd(String value) {
        this.iszmYgyd = value;
    }

    /**
     * Gets the value of the iszmYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIszmYgydDis() {
        return iszmYgydDis;
    }

    /**
     * Sets the value of the iszmYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIszmYgydDis(String value) {
        this.iszmYgydDis = value;
    }

    /**
     * Gets the value of the apprepaysrcYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprepaysrcYgyd() {
        return apprepaysrcYgyd;
    }

    /**
     * Sets the value of the apprepaysrcYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprepaysrcYgyd(String value) {
        this.apprepaysrcYgyd = value;
    }

    /**
     * Gets the value of the appbegindateYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppbegindateYgyd() {
        return appbegindateYgyd;
    }

    /**
     * Sets the value of the appbegindateYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppbegindateYgyd(String value) {
        this.appbegindateYgyd = value;
    }

    /**
     * Gets the value of the purposeYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeYgyd() {
        return purposeYgyd;
    }

    /**
     * Sets the value of the purposeYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeYgyd(String value) {
        this.purposeYgyd = value;
    }

    /**
     * Gets the value of the purposeYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeYgydDis() {
        return purposeYgydDis;
    }

    /**
     * Sets the value of the purposeYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeYgydDis(String value) {
        this.purposeYgydDis = value;
    }

    /**
     * Gets the value of the contnoYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContnoYgyd() {
        return contnoYgyd;
    }

    /**
     * Sets the value of the contnoYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContnoYgyd(String value) {
        this.contnoYgyd = value;
    }

    /**
     * Gets the value of the termYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermYgyd() {
        return termYgyd;
    }

    /**
     * Sets the value of the termYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermYgyd(String value) {
        this.termYgyd = value;
    }

    /**
     * Gets the value of the prdtnoYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdtnoYgyd() {
        return prdtnoYgyd;
    }

    /**
     * Sets the value of the prdtnoYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdtnoYgyd(String value) {
        this.prdtnoYgyd = value;
    }

    /**
     * Gets the value of the occurtypeYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurtypeYgyd() {
        return occurtypeYgyd;
    }

    /**
     * Sets the value of the occurtypeYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurtypeYgyd(String value) {
        this.occurtypeYgyd = value;
    }

    /**
     * Gets the value of the occurtypeYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurtypeYgydDis() {
        return occurtypeYgydDis;
    }

    /**
     * Sets the value of the occurtypeYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurtypeYgydDis(String value) {
        this.occurtypeYgydDis = value;
    }

    /**
     * Gets the value of the bussumYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBussumYgyd() {
        return bussumYgyd;
    }

    /**
     * Sets the value of the bussumYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBussumYgyd(String value) {
        this.bussumYgyd = value;
    }

    /**
     * Gets the value of the begindateYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBegindateYgyd() {
        return begindateYgyd;
    }

    /**
     * Sets the value of the begindateYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBegindateYgyd(String value) {
        this.begindateYgyd = value;
    }

    /**
     * Gets the value of the enddateYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnddateYgyd() {
        return enddateYgyd;
    }

    /**
     * Sets the value of the enddateYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnddateYgyd(String value) {
        this.enddateYgyd = value;
    }

    /**
     * Gets the value of the arateYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArateYgyd() {
        return arateYgyd;
    }

    /**
     * Sets the value of the arateYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArateYgyd(String value) {
        this.arateYgyd = value;
    }

    /**
     * Gets the value of the termtypeYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermtypeYgyd() {
        return termtypeYgyd;
    }

    /**
     * Sets the value of the termtypeYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermtypeYgyd(String value) {
        this.termtypeYgyd = value;
    }

    /**
     * Gets the value of the busbalYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusbalYgyd() {
        return busbalYgyd;
    }

    /**
     * Sets the value of the busbalYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusbalYgyd(String value) {
        this.busbalYgyd = value;
    }

    /**
     * Gets the value of the signdateYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigndateYgyd() {
        return signdateYgyd;
    }

    /**
     * Sets the value of the signdateYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigndateYgyd(String value) {
        this.signdateYgyd = value;
    }

    /**
     * Gets the value of the accounttypeYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccounttypeYgyd() {
        return accounttypeYgyd;
    }

    /**
     * Sets the value of the accounttypeYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccounttypeYgyd(String value) {
        this.accounttypeYgyd = value;
    }

    /**
     * Gets the value of the accounttypeYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccounttypeYgydDis() {
        return accounttypeYgydDis;
    }

    /**
     * Sets the value of the accounttypeYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccounttypeYgydDis(String value) {
        this.accounttypeYgydDis = value;
    }

    /**
     * Gets the value of the bussum2Ygyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBussum2Ygyd() {
        return bussum2Ygyd;
    }

    /**
     * Sets the value of the bussum2Ygyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBussum2Ygyd(String value) {
        this.bussum2Ygyd = value;
    }

    /**
     * Gets the value of the termtype2Ygyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermtype2Ygyd() {
        return termtype2Ygyd;
    }

    /**
     * Sets the value of the termtype2Ygyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermtype2Ygyd(String value) {
        this.termtype2Ygyd = value;
    }

    /**
     * Gets the value of the repaydayYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepaydayYgyd() {
        return repaydayYgyd;
    }

    /**
     * Sets the value of the repaydayYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepaydayYgyd(String value) {
        this.repaydayYgyd = value;
    }

    /**
     * Gets the value of the purpose2Ygyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose2Ygyd() {
        return purpose2Ygyd;
    }

    /**
     * Sets the value of the purpose2Ygyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose2Ygyd(String value) {
        this.purpose2Ygyd = value;
    }

    /**
     * Gets the value of the purpose2YgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose2YgydDis() {
        return purpose2YgydDis;
    }

    /**
     * Sets the value of the purpose2YgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose2YgydDis(String value) {
        this.purpose2YgydDis = value;
    }

    /**
     * Gets the value of the busbal2Ygyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusbal2Ygyd() {
        return busbal2Ygyd;
    }

    /**
     * Sets the value of the busbal2Ygyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusbal2Ygyd(String value) {
        this.busbal2Ygyd = value;
    }

    /**
     * Gets the value of the clsfiveYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClsfiveYgyd() {
        return clsfiveYgyd;
    }

    /**
     * Sets the value of the clsfiveYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClsfiveYgyd(String value) {
        this.clsfiveYgyd = value;
    }

    /**
     * Gets the value of the clsfiveYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClsfiveYgydDis() {
        return clsfiveYgydDis;
    }

    /**
     * Sets the value of the clsfiveYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClsfiveYgydDis(String value) {
        this.clsfiveYgydDis = value;
    }

    /**
     * Gets the value of the apptermtypeYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApptermtypeYgyd() {
        return apptermtypeYgyd;
    }

    /**
     * Sets the value of the apptermtypeYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApptermtypeYgyd(String value) {
        this.apptermtypeYgyd = value;
    }

    /**
     * Gets the value of the apptermtypeYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApptermtypeYgydDis() {
        return apptermtypeYgydDis;
    }

    /**
     * Sets the value of the apptermtypeYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApptermtypeYgydDis(String value) {
        this.apptermtypeYgydDis = value;
    }

    /**
     * Gets the value of the apptermYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApptermYgyd() {
        return apptermYgyd;
    }

    /**
     * Sets the value of the apptermYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApptermYgyd(String value) {
        this.apptermYgyd = value;
    }

    /**
     * Gets the value of the occurdateYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurdateYgyd() {
        return occurdateYgyd;
    }

    /**
     * Sets the value of the occurdateYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurdateYgyd(String value) {
        this.occurdateYgyd = value;
    }

    /**
     * Gets the value of the appsumYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppsumYgyd() {
        return appsumYgyd;
    }

    /**
     * Sets the value of the appsumYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppsumYgyd(String value) {
        this.appsumYgyd = value;
    }

    /**
     * Gets the value of the repaytypeYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepaytypeYgyd() {
        return repaytypeYgyd;
    }

    /**
     * Sets the value of the repaytypeYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepaytypeYgyd(String value) {
        this.repaytypeYgyd = value;
    }

    /**
     * Gets the value of the repaytypeYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepaytypeYgydDis() {
        return repaytypeYgydDis;
    }

    /**
     * Sets the value of the repaytypeYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepaytypeYgydDis(String value) {
        this.repaytypeYgydDis = value;
    }

    /**
     * Gets the value of the guartypeYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuartypeYgyd() {
        return guartypeYgyd;
    }

    /**
     * Sets the value of the guartypeYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuartypeYgyd(String value) {
        this.guartypeYgyd = value;
    }

    /**
     * Gets the value of the guartypeYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuartypeYgydDis() {
        return guartypeYgydDis;
    }

    /**
     * Sets the value of the guartypeYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuartypeYgydDis(String value) {
        this.guartypeYgydDis = value;
    }

    /**
     * Gets the value of the appdateYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppdateYgyd() {
        return appdateYgyd;
    }

    /**
     * Sets the value of the appdateYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppdateYgyd(String value) {
        this.appdateYgyd = value;
    }

    /**
     * Gets the value of the ibtypeYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbtypeYgyd() {
        return ibtypeYgyd;
    }

    /**
     * Sets the value of the ibtypeYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbtypeYgyd(String value) {
        this.ibtypeYgyd = value;
    }

    /**
     * Gets the value of the ibtypeYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbtypeYgydDis() {
        return ibtypeYgydDis;
    }

    /**
     * Sets the value of the ibtypeYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbtypeYgydDis(String value) {
        this.ibtypeYgydDis = value;
    }

    /**
     * Gets the value of the bustypeYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBustypeYgyd() {
        return bustypeYgyd;
    }

    /**
     * Sets the value of the bustypeYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBustypeYgyd(String value) {
        this.bustypeYgyd = value;
    }

    /**
     * Gets the value of the bustypeYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBustypeYgydDis() {
        return bustypeYgydDis;
    }

    /**
     * Sets the value of the bustypeYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBustypeYgydDis(String value) {
        this.bustypeYgydDis = value;
    }

    /**
     * Gets the value of the surveyoperidYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveyoperidYgyd() {
        return surveyoperidYgyd;
    }

    /**
     * Sets the value of the surveyoperidYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveyoperidYgyd(String value) {
        this.surveyoperidYgyd = value;
    }

    /**
     * Gets the value of the checkoperidYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckoperidYgyd() {
        return checkoperidYgyd;
    }

    /**
     * Sets the value of the checkoperidYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckoperidYgyd(String value) {
        this.checkoperidYgyd = value;
    }

    /**
     * Gets the value of the manageoperidYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManageoperidYgyd() {
        return manageoperidYgyd;
    }

    /**
     * Sets the value of the manageoperidYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManageoperidYgyd(String value) {
        this.manageoperidYgyd = value;
    }

    /**
     * Gets the value of the baloperidYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaloperidYgyd() {
        return baloperidYgyd;
    }

    /**
     * Sets the value of the baloperidYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaloperidYgyd(String value) {
        this.baloperidYgyd = value;
    }

    /**
     * Gets the value of the manageinstcodeYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManageinstcodeYgyd() {
        return manageinstcodeYgyd;
    }

    /**
     * Sets the value of the manageinstcodeYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManageinstcodeYgyd(String value) {
        this.manageinstcodeYgyd = value;
    }

    /**
     * Gets the value of the loantypeYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoantypeYgyd() {
        return loantypeYgyd;
    }

    /**
     * Sets the value of the loantypeYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoantypeYgyd(String value) {
        this.loantypeYgyd = value;
    }

    /**
     * Gets the value of the loantypeYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoantypeYgydDis() {
        return loantypeYgydDis;
    }

    /**
     * Sets the value of the loantypeYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoantypeYgydDis(String value) {
        this.loantypeYgydDis = value;
    }

    /**
     * Gets the value of the paytypeYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaytypeYgyd() {
        return paytypeYgyd;
    }

    /**
     * Sets the value of the paytypeYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaytypeYgyd(String value) {
        this.paytypeYgyd = value;
    }

    /**
     * Gets the value of the paytypeYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaytypeYgydDis() {
        return paytypeYgydDis;
    }

    /**
     * Sets the value of the paytypeYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaytypeYgydDis(String value) {
        this.paytypeYgydDis = value;
    }

    /**
     * Gets the value of the reppriacnaYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReppriacnaYgyd() {
        return reppriacnaYgyd;
    }

    /**
     * Sets the value of the reppriacnaYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReppriacnaYgyd(String value) {
        this.reppriacnaYgyd = value;
    }

    /**
     * Gets the value of the reppriacnoYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReppriacnoYgyd() {
        return reppriacnoYgyd;
    }

    /**
     * Sets the value of the reppriacnoYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReppriacnoYgyd(String value) {
        this.reppriacnoYgyd = value;
    }

    /**
     * Gets the value of the depaccnaYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepaccnaYgyd() {
        return depaccnaYgyd;
    }

    /**
     * Sets the value of the depaccnaYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepaccnaYgyd(String value) {
        this.depaccnaYgyd = value;
    }

    /**
     * Gets the value of the depaccnoYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepaccnoYgyd() {
        return depaccnoYgyd;
    }

    /**
     * Sets the value of the depaccnoYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepaccnoYgyd(String value) {
        this.depaccnoYgyd = value;
    }

    /**
     * Gets the value of the isautorepintYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsautorepintYgyd() {
        return isautorepintYgyd;
    }

    /**
     * Sets the value of the isautorepintYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsautorepintYgyd(String value) {
        this.isautorepintYgyd = value;
    }

    /**
     * Gets the value of the isautorepintYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsautorepintYgydDis() {
        return isautorepintYgydDis;
    }

    /**
     * Sets the value of the isautorepintYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsautorepintYgydDis(String value) {
        this.isautorepintYgydDis = value;
    }

    /**
     * Gets the value of the isautoreppriYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsautoreppriYgyd() {
        return isautoreppriYgyd;
    }

    /**
     * Sets the value of the isautoreppriYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsautoreppriYgyd(String value) {
        this.isautoreppriYgyd = value;
    }

    /**
     * Gets the value of the isautoreppriYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsautoreppriYgydDis() {
        return isautoreppriYgydDis;
    }

    /**
     * Sets the value of the isautoreppriYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsautoreppriYgydDis(String value) {
        this.isautoreppriYgydDis = value;
    }

    /**
     * Gets the value of the islfYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIslfYgyd() {
        return islfYgyd;
    }

    /**
     * Sets the value of the islfYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIslfYgyd(String value) {
        this.islfYgyd = value;
    }

    /**
     * Gets the value of the islfYgydDis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIslfYgydDis() {
        return islfYgydDis;
    }

    /**
     * Sets the value of the islfYgydDis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIslfYgydDis(String value) {
        this.islfYgydDis = value;
    }

    /**
     * Gets the value of the payamtYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayamtYgyd() {
        return payamtYgyd;
    }

    /**
     * Sets the value of the payamtYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayamtYgyd(String value) {
        this.payamtYgyd = value;
    }

    /**
     * Gets the value of the realamtYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealamtYgyd() {
        return realamtYgyd;
    }

    /**
     * Sets the value of the realamtYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealamtYgyd(String value) {
        this.realamtYgyd = value;
    }

    /**
     * Gets the value of the custbanknoYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustbanknoYgyd() {
        return custbanknoYgyd;
    }

    /**
     * Sets the value of the custbanknoYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustbanknoYgyd(String value) {
        this.custbanknoYgyd = value;
    }

    /**
     * Gets the value of the custunitednoYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustunitednoYgyd() {
        return custunitednoYgyd;
    }

    /**
     * Sets the value of the custunitednoYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustunitednoYgyd(String value) {
        this.custunitednoYgyd = value;
    }

    /**
     * Gets the value of the custacctypeYgyd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustacctypeYgyd() {
        return custacctypeYgyd;
    }

    /**
     * Sets the value of the custacctypeYgyd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustacctypeYgyd(String value) {
        this.custacctypeYgyd = value;
    }

}
