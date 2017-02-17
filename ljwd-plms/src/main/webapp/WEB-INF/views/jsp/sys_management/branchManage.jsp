<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>    
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分行监管设置</title>
</head>

<div class="plms-content">
	<div class="panel panel-default">
		<div class="panel-heading">
	      <h3 class="panel-title">
	         	分行监管设置
	      </h3>
   		</div>
   		<div class="panel-body">
		 	<form id="searchForm">
		        <label for="userId" class="right-space-1">员工姓名</label>
            	<input type="text" class="collection input-border right-space-2" name="userId" id="userName" />
            	
		       	<label for="orgId" class="right-space-1">所属机构</label>
		        <select id="org" name="orgId" class="collection line-bottom">
		        	<option value="">全部</option>
		            <c:forEach items="${orgList}" var="item">
		                <option value="${item.id}">${item.orgName}</option>
		            </c:forEach>   
		        </select>  
		       <br/>
		       <shiro:hasPermission name="branchManage:select">
		        <input class="btn btn-primary" type="button" id="searchBtn"  value="查询"/>
		        </shiro:hasPermission>
		        &nbsp;
				<shiro:hasPermission name="branchManage:insert">
		        <input class="btn btn-primary" type="button" id="addBtn" value="新增"/>
		        </shiro:hasPermission>
		         &nbsp;
		        <button type="reset" class="btn btn-default" >清除</button>  
		        
		    </form>
		</div>
    </div>

<table id="dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
    <tr>
    	<th class="text-center">序号</th>
        <th class="text-center">所属机构</th>
        <th class="text-center">员工姓名</th>
        <th class="text-center">监管分行</th>
    	<th class="text-center">维护人</th>
        <th class="text-center">维护时间</th>
        <th class="text-center">操作</th>
    </tr>
    </thead>
</table>
<!--添加窗口-->
    <div class="modal fade hideModal" id="branchManage-add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                    <h4 class="modal-title">分行监管设置--新增</h4>
                </div>
                <div class="modal-body">

                    <form class="form-horizontal" id="addForm">
                        <div class="form-group">
                            <label class="col-sm-4 control-label">所属机构</label>
                            <div class="col-sm-6">
                                <select class="form-control" name="orgId" id="orgId">
                                	<option value="">请选择</option>
                                    <c:forEach items="${orgList}" var="item">
                                        <option value="${item.id}">${item.orgName}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
 						<div class="form-group">
                            <label class="col-sm-4 control-label">员工姓名</label>
                            <div class="col-sm-6">
                                <select class="form-control" name="userId" id="userId">
                                	  <option value="" class='autoOption'>请选择</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-4 control-label">监管分行</label>
                            <div class="col-sm-6">
                                <select multiple="multiple" placeholder="请选择监管分行" name="siteCode" id="site_code" onchange="console.log($(this).children(':selected').length)" class="testSelAll">
                                	<c:forEach items="${siteList}" var="item">
                                        <option value="${item.siteCode}">${item.siteName}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-4 control-label"></label>
                            <div class="col-sm-6">
                                <span class="redStar redStarMessages"></span>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="button" class="btn blue" id="branchManage-addBtn">
                        新增
                    </button>
                    <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">
                        返回
                    </button>
                </div>
            </div>
        </div>
    </div>
 <!--修改窗口-->
    <div class="modal fade hideModal" id="branchManage-update" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                    <h4 class="modal-title">分行监管设置--修改</h4>
                </div>
                <div class="modal-body">

                    <form class="form-horizontal" id="updateForm">
                        <div class="form-group">
                            <label class="col-sm-4 control-label">所属机构</label>
                           	<div class="col-sm-6">
                            <select class="form-control" name="orgId" id="edit_orgId" disabled>
                            <c:forEach items="${orgList}" var="item">
				                <option value="${item.id}" >${item.orgName}</option>
				            </c:forEach>                           
				            </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-4 control-label">员工姓名</label>
                           	<div class="col-sm-6">
                            <select class="form-control" name="userId" id="edit_userId" disabled>
                            <c:forEach items="${userList}" var="item">
				                <option value="${item.userId}" >${item.userName}</option>
				            </c:forEach>                           
				            </select>
                            </div>
                        </div>
						<div class="form-group">
                            <label class="col-sm-4 control-label">监管分行</label>
                            <div class="col-sm-6" id="edit_selectedBox">
                                <select multiple="multiple" placeholder="请选择修改监管分行" name="siteCode" id="edit_site_code" onchange="console.log($(this).children(':selected').length)" class="testSelAll">
                                	<c:forEach items="${siteList}" var="item">
                                        <option value="${item.siteCode}">${item.siteName}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                       
                        <div class="form-group">
                            <label class="col-sm-4 control-label"></label>
                            <div class="col-sm-6">
                                <span class="redStar redStarMessages"></span>
                            </div>
                        </div>                        
                    </form>

                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="button" class="btn blue" id="branchManage-updateBtn">
                        修改
                    </button>
                    <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">
                        返回
                    </button>
                </div>
            </div>
        </div>
    </div>
