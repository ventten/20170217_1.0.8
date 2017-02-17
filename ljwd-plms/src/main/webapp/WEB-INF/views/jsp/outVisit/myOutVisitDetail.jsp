<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>    

<head>  
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>外访详情</title>
    <jsp:include page="/WEB-INF/views/header.jsp" flush="true"/>
</head>
 <!--表格-开始-->
 <div class="panel panel-default">
   <div class="panel-heading">
      <h3 class="panel-title">
		外访详情
      </h3>
   </div>
   <div class="panel-body">
   	<input type="hidden" id="applId" value=${applId }>
   	<input type="hidden" id="infoId" value=${infoId }>
   	
    <div class="tab-content">
        <div role="tabpanel" class="tab-pane active" id="contract-info">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-xs-12">
                   	<div class="margin-bottom">客户信息</div> 	
                        <table class="table table-bordered">
                            <tr>
                                <td width="8%" class="active text-center">分配日期</td>
                                <td width="12%" class=" text-center" ><fmt:formatDate value="${applDetail.assignDate}" pattern="yyyy-MM-dd"/></td>
                                <td width="8%" class="active text-center">预计结案日期</td>
                                <td width="12%" class=" text-center" ><fmt:formatDate value="${applDetail.expectCloseTime}" pattern="yyyy-MM-dd"/></td>
                                <td width="8%" class="active text-center">申请编号</td>
                                <td width="12%" class=" text-center" >${applDetail.applyNo}</td>
                                <td width="8%" class="active text-center">合同编号</td>
                                <td width="12%" class=" text-center">${applDetail.cntrctNo}</td>
                                <td width="8%" class="active text-center">主贷人</td>
                                <td width="12%" class=" text-center">${applDetail.custName}</td>
                            </tr>
                            <tr>
                                <td width="8%" class="active text-center">客户类型</td>
                                <td width="12%" class=" text-center">${applDetail.custType}</td>
                                <td width="8%" class="active text-center">联系电话</td>
                                <td width="12%" class=" text-center">${applDetail.tel}</td>
                                <td width="8%" class="active text-center">贷款金额</td>
                                <td width="12%" class=" text-center">${applDetail.loanAmt}</td>
                                <td width="8%" class="active text-center">贷款期数</td>
                                <td width="12%" class=" text-center">${applDetail.periodNum}</td>
                                <td width="8%" class="active text-center">已还期数</td>
                                <td width="12%" class=" text-center">${applDetail.paidPeriod}</td>
                            </tr>
                            <tr>
                                <td width="8%" class="active text-center">应还金额</td>
                                <td width="12%" class=" text-center">${applDetail.overdueAmount}</td>
                                <td width="8%" class="active text-center">当前逾期天数</td>
                                <td width="12%" class=" text-center">${applDetail.overdueDayNow}</td>
                                <td width="8%" class="active text-center">分配时的逾期天数</td>
                                <td width="12%" class=" text-center">${applDetail.overdueDay}</td>
                                <td width="8%" class="active text-center">历史外访次数</td>
                                <td width="12%" class=" text-center">${applDetail.historyNum}</td>
                                <td width="8%" class="active text-center">案件状态</td>
                                <td width="12%" class=" text-center">${applDetail.caseStatus}</td>
                            </tr>
                            <tr>
                                <td width="8%" class="active text-center">提交人</td>
                                <td width="12%" class=" text-center">${applDetail.submitBy}</td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <br><br>
     <div role="tabpanel" class="tab-pane active" id="contract-info">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-xs-12">
                    	<div class="clearfex margin-bottom">
                    		<div class="pull-left" style="line-height:30px">外访地址</div>
	    					<div class="pull-right">
		    					<shiro:hasPermission name="myOutVisit:addOutVisitPlanAddr">
		    					<button type="button" class="btn btn-default" id="addOutVisitAddressBtn">新增外访地址</button>
		    					</shiro:hasPermission>
	    					</div>
    					</div>
                        <table class="display dataTable" id="outVisitPlanTable">
                            <thead>
                            	<tr>
                            	<th width='4%'>序号</th>
          	                    <th>计划编号</th>
          	                    <th>地址类型</th>
          	                    <th>详细地址</th>
          	                    <th>计划状态</th>
          	                    <th>取消类型</th>
          	                    <th>取消外访原因</th>
                            	<th>操作</th>
                            	</tr>
                            </thead>
                            <tbody id="outVisitPlanList">
                            <c:forEach items="${outPlanList }" var="plan" varStatus="status">
                            	<tr>
                            		<td width='4%'>${status.index + 1}</td>
                            		<td>${plan.planCode}</td>
	                            	<td>${plan.addressTypeName }</td>
	                            	<td>${plan.address }</td>
	                            	<td>${plan.planStatusName }</td>
	                            	<td>${plan.visitCancelTypeName }</td>
	                            	<td>${plan.visitCancelResion }</td>
	                            	<td>
		                            	<shiro:hasPermission name="myOutVisit:cancelOutVisitPlan">
		                            	<c:choose >
		                            		<c:when test="${plan.planStatus=='Start' }">
		                         			  <a href="javascript:void(0)" onclick="cancelPlan(${plan.id})">取消外访</a>&nbsp;&nbsp;
		                            		</c:when>
		                            		<c:when test="${plan.planStatus=='Cancel' }">
		                            			  <a href="javascript:void(0)">已取消&nbsp;&nbsp;&nbsp;</a>&nbsp;&nbsp;
		                            		</c:when>
		                            		<c:otherwise>
		                            			  <a href="javascript:void(0)">取消外访</a>&nbsp;&nbsp;
		                            		</c:otherwise>
		                            	</c:choose>
		                            	</shiro:hasPermission>
		                         		<shiro:hasPermission name="myOutVisit:outVisitPlanResult">
		                         		<c:choose>
		                         			<c:when test="${plan.planStatus=='End' and plan.signStatus =='Signned' }">
		                      					<a href="javascript:void(0)" onclick="outPlanResult(${plan.id})">外访结果</a>&nbsp;&nbsp;
		                        			</c:when>
		                         			<c:otherwise>
		                       					<a href="javascript:void(0)">外访结果</a>&nbsp;&nbsp;
		                         			</c:otherwise>
		                         		</c:choose>
		                         		</shiro:hasPermission>
		                         		<shiro:hasPermission name="myOutVisit:outVisitOptions">
		                         			<c:choose>
		                         			<c:when test="${plan.planStatus=='End' and plan.signStatus =='Signned' }">
		                         				<a href="javascript:void(0)" onclick='outVisitPlanAnnex("${plan.planCode}",${plan.id},${plan.applId },${applDetail.custId})'>附件</a>&nbsp;&nbsp;
		                        			</c:when>
		                         			<c:otherwise>
		                       					<a href="javascript:void(0)">附件</a>&nbsp;&nbsp;
		                         			</c:otherwise>
		                         			</c:choose>
		                         		</shiro:hasPermission> 
	                            </td>                            		
                            	</tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
   </div>
  </div>
    <!--表格-结束-->

