<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>    
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>催收用户设置</title>
<style>
	.dataTables_scrollBody tbody tr td{
	    padding: 4px 10px !important;
	}
</style>
</head>

<div class="plms-content">
	<div class="panel panel-default">
		<div class="panel-heading">
	      <h3 class="panel-title">
	         	催收用户设置
	      </h3>
   		</div>
   		<div class="panel-body">
		 	<form id="searchForm">
		        <label for="userId" class="right-space-1">催收员</label>
		        <span class="search_box">
	        		<input type="text" id="userName_" name="userName" class="search_input" /> 
			        <div class="search_ionic input-group-addon" id="collectorSearchBtn">
			           	<i class="glyphicon glyphicon-search"></i>
			        </div>
		       	</span>
		       	&nbsp;&nbsp;&nbsp;
		       	<label for="orgId" class="right-space-1">所属机构</label>
		        <select id="org" name="orgId" class="collection line-bottom">
		        	<option value="">全部</option>
		            <c:forEach items="${orgList}" var="item">
		                <option value="${item.id}">${item.orgName}</option>
		            </c:forEach>   
		        </select>  
		       <br/>
		       <shiro:hasPermission name="collector:select">
		        <input class="btn btn-primary" type="button" id="searchBtn"  value="查询"/>
		        </shiro:hasPermission>
		        &nbsp;
				<shiro:hasPermission name="collector:insert">
		        <input class="btn btn-primary" type="button" id="addBtn" value="新增"/>
		        </shiro:hasPermission>
		         &nbsp;
		        <button type="reset" class="btn btn-default" >清除</button>  
		        
		    </form>
		</div>
    </div>

<table id="dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th class="text-center">序号</th>
        <th class="text-center">用户id</th>
        <th class="text-center">所属机构</th>
        <th class="text-center">催收员</th>
        <th class="text-center">所属区间</th>
        <th class="text-center">催收姓氏</th>
        <th class="text-center">电话号码</th>
        <th class="text-center">有效性</th>
        <th class="text-center">是否分配</th>
       <!--  <th class="text-center">维护人</th>
        <th class="text-center">维护时间</th> -->
        <th class="text-center">操作</th>
    </tr>
    </thead>
