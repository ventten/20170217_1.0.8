<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="../taglib/base.jsp"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
/* .modal-body {
    width: 60%;
    margin: 0 auto;
}
.modal-body.modal-body-1{
	width: 100%;
} */
</style>
<script type="text/javascript">
$(function(){
	
	circuForm_validate($('#circuForm'));
	selectColl();
	selectCircu();
	selectAssignRuleTable();
	selectprotectTable();
	$('#hiddenDiv').hide();
	$('#circuOverduedaysFrom').focus(function(){
		$('.redStarMessages').html("");
	});
	$('#circuOverduedaysTo').focus(function(){
		$('.redStarMessages').html("");
	});
});


//表单校验
function circuForm_validate($validateForm){
    $validateForm.validate({
        unhighlight: function (element, errorClass, validClass) {
            //验证通过
            $(element).tooltip("destroy").removeClass(errorClass);
        },
        errorPlacement: function (label, element) {
            //让验证提示显示在验证框下面 注：有些地方如果动态添加这个属性不成功就手动添加data-placement="bottom"属性
            $(element).attr("data-placement","bottom");
            $(element).tooltip("destroy"); /* 必需 */
            $(element).attr("title", $(label).text()).tooltip("show");
        },
        rules: {
        	name: {
                required: true
            },
            overduedaysFrom:{
            	posiviteNum:true
            },
            overduedaysTo:{
            	posiviteNum:true
            }
        },
        messages: {
        	name: {
                required: "规则名称不能为空 "
            }
        }
    });
}
function selectColl(){
	//$('#collTable').remove("tr");
	$("#collTable  tr:not(:first)").empty();
	$.ajax({
		url:"${ctx}/rest/collectionRule/view?"+ new Date().toTimeString(),
		type:"post",
		dataType: "json",
		success:function(data){
			$.each(data,function(i,result){ 
				
				var item = $("<tr></tr>");
				var val = $("<td>"+result['val']+"</td>");
				var name = $("<td>"+result['name']+"</td>");
				var circuRuleVal = $("<td>"+result['circuRuleVal']+"</td>");
				var assignMethodVal = $("<td>"+result['assignMethodVal']+"</td>");
				var assignRuleVal = "";
				if(result['assignRuleVal']==null||result['assignRuleVal']==""){
					assignRuleVal = $("<td></td>");
				}else{
					assignRuleVal =$("<td>"+result['assignRuleVal']+"</td>");
				}
				var isActive = $("<td>"+result['isActive']+"</td>");
				var action ="";
				if(result['isRunning']=='Y'){
					action = $("<td><shiro:hasPermission name='workorderpool:update'><button type='button' class='btn btn-primary btn-sm'  onclick='updateCollection(\""+result['id']+"\",\""+result['val']+"\",\""+result['name']+"\",\""+result['circuRuleCode']+"\",\""+result['assignMethodCode']+"\",\""+result['assignRuleCode']+"\",\""+result['recVer']+"\")'>修改</button>&nbsp;</shiro:hasPermission><shiro:hasPermission name='workorderpool:stop'><button type='button' class='btn btn-primary btn-sm'  onclick='stopColltecion("+result['id']+","+result['recVer']+")'>停用</button></shiro:hasPermission></td>");
				}else if(result['isRunning']=='N'){
					action =$("<td><a href='#'>已停用</a></td>");
					item.css({"backgroundColor":"#EBEBEB"});
				}
				var updatedBy = $("<td>"+result['updatedBy']+"</td>");
				var updateTime = $("<td>"+result['updateTime']+"</td>");
	       	    item.append(val);
	       	    item.append(name);
	       	    item.append(circuRuleVal);
	       	    item.append(assignMethodVal);
	       	    item.append(assignRuleVal);
	       	    item.append(isActive);
	       	    item.append(action);
	       	    item.append(updatedBy);
	       	    item.append(updateTime);
				$('#collTable').append(item); })
		}
	});
}

