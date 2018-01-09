Feature: To login to gmail

Scenario Outline:Login gmail with userid and password

Given Open  the chrome browser and start application
When I enter valid "<uname>" and "<passwrd>"
Then I must get home page

Examples:

|uname|passwrd|
|veervansh2010@gmail.com|pragathinagar|


