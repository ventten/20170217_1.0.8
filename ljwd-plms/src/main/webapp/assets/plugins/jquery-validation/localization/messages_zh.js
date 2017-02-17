/*
 * Translated default messages for the jQuery validation plugin.
 * Locale: ZH (Chinese, 中文 (Zhōngwén), 汉语, 漢語)
 */
(function ($) {
	$.extend($.validator.messages, {
		required: "此项必填",
		remote: "请修正该字段",
		email: "请输入正确格式的电子邮件",
		url: "请输入合法的网址",   
		date: "请输入合法的日期",
		dateISO: "请输入合法的日期(ISO)",
		number: "请输入合法的数字",
		digits: "只能输入整数",
		creditcard: "请输入合法的信用卡号",
		equalTo: "请再次输入相同的值",
		accept: "请输入拥有合法后缀名的字符串",
		maxlength: $.validator.format("此项长度最多为{0}"),
		minlength: $.validator.format("此项长度最少为{0}"),
		rangelength: $.validator.format("请输入一个长度介于{0}和{1}之间的字符串"),
		range: $.validator.format("请输入一个介于{0}和{1}之间的值"),
		max: $.validator.format("请输入一个最大为{0}的值"),
		min: $.validator.format("请输入一个最小为{0}的值")
	});
}(jQuery));

/*
 *自定义验证 2016-8-22 16：04 自定验证被写在 additional-methods.min.js 中,且验证提示集成在自定义标签内部,如需要改动直接改提示属性
 * mobileCN       //检测手机号是否正确
 * telCN          //检查固话号码是否正确
 * idCard       //检查身份证是否正确
 * upNum        //检查大于0的数
 * downNum      //检查小于0的数
 * bankCard     //银行卡号
 * upNumDeci    //请输入大于0的数且小数位不能超过6位
 * downNumDeci  //请输入小于0的数且小数位不能超过6位
 * allTel       //检查固话和手机
 * numDigital   //匹配号码数字
 */
