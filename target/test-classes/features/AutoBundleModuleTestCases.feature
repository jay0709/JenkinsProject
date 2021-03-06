#Auto Integagent #Automation Qeagent
#Author: Syed Zubair
@Sanity
Feature: Auto Bundle Business Scenarios

  Background: 
    Given Launch the agent app
    When User clicks on "Skip" option
    And User clicks on "Sign in" option
    And User selects the "Automation Qeagent" agent and logins
    And Verify "Home page" is displayed
    And User clicks on "Clients" tab    

  #Auto Integagent
  #Scenario: Verify the New seller page (QO-31578) (QO-31579) (QO-31584) (QO-31585) (QO-31586)
    #And User clicks on "+Add" button
    #And Selects client type as "Buyer"
    #And User fills in below information
      #| First Name    |
      #| Last Name     |
      #| Phone Number  |
      #| Email Address |
      #| Budget        |
      #| Pre-Approved  |
      #| Timeframe     |
    #And User clicks on "Add client" button
    #And User clicks on "Never Viewed" option
    #And User update the stage to "In Contact"
   #And Scroll to "Help your client save" section
    #And User clicks on "BuySell Get Started" button
    #And Verify "Client Creation Page" is displayed
    #Then User closes the app
#
  #Scenario: Verify the share offer functionality (QO-31580),(QO-31194)
    #And User searches for client "Automation"
    #And User selects "Client" in clients tab
   #And Scroll to "Help your client save" section
    #And User clicks on "BuySell Share Offer" option
    #And User clicks on "Send Email" option
    #And Verify "Email Editor" is displayed
    #And User closes email editor
    #And User clicks on "Buy Sell Share Offer" option
    #And User clicks on "Send SMS" option
    #And Verify "SMS Editor" is displayed
    #Then User closes the app
 #
 #
#
  #Scenario: Verification of Title, heading and CTAs for redesigned OCL Alert and bundle offer is not displayed when refer client or not interested cta is submitted (QO-31212),(QO-31214),(QO-31206)
    #And User clicks on "+Add" button
    #And Selects client type as "Buyer"
    #And User fills in below information
      #| First Name    |
      #| Last Name     |
      #| Phone Number  |
      #| Email Address |
      #| Budget        |
      #| Pre-Approved  |
      #| Timeframe     |
    #And User clicks on "Add client" button
    #And User clicks on "Never Viewed" option
    #And User update the stage to "Showing Homes"
    #And Validate text "Help your client save" is displayed
    #And Validate text "Finance with Owners.com Loans" is displayed
    #And Validate CTA "Refer Client"
    #And Validate CTA "Not interested"
    #And User clicks on "Refer Client" button
    #And Enters below listed details in referral form
      #| Best Time to Contact         |
      #| Client Expecting a call      |
      #| First Time Buyer             |
      #| Selling a Home with Purchase |
      #| Enter comments               |
      #| state                        |
    #And User clicks on "SEND" button
    #And Verify "Referral sent to owners.com" is displayed
    #And User clicks on "OK" button
   #And Scroll to "Help your client save" section
    #And Verify "Finance with Owners.com Loans" is not displayed
    #And User clicks on "Not Interested" button
    #And Selects not interested reason as "Other"
    #And User clicks on "Done" button
    #And User clicks on "Submit" button
    #And Verify "Buy and sell with Owners.com" is not displayed
    #Then User closes the app
#
  #Scenario: Verify Bundle offer section is displayed only above "in-contact" stage (QO-31188),(QO-31187),(QO-31190),(QO-31209),(QO-31176),(QO-31174),(QO-31172),(QO-31171),(QO-31169),(QO-31168),(QO-31161),(QO-31160),(QO-31162)
    #And User searches for client "Automation"
    #And User selects "Client" in clients tab
    #And User update the stage to "Claimed"
    #And Verify "Bundle Offer Section" is not displayed
    #And User update the stage to "In Contact"
    #And Verify "Bundle offer Section" is displayed
    #And User "Expands" bundle offer section and verifies it
    #And Validate text "Help your client text" is displayed
    #And Validate text "Learn more" is displayed
    #And Verify "Savings in bundle offer" is displayed
    #Then User closes the app
