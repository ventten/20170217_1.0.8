<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<head>
    <title>贷款信息</title>
</head>

<div class="plms-content">

    <table id="appl-dataTable" class="display dataTable" cellspacing="0" width="100%">
        <thead>
        <tr>
            <th class="text-center">序号</th>
            <th class="text-center">来源</th>
            <th class="text-center">贷款公司</th>
            <th class="text-center">申请编号</th>
            <th class="text-center">合同编号</th>
            <th class="text-center">客户经理</th>
            <th class="text-center">贷款期数</th>
            <th class="text-center">贷款金额</th>
            <th class="text-center">放款金额</th>
            <th class="text-center">贷款状态</th>
            <th class="text-center">申请日期</th>
            <th class="text-center">放款日期</th>
            <th class="text-center">结清日期</th>
            <th class="text-center">操作</th>
        </tr>
        </thead>
    </table>
</div>

<script type="text/javascript" language="javascript">

    //选项卡点击
    $("#pageCollectionApplLi").on('click', function () {
        var $this = $(this);
        if(!$this.hasClass("hasInit")){
            $this.addClass("hasInit");
            appl_init();
        }
    });
  	
    //分页Table
    var appl_table;

    //Table初始化方法
    function appl_init(){
        appl_table = $('#appl-dataTable').DataTable( {
        	"scrollY": false,
			"scrollX": '100%',
            "sPaginationType": "full_numbers",      //设置分页控件的模式
            "bLengthChange": false,                 //改变每页显示数据数量
            "bPaginate": true,                      //翻页功能
            "bFilter": false,                       //过滤功能
            "bInfo": true,            			    //页脚信息
            "bSort": false  ,					    //无排序功能
            "bScrollCollapse" : true,
            "bAutoWidth": true,
            "iDisplayLength": 10,
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
            "bProcessing": false,           //加载数据时显示正在加载信息
            "bServerSide": true,            //指定从服务器端获取数据
            "sAjaxSource" : "<%=request.getContextPath()%>/rest/caseCollection/pageCollectionApplData",
            "fnServerData" : function(sSource, aoData, fnCallback) {
                //参数拼接
                var data = "paramData=" + JSON.stringify(aoData) + "&clCustIdByApplId="+$("#applId").val();
                $.ajax({
                    "type" : 'POST',
                    "url" : sSource,
                    "dataType" : "json",
                    "data" : data,
                    "success" : function(resp) {
                        fnCallback(resp);
                    },
                    "error":function(errorData){
                        MSG.show('获取数据发生异常');
                    }
                });
            },
            //dataTable显示
            "aoColumns"  : [
                {"mData" :  function(row, type, set, meta) {
                    return (meta.row + 1);
                }},
                {"mData" : "srcVal","sDefaultContent" : ""},
                {"mData" : "loanCompany","sDefaultContent" : ""},   //此列默认值为""，以防数据中没有此值，DataTables加载数据的时候报错
                {"mData" : "applCode","sDefaultContent" : ""},
                {"mData" : "cntrctNo","sDefaultContent" : ""},
                {"mData" : "salesUser","sDefaultContent" : ""},
                {"mData" : "loanPeriod","sDefaultContent" : ""},
                {"mData" : "loanAmt","sDefaultContent" : ""},
                {"mData" : "payAmt","sDefaultContent" : ""},
                {"mData" : "loanStateText","sDefaultContent" : ""},
                {"mData" : function(row){
                    var str = row.applDate.split(" ");
                    return str[0];
                }},
                {"mData" : "payDateFmt","sDefaultContent" : ""},
                {"mData" : "clearDateFmt","sDefaultContent" : ""},
                {"mData" : null,"sDefaultContent" : "",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                    	<shiro:hasPermission name='collect_rec:reciv_dtl'>
                    	$(nTd).html("<a target='_blank' class='accountReceivable' href=<%=request.getContextPath()%>/rest/caseCollection/recivDtlIndex?cntrctNo="+oData.cntrctNo+">应收明细</a>&nbsp;&nbsp;");
                    	</shiro:hasPermission>
                    }
                }
            ]
        });
    }
    
  	//点击应收明细链接存储localStorage值
	$('#appl-dataTable').on('click','.accountReceivable',function(){
		 //点击应收明细从localStrage中取值，判断上一个页面
		 var getVal=localStorage.getItem("getVal");
   		 window.localStorage.setItem("accountVal",getVal);   		
	})

</script>

