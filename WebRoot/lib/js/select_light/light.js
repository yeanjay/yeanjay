
function registerLight()
{
	$(".light").each(function(){
		$(this).mouseover(
			function(){
				$("#selected").text($(this).text());
				//$("#selected").css("visibility","visible");
				$("#selected").addClass("selected_light");
				//alert($(this).text());
			}
		); 
	});
	
	function scroll()
	{
		$("#selected").addClass("selected_light");
		$("#selected").text($(document).scrollTop());
		if ($(document).scrollTop() > 175)
			$("#r").css("margin-top",$(document).scrollTop()-170);
		else
			$("#r").css("margin-top",5);
	//	$("#r").css("position","absolute");
	}
	window.onscroll=scroll; 
}



function lightOn()
{
	
	alert("start");
//	var elems = getElementsByClassName(document,"light");
	
}