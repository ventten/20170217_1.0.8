<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<div class="modal fade hideModal" id="outVisitAnnexModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">附件管理</h4>
            </div>
            <!--  <div id="hidden" align="center" style="display:'none'">
            	<form id="searchForm">
            		<input type="hidden" id="outVisitPlanId_annex" name="outVisitPlanId">
            		<input type="hidden" name="srcCode" value="OUTVISIT">
                	<input type="hidden" name = "applId" id="applId_annex">
            	</form>
            </div> -->
            <div class="modal-body" style="padding-bottom: 0px;">
                <form class="form-horizontal" id="addOutVisitPlanAnnexForm" enctype="multipart/form-data" method="post">
                	<input type="hidden" id="clCustId_annex" name="clCustId">
                	<input type="hidden" id="outVisitPlanId_annex" name="outVisitPlanId">
            		<input type="hidden" name="srcCode" value="OUTVISIT">
                	<input type="hidden" name = "applId" id="applId_annex">
                	
                    <div class="form-group">
                        <label class="col-sm-3 control-label">外访计划编号</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control"name="planCode" id="planCode_annex" readonly>
                            </div>                    
                    </div>

                     <div class="form-group">
					    <label class="col-sm-3 control-label"><span class="redStar">* </span>文件名</label>
					   	<div class="col-sm-6">
					   		 <input type="text" class="form-control"name="fileName" id="fileName" >
					    </div>
					 </div>
					 
					  <div class="form-group classFile">
					    <label class="col-sm-3 control-label"><span class="redStar">* </span>附件</label>
					    <div class="col-sm-5" id="filePath_div">
					    	<input class="form-control" type="text" id="filePath" name="validateFile" readonly="readonly">
						</div>
						<input type="hidden" name="filePath" id="tofilePath" value=""/>
				   		<a href="javascript:void(0)" class="input" style="margin-left:-20px;">
				   			添加文件
				   			<input type="file" name="image" onchange="valueto(this)">
				   		</a>
					 </div>
					 <div class="form-group">
                        <label class="col-sm-3 control-label">备注</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control"name="remark" id="remark" >
                            </div>                    
                    </div>
                     <div class="form-group">
                            <label class="col-sm-3 control-label"></label>
                            <div class="col-sm-6">
                                <span class="redStar redStarMessages" id="annexMessage"></span>
                            </div>
                     </div>	 
					 <div class="form-group">
					    <label class="col-sm-3 control-label"></label>
						<div class="col-sm-6">
					    <button class="btn btn-primary right-space" type="button" class="btn blue" id="outVisitPlanAnnexBtn">
                      		  上传
                    	</button>
                    	<button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">
                       		取消
                    	</button>
                    	</div>
					 </div>
				</form>
					已上传附件	<br/>
					<table id="outVisitPlanAnnex-dataTable" class="display dataTable" cellspacing="0" width="100%">
			        <thead>
			        <tr>
			            <th class="text-center">序号</th>
			        	<th class="text-center">计划编号</th>
			            <th class="text-center">文件名</th>
			            <th class="text-center">上传日期</th>
        			    <th class="text-center">备注</th>
        			    <th class="text-center">操作</th>
			        </tr>
			        </thead>
					</table>
			</div>
		</div>
		
    </div>
    
</div>

<script type="text/javascript">
//分页Table
var annextable;

 

//Table初始化方法
function annexInit(){
	annextable = $('#outVisitPlanAnnex-dataTable').DataTable({
       
        "sScrollXInner": "100%",
        "bScrollCollapse": true,

        "sPaginationType": "full_numbers",      //设置分页控件的模式
        "bLengthChange": false,                 //改变每页显示数据数量
        "bPaginate": true,                      //是否翻页功能
        "bFilter": false,                       //是否过滤功能
        "bInfo": true,            			    //是否页脚信息
        "bSort": false,					        //是否排序功能

        "bAutoWidth": false,                    //是否自动宽度
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
            //,"sProcessing": "<img src='assets/img/loading.gif' />"
        },
        "bProcessing": false,        //加载数据时显示正在加载信息
        "bServerSide": true,        //指定从服务器端获取数据
        "sAjaxSource" : "<%=request.getContextPath()%>/rest/outVisitPlan/searchMyOutVisitPlanAnnex",
        "fnServerData" : function(sSource, aoData, fnCallback) {
            //参数拼接
            var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#addOutVisitPlanAnnexForm").serialize();
            $.ajax({
                "type" : 'POST',
                "dataType" : "json",
                "url" : sSource,
                "data" : data,
                "success" : function(resp) {
                    fnCallback(resp);
                    $('#outVisitAnnexModal').modal('show');
                },
                "error":function(jqXHR,textStatus,errorThrown){
                    MSG.show("获取数据发生异常");
                }
            });
        },
        //dataTable显示
        "aoColumns" : [
            {"mData" :  function(row, type, set, meta) {
                return "<span>" + (row.rowNo) + "</span>";
            }},
            {"mData" : "planCode","sDefaultContent" : ""},
            {"mData" : "fileName","sDefaultContent" : ""},
            {"mData" : "updateTime","sDefaultContent" : ""},
            {"mData" : "remark","sDefaultContent" : ""},
            {"mData" : "id",
                "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                 $(nTd).html("<a href='javascript:void(0);' onclick='downloadFun(\"" + oData.id + "\")'>下载</a>");
                }
            }
        ]
    });
}

 //上传按钮