function selectCircu(){
	$("#circuTable  tr:not(:first)").empty();
	$.ajax({
		url:"${ctx}/rest/circuRule/view?"+new Date().toTimeString(),
		type:"post",
		dataType: "json",
		success:function(data){
			var item; 
			$.each(data,function(i,result){ 
				var item = $("<tr></tr>");
				var val = $("<td>"+result['val']+"</td>");
				var updatedBy = $("<td>"+result['updatedBy']+"</td>");
				var updateTime = $("<td>"+result['updateTime']+"</td>");
				var action = $("<td><shiro:hasPermission name='circuRule:select'><button type='button' class='btn btn-primary btn-sm'  onclick='searchCircuRule(\""+result['id']+"\",\""+result['val']+"\",\""+result['overduedaysFrom']+"\",\""+result['overduedaysTo']+"\",\""+result['riskLevelCode']+"\",\""+result['recVer']+"\")'>查看</button>&nbsp;</shiro:hasPermission><shiro:hasPermission name='circuRule:update'><button type='button' class='btn btn-primary btn-sm'  onclick='updateCircuRule(\""+result['id']+"\",\""+result['val']+"\",\""+result['overduedaysFrom']+"\",\""+result['overduedaysTo']+"\",\""+result['riskLevelCode']+"\",\""+result['recVer']+"\",\""+result['code']+"\",\""+i+"\")'>修改</button></shiro:hasPermission></td>");
				item.append(val);
		       	item.append(updatedBy);
		       	item.append(updateTime);
		       	item.append(action);
			    $('#circuTable').append(item); })
		}
	});
	
	
}


function selectAssignRuleTable(){
	$("#assignRuleTable  tr:not(:first)").empty();
	$.ajax({
		url:"${ctx}/rest/assignRule/view?"+new Date().toTimeString(),
		type:"post",
		dataType: "json",
		success:function(data){
			$.each(data,function(i,result){ 
			var item = $("<tr></tr>");
			var val = $("<td>"+result['val']+"</td>");
			var updatedBy = $("<td>"+result['updatedBy']+"</td>");
			var updateTime = $("<td>"+result['updateTime']+"</td>");
       	    var action ="";
   	 		action = $("<td><shiro:hasPermission name='assignRule:select'><button type='button' class='btn btn-primary btn-sm'  onclick=searchAssignRule('"+result['code']+"')>查看</button></shiro:hasPermission></td>");
       	    item.append(val);
       	    item.append(updatedBy);
       	    item.append(updateTime);
       	    item.append(action);
			$('#assignRuleTable').append(item); })
		}
	});
}


function selectprotectTable(){
	$("#protectTable  tr:not(:first)").empty();
	$.ajax({
		url:"${ctx}/rest/protectRule/view?"+new Date().toTimeString(),
		type:"post",
		dataType: "json",
		success:function(data){
			$.each(data,function(i,result){ 
				var item = $("<tr></tr>");
				var val = $("<td>"+result['val']+"</td>");
				var protectVal = "";
				var assignValue = "";
				if(result['code']=='IMMUNITY'){
					protectVal = $("<td>发起豁免申请</td>");
					assignValue = $("<td>豁免流程结束</td>");
				}else if(result['code']=='DRPERIOD'){
					protectVal = $("<td>1、催收区间：M2/M3/M4<br/>2、对应区间的案件逾期天数减少</td>");
					assignValue = $("<td>每月1号自动清空催收员，重新自动分配</td>");
				}else if(result['code']=='RESERVE'){
					protectVal = $("<td>发起保留</td>");
					assignValue = $("<td>1、超过保留期   2、案件被分配</td>");
				}else if(result['code']=='QUIT'){
					protectVal = $("<td>催收员对应系统用户状态为无效</td>");
					assignValue = $("<td>次日即之后</td>");
				}
				var assignVal = $("<td>"+result['assignVal']+"</td>");
				var updatedBy = $("<td>"+result['updatedBy']+"</td>");
				var updateTime = $("<td>"+result['updateTime']+"</td>");
       	 		var action = $("<td><shiro:hasPermission name='protectRule:update'><button type='button' class='btn btn-primary btn-sm'  onclick='updateProtectRule(\""+result['id']+"\",\""+result['code']+"\",\""+result['val']+"\",\""+result['assignCode']+"\",\""+result['recVer']+"\")'>修改</button></shiro:hasPermission></td>")
	       	    item.append(val);
	       	    item.append(protectVal);
	       	    item.append(assignValue);
	       	    item.append(assignVal);
	       	    item.append(updatedBy);
	       	    item.append(updateTime);
	       	    item.append(action);
				$('#protectTable').append(item); })
		}
	});
}


function updateCollection(id,val,name,circuRuleVal,circuAssignMethod,assignRuleVal,recVer){
	 $('#collId').val(id);
	 $('#collVal').val(val);
	 $('#collName').val(name);
	 $('#collcircuRuleVal').val(circuRuleVal);
	 $('#collcircuAssignMethod').val(circuAssignMethod);
	 $('#collcircuAssignRule').val(assignRuleVal);
	 $('#collRec').val(recVer);
	 $('#myModal').modal();
}

