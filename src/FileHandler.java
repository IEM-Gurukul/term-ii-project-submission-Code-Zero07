import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    public static void saveBooking(String data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("bookings.txt", true))) {
            bw.write(data);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Can not write to File: " + e.getMessage());
        }
    }
}
