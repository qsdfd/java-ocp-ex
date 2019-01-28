package ocp.io.bytestreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("newFIle");
            byte[] byteArray = "Peter is coming to India ok".getBytes();
            fileOutputStream.write(byteArray);

            System.out.println("Done");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(fileOutputStream != null){
                fileOutputStream.close();
            }
        }

    }
}
