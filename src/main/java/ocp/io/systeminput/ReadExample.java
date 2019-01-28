package ocp.io.systeminput;

import java.io.Console;
import java.io.IOException;

public class ReadExample {
    public static void main(String[] args) {

//        read();
        readlineAndPassword();
    }

    private static void readlineAndPassword() {
        Console cnsl = null;
        String name = null;
        char[] passwordArray = null;

        // can return null
        cnsl = System.console();

        if(cnsl != null){
            name = cnsl.readLine("Enter the username: ");
            System.out.println("Username = " + name);

            passwordArray = cnsl.readPassword("Enter the password: ");
            String password = new String(passwordArray);
            System.out.println("Password : " + password);
        }
    }

    private static void read() throws IOException {
        System.err.println("Error ...");

        System.out.print("Enter value: ");
        int intValue = System.in.read();
        System.out.println("int value = " + intValue);
        System.out.println((char)intValue);
    }
}
