package PreparedStatement;

import JDBC.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertProduct {
    public static void main(String[] args) {
        String query = "INSERT INTO products " + "(product_id, product_name, category, price, quantity, rating, manufacturer) "+ "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try(Connection conn = DBConnection.getConnection();
        PreparedStatement preparedStatement = conn.prepareStatement(query)){
            preparedStatement.setInt(1, 101);
            preparedStatement.setString(2, "Laptop");
            preparedStatement.setString(3, "Electronics");
            preparedStatement.setDouble(4, 55000.50);
            preparedStatement.setInt(5, 10);
            preparedStatement.setDouble(6, 4.5);
            preparedStatement.setString(7, "Dell");

            int rowsInserted = preparedStatement.executeUpdate();

            if(rowsInserted > 0){
                System.out.println("Product Inserted Successfully!!");
            }else{
                System.out.println("Not inserted");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