<!--外访计划取消窗口 -->
<div class="modal fade hideModal" id="outVisitPlanCancelModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">外访取消</h4>
            </div>
            <div class="modal-body" style="padding-bottom: 0px;">

                <form class="form-horizontal" id="outVisitCancelForm">
                
                <input type="hidden" name="id" id="outVisitPlanId_cancel">
                <input type="hidden" name="cntrctNo" value=${applDetail.cntrctNo }>
                
                    <div class="form-group">
                        <label class="col-sm-3 control-label">外访取消类别</label>
                        <div class="col-sm-6">
                            <select class="form-control" name="visitCancelType" id= "visitCancelType">
                                <option value="">请选择</option>
                                <c:forEach items="${cancelTypeList}" var="item">
                                    <option value="${item.code}">${item.val}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <span id="visitCancelTypeError" style="color:red"></span>
                    </div>

                     <div class="form-group">
					    <label class="col-sm-3 control-label">原因</label>
					   	<div class="col-sm-6">
					        <textarea class="form-control" rows="3" id="visitCancelResion" name="visitCancelResion"></textarea>
					    </div>
					    <span id="visitCancelResionError" style="color:red"></span>
					 </div>
                </form>
            </div>

            <div class="modal-footer" style="text-align:center;">
                <button class="btn btn-primary" type="button" class="btn blue" id="outVisitCancelBtn">确定</button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">取消</button>
            </div>
        </div>
    </div>
