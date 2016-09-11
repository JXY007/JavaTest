<%@page import="java.io.PrintWriter"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>apcceptdata</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
  </head>
  <body>
  		<%
  			String username=request.getParameter("username");
  			String password=request.getParameter("password");
  			pageContext.setAttribute("username", username);
  			pageContext.setAttribute("password", password);
  		 %>
   		 <h1>${username}</h1>
   		 <h1>${password}</h1>
  </body>
</html>
