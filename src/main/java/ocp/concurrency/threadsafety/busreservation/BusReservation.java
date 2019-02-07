package ocp.concurrency.threadsafety.busreservation;

public class BusReservation implements Runnable {
    private int totalSeatsAvailable = 2;

    @Override
    public void run() {
        PassengerThread passengerThread = (PassengerThread) Thread.currentThread();
        boolean ticketsBooked = this.bookTickets(passengerThread.getSeatsNeeded(), passengerThread.getName());

        if(ticketsBooked){
            System.out.println(Thread.currentThread().getName() + " booked " + passengerThread.getSeatsNeeded() + " seats");
        }else{
            System.out.println(Thread.currentThread().getName() + " unable to book " + passengerThread.getSeatsNeeded() + " seats");
        }
    }

    // synchronized ensures the first thread that executes this method gets a lock so that the second thread will have to wait for the first one to be done ...
    public synchronized boolean bookTickets(int seats, String name){
        System.out.println("Welcome to HappyBus " + Thread.currentThread().getName() + " Number of tickets available are " + this.getTotalSeatsAvailable());

        if(seats > this.getTotalSeatsAvailable()){
            return false;
        } else {
            totalSeatsAvailable -= seats;
            return true;
        }
    }

    public int getTotalSeatsAvailable() {
        return totalSeatsAvailable;
    }
}