</div>



<jsp:include page="detail_modal/addOutVisitPlanAddr.jsp"></jsp:include>
<jsp:include page="detail_modal/outVisitPlanResultModal.jsp"></jsp:include>
<jsp:include page="detail_modal/outVisitPlanAnnex.jsp"></jsp:include>
<jsp:include page="/WEB-INF/views/footer.jsp" flush="true"/>

<script type="text/javascript">
//弹出取消外访计划框 
function cancelPlan(id){
	P.resetModal('outVisitCancelForm');
	$('#visitCancelTypeError').html("");
	$('#visitCancelResionError').html("");
	$('#outVisitPlanId_cancel').val(id);
	$('#outVisitPlanCancelModal').modal('show');
}
//确定取消外访计划
$('#outVisitCancelBtn').click(function(){
	if(checkoutVisitCancelForm()){
		var data = $('#outVisitCancelForm').serialize();
		  $.ajax({
				url:"<%=request.getContextPath()%>/rest/outVisitPlan/cancelOutVisitPlan?"+new Date().toTimeString(),
				type:"post",
				data:data,
				dataType: "json",
				success:function(data){
					$('#outVisitPlanCancelModal').modal('hide');
					var applId = $('#applId').val();
					var infoId = $('#infoId').val();
					$.ajax({
						url:"<%=request.getContextPath()%>/rest/outVisitPlan/searchOutVisitPlan?"+new Date().toTimeString(),
						type:"post",
						data:{"applId":applId,"infoId":infoId},
						dataType: "json",
						success:function(data){
							$("#outVisitPlanTable  tr:not(:first)").empty();
							createShowingTable(data);
						}
					});
				}

			});

	}
});

