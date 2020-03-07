//all-class
$('.all-class,.top-submenu').hover(function () {
	$(".all-class i").addClass("i-arrtop");
	$(".top-head .top-submenu").show();
});

//top-head
$(".top-head").mouseleave(function () {
	$(".all-class i").removeClass("i-arrtop");
	$(".top-head .top-submenu").hide();
})

$(document).ready(function(){
    //滚动条事件
    $(window).scroll(function(){
        var scroH = $(this).scrollTop();
        var winH = 400;
        if(scroH>=winH){
            $(".top-action").addClass("top-fixed");
        }else if(scroH<winH){
            $(".top-action").removeClass("top-fixed");
        }
    })
});

