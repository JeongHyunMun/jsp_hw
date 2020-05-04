<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String name = "";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
h2 {
	margin-left: 120px;
}

div {
	width: 400px;
	margin: 20px auto;
}

input[type=submit] {
	margin-left: 50px;
	width: 100px;
	padding: 8px;
}

table {
	border-collapse: collapse;
}
</style>
</head>
<body>

	<form method="post">
		<h2>회원 등록</h2>

		<div>
			<label>이름</label> <input type="text" class="text" name="name"
				value="<%=name%>" />
		</div>


		<div>
			<label>성별</label> <input id="r1" type="radio" name="sex" value="male" />
			<label for="r1">남자</label> <input id="r2" type="radio" name="sex"
				value="female" /> <label for="r2">여자</label>
		</div>

		<div>
			<input type="submit" value="회원 등록" />
		</div>
	</form>
	<table>
		<tr>
			<td>이름</td>
			<td></td>
		</tr>
		<tr>
			<td>성별</td>
			<td></td>
		</tr>
	</table>
</body>
</html>