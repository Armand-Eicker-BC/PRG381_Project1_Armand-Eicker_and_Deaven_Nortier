package Booking_System.BusinessLogicLayer;

public class Booking {
    //Declare encapsulated attributes
    private String eventType;
    private String eventDate;
    private String eventTime;
    private String venueAddress;
    private int phoneNumber;
    private int numOfPeople;
    private String foodMenu;
    private boolean decoration;

    //Constructor
    public Booking(String ETP, String ED, String ETM, String VA, int PN, int NOP, String FM, boolean D) {
        this.eventType = ETP;
        this.eventDate = ED;
        this.eventTime = ETM;
        this.venueAddress = VA;
        this.phoneNumber = PN;
        this.numOfPeople = NOP;
        this.foodMenu = FM;
        this.decoration = D;
    }

    //Creating Get and Set Methods
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getVenueAddress() {
        return venueAddress;
    }

    public void setVenueAddress(String venueAddress) {
        this.venueAddress = venueAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public String getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(String foodMenu) {
        this.foodMenu = foodMenu;
    }

    public boolean isDecoration() {
        return decoration;
    }

    public void setDecoration(boolean decoration) {
        this.decoration = decoration;
    }

    
       
}
