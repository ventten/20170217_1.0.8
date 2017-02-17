<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<!--新增催记窗口-开始-->
<div class="record-box" id="addForm_div">
    <h4>&nbsp;催记</h4>
	<form class="form_collectionClass" id="collectionRecordForm">
	<div class="form_collectionClass_box">
			<input type="hidden" value="${applId}" name="applId"/>
			<input type="hidden" value="${overduePeriod}" name="periodNum"/>
			<input type="hidden" name="id" id="collectionRecord_id"/>
			<input type="hidden" name="recVer" id="collectionRecord_recVer"/>
			<input type="hidden" name="tableType" id="collectionRecord_tableType"/>

			<div class="pull-left">
		        <label for="collectMthd">
					<span class="redStar">* </span>
					催收类型
				</label>
				<select  name="collectMthd" id="collectMthd" data-placement="bottom">
					<option value="">请选择</option>
					<c:forEach items="${mthdList}" var="item">
						<option value="${item.code}">${item.val}</option>
					</c:forEach>
				</select>
				<select id="allCollectMthd" disabled hidden data-placement="bottom">
					<option value=""></option>
					<c:forEach items="${allMthdList}" var="item">
						<option value="${item.code}">${item.val}</option>
					</c:forEach>
				</select>
			</div>
			
			<div class="pull-left mayHidden">
				<label for="rltn">
					<span class="redStar">* </span>
					关系
				</label>
				<select class="tranSign" name="rltn" id="rltn" data-placement="bottom">
					<option value="">请选择</option>
					<c:forEach items="${rltnshpList}" var="item">
						<option value="${item.code}">${item.val}</option>
					</c:forEach>
				</select>
			</div>
	
			<div class="pull-left mayHidden">
				<label for="contactor">
					<span class="redStar">* </span>
					联系人
				</label>
				<input type="text" class="tranSign" name="contactor" id="contactor" data-placement="bottom">
			</div>
	
			<div class="pull-left mayHidden">
				<label for="tel">
					<span class="redStar">* </span>
					联系电话
				</label>
				<input type="text" class="tranSign" name="tel" id="tel" data-placement="bottom">
			</div>
	
			<div class="pull-left">
				<label for="status">
					<span class="redStar mayNewPhoneHidden">* </span>
					跟进情况
				</label>
				<select class="selectControls" name="status" id="status" data-placement="bottom">
					<option value="">请选择</option>
				</select>
			</div>
	
			<div class="pull-left">
				<label for="result">
					<span class="redStar mayNewPhoneHidden">* </span>
					催收代码
				</label>
				<select class="selectControls" name="result" id="result" data-placement="bottom">
					<option value="">请选择</option>
				</select>
			</div>
	
			<div class="pull-left controlStatusDiv">
				<label for="controlStatus">控管状态</label>
				<select class="selectControls" name="controlStatus" id="controlStatus" data-placement="bottom">
					<option value="">请选择</option>
				</select>
			</div>
	
			<div class="pull-left">
				<label for="abnormityCode">个案情况</label>
				<select  name="abnormityCode" id="abnormityCode">
					<option value="">请选择</option>
					<c:forEach items="${abnormityList}" var="item">
						<option value="${item.code}">${item.val}</option>
					</c:forEach>
				</select>
			</div>
	
			<div class="pull-left">
				<label for="followedBy">跟进人</label>
				<input type="text" id="followedBy" name="followedBy" value="${session.userName}">
			</div>
	
			<div class="pull-left">
				<label for="addRecord-rpmntDate">
					<span class="redStar mayRedStar" hidden>* </span>
					承诺还款时间
				</label>
				<input type="text" data-placement="bottom" class="input-border" name="rpmntDate" id="addRecord-rpmntDate" onFocus="WdatePicker({readOnly:true,minDate:'#F{\'%y-%M-%d\'}',onpicked:function(){rpmntDate_change('add');}})" readonly>
			</div>
	
			<div class="pull-left">
				<label for="addRecord-rpmntAmt" >
					<span class="redStar mayRedStar" hidden>* </span>
					承诺还款金额
				</label>
				<input type="text" name="rpmntAmt" id="addRecord-rpmntAmt" data-placement="bottom">
			</div>
		</div>
		
		<label for="content">内容</label>
		<textarea class="content-height" name="content" id="content"></textarea>

        <div style="padding:10px 20px 10px 100px;">
            <input type="button" class="btn btn-primary right-space" id="collectionRecordBtn" value="新增">
            <input type="button" class="btn btn-default right-space" id="collectionRecordResetBtn" value="清除" onclick="clearForm('add')">
            <input type="button" class="btn btn-primary right-space" id="collectionRecordUpdateBtn" value="修改">
        </div>
	</form>

