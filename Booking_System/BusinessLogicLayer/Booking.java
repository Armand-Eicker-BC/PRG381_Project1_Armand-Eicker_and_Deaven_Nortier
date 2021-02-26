package Booking_System.BusinessLogicLayer;

public class Booking {
    String eventType;
    String eventDate;
    String eventTime;
    String venueAddress;
    int phoneNumber;
    int numOfPeople;
    String foodMenu;
    boolean decoration;

    public Booking(String eventType, String eventDate, String eventTime, String venueAddress, int phoneNumber, int numOfPeople, String foodMenu, boolean decoration) {
        this.eventType = eventType;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.venueAddress = venueAddress;
        this.phoneNumber = phoneNumber;
        this.numOfPeople = numOfPeople;
        this.foodMenu = foodMenu;
        this.decoration = decoration;
    }

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
