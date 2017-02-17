var P = {};

/**
 * 重写JQuery构造, success error方法,做session校验
 * */
var ajax = $.ajax;
$.ajax = function (opt) {
    var fn = {
        success : function (data, textStatus, jqXHR) {},
        error : function(jqXHR,textStatus,errorThrown){}
    };
    if(opt.success) {
        fn.success = opt.success;
    }
    if(opt.error) {
        fn.error = opt.error;
    }
    //扩展增强处理
    var _opt = $.extend(opt, {
        success : function (data, textStatus, jqXHR) {
            $("#maskDiv").removeClass("is-visible");
            var sessionStatus = jqXHR.getResponseHeader("sessionStatus");
            if(sessionStatus == "timeout"){
                MSG.alert("登录信息已失效,请重新登录","确定",function(){
                    window.location.href = P.getRootPath() + "/rest/page/login";
                });
                return false;
            }
            fn.success(data, textStatus, jqXHR);
        },
        error : function(jqXHR,textStatus,errorThrown){
            $("#maskDiv").removeClass("is-visible");
            var sessionStatus = jqXHR.getResponseHeader("sessionStatus");
            if(sessionStatus == "timeout"){
                MSG.alert("登录信息已失效,请重新登录","确定",function(){
                    window.location.href = P.getRootPath() + "/rest/page/login";
                });
                return false;
            }
            fn.error(jqXHR,textStatus,errorThrown);
        }
    });

    var def = ajax.call($, _opt);                                                                                                                             // 兼容不支持异步回调的版本
//    if('done' in def){
//        var done = def.done;
//        def.done = function (func) {
//            function _done(data, textStatus, jqXHR) {
//                $("#maskDiv").removeClass("is-visible");
//                var sessionStatus = jqXHR.getResponseHeader("sessionStatus");
//                if(sessionStatus == "timeout"){
//                    MSG.alert("登录信息已失效,请重新登录","确定",function(){
//                        window.location.href = P.getRootPath() + "/rest/page/login";
//                    });
//                }else{
//                    func(data);
//                }
//            }
//            done.call(def, _done);
//            return def;
//        };
//    }
    return def;
};

/**
 * 配置JQuery默认属性
 * */
$.ajaxSetup({
    beforeSend: function (XMLHttpRequest) {
        //发送请求前触发
        $("#maskDiv").addClass("is-visible");
    }
    ,contentType:"application/x-www-form-urlencoded;charset=utf-8"
//    ,"error":function(jqXHR,textStatus,errorThrown){
//        //请求失败时触发
//        /*
//        readyState:当前状态:0-未初始化,1-正在载入,2-已经载入,3-数据进行交互,4-完成
//        status:返回的HTTP状态码
//        statusText:对应状态码的错误信息
//        responseText:服务器响应返回的文本信息
//        */
//        console.info(JSON.stringify(jqXHR));
//    }
//    ,"complete": function (XMLHttpRequest, textStatus) {
//        //完成请求后触发,即在success或error触发后触发
//        //通过XMLHttpRequest取得响应头sessionStatus
//        $("#maskDiv").removeClass("is-visible");
//        var sessionStatus = XMLHttpRequest.getResponseHeader("sessionStatus");
//        if(sessionStatus == "timeout"){
//            MSG.alert("登录信息已失效,请重新登录","确定",function(){
//                window.location.href = P.getRootPath() + "/rest/page/login";
//            });
//        }
//    }
});

/**
 * 表单校验
 * @param $form 表单
 * @param rules 校验项
 * @param messages 提示信息
 * */
P.validateForm = function ($form,rules,messages) {
    $form.validate({
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
        rules:rules ? rules : {},
        messages:messages ? messages : {}
    });
};

/**
 * 封装分页插件方法
 * @param $dataTable 显示数据的Table控件
 * @param $searchForm 查询Form的控件
 * @param dataUrl 获取数据的 Ajax Url
 * @param aoColumns 数据详细的显示数组
 * @param iDisplayLength 每页多少条数据
 * @return dataTable
 * */
P.dataTable = function($dataTable,$searchForm,dataUrl,aoColumns,iDisplayLength,$checkAll){
    return $dataTable.DataTable({
//        "scrollY": 445,
//        "scrollX": true,
//        "sScrollXInner": "100%",
        "bScrollCollapse": true,

        "sPaginationType": "full_numbers",      //设置分页控件的模式
        "bLengthChange": false,                 //改变每页显示数据数量
        "bPaginate": true,                      //是否翻页功能
        "bFilter": false,                       //是否过滤功能
        "bInfo": true,            			    //是否页脚信息
        "bSort": false,					        //是否排序功能

        "bAutoWidth": false,                    //是否自动宽度
        "bStateSave": false,                    //是否记忆配置,记录在cookies中

        "iDisplayLength": iDisplayLength ? iDisplayLength : 100,
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
            //,"sProcessing": "<img src='assets/img/loading.gif' />"
        },
        "bProcessing": false,       //加载数据时显示正在加载信息
        "bServerSide": true,        //指定从服务器端获取数据
        "sAjaxSource" : dataUrl,
        "fnServerData" : function(sSource, aoData, fnCallback) {
            //参数拼接
            var data = "paramData=" + JSON.stringify(aoData) + "&" + $searchForm.serialize();
            $.ajax({
                "type" : 'POST',
                "dataType" : "json",
                "url" : sSource,
                "data" : data,
                "success" : function(resp) {
                	if($checkAll){
                		$checkAll.attr("checked", false);
                	}
                    fnCallback(resp);
                }
                ,"error":function(jqXHR,textStatus,errorThrown){
                    MSG.show("获取数据发生异常");
                    $('#main-content').html(jqXHR.responseText);
                }
            });
        },
        //dataTable显示
        "aoColumns" : aoColumns
//        ,
//        "aoColumnDefs":[],
//        "fnRowCallback" : function(nRow,aData,iDisplayIndex) {//相当于对字段格式化
//            if (aData["revampStatus"] == 0) {
//                $('td:eq(5)', nRow).html("结束");
//            }
//        }
    });
};

