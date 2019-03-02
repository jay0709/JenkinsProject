
/**
 * @author Jayabrata
 *
 */

package Driver.stepDefs;

import java.util.NoSuchElementException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Driver.PropertyData;
import Driver.desiredCapabilities;
import ObjectRepository.AndroidAutoBundleV1_OR;
import ObjectRepository.AndroidAutoBundle_OR;
import ObjectRepository.AndroidAutoBundle_OR;
import ObjectRepository.AndroidTemplates_OR;
import ObjectRepository.AndroidAutoBundle_OR;
import PageObjects.CommonActionsConditions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class AndroidAutoBundleStepDefinitions extends desiredCapabilities {

	WebDriverWait wait = new WebDriverWait(driver, 30);
	PropertyData pd = new PropertyData();
	CommonActionsConditions ca = new CommonActionsConditions();
	AndroidTourWithSelfGenClientStepDefinitions sg = new AndroidTourWithSelfGenClientStepDefinitions();
	String randomName = ca.randomAlphaNumeric(10);

	@When("^User enters \"([^\"]*)\"$")
	public void enters(String field) throws Throwable {

		if (field.equals("FirstName")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.firstNameEdit));
			AndroidAutoBundle_OR.firstNameEdit.sendKeys(pd.buyerFirstName);
		} else if (field.equals("LastName")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.lastNameEdit));
			AndroidAutoBundle_OR.lastNameEdit.sendKeys(pd.buyerLastName);
		} else if (field.equals("PhoneNumber")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.phoneNoEdit));
			AndroidAutoBundle_OR.phoneNoEdit.sendKeys(pd.buyerPhoneNumber);
		} else if (field.equals("EmailAddress")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.emailAddressEdit));
			AndroidAutoBundle_OR.emailAddressEdit.sendKeys(pd.buyerEmailAddress);
		} else if (field.equals("Comments")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundleV1_OR.commentTextBox));
			AndroidAutoBundleV1_OR.commentTextBox.click();
			AndroidAutoBundleV1_OR.commentTextBox.sendKeys("Agent app Automation");
		} else if (field.equals("Recommend Buyer App")) {
			ca.locateAddNewPageSearch(driver);
			AndroidTemplates_OR.addNewPageSearch.sendKeys("Recommend Buyer App");
			ca.goBack();
		} else if (field.equals("Random template name")) {
			try {
				AndroidTemplates_OR.templatesPageSearch.sendKeys(randomName);
				ca.goBack();
			} catch (Exception e) {
				AndroidTemplates_OR.addNewPageSearch.sendKeys(randomName);
				ca.goBack();
			}
		} else if (field.equals("Pre_made Email Template Name")) {
			try {
				AndroidTemplates_OR.templatesPageSearch.sendKeys(pd.preMadeEMailTemplate);
				ca.goBack();
			} catch (Exception e) {
				AndroidTemplates_OR.addNewPageSearch.sendKeys(pd.preMadeEMailTemplate);
				ca.goBack();
			}
		} else if (field.equals("Pre_made SMS Template Name")) {
			try {
				AndroidTemplates_OR.templatesPageSearch.sendKeys(pd.preMadeSMSTemplate);
				driver.hideKeyboard();
			} catch (Exception e) {
				AndroidTemplates_OR.addNewPageSearch.sendKeys(pd.preMadeSMSTemplate);
				ca.goBack();
			}
		} else if (field.equals("New Email Template Name")) {
			try {
				wait.until(ExpectedConditions.visibilityOf(AndroidTemplates_OR.templateTitle));
				AndroidTemplates_OR.templateTitle.click();
				for (int i = 0; i < 3; i++)
					AndroidTemplates_OR.templateTitle.clear();
				AndroidTemplates_OR.templateTitle.sendKeys(pd.newTemplateName);
				ca.goBack();
			} catch (Exception e) {
				AndroidTemplates_OR.templatesPageSearch.sendKeys(pd.newTemplateName);
				ca.goBack();
			}
		}

	}

	@When("^User selects \"([^\"]*)\" from dropdown list$")
	public void user_selects_from_dropdown_list(String listElement) throws Throwable {

		if (listElement.equals("Budget")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.priceRange));
			AndroidAutoBundle_OR.priceRange.click();
			ca.switchToWebView(driver);
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.sevenFiftyK));
			AndroidAutoBundle_OR.sevenFiftyK.click();
			ca.switchToNativeApp(driver);
		} else if (listElement.equals("PreApproved")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.preApprovalList));
			AndroidAutoBundle_OR.preApprovalList.click();
			ca.switchToWebView(driver);
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.preApproved));
			AndroidAutoBundle_OR.preApproved.click();
			ca.switchToNativeApp(driver);
		} else if (listElement.equals("Timeframe")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.timeFrameList));
			AndroidAutoBundle_OR.timeFrameList.click();
			ca.switchToWebView(driver);
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.threeMonths));
			AndroidAutoBundle_OR.threeMonths.click();
			ca.switchToNativeApp(driver);
		} else if (listElement.equals("Best Time to Contact")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundleV1_OR.bestTimeToContact));
			AndroidAutoBundleV1_OR.bestTimeToContact.click();
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundleV1_OR.bestTimeMorning));
			AndroidAutoBundleV1_OR.bestTimeMorning.click();
		} else if (listElement.equals("Client Expecting a Call?")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundleV1_OR.chooseAnswer));
			AndroidAutoBundleV1_OR.chooseAnswer.click();
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundleV1_OR.selectAnswerYes));
			AndroidAutoBundleV1_OR.selectAnswerYes.click();
		} else if (listElement.equals("First Time Buyer")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundleV1_OR.chooseAnswer));
			AndroidAutoBundleV1_OR.chooseAnswer.click();
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundleV1_OR.firstTimeBuyer));
			AndroidAutoBundleV1_OR.firstTimeBuyer.click();
		} else if (listElement.equals("Selling a Home with Purchase")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundleV1_OR.chooseAnswer));
			AndroidAutoBundleV1_OR.chooseAnswer.click();
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundleV1_OR.sellingHomesWithPurchase));
			AndroidAutoBundleV1_OR.sellingHomesWithPurchase.click();
		} else if (listElement.equals("State")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundleV1_OR.dropdownState));
			AndroidAutoBundleV1_OR.dropdownState.click();
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundleV1_OR.selectStateAK));
			AndroidAutoBundleV1_OR.selectStateAK.click();
		}
		}

	@When("^Verify created clients details of \"([^\"]*)\" in client page$")
	public void verify_created_clients_details_of_in_client_page(String arg1) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.clientTabSearch));
		AndroidAutoBundle_OR.clientTabSearch.sendKeys(sg.clientEmail);
		Assert.assertEquals(AndroidAutoBundle_OR.statusClaimed.getText(), "CLAIMED", "Expected buyer not found.");

		}

	@When("^User closes email editor$")
	public void user_closes_email_editor() throws Throwable {
		driver.navigate().back();
		}
	@And("^Check \"([^\"]*)\" checkbox and verify$")
	public void check_buy_sell_checkbox(String CheckBox) throws InterruptedException {
		if(CheckBox.endsWith("Buy and sell")) {
			
			Assert.assertTrue(AndroidAutoBundle_OR.sendEmailOption.isDisplayed());

		}
		else if(CheckBox.endsWith("Owners.com loans")) {
			
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.BuyandSell));
			AndroidAutoBundle_OR.BuyandSell.click();
			Thread.sleep(3000);
			AndroidAutoBundle_OR.OwnersLoans.click();
			Thread.sleep(3000);


		}
		else if(CheckBox.endsWith("Premium Title Service")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.BuyandSell));
			AndroidAutoBundle_OR.BuyandSell.click();
			Thread.sleep(3000);
			try {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.PremiumTitleService));
			AndroidAutoBundle_OR.PremiumTitleService.click();
				}
			catch(Exception E) {
			System.out.println("PTS is not Available hence moving with Buy and Sell");
				}			
			Thread.sleep(3000);
		}
		else if(CheckBox.endsWith("Owners.com loans and PTS")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.BuyandSell));
			AndroidAutoBundle_OR.BuyandSell.click();
			Thread.sleep(3000);
			try {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.PremiumTitleService));
			AndroidAutoBundle_OR.PremiumTitleService.click();
				}
			catch(Exception E) {
			System.out.println("PTS is not Available hence moving with Buy and Sell");
				}
			Thread.sleep(2000);
			AndroidAutoBundle_OR.OwnersLoans.click();
			Thread.sleep(2000);
		}
		else if(CheckBox.endsWith("Owners.com loans and buy and sell")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.OwnersLoans));
			AndroidAutoBundle_OR.OwnersLoans.click();
			Thread.sleep(2000);
		}
		else if(CheckBox.endsWith("Buy and Sell and PTS")) {
			
			try {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.PremiumTitleService));
			AndroidAutoBundle_OR.PremiumTitleService.click();
				}
			catch(Exception E) {
			System.out.println("PTS is not Available hence moving with Buy and Sell");
				}
		}
		else if(CheckBox.endsWith("Owners.com loans and buy and sell and PTS")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.BuyandSell));
			Thread.sleep(2000);
			AndroidAutoBundle_OR.OwnersLoans.click();
			try {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.PremiumTitleService));
			AndroidAutoBundle_OR.PremiumTitleService.click();
			}
			catch(Exception E) {
				System.out.println("PTS is not Available hence moving with Buy and Sell");
			}
		}	
		}
	@And("^Verify content of \"([^\"]*)\" in case of \"([^\"]*)\"$")
	public void Verify_content_of_SMS(String content , String Text) {
		if(content.equals("SMS") && Text.equals("Buy and sell")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.MessageBodyField)).isDisplayed();
			
			
			String smstext = AndroidAutoBundle_OR.SmsBody.getText();
			System.out.println(smstext);
			Assert.assertTrue(smstext.contains("Hi Automation"), smstext+" Not Displayed");	
		}
		if(content.equals("SMS") && Text.equals("PTS")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.MessageBodyField)).isDisplayed();
			String smstext = AndroidAutoBundle_OR.SmsBody.getText();
			System.out.println(smstext);
			Assert.assertTrue(smstext.contains("Hi Automation"), "Not Displayed");
		}
		if(content.equals("Email") && Text.equals("PTS")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.SEND)).isDisplayed();
			Assert.assertTrue(AndroidAutoBundle_OR.Closingmadesimple.isDisplayed());

		}
		if(content.equals("Email") && Text.equals("OCL")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.SEND)).isDisplayed();
			Assert.assertTrue(AndroidAutoBundle_OR.UseOwnersLoanstofindalender.isDisplayed());
		}
		if(content.equals("Email") && Text.equals("Buy and Sell")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.SEND)).isDisplayed();
			Assert.assertTrue(AndroidAutoBundle_OR.emailSubject.isDisplayed());
		}
		if(content.equals("Email") && Text.equals("Owners.com loans and PTS")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.SEND)).isDisplayed();
			Assert.assertTrue(AndroidAutoBundle_OR.Financingandclosingmadesimple.isDisplayed());

		}
		if(content.equals("Email") && Text.equals("Owners.com loans and buy and sell")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.SEND)).isDisplayed();
			Assert.assertTrue(AndroidAutoBundle_OR.Herehowmuchyoucansaveatclosing.isDisplayed());
		}
		if(content.equals("Email") && Text.equals("Buy and Sell and PTS")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.SEND)).isDisplayed();
			Assert.assertTrue(AndroidAutoBundle_OR.Gethomefasterwhenyoubuysellclosewithus.isDisplayed());
		}
		if(content.equals("Email") && Text.equals("Owners.com loans and buy and sell and PTS")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.SEND)).isDisplayed();
			Assert.assertTrue(AndroidAutoBundle_OR.WanttosavebigatclosingHerehow.isDisplayed());
		}
		if(content.equals("SMS") && Text.equals("OCL")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.MessageBodyField)).isDisplayed();
			String smstext = AndroidAutoBundle_OR.SmsBody.getText();
			Assert.assertTrue(smstext.contains("Hi Automation"), " Not Displayed");		
		}
		if(content.equals("SMS") && Text.equals("Owners.com loans and PTS")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.MessageBodyField)).isDisplayed();
			String smstext = AndroidAutoBundle_OR.SmsBody.getText();
			Assert.assertTrue(smstext.contains("Hi Automation")," Not Displayed");
		}
		if(content.equals("SMS") && Text.equals("Owners.com loans and buy and sell")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.MessageBodyField)).isDisplayed();
			String smstext = AndroidAutoBundle_OR.SmsBody.getText();
			Assert.assertTrue(smstext.contains("Hi Automation")," Not displayed");
		}
		if(content.equals("SMS") && Text.equals("Buy and Sell and PTS")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.MessageBodyField)).isDisplayed();
			String smstext = AndroidAutoBundle_OR.SmsBody.getText();
			Assert.assertTrue(smstext.contains("Hi Automation"),"Not Displayed");
		}
		if(content.equals("SMS") && Text.equals("Owners.com loans and buy and sell and PTS")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.MessageBodyField)).isDisplayed();
			String smstext = AndroidAutoBundle_OR.SmsBody.getText();
			Assert.assertTrue(smstext.contains("Hi Automation"),"Not Displayed");
		}
	}
	@And("^Verify content of \"([^\"]*)\"$")
	public void Verify_content_of_Email(String Content) throws InterruptedException {
		if(Content.equals("Email")) {
			try {
				wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.emailSubject)).isDisplayed();
				Assert.assertTrue(AndroidAutoBundle_OR.emailSubject.isDisplayed());
				}
			catch (Exception E) {
				Thread.sleep(4000);
				Assert.assertTrue(AndroidAutoBundle_OR.UseOwnersLoanstofindalender.isDisplayed());
				}
		}
		if(Content.equals("SMS")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.MessageBodyField)).isDisplayed();
			Assert.assertTrue(AndroidAutoBundle_OR.MessageBodyField.isDisplayed());
		}
	}
	@And("^Uncheck \"([^\"]*)\" checkbox$")
	public void  Uncheck_Buy_sell_checkbox(String CheckBox) throws InterruptedException {
		if(CheckBox.equals("Buy and sell")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.BuyandSell)).isDisplayed();
			AndroidAutoBundle_OR.BuyandSell.click();
			Thread.sleep(3000);
		}
		if(CheckBox.equals("Owners.com loans")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.BuyandSell)).isDisplayed();
			AndroidAutoBundle_OR.OwnersLoans.click();
			Thread.sleep(3000);
		}
		if(CheckBox.equals("Owners.com loans and buy and sell")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.BuyandSell)).isDisplayed();
			AndroidAutoBundle_OR.OwnersLoans.click();
			Thread.sleep(3000);
			AndroidAutoBundle_OR.BuyandSell.click();
			Thread.sleep(3000);
		}
		if(CheckBox.equals("Buy and Sell and PTS")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.BuyandSell)).isDisplayed();
			AndroidAutoBundle_OR.BuyandSell.click();
			Thread.sleep(3000);
			AndroidAutoBundle_OR.PremiumTitleService.click();
			Thread.sleep(3000);
		}
		if(CheckBox.equals("Owners.com loans and PTS")) {
			Thread.sleep(3000);
			AndroidAutoBundle_OR.OwnersLoans.click();
			Thread.sleep(3000);
			AndroidAutoBundle_OR.PremiumTitleService.click();
			Thread.sleep(3000);
		}
	}
	@And("^Validate text \"([^\"]*)\"$")
	public void  Validate_text(String Text) {
		if(Text.endsWith("Buy and sell owners.com")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidAutoBundle_OR.BuyAndSellwithOwners));
			Assert.assertTrue(AndroidAutoBundle_OR.BuyAndSellwithOwners.isDisplayed());
			}
		else if(Text.endsWith("Make Selling simple too")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidAutoBundle_OR.BuyAndSellwithOwners));			
			Assert.assertTrue(AndroidAutoBundle_OR.Makesellingsimple.isDisplayed());
			}
		else if(Text.endsWith("Finance with Owners.com Loans")) {
			
			wait.until(ExpectedConditions.visibilityOf(AndroidAutoBundle_OR.FinanceWithOwners));
			Assert.assertTrue(AndroidAutoBundle_OR.FinanceWithOwners.isDisplayed());			
			//*[contains(@text,'Automation')]
			//*[@name="Premium Title's innovative tech and mobile"] XCUIElementTypeStaticText
			}
		else if(Text.endsWith("your client doesn't have to go it alone")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidAutoBundle_OR.buttonReferClient));			
			Assert.assertTrue(AndroidAutoBundle_OR.Yourclientdoesnthavetogoitalone.isDisplayed());			
			}
		else if(Text.endsWith("Premium Title innovative tech")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidAutoBundle_OR.buttonReferClient));			
			Assert.assertTrue(AndroidAutoBundle_OR.PremiumTitleinnovativetechandmobile.isDisplayed());			

			}
		}
	@And("^Validate Bundle offer \"([^\"]*)\" for OCL,PTS and Buy and Sell for state \"([^\"]*)\"$")
	public void ValidateBundleoffer(String Present ,  String State ) {
			if(Present.equals("present") && State.equals("GA")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidAutoBundle_OR.ReviewBundleOffers));			
			Assert.assertTrue(AndroidAutoBundle_OR.ReviewBundleOffers.isDisplayed());
			
			}
		else if(Present.equals("not present") && State.equals("MI")) {
			
			Assert.assertFalse(AndroidAutoBundle_OR.ReviewBundleOffers.isDisplayed());
			}

			}
	@And("^User Navigates Back$")
	public void User_Navigates_Back(){
			driver.navigate().back();
			}
		}
