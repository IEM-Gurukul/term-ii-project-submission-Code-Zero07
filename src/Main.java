public class Main {

    public static void main(String[] args) {

        ReservationSystem system = new ReservationSystem(5);

        Passenger p1 = new Passenger("Rohit", 1);
        Passenger p2 = new Passenger("Rohan", 2);

        BookingThread t1 = new BookingThread(system, p1, 2);
        BookingThread t2 = new BookingThread(system, p2, 2);

        t1.start();
        t2.start();


        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        system.viewSeats();
    }
}
