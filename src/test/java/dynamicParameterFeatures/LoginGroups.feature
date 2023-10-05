Feature: Login Functionality for LeafTaps Application 

@Group2 
Scenario: Login with positive credentials 
	Given Enter the user name as 'Demosalesmanager' 
	And Enter the password as 'crmsfa' 
	When Click on the Login button 
	Then Home page should be displayed 
	
@Group3 
Scenario: Login with nagative credentials 
	GivenEnter the user name as 'Demosalesmanager'
	And Enter the password as 'crmsfa2' 
	When Click on the Login button 
	Then Error message should be displayed 
	
	
