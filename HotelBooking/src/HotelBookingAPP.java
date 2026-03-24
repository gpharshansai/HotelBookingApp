import java.util.HashMap;
import java.util.Map;

// Room class to store room details
class Room {
    int beds;
    int size;
    double price;
    int availability;

    public Room(int beds, int size, double price, int availability) {
        this.beds = beds;
        this.size = size;
        this.price = price;
        this.availability = availability;
    }
}

public class  HotelBookingAPP {

    // Centralized inventory
    private HashMap<String, Room> inventory;

    // Constructor
    public  HotelBookingAPP() {
        inventory = new HashMap<>();
    }

    // Add room type
    public void addRoom(String type, int beds, int size, double price, int availability) {
        inventory.put(type, new Room(beds, size, price, availability));
    }

    // Update availability
    public void updateAvailability(String type, int change) {
        Room room = inventory.get(type);
        if (room != null) {
            if (room.availability + change < 0) {
                System.out.println("Not enough rooms available for " + type);
            } else {
                room.availability += change;
            }
        }
    }

    // Display inventory
    public void displayInventory() {
        System.out.println("Hotel Room Inventory Status\n");

        for (Map.Entry<String, Room> entry : inventory.entrySet()) {
            String type = entry.getKey();
            Room r = entry.getValue();

            System.out.println(type + " Room:");
            System.out.println("Beds: " + r.beds);
            System.out.println("Size: " + r.size + " sqft");
            System.out.println("Price per night: " + r.price);
            System.out.println("Available Rooms: " + r.availability);
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        HotelBookingAPP system = new HotelBookingAPP();

        // Add rooms
        system.addRoom("Single", 1, 250, 1500.0, 5);
        system.addRoom("Double", 2, 400, 2500.0, 3);
        system.addRoom("Suite", 3, 750, 5000.0, 2);

        // Display inventory
        system.displayInventory();
    }
}