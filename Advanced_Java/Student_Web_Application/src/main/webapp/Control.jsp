<%@ page import="com.example.student_web_appliaction.Student_Service" %>
<%@page import="java.sql.ResultSet"%>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 03/11/2023
  Time: 2:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="s" class="com.example.student_web_appliaction.Student" scope="application"/>

    <jsp:setProperty name="s" property="roll_no" param="Roll_no"/>
    <jsp:setProperty name="s" property="name" param="Name"/>
    <jsp:setProperty name="s" property="address" param="Address"/>
    <jsp:setProperty name="s" property="city" param="City"/>

    <%
        Student_Service studentService=new Student_Service();
        if(studentService.getRecord(s) != 0) {
            System.out.println("Inserted");
        }
        else{
            System.out.println("Not Inserted");
        }
    %>



<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
