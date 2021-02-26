package Booking_System.DataAccessLayer;

import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;

import Booking_System.BusinessLogicLayer.Customer;

public class Datahandler {
       
    String sqlQ;

    public void RegisterCustomer(Customer cust)throws IOException{
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_students","root","");
            Statement stmt=con.createStatement();
            sqlQ = "INSERT INTO Customers VALUES("+ cust.GetTitle() +","+ cust.GetName() +"," + cust.GetSName() +"," + cust.GetNum() +"," + cust.GetMail() +")";
            stmt.executeQuery(sqlQ);
        } 
        catch (Exception e) 
        {
            //TODO: handle exception
        }
    }
}
