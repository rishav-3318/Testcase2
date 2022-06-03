package Testng;

import org.testng.annotations.Test;
public class CarLoan {
    @Test
    public void CarLoanLogin(){
        System.out.println("Login to the car loan application");
    }

    @Test
    public void CarLoanCustomerName(){

        System.out.println("Display name of the customers who took car loan");
    }
    @Test
    public void CarLoanPaidCustomerName(){
        System.out.println("car loan is paid by these customer");
    }
    @Test
    public void CarLoanPendingCustomerName(){
        System.out.println("Car loan is not paid by these customer");
    }
}
