package ocp.io.characterstreams.Buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BRDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader("myInputFile.txt");
//            int bufferSize = 8 * 1024;
//            bufferedReader = new BufferedReader(fileReader, bufferSize);
            bufferedReader = new BufferedReader(fileReader);

//            printByLine(bufferedReader);
            printByChar(bufferedReader);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(fileReader != null) fileReader.close();
            if(bufferedReader != null) bufferedReader.close();
        }
    }

    private static void printByLine(BufferedReader bufferedReader) throws IOException {
        String line = null;
        while (((line = bufferedReader.readLine()) != null)) {
            System.out.println(line);
        }
    }

    private static void printByChar(BufferedReader bufferedReader) throws IOException {
        int i;
        while (((i = bufferedReader.read()) != -1)) {
            System.out.print((char) i);
        }
    }
}
