
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.Class.forName;

public class Sudent_Service {

    Connection connection;
    public void Student_Service(){
        try {
            class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_details");
            System.out.println("Connection Establised");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        public int getRecord(Student)
        }
    }
}
