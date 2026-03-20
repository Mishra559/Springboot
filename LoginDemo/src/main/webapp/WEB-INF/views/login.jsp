<html>
<head>
    <title>Login Page</title>
</head>
<body>
<%
String msg =(String)request.getAttribute("message");
if(msg != null)
out.println(msg);
%>

<br>

<h2>Login Form</h2>
<form method="post" action="./login">
    <table>
        <tr>
            <td>Username</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password"></td>
        </tr>
    </table>
    <button type="submit">Login</button>
</form>
</body>
</html>