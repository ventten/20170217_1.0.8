<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    				</div>		
				<!-- 加载主体部分内容结束-->
			</div>
		</div>
		<!-- END CONTENT -->
	</div>
	<!-- END CONTAINER -->
	<!-- 底部版权声明 -->
	<div class="footer">
		<div class="footer-inner">2016 &copy; 贷后管理系统 By 深圳赫美小额贷款股份有限公司.</div>
		<div class="footer-tools">
			<span class="go-top">
				<i class="fa fa-angle-up"></i>
			</span>
		</div>
	</div>
	<%--加载数据遮罩层 --%>
	<div class="cd-popup" id="maskDiv">
		<div class="children">
			<img src="assets/img/loading-011.gif" />
		</div>
	</div>
</body>
</html>

<script type="text/javascript" language="javascript">

    $(document).ready(function(){
        $(".sub-menu li").click(function(){
            $(this).siblings().removeClass('title_active').end().addClass("title_active");
        });
    });

    document.oncontextmenu = function() {
        //右键点击取得的对象
        var obj = document.elementFromPoint(event.clientX,event.clientY);
        //如果鼠标右键点击取得的对象类型是<a>标签,右键不可用
        return !(obj.tagName && obj.tagName == "A");
    };

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
    
    $(function(){
    	var H=$('.page-container').height();
    	var h=parseFloat(H)-10;
    	$('#main-content').css('min-height',h+'px');
    	/*****菜单切换时，屏幕滚动到顶部*****/
    	$('.sub-menu li').click(function(){
    		$(window).scrollTop(0);
   		})
    })

</script>
