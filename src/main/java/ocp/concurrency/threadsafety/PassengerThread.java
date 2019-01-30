package ocp.concurrency.threadsafety;

public class PassengerThread extends Thread {
    private int seatsNeeded;

    public PassengerThread(int seatsNeeded, Runnable target, String name) {
        super(target, name);
        this.seatsNeeded = seatsNeeded;
    }

    public int getSeatsNeeded() {
        return seatsNeeded;
    }
}
