package Driver.stepDefs;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Driver.PropertyData;
import Driver.desiredCapabilities;
import ObjectRepository.AndroidAutoBundleV1_OR;
import ObjectRepository.AndroidAutoBundle_OR;
import ObjectRepository.AndroidClientPage_OR;
import ObjectRepository.AndroidHomePage_OR;
import ObjectRepository.AndroidLoginPage_OR;
import ObjectRepository.AndroidTemplates_OR;
import ObjectRepository.AndroidTourReport_OR;
import ObjectRepository.AutoBundleTestScenarioes_OR;
import PageObjects.CommonActionsConditions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;



public class AndroidLoginStepDefinations extends desiredCapabilities {

	PropertyData prop = new PropertyData();
	WebDriverWait wait = new WebDriverWait(driver, 60);
	CommonActionsConditions cac = new CommonActionsConditions();
	String ClientName = "Jimmy Me";
	String PropertyAddress = "9626 F St NE COOL ROAD Washington, DC 20002";

	@Given("^Launch the agent app$")
	public void launch_the_agent_app() throws Throwable {

			System.out.println("Platform Name here is" + driver.getCapabilities().getCapability("platformName"));
			Thread.sleep(3000);
	}

	@When("^User clicks on \"([^\"]*)\" option$")
	public void user_clicks_on_Option(String Option) throws Throwable {

		if (Option.equals("Sign in")) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
		    wait.until(ExpectedConditions.elementToBeClickable(AndroidLoginPage_OR.btnSignIn));
			AndroidLoginPage_OR.btnSignIn.click();
			Thread.sleep(5000);
		} else if (Option.equals("Skip")) {
			try {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidLoginPage_OR.SkipLink));
			AndroidLoginPage_OR.SkipLink.click();
			wait.until(ExpectedConditions.visibilityOf(AndroidLoginPage_OR.Allow));
			AndroidLoginPage_OR.Allow.click();
			}
			catch (NoSuchElementException e) {
			System.out.println("Did not click on skip option");
			}
		}

		else if (Option.equals("Buyer")) {
			AndroidClientPage_OR.ADD_BUYER_CLIENT.click();
		} else if (Option.equals("Buy & Sell with Owners.com")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.cardBuyAndSell));
			AndroidAutoBundle_OR.cardBuyAndSell.click();
		} else if (Option.equals("Finance with Owners.com Loans")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.cardBuyAndSell));
			AndroidAutoBundle_OR.cardFinanceWithOwners.click();
		} else if (Option.equals("Send SMS")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.sendSMSOption));
			AndroidAutoBundle_OR.sendSMSOption.click();
			Thread.sleep(2000);
			try {
				AndroidAutoBundle_OR.OK.click();
				}
			catch (NoSuchElementException E) {
				System.out.println("Went inside the Message Field");
				}
		} else if (Option.equals("Send Email")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.sendEmailOption));
			AndroidAutoBundle_OR.sendEmailOption.click();
		} else if (Option.equals("What is their status")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundleV1_OR.whatStatus));
			AndroidAutoBundleV1_OR.whatStatus.click();
			Thread.sleep(2000);
		} else if (Option.equals("Pre-approved")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundleV1_OR.preApproved));
			AndroidAutoBundleV1_OR.preApproved.click();
		} else if (Option.equals("Not pre-approved")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundleV1_OR.notPreApproved));
			AndroidAutoBundleV1_OR.notPreApproved.click();
		} else if (Option.equals("My client has a preferred lender")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundleV1_OR.radioPreferredLender));
			AndroidAutoBundleV1_OR.radioPreferredLender.click();
		} else if (Option.equals("Cash buyer")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundleV1_OR.cashBuyer));
			AndroidAutoBundleV1_OR.cashBuyer.click();
			Thread.sleep(2000);
		} else if (Option.equals("Email_SMS template")) {
			cac.switchToWebView(driver);
			wait.until(ExpectedConditions.elementToBeClickable(AndroidHomePage_OR.EmailAndSMS));
			AndroidHomePage_OR.EmailAndSMS.click();
			cac.switchToNativeApp(driver);
			Thread.sleep(2000);
		} else if (Option.equals("+ADD NEW")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidTemplates_OR.buttonAddNew));
			AndroidTemplates_OR.buttonAddNew.click();
		} else if (Option.equals("Blank Email Document")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidTemplates_OR.blankEmailDocument));
			AndroidTemplates_OR.blankEmailDocument.click();
		} else if (Option.equals("Blank SMS Document")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidTemplates_OR.blankSmsDocument));
			AndroidTemplates_OR.blankSmsDocument.click();
		} else if (Option.equals("Recommend Buyer App SMS Template")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidTemplates_OR.recomBuyerAppSMS));
			AndroidTemplates_OR.recomBuyerAppSMS.click();
		} else if (Option.equals("Show Full Preview")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidTemplates_OR.ShowFullPreview));
			AndroidTemplates_OR.ShowFullPreview.click();
		} else if (Option.equals("Hide Full Preview")) {
			AndroidTemplates_OR.HideFullPreview.click();
		} else if (Option.equals("BuySell Share Offer")) {
			wait.until(ExpectedConditions.elementToBeClickable(AutoBundleTestScenarioes_OR.optionShareOfferBuySell));
			AutoBundleTestScenarioes_OR.optionShareOfferBuySell.click();
		}
		else if (Option.equals("Learn More")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.LearnMore));
			AndroidAutoBundle_OR.LearnMore.click();
		}
		else if (Option.equals("Never Viewed")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.NeverViewed));
			AndroidAutoBundle_OR.NeverViewed.click();
		}
		else if (Option.equals("Review Bundle Offers")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.ReviewBundleOffers));
			AndroidAutoBundle_OR.ReviewBundleOffers.click();
		}
		}

	@And("^User selects the \"([^\"]*)\" agent and logins$")

	public void User_selects_the_agent_and_logins(String AgentUserName) throws Throwable {
			wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//android.widget.TextView[@text='" + AgentUserName + "']")));
			WebElement loginUserLink = driver
				.findElement(By.xpath("//android.widget.TextView[@text='" + AgentUserName + "']"));
			loginUserLink.click();
			//wait.until(ExpectedConditions.visibilityOf(AndroidLoginPage_OR.Allow));
			//AndroidLoginPage_OR.Allow.click();
		}

	@And("^Verify \"([^\"]*)\" is displayed$")

	public void Verify_option_is_displayed(String option) throws Throwable {
		if (option.equals("Home page")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.HomeButton)).isDisplayed();
			Assert.assertTrue(AndroidHomePage_OR.HomeButton.isDisplayed(), option + "  is not displayed");
			Thread.sleep(3000);
		} else if (option.equals("I am busy")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.BusyText));
			Assert.assertTrue(AndroidHomePage_OR.BusyText.isDisplayed(), option + " text is not displayed");

		} else if (option.endsWith("Hamburger Menu")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.MenuButton));
			Assert.assertTrue(AndroidHomePage_OR.MenuButton.isDisplayed(), option + "  is not displayed");

		} else if (option.equals("Steps For Success")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.cardHeader));
			Assert.assertTrue(AndroidAutoBundle_OR.cardHeader.isDisplayed(), option + "  is not displayed");
		} else if (option.equals("Calculate client's savings")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.buttonCalculateSavings));
			Assert.assertTrue(AndroidAutoBundle_OR.buttonCalculateSavings.isDisplayed(), option + "  is not displayed");
		} else if (option.equals("Calculate Savings page")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.pageCalculateSavings));
			Assert.assertTrue(AndroidAutoBundle_OR.pageCalculateSavings.isDisplayed(), option + " is not displayed");
		} else if (option.equals("Bundle Offers")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.cardBuyAndSell));
			Assert.assertTrue(AndroidAutoBundle_OR.cardBuyAndSell.isDisplayed(),
					AndroidAutoBundle_OR.cardBuyAndSell + " is not displayed");
			Assert.assertTrue(AndroidAutoBundle_OR.cardFinanceWithOwners.isDisplayed(),
					AndroidAutoBundle_OR.cardFinanceWithOwners + " is not displayed");
			Assert.assertEquals(AndroidAutoBundle_OR.buySellCardDeatils.getText(), prop.buySellCardData,
					"Buy & Sell card data is not matched..!");
			Assert.assertEquals(AndroidAutoBundle_OR.ownersLoanCardDetails.getText(), prop.financeWithOwnersData,
					"Owners Loans data is not matched..!");
		} else if (option.equals("SemiCircle Graph")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.clientSavesUpto));
			Assert.assertTrue(AndroidAutoBundle_OR.clientSavesUpto.isDisplayed(), option + " is not displayed");
			Assert.assertTrue(AndroidAutoBundle_OR.saveAmountInCSP.isDisplayed(), option + " is not displayed");
		} else if (option.equals("AutoBundle Savings CTAs")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.buttonConfirmSelectedOffer));
			Assert.assertTrue(AndroidAutoBundle_OR.buttonConfirmSelectedOffer.isDisplayed(),
					option + " is not displayed");
			Assert.assertTrue(AndroidAutoBundle_OR.buttonShareThisBundle.isDisplayed(), option + " is not displayed");
		} else if (option.equals("Bundle Savings amount")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.clientPageSaveAmount));
			Assert.assertEquals(AndroidAutoBundle_OR.clientPageSaveAmount.getText(), "1,000",
					"Amount is not matching..!");
		} else if (option.equals("Share offer with client")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.dialogueShareOffer));
			AndroidAutoBundle_OR.dialogueShareOffer.click();
		} else if (option.equals("App Email Editor")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidAutoBundle_OR.inAppEmailEditor));
			Assert.assertTrue(AndroidAutoBundle_OR.inAppEmailEditor.isDisplayed(), option + " is not displayed..!");
		} else if (option.equals("Pre-approved")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidAutoBundleV1_OR.preApproved));
			Assert.assertTrue(AndroidAutoBundleV1_OR.preApproved.isDisplayed(), option + " is not displayed..!");
		} else if (option.equals("Not pre-approved")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidAutoBundleV1_OR.preApproved));
			Assert.assertTrue(AndroidAutoBundleV1_OR.notPreApproved.isDisplayed(), option + " is not displayed..!");
		} else if (option.equals("Cash buyer")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidAutoBundleV1_OR.preApproved));
			Assert.assertTrue(AndroidAutoBundleV1_OR.cashBuyer.isDisplayed(), option + " is not displayed..!");
		} else if (option.equals("You chose to refer this client")) {
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOf(AndroidAutoBundleV1_OR.choseToReferClient));
			Assert.assertTrue(AndroidAutoBundleV1_OR.choseToReferClient.isDisplayed(), option + " is not displayed..!");
		} else if (option.equals("You chose not to refer this client")) {
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOf(AndroidAutoBundleV1_OR.choseNotToReferClient));
			Assert.assertTrue(AndroidAutoBundleV1_OR.choseNotToReferClient.isDisplayed(),
					option + " is not displayed..!");
		} else if (option.equals("Blank Email Document")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidTemplates_OR.blankEmailDocument));
			Assert.assertTrue(AndroidTemplates_OR.blankEmailDocument.isDisplayed(), option + " is not displayed..!");
		} else if (option.equals("Edit Template")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidTemplates_OR.templateTitle));
			Assert.assertTrue(AndroidTemplates_OR.templateTitle.isDisplayed(), option + " is not displayed..!");
			Thread.sleep(2000);
		} else if (option.equals("Blank SMS Document")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidTemplates_OR.blankSmsDocument));
			Assert.assertTrue(AndroidTemplates_OR.blankSmsDocument.isDisplayed(), option + " is not displayed..!");
		} else if (option.equals("Recommend Buyer App Email Template")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidTemplates_OR.recomBuyerAppEmail));
			Assert.assertTrue(AndroidTemplates_OR.recomBuyerAppEmail.isDisplayed(), option + " is not displayed..!");
		} else if (option.equals("Edit Recommend SMS Template")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidTemplates_OR.saveTemplateOption));
			Assert.assertTrue(AndroidTemplates_OR.saveTemplateOption.isDisplayed(), option + " is not displayed..!");
		} else if (option.equals("No Matching Templates Found")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidTemplates_OR.noMatchingTemplate));
			Assert.assertTrue(AndroidTemplates_OR.noMatchingTemplate.isDisplayed(), option + " is not displayed..!");
		} else if (option.equals("Pre_made Email Template Name")) {
			try {
				wait.until(ExpectedConditions.visibilityOf(AndroidTemplates_OR.preMadeEmailTemplateHeader));
			} catch (Exception e) {
				wait.until(ExpectedConditions.visibilityOf(AndroidTemplates_OR.emailTemplateHeader));
			}
			wait.until(ExpectedConditions.visibilityOf(AndroidTemplates_OR.cardClosingFollowUp));
			Assert.assertTrue(AndroidTemplates_OR.cardClosingFollowUp.isDisplayed(), option + " is not displayed..!");
		} else if (option.equals("Pre_made SMS Template Name")) {
			try {
				wait.until(ExpectedConditions.visibilityOf(AndroidTemplates_OR.preMadeSMSTemplateHeader));
			} catch (Exception e) {
				wait.until(ExpectedConditions.visibilityOf(AndroidTemplates_OR.smsTemplateHeader));
			}
			wait.until(ExpectedConditions.visibilityOf(AndroidTemplates_OR.cardClosingFollowUp));
			Assert.assertTrue(AndroidTemplates_OR.cardClosingFollowUp.isDisplayed(), option + " is not displayed..!");
		} else if (option.equals("YES")) {
			try {
				Thread.sleep(2000);
				Assert.assertTrue(AndroidTourReport_OR.StartReportYesButton.isDisplayed(), option + "is not displayed");

			} catch (NoSuchElementException e) {
				System.out.println("YES is not displayed");
			}

		} else if (option.equals("Pending Tours And Meetings")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.PendingToursAndMeetings));
			Assert.assertTrue(AndroidHomePage_OR.PendingToursAndMeetings.isDisplayed(),
					option + " is not displayed..!");
		} else if (option.equals("Client Name")) {
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//android.view.View[@text='" + ClientName + "']")));
			Assert.assertTrue(
					driver.findElement(By.xpath("//android.view.View[@text='" + ClientName + "']")).isDisplayed(),
					option + "is not displayed");
		} else if (option.equals("Property Address")) {
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//android.view.View[@text='" + PropertyAddress + "']")));
			Assert.assertTrue(
					driver.findElement(By.xpath("//android.view.View[@text='" + PropertyAddress + "']")).isDisplayed(),
					option + "is not displayed");
		} else if (option.equals("Property Image")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.PropertyImage));
			Assert.assertTrue(AndroidHomePage_OR.PropertyImage.isDisplayed(), option + " is not displayed..!");
		} else if (option.equals("Accept")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.Accept));
			Assert.assertTrue(AndroidHomePage_OR.Accept.isDisplayed(), option + " is not displayed..!");
		} else if (option.equals("Reschedule")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.Reschedule));
			Assert.assertTrue(AndroidHomePage_OR.Reschedule.isDisplayed(), option + " is not displayed..!");
		} else if (option.equals("Upcoming Tours")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.UpcomingTours));
			Assert.assertTrue(AndroidHomePage_OR.UpcomingTours.isDisplayed(), option + " is not displayed..!");
		} else if (option.equals("Start Tour Report")) {
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.StartTourReport));
			Assert.assertTrue(AndroidHomePage_OR.StartTourReport.isDisplayed(), option + " is not displayed..!");
		} else if (option.equals("Picture Actions")) {
			Assert.assertTrue(AndroidTourReport_OR.ImageCount.isDisplayed(), "image count not displayed");
			Assert.assertTrue(AndroidTourReport_OR.CommentCount.isDisplayed(), "comment count not displayed");
			Assert.assertTrue(AndroidTourReport_OR.ImageLike.isDisplayed(), "image like not displayed");
			Assert.assertTrue(AndroidTourReport_OR.ImageDislike.isDisplayed(), "image dislike not displayed");

		} else if (option.equals("Add New title")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidTemplates_OR.AddNewTitle));
			String AddNewText = AndroidTemplates_OR.AddNewTitle.getText();
			Assert.assertTrue(AddNewText.equals("Add New"), "Add New Title text does not matches");
			Assert.assertTrue(AndroidTemplates_OR.AddNewTitle.isDisplayed(), "Add New Title not displaye");
		} else if (option.equals("Search Bar")) {
			Assert.assertTrue(AndroidTemplates_OR.templatesPageSearch.isDisplayed(), "Search Bar not displayed");
		} else if (option.equals("Owners.com label")) {

		} else if (option.equals("Client Creation Page")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidClientPage_OR.editTextFirstName));
			Assert.assertEquals(prop.buyerFirstName, AndroidClientPage_OR.editTextFirstName.getText(),
					"First Name does not match..!");
			wait.until(ExpectedConditions.visibilityOf(AndroidClientPage_OR.editTextLastName));
			wait.until(ExpectedConditions.visibilityOf(AndroidClientPage_OR.editTextEmail));
			wait.until(ExpectedConditions.visibilityOf(AndroidClientPage_OR.editTextPhone));
			Assert.assertEquals(prop.buyerPhoneNumber, AndroidClientPage_OR.editTextPhone.getText(),
					"Phone no does not match..!");
			wait.until(ExpectedConditions.visibilityOf(AutoBundleTestScenarioes_OR.editTextPropertyAddress));
			cac.switchToWebView(driver);
			wait.until(ExpectedConditions.visibilityOf(AndroidAutoBundle_OR.addClient));
			cac.switchToNativeApp(driver);
			Assert.assertTrue(AndroidClientPage_OR.editTextFirstName.isDisplayed(), option + "  is not displayed");

		} else if (option.equals("Email Editor")) {
			Thread.sleep(2000);
			cac.switchToWebView(driver);
			wait.until(ExpectedConditions.visibilityOf(AutoBundleTestScenarioes_OR.emailSubjectField));
			wait.until(ExpectedConditions.visibilityOf(AutoBundleTestScenarioes_OR.buttonEmailSend));
			Assert.assertTrue(AutoBundleTestScenarioes_OR.buttonEmailSend.isDisplayed(), option + "  is not displayed");
			cac.switchToWebView(driver);
		}
		  else if (option.equals("Three Dots")) {
				
		}
		  else if (option.equals("More Options")) {
		
		}
		  else if (option.equals("Second Tour Request")) {
			
		}
		  else if (option.equals("Accept All")) {
			
		}
		  else if (option.equals("Label")) {
			
		}
		  else if (option.equals("Deletes")) {
			
		}
		  else if (option.equals("Buyer communicated they can no longer make the meeting")) {
			
		}
		  else if (option.equals("Pending Tours And Meetings")) {
			
		}
		  else if (option.equals("This time no longer works for my schedule")) {
	
		}
		  else if (option.equals("Buyer was a no show")) {
	
		}
		  else if (option.equals("The property is no longer available")) {
	
		}
		  else if (option.equals("he listing agent had to change our scheduled appointment")) {
	
		}
		  else if (option.equals("Other")) {
	
		}
		  else if (option.equals("Check out these similar properties.")) {
				
		}
		  else if (option.equals("Change Location")) {
			  wait.until(ExpectedConditions.visibilityOf(AndroidTourReport_OR.ChangeLocation));
				Assert.assertTrue(AndroidTourReport_OR.ChangeLocation.isDisplayed(), option + " is not displayed");
		}
		  else if (option.equals("Change Date / Time")) {
				wait.until(ExpectedConditions.visibilityOf(AndroidTourReport_OR.ChangeDateTime));
				Assert.assertTrue(AndroidTourReport_OR.ChangeDateTime.isDisplayed(), option + " is not displayed");
		}
		  else if (option.equals("Stage Change Slide")) {
				
		}
		  else if (option.equals("Call Buyer")) {
				
		}
		
		

		}

	@When("^Verify \"([^\"]*)\" component$")
	public void verify_component(String component) throws Throwable {
		if (component.equals("Buy & Sell Offer card")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.getStartedButtonInCDP));
			String amount = AndroidAutoBundle_OR.buySellSaveAmountInCDP.getText();
			Assert.assertEquals(amount, "$1,000", "Buy & Sell amount does not match..!");
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.notInterestedButtonInCDP));
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.shareButtonInCDP));
		}
		if (component.equals("Finance with Owners.com Loans")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.referClientButtonInCDP));
			String amount = AndroidAutoBundle_OR.financeSaveAmountInCDP.getText();
			Assert.assertEquals(amount, "$750", "Buy & Sell amount does not match..!");
		}

		}

	@SuppressWarnings("static-access")
	@And("^Scroll to \"([^\"]*)\" section$")
	public void scroll_to_section(String Section) throws Throwable {
		if (Section.equals("Tasks")) {
			cac.scrollToText("Tasks", driver);
		}
		if (Section.equals("Is your client pre-approved?")) {
			Thread.sleep(4000);
			cac.topBottomScroll(driver, 0.70, 0.20);
		}
		if (Section.equals("Upcoming Tours")) {
			Thread.sleep(2000);
			cac.scrollToText("Start Tour Report", driver);
		} else if (Section.equals("Start Tour Report")) {
			cac.scrollToText("Start Tour Report", driver);
		} else if (Section.equals("Bundle Offers")) {
			for (int i = 0; i < 2; i++) {
				Thread.sleep(2000);
				cac.topBottomScroll(driver, 0.40, 0.20);
				Thread.sleep(2000);
				}		
		} 
		else if (Section.equals("Buy and sell with Owners.com")) {
			Thread.sleep(5000);		
			cac.topBottomScroll(driver, 0.60, 0.10);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//				Thread.sleep(3000);
//				new TouchAction(driver).press(PointOption.point(460, 629))
//				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(100))).moveTo(PointOption.point(460, 1058))
//				.release().perform();
//				System.out.println("Page Scrolled...");
				
				}
		else if (Section.equals("Finance with")) {
				Thread.sleep(3000);
				cac.topBottomScroll(driver, 0.80, 0.20);
				}
		}

	@Then("^User closes the app$")
	public void user_closes_the_app() throws Throwable {

		driver.closeApp();
		
			}
		}
