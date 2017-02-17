<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<script language="javascript" type="text/javascript" src="assets/plugins/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="app/js/datePicker.js"></script>

<!--发起再扣窗口-开始-->
<div class="modal fade hideModal" id="recollectModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:460px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">发起再扣</h4>
            </div>
            <div class="modal-body">

                <form class="form-horizontal" id="recollectForm">
                    <input type="hidden" value="${applDetail.applId}" name="applId" id="recollect-applId"/>
                    <input type="hidden" value="${applDetail.paymentId}" name="paymentId" id="recollect-paymentId"/>
                    <input type="hidden" value="${applDetail.idCardNo}" name="idCardNo" id="recollect-idCardNo"/>
                    <input type="hidden" value="${applDetail.cntrctNo}" name="cntrctNo" id="recollect-cntrctNo"/>

                    <div class="form-group">
                        <label class="col-sm-4 control-label label-base">期数</label>
                        <div class="col-sm-5">
                            <input type="text" class="form-control" value="${overduePeriod}" name="overduePeriod" id="recollect-overduePeriod" readonly>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-4 control-label label-base"><span class="redStar">* </span>还款方式</label>
                        <div class="col-sm-5">
                            <select class="collection" id="recollect-payType" name="payType">
                                <option value="NORMAL">正常还款</option>
                                <%--<option value="ADV_CLEAR">提前结清</option>--%>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-4 control-label label-base"><span class="redStar">* </span>再扣日期</label>
                        <div class="col-sm-5">
                            <input size="10" type="text" onFocus="WdatePicker( {onpicked:function(){getRecollectOverdueAmt();}} )" name="repaymentDate" id="recollect-repaymentDate" readonly>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-4 control-label label-base">修改再扣金额</label>
                        <div class="col-sm-5">
                            <input type="text" class="form-control" name="collectAmt" id="recollect-collectAmt">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-4 control-label label-base">逾期金额</label>
                        <div class="col-sm-5">
                            <input type="text" class="form-control redStar" name="collectAmt" id="recollect-overdueAmt" disabled>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-4 control-label"></label>
                        <div class="col-sm-5">
                            <span class="redStar checkMessage" id="recollectMessage"></span>
                        </div>
                    </div>

                </form>
                
            </div>
            <div class="modal-footer">
                <button class="btn btn-primary" class="btn blue" id="recollect-recollectBtn">确定</button>
                <button class="btn btn-primary" class="btn default" data-dismiss="modal">取消</button>
            </div>
        </div>
    </div>
</div>
<!--发起再扣窗口-结束-->

<script type="text/javascript" language="javascript">

    //发起再扣提交
    $("#recollect-recollectBtn").on('click',function(){
        var $recollectMessage = $("#recollectMessage");
        $recollectMessage.text("");
        if(!$("#recollect-overduePeriod").val()){
            $recollectMessage.text("当前客户未逾期");
            return;
        }
        var $thisBtn = $("#recollect-recollectBtn");
        var $recollectForm = $("#recollectForm");
        //表单校验
        if (!$recollectForm.valid()){
            return false;
        }
        var collectAmt = $("#recollect-collectAmt").val();          //再扣金额
        var overdueAmt = $.trim($("#recollect-overdueAmt").val());  //逾期金额
        if(eval(collectAmt) > eval(overdueAmt)){
            $recollectMessage.text("再扣金额不能大于逾期金额");
            return;
        }
        $thisBtn.attr("disabled",true);
        $.ajax({
            type : 'POST',
            dataType : "json",
            url : "<%=request.getContextPath()%>/rest/caseCollection/recollect",
            data : $recollectForm.serialize(),
            success : function(ret) {
                if(ret.success){
                    $("#recollectModal").modal("hide");
                    $recollectForm.resetForm();
                    MSG.alert(ret.message);
                }else{
                    $("#recollectMessage").text(ret.message);
                }
                $thisBtn.attr("disabled",false);
            },
            error:function(){
                $thisBtn.attr("disabled",false);
                MSG.alert("操作失败,请刷新重试");
            }
        });
    });

    //还款方式change
    $("#recollect-payType").on('change',function(){
        if($("#recollect-repaymentDate").val()){
            getRecollectOverdueAmt();
        }
    });

    //获取逾期金额方法
    function getRecollectOverdueAmt(){
        $.ajax({
            "type" : 'POST',
            "dataType" : "json",
            "url" : "<%=request.getContextPath()%>/rest/caseCollection/getRepaymentAmount",
            "data" : $('#recollectForm').serialize(),
            //"beforeSend":function(){},
            "success" : function(result) {
                if(result.success){
                    if(result.data.receivableSumaryAmount){
                        $("#recollect-collectAmt").val(result.data.receivableSumaryAmount);
                        $("#recollect-overdueAmt").val(result.data.receivableSumaryAmount);
                    }else {
                        $("#recollect-collectAmt").val("");
                        $("#recollect-overdueAmt").val("");
                    }
                }else {
                    MSG.alert(result.message);
                }
            },
            "error":function(errorData){
                MSG.show('应收金额获取失败');
            }
        });
    }

    $(document).ready(function() {
        //$("#recollect-repaymentDate").val(new Date().Format("yyyy-MM-dd"));
        //查询表单校验
        recollectForm_validate($("#recollectForm"));
    });

    //表单校验
    function recollectForm_validate($validateForm){
        $validateForm.validate({
            unhighlight: function (element, errorClass, validClass) {
                //验证通过
                $(element).tooltip("destroy").removeClass(errorClass);
            },
            errorPlacement: function (label, element) {
                //让验证提示显示在验证框下面 注：有些地方如果动态添加这个属性不成功就手动添加data-placement="bottom"属性
                $(element).attr("data-placement","bottom");
                $(element).tooltip("destroy"); /* 必需 */
                $(element).attr("title", $(label).text()).tooltip("show");
            },
            rules: {
//                overduePeriod: {
//                    required: true
//                },
                payType: {
                    required: true
                },
                repaymentDate: {
                    required: true
                },
                collectAmt: {
                    required: true,upNumDeci:true
                }
            },
            messages: {
//                overduePeriod: {
//                    required: "请选择期数"
//                },
                payType: {
                    required: "请选择还款方式"
                },
                repaymentDate: {
                    required: "请选择再扣日期"
                },
                collectAmt: {
                    required: "请输入再扣金额",upNumDeci:"请输入大于等于0的数且小数不超过6位"
                }
            }
        });
    }

</script>