function updateCircuRule(id,val,overduedaysFrom,overduedaysTo,riskLevelCode,recVer,code,index){
	$("#circuModalTitle").html("流转规则-修改 ");
	$('#circuOverduedaysFrom').removeAttr("readonly");
	$('#circuOverduedaysTo').removeAttr("readonly");
	$('#circuVal').removeAttr("readonly");
	$('#riskLevelCode').removeAttr("readonly");
	$('#circubtn').show();
	$('#circuId').val(id);
	$('#circuVal').val(val);
	$('#circuCode').val(code);
	$('#circuIndex').val(index);
	if(isNaN(overduedaysFrom)){
		$('#circuOverduedaysFrom').val("");
	}else{
		$('#circuOverduedaysFrom').val(overduedaysFrom);
	}
	if(isNaN(overduedaysTo)){
		$('#circuOverduedaysTo').val("");
	}else{
		$('#circuOverduedaysTo').val(overduedaysTo);
	}
	$('#riskLevelCode').val(riskLevelCode);
	$('#circuRec').val(recVer);
	$('#circuModal').modal();

}

function searchCircuRule(id,val,overduedaysFrom,overduedaysTo,riskLevelCode,recVer){
	
	$("#circuModalTitle").html("流转规则-查看 ");
	$('#circuVal').attr("readonly","readonly");
	$('#circuOverduedaysFrom').attr("readonly","readonly");
	$('#circuOverduedaysTo').attr("readonly","readonly");
	$('#riskLevelCode').attr("readonly","readonly");
	$('#circubtn').hide();
	$('#circuId').val(id);
	$('#circuVal').val(val);
	if(isNaN(overduedaysFrom)){
		$('#circuOverduedaysFrom').val("");
	}else{
		$('#circuOverduedaysFrom').val(overduedaysFrom);
	}
	if(isNaN(overduedaysTo)){
		$('#circuOverduedaysTo').val("");
	}else{
		$('#circuOverduedaysTo').val(overduedaysTo);
	}
	$('#riskLevelCode').val(riskLevelCode);
	$('#circuRec').val(recVer);
	$('#circuModal').modal();
}


function updateAssignRule(code,upperLimit,recVer){
	
	$('#assignRuleCode').val(code);
	$('#assignRuleUpperLimit').val(upperLimit);
	$('#assignRuleRec').val(recVer);
	$('#assignRuleModal').modal();
}


function updateProtectRule(id,code,val,assignCode,recVer){
	
		 $('#protectRuleId').val(id);
	     $('#protectRuleVal').val(val);
	     if(code=='IMMUNITY'){
	    	 $('#protectRulePValue').val("发起豁免申请");
	    	 $('#protectRuleAValue').val("豁免流程结束");
	     }else if(code=='DRPERIOD'){
	    	 $('#protectRulePValue').val("1、催收区间：M2/M3/M4 2、对应区间的案件逾期天数减少");
	    	 $('#protectRuleAValue').val("每月1号自动清空催收员，重新自动分配");
	     }else if(code=='RESERVE'){
	    	 $('#protectRulePValue').val("发起保留");
	    	 $('#protectRuleAValue').val("1、超过保留期   2、案件被分配");
	     }else if(code=='QUIT'){
	    	 $('#protectRulePValue').val("催收员对应系统用户状态为无效");
	    	 $('#protectRuleAValue').val("次日即之后");
	     }
		 $('#protectRuleAssignCode').val(assignCode);
		 $('#protectRuleRec').val(recVer);
		 $('#protectRuleModal').modal();
	
	
}



function updatecoll(){
	var id = $('#collId').val();
	var val =  $('#collVal').val();
	var name = $('#collName').val();
	if(name.length==0){
		MSG.alert("区间名称不能为空!");
		return false;
	}
	var circuRuleCode = $('#collcircuRuleVal').val();
	var assignMethodCode =  $('#collcircuAssignMethod').val();
	var assignRuleCode =  $('#collcircuAssignRule').val();
	if(assignMethodCode=='AUTO_ASSIGNED'&&assignRuleCode==null){
		MSG.alert("请选择分配规则!");
		return false;
	}
	var recVer = $('#collRec').val();
	
	$.ajax({
		type: "post",
		url: "${ctx}/rest/collectionRule/"+id+"/update?"+ new Date().toTimeString(),
		data:{"val":val,"name":name,"circuRuleCode":circuRuleCode,"assignMethodCode":assignMethodCode,"assignRuleCode":assignRuleCode,"recVer":recVer},
		dataType: "text",
		success: function(msg){
		if(msg=="ok"){
		  $('#myModal').modal('hide');
			selectColl();
		}
		}
	});
}


