<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user"  class=beans.User scope="session"></jsp:useBean>
<form action="/Forms/Controller" method="post">

<input type="text" name="email" />
<input type="text" name="password" />

<input type="submit" value="OK" />

</form>

</body>
</html>