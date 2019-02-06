package ocp.concurrency.Queue.blockingqueue;

import java.sql.Time;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class InterviewScheduler implements Runnable{
    private BlockingQueue<String> queue;

    public InterviewScheduler(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("10 candidates have arrived");
        for (int i=1; i<=10; i++){
            String msg = new String("Candiate " + i);
            try{
                // better to use offer ... bacause of return value (for this use case at least)
//                queue.put(msg);
                if(queue.offer(msg, 1, TimeUnit.SECONDS))
                    System.out.println("Interview scheduled for " + msg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Interviews scheduled for all candidates");
        String msg = new String("stop");

        try {
            queue.put(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