</table>
<!--添加窗口-->
    <div class="modal fade hideModal" id="empcollectSet-add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                    <h4 class="modal-title">催收用户--新增</h4>
                </div>
                <div class="modal-body">

                    <form class="form-horizontal" id="addForm">
                        <div class="form-group">
                            <label class="col-sm-4 control-label">所属机构</label>
                            <div class="col-sm-6">
                                <select class="form-control" name="orgId" id="orgId">
                                	<option value="">请选择</option>
                                    <c:forEach items="${orgList}" var="item">
                                        <option value="${item.id}">${item.orgName}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
 						<div class="form-group">
                            <label class="col-sm-4 control-label">催收员</label>
                            <div class="col-sm-6">
                                <select class="form-control" name="userId" id="userId">
                                	  <option value="" class='autoOption'>请选择</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-4 control-label">催收姓氏</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control"name="messageName">
                            </div>
                        </div>
                         <div class="form-group">
                            <label class="col-sm-4 control-label">是否为组长</label>
                            <span class="col-sm-6">
	        		   			<label class="right-space"><input type="radio" name="isLeader"  value="Y">是</label>                
	        		   			<label> <input type="radio" name="isLeader"  value="N" checked>否 </label>      
	        		   		</span>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-4 control-label">所属区间</label>
                             <span class="col-sm-6">
                                <c:forEach items="${scopeList}" var="item" varStatus="status">
                                	<%-- <c:if test="${(status.index)%4==0 }">
                                		 <br/>
                                	</c:if> --%>
                                	<label class="right-space"><input type="checkbox" name="scopeList" value="${item.id}">${item.name}</label>
					            </c:forEach> 
                            </span>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-4 control-label"></label>
                            <div class="col-sm-6">
                                <span class="redStar redStarMessages"></span>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="button" class="btn blue" id="empcollectSet-addBtn">
                        新增
                    </button>
                    <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">
                        返回
                    </button>
                </div>
            </div>
        </div>
    </div>
 <!--修改窗口-->
    <div class="modal fade hideModal" id="empcollectSet-update" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                    <h4 class="modal-title">催收用户设置--修改</h4>
                </div>
                <div class="modal-body">

                    <form class="form-horizontal" id="updateForm">
                        <div class="form-group">
                            <label class="col-sm-4 control-label">所属机构</label>
                           	<div class="col-sm-6">
                            <select class="form-control" name="orgId" id="edit_orgId" disabled>
                            <c:forEach items="${orgList}" var="item">
				                <option value="${item.id}" >${item.orgName}</option>
				            </c:forEach>                           
				            </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-4 control-label">催收员</label>
                           	<div class="col-sm-6">
                            <select class="form-control" name="userId" id="edit_userId" disabled>
                            <c:forEach items="${userList}" var="item">
				                <option value="${item.userId}" >${item.userName}</option>
				            </c:forEach>                           
				            </select>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label">催收姓氏</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control"name="messageName" id="edit_messageName">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-4 control-label">是否为组长</label>
                            <span class="col-sm-6">
	        		   			<label class="right-space"><input type="radio" name="isLeader" class ="edit_isLeader" value="Y">是</label>        
	        		 			<label><input type="radio" name="isLeader" class = "edit_isLeader"  value="N" >否</label> 		                   
	        		   		</span>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-4 control-label">是否分配</label>
                            <span class="col-sm-6">
	        		   			<label class="right-space"><input type="radio" name="isAlloc" class ="edit_isAlloc" value="Y">是</label>        
	        		 			<label><input type="radio" name="isAlloc" class = "edit_isAlloc"  value="N" >否</label> 		                   
	        		   		</span>
                        </div> 
                        <div class="form-group">
                            <label class="col-sm-4 control-label">所属区间</label>
                             <span class="col-sm-6">
                                <c:forEach items="${scopeList}" var="item" varStatus="status">
                                	<%-- <c:if test="${(status.index)%4==0 }">
                                		<br/> 
                                	</c:if> --%>
                                	<label class="right-space"><input type="checkbox" class="scopeList" name="scopeList" value="${item.id}">${item.name}</label>
					            </c:forEach> 
                            </span>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-4 control-label"></label>
                            <div class="col-sm-6">
                                <span class="redStar redStarMessages"></span>
                            </div>
                        </div>                        
                    </form>

                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="button" class="btn blue" id="empcollectSet-updateBtn">
                        修改
                    </button>
                    <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">
                        返回
                    </button>
                </div>
            </div>
        </div>
    </div>
    
    
    <!--催收员窗口-->
<div class="modal fade hideModal" id="collectorSearchModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">查找催收员</h4>
            </div>
            <div class="modal-body" style="padding-bottom: 0px;">

                <form class="form-horizontal" id="collectorSearchForm">

                    <div class="form-group">
                        <label class="col-sm-4 control-label">所属机构</label>
                        <div class="col-sm-5">
                            <select class="form-control" name="search_orgId" id="search_orgId" >
                             <option value="">请选择</option>
                        	 <c:forEach items="${orgList}" var="item">
				                <option value="${item.id}" >${item.orgName}</option>
				            </c:forEach> 
                            </select>
                        </div>
                    </div>

                    <div class="form-group" style="height: 450px;overflow-y:auto;overflow-x:hidden;  ">
                        <table class="table table-border dataTable">
                        	<thead>
                        		<tr>
                        		<th>选择</th>
                        		<th>员工姓名</th>
                        		<th>所属机构</th>
                        		</tr>
                        	</thead>
                        	<tbody id="collectorTBody">
                        	</tbody>
                        </table>
                    </div>
                </form>
            </div>

            <div class="modal-footer" style="text-align:center;padding-top: 0px;">
                <button class="btn btn-primary" type="button" class="btn blue" id="collectorAddBtn">
                   	 确定
                </button>
                 <button class="btn btn-primary" type="button" class="btn blue" >
                   	 清除
                </button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">
                   	 返回
                </button>
            </div>
        </div>
    </div>
