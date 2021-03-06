@Regression
Feature: Agent App Home Page Business Scenarios

# Note : Change Email Address in Line 30 bases on the user
  Background: 
    Given Launch the agent app
    When User clicks on "Skip" option
    And User clicks on "Sign in" option
    And User selects the "Automation Qeagent" agent and logins
    And Verify "Home page" is displayed

  Scenario: Verify and validate user sets himself busy using toggle button
    And Validate text "I am available" is displayed
    And User clicks on "toggle" button
    And Validate text "Set Return Date/Time" is displayed
    And Validate text "I am available again on" is displayed
    And Validate text "Close mark" is displayed
    And Validate text "Footer text" is displayed
    And User clicks on "Save" button
    And Verify "I am busy" is displayed
    And User clicks on "toggle to off" button
    And Validate text "I am available" is displayed
    And User clicks on "Sign Out" button
    Then User closes the app

  Scenario: Validate agent name and email id
    And Validate text "Owners.com" is displayed
    And Verify "Hamburger Menu" is displayed
    And User clicks on "Hamburger Menu" button
    And Validate username "Gravitas Test3" and email id "gravitas.test3@ownerstest.com"
    Then User closes the app

  Scenario: Validate presence of different options in hamburger menu
    And User clicks on "Hamburger Menu" button
    And Validate presence of different hamburger menu options
      | Suggest Property           |
      | Saved                 		 |
      | Title and Closing Services |
      | The Learning Cafe          |
      | Email/SMS Templates        |
      | My Stats                   |
      | Feedback                   |
      | Settings                   |
      | Email Signature            |
      | About                      |
      | Sign Out                   |
    Then User closes the app

  Scenario: Validate "Pending tours and meetings","Upcoming tours","Follow-up","New Clients" on home page
    And Validate text "Pending tours and meetings" is displayed
    And Validate text "Upcoming tours" is displayed
    And Scroll to text "NEW CLIENTS"
    And Validate text "New Clients" is displayed
    And Scroll to text "FOLLOW UPS"
    And Validate text "Follow-up" is displayed
    Then User closes the app

  Scenario: Validate different Home,Clients,Tour Report,Tasks & Requests tabs in home page
    And Navigate to "Clients" Tab and Validate it
    And Navigate to "Tour Report" Tab and Validate it
    And Navigate to "Tasks" Tab and Validate it
    And Navigate to "Requests" Tab and Validate it
    And Navigate to "Home" Tab and Validate it
    Then User closes the app
