<%@ page import="com.example.new_college_web_application.Student_Service"%>

<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 04/11/2023
  Time: 3:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="s" class="com.example.new_college_web_application.Student">
    <scope>=application/</scope>
</jsp:useBean>

<jsp:setProperty name="s" property="roll_no" param="Roll_no"/>
<jsp:setProperty name="s" property="=name" param="Name"/>
<jsp:setProperty name="s" property="address" param="Address"/>
<jsp:setProperty name="s" property="city" param="City"/>
<%
    Student_Service studentService=new Student_Service();
%>



<html>

<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
