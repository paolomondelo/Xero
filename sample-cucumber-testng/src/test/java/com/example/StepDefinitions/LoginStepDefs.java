package com.example.StepDefinitions;

import com.example.BaseClass;
import com.example.LoginPage;
import com.example.RegistrationPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefs extends BaseClass {

    @Before
    public void setup(){
        setDriver();
    }

    @After
    public void teardown(){
      //  driver.close ();

       closeDriver();
    }

    @Given("Launch Application")
    public void openApplication() {

        navigateToHome();


    }

    @Given("^User enters (.*) and (.*)$")
    public void userEntersUsernameAndPassword(String username, String password) {
        LoginPage.enterUsername(username);
        LoginPage.enterPassword(password);
    }

    @When("User clicks on submit button")
    public void userClicksOnSubmitButton() {
        LoginPage.clickSubmit();
    }


    @Then("User is displayed home page")
    public void userIsDisplayedHomePage() {
        LoginPage.verifyTitle("Digital Bank");
    }

    @Then("user is successfully logged in")
    public void userIsSuccessfullyLoggedIn() {
        LoginPage.verifyLoginSuccess();
    }

    @Then("User is denied from logging in")
    public void userIsDeniedFromLoggingIn() {
        LoginPage.verifyLoginFailed();
    }

    @When("user visits the registration site")
    public void userVisitsTheRegistrationSite() {
        LoginPage.visitRegistration();
    }

    @Then("the registration page should no longer be accessible because the user already registered before login")
    public void theRegistrationPageShouldNoLongerBeAccessibleBecuaseTheUserAlreadyRegisteredPriorLogin() {
        LoginPage.assertThatRegPageIsNoLongerAccessible();
    }
}
