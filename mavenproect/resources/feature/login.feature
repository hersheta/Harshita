Feature:
login functionality for male user
In mylo app, male user should be able to login to the application.

Background:
Given i am on login page.

Scenario:Successful login
Given I enter username and password.
When I click on login
then I should be logged in successfully.


Scenario Outline: Unsuccessfully login

Given  I enter wrong username and password
When I click on login
Then Error mesage should be displayed.

Examples:

   |Username|password|error message|
   |a       |23      |jd           |


Scenario: Navigating to the reset password page
When I click on forget password page
Then I should be redirected to reset password page.
