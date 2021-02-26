package Booking_System.BusinessLogicLayer;

public class BusinessOperations {

    public boolean checkDiscount(int numOfPeople){
        boolean check = false;

        if(numOfPeople > 40)
        {
            check = true;
        }
        else
        {
            check=false;
        }

        return check;
    }

    public double applyDiscount(float amount){
        double discountAmount = amount - (amount * 0.15);
        return discountAmount;
    }
}
