package Driver.stepDefs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Driver.desiredCapabilities;
import ObjectRepository.AndroidAutoBundleV1_OR;
import ObjectRepository.AndroidAutoBundle_OR;
import ObjectRepository.AndroidClientDetailsPage_OR;
import ObjectRepository.AndroidClientPage_OR;
import ObjectRepository.AndroidHomePage_OR;
import ObjectRepository.AndroidTemplates_OR;
import ObjectRepository.AndroidTourReport_OR;
import ObjectRepository.AutoBundleTestScenarioes_OR;
import PageObjects.CommonActionsConditions;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AndroidHomePageStepDefinations extends desiredCapabilities {

	WebDriverWait wait = new WebDriverWait(driver, 40);
	CommonActionsConditions cf = new CommonActionsConditions();

	@When("^Validate text \"([^\"]*)\" is displayed$")
	public void validate_text_is_displayed(String Text) throws Throwable {

		if (Text.equals("I am available")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.AvailableText));
			Assert.assertTrue(AndroidHomePage_OR.AvailableText.isDisplayed(), Text + " is not available");
		} else if (Text.equals("Set Return Date/Time")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.SetReturnDate));
			Assert.assertTrue(AndroidHomePage_OR.SetReturnDate.isDisplayed(), Text + " is not available");
		} else if (Text.equals("I am available again on")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.AvailableAgain));
			Assert.assertTrue(AndroidHomePage_OR.AvailableAgain.isDisplayed(), Text + " is not available");

		} else if (Text.equals("Close mark")) {
			// wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.CloseMark));
			Assert.assertTrue(AndroidHomePage_OR.CloseMark.isDisplayed(), Text + " is not available");

		} else if (Text.equals("Footer text")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.AvailabilityFooter));
			Assert.assertTrue(
					AndroidHomePage_OR.AvailabilityFooter.getText()
							.equals("You will automatically become Available at the above date and time."),
					Text + " is not available");
		} else if (Text.equals("Owners.com")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.OwnersHomeHeader));
			System.out.println("text here" + AndroidHomePage_OR.OwnersHomeHeader.getText());
			Assert.assertTrue(AndroidHomePage_OR.OwnersHomeHeader.isDisplayed(), Text + " is not available");

		} else if (Text.equals("Pending tours and meetings")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.PendingToursAndMeetings));
			Assert.assertTrue(AndroidHomePage_OR.PendingToursAndMeetings.getText().equals("PENDING TOURS AND MEETINGS"),
					Text + " is not available");

		} else if (Text.equals("Upcoming tours")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.UpcomingTours));
			Assert.assertTrue(AndroidHomePage_OR.UpcomingTours.getText().equals("UPCOMING TOURS: NEXT 48 HOURS"),
					Text + " is not available");
		} else if (Text.equals("Follow-up")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.FollowUps));
			Assert.assertTrue(AndroidHomePage_OR.FollowUps.getText().equals("FOLLOW UPS"), Text + " is not available");
		} else if (Text.equals("New Clients")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.NewClients));
			Assert.assertTrue(AndroidHomePage_OR.NewClients.getText().equals("NEW CLIENTS"),
					Text + " is not available");
		} else {
			System.out.println("No text is availbale to be displayed");
		}

	}

	@SuppressWarnings("static-access")
	@When("^User clicks on \"([^\"]*)\" button$")
	public void user_clicks_on_button(String Button) throws Throwable {

		if (Button.equals("toggle")) {
			System.out.println("page sourece here is" + driver.getPageSource());
			wait.until(ExpectedConditions.elementToBeClickable(AndroidHomePage_OR.ToggleButton));
			AndroidHomePage_OR.ToggleButton.click();
		} else if (Button.equals("toggle to off")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidHomePage_OR.ToggleOFF));
			AndroidHomePage_OR.ToggleOFF.click();
		} else if (Button.equals("Save")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidHomePage_OR.SaveButton));
			AndroidHomePage_OR.SaveButton.click();

		} else if (Button.equals("Hamburger Menu")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidHomePage_OR.MenuButton));
			AndroidHomePage_OR.MenuButton.click();
		} else if (Button.equals("+Add")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientPage_OR.btnAdd));
			AndroidClientPage_OR.btnAdd.click();
		} else if (Button.equals("Next")) {
			cf.switchToWebView(driver);
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.nextButton));
			AndroidAutoBundle_OR.nextButton.click();
			cf.switchToNativeApp(driver);
		} 
		else if (Button.equals("Add Client")) {
			
			System.out.println("Click Add Client");
			Thread.sleep(2000);
			cf.switchToWebView(driver);
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.addClient));
			AndroidAutoBundle_OR.addClient.click();
			cf.switchToNativeApp(driver);
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.NeverViewed));			
		} else if (Button.equals("Sign Out")) {
			cf.signOutAsAgent();
		} else if (Button.equals("Calculate client's savings")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.buttonCalculateSavings));
			AndroidAutoBundle_OR.buttonCalculateSavings.click();
		} else if (Button.equals("Share This Bundle with Your Client")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.buttonShareThisBundle));
			AndroidAutoBundle_OR.buttonShareThisBundle.click();
		} else if (Button.equals("Confirm Selected Offers")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.buttonConfirmSelectedOffer));
			AndroidAutoBundle_OR.buttonConfirmSelectedOffer.click();
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.cardHeader));
		} else if (Button.equals("Calculate Again")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.buttonCalculateAgain));
			AndroidAutoBundle_OR.buttonCalculateAgain.click();
		} else if (Button.equals("Refer")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundleV1_OR.buttonRefer));
			AndroidAutoBundleV1_OR.buttonRefer.click();
		} else if (Button.equals("Do not refer")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundleV1_OR.buttonDoNotRefer));
			AndroidAutoBundleV1_OR.buttonDoNotRefer.click();
		} else if (Button.equals("Referral Page Next")) {
			cf.switchToWebView(driver);
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundleV1_OR.referralFormNext));
			AndroidAutoBundleV1_OR.referralFormNext.click();
			cf.switchToNativeApp(driver);
		} else if (Button.equals("Referral Page Send")) {
			cf.switchToWebView(driver);
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundleV1_OR.referralFormSend));
			AndroidAutoBundleV1_OR.referralFormSend.click();
			cf.switchToNativeApp(driver);
		} else if (Button.equals("Submit")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundleV1_OR.buttonSubmit));
			AndroidAutoBundleV1_OR.buttonSubmit.click();
		} else if (Button.equals("OK")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundleV1_OR.referralSentOkButton));
			AndroidAutoBundleV1_OR.referralSentOkButton.click();
		} else if (Button.equals("Edit template")) {
			cf.switchToWebView(driver);
			wait.until(ExpectedConditions.elementToBeClickable(AndroidTemplates_OR.editTemplateButton));
			AndroidTemplates_OR.editTemplateButton.click();
			cf.switchToNativeApp(driver);
		} else if (Button.equals("Start Tour Report")) {
			Thread.sleep(4000);
			wait.until(ExpectedConditions.elementToBeClickable(AndroidHomePage_OR.StartTourReport));
			AndroidHomePage_OR.StartTourReport.click();

		} else if (Button.equals("YES")) {
			try {
				Thread.sleep(3000);
				AndroidTourReport_OR.StartReportYesButton.click();
			} catch (NoSuchElementException e) {
				System.out.println("No YES Button");
			}
		} else if (Button.equals("Accept")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidHomePage_OR.Accept));
			AndroidHomePage_OR.Accept.click();
		} else if (Button.equals("Done")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidTourReport_OR.Done));
			AndroidTourReport_OR.Done.click();
		} else if (Button.equals("Take or upload photos")) {
			AndroidClientDetailsPage_OR.TAKEORUPLOADPHOTOS.click();
		} else if (Button.equals("Continue")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidTourReport_OR.ContinueButton));
			AndroidTourReport_OR.ContinueButton.click();
		} else if (Button.equals("Back to your tasks")) {
			AndroidClientDetailsPage_OR.BackToYourTasks.click();
		} else if (Button.equals("Add comment")) {
			AndroidClientDetailsPage_OR.ADDCOMMENT.click();
		} else if (Button.equals("BuySell Get Started")) {
			wait.until(ExpectedConditions.elementToBeClickable(AutoBundleTestScenarioes_OR.buttonGetStarted));
			AutoBundleTestScenarioes_OR.buttonGetStarted.click();
		}
		else if (Button.equals("Three Dots")) {
			
		}
		else if (Button.equals("Cancel")) {
			
		}
		else if (Button.equals("Copy MLS ID")) {
		
		}
		else if (Button.equals("Delete Task")) {
			
		}
		else if (Button.equals("Reschedule")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.Reschedule));
			AndroidHomePage_OR.Reschedule.click();

		}
		else if (Button.equals("Cancel/Back")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidTourReport_OR.CalendarCancel));
			AndroidTourReport_OR.CalendarCancel.click();
		}
		else if (Button.equals("Call")) {
			
		}
		else if (Button.equals("No")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidTourReport_OR.No));
			AndroidTourReport_OR.No.click();
		}
	}

	@SuppressWarnings("static-access")
	@Then("^Validate username \"([^\"]*)\" and email id \"([^\"]*)\"$")
	public void Validate_username_and_emailid(String UserName, String EmailId) throws Throwable {
		Thread.sleep(3000);
		cf.switchToWebView(driver);
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='" + UserName + "']")).isDisplayed(),
				UserName + "is not displayed");
		Assert.assertTrue(driver.findElement(By.xpath("//h3[text()='" + EmailId + "']")).isDisplayed(),
				EmailId + "is not displayed");

	}

	@SuppressWarnings("static-access")
	@And("^Validate presence of different hamburger menu options$")
	public void Validate_presence_of_different_hamburger_menu_options(DataTable Suggestions) throws Throwable {
		List<List<String>> data = Suggestions.raw();
		cf.switchToWebView(driver);
		wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.SuggestProperty));
		Assert.assertTrue(AndroidHomePage_OR.SuggestProperty.isDisplayed(), data.get(0).get(0) + " is not available");
		Assert.assertTrue(AndroidHomePage_OR.SavedSearch.isDisplayed(), data.get(1).get(0) + " is not available");
		Assert.assertTrue(AndroidHomePage_OR.TitleClosing.isDisplayed(), data.get(2).get(0) + " is not available");
		Assert.assertTrue(AndroidHomePage_OR.TheLearningCafe.isDisplayed(), data.get(3).get(0) + " is not available");
		Assert.assertTrue(AndroidHomePage_OR.EmailAndSMS.isDisplayed(), data.get(4).get(0) + " is not available");
		Assert.assertTrue(AndroidHomePage_OR.MyStats.isDisplayed(), data.get(5).get(0) + " is not available");
		Assert.assertTrue(AndroidHomePage_OR.FeedBack.isDisplayed(), data.get(6).get(0) + " is not available");
		Assert.assertTrue(AndroidHomePage_OR.Settings.isDisplayed(), data.get(7).get(0) + " is not available");
		Assert.assertTrue(AndroidHomePage_OR.EmailSignature.isDisplayed(), data.get(8).get(0) + " is not available");
		Assert.assertTrue(AndroidHomePage_OR.About.isDisplayed(), data.get(9).get(0) + " is not available");
		Assert.assertTrue(AndroidHomePage_OR.SignOut.isDisplayed(), data.get(10).get(0) + " is not available");
		wait.until(ExpectedConditions.elementToBeClickable(AndroidHomePage_OR.SignOut));
		AndroidHomePage_OR.SignOut.click();
		cf.switchToNativeApp(driver);

	}

