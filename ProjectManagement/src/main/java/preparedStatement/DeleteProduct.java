package preparedStatement;

import JDBC.DBConnection;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class DeleteProduct {
    public static void main(String[] args) {
        String query = "DELETE FROM  products WHERE product_id = ?";

        try(Connection conn = DBConnection.getConnection();
            PreparedStatement pstms = conn.prepareStatement(query)){
            pstms.setInt(1, 101);

            int rowsDeleted = pstms.executeUpdate();

            if(rowsDeleted > 0){
                System.out.println("Deleted Successfully!!");
            }else{
                System.out.println("Not deleted");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
