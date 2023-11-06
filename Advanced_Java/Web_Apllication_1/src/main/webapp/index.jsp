<%--<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>JSP - Hello World</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1><%= "Hello World!" %>--%>
<%--</h1>--%>
<%--<br/>--%>
<%--<a href="hello-servlet">Hello Servlet</a>--%>
<%--</body>--%>
<%--</html>--%>


<%


package com.example.student_webapp;

import java.sql.*;

public class StudentService {
Connection connection;
public StudentService()throws SQLException {

try {
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("DriverLoaded");
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_database", "root", "#aqi5r1");            System.out.println("Driver connected");

} catch (ClassNotFoundException | SQLException e) {
throw new RuntimeException(e);
}



}
public int insertRecord(Student student) throws SQLException {
int result=0;
PreparedStatement preparedStatement= connection.prepareStatement("insert into student_data values (?,?,?,?)");
preparedStatement.setString(1,student.getRollno());
preparedStatement.setString(2,student.getName());
preparedStatement.setString(3,student.getAddress());
preparedStatement.setString(4,student.getCity());
result= preparedStatement.executeUpdate();

return result;
}

public ResultSet getRecord(){

ResultSet resultSet=null;
try{
Statement statement=connection.createStatement();
resultSet=statement.executeQuery("SELECT *from Student_data");
}catch (Exception e){
System.out.println(e);
}
return  resultSet;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
*
* @author tejswini
*/
@WebServlet(urlPatterns = {"/MyFirstServlet"})
public class MyFirstServlet extends HttpServlet {

/**
* Processes requests for both HTTP <code>GET</code> and <code>POST</code>
* methods.
*
* @param request servlet request
* @param response servlet response
* @throws ServletException if a servlet-specific error occurs
* @throws IOException if an I/O error occurs
*/
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");
try (PrintWriter out = response.getWriter()) {
/* TODO output your page here. You may use following sample code. */
String str = request.getParameter("text");
out.println("<!DOCTYPE html>");
out.println("<html>");
out.println("<head>");
out.println("<title>Servlet MyFirstServlet</title>");
out.println("</head>");
out.println("<body>");
out.println("<h1>Tejswini Wannewar " + request.getContextPath()+str+ "</h1>");
out.println("</body>");
out.println("</html>");
}
}

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
    * Handles the HTTP <code>GET</code> method.
    *
    * @param request servlet request
    * @param response servlet response
    * @throws ServletException if a servlet-specific error occurs
    * @throws IOException if an I/O error occurs
    */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    processRequest(request, response);
    }

    /**
    * Handles the HTTP <code>POST</code> method.
    *
    * @param request servlet request
    * @param response servlet response
    * @throws ServletException if a servlet-specific error occurs
    * @throws IOException if an I/O error occurs
    */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    processRequest(request, response);
    }

    /**
    * Returns a short description of the servlet.
    *
    * @return a String containing servlet description
    */
    @Override
    public String getServletInfo() {
    return "Short description";
    }// </editor-fold>

}
%>