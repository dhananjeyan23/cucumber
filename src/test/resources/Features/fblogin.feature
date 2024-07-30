@login
Feature: To validate the login functionality of facebook application

Background:
Given user have to launch the facebook aplication through chrome browser
And user have to maximize the window
@tag1
Scenario: To validate the login functionality with valid username and invalid password
When user have to enter the valid username and invalid password
|jeyan23@gmail.com|12345|

And user have to click the login button
Then user have to close the browser

@tag2
Scenario: To validate the login functionality with Invalid username and invalid password
When user have to enter the invalid username and invalid password
 | username123@gmail.com | password@123|
 | username456@gmail.com | password@456|
 | username789@gmail.com | password@789|
 
And user have to click the login button
Then user have to close the browser
@tag3
Scenario: To validate the login functionality with empty username and invalid password
When user have to enter the username and invalid password
| username | padma23@gmail.com|
| password | padma23|
And user have to click the login button
Then user have to close the browser
@tag4
Scenario Outline: To validate the login functionality with empty username and invalid password
When user have to enter the "<username>" and  "<password>"
And user have to click the login button
Then user have to close the browser

Examples:
 | username | password|
 | username123@gmail.com | password@123|
 | username456@gmail.com | password@456|
 | username789@gmail.com | password@789|
 
 @tag5
Scenario: To validate the login functionality with Invalid username and invalid password
When user have to enter the username and  password
 | username | password|
 | username123@gmail.com | password@123|
 | username456@gmail.com | password@456|
 | username789@gmail.com | password@789|
 
And user have to click the login button
Then user have to close the browser
   