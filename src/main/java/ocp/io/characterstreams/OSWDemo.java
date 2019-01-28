package ocp.io.characterstreams;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OSWDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter outputStreamWriter = null;

        try {
            outputStreamWriter = new OutputStreamWriter(System.out);

            outputStreamWriter.write("ok");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(outputStreamWriter != null) outputStreamWriter.close();
        }
    }
}
