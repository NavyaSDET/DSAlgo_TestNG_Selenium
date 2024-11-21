Feature: Array detail page

  Background: Login and navigate to array page
    Given The user is on the DS Introduction page as signedIn
    And The user clicks on Get Started link for array

  Scenario: Validate user navigated to array details page when clicked on get started
    Then The user is on the array details page

  Scenario: Validate user can navigate to Arrays in python
    Given The user is on the array details page
    When The user click on Array in python link
    Then the user is navigated to array in arrays in python

  Scenario: Validate user can Try here link page from Arrays in python
    Given The user is on the arrays in python page
    When User clicks Try here link
    Then User should navigate to tryEditor page

  Scenario: Error message displayed for invalid code on try Editor for Queue operations
    Given The user is on the arrays in python page
    And User clicks Try here link
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window

  Scenario: No error message displayed for empty code on try editor for array in python
    Given The user is on the arrays in python page
    And User clicks Try here link
    When Click the Run button
    Then The user should not see any error message or alert

  Scenario: Valid code on try editor for arrays in python runs successfully
    Given The user is on the arrays in python page
    And User clicks Try here link
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console

  Scenario: Validate user can navigate to Arrays using list
    Given The user is on the array details page
    When The user click on Array using list link
    Then the user is navigated to array in Array using list

  Scenario: Validate user can Try here link page from Array using list
    Given The user is on the Array using list
    When User clicks Try here link
    Then User should navigate to tryEditor page

  Scenario: Error message displayed for invalid code on try Editor for Array using list
    Given The user is on the Array using list
    When User clicks Try here link
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window

  Scenario: No error message displayed for empty code on try editor for Array using list
    Given The user is on the Array using list
    When User clicks Try here link
    When Click the Run button
    Then The user should not see any error message or alert

  Scenario: Valid code on try editor for Array using list runs successfully
    Given The user is on the Array using list
    When User clicks Try here link
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console
    
  Scenario: Validate user can navigate to basic opertaions in lists
    Given The user is on the array details page
    When The user click on basic operations in lists
    Then the user is navigated to basic opertaions in lists

  Scenario: Validate user can Try here link page from Basic operations in lists
    Given The user is on the Basic operations in lists
    When User clicks Try here link
    Then User should navigate to tryEditor page

  Scenario: Error message displayed for invalid code on try Editor for Basic operations in lists
    Given The user is on the Basic operations in lists
    And User clicks Try here link
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window

  Scenario: No error message displayed for empty code on try editor for basic operations in lists
    Given The user is on the Basic operations in lists
    And User clicks Try here link
    When Click the Run button
    Then The user should not see any error message or alert

  Scenario: Valid code on try editor for basic operations in lists runs successfully
    Given The user is on the Basic operations in lists
    And User clicks Try here link
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console

  Scenario: Validate user can navigate to applications of array
    Given The user is on the array details page
    When The user click on applications of array link
    Then the user is navigated to applications of array

  Scenario: Validate user can Try here link page from applications of array
    Given The user is on the applications of array
    When User clicks Try here link
    Then User should navigate to tryEditor page

  Scenario: Error message displayed for invalid code on try Editor for applications of array
    Given The user is on the applications of array
    And User clicks Try here link
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window

  Scenario: No error message displayed for empty code on try editor for applications of array
    Given The user is on the applications of array
    And User clicks Try here link
    When Click the Run button
    Then The user should not see any error message or alert

  Scenario: Valid code on try editor for applications of array runs successfully
    Given The user is on the applications of array
    And User clicks Try here link
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console

  Scenario: validate user can click on practicequestions
    Given The user is on the applications of array
    When the user click on the practice questions link
    Then the user navigates to practice question page
