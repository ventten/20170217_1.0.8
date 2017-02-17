<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>    
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>机构_区间关系配置</title>
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
         	机构_区间关系配置
      </h3>
   </div>
   <div class="panel-body">
     <form id="searchForm">
    	<label for="orgNo" class="right-space-1">机构</label>
        <select id="org" name="orgId" class="right-space collection">
        	<option value="">全部</option>
            <c:forEach items="${orgList}" var="item">
                <option value="${item.id}">${item.orgName}</option>
            </c:forEach>   
        </select>
        <label for="scope" class="right-space-1">区间</label>
        <select id="status" name="collectionRuleId" class="collection">
        	<option value="">全部</option>
            <c:forEach items="${collectionList}" var="item">
                <option value="${item.id}">${item.name}</option>
            </c:forEach>   
        </select>
     
    	 <shiro:hasPermission name="orgScope:select">
         <button type="button" class="btn btn-primary left-space right-space-2" id="searchBtn">查询</button>
         </shiro:hasPermission>
         <shiro:hasPermission name="orgScope:insert">
         <button type="button" class="btn btn-primary right-space-2" id="addBtn">新增</button>
         </shiro:hasPermission>
         <button type="reset" class="btn btn-default" >清除</button>  
         
	</form>
   </div>
</div>

<!--添加窗口-->
    <div class="modal fade hideModal" id="orgScope-add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                    <h4 class="modal-title">机构_区间--新增</h4>
                </div>
                <div class="modal-body">

                    <form class="form-horizontal" id="addForm">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">机构</label>
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
                            <label class="col-sm-3 control-label">区间</label>
                             <span class="col-sm-6">
                                <c:forEach items="${collectionList}" var="item" varStatus="status">
                                	<%-- <c:if test="${(status.index)%2==0 }">
                                		<br/>
                                	</c:if> --%>
                                	<label class="right-space"><input type="checkbox" name="scopeList" value="${item.id}">${item.name}</label>
					            </c:forEach> 
                            </span>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="button" class="btn blue" id="orgScope-addBtn">
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
    <div class="modal fade hideModal" id="orgScope-update" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                    <h4 class="modal-title">机构_区间--修改</h4>
                </div>
                <div class="modal-body">

                    <form class="form-horizontal" id="updateForm">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">机构</label>
                            <div class="col-sm-6">
                                <select class="form-control" name="orgId" id="edit_orgId" disabled>
                                    <c:forEach items="${orgList}" var="item">
                                        <option value="${item.id}">${item.orgName}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-3 control-label">区间</label>
                              <span class="col-sm-6">
                                <c:forEach items="${collectionList}" var="item" varStatus="status">
                                	<%-- <c:if test="${(status.index)%2==0 }">
                                		<br/>
                                	</c:if> --%>
                                	<label class="right-space"><input type="checkbox" class="scopeList" name="scopeList" value="${item.id}">${item.name}</label>
					            </c:forEach> 
                            </span>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">状态</label>
                              <div class="col-sm-6">
                                 <select class="form-control" name="isActive" id="edit_isActive" >
                                	<option value="Y">有效</option>
                                	<option value="N">无效</option>
                                 </select>
                              </div>
                        </div>
                    </form>

                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="button" class="btn blue" id="orgScope-updateBtn">
                        修改
                    </button>
                    <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">
                        返回
                    </button>
                </div>
            </div>
        </div>
    </div>
 
<div>
<table id="orgScope_dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th>序号</th>
        <th>机构</th>
        <th>区间权限</th>
        <th>状态</th>
        <th>维护人</th>
        <th>维护时间</th>
        <th>操作</th>
    </tr>
    </thead>
