<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>    
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>外访用户设置</title>
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
         	外访用户配置
      </h3>
   </div>
   <div class="panel-body">
     <form id="searchForm">
    	<label for="orgId" class="right-space-1">所属机构</label>
        <select id="org" name="orgId" class="right-space collection">
        	<option value="">全部</option>
            <c:forEach items="${orgList}" var="item">
                <option value="${item.id}">${item.orgName}</option>
            </c:forEach>   
        </select>
        
        <label for="outVisiterName" class="right-space-1">外访人员</label>
        <input type="text" id="userName" name="userName" class="right-space collection"/> 
        
        <label for="isActive" class="right-space-1">状态</label>
        <select id="isActive" name="isActive" class="collection">
        	<option value="">全部</option>
            <option value="Y">有效</option>
            <option value="N">无效</option>
        </select>
        &nbsp;  
       <shiro:hasPermission name="outVisitUser:select">
        <input class="btn btn-primary" type="button" id="searchBtn"  value="查询"/>
        </shiro:hasPermission>
        &nbsp;
		<shiro:hasPermission name="outVisitUser:insert">
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
        <th class="text-center">所属机构</th>
        <th class="text-center">外访员</th>
        <th class="text-center">外访区域</th>
        <th class="text-center">状态</th>
        <th class="text-center">维护人</th>
        <th class="text-center">维护时间</th>
        <th class="text-center">操作</th>
    </tr>
    </thead>
</table>
<!--添加窗口-->
    <div class="modal fade hideModal" id="outVisiter-add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" style="width:500px">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                    <h4 class="modal-title">外访用户--新增</h4>
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
                            <label class="col-sm-4 control-label">外访员</label>
                            <div class="col-sm-6">
                                <select class="form-control" name="userId" id="userId">
                                	  <option value="" class='autoOption'>请选择</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-4 control-label">外访区域</label>
                            <div class="col-sm-6">
                                <select class="form-control" name="areaId" id="areaId">
                                	<option value="">请选择</option>
                                    <c:forEach items="${areaList}" var="item">
                                        <option value="${item.id}">${item.areaName}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                         <div class="form-group">
                          <label class="col-sm-4 control-label">电话号码</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control"name="tel" id="tel">
                            </div>
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
                    <button class="btn btn-primary" type="button" class="btn blue" id="outVisiter-addBtn">
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
    <div class="modal fade hideModal" id="outVisiter-update" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" style="width:500px">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                    <h4 class="modal-title">外访用户设置--修改</h4>
                </div>
                <div class="modal-body">

                    <form class="form-horizontal" id="updateForm_outVis">
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
                            <label class="col-sm-4 control-label">外访员</label>
                           	<div class="col-sm-6">
                            <select class="form-control" name="userId" id="edit_userId" disabled>
                            <c:forEach items="${userList}" var="item">
				                <option value="${item.userId}" >${item.userName}</option>
				            </c:forEach>                           
				            </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-4 control-label">外访区域</label>
                            <div class="col-sm-6">
                                <select class="form-control" name="areaId" id="edit_areaId">
                                	<option value="">请选择</option>
                                    <c:forEach items="${areaList}" var="item">
                                        <option value="${item.id}">${item.areaName}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                          <label class="col-sm-4 control-label">电话号码</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" name="tel" id="edit_tel">
                            </div>
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
                    <button class="btn btn-primary" type="button" class="btn blue" id="outVisiter-updateBtn">
                        修改
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

	var outVisitor_table;
	<%-- function outVisitor_init(){
		outVisitor_table = P.dataTable($('#dataTable'),
		        $("#searchForm"),
		        "<%=request.getContextPath()%>/rest/plmsOutVisitUser/pageOutVisitUserData",
		        [
		            {"mData" : "rowNo","sDefaultContent" : ""},
		            {"mData" : "orgName","sDefaultContent" : ""},
		            {"mData" : "userName","sDefaultContent" : ""},
		            {"mData" : "areaName","sDefaultContent" : ""},
		            {"mData" : "isActiveText","sDefaultContent" : ""},
		            {"mData" : "updatedBy","sDefaultContent" : ""},
		            {"mData" : "updateTime","sDefaultContent" : ""},
		            {"mData" : "userId",
		                "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
		                    $(nTd).html("<shiro:hasPermission name='outVisitUser:update'><a href='javascript:void(0);' " +           
		        	                "onclick='update_outVisitUser(\"" + oData.orgId + "\",\"" + oData.userId + "\",\"" + oData.areaId + "\",\"" + oData.tel + "\")'>修改&nbsp;&nbsp;</a></shiro:hasPermission>"
		        	        	+"<shiro:hasPermission name='outVisitUser:delete'><a href='javascript:void(0);' " +           
	        	                "onclick='delete_outVisitUser(\"" + oData.id + "\")'>删除&nbsp;&nbsp;</a></shiro:hasPermission>"        
		                    
		                    );
		                }
		            }
		        ]
		);
		
	} --%>
	
	function outVisitor_init(){
		outVisitor_table =$('#dataTable').DataTable({
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

	      "bAutoWidth": true,                     //是否自动宽度
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
	      "sAjaxSource" : "<%=request.getContextPath()%>/rest/plmsOutVisitUser/pageOutVisitUserData",
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
	            {"mData" : "orgName","sDefaultContent" : ""},
	            {"mData" : "userName","sDefaultContent" : ""},
	            {"mData" : "areaName","sDefaultContent" : ""},
	            {"mData" : "isActiveText","sDefaultContent" : ""},
	            {"mData" : "updatedUserName","sDefaultContent" : ""},
	            {"mData" : "updateTime","sDefaultContent" : ""},
	            {"mData" : "userId",
	                "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
	                    $(nTd).html("<shiro:hasPermission name='outVisitUser:update'><a href='javascript:void(0);' " +           
	        	                "onclick='update_outVisitUser(\"" + oData.orgId + "\",\"" + oData.userId + "\",\"" + oData.areaId + "\",\"" + oData.tel + "\")'>修改&nbsp;&nbsp;</a></shiro:hasPermission>"
	        	        	+"<shiro:hasPermission name='outVisitUser:delete'><a href='javascript:void(0);' " +           
        	                "onclick='delete_outVisitUser(\"" + oData.id + "\")'>删除&nbsp;&nbsp;</a></shiro:hasPermission>"        
	                    
	                    );
	                }
	            }
	      ],
	      "aoColumnDefs":[
                          {"bSortable":false,"aTargets": [0,7]}                          
          ]
	  });
	 
	}

