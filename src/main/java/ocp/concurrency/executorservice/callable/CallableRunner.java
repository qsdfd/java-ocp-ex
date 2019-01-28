package ocp.concurrency.executorservice.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<String> welcomeFuture = executorService.submit(new CallableTask("in28Minutes"));

        System.out.println("\n new CallableTask(\"in28Minutes\") completed");

        String welcomeMessage = welcomeFuture.get();
        System.out.println(welcomeMessage);

        System.out.println("\n Main completed");

        executorService.shutdown();
    }
}
