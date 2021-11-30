package org.example.pageobjects;

import com.google.common.util.concurrent.Uninterruptibles;
import org.example.POJO.UserDetails;
import org.example.utility.WebelementsUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {
    By accountLogo = By.cssSelector("#navbarAccount");
    By loginButton = By.cssSelector("#navbarLoginButton");
    By notYetCustomerlink = By.cssSelector("#newCustomerLink");
    By email = By.cssSelector("#emailControl");
    By Password = By.cssSelector("#passwordControl");
    By repeatPassword = By.cssSelector(("#repeatPasswordControl"));
    By selectQue = By.cssSelector("#mat-select-2");
    By selectAns = By.cssSelector("#mat-option-4");
    By submit = By.cssSelector("#registerButton");
    By closePopUp = By.xpath("//button//span[contains(text(),'Dismiss')]");
    By ans = By.cssSelector("#securityAnswerControl");

    public HomePage(){
    }

    public void navigateToLoginPage(WebDriver driver){
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        WebelementsUtility.clickOnElement(driver, closePopUp);
        WebelementsUtility.clickOnElement(driver, accountLogo);
        WebelementsUtility.clickOnElement(driver, loginButton);
    }

    public void navigateToCustomerRegistrationPagePage(WebDriver driver){
        WebelementsUtility.clickOnElement(driver, notYetCustomerlink);
    }

    public void enterCustometerdata(WebDriver driver, UserDetails testdata ){
        WebelementsUtility.enterData(driver, email, testdata.getEmail());
        WebelementsUtility.enterData(driver, Password, testdata.getPassword());
        WebelementsUtility.enterData(driver, repeatPassword, testdata.getRepeatPassword());
        WebelementsUtility.clickOnElement(driver, selectQue);
        WebelementsUtility.clickOnElement(driver, selectAns);
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        WebelementsUtility.enterData(driver, ans, testdata.getSecurityAns());
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        WebelementsUtility.clickOnElement(driver, submit);
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    }


}
