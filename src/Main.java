
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of seats: ");
        int totalSeats = sc.nextInt();

        ReservationSystem system = new ReservationSystem(totalSeats);

        while (true) {

            System.out.println("\n1. Book Seat");
            System.out.println("2. Cancel Seat");
            System.out.println("3. View Seats");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 0) break;

            switch (choice) {

                case 1:
                    System.out.print("Enter Passenger ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Seat Number: ");
                    int seat = sc.nextInt();

                    if (seat < 1 || seat > totalSeats) {
                        System.out.println("Invalid seat number!");
                        break;
                    }

                    Passenger p = new Passenger(name, id);

                    Thread t = new Thread(() -> {
                        system.bookSeat(seat, p);
                    });

                    t.start();

                    try {
                        t.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    break;

                case 2:
                    System.out.print("Enter Seat Number to Cancel: ");
                    int cancelSeat = sc.nextInt();

                    system.cancelSeat(cancelSeat);
                    break;

                case 3:
                    system.viewSeats();
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}