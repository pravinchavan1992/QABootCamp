package org.example.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.DriverManager.invokeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Objects;

public class BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void initialize() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://localhost:3000/#/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){
        if(Objects.nonNull(driver)) {
            driver.quit();
        }
    }
}
