<%@page import="com.marco.gestioneattori.model.Film"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%
// qua sto facendo downcasting da Object verso List<Film>
List<Film> list = (List<Film>) request.getAttribute("listafilm");
String nomeUtente = (String) session.getAttribute("nomeutente");
%>

</head>
<body>
	<h1>Ciao <%= nomeUtente%></h1>
	<%
	for (Film f : list){
	%>
		<p> <%= f.getNomeFilm()%></p>
	<%
	}
	%>
	
	
</body>
</html>