package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProfilePage extends BaseClass{


     public static String modelValue = "tr:nth-of-type(1) > td:nth-of-type(2) > a";
     public static String rankColumn ="Rank";
     public static String rankValue = "tbody tr:nth-of-type(1) td:nth-of-type(3)";
     public static String modelAventador="AVENTADOR";
     public static String firstnamePPChange = "firstName";
     public static String lastnamePPChange = "lastName";
     public static String saveButton = "button";

     public static String saveStatusMessage= ".alert.alert-success.hidden-md-down.result";
     //public static String saveStatusMessage= ".hidden-md-down";
     public static String ppLandingPage="form [class='col-lg-4']:nth-of-type(1) .card-header";
     public static String ppLandingPage2="form [class='col-lg-4']:nth-of-type(2) .card-header";
     public static String ageField="[name='age']";
     public static String addy="textarea#address";
     public static String phoneNum="[name='phone']";
     public static String newPwordField="[name='newPassword']";
     public static String newConfirmPwordField ="[name='newPasswordConfirmation']";
     public static String hobbieslist="select#hobby";
     public static String knitting="[name] option:nth-of-type(11)";
     public static String ageWholeNum ="form [class='col-lg-4']:nth-of-type(2) .alert-danger";
     public static String saveSInvalidPwordMessage=".hidden-md-down";
     public static String ageWholeNumErrorDecimal=".alert.alert-danger.hidden-md-down.result";



    public static void modelShouldBePopulated() {
        WebElement element = driver.findElement(By.cssSelector (modelValue));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("Diablo"));
    }


    public static void rankValueShouldBePopulated() {
        WebElement element = driver.findElement(By.cssSelector (rankValue));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("1"));
    }



    public static void chooseaModelAventador() {

        driver.findElement(By.linkText (modelAventador)).click();
    }

    public static void navigatetoProfile() {

        driver.findElement (By.linkText ("Profile")).click();

    }

    public static void assectProfileLandingPage() {
        WebElement element = driver.findElement(By.cssSelector (ppLandingPage));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("Basic"));
    }

    public static void validateProfilePage() {
        WebElement element = driver.findElement(By.cssSelector (ppLandingPage2));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("Additional Info"));
    }

    public static void populateFirstNamePP(String firstnameppchange) {
        driver.findElement(By.name (firstnamePPChange)).clear ();
        driver.findElement(By.name (firstnamePPChange)).sendKeys(firstnameppchange);
    }

    public static void populateLastNamePP(String lastnameppchange) {
        driver.findElement(By.name (lastnamePPChange)).clear();
        driver.findElement(By.name (lastnamePPChange)).sendKeys(lastnameppchange);
    }

    public static void savesChanges() {
        driver.findElement (By.cssSelector (saveButton)).isDisplayed ();
        driver.findElement(By.cssSelector (saveButton)).click ();
    }

    public static void assertSavedSuccessMessage() {
                WebElement element = driver.findElement(By.cssSelector (saveStatusMessage));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("The profile has been saved successful"));




    }


    public static void populateAge(String age) {

        driver.findElement(By.cssSelector (ageField)).sendKeys(age);
    }

    public static void populateAddress(String address) {
        driver.findElement(By.cssSelector (addy)).sendKeys(address);
    }

    public static void populatePhone(String phone) {
        driver.findElement(By.cssSelector (phoneNum)).sendKeys(phone);
    }

    public static void populateConfirmPassword(String confirmspassword) {
//       driver.findElement(By.cssSelector ("[name='currentPassword']")).clear ();
        driver.findElement(By.cssSelector ("[name='currentPassword']")).isEnabled ();

        driver.findElement(By.id ("currentPassword")).sendKeys(confirmspassword);

        System.out.println(confirmspassword);
    }

    public static void populateNewPassword(String newpassword) {
        driver.findElement(By.cssSelector (newPwordField)).sendKeys(newpassword);

    }

    public static void populateNewConfirmPassword(String confirmnewpassword) {
        driver.findElement(By.cssSelector ("input#newPasswordConfirmation")).sendKeys(confirmnewpassword);

    }


    public static void populateHobbies() {
        driver.findElement(By.cssSelector (hobbieslist)).click ();
        driver.findElement (By.cssSelector (knitting)).click ();

    }

    public static void assertAgeError() {
        WebElement element = driver.findElement(By.cssSelector (ageWholeNum));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("The profile has been saved successful"));
    }

    public static void assertAgeErrorWholeNum() {
        WebElement element = driver.findElement(By.cssSelector (ageWholeNum));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("Age must be in the range from 0 to 95"));
    }

    public static void assertErrorInvalidPword() {
        WebElement element = driver.findElement(By.cssSelector (saveSInvalidPwordMessage));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("InvalidPasswordException"));
        //Assert.assertTrue(strng.contains("InvalidPasswordException: Password did not conform with policy:"));
    }

    public static void asserErrorDecimalMsg() {
        WebElement element = driver.findElement(By.cssSelector (ageWholeNumErrorDecimal));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("Get a candy ;)"));
    }

    public static void assertageErrorMsgDescp() {
        WebElement element = driver.findElement(By.cssSelector (ageWholeNumErrorDecimal));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("Invalid Age Entered"));
    }
}
