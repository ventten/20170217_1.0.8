<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>信函记录</title>
</head>
<body>
    <div style="display: none;">
	    <form id="corres_info_form">
	        <!-- 主贷人 -->
	        <input type="hidden" id="loanName_info" name="loanName" value="${applDetail.custName}"/>
	       <!--  身份证号 -->
	       <input type="hidden" id="idCardNo_info" name="idCardNo" value="${applDetail.idCardNo}"/>
	       <input type="hidden" id="applId_info" name="applId" value="${applDetail.applId}"/>
	    </form>
    </div>
    <table id="dataTable_corres_info" class="display dataTable" cellspacing="0" width="100%">
        <thead id="conrres_thead_detail">
            <tr>
                <!-- <th>序号</th>
                <th>信函编号</th>
                <th>信函类别</th>
                <th>收件人</th>
                <th>主贷人</th>
                <th>合同编号</th>
                <th>身份证号</th>
                <th>地址类型</th> -->
                <th>操作时间</th>
                <th>操作人</th>
                <th>内容</th>
                <!-- <th>信函状态</th>
                <th>操作</th> -->
            </tr>
        </thead>
        <tbody>
            <!-- <tr>
                <td colspan="11">没有检索到数据</td>
            </tr> -->
        </tbody>
    </table>
     <!--信函数据详情-->
    <div class="modal fade in" id="corresInfomation_info" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" style="width: 800px;">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true" id="close_createPdf"></button>
                    <h4 class="modal-title">信函详情</h4>
                </div>
                <div class="modal-body" style="padding: 10px 10px 0px 10px;">
                    <table class="table table-bordered" id="corrInfomation">
                                <tr>
                                    <td width="8%" class="active text-center">信函类别</td>
                                    <td width="20%" class=" text-center" id="documentName_info"></td>
                                    <td width="8%" class="active text-center">收件人</td>
                                    <td width="12%" class=" text-center" id="clientName_info"></td>
                                    <td width="8%" class="active text-center">收件人电话</td>
                                    <td width="12%" class=" text-center" id="clientPhone_info"></td>
                                </tr>
                                <tr>
                                    <td width="8%" class="active text-center">合同编号</td>
                                    <td width="20%" class=" text-center" id="contractNo_info"></td>
                                    <td width="8%" class="active text-center">主贷人</td>
                                    <td width="12%" class=" text-center" id="loanName_info"></td>
                                    <td width="8%" class="active text-center">身份证号</td>
                                    <td width="12%" class=" text-center" id="idCardNo_info"></td>
                                </tr>
                                <tr>
                                    <td width="8%" class="active text-center">信函生成人</td>
                                    <td width="20%" class=" text-center" id="genByName_info"></td>
                                    <td width="8%" class="active text-center">生成日期</td>
                                    <td width="12%" class=" text-center" id="genTime_info"></td>
                                    <td width="8%" class="active text-center">逾期天数</td>
                                    <td width="12%" class=" text-center" id="overdueDay_info"></td>
                                </tr>
                                <tr>
                                    <td width="8%" class="active text-center">逾期本金/保证金</td>
                                    <td width="20%" class=" text-center" id="principal_info"></td>
                                    <td width="8%" class="active text-center">逾期违约金</td>
                                    <td width="12%" class=" text-center" id="overdueInterest_info"></td>
                                    <td width="8%" class="active text-center">扣款失败手续费</td>
                                    <td width="12%" class=" text-center" id="failCollectFee_info"></td>
                                </tr>
                                <tr>
                                    <td width="8%" class="active text-center">利息和居间费</td>
                                    <td width="20%" class=" text-center" id="brokerFee_info"></td>
                                    <td width="8%" class="active text-center">催收费</td>
                                    <td width="12%" class=" text-center" id="collectCost_info"></td>
                                    <td width="8%" class="active text-center">费用合计</td>
                                    <td width="12%" class=" text-center" id="totalAmount_info"></td>
                                </tr>
                                <tr>
                                    <td width="8%" class="active text-center">地址类别</td>
                                    <td width="20%" class=" text-center" id="addrType_info"></td>
                                    <td width="8%" class="active text-center">客户地址</td>
                                    <td colspan="3" width="12%" class=" text-center" id="addres_info"></td>
                                </tr>
                            </table>
                </div>
                <div class="modal-footer" style="text-align:center;padding-top: 10px;">
                    <!-- <div style="border: solid 2px;"> -->
                        <span style="font-size: 16px;color: #FF6600;border-bottom: solid 2px #FF6600;float: left; ">寄送结果</span>
                        <br/>
                        <div style="float: left;margin-top: 20px">
                            <label >
                                <input type="checkbox" id="coStatus_info_sed"  disabled="disabled">
                            </label>
                            <span>寄送成功</span>
                            <label style="margin-left: 20px">
                                <input type="checkbox" id="coStatus_info_addr"  disabled="disabled">
                            </label>
                            <span>地址无效</span>
                        </div>
                </div>
            </div>
        </div>
    </div>
