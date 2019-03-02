<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="main.css">
<title>Asiakkaan lisääminen</title>
</head>
<body>
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
	});

</script>
</body>
</html>