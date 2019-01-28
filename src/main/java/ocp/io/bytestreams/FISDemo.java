package ocp.io.bytestreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;


        try {
            File file = new File("NiceFile");
            fileInputStream = new FileInputStream(file);
//            fileInputStream = new FileInputStream("NiceFile");

            System.out.println("Available: " + fileInputStream.available());
            System.out.println();

            int i;

            while((i=fileInputStream.read()) != -1 ){
                System.out.print((char) i);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
          if(fileInputStream != null){
              fileInputStream.close();
          }
        }

    }
}
