Feature: Linked List

  Background: Login and navigate to Linked List page
    Given The user is on the DS Introduction page as signedIn
    And User clicks on Get Started button from Linked List panel

  Scenario: DS_algo Home page
    Then The user is redirected to Linked List page.

  Scenario: Linked List home page
    When The user clicks on Linked List from the Data Structure dropdown menu.
    Then The user is redirected to Linked List page.

  Scenario: Linked List home page
    When The user clicks Introduction link
    Then The user is redirected to Introduction page.

  Scenario: Linked List home page
    Given The user is on the Introduction page
    When The user clicks Try Here button
    Then The user is redirected to a page having Editor and run button

  Scenario: LL_Try Here Editor page with empty data
    Given The user is on the Introduction page
    And The user clicks Try Here button
    When The user writes no code inside editor window and clicks on Run button
    Then Nothing happens to the Editor page and no error message is displayed

  Scenario: LL_Try Here Editor page with valid data
   Given The user is on the Introduction page
    And The user clicks Try Here button
    When The user writes the valid python code and clicks on Run button
    Then The user is able to see the output inside the console.

  Scenario: LL_Try Here Editor page with invalid data
    Given The user is on the Introduction page
    And The user clicks Try Here button
    When The user writes the invalid python code and clicks on Run button
    Then The user see error msg in alert window

  Scenario: Linked List home page
    Given The user is on the Introduction page   
    When The user clicks Creating Linked LIst link    
    Then The user is redirected to Creating Linked List page.

  Scenario: Creating Linked LIst
    Given The user is on the Creating Linked LIst page
    When The user clicks Try Here button
    Then The user is redirected to a page having Editor and run button

  Scenario: LL_Try Here Editor page with empty data
    Given The user is on the Creating Linked LIst page
    And The user clicks Try Here button
    When The user writes no code inside editor window and clicks on Run button
    Then Nothing happens to the Editor page and no error message is displayed

  Scenario: LL_Try Here Editor page with valid data
    Given The user is on the Creating Linked LIst page
    And The user clicks Try Here button
    When The user writes the valid python code and clicks on Run button
    Then The user is able to see the output inside the console.

  Scenario: LL_Try Here Editor page with invalid data
    Given The user is on the Creating Linked LIst page
    And The user clicks Try Here button
    When The user writes the invalid python code and clicks on Run button
    Then The user see error msg in alert window

  Scenario: Linked List home page
    Given The user is on the Creating Linked LIst page
    When The user clicks Types of Linked List link
    Then The user is directed to Types of Linked List page.

  Scenario: Types of Linked List
    Given The user is on the Types of Linked List page
    When The user clicks Try Here button
    Then The user is redirected to a page having Editor and run button

  Scenario: LL_Try Here Editor page with empty data
    Given The user is on the Types of Linked List page
    When The user clicks Try Here button
    When The user writes no code inside editor window and clicks on Run button
    Then Nothing happens to the Editor page and no error message is displayed

  Scenario: LL_Try Here Editor page with valid data
    Given The user is on the Types of Linked List page
    When The user clicks Try Here button
    When The user writes the valid python code and clicks on Run button
    Then The user is able to see the output inside the console.

  Scenario: LL_Try Here Editor page with invalid data
    Given The user is on the Types of Linked List page
    When The user clicks Try Here button
    When The user writes the invalid python code and clicks on Run button
    Then The user see error msg in alert window

  Scenario: Linked List home page
  Given The user is on the Types of Linked List page
    When The user clicks Implement Linked List in Python link
    Then The user is redirected to Implement Linked List in Python page.

  Scenario: Implement Linked List in Python
    Given The user is on the Implement Linked List in Python page
    When The user clicks Try Here button
    Then The user is redirected to a page having Editor and run button

  Scenario: LL_Try Here Editor page with empty data
    Given The user is on the Implement Linked List in Python page
    And The user clicks Try Here button
    When The user writes no code inside editor window and clicks on Run button
    Then Nothing happens to the Editor page and no error message is displayed

  Scenario: LL_Try Here Editor page with valid data
    Given The user is on the Implement Linked List in Python page
    And The user clicks Try Here button
    When The user writes the valid python code and clicks on Run button
    Then The user is able to see the output inside the console.

  Scenario: LL_Try Here Editor page with invalid data
    Given The user is on the Implement Linked List in Python page
    And The user clicks Try Here button
    When The user writes the invalid python code and clicks on Run button
    Then The user see error msg in alert window

  Scenario: Linked List home page
   Given The user is on the Implement Linked List in Python page
    When The user clicks Traversal link
    Then The user is redirected to Traversal page.

  Scenario: Traversal
    Given The user is on the Traversal page
    When The user clicks Try Here button
    Then The user is redirected to a page having Editor and run button

  Scenario: LL_Try Here Editor page with empty data
    Given The user is on the Traversal page
    And The user clicks Try Here button
    When The user writes no code inside editor window and clicks on Run button
    Then Nothing happens to the Editor page and no error message is displayed

  Scenario: LL_Try Here Editor page with valid data
    Given The user is on the Traversal page
    And The user clicks Try Here button
    When The user writes the valid python code and clicks on Run button
    Then The user is able to see the output inside the console.

  Scenario: LL_Try Here Editor page with invalid data
    Given The user is on the Traversal page
    And The user clicks Try Here button
    When The user writes the invalid python code and clicks on Run button
    Then The user see error msg in alert window

  Scenario: Linked List home page
    Given The user is on the Traversal page
    When The user clicks Insertion link
    Then The user is redirected to Insertion page.

  Scenario: Insertion
    Given The user is on the Insertion page
    When The user clicks Try Here button
    Then The user is redirected to a page having Editor and run button

  Scenario: LL_Try Here Editor page with empty data
    Given The user is on the Insertion page
    And The user clicks Try Here button
    When The user writes no code inside editor window and clicks on Run button
    Then Nothing happens to the Editor page and no error message is displayed

  Scenario: LL_Try Here Editor page with valid data
    Given The user is on the Insertion page
    And The user clicks Try Here button
    When The user writes the valid python code and clicks on Run button
    Then The user is able to see the output inside the console.

  Scenario: LL_Try Here Editor page with invalid data
    Given The user is on the Insertion page
    And The user clicks Try Here button
    When The user writes the invalid python code and clicks on Run button
    Then The user see error msg in alert window

  Scenario: Linked List home page
    Given The user is on the Insertion page
    When The user clicks Deletion link
    Then The user is redirected to Deletion page.

  Scenario: Deletion
    Given The user is on the Deletion page
    When The user clicks Try Here button
    Then The user is redirected to a page having Editor and run button

  Scenario: LL_Try Here Editor page with empty data
    Given The user is on the Deletion page
    And The user clicks Try Here button
    When The user writes no code inside editor window and clicks on Run button
    Then Nothing happens to the Editor page and no error message is displayed

  Scenario: LL_Try Here Editor page with valid data
    Given The user is on the Deletion page
    And The user clicks Try Here button
    When The user writes the valid python code and clicks on Run button
    Then The user is able to see the output inside the console.

  Scenario: LL_Try Here Editor page with invalid data
    Given The user is on the Deletion page
    And The user clicks Try Here button
    When The user writes the invalid python code and clicks on Run button
    Then The user see error msg in alert window

  Scenario: Introduction page
    Given The user is on the Introduction page
    When The user clicks Practice Questions link
    Then The user is redirected to Practice Questions page.
