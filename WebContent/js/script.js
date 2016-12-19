function showState(selectedId)
{
	country_id=selectedId;
	document.getElementById("stateDiv").style.display='block';
	var url="showState.html?id="+country_id;
	var xmlhttp;
	if(window.XMLHttpRequest)
		{
			xmlhttp=new XMLHttpRequest();
		}
	else
		{
		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
		}
		xmlhttp.onreadystatechange=function()
		{
			if(xmlhttp.readyState==4 && xmlhttp.status==200)
				{				
				document.getElementById("stateDiv").innerHTML=xmlhttp.responseText;
				}
		};
		xmlhttp.open("POST", url, true);
		xmlhttp.send();
}

function showCity(selectedId)
{

	state_id=selectedId;
	document.getElementById("cityDiv").style.display='block';
	var url="showCity.html?id="+state_id;
	var xmlhttp;	
	if(window.XMLHttpRequest)
		{
			xmlhttp=new XMLHttpRequest();
			
		}
	else
		{
		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
		}
		xmlhttp.onreadystatechange=function()
		{
			if(xmlhttp.readyState==4 && xmlhttp.status==200)
				{				
				document.getElementById("cityDiv").innerHTML=xmlhttp.responseText;
				}
		};
		xmlhttp.open("POST", url, true);
		xmlhttp.send();
}