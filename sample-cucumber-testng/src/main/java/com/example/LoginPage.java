package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage extends BaseClass{



    public static String txtUsername = "login";
    public static String txtPassword = "password";
    public static String btnSubmit = "button";
    public static String loginStatusField = "span";
    public static String loginStatusFieldFailed = ".label-warning";
    public static String loginHeader="span";


    public static void enterUsername(String strUsername){
        driver.findElement(By.name(txtUsername)).sendKeys(strUsername);
    }

    public static void enterPassword(String strPassword){
        driver.findElement(By.name(txtPassword)).sendKeys(strPassword);
    }

    public static void clickSubmit(){
        driver.findElement(By.cssSelector (btnSubmit)).click();
    }

    public static void verifyTitle(String title){
        Assert.assertTrue(driver.getTitle().equals(title));
    }

    public static void verifyLoginSuccess() {
        WebElement element = driver.findElement(By.cssSelector (loginStatusField));
        String strng = element.getText();
        //System.out.println(strng);
        Assert.assertEquals("Hi, paolo", strng);

    }


    public static void verifyLoginFailed() {
        WebElement element = driver.findElement(By.cssSelector (loginStatusFieldFailed));
        String strng = element.getText();
        //System.out.println(strng);
        Assert.assertEquals("Invalid username/password", strng);
    }

    public static void visitRegistration() {
        driver.get("https://buggy.justtestit.org/register");
    }

    public static void assertThatRegPageIsNoLongerAccessible() {
        WebElement element = driver.findElement(By.cssSelector (loginHeader));
        String strng = element.getText();
        Assert.assertFalse (strng.contains("Hi, paolo"));




    }
}
