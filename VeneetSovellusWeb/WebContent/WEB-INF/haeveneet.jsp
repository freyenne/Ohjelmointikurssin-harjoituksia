<%@include file="onkokirjauduttu.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.Vene"%>  
<%@ page import="java.util.ArrayList"%>  
<%! @SuppressWarnings("unchecked") %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="main.css">
<title>Veneitten haku</title>
</head>
<body>
<%
out.print("Kirjautuneena: " + session.getAttribute("kayttaja") + "<br>");
%>
<form action="HaeVeneet" method="post">
Hakusana:
<input type="text" name="hakusana" id="hakusana">&nbsp;
<input type="submit" value="Hae">
<input type="button" value="Lisää uusi vene" id="lisaa">
</form>
<%
if(request.getParameter("ilmo")!=null){
	out.print(request.getParameter("ilmo"));	
}
%>
<br></br>
<table>
<tr>
<th class="vaaka">Nimi</th>
<th class="vaaka">Merkki ja malli</th>
<th class="vaaka">Pituus</th>
<th class="vaaka">Leveys</th>
<th class="vaaka">Hinta</th>
<th></th>
</tr>
<%
if(request.getAttribute("veneet")!=null){	
	ArrayList<Vene> veneet = (ArrayList<Vene>)request.getAttribute("veneet");
	for(int i=0;i<veneet.size();i++){
		out.print("<tr>");
		out.print("<td>" + veneet.get(i).getNimi() + "</td>");
		out.print("<td>" + veneet.get(i).getMerkkimalli() + "</td>");
		out.print("<td>" + veneet.get(i).getPituus() + "</td>");
		out.print("<td>" + veneet.get(i).getLeveys() + "</td>");
		out.print("<td>" + veneet.get(i).getHinta() + "</td>");
		out.print("<td><a class='poista' href='PoistaVene?poista_nimi="+veneet.get(i).getNimi()+"'><abbr title='Poista'>X</abbr></a>&nbsp;");
		out.print("<a class='muuta' href='muutavene.jsp?muuta_nimi="+veneet.get(i).getNimi()+"&merkkimalli="+veneet.get(i).getMerkkimalli()+"&pituus="+veneet.get(i).getPituus()+"&leveys="+veneet.get(i).getLeveys()+"&hinta="+veneet.get(i).getHinta()+"'><abbr title='Muuta'>M</abbr></a></td>\n");
		out.print("</tr>");
	}	
}
%>
</table>
<script>
	$(document).ready(function(){
		$("#hakusana").focus();
	    $("#lisaa").click(function(){
	    	window.location.href = 'lisaavene.jsp';
	    });
	});
</script>
</body>
</html>