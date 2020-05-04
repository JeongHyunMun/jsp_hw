<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div{ width: 400px; margin: 20px auto; }
</style>
</head>
<body>

<form method="post">
  <h2>회원 등록</h2>
  
  <div>
      <label>이름</label>
      <input type="text" class="text" name="userid" />
    </div>

  <div>
        <label>성별</label>
        
        <input id="r1" type="radio" name="sex" value="male" checked /> 
        <label for="r1">남자</label>
        
        <input id="r2" type="radio" name="sex" value="female" /> 
        <label for="r2">여자</label>    
    </div>

  <div>
      <input type="submit" value="회원등록" />
  </div>
</form>


</body>
</html>