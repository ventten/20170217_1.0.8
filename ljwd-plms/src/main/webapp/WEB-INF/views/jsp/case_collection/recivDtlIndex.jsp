<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<head>
    <title>客户应收明细</title>
    <jsp:include page="/WEB-INF/views/header.jsp" flush="true"/>  
</head>

<div class="panel panel-default">
    <div class="panel-heading"><h3 class="panel-title">客户应收明细</h3></div>
    <div class="panel-body">
        <form id="recivDtl-searchForm">

            <label for="recivDtl-cntrctNo" class="right-space-1">合同编号</label>
            <c:choose>
             <c:when test="${cntrctNo == null || '' eq cntrctNo}">
                    <input type="text" id="recivDtl-cntrctNo" name="cntrctNo" class="right-space collection"/>
            </c:when>
            <c:otherwise>
                    <input type="text" id="recivDtl-cntrctNo" name="cntrctNo" readonly class="right-space collection" value="${cntrctNo}" >
            </c:otherwise>
            </c:choose>
           

            <label for="recivDtl-custName" class="right-space-1 label-widthshort">主&nbsp;贷&nbsp;人</label>
            <input type="text" id="recivDtl-custName" name="custName" class="right-space collection"/>

            <label for="recivDtl-idCardNo" class="right-space-1">身份证号</label>
            <input type="text" id="recivDtl-idCardNo" name="idCardNo" class="right-space collection"/>

            <label for="recivDtl-siteCode" class="right-space-1 label-widthslarge line-bottom">所属网点</label>
            <select id="recivDtl-siteCode" name="siteCode" class="right-space collection">
            	<option value="">全部</option>
            	<c:forEach items="${siteList}" var="item">
		                <option value="${item.siteCode}" >${item.siteName}</option>
		        </c:forEach>
            </select>
            <br/>

            <label class="right-space-1">放款类型</label>
            <select class="right-space collection" name="paymentType">
            	<option value="">全部</option>
            	<c:forEach items="${paymentTypeList}" var="item">
		                <option value="${item.code}" >${item.typeName}</option>
		        </c:forEach>
            </select>

            <label class="right-space-1">还款状态</label>
            <select class="right-space collection" name="payStatus">
                <option value=""></option>
                <option value="UNPAID">未还</option>
                <option value="PAID">已还</option>
                <option value="PARTIAL_PAID">部分还</option>
            </select>

            <label class="right-space-1">再扣日期</label>
            <input size="16" type="text" class="collection right-space" readonly onFocus="WdatePicker({onpicked:null})"  id="reCollectDate" name="reCollectDate">
            
            <label class="right-space-1 line-bottom">应还款日期</label>
            <input size="16" type="text"  readonly onFocus="WdatePicker({onpicked:null})" class="collection-number" id="repaymentDateFrom" name="repaymentDateFrom">
            <label class="label-center-1">至</label>
            <input size="16" type="text"  readonly onFocus="WdatePicker({onpicked:null})" class="collection-number" id="repaymentDateTo" name="repaymentDateTo">
            <br/>
            
            <label class="right-space-1 line-bottom">扣款日期</label>
            <input size="16" type="text"  readonly onFocus="WdatePicker({onpicked:null})" class="collection-number" id="collectDateFrom" name="collectDateFrom">
            <label class="label-center-1">至</label>
            <input size="16" type="text"  readonly onFocus="WdatePicker({onpicked:null})" class="collection-number" id="collectDateTo" name="collectDateTo">
            
            <br/>
            <shiro:hasPermission name='collect_rec:reciv_dtl'>
                <button type="button" class="btn btn-primary right-space-1" id="recivDtl-searchBtn">查询</button>
            </shiro:hasPermission>
            <button type="reset" class="btn btn-default right-space-1" id="recivDtl-resetBtn">清除</button>
        </form>
    </div>
</div>

<table id="dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
        <tr>
        	<!-- <th class="text-center" >更多</th> -->
            <th style="text-align:right !important">序号</th>
            <th class="text-center" >合同编号</th>
            <th class="text-center" >客户名称</th>
            <th class="text-center" >证件号码</th>
            <th class="text-center" >贷款金额</th>
            <th class="text-center" >还款期数</th>
            <th class="text-center" >还款状态</th>
            <th class="text-center" >逾期天数</th>
            <th class="text-center" >应还款日期</th>
            <th class="text-center" >最大还款日期</th>
            <th class="text-center" >还款日期</th>
            <th class="text-center" >应还款额合计</th>
            <th class="text-center" >豁免金额合计</th>
            <th class="text-center" >实收金额合计</th>            
        </tr>
    </thead>
    <tbody>
    </tbody>
