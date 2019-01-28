package ocp.io.bytestreams.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;

        try {
            fileInputStream = new FileInputStream("myInputFile");
//            int bufferSize = 8 * 1024;
//            bufferedInputStream = new BufferedInputStream(fileInputStream, bufferSize);
            bufferedInputStream = new BufferedInputStream(fileInputStream);

            int i;

            while (((i = bufferedInputStream.read()) != -1)) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(fileInputStream != null) fileInputStream.close();
            if(bufferedInputStream != null) bufferedInputStream.close();
        }
    }
}
