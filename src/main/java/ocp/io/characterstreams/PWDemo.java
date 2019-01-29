package ocp.io.characterstreams;

import java.io.*;

public class PWDemo {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = null;
        FileOutputStream fileOutputStream = null;

        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter("myOutputFile.txt");
            fileOutputStream = new FileOutputStream(new File("myOutputFile.txt"));

            printWriter = new PrintWriter(fileWriter);
//            printWriter = new PrintWriter(fileOutputStream);
//            printWriter = new PrintWriter("myOutputFIle");
//            printWriter = new PrintWriter(new File("myOutputFIle"));

            printWriter.println(true);
            printWriter.println((int)123);
            printWriter.println((float) 123.456);

            int ok = 52;
            double nok = 2.36;
            printWriter.printf("i= %d and k = %f", ok, nok);

            System.out.format("ok %d lol %f", (int)2, (double)5);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileWriter != null) fileWriter.close();
            if(printWriter != null) printWriter.close();
        }
    }
}
