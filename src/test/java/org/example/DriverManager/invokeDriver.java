package org.example.DriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class invokeDriver {
    public static WebDriver getDriver(String browser) {

        switch (browser.toUpperCase()){
            case "CHROME":
                setup(browser);
                Driver.setDriver(new ChromeDriver());
                break;
            case "IEXPLORER":
                setup(browser);
                Driver.setDriver(new InternetExplorerDriver());
                break;
        }
        return Driver.getDriver();
    }

    private static void setup(String browser){
        DriverManagerType driverManagerType = DriverManagerType.valueOf(browser.toUpperCase());
        WebDriverManager.getInstance(driverManagerType).setup();
    }
}
