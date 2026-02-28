package ImageReadWrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageStore {
    public static void main(String[] args) {
        String sourcePath = "image/img.png";
        String destinationPath = "output/copied.png";

        try{
            FileInputStream fis = new FileInputStream(sourcePath);
            FileOutputStream fos = new FileOutputStream(destinationPath);

            byte[] buffer = new byte[1024];
            int bytesRead;

            while((bytesRead=fis.read(buffer)) != -1){
                fos.write(buffer, 0, bytesRead);
            }

            fis.close();
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