</div>


<script type="text/javascript">

	var branchManage_table;
	
	function branchManageTable_init(){
		branchManage_table =$('#dataTable').DataTable({
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
	      "sAjaxSource" : "<%=request.getContextPath()%>/rest/plmsBranchManage/pageBranchManageData",
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
				{"mData" : "rowNo","sDefaultContent" : ""},
				{"mData" : "orgName","sDefaultContent" : ""},
	            {"mData" : "userName","sDefaultContent" : ""},
	            {"mData" : "branchSiteNames","sDefaultContent" : "","className":"editContent"},
	            {"mData" : "updatedBy","sDefaultContent" : ""},
	            {"mData" : "updateTime","sDefaultContent" : ""},
	            {"mData" : null,
	                "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
	                		$(nTd).html("<shiro:hasPermission name='branchManage:update'><a href='javascript:void(0);' class='changeSelect'" +           
		        	                "onclick='update_branchManage(\"" + oData.orgId + "\",\"" + oData.userId + "\",\"" + oData.branchSiteCodes + "\",\"" + oData.branchSiteNames + "\")'>修改&nbsp;&nbsp;</a></shiro:hasPermission>"+
		        	                "<shiro:hasPermission name='branchManage:delete'><a href='javascript:void(0);' " +           
		        	                "onclick='delete_BranchManage(\"" + oData.userId + "\")'>删除</a></shiro:hasPermission>");
	                }
	                    
	            }
	      ],
	      "aoColumnDefs":[
                          {"bSortable":false,"aTargets": [0]}                          
          ]
	  });
	 
	}

$('#searchBtn').on( 'click', function () {
	 var $form = $('#searchForm');
     var $this = $(this);
     if($this.hasClass("hasInit")){
    	 branchManage_table.search($form.serialize()).draw();
     }else{
         $this.addClass("hasInit");
         branchManageTable_init();
     }
	
});

//弹出查找条件框
$('#collectorSearchBtn').click(function(){
	$('#collectorSearchModal').modal('show');
});

$('#search_orgId').change(function(){
	getUserEmpOrg($(this).val());
});

function getUserEmpOrg(orgId){
		 
	$.ajax({
	            type : 'POST',
	            dataType : "json",
	            url : "<%=request.getContextPath()%>/rest/userDataRange/selectUserByOrgId",
		        data : {"orgId":orgId},
	            success : function(data) {
	                if(data){
	                    var $collectorTBody = $("#collectorTBody");
	                    var bodyHtml = "";
	                    for(var i = 0; i < data.length; i++){
	                        bodyHtml += "<tr><td><input type='radio' name='checkCollector' value='"+ data[i].userName +"'></td><td>" + data[i].userName + "</td><td>" + data[i].orgName + "</td></tr>";
	                    }
	                    $collectorTBody.html(bodyHtml);
	                }
	            },
	            error:function(){
	                MSG.show("获取催收员机构信息失败");
	            }
	        });
}

//确定催收员按钮
$('#collectorAddBtn').on('click', function (){
    var collectorName = $('input[name="checkCollector"]').filter(':checked').val(); 
    if(!collectorName){
        MSG.show('请选择一个催收员');
        return;
    }
    $('#userName_').val(collectorName);
    $("#collectorSearchModal").modal("hide");
});

//清除催收员按钮
$('#collectorClearBtn').on('click', function (){
    $('#userName_').val('');
    $("#collectorSearchModal").modal("hide");
});

//机构--用户联动
$('#orgId').change(function(){
	var orgId = $('#orgId').val();
	var userId = $('#userId');
	var options = $('#userId option:not(:first)');
	options.remove();
	if(orgId.length>0){
		$.ajax({
	        type : 'POST',
	        dataType : "json",
	        url : "<%=request.getContextPath()%>/rest/userDataRange/selectUserByOrgId",
	        data : {"orgId":orgId},
	        success : function(data) {
	        	$.each(data,function(index,result){
	        		var option = "<option value='"+result['userId']+"'>"+result['userName']+"</option>"; 
	        		userId.append(option); 
	        	});            
	        },
	        error:function(){
	            MSG.show("系统异常,稍后重试");
	        }
	    });
	}
});
//弹出新增框
$('#addBtn').click(function(){
	P.resetModal('addForm');
	$('#branchManage-add').modal('show');
});

