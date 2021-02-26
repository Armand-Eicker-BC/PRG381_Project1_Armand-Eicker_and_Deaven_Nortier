package Booking_System.BusinessLogicLayer;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BusinessOperations {

    //Checks if discount should be applied
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

    //calculates a discounted price at 15% of the amount
    public double applyDiscount(float amount){
        double discountAmount = amount - (amount * 0.15);
        return discountAmount;
    }

    //calculate difference between dates
    public long dateDifference(String eventDate){

        LocalDate eDate = LocalDate.parse(eventDate);
        LocalDate today = LocalDate.now();

        long difference = today.until(eDate, ChronoUnit.DAYS);

        return difference;   
    }
}
