package Booking_System.DataAccessLayer;

import java.io.IOException;
import java.sql.*;

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
            System.out.println(e.toString());
        }
    }
}
