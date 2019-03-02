#@Author - chakraja
@Sanity
Feature: Auto Bundle Business Scenarios

  Background: 
	Given Launch the agent app
	When User clicks on "Skip" option
	And User clicks on "Sign in" option
	And User selects the "Automation Qeagent" agent and logins
	And Verify "Home page" is displayed
	And Navigate to "Clients" Tab and Validate it
	
  Scenario: Create Self-Generated Opportunity and verify the details
  	And User clicks on "+Add" button
  	And User clicks on "Buyer" option
  	And User enters "FirstName"
  	And User enters "LastName"
  	And User enters "PhoneNumber"
  	And User enters "EmailAddress"
  	And User clicks on "Next" button
  	And User selects "Budget" from dropdown list
  	And User selects "PreApproved" from dropdown list
  	And User selects "Timeframe" from dropdown list
  	And User clicks on "Add Client" button
  	And Verify created clients details of "Buyer" in client page
  	Then User closes the app
  	
  Scenario: Verify functionality of bundle offer present on Calculate Saving Page

  	And User searches for client "Automation"
    And User selects "Client" in clients tab
  	And User update the stage to "In Contact"
  	And Verify "Steps For Success" is displayed
  	And Scroll to text "Help your client save"
  	And Verify "Calculate client's savings" is displayed
  	And User clicks on "Calculate client's savings" button
  	And Verify "Calculate Savings page" is displayed
  	And Verify "Bundle Offers" is displayed
  	And Verify "SemiCircle Graph" is displayed
  	And User clicks on "Buy & Sell with Owners.com" option
  	And Verify "AutoBundle Savings CTAs" is displayed
  	And Verify "Bundle Savings amount" is displayed
  	Then User closes the app
  	
  Scenario: Verify functionality of Share This Bundle with Your Client CTA via SMS
 
  	And User searches for client "Automation"
    And User selects "Client" in clients tab
  	And Scroll to text "Help your client save"
  	And User clicks on "Calculate client's savings" button
  	And User clicks on "Buy & Sell with Owners.com" option
  	And User clicks on "Share This Bundle with Your Client" button
  	And Verify "Share offer with client" is displayed
  	And User clicks on "Send SMS" option
  	Then User closes the app
  	
  Scenario: Verify functionality of Share This Bundle with Your Client CTA via Email

  	And User searches for client "Automation"
    And User selects "Client" in clients tab
  	And Scroll to text "Help your client save"
  	And User clicks on "Calculate client's savings" button
  	And User clicks on "Finance with Owners.com Loans" option
  	And User clicks on "Share This Bundle with Your Client" button
  	And Verify "Share offer with client" is displayed
  	And User clicks on "Send Email" option
  	And Verify "App Email Editor" is displayed
  	Then User closes the app
  	

  Scenario: Verify detail flow from CSP to CDP
    And User searches for client "Automation"
    And User selects "Client" in clients tab
  	And Scroll to text "Help your client save"
  	And User clicks on "Calculate client's savings" button
  	And Verify "Calculate Savings page" is displayed
  	And User clicks on "Buy & Sell with Owners.com" option
  	And User clicks on "Confirm Selected Offers" button
  	And Scroll to text "CALCULATE AGAIN"
  	And Verify "Buy & Sell Offer card" is displayed
  	And Verify "Buy & Sell Offer card" component
  	And User clicks on "Calculate Again" button
  	And User clicks on "Finance with Owners.com Loans" option
  	And User clicks on "Confirm Selected Offers" button
  	And Scroll to text "CALCULATE AGAIN"
  	And Verify "Finance with Owners.com Loans" component
  	Then User closes the app