function updatecircu(){
    var overduedaysFrom = $('#circuOverduedaysFrom').val();
	var overduedaysTo = $('#circuOverduedaysTo').val();
	var circuIndex = $('#circuIndex').val();
	if(overduedaysFrom.length>0&&overduedaysTo.length>0){
		if(parseInt(overduedaysFrom)>parseInt(overduedaysTo)){
			$('.redStarMessages').html("开始天数不能大于结束天数");
			return false;
		}

	}
	
	if (!$("#circuForm").valid()){
	        return false;
	    }
	var data  = $('#circuForm').serialize();
	$.ajax({
		type: "post",
		url: "${ctx}/rest/circuRule/update?"+new Date().toTimeString(),
		data:data,
		dataType: "text",
		success: function(msg){
		if(msg=="ok"){
		  $('#circuModal').modal('hide');
			selectCircu();
		}
		}
		
	});
}

function updateAssign(){
	 var code = $('#assignRuleCode').val();
	 var upperLimit = $('#assignRuleUpperLimit').val();
	 if(upperLimit.length==0){
		 MSG.alert("组长分配月上限值不能为空!");
		 return false;
	 }
	 if(isNaN(upperLimit)){
		 MSG.alert("组长分配月上限值必须为数字!");
		 return false;		 
	 }
	 var recVer = $('#assignRuleRec').val();
	$.ajax({
		type: "post",
		url: "${ctx}/rest/assignRule/"+code+"/update?"+new Date().toTimeString(),
		data:{"code":code,"upperLimit":upperLimit,"recVer":recVer},
		dataType: "text",
		success: function(msg){
		if(msg=="ok"){
		  $('#assignRuleModal').modal('hide');
			selectAssignRuleTable();
		}
		}
		
	});
	
}

function updateProtect(){
	 var id = $('#protectRuleId').val();
	 var assignCode = $('#protectRuleAssignCode').val();
	 var recVer = $('#protectRuleRec').val();
		$.ajax({
			type: "post",
			url: "${ctx}/rest/protectRule/"+id+"/update?"+new Date().toTimeString(),
			data:{"id":id,"assignCode":assignCode,"recVer":recVer},
			dataType: "text",
			success: function(msg){
			if(msg=="ok"){
			  $('#protectRuleModal').modal('hide');
				selectprotectTable();
			}
			}
		});
}
/*增加工单池 */
function subData(){
	var collection_val = $('#collection_val').val();
	var collection_name = $('#collection_name').val();
	var collection_circuRule = $('#collection_circuRule').val();
	var collection_assignMethod = $('#collection_assignMethod').val();
	var collection_assignRule = $('#collection_assignRule').val();
	if(collection_val.length>0&&collection_name.length>0&&collection_circuRule.length>0&&collection_assignMethod.length>0){
	
	}else{
		MSG.alert("请将信息填写完整!");
		return false;
	}
	if(collection_assignMethod=='AUTO_ASSIGNED'&&collection_assignRule.length==0){
		MSG.alert("请选择分配规则!");
		return false;
	}

	if(isNaN(collection_val)){
		MSG.alert("区间值必须为数字!");
		return false;
	}
	//验证流转规则唯一性 
	$.ajax({
		type: "post",
		url: "${ctx }/rest/collectionRule/checkcircuRule?"+new Date().toTimeString(),
		data:{"circuRuleval":collection_circuRule},
		dataType: "text",
		success: function(msg){
			if(msg=="Y"){
				MSG.alert("此流转规则已经存在，请重新选择！");
				return false;
			}else{
				$.ajax({
					type: "post",
					url: "${ctx }/rest/collectionRule/insert",
					data:{"val":collection_val,"name":collection_name,"circuRuleCode":collection_circuRule,"assignMethodCode":collection_assignMethod,"assignRuleCode":collection_assignRule},
					dataType: "json",
					success: function(msg){
						if(msg.success){
							//清空表单元素 
							$("#addCollForm").find(':input').not(':button, :submit, :reset').val('')
							.removeAttr('disabled').removeAttr('selected');
							selectColl();
						}else{
							
						}
					}
					
				});	
			}
		}
		
	});
	
	
	
}