</div>
<!--新增催记窗口-结束-->
<!--修改催记窗口-开始-->
<div class="record-box" id="modifyForm_div" style="display: none;">
    <h4>&nbsp;催记</h4>
    <form class="form_collectionClass" id="collectionRecordForm_modify">
    <div class="form_collectionClass_box">
            <input type="hidden" value="${applId}" name="applId"/>
            <input type="hidden" value="${overduePeriod}" name="periodNum"/>
            <input type="hidden" name="id" id="collectionRecord_id_modify"/>
            <input type="hidden" name="recVer" id="collectionRecord_recVer_modify"/>
            <input type="hidden" name="tableType" id="collectionRecord_tableType_modify"/>

            <div class="pull-left">
                <label for="collectMthd_modify">
                    <span class="redStar">* </span>
                    催收类型
                </label>
                <select class="collectionRecordMayDisabled" name="collectMthd" id="collectMthd_modify" data-placement="bottom">
                    <option value="">请选择</option>
                    <c:forEach items="${mthdList}" var="item">
                        <option value="${item.code}">${item.val}</option>
                    </c:forEach>
                </select>
                <select id="allCollectMthd_modify" disabled hidden data-placement="bottom">
                    <option value=""></option>
                    <c:forEach items="${allMthdList}" var="item">
                        <option value="${item.code}">${item.val}</option>
                    </c:forEach>
                </select>
            </div>
            
            <div class="pull-left mayHidden_modify">
                <label for="rltn_modify">
                    <span class="redStar">* </span>
                    关系
                </label>
                <select class="collectionRecordMayDisabled tranSign_modify" name="rltn" id="rltn_modify" data-placement="bottom">
                    <option value="">请选择</option>
                    <c:forEach items="${rltnshpList}" var="item">
                        <option value="${item.code}">${item.val}</option>
                    </c:forEach>
                </select>
            </div>
    
            <div class="pull-left mayHidden_modify">
                <label for="contactor_modify">
                    <span class="redStar">* </span>
                    联系人
                </label>
                <input type="text" class="collectionRecordMayDisabled tranSign_modify" name="contactor" id="contactor_modify" data-placement="bottom">
            </div>
    
            <div class="pull-left mayHidden_modify">
                <label for="tel_modify">
                    <span class="redStar">* </span>
                    联系电话
                </label>
                <input type="text" class="collectionRecordMayDisabled tranSign_modify" name="tel" id="tel_modify" data-placement="bottom">
            </div>
    
            <div class="pull-left">
                <label for="status_modify">
                    <span class="redStar mayNewPhoneHidden_modify">* </span>
                    跟进情况
                </label>
                <select class="collectionRecordMayDisabled selectControls_modify" name="status" id="status_modify" data-placement="bottom">
                    <option value="">请选择</option>
                </select>
            </div>
    
            <div class="pull-left">
                <label for="result_modify">
                    <span class="redStar mayNewPhoneHidden_modify">* </span>
                    催收代码
                </label>
                <select class="collectionRecordMayDisabled selectControls_modify" name="result" id="result_modify" data-placement="bottom">
                    <option value="">请选择</option>
                </select>
            </div>
    
            <div class="pull-left controlStatusDiv_modify">
                <label for="controlStatus_modify">控管状态</label>
                <select class="collectionRecordMayDisabled selectControls_modify" name="controlStatus" id="controlStatus_modify" data-placement="bottom">
                    <option value="">请选择</option>
                </select>
            </div>
    
            <div class="pull-left">
                <label for="abnormityCode_modify">个案情况</label>
                <select class="collectionRecordMayDisabled" name="abnormityCode" id="abnormityCode_modify">
                    <option value="">请选择</option>
                    <c:forEach items="${abnormityList}" var="item">
                        <option value="${item.code}">${item.val}</option>
                    </c:forEach>
                </select>
            </div>
    
            <div class="pull-left">
                <label for="followedBy_modify">跟进人</label>
                <input class="collectionRecordMayDisabled" type="text" id="followedBy_modify" name="followedBy" value="${session.userName}">
            </div>
    
            <div class="pull-left">
                <label for="addRecord-rpmntDate_modify">
                    <span class="redStar mayRedStar_modify" hidden>* </span>
                    承诺还款时间
                </label>
                <input type="text" data-placement="bottom" class="collectionRecordMayDisabled input-border" name="rpmntDate" id="addRecord-rpmntDate_modify" onFocus="WdatePicker({readOnly:true,minDate:'#F{\'%y-%M-%d\'}',onpicked:function(){rpmntDate_change('modify');}})" readonly>
            </div>
    
            <div class="pull-left">
                <label for="addRecord-rpmntAmt_modify" >
                    <span class="redStar mayRedStar_modify" hidden>* </span>
                    承诺还款金额
                </label>
                <input class="collectionRecordMayDisabled" type="text" name="rpmntAmt" id="addRecord-rpmntAmt_modify" data-placement="bottom">
            </div>
        </div>
        
        <label for="content_modify">内容</label>
        <textarea class="collectionRecordMayDisabled content-height" name="content" id="content_modify"></textarea>

        <div style="padding:10px 20px 10px 100px;">
            <input type="button" class="btn btn-primary right-space" id="collectionRecordBtn_modify" value="返回新增">
            <input type="button" class="btn btn-default right-space" id="collectionRecordResetBtn_modify" value="清除" onclick="clearForm('modify')">
            <input type="button" class="btn btn-primary right-space" id="collectionRecordUpdateBtn_modify" value="修改">
        </div>
    </form>

