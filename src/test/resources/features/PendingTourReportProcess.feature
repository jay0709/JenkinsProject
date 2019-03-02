#@Author - Sivasankaramalan Gunasekarasivam
@Regression
Feature: Tour Report Process for Pending Tours Business Scenario

	Background: 
		Given Launch the agent app
	  When User clicks on "Skip" option
	  And User clicks on "Sign in" option
	  And User selects the "Automation Qeagent" agent and logins
		And Verify "Home page" is displayed
	
	Scenario: Verify the pending tour card on home page (QO-31725)
		And Verify "Pending Tours And Meetings" is displayed
		And Verify Client Name "Automation" is displayed
		And Verify "Property Address" is displayed
		#And Verify "Property Image" is displayed
		And Verify "Accept" is displayed
		And Verify "Reschedule" is displayed
		Then User closes the app
	
	Scenario: Accept pending tour and convert into confirmed tour (QO-31726)
		And Verify "Pending Tours And Meetings" is displayed
		And User clicks on "Accept" button
		And User clicks on "Done" button
    And Verify "Tour Report Card is disappeard" from Home page
    And Verify "Accepted Tour" is displayed in upcoming tours section
    And Verify "Tour Time"		
    And Verify "Upcoming Tours" is displayed
		And Verify "Start Tour Report" is displayed
		Then User closes the app
	
	Scenario: Start Tour report for the accepted tour (QO-31727),(QO-31728)
		And User clicks on "Start Tour Report" button
		And Verify "YES" is displayed
	  And User clicks on "YES" button
		And verify the "Tour report welcome page" is displayed or not
	  And User clicks on "YES" button
		And verify the "Take or upload photos" on tour report page
    And verify the "Add comment" on tour report page
    Then User closes the app
    
	Scenario: Upload photos and comments and navigate to final page (QO-31729),(QO-31730),(QO-31731)
		And Scroll to "Upcoming Tours" section
		And User clicks on "Start Tour Report" button
		And Verify "YES" is displayed
		And User clicks on "YES" button
		And verify the "Tour report welcome page" is displayed or not
		And verify the "Take or upload photos" on tour report page
		#And User clicks on "Add comment" button
		#And Verify "Added Comment"
		And User clicks on "Take or upload photos" button
   	And user uploads photo from "Gallery"
   	And User clicks on "Continue" button
   	And User adds "Rating" 
   	And Verify "Picture Actions" is displayed
    And verify the confirmation page of tour report 
    And verify the acknowledgment page 
    And User clicks on "Back to your tasks" button
    Then User closes the app