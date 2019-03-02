<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="dao.Dao"%>  
<%@ page import="model.Vene"%>  
<%@ page import="java.util.ArrayList"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Veneitten haku</title>
</head>
<body>
<%
Dao dao = new Dao();
ArrayList<Vene> veneet = dao.listaaKaikki();
for(int i=0;i<veneet.size();i++){	
	out.print(veneet.get(i).getNimi() + " ");
	out.print(veneet.get(i).getMerkkimalli() + " ");
	out.print(veneet.get(i).getPituus() + " ");
	out.print(veneet.get(i).getLeveys() + "<br>");	
	out.print(veneet.get(i).getHinta() + "<br>");	
}
%>

</body>
</html>