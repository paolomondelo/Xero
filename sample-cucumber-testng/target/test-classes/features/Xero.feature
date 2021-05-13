Feature:
  As a Xero User,
  In order to manage my business successfully,
  I want to be able to add an “ANZ (NZ)” bank account inside any Xero Organisation.

  Background:
    Given Launch Application


@xero
  Scenario Outline: Validate that a Xero user can add an ANZ NZ Bank Account to a Xero Organization(account type = Everyday Day to Day)
    Given User enters <username> and <password>
    And User clicks on submit button
    And Skips the setup security layer
    When The user visits the accounting page
    And Visits the Bank Accounts page
    And Selects ANZ-NZ as bank
    And Enters account name with prefix of <accountname>
    And Enters account type = Everyday Day to Day
    And Enters account number <accountnumber> and click continue
    Then Bank account should be successfully created

    Examples:
      | username                        | password |accountname|accountnumber |
      | paolo.dominic.mondelo@gmail.com | 8073380a |BA         |sds2342342342 |

  @xero
  Scenario Outline: Validate that a Xero user can add an ANZ NZ Bank Account to a Xero Organization(account type = Loan)
    Given User enters <username> and <password>
    And User clicks on submit button
    And Skips the setup security layer
    When The user visits the accounting page
    And Visits the Bank Accounts page
    And Selects ANZ-NZ as bank
    And Enters account name with prefix of <accountname>
    And Enters account type = Loan
    And Enters account number <accountnumber> and click continue
    Then Bank account should be successfully created

    Examples:
      | username                        | password |accountname|accountnumber |
      | paolo.dominic.mondelo@gmail.com | 8073380a |BA         |sds2342342342 |

  @xero
  Scenario Outline: Validate that a Xero user can add an ANZ NZ Bank Account to a Xero Organization(account type = Term Deposit)
    Given User enters <username> and <password>
    And User clicks on submit button
    And Skips the setup security layer
    When The user visits the accounting page
    And Visits the Bank Accounts page
    And Selects ANZ-NZ as bank
    And Enters account name with prefix of <accountname>
    And Enters account type = Term Deposit
    And Enters account number <accountnumber> and click continue
    Then Bank account should be successfully created

    Examples:
      | username                        | password |accountname|accountnumber |
      | paolo.dominic.mondelo@gmail.com | 8073380a |BA         |sds2342342342 |

  @xero
  Scenario Outline: Validate that a Xero user can add an ANZ NZ Bank Account to a Xero Organization(account type = Other)
    Given User enters <username> and <password>
    And User clicks on submit button
    And Skips the setup security layer
    When The user visits the accounting page
    And Visits the Bank Accounts page
    And Selects ANZ-NZ as bank
    And Enters account name with prefix of <accountname>
    And Enters account type = Other
    And Enters account number <accountnumber> and click continue
    Then Bank account should be successfully created

    Examples:
      | username                        | password |accountname|accountnumber |
      | paolo.dominic.mondelo@gmail.com | 8073380a |BA         |sds2342342342 |

  @xero
  Scenario Outline: Validate that a Xero user can add an ANZ NZ Bank Account to a Xero Organization(account type = Credit Card)
    Given User enters <username> and <password>
    And User clicks on submit button
    And Skips the setup security layer
    When The user visits the accounting page
    And Visits the Bank Accounts page
    And Selects ANZ-NZ as bank
    And Enters account name with prefix of <accountname>
    And Enters account type = Credit Card
    And Enters Credit Card Number <creditcardnum> and click continue
    Then Bank account should be successfully created

    Examples:
      | username                        | password |accountname|creditcardnum|
      | paolo.dominic.mondelo@gmail.com | 8073380a |BA         | 7777      |