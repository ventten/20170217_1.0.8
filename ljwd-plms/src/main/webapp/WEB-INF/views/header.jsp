<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8"/>
    <title>贷后管理系统</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta name="renderer" content="webkit|ie-comp|ie-stand" />  
    <meta content="" name="description" />
    <meta content="" name="author" />
    
    <!-- BEGIN GLOBAL MANDATORY STYLES -->
    <link href="assets/plugins/font-awesome/css/font-awesome.min.css?version=${jsOrCssFileVersion}" rel="stylesheet" type="text/css" />
    <link href="assets/plugins/bootstrap/css/bootstrap.min.css?version=${jsOrCssFileVersion}" rel="stylesheet" type="text/css" />
    <!-- <link href="assets/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css" /> -->
    <!-- END GLOBAL MANDATORY STYLES -->

    <!-- BEGIN THEME STYLES -->
    <link href="assets/css/style-metronic.css?version=${jsOrCssFileVersion}" rel="stylesheet" type="text/css" />
    <!-- checkbox样式 -->
    <link href="assets/css/checkbox_style.css?version=${jsOrCssFileVersion}" rel="stylesheet" type="text/css" />
    <%-- 公共样式 --%>
    <link href="assets/css/shade.css?version=${jsOrCssFileVersion}" rel="stylesheet" type="text/css" />

    <link href="assets/css/style.css?version=${jsOrCssFileVersion}" rel="stylesheet" type="text/css" />
    <link href="assets/css/style-responsive.css?version=${jsOrCssFileVersion}" rel="stylesheet" type="text/css" />
    <link href="assets/css/plugins.css?version=${jsOrCssFileVersion}" rel="stylesheet" type="text/css" />
    <link href="assets/css/pages/tasks.css?version=${jsOrCssFileVersion}" rel="stylesheet" type="text/css" />
    <link href="assets/css/themes/default.css?version=${jsOrCssFileVersion}" rel="stylesheet" type="text/css" id="style_color" />
    <link href="assets/css/custom.css?version=${jsOrCssFileVersion}" rel="stylesheet" type="text/css" />
    <link href="app/css/app.css?version=${jsOrCssFileVersion}" rel="stylesheet" type="text/css" />
    <!-- END THEME STYLES -->

    <link href="app/img/favicon.ico?version=${jsOrCssFileVersion}" rel="shortcut icon"/>
    <!--时间控件-->
    <link href="assets/plugins/bootstrap-datetimepicker/css/datetimepicker.css?version=${jsOrCssFileVersion}" rel="stylesheet" type="text/css" />
    <script src="assets/plugins/jquery-1.10.2.min.js?version=${jsOrCssFileVersion}" type="text/javascript"></script>
    <script src="assets/plugins/jquery-migrate-1.2.1.min.js?version=${jsOrCssFileVersion}" type="text/javascript"></script>
    <script src="assets/plugins/jquery-ui/jquery-ui-1.10.3.custom.min.js?version=${jsOrCssFileVersion}" type="text/javascript"></script>
    <script src="assets/plugins/bootstrap/js/bootstrap.min.js?version=${jsOrCssFileVersion}" type="text/javascript"></script>
    <script src="assets/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js?version=${jsOrCssFileVersion}" type="text/javascript"></script>
    <script src="assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js?version=${jsOrCssFileVersion}" type="text/javascript"></script>
    <script src="assets/plugins/jquery.blockui.min.js?version=${jsOrCssFileVersion}" type="text/javascript"></script>
    <script src="assets/plugins/jquery.cokie.min.js?version=${jsOrCssFileVersion}" type="text/javascript"></script>
    <!-- <script src="assets/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script> -->

    <!--表单验证-->
    <script src="assets/plugins/jquery-validation/dist/jquery.validate.min.js?version=${jsOrCssFileVersion}" type="text/javascript"></script>
    <script src="assets/plugins/jquery-validation/dist/additional-methods.min.js?version=${jsOrCssFileVersion}" type="text/javascript"></script>

    <!--表单验证中文提示-->
    <script src="assets/plugins/jquery-validation/localization/messages_zh.js?version=${jsOrCssFileVersion}" type="text/javascript"></script>

    <!--ajax提交文件表单-->
    <script src="assets/plugins/jquery-validation/lib/jquery.form.js?version=${jsOrCssFileVersion}" type="text/javascript"></script>
    <script src="assets/plugins/select2/select2.min.js?version=${jsOrCssFileVersion}" type="text/javascript"></script>
    <script src="assets/scripts/app.js?version=${jsOrCssFileVersion}" type="text/javascript"></script>

    <!--layer弹窗插件-->
    <script src="assets/plugins/layer-2.4/layer.js?version=${jsOrCssFileVersion}" type="text/javascript"></script>
    <script src="assets/scripts/msgUtils.js?version=${jsOrCssFileVersion}" type="text/javascript"></script>

    <!--首页js脚本-->
    <script src="app/js/index.js?version=${jsOrCssFileVersion}" type="text/javascript"></script>

    <!--表单提交和修改-->
    <script src="app/js/page.js?version=${jsOrCssFileVersion}" type="text/javascript"></script>
    <!--时间格式化-->
    <script src="app/js/date.js?version=${jsOrCssFileVersion}" type="text/javascript"></script>

    <!--时间控件-->
    <script src="<%=request.getContextPath()%>/assets/plugins/My97DatePicker/WdatePicker.js?version=${jsOrCssFileVersion}" language="javascript" type="text/javascript"></script>
    <script src="<%=request.getContextPath()%>/app/js/datePicker.js?version=${jsOrCssFileVersion}" type="text/javascript"></script>
    <!-- <script src="assets/plugins/bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js" type="text/javascript"></script>
    <script src="assets/plugins/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8" type="text/javascript"></script> -->

    <!--分页插件 dataTables,版本 1.10.12-->
    <script src="assets/plugins/datatables/jquery.dataTables.min.js?version=${jsOrCssFileVersion}"></script>
    <link href="assets/plugins/datatables/jquery.dataTables.min.css?version=${jsOrCssFileVersion}" rel="stylesheet"/>
    
	<!-- 下拉复选框插件  -->
    <script src="assets/plugins/jquery.sumoselect.min.js?version=${jsOrCssFileVersion}"></script>
    <link href="assets/css/sumoselect.css?version=${jsOrCssFileVersion}" rel="stylesheet"/>
