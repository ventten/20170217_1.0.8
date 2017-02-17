<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<head>
    <title>案件催收</title>
</head>
<body>
<div class="panel panel-default">
    <div class="panel-heading"><h3 class="panel-title">还款查询</h3></div>
    <div class="panel-body">
        <form id="repay-searchForm">
        	<label for="repay_idCardNo" class="right-space-1"><span class="redStar">*</span>身份证号</label>
            <input type="text" id="repay_idCardNo" name="idCardNo" class="right-space collection" data-placement="bottom"/>
            <label for="repay_customerName" class="right-space-1 label-widthshort">主&nbsp;贷&nbsp;人</label>
            <input type="text" id="repay_customerName" name="customerName" class="right-space collection"/>
            <label for="repay_contractNo" class="right-space-1">合同编号</label>
            <input type="text" id="repay_contractNo" name="contractNo" class="right-space collection"/>
            <label for="repay_repaymentWay" class="right-space-1 label-widthslarge line-bottom">还款方式</label>
            <select id="repay_repaymentWay" name="repaymentWay" class="right-space collection">
                <option value="RENEW">正常还款</option>
                <option value="INADVANCE">提前结清</option>
            </select>
            <br/>
            <label class="left-space-1 right-space-1 line-bottom">还款日期</label>
            <input size="16" type="text" class="collection right-space" readonly onFocus="WdatePicker({onpicked:null})"  id="repay_repaymentDate" name="repaymentDate">
            <br/>
            <button type="button" class="btn btn-primary right-space-1" id="repayment-searchBtn">查询</button>
            <button type="button" class="btn btn-default right-space-1" id="repayment-resetBtn">清除</button>
        </form>
    </div>
    <table class="table table-bordered">
        <tr>
            <td width="8%" class="active text-center">贷款金额</td>
            <td width="12%" class=" text-center clearTd" id="repay_loanAmount"></td>
            <td width="8%" class="active text-center">贷款期数</td>
            <td width="12%" class=" text-center clearTd" id="repay_loanPeriod"></td>
            <td width="8%" class="active text-center">首期还款金额</td>
            <td width="12%" class=" text-center clearTd" id="repay_firstRepayAmount"></td>
            <td width="8%" class="active text-center">剩余本金/保证金</td>
            <td width="12%" class=" text-center clearTd" id="repay_remindPrincipal"></td>
        </tr>
        <tr>
            <td width="8%" class="active text-center">放款日期</td>
            <td width="12%" class=" text-center clearTd" id="repay_payDate"></td>
            <td width="8%" class="active text-center">已还期数</td>
            <td width="12%" class=" text-center clearTd" id="repay_paidPeriodNumber"></td>
            <td width="8%" class="active text-center">以后每期还款金额</td>
            <td width="12%" class=" text-center clearTd" id="repay_lastRepayAmount"></td>
            <td width="8%" class="active text-center">扣款银行</td>
            <td width="12%" class=" text-center clearTd" id="repay_collectBank"></td>
        </tr>
        <tr>
            <td width="8%" class="active text-center">委外单位</td>
            <td width="12%" class=" text-center clearTd" id="repay_outsourceCompany"></td>
            <td width="8%" class="active text-center">委外日期</td>
            <td width="12%" class=" text-center clearTd" id="repay_outSourceDate"></td>
            <td width="8%" class="active text-center">逾期天数</td>
            <td width="12%" class=" text-center clearTd" id="repay_overdueDays"></td>
            <td width="8%" class="active text-center">扣款账号</td>
            <td width="12%" class=" text-center clearTd" id="repay_collectBankNo"></td>
        </tr>
        <tr>
            <td width="8%" class="active text-center">应还总额合计</td>
            <td width="12%" class=" text-center clearTd" id="repay_receivableSumaryAmount"></td>
            <td width="8%" class="active text-center">放款类别</td>
            <td width="12%" class=" text-center clearTd" id="repay_paymentType"></td>
            <td width="8%" class="active text-center">催收员</td>
            <td width="12%" class=" text-center clearTd" id="repay_collector"></td>
            <td colspan="2" width="8%" class="text-center"></td>
        </tr>
    </table>
