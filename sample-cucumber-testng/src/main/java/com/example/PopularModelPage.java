package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PopularModelPage extends BaseClass{

      public static String headerPopularModelPage="body > my-app > header > nav > div > a";
      public static String diabloLogo="[title='Diablo']";
      public static String numofVotes="h4 > strong";
      public static String popmodePageHeader="h3";

    public static void navigatePopularModelPage() {
        driver.findElement (By.cssSelector (headerPopularModelPage)).click();
        driver.findElement (By.cssSelector (diabloLogo)).isDisplayed();
        driver.findElement (By.cssSelector(diabloLogo)).click ();
    }

    public static void validateLandingPagePopularModelPage() {
        driver.findElement (By.cssSelector (popmodePageHeader)).click();
        WebElement element = driver.findElement(By.cssSelector (popmodePageHeader));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("Diablo"));

    }

    public static void numberofVotes() {
        driver.findElement (By.cssSelector ("tr:nth-of-type(1) > td:nth-of-type(2) > a")).click();
        driver.findElement (By.cssSelector (numofVotes)).isDisplayed();
    }


}
