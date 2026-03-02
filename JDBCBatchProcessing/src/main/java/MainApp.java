import com.capgemini.dao.UserDAO;
import com.capgemini.dao.UserDAOImpl;
import com.capgemini.entity.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        UserDAO dao = new UserDAOImpl();

        //InsertBatch Example

//        List<User> users = Arrays.asList(
//                new User("Rishabh", "rishabh@gmail.com"),
//                new User("Shivam", "shivam@gmail.com"),
//                new User("Suyash", "suyash@gmail.com"),
//                new User("Om", "om@gmail.com")
//        );
//
//        try{
//            dao.insertBatch(users);
//        }catch(SQLException e){
//            e.printStackTrace();
//        }


        //Update Batch Example

//        List<User> updateUsers = Arrays.asList(
//                new User(7, "Rishabhs", "rishabhUpdate@gmail.com"),
//                new User(8, "Shivams", "shivamUpdate@gmail.com"),
//                new User(9, "Suyashs", "suyashUpdate@gmail.com"),
//                new User(10, "Oms", "omUpdate@gmail.com")
//        );
//
//        try{
//            dao.updateBatch(updateUsers);
//        }catch(SQLException e){
//            e.printStackTrace();
//        }

        //Delete Batch Example

//        List<Integer> userIds = Arrays.asList(8, 9, 10);
//
//        try{
//            dao.deleteBatch(userIds);
//        }catch (SQLException e){
//            e.printStackTrace();
//        }

        List<User> users = new ArrayList<>();
        try{
            users = dao.getAllUsers();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        users.forEach(user -> System.out.println(user.getName() + " " + user.getEmail()));


    }
}
