Feature: Queue Details page

  Background: Login and navigate to Queue page
    Given The user is on the DS Introduction page as signedIn
    And The user clicks on Get started link for Queue

  Scenario: Validate user navigated to queue details page when clicked on get started
    Then The user is on Queue Details page

  Scenario: Validate user can navigate to Implementations of Queue in Python
    Given The user is on Queue Details page
    When The user clicks on Implementation of Queue python link
    Then The user is on the Implimentation of Queue in Python page

  Scenario: Validate user can open try editor page from Implementation of Queue in python
    Given The user on implementation Queue in python page
    When User clicks Try here link
    Then User should navigate to tryEditor page

  Scenario: Error message displayed for invalid code on try editor for Implementation of Queue in python
    Given The user on implementation Queue in python page
    And User clicks Try here link
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window

  Scenario: No error message displayed for empty code on try editor for Implementation of Queue in python
    Given The user on implementation Queue in python page
    And User clicks Try here link
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window

  Scenario: Valid code on try editor for Implementation of Queue in python runs successfully
    Given The user on implementation Queue in python page
    And User clicks Try here link
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console

  Scenario: Validate user can navigate to Implementation using collections.deque
    Given The user is on Queue Details page
    When The user click on Implementation using collections.deque link
    Then the user is navigated to Queue in collections.deque

  Scenario: Validate user can open try editor page from Implementation using collections.deque
    Given The user on Implementation using collection.deque in python page
    When User clicks Try here link
    Then User should navigate to tryEditor page

  Scenario: Error message displayed for invalid code on try editor for Implementation using collections.deque
    Given The user on Implementation using collection.deque in python page
    And User clicks Try here link
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window

  Scenario: No error message displayed for empty code on try editor for Implementation using collections.deque
    Given The user on Implementation using collection.deque in python page
    And User clicks Try here link
    When Click the Run button
    Then The user should not see any error message or alert

  Scenario: Valid code on try editor for Implementation using collections.deque runs successfully
    Given The user on Implementation using collection.deque in python page
    And User clicks Try here link
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console

  Scenario: Validate user can navigate to Implementation using collections.deque
    Given The user is on Queue Details page
    When The user click on Queue Operations
    Then the user is navigated to Queue Operations Page

  Scenario: Validate user can open try editor page from Implementation using collections.deque
    Given The user is on Queue Operations page
    When User clicks Try here link
    Then User should navigate to tryEditor page

  Scenario: Error message displayed for invalid code on try editor for Implementation using collections.deque
    Given The user is on Queue Operations page
    And User clicks Try here link
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window

  Scenario: No error message displayed for empty code on try editor for Implementation using collections.deque
    Given The user is on Queue Operations page
    And User clicks Try here link
    When Click the Run button
    Then The user should not see any error message or alert

  Scenario: Valid code on try editor for Implementation using collections.deque runs successfully
    Given The user is on Queue Operations page
    And User clicks Try here link
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window

  Scenario: Validate user can navigate to Implementation using collections.deque
    Given The user is on Queue Details page
    When The user click on Implementation using array link
    Then the user is navigated to Implementation using array page

  Scenario: Validate user can open try editor page from Implementation using collections.deque
    Given The user is on Implementation using array page
    When User clicks Try here link
    Then User should navigate to tryEditor page

  Scenario: Error message displayed for invalid code on try editor for Implementation using collections.deque
    Given The user is on Implementation using array page
    And User clicks Try here link
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window

  Scenario: No error message displayed for empty code on try editor for Implementation using collections.deque
    Given The user is on Implementation using array page
    And User clicks Try here link
    When Click the Run button
    Then The user should not see any error message or alert

  Scenario: Valid code on try editor for Implementation using collections.deque runs successfully
    Given The user is on Implementation using array page
    And User clicks Try here link
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console
