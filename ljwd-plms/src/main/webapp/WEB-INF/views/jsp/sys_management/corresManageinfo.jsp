<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信函模板管理</title>
<style type="text/css">
#corrManageSearchForm select {
	width: 190px;
}
.dataTables_scrollBody tbody tr td{
    padding: 4px 10px !important;
}
</style>
</head>
<body>
<div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">信函模板管理</h3>
        </div>
        <div class="panel-body">
            <div class="aas">
                <form class="searchForm" id="corres_searchForm_nama">
                    <label for="contractNo">模板编码</label>
                    <input type="text" id="documentCode" name="documentCode" />
                    <label for="loanCardId" class="line-bottom">模板名称 </label>
                    <input type="text" id="documentName" name="documentName"/>
                    <br/>
                    <shiro:hasPermission name="casemanagement:select">
                        <button type="button" class="btn btn-primary right-space-2 left-space-2" id="searchBtn" onclick="selectTableData()">查询</button>
                    </shiro:hasPermission>
                    <shiro:hasPermission name="casemanagement:alloc">
                        <button type="button" class="btn btn-primary right-space-2" id="createBtn_pdf" onclick="openAddWin()">新建模板</button>
                    </shiro:hasPermission>
                    <button type="button" class="btn btn-default" id="clearBtn_mana">清除</button>
                </form>
            </div>
        </div>
    </div>
    
    <input type="hidden" name="userName" id="userName" value="${userId }">
    <table id="dataTable_mana" class="display dataTable" cellspacing="0" width="100%">
        <thead>
            <tr>
                <th>模板编码</th>
                <th>模板名称</th>
                <th>数据源</th>
                <th>业务模式</th>
                <th>签约方式</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
    <!--新建信函模板窗口-->
    <div class="modal fade in" id="corresTemplate_mana" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" style="width: 500px;">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true" id="close_createMane"></button>
                    <h4 class="modal-title" id="modal-title_mana">新建信函模板</h4>
                </div>
                <div class="modal-body" style="padding: 40px 0 20px 0;">
					<form class="form-horizontal" enctype="multipart/form-data" method="post" id="uploadForm_manage">
					   <!-- 模板信息ID -->
					   <input type="hidden" id="manaId" name="id" value=""/>
						<div class="form-group">
							<label class="col-sm-4 control-label"><span class="redStar">* </span>模板编码</label>
							<div class="col-sm-5" id="documentCode_add_div">
							</div>
						</div>
						<div class="form-group" >
							<label class="col-sm-4 control-label"><span class="redStar">* </span>模板名称</label>
							<div class="col-sm-5" id="documentName_add_div">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">数据源</label>
							<div class="col-sm-5">
								<input class="form-control" type="text" id="dataSource" name="dataSource" value="信函" readonly="readonly" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">业务模式</label>
							<div class="col-sm-5">
								<select id="businessModel" name="businessModel">
									<option value="0">等本等息</option>
									<option value="1">趸缴</option>
									<option value="2">平缴</option>
									<option value="3">先息后本</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">签约方式</label>
							<div class="col-sm-5">
								<select id="contractWay" name="contractWay">
									<option value="0">线上</option>
									<option value="1">线下</option>
								</select>
							</div>
						</div>
						<div class="form-group classFile">
							<label class="col-sm-4 control-label"><span class="redStar">* </span>选择附件</label>
							<div class="col-sm-5" id="filePath_div">
							</div>
							<input type="hidden" name="filePath" id="tofilePath" value=""/>
							<a href="javascript:void(0)" class="input">
								添加文件
								<input type="file" id="file" name="filePathtemp" onchange="valueto(this)">
							</a>
						</div>
					</form>
					<div id="img">
                </div>
                <div class="modal-footer" style="text-align:center;padding-top: 10px;">
                    <button class="btn btn-primary" type="button" class="btn blue" id="submitBtn" onclick="saveFormData()">确定</button>
                    <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
                </div>
            </div>
        </div>
    </div>
