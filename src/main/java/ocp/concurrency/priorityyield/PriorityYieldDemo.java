package ocp.concurrency.priorityyield;

public class PriorityYieldDemo {
    public static void main(String[] args) {
        YieldRunnable yieldRunnable = new YieldRunnable();
        ThreadGroup threadGroup = new ThreadGroup("All threads");
        Thread t1 = new Thread(threadGroup, yieldRunnable,"t1");
        Thread t2 = new Thread(threadGroup, yieldRunnable,"t2");
        Thread t3 = new Thread(threadGroup, yieldRunnable,"t3");
        Thread t4 = new Thread(threadGroup, yieldRunnable,"t4");
        Thread t5 = new Thread(threadGroup, yieldRunnable,"t5");
        Thread t6 = new Thread(threadGroup, yieldRunnable,"t6");
        Thread t7 = new Thread(threadGroup, yieldRunnable,"t7");
        Thread t8 = new Thread(threadGroup, yieldRunnable,"t8");
        Thread t9 = new Thread(threadGroup, yieldRunnable,"t9");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t4.setPriority(Thread.NORM_PRIORITY);
        t5.setPriority(Thread.NORM_PRIORITY);
        t6.setPriority(Thread.NORM_PRIORITY);

        t7.setPriority(Thread.MIN_PRIORITY);
        t8.setPriority(Thread.MIN_PRIORITY);
        t9.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();

        while(true){
            Thread.State t1State = t1.getState();
            Thread.State t2State = t2.getState();
            Thread.State t3State = t3.getState();
            Thread.State t4State = t4.getState();
            Thread.State t5State = t5.getState();
            Thread.State t6State = t6.getState();
            Thread.State t7State = t7.getState();
            Thread.State t8State = t8.getState();
            Thread.State t9State = t9.getState();

            System.out.println(System.nanoTime() + " t1 - Status: " + t1State);
            System.out.println(System.nanoTime() + " t2 - Status: " + t2State);
            System.out.println(System.nanoTime() + " t3 - Status: " + t3State);
            System.out.println(System.nanoTime() + " t4 - Status: " + t4State);
            System.out.println(System.nanoTime() + " t5 - Status: " + t5State);
            System.out.println(System.nanoTime() + " t6 - Status: " + t6State);
            System.out.println(System.nanoTime() + " t7 - Status: " + t7State);
            System.out.println(System.nanoTime() + " t8 - Status: " + t8State);
            System.out.println(System.nanoTime() + " t9 - Status: " + t9State);

            System.out.println();
            System.out.println("#######################################");
            System.out.println();

            // Check whether all threads are terminated
            if(threadGroup.activeCount() == 0){
                break;
            }
        }
    }
}
