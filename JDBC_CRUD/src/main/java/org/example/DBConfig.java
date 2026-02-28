package org.example;

import com.mysql.cj.jdbc.Driver;
import java.sql.*;

import java.sql.SQLException;

public class DBConfig {
    public static void main(String[] args) throws SQLException {

        Driver driver = new Driver();
        DriverManager.registerDriver(driver);

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test_db",
                "root",
                "root"
        );

        Statement statement = connection.createStatement();

//        int rowsInserted = statement.executeUpdate(
//                "INSERT INTO users (user_id, username, email, password, age) \n" +
//                        "VALUES (1, 'John Doe', 'john@does.com', 'john123' , 50)"
//        );
//
//        if(rowsInserted > 0) {
//            System.out.println(rowsInserted + " rows inserted");
//        }else{
//            System.out.println("Insert failed");
//        }

        //FETCH Example
//        ResultSet rs = statement.executeQuery("Select * from users");
//
//        while(rs.next()){
//            int id = rs.getInt("user_id");
//            String name = rs.getString("username");
//            String email = rs.getString("email");
//            int age = rs.getInt("age");
//
//            System.out.println(id + " | " + name + " | " + age + " | " + email);
//        }

        //UPDATE Example

//        int rowsUpdated = statement.executeUpdate(
//                "UPDATE users SET age = 30 WHERE user_id = 1"
//        );
//
//        if (rowsUpdated > 0) {
//            System.out.println(rowsUpdated + " row(s) updated");
//        } else {
//            System.out.println("Update failed");
//        }

        //DELETE Example

//        int rowsDeleted = statement.executeUpdate(
//                "DELETE FROM users WHERE user_id = 1"
//        );
//
//        if (rowsDeleted > 0) {
//            System.out.println(rowsDeleted + " row(s) deleted");
//        } else {
//            System.out.println("Delete failed");
//        }

        connection.close();
    }
}
