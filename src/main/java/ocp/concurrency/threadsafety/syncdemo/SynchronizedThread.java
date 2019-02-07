package ocp.concurrency.threadsafety.syncdemo;

class Visit {
    public static long visit = 0;
}

public class SynchronizedThread extends Thread {
    @Override
    public void run() {
        synchronized (Visit.class){
            Visit.visit++;
            System.out.print(Visit.visit + " ");
        }
    }

    public static void main(String[] args) {
        for (int i=0; i<25; i++){
            Thread thread = new SynchronizedThread();
            thread.start();
        }
    }
}
