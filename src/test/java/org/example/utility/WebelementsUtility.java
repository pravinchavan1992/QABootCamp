package org.example.utility;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebelementsUtility {

    private static WebElement findElement(WebDriver driver, By by){
        if(waitForElementVisible(driver,by)) {
            return driver.findElement(by);
        }
        return null;
    }

    public static  void clickOnElement(WebDriver driver, By by){
        findElement(driver,by).click();
    }

    public static void enterData(WebDriver driver, By by, String input){
        findElement(driver, by).sendKeys(input);
    }

    private static boolean waitForElementVisible(WebDriver driver, By by){
       return new WebDriverWait(driver, Duration.ofSeconds(3)).until(x->x.findElement(by).isDisplayed());
    }
}
