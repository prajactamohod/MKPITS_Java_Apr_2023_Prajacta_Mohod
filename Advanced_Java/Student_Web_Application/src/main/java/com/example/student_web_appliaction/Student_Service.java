package com.example.student_web_appliaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Student_Service {

    Connection connection;

    public Student_Service() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");   //sql connectivity
        System.out.println("Driver Loaded");  // if yes then driver loaded will print

        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student_details", "root","Prajacta2505");
        System.out.println("Connection Established");


    }
    catch(Exception e){
        System.out.println(e);

    }

    }
    public int getRecord(Student student) throws SQLException {
        int result=0;
        PreparedStatement preparedStatement=connection.prepareStatement("insert into Record_Insertion values(?,?,?,?)");
        preparedStatement.setString(1,student.getRoll_no());
        preparedStatement.setString(2,student.getName());
        preparedStatement.setString(3,student.getAddress());
        preparedStatement.setString(4,student.getCity());

         result=preparedStatement.executeUpdate();
        return result;
    }

}

