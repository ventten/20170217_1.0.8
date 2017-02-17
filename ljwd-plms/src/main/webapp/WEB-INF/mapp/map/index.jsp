<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%
    String basePath = request.getContextPath();
    basePath = basePath.endsWith("/") ? basePath : basePath + "/";
%>
<c:set var="basePath" value="<%=basePath%>"/>
<!DOCTYPE html>
<html>
<head>
    <base href="${basePath}"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
    <title>地图演示</title>
    <link rel="stylesheet" type="text/css" href="${basePath}mappres/css/bootstrap.min.css"/>
    <script type="text/javascript" charset="utf-8">window.GLOBAL_BASE_PATH = '${basePath}';</script>
    <script src="${basePath}mappres/js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="${basePath}mappres/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
    <style type="text/css">
        .head-left, .container-left{ width: 300px; }
        .head-right { position: absolute; top: 0px; left: 300px; right: 15px; }
        .container-map { position: absolute; top: 63px; bottom: 0px; left: 15px; right: 15px; }
        .container-left { position: absolute; top: 0px; bottom: 0px; overflow: auto; }
        .container-right { margin-left: 330px; height: 600px; background-color: rgba(143, 143, 143, 0.31); }

        .amap-marker .marker-route {
            position: absolute;
            width: 40px;
            height: 44px;
            color: #e90000;
            background: url(http://webapi.amap.com/theme/v1.3/images/newpc/poi-1.png) no-repeat;
            cursor: pointer;
        }
        .amap-marker .marker-marker-bus-from { background-position: -334px -180px; }
        .amap-marker .marker-marker-bus-end { background-position: -334px -130px; }
   
    </style>
</head>
<body>
<div class="container-fluid">
    <div class="text-center">
        <div class="head-left">
            <h2>用户信息</h2>
        </div>
        <div class="head-right">
            <h2>地图展示</h2>
        </div>
    </div>
    <div class="container-map">
        <div class="container-left">
            <div class="list-group">
                <c:forEach var="item" items="${allUsers}">
                    <a href="javascript:void(0)" class="list-group-item">${item}</a>
                </c:forEach>
            </div>
        </div>
        <div class="container-right" id="container"></div>
    </div>
</div>
</body>
<script type="text/javascript" src="${mapKeyUrl}&callback=initTheMap"></script>
<script type="text/javascript">
    function initTheMap() {
        var map = window.map = new AMap.Map('container', {
            zoom: 11
        });
        map.plugin(['AMap.ToolBar', 'AMap.Geocoder'], function() {
            map.addControl(new AMap.ToolBar());
        });
    }
    $(function () {
        // 画线
        var drawLine = function (values) {
            var map = window.map;
            map.clearMap(); // 清除所有覆盖物
            var len = values.length;
            var pointArrays = [];
            var labelPixel = new AMap.Pixel(20, 20);
            var customerMarkerPixel = new AMap.Pixel(-17, -42);
            var sysMarkerPixel = new AMap.Pixel(-10,-34);
            var geocoder = new AMap.Geocoder({
                radius: 1000,
                extensions: "all"
            });
            var lastIndex = len -1;
            var lastDateTime = null;
            for (var index = 0; index < len; index++) {
                var value = values[index];
                var point = [value.lng, value.lat];
                pointArrays.push(point);
                var dateTime = Date.parse(value.dateTime);
                if (index != 0 && index != lastIndex && dateTime - lastDateTime <= 1000 * 60 * 10) { continue; }
                lastDateTime = dateTime;
                var content = null;
                if (index == 0) { content = '<div class="marker-route marker-marker-bus-from"></div>'; }
                else if (index == lastIndex) { content = '<div class="marker-route marker-marker-bus-end"></div>'; }
                var tempMarkerPixel = index == 0 || index == lastIndex ? customerMarkerPixel : sysMarkerPixel;
                var marker = new AMap.Marker({
                    map: map,
                    offset: tempMarkerPixel,
                    position: point,
                    clickable: true,
                    content: content,
                    extData: {value : value, label : null},
                    click : function () {
                        console.info(arguments)
                    }
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
                                content.push("时间:" + value.dateTime);
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
//                AMap.event.addListener(marker, 'click', onClick);
                marker.on('mouseover', showLabel);
                marker.on('mouseout', hideLabel);
            }
            var polyline = new AMap.Polyline({
                map: map,
                path: pointArrays
            });
            map.setFitView();
        };
        // 绑定事件
        var mapTrackBtOnClick = function (e) {
            var userId = $(this).html();
            $.ajax({
                url: '${basePath}mapp/map/' + userId,
                type: 'post',
                dataType: 'json'
            }).done(function (data, textStatus, jqXHR) {
                if (!data && !data.success) { return; }
                drawLine(data.data);
            }).fail(function () {

            });
        };
        $('.list-group>.list-group-item').on('click', function (e) {
            var $this = $(this);
            if ($this.hasClass('active')) { return false; }
            $this.parent().find('.active').removeClass('active');
            $this.addClass('active');
            mapTrackBtOnClick.call(this, e);
        });
    })
</script>
</html>
