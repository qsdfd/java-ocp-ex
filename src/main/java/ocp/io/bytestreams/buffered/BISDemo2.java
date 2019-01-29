package ocp.io.bytestreams.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BISDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;

        try {
            fileInputStream = new FileInputStream("myInputFile.txt");
//            int bufferSize = 8 * 1024;
//            bufferedInputStream = new BufferedInputStream(fileInputStream, bufferSize);
            bufferedInputStream = new BufferedInputStream(fileInputStream);

            byte[] destBuffer = new byte[10];

            int numberOfBytesRead = bufferedInputStream.read(destBuffer, 0, 4);
            System.out.println("numberOfBytesRead = " + numberOfBytesRead);

            for (byte b : destBuffer) {
                System.out.print((char) b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(fileInputStream != null) fileInputStream.close();
            if(bufferedInputStream != null) bufferedInputStream.close();
        }
    }
}
