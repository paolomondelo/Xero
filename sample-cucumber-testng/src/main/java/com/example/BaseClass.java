package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;

    public static void setDriver(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\mondelop\\Desktop\\Java Selenium\\WestPac4\\sample-cucumber-testng\\src\\main\\resources\\chromedriver.exe");

        driver = new ChromeDriver();
    }
    protected WebDriverWait driverWait(long timeoutSeconds) {
        return new WebDriverWait(driver, timeoutSeconds);
    }


    public static void navigateToHome(){
        driver.get("https://login.xero.com/identity/user/login/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

    }

    public static void closeDriver(){
       // driver.close ();


        driver.quit();

    }


}
