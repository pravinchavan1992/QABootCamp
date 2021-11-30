package org.example.DriverManager;

import org.openqa.selenium.WebDriver;

public class Driver {

    private Driver() {
    }

    private static final ThreadLocal<WebDriver> dr = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return dr.get();
    }

    public static void setDriver(WebDriver driver) {
        Driver.dr.set(driver);
    }

    public static void quit() {
        Driver.getDriver().quit();
        dr.remove();
    }

}
