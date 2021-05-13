package com.example;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RegistrationPage extends BaseClass{

    public static String firstnameField = "firstName";
    public static String usernameField = "username";
    public static String registerButton = ".btn-success-outline";
    public static String lastnameField = "lastName";
    public static String passwordField = "password";
    public static String confirmPasswordField = "confirmPassword";
    public static String registerButtonSubmit = "body > my-app > div > main > my-register > div > div > form > button";
    public static String registerErrorMessage= ".result";
    public static String assertRegisterSuccess=".alert-success";


    public static void navigatetoRegPage() {
        driver.findElement(By.cssSelector (registerButton)).click();
    }

    public static void populateLoginName(String loginname) {

        String userName = ""+(int)(Math.random()*Integer.MAX_VALUE);
        String emailID = loginname+userName+"test@";
        driver.findElement (By.name(usernameField)).sendKeys (emailID);
        System.out.println(emailID);

    }

    public static void populateFirstName(String firstname) {
        driver.findElement(By.name (firstnameField)).sendKeys(firstname);
    }

    public static void populateLastName(String lastname) {
        driver.findElement (By.name(lastnameField)).sendKeys (lastname);
        
    }

    public static void populatePassword(String password) {
        driver.findElement (By.id(passwordField)).sendKeys (password);
    }

    public static void populateConfirmPassword(String confirmpassword) {
        driver.findElement (By.name(confirmPasswordField)).sendKeys (confirmpassword);
    }

    public static void clickRegisterButton() {
        driver.findElement (By.cssSelector (registerButtonSubmit)).click ();
    }

    public static void assertErrorMessage() {
        WebElement element = driver.findElement(By.cssSelector (registerErrorMessage));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("Password did not conform with policy"));

    }

    public static void assertRegistrationSuccessMessage() {
        WebElement element = driver.findElement(By.cssSelector (assertRegisterSuccess));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("Registration is successful"));
    }

    public static void populateLoginName1(String loginname) {

        String userName = ""+(int)(Math.random()*Integer.MAX_VALUE);
        String emailID = loginname+userName+"test@";
        driver.findElement (By.name(usernameField)).sendKeys (emailID);
        System.out.println(emailID);

        driver.findElement (By.cssSelector (registerButtonSubmit)).click ();
        System.out.println(emailID);
        System.out.println(emailID);
        System.out.println(emailID);
        System.out.println(emailID);
        System.out.println(emailID);
        System.out.println(emailID);
        driver.findElement(By.name("login")).sendKeys(emailID);
        driver.findElement(By.name("password")).sendKeys("Paolomondelo#123");
        driver.findElement(By.cssSelector(".form-inline button")).isDisplayed ();
        driver.findElement(By.cssSelector(".form-inline button")).click ();


    }
}
