
var select = function(eleContainer) {
	
	var eleTitle = document.getElementsByTagName("title")[0];
	eleContainer = eleContainer || document;
	
	var getSelectTxt = function() {
		var txt = "";
		if(document.selection) {
			txt = document.selection.createRange().text;	// IE
		} else {
			txt = document.getSelection();
		}
		return txt.toString();
	};
	
	eleContainer.onmouseup = function(e) {
		e = e || window.event;
		var txt = getSelectTxt();
		
		if (txt) 
		{
		//	alert(txt.length);
			if (txt.length < 16)
			{
		//		alert("a");
				//selected.style.fontSize="20pt";
				$("#selected").addClass("selected_bigLetter");
			}
			else
			{
				//selected.style.fontSize="16px";
				$("#selected").removeClass("selected_bigLetter");
			}
			if (txt.length > 50)
			{
				txt = txt.substr(0,50);
				txt = txt + "..."
			}
		//	alert(txt);
			$("#selected").text(txt);
			$("#selected").addClass("selected_quote");
			//selected.innerHTML = txt;
			//selected.style.visibility="visible";
		} 
		else 
		{
			//selected.setAttribute("style","visibility: hidden;");
			$("#selected").removeClass("selected_quote");
		}
	};
}