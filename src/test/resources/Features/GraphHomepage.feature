Feature: Title of your feature
  I want to use this template for my feature file

  Background: Login and navigate to graph page
    Given The user is on the DS Introduction page as signedIn
    And The user clicks on Get Started link for graph

  Scenario: Validate user navigated to graph details page when clicked on get started
    Then The user is on the graph details page

  Scenario: Validate user can navigate to Graph in Graph page
    Given The user is on the graph details page
    When The user click on graph link in graph details page
    Then the user is navigated to graph page under graph details

  Scenario: Validate user can Try here link page from graphs
    Given The user is on the graphs page under graph detials
    When User clicks Try here link
    Then User should navigate to tryEditor page

  Scenario: Error message displayed for invalid code on try Editor for graphs page
    Given The user is on the graphs page under graph detials
    And User clicks Try here link
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window

  Scenario: No error message displayed for empty code on try editor for graphs page
    Given The user is on the graphs page under graph detials
    And User clicks Try here link
    When Click the Run button
    Then The user should not see any error message or alert

  Scenario: Valid code on try editor for graphs runs successfully
    Given The user is on the graphs page under graph detials
    And User clicks Try here link
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console

  Scenario: Validate user can navigate to Graph Representations page
    Given The user is on the graph details page
    When The user click on graph representations link
    Then the user is navigated to graph representations page 
    
  Scenario: Validate user can click on Try here link from graph representations page
    Given The user is on the graphs representations page
    When User clicks Try here link
    Then User should navigate to tryEditor page

  Scenario: Error message displayed for invalid code on try Editor for graph representations page
    Given The user is on the graphs representations page
    And User clicks Try here link
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window

  Scenario: No error message displayed for empty code on try editor for graph representations page
    Given The user is on the graphs representations page
    And User clicks Try here link
    When Click the Run button
    Then The user should not see any error message or alert

  Scenario: Valid code on try editor for graph representations runs successfully
    Given The user is on the graphs representations page
    And User clicks Try here link
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console