function stopColltecion(id,recVer){
	MSG.confirm("确定停用 ?",function(){
		$.ajax({
			type: "post",
			url: "${ctx}/rest/collectionRule/"+id+"/update?"+new Date().toTimeString(),
			data:{"id":id,"isRunning":'N',"isActive":"N","recVer":recVer},
			dataType: "text",
			success: function(msg){
			if(msg=="ok"){
				selectColl();
			}
			}
		});
	});
	
}

function searchAssignRule(code,upperLimit){
	if(code=="AVRG_DIST"){
		$('#leaderUpperTime').val(upperLimit);
		$('#avg-task').modal('show');

	}else if(code=="WORK_MORE"){
		$('#more-work').modal('show');

	}
	
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
</head>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog" style="width:450px">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
          	<h4 class="modal-title" id="myModalLabel">
			工单池-修改            
			</h4>
         </div>
         <div class="modal-body">
          <form class="form-horizontal" id="collForm">
          <input type="hidden"  id="collId">
          <input type="hidden"  id="collRec">
		   <div class="form-group">
		      <label class="col-sm-4 control-label">区间值</label>
		      <div class="col-sm-6">
		      <input type="text" class="form-control" readonly="readonly" id="collVal" >
		      </div>
		   </div>
		   <div class="form-group">
		       <label for="name" class="col-sm-4 control-label">区间名称</label>
		      <div class="col-sm-6">
		      <input type="text" class="form-control"  id="collName" >
		      </div>
		   </div>
		   <div class="form-group">
	      <label for="name" class="col-sm-4 control-label">流转规则</label>
	      <div class="col-sm-6">
            	<select class="form-control"  id="collcircuRuleVal" disabled >
	         		<c:forEach items="${circulist }" var="u">
           			<option value="${u.code }">${u.val }</option>
           			</c:forEach>  
	      		</select>
           </div>
	      </div>   
	       <div class="form-group">
	      <label for="name" class="col-sm-4 control-label">分配方式</label>
	      <div class="col-sm-6">
	      <select class="form-control"  id="collcircuAssignMethod" >
	         <c:forEach items="${assignMethodList }" var="u">
           		<option value="${u.code }">${u.val }</option>
           </c:forEach>  
	      </select>
	      </div>
	      </div>
	      <div class="form-group">
	      	  <label for="name" class="col-sm-4 control-label">分配规则</label>
		      <div class="col-sm-6">
		      <select class="form-control"  id="collcircuAssignRule" >
		         <c:forEach items="${assignRuleList }" var="u">
	           		<option value="${u.code }">${u.val }</option>
	           </c:forEach>  
		      </select>
		      </div>
	      </div>
	      </form>
       </div>
         <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            <button type="button" class="btn btn-primary" onclick="updatecoll()">提交更改</button>
          </div>
      </div>
	</div>
</div>


<div class="modal fade" id="circuModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog" style="width:450px">
	   <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" id="circuModalTitle">
				流转规则-修改            
			</h4>
         </div>
         <div class="modal-body">
          <form  class="form-horizontal" id="circuForm">
          <input id="circuCode" type="hidden" name="code">
          <input id="circuId" type="hidden" name="id" > 
          <input type="hidden"  id="circuRec" name="recVer">
          <input type="hidden"  id="circuIndex" >
          
		   <div class="form-group">
		      <label for="name" class="col-sm-4 control-label">规则名称</label>
		      <div class="col-sm-6">
		      		<input type="text" class="form-control" readonly="readonly" id="circuVal" name="name">
              </div>
		   </div>
		   <div class="form-group">
		      <label for="name" class="col-sm-4 control-label">逾期天数</label>
		      <div class="col-sm-6">
		      		<input type="text" class="collection-data"  id="circuOverduedaysFrom" name="overduedaysFrom">
		      		<span for="name" style="width:22px;display:inline-block;text-align:center">至 </span>
		      		<input type="text" class="collection-data"  id="circuOverduedaysTo" name="overduedaysTo" >
		      </div>
		      
		   </div>
		  <!--  <div class="form-group">
		   		<label for="name" class="col-sm-3 control-label">至 </label>
		      <div class="col-sm-6">
		       <input type="text" class="form-control"  id="circuOverduedaysTo" name="overduedaysTo" >
		      </div>
		   </div> -->
		  <div class="form-group" id="hiddenDiv">
		      <label for="name" class="col-sm-3 control-label">风险等级</label>
		      <div class="col-sm-6">
		      <select class="form-control"  id="riskLevelCode" name="riskLevelCode">
		          <c:forEach var="risk" items="${riskList}">
	                            <option value="${risk.code}"
	                                <c:if test="${circuRule.riskLevelCode==risk.code}">selected</c:if>>${risk.val}级 
	                            </option>
	              </c:forEach> 
		      </select>
	      	  </div>
		 </div>
		<div class="form-group">
               <label class="col-sm-3 control-label"></label>
               <div class="col-sm-6">
                   <span class="redStar redStarMessages"></span>
               </div>
        </div>
	</form>
   </div>
         <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            <button type="button" class="btn btn-primary" id="circubtn" onclick="updatecircu()"> 提交更改</button>
         </div>
   </div>
</div>
</div>

<div class="modal fade" id="assignRuleModal" tabindex="-1" role="dialog" 
   aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" id="myModalLabel">
			平均分配-修改            
			</h4>
         </div>
         <div class="modal-body">
            <form role="form" id="assignRuleForm">
	           <input type="hidden" id = "assignRuleCode">
	           <input type="hidden"  id="assignRuleRec">
			   <div class="form-group">
			      <label for="name">组长分配月上限值</label>
			      <input type="text" class="form-control"  id="assignRuleUpperLimit" >
			   </div>
		    </form>
         </div>
         <div class="modal-footer">
            <button type="button" class="btn btn-default" 
               data-dismiss="modal">关闭
            </button>
            <button type="button" class="btn btn-primary" onclick="updateAssign()"> 提交更改</button>
         </div>
      </div>
</div>
</div>


<div class="modal fade" id="protectRuleModal" tabindex="-1" role="dialog" 
   aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog" style="width:450px">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" id="myModalLabel">
			保护规则-修改            
			</h4>
         </div>
         <div class="modal-body">
          	 <form role="form" id="protectRuleForm">
		          <input type="hidden"  id="protectRuleId">
		          <input type="hidden"  id="protectRuleRec">
				   <div class="form-group clearfex">
				      <label for="name" class="col-sm-4 control-label text-right">条件</label>
				      <div class="col-sm-6">
				      	  <input type="text" readonly="readonly" id="protectRuleVal" >
				      </div>
				   </div>
				   <div class="form-group clearfex">
				       <label for="name" class="col-sm-4 control-label text-right">保护值</label>
				       <div class="col-sm-6">
				      	   <input type="text" readonly="readonly" id="protectRulePValue" >
				       </div>
				   </div>
				   <div class="form-group clearfex">
				      <label for="name" class="col-sm-4 control-label text-right">分配值</label>
				      <div class="col-sm-6">
				      	  <input type="text" readonly="readonly" id="protectRuleAValue" >
				      </div>
				   </div>
				   <div class="form-group clearfex">
				      <label for="name" class="col-sm-4 control-label text-right">分配方式</label>
				      <div class="col-sm-6">
					      <select  id="protectRuleAssignCode">
					         <c:forEach items="${assignMethodList }" var="u">
				           		<option value="${u.code }">${u.val }</option>
				           </c:forEach>  
					      </select>
				      </div>
			      </div>
			</form>
         </div>
         <div class="modal-footer">
            <button type="button" class="btn btn-default" 
               data-dismiss="modal">关闭
            </button>
            <button type="button" class="btn btn-primary" onclick="updateProtect()">
                                              提交更改
            </button>
         </div>
      </div>
</div>
</div>

<!-- 弹窗-平均分配-规则详情 -->
<div class="modal fade" id="avg-task" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				<h4 class="modal-title" id="myModalLabel">平均分配-规则详情</h4>
			</div>
			<div class="modal-body modal-body-1">
				<form class="form-horizontal">
					<div class="form-group">
						<label class="col-xs-3 control-label left-space-2">组长分配月上限值</label>
						<div class="col-xs-8">
							<input type="text" class="form-control" id="leaderUpperTime" readonly="readonly">
						</div>
					</div>
					<div style="margin: 15px;padding: 15px;border: 1px solid #e4e4e4;">
						<div class="form-group">
							<label class="col-xs-2 control-label">分配日期</label>
							<div class="col-xs-10">
								<input type="text" class="form-control" value="每月1号" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label class="col-xs-2 control-label">人员排序</label>
							<div class="col-xs-5">
								<input type="text" class="form-control" value="上月个人实收" readonly="readonly">
							</div>
							<div class="col-xs-5">
								<input type="text" class="form-control" value="升序" readonly="readonly">
							</div>
						</div>
					</div>
					<div style="margin: 15px;padding: 15px;border: 1px solid #e4e4e4;">
						<div class="form-group">
							<label class="col-xs-2 control-label">分配日期</label>
							<div class="col-xs-10">
								<input type="text" class="form-control" value="每月2号及2号之后" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label class="col-xs-2 control-label">人员排序</label>
							<div class="col-xs-5">
								<input type="text" class="form-control" value="当月新增累计库存" readonly="readonly">
							</div>
							<div class="col-xs-5">
								<input type="text" class="form-control" value="升序" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label class="col-xs-2 control-label"></label>
							<div class="col-xs-5">
								<input type="text" class="form-control" value="剩余本金/保证金" readonly="readonly">
							</div>
							<div class="col-xs-5">
								<input type="text" class="form-control" value="升序" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label class="col-xs-2 control-label">新增数据</label>
							<div class="col-xs-5">
								<input type="text" class="form-control" value="剩余本金/保证金" readonly="readonly">
							</div>
							<div class="col-xs-5">
								<input type="text" class="form-control" value="降序" readonly="readonly">
							</div>
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">返回</button>
			</div>
		</div>
	</div>
</div>

<!-- 弹窗-多劳多得-规则详情 -->
<div class="modal fade" id="more-work" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				<h4 class="modal-title" id="myModalLabel">多劳多得-规则详情</h4>
			</div>
			<div class="modal-body">
				<form class="form-horizontal">
					<div style="margin: 15px;padding: 15px;border: 1px solid #e4e4e4;">
						<div class="form-group">
							<label class="col-xs-4 control-label">前一天区间回收案件数</label>
							<div class="col-xs-6">
								<input type="text" class="form-control" value="1" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label class="col-xs-4 control-label">前一天个人回收案件数</label>
							<div class="col-xs-6">
								<input type="text" class="form-control" value="1" readonly="readonly">
							</div>
						</div>
						<p>按分配公式分配：</p>
						<p style="color: red;">个人当天应分配案件数=[（前一天个人回收案件数/总回收案件数）*（当天新增案件数 – 该区间应分配催收员数量）]+1</p>
					</div>
					<div style="margin: 15px;padding: 15px;border: 1px solid #e4e4e4;">
						<div class="form-group">
							<label class="col-xs-5 control-label">前一天区间回收案件数</label>
							<div class="col-xs-6">
								<input type="text" class="form-control" value="0" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label class="col-xs-5 control-label">前一天个人回收案件数</label>
							<div class="col-xs-6">
								<input type="text" class="form-control" value="0或1" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label class="col-xs-5 control-label">前一天区间回收案件数为0，<br />未连续2天出现</label>
							<div class="col-xs-6">
								<input type="text" class="form-control" value="1" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label class="col-xs-5 control-label">前一天人员排序方式</label>
							<div class="col-xs-6">
								<input type="text" class="form-control" value="升序/未知" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label class="col-xs-5 control-label">当月累计回收案件数</label>
							<div class="col-xs-3">
								<input type="text" class="form-control" value="1" readonly="readonly">
							</div>
							<div class="col-xs-3">
								<input type="text" class="form-control" value="降序" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label class="col-xs-5 control-label">上月累计回收案件数</label>
							<div class="col-xs-3">
								<input type="text" class="form-control" value="1" readonly="readonly">
							</div>
							<div class="col-xs-3">
								<input type="text" class="form-control" value="降序" readonly="readonly">
							</div>
						</div>
					</div>
					<div style="margin: 15px;padding: 15px;border: 1px solid #e4e4e4;">
						<div class="form-group">
							<label class="col-xs-5 control-label">前一天区间回收案件数</label>
							<div class="col-xs-6">
								<input type="text" class="form-control" value="0" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label class="col-xs-5 control-label">前一天个人回收案件数</label>
							<div class="col-xs-6">
								<input type="text" class="form-control" value="0或1" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label class="col-xs-5 control-label">前一天区间回收案件数为0，<br />未连续2天出现</label>
							<div class="col-xs-6">
								<input type="text" class="form-control" value="1" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label class="col-xs-5 control-label">前一天人员排序方式</label>
							<div class="col-xs-6">
								<input type="text" class="form-control" value="升序/未知" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label class="col-xs-5 control-label">当月累计回收案件数</label>
							<div class="col-xs-3">
								<input type="text" class="form-control" value="1" readonly="readonly">
							</div>
							<div class="col-xs-3">
								<input type="text" class="form-control" value="降序" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label class="col-xs-5 control-label">上月累计回收案件数</label>
							<div class="col-xs-3">
								<input type="text" class="form-control" value="1" readonly="readonly">
							</div>
							<div class="col-xs-3">
								<input type="text" class="form-control" value="降序" readonly="readonly">
							</div>
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">返回</button>
			</div>
		</div>
	</div>
</div>
<div>
<ul id="myTab" class="nav nav-tabs">
   <shiro:hasPermission name="workorderpool:select">
   <li class="active">
      <a href="#home" data-toggle="tab">
        	 工单池
      </a>
   </li>    
   </shiro:hasPermission>
   <shiro:hasPermission name="circuRule:select">
   <li><a href="#circuRule" data-toggle="tab">流转规则</a></li>
   </shiro:hasPermission>
 <%--   <shiro:hasPermission name="assignRule:select"> 
   <li><a href="#assignRule" data-toggle="tab">自动分配规则</a></li>
   </shiro:hasPermission>
 --%>   <shiro:hasPermission name="protectRule:select">
   <li><a href="#protectRule" data-toggle="tab">保护规则</a></li>
   </shiro:hasPermission>
   
</ul>
 <div id="myTabContent" class="tab-content"> 
<c:if test="${not empty msg}">
    <div class="message">${msg}</div>
</c:if>
   <div class="tab-pane fade in active" id="home">
   <form action="" method="post" id='addCollForm'>
   	<span style="color:red">*</span>区&nbsp;间&nbsp;值：&nbsp;&nbsp;<input name="val" id="collection_val" class="collection input-border">&nbsp;&nbsp;
    <span style="color:red">*</span>区间名称：&nbsp;&nbsp;<input name="name" id="collection_name" class="collection input-border">&nbsp;&nbsp;
    <span style="color:red">*</span> 流转规则：&nbsp;&nbsp;<select name="circuRuleCode" id="collection_circuRule" class="collection">
	           <c:forEach items="${circulist }" var="u">
	           		<option value="${u.code }">${u.val }</option>
	           </c:forEach> 
           </select class="collection">&nbsp;&nbsp;
    <span style="color:red">*</span>分配方式：&nbsp;&nbsp;<select name="assignMethodCode" id="collection_assignMethod" class="collection">
	           <c:forEach items="${assignMethodList }" var="u">
	           		<option value="${u.code }">${u.val }</option>
	           </c:forEach> 
           </select>
           <br/><br/>
        	分配规则：&nbsp;&nbsp;<select name="assignRuleCode" id="collection_assignRule" class="collection">
           <c:forEach items="${assignRuleList }" var="u">
           		<option value="${u.code }">${u.val }</option>
           </c:forEach> 
           </select>&nbsp;&nbsp;
    <shiro:hasPermission name="workorderpool:insert">     
    <button type="button" class="btn btn-primary btn-sm" onclick="subData()">新增区间</button>
    </shiro:hasPermission> 
   </form>
   <br>
    <table class="table table-bordered dataTable" width="50%"  align="center" id="collTable">
	   <thead>
	      <tr>
	         <th>区间值</th>
	         <th>区间</th>
	         <th>流转规则</th>
	         <th>分配方式</th>
	         <th>分配规则</th>
	         <th>状态</th>
	         <th>操作</th>
	         <th>操作员</th>
	         <th>操作时间</th>    
	      </tr>
	   </thead>
	   <tbody>
	   </tbody>
	</table>
	</div>
	
   <div class="tab-pane fade" id="circuRule">
     <table class="table table-bordered dataTable" width="50%" height="300px" align="center" id="circuTable">
	   <thead>
	      <tr>
	         <th>规则名称</th>
	         <th>维护人</th>
	         <th>维护时间</th>
	         <th>操作</th>
	         
	      </tr>
	   </thead>
	   <tbody>
	   </tbody>
	</table>
   </div>
   
   <div class="tab-pane fade" id="assignRule">
     <table class="table table-bordered dataTable" width="50%"  align="center" id="assignRuleTable">
	   <thead>
	      <tr>
	         <th>规则名称</th>
	         <th>维护人</th>
	         <th>维护时间</th>
	         <th>操作</th>
	         
	      </tr>
	   </thead>
	   <tbody>
	   </tbody>
	</table>
   </div> 
   <div class="tab-pane fade" id="protectRule">
	 <table class="table table-bordered dataTable" width="50%" align="center" id="protectTable">
	   <thead>
	      <tr>
	         <th>条件</th>
	         <th>保护值</th>
	         <th>分配值</th>
	         <th>分配方式</th>
	         <th>修改人</th>
	         <th>修改时间</th>
	         <th>操作</th>
	      </tr>
	   </thead>
	   <tbody>
	   </tbody>
	</table>
   </div>
   </div>
</div>