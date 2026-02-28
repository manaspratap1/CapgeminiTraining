package ImageReadWrite;

import java.io.File;
import java.io.FileInputStream;

public class ImageRead {
    public static void main(String[] args) {

        String path = "output/copied.png";

        try{
            FileInputStream fis = new FileInputStream(path);

            int size = 0;

            while(fis.read() != -1){
                size++;
            }

            fis.close();

            System.out.println("Image Read successfully");
            System.out.println("Image size: " + size + " bytes");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
