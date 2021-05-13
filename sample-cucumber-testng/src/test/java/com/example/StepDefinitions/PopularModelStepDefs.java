package com.example.StepDefinitions;

import com.example.BaseClass;
import com.example.PopularMakePage;
import com.example.PopularModelPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PopularModelStepDefs extends BaseClass {



    @After
    public void teardown(){

       closeDriver ( );
    }


    @When("the user clicks the Popular Model Button")
    public void theUserClicksThePopularModelButton() {
        PopularModelPage.navigatePopularModelPage();
    }

    @Then("the user is redirected to the Popular Model Page")
    public void theUserIsRedirectedToThePopularModelPage() {
        PopularModelPage.validateLandingPagePopularModelPage();
    }

    @And("number of votes should be displayed")
    public void numberOfVotesShouldBeDisplayed() {
        PopularModelPage.numberofVotes();
    }


    @Then("the Rank section should be sorted in an ascending way example lowest votes to highest votes")
    public void theRankSectionShouldBeSortedInAnAscendingWayExampleLowestVotesToHighestVotes() {
        PopularMakePage.assertSortingRanksPopularMake();
    }

    @And("the user clicks the model section list")
    public void theUserClicksTheModelSectionList() {
        PopularMakePage.clickModelSection();
    }

    @Then("veneno model should on top of the list")
    public void venenoModelShouldOnTopOfTheList() {
        PopularMakePage.venenoModelShouldBeTop();
    }
}