</div>
</div>


<script type="text/javascript">

	var empCollectSet_table;
	<%-- function empCollectSet_init(){
		empCollectSet_table = P.dataTable($('#dataTable'),
		        $("#searchForm"),
		        "<%=request.getContextPath()%>/rest/plmsEmpCollectSet/pageEmpCollectSetData",
		        [
		            {"mData" : "rowNo","sDefaultContent" : ""},
		            {"mData" : "userId","sDefaultContent" : ""},
		            {"mData" : "orgName","sDefaultContent" : ""},
		            {"mData" : "userName","sDefaultContent" : ""},
		            {"mData" : "groupNames","sDefaultContent" : ""},
		            {"mData" : "messageName","sDefaultContent" : ""},
		            {"mData" : "officeTel","sDefaultContent" : ""},
		            {"mData" : "isActiveText","sDefaultContent" : ""},
		           /*  {"mData" : "updatedBy","sDefaultContent" : ""},
		            {"mData" : "updateTime","sDefaultContent" : ""}, */
		            {"mData" : "userId",
		                "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
		                	if(oData.isActive=='Y'){
		                		$(nTd).html("<shiro:hasPermission name='collector:update'><a href='javascript:void(0);' " +           
			        	                "onclick='update_empCollectset(\"" + oData.orgId + "\",\"" + oData.userId + "\",\"" + oData.messageName + "\",\"" + oData.groupIds + "\",\"" + oData.isleader + "\")'>修改&nbsp;&nbsp;</a></shiro:hasPermission>"+
			        	                "<shiro:hasPermission name='collector:delete'><a href='javascript:void(0);' " +           
			        	                "onclick='delete_empCollectset(\"" + oData.userId + "\")'>删除</a></shiro:hasPermission>");
			                }else{
			                	$(nTd).html("");
			                }
		                }
		                    
		            }
		        ]
		);
		
	} --%>
	
	function empCollectSet_init(){
		empCollectSet_table =$('#dataTable').DataTable({
	      "scrollY": '410px',
	      "scrollX": '100%',
	      "sScrollXInner": "100%",
	      "bScrollCollapse": true,

	      "sPaginationType": "full_numbers",      //设置分页控件的模式
	      "bLengthChange": false,                 //改变每页显示数据数量
	      "bPaginate": true,                      //是否翻页功能
	      "bFilter": false,                       //是否过滤功能
	      "bInfo": true,                         //是否页脚信息
	      "bSort": true,                            //是否排序功能

	      "bAutoWidth": true,                    //是否自动宽度
	      "bStateSave": false,                    //是否记忆配置,记录在cookies中

	      "iDisplayLength": 100,
	      "destroy":true,                         //允许销毁Table(即第二次点击会清空第一次的Table)
	      "oLanguage": {
	          "sZeroRecords": "没有检索到数据",
	          "sInfo": "从 _START_ 到 _END_ /共 _TOTAL_ 条数据",
	          "sInfoEmpty": "没有数据",
	          "sInfoFiltered": "(从 _MAX_ 条数据中检索)",
	          "oPaginate": {
	              "sFirst": "首页",
	              "sPrevious": "前一页",
	              "sNext": "后一页",
	              "sLast": "尾页"
	          }
	      },
	      "bProcessing": false,       //加载数据时显示正在加载信息
	      "bServerSide": true,        //指定从服务器端获取数据
	      "sAjaxSource" : "<%=request.getContextPath()%>/rest/plmsEmpCollectSet/pageEmpCollectSetData",
	      "fnServerData" : function(sSource, aoData, fnCallback) {
	          //参数拼接
	          var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#searchForm").serialize();
	          $.ajax({
	              "type" : 'POST',
	              "dataType" : "json",
	              "url" : sSource,
	              "data" : data,
	              "success" : function(resp) {
	               $('#checkall').attr("checked", false);
	                  fnCallback(resp);
	              }
	              ,"error":function(jqXHR,textStatus,errorThrown){
	                  MSG.show("获取数据发生异常");
	                  $('#main-content').html(jqXHR.responseText);
	              }
	          });
	      },
	      //dataTable显示
	      "aoColumns" : [
				{"mData" : "rowNo","sDefaultContent" : ""},
	            {"mData" : "userId","sDefaultContent" : ""},
	            {"mData" : "orgName","sDefaultContent" : ""},
	            {"mData" : "userName","sDefaultContent" : ""},
	            {"mData" : "groupNames","sDefaultContent" : ""},
	            {"mData" : "messageName","sDefaultContent" : ""},
	            {"mData" : "officeTel","sDefaultContent" : ""},
	            {"mData" : "isActiveText","sDefaultContent" : ""},
	            {"mData" : "isAllocText","sDefaultContent" : ""},
	           /*  {"mData" : "updatedBy","sDefaultContent" : ""},
	            {"mData" : "updateTime","sDefaultContent" : ""}, */
	            {"mData" : "userId",
	                "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
	                	if(oData.isActive=='Y'){
	                		$(nTd).html("<shiro:hasPermission name='collector:update'><a href='javascript:void(0);' " +           
		        	                "onclick='update_empCollectset(\"" + oData.orgId + "\",\"" + oData.userId + "\",\"" + oData.messageName + "\",\"" + oData.groupIds + "\",\"" + oData.isleader + "\",\"" + oData.isAlloc + "\")'>修改&nbsp;&nbsp;</a></shiro:hasPermission>"+
		        	                "<shiro:hasPermission name='collector:delete'><a href='javascript:void(0);' " +           
		        	                "onclick='delete_empCollectset(\"" + oData.userId + "\")'>删除</a></shiro:hasPermission>");
		                }else{
		                	$(nTd).html("");
		                }
	                }
	                    
	            }
	      ],
	      "aoColumnDefs":[
                          {"bSortable":false,"aTargets": [0,8]}                          
          ]
	  });
	 
	}

