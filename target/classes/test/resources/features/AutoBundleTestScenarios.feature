#Author: Jayabrata
@Regression
Feature: Auto Bundle Business Scenarios

Background: 
    Given Launch the agent app
    When User clicks on "Skip" option
    And User clicks on "Sign in" option
    And User selects the "Automation Qeagent" agent and logins
    And Verify "Home page" is displayed
    And User clicks on "Clients" tab
    
  Scenario:  Verify the New seller page (QO-31578) (QO-31579) (QO-31584) (QO-31585) (QO-31586)
    And User clicks on "+Add" button
    And User clicks on "Buyer" option
		And User fills in below information
		
    	 	|		First Name			|
    		|		Last Name 			|  
    		|		Phone Number		|
    		|		Email Address		|
    		|		Budget					| 
    			
    And User clicks on "Add client" button	
    And User searches for client "Automation"
    And User selects "Client" in clients tab
    And User update the stage to "In Contact"
    And Verify "Steps For Success" is displayed
    And User clicks on "Review Bundle Offers" option
		And User clicks on "BuySell Get Started" button
    And Verify "Client Creation Page" is displayed
    Then User closes the app
    
  Scenario: Verify the share offer functionality (QO-31580)
	And User searches for client "Automation"
    And User selects "Client" in clients tab
		And Verify "Steps For Success" is displayed
    And User clicks on "Review Bundle Offers" option
    And User clicks on "BuySell Share Offer" option
    And User clicks on "Send Email" option
    And Verify "Email Editor" is displayed
    And User closes email editor
    And User clicks on "BuySell Share Offer" option
    And User clicks on "Send SMS" option
    Then User closes the app
  
   	