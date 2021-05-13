Feature: Registration Test

  Background:
    Given Launch Application

  @tests @registration @smoketest
  Scenario Outline: Validate that the user cannot register using invalid password format
    Given a user goes to the Register section
    And user enters login name: <loginname> and fist name: <firstname>
    And user enters last name: <lastname> and password name: <password>
    And user enters confirms password: <confirmspassword>
    When the user submits the request
    Then system should not allow the user to register and error message InvalidPasswordException should be displayed
    Examples:
    |loginname   |firstname|lastname|password|confirmspassword|
    |invalidpaolo|Ash      |Ketchum |password|password        |

  @tests @registration @smoketest
  Scenario Outline: Validate that the user can register using valid password format
    Given a user goes to the Register section
    And user enters login name: <loginname> and fist name: <firstname>
    And user enters last name: <lastname> and password name: <password>
    And user enters confirms password: <confirmspassword>
    When the user submits the request
    Then system should allow the user to register successfully
    Examples:
      |loginname             |firstname|lastname|password|confirmspassword|
      |paolomondelovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|



