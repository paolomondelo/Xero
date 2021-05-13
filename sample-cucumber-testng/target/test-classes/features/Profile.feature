Feature: Profile Test

  Background:
    Given Launch Application


  @tests @profile @smoketest
  Scenario Outline: Validate that the user can successfully change new password
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the profile link
    And the user is redirected to the profile page
    And the user  changes the  profile first name <firstnameppchange> and profile last name <lastnameppchange>
    And the user changes the profile age <age> and address <address> and phone <phone>
    And the user types the current password <confirmspassword> and new password <newpassword> and confirm new password <confirmnewpassword> by saving it
   Then a message that The profile has been saved successful should be displayed after saving
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword| firstnameppchange|lastnameppchange|age | address   |phone |newpassword       |confirmnewpassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Professor          | Oak           |30  |Pallet Town|8073380|Paolomondelo#1234|Paolomondelo#1234 |

  @tests @profile @smoketest
  Scenario Outline: Validate that the user can visit the Profile Page
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
     When the user clicks the profile link
     And the user is redirected to the profile page
     Then the user will be able to view the profile page
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|

  @tests @profile @smoketest
  Scenario Outline: Validate that the user can successfully change first name and last name
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the profile link
    And the user is redirected to the profile page
    And the user  changes the  profile first name <firstnameppchange> and profile last name <lastnameppchange>
    Then a message that The profile has been saved successful should be displayed after saving
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword| firstnameppchange|lastnameppchange|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Professor          | Oak           |

  @tests @profile @smoketest
  Scenario Outline: Validate that the user can successfully change Gender, Age, Address, and Phone
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the profile link
    And the user is redirected to the profile page
    And the user  changes the  profile first name <firstnameppchange> and profile last name <lastnameppchange>
    And the user changes the profile age <age> and address <address> and phone <phone>
    Then a message that The profile has been saved successful should be displayed after saving
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword| firstnameppchange|lastnameppchange|age | address   |phone |
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Professor          | Oak           |30  |Pallet Town|8073380|


  @tests @profile @smoketest
  Scenario Outline: Validate that app should not accept any updates with age less than 0 or age greater than 96 and that are whole numbers
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the profile link
    And the user is redirected to the profile page
    And the user  changes the  profile first name <firstnameppchange> and profile last name <lastnameppchange>
    And the user changes the profile age <age> and address <address> and phone <phone>
    And the user types the current password <password> and new password <newpassword> and confirm new password <confirmnewpassword> by saving it
    Then the app should not accept values greater than 95 or less than 0


    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword| firstnameppchange|lastnameppchange|age     | address   |phone |newpassword       |confirmnewpassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Professor          | Oak           |96      |Pallet Town|8073380|Paolomondelo#1234|Paolomondelo#1234 |
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Professor          | Oak           |9999    |Pallet Town|8073380|Paolomondelo#1234|Paolomondelo#1234 |
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Professor          | Oak           |-1      |Pallet Town|8073380|Paolomondelo#1234|Paolomondelo#1234 |
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Professor          | Oak           |-999    |Pallet Town|8073380|Paolomondelo#1234|Paolomondelo#1234 |

  @tests @profile @smoketest
  Scenario Outline: Validate that app should not accept any updates with age less than 0 or age greater than 96 and that contains a decimal point
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the profile link
    And the user is redirected to the profile page
    And the user  changes the  profile first name <firstnameppchange> and profile last name <lastnameppchange>
    And the user changes the profile age <age> and address <address> and phone <phone>
    And the user types the current password <password> and new password <newpassword> and confirm new password <confirmnewpassword> by saving it
    Then the app should not accept any values with decimal points or non ascii char


    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword| firstnameppchange|lastnameppchange|age      | address   |phone |newpassword       |confirmnewpassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Professor          | Oak           |95.5     |Pallet Town|8073380|Paolomondelo#1234|Paolomondelo#1234 |
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Professor          | Oak           |999.5    |Pallet Town|8073380|Paolomondelo#1234|Paolomondelo#1234 |
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Professor          | Oak           |-1.5     |Pallet Town|8073380|Paolomondelo#1234|Paolomondelo#1234 |
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Professor          | Oak           |-99.5@   |Pallet Town|8073380|Paolomondelo#1234|Paolomondelo#1234 |

  @tests @profile @smoketest
  Scenario Outline: Validate that app should throw an  error message stating that the new password used must have a combination of alphanumeric and must have lowercase andmust have a nonascii character
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the profile link
    And the user is redirected to the profile page
    And the user types the current password <password> and new password <newpassword> and confirm new password <confirmnewpassword> by saving it
    Then an error message should be displayed after saving

    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword |newpassword       |confirmnewpassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|paolomondelo1234|paolomondelo1234 |


  @tests @profile @defect2
  Scenario Outline: Validate that the app should be able to save in the profile page if Hobby=Knitting
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the profile link
    And the user is redirected to the profile page
    And the user  changes the  profile first name <firstnameppchange> and profile last name <lastnameppchange>
    And the user changes the profile age <age> and address <address> and phone <phone>
    And the user changes the hobbies to Knitting and saves the update
    Then a message that The profile has been saved successful should be displayed after saving
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword| firstnameppchange|lastnameppchange|age | address   |phone  |
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Professor          | Oak           |30  |Pallet Town|8073380|


  @tests @profile @defect @defect14
  Scenario Outline: Validate that app should throw a descriptive error message when entering an invalid age and should not display "Get a candy ;)" as its message
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the profile link
    And the user is redirected to the profile page
    And the user  changes the  profile first name <firstnameppchange> and profile last name <lastnameppchange>
    And the user changes the profile age <age> and address <address> and phone <phone>
    And the user types the current password <password> and new password <newpassword> and confirm new password <confirmnewpassword> by saving it
    Then the app should throw a descriptive and a proper error message like invalid age entered


    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword| firstnameppchange|lastnameppchange|age      | address   |phone |newpassword       |confirmnewpassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Professor          | Oak           |95.5     |Pallet Town|8073380|Paolomondelo#1234|Paolomondelo#1234 |
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Professor          | Oak           |999.5    |Pallet Town|8073380|Paolomondelo#1234|Paolomondelo#1234 |
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Professor          | Oak           |-1.5     |Pallet Town|8073380|Paolomondelo#1234|Paolomondelo#1234 |
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Professor          | Oak           |-99.5@   |Pallet Town|8073380|Paolomondelo#1234|Paolomondelo#1234 |