</div>
<!--修改催记窗口-结束-->
<script type="text/javascript" language="javascript">
var allMthdHtml;    //所有催收类型
var mthdHtml;       //下拉框催收类型
var allMthdHtml_modify;   //所有催收类型
var mthdHtml_modify;       //下拉框催收类型
$(document).ready(function() {
    allMthdHtml = $("#allCollectMthd").html();
    mthdHtml = $("#collectMthd").html();
    $("#collectionRecordUpdateBtn").hide();
    //新增催记表单校验
    collectionRecordForm_validate($("#collectionRecordForm"));
    //-------------------------
    allMthdHtml_modify = $("#allCollectMthd_modify").html();
    mthdHtml_modify = $("#collectMthd_modify").html();
    $("#collectionRecordUpdateBtn_modify").hide();
    //新增催记表单校验
    collectionRecordForm_validate_modify($("#collectionRecordForm_modify"));
    //添加表单修改判断标识
    /* $("#collectionRecordForm :input").change(function() {
    	$("#collectionRecordForm").data("changed",true);
   	}); */
});
//清除按钮点击
function clearForm(para){
	var $collectMthd;
	var $controlStatus;
    if(para == "add"){
	    $collectMthd = $("#collectMthd");
	    $controlStatus = $("#controlStatus");
	   //移除校验
	    collectionRecord_validate.resetForm();
    }else if(para == "modify"){
    	$collectMthd = $("#collectMthd_modify");
    	$controlStatus = $("#controlStatus_modify");
    	//移除校验
        collectionRecord_validate_modify.resetForm();
    }
    var collectMthd = $collectMthd.val();
    $("div .tooltip").remove();
    //$("#collectionRecordForm").resetForm();
    //如果是无效的,则不清除催收类型
    if($collectMthd.is(':disabled')){
        $collectMthd.val(collectMthd);
    }
    $controlStatus.trigger("change");
}
//点击返回新增
$("#collectionRecordBtn_modify").on("click",function(){
	$("#modifyForm_div").hide();
	$("#addForm_div").show();
    //$("#collectionRecordForm").data("changed",true);
});

    //新增催记提交按钮
    $("#collectionRecordBtn").on('click',function(){
        var $thisBtn = $("#collectionRecordBtn");
        if($thisBtn.hasClass("beenDisabled")){
			//催收类型下拉框值
			$("#collectMthd").html(mthdHtml);
            $(".collectionRecordMayDisabled").attr("disabled",false);
			//移除校验
			collectionRecord_validate.resetForm();
			$("#addForm_div").find(".tooltip").remove();
			//$("#collectionRecordForm").resetForm();
            $("#collectionRecordUpdateBtn").hide();
            $("#collectionRecordResetBtn").show();
            $("#controlStatus").trigger("change");
            //$thisBtn.val("新增");
            $thisBtn.removeClass("beenDisabled");
        }else{
            $("#collectionRecord_id").val("");
            $("#collectionRecord_recVer").val("");
            $("#collectionRecord_tableType").val("");
            var $collectionRecordForm = $("#collectionRecordForm");
            //校验
            if(!$collectionRecordForm.valid()){
                return false;
            }
            var collectMthd = $("#collectMthd").val();
            $.ajax({
                type : 'POST',
                dataType : "json",
                url : "<%=request.getContextPath()%>/rest/caseCollection/addCollectionRecord",
                data : $collectionRecordForm.serialize(),
                success : function(ret) {
                    if (ret.success){
                        $collectionRecordForm.resetForm();
                        $("#controlStatus").trigger("change");
                        //刷新催记分页
                        readyScrollTbody(1, 1, true);
                        if(collectMthd == "NEWPHONE") {
                            //添加新增电话成功,刷新联系人
                            readyScrollTbodyCol(1, 1, true);
                        }
                    }
                    MSG.alert(ret.message);
                },
                error : function() {
                    MSG.alert("操作失败,请刷新重试");
                }
            });
        }
    });

    //修改催记按钮
    $("#collectionRecordUpdateBtn_modify").on('click',function(){
        var $collectionRecordForm = $("#collectionRecordForm_modify");
        //校验
        if(!$collectionRecordForm.valid()){
            return false;
        }
        var $collectMthd = $("#collectMthd_modify");
        $.ajax({
            type : 'POST',
            dataType : "json",
            url : "<%=request.getContextPath()%>/rest/caseCollection/updateCollectionRecord",
            data : $collectionRecordForm.serialize(),
            success : function(ret){
                if (ret.success){
                    $collectionRecordForm.resetForm();
                    //刷新催记分页
                    readyScrollTbody(1, 1, true);
					if($collectMthd.val() == "NEWPHONE") {
						//添加新增电话成功,刷新联系人
						readyScrollTbodyCol(1, 1, true);
					}
                    $("#collectionRecordBtn_modify").trigger("click");
                }
                MSG.alert(ret.message);
            },
            error : function() {
                MSG.alert("修改失败");
            }
        });
    });

    //催收类型change事件
    $("#collectMthd").change(function() {
        collectMthd_change();
    });
    //催收类型change事件_修改
    $("#collectMthd_modify").change(function() {
        collectMthd_change_modify();
    });
    /**
     * 催收类型change方法
     * @param statusCode 根据情况(可空)
     * @param resultCode 催收代码(可空)
     * @param controlStatus 控管状态(可空)
     * */
    function collectMthd_change(statusCode,resultCode,controlStatus){
        var collectMthd = $.trim($("#collectMthd").val()); //催收类型
        var $status = $("#status"); //跟进情况
        var $result = $("#result"); //催收代码
        var $controlStatus = $("#controlStatus"); //控管状态
        var $selectControls = $(".selectControls"); //跟进情况、催收代码、控管状态

        var text = "<option value=''>请选择</option> ";

        //电话、联系人、关系DIV
        var $mayHidden = $(".mayHidden");
        var $mayHiddenValue = $(".tranSign");
        //如果是电话、新增电话,电话、联系人、关系必填
        if (!collectMthd || collectMthd == 'PHONE' || collectMthd == 'NEWPHONE') {
            $mayHiddenValue.val('');
            $mayHiddenValue.attr("disabled", false);
            $mayHidden.show();
        } else {
            $mayHiddenValue.attr("disabled", true);
            $mayHidden.hide();
        }

        //如果是新增电话,隐藏跟进情况和催收代码的红*
        if(collectMthd == 'NEWPHONE'){
			$(".mayNewPhoneHidden").hide();
		}else {
			$(".mayNewPhoneHidden").show();
		}
        //控管状态DIV
        var $controlStatusDiv = $(".controlStatusDiv");
        //如果是外访结果、争议案件、发起再扣,控管状态不填并隐藏
        if (collectMthd == 'SURVEY' || collectMthd == 'DISPUTE_CASE' || collectMthd == 'AGAINDEDUCT') {
            $controlStatus.attr("disabled", true);
            $controlStatusDiv.hide();
        } else {
            $controlStatus.attr("disabled", false);
            $controlStatusDiv.show();
        }
        //如果不是"请选择"
        if (collectMthd){
            //清空催收代码下拉框
            $result.html(text);
            $.ajax({
                type : 'POST',
                dataType : "json",
                url : "<%=request.getContextPath()%>/rest/caseCollection/getCollectStatusAndControl",
                data : "collectMthd=" + collectMthd,
                beforeSend: function (XMLHttpRequest) {},
                success : function(data){
                    var statusList = data.statusList;       //跟进情况
                    var controlList = data.controlList;     //控管状态

                    var statusHtml = '';
                    var controlStatusHtml = '';
                    var i = 0;

                    //如果是委托外包、等回盘、发起再扣、其他,下拉框值默认
                    if(collectMthd == 'OUTSOURCING' || collectMthd == 'BACKPLATE' || collectMthd == 'AGAINDEDUCT' || collectMthd == 'OTHER'){
                        if(statusList){
                            for(i = 0;i < statusList.length;i++){
                                statusHtml += "<option value='" + statusList[i].code + "'>" + statusList[i].val + "</option>"
                            }
                            $status.html(statusHtml);
                            if(statusCode){
                                $status.val(statusCode);
                            }
                            //同步催收代码
                            status_change(resultCode);
                        }

                        if(controlList){
                            for(i = 0;i < controlList.length;i++){
                                controlStatusHtml += "<option value='" + controlList[i].code + "'>" + controlList[i].val + "</option>"
                            }
                            $controlStatus.html(controlStatusHtml);
                            if(controlStatus){
                                $controlStatus.val(controlStatus);
                                controlStatus_change();
                            }
                        }
                    }else{
                        statusHtml = text;
                        //如果不是信函、申请外访,控管状态不默认
                        if(!(collectMthd == 'LETTER') && !(collectMthd == 'OUT_VISIT_SUBMIT')){
                            controlStatusHtml = text;
                        }

                        if(statusList){
                            for(i = 0;i < statusList.length;i++){
                                statusHtml += "<option value='" + statusList[i].code + "'>" + statusList[i].val + "</option>"
                            }
                        }
                        $status.html(statusHtml);
                        if(statusCode){
                            $status.val(statusCode);
                        }
                        //同步催收代码
                        status_change(resultCode);

                        if(controlList){
                            for(i = 0;i < controlList.length;i++){
                                controlStatusHtml += "<option value='" + controlList[i].code + "'>" + controlList[i].val + "</option>"
                            }
                        }
                        $controlStatus.html(controlStatusHtml);
                        if(controlStatus){
                            $controlStatus.val(controlStatus);
                            controlStatus_change();
                        }
                    }
                },
                error:function(){
                    MSG.show("获取数据失败");
                }
            });
        }else{
            //如果是请选择,清空下拉框
            $selectControls.html(text);
        }
    }
    /**
     * 催收类型change方法_修改
     * @param statusCode 根据情况(可空)
     * @param resultCode 催收代码(可空)
     * @param controlStatus 控管状态(可空)
     * */
    function collectMthd_change_modify(statusCode,resultCode,controlStatus){
        var collectMthd = $.trim($("#collectMthd_modify").val()); //催收类型
        var $status = $("#status_modify"); //跟进情况
        var $result = $("#result_modify"); //催收代码
        var $controlStatus = $("#controlStatus_modify"); //控管状态
        var $selectControls = $(".selectControls_modify"); //跟进情况、催收代码、控管状态

        var text = "<option value=''>请选择</option> ";

        //电话、联系人、关系DIV
        var $mayHidden = $(".mayHidden_modify");
        var $mayHiddenValue = $(".tranSign_modify");
        //如果是电话、新增电话,电话、联系人、关系必填
        if (!collectMthd || collectMthd == 'PHONE' || collectMthd == 'NEWPHONE') {
            $mayHiddenValue.val('');
            $mayHiddenValue.attr("disabled", false);
            $mayHidden.show();
        } else {
            $mayHiddenValue.attr("disabled", true);
            $mayHidden.hide();
        }

        //如果是新增电话,隐藏跟进情况和催收代码的红*
        if(collectMthd == 'NEWPHONE'){
            $(".mayNewPhoneHidden_modify").hide();
        }else {
            $(".mayNewPhoneHidden_modify").show();
        }

        //控管状态DIV
        var $controlStatusDiv = $(".controlStatusDiv_modify");
        //如果是外访结果、争议案件、发起再扣,控管状态不填并隐藏
        if (collectMthd == 'SURVEY' || collectMthd == 'DISPUTE_CASE' || collectMthd == 'AGAINDEDUCT') {
            $controlStatus.attr("disabled", true);
            $controlStatusDiv.hide();
        } else {
            $controlStatus.attr("disabled", false);
            $controlStatusDiv.show();
        }

        //如果不是"请选择"
        if (collectMthd){
            //清空催收代码下拉框
            $result.html(text);
            $.ajax({
                type : 'POST',
                dataType : "json",
                url : "<%=request.getContextPath()%>/rest/caseCollection/getCollectStatusAndControl",
                data : "collectMthd=" + collectMthd,
                beforeSend: function (XMLHttpRequest) {},
                success : function(data){
                    var statusList = data.statusList;       //跟进情况
                    var controlList = data.controlList;     //控管状态

                    var statusHtml = '';
                    var controlStatusHtml = '';
                    var i = 0;

                    //如果是委托外包、等回盘、发起再扣、其他,下拉框值默认
                    if(collectMthd == 'OUTSOURCING' || collectMthd == 'BACKPLATE' || collectMthd == 'AGAINDEDUCT' || collectMthd == 'OTHER'){
                        if(statusList){
                            for(i = 0;i < statusList.length;i++){
                                statusHtml += "<option value='" + statusList[i].code + "'>" + statusList[i].val + "</option>"
                            }
                            $status.html(statusHtml);
                            if(statusCode){
                                $status.val(statusCode);
                            }
                            //同步催收代码
                            status_change_modify(resultCode);
                        }

                        if(controlList){
                            for(i = 0;i < controlList.length;i++){
                                controlStatusHtml += "<option value='" + controlList[i].code + "'>" + controlList[i].val + "</option>"
                            }
                            $controlStatus.html(controlStatusHtml);
                            if(controlStatus){
                                $controlStatus.val(controlStatus);
                                controlStatus_change_modify();
                            }
                        }
                    }else{
                        statusHtml = text;
                        //如果不是信函、申请外访,控管状态不默认
                        if(!(collectMthd == 'LETTER') && !(collectMthd == 'OUT_VISIT_SUBMIT')){
                            controlStatusHtml = text;
                        }

                        if(statusList){
                            for(i = 0;i < statusList.length;i++){
                                statusHtml += "<option value='" + statusList[i].code + "'>" + statusList[i].val + "</option>"
                            }
                        }
                        $status.html(statusHtml);
                        if(statusCode){
                            $status.val(statusCode);
                        }
                        //同步催收代码
                        status_change_modify(resultCode);

                        if(controlList){
                            for(i = 0;i < controlList.length;i++){
                                controlStatusHtml += "<option value='" + controlList[i].code + "'>" + controlList[i].val + "</option>"
                            }
                        }
                        $controlStatus.html(controlStatusHtml);
                        if(controlStatus){
                            $controlStatus.val(controlStatus);
                            controlStatus_change_modify();
                        }
                    }
                },
                error:function(){
                    MSG.show("获取数据失败");
                }
            });
        }else{
            //如果是请选择,清空下拉框
            $selectControls.html(text);
        }
    }
    //跟进情况change事件
    $("#status").change(function(){
        status_change();
    });
    //跟进情况change事件
    $("#status_modify").change(function(){
        status_change_modify();
    });
    /**
     * 跟进情况change方法
     * @param resultCode 催收代码(可空)
     * */
    function status_change(resultCode){
        var statusCode = $.trim($("#status").val());        //跟进情况
        var collectMthd = $.trim($("#collectMthd").val());  //催收类型

        var $controlStatus = $("#controlStatus");           //控管状态
        //当催收类型为查找,跟进状态为网查时
        if(statusCode == 'NETSELECT'){
            $controlStatus.html("<option value='WS'>网查</option>");
        }
        //当催收类型为查找,跟进状态为户籍查找时
        else if(statusCode == 'HOUSEHOLDSELECT'){
            $controlStatus.html("<option value='FS'>户籍查找</option>");
        }

        var text = "<option value=''>请选择</option>";
        var resultHtml = '';
        var $result = $("#result");
        if(statusCode == "" || statusCode == "undefined"){
            $result.html(text);
            if(resultCode){
                $result.val(resultCode);
            }
        }else{
            $.ajax({
                type : 'POST',
                dataType : "json",
                url : "<%=request.getContextPath()%>/rest/caseCollection/getCollectCode",
                data : "statusCode=" + statusCode,
                beforeSend: function (XMLHttpRequest) {},
                success : function(data){
                    var codeList = data.codeList;           //催收代码

                    //如果不是委托外包、等回盘、发起再扣、其它
                    if(!(collectMthd == 'OUTSOURCING' || collectMthd == 'BACKPLATE' || collectMthd == 'AGAINDEDUCT' || collectMthd == 'OTHER')){
                        resultHtml = text;
                    }
                    if(codeList){
                        for(i = 0;i < codeList.length;i++){
                            resultHtml += "<option value='" + codeList[i].code + "'>" + codeList[i].val + "</option>"
                        }
                    }
                    $result.html(resultHtml);
                    if(resultCode){
                        $result.val(resultCode);
                    }
                },
                error:function(){
                    MSG.show("获取催收代码失败");
                }
            });
        }
    }
    /**
     * 跟进情况change方法_修改
     * @param resultCode 催收代码(可空)
     * */
    function status_change_modify(resultCode){
        var statusCode = $.trim($("#status_modify").val());        //跟进情况
        var collectMthd = $.trim($("#collectMthd_modify").val());  //催收类型

        var $controlStatus = $("#controlStatus_modify");           //控管状态
        //当催收类型为查找,跟进状态为网查时
        if(statusCode == 'NETSELECT'){
            $controlStatus.html("<option value='WS'>网查</option>");
        }
        //当催收类型为查找,跟进状态为户籍查找时
        else if(statusCode == 'HOUSEHOLDSELECT'){
            $controlStatus.html("<option value='FS'>户籍查找</option>");
        }

        var text = "<option value=''>请选择</option>";
        var resultHtml = '';
        var $result = $("#result_modify");
        if(statusCode == "" || statusCode == "undefined"){
            $result.html(text);
            if(resultCode){
                $result.val(resultCode);
            }
        }else{
            $.ajax({
                type : 'POST',
                dataType : "json",
                url : "<%=request.getContextPath()%>/rest/caseCollection/getCollectCode",
                data : "statusCode=" + statusCode,
                beforeSend: function (XMLHttpRequest) {},
                success : function(data){
                    var codeList = data.codeList;           //催收代码

                    //如果不是委托外包、等回盘、发起再扣、其它
                    if(!(collectMthd == 'OUTSOURCING' || collectMthd == 'BACKPLATE' || collectMthd == 'AGAINDEDUCT' || collectMthd == 'OTHER')){
                        resultHtml = text;
                    }
                    if(codeList){
                        for(i = 0;i < codeList.length;i++){
                            resultHtml += "<option value='" + codeList[i].code + "'>" + codeList[i].val + "</option>"
                        }
                    }
                    $result.html(resultHtml);
                    if(resultCode){
                        $result.val(resultCode);
                    }
                },
                error:function(){
                    MSG.show("获取催收代码失败");
                }
            });
        }
    }
    //控管状态change事件
    $("#controlStatus").change(function(){
        controlStatus_change();
    });
    //控管状态change事件
    $("#controlStatus_modify").change(function(){
        controlStatus_change_modify();
    });
    function controlStatus_change(){
        var controlStatus = $("#controlStatus").val();
        //控管状态为承诺还款、家人代偿、第三方代偿、申请再扣、承诺还款需再次跟进、家人代偿需再次跟进、第三方代偿需再次跟进
        if(controlStatus == "PTP" || controlStatus == "FPTP" || controlStatus == "TPTP" || controlStatus == "AD"
				|| controlStatus == "PTPF" || controlStatus == "FPTPF" || controlStatus == "TPTPF"){
            $(".mayRedStar").show();
        }else{
            $(".mayRedStar").hide();
        }
    }
    function controlStatus_change_modify(){
        var controlStatus = $("#controlStatus_modify").val();
        //控管状态为承诺还款、家人代偿、第三方代偿、申请再扣、承诺还款需再次跟进、家人代偿需再次跟进、第三方代偿需再次跟进
        if(controlStatus == "PTP" || controlStatus == "FPTP" || controlStatus == "TPTP" || controlStatus == "AD"
                || controlStatus == "PTPF" || controlStatus == "FPTPF" || controlStatus == "TPTPF"){
            $(".mayRedStar_modify").show();
        }else{
            $(".mayRedStar_modify").hide();
        }
    }
