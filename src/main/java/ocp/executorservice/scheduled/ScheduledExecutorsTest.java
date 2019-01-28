package ocp.executorservice.scheduled;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorsTest {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        MyTask myTask = new MyTask();

        scheduledExecutorService.schedule(myTask, 5, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
    }
}
