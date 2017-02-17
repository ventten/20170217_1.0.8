<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<head>
    <title>呼叫记录</title>
    <jsp:include page="/WEB-INF/views/header.jsp" flush="true"/>
    <script language="javascript" type="text/javascript" src="assets/plugins/My97DatePicker/WdatePicker.js"></script>
    <script type="text/javascript" src="app/js/datePicker.js"></script>
</head>

<body>
<div class="caseInfo">
<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">呼叫记录</h3>
    </div>
    <div class="panel-body">
        <form id="searchForm">

            <label for="loanname" class="right-space-1">主贷人 </label>
            <input type="text" id="loanname" name="loanname" class="right-space collection"/>

            <label for="idcard" class="right-space-1">身份证号 </label>
            <input type="text" id="idcard" name="idcard" class="right-space collection"/>

            <label for="contractno" class="right-space-1">合同编号 </label>
            <c:choose>
                <c:when test="${contractNo == null || '' eq contractNo}">
                    <input type="text" id="contractno" name="contractno" class="collection right-space-1"/>
                </c:when>
                <c:otherwise>
                    <input type="text" id="contractno" name="contractno" class="collection right-space-1" value="${contractNo}" readonly/>
                </c:otherwise>
            </c:choose>

            <label for="createTimeMin" class="right-space-1 label-width">呼叫日期</label>
            <input size="10" type="text" class="collection-number" readonly onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'createTimeMax\')||\'%y-%M-%d\'}'})" id="createTimeMin" name="createTimeMin">
            <label for="createTimeMax" class="label-center-1">&nbsp;至&nbsp;</label>
            <input size="10" type="text" class="collection-number" readonly onFocus="WdatePicker({minDate:'#F{$dp.$D(\'createTimeMin\')}',maxDate:'%y-%M-%d'})" id="createTimeMax" name="createTimeMax">

            <br/><br/>
            <button type="button" class="btn btn-primary right-space-1" id="searchBtn">查询</button>
            <button type="reset" class="btn btn-default">清除</button>
        </form>
    </div>
</div>

<table id="surveyCall_dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th class="text-center">主贷人姓名</th>
        <th class="text-center">拨通时间</th>
        <th class="text-center">通话时长(秒)</th>
        <th class="text-center">呼叫号码</th>
        <th class="text-center">与主贷人关系</th>
        <th class="text-center">被呼叫人员</th>
        <th class="text-center">查看录音</th>
        <th class="text-center">操作人</th>
        <th class="text-center">拨打时间</th>
        <th class="text-center">部门</th>
        <th class="text-center">呼叫状态</th>
        <th class="text-center">拨打分机号</th>
    </tr>
    </thead>
</table>

<!--录音文件窗口-开始-->
<div class="modal fade hideModal" id="callRecordModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" aria-hidden="true" onclick="stopAudio();"></button>
                <h4 class="modal-title">录音文件</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="callRecordForm">
                    <div class="form-group">
                        <label class="col-sm-4 control-label">主贷人</label>
                        <div class="col-sm-5">
                            <input type="text" class="form-control" id="callRecord_loanname" readonly>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-4 control-label">催收员</label>
                        <div class="col-sm-5">
                            <input type="text" class="form-control" id="callRecord_creatusername" readonly>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-4 control-label">呼叫时间</label>
                        <div class="col-sm-5">
                            <input type="text" class="form-control" id="callRecord_callDate" readonly>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-4 control-label">通话时长</label>
                        <div class="col-sm-5">
                            <input type="text" class="form-control" id="callRecord_callLong" readonly>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label"></label>
                        <div class="col-sm-5">
                            <audio id="callRecord_audio" src="" controls="controls" autoplay="autoplay">您的浏览器不支持录音播放。</audio>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary" class="btn default" onclick="stopAudio();">返回</button>
            </div>
        </div>
    </div>
