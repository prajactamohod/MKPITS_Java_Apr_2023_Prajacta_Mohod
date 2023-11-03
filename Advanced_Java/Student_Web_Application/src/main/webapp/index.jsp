<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            font-family: Bahnschrift;

        }
button{
    background: mediumslateblue;
    colur:white;
}

    </style>
</head>
<body>

<form action="Control.jsp" method="post">
    <div class="ButterFly">

        //class name can be used in style tag


    <input type="text" name="Roll_No" placeholder="Roll_no">
    <br>

    <input type="text" name="Name" placeholder="Name">
    <br>
    <input type="text" name="Address" placeholder="Address">
    <br>
    <input type="text" name="City" placeholder="City">
    <br>

    <button type="submit">
        <input type="text" name="submit" value="submit">
        <br>

    </button>>
    </div>
</form>>
<%--<h1><%= "Hello World!" %>--%>
<%--</h1>--%>
<%--<br/>--%>
<%--<a href="hello-servlet">Hello Servlet</a>--%>
</body>
</html>