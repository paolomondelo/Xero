package com.example.StepDefinitions;

import com.example.BaseClass;
import com.example.LoginPage;
import com.example.PopularMakePage;
import com.example.RegistrationPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RegistrationStepDefs extends BaseClass {



    @After
    public void teardown(){

       closeDriver ( );
    }


    @Given("a user goes to the Register section")
    public void aUserGoesToTheRegisterSection() {
        RegistrationPage.navigatetoRegPage();

    }

    @And("^user enters login name: (.*?) and fist name: (.*?)$")
    public void userEntersLoginnameAndFirstname(String loginname, String firstname) {
        RegistrationPage.populateLoginName(loginname);
        RegistrationPage.populateFirstName(firstname);
    }

    @And("^user enters last name: (.*?) and password name: (.*?)$")
    public void userEntersLastnameAndPassword(String lastname, String password) {
        RegistrationPage.populateLastName(lastname);
        RegistrationPage.populatePassword(password);
    }

    @And("^user enters confirms password: (.*?)$")
    public void useEntersConfirmsPasswordConfirmspassword(String confirmpassword) {
        RegistrationPage.populateConfirmPassword(confirmpassword);
    }

    @When("the user submits the request")
    public void theUserSubmitsTheRequest() {
        RegistrationPage.clickRegisterButton();
    }

    @Then("^system should not allow the user to register and error message InvalidPasswordException should be displayed$")
    public void systemShouldNotAllowTheUserToRegisterAndErrorMessageShouldBeDisplayedErrormessage() {
        RegistrationPage.assertErrorMessage();
    }

    @Then("^system should allow the user to register successfully$")
    public void systemShouldAllowTheUserToRegisterSuccessfully() {
        RegistrationPage.assertRegistrationSuccessMessage();
    }


    @Given("^a user creates a new user with login name: (.*?) and fist name: (.*?) and last name: (.*?) and password name: (.*?) and user enters confirms password: (.*?)$")
    public void aUserCreatesANewUserWithLoginNameLoginnameAndFistNameFirstnameAndLastNameLastnameAndPasswordNamePasswordAndAndUserEntersConfirmsPasswordConfirmspassword(String loginname, String firstname, String lastname, String password, String confirmspassword) {

        RegistrationPage.navigatetoRegPage();
        RegistrationPage.populateFirstName(firstname);
        RegistrationPage.populateLastName(lastname);
        RegistrationPage.populatePassword(password);
        RegistrationPage.populateConfirmPassword(confirmspassword);
        RegistrationPage.populateLoginName1(loginname);



    }
}
