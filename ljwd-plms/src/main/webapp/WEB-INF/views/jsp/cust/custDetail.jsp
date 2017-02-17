<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>

<head>
    <title>客户信息详情</title>
    <jsp:include page="/WEB-INF/views/header.jsp" flush="true" />
</head>

<div class="panel panel-default">
	<div class="panel-heading">
		<h3 class="panel-title">客户信息详情</h3>
	</div>
	<div class="panel-body">
		<form class="searchForm">
			<label>主贷人 </label>
			<input type="text" value="${custName}" readonly />
			<label>身份证号 </label>
			<input type="text" value="${docno}" readonly />
		</form>
	</div>
</div>

<div class="customerInfo">
    <!-- Nav tabs -->
    <ul class="nav nav-tabs" role="tablist">
        <shiro:hasPermission name="appl:select">
            <li role="presentation" class="active" id="pageApplLi">
                <a href="#pageAppl" aria-controls="messages" role="tab" data-toggle="tab">贷款信息</a>
            </li>
        </shiro:hasPermission>
        <shiro:hasPermission name="contactor:select">
            <li role="presentation" id="pageContactorLi">
                <a href="#pageContactor" aria-controls="home" role="tab" data-toggle="tab">通讯信息</a>
            </li>
        </shiro:hasPermission>
        <shiro:hasPermission name="address:select">
            <li role="presentation" id="pageAddressLi">
                <a href="#pageAddress" aria-controls="profile" role="tab" data-toggle="tab">地址信息</a>
            </li>
        </shiro:hasPermission>
        <shiro:hasPermission name="annex:select">
            <li role="presentation" id="pageAnnexLi">
                <a href="#pageAnnex" aria-controls="messages" role="tab" data-toggle="tab">附件信息</a>
            </li>
        </shiro:hasPermission>
        <shiro:hasPermission name="unit:select">
            <li role="presentation" id="pageUnitLi">
                <a href="#pageUnit" aria-controls="messages" role="tab" data-toggle="tab">单位信息</a>
            </li>
        </shiro:hasPermission>
        <shiro:hasPermission name="assets:select">
            <li role="presentation" id="ziChanLi">
                <a href="#ziChan" aria-controls="messages" role="tab" data-toggle="tab">资产信息</a>
            </li>
        </shiro:hasPermission>
        <shiro:hasPermission name="car:select">
            <li role="presentation" id="pageCarLi">
                <a href="#pageCar" aria-controls="messages" role="tab" data-toggle="tab">车辆信息</a>
            </li>
        </shiro:hasPermission>
        <shiro:hasPermission name="policy:select">
            <li role="presentation" id="pagePolicyLi">
                <a href="#pagePolicy" aria-controls="messages" role="tab" data-toggle="tab">保单信息</a>
            </li>
        </shiro:hasPermission>
        <shiro:hasPermission name="account:select">
            <li role="presentation" id="pageAccountLi">
                <a href="#pageAccount" aria-controls="messages" role="tab" data-toggle="tab">流水账号</a>
            </li>
        </shiro:hasPermission>
    </ul>
    <!-- Tab panes -->
    <div class="tab-content">
        <div role="tabpanel" class="tab-pane active" id="pageAppl">
            <jsp:include page="pageAppl.jsp" />
        </div>
        <div role="tabpanel" class="tab-pane" id="pageContactor">
            <jsp:include page="pageContactor.jsp" />
        </div>
        <div role="tabpanel" class="tab-pane" id="pageAddress">
            <jsp:include page="pageAddress.jsp" />
        </div>
        <div role="tabpanel" class="tab-pane" id="pageAnnex">
            <jsp:include page="pageAnnex.jsp" />
        </div>
        <div role="tabpanel" class="tab-pane" id="pageUnit">
            <jsp:include page="pageUnit.jsp" />
        </div>
        <div role="tabpanel" class="tab-pane" id="ziChan">
            <div>
                <ul class="nav nav-tabs" role="tablist">
                    <li role="presentation" class="active">
                        <a href="#pageHouse" aria-controls="home" role="tab" data-toggle="tab">房产信息</a>
                    </li>
                    <li role="presentation" id="pageAssetsLi">
                        <a href="#pageAssets" aria-controls="profile" role="tab" data-toggle="tab">其他资产</a>
                    </li>
                </ul>
                <div class="tab-content">
                    <div role="tabpanel" class="tab-pane active" id="pageHouse">
                        <jsp:include page="pageHouse.jsp" />
                    </div>
                    <div role="tabpanel" class="tab-pane" id="pageAssets">
                        <jsp:include page="pageAssets.jsp" />
                    </div>
                </div>
            </div>
        </div>
        <div role="tabpanel" class="tab-pane" id="pageCar">
            <jsp:include page="pageCar.jsp" />
        </div>
        <div role="tabpanel" class="tab-pane" id="pagePolicy">
            <jsp:include page="pagePolicy.jsp" />
        </div>
        <div role="tabpanel" class="tab-pane" id="pageAccount">
            <jsp:include page="pageAccount.jsp" />
        </div>
    </div>
</div>

<jsp:include page="/WEB-INF/views/footer.jsp" flush="true" />

<script type="text/javascript" language="javascript">
    //所有页面的下拉框只读参数
    var f=$("select").selectedIndex;
    //时间控件
   /*  $(".datetimepicker").datetimepicker({
        format:'yyyy-mm-dd',    //时间格式
        language:'zh-CN',       //语言
        weekStart:1,            //一周从哪一天开始,0-星期日,6-星期六
        todayBtn:1,             //是否显示当前日期
        todayHighlight:1,       //是否高亮当前日期
        autoclose:1,
        forceParse:0,           //当选择器关闭的时候，是否强制解析输入框中的值。也就是说，当用户在输入框中输入了不正确的日期，选择器将会尽量解析输入的值，并将解析后的正确值按照给定的格式format设置到输入框中。
        minView:'month',
        altFormat: "DD, d MM, yy"
    });
 */
    /* $('#datetimepicker').datetimepicker('remove'); */

    /**
     * 当前用户等于此条数据的创建人,可以删除和修改
     * @param createdBy 新增人
     * @param $deleteBtn 删除按钮
     * */
    function deleteBtnShowOrHide(createdBy,$deleteBtn){
        if(createdBy == $("#currentUser").val()){
            $deleteBtn.show();
            $(".mayDisabled").prop("disabled",false); //modify by zhengjizhao date:20161121
        }else{
            //其他人只能修改有效性,不能删除
            $deleteBtn.hide();
            $(".mayDisabled").prop("disabled",true); //modify by zhengjizhao date:20161121
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
  		var customerVal=$('.customerInfo').attr('class');
  		//console.log(customerVal);
  		$('#'+customerVal).click();
  		$('#'+customerVal+'_active').addClass('choose_active');
  		$('.sub-menu li').click(function(){
   			$('.sub-menu li').find('a').removeClass('choose_active');
   		})
 	})
 	
 	//当切换tab时，强制重新计算列宽
	$('a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
	     $.fn.dataTable.tables( {visible: true, api: true} ).columns.adjust();
	});
</script>
