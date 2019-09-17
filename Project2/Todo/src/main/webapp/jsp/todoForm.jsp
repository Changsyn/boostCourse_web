<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>할일 등록</title>
<link rel="stylesheet" type="text/css" href="./css/add.css">
</head>
<body>
	<div id="container">
		<h2>할일 등록</h2>
		<form action="/Todo/todoadd" method="post" accept-charset="UTF-8">
			<div class="input">어떤일인가요?<br/><input style="font-size: 25px; width:600px; height:40px;"type="text" name="title" placeholder="swift공부하기(24자까지)" maxlength="24"></div>
			<div class="input">누가 할일인가요?<br/><input style="font-size: 25px; width:300px; height:40px;"type="text" name="name" placeholder="홍길동"></div>
			<div class="input">우선순위를 선택하세요<br/>
				<input type="radio" name="sequence" value="1"><div class="text">1순위</div>
				<input type="radio" name="sequence" value="2"><div class="text">2순위</div>
				<input type="radio" name="sequence" value="3"><div class="text">3순위</div>
			</div>
			<div class="input"><input style="text-decoration: underline; position: inline; font-size: 20px; width:150px; height:50px; background-color: white;"type="button" onclick="location.href='main'"value="< 이전"></div>
			<div id="button">
				<div class="blue"><input style="color: white; font-size: 15px; width:150px; height:50px; background-color: #00BFFF;"type="submit" value="제출"></div>
				<div class="blue"><input style="color: white; font-size: 15px; width:150px; height:50px; background-color: #00BFFF;"type="reset"value="내용지우기"></div>
			</div>
			
		</form>
	</div>
</body>
</html>