Feature: Geetha AUtomation Scenarios

  Scenario: Validate the DS dropdown without signIN
    Given The user should open the DS Algo Portal URL in any supported browser
    When The user clicks the Get Started button
    And The user clicks the data structure dropdown arrow
    Then The user should able to see siz options Arrays Linked,List,Stack,Queue,Tree,Graph in dropdown menu

  Scenario: Verify warning message when user navigate to DS details page without signIn
    Given The user is on the DS Introduction page
    When The user clicks any Get Started buttons of data structures on the DS Introduction page
    Then The user should able to see an warning message You are not logged in

  Scenario: Validate user lands on register page when clicked on register
    Given The user is on the DS Introduction page
    When The user clicks Register link on the DS Introduction page
    Then The user should navigate to register page

  Scenario: Clicking on get started for data structers lands on Data Structers details page
    Given The user is on the DS Introduction page as signedIn
    When The user clicks the Get Started button of DS Introduction
    Then The user should navigate to DS Intoduction details page
    And User should see the timeComplexity link

  Scenario: Clicking on time complexity navigate to the page
    Given The user is on the DS Introduction page as signedIn
    When The user clicks the Get Started button of DS Introduction
    And The user clicks the Time Complexity button
    Then User should navigate to Time Complexity page
    And User should see Practice Question link and try here

  Scenario: Clicking on Try Here on time complexity opens python editor
    Given The user is on the DS Introduction page as signedIn
    When The user clicks the Get Started button of DS Introduction
    And The user clicks the Time Complexity button
    And User clicks Try here link
    Then User should navigate to tryEditor page

  Scenario: Error message displayed for invalid code on try editor for Time Complexity
    Given The user is on the DS Introduction page as signedIn
    And The user clicks the Get Started button of DS Introduction
    And The user clicks the Time Complexity button
    And User clicks Try here link
    And User is on Try Here page for time complexity
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window

  Scenario: No error message displayed for empty code on try editor for Time Complexity
    Given The user is on the DS Introduction page as signedIn
    And The user clicks the Get Started button of DS Introduction
    And The user clicks the Time Complexity button
    And User clicks Try here link
    And User is on Try Here page for time complexity
    When Click the Run button
    Then The user should not see any error message or alert

  Scenario: Valid code on try editor for Time Complexity runs successfully
    Given The user is on the DS Introduction page as signedIn
    And The user clicks the Get Started button of DS Introduction
    And The user clicks the Time Complexity button
    And User clicks Try here link
    And User is on Try Here page for time complexity
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console
