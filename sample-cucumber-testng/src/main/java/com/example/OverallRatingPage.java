package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class OverallRatingPage extends BaseClass{

     public static String popularMakeButton = "[title='Lamborghini']";
     public static String totalPaginationPageBreak= "my-pager .pull-xs-right";
     public static String lanciaYpsilonImage="img[title='Lancia Ypsilon']";
     public static String lancia ="tr:nth-of-type(4) > td:nth-of-type(2) > a";
     public static String lancialogo ="tr:nth-of-type(4) > td:nth-of-type(2) > a";
     public static String Rank ="Rank";
     public static String rankSortPositionAscen = "tbody tr:nth-of-type(1) td:nth-of-type(4)";
     public static String login="button";




    public static void clicksOverAllRatingPageButton() {
        driver.findElement (By.linkText ("Buggy Rating")).click();
        driver.findElement(By.cssSelector (popularMakeButton)).isDisplayed ();
        driver.findElement(By.cssSelector ("body > my-app > div > main > my-home > div > div:nth-child(3) > div > a > img")).click ();


    }

    public static void assertLandingPageOAR() {
        WebElement element = driver.findElement(By.linkText ("Lamborghini"));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("Lamborghini"));
    }

    public static void choosesPagani() {
        driver.findElement(By.cssSelector ("tr:nth-of-type(2) > td:nth-of-type(2) > a")).click();
    }

    public static void assertPaganiComments(String comments) {
        WebElement element = driver.findElement(By.cssSelector ("tbody tr:nth-of-type(1) td:nth-of-type(3)"));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains(comments));
    }

    public static void choosesZonda() {
        driver.findElement(By.linkText ("Zonda")).click();
    }

    public static void choosesRally037() {
        driver.findElement(By.linkText ("Rally 037")).click();
    }

    public static void assertRally037Comments(String comments) {
        WebElement element = driver.findElement(By.cssSelector ("tbody tr:nth-of-type(1) td:nth-of-type(3)"));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains(comments));
    }

    public static void clickPaginationButton() {
        driver.findElement(By.cssSelector ("my-pager .pull-xs-right .btn:nth-child(3)")).click();
    }

    public static void assertPopularMakePaginationIsWorking() {
        WebElement element = driver.findElement(By.cssSelector (totalPaginationPageBreak));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("page 2 of 5"));
    }


    public static void assertPaginationCountIsCorrect() {
        WebElement element = driver.findElement(By.cssSelector (totalPaginationPageBreak));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("page 5 of 5"));
    }

    public static void assertIfImageIsExisting() {
        WebElement element = driver.findElement(By.cssSelector (lanciaYpsilonImage));
        String strng = element.getAttribute ("naturalWidth");
        System.out.println(strng);
        Assert.assertTrue(strng.contains("311"));

    }

    public static void goToLancia() {
        //driver.findElement(By.cssSelector (lancia)).click ();
        driver.findElement(By.cssSelector (lancialogo)).click ();
    }


    public static void goToStratos() {
        driver.findElement (By.cssSelector ("tr:nth-of-type(3) > td:nth-of-type(2) > a")).click ();
    }

    public static void goToLanciaLink() {
        driver.findElement (By.cssSelector (lancia)).click ();
    }

    public static void clickRankOA() {
        driver.findElement (By.linkText (Rank)).click ();
    }

    public static void assertAscendingSortRank() {
        WebElement element = driver.findElement(By.cssSelector (rankSortPositionAscen));
        String strng = element.getText ();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("21"));

    }

    public static void clickVoteOA() {
        driver.findElement (By.cssSelector ("thead tr th:nth-of-type(5)"));
    }

    public static void assertAscendingSortVote() {
        WebElement element = driver.findElement(By.cssSelector ("tbody tr:nth-of-type(1) td:nth-of-type(4)"));
        String strng = element.getText ();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("21"));
    }

    public static void clickLogout() {
        driver.findElement (By.linkText ("Logout"));
    }

    public static void assertIfUserIsInHomepage() {
        WebElement element = driver.findElement(By.cssSelector (login));
        String strng = element.getText ();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("Login"));
    }
}
