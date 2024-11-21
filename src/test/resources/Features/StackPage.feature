Feature: Stack page
  I want to test the StackPage

  Background: Login and navigate to stack page
    Given The user is on the DS Introduction page as signedIn
    And The user clicks on Get Started link for stack

  Scenario: Validate user navigated to stack details page when clicked on get started
    Then The user is on the stack details page

  Scenario: Validate user can navigate to Operations in Stack page
    Given The user is on the stack details page
    When The user click on Operations in Stack link
    Then the user is navigated to Operations in Stack page

  Scenario: Validate user can Try here link page from Operations in Stack
    Given The user is on the Operations in Stack page
    When User clicks Try here link
    Then User should navigate to tryEditor page

  Scenario: Error message displayed for invalid code on try Editor for Operations in Stack page
    Given The user is on the Operations in Stack page
    And User clicks Try here link
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window

  Scenario: No error message displayed for empty code on try editor for Operations in Stack page
    Given The user is on the Operations in Stack page
    And User clicks Try here link
    When Click the Run button
    Then The user should not see any error message or alert

  Scenario: Valid code on try editor for Operations in Stack runs successfully
    Given The user is on the Operations in Stack page
    And User clicks Try here link
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console

  Scenario: Validate user can navigate to Implementation page
    Given The user is on the stack details page
    When The user click on Implementation link
    Then the user is navigated to Implementation page 
    
  Scenario: Validate user can click on Try here link from Implementation page
    Given The user is on the Implementation page
    When User clicks Try here link
    Then User should navigate to tryEditor page

  Scenario: Error message displayed for invalid code on try Editor for Implementation page
    Given The user is on the Implementation page
    And User clicks Try here link
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window

  Scenario: No error message displayed for empty code on try editor for Implementation page
    Given The user is on the Implementation page
    And User clicks Try here link
    When Click the Run button
    Then The user should not see any error message or alert

  Scenario: Valid code on try editor for Implementation runs successfully
    Given The user is on the Implementation page
    And User clicks Try here link
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console
    
    Scenario: Validate user can navigate to Applications page
    Given The user is on the stack details page
    When The user click on Applications link
    Then the user is navigated to Applications page 
    
  Scenario: Validate user can click on Try here link from Applications page
    Given The user is on the Applications page
    When User clicks Try here link
    Then User should navigate to tryEditor page

  Scenario: Error message displayed for invalid code on try Editor for Applications page
    Given The user is on the Applications page
    And User clicks Try here link
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window

  Scenario: No error message displayed for empty code on try editor for Applications page
    Given The user is on the Applications page
    And User clicks Try here link
    When Click the Run button
    Then The user should not see any error message or alert

  Scenario: Valid code on try editor for Applications runs successfully
    Given The user is on the Applications page
    And User clicks Try here link
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console