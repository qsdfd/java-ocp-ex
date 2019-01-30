package ocp.concurrency.executorservice.singlethread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();

            service.execute(new Task1());
            service.execute(new Task2());
            service.execute(new Task3());

        } finally {
            if (service != null) service.shutdown();
        }
        if (service != null) {
            service.awaitTermination(3, TimeUnit.SECONDS);
            // Check whether all tasks are finished
            if (service.isTerminated())
                System.out.println("All tasks finished");
            else
                System.out.println("At least one task is still running");
        }
    }
}
