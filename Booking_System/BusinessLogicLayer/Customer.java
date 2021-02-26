package Booking_System.BusinessLogicLayer;

public class Customer {
    //Declaring encapsulated attributes
    private String custName;
    private String custSurname;
    private int phoneNum;

    //Constructor
    public Customer(String N,String S,int Num){
        this.custName = N;
        this.custSurname = S;
        this.phoneNum = Num;
    }

    //Creating Get Methods
    public String GetName(){
        return this.custName;
    }

    public String GetSName(){
        return this.custSurname;
    }

    public int GetNum(){
        return this.phoneNum;
    }

    //Creating Set Methods
    public void SetName(String name){
        this.custName = name;
    }

    public void SetSName(String sname){
        this.custSurname = sname;
    }

    public void SetNum(int num){
        this.phoneNum = num;
    }
}
