Feature: feature to test menu selection functionality

  Scenario Outline: Check menu selection is successful

    Given user is on menu page
    When user selects item <item>
    Then menu shows selected item <expectedItem>
    Examples:
    | item | expectedItem |
    | "Option 1"  | "Option 1" |
    | "Option 2"  | "Option 2" |
