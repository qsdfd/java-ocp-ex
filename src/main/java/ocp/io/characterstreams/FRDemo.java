package ocp.io.characterstreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FRDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader("myInputFile");
//            fileReader = new FileReader(new File("myInputFile"));

            int i;

            while((i = fileReader.read()) != -1){
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }  finally {
            if(fileReader != null){
                fileReader.close();
            }
        }
    }
}
