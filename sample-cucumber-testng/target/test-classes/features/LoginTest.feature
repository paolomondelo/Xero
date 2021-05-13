Feature: Login Test

  Background:
    Given Launch Application

  @tests @logins @smoketest
  Scenario Outline: Login to application using valid credentials
    Given User enters <username> and <password>
    When User clicks on submit button
    Then user is successfully logged in
    Examples:
      | username        | password       |
      | paolomondelo1 | Paolomondelo89@   |

  @tests @logins @smoketest
  Scenario Outline: Login to application using invalid credentials
    Given User enters <username> and <password>
    When User clicks on submit button
    Then User is denied from logging in
    Examples:
      | username     | password       |
      | fakeusername | fakepassword   |

  @tests @logins @defect @defect17
  Scenario Outline: The user can still register after logging in
    Given User enters <username> and <password>
    And User clicks on submit button
    And user is successfully logged in
    When user visits the registration site
    Then the registration page should no longer be accessible because the user already registered before login
    Examples:
      | username        | password       |
      | paolomondelo1 | Paolomondelo89@   |

