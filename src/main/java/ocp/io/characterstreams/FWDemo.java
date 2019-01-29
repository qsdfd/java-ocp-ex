package ocp.io.characterstreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FWDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = null;

        try {
//            fileWriter = new FileWriter("myFile.txt");
//            fileWriter = new FileWriter(new File("myFile.txt"));
            fileWriter = new FileWriter(new File("myFile.txt"), true);

            fileWriter.write("Peter is going to Japan\n");

            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null){
                fileWriter.close();
            }
        }
    }
}
