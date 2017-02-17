<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<head>
    <title>催收记录</title>
</head>
<div class="table_scroll">
	<table id="record-dataTable-one" cellspacing="0" width="100%">
	    <thead>
	        <tr id="record-dataTable-one-thead-tr" >
	            <th class="text-center" ><div style="width:40px;">序号</div></th>
	            <th class="text-center" ><div style="width:150px;"><a style="cursor: pointer;padding-left:30px" name="sort_a" id="record_sort_collectTime" onclick="record_sortCol('collectTime',this)">催收时间&nbsp;<label></label></a></div></th>
	            <th class="text-center" ><div style="width:200px;"><a style="cursor: pointer;padding-left:30px" name="sort_a" id="record_sort_content" onclick="record_sortCol('content',this)">内容&nbsp;<label></label></a></div></th>
	            <th class="text-center" ><div style="width:50px;"><a style="cursor: pointer;padding-left:6px" name="sort_a" id="record_sort_contactor" onclick="record_sortCol('contactor',this)">联系人&nbsp;<label></label></a></div></th>
	            <th class="text-center" ><div style="width:80px;"><a style="cursor: pointer;padding-left:24px" name="sort_a" id="record_sort_rltnText" onclick="record_sortCol('rltnText',this)">关系&nbsp;<label></label></a></div></th>
	            <th class="text-center" ><div style="width:100px;"><a style="cursor: pointer;padding-left:25px" name="sort_a" id="record_sort_tel" onclick="record_sortCol('tel',this)">联系电话&nbsp;<label></label></a></div></th>
	            <th class="text-center" ><div style="width:60px;"><a style="cursor: pointer;padding-left:6px" name="sort_a" id="record_sort_collectMthdText" onclick="record_sortCol('collectMthdText',this)">催收类型&nbsp;<label></label></a></div></th>
	            <th class="text-center" ><div style="width:80px;"><a style="cursor: pointer;padding-left:22px" name="sort_a" id="record_sort_followedBy" onclick="record_sortCol('followedBy',this)">跟进人&nbsp;<label></label></a></div></th>
	            <th class="text-center" ><div style="width:80px;"><a style="cursor: pointer;padding-left:20px" name="sort_a" id="record_sort_statusText" onclick="record_sortCol('statusText',this)">跟进情况&nbsp;<label></label></a></div></th>
	            <th class="text-center" ><div style="width:80px;"><a style="cursor: pointer;padding-left:14px" name="sort_a" id="record_sort_resultText" onclick="record_sortCol('resultText',this)">催收代码&nbsp;<label></label></a></div></th>
	            <th class="text-center" ><div style="width:80px;"><a style="cursor: pointer;padding-left:18px" name="sort_a" id="record_sort_controlStatusText" onclick="record_sortCol('controlStatusText',this)">控管状态&nbsp;<label></label></a></div></th>
	            <th class="text-center" ><div style="width:150px;"><a style="cursor: pointer;padding-left:30px" name="sort_a" id="record_sort_rpmntAmt" onclick="record_sortCol('rpmntAmt',this)">承诺还款金额&nbsp;<label>∨</label></a></div></th>
	            <th class="text-center" ><div style="width:150px;"><a style="cursor: pointer;padding-left:30px" name="sort_a" id="record_sort_rpmntDateFmt" onclick="record_sortCol('rpmntDateFmt',this)">承诺还款时间&nbsp;<label></label></a></div></th>
	            <th class="text-center" ><div style="width:80px;"><a style="cursor: pointer;padding-left:18px" name="sort_a" id="record_sort_abnormityCodeText" onclick="record_sortCol('abnormityCodeText',this)">个案情况&nbsp;<label></label></a></div></th>
	        </tr>
	   </thead>
	</table>
	<div id="record-dataTable-fatherDiv" style="overflow-y:scroll;max-height:270px;width:100%">
		<table id="record-dataTable" cellspacing="0" width="100%">
		    <tbody id="record-dataTable-tbody" >
		    </tbody>
		</table>
	</div>
</div>
<!-- 保存滚动分页的页数 -->
<input type="hidden" id="checkScrollPage" value="1">
<!-- 保存滚动分页中最后一条数据的序号 -->
<input type="hidden" id="checkScrollLastIndex" value="1">
<!-- table列头排序参数 -->
<input type="hidden" id="record_sortCol" value="">
<!-- table列头排序升降序 -->
<input type="hidden" id="record_sortDir" value="">
<%--<div id="more">加载数据，请等待</div>--%>

