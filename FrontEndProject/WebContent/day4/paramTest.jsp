<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<%
	//post�� ��� ok, get�� ��� ��� ����
	request.setCharacterEncoding("utf-8");

	//client(html)�κ��� ���� ������ �ޱ�
	String name = request.getParameter("name");
	String address = request.getParameter("address");
	
	
	%>hello,,,<%= name %>!!!<br>you live in...<%= address %>!
</body>
</html>