package ocp.concurrency.executorservice.scheduled;

public class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("My task started..");

        System.out.println("My task end..");
    }
}
