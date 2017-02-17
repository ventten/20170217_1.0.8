<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" pageEncoding="utf-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<head>
<title>通讯信息</title>
</head>
<div class="plms-content">
	<div class="panel-body">
		<form class="searchForm" id="contactor-searchForm">
			<label for="srcCode" class="right-space-2">来源</label>
			<select id="srcCode" name="srcCode" class="right-space-2">
				<option value="">全部</option>
				<c:forEach items="${sourceList}" var="item">
					<option value="${item.code}">${item.val}</option>
				</c:forEach>
			</select>
			<label for="name" class="right-space-2">联系人姓名</label>
			<input type="text" id="name" name="name" class="right-space-2"/>
			<!--客户ID，说明哪个用户下的数据-->
			<input type="hidden" value="${clCustId}" name="clCustId">
			<input class="btn btn-primary right-space-2" type="button" id="contactor-searchBtn" value="查询" />
			<shiro:hasPermission name="contactor:insert">
				<input class="btn btn-primary" type="button" value="新增"  onclick="initialize()" />
			</shiro:hasPermission>
		</form>
	</div>
	<table id="contactor-dataTable" class="display dataTable" cellspacing="0" width="100%" style="table-layout:fixed">
		<thead>
			<tr>
				<th class="text-center">来源</th>
				<th class="text-center">关系</th>
				<th class="text-center">联系人姓名</th>
				<th class="text-center">号码类型</th>
				<th class="text-center">号码</th>
				<th class="text-center">号码有效性</th>
				<th class="text-center">维护人</th>
				<th class="text-center">维护时间</th>
				<th class="text-center">操作</th>
			</tr>
		</thead>
	</table>
	<!--添加窗口-->
	<div class="modal fade hideModal" id="contactor-add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog oneCol_dialog" style="width:450px">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
					<h4 class="modal-title">通讯信息-新增</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="addForm_cont">
						<!--客户ID，说明哪个用户下的数据-->
						<input type="hidden" value="${clCustId}" name="clCustId">
						<div class="form-group">
							<label class="col-sm-3 control-label">来源</label>
							<div class="col-sm-6">
								<select class="form-control" name="srcCode">
									<c:forEach items="${sourceList}" var="item">
										<c:if test="${('NETWORK' eq item.code) == true || ('EXTMECHAN' eq item.code) == true}">
                                            <option value="${item.code}">${item.val}</option>
                                        </c:if>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">关系</label>
							<div class="col-sm-6">
								<select class="form-control" name="rltnshp">
									<c:forEach items="${rltnshpList}" var="item">
										<option value="${item.code}">${item.val}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">
								<span class="redStar">* </span>
								联系人姓名
							</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="contac-name" data-placement="bottom" name="name" required="required">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">号码类型</label>
							<div class="col-sm-6">
								<select class="form-control" name="telType" id="telTypeone" onchange="changeTellType('add')">
									<c:forEach items="${telList}" var="item">
										<c:if test="${('UNIT' eq item.code) == false}">
											<option value="${item.code}">${item.val}</option>
										</c:if>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">
								<span class="redStar">* </span>
								号码
							</label>
							<div class="col-sm-9" id="telDiv">
								<input type="tel" class="form-control" data-placement="bottom" id="telNumber" name="tel">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label"></label>
							<div class="col-sm-6">
								<span class="redStar redStarMessages"></span>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button class="btn btn-primary" type="button" class="btn blue addBtn" id="contactor-addBtn">新增</button>
					<button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
				</div>
			</div>
		</div>
	</div>
	<!--维护窗口-->
	<div class="modal fade hideModal" id="contactor-update" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" style="width:450px">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
					<h4 class="modal-title">通讯信息-维护</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="updateForm_pageConta">
						<!--隐藏的ID和版本号,修改数据的条件,必传-->
						<input type="hidden" name="id" id="edit_contactor_id">
						<input type="hidden" name="recVer" id="edit_contactor_recVer">
						<input type="hidden" value="${clCustId}" name="clCustId">
						<div class="form-group">
							<label class="col-sm-3 control-label">来源</label>
							<div class="col-sm-6">
								<select class="form-control mayDisabled" id="edit_contactor_srcCode" name="srcCode">
									<c:forEach items="${sourceList}" var="item">
										<option value="${item.code}">${item.val}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">关系</label>
							<div class="col-sm-6">
								<select class="form-control mayDisabled" id="edit_contactor_rltnshp" name="rltnshp">
									<c:forEach items="${rltnshpList}" var="item">
										<option value="${item.code}">${item.val}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">
								<span class="redStar">* </span>
								联系人姓名
							</label>
							<div class="col-sm-6">
								<input type="text" class="form-control mayDisabled" data-placement="bottom" id="edit_contactor_name" name="name">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">号码类型</label>
							<div class="col-sm-6">
								<select class="form-control mayDisabled" id="edit_contactor_telType" name="telType" onchange="changeTellType('update')">
									<c:forEach items="${telList}" var="item">
										<option value="${item.code}">${item.val}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">
								<span class="redStar">* </span>
								号码
							</label>
							<div class="col-sm-9" id="telDivUp">
								<input type="text" class="form-control mayDisabled" data-placement="bottom" id="edit_contactor_tel" name="tel">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">号码有效性</label>
							<div class="col-sm-6">
								<select class="form-control" id="edit_contactor_isActive" name="isActive">
									<option value="Y">有效</option>
									<option value="N">无效</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label"></label>
							<div class="col-sm-6">
								<span class="redStar redStarMessages"></span>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button class="btn btn-primary" type="button" class="btn blue" id="contactor-updateBtn">修改</button>
					<button class="btn btn-primary" type="button" class="btn blue" id="contactor-deleteBtn">删除</button>
					<button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
				</div>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript" language="javascript">

    //选项卡点击
    $("#pageContactorLi").on('click', function () {
        var $this = $(this);
        if(!$this.hasClass("hasInit")){
            $this.addClass("hasInit");
            contactor_init();
        }
    });

    //分页Table
    var contactor_table;

    //Table初始化方法
    function contactor_init(){
    	contactor_table=$('#contactor-dataTable').DataTable({
             "sScrollXInner": "100%",
             "bScrollCollapse": true,

             "sPaginationType": "full_numbers",      //设置分页控件的模式
             "bLengthChange": false,                 //改变每页显示数据数量
             "bPaginate": true,                      //是否翻页功能
             "bFilter": false,                       //是否过滤功能
             "bInfo": true,                         //是否页脚信息
             "bSort": false,                            //是否排序功能

             "bAutoWidth": true,                    //是否自动宽度
             "bStateSave": false,                    //是否记忆配置,记录在cookies中

             "iDisplayLength": 15,
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
             "sAjaxSource" : "<%=request.getContextPath()%>/rest/cust/pageContactorData",
             "fnServerData" : function(sSource, aoData, fnCallback) {
                 //参数拼接
                 var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#contactor-searchForm").serialize();
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
				 {"mData" : "srcVal","sDefaultContent" : ""},
                 {"mData" : "rltnshpVal","sDefaultContent" : ""},
                 {"mData" : "name","sDefaultContent" : ""},
                 {"mData" : "telTypeVal","sDefaultContent" : ""},
                 {"mData" : "tel","sDefaultContent" : ""},
                 {"mData" : "isActiveText","sDefaultContent" : ""},
                 {"mData" : "updatedUserName","sDefaultContent" : ""},
                 {"mData" : "updateTime","sDefaultContent" : ""},
                 {"mData" : null,"sDefaultContent" : "",
                     "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                         <shiro:hasPermission name="contactor:update">
                             $(nTd).html("<a href='javascript:void(0);' onclick='contactor_editFun(\"" + oData.id + "\",\"" + oData.createdBy + "\")'>维护</a>");
                         </shiro:hasPermission>
                     }
                 }
             ]
         });
       }

    //编辑数据(点击维护按钮)
    function contactor_editFun(id,createdBy) {
		$(".redStarMessages").text("");
    	//移除验证提示
        $(".tooltip").remove();
        $("#updateForm_pageConta input[type='text']").val("");  
        $("#updateForm_pageConta select").find("option:first").prop("selected",true);
        $.ajax({
            type: "post",
            dataType: "json",
            data:{"id":id},
            url: "<%=request.getContextPath()%>/rest/cust/findContactor",
            success: function(datat){
                //如果查询失败
                if(!datat.success){
                    MSG.show(datat.message);
                }else{
                	$("#edit_contactor_id").val(datat.data.id);
                    $("#edit_contactor_recVer").val(datat.data.recVer);
                    $("#edit_contactor_name").val(datat.data.name);
                    $("#edit_contactor_telType").val(datat.data.telType);
                    //如果是固话 传真 单位号
                    if(datat.data.telType == "FIXPHONE" || datat.data.telType == "FAX" || datat.data.telType == "UNIT"){
                    	//修改输入框
                        var html = "<input type=\"tel\" class=\"form-control mayDisabled\" style=\"float: left;width: 62px !important;\" id=\"areaPo\" name=\"area\" placeholder=\"区号\" "+datat.data.area+">"
                            +"<span style=\"float: left;\">-</span>"
                            +"<input type=\"tel\" class=\"form-control mayDisabled\" style=\"float: left;width: 95px !important;\" id=\"telPo\" name=\"tel\" placeholder=\"电话号码\" "+datat.data.tel+">"
                            +"<span style=\"float: left;\">-</span>"
                            +"<input type=\"tel\" class=\"form-control mayDisabled\" style=\"float: left;width: 95px !important;\" id=\"extPo\" name=\"ext\" placeholder=\"分机号\" "+datat.data.ext+" data-placement=\"bottom\">";
                        $("#telDivUp").empty();
                        $("#telDivUp").append(html);
                        //赋值
                        $("#areaPo").val(datat.data.area);
                        $("#telPo").val(datat.data.tel);
                        $("#extPo").val(datat.data.ext);
                      //更改验证规则
                        $("#telPo").rules("remove");
                        $("#telPo").rules("add",{
                            required: true,
                            maxlength: 8,
                            telTel:true,
                            messages:{  
                                required: "请输入号码"
                            }
                            
                        }); 
                        $("#areaPo").rules("add",{
                            required: true,
                            maxlength: 4,
                            telArea:true,
                            messages:{  
                                required: "请输入区号" 
                            }
                        });
                        $("#extPo").rules("add",{
                        	maxlength: 4,
                        	telExt: true
                        });
                    //如果是移动号
                    }else if(datat.data.telType == "MOBPHONE"){
                    	$("#telDivUp").empty();
                        $("#telDivUp").append("<input type=\"tel\" class=\"form-control mayDisabled\" id=\"edit_contactor_tel\" name=\"tel\">");
                        $("#edit_contactor_tel").val(datat.data.tel);
                      //更改验证规则
                        $("#edit_contactor_tel").rules("remove");
                        $("#edit_contactor_tel").rules("add",{
                            required: true,
                            maxlength: 11,
                            mobileCN:true,
                            messages:{  
                                required: "请输入手机号" 
                            }
                        });
                    //如果是邮箱地址   
                    }else if(datat.data.telType == "EMAIL"){
                    	$("#telDivUp").empty();
                        $("#telDivUp").append("<input type=\"tel\" class=\"form-control mayDisabled\" id=\"edit_contactor_tel\" name=\"tel\">");
                    	$("#edit_contactor_tel").val(datat.data.tel);
                        //更改验证规则
                        $("#edit_contactor_tel").rules("remove");
                        $("#edit_contactor_tel").rules("add",{
                            required: true,
                            maxlength: 50,
                            emailCN:true,
                            messages:{  
                                required: "请输入邮件地址" 
                            }
                        });
                     //微信
                    }else if(datat.data.telType == "WEIXIN"){
                        $("#telDivUp").empty();
                        $("#telDivUp").append("<input type=\"tel\" class=\"form-control mayDisabled\" id=\"edit_contactor_tel\" name=\"tel\">");
                        $("#edit_contactor_tel").val(datat.data.tel);
                        //更改验证规则
                        $("#edit_contactor_tel").rules("remove");
                        $("#edit_contactor_tel").rules("add",{
                            required: true,
                            maxlength: 20,
                            weiXin:true,
                            messages:{  
                                required: "请输入微信号" 
                            }
                        });
                    // QQ
                    }else{
                    	$("#telDivUp").empty();
                        $("#telDivUp").append("<input type=\"tel\" class=\"form-control mayDisabled\" id=\"edit_contactor_tel\" name=\"tel\">");
                    	$("#edit_contactor_tel").val(datat.data.tel);
                        //更改验证规则
                        $("#edit_contactor_tel").rules("remove");
                        $("#edit_contactor_tel").rules("add",{
                        	required: true,
                            maxlength: 12,
                            numDigital:true,
                            messages:{  
                                required: "请输入号码" 
                            }
                        });
                    }

                    $("#edit_contactor_srcCode").val(datat.data.srcCode);
                    $("#edit_contactor_rltnshp").val(datat.data.rltnshp);
                    $("#edit_contactor_isActive").val(datat.data.isActive);
                    //当前人不为数据的创建人，其没有数据更改的权限，只有修改数据“是否有效”的权限
                    deleteBtnShowOrHide(createdBy,$("#contactor-deleteBtn"));

                    //弹窗id唯一
                    $("#contactor-update").modal("show");
                }
            },
            error:function(errorData){
                MSG.show("系统异常,稍后重试");
            }
        });
    }

    //查询按钮提交，按钮ID唯一
    $('#contactor-searchBtn').on( 'click', function () {
        contactor_table.search($("#contactor-searchForm").serialize()).draw();
    });

    //新增按钮提交，按钮ID唯一
    $('#contactor-addBtn').on( 'click', function () {
        //表单校验
        if (!$('#contactor-add #addForm_cont').valid()){
            return false;
        }
        var form = $(this).parents(".modal-dialog").find("#addForm_cont");
        var content = $(this).parents(".plms-content");
        P.addPost("<%=request.getContextPath()%>/rest/cust/addContactor",form,content,contactor_table);
    });

    //维护按钮提交，按钮ID唯一
    $('#contactor-updateBtn').on( 'click', function () {
        //表单校验
        if (!$("#updateForm_pageConta").valid()){
            return false;
        }
    	$(".mayDisabled").prop("disabled",false); //移除disabled属性，在不动后台校验的情况下，防止后台校验数据为空报错 update by zhengjizhao date:20161122 
        var form = $(this).parents(".modal-dialog").find("#updateForm_pageConta");
        var content = $(this).parents(".plms-content");
        P.updatePost("<%=request.getContextPath()%>/rest/cust/updateContactor",form,content,contactor_table);
    });

    //删除按钮提交，按钮ID唯一
    $('#contactor-deleteBtn').on( 'click', function () {
        var form = $(this).parents(".modal-dialog").find("#updateForm_pageConta");
        var content = $(this).parents(".plms-content");
        MSG.confirm('确定删除？',function(){
            P.deletePost("<%=request.getContextPath()%>/rest/cust/deleteContactor",form,content,contactor_table);
        });
    });

    $(document).ready(function() {
        //新增表单校验
        contactor_validate($("#contactor-add #addForm_cont"));
        //维护表单校验
        contactor_validate($("#updateForm_pageConta"));
    });

    //表单校验  第一个参数为选择器，第二个参数为传入改变的的验证方式
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
                    required: true,
                    rangelength: 11,
                    mobileCN:true
                },
                name: {
                    required: true,minlength:2,maxlength:20
                }
            },
            messages: {
                tel: {
                    required: "请输入手机号"
                },
                name: {
                    required: "请输入联系人姓名"
                }
            }
        });
    }

	//变更号码类型时事件
	function changeTellType(obj){
		if(obj =="add"){
			 $("#addForm_cont").validate();
			//如果是移动电话
			if($("#telTypeone option:selected").val() == "MOBPHONE"){
				//修改输入框
				$("#telDiv").empty();
				$("#telDiv").append("<input type=\"tel\" class=\"form-control mayDisabled\" id=\"telNumber\" name=\"tel\">");
				//更改验证规则
				$("#telNumber").rules("remove");
				$("#telNumber").rules("add",{
					required: true,
					maxlength: 11,
					mobileCN:true,
                    messages:{  
                        required: "请输入号码" 
                    }
				});
			}
			//如果是固话 传真 公司
			else if($("#telTypeone option:selected").val() == "FIXPHONE" || $("#telTypeone option:selected").val()=="FAX" || $("#telTypeone option:selected").val()=="UNIT"){
				//修改输入框
				var html = "<input type=\"tel\" class=\"form-control mayDisabled\" style=\"float: left;width: 62px !important;\" id=\"telNumber1\" name=\"area\" placeholder=\"区号\">"
	                +"<span style=\"float: left;\">-</span>"
	                +"<input type=\"tel\" class=\"form-control mayDisabled\" style=\"float: left;width: 95px !important;\" id=\"telNumber\" name=\"tel\" placeholder=\"电话号码\">"
	                +"<span style=\"float: left;\">-</span>"
	                +"<input type=\"tel\" class=\"form-control mayDisabled\" style=\"float: left;width: 95px !important;\" id=\"telNumber2\" name=\"ext\" placeholder=\"分机号\" data-placement=\"bottom\">";
                $("#telDiv").empty();
                $("#telDiv").append(html);
                //更改验证规则
				$("#telNumber").rules("remove");
				$("#telNumber").rules("add",{
					required: true,
					maxlength: 8,
					telTel:true,
					messages:{  
                        required: "请输入号码" 
                    }
					
				}); 
				$("#telNumber1").rules("add",{
                    required: true,
                    maxlength: 4,
                    telArea:true,
                    messages:{  
                        required: "请输入区号" 
                    }
                });
				$("#telNumber2").rules("add",{
					maxlength: 4,
                    telExt: true
                });
			}
			//如果是邮箱
			else if($("#telTypeone option:selected").val() == "EMAIL"){
				//修改输入框
                $("#telDiv").empty();
                $("#telDiv").append("<input type=\"tel\" class=\"form-control mayDisabled\" id=\"telNumber\" name=\"tel\">");
                //更改验证规则
				$("#telNumber").rules("remove");
				$("#telNumber").rules("add",{
					required: true,
					maxlength: 50,
					emailCN:true,
					messages:{  
				        required: "请输入邮件地址" 
				    }
				});
			//如果是微信
			}else if($("#telTypeone option:selected").val() == "WEIXIN"){
                $("#telDiv").empty();
                $("#telDiv").append("<input type=\"tel\" class=\"form-control mayDisabled\" id=\"telNumber\" name=\"tel\">");
                //更改验证规则
                $("#telNumber").rules("remove");
                $("#telNumber").rules("add",{
                    required: true,
                    maxlength: 20,
                    weiXin:true,
                    messages:{  
                        required: "请输入微信号" 
                    }
                });
			}
			//QQ
			else{
				//修改输入框
                $("#telDiv").empty();
                $("#telDiv").append("<input type=\"tel\" class=\"form-control mayDisabled\" id=\"telNumber\" name=\"tel\">");
                //更改验证规则
				$("#telNumber").rules("remove");
				$("#telNumber").rules("add",{
					required: true,
					maxlength: 12,
					numDigital:true,
					messages:{  
                        required: "请输入号码" 
                    }
					
				});
			}
		}else{
			$("#updateForm_pageConta").validate();
			//如果是移动电话
			if($("#edit_contactor_telType option:selected").val() == "MOBPHONE"){
				//修改输入框
                $("#telDivUp").empty();
                $("#telDivUp").append("<input type=\"tel\" class=\"form-control mayDisabled\" id=\"edit_contactor_tel\" name=\"tel\">");
                //更改验证规则
				$("#edit_contactor_tel").rules("remove");
				$("#edit_contactor_tel").rules("add",{
					required: true,
					maxlength: 11,
					mobileCN:true,
					messages:{  
                        required: "请输入手机号" 
                    }
				});
			}
			//如果是固话 传真 公司
			else if($("#edit_contactor_telType option:selected").val() == "FIXPHONE" || $("#edit_contactor_telType option:selected").val()=="FAX" || $("#edit_contactor_telType option:selected").val()=="UNIT"){
				//修改输入框
                var html = "<input type=\"tel\" class=\"form-control mayDisabled\" style=\"float: left;width: 62px !important;\" id=\"areaPo\" name=\"area\" placeholder=\"区号\">"
                    +"<span style=\"float: left;\">-</span>"
                    +"<input type=\"tel\" class=\"form-control mayDisabled\" style=\"float: left;width: 95px !important;\" id=\"telPo\" name=\"tel\" placeholder=\"电话号码\">"
                    +"<span style=\"float: left;\">-</span>"
                    +"<input type=\"tel\" class=\"form-control mayDisabled\" style=\"float: left;width: 95px !important;\" id=\"extPo\" name=\"ext\" placeholder=\"分机号\" data-placement=\"bottom\">";
                $("#telDivUp").empty();
                $("#telDivUp").append(html);
                //更改验证规则
				$("#telPo").rules("remove");
				$("#telPo").rules("add",{
					required: true,
					maxlength: 8,
                    telTel:true,
                    messages:{  
                        required: "请输入号码" 
                    }
				});
				$("#areaPo").rules("add",{
                    required: true,
                    maxlength: 4,
                    telArea:true,
                    messages:{  
                        required: "请输入区号" 
                    }
                });
                $("#extPo").rules("add",{
                	maxlength: 4,
                    telExt: true
                });
			}
			//如果是邮箱
			else if($("#edit_contactor_telType option:selected").val() == "EMAIL"){
				//修改输入框
                $("#telDivUp").empty();
                $("#telDivUp").append("<input type=\"tel\" class=\"form-control mayDisabled\" id=\"edit_contactor_tel\" name=\"tel\">");
				$("#edit_contactor_tel").rules("remove");
				$("#edit_contactor_tel").rules("add",{
					required: true,
					maxlength: 50,
                    emailCN:true,
                    messages:{  
                        required: "请输入邮件地址" 
                    }
				});
			}
			else if($("#edit_contactor_telType option:selected").val() == "WEIXIN"){
                //修改输入框
                $("#telDivUp").empty();
                $("#telDivUp").append("<input type=\"tel\" class=\"form-control mayDisabled\" id=\"edit_contactor_tel\" name=\"tel\">");
                $("#edit_contactor_tel").rules("remove");
                $("#edit_contactor_tel").rules("add",{
                    required: true,
                    maxlength: 20,
                    weiXin: true,
                    messages:{  
                        required: "请输入微信号" 
                    }
                });
            }
			//QQ
			else{
				//修改输入框
                $("#telDivUp").empty();
                $("#telDivUp").append("<input type=\"tel\" class=\"form-control mayDisabled\" id=\"edit_contactor_tel\" name=\"tel\">");
				$("#edit_contactor_tel").rules("remove");
				$("#edit_contactor_tel").rules("add",{
					required: true,
					maxlength: 12,
                    numDigital:true,
                    messages:{  
                        required: "请输入号码" 
                    }
				});
			}
		}
	}
    //初始化新增时候的电话类型
    function initialize(){
		$(".redStarMessages").text("");
    	//移除验证提示
        $(".tooltip").remove();
    	$("#addForm_cont input[type='text']").val("");  
    	$("#addForm_cont select").find("option:first").prop("selected",true);
    	//修改输入框
    	if($("#telTypeone").val() == "FIXPHONE" || $("#telTypeone").val() =="FAX" || $("#telTypeone").val() == "UNIT" ){
    		//修改输入框
            var html = "<input type=\"tel\" class=\"form-control mayDisabled\" style=\"float: left;width: 62px !important;\" id=\"telNumber1\" name=\"area\" placeholder=\"区号\">"
                +"<span style=\"float: left;\">-</span>"
                +"<input type=\"tel\" class=\"form-control mayDisabled\" style=\"float: left;width: 95px !important;\" id=\"telNumber\" name=\"tel\" placeholder=\"电话号码\">"
                +"<span style=\"float: left;\">-</span>"
                +"<input type=\"tel\" class=\"form-control mayDisabled\" style=\"float: left;width: 95px !important;\" id=\"telNumber2\" name=\"ext\" placeholder=\"分机号\" data-placement=\"bottom\">";
            $("#telDiv").empty();
            $("#telDiv").append(html);
          //更改验证规则
            $("#telNumber").rules("remove");
            $("#telNumber").rules("add",{
                required: true,
                maxlength: 8,
                telTel:true,
                messages:{  
                    required: "请输入号码" 
                }
            });
            $("#telNumber1").rules("add",{
                required: true,
                maxlength: 4,
                telArea:true,
                messages:{  
                    required: "请输入区号" 
                }
            });
            $("#telNumber2").rules("add",{
            	maxlength: 4,
                telExt: true
            });
    	}else{
	        $("#telDiv").empty();
	        $("#telDiv").append("<input type=\"tel\" class=\"form-control mayDisabled\" id=\"telNumber\" name=\"tel\">");
	      //更改验证规则
            $("#telNumber").rules("remove");
            $("#telNumber").rules("add",{
                required: true,
                maxlength: 11,
                mobileCN:true,
                messages:{  
                    required: "请输入手机号" 
                }
            });
    	}
    	$("#contactor-add").modal("show");
    }
</script>
