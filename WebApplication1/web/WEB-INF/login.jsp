<%-- 
    Document   : login
    Created on : 03-Apr-2021, 4:37:43 PM
    Author     : Alfiya
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CDAC PREKSHA NEW WEB APPLICATION login</title>
</head>
<body>
 <div align="center">
  <h1>Login Form</h1>
  <form action="<%=request.getContextPath()%>/login" method="post">
   <table style="with: 100%">
    <tr>
     <td>UserName</td>
     <td><input type="text" name="LoginId" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="Password" /></td>
    </tr>

   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>
