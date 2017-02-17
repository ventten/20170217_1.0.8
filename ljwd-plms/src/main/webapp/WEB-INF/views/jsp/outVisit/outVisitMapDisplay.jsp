<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>路线展示</title>
<jsp:include page="/WEB-INF/views/header.jsp" flush="true"/>
<script type="text/javascript" src="${mapKeyUrl}&callback=initTheMap"></script>
<style type="text/css">
.container { width: 100%; height: 100%; margin: 0px;padding: 0px; }
.amap-marker-content{
	position:relative;
}
.mapbox{
	position:absolute;
	top:-8px;
	left:-9px;
	width:40px;
	height:40px;
}
.glyphicon-map-marker{
	font-size:40px;
	color:#FF7F00;
}
.number{
	position:absolute;
	top:5px;
	left:16px;
	color:#FF7F00;
	font-weight:bold;
}
.mapbox_hidden{
	background:black;
	filter:alpha(opacity:30);

}
.amap-marker .marker-route {
    position: absolute;
    width: 40px;
    height: 44px;
    color: #e90000;
    background: url(app/img/poi-1.png) no-repeat;
    cursor: pointer;
}
.amap-marker .marker-marker-bus-from { background-position: -334px -180px; }
.amap-marker .marker-marker-bus-end { background-position: -334px -130px; }	       
</style>
</head>
<form id="searchForm">
<input type="hidden" name="outVisitDateStr" value=${outVisitDateStr }>
<input type="hidden" name="outVisiter" value=${outVisiter }>
</form>
<div id="container" class="container"></div> 
<jsp:include page="/WEB-INF/views/footer.jsp" flush="true"/>
<script type="text/javascript">
$(function(){
	var containerHeight=$('.page-content').height();
	var containerWidth=$('.page-content').width();
	$('#container').height(containerHeight);
	$('#container').width(containerWidth);
});
$(window).resize(function(){
	var containerHeight=$('.page-content').height();
	var containerWidth=$('.page-content').width();
	$('#container').height(containerHeight);
	$('#container').width(containerWidth);
}); 

function initTheMap() {
	var geocoder;
	var map = window.map =  new AMap.Map('container', {
        zoom: 11
    });
    map.plugin(['AMap.ToolBar','AMap.Scale','AMap.Geocoder'], function() {
        map.addControl(new AMap.ToolBar());
        map.addControl(new AMap.Scale());
        geocoder = new AMap.Geocoder({
	        radius: 1000,
	        extensions: "all"
	    });
    });
    var data = $('#searchForm').serialize();
    var center ="";
	//描点
	 $.ajax({
			url:"<%=request.getContextPath()%>/rest/outVisitRoute/outVisitMapData?"+new Date().toTimeString(),
			type:"post",
			data:data,
			dataType: "json",
			success:function(result){
				map.clearMap(); // 清除所有覆盖物
				console.info(result.data);
				$.each(result.data,function(i,data){ 
					var lng_lats =data;
					if(lng_lats.length>0){
						var markers= [];
					    var points = []; 
					    var labelPixel = new AMap.Pixel(20, 20);
					    var customerMarkerPixel = new AMap.Pixel(-17, -42);
					    var sysMarkerPixel = new AMap.Pixel(-10,-34);
						var length = lng_lats.length-1;
						console.info(length);
						var lng_lat = lng_lats[0];
						var options_index = 1;
					  //  center = [lng_lat.lng, lng_lat.lat];
						for (var i = 0; i <= length; i++) {
							var value = lng_lats[i];
			    			var marker;
			    			var content = null;
			    			var point = [value.lng, value.lat];
			                var tempMarkerPixel = i == 0 || i == length ? customerMarkerPixel : sysMarkerPixel;
			    			if (value.options==2) { 
			    				content = '<div class="marker-route marker-marker-bus-from"></div>'; 
			    			}else if (value.options==3) {
			    				content = '<div class="marker-route marker-marker-bus-end"></div>'; 
			    			}else if(value.options==1){
			    			//	content = "<div class='demo_box'><span class='demo'><span class='number'>"+options_index+"</span></span></div>";
			    				content = "<div class='mapbox'><i class='glyphicon glyphicon-map-marker'></i><span class='number'>"+options_index+"</span></div>";
			    				options_index++;
			    			}else{
			    				content = "<div class='mapbox_hidden'></div>";
			    			} 
			    			points.push(point);
			    			marker = new AMap.Marker({
			    				map:map,
		    					position: point,
		    					offset: tempMarkerPixel,
		    					content: content,
		    					extData: {value : value, label : null}
		    				});
			    			var showLabel = function (e) {
			                    var marker = this;
			                    var extData = marker.getExtData();
			                    var value = extData.value;
			                    var label = extData.label;
			                    if (label) {
			                        marker.setLabel(label);
			                        return false;
			                    } else {
			                        geocoder.getAddress([value.lng, value.lat], function (status, result) {
			   
			                            if (status === 'complete' && result.info === 'OK') {
			                            	 var content = [];
			                            	if(value.rowNo==1){
			                            		content.push("外访签出");
			                            	}else if(value.rowNo==length+1){
			                            		content.push("外访结束");
			                            	}
			                            	content.push("时间:" + value.dateTimeFormat);
				                            content.push("位置:" + result.regeocode.formattedAddress); // 地址描述
			                                label = {content: content.join("<br/>"), offset: labelPixel};
			                                marker.setLabel(label);
			                                extData.label = label;
			                            }
			                        });
			                    }
			                };
			                var hideLabel = function (e) {
			                    var marker = this;
			                    marker.setLabel(null);
			                };
			    			
			    			marker.on('mouseover', showLabel);
			                marker.on('mouseout', hideLabel);
			    			markers.push(marker);
			    		}
					}
					//连线 
					 var polyline = new AMap.Polyline({
				         map: map,
				         path: points,
				         strokeColor: "#d71909",  //线颜色
				         strokeWeight: 2    //线宽
				     });
				});
			//	 map.setCenter(center);
				 map.setFitView(); 
			}
	
		});
	 	
	 
}

/************设置页面加载时修改页面左侧菜单栏状态*************/
$(function(){
	var getVal=localStorage.getItem("getVal");
	$('#'+getVal).click();
	$('#'+getVal+'_route').addClass('choose_active');
	
	//点击菜单移除选中项class
	$('.sub-menu li').click(function(){
		$('.sub-menu li').find('a').removeClass('choose_active');
	})
})

</script>