#
  #Scenario: Verify Done CTA and All messages in Learn More section (QO-31210),(QO-31211),(QO-31163),(QO-31164),(QO-31166)
    #And User searches for client "Automation"
    #And User selects "Client" in clients tab
    #And User update the stage to "Claimed"
    #And User update the stage to "In Contact"
    #And Scroll to "Help your client save" section
    #And User clicks on "Learn More" option
    #And Validate text "Your client doesn’t have to go it alone" is displayed
    #And Validate CTA "DONE"
    #And user clicks on "Back" button
    #And Verify "X" is displayed
    #And User clicks on "X" option
    #And Verify "Offer tile" is not displayed
    #Then User closes the app

  Scenario: Validate body of Email and sms (QO-31177),(QO-31178),(QO-31172)
    And User searches for client "Automation"
    And User selects "Client" in clients tab
     And User clicks on "Review Bundle Offers" option
    And User clicks on "BuySell Share Offer" option
    And Check "Buy and sell" checkbox and verify
    And User clicks on "Send SMS" option
    And Verify content of "SMS" in case of "Buy and sell" 
    And User Navigates Back
    And User Navigates Back
    And user clicks on "Ok" button
    And User clicks on "BuySell Share Offer" option
    And User clicks on "Send Email" option
    And Verify content of "Email"
    And user clicks on "Back" button
    And user clicks on "yes" button
    And User clicks on "BuySell Share Offer" option
    And Check "Owners.com loans" checkbox and verify
    And User clicks on "Send SMS" option
    And Verify content of "SMS"
    And User Navigates Back
    And User Navigates Back
    And user clicks on "Ok" button
    And User clicks on "BuySell Share Offer" option
    And User clicks on "Send Email" option
    And Verify content of "Email" 
    Then User closes the app

  Scenario: Validate Educational Message and Bundle offers in Learn More Section (QO-31167)
    And User searches for client "Automation"
    And User selects "Client" in clients tab
    And User clicks on "Review Bundle Offers" option
    And Validate text "Buy and sell owners.com"
    And Validate text "Make Selling simple too"
    And Scroll to text "Finance with"
    And Validate text "Finance with Owners.com Loans"
    And Validate text "your client doesn't have to go it alone"
    And Validate text "Premium Title innovative tech"
    Then User closes the app

  Scenario: Validate body of Email and Sms for PTS (QO-31179)
    And User searches for client "Automation"
    And User selects "Client" in clients tab
    And User clicks on "Review Bundle Offers" option
    And User clicks on "BuySell Share Offer" option
    And Check "Premium Title Service" checkbox and verify
    And User clicks on "Send SMS" option
    And Verify content of "SMS" in case of "PTS" 
    And User Navigates Back
    And User Navigates Back
    And user clicks on "Ok" button
    And User clicks on "BuySell Share Offer" option
    And Check "Premium Title Service" checkbox and verify
    And User clicks on "Send Email" option
    And Verify content of "Email" in case of "PTS" 
    Then User closes the app
    
    Scenario: OCL,PTS and Buy and Sell offerings present for eligible state (QO-18192),(QO-18194),(QO-18196),(QO-31492),(QO-31494)
    And User clicks on "+Add" button
  	And User clicks on "Buyer" option
    And User fills in below information
      | First Name    |
      | Last Name     |
      | Phone Number  |
      | Email Address |
      | Budget        |
      | Pre-Approved  |
      | Timeframe     |
      
    And User clicks on "Add Client" button
    And User clicks on "Never Viewed" option
    And User update the stage to "Showing Homes"

  Scenario: Validate Email content with different options selected (QO-31180)
    And User searches for client "Automation"
    And User selects "Client" in clients tab
    And User clicks on "Review Bundle Offers" option
    And User clicks on "BuySell Share Offer" option
    And Check "Buy and sell" checkbox and verify
    And User clicks on "Send Email" option
    And Verify content of "Email" in case of "Buy and Sell" 
    And user clicks on "Back" button
    And user clicks on "yes" button
    And User clicks on "BuySell Share Offer" option    
    And Check "Owners.com loans" checkbox and verify
    And User clicks on "Send Email" option
    And Verify content of "Email" in case of "OCL"
    And user clicks on "Back" button
    And user clicks on "yes" button
    And User clicks on "BuySell Share Offer" option
    And Check "Owners.com loans and PTS" checkbox and verify
    And User clicks on "Send Email" option
    And Verify content of "Email" in case of "Owners.com loans and PTS" 
    And user clicks on "Back" button
    And user clicks on "yes" button
    And User clicks on "BuySell Share Offer" option
    And Check "Owners.com loans and buy and sell" checkbox and verify
    And User clicks on "Send Email" option
    And Verify content of "Email" in case of "Owners.com loans and buy and sell"
    And user clicks on "Back" button
    And user clicks on "yes" button
    And User clicks on "BuySell Share Offer" option
    And Check "Buy and Sell and PTS" checkbox and verify
    And User clicks on "Send Email" option
    And Verify content of "Email" in case of "Buy and Sell and PTS" 
    And user clicks on "Back" button
    And user clicks on "yes" button
    And User clicks on "BuySell Share Offer" option
    And Check "Owners.com loans and buy and sell and PTS" checkbox and verify
    And User clicks on "Send Email" option
    And Verify content of "Email" in case of "Owners.com loans and buy and sell and PTS"
    Then User closes the app

  Scenario: Validate SMS content with different options selected (QO-31181)
    And User searches for client "Automation"
    And User selects "Client" in clients tab
    And User clicks on "Review Bundle Offers" option
    And User clicks on "BuySell Share Offer" option
    And Check "Owners.com loans" checkbox and verify
    And User clicks on "Send SMS" option
    And Verify content of "SMS" in case of "OCL" 
    And User Navigates Back
    And User Navigates Back
    And user clicks on "Ok" button
    And User clicks on "BuySell Share Offer" option
    And User clicks on "Send SMS" option
    And Verify content of "SMS" in case of "Buy and Sell" 
   	And User Navigates Back
    And User Navigates Back
    And user clicks on "Ok" button
    And User clicks on "BuySell Share Offer" option
    And Uncheck "Buy and sell" checkbox 
    And Check "Owners.com loans and PTS" checkbox and verify
    And User clicks on "Send SMS" option
    And Verify content of "SMS" in case of "Owners.com loans and PTS" 
 		And User Navigates Back
    And User Navigates Back
    And user clicks on "Ok" button
    And User clicks on "BuySell Share Offer" option
    And Check "Owners.com loans and buy and sell" checkbox and verify
    And User clicks on "Send SMS" option
    And Verify content of "SMS" in case of "Owners.com loans and buy and sell"
 		And User Navigates Back
    And User Navigates Back
    And user clicks on "Ok" button
    And User clicks on "BuySell Share Offer" option
    And Check "Buy and Sell and PTS" checkbox and verify
    And User clicks on "Send SMS" option
    And Verify content of "SMS" in case of "Buy and Sell and PTS"
 		And User Navigates Back
    And User Navigates Back
    And user clicks on "Ok" button
    And User clicks on "BuySell Share Offer" option
    And Check "Owners.com loans and buy and sell and PTS" checkbox and verify
    And User clicks on "Send SMS" option
    And Verify content of "SMS" in case of "Owners.com loans and buy and sell and PTS" 
    Then User closes the app

  Scenario: OCL,PTS and Buy and Sell offerings present for eligible state (QO-18192),(QO-18194),(QO-18196),(QO-31492),(QO-31494)
    And User clicks on "+Add" button
  	And User clicks on "Buyer" option
    And User fills in below information
      | First Name    |
      | Last Name     |
      | Phone Number  |
      | Email Address |
      | Budget        |
      | Pre-Approved  |
      | Timeframe     |
      
    And User clicks on "Add Client" button
    And User clicks on "Never Viewed" option
    And User update the stage to "Showing Homes"
    And Validate Bundle offer "present" for OCL,PTS and Buy and Sell for state "GA" 
    Then User closes the app
#
  #create agent for non-eligible state and login
  #Scenario: OCL,PTS and Buy and Sell offerings not present for non-eligible state (QO-18191),(QO-18193),(QO-18195),(QO-18197),(QO-31494),(QO-18172),(QO-31495),(QO-31493)
    #And User clicks on "+Add" button
   #	And User clicks on "Buyer" option
    #And User fills in below information
      #| First Name    |
      #| Last Name     |
      #| Phone Number  |
      #| Email Address |
      #| Budget        |
      #| Pre-Approved  |
      #| Timeframe     |
    #And User clicks on "Add client" button
    #And User clicks on "Never Viewed" option
    #And User update the stage to "Showing Homes"
    #And Validate Bundle offer "not present" for OCL,PTS and Buy and Sell for state "MI"
    #Then User closes the app