<script type="text/javascript">

	$(document).ready(function(){
		readyScrollTbody($("#checkScrollPage").val(),$("#checkScrollLastIndex").val(),false);
		//表格自适应宽度
		var trWidth=$('#record-dataTable-one-thead-tr').width();
		var trWidths=parseFloat(trWidth)+17;
		$('#record-dataTable-fatherDiv').css('width',trWidths+'px');
	});
	function autoWidth(){
		var trWidth=$('#record-dataTable-one-thead-tr').width();
		var trWidths=parseFloat(trWidth)+17;
		$('#record-dataTable-fatherDiv').css('width',trWidths+'px');
	} 
	// 窗口变化时调用函数，设置表格自适应宽度
    $(window).on('resize', autoWidth);

    //点击列头排序事件
    function record_sortCol(param,obj){
    	var sortLabel = $("#record_sort_"+param).find("label");
    	var sortLabelText = sortLabel.text();
    	//如果此列没有排序
    	if(sortLabelText == ""){
    		$("a[name='sort_a']").each(function(){
    			$(this).find("label").text("").removeClass();
    		});
    		sortLabel.text("∨");
    		sortLabel.toggleClass('shortdown');
    		$("#record_sortCol").val(param);
    		$("#record_sortDir").val("DESC");
    	//如果此列已经降序排序
    	}else if(sortLabelText == "∨"){
    		$("a[name='sort_a']").each(function(){
                $(this).find("label").text("").removeClass();
            });
    		sortLabel.text("∧");
    		sortLabel.toggleClass('shortup');
    		$("#record_sortCol").val(param);
    		$("#record_sortDir").val("ASC");
    	//如果此列已经升序排序
    	}else if(sortLabelText == "∧"){
    		$("a[name='sort_a']").each(function(){
    			$(this).find("label").text("").removeClass();
            });
            sortLabel.text("∨");
            sortLabel.toggleClass('shortdown');
            $("#record_sortCol").val(param);
            $("#record_sortDir").val("DESC");
    	}
    	readyScrollTbody($("#checkScrollPage").val(),$("#checkScrollLastIndex").val(),true);
    }

    /**
     * 催记tr点击方法
     * @param e tr
     * */
    function collectionRecordTrClick(e){
    	//判断表单是否被修改
    	if (!judgeForm()) {
    		//MSG.confirm("确认是否保存当前正在创建的催记",addInfo(),refreshInfo());
    		var index = layer.confirm("确认是否保存当前正在创建的催记？", {
    			title: false,
    			closeBtn: 0,
    			time: 0 ,//不自动关闭
    			skin: 'bgclass',
    			shade: [0.8, 'rgba(0,0,0,0.6)'],//遮罩
                btn: ['保存','取消'] //按钮
            }, function(){
            	layer.close(index);
            	$("#collectionRecordBtn").click();
               // $("#collectionRecordForm").data("changed",false);
            }, function(){
            	layer.close(index);
            	refreshInfo(e);
            	$(".mayNewPhoneHidden").show();
            	$(".controlStatusDiv").show();
            	$(".mayHidden").show();
            	$(".tranSign").attr("disabled", false);
            	if($("#controlStatus").val() != ""){
            		$("#controlStatus").html("<option value=''>请选择</option>");
            	}
            	if($("#status").val() != ""){
                    $("#status").html("<option value=''>请选择</option>");
                }
            	if($("#result").val() != ""){
                    $("#result").html("<option value=''>请选择</option>");
                }
            	//移除校验
                collectionRecord_validate.resetForm();
                $("#addForm_div").find(".tooltip").remove();
                //$("#collectionRecordForm").data("changed",false);
            }); 
    		
    	}else{
    		refreshInfo(e);
    	}
    }
    //判断新增催记的form是否被修改
    function judgeForm(){
    	if($("#collectMthd").val() != ""){
    		return false;
    	}
    	else if($("#rltn").val() != ""){
            return false;
        }
    	else if($("#contactor").val() != ""){
            return false;
        }
    	else if($("#tel").val() != ""){
            return false;
        }
    	else if($("#status").val() != ""){
            return false;
        }
    	else if($("#result").val() != ""){
            return false;
        }
    	else if($("#controlStatus").val() != ""){
            return false;
        }
    	else if($("#abnormityCode").val() != ""){
            return false;
        }
    	else if($("#followedBy").val() != "${session.userName}"){
            return false;
        }
    	else if($("#addRecord-rpmntDate").val() != ""){
            return false;
        }
    	else if($("#addRecord-rpmntAmt").val() != ""){
            return false;
        }
    	else if($("#content").val() != ""){
            return false;
        }
    	else{
    		return true;
    	}
    	
    }
    function refreshInfo(e){
    	$("#modifyForm_div").show();
        $("#addForm_div").hide();
        //催收类型下拉框值
        var $collectMthd = $("#collectMthd_modify");
        $collectMthd.html(allMthdHtml_modify);

        //移除校验
        collectionRecord_validate_modify.resetForm();
        $("#modifyForm_div").find(".tooltip").remove();

        var $tr = $(e);
        //选中行添加加样式
        $tr.addClass("redStar").siblings().removeClass("redStar");
        $("#collectionRecordForm_modify").resetForm();
        //新增按钮添加样式
        var $collectionRecordBtn = $("#collectionRecordBtn_modify");
        //$collectionRecordBtn.val("返回新增");
        $collectionRecordBtn.addClass("beenDisabled");

        var createdBy = $.trim($tr.find("td:nth-child(1) .createdBy").text());
        var createTime = $.trim($tr.find("td:nth-child(1) .createTime").text());

        var $contactor = $("#contactor_modify");   //联系人
        var $tel = $("#tel_modify");   //联系电话
        var $rltn = $("#rltn_modify");  //关系
        $collectMthd.val($.trim($tr.find("td:nth-child(1) .collectMthd").text()));
        //催收类型change事件,并给跟进情况、催收代码、控管状态赋值
        collectMthd_change_modify($.trim($tr.find("td:nth-child(1) .status").text()),
                $.trim($tr.find("td:nth-child(1) .result").text()),
                $.trim($tr.find("td:nth-child(1) .controlStatus").text()));
        $contactor.val($.trim($tr.find("td:nth-child(4)").text()));
        $tel.val($.trim($tr.find("td:nth-child(6)").text()));
        $rltn.val($.trim($tr.find("td:nth-child(1) .rltn").text()));

        var $abnormityCode = $("#abnormityCode_modify");
        $abnormityCode.val($.trim($tr.find("td:nth-child(1) .abnormityCode").text()));

        var $followedBy = $("#followedBy_modify");
        var $rpmntDate = $("#addRecord-rpmntDate_modify");
        var $rpmntAmt = $("#addRecord-rpmntAmt_modify");
        var $content = $("#content_modify");
        $followedBy.val($.trim($tr.find("td:nth-child(8)").text()));
        $rpmntDate.val($.trim($tr.find("td:nth-child(13)").text()));
        $rpmntAmt.val($.trim($tr.find("td:nth-child(12)").text()));
        $content.val($.trim($tr.find("td:nth-child(3)").text()));

        //如果是当天创建的可以修改
        if(createdBy == $("#currentUser").val() && D.isToday(createTime)){
            $("#modifyForm_div").find(".collectionRecordMayDisabled").attr("disabled",false);
            $("#collectionRecordUpdateBtn_modify").show();
            $("#collectionRecordResetBtn_modify").show();
            $("#collectionRecord_id_modify").val($.trim($tr.find("td:nth-child(1) .id").text()));
            $("#collectionRecord_recVer_modify").val($.trim($tr.find("td:nth-child(1) .recVer").text()));
            $("#collectionRecord_tableType_modify").val($.trim($tr.find("td:nth-child(1) .tableType").text()));
        }else{
            $("#modifyForm_div").find(".collectionRecordMayDisabled").attr("disabled",true);
            $("#collectionRecordUpdateBtn_modify").hide();
            $("#collectionRecordResetBtn_modify").hide();
            $("#collectionRecord_id_modify").val("");
            $("#collectionRecord_recVer_modify").val("");
            $("#collectionRecord_tableType_modify").val("");
        }
        //催记类型不能修改
        $collectMthd.attr("disabled",true);
    }
	//初始化加载催收记录的数据 pageNo-当前页数 pageIndex-当前序号开始数 isFlush-是否是刷新
	function readyScrollTbody(pageNo,pageIndex,isFlush){
		var applId=$("#applId").val();
		//列头排序参数
		var sortCol = $("#record_sortCol").val();
		//列头排序升降序规则
		var sortDir = $("#record_sortDir").val();
		if(isFlush == false){
			pageNo = parseInt(pageNo);
            pageIndex = parseInt(pageIndex);
		}else{
			pageNo = 1;
            pageIndex = 1;
		}
		$.ajax({
			type : 'POST',
            dataType : "json",
            url : "<%=request.getContextPath()%>/rest/caseCollection/pageCollectionRecordData",
            data : {
            	"applId":applId,
				"pageSize":30,
				"pageNo":pageNo,
				"sortCol": sortCol,
				"sortDir": sortDir
			},
            beforeSend: function (XMLHttpRequest) {},
            success : function(data) {
                var html = "";
                //返回的结果集
                var listdata = data.result;
                for(var i=0;i<listdata.length;i++){
                	//判断是否为空
                	if(listdata[i].content == null){
                		listdata[i].content = "";
                	}
                	if(listdata[i].contactor == null){
                		listdata[i].contactor = "";
                	}
                	if(listdata[i].rltnText == null){
                		listdata[i].rltnText = "";
                	}
                	if(listdata[i].tel == null){
                		listdata[i].tel = "";
                	}
                	if(listdata[i].collectMthdText == null){
                		listdata[i].collectMthdText = "";
                	}
                	if(listdata[i].followedBy == null){
                		listdata[i].followedBy = "";
                	}
                	if(listdata[i].statusText == null){
                		listdata[i].statusText = "";
                	}
                	if(listdata[i].resultText == null){
                		listdata[i].resultText = "";
                	}
                	if(listdata[i].controlStatusText == null){
                		listdata[i].controlStatusText = "";
                	}
                	if(listdata[i].rpmntAmt == null){
                		listdata[i].rpmntAmt = "";
                	}
                	if(listdata[i].rpmntDateFmt == null){
                		listdata[i].rpmntDateFmt = "";
                	}
                	if(listdata[i].abnormityCodeText == null){
                		listdata[i].abnormityCodeText = "";
                	}
                    var span = "<span class='id' hidden>" + listdata[i].id + "</span>"
                            +"<span class='recVer' hidden>" + listdata[i].recVer + "</span>"
                            +"<span class='tableType' hidden>" + listdata[i].tableType + "</span>"
                            +"<span class='createdBy' hidden>" + listdata[i].createdBy + "</span>"
                            +"<span class='createTime' hidden>" + listdata[i].createTimeFmt + "</span>"
                            +"<span class='collectMthd' hidden>" + listdata[i].collectMthd + "</span>"
                            +"<span class='status' hidden>" + listdata[i].status + "</span>"
                            +"<span class='result' hidden>" + listdata[i].result + "</span>"
                            +"<span class='abnormityCode' hidden>" + listdata[i].abnormityCode + "</span>"
                            +"<span class='controlStatus' hidden>" + listdata[i].controlStatus + "</span>"
                            +"<span class='rltn' hidden>" + listdata[i].rltn + "</span>";
                    if(i%2 !=0){
                    	html+="<tr onclick='collectionRecordTrClick(this)'><td><div style='width:40px'>"+(pageIndex+i) + span +"</div></td>"
                    		+"<td title='"+formatDate(listdata[i].collectTime)+"'><div style='width:150px'>"+formatDate(listdata[i].collectTime)+"</div></td>"
                    		+"<td title='"+listdata[i].content+"'><div style='width:200px'>"+listdata[i].content+"</div></td>"
                    		+"<td title='"+listdata[i].contactor+"'><div style='width:50px'>"+listdata[i].contactor+"</div></td>"
                    		+"<td title='"+listdata[i].rltnText+"'><div style='width:80px'>"+listdata[i].rltnText+"</div></td>"
                    		+"<td title='"+listdata[i].tel+"'><div style='width:100px'>"+listdata[i].tel+"</div></td>"
                    		+"<td ><div style='width:60px'>"+listdata[i].collectMthdText+"</div></td>"
                    		+"<td ><div style='width:80px'>"+listdata[i].followedBy+"</div></td>"
                    		+"<td ><div style='width:80px'>"+listdata[i].statusText+"</div></td>"
                    		+"<td title='"+listdata[i].resultText+"'><div style='width:80px'>"+listdata[i].resultText+"</div></td>"
                    		+"<td title='"+listdata[i].controlStatusText+"'><div style='width:80px'>"+listdata[i].controlStatusText+"</div></td>"
                    		+"<td title='"+listdata[i].rpmntAmt+"'><div style='width:150px'>"+listdata[i].rpmntAmt+"</div></td>"
                    		+"<td title='"+listdata[i].rpmntDateFmt+"'><div style='width:150px'>"+listdata[i].rpmntDateFmt+"</div></td>"
                    		+"<td title='"+listdata[i].abnormityCodeText+"'><div style='width:80px'>"+listdata[i].abnormityCodeText+"</div></td></tr>";
                    }else{
                    	html+="<tr onclick='collectionRecordTrClick(this)' class='odde'><td><div style='width:40px'>"+(pageIndex+i) + span +"</div></td>"
                    	+"<td title='"+formatDate(listdata[i].collectTime)+"'><div style='width:150px'>"+formatDate(listdata[i].collectTime)+"</div></td>"
                    	+"<td title='"+listdata[i].content+"'><div style='width:200px'>"+listdata[i].content+"</div></td>"
                    	+"<td title='"+listdata[i].contactor+"'><div style='width:50px'>"+listdata[i].contactor+"</div></td>"
                    	+"<td title='"+listdata[i].rltnText+"'><div style='width:80px'>"+listdata[i].rltnText+"</div></td>"
                    	+"<td title='"+listdata[i].tel+"'><div style='width:100px'>"+listdata[i].tel+"</div></td>"
                    	+"<td ><div style='width:60px'>"+listdata[i].collectMthdText+"</div></td>"
                    	+"<td ><div style='width:80px'>"+listdata[i].followedBy+"</div></td>"
                    	+"<td ><div style='width:80px'>"+listdata[i].statusText+"</div></td>"
                    	+"<td title='"+listdata[i].resultText+"'><div style='width:80px'>"+listdata[i].resultText+"</div></td>"
                    	+"<td title='"+listdata[i].controlStatusText+"'><div style='width:80px'>"+listdata[i].controlStatusText+"</div></td>"
                    	+"<td title='"+listdata[i].rpmntAmt+"'><div style='width:150px'>"+listdata[i].rpmntAmt+"</div></td>"
                    	+"<td title='"+listdata[i].rpmntDateFmt+"'><div style='width:150px'>"+listdata[i].rpmntDateFmt+"</div></td>"
                    	+"<td title='"+listdata[i].abnormityCodeText+"'><div style='width:80px'>"+listdata[i].abnormityCodeText+"</div></td></tr>";
                    }
                }
                //修改当前分页数和当前分页中最后一条数据的序号
                $("#checkScrollPage").val(pageNo + 1);
                $("#checkScrollLastIndex").val(pageIndex+30);
                if(isFlush == true){
                	$("#record-dataTable-tbody").empty();
                }
              $("#record-dataTable-tbody").append(html);
            }
		});
	}
	//滚动条事件
	 $("#record-dataTable-fatherDiv").scroll(function(){
		//滚动条位置
		var scrollTop = $("#record-dataTable-fatherDiv").scrollTop();
		//可视窗口的高度
		var viewportHeight = $("#record-dataTable-fatherDiv").height();
		//整个页面可以滚动的高度
		var scrollHeight = $("#record-dataTable-fatherDiv")[0].scrollHeight;
		//如果滚动条的位置+可视窗口的高度=整个页面可以滚动的高度，那么就调用相应的函数加载数据
		if(scrollTop+viewportHeight==scrollHeight){
			readyScrollTbody($("#checkScrollPage").val(),$("#checkScrollLastIndex").val(),false);
		}
	 }); 
	//时间戳转时间格式
	function formatDate(now){
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
   //点击显示和隐藏通讯列表
   $('.tabToggledown').click(function(){
	   $(this).toggleClass('tabToggleup');
	   $(this).next().fadeToggle();
   });
</script>


