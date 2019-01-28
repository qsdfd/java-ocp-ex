package ocp.executorservice.singlethread;

public class Task2 implements Runnable{
    @Override
    public void run() {
        System.out.println("\nTask2 started");

        for (int i = 201; i<= 299; i++)
            System.out.print(i + " ");

        System.out.println("\nTask 2 done ");
    }
}
