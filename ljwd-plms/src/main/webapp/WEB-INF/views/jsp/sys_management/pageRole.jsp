<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<head>
    <title>角色信息</title>
    <style>
	     .dataTables_scrollBody tbody tr td{
		    padding: 4px 10px !important;
		}
	</style>
</head>

<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">角色管理</h3>
    </div>
    <div class="panel-body">
        <form id="searchForm">
            <label for="roleName" class="right-space-1">角色名称</label>
            <input type="text" id="roleName" name="roleName" class="right-space collection"/>
            <label for="roleSign" class="right-space-1">角色编号</label>
            <input type="text" id="roleSign" name="roleSign" class="right-space-1 collection" />
            <input class="btn btn-primary right-space-2" type="button" id="searchBtn" value="查询"/>
            <shiro:hasPermission name="role:insert">
                <a class="btn btn-primary right-space-2" target='_blank' href="<%=request.getContextPath()%>/rest/role/toAddRole">新增</a>
            </shiro:hasPermission>
            <input class="btn btn-default" type="reset" value="清除"/>
        </form>
    </div>
</div>
</div>

<table id="dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th class="text-center">序号</th>
        <th class="text-center">角色编号</th>
        <th class="text-center">角色名称</th>
        <th class="text-center">状态</th>
        <th class="text-center">说明</th>
        <th class="text-center">维护人</th>
        <th class="text-center">维护时间</th>
        <th class="text-center">操作</th>
    </tr>
    </thead>
    <tbody>
    	<tr class="dataTable_show">
	        <td colspan="8">没有检索到数据</td>
		</tr>
    </tbody>
</table>

<script type="text/javascript" language="javascript">

    <%-- var table = P.dataTable($('#dataTable'),
            $("#searchForm"),
            "<%=request.getContextPath()%>/rest/role/pageRoleData",
            [
                {"mData"  : function(row, type, set, meta) { return row.rowNo; }},
                {"mData" : "roleSign","sDefaultContent" : ""},
                {"mData" : "roleName","sDefaultContent" : ""},
                {"mData" : "isActiveText","sDefaultContent" : ""},
                {"mData" : "description","sDefaultContent" : ""},
                {"mData" : "updatedUserName","sDefaultContent" : ""},
                {"mData" : "updateTime","sDefaultContent" : ""},
                {"mData" : null,"sDefaultContent" : "",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        <shiro:hasPermission name="role:update">
                            $(nTd).html("<a target='_blank' href=<%=request.getContextPath()%>/rest/role/toUpdateRole?roleId=" + oData.id + ">维护</a>&nbsp;&nbsp;");
                        </shiro:hasPermission>
                        <shiro:hasPermission name="role:delete">
                            $(nTd).append("<a href='javascript:void(0);' onclick='return deleteRole(" + oData.id + "," + oData.recVer + ");'>删除</a>");
                        </shiro:hasPermission>
                    }
                }
            ]
    ); --%>
    function role_init(){
    	$('#dataTable').DataTable({
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
             "sAjaxSource" : "<%=request.getContextPath()%>/rest/role/pageRoleData",
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
				{"mData"  : function(row, type, set, meta) { return row.rowNo; }},
                {"mData" : "roleSign","sDefaultContent" : ""},
                {"mData" : "roleName","sDefaultContent" : ""},
                {"mData" : "isActiveText","sDefaultContent" : ""},
                {"mData" : "description","sDefaultContent" : ""},
                {"mData" : "updatedUserName","sDefaultContent" : ""},
                {"mData" : "updateTime","sDefaultContent" : ""},
                {"mData" : null,"sDefaultContent" : "",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        <shiro:hasPermission name="role:update">
                            $(nTd).html("<a target='_blank' href=<%=request.getContextPath()%>/rest/role/toUpdateRole?roleId=" + oData.id + ">维护</a>&nbsp;&nbsp;");
                        </shiro:hasPermission>
                        <shiro:hasPermission name="role:delete">
                            $(nTd).append("<a href='javascript:void(0);' onclick='return deleteRole(" + oData.id + "," + oData.recVer + ");'>删除</a>");
                        </shiro:hasPermission>
                    }
                }
             ],
             "aoColumnDefs":[
                             {"bSortable":false,"aTargets": [0,7]}                          
             ]
         });
       }

    $('#searchBtn').on( 'click', function () {
        //table.search($("#searchForm").serialize()).draw();
        role_init();
    });

    //删除角色
    function deleteRole(id,recVer){
        MSG.confirm('确定删除角色？',function(){
            var data = "roleId=" + id + "&recVer=" + recVer;
            $.ajax({
                type : 'POST',
                dataType : "json",
                url : "<%=request.getContextPath()%>/rest/role/deleteRole",
                data : data,
                success : function(ret){
                    MSG.show(ret.message);
                    if(ret.success){
                        //table.search($("#searchForm").serialize()).draw();
                        role_init();
                    }
                },
                error:function(errorData){
                    MSG.show("系统异常,稍后重试");
                }
            });
        });
    }

</script>


