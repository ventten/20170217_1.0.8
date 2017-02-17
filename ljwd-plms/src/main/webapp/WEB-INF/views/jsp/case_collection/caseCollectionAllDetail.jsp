<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>案件催记</title>
    <jsp:include page="/WEB-INF/views/header.jsp" flush="true"/>
</head>
<style>
.col-sm-6 div{
	position: absolute;
	margin-top: 21px;
	z-index: 9;
}
.table-bordered tr td{
	padding:4px !important;
}
.caseInfo{padding-bottom:15px}
</style>
<body>
	<div class="caseInfo">
    <input type="hidden" value="${applId}" id="applId">                 <!--借款ID-->
    <input type="hidden" value="${overduePeriod}" id="overduePeriod">   <!--逾期期数-->
    <!--表格-开始-->
    <div class="tab-content">
        <div role="tabpanel" class="tab-pane active" id="contract-info">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-xs-12">
                        <table class="table table-bordered">
                            <tr>
                                <td width="8%" class="active text-center">合同编号</td>
                                <td width="12%" class=" text-center" id="cntrctNo">${applDetail.cntrctNo}</td>
                                <td width="8%" class="active text-center">主贷人</td>
                                <td width="12%" class=" text-center" id="custName">${applDetail.custName}</td>
                                <td width="8%" class="active text-center">身份证号</td>
                                <td width="12%" class=" text-center" id="idCardNo">${applDetail.idCardNo}</td>
                                <td width="8%" class="active text-center">贷款产品</td>
                                <td width="12%" class=" text-center">${applDetail.prdName}</td>
                            </tr>
                            <tr>
                            	<td width="8%" class="active text-center">放款渠道</td>
                                <td width="12%" class=" text-center">${applDetail.paymentName}</td>
                                <td width="8%" class="active text-center">贷款金额</td>
                                <td width="12%" class=" text-center">${applDetail.loanAmt}</td>
                                <td width="8%" class="active text-center">业务类型</td>
                                <td width="12%" class=" text-center">${applDetail.bizCategoryText}</td>
                                <td width="8%" class="active text-center">贷款期数</td>
                                <td width="12%" class=" text-center">${applDetail.loanPeriod}</td>
                            </tr>
                            <tr>
                            	<td width="8%" class="active text-center">已还期数</td>
                                <td width="12%" class=" text-center">${applDetail.paidPeriod}</td>
                                <td width="8%" class="active text-center">剩余本金/保证金</td>
                                <td width="12%" class=" text-center">${applDetail.remainingPrincipal}</td>
                                <td width="8%" class="active text-center">首期期款</td>
                                <td width="12%" class=" text-center">${applDetail.firstAmt}</td>
                                <td width="8%" class="active text-center">后每期期款</td>
                                <td width="12%" class=" text-center">${applDetail.secondAmt}</td>
                            </tr>
                            <tr>
                            	<td width="8%" class="active text-center">逾期天数</td>
                                <td width="12%" class=" text-center">${applDetail.overDays}</td>
                                <td width="8%" class="active text-center">累计逾期天数</td>
                                <td width="12%" class=" text-center">${applDetail.overDaysTotal}</td>
                                <td width="8%" class="active text-center">最长逾期天数</td>
                                <td width="12%" class=" text-center">${applDetail.overDaysMax}</td>
                                <td width="8%" class="active text-center">累计破坏承诺次数</td>
                                <td width="12%" class=" text-center">${applDetail.breakCount.breakTotalCount}</td>
                            </tr>
                            <tr>
                            	<td width="8%" class="active text-center">本期破坏承诺次数</td>
                                <td width="12%" class=" text-center">${applDetail.breakCount.breakThisCount}</td>
                                <td width="8%" class="active text-center">扣款银行</td>
                                <td width="12%" class=" text-center">${applDetail.bankNameOne}</td>
                                <td width="8%" class="active text-center">扣款账号</td>
                                <td width="12%" class=" text-center">${applDetail.bankCardNoOne}</td>
                                <td width="8%" class="active text-center">最后扣款时间</td>
                                <td width="12%" class=" text-center">${applDetail.lastLoanDateFmt}</td>
                            </tr>
                            <tr>
                                <td width="8%" class="active text-center">发起扣款金额</td>
                                <td width="12%" class=" text-center">${applDetail.loanMoney}</td>
                                <td width="8%" class="active text-center">实际扣款金额</td>
                                <td width="12%" class=" text-center">${applDetail.loanRealMoney}</td>
                                <td width="8%" class="active text-center">银行反馈</td>
                                <td width="72%" class=" text-center" colspan="7">${applDetail.loanRemark}</td>
                            </tr>
                            <tr>
                                <td width="100%" height="60" colspan="10">
                                    <shiro:hasPermission name="collect_rec:info">
                                        <form id="collectCustInfoForm">
                                            <input type="hidden" name="applId" value="${applDetail.applId}"/>
                                            <input type="hidden" name="periodNum" value="${overduePeriod}">
                                            <span>自定义信息</span>
                                            <textarea id="custInfo" name="custInfo" disabled style="max-width:900px;max-height:100px;">${collectCustInfo.custInfo}</textarea>
                                            <input class="btn btn-primary" type="button" id="editorBtn" value="编辑"/>
                                        </form>
                                    </shiro:hasPermission>
                                </td>
                            </tr>
                            <tr>
                                <td width="100%" height="30" colspan="10">
                                    <div id="myData">
                                        <shiro:hasPermission name="collect_rec:sms">
                                            <input class="btn btn-primary right-space-2" type="button" value="发送短信" onclick="resetSendSMSModalForm();"/>
                                        </shiro:hasPermission>
                                        <shiro:hasPermission name="collect_rec:offer_exempt">
                                            <input class="btn btn-primary right-space-2" type="button"value="申请免扣"  data-toggle="modal" data-target="#offerExemptModal" onclick="P.resetModal('offerExemptForm')"/>
                                        </shiro:hasPermission>
                                        <shiro:hasPermission name="collect_rec:call">
                                            <input class="btn btn-primary right-space-2" type="button"value="呼叫记录" id="surveyCallBtn"/>
                                        </shiro:hasPermission>
                                    </div>
                                </td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--表格-结束-->

    <!--选项卡-开始-->
    <div>
        <!-- Nav tabs -->
        <ul class="nav nav-tabs" role="tablist">
            <li role="presentation" class="active"><a href="#pageCollectionContactor" aria-controls="home" role="tab" data-toggle="tab">通讯信息</a></li>
            <li role="presentation" id="pageCollectionAddressLi"><a href="#pageCollectionAddress" aria-controls="profile" role="tab" data-toggle="tab">地址信息</a></li>
            <li role="presentation" id="pageCollectionUnitLi"><a href="#pageCollectionUnit" aria-controls="profile" role="tab" data-toggle="tab">单位信息</a></li>
            <li role="presentation" id="pageCollectionAnnexLi"><a href="#pageCollectionAnnex" aria-controls="profile" role="tab" data-toggle="tab">附件信息</a></li>
            <li role="presentation" id="pageCollectionApplLi"><a href="#pageCollectionAppl" aria-controls="profile" role="tab" data-toggle="tab">贷款信息</a></li>
            <li role="presentation" id="pageCollectionPolyLi"><a href="#pageCollectionPoly" aria-controls="profile" role="tab" data-toggle="tab">聚信立</a></li>
            <li role="presentation" id="pageCollectionOutVisitLi"><a href="#pageCollectionOutVisit" aria-controls="profile" role="tab" data-toggle="tab">外访记录</a></li>
            <li role="presentation" id="pageCollectionOutLi"><a href="#pageCollectionOut" aria-controls="profile" role="tab" data-toggle="tab">委外记录</a></li>
            <li role="presentation" id="pageCorresinfoLi"><a href="#pageCorresinfo" aria-controls="profile" role="tab" data-toggle="tab" >信函记录</a></li>
            <li role="presentation" id="pageCollectionOtherLi"><a href="#pageCollectionOther" aria-controls="profile" role="tab" data-toggle="tab">其它</a></li>
        </ul>

        <!-- Tab panes -->
        <div class="tab-content">
            <div role="tabpanel" class="tab-pane active" id="pageCollectionContactor">
                <jsp:include page="pageCollectionContactor.jsp"/>
            </div>
            <div role="tabpanel" class="tab-pane" id="pageCollectionAddress">
                <jsp:include page="pageCollectionAddress.jsp"/>
            </div>
            <div role="tabpanel" class="tab-pane" id="pageCollectionUnit">
                <jsp:include page="pageCollectionUnit.jsp"/>
            </div>
            <div role="tabpanel" class="tab-pane" id="pageCollectionAnnex">
                <jsp:include page="pageCollectionAnnex.jsp"/>
            </div>
            <div role="tabpanel" class="tab-pane" id="pageCollectionAppl">
                <jsp:include page="pageCollectionAppl.jsp"/>
            </div>
            <div role="tabpanel" class="tab-pane" id="pageCollectionPoly">
                <jsp:include page="pageCollectionPoly.jsp" flush="true"/>
             </div>
            <div role="tabpanel" class="tab-pane" id="pageCollectionOutVisit">
                <jsp:include page="pageCollectionOutVisit.jsp"/>
            </div>
            <div role="tabpanel" class="tab-pane" id="pageCollectionOut">
                <jsp:include page="pageCollectionOut.jsp" flush="true"/>
            </div>
            <div role="tabpanel" class="tab-pane" id="pageCorresinfo">
                <jsp:include page="pageCorresinfo.jsp"/>
            </div>
            <div role="tabpanel" class="tab-pane" id="pageCollectionOther">
                <jsp:include page="pageCollectionOther.jsp"/>
            </div>
            
        </div>
    </div>
    <!--选项卡-结束-->

    <!--创建催记窗口-->
    <shiro:hasPermission name="collect_rec:insert">
        <jsp:include page="detail_modal/collectionRecordModal.jsp"/>
    </shiro:hasPermission>

    <!--申请免扣窗口-->
    <jsp:include page="detail_modal/offerExemptModal.jsp"/>
    <!--发送短信窗口-->
    <jsp:include page="detail_modal/sendSMSModal.jsp"/>
