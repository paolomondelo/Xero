package com.example.StepDefinitions;

import com.example.BaseClass;
import com.example.OverallRatingPage;
import com.example.PopularMakePage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class OverallRatingStepDefs extends BaseClass {




    @After
    public void teardown(){
   //     driver.close ();
       closeDriver ( );
    }




    @When("the user clicks the Overall Rating Page Button")
    public void theUserClicksTheOverallRatingPageButton() {
        OverallRatingPage.clicksOverAllRatingPageButton();
    }

    @Then("the user is redirected to Overall Rating Page")
    public void theUserIsRedirectedToOverallRatingPage() {
        OverallRatingPage.assertLandingPageOAR();
    }

    @And("the user chooses a model Pagani")
    public void theUserChoosesAModelPagani() {
        //    public void theUserChoosesAModelReventon() {
//       PopularMakePage.choosesReventon();
       OverallRatingPage.choosesPagani();
       OverallRatingPage.choosesZonda();
    }

    @And("^validate if the pagani comment section is populated with (.*?)$")
    public void validateIfThePaganiCommentSectionIsPopulatedWithComments(String comments) {
        OverallRatingPage.assertPaganiComments(comments);

    }

    @And("the user chooses a model Lancia")
    public void theUserChoosesAModelLancia() {
        OverallRatingPage.choosesRally037();
    }

    @And("^validate if rally037 comment section is populated with (.*?)$")
    public void validateIfRallyCommentSectionIsPopulatedWithComments(String comments) {
        OverallRatingPage.assertRally037Comments(comments);
    }


    @And("the page pagination is validated and is working properly on the overall rating page")
    public void thePagePaginationIsValidatedAndIsWorkingProperlyOnTheOverallRatingPage() {
        OverallRatingPage.clickPaginationButton();
        OverallRatingPage.assertPopularMakePaginationIsWorking();
    }


    @And("pagination should not exceed its pagination limit and should display page as 5 out of 5")
    public void paginationShouldNotExceedItsPaginationLimitAndShouldNotDisplayPageOutOf() {

        OverallRatingPage.assertPaginationCountIsCorrect();

    }

    @And("the user changes the pagination up to 5 times")
    public void theUserChangesThePaginationUpTo5() {
        OverallRatingPage.clickPaginationButton();
        OverallRatingPage.clickPaginationButton();
        OverallRatingPage.clickPaginationButton();
        OverallRatingPage.clickPaginationButton();



    }

    @And("the user changes the pagination up to 6 times")
    public void theUserChangesThePaginationUpTo6() {
        OverallRatingPage.clickPaginationButton();
        OverallRatingPage.clickPaginationButton();
        OverallRatingPage.clickPaginationButton();
        OverallRatingPage.clickPaginationButton();
        OverallRatingPage.clickPaginationButton();


    }


    @And("assert that the image is visible")
    public void assertThatTheImageIsVisible() {
        OverallRatingPage.assertIfImageIsExisting();
    }

    @And("pagination should be displayed be displayed as  5 out of 5")
    public void paginationShouldBeDisplayedBeDisplayedAsOutOf() {
        OverallRatingPage.assertPaginationCountIsCorrect();
    }

    @And("check Lancia and go to Ypsilon")
    public void checkLanciaAndGoToYpsilon() {
        OverallRatingPage.goToLancia();
        //OverallRatingPage.assertIfImageIsExisting();
    }

    @And("the user chooses a Lancia Stratos")
    public void theUserChoosesALanciaStratos() {
        OverallRatingPage.goToLanciaLink ();
        OverallRatingPage.goToStratos();
    }

    @And("the user clicks the rank section link of Overall Rating")
    public void theUserClicksTheRankSectionLinkOfOverallRating() {
        OverallRatingPage.clickRankOA();
    }

    @And("rank sorting should be now ascending")
    public void rankSortingShouldBeNowAscending() {
        OverallRatingPage.assertAscendingSortRank();
    }

    @And("the user clicks the vote section link of Overall Rating")
    public void theUserClicksTheVoteSectionLinkOfOverallRating() {
        OverallRatingPage.clickVoteOA();
    }

    @And("vote sorting should be now ascending")
    public void voteSortingShouldBeNowAscending() {
        OverallRatingPage.assertAscendingSortVote();
    }

    @And("the user logs out")
    public void theUserLogsOut() {
        OverallRatingPage.clickLogout();
    }

    @Then("the user should be redirected to the login page")
    public void theUserShouldBeRedirectedToTheLoginPage() {
        OverallRatingPage.assertIfUserIsInHomepage();
    }
}


