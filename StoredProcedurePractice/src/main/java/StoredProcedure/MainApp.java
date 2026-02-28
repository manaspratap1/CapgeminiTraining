package StoredProcedure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        UserService service = new UserService();

        service.insertUser("John", "john@gmail.com");

        List<Users> users = new ArrayList<>();

        users = service.getUsers();

        users.forEach(user -> System.out.println(user.getName() + " " + user.getEmail()));

//        Scanner sc = new Scanner(System.in);


    }
}
