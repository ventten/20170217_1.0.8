<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<head>
    <title>用户信息</title>
    <style>
	     .dataTables_scrollBody tbody tr td{
		    padding: 4px 10px !important;
		}
	</style>
</head>

<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">用户信息</h3>
    </div>
    <div class="panel-body">
        <form id="user-searchForm">
            <label for="userName" class="right-space-2">姓名</label>
            <input type="text" class="collection input-border right-space-2" name="userName" id="userName" />

            <label class="right-space-2">角色</label>
            <select class="collection right-space-2" name="roleId">
                <option value="">全部</option>
                <c:forEach items="${roleList}" var="item">
                    <option value="${item.id}">${item.roleName}</option>
                </c:forEach>
            </select>

            <input type="button" class="btn btn-primary right-space-2" value="查询" id="user-searchBtn"/>
            <input type="reset" class="btn btn-default" value="清除"/>
        </form>
    </div>
</div>
</div>
 
<table id="dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th class="text-center">序号</th>
        <th class="text-center">账号</th>
        <th class="text-center">姓名</th>
        <th class="text-center">状态</th>
        <th class="text-center">维护人</th>
        <th class="text-center">维护时间</th>
        <th class="text-center">拥有角色</th>
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

    //查询按钮点击
    $('#user-searchBtn').on( 'click', function () {
        var $form = $('#user-searchForm');
        var $this = $(this);
        if($this.hasClass("hasInit")){
            user_table.search($form.serialize()).draw();
        }else{
            $this.addClass("hasInit");
            user_init();
        }
    });

    //var user_table;

    //Table初始化方法
   <%--  function user_init(){
        user_table = P.dataTable($('#dataTable'),
                $("#user-searchForm"),
                "<%=request.getContextPath()%>/rest/user/pageUserData",
                [
                    {"mData"  : "rowNo","sDefaultContent" : ""},
                    {"mData"  : "userId","sDefaultContent" : ""},
                    {"mData" : "userName","sDefaultContent" : ""},
                    {"mData" : "isActiveText","sDefaultContent" : ""},
                    {"mData" : "updatedBy","sDefaultContent" : ""},
                    {"mData" : "updateTime","sDefaultContent" : ""},
                    {"mData" : "roleNames","sDefaultContent" : ""},
                    {"mData" : null,"sDefaultContent" : "",
                        "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                            <shiro:hasPermission name="user:allot">
                            $(nTd).html("<a target='_blank' href=<%=request.getContextPath()%>/rest/user/toAllotRole?userId=" + encodeURI(oData.userId) + ">角色分配</a>");
                            </shiro:hasPermission>
                        }
                    }
                ]
        );
    } --%>
    
    function user_init(){
    	user_table=$('#dataTable').DataTable({
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
             "sAjaxSource" : "<%=request.getContextPath()%>/rest/user/pageUserData",
             "fnServerData" : function(sSource, aoData, fnCallback) {
                 //参数拼接
                 var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#user-searchForm").serialize();
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
				{"mData"  : "rowNo","sDefaultContent" : ""},
				{"mData"  : "userId","sDefaultContent" : ""},
				{"mData" : "userName","sDefaultContent" : ""},
				{"mData" : "isActiveText","sDefaultContent" : ""},
				{"mData" : "updatedBy","sDefaultContent" : ""},
				{"mData" : "updateTime","sDefaultContent" : ""},
				{"mData" : "roleNames","sDefaultContent" : ""},
				{"mData" : null,"sDefaultContent" : "",
				    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
				        <shiro:hasPermission name="user:allot">
				        $(nTd).html("<a target='_blank' href=<%=request.getContextPath()%>/rest/user/toAllotRole?userId=" + encodeURI(oData.userId) + ">角色分配</a>");
				        </shiro:hasPermission>
				    }
				}
             ],
             "aoColumnDefs":[
                             {"bSortable":false,"aTargets": [0,6,7]}                          
             ]
         });
       }

</script>


