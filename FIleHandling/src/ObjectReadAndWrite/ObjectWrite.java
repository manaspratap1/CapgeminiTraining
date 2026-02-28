package ObjectReadAndWrite;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectWrite {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Manas");
        Student s2 = new Student(2, "Rishabh");
        Student s3 = new Student(3, "Shivam");

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/studentObj.txt", true))){
            out.writeObject(s1);
            out.writeObject(s2);
            out.writeObject(s3);

            System.out.println("Objects saved successfully");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
