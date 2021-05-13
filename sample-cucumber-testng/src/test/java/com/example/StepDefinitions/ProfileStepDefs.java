package com.example.StepDefinitions;

import com.example.BaseClass;
import com.example.PopularMakePage;
import com.example.ProfilePage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ProfileStepDefs extends BaseClass {




    @After
    public void teardown(){

       closeDriver ( );
    }

    @When("the user clicks the profile link")
    public void theUserClicksTheProfileLink() {
        ProfilePage.navigatetoProfile();
     }


    @And("the user is redirected to the profile page")
    public void theUserIsRedirectedToTheProfilePage() {
        ProfilePage.assectProfileLandingPage();
    }

    @Then("the user will be able to view the profile page")
    public void theUserWillBeAbleToViewTheProfilePage() {
        ProfilePage.validateProfilePage();
    }

    @And("^the user  changes the  profile first name (.*?) and profile last name (.*?)$")
    public void theUserChangesTheProfileFirstNameFirstnameppchange(String firstnameppchange, String lastnameppchange) {

        ProfilePage.populateFirstNamePP(firstnameppchange);
     ProfilePage.populateLastNamePP(lastnameppchange);
     ProfilePage.savesChanges();
    }

    @Then("a message that The profile has been saved successful should be displayed after saving")
    public void aMessageShouldBeDisplayedAfterSaving() {
        ProfilePage.assertSavedSuccessMessage();
    }

    @And("^the user changes the profile age (.*?) and address (.*?) and phone (.*?)$")
    public void theUserChangesTheProfileGenderGenderAndAgeAgeAndAddressAddressAndPhonePhone(String age, String address, String phone ) {

        ProfilePage.populateAge(age);
        ProfilePage.populateAddress(address);
        ProfilePage.populatePhone(phone);
       // ProfilePage.savesChanges ();

    }



    @And("^the user types the current password (.*?) and new password (.*?) and confirm new password (.*?) by saving it$")
    //test
    public void theUserTypesTheCurrentPasswordConfirmspasswordAndNewPasswordNewpasswordAndConfirmNewPasswordConfirmnewpassword(String confirmspassword,String newpassword,String confirmnewpassword) {
        ProfilePage.populateConfirmPassword(confirmspassword);
        System.out.println(confirmspassword);
        ProfilePage.populateNewPassword(newpassword);
        System.out.println(newpassword);
        ProfilePage.populateNewConfirmPassword(confirmnewpassword);
        System.out.println(confirmnewpassword);
        ProfilePage.savesChanges ();


    }



    @And("the user changes the hobbies to Knitting and saves the update")
    public void theUserChangesTheHobbiesToAndSavesTheUpdate() {
        ProfilePage.populateHobbies();
        ProfilePage.savesChanges ();
    }

    @Then("the app should not accept invalid numbers and should not save the update")
    public void theAppShouldNotAcceptInvalidNumbersAndShouldNotSaveTheUpdate() {
        ProfilePage.assertAgeError();
    }

    @Then("the app should not accept values greater than {int} or less than {int}")
    public void theAppShouldNotAcceptValuesGreaterThanOrLessThan(int arg0, int arg1) {
        ProfilePage.assertAgeErrorWholeNum();
    }

    @Then("an error message should be displayed after saving")
    public void anErrorMessageShouldBeDisplayedAfterSaving() {
        ProfilePage.assertErrorInvalidPword();
    }

    @Then("the app should not accept any values with decimal points or non ascii char")
    public void theAppShouldNotAcceptAnyValuesWithDecimalPointsOrNonAsciiChar() {
        ProfilePage.asserErrorDecimalMsg();
    }

    @Then("the app should throw a descriptive and a proper error message like invalid age entered")
    public void theAppShouldNotThrownADescriptiveAndProperErrorMessageLikeInvalidAgeEntered() {
        ProfilePage.assertageErrorMsgDescp();
    }
}
