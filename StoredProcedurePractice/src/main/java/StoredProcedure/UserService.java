package StoredProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    public void insertUser(String name, String email){
        String sql = "{CALL insert_user(?, ?)}";

        try(Connection conn = DatabaseUtil.getConnection();
            CallableStatement stmt = conn.prepareCall(sql)){

            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.execute();
            System.out.println("Employee inserted successfully");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<Users> getUsers(){
        List<Users> users = new ArrayList<>();

        String sql = "{CALL get_all_users()}";

        try(Connection conn = DatabaseUtil.getConnection();
            CallableStatement stmt = conn.prepareCall(sql);
            ResultSet rs = stmt.executeQuery()){

            while (rs.next()) {
                Users user = new Users();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));

                users.add(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return users;
    }
}

