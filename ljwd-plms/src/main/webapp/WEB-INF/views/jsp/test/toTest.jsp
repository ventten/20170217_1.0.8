<%--
  Created by IntelliJ IDEA.
  User: zhengzw
  Date: 2016/7/18 10:50
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>跑批测试触发</title>
</head>
<body>

<div>
    <span>客户信息模块：</span>
    <button type="button" id="applStatusBtn">贷款状态同步</button>&nbsp;&nbsp;
    <button type="button" id="overDueCustBtn">导入客户信息</button>

    <br/><br/>
    <span>工单池数据：</span>&nbsp;&nbsp;&nbsp;
    <button type="button" id="autoCircuBtn">数据自动流转</button>&nbsp;&nbsp;
    <button type="button" id="autoAllocBtn">数据自动分配</button>

    <br/><br/>
    <span>案件催收：</span>&nbsp;&nbsp;&nbsp;
    <button type="button" id="breakPromiseBtn">是否破坏承诺</button>&nbsp;&nbsp;

    <br/><br/>
    <span>委外管理：</span>&nbsp;&nbsp;&nbsp;
    <button type="button" id="endedOutsrcBtn">自动结案</button>&nbsp;&nbsp;
    <button type="button" id="sendOutsrcBtn">再次推送同步失败的委外信息</button>&nbsp;&nbsp;

	<br/><br/>
    <span>外访管理：</span>&nbsp;&nbsp;&nbsp;
    <button type="button" id="outVisitBtn">外访已委外，已过期跑批</button>&nbsp;&nbsp;
    <br/><br/>
    <span>个人实收：</span>&nbsp;&nbsp;&nbsp;
    <button type="button" id="incomeBtn">昨日实收</button>&nbsp;&nbsp;
</div>

</body>
</html>

<script type="text/javascript" language="javascript">

    $('#applStatusBtn').on( 'click', function () {
        test("<%=request.getContextPath()%>/rest/test/applyStatus",$('#applStatusBtn'));
    });

    $('#overDueCustBtn').on( 'click', function () {
        test("<%=request.getContextPath()%>/rest/test/overDueCust",$('#overDueCustBtn'));
    });

    $('#breakPromiseBtn').on( 'click', function () {
        test("<%=request.getContextPath()%>/rest/test/breakPromise",$('#breakPromiseBtn'));
    });

    $('#autoCircuBtn').on( 'click', function () {
        test("<%=request.getContextPath()%>/rest/test/autoCircu",$('#autoCircuBtn'));
    });

    $('#autoAllocBtn').on( 'click', function () {
        test("<%=request.getContextPath()%>/rest/test/autoAlloc",$('#autoAllocBtn'));
    });

    $('#outVisitBtn').on( 'click', function () {
        test("<%=request.getContextPath()%>/rest/test/outVisit",$('#outVisitBtn'));
    });
    
    $('#endedOutsrcBtn').on( 'click', function () {
        test("<%=request.getContextPath()%>/rest/test/endedOutsrc",$('#endedOutsrcBtn'));
    });

    $('#sendOutsrcBtn').on( 'click', function () {
        test("<%=request.getContextPath()%>/rest/test/sendOutsrc",$('#endedOutsrcBtn'));
    });
    $('#incomeBtn').on( 'click', function () {
        test("<%=request.getContextPath()%>/rest/test/income",$('#incomeBtn'));
    });
    
    function test(url,$btn){
        $btn.attr('disabled',true);
        $.ajax({
            "type" : 'POST',
            "dataType" : "json",
            "url" : url,
            "data" : {},
            "success" : function(ret) {
                $btn.attr('disabled',false);
                MSG.alert(ret.message);
            },
            "error":function(jqXHR,textStatus,errorThrown){
                MSG.alert("执行出错");
                $btn.attr('disabled',false);
            }
        });
    }

	
</script>
