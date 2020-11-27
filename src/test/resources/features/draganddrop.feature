Feature: feature to test drag and drop functionality

  Scenario: Check draggable object can be dragged to drop target

    Given user is on drag and drop page
    When user drags object to drop target
    Then object is dropped into drop target