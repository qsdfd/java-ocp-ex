package ocp.io.systeminput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ISRDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;

        try {
            inputStreamReader = new InputStreamReader(System.in);
            bufferedReader = new BufferedReader(inputStreamReader);
//            oneLiner(bufferedReader);
            whileLooper(bufferedReader);

        } catch (Exception e) {

        } finally {
          if(inputStreamReader != null) inputStreamReader.close();
          if(bufferedReader != null) bufferedReader.close();
        }
    }

    private static void whileLooper(BufferedReader bufferedReader) throws IOException {
        String data = "";
        while(!data.equals("stop")){
            System.out.print("Enter data : ");
            data = bufferedReader.readLine();
            System.out.println("data is : " + data);
        }
    }

    private static void oneLiner(BufferedReader bufferedReader) throws IOException {
        System.out.print("Giv name: ");
        String name = bufferedReader.readLine();
        System.out.println("Welcome " + name);
    }
}
