Feature: Popular Make Test

  Background:
    Given Launch Application

  @tests @popularmake @smoketest
  Scenario Outline: Validate that the user can visit the Popular Make Page
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Popular Make Button
    Then the user is redirected to the Popular Make Page
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|

  @tests @popularmake @smoketest
  Scenario Outline: Validate that the user can vote and comment
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Popular Make Button
    Then the user is redirected to the Popular Make Page
    And  the user chooses a model Diablo
    And  populates the comment box: <comments> and submits the vote
    And  validates that the vote is successful

    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|comments |
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Articuno |

  @tests @popularmake @defect @defect12
  Scenario Outline: Validate that the user can vote and comment and Author should be <firstname> <lastname> for Model :Reventon
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Popular Make Button
    Then the user is redirected to the Popular Make Page
    And the user picks Reventon
    And  populates the comment box: <comments> and submits the vote
    And  validates that the vote is successful
    And  validate if the Author column is populated
    And  validate if the reventon comment section is populated with <comments>


    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|comments |
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Zapdos   |


  @tests @popularmake @smoketest
  Scenario Outline: Validate that the Model Column is present
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Popular Make Button
    Then the user is redirected to the Popular Make Page
    And Model column should be present
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|

  @tests @popularmake @smoketest
  Scenario Outline: Validate that the Model Column is populated
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Popular Make Button
    Then the user is redirected to the Popular Make Page
    And Model column should be populated
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|

  @tests @popularmake @smoketest
  Scenario Outline: Validate that the Rank Column is present
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Popular Make Button
    Then the user is redirected to the Popular Make Page
    And Rank column should be present
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|

  @tests @popularmake @smoketest
  Scenario Outline: Validate that the Rank Value is populated
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Popular Make Button
    Then the user is redirected to the Popular Make Page
    And Rank value should be populated
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|

  @tests @popularmake @smoketest
  Scenario Outline: Validate that the page pagination is working
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Popular Make Button
    Then the user is redirected to the Popular Make Page
    And  the page pagination is validated and is working properly
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|


  @tests @popularmake @defect10
  Scenario Outline: Validate that rank sorting is working and is sorting in a descending and ascending way  (Popular Make)
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Popular Make Button
    And the user is redirected to the Popular Make Page
    And the user clicks the rank section list
    Then the Rank section should be sorted in an ascending way example lowest votes to highest votes
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|


  @tests @popularmake @defect11
  Scenario Outline: Validate that model sorting is working and is sorting in a descending and ascending way  (Popular Make)
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Popular Make Button
    And the user is redirected to the Popular Make Page
    And the user clicks the model section list
    Then veneno model should on top of the list

    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|

      @tests @popularmake @defect @defect12
  Scenario Outline: Validate that the user can vote and comment and Author should be <firstname> <lastname> for Model :Diablo
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
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Zapdos   |

    @tests @popularmake @defect @defect12
  Scenario Outline: Validate that the user can vote and comment and Author should be <firstname> <lastname> for Model :Veneno
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Popular Make Button
    Then the user is redirected to the Popular Make Page
    And  the user chooses a model Veneno
    And  populates the comment box: <comments> and submits the vote
    And  validates that the vote is successful
    And  validate if the Author column is populated
    And  validate if the veneno comment section is populated with <comments>
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|comments    |
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Charmeleon  |

  @tests @popularmake @defect @defect6
  Scenario Outline: Validate that the user can vote and comment and Author should be <firstname> <lastname> for Model :Aventador
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Popular Make Button
    Then the user is redirected to the Popular Make Page
    And  the user chooses a model Aventador
    And  populates the comment box: <comments> and submits the vote
    And  validates that the vote is successful
    And  validate if the Author column is populated
    And validate if the aventador comment section is populated with <comments>
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|comments    |
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Charizard   |

   @tests @popularmake @defect @defect6
  Scenario Outline: Home buttonfor  buggy rating page is not working (Popular Make).Broken hyperlink.
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Popular Make Button
    Then the user is redirected to the Popular Make Page
    And  the user clicks the homepage icon
    And user should be redirected back to the main page
    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|

  @tests @popularmake @defect @defect7
  Scenario Outline: Validate the text count or text limit in the text comment area should be displayed
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Popular Make Button
    Then the user is redirected to the Popular Make Page
    And the user chooses a model Reventon
    And  populates the comment box: <comments> and submits the vote
    And validate if the reventon comment section displays the text limit or the allowed number of strings allowed


    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|comments |
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibu Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibu  Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibu  Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibu    |


  @tests @popularmake @defect @defect8
  Scenario Outline: Validate in commenting more than 120 chars doesnt break the comment text box area
    Given a user creates a new user with login name: <loginname> and fist name: <firstname> and last name: <lastname> and password name: <password> and user enters confirms password: <confirmspassword>
    When the user clicks the Popular Make Button
    Then the user is redirected to the Popular Make Page
    And the user chooses a model Murcialago
    And  populates the comment box: <comments> and submits the vote
    And validate if the murcialago comment section displays the correct width of the comment text area box

    Examples:
      |loginname      |firstname|lastname|password        |confirmspassword|comments |
      |paolovalidaccnt|Ash      |Ketchum |Paolomondelo#123|Paolomondelo#123|	Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum     |

