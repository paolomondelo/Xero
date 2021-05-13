Feature: Overall Rating Test

  Background:
    Given Launch Application

  @tests @overallratings @smoketest
  Scenario Outline: Validate that the user can visit the Overall Rating Page
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Overall Rating Page Button
    Then the user is redirected to Overall Rating Page
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|

  @tests @overallratings @smoketest
  Scenario Outline: Validate that the user can vote and comment
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Overall Rating Page Button
    Then the user is redirected to Overall Rating Page
    And  the user chooses a model Diablo
    And  populates the comment box: <comments> and submits the vote
    And  validates that the vote is successful
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|comments |
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Articuno |

  @tests @overallratings  @defect @defect12
  Scenario Outline: Validate that the user can vote and comment and Author should be <firstname> <lastname> for Model :rally037
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Overall Rating Page Button
    Then the user is redirected to Overall Rating Page
    And the user chooses a model Lancia
    And  populates the comment box: <comments> and submits the vote
    And  validates that the vote is successful
    And  validate if the Author column is populated
    And validate if rally037 comment section is populated with <comments>
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|comments |
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Zapdos   |

  @tests @overallratings @smoketest
  Scenario Outline: Validate that the pagination for overall rating page is working
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Overall Rating Page Button
    Then the user is redirected to Overall Rating Page
    And  the page pagination is validated and is working properly on the overall rating page
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|

    @tests @overallratings @defect @defect18
  Scenario Outline: Validate that the user can log out after visiting the overall page
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Overall Rating Page Button
    And the user is redirected to Overall Rating Page
    And the user logs out
    Then the user should be redirected to the login page

    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|

    @tests @overallratings @defect @defect13
  Scenario Outline: Validate that the user can use the vote sorting functionality
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Overall Rating Page Button
    Then the user is redirected to Overall Rating Page
    And the user clicks the vote section link of Overall Rating
    And vote sorting should be now ascending

    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|

  @tests @overallratings @defect @defect13
  Scenario Outline: Validate that the user can use the rank sorting functionality
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Overall Rating Page Button
    Then the user is redirected to Overall Rating Page
    And the user clicks the rank section link of Overall Rating
    And rank sorting should be now ascending
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|


  @tests @overallratings @defect @defect1
  Scenario Outline: Pagination should not allow to reach beyond its page limit (Example: [page 7 out of 5])
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Overall Rating Page Button
    Then the user is redirected to Overall Rating Page
    And the user changes the pagination up to 6 times
    And  pagination should not exceed its pagination limit and should display page as 5 out of 5
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|


  @tests @overallratings @defect @defect4
  Scenario Outline: Image for Lancia Ypsilon should not be broken and should be displayed
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Overall Rating Page Button
    Then the user is redirected to Overall Rating Page
    And check Lancia and go to Ypsilon
    And assert that the image is visible
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|

  @tests @overallratings @defect @defect5
  Scenario Outline: Validate that the user can vote and comment while voting for Lancia Stratos
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Overall Rating Page Button
    Then the user is redirected to Overall Rating Page
    And the user chooses a Lancia Stratos
    And  populates the comment box: <comments> and submits the vote
    And  validates that the vote is successful
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|comments |
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Articuno |
