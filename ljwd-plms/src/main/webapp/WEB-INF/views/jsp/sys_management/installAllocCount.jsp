<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>月分配案件数管理</title>
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
         	月分配案件数管理
      </h3>
   </div>
   <div class="panel-body">
     <form id="searchForm">
    	<label for="orgId" class="right-space-1">所属机构</label>
        <select id="org" name="orgId" class="collection">
        	<option value="">全部</option>
            <c:forEach items="${orgList}" var="item">
                <option value="${item.id}">${item.orgName}</option>
            </c:forEach>   
        </select>
        
    	 <shiro:hasPermission name="monthAllocUpper:select">
         <button type="button" class="btn btn-primary left-space right-space-2" id="searchBtn">查询</button>
         </shiro:hasPermission>
         <shiro:hasPermission name="monthAllocUpper:insert">
         <button type="button" class="btn btn-primary right-space-2" id="addBtn">新增</button>
         </shiro:hasPermission>
         <button type="reset" class="btn btn-default" >清除</button>  
         
	</form>
   </div>
</div>

<div>
<table id="upperLimit_dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th>序号</th>
        <th>所属机构</th>
        <th>角色</th>
<!--         <th>员工姓名</th>
 -->    <th>月上限值</th>
        <th>状态</th>
        <th>设置时间</th>
        <th>维护人</th>
        <th>操作</th>
    </tr>
    </thead>
</table>
</div>

 <!--添加窗口-->
    <div class="modal fade hideModal" id="upperLimit-add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" style="width:450px">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                    <h4 class="modal-title">月上限值--新增</h4>
                </div>
                <div class="modal-body">

                    <form class="form-horizontal" id="addForm">
                        <div class="form-group">
                            <label class="col-sm-4 control-label">所属机构</label>
                            <div class="col-sm-6">
                                <select class="form-control" name="orgId">
                                	<option value="">请选择</option>
                                    <c:forEach items="${orgList}" var="item">
                                        <option value="${item.id}">${item.orgName}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label">角色</label>
                             <div class="col-sm-6">
                                <select class="form-control" name="roleId">
                                   <option value="">请选择</option>
                                    <c:forEach items="${roleList}" var="item">
                                        <option value="${item.id}">${item.roleName}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>

                      <%--   <div class="form-group">
                            <label class="col-sm-4 control-label">员工姓名</label>
                            <div class="col-sm-6">
                                <select class="form-control" name="userId">
                                	<option value="">请选择</option>
                                    <c:forEach items="${userList}" var="item">
                                        <option value="${item.userId}">${item.userName}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
 --%>
                        <div class="form-group">
                            <label class="col-sm-4 control-label"><span class="redStar">* </span>月上限值</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control"name="upperLimit">
                            </div>
                        </div>

                    </form>

                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="button" class="btn blue" id="upperLimit-addBtn">
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
    <div class="modal fade hideModal" id="upperLimit-update" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" style="width:450px">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                    <h4 class="modal-title">月上限值--修改</h4>
                </div>
                <div class="modal-body">

                    <form class="form-horizontal" id="updateForm">
                        <div class="form-group">
                            <label class="col-sm-4 control-label">所属机构</label>
                            <div class="col-sm-6">
                                <select class="form-control" name="orgId" id="edit_orgId" disabled>
                                    <c:forEach items="${orgList}" var="item">
                                        <option value="${item.id}">${item.orgName}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label">角色</label>
                             <div class="col-sm-6">
                                <select class="form-control" name="roleId" id="edit_roleId" disabled>
                                    <c:forEach items="${roleList}" var="item">
                                        <option value="${item.id}">${item.roleName}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>

                      <%--   <div class="form-group">
                            <label class="col-sm-4 control-label">员工姓名</label>
                            <div class="col-sm-6">
                                <select class="form-control" name="userId" id="edit_userId" disabled>
                                    <c:forEach items="${userList}" var="item">
                                        <option value="${item.userId}">${item.userName}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
 --%>
                        <div class="form-group">
                            <label class="col-sm-4 control-label"><span class="redStar">* </span>月上限值</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control"name="upperLimit" id="edit_upperLimit">
                            </div>
                        </div>
						
						  <div class="form-group">
                            <label class="col-sm-4 control-label"><span class="redStar">* </span>状态</label>
                           	<div class="col-sm-6">
                            <select class="form-control" name="isActive" id="edit_isActive" >
                                        <option value="Y">有效</option>
                                        <option value="N">无效</option>           
                            </select>
                            </div>
                        </div>
                        <input type="hidden" id="edit_recVer" name="recVer">
                        <input type="hidden" id="edit_id" name="id">
                        
                    </form>

                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="button" class="btn blue" id="upperLimit-updateBtn">
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

