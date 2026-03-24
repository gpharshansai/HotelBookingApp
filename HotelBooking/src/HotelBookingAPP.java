import java.util.*;

// Reservation class
class Reservation {
    String guestName;
    String roomId;

    public Reservation(String guestName, String roomId) {
        this.guestName = guestName;
        this.roomId = roomId;
    }
}

public class HotelBookingAPP {

    // List to maintain booking history
    private List<Reservation> bookingHistory;

    // Constructor
    public HotelBookingAPP() {
        bookingHistory = new ArrayList<>();
    }

    // Add confirmed booking
    public void addBooking(String guestName, String roomId) {
        bookingHistory.add(new Reservation(guestName, roomId));
    }

    // Display booking history
    public void displayHistory() {
        System.out.println("Booking History");

        for (Reservation r : bookingHistory) {
            System.out.println("Guest: " + r.guestName + ", Room ID: " + r.roomId);
        }
    }

    // Generate report
    public void generateReport() {
        System.out.println("\nBooking Report");
        System.out.println("Total Bookings: " + bookingHistory.size());
    }

    // Main method
    public static void main(String[] args) {

        HotelBookingAPP app = new HotelBookingAPP();

        // Sample confirmed bookings
        app.addBooking("Abhi", "Single-1");
        app.addBooking("Subha", "Single-2");
        app.addBooking("Vanmathi", "Suite-1");

        // Show history
        app.displayHistory();

        // Show report
        app.generateReport();
    }
}