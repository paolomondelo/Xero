package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AccountingPage extends BaseClass{

     public static String Rank ="Rank";
     public static String login="button";
     public static String accountingButton=".xnav-header--main [role] [data-header-component='menu-parent']:nth-of-type(3) button";
     public static String bankAccounts="Bank accounts";



    public static void goToAccounting() {
        driver.findElement (By.cssSelector (accountingButton)).click ();
        driver.findElement (By.linkText (bankAccounts)).click();
    }
}
