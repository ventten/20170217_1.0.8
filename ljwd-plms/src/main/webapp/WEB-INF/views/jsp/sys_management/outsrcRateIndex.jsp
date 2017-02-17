<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<head>
    <title>委外费率</title>
    <style>
		.dataTables_scrollBody tbody tr td{
		    padding: 4px 10px !important;
		}
	</style>
</head>
<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">委外费率管理</h3>
    </div>
    <div class="panel-body">
        <form id="outsrcRate-searchForm">
            <label for="isActive" class="right-space-1">状态</label>
            <select name="isActive" id="isActive" class="collection">
                <option value="">全部</option>
                <option value="Y">有效</option>
                <option value="N">无效</option>
            </select>
            <shiro:hasPermission name="out_rate:select">
                <input class="btn btn-primary left-space-2 right-space-2" type="button" id="outsrcRate-searchBtn" value="查询"/>
            </shiro:hasPermission>
            <shiro:hasPermission name="out_rate:insert">
                <input class="btn btn-primary" type="button" value="新增" id="outstr_addBtn"/>
            </shiro:hasPermission>
        </form>
    </div>
</div>
</div>
<table id="outsrcRate-dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th class="text-center">序号</th>
        <th class="text-center">账龄阶段</th>
        <th class="text-center">逾期天数（起）</th>
        <th class="text-center">逾期天数（止）</th>
        <th class="text-center">服务费率(%)</th>
        <%--<th class="text-center">委外费率(%)</th>--%>
        <th class="text-center">状态</th>
        <th class="text-center">维护人</th>
        <th class="text-center">维护时间</th>
        <th class="text-center">操作</th>
    </tr>
    </thead>
    <tbody>
    	<tr class="dataTable_show">
	        <td colspan="9">没有检索到数据</td>
		</tr>
    </tbody>
</table>

<!--新增窗口-开始-->
<div class="modal fade hideModal" id="outsrcRateAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:500px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">委外费率-新增</h4>
            </div>
            <div class="modal-body">

                <form class="form-horizontal" id="outsrcRateAddForm">
			                    <div class="form-group">
			                        <label class="col-sm-4 control-label"><span class="redStar">* </span>账龄阶段</label>
			                        <div class="col-sm-6">
			                            <input type="text" class="form-control" name="aging">
			                        </div>
			                    </div>
			                    <div class="form-group">
			                        <label class="col-sm-4 control-label">逾期天数</label>
			                        <div class="col-sm-6">
			                            <input type="text" class="dayInput" name="overdueDaysFrom">
			                            <span class="form_group_span">至</span>
			                            <input type="text" class="dayInput" name="overdueDaysTo">
			                        </div>
			                    </div>
			                    <div class="form-group">
			                        <label class="col-sm-4 control-label"><span class="redStar">* </span>服务费率</label>
			                        <div class="col-sm-6">
			                            <input type="text" name="serviceRate">
				                        <span class="form_group_span">%</span>
			                        </div>
			                    </div>
                </form>

            </div>
            <div class="modal-footer">
                <button class="btn btn-primary" type="button" class="btn blue" id="outsrcRateAddBtn">新增</button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
            </div>
        </div>
    </div>
</div>
<!--新增窗口-结束-->

<!--维护窗口-开始-->
<div class="modal fade hideModal" id="outsrcRateUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:500px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">委外费率-维护</h4>
            </div>
            <div class="modal-body">

                <form class="form-horizontal" id="outsrcRateUpdateForm">
                    <input type="hidden" name="id" id="edit_outsrcRate_id">
                    <input type="hidden" name="recVer" id="edit_outsrcRate_recVer">
				                    <div class="form-group">
				                        <label class="col-sm-4 control-label"><span class="redStar">* </span>账龄阶段</label>
				                        <div class="col-sm-6">
				                            <input type="text" class="form-control" name="aging" id="edit_outsrcRate_aging">
				                        </div>
				                    </div>
				                    <div class="form-group">
				                        <label class="col-sm-4 control-label" >逾期天数</label>
				                        <div class="col-sm-6">
				                            <input type="text" class="dayInput" name="overdueDaysFrom" id="edit_outsrcRate_overdueDaysFrom" disabled>
				                            <span class="form_group_span">至</span>
				                            <input type="text" class="dayInput" name="overdueDaysTo" id="edit_outsrcRate_overdueDaysTo" disabled>
				                        </div>
				                    </div>
				                    <div class="form-group">
				                        <label class="col-sm-4 control-label">服务费率</label>
				                        <div class="col-sm-6">
				                            <input type="text" name="serviceRate" id="edit_outsrcRate_serviceRate" disabled>
				                            <span class="form_group_span">%</span>
				                        </div>
				                    </div>
				                    <div class="form-group">
				                        <label class="col-sm-4 control-label">是否有效</label>
				                        <div class="col-sm-6">
				                            <select class="form-control" name="isActive" id="edit_outsrcRate_isActive">
				                                <option value="Y">有效</option>
				                                <option value="N">无效</option>
				                            </select>
				                        </div>
				                    </div>
                </form>

            </div>
            <div class="modal-footer">
                <button class="btn btn-primary" type="button" class="btn blue" id="outsrcRateUpdateBtn">确定</button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
            </div>
        </div>
    </div>
