<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="utf-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<head>
    <title>通讯信息</title>
</head>

<div class="plms-content" style="margin-bottom:20px">
	<div class="contactor_table_scroll">
	    <table id="contactor-dataTable" cellspacing="0" width="100%">
	        <thead>
		        <tr id="contactor-dataTable-tr">
		            <th class="text-center"><div style="width:40px;">序号</div></th>
		            <th class="text-center"><div style="width:80px;">操作</div></th>
		            <th class="text-center"><div style="width:60px;">关系</div></th>
		            <th class="text-center"><div style="width:90px;">联系人姓名</div></th>
		            <th class="text-center"><div style="width:80px;">号码类型</div></th>
		            <th class="text-center"><div style="width:150px;">号码</div></th>
		            <th class="text-center"><div style="width:100px;">号码有效性</div></th>
		            <th class="text-center"><div style="width:90px;">维护人</div></th>
		            <th class="text-center"><div style="width:150px;">维护时间</div></th>
		            <th class="text-center"><div style="width:150px;">最近拨通时间</div></th>
		            <th class="text-center"><div style="width:150px;">最近拨打时间</div></th>
		            <th class="text-center"><div style="width:80px;">来源</div></th>
		        </tr>
	        </thead>
	    </table>
	    <div id="contactor-dataTable-fatherDiv" style="overflow-y:scroll; max-height:131px;width:100%;">
	    	<table id="contactor-dataTable-child" cellspacing="0" width="100%">
		    	<tbody id="contactor-dataTable-tbody" >
		    	</tbody>
			</table>
	    </div>
	</div>
<!-- 保存滚动分页的页数 -->
<input type="hidden" id="checkScrollPageCol" value="1">

<!-- 保存滚动分页中最后一条数据的序号 -->
<input type="hidden" id="checkScrollLastIndexCol" value="1">
    <!--维护窗口-->
    <div class="modal fade hideModal" id="contactor-update" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" style="width:500px">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                    <h4 class="modal-title">通讯信息-维护</h4>
                </div>
                <div class="modal-body">

                    <form class="form-horizontal" id="contactor-updateForm">

                        <!--隐藏的ID和版本号,修改数据的条件,必传-->
                        <input type="hidden" name="id" id="edit_contactor_id">
                        <input type="hidden" name="clCustId" id="edit_contactor_clCustId">
                        <input type="hidden" name="recVer" id="edit_contactor_recVer">

                        <div class="form-group">
                            <label class="col-sm-4 control-label">来源</label>
                            <div class="col-sm-6">
                                <select class="form-control mayDisabled" id="edit_contactor_srcCode" name="srcCode">
                                    <c:forEach items="${sourceList}" var="item">
                                        <option value="${item.code}">${item.val}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-4 control-label">关系</label>
                            <div class="col-sm-6">
                                <select class="form-control mayDisabled" id="edit_contactor_rltnshp" name="rltnshp">
                                    <c:forEach items="${rltnshpList}" var="item">
                                        <option value="${item.code}">${item.val}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-4 control-label"><span class="redStar">* </span>联系人姓名</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control mayDisabled" id="edit_contactor_name" name="name" data-placement="bottom">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-4 control-label">号码类型</label>
                            <div class="col-sm-6">
                                <select class="form-control mayDisabled" id="edit_contactor_telType" name="telType" onchange="changeTellType()">
                                    <c:forEach items="${telList}" var="item">
                                        <option value="${item.code}">${item.val}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-4 control-label"><span class="redStar">* </span>号码</label>
                            <div class="col-sm-8" id="telDiv_coll">
                                <input type="text" class="form-control mayDisabled" id="edit_contactor_tel" name="tel" data-placement="bottom">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-4 control-label">号码有效性</label>
                            <div class="col-sm-6">
                                <select class="form-control" id="edit_contactor_isActive" name="isActive">
                                    <option value="Y">有效</option>
                                    <option value="N">无效</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-4 control-label"></label>
                            <div class="col-sm-6">
                                <span class="redStar" id="contactMessage"></span>
                            </div>
                        </div>
                    </form>

                </div>
                <div class="modal-footer" style="padding-left:168px;margin-top:-20px">
                    <button class="btn btn-primary" type="button" class="btn blue" id="contactor-updateBtn">修改</button>
                    <button class="btn btn-primary" type="button" class="btn blue" id="contactor-deleteBtn">删除</button>
                    <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="massage-box">
    <!-- Nav tabs -->
    <a href="#pageCollectionRecord" aria-controls="home" role="tab" data-toggle="tab" class="tabToggle tabToggledown">催收记录</a>
    <!-- Tab panes -->
    <div class="tab-content">
        <div role="tabpanel" class="tab-pane active" id="pageCollectionRecord">
            <jsp:include page="pageCollectionRecord.jsp"/>
        </div>
    </div>
