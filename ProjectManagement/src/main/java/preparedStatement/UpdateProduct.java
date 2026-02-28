package preparedStatement;

import JDBC.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProduct {

    public static void main(String[] args) {
        String query = "UPDATE products SET price = ?, quantity = ?, rating = ?, manufacturer = ? WHERE product_id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setDouble(1, 60000.00);
            pstmt.setInt(2, 15);
            pstmt.setDouble(3, 4.8);
            pstmt.setString(4, "HP");
            pstmt.setInt(5, 101);

            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Product updated successfully!");
            } else {
                System.out.println("No product found with given ID.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