/**
 * post添加,表单ID需要对得上
 * @param url 提交地址
 * @param addForm 新增表单
 * @param content 查询表单父类div控件
 * @param dataTable 页面数据表单
 * */
P.addPost = function(url,addForm,content,dataTable){
    var data = addForm.serialize();
    $.ajax({
        type : 'POST',
        dataType : "json",
        url : url,
        data : data,
        success : function(ret) {
            if(ret.success){
                content.find(".hideModal").modal("hide");
                addForm.resetForm();    //重置新增表单
                dataTable.search(content.find("#searchForm").serialize()).draw();  //刷新页面
                MSG.show(ret.message);
                addForm.find(".redStarMessages").text("");
            }else{
                addForm.find(".redStarMessages").text(ret.message);
            }
        },
        error:function(errorData){
            MSG.show("系统异常,稍后重试");
        }
    });
};

/**
 * post修改,表单ID需要对得上
 * @param url 提交地址
 * @param updateForm 修改表单
 * @param content 查询表单父类div控件
 * @param dataTable 页面数据表单
 * */
P.updatePost = function(url,updateForm,content,dataTable){
    var data = updateForm.serialize();
    $.ajax({
        type : 'POST',
        dataType : "json",
        url : url,
        data : data,
        success : function(ret) {
            if(ret.success){
                content.find(".hideModal").modal("hide");
                dataTable.search(content.find("#searchForm").serialize()).draw();  //刷新页面
                MSG.show(ret.message);
                updateForm.find(".redStarMessages").text("");
            }else{
                updateForm.find(".redStarMessages").text(ret.message);
            }
        },
        error:function(errorData){
            MSG.show("系统异常,稍后重试");
        }
    });
};

/**
 * post删除,表单ID需要对得上
 * @param url 提交地址
 * @param deleteForm 删除表单
 * @param content 查询表单父类div控件
 * @param dataTable 页面数据表单
 * */
P.deletePost = function(url,deleteForm,content,dataTable){
    var data = deleteForm.serialize();
    $.ajax({
        type : 'POST',
        dataType : "json",
        url : url,
        data : data,
        success : function(ret) {
            if(ret.success){
                content.find(".hideModal").modal("hide");
                dataTable.search(content.find(".searchForm").serialize()).draw();  //刷新页面
                MSG.show(ret.message);
                deleteForm.find(".redStarMessages").text("");
            }else{
                deleteForm.find(".redStarMessages").text(ret.message);
            }
        },
        error:function(errorData){
            MSG.show("系统异常,稍后重试");
        }
    });
};

/**
 * js获取项目根路径
 * */
P.getRootPath = function(){
    //获取当前网址,如:http://localhost:8080/rest/xx/xxx.jsp
    var curWwwPath = window.document.location.href;
    //获取主机地址之后的目录,如:rest/xx/xxx.jsp
    var pathName = window.document.location.pathname;
    var pos = curWwwPath.indexOf(pathName);
    //获取主机地址,如:http://localhost:8080
    var localhostPath = curWwwPath.substring(0,pos);
    //获取带"/"的项目名,如:/rest
    //var projectName = pathName.substring(0,pathName.substr(1).indexOf('/')+1);
    return(localhostPath);
};

/**
 * 重置Modal弹窗的表单
 * @param formId 表单ID
 * */
P.resetModal = function(formId){
    var $form = $('#' + formId);
    $form.resetForm();
    //form表单中校验提醒信息,用checkMessage class
    $form.find('.checkMessage').text('');
};

/**
 * ajax请求发生异常时跳转页面
 * */
P.ajaxErrorHref = function(errorData){
    var result = errorData.responseText;
    if(result != null && result != ''){
        //获取工程路径
        location.href = P.getRootPath() + "/rest/page/exception";
    }
};

// /**
//  * 校验页面登录信息和后台session信息,若不匹配,跳转到登录页面
//  * */
// P.checkUser = function(){
//     var currentUser = $("#currentUser").val();
//     $.ajax({
//         type : 'POST',
//         dataType : "json",
//         url : window.document.location.href + "rest/page/checkUser",
//         data : {currentUser:currentUser},
//         success : function(result) {
//             if(!result){
//                 MSG.alert("登录信息已失效,请重新登录","确定",function(){
//                     window.location.href = window.document.location.href + "rest/page/login"
//                 });
//             }
//         }
//     });
// };

