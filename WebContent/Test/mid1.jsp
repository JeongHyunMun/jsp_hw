<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
<title>lecture1</title>
<style>
	table { border-collapse: collapse; }
	td { padding: 5px; border: solid 1px gray; width: 150px;} 
	
</style>
</head>
<body>
<%
String s = request.getParameter("number");
if (s == null) s = "0";
int n = Integer.parseInt(s);
%>
<table>
	<form>
  <input type="text" name="number" value="<%= n %>"  />
  <button type="submit">단</button>
</form>
	<tr>
	<% for (int i=1; i <= 9; ++i) { %>
	<tr>
		<td>
		<%= n%> x <%= i %> = <%= n * i %>
		</td>
	</tr>
	<% } %>
	</tr>
</table>

</body>
</html>