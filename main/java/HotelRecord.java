import java.util.*;

public class HotelRecord {
    Map<String, Hotel> hotelReservation = new HashMap<>();

    public static void main(String[] args) {

        System.out.println("Welcome to the Hotel Record System");
        HotelRecord obj = new HotelRecord();
        obj.addHotel();

    }

    /**
     * Add the hotel names Bridgewood Lakewood,Ridgewood
     */
    public void addHotel() {
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a choice");
            System.out.println("1. enter hotel");
            System.out.println("2. exit the search");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    Hotel hotelObj = new Hotel();
                    System.out.println("Enter the name of hotel");
                    String name = s.next();
                    hotelObj.setHotelName(name);
                    hotelReservation.put(name, hotelObj);
                    break;
                case 2:
                    System.exit(0);
                    break;
                case 3:
                    System.out.println("Invalid entry");
                    break;
            }

        }
    }
}

/**
 * Hotel class for creating hotel details for the hotel object
 */
class Hotel {

    String hotelName;
    int rating;
    String dayType;
    int rate;
    String customer_type;


    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDayType() {
        return dayType;
    }

    public void setDayType(String dayType) {
        this.dayType = dayType;
    }

}