</table>
</div>
</div>
<script type="text/javascript" language="javascript">

	var orgScope_dataTable;
	
	 //Table初始化方法
	<%-- function orgScope_init(){
		orgScope_dataTable = P.dataTable($('#orgScope_dataTable'),
	            $("#searchForm"),
	            "<%=request.getContextPath()%>/rest/orgScopeRelation/pageOrgScopeData?date="+new Date().toTimeString(),
	            [
              		{"mData" : "rowNo","sDefaultContent" : "" },  
	             	{"mData" : "orgName","sDefaultContent" : ""},
	                {"mData" : "collectionRuleNames","sDefaultContent" : ""},
	                {"mData" : "isActiveText","sDefaultContent" : ""},
	                {"mData" : "updatedBy","sDefaultContent" : ""},
	                {"mData" : "updateTime","sDefaultContent" : ""},
	                {"mData" : "orgId",
	                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
	                        $(nTd).html("<shiro:hasPermission name='orgScope:update'><a href='javascript:void(0);' " +               
	                "onclick='update_orgScope(\"" + oData.orgId + "\",\"" + oData.collectionruleIds +  "\",\"" + oData.isActive +  "\")'>修改</a></shiro:hasPermission>&nbsp;&nbsp;"+
	                "<shiro:hasPermission name='orgScope:delete'><a href='javascript:void(0);' " +           
	                "onclick='delete_orgScope(\"" + oData.orgId + "\")'>删除</a></shiro:hasPermission>");
	                    }
	                }
	            ]
	    );
	} --%>
	
	 function orgScope_init(){
		 orgScope_dataTable =$('#orgScope_dataTable').DataTable({
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
	      "sAjaxSource" : "<%=request.getContextPath()%>/rest/orgScopeRelation/pageOrgScopeData?date="+new Date().toTimeString(),
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
                {"mData" : "collectionRuleNames","sDefaultContent" : ""},
                {"mData" : "isActiveText","sDefaultContent" : ""},
                {"mData" : "updatedUserName","sDefaultContent" : ""},
                {"mData" : "updateTime","sDefaultContent" : ""},
                {"mData" : "orgId",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        $(nTd).html("<shiro:hasPermission name='orgScope:update'><a href='javascript:void(0);' " +               
                "onclick='update_orgScope(\"" + oData.orgId + "\",\"" + oData.collectionruleIds +  "\",\"" + oData.isActive +  "\")'>修改</a></shiro:hasPermission>&nbsp;&nbsp;"+
                "<shiro:hasPermission name='orgScope:delete'><a href='javascript:void(0);' " +           
                "onclick='delete_orgScope(\"" + oData.orgId + "\")'>删除</a></shiro:hasPermission>");
                    }
                }
	      ],
	      "aoColumnDefs":[
                          {"bSortable":false,"aTargets": [0,6]}                          
          ]
	  });
	 
	}

	//查询按钮 
	$('#searchBtn').click(function(){
		orgScope_dataTable.search($(this).parents("#searchForm").serialize()).draw();  //刷新页面	 
	});

	//新增按钮 
	$('#addBtn').click(function(){
		$('#orgScope-add').modal('show');
	});
	
	//新增操作
	$('#orgScope-addBtn').click(function(){
		var orgId = $('#orgId').val();
		if(orgId.length>0){
			checkIsExit(orgId);
		}else{
			MSG.alert("请选择机构!");
			return false;
		}
		
	});
	//显示修改窗口 
	function update_orgScope(orgId,collectionRuleIds,isActive){
		$("#updateForm").find(':input').removeAttr('checked');	
		$('#edit_orgId').val(orgId);
		$('#edit_isActive').val(isActive);
		var ids = collectionRuleIds.split(",");
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
		$('#orgScope-update').modal('show');
	}
	
	//修改操作 
	$('#orgScope-updateBtn').click(function(){
		//表单校验
        if (!$('#orgScope-update #updateForm').valid()){
            return false;
        }
		var orgId = $('#edit_orgId').val();
        var form = $(this).parents(".modal-dialog").find("#updateForm");
        var content = $(this).parents(".plms-content");
        P.updatePost("<%=request.getContextPath()%>/rest/orgScopeRelation/updateOrgScopeRelation?orgId="+orgId+"&date="+new Date().toTimeString(),form,content,orgScope_dataTable);
	});
	
	//验证此机构是否已存在对应关系 
	function checkIsExit(orgId){
		$.ajax({
			url:"<%=request.getContextPath()%>/rest/orgScopeRelation/isExitOrgScopeRelation?date="+new Date().toTimeString(),
			data:{"orgId":orgId},
			type:"post",
			dataType: "text",
			success:function(data){
				if(data=="N"){
					//表单校验
			        if (!$('#orgScope-add #addForm').valid()){
			            return false;
			        }
			        var form = $('#addForm');
			        var content = $(".plms-content");
			        P.addPost("<%=request.getContextPath()%>/rest/orgScopeRelation/addOrgScope?"+new Date().toTimeString(),form,content,orgScope_dataTable);
				}else if(data=="Y"){
					MSG.alert("此机构已存在对应的区间 !");
					return false;
				}
			}
		});
	}
	
	//删除操作
	function delete_orgScope(orgId){
		MSG.confirm("确定删除?",function(){
			$.ajax({
				type: "post",
				url: "<%=request.getContextPath()%>/rest/orgScopeRelation/deleteOrgScope?"+new Date().toTimeString(),
				data:{"orgId":orgId},
				dataType: "json",
				success: function(msg){
					MSG.show(msg.message);
					orgScope_dataTable.search($(this).parents("#searchForm").serialize()).draw(); 
				}
			});
		});
		
	}

	 $(document).ready(function() {
		 	orgScope_init();	    	//新增表单校验
		 	addOrgScope_validate($("#orgScope-add #addForm"));
	    });

	    //表单校验
	    function addOrgScope_validate($validateForm){
	        $validateForm.validate({
	            rules: {
	                orgId: {
	                    required: true
	                },
	                scopeList: {
	                    required: true
	                }
	            },
	            messages: {
	                org: {
	                    required: "请选择所属机构 "
	                },
	                scopeList: {
	                    required: "请选择对应区间"
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
