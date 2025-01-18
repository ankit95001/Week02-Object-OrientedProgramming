public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
	
    public String getData() {
        return "Guest Name: " + guestName + ", Room Type: " + roomType + ", Nights: " + nights;
    }

    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking customBooking = new HotelBooking("Ankit kumar", "Suite", 3);
        HotelBooking copiedBooking = new HotelBooking(customBooking);

        System.out.println(getData(defaultBooking));
        System.out.println(getData(customBooking));
        System.out.println(getData(copiedBooking));
    }
}
