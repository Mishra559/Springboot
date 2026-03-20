<html>
<head>
    <title>Success</title>
</head>
<body>
<h1>Success</h1>
<%
String msg = (String)request.getAttribute("message");
out.println(msg);
out.println("<br>");
out.println("You are logged in at :" + java.time.LocalDateTime.now());
%>
</body>
</html>