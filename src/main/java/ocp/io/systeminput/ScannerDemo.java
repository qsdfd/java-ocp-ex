package ocp.io.systeminput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = null;

        try{
//            ex1(scanner);
//            ex2(scanner);
//            ex3(scanner);
//            ex4(scanner);
            ex5(scanner);

        }catch (FileNotFoundException e){
            e.printStackTrace();
        } finally {
            if(scanner != null) scanner.close();
        }
    }

    private static void ex5(Scanner scanner) throws FileNotFoundException {
        scanner = new Scanner(new BufferedReader(new FileReader("testDoublesFile.txt")));
        scanner.useLocale(Locale.US);
        int sum = 0;

        while (scanner.hasNext()) {
            if(scanner.hasNextDouble()){
                double doubleValue = scanner.nextDouble();
                System.out.println("doubleValue = " + doubleValue);
                sum += doubleValue;
            }else{
                scanner.next();
            }
        }

        System.out.println("sum = " + sum);
    }

    private static void ex4(Scanner scanner) throws FileNotFoundException {
        scanner = new Scanner(new BufferedReader(new FileReader("myFile.txt")));

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }

    private static void ex3(Scanner scanner) throws FileNotFoundException {
        scanner = new Scanner(new File("myFile.txt"));

        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }

    }

    private static void ex2(Scanner scanner) {
        String inputValue = "10-20-30-40";
        scanner = new Scanner(inputValue);
        scanner.useDelimiter("-");

        int sum = 0;

        while (scanner.hasNext()) {
            int intValue = scanner.nextInt();
            System.out.println(intValue);
            sum += intValue;
        }

        System.out.println("sum = " + sum);
    }

    private static void ex1(Scanner scanner) {
        scanner = new Scanner(System.in);

        System.out.print("Enter your Id: ");
        int rollno = scanner.nextInt();

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your weight: ");
        double weight = scanner.nextDouble();

        System.out.println("Id: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
    }
}
