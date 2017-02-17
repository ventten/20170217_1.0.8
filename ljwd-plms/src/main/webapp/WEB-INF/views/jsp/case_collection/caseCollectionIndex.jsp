<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<head>
    <title>我的案件</title>
</head>
<style>
.caseCollTd1{
	width: 250px;
}
.caseCollTd1 select{
	width: 156px;
    height: 24px;
}
.caseCollTd1_son,.caseCollTd2_son{
	float: left;
}
.caseCollTd1_son div,.caseCollTd2_son div{
	position: absolute;
	margin-top: 13px;
	z-index: 9;

}
</style>
<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">我的案件</h3>
    </div>
    <div class="panel-body">
        <form id="searchForm">
			<table>
				<tr>
					<td class="caseCollTd1">
			            <label for="queue">所属队列 </label>
			            <select id="queue" name="queue">
			                <option value="">全部</option>
			                <option value="MainQueue">主队列</option>
			                <option value="ProxyQueue">代理队列</option>
			                <option value="NewQueue">新增客户队列</option>
			                <option value="AdvanceQueue">提前移交队列</option>
			            </select>
					</td>
					<td class="caseCollTd1">
			            <label for="controlStatus">控管状态 </label>
			            <select id="controlStatus" name="controlStatus">
			                <option value="">全部</option>
			                <c:forEach items="${controlList}" var="item">
			                    <option value="${item.code}">${item.val}</option>
			                </c:forEach>
			            </select>
					</td>
					<td class="caseCollTd1" colspan="2">
			            <label class="caseCollTd2_son" for="overDaysMin">逾期天数 </label>
			            <div class="caseCollTd2_son">
			            	<input size="16" type="text" id="overDaysMin" name="overDaysMin">
			            </div>
			            <div class="caseCollTd2_son">至 </div>
			            <div class="caseCollTd2_son">
			            	<input size="16" type="text"  id="overDaysMax" name="overDaysMax">
			            </div>
					</td>
					<td class="caseCollTd1">
			            <label for="isFollowed">是否跟进 </label>
			            <select id="isFollowed" name="isFollowed">
			                <option value="">全部</option>
			                <option value="false">未跟进</option>
			                <option value="true">已跟进</option>
			            </select>
					</td>
					<td class="caseCollTd1">
			            <label for="repaymentStatus">还款状态 </label>
			            <select id="repaymentStatus" name="repaymentStatus">
			                <option value="OVERDUE">逾期</option>
			                <option value="">&nbsp;&nbsp;</option>
			            </select>
		            </td>
		        </tr>
		        <tr>
					<td class="caseCollTd1">
			            <label for="cntrctNo">合同编号 </label>
			            <input type="text" id="cntrctNo" name="cntrctNo"/>
					</td>
					<td class="caseCollTd1">
			            <label for="custName">主贷人 </label>
			            <input type="text" id="custName" name="custName"/>
					</td>
					<td class="caseCollTd1">
			            <label class="caseCollTd1_son" for="docno">身份证号 </label>
			            <div class="caseCollTd1_son">
			            	<input type="text" id="docno" name="docno"/>
			            </div>
					</td>
					<td class="caseCollTd1">
			            <input type="checkbox" id="isOfferReplyFail" name="isOfferReplyFail" value="true"/>
			            <label for="isOfferReplyFail">是否当天扣款失败</label>
		            </td>
		            <td>
		            </td>
		        </tr>
			</table>
		            <button type="button" class="btn btn-primary" id="searchBtn">查询</button>&nbsp;
		       		<button type="button" class="btn btn-primary" id="outVisitBtn">申请外访</button>
		            
		            &nbsp;&nbsp;
		            <button type="reset" class="btn btn-default">清除</button>
        </form>
    </div>
</div>
<!-- 外访窗口 -->
<div class="modal fade hideModal" id="outVisitModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">申请外访</h4>
            </div>
            <div class="modal-body" style="padding-bottom: 0px;">

                <form class="form-horizontal" id="outVisitSubmitForm">

                    <div class="form-group">
                            <label class="col-sm-3 control-label">客户类型</label>
                            <div class="col-sm-6">
                                <select class="form-control" name="custType" id= "custType">
                                	<option value="">请选择</option>
                                    <c:forEach items="${outVisitCustType}" var="item">
                                        <option value="${item.key}">${item.value}</option>
                                    </c:forEach>
                                </select>
                            </div>
                    </div>

                     <div class="form-group">
					    <label for="name" class="col-sm-3 control-label">外访原因</label>
					   	<div class="col-sm-6">
					    <textarea class="form-control" rows="3" id="submitReason" name="submitReason"></textarea>
					    </div>
					 </div>

                </form>
            </div>

            <div class="modal-footer" style="text-align:center;padding-top: 0px;">
                <button class="btn btn-primary" type="button" class="btn blue" id="outVisitSubmitBtn">
                   	 确定
                </button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">
                   	 返回
                </button>
            </div>
        </div>
    </div>