$('#searchBtn').on( 'click', function () {
	empCollectSet_table.search($("#searchForm").serialize()).draw();
});

//弹出查找条件框
$('#collectorSearchBtn').click(function(){
	$('#collectorSearchModal').modal('show');
});

$('#search_orgId').change(function(){
	getUserEmpOrg($(this).val());
});

function getUserEmpOrg(orgId){
		 
	$.ajax({
	            type : 'POST',
	            dataType : "json",
	            url : "<%=request.getContextPath()%>/rest/userDataRange/selectUserByOrgId",
		        data : {"orgId":orgId},
	            success : function(data) {
	                if(data){
	                    var $collectorTBody = $("#collectorTBody");
	                    var bodyHtml = "";
	                    for(var i = 0; i < data.length; i++){
	                        bodyHtml += "<tr><td><input type='radio' name='checkCollector' value='"+ data[i].userName +"'></td><td>" + data[i].userName + "</td><td>" + data[i].orgName + "</td></tr>";
	                    }
	                    $collectorTBody.html(bodyHtml);
	                }
	            },
	            error:function(){
	                MSG.show("获取催收员机构信息失败");
	            }
	        });
}

//确定催收员按钮
$('#collectorAddBtn').on('click', function (){
    var collectorName = $('input[name="checkCollector"]').filter(':checked').val(); 
    if(!collectorName){
        MSG.show('请选择一个催收员');
        return;
    }
    $('#userName_').val(collectorName);
    $("#collectorSearchModal").modal("hide");
});

//清除催收员按钮
$('#collectorClearBtn').on('click', function (){
    $('#userName_').val('');
    $("#collectorSearchModal").modal("hide");
});

