
//点击经过效果
var id = null;
$(".in").on("click",function(){
	$(".on").removeClass("on");
	$(this).addClass("on");
	id = $(".on").attr("id");
});
$(".clearfix").on("mouseenter",".on",function(){
	var res = $(this).children().hasClass("m-r-1");
	if(res){
		$(this).append(
			'<a href="javascript:;" class="tx js_pay_address_edit"></a>'+
			'<a href="javascript:;" class="gb js_pay_address_del"></a>'
		)
	}else{
		$(this).append(
			'<a class="m-r">设为默认</a>'+
			'<a href="javascript:;" class="tx js_pay_address_edit"></a>'+
			'<a href="javascript:;" class="gb js_pay_address_del"></a>'
		)
	}
	
})
$(".clearfix").on("mouseleave",".on",function(){
	var res = $(this).children().hasClass("m-r-1");
	if(res){
		$(".js_pay_address_edit").remove();
		$(".js_pay_address_del").remove();
	}else{
		$("#"+id+" a").remove();
	}
	
})




//默认地址
$(".in").on("click",".m-r",function(){
	$(".m-r").remove();
	$("#"+id).append(
		'<a title="默认地址" class="m-r m-r-1" style="background: #ccc;color: #fff;display: block;">&nbsp;&nbsp;默认地址&nbsp;&nbsp;</a>'
	)
	
})

//删除地址
$(".in").on("click",".js_pay_address_del",function(){
	$("#"+id).remove();
	
})

//添加地址
$(".tj a").click(function(){
	$("#popup_pay_address").attr("style","width: 580px;display:block;visibility: visible;position: fixed;z-index: 9999;left: 50%;top: 50%;margin-top: -225px;margin-left: -291px;");
})

//添加窗口关闭
$(".popup-close").click(function(){
	$("#popup_pay_address").attr("style","display: none;");
})

//编辑窗口
$(".in").on("click",".js_pay_address_edit",function(){
	$("#popup_pay_address").attr("style","width: 580px;display:block;visibility: visible;position: fixed;z-index: 9999;left: 50%;top: 50%;margin-top: -225px;margin-left: -291px;");
})
	