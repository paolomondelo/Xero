

package com.example.StepDefinitions;

        import com.example.AccountingPage;
        import com.example.BaseClass;
        import io.cucumber.java.After;
        import io.cucumber.java.en.When;


public class AccountingStepDefs extends BaseClass {




    @After
    public void teardown(){
        //     driver.close ();
        closeDriver ( );
    }





    @When("The user visits the accounting page")
    public void theUserVisitsTheAccountingPage() {
        AccountingPage.goToAccounting();



    }
}