$('#outVisitPlanAnnexBtn').click(function(){
	 var fileName = $('#fileName').val();
	 var filePath = $('#filePath').val();
	 if(fileName.length==0){
		 $("#annexMessage").text("文件名不能为空 ");
		 return false;
	 }else if(filePath.length==0){
		 $("#annexMessage").text("文件不能为空");
		 return false;
	 }
	
	  var $annexAddBtn = $("#outVisitPlanAnnexBtn");
      $annexAddBtn.attr("disabled",true);
      var $form = $('#addOutVisitPlanAnnexForm');
      <%-- var options = {
              url : '<%=request.getContextPath()%>/rest/outVisitPlan/addOutVisitPlanAnnex',
              dataType:  'json',
              type : 'POST',
              success : function(text, status) {
                  $form.resetForm();
                  MSG.show(ret.message);
                  $("#annexMessage").text("");

              },
              error : function(request) {
                  alert("Connection error");
              }
          };
          $form.ajaxSubmit(options);
 --%>  $form.ajaxSubmit({
          type:"POST",
          dataType : "json",
          url:"<%=request.getContextPath()%>/rest/outVisitPlan/addOutVisitPlanAnnex",
          success : function(ret){
              if(ret.success){
                  $("#outVisitAnnexModal").modal("hide");
                  $form.resetForm();
                  MSG.show(ret.message);
                  $("#annexMessage").text("");
              }else{
                  $("#annexMessage").text(ret.message);
              }
              $annexAddBtn.attr("disabled",false);
          },
          error:function(errorData){
              MSG.show("上传失败");
              $annexAddBtn.attr("disabled",false);
          }
      }); 
}); 

//下载
function downloadFun(id) {
    //定义一个form表单
    var $form=$("<form>");
    $form.attr("style","display:none");
    $form.attr("target","_black");
    $form.attr("method","post");
    $form.attr("action","<%=request.getContextPath()%>/rest/outVisitPlan/download");

    var $id=$("<input>");
    $id.attr("type","hidden");
    $id.attr("name","id");
    $id.attr("value",id);
    $form.append($id);

    //将表单放置在web中
    $("body").append($form);

    $form.submit();
}

//把file的文件名显示在input中
function valueto(obj){
    var filepath = obj.value;
    var paths = filepath.split("\\");
    var docName = paths[paths.length-1].substring(paths[paths.length-1].length-4).toLowerCase();
    if(docName == ".doc" || docName == "docx"|| docName == "jpeg"|| docName == ".jpg"|| docName == ".png"|| docName == ".bmp"|| docName == ".gif"|| docName == "tiff"|| docName == ".raw"){
    	//debugger;
	   doUpload(paths[paths.length-1]);
    }else{
    	MSG.alert("只能上传图片和word文件！");
    	return;
    }
}
//上传文件aiax的方法
function doUpload(pdfName) {  
	//debugger;
    var formData = new FormData($("#addOutVisitPlanAnnexForm")[0]);  
   $("#filePath").val(pdfName);
  <%--  $.ajax({  
         url: '<%=request.getContextPath()%>/rest/outVisitPlan/addOutVisitPlanAnnex',  
         type: 'POST',  
         data: formData,  
         async: false,  
         cache: false,  
         contentType: false,  
         processData: false,  
         success: function (returndata) { 
        	 if(returndata.success == true){
        		 MSG.alert(returndata.message);
        		 $("#tofilePath").val(returndata.data);
        		 $("#filePath").val(pdfName);
        	 }else{
        		 MSG.alert(returndata.message); 
        	 }
              
         },  
         error: function (returndata) { 
        	 MSG.alert("系统错误！");  
         }  
    }); --%>
}
</script>
