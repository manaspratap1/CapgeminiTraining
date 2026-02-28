package CreateWrite;

import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {
    public static void main(String[] args) {
        try {
            doWrite();
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    public static void doWrite() throws IOException{

        FileWriter writer = new FileWriter("data/student.txt", true);

        writer.write("\nName : james");
        writer.write("\nCourse : Golang");
        writer.write("\nMarks : 95");

        writer.close();
    }
}
