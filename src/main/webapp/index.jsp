<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<div>Before any actions we can print "application.getServerInfo()":</div>
<div><%=application.getServerInfo()%></div>
<div></div>
<div><a href="InitTest"> Just init servlet</a></div>
<div><a href="PackageTest"> Package test</a></div>
</body>
</html>
