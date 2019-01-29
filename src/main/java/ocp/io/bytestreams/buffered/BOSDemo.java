package ocp.io.bytestreams.buffered;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BOSDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("myOutputFile.txt");
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            byte byteArray[] = "Peter is going to India.".getBytes();
//            bufferedOutputStream.write(byteArray);
            bufferedOutputStream.write(byteArray, 18, 5);


            bufferedOutputStream.flush();
            System.out.println("Done");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(fileOutputStream != null) fileOutputStream.close();
            if(bufferedOutputStream != null) bufferedOutputStream.close();
        }
    }
}