</div>
</body>
<jsp:include page="/WEB-INF/views/footer.jsp" flush="true"/>
<script type="text/javascript" language="javascript">
	//当切换tab时，强制重新计算列宽
	$('a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
		 var contactorWidth=$('#contactor-dataTable').width();//通讯信息表格表头宽度
		 var recordWidth=$('#record-dataTable-one').width();//通讯信息表格表头宽度
		 var autoWidth_contactor=parseFloat(contactorWidth)+17;
		 var autoWidth_record=parseFloat(recordWidth)+17;
		 //重新计算表格宽度
		 $('#contactor-dataTable-fatherDiv').css('width',autoWidth_contactor+'px');
		 $('#record-dataTable-fatherDiv').css('width',autoWidth_record+'px');
	});

    //编辑自定义信息按钮
    $("#editorBtn").on('click',function(){
        var $editorBtn =  $("#editorBtn");              //按钮控件
        var $custInfo = $("#custInfo");                 //内容控件
        if($editorBtn.val() == '编辑'){
            $custInfo.attr('disabled',false);
            $editorBtn.val('保存');
        }else if($editorBtn.val() == '保存'){
            var info = $.trim($custInfo.val());         //自定义信息内容
            if(!info){
                MSG.show('请输入自定义信息');
                return;
            }
            $.ajax({
                type : 'POST',
                dataType : "json",
                url : "<%=request.getContextPath()%>/rest/caseCollection/saveInfo",
                data : $("#collectCustInfoForm").serialize(),
                success : function(ret) {
                    if(ret.success){
                        $custInfo.attr('disabled',true);
                        $editorBtn.val('编辑');
                    }
                    MSG.show(ret.message);
                },
                error:function(){
                    MSG.show("编辑自定义信息失败,请刷新重试");
                }
            });
        }
    });

    //呼叫记录按钮
    $(function(){
        $('#surveyCallBtn').click(function(){
            var url = "<%=request.getContextPath()%>/rest/surveyCall/surveyCallIndex";
            var contractNo = $.trim($("#cntrctNo").text());
            var data = "contractNo="+contractNo;
            url = url + "?" + data;
            window.open(url);
            /****按钮点击时从localStrage中取值，判断上一个页面*****/
            var getVal=localStorage.getItem("getVal");
            if(getVal=="visitInfo"){
            	//将当前值对应的左侧菜单栏状态存入localStrage
       		 	window.localStorage.setItem("my",getVal);
       		}else if(getVal=="transferAdvance"){
       			//将当前值对应的左侧菜单栏状态存入localStrage
       		 	window.localStorage.setItem("my",getVal);
       		}else if(getVal=="visitInfo_my"){
       			//将当前值对应的左侧菜单栏状态存入localStrage
       		 	window.localStorage.setItem("my",getVal);
       		}else if(getVal=="caseInfoAll"){
       			//将当前值对应的左侧菜单栏状态存入localStrage
       		 	window.localStorage.setItem("my",getVal);
       		}else if(getVal=="visitInfo_delay"){
       			//将当前值对应的左侧菜单栏状态存入localStrage
       		 	window.localStorage.setItem("my",getVal);
       		}else if(getVal=="outsrcInfo"){
       			//将当前值对应的左侧菜单栏状态存入localStrage
       		 	window.localStorage.setItem("my",getVal);
       		}else{
       			var idVal = $(this).attr('id');
                var caseMyStr = idVal + "All";
              	//使用localStorage存值与取值判断
                window.localStorage.setItem("All",caseMyStr);
       		}
        });
    });

    /**
     * 当前用户等于此条数据的创建人,可以删除和修改
     * @param createdBy 新增人
     * @param $deleteBtn 删除按钮
     * */
    function deleteBtnShowOrHide(createdBy,$deleteBtn){
        if(createdBy == $("#currentUser").val()){
            $deleteBtn.show();
            $(".mayDisabled").attr("disabled",false);
        }else{
            //其他人只能修改有效性,不能删除
            $deleteBtn.hide();
            $(".mayDisabled").attr("disabled",true);
        }
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
    
    /************设置页面加载时修改页面左侧菜单栏状态*************/
    $(function(){
   		var Val=$('.caseInfo').attr('class');
   		var getVal=localStorage.getItem("getVal");
   		if(getVal=="transferAdvance"){
   			$('#'+getVal).click();
   			$('#'+getVal+'_case').addClass('choose_active');
   		}else if(getVal=="caseInfo"){
   			$('#'+getVal).click();
   			$('#'+getVal+'_active').addClass('choose_active');
   		}else if(getVal=="visitInfo"){
   			$('#'+getVal).click();
   			$('#'+getVal+'_active').addClass('choose_active');
   		}else if(getVal=="visitInfo_my"){
   			$('#'+'visitInfo').click();
   			$('#'+getVal+'active').addClass('choose_active');
   		}else if(getVal=="outsrcInfo"){
   			$('#'+getVal).click();
   			$('#'+getVal+'_case').addClass('choose_active');
   		}else if(getVal=="caseInfoAll"){
   			$('#'+'caseInfo').click();
   			$('#'+getVal+'_active').addClass('choose_active');
   		}else if(getVal=="visitInfo_delay"){
   			$('#'+'visitInfo').click();
   			$('#'+getVal).addClass('choose_active');
   		}
   		//点击菜单移除选中项class
   		$('.sub-menu li').click(function(){
   			$('.sub-menu li').find('a').removeClass('choose_active');
   		})
    })

</script>