</div>
<table id="dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th class="text-center">选择<input type="checkbox" id="checkallCase" title="Select all" /></th>
        <th class="text-center">操作</th>
        <th class="text-center">合同编号</th>
        <th class="text-center">主贷人</th>
        <th class="text-center">证件号码</th>
        <th class="text-center">联系电话</th>
        <th class="text-center">贷款金额</th>
        <th class="text-center">逾期期数</th>
        <th class="text-center">逾期天数</th>
        <th class="text-center">剩余本金/保证金</th>
        <th class="text-center">是否跟进</th>
        <th class="text-center">催收类型</th>
        <th class="text-center">跟进情况</th>
        <th class="text-center">催收代码</th>
        <th class="text-center">控管状态</th>
        <th class="text-center">分配日期</th>
        <th class="text-center">代理催收员</th>
        <th class="text-center">代理截止日期</th>
    </tr>
    </thead>
</table>

<script type="text/javascript" language="javascript">

    var table = P.dataTable($('#dataTable'),
            $("#searchForm"),
            "<%=request.getContextPath()%>/rest/caseCollection/pageCollectionData",
            [
                {"mData" :  function(row, type, set, meta) {
                    return "<input type='checkbox' class='case' name='case' value=" + row.applId + "></input>&nbsp;&nbsp;<span>" + (meta.row + 1) + "</span>";
                }},
                {"mData" : null,"sDefaultContent" : "",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        <shiro:hasPermission name="case_my:detail">
                            $(nTd).html("<a href=<%=request.getContextPath()%>/rest/caseCollection/caseCollectionDetail?applId=" + oData.applId + "&overduePeriod=" + oData.overduePeriod + ' onclick="return H.hrefA(this);">催记</a>&nbsp;&nbsp;');
                        </shiro:hasPermission>
                    }
                },
                {"mData" : "cntrctNo","sDefaultContent" : ""},
                {"mData" : "custName","sDefaultContent" : ""},
                {"mData" : "docno","sDefaultContent" : ""},
                {"mData" : "mobile","sDefaultContent" : ""},
                {"mData" : "loanAmt","sDefaultContent" : ""},
                {"mData" : "overduePeriod","sDefaultContent" : ""},
                {"mData" : "overDays","sDefaultContent" : ""},
                {"mData" : "remainingPrincipal","sDefaultContent" : ""},
                {"mData" : "isFollowed","sDefaultContent" : ""},
                {"mData" : "collectMthdText","sDefaultContent" : ""},
                {"mData" : "statusText","sDefaultContent" : ""},
                {"mData" : "resultText","sDefaultContent" : ""},
                {"mData" : "controlStatusText","sDefaultContent" : ""},
                {"mData" : "assignTime","sDefaultContent" : ""},
                {"mData" : "agentName","sDefaultContent" : ""},
                {"mData" : "allocEndDate","sDefaultContent" : ""}
            ],
            100,$('#checkallCase')
    );

    //查询按钮
    $('#searchBtn').on('click', function (){
        var $form = $('#searchForm');
        //表单校验
        if (!$form.valid()){
            return false;
        }
        table.search($form.serialize()).draw();
    });

    $(document).ready(function() {
        //表单校验
        validate($("#searchForm"));
    });

    //案件全选按钮
    $('#checkallCase').click(function(){
    	if($(this).get(0).checked==true){
    		$(".case").attr("checked", true);
    	}else{
    		$(".case").attr("checked", false);
    	}
    });
    
    //申请外访按钮 
    $('#outVisitBtn').click(function(){
    	var checkedCount = 0;
		$(".case").each(function(i,result){
		    if(this.checked){
		    	checkedCount++;
			}
		}); 
		if(checkedCount==0){
			MSG.alert("请选择需要申请外访的案件 ");
			return false;
		}else{
			$('#outVisitModal').modal('show');
		}
    });
    
   //确定申请外访按钮 
    $('#outVisitSubmitBtn').click(function(){
    	
    	MSG.confirm("确定进行此项操作 ?",function(){
    		var checkArray = new Array();
    		var i=0;
        	$(".case").each(function(){
    		    if(this.checked){
    		    	checkArray[i] = $(this).val();
    		    	i++;
    			}
    		});  
        	var data = $('#outVisitSubmitForm').serialize();
        	 $.ajax({
        		url:"<%=request.getContextPath()%>/rest/outVisit/submitOutVisit?checkedCase="+checkArray+"&date="+new Date().toTimeString(),
    			type:"post",
    			data:data,
    			dataType: "json",
    			success:function(data){
   				 	$('#outVisitModal').modal('hide');
    				MSG.alert(data.message);
    			},
    			error:function(jqXHR,textStatus,errorThrown){
                     MSG.show("获取数据发生异常");
                }
        	});
    	});

    	
    });

    //表单校验
    function validate($validateForm){
        $validateForm.validate({
        	errorPlacement:function(error, element) {
				 $('<br/>').appendTo(element.parent());   
 				error.appendTo(element.parent());
			},
			errorElement: "div",
            rules: {
                overDaysMin: {
                    digits: true
                },
                overDaysMax: {
                    digits: true
                },
                docno:{
                    idCard: true
                }
            }
        });
    }

</script>
