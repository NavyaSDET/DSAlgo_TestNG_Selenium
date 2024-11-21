Feature: Tree

Background: Login and navigate to Tree page
Given The user is on the DS Introduction page as signedIn
And User clicks on Get Started button from Tree panel

Scenario: DS_algo Home page
When The user select Tree from the Data Structure dropdown menu
Then The user is redirected to Tree page.

Scenario: Tree home page
When The user clicks Overview of Trees link
Then The user is redirected to Overview of Trees page.


Scenario: Overview of Trees
Given The user is on the Overview of Trees page
When The user clicks Try Here button
Then The user is redirected to a page having Editor and run button

Scenario: Try Here Editor page with empty code
Given The user is on the Overview of Trees page
And The user clicks Try Here button
When The user writes no code inside editor window and clicks on Run button
Then Nothing happens to the Editor page and no error message is displayed


Scenario: Try Here Editor page with valid data
Given The user is on the Overview of Trees page
And The user clicks Try Here button
When The user writes the valid python code and clicks on Run button
Then The user is able to see the output inside the console.

Scenario: Try Here Editor page with invalid data
Given The user is on the Overview of Trees page
And The user clicks Try Here button
When The user writes the invalid python code and clicks on Run button
Then The user see error msg in alert window

Scenario: Try Here Editor page with alert message

Given The user is on the Overview of Trees page
And The user clicks Try Here button
And The user writes the invalid python code and clicks on Run button
When The user clicks the ok button in the alert window
Then Alert message window is dismissed and user stays on Editor page

##########################################################################

Scenario: Overview of Trees

Given The user is on the Overview of Trees page
When The user clicks Terminologies link
Then The user is redirected to Terminologies page


Scenario: Terminologies
Given The user is on the Terminologies page
When The user clicks Try Here button
Then The user is redirected to a page having Editor and run button

Scenario: Try Here Editor page with empty code
Given The user is on the Terminologies page
And The user clicks Try Here button
When The user writes no code inside editor window and clicks on Run button
Then Nothing happens to the Editor page and no error message is displayed

Scenario: Try Here Editor page with valid data

Given The user is on the Terminologies page
And The user clicks Try Here button
When The user writes the valid python code and clicks on Run button
Then The user is able to see the output inside the console.

Scenario: Try Here Editor page with invalid data

Given The user is on the Terminologies page
And The user clicks Try Here button
When The user writes the invalid python code and clicks on Run button
Then The user see error msg in alert window

Scenario: Try Here Editor page with alert message

Given The user is on the Terminologies page
And The user clicks Try Here button
And The user writes the invalid python code and clicks on Run button
When The user clicks the ok button in the alert window
Then Alert message window is dismissed and user stays on Editor page

Scenario: Terminologies

Given The user is on the Terminologies page
When The user clicks Types of Trees link from TerminologiesPage
Then The user is redirected to Types of Trees page.


Scenario: Types of Trees

Given The user is on the Types of Trees page
When The user clicks Try Here button
Then The user is redirected to a page having Editor and run button


Scenario: Try Here Editor page with empty code
Given The user is on the Types of Trees page
And The user clicks Try Here button
When The user writes no code inside editor window and clicks on Run button
Then Nothing happens to the Editor page and no error message is displayed


Scenario: Try Here Editor page with valid data
Given The user is on the Types of Trees page
And The user clicks Try Here button
When The user writes the valid python code and clicks on Run button
Then The user is able to see the output inside the console.

Scenario: Try Here Editor page with invalid data
Given The user is on the Types of Trees page
And The user clicks Try Here button
When The user writes the invalid python code and clicks on Run button
Then The user see error msg in alert window

Scenario: Try Here Editor page with alert message

Given The user is on the Types of Trees page
And The user clicks Try Here button
And The user writes the invalid python code and clicks on Run button
When The user clicks the ok button in the alert window
Then Alert message window is dismissed and user stays on Editor page

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Scenario: Types of Trees

Given The user is on the Types of Trees page
When The user clicks Tree Traversals link
Then The user is redirected to Tree Traversals page


Scenario: Tree Traversals

Given The user is on the Tree Traversals page
When The user clicks Try Here button
Then The user is redirected to a page having Editor and run button