</div>

<script type="text/javascript">

    $(document).ready(function(){
		readyScrollTbodyCol($("#checkScrollPageCol").val(),$("#checkScrollLastIndexCol").val(),false);
		//表格自适应宽度
		var trWidth=$('#contactor-dataTable-tr').width();
		var trWidths=parseFloat(trWidth)+17;
		$('#contactor-dataTable-fatherDiv').css('width',trWidths+'px');
	});
    function autoWidth(){
    	var trWidth=$('#contactor-dataTable-tr').width();
		var trWidths=parseFloat(trWidth)+17;
		$('#contactor-dataTable-fatherDiv').css('width',trWidths+'px');
	} 
 	// 窗口变化时调用函数，设置表格自适应宽度
    $(window).on('resize', autoWidth);

	//初始化加载通讯信息的数据 pageNo当前页数    pIndex当前序号开始数 isflush是否是刷新
	function readyScrollTbodyCol(pageNoCol,pIndexCol,isflushCol){
		var applId=$("#applId").val();
		if(isflushCol == false){
			pageNoCol = parseInt(pageNoCol);
			pIndexCol = parseInt(pIndexCol);
		}else{
			pageNoCol = 1;
			pIndexCol = 1;
		}
		$.ajax({
			type : 'POST',
            dataType : "json",
            url : "<%=request.getContextPath()%>/rest/caseCollection/pageCollectionContactorData",
            data : {
            	"applIdCol":applId,
				"beginPageSizeCol":30,
				"beginPageNoCol":pageNoCol
			},
            beforeSend: function (XMLHttpRequest) {},
            success : function(dataCol) {
                var htmlCol = "";
                //返回的结果集
                var listdataCol = dataCol.result;
                for(var i=0;i<listdataCol.length;i++){
                	//判断是否为空
                	if(listdataCol[i].srcVal == null){
                		listdataCol[i].srcVal = "";
                	}
                	if(listdataCol[i].rltnshpVal == null){
                		listdataCol[i].rltnshpVal = "";
                	}
                	if(listdataCol[i].name == null){
                		listdataCol[i].name = "";
                	}
                	if(listdataCol[i].telTypeVal == null){
                		listdataCol[i].telTypeVal = "";
                	}
                	if(listdataCol[i].tel == null){
                		listdataCol[i].tel = "";
                	}
                	if(listdataCol[i].isActiveText == null){
                		listdataCol[i].isActiveText = "";
                	}
                	if(listdataCol[i].updatedUserName == null){
                		listdataCol[i].updatedUserName = "";
                	}
                	if(listdataCol[i].updateTime == null){
                		listdataCol[i].updateTime = "";
                	}
                	if(listdataCol[i].maxCallDate == null){
                		listdataCol[i].maxCallDate = "";
                	}
                	if(listdataCol[i].maxCreateTime == null){
                		listdataCol[i].maxCreateTime = "";
                	}
                    var html = "";
                    html += "<a href='javascript:void(0);' "+" id='"+listdataCol[i].id+"'" + "onclick='surveyCall(\"" + listdataCol[i].id + "\",\"" + applId + "\",\"" + listdataCol[i].rltnshp + "\",\"" + listdataCol[i].name + "\",\"" + listdataCol[i].telType + "\",\"" + listdataCol[i].tel + "\")'>呼叫</a>";
                    <shiro:hasPermission name="contactor:update">
                        html += "&nbsp;&nbsp;<a href='javascript:void(0);' " + "onclick='contactor_editFun(\"" + listdataCol[i].id + "\",\"" + listdataCol[i].clCustId + "\",\"" + listdataCol[i].recVer + "\",\"" + listdataCol[i].srcCode + "\",\"" + listdataCol[i].rltnshp + "\",\"" + listdataCol[i].name + "\",\"" + listdataCol[i].telType + "\",\"" + listdataCol[i].tel + "\",\"" + listdataCol[i].isActive + "\",\"" + listdataCol[i].createdBy + "\")'>维护</a>"
                    </shiro:hasPermission>
                	if(i%2 !=0){
                		htmlCol+="<tr ><td><div style='width:40px;'>"+(pIndexCol+i)+"</div></td>"
	                		+"<td> <div style='width:80px;'>"+html+"</div></td>"
	                		+"<td><div style='width:60px;'>"+listdataCol[i].rltnshpVal+"</div></td>"
	                		+"<td><div style='width:90px;'>"+listdataCol[i].name+"</div></td>"
	                		+"<td><div style='width:80px;'>"+listdataCol[i].telTypeVal+"</div></td>"
	                		+"<td><div style='width:150px;'>"+listdataCol[i].tel+"</div></td>"
	                		+"<td><div style='width:100px;'>"+listdataCol[i].isActiveText+"</div></td>"
	                		+"<td><div style='width:90px;'>"+listdataCol[i].updatedUserName+"</div></td>"
	                		+"<td><div style='width:150px;'>"+formatDate(listdataCol[i].updateTime)+"</div></td>"
	                		+"<td><div style='width:150px;'>"+formatDate(listdataCol[i].maxCallDate)+"</div></td>"
	                		+"<td><div style='width:150px;'>"+formatDate(listdataCol[i].maxCreateTime)+"</div></td>"
	                		+"<td><div style='width:80px;'>"+listdataCol[i].srcVal+"</div></td></tr>";
                	}else{
                		htmlCol+="<tr class='odde'><td><div style='width:40px;'>"+(pIndexCol+i)+"</div></td>"
                		+"<td><div style='width:80px;'>"+html+"</div></td>"
                		+"<td ><div style='width:60px;'>"+listdataCol[i].rltnshpVal+"</div></td>"
                		+"<td ><div style='width:90px;'>"+listdataCol[i].name+"</div></td>"
                		+"<td ><div style='width:80px;'>"+listdataCol[i].telTypeVal+"</div></td>"
                		+"<td ><div style='width:150px;'>"+listdataCol[i].tel+"</div></td>"
                		+"<td ><div style='width:100px;'>"+listdataCol[i].isActiveText+"</div></td>"
                		+"<td ><div style='width:90px;'>"+listdataCol[i].updatedUserName+"</div></td>"
                		+"<td ><div style='width:150px;'>"+formatDate(listdataCol[i].updateTime)+"</div></td>"
                		+"<td ><div style='width:150px;'>"+formatDate(listdataCol[i].maxCallDate)+"</div></td>"
                		+"<td ><div style='width:150px;'>"+formatDate(listdataCol[i].maxCreateTime)+"</div></td>"
                		+"<td ><div style='width:80px;'>"+listdataCol[i].srcVal+"</div></td></tr>";
                	}
                }
                //修改当前分页数和当前分页中最后一条数据的序号
                $("#checkScrollPageCol").val(pageNoCol+1);
                $("#checkScrollLastIndexCol").val(pIndexCol+30);
                if(isflushCol == true){
                	$("#contactor-dataTable-tbody").empty();
                }
              $("#contactor-dataTable-tbody").append(htmlCol);
            }
		});
		//表格设置鼠标移入显示隐藏的内容
      	$("#contactor-dataTable-tbody").on("mouseover mouseout", '.titlecontent', function(event){
			  if(event.type == "mouseover"){
				  var titleContent=$(this).html();
				  $(this).attr('title',titleContent);
			  }else if(event.type == "mouseout"){
				  $(this).attr('title','');
			  }
		});
	}


	//滚动条事件
	$("#contactor-dataTable-fatherDiv").scroll(function(){
		//滚动条位置
		var scrollTopCol = $("#contactor-dataTable-fatherDiv").scrollTop();
		//可视窗口的高度
		var viewportHeightCol = $("#contactor-dataTable-fatherDiv").height();
		//整个页面可以滚动的高度
		var scrollHeightCol = $("#contactor-dataTable-fatherDiv")[0].scrollHeight;
		//如果滚动条的位置+可视窗口的高度=整个页面可以滚动的高度，那么就调用相应的函数加载数据
		if(scrollTopCol+viewportHeightCol==scrollHeightCol){
			readyScrollTbodyCol($("#checkScrollPageCol").val(),$("#checkScrollLastIndexCol").val(),false);
		}
	});

	//滚动条事件
	/* $(document).ready(function(){
		table_contactor();
	});
	var table_contactor;
	
	function table_contactor(){
		  table_contactor = $('#contactor-dataTable').dataTable( {
				"scrollY": '188px',
				"scrollX": '100%',
		        "scrollCollapse": true,
		        "paging": false,
		        "bSort": false,							//是否排序功能
		        "sPaginationType": "full_numbers",      //设置分页控件的模式
	            "bLengthChange": false,                 //改变每页显示数据数量
	      	    "bPaginate": false,                     //是否翻页功能
	      	    "bFilter": false,                       //是否过滤功能
	     	    "bInfo": false,							//是否页脚信息
	    		"bAutoWidth": true,                    //是否自动宽度
			});
	} */

    //点击呼叫
    function surveyCall(hrefId,applId,rltnshp,name,telType,tel) {
    	$("#" + hrefId).hide();
        //号码类型不为 移动电话、固话、公司时
        if(telType != "MOBPHONE" && telType != "FIXPHONE" && telType != "UNIT"){
            MSG.show("不支持通话的号码类型");
            $("#" + hrefId).show();
            return;
        }
        //手机或固话正则校验
        if(!(/^1[3|4|5|7|8]\d{9}$/.test(tel)) && !(/^((0\d{2,3})-)?(\d{7,8})(-(\d{3,}))?$/.test(tel))){
            $("#" + hrefId).show();
            MSG.show("手机号码或固话格式有误");
            return;
        }
        var cntrctNo = $.trim($("#cntrctNo").text());
        var custName = $.trim($("#custName").text());
        var idCardNo = $.trim($("#idCardNo").text());
        //var data = "applId=" + applId + "&cntrctNo=" + cntrctNo + "&custName=" + custName + "&idCardNo=" + idCardNo + "&dest=" + tel + "&rltnshp=" + rltnshp + "&callBy=" + name + "&deptype=collect&phoneSource=1";
        $.ajax({
            "type" : 'POST',
            "url" : "<%=request.getContextPath()%>/rest/surveyCall/callUp",
            "dataType" : "json",
            "data" : {
                 applId:(applId == 'null' ? "": applId)
                ,cntrctNo:cntrctNo
                ,custName:custName
                ,idCardNo:idCardNo
                ,dest:tel
                ,rltnshp:(rltnshp == 'null' ? "": rltnshp)
                ,callBy:name
                ,deptype:"collect"
                ,phoneSource:1
            },
            "success" : function(ret) {
                if(ret.success){
                    var $collectionRecordBtn = $("#collectionRecordBtn");
                    if($collectionRecordBtn.hasClass("beenDisabled")){
                        $(".collectionRecordMayDisabled").attr("disabled",false);
                        $("#collectionRecordUpdateBtn").hide();
                        $("#collectionRecordResetBtn").show();
                        $collectionRecordBtn.val("新增");
                        $collectionRecordBtn.removeClass("beenDisabled");
                    }
                    $("#collectionRecordForm").resetForm();
                    //催收类型默认为电话
                    var $collectMthd = $("#collectMthd");
                    $collectMthd.html(mthdHtml);
                    $collectMthd.val("PHONE");
                    $collectMthd.trigger("change");
                    $("#contactor").val(name);
                    $("#tel").val(tel);
                    $("#rltn").val(rltnshp);
                }
                MSG.show(ret.message);
            },
            "error":function(errorData){
                MSG.show("呼叫请求失败");
            }
        });
        $("#" + hrefId).show();
    }

    //编辑数据
    function contactor_editFun(id,clCustId,recVer,srcCode, rltnshp, name, telType,tel,isActive,createdBy) {
    	//移除验证提示
        $(".tooltip").remove();
    	$("#edit_contactor_id").val(id);
        $("#edit_contactor_clCustId").val(clCustId);
        $("#edit_contactor_recVer").val(recVer);
        $("#edit_contactor_name").val(name);

        $("#edit_contactor_srcCode").val(srcCode);
        $("#edit_contactor_rltnshp").val(rltnshp);
        $("#edit_contactor_telType").val(telType);
        //如果是单位 固话 和传真
        if(telType == "FIXPHONE" || telType == "FAX" || telType == "UNIT"){
        	var tels = tel.split("-");
        	//修改输入框
            var html = "<input type=\"tel\" class=\"form-control mayDisabled\" style=\"float: left;width: 62px !important;\" id=\"telNumber1\" name=\"area\" placeholder=\"区号\">"
                +"<span style=\"float: left;\">-</span>"
                +"<input type=\"tel\" class=\"form-control mayDisabled\" style=\"float: left;width: 95px !important;\" id=\"telNumber\" name=\"tel\" placeholder=\"电话号码\">"
                +"<span style=\"float: left;\">-</span>"
                +"<input type=\"tel\" class=\"form-control mayDisabled\" style=\"float: left;width: 95px !important;\" id=\"telNumber2\" name=\"ext\" placeholder=\"分机号\">";
            $("#telDiv_coll").empty();
            $("#telDiv_coll").append(html);
            if(tels.length == 2){
                $("#telNumber1").val(tels[0]);
            	$("#telNumber").val(tels[1]);
            }else{
            	$("#telNumber1").val(tels[0]);
                $("#telNumber").val(tels[1]);
                $("#telNumber2").val(tels[2]);
            }
            //更改验证规则
            $("#telNumber").rules("remove");
            $("#telNumber").rules("add",{
                required: true,
                telTel:true,
                messages:{  
                    required: "请输入号码" 
                }
                
            }); 
            $("#telNumber1").rules("add",{
                required: true,
                telArea:true,
                messages:{  
                    required: "请输入区号" 
                }
            });
            $("#telNumber2").rules("add",{
                telExt: true
            });
        //如果是手机号
        }else if(telType == "MOBPHONE"){
        	//修改输入框
            $("#telDiv_coll").empty();
            $("#telDiv_coll").append("<input type=\"tel\" class=\"form-control mayDisabled\" id=\"edit_contactor_tel\" name=\"tel\">");
            $("#edit_contactor_tel").val(tel);
            //更改验证规则
            $("#edit_contactor_tel").rules("remove");
            $("#edit_contactor_tel").rules("add",{
                required: true,
                mobileCN:true,
                messages:{  
                    required: "请输入号码" 
                }
            });
        }else if(telType ==  "EMAIL"){
        	//修改输入框
            $("#telDiv_coll").empty();
            $("#telDiv_coll").append("<input type=\"tel\" class=\"form-control mayDisabled\" id=\"edit_contactor_tel\" name=\"tel\">");
            $("#edit_contactor_tel").val(tel);
            //更改验证规则
            $("#edit_contactor_tel").rules("remove");
            $("#edit_contactor_tel").rules("add",{
                required: true,
                emailCN:true,
                messages:{  
                    required: "请输入邮件地址" 
                }
            });
        }else if(telType ==  "WEIXIN"){
        	$("#telDiv_coll").empty();
            $("#telDiv_coll").append("<input type=\"tel\" class=\"form-control mayDisabled\" id=\"edit_contactor_tel\" name=\"tel\">");
            $("#edit_contactor_tel").val(tel);
            //更改验证规则
            $("#edit_contactor_tel").rules("remove");
            $("#edit_contactor_tel").rules("add",{
                required: true,
                weiXin:true,
                messages:{  
                    required: "请输入微信号" 
                }
            });
        }else{
        	//修改输入框
            $("#telDiv_coll").empty();
            $("#telDiv_coll").append("<input type=\"tel\" class=\"form-control mayDisabled\" id=\"edit_contactor_tel\" name=\"tel\">");
            $("#edit_contactor_tel").val(tel);
            //更改验证规则
            $("#edit_contactor_tel").rules("remove");
            $("#edit_contactor_tel").rules("add",{
                required: true,
                numDigital:true,
                messages:{  
                    required: "请输入号码" 
                }
                
            });
        }
        $("#edit_contactor_isActive").val(isActive);

        $("#contactMessage").text("");

        //当前用户等于此条数据的创建人,可以删除和修改
        deleteBtnShowOrHide(createdBy,$("#contactor-deleteBtn"));

        //弹窗id唯一
        $("#contactor-update").modal("show");
    }

    //维护按钮提交，按钮ID唯一
    $('#contactor-updateBtn').on( 'click', function () {
        var $updateForm = $('#contactor-updateForm');
        //表单校验
        if (!$updateForm.valid()){
            return false;
        }
        $(".mayDisabled").prop("disabled",false); //移除disabled属性，在不动后台校验的情况下，防止后台校验数据为空报错 update by zhengjizhao date:20161122 
        $.ajax({
            "type" : 'POST',
            "url" : "<%=request.getContextPath()%>/rest/cust/updateContactor",
            "dataType" : "json",
            "data" : $updateForm.serialize(),
            "success" : function(ret) {
                if(ret.success){
                    readyScrollTbodyCol(1,1,true);
                    $("#contactor-update").modal("hide");
                    MSG.show(ret.message);
                }else{
                    $("#contactMessage").text(ret.message);
                }
            },
            "error":function(errorData){
                MSG.show("修改通讯信息失败");
            }
        });
    });

    //删除按钮提交，按钮ID唯一
    $('#contactor-deleteBtn').on( 'click', function () {
        MSG.confirm('确定删除？',function(){
            $.ajax({
                "type" : 'POST',
                "url" : "<%=request.getContextPath()%>/rest/cust/deleteContactor",
                "dataType" : "json",
                "data" : $("#contactor-updateForm").serialize(),
                "success" : function(ret) {
                    if(ret.success){
                        readyScrollTbodyCol(1,1,true);
                        $("#contactor-update").modal("hide");
                        MSG.show(ret.message);
                    }else{
                        $("#contactMessage").text(ret.message);
                    }
                },
                "error":function(errorData){
                    MSG.show("修改通讯信息失败");
                }
            });
        });
    });

    $(document).ready(function() {
        //维护表单校验
        contactor_validate($("#contactor-updateForm"));
    });

    //表单校验
    function contactor_validate($validateForm){
        $validateForm.validate({
        	unhighlight: function (element, errorClass, validClass) { //验证通过
                $(element).tooltip("destroy").removeClass(errorClass);
            },
            errorPlacement: function (label, element) {
                //让验证提示显示在验证框下面 注：有些地方如果动态添加这个属性不成功就手动添加data-placement="bottom"属性
                $(element).attr("data-placement","bottom");
                $(element).tooltip("destroy"); /*必需*/
                $(element).attr("title", $(label).text()).tooltip("show"); 
            },
        	rules: {
                tel: {
                    required: true,minlength:2
                },
                name: {
                    required: true,minlength:2,maxlength:20
                }
            },
            messages: {
                tel: {
                    required: "请输入号码"
                },
                name: {
                    required: "请输入联系人姓名"
                }
            }
        });
    }
  //时间戳转时间格式
	function   formatDate(now){
	  if(now==""||now==null){
		  return "";
	  }
		var date = new Date(now);
        var   year=date.getFullYear();     
        var   month=date.getMonth()+1;     
        var   day=date.getDate();     
        var   hour=date.getHours();     
        var   minute=date.getMinutes();     
        var   second=date.getSeconds();     
        return   year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second;     
    }
	//变更号码类型时事件
    function changeTellType(){
            //如果是移动电话
            if($("#edit_contactor_telType option:selected").val() == "MOBPHONE"){
                //修改输入框
                $("#telDiv_coll").empty();
                $("#telDiv_coll").append("<input type=\"tel\" class=\"form-control mayDisabled\" id=\"edit_contactor_tel\" name=\"tel\">");
                //更改验证规则
                $("#edit_contactor_tel").rules("remove");
                $("#edit_contactor_tel").rules("add",{
                    required: true,
                    mobileCN:true,
                    messages:{  
                        required: "请输入号码" 
                    }
                });
            }
            //如果是固话 传真 公司
            else if($("#edit_contactor_telType option:selected").val() == "FIXPHONE" || $("#edit_contactor_telType option:selected").val()=="FAX" || $("#edit_contactor_telType option:selected").val()=="UNIT"){
                //修改输入框
                var html = "<input type=\"tel\" class=\"form-control mayDisabled\" style=\"float: left;width: 62px !important;\" id=\"telNumber1\" name=\"area\" placeholder=\"区号\">"
                    +"<span style=\"float: left;\">-</span>"
                    +"<input type=\"tel\" class=\"form-control mayDisabled\" style=\"float: left;width: 95px !important;\" id=\"telNumber\" name=\"tel\" placeholder=\"电话号码\">"
                    +"<span style=\"float: left;\">-</span>"
                    +"<input type=\"tel\" class=\"form-control mayDisabled\" style=\"float: left;width: 95px !important;\" id=\"telNumber2\" name=\"ext\" placeholder=\"分机号\">";
                $("#telDiv_coll").empty();
                $("#telDiv_coll").append(html);
                //更改验证规则
                $("#telNumber").rules("remove");
                $("#telNumber").rules("add",{
                    required: true,
                    telTel:true,
                    messages:{  
                        required: "请输入号码" 
                    }
                    
                }); 
                $("#telNumber1").rules("add",{
                    required: true,
                    telArea:true,
                    messages:{  
                        required: "请输入区号" 
                    }
                });
                $("#telNumber2").rules("add",{
                    telExt: true
                });
            }
            //如果是邮箱
            else if($("#edit_contactor_telType option:selected").val() == "EMAIL"){
                //修改输入框
                $("#telDiv_coll").empty();
                $("#telDiv_coll").append("<input type=\"tel\" class=\"form-control mayDisabled\" id=\"edit_contactor_tel\" name=\"tel\">");
                //更改验证规则
                $("#edit_contactor_tel").rules("remove");
                $("#edit_contactor_tel").rules("add",{
                    required: true,
                    emailCN:true,
                    messages:{  
                        required: "请输入邮件地址" 
                    }
                });
            //如果是微信
            }else if($("#edit_contactor_telType option:selected").val() == "WEIXIN"){
                $("#telDiv_coll").empty();
                $("#telDiv_coll").append("<input type=\"tel\" class=\"form-control mayDisabled\" id=\"edit_contactor_tel\" name=\"tel\">");
                //更改验证规则
                $("#edit_contactor_tel").rules("remove");
                $("#edit_contactor_tel").rules("add",{
                    required: true,
                    weiXin:true,
                    messages:{  
                        required: "请输入微信号" 
                    }
                });
            }
            else{
                //修改输入框
                $("#telDiv_coll").empty();
                $("#telDiv_coll").append("<input type=\"tel\" class=\"form-control mayDisabled\" id=\"edit_contactor_tel\" name=\"tel\">");
                //更改验证规则
                $("#edit_contactor_tel").rules("remove");
                $("#edit_contactor_tel").rules("add",{
                    required: true,
                    numDigital:true,
                    messages:{  
                        required: "请输入号码" 
                    }
                    
                });
            }
        
    }
	//列表显示和隐藏
   /* function clickhideT(temp){
       //如果点击的隐藏按钮
       if(temp == "hideT"){
           $("#hideButT").hide();
           $("#contactor-dataTable").hide();
           $("#showButT").show();
       }
       //如果点击的显示按钮
       else if(temp == "showT"){
           $("#showButT").hide();
           $("#contactor-dataTable").show();
           $("#hideButT").show();
       }
   } */

</script>
