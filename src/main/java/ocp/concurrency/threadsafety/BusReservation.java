package ocp.concurrency.threadsafety;

public class BusReservation implements Runnable {
    private int totalSeatsAvailable = 2;

    @Override
    public void run() {
        PassengerThread passengerThread = (PassengerThread) Thread.currentThread();
    }
}
