<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Asiakkaan lisääminen</title>
</head>
<body>
<form action="LisaaAsiakas" method="post">
<table border="1">
<tr>
<td align="right">Etunimi:</td>
<td><input type="text" name="etunimi"></td>
</tr>
<tr>
<td align="right">Sukunimi:</td>
<td><input type="text" name="sukunimi"></td>
</tr>
<tr>
<td align="right">Sposti:</td>
<td><input type="text" name="sposti"></td>
</tr>
<tr>
<td align="right">Puhelin:</td>
<td><input type="text" name="puhelin"></td>
</tr>
<tr>
<td align="right">Asiakas_id:</td>
<td><input type="number" name="asiakas_id"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Lisää" style="width:260px"></td>
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
<br>
<a href="haeasiakkaat.jsp">Näytä kaikki asiakkaat</a>
</body>
</html>