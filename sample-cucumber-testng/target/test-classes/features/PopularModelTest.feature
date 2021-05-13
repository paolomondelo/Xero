Feature: Popular Model Test

  Background:
    Given Launch Application

  @tests @popularmodel @smoketest
  Scenario Outline: Validate that the user can visit the Popular Model Page
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Popular Model Button
    Then the user is redirected to the Popular Model Page
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|

  @tests @popularmodel @smoketest
  Scenario Outline: Validate that the user can vote and comment while inside  the Popular Model Page
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Popular Make Button
    Then the user is redirected to the Popular Make Page
    And  the user chooses a model Diablo
    And  populates the comment box: <comments> and submits the vote
    And  validates that the vote is successful
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|comments |
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Bulbasaur |

  @tests @popularmodel @defect @defect12
  Scenario Outline: Validate that the user can vote and comment and Author should be <firstname> <lastname> for Model :Diablo while inside  the Popular Model Page
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Popular Make Button
    Then the user is redirected to the Popular Make Page
    And  the user chooses a model Diablo
    And  populates the comment box: <comments> and submits the vote
    And  validates that the vote is successful
    And  validate if the Author column is populated
    And  validate if the diablo comment section is populated with <comments>
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|comments |
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Ivysaur  |


  @tests @popularmodel @smoketest
  Scenario Outline: Validate that the Model Column is present while inside  the Popular Model Page
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Popular Make Button
    Then the user is redirected to the Popular Make Page
    And Model column should be present
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|

  @tests @popularmodel @smoketest
  Scenario Outline: Validate that the Model Column is populated while inside  the Popular Model Page
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Popular Make Button
    Then the user is redirected to the Popular Make Page
    And Model column should be populated
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|

  @tests @popularmodel @smoketest
  Scenario Outline: Validate that the Rank Column is present while inside  the Popular Model Page
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Popular Make Button
    Then the user is redirected to the Popular Make Page
    And Rank column should be present
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|

  @tests @popularmodel @smoketest
  Scenario Outline: Validate that the number of votes is populated while inside the Popular Model Page
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Popular Make Button
    Then the user is redirected to the Popular Make Page
    And number of votes should be displayed
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|

