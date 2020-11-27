Feature: feature to test date picker functionality

  Scenario Outline: Check departure date is selected correctly

    Given user is on travel departure date selection page
    When user selects <departureDate> <departureMonth> <departureYear> in date picker
    Then departure date is selected
    Examples:
      | departureDate | departureMonth | departureYear |
      | "20"  | "September" | "2022"                   |
      | "15"  | "June"      | "2021"                   |
      | "6"   | "January"   | "2022"                   |
      | "17"  | "October"   | "2021"                   |

