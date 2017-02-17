<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>    

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>外访路线</title>
<style type="text/css">
	 .dataTables_scrollBody tbody tr td{
	    padding: 5px 10px !important;
	}
</style>
</head>

<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">外访路线</h3>
    </div>
    <div class="panel-body">
            <form id="searchForm">
                <label class="right-space-1">外访日期</label>
                <input size="16" type="text" class="collection right-space" readonly onFocus="WdatePicker(null)" id="outVisitDate" name="outVisitDate">      	
                
                <label for="outVisiter" class="right-space-1">外访人员 </label>
		        <span class="search_box">
		             <input type="text" id="outVisiterName" name="outVisiterName" class="search_input" <c:if test="${userName !=null }">  readonly  value=${userName} </c:if>/>
	         		 <shiro:hasPermission name="outVisitRoute:selectAll">
	         		 <div class="search_ionic input-group-addon" id="outVisiterSearchBtn">
	           			<i class="glyphicon glyphicon-search"></i>
	           		 </div>
	           		 </shiro:hasPermission>
		         </span>
                
               
  				<shiro:hasPermission name="outVisitRoute:select,outVisitRoute:selectAll">
                <button type="button" class="btn btn-primary right-space-2 left-space" id="outVisitRoute-searchBtn">查询</button>&nbsp;
             	</shiro:hasPermission>
	            <button type="reset" class="btn btn-default" >清除</button>
            </form>
    </div>
</div>

<jsp:include page="detail_modal/outVisitUserModal.jsp"></jsp:include>

<table id="outVisitRoute-dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
	    <tr class="tableHead">
	    	<th class="text-center tableHead">外访日期</th>
	    	<th class="text-center tableHead">外访员</th>
	    	<th class="text-center tableHead">陪同人</th>
	    	<th class="text-center tableHead">外访地点</th>
	        <th class="text-center tableHead">外访路线</th>
	    </tr>
    </thead>
    <tbody>
    </tbody>
</table>


<script type="text/javascript">

var outVisitRoute_dataTable;

<%-- function outVisitRouteInit(){
	outVisitRoute_dataTable = P.dataTable($('#outVisitRoute-dataTable'),
             $("#searchForm"),
             "<%=request.getContextPath()%>/rest/outVisitRoute/pageOutVisitRouteData",
             [
		            {"mData" : "outVisitDate","sDefaultContent" : ""},
		            {"mData" : "outVisiterName","sDefaultContent" : ""},
		            {"mData" : "assistByNames","sDefaultContent" : ""},
		          /*   {"mData" : "address","sDefaultContent" : ""}, */
		            {"mData" : null,"sDefaultContent" : "",
		                "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
		                	
		                	nTd.title=oData.address;
		                	if(oData!=null&&oData.address!=null){
		                		var address = oData.address;
		                		if(address.length>70){
		                			$(nTd).html(address.substring(0,70)+"....");
		                		}else{
		                			$(nTd).html(oData.address);
		                		}
		                	}
		                	
		                }
		            },
		            {"mData" : null,"sDefaultContent" : "",
		                "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
	                        $(nTd).html("<a target='_blank' class='visitInfo' href=<%=request.getContextPath()%>/rest/outVisitRoute/outVisitMapDisplay?outVisiter="+oData.outVisiter+"&outVisitDate=" + oData.outVisitDate + '>查看 </a>&nbsp;&nbsp;');
		                }
		            }
		            
             ],
             10
     );
} --%>

