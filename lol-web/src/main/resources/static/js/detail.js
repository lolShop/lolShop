$(function(){			
   $(".jqzoom").jqueryzoom({
		xzoom:230,
		yzoom:220,
	});
	$("#spec-list img:eq(0)").css({
		"border":"3px solid #f74a4a"
	})
	$("#spec-list img").bind("click",function(){
		var src=$(this).attr("src");
		$("#spec-n1 img").eq(0).attr({
			src:src.replace("\/n5\/","\/n1\/"),
			jqimg:src.replace("\/n5\/","\/n0\/")
		});
		$("#spec-list img").css({
			"border":""
		})
		$(this).css({
			"border":"3px solid #f74a4a"
		});
	})
	
	$(".pord-tab li").bind("click",function(){
		$(".pord-tab li").prop("class","")
		$(this).prop("class","curtab")
		$(".divNone").prop("style","display:none;")
		$(".divNone").eq($(this).index()).prop("style","")
	})
	function skuColor(index){
		$("."+index+" li").bind("click",function(){
			$("."+index+" li").prop("class","hoverColor")
			$(this).addClass(" current")
		})
	}
	skuColor("mt10")
	skuColor("mt11")
	$(".btn_detail_main_buy_min").bind("click",function(){
		var num=$(".inpt_detail_main_buy_num").val();
		if(num>1){
			num--;
			$(".inpt_detail_main_buy_num").val(num);
		}
	})
	$(".btn_detail_main_buy_plus").bind("click",function(){
		var num=$(".inpt_detail_main_buy_num").val();
		$(".inpt_detail_main_buy_num").val(++num);
	})
	$.get("top.html", function (data) {
		$(".top").html(data);
	});
	$.get("bottom.html", function (data) {
		$(".bottom").html(data);
	});
	$.ajax({
		url:"product/detail",
		method:"get",
		data:{"productId":"1"},
		success:function (result) {
			alert(result.data.productName)
		}
	})
})