//ajax在table中添加数据
function createShowingTable(data){
	 var outPlanList = data.outPlanList;
	 var custDetail = data.custDetail;
	 var len = outPlanList.length; 
	 for ( var i = 0; i < len; i++) {  
	         
	        var item = $("<tr></tr>");
			var index = $("<td>"+i+1+"</td>");
			var planCode = $("<td>"+outPlanList[i].planCode+"</td>");
			var addressTypeName = $("<td>"+outPlanList[i].addressTypeName+"</td>");
			var address = $("<td>"+outPlanList[i].address+"</td>");
			var planStatusName = $("<td>"+outPlanList[i].planStatusName+"</td>");
			var visitCancelTypeName ="";
			if(outPlanList[i].visitCancelTypeName==""){
				visitCancelTypeName = $("<td></td>");
			}else{
				visitCancelTypeName = $("<td>"+outPlanList[i].visitCancelTypeName+"</td>");
			}
			var visitCancelResion ="";
			if(outPlanList[i].visitCancelResion==""){
				visitCancelResion = $("<td></td>");
			}else{
				visitCancelResion = $("<td>"+outPlanList[i].visitCancelResion+"</td>");
			}
			var action = "";
			if(outPlanList[i].planStatus=='Start'){
				action = $("<td><shiro:hasPermission name='myOutVisit:cancelOutVisitPlan'><a href='javascript:void(0)' onclick=cancelPlan("+outPlanList[i].id+")>取消外访</a>&nbsp;&nbsp;"
				+"</shiro:hasPermission><shiro:hasPermission name='myOutVisit:outVisitPlanResult'><a href='javascript:void(0)')>外访结果</a>&nbsp;&nbsp;"
				+"</shiro:hasPermission><shiro:hasPermission name='myOutVisit:outVisitOptions'><a href='javascript:void(0)'>附件</a>&nbsp;&nbsp;</shiro:hasPermission></td>");
			}else if(outPlanList[i].planStatus=='Cancel'){
				action = $("<td><shiro:hasPermission name='myOutVisit:cancelOutVisitPlan'><a href='javascript:void(0)'>已取消&nbsp;&nbsp;&nbsp;</a>&nbsp;&nbsp;"
						+"</shiro:hasPermission><shiro:hasPermission name='myOutVisit:outVisitPlanResult'><a href='javascript:void(0)' >外访结果</a>&nbsp;&nbsp;"
						+"</shiro:hasPermission><shiro:hasPermission name='myOutVisit:outVisitOptions'><a href='javascript:void(0)'>附件</a>&nbsp;&nbsp;</shiro:hasPermission></td>");		 
			}else{
				action = $("<td><shiro:hasPermission name='myOutVisit:cancelOutVisitPlan'><a href='javascript:void(0)'>取消外访&nbsp;&nbsp;&nbsp;</a>&nbsp;&nbsp;"
						+"</shiro:hasPermission><shiro:hasPermission name='myOutVisit:outVisitPlanResult'><a href='javascript:void(0)' onclick=outPlanResult("+outPlanList[i].id+")>外访结果</a>&nbsp;&nbsp;"
						+"</shiro:hasPermission><shiro:hasPermission name='myOutVisit:outVisitOptions'><a href='javascript:void(0)' onclick=outVisitPlanAnnex('"+outPlanList[i].planCode+"','"+outPlanList[i].id+"','"+outPlanList[i].applId +"','"+custDetail.custId+"')>附件</a>&nbsp;&nbsp;</shiro:hasPermission></td>");		 
			}
				

       	    item.append(index);
       	    item.append(planCode);
       	    item.append(addressTypeName);
       	    item.append(address);
       	    item.append(planStatusName);
       	    item.append(visitCancelTypeName);
       	    item.append(visitCancelResion);
       	    item.append(action);
			$('#outVisitPlanList').append(item);
	    }
}
//外访结果弹出框 
function outPlanResult(id){
	$('#ptpAmtError').html("");
	$.ajax({
			url:"<%=request.getContextPath()%>/rest/outVisitPlan/searchOutVisitPlanResult?"+new Date().toTimeString(),
			type:"post",
			data:{"id":id},
			dataType: "json",
			success:function(data){
					var plan = data.plan;
					$('#outVisitPlanId_result').val(plan.id);
					$('#signInfo_result').html(plan.signInfo);
					$('#signAddress_result').html(plan.signAddress);
					$('#outVisitPlanAddr_result').html(plan.address);
					$('#assistBy_result').html(plan.assistByNames);
					var rObj = $('.addressValidity');
					for(var i = 0;i < rObj.length;i++){
						if(plan.addressValidity==null){
							 $(rObj[0]).attr("checked","checked");
						}else{
							if(rObj[i].value == plan.addressValidity){
					        	 $(rObj[i]).attr("checked","checked");
					         }
						}
				         
				    }
					
					if(plan.addressValidity==null||plan.addressValidity=="Y"){
						$('#outResult_01').show();
						$('#outResult_02').hide();
						var obj = $('.followupResults1');
						var checked = 0;
						for(var i = 0;i < obj.length;i++){
					         if(obj[i].value == plan.followupResults){
					        	 $(obj[i]).attr("checked","checked");
					        	 checked++;
					         }
					    }
						if(checked==0){
							$(obj[0]).attr("checked","checked");
						}
						$('#validity_addressDiv').hide();

					}else if(plan.addressValidity=="N"){
						$('#outResult_01').hide();
						$('#outResult_02').show();
						var obj = $('.followupResults2');
						for(var i = 0;i < obj.length;i++){
					         if(obj[i].value == plan.followupResults){
					        	 $(obj[i]).attr("checked","checked");
					         }
					    }
						$('#validity_addressDiv').show();
						$('#validity_address').val(plan.validAddress);
					}
					$('#ptpDate').val(plan.ptpDateStr);
					$('#ptpAmt').val(plan.ptpAmt);
					$('#ovtresultDetail').val(plan.ovtresultDetail);


					$('#outVisitPlanResultModal').modal('show');
					
					
				},
				error:function(jqXHR,textStatus,errorThrown){
	                MSG.show("获取数据发生异常");
	                
	            }


	});
}


//保存外访结果 
$('#outVisitResultAddBtn').click(function(){
	//表格校验 TODO 
	var ptpAmt = $('#ptpAmt').val();
	if(ptpAmt.length>0){
		if(isNaN(ptpAmt)){
			$('#ptpAmtError').html('请输入正确的ptp金额');
			return false;
		}
	}
	var data = $('#outVisitResultForm').serialize();
	 $.ajax({
			url:"<%=request.getContextPath()%>/rest/outVisitPlan/saveOutVisitResult?"+new Date().toTimeString(),
			type:"post",
			data:data,
			dataType: "json",
			success:function(data){
				$('#outVisitPlanResultModal').modal('hide');
				MSG.show(data.message);
				var applId = $('#applId').val();
				var infoId = $('#infoId').val();
				
			}

	});

});

