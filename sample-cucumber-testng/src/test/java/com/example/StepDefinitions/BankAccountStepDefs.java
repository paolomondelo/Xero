

package com.example.StepDefinitions;

import com.example.BankAccountPage;
import com.example.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class BankAccountStepDefs extends BaseClass {


    @After
    public void teardown() {

        closeDriver ( );
    }


    @And("Visits the Bank Accounts page")
    public void visitsTheBankAccountsPage() {
        BankAccountPage.assertBankAccountPage ( );
    }

    @And("^Enters account name with prefix of (.*?)$")
    public void entersAccountName(String accountname) {
        BankAccountPage.addAccountName(accountname);



    }

    @And("Selects ANZ-NZ as bank")
    public void selectsANZNZAsBank() {
        BankAccountPage.clickAddBankButton();
        BankAccountPage.chooseANZNZ();
    }

    @And("Enters account type = Everyday Day to Day")
    public void entersAccountTypeEverydayDayToDay() {
        BankAccountPage.clickAccountTypeEveryday();

    }

    @And("^Enters account number (.*?) and click continue$")
    public void entersAccountNumberAccountnumber(String accountnumber) {
        BankAccountPage.enterAccountNumber(accountnumber);
    }

    @Then("Bank account should be successfully created")
    public void bankAccountShouldBeSuccessfullyCreated() {
         BankAccountPage.assertBankAccountAdded();
    }

    @And("Enters account type = Loan")
    public void entersAccountTypeLoan() {
        BankAccountPage.clickAccountTypeLoan();
    }

    @And("Enters account type = Term Deposit")
    public void entersAccountTypeTermDeposit() {
        BankAccountPage.clickAccounTermDeposit();
    }

    @And("Enters account type = Other")
    public void entersAccountTypeOther() {
        BankAccountPage.clickAccountOther();
    }

    @And("Enters account type = Credit Card")
    public void entersAccountTypeCreditCard() {
        BankAccountPage.clickAccounCreditCard();
    }

    @And("^Enters Credit Card Number (.*?) and click continue$")
    public void entersCreditCardNumberCreditcardnumAndClickContinue(String creditcardnum) {
        BankAccountPage.enterCreditCardNum(creditcardnum);
    }
}