$('#searchBtn').on( 'click', function () {
	outVisitor_table.search($("#searchForm").serialize()).draw();
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
	$('#outVisiter-add').modal('show');
});

//实际新增操作
$('#outVisiter-addBtn').click(function(){
	 //表单校验
    if (!$('#outVisiter-add #addForm').valid()){
        return false;
    }
    var form = $(this).parents(".modal-dialog").find("#addForm");
    var content = $(this).parents(".plms-content");
    P.addPost("<%=request.getContextPath()%>/rest/plmsOutVisitUser/addOutVisitUser?"+new Date().toTimeString(),form,content,outVisitor_table);
	
	
});



//显示修改窗口
function update_outVisitUser(orgId,userId,areaId,tel){
	$('#edit_orgId').val(orgId);
	$('#edit_userId').val(userId);
	$('#edit_areaId').val(areaId);
	$('#edit_tel').val(tel);
	/*var checkBoxs = $('#edit_areaId');
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
	}  */
	$('#outVisiter-update').modal('show');
}

function delete_outVisitUser(id){
	MSG.confirm("确定删除?",function(){
		$.ajax({
			type: "post",
			url: "<%=request.getContextPath()%>/rest/plmsOutVisitUser/deleteOutVisitUser?"+new Date().toTimeString(),
			data:{"id":id},
			dataType: "json",
			success: function(msg){
				MSG.show(msg.message);
				outVisitor_table.search($("#searchForm").serialize()).draw();
			}
		});
	});
	
	
	
}


//实际更新操作 
$('#outVisiter-updateBtn').click(function(){
	var orgId = $('#edit_orgId').val();
	var userId = $('#edit_userId').val();
	var areaId = $("#edit_areaId").val();
	  //表单校验
    if (!$('#outVisiter-update #updateForm_outVis').valid()){
        return false;
    }
    var form = $(this).parents(".modal-dialog").find("#updateForm_outVis");
    var content = $(this).parents(".plms-content");
    P.updatePost("<%=request.getContextPath()%>/rest/plmsOutVisitUser/updateOutVisitUser?orgId="+orgId+"&userId="+userId+"&date="+new Date().toTimeString(),form,content,outVisitor_table);
    
});

$(document).ready(function() {
	outVisitor_init();
	//新增表单校验
    empCollectset_validate($("#outVisiter-add #addForm"));
    empCollectset_validate($("#outVisiter-update #updateForm_outVis"));

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
            areaId: {
                required: true
            } 
        },
        messages: {
        	orgId: {
                required: "请选择所属机构 "
            } ,
            userId: {
                required: "请选择用户 "
            } ,
            areaId: {
                required: "请选择区域"
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
