package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BankAccountPage extends BaseClass{


     public static String Rank ="Rank";
     public static String login="button";
     public static String bankAccountTitle="#title";
     public static String addBankButton="Add Bank Account";
     public static String aNZNZ="//li[contains(text(),'ANZ (NZ)')]";
     public static String bankaccountnameField="#accountname-1037-inputEl";
     public static String accountTypeField="#accounttype-1039-inputEl";
     public static String everyday ="//li[contains(text(),'Everyday (day-to-day)')]";
     public static String loan ="//li[contains(text(),'Loan')]";
     public static String other ="//li[contains(text(),'Term Deposit')]";
     public static String termdeposit ="//li[contains(text(),'Term Deposit')]";
     public static String creditcard="//li[contains(text(),'Credit Card')]";
     public static String accountNumField= "#accountnumber-1068-inputEl";
     public static String continueButton ="#common-button-submit-1015-btnInnerEl";
     public static String statusBox = "#notify01";
     public static String creditNumField="[data-automationid='creditCardNumber'] .x-form-empty-field-default";
     public static String creditNumField1="#accountnumber-1063-inputEl";



    public static void assertBankAccountPage() {
        WebElement element = driver.findElement(By.cssSelector (bankAccountTitle));
        String strng = element.getText ();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("Bank accounts"));
    }

    public static void addAccountName(String accountname) {
        String userName = ""+(int)(Math.random()*Integer.MAX_VALUE);
        String accountNme = accountname+userName;
        System.out.println(accountNme);
        driver.findElement (By.cssSelector (bankaccountnameField)).sendKeys(accountNme);
        System.out.println(accountNme);
    }



    public static void clickAddBankButton() {
        driver.findElement (By.linkText (addBankButton)).click ();
    }

    public static void chooseANZNZ() {
        driver.findElement (By.xpath (aNZNZ)).click();
    }

    public static void clickAccountTypeEveryday() {
        driver.findElement (By.cssSelector (accountTypeField)).click ();
        driver.findElement (By.xpath (everyday)).click ();

    }

    public static void enterAccountNumber(String accountnumber) {
        driver.findElement (By.cssSelector (accountNumField)).sendKeys (accountnumber);
        driver.findElement (By.cssSelector (continueButton)).click ();
    }

    public static void assertBankAccountAdded() {
        WebElement element = driver.findElement(By.cssSelector (statusBox));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("has been added."));

    }

    public static void clickAccountTypeLoan() {
        driver.findElement (By.cssSelector (accountTypeField)).click ();
        driver.findElement (By.xpath (loan)).click ();
    }

    public static void clickAccounTermDeposit() {
        driver.findElement (By.cssSelector (accountTypeField)).click ();
        driver.findElement (By.xpath (termdeposit)).click ();
    }

    public static void clickAccountOther() {
        driver.findElement (By.cssSelector (accountTypeField)).click ();
        driver.findElement (By.xpath (other)).click ();
    }

    public static void clickAccounCreditCard() {
        driver.findElement (By.cssSelector (accountTypeField)).click ();
        driver.findElement (By.xpath (creditcard)).click ();
    }

    public static void enterCreditCardNum(String creditcardnum) {
        driver.findElement (By.cssSelector (creditNumField)).click ();
        driver.findElement (By.cssSelector (creditNumField1)).sendKeys (creditcardnum);
        driver.findElement (By.cssSelector (continueButton)).click ();
    }
}
