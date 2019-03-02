#@Author - Jayabrata
#@Regression
Feature: Auto Bundle Business Scenarios

  Background: 
	Given Launch the agent app
	When User clicks on "Skip" option
	And User clicks on "Sign in" option
	And User selects the "Auto Integagent" agent and logins
	And Verify "Home page" is displayed
	And Navigate to "Clients" Tab and Validate it
	And User clicks on "+Add" button
    And User clicks on "Buyer" option
	And user fills in below information
		
    	 	|		First Name			|
    		|		Last Name 			|  
    		|		Phone Number		|
    		|		Email Address		|
    		|		Budget				|
    		   		
    And User clicks on "Add client" button
	
  Scenario: Verify Auto Bundle drop downs
  	And User searches for client
    And User selects "Client" in clients tab
  	And scroll to "Is your client pre-approved?" section 
  	And User clicks on "What is their status" option
  	And Verify "Pre-approved" is displayed
 	And Verify "Not pre-approved" is displayed
  	And Verify "Cash buyer" is displayed
  	Then User closes the app
  	
  Scenario: Verify functionality of choosing  Pre-approved in Auto Bundle
   	And User searches for client
    And User selects "Client" in clients tab
  	And scroll to "Is your client pre-approved?" section 
  	And User clicks on "What is their status" option
  	And User clicks on "Pre-approved" option
  	And Verify "Help them get started" is displayed
  	And User clicks on "Refer" button
  	And User selects "Best Time to Contact" from dropdown list
  	And User selects "Client Expecting a Call?" from dropdown list
  	And User selects "First Time Buyer" from dropdown list
  	And User selects "Selling a Home with Purchase" from dropdown list
  	And User enters "Comments"
  	And User clicks on "Referral Page Next" button
  	And User selects "Purchase Timeline" from dropdown list
  	And User selects "State" from dropdown list
  	And User clicks on "Referral Page Send" button
  	And Verify "Referral sent to Owners.com Loans!" is displayed
  	And User clicks on "OK" button
  	And Verify "You chose to refer this client" is displayed
  	Then User closes the app
 
  Scenario: Verify functionality of choosing  Not pre-approved in Auto Bundle
   	And User searches for client
    And User selects "Client" in clients tab
  	And scroll to "Is your client pre-approved?" section 
  	And User clicks on "What is their status" option
  	And User clicks on "Not pre-approved" option
  	And User clicks on "Do not refer" button
	And User clicks on "My client has a preferred lender" option
	And User clicks on "Submit" button
  	And Verify "You chose not to refer this client" is displayed
  	Then User closes the app
  	
  Scenario: Verify functionality of choosing  Cash buyer in Auto Bundle
 	And User searches for client
    And User selects "Client" in clients tab
  	And scroll to "Is your client pre-approved?" section 
  	And User clicks on "What is their status" option
  	And User clicks on "Cash buyer" option
  	And Verify "Cash Buyer" is displayed
  	Then User closes the app