Scenario: Try Here Editor page with empty code

Given The user is on the Tree Traversals page
And The user clicks Try Here button
When The user writes no code inside editor window and clicks on Run button
Then Nothing happens to the Editor page and no error message is displayed

Scenario: Try Here Editor page with valid data

Given The user is on the Tree Traversals page
And The user clicks Try Here button
When The user writes the valid python code and clicks on Run button
Then The user is able to see the output inside the console.

Scenario: Try Here Editor page with invalid data

Given The user is on the Tree Traversals page
And The user clicks Try Here button
When The user writes the invalid python code and clicks on Run button
Then The user see error msg in alert window

Scenario: Try Here Editor page with alert message

Given The user is on the Tree Traversals page
And The user clicks Try Here button
And The user writes the invalid python code and clicks on Run button
When The user clicks the ok button in the alert window
Then Alert message window is dismissed and user stays on Editor page


Scenario: Tree Traversals

Given The user is on the Tree Traversals page
When The user clicks Traversals-Illustration link
Then The user is redirected to Traversals-Illustration page


Scenario: Traversals-Illustration

Given The user is on the Traversals-Illustration page
When The user clicks Try Here button
Then The user is redirected to a page having Editor and run button

Scenario: Try Here Editor page with empty code

Given The user is on the Traversals-Illustration page
And The user clicks Try Here button
When The user writes no code inside editor window and clicks on Run button
Then Nothing happens to the Editor page and no error message is displayed

Scenario: Try Here Editor page with valid data

Given The user is on the Traversals-Illustration page
And The user clicks Try Here button
When The user writes the valid python code and clicks on Run button
Then The user is able to see the output inside the console.

Scenario: Try Here Editor page with invalid data

Given The user is on the Traversals-Illustration page
And The user clicks Try Here button
When The user writes the invalid python code and clicks on Run button
Then The user see error msg in alert window

Scenario: Try Here Editor page with alert message

Given The user is on the Traversals-Illustration page
And The user clicks Try Here button
And The user writes the invalid python code and clicks on Run button
When The user clicks the ok button in the alert window
Then Alert message window is dismissed and user stays on Editor page

Scenario: Traversals-Illustration

Given The user is on the Traversals-Illustration page
When The user clicks Binary Trees link
Then The user is redirected to Binary Trees page.


Scenario: Binary Trees

Given The user is on the Binary Trees page
When The user clicks Try Here button
Then The user is redirected to a page having Editor and run button

Scenario: Try Here Editor page with empty code

Given The user is on the Binary Trees page
And The user clicks Try Here button
When The user writes no code inside editor window and clicks on Run button
Then Nothing happens to the Editor page and no error message is displayed

Scenario: Try Here Editor page with valid data

Given The user is on the Binary Trees page
And The user clicks Try Here button
When The user writes the valid python code and clicks on Run button
Then The user is able to see the output inside the console.

Scenario: Try Here Editor page with invalid data

Given The user is on the Binary Trees page
And The user clicks Try Here button
When The user writes the invalid python code and clicks on Run button
Then The user see error msg in alert window

Scenario: Try Here Editor page with alert message

Given The user is on the Binary Trees page
And The user clicks Try Here button
And The user writes the invalid python code and clicks on Run button
When The user clicks the ok button in the alert window
Then Alert message window is dismissed and user stays on Editor page


Scenario: Binary Trees

Given The user is on the Binary Trees page
When The user clicks Types of Binary Trees link
Then The user is redirected to Types of Binary Trees page.


Scenario: Types of Binary Trees

Given The user is on the Types of Binary Trees page
When The user clicks Try Here button
Then The user is redirected to a page having Editor and run button

Scenario: Try Here Editor page with empty code

Given The user is on the Types of Binary Trees page
And The user clicks Try Here button
When The user writes no code inside editor window and clicks on Run button
Then Nothing happens to the Editor page and no error message is displayed

Scenario: Try Here Editor page with valid data

Given The user is on the Types of Binary Trees page
And The user clicks Try Here button
When The user writes the valid python code and clicks on Run button
Then The user is able to see the output inside the console.

Scenario: Try Here Editor page with invalid data

