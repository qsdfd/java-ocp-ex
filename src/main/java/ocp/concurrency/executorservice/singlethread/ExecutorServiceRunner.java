package ocp.concurrency.executorservice.singlethread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));


        System.out.println("\nTask3 started");

        for (int i = 301; i<= 399; i++)
            System.out.print(i + " ");

        System.out.println("\nTask 3 done ");

        executorService.shutdown();

    }
}