//新增外访地址弹出框
$('#addOutVisitAddressBtn').click(function(){
	$('#addrType').val("");
	$('#addrProvinceId').val("");
	$('#addrCityId').val("");
	$('#addrAreaId').val("");
	$('#addrDetails').val("");
	init_province("addrProvinceId",null);
    $('#address-add').modal('show');
});
//确实新增外访地址 
$('#address-addBtn').click(function(){
	  //表单校验
    if (!$("#addForm_addr").valid()){
        return false;
    }else{
    	$.ajax({
        	type: "post",
        	dataType: "json",
        	data:$("#addForm_addr").serialize(),
        	url: "<%=request.getContextPath()%>/rest/outVisitPlan/addAddress",
        	success: function(data){
        		if(data.success){
        			//重置表单
        			$("#addForm_addr").resetForm();
        			//关闭窗口
        			$("#address-add").modal('hide');
        			MSG.show(data.message);
        		}
        	},
        	error:function(errorData){
                MSG.show("系统异常,稍后重试");
            }
        });
    }
    
});
//附件按钮 
/* $('#outVisitPlan-AnnexBtn').click(function(){
		
}); */
function outVisitPlanAnnex(planCode,id,applId,custId){
	P.resetModal('addOutVisitPlanAnnexForm');
	$('#annexMessage').html("");
	$('#planCode_annex').val(planCode);
	$('#outVisitPlanId_annex').val(id);
	$('#applId_annex').val(applId);
	$('#clCustId_annex').val(custId);
	annexInit();
}


//地址有效性切换
$('.addressValidity').change(function(){
	var  addressValidity = $("input[name='addressValidity']:checked").val();
	if(addressValidity=="N"){
		var obj = $('.followupResults2');
		$(obj[0]).attr("checked","checked");
		$('#outResult_01').hide();
		$('#outResult_02').show();
		$('#validity_addressDiv').show();
	}else{
		var obj = $('.followupResults1');
		$(obj[0]).attr("checked","checked");
		$('#outResult_01').show();
		$('#outResult_02').hide();
		$('#validity_addressDiv').hide();
	}

});
//新增地址表单校验
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
        	addrType: {
                required: true
            },
        	addrProvinceId:{
        		required: true
        	},
        	addrCityId:{
        		required: true
        	},
        	addrAreaId:{
        		required: true
        	},
        	addrDetails: {
                required: true,minlength:2
            }
            
        },
        messages: {
        	addrType: {
                required: "请选择地址类型 "
            },
        	addrProvinceId:{
        		required:  "请选择完整的地址 "
        	},
        	addrCityId:{
        		required:  "请选择完整的地址 "
        	},
        	addrAreaId:{
        		required:  "请选择完整的地址 "
        	},
        	addrDetails: {
                required:  "请输入详细地址 "
            }
        }
    });
}




$(document).ready(function() {
    //新增表单校验
    address_validate($("#address-add #addForm_addr"));
    $('#fileName').blur(function(){
    	if($(this).val()!=""){
			$('#annexMessage').html("");	
    	}
    });
    $('#filePath').blur(function(){
    	if($(this).val()!=""){
			$('#annexMessage').html("");	
    	}
    });
});


//提交取消外访的校验
function checkoutVisitCancelForm(){
	var custType = $('#visitCancelType').val();
	var visitCancelResion = $('#visitCancelResion').val();
	if(custType.length==0){
		$('#visitCancelTypeError').html("请选择取消类别 ");
		return false;
	}else{
		$('#visitCancelTypeError').html("");
	}
	if(visitCancelResion.length==0){
		$('#visitCancelResionError').html("请填写取消原因");
		return false;
	}else{
		$('#visitCancelResionError').html("");
	}
	return true;
}

$('#visitCancelType').blur(function(){
	if($(this).val()!=""){
		$('#visitCancelTypeError').html("");	
	}
});
$('#visitCancelResion').blur(function(){
	if($(this).val()!=""){
		$('#visitCancelResionError').html("");	
	}
});