</div>
<div style="overflow-x:scroll;width:100%;margin-bottom:20px;">
<table id="repay_dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
        <tr>
            <!-- <th class="text-center" >更多</th> -->
            <th style="text-align:right !important">序号</th>
            <th class="text-center" >合同编号</th>
            <th class="text-center" >客户名称</th>
            <th class="text-center" >证件号码</th>
            <th class="text-center" >贷款金额</th>
            <th class="text-center" >还款期数</th>
            <th class="text-center" >还款状态</th>
            <th class="text-center" >应还款日期</th>
            <th class="text-center" >最大还款日期</th>
            <th class="text-center" >应还款额合计</th>
            <th class="text-center" >豁免金额合计</th>
            <th class="text-center" >实收金额合计</th>            
            <th class="text-center" >应还金额</th>
            <th class="text-center" >再扣日期</th>
        </tr>
    </thead>
    <tbody id="repay_table_tbody">
    	<tr class="dataTable_show">
             <td colspan="14">没有检索到数据</td>
        </tr>
    </tbody>
</table>
</div>
</body>
<script type="text/javascript" language="javascript">
$(document).ready(function(){
	//新增表单校验
    address_validate($("#repay-searchForm"));
	$("#repay_repaymentDate").val(new Date().FormatTwo("yyyy-MM-dd"));
});
//表单校验
function address_validate($validateForm){
    $validateForm.validate({
        unhighlight: function (element, errorClass, validClass) { //验证通过
            $(element).tooltip("destroy").removeClass(errorClass);
        },
        errorPlacement: function (label, element) {
            //让验证提示显示在验证框下面 注：有些地方如果动态添加这个属性不成功就手动添加data-placement="bottom"属性
            $(element).attr("data-placement","bottom");
            $(element).tooltip("destroy"); /*必需*/
            $(element).attr("title", $(label).text()).tooltip("show"); 
        },
        rules: {
            idCardNo: {
                required: true
            }
        },
        messages: {
            idCardNo: {
                required: "请输入主贷人身份证号"                   
            }
        }
    });
}
//重置查询框
$("#repayment-resetBtn").on("click",function(){
	$("#repay_customerName").val("");
	$("#repay_idCardNo").val("");
	$("#repay_contractNo").val("");
	$("#repay_repaymentWay option:first").prop("selected","true");
	$("#repay_repaymentDate").val(new Date().FormatTwo("yyyy-MM-dd"));
});
//查询按钮点击
$('#repayment-searchBtn').on( 'click', function () {
	//表单校验
    if (!$("#repay-searchForm").valid()){
        return false;
    }
        repayment_init();
});
//查询得到数据
function repayment_init(){
    $.ajax({
        "type" : "post",
        "url" : "<%=request.getContextPath()%>/rest/caseCollection/pageRepaymentExemptData",
        "dataType" : "json",
        "data" : $("#repay-searchForm").serialize(),
        "success" : function(result) {

            var htmlPoly = "";
            if(result == null){
            	//MSG.show("查询条件下无数据，请核对查询条件");
                $(".clearTd").text("");
                $("#repay_table_tbody").empty();
                return false;
            }
            if(typeof result.data == "string"){
                MSG.show(result.data);
                return false;
            }
             //每期应收金额list
             var receivableDtos = result.data.receivableDtos;
             if(receivableDtos == null){
                 //MSG.show("该客户无还款数据");
                 $(".clearTd").text("");
                 $("#repay_table_tbody").empty();
                 return false;
             }
             if(receivableDtos.length == 0){
                 $(".clearTd").text("");
                 $("#repay_table_tbody").empty();
                 return false;
             }
             //贷款金额
             var loanAmountT = result.data.calculateClientInfoDto.loanAmount;
             $("#repay_loanAmount").text(loanAmountT == null?"":loanAmountT);
             //贷款期数
             var loanPeriodT = result.data.calculateClientInfoDto.loanPeriod;
             $("#repay_loanPeriod").text(loanPeriodT == null?"":loanPeriodT);
             //首期还款金额
             var firstPeriodReceivableT = result.data.calculateClientInfoDto.firstPeriodReceivable;
             $("#repay_firstRepayAmount").text(firstPeriodReceivableT == null?"":firstPeriodReceivableT);
             //剩余本金 保证金
             var remindPrincipalT = result.data.remindPrincipal;
             $("#repay_remindPrincipal").text(remindPrincipalT == null?"":remindPrincipalT);
             //放款日期
             $("#repay_payDate").text(formatDate(result.data.calculateClientInfoDto.payDate));
             //已还期数
             var paidPeriodNumberT = result.data.calculateClientInfoDto.paidPeriodNumber;
             $("#repay_paidPeriodNumber").text(paidPeriodNumberT == null?"":paidPeriodNumberT);
             //以后每期还款金额
             var secondPeriodReceivableT = result.data.calculateClientInfoDto.secondPeriodReceivable;
             $("#repay_lastRepayAmount").text(secondPeriodReceivableT == null?"":secondPeriodReceivableT);
             //扣款银行
             var collectBankT = result.data.calculateClientInfoDto.collectBank;
             $("#repay_collectBank").text(collectBankT == null?"":collectBankT);
             //委外单位
             var outsourceCompanyT = result.data.calculateClientInfoDto.outsourceCompany;
             $("#repay_outsourceCompany").text(outsourceCompanyT == null?"":outsourceCompanyT);
             //委外日期
             $("#repay_outSourceDate").text(formatDate(result.data.calculateClientInfoDto.outSourceDate));
             //逾期天数
             $("#repay_overdueDays").text(result.data.overdueDays == null?"":result.data.overdueDays);
             //扣款账号
             var collectBankNoT = result.data.calculateClientInfoDto.collectBankNo;
             $("#repay_collectBankNo").text(collectBankNoT == null?"":collectBankNoT);
             //应还总额合计
             $("#repay_receivableSumaryAmount").text(result.data.receivableSumaryAmount == null?"":result.data.receivableSumaryAmount);
             //放款类别
             var paymentTypeT = result.data.calculateClientInfoDto.paymentType;
             $("#repay_paymentType").text(paymentTypeT ==null?"":paymentTypeT);
             //催收员
             var collectorT = result.data.calculateClientInfoDto.collector;
             $("#repay_collector").text(collectorT == null?"":collectorT);
        	 var num = 1;
             for(var i=0;i<receivableDtos.length;i++){
                 var dataHtml = "";  //all
            	 var feeValue1 = 0;
            	 var feeValue2 = 0;
            	 var feeValue3 = 0;
            	 var feeValue4 = 0;
            	 //没一期的应收明细list
            	 var receivableDetails = receivableDtos[i].receivableDetails;
               	 for(var j=0;j<receivableDetails.length;j++){
               		 if(receivableDetails[j].receivableAmount != 0){
               			 if(receivableDetails[j].ledgerTypeCode == "利息"){
               				feeValue1 += receivableDetails[j].receivableAmount;
               				feeValue2 += receivableDetails[j].waivedAmount;
               				feeValue3 += receivableDetails[j].actualAmount;
               				feeValue4 += receivableDetails[j].repaymentPostAmount;
               			 }
               			 else if(receivableDetails[j].ledgerTypeCode == "居间费"){
                            feeValue1 += receivableDetails[j].receivableAmount;
                            feeValue2 += receivableDetails[j].waivedAmount;
                            feeValue3 += receivableDetails[j].actualAmount;
                            feeValue4 += receivableDetails[j].repaymentPostAmount;
                         }else{
	               			 dataHtml +="<tr><td>"+receivableDetails[j].ledgerTypeCode+"</td>"
	               			 +"<td>"+receivableDetails[j].receivableAmount+"</td>"
	               			 +"<td>"+receivableDetails[j].waivedAmount+"</td>"
	               			 +"<td>"+receivableDetails[j].actualAmount+"</td>"
	               			 +"<td>"+receivableDetails[j].repaymentPostAmount+"</td></tr>"
                         }
               		 }
               	 }
               	 if(feeValue1 != 0){
	               	dataHtml +="<tr><td>利息&居间费</td>"
	                +"<td>"+toDecimal(feeValue1)+"</td>"
	                +"<td>"+toDecimal(feeValue2)+"</td>"
	                +"<td>"+toDecimal(feeValue3)+"</td>"
	                +"<td>"+toDecimal(feeValue4)+"</td></tr>"
               	 }
                 if(i%2 != 0){
                     htmlPoly+="<tr>"
                             +"<td style='cursor:pointer;text-align:right !important' class='detail' onclick=\"tackShow('info"+num+"')\">"+num+"</td>"
                             +"<td>"+receivableDtos[i].contractNo+"</td>"
                             +"<td>"+receivableDtos[i].clientName+"</td>"
                             +"<td>"+receivableDtos[i].idCardNo+"</td>"
                             +"<td>"+receivableDtos[i].loanAmount+"</td>"
                             +"<td>"+receivableDtos[i].periodNumber+"</td>"
                             +"<td>"+formatStatus(receivableDtos[i].status)+"</td>"
                             +"<td>"+formatDate(receivableDtos[i].repaymentDate)+"</td>"
                             +"<td>"+formatDate(receivableDtos[i].maxRepaymentDate)+"</td>"
                             
                             +"<td>"+receivableDtos[i].totalReceivableAmount+"</td>"
                             +"<td>"+receivableDtos[i].totalWaivedAmount+"</td>"
                             +"<td>"+receivableDtos[i].totalActualAmount+"</td>"
                             +"<td>"+receivableDtos[i].repaymentPostAmount+"</td>"
                             +"<td>"+formatDate(receivableDtos[i].reCollectDate)+"</td>"
                             +"</tr>" 
                             +"<tr style='display:none;' id='info"+num+"'><td colspan='14'><table cellpadding=\"5\" cellspacing=\"0\" border=\"0\" class=\"rowTable\"><tr><td>费用项</td><td>应收</td><td>豁免</td><td>实收</td><td>应还金额</td></tr>"+dataHtml+"</table></td></tr>";
                             
                             
                 }else{
                     htmlPoly+="<tr class=\"odd\">"
                     	 +"<td style='cursor:pointer;text-align:right !important' class='detail' onclick=\"tackShow('info"+num+"')\">"+num+"</td>"
                          +"<td>"+receivableDtos[i].contractNo+"</td>"
                          +"<td>"+receivableDtos[i].clientName+"</td>"
                          +"<td>"+receivableDtos[i].idCardNo+"</td>"
                          +"<td>"+receivableDtos[i].loanAmount+"</td>"
                          +"<td>"+receivableDtos[i].periodNumber+"</td>"
                          +"<td>"+formatStatus(receivableDtos[i].status)+"</td>"
                          +"<td>"+formatDate(receivableDtos[i].repaymentDate)+"</td>"
                          +"<td>"+formatDate(receivableDtos[i].maxRepaymentDate)+"</td>"
                          
                          +"<td>"+receivableDtos[i].totalReceivableAmount+"</td>"
                          +"<td>"+receivableDtos[i].totalWaivedAmount+"</td>"
                          +"<td>"+receivableDtos[i].totalActualAmount+"</td>"
                          +"<td>"+receivableDtos[i].repaymentPostAmount+"</td>"
                          +"<td>"+formatDate(receivableDtos[i].reCollectDate)+"</td>"
                          +"</tr>" 
                          +"<tr style='display:none;' id='info"+num+"'><td colspan='14'><table cellpadding=\"5\" cellspacing=\"0\" border=\"0\" class=\"rowTable\"><tr><td>费用项</td><td>应收</td><td>豁免</td><td>实收</td><td>应还金额</td></tr>"+dataHtml+"</table></td></tr>";
                 }
                 num++;
             }
             $("#repay_table_tbody").empty();
             $("#repay_table_tbody").append(htmlPoly);
           
        },
        "error":function(errorData){
            MSG.show('获取数据发生异常');
        }
    });
}
function tackShow(obj){
	if($("#"+obj).css("display") == "none"){
		$("#"+obj).show();	
	}else{
		$("#"+obj).hide();
	}
}
//行显示附加信息
function format ( data ) {
     var receivableDetails = data.receivableDetails;
     var tbody = "";
     if(receivableDetails!=null&&receivableDetails.length>0){
         for(var i=0; i<receivableDetails.length;i++){
             var detail = receivableDetails[i];
             tbody += '<tr><td>'+detail.ledgerName+'</td>'+
                         '<td>'+detail.recivAmt+'</td>'+
                         '<td>'+detail.waivedAmt+'</td>'+
                         '<td>'+detail.actualAmt+'</td><tr>'
         }
     }
     return '<table cellpadding="5" cellspacing="0" border="0" class="rowTable">'+
         '<tr>'+
             '<td>费用项</td>'+
             '<td>应收</td>'+
             '<td>豁免</td>'+
             '<td>实收</td>'+
         '</tr>'+
         tbody+
     '</table>';
 }
//查看信息显示与隐藏
 $('#repay_dataTable').on('click', 'td.detail', function () {
    $(this).toggleClass('detailShow');
    $('.rowTable').parent('td').parent('tr').css('background','#fff');
});

//时间戳转时间格式
function formatDate(now){
  if(now==""||now==null){
      return "";
  }
    var date = new Date(now);
    var   year=date.getFullYear();     
    var   month=date.getMonth()+1;
    if(month<10){
    	month = "0"+month;
    }
    var   day=date.getDate();
    if(day<10){
    	day = "0"+day;
    }
    return   year+"-"+month+"-"+day;     
}
//还款状态格式化
function formatStatus(data){
	if(data == "UNPAID"){
		return "未还";
	}else if(data == "PAID"){
		return "已还";
	}else if(data == "FAILED"){
        return "失败";
    }else if(data == "PARTIAL_PAID"){
        return "部分还";
    }
}
//解决数字相加小数位多位出错的问题 保留两位小数
function toDecimal(x) {  
   var val = Number(x) 
   if(!isNaN(parseFloat(val))) {  
      val = val.toFixed(2);  
   }  
   return  val;   
}
</script>
