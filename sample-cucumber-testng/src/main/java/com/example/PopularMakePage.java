package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class PopularMakePage extends BaseClass{



     public static String popularMakeButton = "[title='Lamborghini']";
     public static String modelColumn = "Model";
     public static String modelValue = "tr:nth-of-type(1) > td:nth-of-type(2) > a";
     public static String rankColumn ="Rank";
     public static String rankValue = "tbody tr:nth-of-type(1) td:nth-of-type(3)";
     public static String modelDiablo = "Diablo";
     public static String modelVeneno = "Veneno";
     public static String modelAventador="AVENTADOR";
     public static String venonoComment = "tbody tr:nth-of-type(1) td:nth-of-type(3)";
     public static String diabloComment = "tbody tr:nth-of-type(1) td:nth-of-type(3)";
     public static String paginationButton = "my-pager .pull-xs-right .btn:nth-child(3)";
     public static String totalPaginationPageBreak= "my-pager .pull-xs-right";
     public static String commentBox="[rows]";
     public static String voteButton=".btn-success";
     public static String votingSuccess=".card-text";
     public static String authorafterVoting="tbody tr:nth-of-type(1) td:nth-of-type(2)";
     public static String headerPopularMake=".card-header";
     public static String popularmakeHeader="body > my-app > header > nav > div > a";
     public static String homeButton ="//body/my-app//nav//a[@href='/broken']";
     public static String reventonLogo ="tr:nth-of-type(5) > td:nth-of-type(2) > a";
     public static String popularmakeHomeHeader="my-home [class='col-md-4']:nth-of-type(1) .text-xs-center";
     public static String reventonTxtLimit=".alert-danger";
     public static String votes ="thead th:nth-of-type(4) a";
     public static String rank9="tr:nth-of-type(1) > td:nth-of-type(3)";




    public static void navigatePopularMakePage() {
        driver.findElement (By.cssSelector (popularmakeHeader)).click ();
        driver.findElement(By.cssSelector (popularMakeButton)).isDisplayed ();
        driver.findElement(By.cssSelector (popularMakeButton)).click();
    }

    public static void redirecttoLandingPopularMakePage() {
        WebElement element = driver.findElement(By.cssSelector (headerPopularMake));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("Lamborghini"));
    }

    public static void modelColummShouldBeDisplayed() {
        WebElement element = driver.findElement(By.linkText (modelColumn));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("Model"));
    }

    public static void modelShouldBePopulated() {
        WebElement element = driver.findElement(By.cssSelector (modelValue));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("Diablo"));
    }

    public static void rankColumnShouldBeDisplayed() {
        WebElement element = driver.findElement(By.linkText (rankColumn));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("Rank"));
    }
    public static void rankValueShouldBePopulated() {
        WebElement element = driver.findElement(By.cssSelector (rankValue));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("1"));
    }

    public static void chooseaModelDiablo() {
        driver.findElement(By.linkText (modelDiablo)).isDisplayed ();
        driver.findElement(By.linkText (modelDiablo)).click();
    }

    public static void populateCommentBox(String comments) {
        driver.findElement(By.cssSelector (commentBox)).sendKeys(comments);
        driver.findElement (By.cssSelector (voteButton)).click();
    }

    public static void validateVote() {

        WebElement element = driver.findElement(By.cssSelector (votingSuccess));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("Thank you for your vote!"));
    }

    public static void validateAuthorCol() {
        //fix
    //   driver.findElement(By.linkText ("asdsfs")).isDisplayed ();
        WebElement element = driver.findElement(By.cssSelector (authorafterVoting));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("Ash Ketchum"));
    }

    public static void chooseaModelVeneno() {
        driver.findElement(By.linkText (modelVeneno)).isDisplayed ();
        driver.findElement(By.linkText (modelVeneno)).click();
    }

    public static void assertCommentBox(String comments) {
        WebElement element = driver.findElement(By.cssSelector (venonoComment));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains(comments));
    }

    public static void assertDiabloCommentBox(String comments) {
        WebElement element = driver.findElement(By.cssSelector (diabloComment));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains(comments));
    }

    public static void clickPaginationButton() {
        driver.findElement(By.cssSelector (paginationButton)).isDisplayed ();
        driver.findElement(By.cssSelector (paginationButton)).click();
    }

    public static void assertPopularMakePaginationIsWorking() {
        WebElement element = driver.findElement(By.cssSelector (totalPaginationPageBreak));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("page 2 of 2"));
    }

    public static void chooseaModelAventador() {
        driver.findElement(By.linkText (modelAventador)).isDisplayed ();
        driver.findElement(By.linkText (modelAventador)).click();
    }

    public static void choosesReventon() {
        driver.findElement(By.cssSelector (reventonLogo)).isDisplayed ();
        driver.findElement(By.cssSelector ((reventonLogo))).click();
    }

    public static void assertReventonCommentBox(String comments) {
        WebElement element = driver.findElement(By.cssSelector ("tbody tr:nth-of-type(1) td:nth-of-type(3)"));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains(comments));
    }


    public static void clicksTheHomeButton() {
        driver.findElement (By.xpath (homeButton)).click();

    }

    public static void assertIfUserIsInHomepage() {
        WebElement element = driver.findElement(By.cssSelector (popularmakeHomeHeader));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("Popular Make"));
    }

    public static void asserttextLimitIsDisplayed() {
        WebElement element = driver.findElement(By.cssSelector (reventonTxtLimit));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("Allowed number of string characters is 150"));
    }

    public static void assertTxtBoxWidthOfReventon() {
        WebElement element = driver.findElement(By.cssSelector ("tr:nth-of-type(1) > td:nth-of-type(3)"));
        String strng = element.getAttribute ("naturalWidth");
        System.out.println(strng);
        Assert.assertTrue(strng.contains("311"));

    }

    public static void choosesMurcialago() {
        driver.findElement(By.linkText ("Murciélago")).isDisplayed ();
        driver.findElement(By.linkText (("Murciélago"))).click();
    }

    public static void assertTxtBoxWidthOfMurcialago() {
        WebElement element = driver.findElement(By.cssSelector ("tbody tr:nth-of-type(1) td:nth-of-type(3)"));
        String strng = element.getCssValue ("width");
        System.out.println(strng);
        Assert.assertTrue(strng.contains("433px"));

    }

    public static void clickVoteSorting() {
     //driver.findElement (By.cssSelector (votes)).click ();
        driver.findElement (By.cssSelector ("thead th:nth-of-type(4) a")).click ();

        WebElement element = driver.findElement(By.cssSelector ("tbody tr:nth-of-type(1) td:nth-of-type(3)"));
        String strng = element.getText();
        System.out.println(strng);





    }

    public static void assertIfVotingSortingIsWorking() {

        WebElement element = driver.findElement(By.cssSelector ("tbody tr:nth-of-type(1) td:nth-of-type(3)"));
        System.out.println(element);
        //WebElement element = driver.findElement(By.cssSelector (rank9));
        element.isDisplayed ();
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("9"));
    }

    public static void clickRankSection() {
        driver.findElement (By.linkText ("Rank")).click ();
    }

    public static void assertSortingRanksPopularMake() {
        WebElement element = driver.findElement(By.cssSelector ("tbody tr:nth-of-type(1) td:nth-of-type(3)"));
        System.out.println(element);

        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("9"));

    }

    public static void clickRankSectionLink() {
        driver.findElement (By.linkText ("Rank")).click ();
    }

    public static void clickModelSection() {
        driver.findElement (By.linkText ("Model")).click ();
    }

    public static void venenoModelShouldBeTop() {
        WebElement element = driver.findElement(By.cssSelector ("tr:nth-of-type(1) > td:nth-of-type(2) > a"));
        System.out.println(element);

        String strng = element.getText();
        System.out.println(strng);
        Assert.assertTrue(strng.contains("Veneno"));
    }

    public static void chooseReventonLink() {
        driver.findElement (By.partialLinkText ("Revent")).click();
    }
}
