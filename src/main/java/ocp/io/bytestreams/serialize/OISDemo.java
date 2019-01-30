package ocp.io.bytestreams.serialize;

import java.io.*;

public class OISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            fileInputStream = new FileInputStream("employee.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);

            Employee employee = (Employee)objectInputStream.readObject();

            System.out.println(employee);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(fileInputStream != null) fileInputStream.close();
            if(objectInputStream != null) objectInputStream.close();
        }
    }
}
