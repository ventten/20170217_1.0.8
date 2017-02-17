<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<head>
    <title>委外机构</title>
	<%-- 本页面下所有公用样式 --%>
    <link type="text/css" rel="stylesheet" href="assets/css/outsource/outsrcComIndex.css"/>
    <style>
    	table.dataTable tbody td {
		    padding: 6px 10px;
		}
    </style>
</head>
<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">委外机构</h3>
    </div>
    <div class="panel-body">
        <form id="outsrcCom-searchForm">
            <label for="outsrcComName" class="right-space-1">公司名称</label>
            <input type="text" id="outsrcComName" name="outsrcComName" class="right-space collection"/>
            <label for="isActive" class="right-space-1 line-bottom">是否有效</label>
            <select id="isActive" name="isActive" class="collection">
                <option value="">全部</option>
                <option value="Y">有效</option>
                <option value="N">无效</option>
            </select>

            <br/>
            <shiro:hasPermission name="out_com:select">
                <input class="btn btn-primary right-space-2" type="button" id="outsrcCom-searchBtn"  value="查询"/>
            </shiro:hasPermission>
            <shiro:hasPermission name="out_com:insert">
                <input class="btn btn-primary right-space-2" type="button" value="新增" data-toggle="modal" data-target="#outsrcComAddModal" onclick="P.resetModal('outsrcComAddForm')"/>
            </shiro:hasPermission>
            <shiro:hasPermission name="out_contact:import">
                <input class="btn btn-primary right-space-2" type="button" value="导入通讯录" data-toggle="modal" data-target="#outsrcComContactAddModal" onclick="P.resetModal('outsrcComContactAddForm')"/>
            </shiro:hasPermission>
            <shiro:hasPermission name="out_log:insert">
                <input class="btn btn-primary right-space-2" type="button" value="新增沟通日志" data-toggle="modal" data-target="#outsrcComLogAddModal" onclick="P.resetModal('outsrcComLogAddForm')"/>
            </shiro:hasPermission>
            <input class="btn btn-default" type="reset" value="清除"/>
        </form>
    </div>
</div>

<table id="outsrcCom-dataTable" class="display dataTable" cellspacing="0" width="100%" style="table-layout:fixed">
    <thead>
    <tr>
        <th class="text-center" >序号</th>
        <th class="text-center" >公司名称</th>
        <th class="text-center" >微贷外包公司</th>
        <th class="text-center" >优先级</th>
        <th class="text-center" >辐射城市</th>
        <th class="text-center" >是否有效</th>
        <th class="text-center" >公司简要</th>
        <th class="text-center" >最新沟通记录</th>
        <th class="text-center" >维护人</th>
        <th class="text-center" >维护时间</th>
        <th class="text-center" >操作</th>
    </tr>
    </thead>
</table>

<!--新增和维护委外机构窗口-->
<jsp:include page="com_modal/outsrcComAddAndUpdateModal.jsp"/>

<!--新增委外机构沟通日志窗口-->
<jsp:include page="com_modal/outsrcComLogAddModal.jsp"/>

<!--查看沟通日志窗口-->
<jsp:include page="com_modal/outsrcComLogPageModal.jsp"/>

<!--导入通讯录窗口-->
<jsp:include page="com_modal/outsrcComContactAddModal.jsp"/>

<!--查看联系人窗口-->
<jsp:include page="com_modal/outsrcComContactPageModal.jsp"/>

