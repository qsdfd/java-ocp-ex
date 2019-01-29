package ocp.io.bytestreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PSDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = null;
        PrintStream printStream = null;

        try {
                ex1(fileOutputStream, printStream);
//            ex2(printStream);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(fileOutputStream != null) fileOutputStream.close();
            if(printStream != null) printStream.close();
        }
    }

    private static void ex2(PrintStream printStream) throws FileNotFoundException{
        printStream = new PrintStream(System.err);
        printStream.println("Error occured...");
    }

    private static void ex1(FileOutputStream fileOutputStream, PrintStream printStream) throws FileNotFoundException {
        fileOutputStream = new FileOutputStream("myFile.txt");
        printStream = new PrintStream(fileOutputStream);

        printStream.println(2500);
        printStream.println("Hello lol");
        printStream.println(25.988);
        printStream.println(true);

        printStream = new PrintStream(System.out);

        int ok = 52;
        double nok = 2.36;
        printStream.printf("i= %d and k = %f", ok, nok);
    }
}
