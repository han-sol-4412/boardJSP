<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="kr.ac.kopo.kopo41.service.*"%>
<%@page import="kr.ac.kopo.kopo41.domain.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	BoardService boardService = new BoardServiceImpl();
	Board board = boardService.selectOne(1);

%>
	<h1>hello</h1>
	board title: <%board.getTitle(); %>
</body>
</html>