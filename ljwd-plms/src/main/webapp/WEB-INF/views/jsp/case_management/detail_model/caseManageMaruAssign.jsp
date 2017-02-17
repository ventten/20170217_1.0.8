<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<style>
	table.dataTable tbody td {
	    padding: 5px 10px;
	}
</style>

<!-- 手工调整 -->
<div class="modal fade" id="do_alloc" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document" style="width:800px;max-height:730px;">
		<div class="modal-content modal-contentBox" style="width:800px;max-height:850px;">
			 <div class="modal-header" style="border-bottom:none">
	            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
	                  &times;
	            </button>
         	</div>
			<ul class="nav nav-tabs" role="tablist">
	        	<li role="presentation" class="active"><a href="#manu" aria-controls="home" role="tab" data-toggle="tab">手工分配</a></li>
	        	<li role="presentation"><a href="#agent" aria-controls="profile" role="tab" data-toggle="tab">代理分配</a></li>
	    	</ul>

		<div class="modal-body">
			<div class="tab-content">
	        <div role="tabpanel" class="tab-pane active" id="manu">
	        <form id="ff" style="padding-left:15px;">
	        	分配规则：<span class="left-space-1 right-space-1"><input type="radio" name="assignRule"  class="assignRule" value="AVRG_DIST" disabled>平均分配</span>	        	
	        		   <span class="left-space-1 right-space-1"><input type="radio" name="assignRule"  class="assignRule right-space-1" value="WORK_MORE" disabled>多劳多得</span>	
	        </form>        	
	        
	        
	         <form id="searchCollectorOrgForm" style="padding: 15px 15px 0 15px;">
                 <div style="height:30px;">
                     <label class="right-space-1">所属机构：</label>
                     <select class="collection orgId" name="orgId" id="do_alloc_orgId">
                     </select>
                 </div>
 			</form>
	        <div>
        		<div style="margin: 15px;padding: 15px;border: 1px solid #e4e4e4;">	        		
                       <table class="display dataTable" id="collectors" cellspacing="0" width="100%" style="table-layout:fixed;">
                       	<thead>
                       		<tr>
				            <th><input type="checkbox" id="checkallCollector" title="Select all" />&nbsp;&nbsp;全选 </th>
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
                   </div>
	        </div>
	        <div style="margin: 15px;">
       			<button type="button" class="btn btn-primary right-space-1" id="submaruBtn">确定</button>
       			<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>	         						
         	</div>
	        </div>
	        <div role="tabpanel" class="tab-pane" id="agent">
	           <div style="margin: -15px 0 -15px 0;padding: 15px;">
	          	 代理日期：
	          <input size="10" type="text" class="right-space-1 collection-number" readonly onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'agentDateEnd\')}',minDate:'%y-%M-%d'})" id="agentDateStart" name="agentDateStart">
				至 
			  <input size="10" type="text" class="right-space-1 collection-number"  readonly onFocus="WdatePicker({minDate:'#F{$dp.$D(\'agentDateStart\')}'})" id="agentDateEnd" name="agentDateEnd">
	           </div>
	           <div style="margin: 15px;padding: 15px;border: 1px solid #e4e4e4;">
	           	待分配案件(<span id="count" style="color: red;"></span>)<br/>
	           	<table class="display dataTable" id="agentTable" cellspacing="0" width="100%" style="table-layout:fixed">
	           	<thead>
			      <tr>
			         <th>序号</th>
			         <th>合同编号</th>
			         <th>主贷人</th>
			      </tr>
			   	</thead>
			   	<tbody>
			   	</tbody>
	           	</table>
	           </div>
	           <div style="margin:15px;padding: 15px;border: 1px solid #e4e4e4;">
	           <!-- 催收员：<br/> -->
	           <div >
	           		<div style="height:30px;">
                        <label class="right-space">所属机构</label>
                        <select class="collection orgId" name="orgId" id="agent_alloc_orgId">
                        </select>
                    </div>
		           	<form  id="agentForm" style="height:80px;overflow-y:scroll">
		           		
		           	</form>
	           	</div>
	           </div>
	           <div style="margin: 15px;">
         			<button type="button" class="btn btn-primary right-space-1" id="subagentBtn">确定</button>
         			<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>				
         	   </div>
	        </div>
           </div>
		</div>
			<!-- <div class="modal-footer">
			</div> -->
		</div>
	</div>
</div>
<script>	
//代理分配表格
  var table_agent;
  $(document).ready(function(){
	table_init();
	table_collectors();
  });
  function table_init(){
	  var table_agent=$('#agentTable').dataTable( {
			"scrollY": '294px',
			"scrollX": '100%',
	        "scrollCollapse": true,
	        "paging": false,
	        "bSort": false,							//是否排序功能
	        "sPaginationType": "full_numbers",      //设置分页控件的模式
            "bLengthChange": false,                 //改变每页显示数据数量
        	"bPaginate": false,                     //是否翻页功能
        	"bFilter": false,                       //是否过滤功能
        	"bInfo": false,							//是否页脚信息
        	"bAutoWidth":true,                    //是否自动宽度
		});
  }
//手工分配表格
  var table_collectors;
  function table_collectors(){
	  var table_collectors=$('#collectors').dataTable( {
			"scrollY": '340px',
			"scrollX": true,
            "sScrollXInner": "100%",
            "bScrollCollapse": true,
	        "paging": false,
	        "bSort": false,							//是否排序功能
	        "sPaginationType": "full_numbers",      //设置分页控件的模式
            "bLengthChange": false,                 //改变每页显示数据数量
        	"bPaginate": false,                     //是否翻页功能
        	"bFilter": false,                       //是否过滤功能
        	"bInfo": false,							//是否页脚信息
        	"bAutoWidth": false,                    //是否自动宽度
        	"aoColumns": [                          //设定各列宽度   
	            {"sWidth": "40px"},   
	            {"sWidth": "40px"},   
	            {"sWidth": "100px"},
	            {"sWidth": "70px"},   
	            {"sWidth": "70px"},
	            {"sWidth": "70px"},   
	            {"sWidth": "70px"},
        	]
		});
  }

</script>
