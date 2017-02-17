<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>        
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户数据权限管理</title>
<style>
	.dataTables_scrollBody tbody tr td{
	    padding: 4px 10px !important;
	}
</style>
</head>
<div class="panel panel-default">
	<div class="panel-heading">
      <h3 class="panel-title">
         	用户数据权限管理
      </h3>
   	</div>
   	<div class="panel-body">
		<div>
		    <form id="searchForm">
		        <label for="userOrgId" class="right-space-1">所属机构</label>
		          <select id="userOrgId" name="userOrgId" class="right-space collection">
		        	<option value="">全部</option>
		            <c:forEach items="${orgList}" var="item">
		                <option value="${item.id}">${item.orgName}</option>
		            </c:forEach>   
		          </select>
		        <label for="userName" class="right-space-1">员工姓名</label>
		        <input type="text" id="userName" name="userName" class="right-space collection"/>
		        &nbsp;
		        <shiro:hasPermission name="userDataRange:select">
		            <input class="btn btn-primary right-space-2" type="button" id="searchBtn" value="查询"/>
		        </shiro:hasPermission>
		        <shiro:hasPermission name="userDataRange:insert">
		            <a class="btn btn-primary right-space-2" target='_blank' href="<%=request.getContextPath()%>/rest/userDataRange/toAddUserDataRange">新增</a>
		        </shiro:hasPermission>
		        <button type="reset" class="btn btn-default" >清除</button>  
		        
		    </form>
		</div>
	</div>
</div>

<table id=userData-dataTable class="display dataTable" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th class="text-center">序号</th>
        <th class="text-center">所属机构</th>
        <th class="text-center">员工姓名</th>
        <th class="text-center">权限机构/数据权限</th>
        <th class="text-center">维护人</th>
        <th class="text-center">维护时间</th>
        <th class="text-center">操作</th>
    </tr>
    </thead>
</table>

<script type="text/javascript" language="javascript">

    <%-- var table = P.dataTable($('#dataTable'),
            $("#searchForm"),
            "<%=request.getContextPath()%>/rest/userDataRange/pageUserDataRangeData",
            [
          		{"mData" : "rowNo","sDefaultContent" : "" },  
                {"mData" : "userOrgName","sDefaultContent" : ""},
                {"mData" : "userName","sDefaultContent" : ""},
                {"mData" : "orgNames","sDefaultContent" : ""},
                {"mData" : "generatedBy","sDefaultContent" : ""},
                {"mData" : "updateTime","sDefaultContent" : ""},
                {"mData" : "userId",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        $(nTd).html("<shiro:hasPermission name='userDataRange:update'><a target='_blank' href=<%=request.getContextPath()%>/rest/userDataRange/toUpdateUserDataRange?userId=" + oData.userId + ">修改&nbsp;&nbsp;</a></shiro:hasPermission>"+
                        "<shiro:hasPermission name='userDataRange:delete'><a href='javascript:void(0);' " +           
    	                "onclick='delete_userDataRange(\"" + oData.userId + "\")'>删除</a></shiro:hasPermission>");
                    }
                }
            ]
    ); --%>
    var userData_dataTable;
    
    function table_userdata(){
    	userData_dataTable = $('#userData-dataTable').DataTable({
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
          "sAjaxSource" : "<%=request.getContextPath()%>/rest/userDataRange/pageUserDataRangeData",
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
                {"mData" : "userOrgName","sDefaultContent" : ""},
                {"mData" : "userName","sDefaultContent" : ""},
                {"mData" : "orgNames","sDefaultContent" : ""},
                {"mData" : "updatedUserName","sDefaultContent" : ""},
                {"mData" : "updateTime","sDefaultContent" : ""},
                {"mData" : "userId",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        $(nTd).html("<shiro:hasPermission name='userDataRange:update'><a target='_blank' href=<%=request.getContextPath()%>/rest/userDataRange/toUpdateUserDataRange?userId=" + oData.userId + ">修改&nbsp;&nbsp;</a></shiro:hasPermission>"+
                        "<shiro:hasPermission name='userDataRange:delete'><a href='javascript:void(0);' " +           
    	                "onclick='delete_userDataRange(\"" + oData.userId + "\")'>删除</a></shiro:hasPermission>");
                    }
                }
          ],
          "aoColumnDefs":[
                          {"bSortable":false,"aTargets": [0,6]}                          
          ]
      });
     
    }

    $('#searchBtn').on( 'click', function () {
    	userData_dataTable.search($("#searchForm").serialize()).draw();
    });

	//删除操作 
    function delete_userDataRange(userId){
    	MSG.confirm("确定删除?",function(){
			$.ajax({
				type: "post",
				url: "<%=request.getContextPath()%>/rest/userDataRange/deleteUserDataRange?"+new Date().toTimeString(),
				data:{"userId":userId},
				dataType: "json",
				success: function(msg){
					MSG.show(msg.message);
			        //table.search($("#searchForm").serialize()).draw();
			    	userData_dataTable.search($("#searchForm").serialize()).draw();
				}
			});
		});
    }
    $(document).ready(function() {
    	table_userdata();
    });
	
</script>


