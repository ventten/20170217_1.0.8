<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <title>个案处理</title>
</head>

<style type="text/css">
    .row{
        padding-top: 40px ;
    }
</style>

<body>
    <div class="container-fluid">
        <h3>客户处理</h3>
        <form class="form-horizontal">
            <div class="row">
                <label class="col-sm-1 control-label">合同编号</label>
                <div class="col-sm-2">
                    <input type="text" class="form-control text-center" id="contract-num" value="01-JX-888-20141021-122" readonly>
                </div>
                <label class="col-sm-1 control-label">主贷人</label>
                <div class="col-sm-2">
                    <input type="text" class="form-control text-center" id="loan-people" value="温小龙" readonly>
                </div>
                <label class="col-sm-1 control-label">身份号</label>
                <div class="col-sm-2">
                    <input type="text" class="form-control text-center" id="identity" value="440882198708054757" readonly>
                </div>
                <label class="col-sm-1 control-label">贷款情况</label>
                <div class="col-sm-2">
                    <input type="text" class="form-control text-center" id="loan-case" value="正常、逾期、委外、诉讼、结清" readonly>
                </div>
            </div>
            <div class="row">
                <label class="col-sm-1 control-label">客户类型</label>
                <div class="col-sm-2">
                    <input type="text" class="form-control text-center" id="customer-type" value="逾期客户" readonly>
                </div>
                <label class="col-sm-1 control-label">期数</label>
                <div class="col-sm-2">
                    <input type="text" class="form-control text-center" id="periods" value="11/36" readonly>
                </div>
                <label class="col-sm-1 control-label">逾期天数</label>
                <div class="col-sm-2">
                    <input type="text" class="form-control text-center" id="past-day" value="15" readonly>
                </div>
            </div>
            <div class="row">
                <label class="col-sm-1 control-label">来电人</label>
                <div class="col-sm-2">
                    <input type="text" class="form-control" id="tel-people">
                </div>
                <label class="col-sm-1 control-label">来电号码</label>
                <div class="col-sm-2">
                    <input type="text" class="form-control" id="tel-number">
                </div>
            </div>
            <div class="row">
                <label class="col-sm-1 control-label">与主贷人关系</label>
                <div class="col-sm-2">
                    <select type="text" class="form-control" id="loan-relation">
                        <option>请选择</option>
                        <option>2</option>
                        <option>3</option>
                    </select>
                </div>
                <label class="col-sm-1 control-label">咨询类型</label>
                <div class="col-sm-2">
                    <select type="text" class="form-control" id="info-type">
                        <option>请选择</option>
                        <option>2</option>
                        <option>3</option>
                    </select>
                </div>
            </div>
            <div class="row">
                <label class="col-sm-1 control-label">咨询详情</label>
                <div class="col-sm-5">
                    <textarea class="form-control" id="info-details"></textarea>
                </div>
            </div>
            <div class="row">
                <div class="col-xs-2 col-xs-offset-1">
                    <input type="submit" class="btn btn-block btn-lg btn-primary" value="确定">
                </div>
                <div class="col-xs-2">
                    <input type="reset" class="btn btn-block btn-lg btn-default" value="返回">
                </div>
            </div>
        </form>
    </div>
</body>
