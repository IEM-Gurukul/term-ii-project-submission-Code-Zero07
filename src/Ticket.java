public class Ticket {
    private int ticketId;
    private int seatNumber;
    private Passenger passenger;

    public Ticket(int ticketId, int seatNumber, Passenger passenger) {
        this.ticketId = ticketId;
        this.seatNumber = seatNumber;
        this.passenger = passenger;
    }

    public String toString() {
        return "Ticket ID: " + ticketId +
               ", Seat: " + seatNumber +
               ", Passenger: " + passenger.getName();
    }
}