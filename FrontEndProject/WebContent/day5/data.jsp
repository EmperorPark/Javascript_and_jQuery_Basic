<%@ page language="java" contentType="text/javascript; charset=UTF-8" 
pageEncoding="UTF-8"%>

${param.callback}({"num":"123", "name":"harry potter"});
<%-- 콜백 함수의 파라메터(json형식) 값이 클라이언트로 전달됨 
Server (jquery에서 생성한 익명의 callback함수명을 받아 감싸서 응답 전송.)
--%>