package Booking_System;

import java.io.IOException;

import Booking_System.BusinessLogicLayer.Customer;
import Booking_System.DataAccessLayer.Datahandler;

public class test {
    public static void main(String[] args) {
        Customer cs = new Customer("Mr", "Armand", "Eicker", "eickerarmand@gmail.com", 0711234567);
        Datahandler d = new Datahandler();
       
        try {
            d.RegisterCustomer(cs);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
