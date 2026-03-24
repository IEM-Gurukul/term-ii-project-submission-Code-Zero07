public class BookingThread extends Thread {

    private ReservationSystem system;
    private Passenger passenger;
    private int seatNo;

    public BookingThread(ReservationSystem system, Passenger passenger, int seatNo) {
        this.system = system;
        this.passenger = passenger;
        this.seatNo = seatNo;
    }

    public void run() {
        system.bookSeat(seatNo, passenger);
    }
}
