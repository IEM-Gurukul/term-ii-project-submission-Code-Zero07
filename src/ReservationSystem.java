import java.util.*;

public class ReservationSystem {

    private Map<Integer, Passenger> bookedSeats = new HashMap<>();
    private List<Integer> availableSeats = new ArrayList<>();
    private int ticketCounter = 1;

    public ReservationSystem(int totalSeats) {
        for (int i = 1; i <= totalSeats; i++) {
            availableSeats.add(i);
        }
    }

    public synchronized void bookSeat(int seatNo, Passenger p) {
        if (!availableSeats.contains(seatNo)) {
            System.out.println("Seat "+seatNo+" already booked!");
            return;
        }
        availableSeats.remove(Integer.valueOf(seatNo));
        bookedSeats.put(seatNo, p);
        Ticket ticket = new Ticket(ticketCounter++, seatNo, p);
        System.out.println("Booked: "+ticket);
        FileHandler.saveBooking(ticket.toString());
    }

    public synchronized void cancelSeat(int seatNo) {
        if (!bookedSeats.containsKey(seatNo)) {
            System.out.println("Seat not booked!");
            return;
        }
        bookedSeats.remove(seatNo);
        availableSeats.add(seatNo);
        System.out.println("Seat "+seatNo+" cancelled.");
    }

    public void viewSeats() {
        System.out.println("Available Seats: "+availableSeats);
    }
}
