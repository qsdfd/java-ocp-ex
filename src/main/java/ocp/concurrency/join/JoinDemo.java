package ocp.concurrency.join;

public class JoinDemo {
    public static Thread firstThread;
    public static Thread secondThread;

    public static void main(String[] args) {
        JoinThreads jt = new JoinThreads();
        firstThread = new Thread(jt, "First Thread");
        secondThread = new Thread(jt, "Second Thread");
        firstThread.start();

        while(true) {
            Thread.State firstThreadState = firstThread.getState();
            Thread.State secondThreadState = secondThread.getState();

            System.out.println(System.nanoTime() + " First Thread state: "  + firstThreadState);
            System.out.println(System.nanoTime() + " Second Thread state: "  + secondThreadState);

            System.out.println();
            System.out.println("#######################################");
            System.out.println();

            if(firstThreadState.equals(Thread.State.TERMINATED) && secondThreadState.equals(Thread.State.TERMINATED)){
                break;
            }
        }
    }
}