Given The user is on the Types of Binary Trees page
And The user clicks Try Here button
When The user writes the invalid python code and clicks on Run button
Then The user see error msg in alert window

Scenario: Try Here Editor page with alert message

Given The user is on the Types of Binary Trees page
And The user clicks Try Here button
And The user writes the invalid python code and clicks on Run button
When The user clicks the ok button in the alert window
Then Alert message window is dismissed and user stays on Editor page

Scenario: Types of Binary Trees

Given The user is on the Types of Binary Trees page
When The user clicks Implementation in Python Trees link
Then The user is redirected to Implementation in Python page.


Scenario: Implementation in Python

Given The user is on the Implementation in Python page
When The user clicks Try Here button
Then The user is redirected to a page having Editor and run button

Scenario: Try Here Editor page with empty code

Given The user is on the Implementation in Python page
And The user clicks Try Here button
When The user writes no code inside editor window and clicks on Run button
Then Nothing happens to the Editor page and no error message is displayed

Scenario: Try Here Editor page with valid data

Given The user is on the Implementation in Python page
And The user clicks Try Here button
When The user writes the valid python code and clicks on Run button
Then The user is able to see the output inside the console.

Scenario: Try Here Editor page with invalid data

Given The user is on the Implementation in Python page
And The user clicks Try Here button
When The user writes the invalid python code and clicks on Run button
Then The user see error msg in alert window

Scenario: Try Here Editor page with alert message

Given The user is on the Implementation in Python page
And The user clicks Try Here button
And The user writes the invalid python code and clicks on Run button
When The user clicks the ok button in the alert window
Then Alert message window is dismissed and user stays on Editor page

Scenario: Implementation in Python

Given The user is on the Implementation in Python page
When The user clicks Binary Tree Traversals link
Then The user is redirected to Binary Tree Traversals page.


Scenario: Binary Tree Traversals

Given The user is on the Binary Tree Traversals page
When The user clicks Try Here button
Then The user is redirected to a page having Editor and run button

Scenario: Try Here Editor page with empty code

Given The user is on the Binary Tree Traversals page
And The user clicks Try Here button
When The user writes no code inside editor window and clicks on Run button
Then Nothing happens to the Editor page and no error message is displayed

Scenario: Try Here Editor page with valid data

Given The user is on the Binary Tree Traversals page
And The user clicks Try Here button
When The user writes the valid python code and clicks on Run button
Then The user is able to see the output inside the console.

Scenario: Try Here Editor page with invalid data

Given The user is on the Binary Tree Traversals page
And The user clicks Try Here button
When The user writes the invalid python code and clicks on Run button
Then The user see error msg in alert window

Scenario: Try Here Editor page with alert message

Given The user is on the Binary Tree Traversals page
And The user clicks Try Here button
And The user writes the invalid python code and clicks on Run button
When The user clicks the ok button in the alert window
Then Alert message window is dismissed and user stays on Editor page

Scenario: Binary Tree Traversals

Given The user is on the Binary Tree Traversals page
When The user clicks Implementation of Binary Trees button
Then The user is redirected to Implementation of Binary Trees page.


Scenario: Implementation of Binary Trees

Given The user is on the Implementation of Binary Trees page
When The user clicks Try Here button
Then The user is redirected to a page having Editor and run button

Scenario: Try Here Editor page with empty code

Given The user is on the Implementation of Binary Trees page
And The user clicks Try Here button
When The user writes no code inside editor window and clicks on Run button
Then Nothing happens to the Editor page and no error message is displayed

Scenario: Try Here Editor page with valid data

Given The user is on the Implementation of Binary Trees page
And The user clicks Try Here button
When The user writes the valid python code and clicks on Run button
Then The user is able to see the output inside the console.

Scenario: Try Here Editor page with invalid data

Given The user is on the Implementation of Binary Trees page
And The user clicks Try Here button
When The user writes the invalid python code and clicks on Run button
Then The user see error msg in alert window

Scenario: Try Here Editor page with alert message

Given The user is on the Implementation of Binary Trees page
And The user clicks Try Here button
And The user writes the invalid python code and clicks on Run button
When The user clicks the ok button in the alert window
Then Alert message window is dismissed and user stays on Editor page

