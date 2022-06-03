package Testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class PersonelLoan {
    @Test
    public void PersonelloanLogin()
    {
        System.out.println("Login to the personel loan application");
    }

    @Test
    public void PersonelLoanCustomerName(){
        System.out.println("Display name of the customers who took personel loan");
    }
    @Test

    public void PrsonelLoanPaidCustomerName(){
        System.out.println("Personel loan is paid by these customer");
    }
    @Test
    public void PersonelLoanPendingCustomerName(){

        System.out.println("Personel loan is not paid by these customer");
    }
    @BeforeTest
    public void PersonelLoanLastExecution(){

        System.out.println("This method will execute first");
    }
}
