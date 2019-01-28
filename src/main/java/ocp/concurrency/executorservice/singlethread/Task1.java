package ocp.concurrency.executorservice.singlethread;

public class Task1 extends Thread {
    @Override
    public void run() {
        System.out.println("\nTask1 started");

        for (int i = 101; i<= 199; i++)
            System.out.print(i + " ");

        System.out.println("\nTask 1 done ");
    }
}
