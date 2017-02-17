<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<style>
    .labelWith{
        width: 110px;
    }
    .dialogWidth{
        width: 700px;
    }
    .text_div_style{
        width: 50% ;
        float: left;
    }
</style>

<!--发送短信窗口-开始-->
<div class="modal fade hideModal" id="sendSMSModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog dialogWidth">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true" id="buttonClose"></button>
                <h4 class="modal-title">发送短信</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="sendSMSModalForm">
                   <!-- 贷款申请ID -->
                    <input type="hidden" value="${applId}" name="applId" id = "sendSMSModalFormapplId"/>
                    <!--  合同号 -->
                    <input type="hidden" value="${applDetail.cntrctNo}" name="contractNo"/>
                    <!--  放款方式 -->
                    <input type="hidden" value = "${applDetail.paymentName}" name ="paymentType" />
                    <!-- 赎回 -->
                    <input type="hidden" value="${applDetail.redeemStatus}" name = "redeemStatus"/>
                    <input type="hidden" id="idCard_hidd" value="${applDetail.idCardNo }"/>
                    <!-- 催收员称呼 -->
                    <input type="hidden" id="collectorEmp" value="${collectoeInfo.collectorEmp }"/>
                    <!-- 催收员办公电话 -->
                    <input type="hidden" id="collectorEmpPhone" value="${collectoeInfo.collectorPhone }"/>
                    <table style="width:658px;">
                        <tr>
                            <td>
                            <div class="form-group">
                                <label class="col-sm-3 control-label labelWith"><span class="redStar">* </span>关系</label>
                                <div class="text_div_style ">
                                     <select class="form-control" name="relationMes" id="relationMes" onchange="findContactsMes()">
                                    </select>
                                </div>
                            </div>
                            </td>
                            <td>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label labelWith"><span class="redStar">* </span>联系人</label>
                                    <div class="text_div_style ">
                                        <select class="form-control" name="contactsMes" id="contactsMes" onchange="changeContactsMes()">
                                            <%-- <option value="12">${applDetail.custName}</option> --%>
                                        </select>
                                    </div>
                                </div>
                            </td>
                            </tr>
                            <tr> 
                            <td>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label labelWith"><span class="redStar">* </span>模板组别</label>
                                    <div class="text_div_style ">
                                        <select class="form-control" name="suiTableGroupMes" id="suiTableGroupMes" onchange="changeSuiTableGroup()">
                                            <%-- <c:forEach items="${smt1}" var = "item">
                                                <c:choose>
	                                                <c:when test="${item.suiTableGroup eq 'M2'}">
	                                                    <option value="${item.suiTableGroup }">31-60天</option>
	                                                </c:when>
	                                                <c:when test="${item.suiTableGroup eq '1-15天'}">
                                                        <option selected="selected" value="${item.suiTableGroup }">${item.suiTableGroup }</option>
                                                    </c:when>
	                                                <c:otherwise>
	                                                    <option value="${item.suiTableGroup }">${item.suiTableGroup }</option>
	                                                </c:otherwise>
                                                </c:choose>
                                            </c:forEach> --%>
                                            <!-- <option value="61-90天区间">61-90天</option>
                                            <option value="91-120天区间">91-120天</option> -->
                                        </select>
                                    </div>
                                </div>
                            </td>
                            <td>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label labelWith"><span class="redStar">* </span>模板类型</label>
                                    <div class="text_div_style ">
                                        <select class="form-control" name="suiTableTypeMes" id="suiTableTypeMes">
                                            <option value="">请选择</option>
                                        </select>
                                    </div>
                                </div>
                            </td>
                             </tr>
                            <tr> 
                            <td>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label labelWith"><span class="redStar">* </span>催收日期</label>
                                    <div class="text_div_style ">
                                        <input size="10" type="text" class="form-control" value="" onFocus="WdatePicker({onpicked:function(){},minDate:'%y-%M-%d'})" name="hanstenDateMes" id="hanstenDateMes" readonly>
                                    </div>
                                </div>
                            </td>
                            <td>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label labelWith"><span class="redStar">* </span>还款方式</label>
                                    <div class="text_div_style ">
                                        <select class="form-control selectControls" name="refundMes" id="refundMes">
                                            <option value="NORMAL">正常还款</option>
                                            <option value="INADVANCE">提前结清</option>
                                        </select>
                                    </div>
                                </div>
                            </td>
                            </tr>
                            <tr>
                            <td>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label labelWith"><span class="redStar">* </span>联系电话</label>
                                    <div class="text_div_style ">
                                        <%-- <input type="text" class="form-control" name="telMes" id="telMes" value="${applDetail.mobile}" data-placement="bottom" > --%>
                                        <select class="form-control" name="telMes" id="telMes">
                                        </select>
                                    </div>
                                </div>
                            </td>
                        </tr>
                    </table>
                    <div style="margin-left:82px;margin-bottom: 15px">
                        <input type="button" value="生成短信" class="btn btn-primary" style="margin-left:15px" onclick="clickCreateMess()"/>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label labelWith">短信内容</label>
                        <textarea readonly="readonly" id="messagetext" name="messagetext" style="resize:none;" rows="5" cols="62"></textarea>
                    </div>
                </form>

            </div>
            <div class="modal-footer" style="padding-left: 115px;">
                <button class="btn btn-primary" onclick="sendMessage()">发送</button>
                <button class="btn btn-primary" data-dismiss="modal" id="removeMessageWin">取消</button>
            </div>
        </div>
    </div>
