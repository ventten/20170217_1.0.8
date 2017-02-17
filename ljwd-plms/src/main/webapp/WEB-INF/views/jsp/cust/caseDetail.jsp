<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <title>个案详情</title>
    <jsp:include page="/WEB-INF/views/header.jsp" flush="true"/>
</head>

<body>
    <ul class="nav nav-tabs" role="tablist">
        <li role="presentation" class="active"><a href="#contract-info" aria-controls="home" role="tab" data-toggle="tab">合同基本信息</a></li>
        <li role="presentation"><a href="#call-info" aria-controls="profile" role="tab" data-toggle="tab">历史来电记录</a></li>
    </ul>
    <div class="tab-content">
        <!--合同基本信息-->
        <div role="tabpanel" class="tab-pane active" id="contract-info">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-xs-12">
                        <h3 class="center-block">客户基本信息<a class="pull-right btn btn-primary">客户处理</a></h3>
                        <table class="table table-bordered">
                            <tr>
                                <td width="8%" class="active text-center">主贷人</td>
                                <td width="12%" class=" text-center">温小龙</td>
                                <td width="8%" class="active text-center">身份证号</td>
                                <td width="12%" class=" text-center">440882198708054757</td>
                                <td width="8%" class="active text-center">性别</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">年龄</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">婚姻状况</td>
                                <td width="12%" class=" text-center"></td>
                            </tr>
                            <tr>
                                <td width="8%" class="active text-center">联系电话</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">邮箱</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">QQ号</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">社保号</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">微信号</td>
                                <td width="12%" class=" text-center"></td>
                            </tr>
                            <tr>
                                <td width="8%" class="active text-center">工资发放日</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">月薪</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">现居住地</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">住宅类别</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">配偶姓名</td>
                                <td width="12%" class=" text-center"></td>
                            </tr>
                            <tr>
                                <td width="8%" class="active text-center">配偶联系电话</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class=" text-center"></td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class=" text-center"></td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class=" text-center"></td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class=" text-center"></td>
                                <td width="12%" class=" text-center"></td>
                            </tr>
                        </table>
                    </div>
                </div>
                <div class="row">
                    <div class="col-xs-12">
                        <h3 class="center-block">贷款信息</h3>
                        <table class="table table-bordered">
                            <tr>
                                <td width="8%" class="active text-center">合同编号</td>
                                <td width="12%" class=" text-center">01-JX-888-20141021-122</td>
                                <td width="8%" class="active text-center">放款类别</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">贷款产品</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">客户经理</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">交单网点</td>
                                <td width="12%" class=" text-center"></td>
                            </tr>
                            <tr>
                                <td width="8%" class="active text-center">客户归属地</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">贷款用途</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">扣款银行</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">扣款卡号</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">申请日期</td>
                                <td width="12%" class=" text-center"></td>
                            </tr>
                            <tr>
                                <td width="8%" class="active text-center">利率</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">费率</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class=" text-center"></td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class=" text-center"></td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class=" text-center"></td>
                                <td width="12%" class=" text-center"></td>
                            </tr>
                        </table>
                    </div>
                </div>
                <div class="row">
                    <div class="col-xs-12">
                        <h3 class="center-block">还款情况</h3>
                        <table class="table table-bordered">
                            <tr>
                                <td width="8%" class="active text-center">贷款金额</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">放款日期</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">首期还款日期</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">期数</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">已还期数</td>
                                <td width="12%" class=" text-center"></td>
                            </tr>
                            <tr>
                                <td width="8%" class="active text-center">剩余本金</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">首期期款</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">后每期期款</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">贷款情况</td>
                                <td width="12%" class=" text-center">正常、逾期、委外、诉讼、结清</td>
                                <td width="8%" class="active text-center">风险级别</td>
                                <td width="12%" class=" text-center"></td>
                            </tr>
                            <tr>
                                <td width="8%" class="active text-center">累计还款金额</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">累计豁免次数</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">累计豁免金额</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">累计逾期天数</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">最长逾期天数</td>
                                <td width="12%" class=" text-center"></td>
                            </tr>
                            <tr>
                                <td width="8%" class="active text-center">逾期天数</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class="active text-center">委外机构</td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class=" text-center"></td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class=" text-center"></td>
                                <td width="12%" class=" text-center"></td>
                                <td width="8%" class=" text-center"></td>
                                <td width="12%" class=" text-center"></td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <!--历史来电记录-->
        <div role="tabpanel" class="tab-pane" id="call-info">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-xs-12">
                        <h3 class="center-block"><a href="#" class="btn btn-primary pull-right">客户处理</a></h3>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
<jsp:include page="/WEB-INF/views/footer.jsp" flush="true"/>
