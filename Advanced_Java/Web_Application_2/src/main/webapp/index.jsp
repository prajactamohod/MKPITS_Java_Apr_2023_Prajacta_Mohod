<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<form action="" method="post">
    <input type="text" name="Roll_no" placeholder="Roll_no">
    <br>
    <input type="text" name="Name" placeholder="Name">
    <br>
    <input type="text" name="Address" placeholder="Address">
    <br>
    <input type="text" name="City" placeholder="City">
    <br>
    <button type="submit">
        <input type="text" name="sumit" value="sumit">
        <br>

    </button>
</form>


<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>