</div>
<!--维护窗口-结束-->

<script type="text/javascript" language="javascript">

    <%-- var outsrcRate_table = P.dataTable($('#outsrcRate-dataTable'),
            $("#outsrcRate-searchForm"),
            "<%=request.getContextPath()%>/rest/outsrcRate/pageOutsrcRateData",
            [
                {"mData"  : function(row, type, set, meta) { return meta.row + 1; }},
                {"mData"  : "aging","sDefaultContent" : ""},
                {"mData" : "overdueDaysFrom","sDefaultContent" : ""},
                {"mData" : "overdueDaysTo","sDefaultContent" : ""},
                {"mData" : "serviceRateFmt","sDefaultContent" : ""},
//                {"mData" : "outsrcRateFmt","sDefaultContent" : ""},
                {"mData" : "isActiveText","sDefaultContent" : ""},
                {"mData" : "updatedBy","sDefaultContent" : ""},
                {"mData" : "updateTime","sDefaultContent" : ""},
                {"mData" : null,"sDefaultContent" : "",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        <shiro:hasPermission name="out_rate:update">
                            $(nTd).html("<a href='javascript:void(0);' " + "onclick='outsrcRate_editFun(\"" + oData.id + "\",\"" + oData.recVer + "\",\"" + oData.aging + "\",\"" + oData.overdueDaysFrom + "\",\"" + oData.overdueDaysTo + "\",\"" + oData.outsrcRateFmt + "\",\"" + oData.serviceRateFmt + "\",\"" + oData.isActive + "\")'>维护</a>");
                        </shiro:hasPermission>
                    }
                }
            ]
    ); --%>
    function outsrcRate_table(){
    	$('#outsrcRate-dataTable').DataTable({
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
	      "sAjaxSource" : "<%=request.getContextPath()%>/rest/outsrcRate/pageOutsrcRateData",
	      "fnServerData" : function(sSource, aoData, fnCallback) {
	          //参数拼接
	          var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#outsrcRate-searchForm").serialize();
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
				{"mData"  : function(row, type, set, meta) { return meta.row + 1; }},
                {"mData"  : "aging","sDefaultContent" : ""},
                {"mData" : "overdueDaysFrom","sDefaultContent" : ""},
                {"mData" : "overdueDaysTo","sDefaultContent" : ""},
                {"mData" : "serviceRateFmt","sDefaultContent" : ""},
                {"mData" : "isActiveText","sDefaultContent" : ""},
                {"mData" : "updatedBy","sDefaultContent" : ""},
                {"mData" : "updateTime","sDefaultContent" : ""},
                {"mData" : null,"sDefaultContent" : "",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        <shiro:hasPermission name="out_rate:update">
                            $(nTd).html("<a href='javascript:void(0);' " + "onclick='outsrcRate_editFun(\"" + oData.id + "\",\"" + oData.recVer + "\",\"" + oData.aging + "\",\"" + oData.overdueDaysFrom + "\",\"" + oData.overdueDaysTo + "\",\"" + oData.outsrcRateFmt + "\",\"" + oData.serviceRateFmt + "\",\"" + oData.isActive + "\")'>维护</a>");
                        </shiro:hasPermission>
                    }
                }
	      ],
          "aoColumnDefs":[
                          {"bSortable":false,"aTargets": [0,8]}                          
          ]
	      
	  });
	 
	}

    function outsrcRate_editFun(id,recVer,aging,overdueDaysFrom,overdueDaysTo,outsrcRateFmt,serviceRateFmt,isActive){
    	//移除验证提示
        $(".tooltip").remove();
        $("#outsrcRateUpdateForm input[type='text']").val("");  
        $("#outsrcRateUpdateForm select").find("option:first").prop("selected",true);
        $("#edit_outsrcRate_id").val(id);
        $("#edit_outsrcRate_recVer").val(recVer);
        $("#edit_outsrcRate_aging").val(aging);
        $("#edit_outsrcRate_overdueDaysFrom").val(overdueDaysFrom == 'undefined' ? "" : overdueDaysFrom);
        $("#edit_outsrcRate_overdueDaysTo").val(overdueDaysTo == 'undefined' ? "" : overdueDaysTo);
//        $("#edit_outsrcRate_outsrcRate").val(outsrcRateFmt);
        $("#edit_outsrcRate_serviceRate").val(serviceRateFmt);
        $("#edit_outsrcRate_isActive").val(isActive);

        $("#outsrcRateUpdateModal").modal('show');
    }
    //打开新增窗口
    $("#outstr_addBtn").on("click",function(){
    	//移除验证提示
        $(".tooltip").remove();
        $("#outsrcRateAddForm input[type='text']").val("");  
        $("#outsrcRateAddForm select").find("option:first").prop("selected",true);
    	$("#outsrcRateAddModal").modal("show");
    });
    //查询按钮
    $('#outsrcRate-searchBtn').on( 'click', function () {
        //outsrcRate_table.search($("#outsrcRate-searchForm").serialize()).draw();
        outsrcRate_table();
    });

    //新增按钮
    $('#outsrcRateAddBtn').on( 'click', function () {
        var $addBtn = $(this);
        $addBtn.attr("disabled",true);
        var $addForm = $('#outsrcRateAddForm');
        //表单校验
        if (!$addForm.valid()){
            $addBtn.attr("disabled",false);
            return false;
        }
        $.post("<%=request.getContextPath()%>/rest/outsrcRate/addOutsrcRate",
                $addForm.serialize(),
                function(ret){
                    if(ret.success){
                        $("#outsrcRateAddModal").modal("hide");
                        $addForm.resetForm();
                        //outsrcRate_table.search($("#outsrcRate-searchForm").serialize()).draw();
                        outsrcRate_table();
                    }
                    $addBtn.attr("disabled",false);
                    MSG.show(ret.message);
                },
                "JSON"
        );
    });

    //维护按钮
    $('#outsrcRateUpdateBtn').on( 'click', function () {
        var $updateBtn = $(this);
        $updateBtn.attr("disabled",true);
        var $updateForm = $('#outsrcRateUpdateForm');
        //表单校验
        if (!$updateForm.valid()){
            $updateBtn.attr("disabled",false);
            return false;
        }
        $.post("<%=request.getContextPath()%>/rest/outsrcRate/updateOutsrcRate",
                $updateForm.serialize(),
                function(ret){
                    if(ret.success){
                        $("#outsrcRateUpdateModal").modal("hide");
                        //outsrcRate_table.search($("#outsrcRate-searchForm").serialize()).draw();
                        outsrcRate_table();
                    }
                    $updateBtn.attr("disabled",false);
                    MSG.show(ret.message);
                },
                "JSON"
        );
    });

    $(document).ready(function() {
        //表单校验
        outsrc_rate_validate($("#outsrcRateAddForm"));
        outsrc_rate_validate($("#outsrcRateUpdateForm"));
    });

    //表单校验
    function outsrc_rate_validate($validateForm){
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
                aging: {
                    required: true,minlength:2
                },
//                outsrcRate: {
//                    required: true,upNumDeci:true
//                },
                serviceRate: {
                    required: true,upNumDeci:true
                },
                overdueDaysFrom: {
                    upNum: true,digits:true
                },
                overdueDaysTo: {
                    upNum: true,digits:true
                }
            },
            messages: {
                aging: {
                    required: "请输入账龄阶段"
                },
//                outsrcRate: {
//                    required: "请输入委外费率"
//                },
                serviceRate: {
                    required: "请输入服务费率"
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