function outVisitRouteInit(){
	outVisitRoute_dataTable=$('#outVisitRoute-dataTable').DataTable({
      "scrollY": '454px',
      "scrollX": '100%',
      "sScrollXInner": "100%",
      "bScrollCollapse": true,

      "sPaginationType": "full_numbers",      //设置分页控件的模式
      "bLengthChange": false,                 //改变每页显示数据数量
      "bPaginate": true,                      //是否翻页功能
      "bFilter": false,                       //是否过滤功能
      "bInfo": true,                         //是否页脚信息
      "bSort": true,                            //是否排序功能

      "bAutoWidth": true,                    //是否自动宽度
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
      "bProcessing": false,       //加载数据时显示正在加载信息
      "bServerSide": true,        //指定从服务器端获取数据
      "sAjaxSource" : "<%=request.getContextPath()%>/rest/outVisitRoute/pageOutVisitRouteData",
      "fnServerData" : function(sSource, aoData, fnCallback) {
          //参数拼接
          var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#searchForm").serialize();
          $.ajax({
              "type" : 'POST',
              "dataType" : "json",
              "url" : sSource,
              "data" : data,
              "success" : function(resp) {
               $('#checkall').attr("checked", false);
                  fnCallback(resp);
              }
              ,"error":function(jqXHR,textStatus,errorThrown){
                  MSG.show("获取数据发生异常");
                  $('#main-content').html(jqXHR.responseText);
              }
          });
      },
      //dataTable显示
      "aoColumns" : [
			{"mData" : "outVisitDate","sDefaultContent" : ""},
            {"mData" : "outVisiterName","sDefaultContent" : ""},
            {"mData" : "assistByNames","sDefaultContent" : ""},
          /*{"mData" : "address","sDefaultContent" : ""}, */
            {"mData" : null,"sDefaultContent" : "",
                "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                	
                	nTd.title=oData.address;
                	if(oData!=null&&oData.address!=null){
                		var address = oData.address;
                		if(address.length>70){
                			$(nTd).html(address.substring(0,70)+"....");
                		}else{
                			$(nTd).html(oData.address);
                		}
                	}
                	
                }
            },
            {"mData" : null,"sDefaultContent" : "",
                "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                       $(nTd).html("<a target='_blank' class='visitInfo' href=<%=request.getContextPath()%>/rest/outVisitRoute/outVisitMapDisplay?outVisiter="+oData.outVisiter+"&outVisitDate=" + oData.outVisitDate + '>查看 </a>&nbsp;&nbsp;');
                }
            }
      ],
      "aoColumnDefs":[
           {"bSortable":false,"aTargets":[2,3,4]}
       ]
  });
}

$(document).ready(function() {
	outVisitRouteInit();
});

//查询按钮
$('#outVisitRoute-searchBtn').click(function(){
	
	outVisitRoute_dataTable.search($("#searchForm").serialize()).draw();

});



//外访员查找
$('#outVisiterSearchBtn').click(function(){
	$('#out_areaId').val("");
	$('#outVisitUserTBody').html("");
	$('#outVisitUserSearchModal').modal('show');
});
//根据所属机构查找外访人员
$('#out_areaId').change(function(){
	var out_areaId = $('#out_areaId').val();
	if(out_areaId.length>0){
		$.ajax({
			url:"<%=request.getContextPath()%>/rest/outVisitAssign/searchOutVisitUserByAreaId?"+new Date().toTimeString(),
			type:"post",
			data:{"areaId":out_areaId},
			dataType: "json",
			success:function(data){
				if(data.success){
					var msg = data.message;
					msg = eval("(" + msg + ")");
					var outVisitUserTbody = $('#outVisitUserTBody');
					var bodyHtml = "";
	                    for(var i = 0; i < msg.length; i++){
	                        bodyHtml += "<tr><td><input type='radio' name='OutVisitUser_search' value='"+ msg[i].userId +"'></td><td><span>" + msg[i].userName + "</span></td><td><span>" + msg[i].tel + "</span></td></tr>";
	                    }
	                outVisitUserTbody.html(bodyHtml);
				}else{
					MSG.alert(data.message);
				}
			}

		});
	}
});

//查找外访员确认按钮
$('#outVisitUserAddBtn').click(function(){
	 var collector = $('input[name="OutVisitUser_search"]').filter(':checked').val();
     var collectorName = $('input[name="OutVisitUser_search"]').filter(':checked').parent().next().text();
     if(!collector){
         MSG.show('请选择一个外访员');
         return;
     }
   //  $("#outVisiter_hidden").val(collector);
     $("#outVisiterName").val(collectorName);
     $("#outVisitUserSearchModal").modal("hide");
});
//查找外访员清除按钮 
$('#outVisitUserClearBtn').click(function(){
	// $("#outVisiter_hidden").val('');
     $("#outVisiterName").val('');
     $("#outVisitUserSearchModal").modal("hide");
});

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

//点击查看链接存储localStorage值
$('#outVisitRoute-dataTable').on('click','.visitInfo',function(){
	var classVal=$(this).attr('class');
	window.localStorage.setItem("getVal",classVal);   		
})
</script>