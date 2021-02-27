package Booking_System.BusinessLogicLayer;

public class Account {
    private String lastPaymentDate;
    private double lastPaymentAmount;
    private double amountOutstanding;
    private double balanceOutstandingPercentage;
    private int customerID;

    public Account(int cID,double ao){
        this.customerID = cID;
        this.amountOutstanding = ao;
    }
}
