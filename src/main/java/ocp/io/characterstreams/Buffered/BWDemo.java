package ocp.io.characterstreams.Buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BWDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter("myOutPutFile");
//            int bufferSize = 8 * 1024;
//            bufferedReader = new BufferedReader(fileReader, bufferSize);
            bufferedWriter = new BufferedWriter(fileWriter);

            String line1 = "Peter is going to india.";
            String line2 = "John is going to india.";

            bufferedWriter.write(line1);
            bufferedWriter.newLine();
            bufferedWriter.write(line2);

            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileWriter != null) fileWriter.close();
            if(bufferedWriter != null) bufferedWriter.close();
        }
    }
}