//机构--用户联动
$('#orgId').change(function(){
	var orgId = $('#orgId').val();
	var userId = $('#userId');
	var options = $('#userId option:not(:first)');
	options.remove();
	if(orgId.length>0){
		$.ajax({
	        type : 'POST',
	        dataType : "json",
	        url : "<%=request.getContextPath()%>/rest/userDataRange/selectUserByOrgId",
	        data : {"orgId":orgId},
	        success : function(data) {
	        	$.each(data,function(index,result){
	        		var option = "<option value='"+result['userId']+"'>"+result['userName']+"</option>"; 
	        		userId.append(option); 
	        	});            
	        },
	        error:function(){
	            MSG.show("系统异常,稍后重试");
	        }
	    });
	}
});
//弹出新增框
$('#addBtn').click(function(){
	$('#empcollectSet-add').modal('show');
});

//实际新增操作
$('#empcollectSet-addBtn').click(function(){
	 //表单校验
    if (!$('#empcollectSet-add #addForm').valid()){
        return false;
    }
    var form = $(this).parents(".modal-dialog").find("#addForm");
    var content = $(this).parents(".plms-content");
    P.addPost("<%=request.getContextPath()%>/rest/plmsEmpCollectSet/addEmpCollectSet?"+new Date().toTimeString(),form,content,empCollectSet_table);
	
	
});



//显示修改窗口
function update_empCollectset(orgId,userId,messageName,groupIds,isLeader,isAlloc){
	$("#updateForm").find(':input').removeAttr('checked');	
	$('#edit_orgId').val(orgId);
	$('#edit_userId').val(userId);
	$('#edit_messageName').val(messageName);
	var rObj = $('.edit_isLeader');
	for(var i = 0;i < rObj.length;i++){
         if(rObj[i].value == isLeader){
        	 $(rObj[i]).attr("checked","checked");
         }
    }
	var rObj = $('.edit_isAlloc');
	for(var i = 0;i < rObj.length;i++){
         if(rObj[i].value == isAlloc){
        	 $(rObj[i]).attr("checked","checked");
         }
    }
	var ids = groupIds.split(",");
	var checkBoxs = $('.scopeList');
	if(checkBoxs.length>0){
		for(var i=0;i<checkBoxs.length;i++){
			var val = checkBoxs[i].value;
			if(ids.length>0){
				for(var j=0;j<ids.length;j++){
					if(ids[j]==val){
						$(checkBoxs[i]).attr("checked","checked");
					}
				}
			}	
		}
	}
	$('#empcollectSet-update').modal('show');
}

//实际更新操作 
$('#empcollectSet-updateBtn').click(function(){
	var orgId = $('#edit_orgId').val();
	var userId = $('#edit_userId').val();
	  //表单校验
    if (!$('#empcollectSet-update #updateForm').valid()){
        return false;
    }
    var form = $(this).parents(".modal-dialog").find("#updateForm");
    var content = $(this).parents(".plms-content");
    P.updatePost("<%=request.getContextPath()%>/rest/plmsEmpCollectSet/updateEmpCollectSetData?orgId="+orgId+"&userId="+userId+"&date="+new Date().toTimeString(),form,content,empCollectSet_table);
});

 //删除操作
function delete_empCollectset(userId){
	MSG.confirm("确定删除?",function(){
		$.ajax({
			type: "post",
			url: "<%=request.getContextPath()%>/rest/plmsEmpCollectSet/deleteEmpCollectSetData?"+new Date().toTimeString(),
			data:{"userId":userId},
			dataType: "json",
			success: function(msg){
				MSG.show(msg.message);
				empCollectSet_table.search($("#searchForm").serialize()).draw();
			}
		});
	});
} 

$(document).ready(function() {
	empCollectSet_init();
	//新增表单校验
    empCollectset_validate($("#empcollectSet-add #addForm"));
});

//表单校验
function empCollectset_validate($validateForm){
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
	        	orgId:	{
	        		required: true
	        	},
	            userId: {
	                required: true
	            } ,
	            isLeader:{
	            	required: true
	            },
	            scopeList: {
	                required: true
	            } 
	        },
	        messages: {
	        	orgId: {
	                required: "请选择所属区间 "
	            } ,
	            userId: {
	                required: "请选择用户 "
	            } ,
	            isLeader: {
	                required: "请选择是否为组长 "
	            } ,
	            scopeList: {
	                required: "请选择区间"
	            } 
	        }
	    });
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