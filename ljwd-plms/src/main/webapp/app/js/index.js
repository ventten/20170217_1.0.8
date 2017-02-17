//菜单控制
$(function() {

    App.init();

    var Index = (function() {
        var me = {};

        //处理一级菜单点击
        me.handleMenuClick = function() {
            $('#page-sidebar-menu > li').click(function(e) {
                var menu = $('#page-sidebar-menu');
                var li = menu.find('li.active').removeClass('active');

                //添加选中 打开的样式
//                $(this).addClass('active');
            });
        };

        //处理子菜单点击
        me.handleSubMenuClick = function() {
            $('#page-sidebar-menu li a').click(function(e) {
//                P.checkUser();
                e.preventDefault();
                var url = this.href;
                var text = $.trim($(this).text());
                if (url != null && url != 'javascript:;') {
                    $.get(url, function(data) {
                        $('#main-content').html(data);
                        //面包屑-首页
                        $('#breadCrumbsLiTop').siblings().remove();
                        /*if(text != '首页'){
                            var breadCrumbs = $('#breadCrumbs');
                            var html = "<li><i class='fa fa-angle-right'></i>";
                            html += "<a href=" + url + " onclick='return H.hrefBreadCrumbs(this)'> " + text +"</a></li>";
                            breadCrumbs.append(html);
                        }*/
                    });
                }
            });
        };

        me.init = function() {
            me.handleMenuClick();
            me.handleSubMenuClick();
        };

        return me;

    })();

    Index.init();

    $('#btn-dashboard').trigger("click");

});

var H = {};

/**
 * 操作完成之后返回面包屑上一层
 * */
H.hrefReturnUp = function () {
    $('#breadCrumbs li:last').remove();
    $('#breadCrumbs li:last a').trigger("click");
};

/**
 * <a>标签点击页面跳转控制,会往面包屑加拼接连接
 * @param e <a>元素DOM对象
 * */
H.hrefA = function (e) {
//    P.checkUser();
    var url = e.href;
    var text = $.trim(e.innerText);
    if (url != null && url != 'javascript:;') {
        $("#maskDiv").addClass("is-visible");
        $.get(url, function(data) {
            $('#main-content').html(data);
            var breadCrumbs = $('#breadCrumbs');
            var html = "<li><i class='fa fa-angle-right'></i>";
            html += "<a href=" + url + " onclick='return H.hrefBreadCrumbs(this)'> " + text +"</a></li>";
            breadCrumbs.append(html);
            $("#maskDiv").removeClass("is-visible");
        });
    }
    return false;
};

/**
 * Post方式页面跳转,会往面包屑加拼接连接
 * @param url 跳转Url地址
 * @param text 面包屑显示标题
 * @param data get请求时拼接的参数串
 * */
H.hrefPost = function (url,text,data) {
    $("#maskDiv").addClass("is-visible");
    $.post(url,
        data,
        function(htmlData) {
            $('#main-content').html(htmlData);
            if(data){
                url += "?" + data;
            }
            /*var breadCrumbs = $('#breadCrumbs');
            var html = "<li><i class='fa fa-angle-right'></i>";
            html += "<a href=" + url + " onclick='return H.hrefBreadCrumbs(this)'> " + text +"</a></li>";
            breadCrumbs.append(html);*/
            $("#maskDiv").removeClass("is-visible");
        });
};

/**
 * Get方式页面跳转,会往面包屑加拼接连接
 * @param url 跳转Url地址
 * @param text 面包屑显示标题
 * @param data get请求时拼接的参数串
 * */
H.hrefGet = function (url,text,data) {
    $("#maskDiv").addClass("is-visible");
    $.get(url,
        data,
        function(htmlData) {
            $('#main-content').html(htmlData);
            if(data){
                url += "?" + data;
            }
            /*var breadCrumbs = $('#breadCrumbs');
            var html = "<li><i class='fa fa-angle-right'></i>";
            html += "<a href=" + url + " onclick='return H.hrefBreadCrumbs(this)'> " + text +"</a></li>";
            breadCrumbs.append(html);*/
            $("#maskDiv").removeClass("is-visible");
        });
};

/**
 * 面包屑中<a>标签点击跳转控制,点击时会移除掉当前点击后边的链接
 * @param e <a>元素DOM对象
 * */
H.hrefBreadCrumbs = function (e) {
//    P.checkUser();
    var url = e.href;
    var text = $.trim(e.innerText);
    if (url != null && url != 'javascript:;') {
//        $("#maskDiv").addClass("is-visible");
        $.get(url, function(data) {
            $('#main-content').html(data);
            e = $(e);
            e.parent().nextAll('li').remove();
//            $("#maskDiv").removeClass("is-visible");
        });
    }
    return false;
};