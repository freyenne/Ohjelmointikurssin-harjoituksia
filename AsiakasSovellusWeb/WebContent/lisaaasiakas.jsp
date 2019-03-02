<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="AsiakasSovellusWeb/main.css">

<title>Asiakkaan lisääminen</title>
</head>
<body>
<%@include file="onkokirjauduttu.jsp" %>
<%
out.print("Kirjautuneena: " + session.getAttribute("kayttaja") + "<br>");
%>
<form action="LisaaAsiakas" method="post">
<table border="1">
<tr>
<th align="right">Etunimi:</th>
<td><input type="text" name="etunimi" id="etunimi"></td>
</tr>
<tr>
<th align="right">Sukunimi:</th>
<td><input type="text" name="sukunimi" id="sukunimi"></td>
</tr>
<tr>
<th align="right">Puhelin:</th>
<td><input type="text" name="puhelin" id="puhelin"></td>
</tr>
<tr>
<th align="right">Sähköposti:</th>
<td><input type="text" name="sposti" id="sposti"></td>
</tr>
<tr>
<td colspan="2">
<input type="submit" value="Lisää">
<input type="button" value="Kaikki asiakkaat" id="kaikki">
</td>
</tr>
</table>
</form>
<%
if(request.getParameter("ilmo")!=null){
	if(request.getParameter("ilmo").equals("1")){
		out.print("Asiakkaan lisääminen onnistui");	
	}else if(request.getParameter("ilmo").equals("0")){
		out.print("Asiakkaan lisääminen ei onnistunut");	
	}
}
%>
<script>
	$(document).ready(function(){
		$("#etunimi").focus();
	    $("#kaikki").click(function(){	    	
	    	window.location.href = 'haeasiakkaat.jsp';
	    });
	    $("#LisaaAsiakas").validate({						
			rules: {
				etunimiUusi:  {
					required: true,
					minlength: 1,
					maxlength: 150;
				},	
				sukunimi:  {
					required: true,
					minlength: 1,
					maxlength: 150
				},
				puhelin:  {
					required: true,
					number: true;
					minlength: 10,
					maxlength: 30
				},	
				sposti:  {
					required: true,
					minlength: 5,
					maxlength: 150;
				}				
			},
			messages: {
				etunimiUusi: {
					required: "Pakollinen",
					minlength: "Pituus ei riitä",
					maxlength: "Liian pitkä"
					
				},
				Sukunimi: {
					required: "Pakollinen",
					minlength: "Pituus ei riitä",
					maxlength: "Liian pitkä"
				},
				Puhelin: {
					required: "Pakollinen",
					minlength: "Pituus ei riitä",
					maxlength: "Liian pitkä"
				},
				Sposti: {
					required: "Pakollinen",
					email: true,
					minlength: "Pituus ei riitä",
					maxlength: "Liian pitkä"
				}
			},			
			submitHandler: function (form) {
				document.forms["muutaLomake"].submit();
			}		
		});
	});

</script>
</body>
</html>