</div>
<!--录音文件窗口-结束-->
</div>
</body>
<jsp:include page="/WEB-INF/views/footer.jsp" flush="true"/>
<script type="text/javascript" language="javascript">

    //播放录音
    function play_call(loanname,creatusername,callDate,callLong,uniqueid,callFrom){
        if(!uniqueid || uniqueid == "undefined" || uniqueid == "null" || !callLong || callLong == "undefined" || callLong == "0" || callLong == "null"){
            MSG.show("录音文件不存在");
            return;
        }
        if(!callFrom || callFrom == "undefined" || callFrom == "null"){
            callFrom = "";
        }
        $("#callRecord_loanname").val(loanname);
        $("#callRecord_creatusername").val(creatusername);
        $("#callRecord_callDate").val(callDate);
        $("#callRecord_callLong").val(callLong);
        //var audio = $("#callRecord_audio")[0];
        var audio = document.getElementById("callRecord_audio");
        audio.src = "<%=request.getContextPath()%>/rest/surveyCall/play?uniqueid=" + uniqueid + "&callFrom=" + callFrom + "&date=" + new Date().toTimeString();
        $("#callRecordModal").modal("show");
        audio.play();
    }
    
    function stopAudio() {
        var audio = document.getElementById("callRecord_audio");
        audio.pause();
        audio.currentTime = 0;
        audio.src = "";
        $("#callRecordModal").modal("hide");
    }
    
    var surveyCall_dataTable=$('#surveyCall_dataTable').DataTable({
        "scrollY": '550px',
        "scrollX": '100%',
        "sScrollXInner": "100%",
        "bScrollCollapse": true,

        "sPaginationType": "full_numbers",      //设置分页控件的模式
        "bLengthChange": false,                 //改变每页显示数据数量
        "bPaginate": true,                      //是否翻页功能
        "bFilter": false,                       //是否过滤功能
        "bInfo": true,                         //是否页脚信息
        "bSort": false,                        //是否排序功能

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
        "sAjaxSource" : "<%=request.getContextPath()%>/rest/surveyCall/pageSurveyCallData",
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
			{"mData" : "loanname","sDefaultContent" : ""},
                {"mData" : "callDate","sDefaultContent" : "",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        if(oData.callLong == 'undefined' || oData.callLong == 'null' ||  oData.callLong == '0'){
                            $(nTd).html('');
                        }else {
                            $(nTd).html(oData.callDate);
                        }
                    }
                },
                {"mData" : "callLong","sDefaultContent" : ""},
                {"mData" : "phone","sDefaultContent" : ""},
                {"mData" : "relationVal","sDefaultContent" : ""},
                {"mData" : "callBy","sDefaultContent" : ""},
                {"mData" : null,"sDefaultContent" : "",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        $(nTd).html("<a href='javascript:void(0);' " + "onclick='play_call(\"" + oData.loanname + "\",\"" + oData.creatusername + "\",\"" + oData.callDate + "\",\"" + oData.callLong + "\",\"" + oData.uniqueid + "\",\"" + oData.callFrom + "\")'>播放录音</a>&nbsp;&nbsp;");
                    }
                },
                {"mData" : "creatusername","sDefaultContent" : ""},
                {"mData" : "createTime","sDefaultContent" : ""},
                {"mData" : "deptypeText","sDefaultContent" : ""},
                {"mData" : "cloudcallStatusText","sDefaultContent" : ""},
                {"mData" : "callFrom","sDefaultContent" : ""}
        ]
    });

    //查询按钮
    $('#searchBtn').on('click', function (){
        var $form = $('#searchForm');
        surveyCall_dataTable.search($form.serialize()).draw();
    });

    //下载录音
    <%--function download_call(uniqueid){--%>
        <%--if(!uniqueid || uniqueid == "undefined"){--%>
            <%--MSG.show("录音文件不存在");--%>
            <%--return;--%>
        <%--}--%>

        <%--//定义一个form表单--%>
        <%--var $form=$("<form>");--%>
        <%--$form.attr("style","display:none");--%>
        <%--$form.attr("target","");--%>
        <%--$form.attr("method","post");--%>
        <%--$form.attr("action","<%=request.getContextPath()%>/rest/");--%>

        <%--var $uniqueid=$("<input>");--%>
        <%--$uniqueid.attr("type","hidden");--%>
        <%--$uniqueid.attr("name","uniqueid");--%>
        <%--$uniqueid.attr("value",uniqueid);--%>
        <%--$form.append($uniqueid);--%>

        <%--//将表单放置在web中--%>
        <%--$("body").append($form);--%>

        <%--$form.submit();--%>
    <%--}--%>
	
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
    
    /************设置页面加载时修改页面左侧菜单栏状态*************/
    $(function(){
   		var Val=$('.caseInfo').attr('class');
   		//使用localStorage取值
   		var getVal=localStorage.getItem("my");
   		if(getVal=="surveyCallBtnMy"){
   			$('#'+Val).click();
   			$('#'+Val+'_active').addClass('choose_active');
   		}
   		if(getVal=="surveyCallBtnAll"){
   			$('#'+Val).click();
   			$('#'+Val+'All_active').addClass('choose_active');
   		}
   		if(getVal=="visitInfo"){
   			$('#'+getVal).click();
   			$('#'+getVal+'_active').addClass('choose_active');
   		}
   		if(getVal=="transferAdvance"){
   			$('#'+getVal).click();
   			$('#'+getVal+'_case').addClass('choose_active');
   		}
   		if(getVal=="visitInfo_my"){
   			$('#'+'visitInfo').click();
   			$('#'+getVal+'active').addClass('choose_active');
   		}
   		if(getVal=="caseInfoAll"){
   			$('#'+'caseInfo').click();
   			$('#'+getVal+'_active').addClass('choose_active');
   		}
   		if(getVal=="visitInfo_delay"){
   			$('#'+'visitInfo').click();
   			$('#'+getVal).addClass('choose_active');
   		}
   		if(getVal=="outsrcInfo"){
   			$('#'+getVal).click();
   			$('#'+getVal+'_case').addClass('choose_active');
   		}
   		if(getVal=="customerInfo_select"){
   			$('#'+'customerInfo').click();
   			$('#'+getVal).addClass('choose_active');
   		}
   		//点击菜单移除选中项class
   		$('.sub-menu li').click(function(){
   			$('.sub-menu li').find('a').removeClass('choose_active');
   		})
    }) 
</script>
