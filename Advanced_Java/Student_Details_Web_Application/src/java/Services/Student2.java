package Services;


import Bank.Studentt;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Student2 {
    Connection connection;
    public Student2()  {
       
        try{
       
             Class.forName("com.mysql.cj.jdbc.Driver");
                 System.out.println("driver loaded");
                 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_details", "root", "Prajacta2505");
                 System.out.println("connection Establish");
        }
        catch(Exception ex){
            System.out.println(ex);
        }
      }
       
    public int insertMethod(Studentt student) {
        int r=0;
      try{
        PreparedStatement preparedStatment = connection.prepareStatement("insert into student_info value(?,?,?,?)");
        preparedStatment.setString(1, student.getRoll_no());
        preparedStatment.setString(2,student.getNAme());
        preparedStatment.setString(3,student.getAddress());
        preparedStatment.setString(4,student.getCity());
        
        r=preparedStatment.executeUpdate();
        }
      catch(Exception e){
        System.out.print(e);
        }
    return r;
    }
   
   }

    