<script type="text/javascript" language="javascript">

	var upperLimit_table;
	
	 //Table初始化方法
    <%-- function upperLimit_init(){
    	upperLimit_table = P.dataTable($('#upperLimit_dataTable'),
                $("#searchForm"),
                "<%=request.getContextPath()%>/rest/allocInstall/pageUpperLimitData?"+new Date().toTimeString(),
                [
                 	{"mData" : "rowNo","sDefaultContent" : "" },  
                 	{"mData" : "orgName","sDefaultContent" : ""},
	                {"mData" : "roleName","sDefaultContent" : ""},
                 /* {"mData" : "userName","sDefaultContent" : ""}, */
                    {"mData" : "upperLimit","sDefaultContent" : ""},
                    {"mData" : "isActiveText","sDefaultContent" : ""},
                    {"mData" : "updateTime","sDefaultContent" : ""},
                    {"mData" : "updatedBy","sDefaultContent" : ""},
                    {"mData" : "id",
                        "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        	if(oData.isActive=="Y"){
                        		 $(nTd).html("<shiro:hasPermission name='monthAllocUpper:update'><a href='javascript:void(0);' " +
                                         "onclick='update_upperLimit(\"" + oData.id + "\",\"" + oData.orgId + "\",\"" + oData.roleId +  "\",\"" + oData.upperLimit + "\",\"" + oData.isActive + "\",\"" + oData.recVer + "\")'>修改</a></shiro:hasPermission>&nbsp;&nbsp;");   	
                        	}else{
                        		 $(nTd).html("");
                        	}
                        }
                    }
                ]
        );
    } --%>
  //Table初始化方法
  function upperLimit_init(){
	  upperLimit_table =$('#upperLimit_dataTable').DataTable({
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
      "sAjaxSource" : "<%=request.getContextPath()%>/rest/allocInstall/pageUpperLimitData?"+new Date().toTimeString(),
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
			{"mData" : "rowNo","sDefaultContent" : "" },  
           	{"mData" : "orgName","sDefaultContent" : ""},
           	{"mData" : "roleName","sDefaultContent" : ""},
           /* {"mData" : "userName","sDefaultContent" : ""}, */
            {"mData" : "upperLimit","sDefaultContent" : ""},
            {"mData" : "isActiveText","sDefaultContent" : ""},
            {"mData" : "updateTime","sDefaultContent" : ""},
            {"mData" : "updatedUserName","sDefaultContent" : ""},
            {"mData" : "id",
                "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                	if(oData.isActive=="Y"){
                		 $(nTd).html("<shiro:hasPermission name='monthAllocUpper:update'><a href='javascript:void(0);' " +
                                 "onclick='update_upperLimit(\"" + oData.id + "\",\"" + oData.orgId + "\",\"" + oData.roleId +  "\",\"" + oData.upperLimit + "\",\"" + oData.isActive + "\",\"" + oData.recVer + "\")'>修改</a></shiro:hasPermission>&nbsp;&nbsp;");   	
                	}else{
                		 $(nTd).html("");
                	}
                }
            }
      ],
      "aoColumnDefs":[
                      {"bSortable":false,"aTargets": [0,7]}                          
      ]
  });
 
}

	$('#searchBtn').click(function(){
		upperLimit_table.search($(this).parents("#searchForm").serialize()).draw();  //刷新页面

	});

	//新增按钮 
	$('#addBtn').click(function(){
		$('#upperLimit-add').modal('show');
		
	});
	//实际新增操作 
	$('#upperLimit-addBtn').click(function(){
		 //表单校验
        if (!$('#upperLimit-add #addForm').valid()){
            return false;
        }
        var form = $(this).parents(".modal-dialog").find("#addForm");
        var content = $(this).parents(".plms-content");
        P.addPost("<%=request.getContextPath()%>/rest/allocInstall/addUpperLimit?"+new Date().toTimeString(),form,content,upperLimit_table);
	});
	
	//弹出修改框
	function update_upperLimit(id,orgId,roleId,upperLimit,isActive,recVer){
		$('#edit_id').val(id);
		$('#edit_orgId').val(orgId);
		$('#edit_roleId').val(roleId);
		//$('#edit_userId').val(userId);
		$('#edit_upperLimit').val(upperLimit);
		$('#edit_isActive').val(isActive);
		$('#edit_recVer').val(recVer);
		$('#upperLimit-update').modal('show');

	}
	//实际修改
	$('#upperLimit-updateBtn').click(function(){
		  //表单校验
        if (!$('#upperLimit-update #updateForm').valid()){
            return false;
        }
        var form = $(this).parents(".modal-dialog").find("#updateForm");
        var content = $(this).parents(".plms-content");
        P.updatePost("<%=request.getContextPath()%>/rest/allocInstall/updateUpperLimit?"+new Date().toTimeString(),form,content,upperLimit_table);
	});
	
    $(document).ready(function() {
    	upperLimit_init();
    	//新增表单校验
        allocUpperLimit_validate($("#upperLimit-add #addForm"));
    });

    //表单校验
    function allocUpperLimit_validate($validateForm){
        $validateForm.validate({
            rules: {
                org: {
                    required: true,minlength:1
                },
                role: {
                    required: true
                },
               /*  userName: {
                    required: true,minlength:2
                }, */
                upperLimit:{
                    required: true,minlength:1
                }
            },
            messages: {
                org: {
                    required: "请选择所属机构 "
                },
                role: {
                    required: "请选择角色"
                },
                /* userName: {
                    required: "请选择员工姓名"
                }, */
                upperLimit:{
                    required: "请输入月上限值"
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
