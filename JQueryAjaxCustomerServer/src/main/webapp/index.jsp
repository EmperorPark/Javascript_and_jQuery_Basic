<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>RESTful 웹서비스 클라이언트(JSON)</title>
<link	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"	rel="stylesheet">

<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script type="text/javascript">

	
</script>
</head>
<body>
	<div class="container">
		<form id="form1" class="form-horizontal">
			<h2>사용자 등록 및 수정</h2>
			<div class="form-group">
				<label>번호:</label> <input type="text" class="form-control"	name="num" 	id="num">
			</div>
			<div class="form-group">
				<label>이름:</label> <input type="text" class="form-control" name="name" 	id="name">
			</div>

			<div class="form-group">
				<label>주소:</label> <input type="text" class="form-control"	name="address" id="address">
			</div>

			<div class="btn-group">
				<input type="button" class="btn btn-primary" value="등록"	id="btnInsert" /> 
				<input type="button" class="btn btn-primary"value="수정" id="btnUpdate" /> 
				<input type="button" class="btn btn-primary" value="초기화" id="btnInit" />
			</div>
		</form>
	</div>
	<hr />
	<div class="container">
		<h2>사용자 목록</h2>
		<table class="table text-center">
			<thead>
				<tr>
					<th class="text-center">번호</th>
					<th class="text-center">이름</th>
					<th class="text-center">주소</th>
				</tr>
			</thead>
			<tbody></tbody>
		</table>
	</div>
</body>
</html>