Scenario: Implementation of Binary Trees

Given The user is on the Implementation of Binary Trees page
When The user clicks Applications of Binary trees link
Then The user is redirected to Applications of Binary trees page.


Scenario: Applications of Binary trees

Given The user is on the Applications of Binary trees page
When The user clicks Try Here button
Then The user is redirected to a page having Editor and run button

Scenario: Try Here Editor page with empty code

Given The user is on the Applications of Binary trees page
And The user clicks Try Here button
When The user writes no code inside editor window and clicks on Run button
Then Nothing happens to the Editor page and no error message is displayed

Scenario: Try Here Editor page with valid data

Given The user is on the Applications of Binary trees page
And The user clicks Try Here button
When The user writes the valid python code and clicks on Run button
Then The user is able to see the output inside the console.

Scenario: Try Here Editor page with invalid data

Given The user is on the Applications of Binary trees page
And The user clicks Try Here button
When The user writes the invalid python code and clicks on Run button
Then The user see error msg in alert window

Scenario: Try Here Editor page with alert message

Given The user is on the Applications of Binary trees page
And The user clicks Try Here button
And The user writes the invalid python code and clicks on Run button
When The user clicks the ok button in the alert window
Then Alert message window is dismissed and user stays on Editor page

Scenario: Applications of Binary trees

Given The user is on the Applications of Binary trees page
When The user clicks Binary Search Trees link
Then The user is redirected to Binary Search Trees page.


Scenario: Binary Search Trees

Given The user is on the Binary Search Trees page
When The user clicks Try Here button
Then The user is redirected to a page having Editor and run button

Scenario: Try Here Editor page with empty code

Given The user is on the Binary Search Trees page
And The user clicks Try Here button
When The user writes no code inside editor window and clicks on Run button
Then Nothing happens to the Editor page and no error message is displayed

Scenario: Try Here Editor page with valid data

Given The user is on the Binary Search Trees page
And The user clicks Try Here button
When The user writes the valid python code and clicks on Run button
Then The user is able to see the output inside the console.

Scenario: Try Here Editor page with invalid data

Given The user is on the Binary Search Trees page
And The user clicks Try Here button
When The user writes the invalid python code and clicks on Run button
Then The user see error msg in alert window

Scenario: Try Here Editor page with alert message

Given The user is on the Binary Search Trees page
And The user clicks Try Here button
And The user writes the invalid python code and clicks on Run button
When The user clicks the ok button in the alert window
Then Alert message window is dismissed and user stays on Editor page

Scenario: Try Here Editor page with alert message

Given The user is on the Overview of Trees page
And The user clicks Try Here button
And The user writes the invalid python code and clicks on Run button
When The user clicks the ok button in the alert window
Then Alert message window is dismissed and user stays on Editor page

Scenario: Binary Search Trees

Given The user is on the Binary Search Trees page
When The user clicks Implementation Of BST link
Then The user is redirected to Implementation Of BST page.


Scenario: Implementation Of BST

Given The user is on the Implementation Of BST page
When The user clicks Try Here button
Then The user is redirected to a page having Editor and run button

Scenario: Try Here Editor page with empty code

Given The user is on the Implementation Of BST page
And The user clicks Try Here button
When The user writes no code inside editor window and clicks on Run button
Then Nothing happens to the Editor page and no error message is displayed

Scenario: Try Here Editor page with valid data

Given The user is on the Implementation Of BST page
And The user clicks Try Here button
When The user writes the valid python code and clicks on Run button
Then The user is able to see the output inside the console.

Scenario: Try Here Editor page with invalid data

Given The user is on the Implementation Of BST page
And The user clicks Try Here button
When The user writes the invalid python code and clicks on Run button
Then The user see error msg in alert window

Scenario: Try Here Editor page with alert message

Given The user is on the Implementation Of BST page
And The user clicks Try Here button
And The user writes the invalid python code and clicks on Run button
When The user clicks the ok button in the alert window
Then Alert message window is dismissed and user stays on Editor page

Scenario: Implementation Of BST

Given The user is on the Implementation Of BST page
When The user clicks Practice Questions link
Then The user is redirected to Practice Questions page.
