<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信函管理</title>
<style>
     .dataTables_scrollBody tbody tr td{
	    padding: 1px 10px !important;
	}
</style>
</head>
<body>
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">信函生成</h3>
        </div>
        <div class="panel-body">
            <div class="aas">
                <form class="searchForm" id="corres_searchForm">
                    <label for="siteCode">所属城市 </label>
                    <select id="siteCode" name="siteCode">
                        <option value="2151">深圳</option>
                        <option value="other">其他</option>
                    </select>
                    <label for="addrType">地址类别</label>
                    <select id="addrType" name="addrType">
                        <c:forEach items="${addList }" var="item">
                            <c:choose>
                                <c:when test="${item.addCode  == 'OTHER'}"></c:when>
                                <c:otherwise>
                                    <option value="${item.addCode }">${item.addName }</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </select>
                    <label for="contractNo">合同编号</label>
                    <input type="text" id="contractNo" name="contractNo" />
                    <label for="loanName" class="line-bottom">&nbsp;&nbsp;主&nbsp;&nbsp;贷&nbsp;&nbsp;人 </label>
                    <input type="text" id="loanName" name="loanName" />
                    <br />
                    <label for="loanCardId">身份证号 </label>
                    <input type="text" id="loanCardId" name="loanCardId" />
                    <label for="repaymentFrom">应还日期</label>
                    <input size="16" type="text" readonly="readonly" onfocus="WdatePicker({readOnly:true,maxDate:'%y-%M-%d'})" class="input-border collection-number" id="repaymentFrom" name="repaymentFrom">
                    <label class="label-center-1">至</label>
                    <input size="16" type="text" readonly="readonly" onfocus="WdatePicker({readOnly:true,maxDate:'%y-%M-%d'})" class="input-border collection-number" id="repaymentTo" name="repaymentTo">
                    <label for="isAlloc">逾期天数</label>
                    <input type="text" id="overdueDayFrom" name="overdueDayFrom" class="collection-data" onkeyup="value=value.replace(/[^\d]/g,'') "/>
                    <label class="label-center-1">至</label>
                    <input type="text" id="overdueDayTo" name="overdueDayTo" class="collection-data line-bottom" onkeyup="value=value.replace(/[^\d]/g,'') "/>
                    <br />
                    <button type="button" class="btn btn-primary right-space-2 left-space" id="searchBtn" onclick="table_correspon()">查询</button>
                    <shiro:hasPermission name="correspondence:pdfout">
                        <button type="button" class="btn btn-primary right-space-2" id="createBtn_pdf" >生成信函</button>
                    </shiro:hasPermission>
                    <shiro:hasPermission name="correspondence:pdfout">
                        <button type="button" class="btn btn-primary right-space-2" id="createBtn_pdf_batch" >批量生成信函</button>
                    </shiro:hasPermission>
                    <button type="button" class="btn btn-default" id="clearBtn_corr">清除</button>
                </form>
            </div>
        </div>
    </div>
    
    <input type="hidden" name="userName" id="userName" value="${userId }">
    <table id="dataTable" class="display dataTable" cellspacing="0" width="100%" >
        <thead>
            <tr>
                <th>
                    <input type="checkbox" id="corres_checkall" title="Select all" />
                    &nbsp;&nbsp;全选
                </th>
                <th>所属城市</th>
                <th>地址类别</th>
                <th>放款类别</th>
                <th>主贷人</th>
                <th>合同编号</th>
                <th>身份证号</th>
                <th>贷款金额</th>
                <th>应还款日期</th>
                <th>逾期天数</th>
                <th>客户地址</th>
            </tr>
        </thead>
        <tbody id="corresTable_tbody">
           	<tr class="dataTable_show">
		        <td colspan="11">没有检索到数据</td>
			</tr>
        </tbody>
    </table>
    <!--选择信函模板窗口-->
    <div class="modal fade in" id="corresTemplate" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" style="width: 500px;">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true" id="close_createPdf"></button>
                    <h4 class="modal-title">选择信函模板</h4>
                </div>
                <div class="modal-body" style="padding: 40px 0 20px 0;">
                    <form class="form-horizontal" id="collectorSearchForm">
                        <div class="form-group">
                            <label class="col-sm-4 control-label">模板类型</label>
                            <div class="col-sm-5">
                                <select id="docCode" name="docCode">
                                    <c:forEach items="${categoryList }" var="item">
                                        <option value="${item.id}##${item.tmplCode}">${item.tmplName}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer" style="text-align:center;padding-top: 10px;">
                    <!-- 选择生成信函确认按钮 -->
                    <button class="btn btn-primary" type="button" class="btn blue" id="corresponCreatePdfBtn">确定</button>
                    <!-- 批量生成信函确认按钮 -->
                    <button class="btn btn-primary" type="button" class="btn blue" id="corresponCreatePdfBtn_batch">确定</button>
                    <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
                </div>
            </div>
        </div>
    </div>
    <form id="form_downPdf" name="form_downPdf" method="post" accept-charset="UTF-8">
        <input type="hidden" id="contractNo_pdf" name="contractNo" value="" />
        <input type="hidden" id="tmplCode_pdf" name="tmplCode" value="" />
        <input type="hidden" id="tmplid_pdf" name="tmplid" value="" />
        <input type="hidden" id="tmplName_pdf" name="tmplName" value="" />
        <input type="hidden" id="serialize_searchForm" name="parameter" value="" />
    </form>
    <script type="text/javascript">
     //勾选查询的数据生成信函
     $("#createBtn_pdf").on("click",function(){
         $("#docCode").find("option:first").prop("selected",true);
         $("#corresponCreatePdfBtn").show();
         $("#corresponCreatePdfBtn_batch").hide();
         $("#corresTemplate").modal("show");
     });
     //根据查询条件批量生成信函
     $("#createBtn_pdf_batch").on("click",function(){
         MSG.confirm("确认通过选择的条件批量生成信函吗？",function(){
             $("#docCode").find("option:first").prop("selected",true);
             $("#corresponCreatePdfBtn_batch").show();
             $("#corresponCreatePdfBtn").hide();
             $("#corresTemplate").modal("show");
         });
     });
    //初始化查询列表分页数据
    //Table初始化方法
   //滚动条事件
  /* var table_correspon; */
   function table_correspon(){
    $('#dataTable').DataTable({
         "scrollY": '380px',
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
         "sAjaxSource" : "<%=request.getContextPath()%>/rest/correspondence/selectCorrespondencePage",
         "fnServerData" : function(sSource, aoData, fnCallback) {
             //参数拼接
             var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#corres_searchForm").serialize();
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
               {"mData" :  function(row, type, set, meta) {
                    return "<input type='checkbox' class='case' name='case' value="+row.clientName+"###"+NoSpace(row.clientAddr)+"###"+row.contractNo+ "###"+row.addrType+"></input>&nbsp;&nbsp;<span>" + (row.rowNo) + "</span>";
                }},
                {"mData" : "siteName","sDefaultContent" : ""},
                {"mData" : "addrType","sDefaultContent" : ""},
                {"mData" : "paymentTypeName","sDefaultContent" : ""},
                {"mData" : "clientName","sDefaultContent" : ""},
                {"mData" : "contractNo","sDefaultContent" : ""},
                {"mData" : "idCardNo","sDefaultContent" : ""},
                {"mData" : "loanAmount","sDefaultContent" : ""},
                {"mData" : "repaymentDateFmt","sDefaultContent" : "" },
                {"mData" : "overdueDay","sDefaultContent" : ""},
                {"mData" : "clientAddr","sDefaultContent" : ""}
         ],
         "aoColumnDefs":[                               //设定各列宽度   
              {"bSortable":false,"sWidth": "50px","aTargets": [0]},   
              {"sWidth": "50px","aTargets": [1]},   
              {"sWidth": "60px","aTargets": [2]},
              {"sWidth": "60px","aTargets": [3]},   
              {"sWidth": "60px","aTargets": [4]},
              {"sWidth": "100px","aTargets": [5]},   
              {"sWidth": "100px","aTargets": [6]},
              {"sWidth": "80px","aTargets": [7]},
              {"sWidth": "80px","aTargets": [8]},   
              {"sWidth": "50px","aTargets": [9]},
              {"sWidth": "150px","aTargets": [10]}                           
          ]
     });
    

   }
   
    $("#corres_checkall").click(function(){
        if($(this).get(0).checked==true){
            $(".case").prop("checked", true);
        }else{
            $(".case").prop("checked", false);
        }
    });
   //清空
    $("#clearBtn_corr").click(function(){
        $("#corres_searchForm").find('input').val('');
        $("#corres_searchForm select").find("option:first").prop("selected",true);
    });
   //生成信函
   $("#corresponCreatePdfBtn").click(function(){
       var boolean = true;
       var ids = '';  
       $("#corresTable_tbody").find("input[type='checkbox']").each(function(){ 
           if($(this).prop("checked")==true){
               ids += $(this).val() + ',';  
               var addr = $(this).parents('tr').children('td').eq(10).text();//信函地址
               if(addr == "" || addr == null){
                   MSG.show("地址为空，不能生成信函！");
                   $("#close_createPdf").click();
                   boolean = false;
               }
           }
       })  
       ids = ids.substring(0,ids.length-1); 
       if(ids == ""){
    	   MSG.show("请至少选择一条记录！");
           $("#close_createPdf").click();
           boolean = false;
       }
       if(boolean == false){
           return;
       }
       $("#contractNo_pdf").val(ids);
       //获取模板类型
       var temp = $("#docCode").val().split("##");
       $("#tmplid_pdf").val(temp[0]);
       $("#tmplCode_pdf").val(temp[1]);
       var selText = $("#docCode option:selected").text();
       $("#tmplName_pdf").val(selText);
       var url = '<%=request.getContextPath()%>/rest/correspondenceTwo/exportApplyForm';
       $("#form_downPdf").attr("style","display:none");
       $("#form_downPdf").attr("action", url);
       $("#form_downPdf").attr("method", "post");
       $("#form_downPdf").attr("target", "");
       $("#form_downPdf").submit();
       $("#close_createPdf").click();
   });
    //批量生成信函
    $("#corresponCreatePdfBtn_batch").click(function(){
        //获取模板类型
        var temp = $("#docCode").val().split("##");
        $("#tmplid_pdf").val(temp[0]);
        $("#tmplCode_pdf").val(temp[1]);
        var selText = $("#docCode option:selected").text();
        $("#tmplName_pdf").val(selText);
        //信函的查询条件
        $("#serialize_searchForm").val(decodeURIComponent($("#corres_searchForm").serialize(),true));
        var url = '<%=request.getContextPath()%>/rest/correspondenceTwo/exportBatchApplyForm';
        $("#form_downPdf").attr("style","display:none");
        $("#form_downPdf").attr("action", url);
        $("#form_downPdf").attr("method", "post");
        $("#form_downPdf").attr("target", "");
        $("#form_downPdf").submit();
        $("#close_createPdf").click();
    });
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
   //去掉地址文本中的空格
   function NoSpace(obj){
	   if(obj == "undefined" || obj == null){
		    return "";
	   }else{
		    return obj.replace(/\s+/g, "").replace(/</g,"(").replace(/>/g,")"); 
	   }
    }
    </script>
</body>
