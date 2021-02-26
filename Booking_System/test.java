package Booking_System;

import java.io.IOException;

import Booking_System.BusinessLogicLayer.Customer;
import Booking_System.DataAccessLayer.Datahandler;

public class test {
    public static void main(String[] args) throws Exception {
        
        Customer cs = new Customer("Mr", "Deaven", "Nortier", "yourself@gmail.com", 234324234);
        Datahandler d = new Datahandler();
       
        try {
            d.RegisterCustomer(cs);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
