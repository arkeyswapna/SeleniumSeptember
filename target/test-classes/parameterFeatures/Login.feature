Feature: Login Functionality for LeafTaps Application
Scenario: Login with positive credentials
Given Open the chrome browser
And  Load the application url
And Enter the user name as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then Home page should be displayed


