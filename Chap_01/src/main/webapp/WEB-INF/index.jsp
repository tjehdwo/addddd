<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� ��ȸ</title>
</head>
<body>
	<h1>����� ��ȸ</h1>
	<!-- ��������� �Է¹��� ���� action�� ���� ����  -->
	<form action="selectUser" method="post">
		<label for="userId">����� ID : </label>
		<input type="text" id="userId" name="userId" required />
		<button type="submit">��ȸ</button>
	</form>
</body>
</html>