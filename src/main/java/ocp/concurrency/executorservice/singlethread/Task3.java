package ocp.concurrency.executorservice.singlethread;

public class Task3 implements Runnable{
    @Override
    public void run() {
        System.out.println("\nTask 3 started");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nTask 3 done ");
    }
}
