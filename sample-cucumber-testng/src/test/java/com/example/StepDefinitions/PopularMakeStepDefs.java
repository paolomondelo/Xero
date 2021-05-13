package com.example.StepDefinitions;

import com.example.BaseClass;
import com.example.PopularMakePage;
import com.example.RegistrationPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PopularMakeStepDefs extends BaseClass {




    @After
    public void teardown(){

       closeDriver ( );
    }


    @When("the user clicks the Popular Make Button")
    public void theUserClicksThePopularMakeButton() {
        PopularMakePage.navigatePopularMakePage();
    }

    @Then("the user is redirected to the Popular Make Page")
    public void theUserIsRedirectedToThePopularMakePage() {
        PopularMakePage.redirecttoLandingPopularMakePage();
    }

    @And("Model column should be present")
    public void modelColumnShouldBePresent() {
        PopularMakePage.modelColummShouldBeDisplayed();

    }

    @And("Model column should be populated")
    public void modelColumnShouldBePopulated() {
        PopularMakePage.modelShouldBePopulated();
    }

    @And("Rank column should be present")
    public void rankColumnShouldBePresent() {
        PopularMakePage.rankColumnShouldBeDisplayed();
    }

    @And("Rank value should be populated")
    public void rankValueShouldBePopulated() {
        PopularMakePage.rankValueShouldBePopulated();
    }

    @And("the user chooses a model Diablo")
    public void theUserChoosesAModelDiablo() {
        PopularMakePage.chooseaModelDiablo();
    }

    @And("^populates the comment box: (.*?) and submits the vote$")
    public void populatesTheCommentBoxComments(String comments) {
        PopularMakePage.populateCommentBox(comments);
    }

    @And("validates that the vote is successful")
    public void validatesThatTheVoteIsSuccessful() {
        PopularMakePage.validateVote();

    }

    @And("validate if the Author column is populated")
    public void validateIfTheAuthorColumnIsPopulated() {
        PopularMakePage.validateAuthorCol();
    }

    @And("the user chooses a model Veneno")
    public void theUserChoosesAModelVeneno() {
        PopularMakePage.chooseaModelVeneno();
    }

    @And("the user chooses a model Aventador")
    public void theUserChoosesAModelAventador() {
        PopularMakePage.chooseaModelAventador();
    }

    @And("^validate if the veneno comment section is populated with (.*?)$")
    public void validateIfTheCommentSectionIsPopoulatedWithComments(String comments) {
        PopularMakePage.assertCommentBox(comments);
    }

    @And("^validate if the diablo comment section is populated with (.*?)$")
    public void validateIfTheDiabloCommentSectionIsPopoulatedWithComments(String comments) {
        PopularMakePage.assertDiabloCommentBox(comments);
    }

    @And("the page pagination is validated and is working properly")
    public void thePagePaginationIsValidatedAndWorkingProperly() {
        PopularMakePage.clickPaginationButton();
        PopularMakePage.assertPopularMakePaginationIsWorking();
    }

    @And("^validate if the aventador comment section is populated with (.*?)$")
    public void validateIfTheAventadorCommentSectionIsPopulatedWithComments(String comments) {
        PopularMakePage.assertCommentBox(comments);
    }

    @And("the user chooses a model Reventon")
    public void theUserChoosesAModelReventon() {
        PopularMakePage.choosesReventon();

    }

    @And("^validate if the reventon comment section is populated with (.*?)$")
    public void validateIfTheReventonCommentSectionIsPopulatedWithComments(String comments) {
        PopularMakePage.assertReventonCommentBox(comments);



    }


    @And("the user clicks the homepage icon")
    public void theUserClicksTheHomepageIcon() {
        PopularMakePage.clicksTheHomeButton();

    }

    @And("user should be redirected back to the main page")
    public void userShouldBeRedirectedBackToTheMainPage() {
        PopularMakePage.assertIfUserIsInHomepage();
    }

    @And("validate if the reventon comment section displays the text limit or the allowed number of strings allowed")
    public void validateIfTheReventonCommentSectionDisplaysTheTextLimitOrTheAllowedNumberOfStringsAllowed() {
        PopularMakePage.asserttextLimitIsDisplayed();
    }

    @And("validate if the murcialago comment section displays the correct width of the comment text area box")
    public void validateIfTheMurcialagocommentSectionDisplaysTheCorrectWithOfTheCommentTextAreaBox() {
        PopularMakePage.assertTxtBoxWidthOfMurcialago();
    }

    @And("the user chooses a model Murcialago")
    public void theUserChoosesAModelMurcialago() {
        PopularMakePage.choosesMurcialago();
    }

    @And("the user clicks the votes section")
    public void theUserClicksTheVotesSection() {
        PopularMakePage.clickVoteSorting();


    }

    @Then("the votes section should be sorted in an ascending way example lowest votes to highest votes")
    public void theVotesSectionWillBeSortedInAnAscendingWayLowestVotesToHighestVotes() {
        PopularMakePage.assertIfVotingSortingIsWorking();
    }

    @And("the user clicks the  rank section")
    public void theUserClicksTheRankSection() {
        PopularMakePage.clickRankSection();
    }

    @And("the user clicks the rank section list")
    public void theUserClicksTheRankSectionList() {
        PopularMakePage.clickRankSectionLink();
    }

    @And("the user picks Reventon")
    public void theUserPicksReventon() {
        PopularMakePage.chooseReventonLink();
    }
}