<script type="text/javascript">
//表单校验
function house_validate($validateForm) {
    $validateForm
            .validate({
                unhighlight : function(element, errorClass, validClass) { //验证通过
                    $(element).tooltip("destroy").removeClass(errorClass);
                },
                errorPlacement : function(label, element) {
                    //让验证提示显示在验证框下面 注：有些地方如果动态添加这个属性不成功就手动添加data-placement="bottom"属性
                    $(element).attr("data-placement", "bottom");
                    $(element).tooltip("destroy"); /*必需*/
                    $(element).attr("title", $(label).text()).tooltip(
                            "show");
                },
                rules : {
                	documentCode : {
                        required : true
                    },
                    documentName : {
                        required : true
                    }
                },
                messages : {
                	documentCode : {
                        required : "请输入模板编码"
                    },
                    documentName : {
                        required : "请输入模板名称"
                    }
                }
            });
}
$(document).ready(function(){
	house_validate($("#uploadForm_manage"));
	selectTableData();
});
//打开新窗口
function openAddWin(){
	//打开新增窗口的时候改掉窗口名和更新方法
    $("#modal-title_mana").text("新增信函模板");
    $("#submitBtn").attr("onclick","saveFormData()");
	//动态生成需要验证的标签，防止新增后再点维护，验证标签不能去掉
	$("#documentCode_add_div").empty();
	$("#documentName_add_div").empty();
	$("#filePath_div").empty();
	$("#documentCode_add_div").append("<input class=\"form-control\" type=\"text\" id=\"documentCode_add\" name=\"documentCode\" value=\"\" data-placement=\"bottom\"/>");
	$("#documentName_add_div").append("<input class=\"form-control\" type=\"text\" id=\"documentName_add\" name=\"documentName\"  value=\"\" data-placement=\"bottom\"/>");
	$("#filePath_div").append("<input class=\"form-control\" type=\"text\" id=\"filePath\" name=\"validateFile\" readonly=\"readonly\" />");
	clearAddWin();
	$("#corresTemplate_mana").modal("show");
}
//把file的文件名显示在input中
function valueto(obj){
    var filepath = obj.value;
    var paths = filepath.split("\\");
    var docName = paths[paths.length-1].substring(paths[paths.length-1].length-3);
    if(docName == "pdf" || docName == "PDF"){
	    doUpload(paths[paths.length-1]);
    }else{
    	MSG.alert("只能上传PDF文件！");
    	return;
    	
    }
}
//上传文件aiax的方法
function doUpload(pdfName) {  
    var formData = new FormData($("#uploadForm_manage")[0]);  
    $.ajax({  
         url: '<%=request.getContextPath()%>/rest/corresManage/uploadDocument',  
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
    });  
}  
//下载文件
function down(path_d){
	var form=$("<form>");//定义一个form表单
	form.attr("style","display:none");
	form.attr("target","_black");
	form.attr("method","post");
	form.attr("action","<%=request.getContextPath()%>/rest/corresManage/download");
	
	var input1=$("<input>");
	input1.attr("type","hidden");
	input1.attr("name","exportPath");
	input1.attr("value",path_d);
	$("body").append(form);//将表单放置在web中
	form.append(input1);
	form.submit();//表单提交
}
//保存数据
function saveFormData(){
	//表单校验
    if (!$("#uploadForm_manage").valid()){
        return false;
    }
	if($("#filePath").val() == ""){
		MSG.alert("请先上传模板文件");
		return false;
	}
	$.ajax({
		url: "<%=request.getContextPath()%>/rest/corresManage/saveCorresPdfData",
		type: "post",
		dataType: "json",
		data:  $("#uploadForm_manage").serialize(),
		success: function(data){
			if(data.success == true){
				MSG.alert(data.message);
				$("#close_createMane").click();
				selectTableData();
			}else{
				MSG.alert(data.message);
			}
		}
	});
}
//查询模板table数据
function selectTableData(){
	$('#dataTable_mana').DataTable({
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
      "sAjaxSource" : "<%=request.getContextPath()%>/rest/corresManage/selectCorresManaData",
      "fnServerData" : function(sSource, aoData, fnCallback) {
          //参数拼接
          var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#corres_searchForm_nama").serialize();
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
			/* {"mData" :  function(row, type, set, meta) {
			    return "<a href='#' onclick='selectInfo("+row.id+")' >"+row.documentCode+"</a>"
			}}, */
			{"mData" : "documentCode","sDefaultContent" : "",
			    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
			    	$(nTd).html("<a href='#' onclick='selectInfo("+oData.id+")' >"+oData.documentCode+"</a>");
                }
			},
			{"mData" : "documentName","sDefaultContent" : ""},
			{"mData" : "dataSource","sDefaultContent" : ""},
			{"mData" : "businessModel","sDefaultContent" : "",
				"fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                    if(oData.businessModel == 0){
                        $(nTd).html("等本等息");
                    }else if(oData.businessModel == 1){
                        $(nTd).html("趸缴");
                    }else if(oData.businessModel == 2){
                        $(nTd).html("平缴");
                    }else if(oData.businessModel == 3){
                        $(nTd).html("先息后本");
                    }else{
                        $(nTd).html("");
                    }
                }	
			},
			{"mData" : "contractWay","sDefaultContent" : "",
                "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                    if(oData.contractWay == 0){
                        $(nTd).html("线上");
                    }else if(oData.contractWay == 1){
                        $(nTd).html("线下");
                    }
                }   
            },
			{"mData" : function(row,type,set,meta){
				return "<a href='#' onclick=\"deleteCorres('"+row.id+"##"+row.filePath+"')\">删除</a>&nbsp;&nbsp;<a href='#' onclick=\"down('"+row.filePath+"')\">下载</a>&nbsp;&nbsp;<a href='#' onclick='selectInfo("+row.id+")'>维护</a>";
			}}
      ],
      "aoColumnDefs":[
                      {"bSortable":false,"aTargets": [5]}                          
      ]
  });
 
}
//删除数据
function deleteCorres(temp){
	var temps = temp.split("##");
	MSG.confirm("确认要删除此模板吗？",function(){
		$.ajax({
	        url: "<%=request.getContextPath()%>/rest/corresManage/deleteCorresPdf",
	        type: "post",
	        dataType: "json",
	        data:  {
	        	"id" : temps[0],
	        	"path" : temps[1]
	        },
	        success: function(data){
	        	if(data.success == true){
	        		selectTableData();
	        		MSG.alert(data.message);
	        	}else{
	        		MSG.alert(data.message);
	        	}
	        	
	        }
	    });
	});
}
//清空查询form
$("#clearBtn_mana").click(function(){
    $("#corres_searchForm_nama").find(':input').not(':button, :submit, :reset').val('')
    .removeAttr('checked').removeAttr('selected');
});
//清空新建窗口数据
function clearAddWin(){
	$("#documentCode_add").val("");
	$("#documentName_add").val("");
	$("#filePath").val("");
	$("#tofilePath").val("");
	$("#file").val("");
	$("#businessModel").find("option:first").prop("selected",true);  
	$("#contractWay").find("option:first").prop("selected",true);  
}
//打开维护窗口
function selectInfo(id){
	//动态生成需要验证的标签，防止新增后再点维护，验证标签不能去掉
	$("#documentCode_add_div").empty();
    $("#documentName_add_div").empty();
    $("#filePath_div").empty();
    $("#documentCode_add_div").append("<input class=\"form-control\" type=\"text\" id=\"documentCode_add\" name=\"documentCode\" value=\"\" data-placement=\"bottom\"/>");
    $("#documentName_add_div").append("<input class=\"form-control\" type=\"text\" id=\"documentName_add\" name=\"documentName\"  value=\"\" data-placement=\"bottom\"/>");
    $("#filePath_div").append("<input class=\"form-control\" type=\"text\" id=\"filePath\" name=\"validateFile\" readonly=\"readonly\" />");
    clearAddWin();
	$.ajax({
		url: "<%=request.getContextPath()%>/rest/corresManage/selectPdfInfo",
        type: "post",
        dataType: "json",
        data:  {
            "id" : id
        },
        success: function(data){
        	//代开维护窗口的时候改掉窗口名和更新方法
        	$("#modal-title_mana").text("维护信函模板");
        	$("#submitBtn").attr("onclick","updateInfo()");
        	$("#manaId").val(data.data.id);
        	$("#documentCode_add").val(data.data.documentCode);
        	$("#documentName_add").val(data.data.documentName);
        	$("#dataSource").val(data.data.dataSource);
        	$("#businessModel").get(0).selectedIndex=0;
            $("#businessModel option").each(function(i,n){
            	 if($(n).val()==data.data.businessModel)
                {
                    $(n).attr("selected","selected");
                }
            });
            $("#contractWay").find("option[value='"+data.data.contractWay+"']").attr("selected","selected");
            $("#tofilePath").val(data.data.filePath);
            var paths = data.data.filePath.split("/");
            var fileName = paths[paths.length-1];
            $("#filePath").val(fileName);
            $("#corresTemplate_mana").modal("show");
        }
	});
}
/**
 * 提交更新数据
 */
function updateInfo(){
    //表单校验
    if (!$("#uploadForm_manage").valid()){
        return false;
    }
	$.ajax({
		url: "<%=request.getContextPath()%>/rest/corresManage/upDatePdfInfo",
        type: "post",
        dataType: "json",
        data: $("#uploadForm_manage").serialize() ,
        success: function(data){
        	if(data.success == true){
                MSG.alert(data.message);
                $("#close_createMane").click();
                selectTableData();
            }else{
                MSG.alert(data.message);
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
</body>