package Booking_System.DataAccessLayer;

import java.sql.*;

import Booking_System.BusinessLogicLayer.Booking;
import Booking_System.BusinessLogicLayer.Customer;

public class Datahandler {

    private Connection connect = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    private String sqlQ;   

    public void RegisterCustomer(Customer cust)throws Exception{
        try 
        {
         
            connect=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BookingSys;integratedSecurity=true");
            statement=connect.createStatement();
            sqlQ = "INSERT INTO Customers VALUES('"+ cust.GetTitle() +"','"+ cust.GetName() +"','" + cust.GetSName() +"'," + cust.GetNum() +",'" + cust.GetMail() +"')";
            statement.executeUpdate(sqlQ);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }  
        finally{
            connect.close();
        }     
    }   

    // Declaring variables to execute mySQL queries
   

    //Method to insert customer details into the Customer table
    public void insertCustomer(Customer cust) throws Exception{

        try{

            connect = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BookingSys;integratedSecurity=true");
            statement = connect.createStatement();
            sqlQ = "INSERT INTO Customers VALUES('" + cust.GetTitle() + "','" + cust.GetName() + "','" + cust.GetSName() + "','" + cust.GetNum() + "','" + cust.GetMail() + "')";
            statement.executeUpdate(sqlQ);
        }
        catch (Exception e){
            System.out.println(e.toString());
        } 
        finally{
            connect.close();
        }  
    }


    //Method to insert booking details into the Bookings table
    public void insertBooking(Booking book, int cID) throws Exception {
        try{

            connect = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BookingSys;integratedSecurity=true");
            statement = connect.createStatement();
            sqlQ = "INSERT INTO dbo.Bookings VALUES ('" + cID + "','" + book.getEventType() + "','" + book.getEventDate() + "','" + book.getVenueAddress() + "','" + book.getNumOfPeople() + "','" + book.getDecoration() + "')";
            statement.executeUpdate(sqlQ);
        }
        catch (Exception e){
            System.out.println(e.toString());;
        } 
        finally{
            connect.close();
        }
    }


    //Method to update the FoodMenu table before booking confirmation
    public void updateFoodMenu(int mID, int bID) throws Exception{
        try{

            connect = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BookingSys;integratedSecurity=true");
            statement = connect.createStatement();
            sqlQ = "UPDATE dbo.BookingFood SET MenuID = " + mID + " WHERE = " + bID;
            statement.executeUpdate(sqlQ);
        }
        catch (Exception e){
            System.out.println(e.toString());
        } 
        finally{
            connect.close();
        }
    }

    //Method to display booking details
    public void displayBookings() throws Exception {
        
        try{
         
            connect = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BookingSys;integratedSecurity=true");

            statement = connect.createStatement();

            sqlQ = "SELECT * FROM dbo.Bookings";

            resultSet = statement.executeQuery(sqlQ);

            while(resultSet.next()){
                int bID = resultSet.getInt("BookingID");
                int cID = resultSet.getInt("CustomerID");
                String eType = resultSet.getString("EventType");
                String date = resultSet.getString("[Date]");
                String venue = resultSet.getString("Venue");
                int tPeople = resultSet.getInt("NumOfPeople");
                int deco = resultSet.getInt("Decorations");

                System.out.println(bID + " " + cID + " " + eType + " " + date + " " + venue + " " + tPeople + " " + deco);  
            }
        } 
        catch (Exception e) {
            System.out.println(e.toString());
        } 
        finally {
            connect.close();
        }
    }
}
