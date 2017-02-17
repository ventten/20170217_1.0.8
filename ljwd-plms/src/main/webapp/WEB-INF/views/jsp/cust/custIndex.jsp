<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<head>
<title>客户信息</title>
</head>
<div class="panel panel-default">
	<div class="panel-heading">
		<h3 class="panel-title">客户信息</h3>
	</div>
	<div class="panel-body">
		<form id="searchFormIndex" class="searchForm">

			<label for="custName" class="right-space-1">主&nbsp;贷&nbsp;人</label>
			<input type="text" class="collection right-space-1" id="custName" name="custName" />

			<label for="docno" class="right-space-1">身份证号</label>
			<input type="text" class="collection right-space-1" id="docno" name="docno" data-placement="bottom"/>

			<label for="mobile" class="right-space-1">手机号码</label>
			<input type="text" class="collection right-space" id="mobile" name="mobile" data-placement="bottom"/>

			<label for="transitCount" class="right-space-1 line-bottom">合同在途数</label>
			<select class="collection right-space-1" id="transitCount" name="transitCount">
				<option value="">全部</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5及以上</option>
			</select>

			<br/>
			<input class="btn btn-primary right-space-1 left-space-2" type="button" id="searchBtn" value="查询" />
			<input class="btn btn-default right-space-1" type="reset" value="清除" />
		</form>
	</div>
</div>
<table id="dataTable" class="display dataTable" cellspacing="0" width="100%">
	<thead>
		<tr>
			<th class="text-center">序号</th>
			<th class="text-center">主贷人</th>
			<th class="text-center">身份证号</th>
			<th class="text-center">有效合同数</th>
			<th class="text-center">合同在途数</th>
			<th class="text-center">申请次数</th>
			<th class="text-center">审批拒绝数</th>
			<th class="text-center">累计逾期期数</th>
			<th class="text-center">累计逾期天数</th>
			<th class="text-center">操作</th>
		</tr>
	</thead>
	<tbody>
		<tr class="dataTable_show">
			<td colspan="10">没有检索到数据</td>
	    </tr>
	</tbody>
</table>
<script type="text/javascript" language="javascript">

    //查询按钮点击
    $('#searchBtn').on( 'click', function () {
    	if(!$("#searchFormIndex").valid()){
    		return false;
    	}
        var $this = $(this);
        if($this.hasClass("hasInit")){
        	//table.search($("#searchFormIndex").serialize()).draw();
        	table_init.search($("#searchFormIndex").serialize()).draw();
        }else{
            $this.addClass("hasInit");
            //init();
            table_init();
        }
    });

    //分页Table
    //var table;

    //Table初始化方法
    <%-- function init(){
        table = P.dataTable($('#dataTable'),
                $("#searchFormIndex"),
                "<%=request.getContextPath()%>/rest/cust/pageCustData",
                [
                    {"mData" : function(row, type, set, meta) { return meta.row + 1; }},//序号
                    {"mData" : "custName","sDefaultContent" : ""},
                    {"mData" : "docno","sDefaultContent" : ""},
                    {"mData" : "validCount","sDefaultContent" : ""},
                    {"mData" : "transitCount","sDefaultContent" : ""},
                    {"mData" : "applCount","sDefaultContent" : ""},
                    {"mData" : "rejectCount","sDefaultContent" : ""},
                    {"mData" : "overCount","sDefaultContent" : ""},
                    {"mData" : "overDays","sDefaultContent" : ""},
                    {"mData" : null,"sDefaultContent" : "",
                        "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        	<shiro:hasPermission name="cust:detail">
                            	$(nTd).html("<a target='_blank' href=<%=request.getContextPath()%>/rest/cust/custDetail?clCustId=" + oData.id + "&custName=" + encodeURI(oData.custName) + "&docno=" + oData.docno + '>详情</a>&nbsp;&nbsp;');
                        	</shiro:hasPermission> 
                        }
                    }
                ],
                100
        );
    } --%>
    
    //Table初始化方法
    var table_init;
    function table_init(){
    	table_init=$('#dataTable').DataTable({
            "scrollY": '349px',
            "scrollX": '100%',
            "sScrollXInner": "100%",
            "bScrollCollapse": true,

            "sPaginationType": "full_numbers",      //设置分页控件的模式
            "bLengthChange": false,                 //改变每页显示数据数量
            "bPaginate": true,                      //是否翻页功能
            "bFilter": false,                       //是否过滤功能
            "bInfo": true,            			    //是否页脚信息
            "bSort": true,					        //是否排序功能

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
            "bProcessing": false,        //加载数据时显示正在加载信息
            "bServerSide": true,        //指定从服务器端获取数据
            "sAjaxSource" : "<%=request.getContextPath()%>/rest/cust/pageCustData",
            "fnServerData" : function(sSource, aoData, fnCallback) {
                var data;
                //参数拼接
                data = "paramData=" + JSON.stringify(aoData) + "&" + $("#searchFormIndex").serialize();
                
                $.ajax({
                    "type" : 'POST',
                    "dataType" : "json",
                    "url" : sSource,
                    "data" : data,
                    "success" : function(resp) {
                        $('#checkAllBtn').attr("checked", false);
                        fnCallback(resp);
                    },
                    "error":function(jqXHR,textStatus,errorThrown){
                        MSG.show("获取数据发生异常");
                    }
                });
            },
            //dataTable显示
            "aoColumns" : [
				{"mData" : function(row, type, set, meta) { return row.rowNo; }},//序号
                    {"mData" : "custName","sDefaultContent" : ""},
                    {"mData" : "docno","sDefaultContent" : ""},
                    {"mData" : "validCount","sDefaultContent" : ""},
                    {"mData" : "transitCount","sDefaultContent" : ""},
                    {"mData" : "applCount","sDefaultContent" : ""},
                    {"mData" : "rejectCount","sDefaultContent" : ""},
                    {"mData" : "overCount","sDefaultContent" : ""},
                    {"mData" : "overDays","sDefaultContent" : ""},
                    {"mData" : null,"sDefaultContent" : "",
                        "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        	<shiro:hasPermission name="cust:detail">
                            	$(nTd).html("<a target='_blank' href=<%=request.getContextPath()%>/rest/cust/custDetail?clCustId=" + oData.id + "&custName=" + encodeURI(oData.custName) + "&docno=" + oData.docno + '>详情</a>&nbsp;&nbsp;');
                        	</shiro:hasPermission> 
                        }
               }
            ],
			"aoColumnDefs":[
				{"bSortable":false,"aTargets":[0,9]}
			]
        });
    }

    $(document).ready(function() {
    	valitatorForm($("#searchFormIndex"));
    });

    //查询条件表单验证
    function  valitatorForm($validateForm){
		P.validateForm($validateForm,{
			docno:{
				idCard:true
			},
			mobile:{
				mobileCN:true
			}
		});
    }

</script>