//初始化省份
function init_province(obj,para){
    $.ajax({
    	type: "post",
    	dataType: "json",
    	data: {
    		"rlevel":"1"
    	},
    	url:"<%=request.getContextPath()%>/rest/cust/findAddressByMore",
    	success: function(data){
    		if(data!=null && data.length > 0){
    			$("#"+obj).empty();
    			$("#"+obj).append("<option value=''>请选择</option>");
    			for(var i=0;i<data.length;i++){
    				//维护的时候通过id判断哪一个省份被选定
    				if(para != null && para == data[i].id){
    					$("#"+obj).append("<option selected='selected' value='"+data[i].id+"'>"+data[i].rname+"</option>");
    				}else{
    					$("#"+obj).append("<option value='"+data[i].id+"'>"+data[i].rname+"</option>");
    				}
    			}
    		}else{
    			$("#"+obj).empty();
                $("#"+obj).append("<option value=''>请选择</option>");
            }
    	}
    });
}

//城市联动变化 obj为this   para1为城市列表select的ID  para2为被选定的城市ID  para3位被选定的省份的ID
function city_change(obj,para1,para2,para3){
    //获取选中省份 的id用来查询城市列表
    var value = "";
    if(obj != null && obj != ""){
        value=obj.value;
    }else if(para3 != null && para3 != "" ){
    	value=para3;
    }else{
    	return;
    }
    $.ajax({
        type: "post",
        dataType: "json",
        data: {
            "pid": value
        },
        url:"<%=request.getContextPath()%>/rest/cust/findAddressByMore",
        success: function(data){
            if(data!=null && data.length > 0){
                $("#"+para1).empty();
                $("#"+para1).append("<option value=''>请选择</option>");
                for(var i=0;i<data.length;i++){
                	//维护的时候通过id判断哪一个城市被选定
                    if((para2 != null || para2 != "" )&& para2 == data[i].id){
                        $("#"+para1).append("<option selected='selected' value='"+data[i].id+"'>"+data[i].rname+"</option>");
                    }else{
                        $("#"+para1).append("<option value='"+data[i].id+"'>"+data[i].rname+"</option>");
                        //清空地区以待选择
                        $("#addrAreaId").empty();
                        $("#addrAreaId").append("<option value=''>请选择</option>");
                    }
                }
            }else{
                $("#"+para1).empty();
                $("#"+para1).append("<option value=''>请选择</option>");
                //清空地区以待选择
                $("#addrAreaId").empty();
                $("#addrAreaId").append("<option value=''>请选择</option>");
            }
        }
    });
}

//地区联动变化  obj为this   para1为地区列表select的ID  para2为被选定的地区ID  para3位被选定的城市的ID
function area_change(obj,para1,para2,para3){
    //获取选中城市
	var value = "";
    if(obj != null && obj != ""){
        value=obj.value;
    }else if(para3 != null && para3 != "" ){
        value=para3;
    }else{
        return;
    }
    $.ajax({
        type: "post",
        dataType: "json",
        data: {
            "pid": value
        },
        url:"<%=request.getContextPath()%>/rest/cust/findAddressByMore",
        success: function(data){
            if(data!=null && data.length > 0){
            	$("#"+para1).empty();
                $("#"+para1).append("<option value=''>请选择</option>");
                for(var i=0;i<data.length;i++){
                	//维护的时候通过id判断哪一个地区被选定
                    if((para2 != null || para2 != "" )&& para2 == data[i].id){
                        $("#"+para1).append("<option selected='selected' value='"+data[i].id+"'>"+data[i].rname+"</option>");
                    }else{
                        $("#"+para1).append("<option value='"+data[i].id+"'>"+data[i].rname+"</option>");
                    }
                }
            }else{
                $("#"+para1).empty();
                $("#"+para1).append("<option value=''>请选择</option>");
            }
        }
    });
}

/************设置页面加载时修改页面左侧菜单栏状态*************/
$(function(){
	var getVal=localStorage.getItem("getVal");
	if(getVal=="visitInfo_my"){
		$('#'+'visitInfo').click();
		$('#'+getVal+'active').addClass('choose_active');
	}
	//点击菜单移除选中项class
	$('.sub-menu li').click(function(){
		$('.sub-menu li').find('a').removeClass('choose_active');
	})
})

</script>
