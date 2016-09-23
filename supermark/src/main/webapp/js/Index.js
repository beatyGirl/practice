$(function () {
    $(".content-left,.content-right").height($(window).height() - 130);
})
$(".accordion-inner").click(function () {
    $(".active").html($(this).find(".left-body").text());
})

$(window).resize(function () {
    $(".content-left,.content-right").height($(window).height() - 130);
})

$(".lordding").on("click",function(){
	var frame = $(".frame");
	frame.append("<iframe src='"+ $(this).attr("data-url") +"' class='iframe'></iframe>");
});