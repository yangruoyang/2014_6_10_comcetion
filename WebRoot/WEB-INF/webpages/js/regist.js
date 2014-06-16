// JavaScript Document
var colors={
	cs:new Array()
	}
function $(id){
  return document.getElementById(id);
	}
function initcolors(){
	colors.cs.push("0,0,255");
	colors.cs.push("0,255,0");
	colors.cs.push("255,0,0");
	colors.cs.push("255,255,0");
	colors.cs.push("255,0,255");
	colors.cs.push("0,255,255");
	colors.cs.push("122,0,122");
	colors.cs.push("0,255,122");
	colors.cs.push("122,122,0");
	colors.cs.push("122,122,122");
	}	
function changecolor(){
	var ss=parseInt((Math.random()*10+"").charAt(0));
    $("colors").style.boxShadow="0px 0px 15px rgba("+colors.cs[ss]+",0.3)";	
	}	
window.onload=function(){
	initcolors();
  var tt=window.setInterval(changecolor,1000);
	}