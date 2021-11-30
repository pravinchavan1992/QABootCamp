package org.example.tests;

import org.example.POJO.UserDetails;
import org.example.pageobjects.HomePage;
import org.testng.annotations.Test;

public class RegisterUserTest extends BaseTest {

    @Test
    public void TestUserRegistration(){
        HomePage homePage = new HomePage();
        homePage.navigateToLoginPage(driver);
        homePage.navigateToCustomerRegistrationPagePage(driver);
        UserDetails testdata = UserDetails.builder()
                .email("test@mmm.com")
                .password("test@mmm.com")
                .repeatPassword("test@mmm.com")
                .securityAns("test").build();
        homePage.enterCustometerdata(driver, testdata);
    }
    @Test
    public void TestUserRegistration1(){
        HomePage homePage = new HomePage();
        homePage.navigateToLoginPage(driver);
        homePage.navigateToCustomerRegistrationPagePage(driver);
        UserDetails testdata = UserDetails.builder()
                .email("test@mmm.com")
                .password("test@mmm.com")
                .repeatPassword("test@mmm.com")
                .securityAns("test").build();
        homePage.enterCustometerdata(driver, testdata);
    }

}
