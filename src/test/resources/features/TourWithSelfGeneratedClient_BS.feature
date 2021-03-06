 #@author Sivasankaramalan Gunasekarasivam
@Regression
Feature: creation of self generated oppertunity and scheduling tour with self generated oppertunity

 Background: 
    Given Launch the agent app
    When User clicks on "Skip" option
    And User clicks on "Sign in" option
    And User selects the "Automation Qeagent" agent and logins
    And Verify "Home page" is displayed
    And Navigate to "Clients" Tab and Validate it
    
  Scenario: self-generated opportunity creation
    And User clicks on "+Add" button
    And User clicks on "Buyer" option
		And User fills in below information
		
    	 	|		First Name			|
    		|		Last Name 			|  
    		|		Phone Number		|
    		|		Email Address		|
    		|		Budget					|
    		|		Pre-Approved		|
    		|		Timeframe				|  
    		
    And User clicks on "Add client" button
    And Verify created clients details of "Buyer" in client page
   	Then User closes the app
   
  Scenario: verify the stage of self-generated opportunity
    And User searches for client "Automation"
    And User selects "Client" in clients tab
    And verify the client stage as "Claimed" in clients details page
    Then User closes the app
    
  Scenario: create a tour request for self-generated opportunity
    And User searches for client "Automation" 
    And User selects "Client" in clients tab
    And scroll to "Tasks" section 
    And user adds tasks to the "Client"
    And user clicks on "Tour with client" button
    And user schedules tour with client
    
    	 	|		Title						|
    		|		When 						|  
    		|		Add A Reminder	|
    		|		Location				|
    		| 	Notes						|
		
    And verify the Schedule tour task in clients details page
    Then User closes the app
    
  	Scenario: verify tour report for self-generated opportunity 
    And User searches for client "Automation"
    And User selects "Client" in clients tab
    And verify the client stage as "In contact" in clients details page
    And scroll to "Tasks" section 
    And user verifies the "Scheduled tour"
    And user clicks on "Tour report" button
    And verify the "Tour report welcome page" is displayed or not
    And verify the "Take or upload photos" on tour report page
    And verify the "Add comment" on tour report page
    Then User closes the app
     
  Scenario: choose and upload photos on tour report page 
    And User searches for client "Automation"
    And User selects "Client" in clients tab
    And scroll to "Tasks" section 
    And user verifies the "Scheduled tour"
    And user clicks on "Tour report" button
    And user clicks on "Take or upload photos" button
   	And user uploads photo from "Gallery"
   	And user clicks on "Continue" button
    And user adds "Rating"
    And verify the confirmation page of tour report 
    And verify the acknowledgment page 
    And user clicks on "Back to your tasks" button
    Then User closes the app
   
   	Scenario: add comment on tour report page
    And User searches for client "Automation"
    And User selects "Client" in clients tab
    And scroll to "Tasks" section 
    And user verifies the "Scheduled tour"
    And user clicks on "Tour report" button
    And user clicks on "Add comment" button
    And user verifies the "Added Comment"
    Then User closes the app
    
  Scenario: add photos with comment on tour report page
    And User searches for client "Automation"
    And User selects "Client" in clients tab
    And scroll to "Tasks" section 
    And user verifies the "Scheduled tour"
    And user clicks on "Tour report" button
    And user clicks on "Take or upload photos" button
   	And user uploads photo from "Camera" 
    And user adds "Comments"
    And verify the "Uploaded photo" is displayed or not
   	And verify the "Added comments" is displayed or not
   	Then User closes the app	

    Scenario: verify tour report confirmation page
    And User searches for client "Automation"
    And User selects "Client" in clients tab
    And scroll to "Tasks" section 
    And user verifies the "Scheduled tour"
    And user clicks on "Tour report" button
    And user clicks on "Take or upload photos" button
   	And user uploads photo from "Camera" 
    And user adds "Liked it" reaction to added photo
    And user clicks on "Continue" button
    And user adds "Rating"
    And verify the confirmation page of tour report 
    And verify the acknowledgment page 
    And user clicks on "Back to your tasks" button
    Then User closes the app