<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>    
<head>
<title>用户数据权限-修改</title>
<jsp:include page="/WEB-INF/views/header.jsp" flush="true"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="assets/plugins/ztree/css/zTreeStyle/zTreeStyle.css" />
<script src="assets/plugins/ztree/js/jquery.ztree.core.min.js"></script>
<script src="assets/plugins/ztree/js/jquery.ztree.excheck.min.js" type="text/javascript"></script>
</head>
<div class="systemManage">
<div class="panel panel-default">
   <div class="panel-heading">
      <h3 class="panel-title">
		用户数据权限-修改
      </h3>
   </div>
   <div class="panel-body">
    <form id="updateForm">
        <label for="userOrgId">所属机构</label>
          <select id="userOrgId" name="userOrgId" disabled>
        	<option value="${user.orgId }">${user.orgName}</option>
          </select>
          
         
        <label for="userName">员工姓名</label>
        <input type="text" id="userName" name="userName" readonly value=${user.empName }>
        
         <label for="userId">系统用户</label>
         <select id="userId" name="userId" disabled>
        	<option value="${user.userId }">${user.userId }</option>   
         </select>
        <br/>        
        <label for="orgIdList">权限机构</label>
         <ul id="treeDemo" class="ztree"></ul>
         <input type="hidden" id="orgList" value="${orgChecked}">
       
        <%--    <c:set var="theStr" value="${orgChecked}"/>  
         <c:forEach items="${orgList_temp}" var="item">
         	 <c:set var="theSub" value="${item.id}"/>   
        	 <input type="checkbox"  name="orgIdList" value="${item.id}" <c:if test="${fn:contains(theStr, theSub)}"> checked </c:if>>${item.orgName}
         </c:forEach>  --%> 
                <input class="btn btn-primary" type="button" id="updateBtn" value="修改"/>
            
    </form>	
	</div>
</div>
</div>
<jsp:include page="/WEB-INF/views/footer.jsp" flush="true"/>
<script type="text/javascript">

var userId = $('#userId').val();
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
            url: "<%=request.getContextPath()%>/rest/userDataRange/getOrgList?userId="+userId, 
            error: function () {//请求失败处理函数  
                alert('请求失败');  
            },  
            success:function(data){ //请求成功后处理函数。    
            	 $.fn.zTree.init($("#treeDemo"), setting, data); 
	             
            }  
        });  
    });  




//修改按钮 
	$('#updateBtn').click(function(){
		var $form = $("#updateForm");
		var userId = $('#userId').val();
		var treeObj=$.fn.zTree.getZTreeObj("treeDemo");
		var nodes=treeObj.getCheckedNodes(true);
		var orgList = new Array();
		for(var i=0;i<nodes.length;i++){
				var id = nodes[i].id;
				orgList.push(id);
		}
		//表单校验
	    if (!$form.valid()){
	        return false;
	    }
	    $.ajax({
	        type : 'POST',
	        dataType : "json",
	        url : "<%=request.getContextPath()%>/rest/userDataRange/updateUserDataRange?orgIdList="+orgList,
	        data : {"userId":userId},
	        success : function(ret) {
	            MSG.show(ret.message);
	        },
	        error:function(){
	            MSG.show("系统异常,稍后重试");
	        }
	    });
	});

	$(document).ready(function() {
	    //新增表单校验
	    validate($("#updateForm"));
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