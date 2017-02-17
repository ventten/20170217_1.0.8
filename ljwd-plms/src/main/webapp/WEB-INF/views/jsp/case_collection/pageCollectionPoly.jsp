<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <title>聚信立</title>
</head>
<div class="plms-content">
    <table id="poly-dataTable" class="display dataTable no-footer" cellspacing="0" width="100%">
        <thead>
        <tr>
        	<th class="text-center">操作</th>
            <th class="text-center">联系人姓名</th>
            <th class="text-center">电话号码</th>
            <th class="text-center">关系</th>
            <th class="text-center">与通讯信息是否重复</th>
            <th class="text-center">号码归属地</th>
            <th class="text-center">拨打次数</th>
            <th class="text-center">拨打时长</th>
            <th class="text-center">最近拨通时间</th>
            <th class="text-center">最近拨打时间</th>
            <!-- <th class="text-center">操作</th> -->
        </tr>
        </thead>
        <tbody id="polyTbody">
        </tbody>
    </table>
</div>

<script type="text/javascript" language="javascript">

    //选项卡点击
    $("#pageCollectionPolyLi").on('click', function () {
        var $this = $(this);
        if(!$this.hasClass("hasInit")){
            $this.addClass("hasInit");
            getPolyList();
        }
    });

    //聚信立联系人资料
    function getPolyList(){
    	var applId = $("#applId").val();
        $.ajax({
            "type" : 'POST',
            "url" : "<%=request.getContextPath()%>/rest/caseCollection/pageClollectionPolyData",
            "dataType" : "json",
            "data" : {"applId":applId},
            "success" : function(dd) {
                var datalen = dd.length;//数据长度
                var htmlPoly = "";
                for(var i=0;i<datalen;i++){
                	if(dd[i].recentlyCallDate == null){
                		dd[i].recentlyCallDate = "";
                	}
                	if(dd[i].recentlyDialDate == null){
                        dd[i].recentlyDialDate = "";
                    }
                	if(dd[i].relation == null){
                        dd[i].relation = "";
                    }
                	if(dd[i].phoneLoc == null){
                        dd[i].phoneLoc = "";
                    }
                	var html = "";
                    html += "<a href='javascript:void(0);' " + "onclick='surveyCall_poly(this,\"" + applId + "\",\"" + dd[i].relation + "\",\"" + dd[i].contactor + "\",\""  + dd[i].phone + "\")'>呼叫</a>";
                    var phoneRepet = dd[i].phoneRepet == true ? "是" : "否";
                    if(i%2 != 0){
                        htmlPoly+="<tr>"
                        		+"<td>"+html+"</td>"
                                +"<td>"+dd[i].contactor+"</td>"
                                +"<td>"+dd[i].phone+"</td>"
                                +"<td>"+dd[i].relation+"</td>"
                                +"<td>"+phoneRepet+"</td>"
                                +"<td>"+dd[i].phoneLoc+"</td>"
                                +"<td>"+dd[i].callCnt+"</td>"
                                +"<td>"+dd[i].callLen+"</td>"
                                +"<td>"+formatDate(dd[i].recentlyCallDate)+"</td>"
                                +"<td>"+formatDate(dd[i].recentlyDialDate)+"</td>"
                                /* +"<td>"+html+"</td>" */
                                +"</tr>";
                    }else{
                        htmlPoly+="<tr class=\"odd\">"
                        		+"<td>"+html+"</td>"
                                +"<td>"+dd[i].contactor+"</td>"
                                +"<td>"+dd[i].phone+"</td>"
                                +"<td>"+dd[i].relation+"</td>"
                                +"<td>"+phoneRepet+"</td>"
                                +"<td>"+dd[i].phoneLoc+"</td>"
                                +"<td>"+dd[i].callCnt+"</td>"
                                +"<td>"+dd[i].callLen+"</td>"
                                +"<td>"+formatDate(dd[i].recentlyCallDate)+"</td>"
                                +"<td>"+formatDate(dd[i].recentlyDialDate)+"</td>"
                                /* +"<td>"+html+"</td>" */
                                +"</tr>";
                    }
                }
                $("#polyTbody").empty();
                $("#polyTbody").append(htmlPoly);
            },
            "error":function(errorData){
                MSG.show('获取数据发生异常');
            }
        });
    }

    //点击呼叫
    function surveyCall_poly(obj,applId,rltnshp,name,tel) {
    	$(obj).hide();
        //手机或固话正则校验
        if(!(/^1[3|4|5|7|8]\d{9}$/.test(tel)) && !(/^((0\d{2,3})-)?(\d{7,8})(-(\d{3,}))?$/.test(tel))){
            $(obj).show();
            MSG.show("手机号码或固话格式有误");
            return;
        }
        var cntrctNo = $.trim($("#cntrctNo").text());
        var custName = $.trim($("#custName").text());
        var idCardNo = $.trim($("#idCardNo").text());
        //var data = "applId=" + applId + "&cntrctNo=" + cntrctNo + "&custName=" + custName + "&idCardNo=" + idCardNo + "&dest=" + tel + "&rltnshp=" + rltnshp + "&callBy=" + name + "&deptype=collect&phoneSource=2";
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
                ,phoneSource:2
            },
            "success" : function(ret) {
                if(ret.success){
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
                MSG.show("呼叫失败");
            }
        });
        $(obj).show();
    }
  //时间戳转时间格式
    function formatDate(now){
      if(now==""||now==null){
          return "";
      }
        var date = new Date(now);
        var   year=date.getFullYear();     
        var   month=date.getMonth()+1;
        if(month<10){
            month = "0"+month;
        }
        var   day=date.getDate();
        if(day<10){
            day = "0"+day;
        }
        var   hour=date.getHours(); 
        if(hour<10){
        	hour = "0"+hour;
        }
        var   minute=date.getMinutes();   
        if(minute<10){
        	minute = "0"+minute;
        }
        var   second=date.getSeconds();   
        if(second<10){
        	second = "0"+second;
        }
        return   year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second;     
    }
</script>