//实际新增操作
$('#branchManage-addBtn').click(function(){
	 //表单校验
    if (!$('#branchManage-add #addForm').valid()){
        return false;
    }
    var form = $(this).parents(".modal-dialog").find("#addForm");
    var content = $(this).parents(".plms-content");
    P.addPost("<%=request.getContextPath()%>/rest/plmsBranchManage/addBranch?"+new Date().toTimeString(),form,content,branchManage_table);
	
	
});



//显示修改窗口
function update_branchManage(orgId,userId,branchSiteCodes,branchSiteNames){
	P.resetModal('updateForm');
	$('#edit_orgId').val(orgId);
	$('#edit_userId').val(userId);
	var ids = branchSiteCodes.split(",");
	console.info(branchSiteNames);
	console.info(branchSiteCodes);
	console.log(ids);
	$('#branchManage-update').modal('show');
	var checkBoxs = $('#edit_site_code');
	var checkList = $('#edit_site_code option');
	var selectedBoxs = $('#edit_selectedBox').find('.options li');
	var childrens = checkBoxs.children();
	var selectedChildrens = selectedBoxs.children();
	$('#dataTable').on("click",".changeSelect",function(){
		var editContent=$(this).parents('tr').find('.editContent').html();
		$('#edit_selectedBox').find('.CaptionCont').attr("title",editContent);
		$('#edit_selectedBox').find('.CaptionCont span').html(editContent);
		$("#edit_selectedBox").find(".options li").each(function(){
			$(this).removeClass('selected');
		}); 
		$("#edit_site_code option").each(function(){
		    $(this).attr("selected",false);
		    if(ids.length>0){
                for(var j=0;j<ids.length;j++){
                    if(ids[j]==$(this).val()){
                        $(this).attr("selected",true);
                        var htmlT = $(this).text();
                        $("#edit_selectedBox").find(".options li").each(function(){
                            if($(this).text() == htmlT){
                            	$(this).addClass('selected');
                            }
                        });
                    }
                }
            }
		});
	})
	$('.MultiControls .btnOk').on('click',function(){
		var selected = $('#edit_selectedBox').find('.options .selected');
		var optionList = $('#edit_selectedBox').find('.options li');
		if(selected.length>0){
			var str="";
			for(var i=0; i<selected.length; i++){
				str+=selected[i].innerText+",";
			}
			str = str.substr(0, str.length-1);
		}
		$('#edit_selectedBox').find('.CaptionCont').attr("title",str);
		$('#edit_selectedBox').find('.CaptionCont span').html(str);
		var strArr=str.split(',');
		console.log(strArr);
		if(strArr.length>0){
			for(var i=0;i<childrens.length;i++){
				var optionVal=childrens[i].value;
				var optionText=childrens[i].text;
				childrens[i].removeAttribute("selected");
				for(var k=0;k<strArr.length;k++){
					if(strArr[k]==optionText){
						$(childrens[i]).attr("selected",true);	
					}
				}
			}
		}
	})
}

//实际更新操作 
$('#branchManage-updateBtn').click(function(){
	
	var orgId = $('#edit_orgId').val();
	var userId = $('#edit_userId').val();
	  //表单校验
    if (!$('#branchManage-update #updateForm').valid()){
        return false;
    }
    var form = $(this).parents(".modal-dialog").find("#updateForm");
    var content = $(this).parents(".plms-content");
    P.updatePost("<%=request.getContextPath()%>/rest/plmsBranchManage/updateBranchManage?orgId="+orgId+"&userId="+userId+"&date="+new Date().toTimeString(),form,content,branchManage_table);
});

 //删除操作
function delete_BranchManage(userId){
	MSG.confirm("确定删除?",function(){
		$.ajax({
			type: "post",
			url: "<%=request.getContextPath()%>/rest/plmsBranchManage/deleteBranchManage?"+new Date().toTimeString(),
			data:{"userId":userId},
			dataType: "json",
			success: function(msg){
				MSG.show(msg.message);
				branchManage_table.search($("#searchForm").serialize()).draw();
			}
		});
	});
} 

$(document).ready(function() {
	//branchManageTable_init();
	//新增表单校验
    branchManage_validate($("#branchManage-add #addForm"));
});

//表单校验
function branchManage_validate($validateForm){
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
	        	orgId:	{
	        		required: true
	        	},
	            userId: {
	                required: true
	            } ,
	            siteCode:{
	            	required: true
	            }
	        },
	        messages: {
	        	orgId: {
	                required: "请选择所属区间 "
	            } ,
	            userId: {
	                required: "请选择用户 "
	            } ,
	            siteCode:{
	            	required: "请选择监管的分行"
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


//下拉复选框
$(document).ready(function () {
	window.testSelAll = $('.testSelAll').SumoSelect({okCancelInMulti:true, selectAll:true });
})

</script>