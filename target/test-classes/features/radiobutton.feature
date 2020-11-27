Feature: feature to test radiobutton operations

  Scenario: Check that status of radiobuttons is correctly shown when the Check button is pressed

    Given user is on radiobutton selection page
    When user selects a radiobutton
    And presses the Check button
    Then status text shows correct status and value of selected radiobutton

  Scenario: Check that status of radiobuttons is correctly shown when the Reset button is pressed

    Given user is on radiobutton selection page
    When user selects a radiobutton
    And presses the Reset and Check buttons
    Then status text shows that no radiobutton is selected