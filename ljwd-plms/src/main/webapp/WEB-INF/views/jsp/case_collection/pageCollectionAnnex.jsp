<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<head>
    <title>附件信息</title>
</head>

<div class="plms-content">
    <table id="annex-dataTable" class="display dataTable" cellspacing="0" width="100%">
        <thead>
        <tr>
            <th class="text-center">序号</th>
            <th class="text-center">来源</th>
            <th class="text-center">主题</th>
            <th class="text-center">文件名</th>
            <th class="text-center">附件类型</th>
            <th class="text-center">操作</th>
        </tr>
        </thead>
    </table>
</div>

<script type="text/javascript" language="javascript">

    //选项卡点击
    $("#pageCollectionAnnexLi").on('click', function () {
        var $this = $(this);
        if(!$this.hasClass("hasInit")){
            $this.addClass("hasInit");
            annex_init();
        }
    });

    //分页Table
    var annex_table;

    //Table初始化方法
    function annex_init(){
        annex_table = $('#annex-dataTable').DataTable( {
            "sPaginationType": "full_numbers",      //设置分页控件的模式
            "bLengthChange": false,                 //改变每页显示数据数量
            "bPaginate": true,                      //翻页功能
            "bFilter": false,                       //过滤功能
            "bInfo": true,            			    //页脚信息
            "bSort": false  ,					    //无排序功能
            "bScrollCollapse" : true,
            "bAutoWidth": false,
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
            "sAjaxSource" : "<%=request.getContextPath()%>/rest/caseCollection/pageCollectionAnnexData",
            "fnServerData" : function(sSource, aoData, fnCallback) {
                //参数拼接
                var data = "paramData=" + JSON.stringify(aoData) + "&applIdOrNull="+$("#applId").val();
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
                {"mData" : "topic","sDefaultContent" : ""},
                {"mData" : "fileName","sDefaultContent" : ""},
                {"mData" : "annexTypeVal","sDefaultContent" : ""},
                {"mData" : null,"sDefaultContent" : "",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        <shiro:hasPermission name='annex:download'>
                            $(nTd).html("<a href='javascript:void(0);' onclick='downloadFun(\"" + oData.id + "\")'>下载</a>&nbsp;&nbsp;");
                        </shiro:hasPermission>
                    }
                }
            ]
        });
    }

    //下载
    function downloadFun(id) {
        //定义一个form表单
        var $form=$("<form>");
        $form.attr("style","display:none");
        $form.attr("target","_black");
        $form.attr("method","post");
        $form.attr("action","<%=request.getContextPath()%>/rest/cust/download");

        var $id=$("<input>");
        $id.attr("type","hidden");
        $id.attr("name","id");
        $id.attr("value",id);
        $form.append($id);

        //将表单放置在web中
        $("body").append($form);

        $form.submit();
    }

</script>