//	@And("^Scroll to text \"([^\"]*)\"$")
//	public void Scroll_To_text_only(String text) throws Throwable {
//		cf.scrollToText(text, driver);
//	}

	@Then("^User logout's from the agent app and closes it$")
	public void user_logout_s_from_the_agent_app_and_closes_it() throws Throwable {

		cf.signOutAsAgent();
		driver.closeApp();
	}

	@And("Navigate to \"([^\"]*)\" Tab and Validate it")
	public void Navigate_to_tab_and_validate_it(String Tab) throws Throwable {
		if (Tab.equals("Clients")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidHomePage_OR.ClientsButton));
			AndroidHomePage_OR.ClientsButton.click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.AddButton));
		} else if (Tab.equals("Tasks")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidHomePage_OR.TasksButton));
			AndroidHomePage_OR.TasksButton.click();
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.TodayButton));
		} else if (Tab.equals("Requests")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidHomePage_OR.RequestTab));
			AndroidHomePage_OR.RequestTab.click();
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.ArchivedButton));

		} else if (Tab.equals("Home")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidHomePage_OR.HomeButton));
			AndroidHomePage_OR.HomeButton.click();
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.OwnersHomeHeader));

		}
	}

	@SuppressWarnings("rawtypes")
	@And("^Scroll to text \"([^\"]*)\"$")
	public void Scroll_To_text(String text) throws Throwable {
		if (text.equals("SMS Templates")) {
			for (int i = 0; i < 4; i++) {
				Thread.sleep(2000);
				cf.topBottomScroll(driver, 0.80, 0.20);
				Thread.sleep(1000);
			}
		} else if(text.equals("Finance with")) {
			cf.topBottomScroll(driver, 0.80, 0.20);
		}
		else 
			cf.scrollToText(text, driver);
	}

	@When("^User searches for client \"([^\"]*)\"$")
	public void user_searches_for_client(String clientName) throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.clientTabSearch));
		AndroidAutoBundle_OR.clientTabSearch.click();
		AndroidAutoBundle_OR.clientTabSearch.sendKeys(clientName);
	}

	@When("^User selects \"([^\"]*)\" in clients tab$")
	public void user_selects_in_clients_tab(String name) throws Throwable {
		if (name.equals("Client")) {
			AndroidAutoBundle_OR.searchResultBuyerCard.click();
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.stageChangeDropdown));
		}
	}

	@When("^User update the stage to \"([^\"]*)\"$")
	public void user_update_the_stage_to(String arg1) throws Throwable {
		AndroidAutoBundle_OR.stageChangeDropdown.click();
		wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.stageInContact));
		AndroidAutoBundle_OR.stageInContact.click();
		cf.switchToWebView(driver);
		AndroidAutoBundle_OR.buttonUpdateStage.click();
		cf.switchToNativeApp(driver);
		wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.stageChangeDropdown));

	}

}
