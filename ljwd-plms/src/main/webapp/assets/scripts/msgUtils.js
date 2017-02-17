/**
 * 消息提示框封装
 * @constructor
 */
function MSG (){}

/**
 * 显示一个提示框,并返回该框的标识
 * @param msg 提示信息
 * @param callBack 回调函数
 * @returns {*}
 */
MSG.show = function (msg, callBack) {
	return layer.msg(msg || '', {time:2000}, callBack);
};

/**
 * 选择提示框
 * @param msg 内容
 * @param yesFn 点击确定的回调函数
 * @returns {*}
 */
MSG.confirm = function (msg, yesFn) {
    var index = layer.msg(msg, {
        time: 0 //不自动关闭
        ,shade: [0.8, '#393D49'] //遮罩
        ,btn: ['确定','取消']
        ,yes: function(index) {
            layer.close(index);
            if (yesFn) { yesFn(); }
        },
        cancel: function (index) {
            layer.close(index);
        }
    });
    //$('#layui-layer' + index).find(".layui-layer-content").css({"background-color":"#ffffff","color":"#000000"});
    return index;
};

///**
// * 选择提示框
// * @param msg 内容
// * @param yesFn 点击确定的回调函数
// * @param cancelFn 点击否的回调函数
// * @returns {*}
// */
//MSG.confirm = function (msg, yesFn, cancelFn) {
//    var index = layer.msg(msg, {
//        time: 0 //不自动关闭
//        ,shade: [0.8, '#393D49'] //遮罩
//        ,btn: ['确定','取消']
//        ,yes: function(index) {
//            layer.close(index);
//            if (yesFn) { yesFn(); }
//        },
//        cancel: function (index) {
//            layer.close(index);
//            if (cancelFn) { cancelFn(); }
//        }
//    });
//    //$('#layui-layer' + index).find(".layui-layer-content").css({"background-color":"#ffffff","color":"#000000"});
//    return index;
//};

/**
 * 提示框
 * @param msg 内容
 * @param callback 点击按钮后的回调函数
 * @returns {*}
 */
MSG.alert = function (msg, btn, callback) {
    var index = layer.msg(msg, {
        time: 0 //不自动关闭
        ,shade: [0.8, '#393D49'] //遮罩
        ,btn: btn || ['确定']
        ,yes: function(index) {
            layer.close(index);
            if (callback) { callback(); }
        }
    });
    // $('#layui-layer' + index).find(".layui-layer-content").css({"background-color":"#ffffff","color":"#000000"});
    return index;
};

/**
 * 显示一个加载框,并返回该框的标识
 * @returns {*}
 */
MSG.loading = function () {
	return layer.load(2);
};

///**
//* 选择提示框
//* @param msg 内容
//* @param btn 按钮
//* @param yesFn 点击确定的回调函数
//* @param cancelFn 点击否的回调函数
//* @returns {*}
//*/
//MSG.confirm = function (msg, btn, yesFn, cancelFn) {
//	var index = layer.msg(msg, {
//		time: 0 //不自动关闭
//		,shade: [0.8, '#393D49'] //遮罩
//		,btn: btn || ['确定','取消']
//		,yes: function(index) {
//			layer.close(index);
//			if (yesFn) { yesFn(); }
//		},
//		cancel: function (index) {
//			layer.close(index);
//			if (cancelFn) { cancelFn(); }
//		}
//	});
//	//$('#layui-layer' + index).find(".layui-layer-content").css({"background-color":"#ffffff","color":"#000000"});
//	return index;
//};

/**
 * 选择提示框
 * @param msg 内容
 * @param btn 按钮
 * @param yesFn 点击确定的回调函数
 * @param cancelFn 点击否的回调函数
 * @returns {*}
 */
MSG.confirmMore = function (msg, btn, yesFn, cancelFn) {
	var index = layer.msg(msg, {
		time: 0 //不自动关闭
		,shade: [0.5, '#CCC'] //遮罩
		,btn: btn || ['确定','取消']
		,yes: function(index) {
			layer.close(index);
			if (yesFn) { yesFn(); }
		},
		cancel: function (index) {
			layer.close(index);
			if (cancelFn) { cancelFn(); }
		}
	});
	//$('#layui-layer' + index).find(".layui-layer-content").css({"background-color":"#ffffff","color":"#000000"});
	//$('#layui-layer' + index).find(".layui-layer-btn").css({"background-color":"#ffffff"});
	return index;
};

/**
 * 关闭弹窗框
 * @param index 弹出框返回的标识
 */
MSG.close = function (index) {
	if (index) {
		layer.close(index)
	} else {
		layer.closeAll();
	}
};