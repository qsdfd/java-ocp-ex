package ocp.io.bytestreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FISFOSDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream("myInputFile");
            fileOutputStream = new FileOutputStream("myOutputFile", false);

            int i;

            while ((i=fileInputStream.read()) != -1){
                fileOutputStream.write(i);
            }

            System.out.println("Done");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(fileInputStream != null) fileInputStream.close();
            if(fileOutputStream != null) fileOutputStream.close();
        }


    }
}
