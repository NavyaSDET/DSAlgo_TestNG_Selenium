Feature: Login Feature
  I want to use this template for my feature file
  
Scenario: DS Algo Sign in Page with blank info
 Given  The user is on the DS Algo Sign in Page
 When The user clicks login button after leaving the "<username>" textbox and "<password>" textbox blank
 Then The error message "Please fill out this field." appears below Username textbox
  Examples: 
      | username | password  |
      |          |           |
      
 Scenario: DS Algo Sign in Page with blank password
 Given  The user is on the DS Algo Sign in Page
 When The user clicks login button after entering the "<username>" and leaves "<password>" textbox blank
 Then The error message "Please fill out this field." appears below Pwd textbox
  Examples: 
      | username | password  |
      |qachamps3     |           |
      
Scenario: DS Algo Sign in Page  with blank username
 Given  The user is on the DS Algo Sign in Page
 When The user clicks login button after entering the "<password>" only
 Then The error message "Please fill out this field." appears below Username textbox
  Examples: 
      | username | password  |
      |          | Ninjatest@123|
 
Scenario: DS Algo Sign in Page with invalid username and password
 Given  The user is on the DS Algo Sign in Page
 When The user clicks login button after entering invalid "<username>" and invalid "<password>"
 Then The user should able to see an error message "Invalid Username and Password".
  Examples: 
      | username | password  |
      |testtttt     |   testttt        |
      
Scenario: DS Algo Sign in Page with valid username and invalid password
 Given  The user is on the DS Algo Sign in Page
 When The user clicks login button after entering valid "<username>" and invalid "<password>"
 Then The user should able to see an error message "Invalid Username and Password".
  Examples: 
      | username | password  |
      |qachamps3|ytyutu|
      
Scenario: DS Algo Sign in Page  with valid username and Valid password
 Given  The user is on the DS Algo Sign in Page
 When The user clicks login button after entering valid "<username>" and valid "<password>"
 Then The user should land in Data Structure Home Page
  Examples: 
      | username | password  |
      |qachamps3     |    Ninjatest@123       |
