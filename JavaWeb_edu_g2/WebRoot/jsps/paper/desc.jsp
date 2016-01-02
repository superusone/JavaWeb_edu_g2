<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>答卷</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<script type="text/javascript" src="<c:url value='/menu/mymenu.js'/>"></script>
	<link rel="stylesheet" href="<c:url value='/menu/mymenu.css'/>" type="text/css" media="all">
	
	-->

  </head>
  <body>
  <form id="form" action="<c:url value='/SearchPaperServlet?method=JudgeAnswer'/>" method="post">
  <ul>
     <h3 align="center">列表</h3>
<table width="70%" align="center">
<h1>题目</h1>
<h2>单选</h2>
<c:forEach items="${singleList}" var="paper">

    <tr>
        <td>${paper.q_subject }</td>
        <td><input type="radio"name="${paper.pid }" value="A"/>${paper.optionA }</td>
        <td><input type="radio"name="${paper.pid }" value="B"/>${paper.optionB }</td>
        <td><input type="radio"name="${paper.pid }" value="C"/>${paper.optionC }</td>
        <td><input type="radio"name="${paper.pid }" value="D"/>${paper.optionD }</td>
		</br>
    </tr>
</c:forEach>
</table>
<br/>
    

  <a href="javascript:document.getElementById('form').submit();">提交</a>
  </body>
</html>