<script type="text/javascript" language="javascript">

   <%--  var outsrcCom_table = P.dataTable($('#outsrcCom-dataTable'),
            $("#outsrcCom-searchForm"),
            "<%=request.getContextPath()%>/rest/outsrcCom/pageOutsrcComData",
            [
                {"mData"  : function(row, type, set, meta) { return meta.row + 1; }},
                {"mData"  : "outsrcComName","sDefaultContent" : ""},
                {"mData"  : "wdCorpName","sDefaultContent" : ""},
                {"mData" : "weight","sDefaultContent" : ""},
                {"mData" : null,"sDefaultContent" : "",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        var html = '';
                        if(oData.regionList){
                            for(var i = 0;i < oData.regionList.length;i++){
                                if(i == 0){
                                    html += oData.regionList[i].regionName;
                                }else{
                                    html += "," + oData.regionList[i].regionName;
                                }
                            }
                        }
                        $(nTd).html(html);
                    }
                },
                {"mData" : "isActiveText","sDefaultContent" : ""},
                {"mData" : "brief","sDefaultContent" : ""},
                {"mData" : "content","sDefaultContent" : ""},
                {"mData" : "updatedUserName","sDefaultContent" : ""},
                {"mData" : "updateTime","sDefaultContent" : ""},
                {"mData" : null,"sDefaultContent" : "",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        <shiro:hasPermission name="out_com:update">
                            var regionList = JSON.stringify(oData.regionList);
                            $(nTd).html("<a href='javascript:void(0);' class='report' onclick='outsrcCom_editFun(" + regionList + ",\"" + oData.id + "\",\"" + oData.recVer + "\",\"" + oData.outsrcComName + "\",\"" + oData.weight + "\",\"" + oData.brief + "\")'>修改</a>");
                        </shiro:hasPermission>

                        <shiro:hasPermission name="out_contact:select">
                            $(nTd).append("&nbsp;&nbsp;&nbsp;&nbsp;<a href='javascript:void(0);' class='operate' onclick='pageOutsrcComLogContact(\"" + oData.id + "\")'>通讯录</a>");
                        </shiro:hasPermission>

                        <shiro:hasPermission name="out_com:switch">
                            var text = oData.isActive == "N" ? "启用" : "停用";
                            $(nTd).append("<br/><br/><a href='javascript:void(0);' class='report' onclick='enableOrCancel(\"" + oData.id + "\",\"" + oData.isActive + "\")'>" + text + "</a>");
                        </shiro:hasPermission>

                        <shiro:hasPermission name="out_log:select">
                            $(nTd).append("&nbsp;&nbsp;<a href='javascript:void(0);' class='operate' onclick='pageOutsrcComLogLog(\"" + oData.id + "\")'>沟通日志</a>");
                        </shiro:hasPermission>
                    }
                }
            ]
    ); --%>
    
  	//表格设置
  	function table_outsrcCom(){
  		var table_outsrcCom;
  		table_outsrcCom=$('#outsrcCom-dataTable').DataTable({     
            "scrollY": '421px',
            "scrollX": true,
            "sScrollXInner": "100%",
            "bScrollCollapse": true,

            "sPaginationType": "full_numbers",      //设置分页控件的模式
            "bLengthChange": false,                 //改变每页显示数据数量
            "bPaginate": true,                      //是否翻页功能
            "bFilter": false,                       //是否过滤功能
            "bInfo": true,            			    //是否页脚信息
            "bSort": false,					        //是否排序功能

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
            "bProcessing": false,        //加载数据时显示正在加载信息
            "bServerSide": true,        //指定从服务器端获取数据
            "sAjaxSource" : "<%=request.getContextPath()%>/rest/outsrcCom/pageOutsrcComData",
            "fnServerData" : function(sSource, aoData, fnCallback) {
                var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#outsrcCom-searchForm").serialize();
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
           /*  "createdRow": function( row, data, dataIndex ) {
                $(row).children('td').eq(0).attr('style', 'text-align:right !important;')
            }, */
            //dataTable显示
            "aoColumns" : [
				 	{"mData"  : function(row, type, set, meta) { return row.rowNo; }/* ,"className":'details-control',"orderable": false,"data": null, */},
	                {"mData"  : "outsrcComName","sDefaultContent" : ""},
	                {"mData"  : "wdCorpName","sDefaultContent" : ""},
	                {"mData" : "weight","sDefaultContent" : ""},
	                {"mData" : null,"sDefaultContent" : "",
	                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
	                        var html = '';
	                        if(oData.regionList){
	                            for(var i = 0;i < oData.regionList.length;i++){
	                                if(i == 0){
	                                    html += oData.regionList[i].regionName;
	                                }else{
	                                    html += "," + oData.regionList[i].regionName;
	                                }
	                            }
	                        }
	                        $(nTd).html(html);
	                    }
	                },
	                {"mData" : "isActiveText","sDefaultContent" : ""},
	                {"mData" : "brief","sDefaultContent" : ""},
	                {"mData" : "content","sDefaultContent" : ""},
	                {"mData" : "updatedUserName","sDefaultContent" : ""},
	                {"mData" : "updateTime","sDefaultContent" : ""},
	                {"mData" : null,"sDefaultContent" : "",
	                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
	                        <shiro:hasPermission name="out_com:update">
	                            var regionList = JSON.stringify(oData.regionList);
	                            $(nTd).html("<a href='javascript:void(0);' class='report' onclick='outsrcCom_editFun(" + regionList + ",\"" + oData.id + "\",\"" + oData.recVer + "\",\"" + oData.outsrcComName + "\",\"" + oData.weight + "\",\"" + oData.brief + "\")'>修改</a>");
	                        </shiro:hasPermission>
	
	                        <shiro:hasPermission name="out_contact:select">
	                            $(nTd).append("&nbsp;&nbsp;<a href='javascript:void(0);' class='operate' onclick='pageOutsrcComLogContact(\"" + oData.id + "\")'>通&nbsp;讯&nbsp;录</a>");
	                        </shiro:hasPermission>
	
	                        <shiro:hasPermission name="out_com:switch">
	                            var text = oData.isActive == "N" ? "启用" : "停用";
	                            $(nTd).append("<br/><br/><a href='javascript:void(0);' class='report' onclick='enableOrCancel(\"" + oData.id + "\",\"" + oData.isActive + "\")'>" + text + "</a>");
	                        </shiro:hasPermission>
	
	                        <shiro:hasPermission name="out_log:select">
	                            $(nTd).append("&nbsp;&nbsp;<a href='javascript:void(0);' class='operate' onclick='pageOutsrcComLogLog(\"" + oData.id + "\")'>沟通日志</a>");
	                        </shiro:hasPermission>
	                    }
	                }
            ],
            "aoColumnDefs":[     //设定各列宽度   
    	          {"sWidth": "30px","aTargets": [0]},   
    	          {"sWidth": "70px","aTargets": [1],"className":'title-content'},   
    	          {"sWidth": "80px","aTargets": [2],"className":'title-content'},
    	          {"sWidth": "40px","aTargets": [3]},   
    	          {"sWidth": "200px","aTargets": [4],"className":'title-content'},
    	          {"sWidth": "70px","aTargets": [5]},   
    	          {"sWidth": "90px","aTargets": [6],"className":'title-content'},
    	          {"sWidth": "120px","aTargets": [7],"className":'title-content'},
    	          {"sWidth": "70px","aTargets": [8]},
    	          {"sWidth": "90px","aTargets": [9],"className":'title-content'},   
    	          {"sWidth": "120px","aTargets": [10]}                          
           ]
        });

  		 //行显示附加信息
        /* function format (data) {
         	 var regionDetails = data.regionList;
         	 var contentDetails = data.content;
             var tbody = "";
             var cityStr="";
              if(regionDetails!=null&&regionDetails.length>0){
                  for(var i = 0;i < regionDetails.length;i++){
                	  cityStr+=regionDetails[i].regionName+'&nbsp;'+','+'&nbsp;';
                  }
                  if(contentDetails!=undefined){
                	  tbody+= '<tr style="border-bottom:1px solid #111">'+
                	 				'<td style="width:100px">'+'辐射城市:'+'</td>'+
                	 				'<td style="text-align:left !important">'+'<div style="overflow-x:scroll;width:500px;height:50px">'+cityStr+'</div>'+'</td>'+
                	 		  '<tr>'+
                			  '<tr style="border-bottom:1px solid #111">'+
	                			  '<td style="width:100px">'+'最新沟通记录:'+'</td>'+
	                			  '<td style="text-align:left !important">'+'<div style="overflow-x:scroll;width:500px;height:50px">'+contentDetails+'</div>'+'</td>'+
                			  '<tr>';
                  }else{
                	  tbody+= '<tr style="border-bottom:1px solid #111">'+
	                	  			'<td style="width:100px">'+'辐射城市:'+'</td>'+
	                	  			'<td style="text-align:left !important">'+'<div style="overflow-x:scroll;width:500px;height:50px">'+cityStr+'</div>'+'</td>'+
                	  		  '<tr>';
                  }      		
              }
             return '<table cellpadding="5" cellspacing="0" border="0" class="rowTable">'+tbody+'</table>';
         } */
         //查看信息显示与隐藏
        /* $('#outsrcCom-dataTable tbody').on('click', 'td.details-control', function () {
            var tr = $(this).closest('tr');
            var row = table_outsrcCom.row( tr );
            if ( row.child.isShown() ) {
                row.child.hide();
                tr.removeClass('shown');
            }else{
                row.child( format(row.data()) ).show();
                tr.addClass('shown');
            }
            $('.rowTable').parent('td').parent('tr').css('background','#fff');
        }); */

      	//表格设置鼠标移入显示隐藏的内容
      	$("#outsrcCom-dataTable").on("mouseover mouseout", '.title-content', function(event){
			  if(event.type == "mouseover"){
				  var titleContent=$(this).html();
				  $(this).attr('title',titleContent);
			  }else if(event.type == "mouseout"){
				  $(this).attr('title','');
			  }
		});
  	}
  
    //启用或停用
    function enableOrCancel(id,isActive){
        var text = isActive == "Y" ? "确定停用此委外机构？" : "确定启用此委外机构？";
        MSG.confirm(text,function(){
            $.ajax({
                type : 'POST',
                dataType : "json",
                url : "<%=request.getContextPath()%>/rest/outsrcCom/enableOrCancel",
                data : {outsrcComId:id},
                success : function(ret) {
                    MSG.show(ret.message);
                    if(ret.success){
                        table_outsrcCom();
                    }
                },
                error:function(){
                    MSG.show("系统异常,稍后重试");
                }
            });
        });
    }

    //编辑数据
    function outsrcCom_editFun(regionList,id,recVer,outsrcComName,weight,brief){
        $("#edit_outsrcCom_id").val(id);
        $("#edit_outsrcCom_recVer").val(recVer);
        $("#edit_outsrcCom_outsrcComName").val(outsrcComName);
        $("#edit_outsrcCom_weight").val(weight);
        $("#edit_outsrcCom_brief").val(brief=="undefined"?"":brief);
        $("input[name=regionIds]").attr("checked",false);
        if(regionList){
            for(var i = 0;i < regionList.length;i++){
                $("#edit_outsrcCom_regionIds" + regionList[i].regionId).attr("checked", true);
            }
        }
        $("#outsrcComUpdateModal").modal("show");
    }

  	//页面加载时
    $(window).ready(function(){
    	table_outsrcCom();
    });

    //查询按钮
    $('#outsrcCom-searchBtn').on( 'click', function () {
        /* outsrcCom_table.search($("#outsrcCom-searchForm").serialize()).draw(); */
        table_outsrcCom();
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

</script>


