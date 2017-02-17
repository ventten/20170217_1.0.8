<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<!-- 批量分配 -->
<div class="modal fade modalBox" id="do_batch_alloc" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document" style="width:800px">
		<div class="modal-content">
		 <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" id="batchAllocTitle">
				批量分配          
			</h4>
         </div>
		<div class="modal-body">
			<div class="tab-content">
              <table class="display dataTable"  style="table-layout:fixed" cellspacing="0" width="100%" id="batchCollectors">
			      <thead>
			         <tr>
			            <th><input type="checkbox" id="checkallBatchCollector" title="Select all" />&nbsp;&nbsp;全选</th>
			            <th>催收员</th>
			            <th>所属机构</th>
			            <th>月累计剩余本金</th>
			            <th>月累计户数</th>
			            <th>当前剩余本金</th>
			            <th>当前户数</th>
			         </tr>
			      </thead>
			      <tbody>
        		  </tbody>
        	 </table>
	        <div style="margin-top: 15px;padding: 15px;border: 1px solid #e4e4e4;">
       			<button type="button" class="btn btn-default" id="batchBtn">批量分配</button>		
       			<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>			
         	</div>
	        </div>
           </div>
		</div>
			
		</div>
	</div>
<script>
$(document).ready(function(){
	table_batchCollectors();
  });
var table_batchCollectors;
function table_batchCollectors(){
	  var table_batchCollectors=$('#batchCollectors').dataTable( {
			"scrollY": '340px',
			"scrollX": '100%',
	        "scrollCollapse": true,
	        "paging": false,
	        "bSort": false,							//是否排序功能
	        "sPaginationType": "full_numbers",      //设置分页控件的模式
            "bLengthChange": false,                 //改变每页显示数据数量
      	    "bPaginate": false,                     //是否翻页功能
      	    "bFilter": false,                       //是否过滤功能
     	    "bInfo": false,							//是否页脚信息
    		"bAutoWidth": false,                    //是否自动宽度
    		"aoColumns": [                          //设定各列宽度   
   	            {"sWidth": "60px"},   
   	            {"sWidth": "55px"},   
   	            {"sWidth": "160px"},
   	            {"sWidth": "100px"},   
   	            {"sWidth": "70px"},
   	            {"sWidth": "90px"},   
   	            {"sWidth": "55px"},
           	]
		});
}
</script>