<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!--催收员窗口-->
<div class="modal fade hideModal" id="collectorSearchModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">查找催收员</h4>
            </div>
            <div class="modal-body" style="padding-bottom: 0px;">

                <form class="form-horizontal" id="collectorSearchForm">

                    <div class="form-group">
                        <label class="col-sm-4 control-label">所属机构</label>
                        <div class="col-sm-5">
                            <select class="form-control" name="orgId" id="orgId">
                                <option value=''>全部</option>
                                <c:forEach items="${orgMap}" var="item">
                                    <option value="${item.key}">${item.value}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                    	<div class="searchList">
	                    	<table>
	                    		 <thead>
	                    		 	<tr>
			                            <th width="60px">选择</th>
			                            <th width="133px">员工姓名</th>
			                            <th width="395px">所属机构</th>
		                            </tr>
	                            </thead>
	                    	</table>
                    	</div>
                    	<span class="searchListTable">
	                        <table class="table table-border dataTable">
	                            <tbody id="collectorTBody">
	                            <c:forEach items="${userEmpOrgList}" var="item">
	                                <tr>
	                                    <td><input type='radio' name='checkCollector' value='${item.userName}'/></td>
	                                    <td>${item.userName}</span></td>
	                                    <td>${item.orgName}</span></td>
	                                </tr>
	                            </c:forEach>
	                            </tbody>
	                        </table>
                        </span>
                    </div>
                </form>
            </div>

            <div class="modal-footer">
                <button class="btn btn-primary" type="button" class="btn blue" id="collectorAddBtn">
                    确定
                </button>
                <button class="btn btn-primary" type="button" class="btn blue" id="collectorClearBtn">
                    清除
                </button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">
                    返回
                </button>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" language="javascript">

    //查找催收员按钮
    //    $('#collectorSearchBtn').on('click', function (){
    //        getUserEmpOrg(1);
    //        $("#collectorSearchModal").modal("show");
    //    });

    //所属机构change事件
    $("#orgId").change(function(){
        getUserEmpOrg(2,$(this).val());
    });

    //获取机构和催收员
    function getUserEmpOrg(type,orgId){
        $.ajax({
            type : 'POST',
            dataType : "json",
            url : "<%=request.getContextPath()%>/rest/org/getUserEmpOrg",
            data : {type:type,orgId:orgId},
            success : function(data) {
                var userEmpOrgList = data.userEmpOrgList;
                var orgMap = data.orgMap;
                if(userEmpOrgList){
                    var $collectorTBody = $("#collectorTBody");
                    var bodyHtml = "";
                    for(var i = 0; i < userEmpOrgList.length; i++){
                        bodyHtml += "<tr><td><input type='radio' name='checkCollector' value='"+ userEmpOrgList[i].userName +"'></td><td>" + userEmpOrgList[i].userName + "</td><td>" + userEmpOrgList[i].orgName + "</td></tr>";
                    }
                    $collectorTBody.html(bodyHtml);
                }

//                if(type == 1 && orgMap){
//                    var $orgId = $("#orgId");
//                    var orgHtml = "<option value=''>全部</option>";
//                    for (var key in orgMap) {
//                        if(orgMap.hasOwnProperty(key)) {
//                            orgHtml += "<option value='" + key + "'>" + orgMap[key] + "</option>"
//                        }
//                    }
//                    $orgId.html(orgHtml);
//                }
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
        $("#collectorName").val(collectorName);
        $("#collectorSearchModal").modal("hide");
    });

    //清除催收员按钮
    $('#collectorClearBtn').on('click', function (){
        $("#collectorName").val('');
        $("#collectorSearchModal").modal("hide");
    });

</script>