</body>
<script type="text/javascript" language="javascript">
//选项卡点击
$("#pageCorresinfoLi").on('click', function () {
    var $this = $(this);
    if(!$this.hasClass("hasInit")){
        $this.addClass("hasInit");
        corres_init();
    }
});
//Table初始化方法
function corres_init(){
    policy_table = P.dataTable($("#dataTable_corres_info"),
            $("#corres_info_form"),
            "<%=request.getContextPath()%>/rest/correspondence/selectCorrespondencePagelistCui",
            [
                {"mData" : "genTime","sDefaultContent" : ""},
                {"mData" : "genByName","sDefaultContent" : ""},
                {"mData" : "logContent","sDefaultContent" : ""}
            ]
    );
}
//通过ID查询被选中的数据详情
function getCorrInfomation(corrId,clientName){
	if(corrId == null || corrId == "" || corrId == "undefined"){
		MSG.alert("此条数据异常，查询详细信息失败");
        return false;
	}
	if(clientName == null || clientName == "" || clientName == "undefined"){
        MSG.alert("此条数据异常，查询详细信息失败");
        return false;
    }
    $.ajax({
        url: "<%=request.getContextPath()%>/rest/correspondence/getCorrImfomationById",
        type: "post",
        dataType: "json",
        data:{
            "corrId": corrId,
            "clientName": clientName
            },
        success: function(data){
            if(data.success == false){
                MSG.alert(data.message);
                return false;
            }else{
                $("#documentName_info").text(data.data.documentName);
                $("#clientName_info").text(data.data.clientName);
                $("#clientPhone_info").text(data.data.clientPhone);
                
                $("#contractNo_info").text(data.data.contractNo);
                $("#loanName_info").text(data.data.loanName);
                $("#idCardNo_info").text(data.data.idCardNo);
                
                $("#genByName_info").text(data.data.genByName);
                $("#genTime_info").text(formatDate_corre(data.data.genTime));
                $("#overdueDay_info").text(data.data.overdueDay);
                
                $("#principal_info").text(data.data.principal);
                $("#overdueInterest_info").text(data.data.overdueInterest);
                $("#failCollectFee_info").text(data.data.failCollectFee);
                
                $("#brokerFee_info").text(data.data.brokerFee);
                if(data.data.collectCost == null){
                    $("#collectCost_info").text("");
                }else{
                    $("#collectCost_info").text(data.data.collectCost);
                }
                $("#totalAmount_info").text(data.data.totalAmount);
                
                $("#addrType_info").text(data.data.addrType);
                $("#addres_info").text(data.data.addres);
                //如果信函以发送就勾选，否则去掉勾选
                if(data.data.coStatus == 0){
                    $("#coStatus_info_sed").prop("checked",false);
                }
                else if(data.data.coStatus == 1){
                    $("#coStatus_info_sed").prop("checked",true);
                }
                //如果没有地址，地址状态就为无效
                if(data.data.addres == null || data.data.addres == ""){
                    $("#coStatus_info_addr").attr("checked",true);
                }else{
                    $("#coStatus_info_addr").prop("checked",false);
                }
                //显示弹窗
                $("#corresInfomation_info").modal("show");
            }
        }
    });
}
//填充table表格
//时间戳转时间格式
function   formatDate_corre(now){
  if(now==""||now==null){
      return "";
  }
    var date = new Date(now);
    var   year=date.getFullYear();     
    var   month=date.getMonth()+1;     
    var   day=date.getDate();     
    var   hour=date.getHours();     
    var   minute=date.getMinutes();     
    var   second=date.getSeconds();     
    return   year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second;     
}
//设置模态框垂直居中函数
function centerModals(){
    $('.modal').each(function(i){
        var $clone = $(this).clone().css('display', 'block').appendTo('body');
        var top = Math.round(($clone.height() - $clone.find('.modal-content').height()) / 2);
        top = top > 20 ? top : 0;
        $clone.remove();
        $(this).find('.modal-content').css("margin-top", top-20);
    });
}
// 在模态框出现的时候调用垂直居中函数
$(window).on('resize', centerModals);
// 在窗口大小改变的时候调用垂直居中函数
$('.modal').on('show.bs.modal', centerModals);

</script>