</table>
<jsp:include page="/WEB-INF/views/footer.jsp" flush="true"/>
<script type="text/javascript" language="javascript">
    
    //查询按钮点击
    $('#recivDtl-searchBtn').on( 'click', function () {
        var $form = $('#recivDtl-searchForm');
        var $this = $(this);
        if($this.hasClass("hasInit")){
            recivDtl_dataTable.search($form.serialize()).draw();
        }else{
            $this.addClass("hasInit");
            recivDtl_init();
       }
    });

    var recivDtl_dataTable;

    function recivDtl_init(){
        recivDtl_dataTable = $('#dataTable').DataTable({     
            "scrollY": '365px',
            "scrollX": true,
            "sScrollXInner": "100%",
            "bScrollCollapse": true,

            "sPaginationType": "full_numbers",      //设置分页控件的模式
            "bLengthChange": false,                 //改变每页显示数据数量
            "bPaginate": true,                      //是否翻页功能
            "bFilter": false,                       //是否过滤功能
            "bInfo": true,            			    //是否页脚信息
            "bSort": false,					        //是否排序功能

            "bAutoWidth": false,                    //是否自动宽度
            "bStateSave": false,                    //是否记忆配置,记录在cookies中

            "iDisplayLength": 100,
            "destroy":true,                         //允许销毁Table(即第二次点击会清空第一次的Table)
            "oLanguage": {
                "sZeroRecords": "没有检索到数据",
                "sInfo": "从 _START_ 到 _END_ /共 _TOTAL_ 条数据",
                "sInfoEmpty": "没有数据",
                "sInfoFiltered": "(从 _MAX_ 条数据中检索)",
                "oPaginate": {
                    "sFirst": "首页",
                    "sPrevious": "前一页",
                    "sNext": "后一页",
                    "sLast": "尾页"
                }
            },
            "bProcessing": false,        //加载数据时显示正在加载信息
            "bServerSide": true,        //指定从服务器端获取数据
            "sAjaxSource" : "<%=request.getContextPath()%>/rest/caseCollection/pageRecivDtlData",
            "fnServerData" : function(sSource, aoData, fnCallback) {
                var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#recivDtl-searchForm").serialize();
                $.ajax({
                    "type" : 'POST',
                    "dataType" : "json",
                    "url" : sSource,
                    "data" : data,
                    "success" : function(resp) {
                        fnCallback(resp);
                    },
                    "error":function(jqXHR,textStatus,errorThrown){
                        MSG.show("获取数据发生异常");
                    }
                });
            },
          	//dataTable设置第一列靠右显示
            "createdRow": function( row, data, dataIndex ) {
                $(row).children('td').eq(0).attr('style', 'text-align:right !important;')
            },
            //dataTable显示
            "aoColumns" : [
			/* 	{"className":'details-control',"orderable": false,"data": null,"defaultContent": ''},     */       
                {"mData" : "rowNo","sDefaultContent" : "","className":'details-control',"orderable": false,"data": null,},
                {"mData" : "cntrctNo","sDefaultContent" : ""},
                {"mData" : "custName","sDefaultContent" : ""},
                {"mData" : "idCardNo","sDefaultContent" : ""},
                {"mData" : "loanAmount","sDefaultContent" : ""},
                {"mData" : "periodNum","sDefaultContent" : ""},
                {"mData" : "statusVal","sDefaultContent" : ""},
                {"mData" : "overdueDays","sDefaultContent" : ""},
                {"mData" : "rpmntDate","sDefaultContent" : ""},
                {"mData" : "maxRpmntDate","sDefaultContent" : ""},
                {"mData" : "actualRpmntDate","sDefaultContent" : ""},
                {"mData" : "ttlRecivAmt","sDefaultContent" : ""},
                {"mData" : "ttlWaivedAmt","sDefaultContent" : ""},
                {"mData" : "ttlActualAmt","sDefaultContent" : ""}
                
            ]
        });
        //行显示附加信息
       function format ( data ) {
        	var receivableDetails = data.receivableDetails;
            var tbody = "";
            if(receivableDetails!=null&&receivableDetails.length>0){
            	for(var i=0; i<receivableDetails.length;i++){
            		var detail = receivableDetails[i];
            		tbody += '<tr><td>'+detail.ledgerName+'</td>'+
            					'<td>'+detail.recivAmt+'</td>'+
            					'<td>'+detail.waivedAmt+'</td>'+
            					'<td>'+detail.actualAmt+'</td><tr>'
            	}
            }
            return '<table cellpadding="5" cellspacing="0" border="0" class="rowTable">'+
                '<tr>'+
                    '<td>费用项</td>'+
                    '<td>应收</td>'+
                    '<td>豁免</td>'+
                    '<td>实收</td>'+
                '</tr>'+
                tbody+
            '</table>';
        }
        //查看信息显示与隐藏
       $('#dataTable tbody').on('click', 'td.details-control', function () {
           var tr = $(this).closest('tr');
           var row = recivDtl_dataTable.row( tr );
    
           if ( row.child.isShown() ) {
               // This row is already open - close it
               row.child.hide();
               tr.removeClass('shown');
           }
           else {
               // Open this row
               row.child( format(row.data()) ).show();
               tr.addClass('shown');
           }
           $('.rowTable').parent('td').parent('tr').css('background','#fff');
       } );     
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
   		//使用localStorage取值,获取上一个页面的来源
   		var getVal = localStorage.getItem("accountVal");
   		if(getVal == "transferAdvance"){
   			$('#' + getVal).click();
   			$('#' + getVal + '_case').addClass('choose_active');
   		}else if(getVal == "caseInfo"){
   			$('#' + getVal).click();
   			$('#' + getVal + '_active').addClass('choose_active');
   		}else if(getVal == "caseInfoAll"){
   			$('#' + 'caseInfo').click();
   			$('#' + getVal + '_active').addClass('choose_active');
   		}else if(getVal == "visitInfo"){
   			$('#' + getVal).click();
   			$('#' + getVal + '_active').addClass('choose_active');
   		}else if(getVal == "visitInfo_delay"){
   			$('#' + 'visitInfo').click();
   			$('#' + getVal).addClass('choose_active');
   		}else if(getVal == "outsrcInfo"){
   			$('#' + getVal).click();
   			$('#' + getVal+'_case').addClass('choose_active');
   		}else if(getVal == "customerInfo_select"){
   			$('#' + 'customerInfo').click();
   			$('#' + getVal).addClass('choose_active');
   		}
   		//点击菜单移除选中项class
   		$('.sub-menu li').click(function(){
   			$('.sub-menu li').find('a').removeClass('choose_active');
   		})
    })
</script>
