package ocp.io.characterstreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FRWDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader("myInputFile.txt");
            fileWriter = new FileWriter("myOutputFile.txt");

            int c;

            while((c = fileReader.read()) != -1){
                fileWriter.write(c);
            }

            System.out.println("Done");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(fileReader != null) fileReader.close();
            if(fileWriter != null) fileWriter.close();
        }

    }
}
