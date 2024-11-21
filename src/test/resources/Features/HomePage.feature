Feature: DS Homepage

  Scenario: Validate user lands on default home page
    When The user enter the DS_Algo Portal <URL>
    Then The user should landed on the DS_Algo Get Started page with message You are at the right place

  Scenario: Validate user navigate to DS Intro Page
    Given The user should open the DS Algo Portal URL in any supported browser
    When The user clicks the Get Started button
    Then The user should land in Data Structure Introduction Page with register and Sign in links