//    //承诺还款时间change事件
//    $("#addRecord-rpmntDate").change(function(){
//        rpmntDate_change();
//    });
    //承诺还款时间change方法
    function rpmntDate_change(para){
    	var $rpmntAmt;
    	if(para == "add"){
	        $rpmntAmt = $("#addRecord-rpmntAmt");             //承诺还款金额
    	}else if(para == "modify"){
    		$rpmntAmt = $("#addRecord-rpmntAmt_modify");             //承诺还款金额
    	}
        //如果没输入承诺还款金额
        if(!$.trim($rpmntAmt.val())){
        	var $rpmntDate;
        	var cntrctNo = $.trim($("#cntrctNo").text());       //合同编号
        	var idCardNo = $.trim($("#idCardNo").text());       //身份证号
        	if(para == "add"){
	            $rpmntDate = $("#addRecord-rpmntDate");         //承诺还款时间
            }else if(para == "modify"){
                $rpmntDate = $("#addRecord-rpmntDate_modify");         //承诺还款时间
            }
            var payType = "NORMAL";                             //还款方式
            var repaymentDate = $rpmntDate.val();               //还款时间
            $.ajax({
                type : 'POST',
                dataType : "json",
                url : "<%=request.getContextPath()%>/rest/caseCollection/getRepaymentAmount",
                data : {cntrctNo:cntrctNo,idCardNo:idCardNo,payType:payType,repaymentDate:repaymentDate},
                success : function(result){
                    if(result.success){
						if(result.data.receivableSumaryAmount){
							$rpmntAmt.val(result.data.receivableSumaryAmount);
						}else {
							$rpmntAmt.val("");
						}
                    }else {
						MSG.alert(result.message);
					}
                },
                error:function(){
                    MSG.alert("应收金额获取失败");
                }
            });
        }
    }
	
    //催记Form校验
	var collectionRecord_validate;
    //表单校验
    function collectionRecordForm_validate($validateForm){
        var $collectMthd = $("#collectMthd");
        var $controlStatus = $("#controlStatus");
        collectionRecord_validate = $validateForm.validate({
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
                collectMthd: {
                    required: true
                },
                contactor: {
                    required: function (e) {
                        var mthd = $collectMthd.val();
                        return (mthd == "PHONE" || mthd == "NEWPHONE");
                    }
                },
                tel: {
                    required: function (e) {
                        var mthd = $collectMthd.val();
                        return (mthd == "PHONE" || mthd == "NEWPHONE");
                    },
                    "allTel": true
                },
                rltn: {
                    required: function (e) {
                        var mthd = $collectMthd.val();
                        return (mthd == "PHONE" || mthd == "NEWPHONE");
                    }
                },
                status: {
                    required: function (e) {
						var mthd = $collectMthd.val();
						return !(mthd == 'NEWPHONE');
                    }
                },
                result: {
                    required: function (e) {
						var mthd = $collectMthd.val();
						return !(mthd == 'NEWPHONE');
                    }
                },
                controlStatus: {
                    required: function (e) {
                        var mthd = $collectMthd.val();
                        return mthd == 'PHONE' || mthd == 'OUT_VISIT_SUBMIT' || mthd == 'SEARCH' || mthd == 'BACKPLATE' || mthd == 'OTHER';
                    }
                },
                rpmntDate: {
                    required: function (e) {
                        var control = $controlStatus.val();
						//控管状态为承诺还款、家人代偿、第三方代偿、申请再扣、承诺还款需再次跟进、家人代偿需再次跟进、第三方代偿需再次跟进时必填
                        return control == "PTP" || control == "FPTP" || control == "TPTP" || control == "AD"
								|| control == "PTPF" || control == "FPTPF" || control == "TPTPF";
                    },date:true
                },
                rpmntAmt: {
                    required: function (e) {
                        var control = $controlStatus.val();
                        return control == "PTP" || control == "FPTP" || control == "TPTP" || control == "AD"
								|| control == "PTPF" || control == "FPTPF" || control == "TPTPF";
                    },number:true,min:0
                }
            },
            messages: {
                collectMthd: {
                    required: "请选择催收类型"
                },
                contactor: {
                    required: "请输入联系人"
                },
                tel: {
                    required: "请输入联系号码"
                },
                rltn: {
                    required: "请选择关系类型"
                },
                status: {
                    required: "请选择跟进情况"
                },
                result: {
                    required: "请选择催收代码"
                },
                controlStatus: {
                    required: "请选择控管状态"
                },
                rpmntDate: {
                    required: "请选择还款时间"
                },
                rpmntAmt: {
                    required: "请输入还款金额"
                }
            }
        });
    }
    //催记Form校验
    var collectionRecord_validate_modify;
    //表单校验
    function collectionRecordForm_validate_modify($validateForm){
        var $collectMthd = $("#collectMthd_modify");
        var $controlStatus = $("#controlStatus_modify");
        collectionRecord_validate_modify = $validateForm.validate({
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
                collectMthd: {
                    required: true
                },
                contactor: {
                    required: function (e) {
                        var mthd = $collectMthd.val();
                        return (mthd == "PHONE" || mthd == "NEWPHONE");
                    }
                },
                tel: {
                    required: function (e) {
                        var mthd = $collectMthd.val();
                        return (mthd == "PHONE" || mthd == "NEWPHONE");
                    },
                    "allTel": true
                },
                rltn: {
                    required: function (e) {
                        var mthd = $collectMthd.val();
                        return (mthd == "PHONE" || mthd == "NEWPHONE");
                    }
                },
                status: {
                    required: function (e) {
                        var mthd = $collectMthd.val();
                        return !(mthd == 'NEWPHONE');
                    }
                },
                result: {
                    required: function (e) {
                        var mthd = $collectMthd.val();
                        return !(mthd == 'NEWPHONE');
                    }
                },
                controlStatus: {
                    required: function (e) {
                        var mthd = $collectMthd.val();
                        return mthd == 'PHONE' || mthd == 'OUT_VISIT_SUBMIT' || mthd == 'SEARCH' || mthd == 'BACKPLATE' || mthd == 'OTHER';
                    }
                },
                rpmntDate: {
                    required: function (e) {
                        var control = $controlStatus.val();
                        //控管状态为承诺还款、家人代偿、第三方代偿、申请再扣、承诺还款需再次跟进、家人代偿需再次跟进、第三方代偿需再次跟进时必填
                        return control == "PTP" || control == "FPTP" || control == "TPTP" || control == "AD"
                                || control == "PTPF" || control == "FPTPF" || control == "TPTPF";
                    },date:true
                },
                rpmntAmt: {
                    required: function (e) {
                        var control = $controlStatus.val();
                        return control == "PTP" || control == "FPTP" || control == "TPTP" || control == "AD"
                                || control == "PTPF" || control == "FPTPF" || control == "TPTPF";
                    },number:true,min:0
                }
            },
            messages: {
                collectMthd: {
                    required: "请选择催收类型"
                },
                contactor: {
                    required: "请输入联系人"
                },
                tel: {
                    required: "请输入联系号码"
                },
                rltn: {
                    required: "请选择关系类型"
                },
                status: {
                    required: "请选择跟进情况"
                },
                result: {
                    required: "请选择催收代码"
                },
                controlStatus: {
                    required: "请选择控管状态"
                },
                rpmntDate: {
                    required: "请选择还款时间"
                },
                rpmntAmt: {
                    required: "请输入还款金额"
                }
            }
        });
    }
</script>

