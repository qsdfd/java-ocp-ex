package ocp.concurrency.threadsafety;

public class HappyBusMain {
    public static void main(String[] args) {
        BusReservation busReservation = new BusReservation();
        PassengerThread p1 = new PassengerThread(2, busReservation, "Sam");
        PassengerThread p2 = new PassengerThread(2, busReservation, "Jack");
        p1.start();
        p2.start();
    }
}