</head>
<!-- END HEAD -->

<!-- BEGIN BODY -->
<body class="page-header-fixed">
	<!-- BEGIN HEADER -->
	<div class="header navbar navbar-inverse navbar-fixed-top">
		<!-- BEGIN TOP NAVIGATION BAR -->
		<div class="header-inner">
			<!-- BEGIN LOGO -->
			<a class="pull-left logo" href="javascript:;">
				<img src="assets/img/logo-small.png" alt="logo" class="img-responsive" />
			</a>
			<!-- END LOGO -->
			<!-- BEGIN RESPONSIVE MENU TOGGLER -->
			<a href="javascript:;" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
				<img src="assets/img/menu-toggler.png" alt="" />
			</a>
			<!-- END RESPONSIVE MENU TOGGLER -->
			<!-- BEGIN TOP NAVIGATION MENU -->
			<ul class="nav navbar-nav pull-right">
				<li class="dropdown user">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
						<input type="hidden" id="currentUser" value="${session.name}">
						<span class="username">欢迎您，${session.userName} </span>
						<i class="fa fa-angle-down"></i>
					</a>
					<ul class="dropdown-menu">
						<li>
							<a id="logout_id" style="cursor: pointer;">
								<i class="fa fa-key"></i>
								退出
							</a>
						</li>
					</ul>
				</li>
				<!-- END USER LOGIN DROPDOWN -->
			</ul>
			<!-- END TOP NAVIGATION MENU -->
		</div>
		<!-- END TOP NAVIGATION BAR -->
	</div>
	<!-- END HEADER -->

	<div class="clearfix"></div>

	<!-- BEGIN CONTAINER -->
	<div class="page-container">
		<!-- 左侧菜单导航栏 -->
		<div class="page-sidebar-wrapper">
			<div class="page-sidebar navbar-collapse collapse">
				<!-- BEGIN SIDEBAR MENU -->
				<ul class="page-sidebar-menu" id="page-sidebar-menu">
					<li class="sidebar-toggler-wrapper">
                        <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
                       	<div class="sidebar-toggler"></div>
                        <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
                    </li>
					<li class="start">
						<a href="rest/page/dashboard" >
							<i class="glyphicon glyphicon-home"></i>
							<span class="title"> 首页 </span>
							<span class="selected"> </span>
						</a>
					</li>
					<shiro:hasPermission name="cust:select">
						<li class="">
							<a href="javascript:;" id="customerInfo">
								<i class="glyphicon glyphicon-user"></i>
								<span class="title"> 客户信息 </span>
								<span class="arrow "> </span>
							</a>
							<ul class="sub-menu">
								<shiro:hasPermission name="cust:select">
									<li>
										<a href="rest/cust/custIndex" id="customerInfo_active">客户信息管理</a>
									</li>
								</shiro:hasPermission>
								<li>
                                    <a href="rest/cust/custSelect" id="customerInfo_select">客户查询</a>
                                </li>
							</ul>
						</li>
					</shiro:hasPermission>
					<shiro:hasPermission name="casemanagement:select,casemanagement:branchSelect,protectCase:select,transferAdvanceCase:select">
                        <li class="">
                            <a href="javascript:;" id="transferAdvance">
                                <i class="glyphicon glyphicon-book"></i>
                                <span class="title"> 案件管理 </span>
                                <span class="arrow "> </span>
                            </a>
                            <ul class="sub-menu">
                                <shiro:hasPermission name="casemanagement:select,casemanagement:branchSelect">
                                    <li>
                                        <a href="rest/caseManagement/view" id="transferAdvance_allot">案件分配</a>
                                    </li>
                                </shiro:hasPermission>
                                <shiro:hasPermission name="protectCase:select">
                                    <li>
                                        <a href="rest/protectCase/view">保护案件</a>
                                    </li>
                                </shiro:hasPermission>
                                <shiro:hasPermission name="transferAdvanceCase:select">
                                    <li>
                                        <a href="rest/transferAdvance/view" id="transferAdvance_case">提前移交</a>
                                    </li>
                                </shiro:hasPermission>
                            </ul>
                        </li>
                    </shiro:hasPermission>
                    <shiro:hasPermission name="case_my:select,case_all:select">
                        <li class="">
                            <a href="javascript:;" id="caseInfo">
                                <i class="glyphicon glyphicon-folder-open"></i>
                                <span class="title"> 案件催收 </span>
                                <span class="arrow "> </span>
                            </a>
                            <ul class="sub-menu">
                                <shiro:hasPermission name="case_my:select">
                                    <li>
                                        <a href="rest/caseCollection/caseCollectionMy" id="caseInfo_active">我的案件</a>
                                    </li>
                                </shiro:hasPermission>
                                <shiro:hasPermission name="case_all:select">
                                    <li>
                                        <a href="rest/caseCollection/caseCollectionAll" id="caseInfoAll_active">全部案件</a>
                                    </li>
                                </shiro:hasPermission>
                                <shiro:hasPermission name="offer_exempt:select">
                                    <li>
                                        <a href="rest/caseCollection/offerExemptIndex">免扣管理</a>
                                    </li>
                                </shiro:hasPermission>
                                <shiro:hasPermission name="repay_select:select">
	                                <li>
	                                    <a href="rest/caseCollection/repaymentSearch">还款查询</a>
	                                </li>
                                </shiro:hasPermission>
                            </ul>
                        </li>
                    </shiro:hasPermission>
                     <shiro:hasPermission name="outVisitAudit:select,outVisitAssign:select,myOutVisit:select,allOutVisit:select,allOutVisit:selectAll,outVisitPlan:select,outVisitPlan:selectAll,outVisitDelay:select,outVisitRoute:select,outVisitRoute:selectAll">
                   <li>
                        <a href="javascript:;" id="visitInfo">
                            <i class="glyphicon glyphicon-globe"></i>
                            <span class="title"> 外访管理 </span>
                            <span class="arrow"></span>
                        </a>
                        <ul class="sub-menu">
                           <shiro:hasPermission name="outVisitAudit:select">
								<li>
									<a href="rest/outVisitAudit/view">外访审核</a>
								</li>
                            </shiro:hasPermission>
                            <shiro:hasPermission name="outVisitAssign:select">
								<li>
									<a href="rest/outVisitAssign/view">外访分配</a>
								</li>
                            </shiro:hasPermission>
                            <shiro:hasPermission name="myOutVisit:select">
								<li>
									<a href="rest/myOutVisit/view" id="visitInfo_myactive">我的外访</a>
								</li>
                            </shiro:hasPermission>
                            <shiro:hasPermission name="allOutVisit:select,allOutVisit:selectAll">
								<li>
									<a href="rest/allOutVisit/view" id="visitInfo_active">全部外访</a>
								</li>
                            </shiro:hasPermission>
                            <shiro:hasPermission name="outVisitPlan:select,outVisitPlan:selectAll">
								<li>
									<a href="rest/allOutVisitPlan/view" id="visitInfo_plan">外访计划</a>
								</li>
                            </shiro:hasPermission>                           
                            <shiro:hasPermission name="outVisitDelay:select">
								<li>
									<a href="rest/outVisitDelay/view" id="visitInfo_delay">外访延期</a>
								</li>
                            </shiro:hasPermission>
                             <shiro:hasPermission name="outVisitRoute:select,outVisitRoute:selectAll">
								 <li>
									<a href="rest/outVisitRoute/view" id="visitInfo_route">外访路线</a>
								 </li>
                            </shiro:hasPermission>
                        </ul>
                    </li>
                    </shiro:hasPermission>
                    <shiro:hasPermission name="out_com:select,out_collect:select,out_src:select">
                        <li>
                            <a href="javascript:;" id="outsrcInfo">
                                <i class="glyphicon glyphicon-bookmark"></i>
                                <span class="title"> 委外管理 </span>
                                <span class="arrow"></span>
                            </a>
                            <ul class="sub-menu">
                                <shiro:hasPermission name="out_src:select">
                                    <li>
                                        <a href="rest/outsrcAppl/outsrcIndex" id="outsrcInfo_case">委外案件</a>
                                    </li>
                                </shiro:hasPermission>
                                <shiro:hasPermission name="out_collect:select">
                                    <li>
                                        <a href="rest/outsrcCollect/outsrcCollectIndex">委外催记</a>
                                    </li>
                                </shiro:hasPermission>
                                <shiro:hasPermission name="out_com:select">
                                    <li>
                                        <a href="rest/outsrcCom/outsrcComIndex">委外机构</a>
                                    </li>
                                </shiro:hasPermission>
                            </ul>
                        </li>
                    </shiro:hasPermission>
					<shiro:hasPermission name="workorderpool:select,circuRule:select,assignRule:select,protectRule:select">
						<li class="">
							<a href="javascript:;">
								<i class="glyphicon glyphicon-list-alt"></i>
								<span class="title"> 工单池 </span>
								<span class="arrow "> </span>
							</a>
							<ul class="sub-menu">
								<li>
									<a href="rest/workorderPool/view">工单池管理</a>
								</li>
							</ul>
						</li>
					</shiro:hasPermission>
					
                    <shiro:hasPermission name="correspondence:select,correspondenceall:select">
                        <li>
                            <a href="javascript:;">
                                <i class="glyphicon glyphicon-envelope"></i>
                                <span class="title"> 信函管理</span>
                                <span class="arrow"></span>
                            </a>
                            <ul class="sub-menu">
                                <shiro:hasPermission name="correspondence:select">
                                    <li>
                                        <a href="rest/correspondence/showCorresponIndexJsp">信函生成</a>
                                    </li>
                                </shiro:hasPermission>
                                <shiro:hasPermission name="correspondenceall:select">
                                    <li>
                                        <a href="rest/correspondence/showCorresponListJsp">全部信函</a>
                                    </li>
                                </shiro:hasPermission>
                            </ul>
                        </li>
                    </shiro:hasPermission>
					
					<shiro:hasPermission name="user:select,role:select,userDataRange:select,monthAllocUpper:select,orgScope:select,collector:select,out_rate:select,outVisitUser:select,branchManage:select">
						<li class="">
							<a href="javascript:;" id="systemManage">
								<i class="glyphicon glyphicon-cog"></i>
								<span class="title"> 系统管理 </span>
								<span class="arrow "></span>
							</a>
							<ul class="sub-menu">
								<shiro:hasPermission name="user:select">
									<li>
										<a href="rest/user/pageUser" id="systemManage_allotRole">用户管理</a>
									</li>
								</shiro:hasPermission>
								<shiro:hasPermission name="role:select">
									<li>
										<a href="rest/role/pageRole" id="systemManage_addRole">角色管理</a>
									</li>
								</shiro:hasPermission>
                                <shiro:hasPermission name="corresmanage:select">
                                    <li>
                                        <a href="rest/corresManage/openCorresManegeJsp">信函模板</a>
                                    </li>
                                </shiro:hasPermission>
								<shiro:hasPermission name="userDataRange:select">
									<li>
										<a href="rest/userDataRange/view" id="systemManage_update">用户数据权限管理</a>
									</li>
								</shiro:hasPermission>
								<shiro:hasPermission name="monthAllocUpper:select">
									<li>
										<a href="rest/allocInstall/view">月分配案件数</a>
									</li>
								</shiro:hasPermission>
								<shiro:hasPermission name="orgScope:select">
									<li>
										<a href="rest/orgScopeRelation/view">机构区间关系配置</a>
									</li>
								</shiro:hasPermission>
								<shiro:hasPermission name="collector:select">
									<li>
										<a href="rest/plmsEmpCollectSet/view">催收用户设置</a>
									</li>
								</shiro:hasPermission>
                                <shiro:hasPermission name="out_rate:select">
                                    <li>
                                        <a href="rest/outsrcRate/outsrcRateIndex">委外费率管理</a>
                                    </li>
                                </shiro:hasPermission>
                                <shiro:hasPermission name="outVisitUser:select">
									<li>
										<a href="rest/plmsOutVisitUser/view">外访用户设置</a>
									</li>
								</shiro:hasPermission>
								<shiro:hasPermission name="branchManage:select">
									<li>
										<a href="rest/plmsBranchManage/view">分行监管设置</a>
									</li>
								</shiro:hasPermission>	
							</ul>
						</li>
					</shiro:hasPermission>
					<shiro:hasPermission name="incomeReport:select,collectorPersonIncomeReport:select,outVisitPersonIncomeReport:select">
					<li class="">
						<a href="javascript:;">
							<i class="glyphicon glyphicon-stats"></i>
							<span class="title"> 报表管理 </span>
							<span class="arrow "> </span>
						</a>
						<ul class="sub-menu">
							<shiro:hasPermission name="incomeReport:select">
								<li>
									<a href="rest/incomeReport/view?type=all">催收实收明细表</a>
								</li>
							</shiro:hasPermission>
							<shiro:hasPermission name="collectorPersonIncomeReport:select">
								<li>
									<a href="rest/incomeReport/view?type=collector">催收个人实收明细</a>
								</li>
							</shiro:hasPermission>
							<shiro:hasPermission name="outVisitPersonIncomeReport:select">
								<li>
									<a href="rest/incomeReport/view?type=outVisit">外访个人实收明细</a>
								</li>
							</shiro:hasPermission>
						</ul>
					</li>
					</shiro:hasPermission>							
					<shiro:hasRole name="admin">
						<li class="">
							<a href="javascript:;">
								<i class="glyphicon glyphicon-refresh"></i>
								<span class="title"> 系统跑批 </span>
								<span class="arrow "> </span>
							</a>
							<ul class="sub-menu">
								<li>
									<a href="rest/test/toTest">系统跑批</a>
								</li>
							</ul>
						</li>
					</shiro:hasRole>
				</ul>
				<!-- END SIDEBAR MENU -->
			</div>
		</div>
		<!-- END SIDEBAR -->

		<!-- BEGIN CONTENT -->
		<div class="page-content-wrapper" style="height:96%">
			<div class="page-content" style="height:auto">
				<!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->
				<div class="modal fade" id="portlet-config" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
								<h4 class="modal-title">Modal title</h4>
							</div>
							<div class="modal-body">Widget settings form goes here</div>
							<div class="modal-footer">
								<button type="button" class="btn blue">Save changes</button>
								<button type="button" class="btn defsault" data-dismiss="modal">Close</button>
							</div>
						</div>
						<!-- /.modal-content -->
					</div>
					<!-- /.modal-dialog -->
				</div>
				<!-- /.modal -->
				<!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->
				<!-- 修改主题样式开始 -->
				<div class="theme-panel hidden-xs hidden-sm" style="display:none !important">
					<div class="toggler"></div>
					<div class="toggler-close"></div>
					<div class="theme-options">
						<div class="theme-option theme-colors clearfix">
							<span> 主题颜色 </span>
							<ul>
								<li class="color-black current color-default" data-style="default"></li>
								<li class="color-blue" data-style="blue"></li>
								<li class="color-brown" data-style="brown"></li>
								<li class="color-purple" data-style="purple"></li>
								<li class="color-grey" data-style="grey"></li>
								<li class="color-white color-light" data-style="light"></li>
							</ul>
						</div>
						<div class="theme-option">
							<span> 布局 </span>
							<select class="layout-option form-control input-small">
								<option value="fluid">顺序</option>
								<option value="boxed">盒状</option>
							</select>
						</div>
						<div class="theme-option">
							<span> 标题 </span>
							<select class="header-option form-control input-small">
								<option value="fixed">固定</option>
								<option value="default">默认</option>
							</select>
						</div>
						<div class="theme-option">
							<span> 工具栏 </span>
							<select class="sidebar-option form-control input-small">
								<option value="fixed">固定</option>
								<option value="default">默认</option>
							</select>
						</div>
						<div class="theme-option">
							<span> 工具栏位置 </span>
							<select class="sidebar-pos-option form-control input-small">
								<option value="left">左边</option>
								<option value="right">右边</option>
							</select>
						</div>
						<div class="theme-option">
							<span> 页脚 </span>
							<select class="footer-option form-control input-small">
								<option value="fixed">固定</option>
								<option value="default">默认</option>
							</select>
						</div>
					</div>
				</div>
				<!-- 修改主题样式结束 -->
				<!-- 面包屑导航开始-->
				<!--  <div class="row">
					<div class="col-md-12">
						BEGIN PAGE TITLE & BREADCRUMB
						<ul class="page-breadcrumb breadcrumb" id="breadCrumbs">
							<li id="breadCrumbsLiTop">
								<i class="fa fa-home"></i>
								<a href="rest/page/dashboard" onclick="return H.hrefBreadCrumbs(this)">首页</a>
							</li>
						</ul>
						END PAGE TITLE & BREADCRUMB
					</div>
				</div> -->
				<!-- 面包屑导航结束-->
				<!-- 加载主体部分内容 -->
				<div id="main-content" style="overflow-x:hidden">

                <script type="text/javascript">

                    $("#logout_id").on("click",function(){
                    	$.ajax({
                            url: "<%=request.getContextPath()%>/rest/user/logout",
                            type: "post",
                            dataType: "json",
                            success: function(data){
                                if(data.success){
                                    window.location.href = "<%=request.getContextPath()%>/rest/page/login";
                                }else{
                                    MSG.alert(data.message);
                                }
                            }
                        });
                    });

                </script>