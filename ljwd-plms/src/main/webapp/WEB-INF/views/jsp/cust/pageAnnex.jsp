<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<head>
    <title>附件信息</title>
</head>

<div class="plms-content">

    <div class="panel-body">
        <form class="searchForm" id="annex-searchForm">
            <label for="annexType" class="right-space-2">附件类型</label>
            <select id="annexType" name="annexType" class="right-space-2">
                <option value="">全部</option>
                <c:forEach items="${annexTypeList}" var="item">
                    <option value="${item.code}">${item.val}</option>
                </c:forEach>
            </select>
            <!--客户ID，说明哪个用户下的数据-->
            <input type="hidden" value="${clCustId}" name="clCustId" >
            <input class="btn btn-primary right-space-2" type="button" id="annex-searchBtn"  value="查询"/>
            <shiro:hasPermission name="annex:upload">
                <input class="btn btn-primary" type="button" value="上传" id="annex_addBtn"/>
            </shiro:hasPermission>
        </form>
    </div>

    <table id="annex-dataTable" class="display dataTable" cellspacing="0" width="100%">
        <thead>
        <tr>
            <th class="text-center">来源</th>
            <th class="text-center">主题</th>
            <th class="text-center">文件名</th>
            <th class="text-center">附件类型</th>
            <th class="text-center">操作</th>
        </tr>
        </thead>
    </table>

    <!--添加窗口-->
    <div class="modal fade" id="annex-add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" style="width:450px">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                    <h4 class="modal-title">附件信息-新增</h4>
                </div>
                <div class="modal-body">

                    <form class="form-horizontal" id="annex-addForm" enctype="multipart/form-data" method="post">
                        <!--客户ID，说明哪个用户下的数据-->
                        <input type="hidden" value="${clCustId}" name="clCustId">

                        <div class="form-group">
                            <label class="col-sm-4 control-label">来源</label>
                            <div class="col-sm-6">
                                <select class="form-control" name="srcCode">
                                    <c:forEach items="${sourceList}" var="item">
                                        <c:if test="${('NETWORK' eq item.code) == true || ('EXTMECHAN' eq item.code) == true}">
                                            <option value="${item.code}">${item.val}</option>
                                        </c:if>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label"><span class="redStar">* </span>主题</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" name="topic" required maxlength="25" minlength="2">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label"><span class="redStar">* </span>文件名</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" name="fileName" required maxlength="25" minlength="2">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label">附件类型</label>
                            <div class="col-sm-6">
                                <select class="form-control" name="annexType">
                                    <c:forEach items="${annexTypeList}" var="item">
                                        <option value="${item.code}">${item.val}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>

                        <div class="form-group classFile">
                            <label class="col-sm-4 control-label"><span class="redStar">* </span>选择上传附件</label>
                            <div class="col-sm-6">
                                <input type="text" name="tempFileName" id="tempFileName" class="form-control" data-placement="bottom" readonly="readonly"/>
                            </div>
					   		<a href="javascript:void(0)" class="input">添加文件<input type="file" name="image" onchange="tempFileNameChange(this)"></a>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label"></label>
                            <div class="col-sm-6">
                                <span class="redStar checkMessage redStarMessages" id="annexMessage"></span>
                            </div>
                        </div>

                        <div class="modal-footer">
                            <input class="btn btn-primary" type="submit" class="btn blue" id="annex-addBtn" value="上传">
                            <input class="btn btn-primary" type="button" class="btn default" data-dismiss="modal" value="返回">
                        </div>

                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" language="javascript">

    //选项卡点击
    $("#pageAnnexLi").on('click', function () {
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
    	annex_table=$('#annex-dataTable').DataTable({
             "scrollX": '100%',
             "sScrollXInner": "100%",
             "bScrollCollapse": true,

             "sPaginationType": "full_numbers",      //设置分页控件的模式
             "bLengthChange": false,                 //改变每页显示数据数量
             "bPaginate": true,                      //是否翻页功能
             "bFilter": false,                       //是否过滤功能
             "bInfo": true,                         //是否页脚信息
             "bSort": false,                            //是否排序功能

             "bAutoWidth": true,                    //是否自动宽度
             "bStateSave": false,                    //是否记忆配置,记录在cookies中

             "iDisplayLength": 15,
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
             "sAjaxSource" : "<%=request.getContextPath()%>/rest/cust/pageAnnexData",
             "fnServerData" : function(sSource, aoData, fnCallback) {
                 //参数拼接
                 var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#annex-searchForm").serialize();
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
				{"mData" : "srcVal","sDefaultContent" : ""},
                {"mData" : "topic","sDefaultContent" : ""},
                {"mData" : "fileName","sDefaultContent" : ""},
                {"mData" : "annexTypeVal","sDefaultContent" : ""},
                {"mData" : null,"sDefaultContent" : "",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        <shiro:hasPermission name='annex:download'>
                            $(nTd).html("<a href='javascript:void(0);' onclick='downloadFun(\"" + oData.id + "\")'>下载</a>");
                        </shiro:hasPermission>
                    }
                }
             ]
         });
       }

    //查询按钮提交
    $('#annex-searchBtn').on( 'click', function () {
        annex_table.search($("#annex-searchForm").serialize()).draw();  //刷新页面
    });

    //打开上传文件窗口
    $("#annex_addBtn").on("click",function(){
    	//移除验证提示
        $(".tooltip").remove();
        $("#annexMessage").text("");
        $("#annex-addForm").resetForm();
        $("#annex-add").modal("show");
    });

    //上传按钮提交
    $("#annex-addForm").validate({
        unhighlight: function (element, errorClass, validClass) {
            //验证通过
            $(element).tooltip("destroy").removeClass(errorClass);
        },
        errorPlacement: function (label, element) {
            //让验证提示显示在验证框下面 注：有些地方如果动态添加这个属性不成功就手动添加 data-placement="bottom" 属性
            $(element).attr("data-placement","bottom");
            $(element).tooltip("destroy"); /*必需*/
            $(element).attr("title", $(label).text()).tooltip("show");
        },
        rules: {
            topic:{
                required: true
            },
            fileName:{
                required: true
            },
            tempFileName: {
                required: true
            }
        },
        messages:{
            topic:{
                required:"主题不能为空"
            },
            fileName:{
                required:"文件名不能为空"
            },
            tempFileName: {
                required:"请选择上传文件"
            }
        },
        //验证通过之后回调
        submitHandler: function(form) {
            var $annexAddBtn = $("#annex-addBtn");
            $annexAddBtn.attr("disabled",true);
            var $form = $('#annex-addForm');
            $("#annexMessage").text("");
            $form.ajaxSubmit({
                type:"POST",
                dataType : "json",
                url:"<%=request.getContextPath()%>/rest/cust/addAnnex",
                success : function(ret){
                    if(ret.success){
                        $("#annex-add").modal("hide");
                        $form.resetForm();
                        annex_table.search($("#searchForm").serialize()).draw();  //刷新页面
                        MSG.show(ret.message);
                    }else{
                        $("#annexMessage").text(ret.message);
                    }
                    $annexAddBtn.attr("disabled",false);
                },
                error:function(errorData){
                    MSG.alert("上传失败");
                    $annexAddBtn.attr("disabled",false);
                }
            });
        },
        //不通过时回调
        invalidHandler: function(form, validator) {
            return false;
        }
    });
    
  	//把文件名显示在input中
    function tempFileNameChange(obj){
        var tempFileName = obj.value;
        var nameS = tempFileName.split("\\");
        $("#tempFileName").val(nameS[nameS.length-1]);
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
