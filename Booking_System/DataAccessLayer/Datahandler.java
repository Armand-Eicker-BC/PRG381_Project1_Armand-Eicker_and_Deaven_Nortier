package Booking_System.DataAccessLayer;

import java.io.IOException;
import java.sql.*;

import Booking_System.BusinessLogicLayer.Customer;

public class Datahandler {
       
    String sqlQ;

    public void RegisterCustomer(Customer cust)throws IOException{
        try 
        {
         
            Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BookingSys;integratedSecurity=true");
            Statement stmt=con.createStatement();
            sqlQ = "INSERT INTO Customers VALUES('"+ cust.GetTitle() +"','"+ cust.GetName() +"','" + cust.GetSName() +"'," + cust.GetNum() +",'" + cust.GetMail() +"')";
            stmt.executeUpdate(sqlQ);
        } 
        catch (Exception e) 
        {
            System.out.println(e.toString());
        }
    }
}
