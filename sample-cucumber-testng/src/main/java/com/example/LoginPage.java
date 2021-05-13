package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage extends BaseClass{



    public static String txtUsername = "Username";
    public static String txtPassword = "Password";
    public static String btnSubmit = "button";
    public static String loginStatusField = "span";
    public static String loginStatusFieldFailed = ".label-warning";
    public static String loginHeader="span";
    public static String notNowButton=".xui-u-flex-align-center > [tabindex='0']:nth-child(5)";


    public static void enterUsername(String strUsername){
        driver.findElement(By.name(txtUsername)).sendKeys(strUsername);
    }

    public static void enterPassword(String strPassword){
        driver.findElement(By.name(txtPassword)).sendKeys(strPassword);
    }

    public static void clickSubmit(){
        driver.findElement(By.cssSelector (btnSubmit)).click();
    }






    public static void clickNotNow() {
        driver.findElement(By.cssSelector (notNowButton)).click();
    }
}
