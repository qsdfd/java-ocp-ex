package ocp.concurrency.Queue.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class InterviewProcessor implements Runnable{
    private BlockingQueue<String> queue;

    public InterviewProcessor(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try{
            String msg;
            Thread.sleep(2500);
            while(!(msg = queue.poll(10, TimeUnit.SECONDS)).equals("stop")){
//            while(!(msg = queue.take()).equals("stop")){
                System.out.println("Interview completed for " + msg);
                Thread.sleep(2500);
            }
            System.out.println("Done interviewing all candidates");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
