<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>    
<head>
<title>用户数据权限-新增</title>
<jsp:include page="/WEB-INF/views/header.jsp" flush="true"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="assets/plugins/ztree/css/zTreeStyle/zTreeStyle.css" />
<script src="assets/plugins/ztree/js/jquery.ztree.core.min.js"></script>
<script src="assets/plugins/ztree/js/jquery.ztree.excheck.min.js" type="text/javascript"></script>
</head>
<body>
<div class="systemManage">
<div class="panel panel-default">
   <div class="panel-heading">
      <h3 class="panel-title">
		用户数据权限-新增
      </h3>
   </div>
   <div class="panel-body">
    <form id="addForm">
        <label for="userOrgId">所属机构</label>
          <select id="userOrgId" name="userOrgId" >
        	<option value="">请选择</option>
            <c:forEach items="${orgList}" var="item">
                <option value="${item.id}">${item.orgName}</option>
            </c:forEach>   
          </select>
          
         
        <label for="userName">员工姓名</label>
         <select id="userName" name="userName" style="width:180px;">
        	<option value="" class='autoOption'>请选择</option>
          </select>
        
         <label for="userId">系统用户</label>
           <input type="text" id="userId" name="userId"/>
         
        <br/>
        <label for="orgIdList">权限机构</label>
        <%--  <c:forEach items="${orgList_temp}" var="item">
        	 <input type="checkbox" name="orgIdList" value="${item.id}">${item.orgName}
         </c:forEach>  
                 --%>
               <ul id="treeDemo" class="ztree"></ul>
       <input class="btn btn-primary" type="button" id="addBtn" value="新增"/>
            
    </form>	
	</div>
</div>
</div>
</body>
<jsp:include page="/WEB-INF/views/footer.jsp" flush="true"/>
<script type="text/javascript">
var setting = {
        view: {
         
            dblClickExpand: false,
            showLine: false
        }, 
        data: {
            simpleData: {
                enable: true 
            }
        },
        check: {
    		enable: true,
    		chkStyle: "checkbox",
    		chkboxType: { "Y": "", "N": "" }
    	}
    };
    
    $(function(){  
        $.ajax({  
            async : false,  
            cache:false,  
            type: "get",  
            dataType : "json",  
            url: "<%=request.getContextPath()%>/rest/userDataRange/getOrgList", 
            error: function () {//请求失败处理函数  
                alert('请求失败');  
            },  
            success:function(data){ //请求成功后处理函数。    
            	 $.fn.zTree.init($("#treeDemo"), setting, data);    
            }  
        });  
    });  

$(document).ready(function() {
    //新增表单校验
    validate($("#addForm"));
});
//下拉框联动 (所属机构--系统用户)
$('#userOrgId').change(function(){
	var userOrgId = $('#userOrgId').val();
	var userName = $('#userName');
	var options = $('#userName option:not(:first)');
	$('#userId').val("");
	options.remove();
	if(userOrgId.length>0){
		$.ajax({
	        type : 'POST',
	        dataType : "json",
	        url : "<%=request.getContextPath()%>/rest/userDataRange/selectUserByOrgId",
	        data : {"orgId":userOrgId},
	        success : function(data) {
	        	$.each(data,function(index,result){
	        		var option = "<option value='"+result['userId']+"'>"+result['userName']+"</option>"; 
	        		userName.append(option); 
	        	});            
	        },
	        error:function(){
	            MSG.show("系统异常,稍后重试");
	        }
	    });
	}
	
});

$('#userName').change(function(){
	var userName = $('#userName').val();
	$('#userId').val(userName);
	<%-- if(userId.length>0){
		$.ajax({
	        type : 'POST',
	        dataType : "json",
	        url : "<%=request.getContextPath()%>/rest/userDataRange/selectUserByOrgId",
	        data : {"user":userId},
	        success : function(data) {
	        	$('#userName').val(data[0]['empName']);
	        },
	        error:function(){
	            MSG.show("系统异常,稍后重试");
	        }
	    });
	} --%>
	
	
});


//添加按钮点击事件
$("#addBtn").on("click",function(){
    var treeObj=$.fn.zTree.getZTreeObj("treeDemo");
	var nodes=treeObj.getCheckedNodes(true);
	var orgList = new Array();
	for(var i=0;i<nodes.length;i++){
		var id = nodes[i].id;
		orgList.push(id);
	}
	var $form = $("#addForm");
	var data  = $form.serialize();

	//表单校验
    if (!$form.valid()){
        return false;
    }
    $.ajax({
        type : 'POST',
        dataType : "json",
        url : "<%=request.getContextPath()%>/rest/userDataRange/addUserDataRange?orgIdList="+orgList,
        data : data,
        success : function(ret) {
            MSG.show(ret.message);
        },
        error:function(){
            MSG.show("系统异常,稍后重试");
        }
    });
});



//表单校验
function validate($validateForm){
    $validateForm.validate({
        rules: {
        	userId: {
                required: true
            },
            orgList: {
                required: true
            }
        },
        messages: {
        	userId: {
                required: "系统用户不能为空"
            },
            orgList: {
                required: "请选择权限机构"
            }
        }
    });
}

/************设置页面加载时修改页面左侧菜单栏状态*************/
$(function(){
		var Val=$('.systemManage').attr('class');
		$('#'+Val).click();
		$('#'+Val+'_update').addClass('choose_active');
		//点击菜单移除选中项class
		$('.sub-menu li').click(function(){
			$('.sub-menu li').find('a').removeClass('choose_active');
		})
}) 
</script>