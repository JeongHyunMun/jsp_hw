<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List, lecture1.jdbc1.*" %>
<%
String author = "";
Book book = BookDAO2.findByAuthor(author);
%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <style>
    div.container { width: 600px; margin: 50px auto; }
    body { font-family: 굴림체; }
    table { width: 500px;  border-collapse: collapse; }
    table td:nth-child(1) { background-color: #eee; }
    td { padding: 5px; border: 1px solid lightgray; }   
  </style>
</head>
<body>

<div class="container">

<h1>책</h1>

<table>
  <tr>
    <td>ID</td>
    <td><%= book.getId() %></td>
  </tr>
  <tr>
    <td>제목</td>
    <td><%= book.getTitle() %></td>
  </tr>
  <tr>
    <td>저자</td>
    <td><%= book.getAuthor() %></td>
  </tr>
  <tr>
    <td>카테고리</td>
    <td><%= book.getCategoryName() %></td>
  </tr>
  <tr>
    <td>가격</td>
    <td><%= book.getPrice() %></td>
  </tr>
  <tr>
    <td>출판사</td>
    <td><%= book.getPublisher() %></td>
  </tr>
</table>

</div>
</body>
</html>
