package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.sql.SQLOutput;
public class HomeLoan {
    @Test
    public void HomeLoanLogin(){
        System.out.println("LOgin to the home loan application");
    }
    @BeforeMethod
    public void Homeloan(){
        System.out.println("This test will execute after every method ");

    }
    @Test
    public void HomeLoanCustomerName(){
        System.out.println("Display name of the home loan customers");
    }
    @Test
    public void HomaLoanPaidCustomerName(){
        System.out.println("Home loan is paid by these customer");
    }
    @Test
    public void HomeLoanPendingCustomerName(){
        System.out.println("Home loan is not paid by these customer");
    }
    @AfterMethod
    public void HomrLoanAfterMethod(){
        System.out.println("This test will execute after every method");
    }
    @AfterTest
    public void HomeLoanExecuteLast(){
        System.out.println("This test will execute at the last");
    }
}