</div>
<!--发送短信窗口-结束-->
<!-- 加载遮罩层   开始-->
<div class="overlay" style="z-index: 99999998;"></div>
<div id="AjaxLoading" class="showbox" style="z-index: 99999999;">
    <div class="loadingWord"><img src="assets/img/waiting.gif">加载中，请稍候...</div>
</div>
<!-- 加载遮罩层 结束 -->
<!-- 电话号码隐藏域 -->
<!-- <div id="hiddenDiv"></div> -->
<script type="text/javascript" >
$(document).ready(function() {
    //生成短信 校验
    createMessage_validate($("#sendSMSModalForm"));
});
//查询关系
function findRelation(){
	var idCard = $("#idCard_hidd").val();
	$.ajax({
        "url": "<%=request.getContextPath()%>/rest/caseCollection/findRelationDate",
        "type": "post",
        "dataType": "json",
        "data": {
            "idCard": idCard
        },
        "success": function(data){
            var html = "";
            if(data != null && data.length !=0){
                for(var i=0;i<data.length;i++){
                	if(data[i].code == 12){
	                    html +="<option selected='selected' value=\""+data[i].code+"\">"+data[i].val+"</option>";
                	}else{
                		html +="<option value=\""+data[i].code+"\">"+data[i].val+"</option>";
                	}
                }
            }else{
            	html +="<option value=''></option>";
            }
            $("#relationMes").empty();
            $("#relationMes").append(html);
            findContactsMes();
        }
    });
}
//查询联系人
function findContactsMes(){
	//获取主贷人的身份证号和 选中的联系人的关系编码
	var idCard = $("#idCard_hidd").val();
	var rltnshp = $("#relationMes option:selected").val();
	$.ajax({
		"url": "<%=request.getContextPath()%>/rest/caseCollection/findContactsMes",
		"type": "post",
		"dataType": "json",
		"data": {
			"idCard": idCard,
			"rltnshp": rltnshp
		},
		"success": function(data){
			var html = "";
            if(data != null && data.length !=0){
                for(var i=0;i<data.length;i++){
                	if(data[i].conName == null || data[i].conName == ""){
                		html +="<option value=''></option>";             		
                	}else{
	                    html +="<option value=\""+data[i].conName+"\">"+data[i].conName+"</option>";
                	}
                }
            }else{
                html +="<option value=''></option>";
            }
            $("#contactsMes").empty();
            $("#contactsMes").append(html);
            changeContactsMes();
		}
	});
}
//重置发送短信表单
function resetSendSMSModalForm(){
    //移除验证提示
    $(".tooltip").remove();//add by zjz date:2016-11-23
    //$("#suiTableGroupMes").find("option:first").prop("selected",true); //模板组别
    $("#refundMes").find("option:first").prop("selected",true);
    $("#hanstenDateMes").val(getNowFormatDate());
    $("#sendSMSModalForm textarea").text("");
    //初始化“模板组别”数据
    findSuiTableGroupMes();
    findRelation();
    $("#sendSMSModal").modal("show");
}
//查询模板组别
function findSuiTableGroupMes(){
	$.ajax({
        "url" : "<%=request.getContextPath()%>/rest/caseCollection/findSuiTableGroupMes",
        "type" : "post",
        "dataType" : "json",
        "success": function(data){
            var html = "";
            if(data != null && data.length !=0){
                for(var i=0;i<data.length;i++){
                	if(data[i].suiTableGroup == "1-15天"){
                		html +="<option selected='selected' value=\""+data[i].suiTableGroup+"\">"+data[i].suiTableGroup+"</option>";
                	}else if(data[i].suiTableGroup == "M2"){
                		html +="<option value=\""+data[i].suiTableGroup+"\">31-60天</option>";
                	}else{
	                    html +="<option value=\""+data[i].suiTableGroup+"\">"+data[i].suiTableGroup+"</option>";
                	}
                }
            }
            else{
                html +="<option value=''></option>";
            }
            $("#suiTableGroupMes").empty();
            $("#suiTableGroupMes").append(html);
            changeSuiTableGroup();
        }
    });
}
    //点击“模板组别”的change事件
    function changeSuiTableGroup(){
        //模板组别选定的值
        var mesGroup = $("#suiTableGroupMes").val();
        if(mesGroup ==""){
            return;
        }else if(mesGroup == "请选择"){
            $("#suiTableTypeMes").empty();
            $("#suiTableTypeMes").append("<option value=''>请选择</option>");
            return;
        }
        else{
            $.ajax({
                "url" : "<%=request.getContextPath()%>/rest/caseCollection/findSuiTableTypeBySuiTableGroup",
                "type" : "post",
                "dataType" : "json",
                "data" : {
                    "mesGroup":mesGroup
                },
                "success": function(data){
                    var html = "";
                    if(data != null && data.length !=0){
                        for(var i=0;i<data.length;i++){
                            html +="<option value=\""+data[i].suiTableType+"\">"+data[i].suiTableType+"</option>";
                        }
                    }
                    else{
                        html +="<option value=''></option>";
                    }
                    $("#suiTableTypeMes").empty();
                    $("#suiTableTypeMes").append(html);
                }
            });
        }
    }

    //选择联系人变更电话号码
    function changeContactsMes(){
    	//获取主贷人的身份证号和 选中的联系人的关系编码
        var idCard = $("#idCard_hidd").val();
        var rltnshp = $("#relationMes option:selected").val();
        var conName = $("#contactsMes option:selected").val();
    	//动态赋值电话号码
    	$.ajax({
                "url" : "<%=request.getContextPath()%>/rest/caseCollection/findContentTel",
                "type" : "post",
                "dataType" : "json",
                "data" : {
                    "idCard": idCard,
                    "rltnshp": rltnshp,
                    "conName": conName
                },
                "success": function(data){
                	var html = "";
                    if(data != null && data.length !=0){
                        for(var i=0;i<data.length;i++){
                            html +="<option value=\""+data[i].telNum+"\">"+data[i].telNum+"</option>";
                        }
                    }
                    else{
                        html +="<option value=''></option>";
                    }
                    $("#telMes").empty();
                    $("#telMes").append(html);
                }
            });
    }

    //短信输入框失去焦点验证
    $('#telMes').on('blur',function(){
    	var value=$(this).val();
    	var regMobile = /^1([3578]\d|4[57])\d{8}$/;
    	if(!regMobile.test(value)) { 
    	    MSG.alert("请输入正确的联系电话！");
    	    return false; 
    	}
    });
    //点击“生成短信”按钮
    function clickCreateMess(){ 
    	//验证手机号码
    	 var value=$('#telMes').val();
    	 var regMobile = /^1([3578]\d|4[57])\d{8}$/;
     	 if(!regMobile.test(value)) { 
     	    MSG.alert("请输入正确的联系电话！");
     	    return false; 
     	 }
    	//校验
        if(!$("#sendSMSModalForm").valid()){
            return false;
        }
        var applId = $("#sendSMSModalForm input[name='applId']").val();
        var contractNo = $("#sendSMSModalForm input[name='contractNo']").val();
        var paymentType = $("#sendSMSModalForm input[name='paymentType']").val();
        var contactsMes = $("#sendSMSModalForm select[name='contactsMes']").val();
        var suiTableGroupMes = $("#sendSMSModalForm select[name='suiTableGroupMes']").val();
        var suiTableTypeMes = $("#sendSMSModalForm select[name='suiTableTypeMes']").val();
        var hanstenDateMes = $("#sendSMSModalForm input[name='hanstenDateMes']").val();
        var refundMes = $("#sendSMSModalForm select[name='refundMes']").val();
        var telMes = $("#sendSMSModalForm input[name='telMes']").val();
        var redeemStatus = $("#sendSMSModalForm input[name='redeemStatus']").val();
        
        //校验赎回是否为空
        /* if(redeemStatus == null || redeemStatus == ""){
        	MSG.alert("本条催记赎回状态为空，不能生成短信！");
        	return false;
        } */
        openLoading();
        $.ajax({
            type: "post",
            dataType: "text",
            url: "<%=request.getContextPath()%>/rest/caseCollection/createMess",
            data: {
                "applId": applId,
                "contractNo":  contractNo,
                "paymentType": paymentType,
                "contactsMes": contactsMes,
                "suiTableGroupMes": suiTableGroupMes,
                "suiTableTypeMes": suiTableTypeMes,
                "hanstenDateMes": hanstenDateMes,
                "refundMes": refundMes,
                "telMes":telMes,
                "redeemStatus": redeemStatus
            },
            success: function(data){
            	var dt = eval("("+data+")");
            	if(!dt.success){
            		closeLoading();
            		MSG.alert(dt.message);
            		return false;
            	}
            	$("#messagetext").text("");
            	if(suiTableTypeMes == "委外后短信(M2)" || suiTableTypeMes == "微信关注" || suiTableTypeMes == "节假日" || suiTableTypeMes == "温馨提醒信息"){
	            	$("#messagetext").text(dt.message);
            	}else{
            		if($("#collectorEmp").val() != null){
	            		$("#messagetext").text(dt.message+$("#collectorEmp").val()+" "+$("#collectorEmpPhone").val());
            		}else{
            			$("#messagetext").text("");
            		}
            	}
            	closeLoading();
            }
        });
    }

    //发送短信
    function sendMessage(){
    	//序列化数据
    	var dataMess = $("#sendSMSModalForm").serialize();
    	//短信内容
        var messagetext = $("#messagetext").text();
    	if(messagetext == null || messagetext == ""){
    		MSG.alert("必须生成短信后才可以发送！");
    		return;
    	}
    	$.ajax({
    		type: "post",
    		url: "<%=request.getContextPath()%>/rest/caseCollection/sendMessage",
    		data: dataMess,
    		success: function(data){
    			if(data.success == true){
	    			$("#buttonClose").click();
	    			MSG.alert(data.message);
	    			//刷新催记分页
                    readyScrollTbody(1,1,true);
    			}else{
    				MSG.alert(data.message);
    			}
    		}
    	});
    }
    //生成短信 校验
    //表单校验
    function createMessage_validate($validateForm){
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
                relationMes: {
                    required: true
                },
                contactsMes: {
                    required: true
                },
                suiTableGroupMes: {
                    required: true
                },
                suiTableTypeMes: {
                    required: true
                },
                hanstenDateMes: {
                    required: true
                },
                refundMes: {
                    required: true
                },
                telMes: {
                    required: true
                }
            },
            messages: {
                relationMes: {
                    required: "请选择关系"
                },
                contactsMes: {
                    required: "请输入联系人"
                },
                suiTableGroupMes: {
                    required: "请选择模板组别"
                },
                suiTableTypeMes: {
                    required: "请选择模板类型"
                },
                hanstenDateMes: {
                    required: "请选择收款日期"
                },
                refundMes: {
                    required: "请选择还款方式"
                },
                telMes: {
                    required: "请输入联系电话"
                }
            }
        });
    }

    //开启加载等待
    function openLoading(){
       $(".overlay").css({'display':'block','opacity':'0.8'});
       $(".showbox").stop(true).animate({'margin-top':'300px','opacity':'1'},200);
    }

    //关闭加载等待
    function closeLoading(){
       $(".showbox").stop(true).animate({'margin-top':'250px','opacity':'0'},400);
       $(".overlay").css({'display':'none','opacity':'0'});
    }
    //获取当前时间
    function getNowFormatDate(){
        var date = new Date();
        var seperator1 = "-";
        var seperator2 = ":";
        var month = date.getMonth() + 1;
        var strDate = date.getDate();
        if (month >= 1 && month <= 9) {
            month = "0" + month;
        }
        if (strDate >= 0 && strDate <= 9) {
            strDate = "0" + strDate;
        }
        var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate
                /* + " " + date.getHours() + seperator2 + date.getMinutes()
                + seperator2 + date.getSeconds() */;
        return currentdate;
    }
    //截取后面的“区间”2字
    function substring(str){
    	return substring(0,str.length-2);
    }
</script>
