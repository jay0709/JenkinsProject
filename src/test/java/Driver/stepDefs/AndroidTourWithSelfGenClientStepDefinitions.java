
/**
 * @author Sivasankaramalan Gunasekarasivam
 *
 */

package Driver.stepDefs;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Driver.PropertyData;
import Driver.desiredCapabilities;
import ObjectRepository.AndroidAutoBundle_OR;
import ObjectRepository.AndroidClientDetailsPage_OR;
import ObjectRepository.AndroidClientPage_OR;
import ObjectRepository.AndroidHomePage_OR;
import ObjectRepository.AndroidTemplates_OR;
import ObjectRepository.AndroidTourReport_OR;
import PageObjects.CommonActionsConditions;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class AndroidTourWithSelfGenClientStepDefinitions extends desiredCapabilities {

	CommonActionsConditions ca = new CommonActionsConditions();
	WebDriverWait wait = new WebDriverWait(driver, 60);
	PropertyData pd = new PropertyData();

	String lastName = ca.randomAlphaNumeric(5);
	String clientEmail = lastName + "@test.com";
	String Address = "730 F St NE COOL ROAD, Washington,DC, 20002";
	String TourTitle = "Schedule Tour";
	String TourComment = "Test Comment";

	@When("^User clicks on \"([^\"]*)\" tab$")
	public void user_clicks_on_tab(String Tab) throws Throwable {

		if (Tab.equals("Clients")) {
			AndroidHomePage_OR.ClientsButton.click();
		} else if (Tab.equals("+Add")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientPage_OR.btnAdd));
			AndroidClientPage_OR.btnAdd.click();
		}

	}

	@When("^user clicks on \"([^\"]*)\" button$")
	public void user_clicks_on_button(String Button) throws Throwable {

		if (Button.equals("+Add")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientPage_OR.btnAdd));
			AndroidClientPage_OR.btnAdd.click();
		} else if (Button.equals("Add client")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientPage_OR.linkADDCLIENT)).isDisplayed();
			AndroidClientPage_OR.linkADDCLIENT.click();
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientPage_OR.tabACTIVE)).isDisplayed();
		} else if (Button.equals("Tour report")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.TourREPORT)).isDisplayed();
			AndroidClientDetailsPage_OR.TourREPORT.click();
			Thread.sleep(4000);

			try {
				AndroidClientDetailsPage_OR.VerifyAction.isDisplayed();
				AndroidClientDetailsPage_OR.VerifyActionYes.click();
			} catch (Exception e) {
				System.out.println("Verify Page is not Displayed");
			}
			try {
				AndroidClientDetailsPage_OR.TourReportWelomePage.isDisplayed();
				// Assert.assertTrue(AndroidClientDetailsPage_OR.StartTourReport.isDisplayed(),"is
				// not display");
				AndroidClientDetailsPage_OR.StartTourReport.click();
			} catch (Exception e) {
				System.out.println("Verify Page is not Displayed");
			}
		} else if (Button.equals("Take or upload photos")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.TAKEORUPLOADPHOTOS))
					.isDisplayed();
			AndroidClientDetailsPage_OR.TAKEORUPLOADPHOTOS.click();
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.ChoosePhoto)).isDisplayed();
		} else if (Button.equals("Add comment")) {

			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.ADDCOMMENT)).isDisplayed();
			AndroidClientDetailsPage_OR.ADDCOMMENT.click();
			AndroidClientDetailsPage_OR.AddCommentTextBox.sendKeys(TourComment);
			driver.hideKeyboard();
			ca.switchToWebView(getAndroidDriver());
			AndroidClientDetailsPage_OR.SavePictureSendButton.click();
			ca.switchToNativeApp(getAndroidDriver());
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.Continue)).isDisplayed();
		} else if (Button.equals("Continue")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.Continue)).isDisplayed();
			AndroidClientDetailsPage_OR.Continue.click();
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.SendTourReport))
					.isDisplayed();

		} else if (Button.equals("Back to your tasks")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.BackToYourTasks))
					.isDisplayed();
			AndroidClientDetailsPage_OR.BackToYourTasks.click();
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.link_EMAIL)).isDisplayed();
		}

		else if (Button.equals("Tour with client")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidClientDetailsPage_OR.TourWithClient));
			AndroidClientDetailsPage_OR.TourWithClient.click();
			wait.until(ExpectedConditions.visibilityOf(AndroidClientDetailsPage_OR.EnterTaskTitle));
		} else if (Button.equals("Back")) {
			AndroidTemplates_OR.backButtonInTemplates.click();
			Thread.sleep(2000);
		}
		else if (Button.equals("Ok")) {
			AndroidAutoBundle_OR.OK.click();
			Thread.sleep(2000);
		}
		else if (Button.equals("yes")) {
			Thread.sleep(2000);
			AndroidAutoBundle_OR.Yes.click();
			Thread.sleep(2000);
		}
	}

	@And("^selects client type as \"([^\"]*)\"$")

	public void selectsclientstype(String Buyer) {
		wait.until(ExpectedConditions.elementToBeClickable(AndroidClientPage_OR.ADD_BUYER_CLIENT));
		AndroidClientPage_OR.ADD_BUYER_CLIENT.click();
	}

	@SuppressWarnings("static-access")
	@And("^User fills in below information$")
	public void userfillsinbelowinformation(DataTable Inputs) throws InterruptedException {
		List<List<String>> data = Inputs.raw();

		if (data.get(0).get(0).equals("First Name")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientPage_OR.editTextFirstName));
			AndroidClientPage_OR.editTextFirstName.click();
			AndroidClientPage_OR.editTextFirstName.sendKeys(pd.buyerFirstName);
			Thread.sleep(1000);

		}
		if (data.get(1).get(0).equals("Last Name")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientPage_OR.editTextLastName));
			AndroidClientPage_OR.editTextLastName.click();
			AndroidClientPage_OR.editTextLastName.sendKeys(lastName);
			Thread.sleep(1000);
		}
		if (data.get(2).get(0).equals("Phone Number")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientPage_OR.editTextPhone));
			AndroidClientPage_OR.editTextPhone.click();
			AndroidClientPage_OR.editTextPhone.sendKeys(pd.buyerPhoneNumber);
			Thread.sleep(1000);
		}

		if (data.get(3).get(0).equals("Email Address")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientPage_OR.editTextEmail));
			AndroidClientPage_OR.editTextEmail.click();
			AndroidClientPage_OR.editTextEmail.sendKeys(clientEmail);
			Thread.sleep(1000);
			AndroidClientPage_OR.linkNext.click();
		}

		if (data.get(4).get(0).equals("Budget")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientPage_OR.linkSelectPriceRange));
			AndroidClientPage_OR.linkSelectPriceRange.click();
			ca.switchToWebView(driver);
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientPage_OR.listPrice));
			AndroidClientPage_OR.listPrice.click();
			ca.switchToNativeApp(driver);
		}
//		 if (data.get(5).get(0).equals("Pre-Approved")) {
//		 wait.until(ExpectedConditions.elementToBeClickable(AndroidClientPage_OR.linkSelectPreApproval));
//		 AndroidClientPage_OR.linkSelectPreApproval.click();
//		 ca.switchToWebView(getAndroidDriver());
//		 wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.preApproved));
//		 AndroidAutoBundle_OR.preApproved.click();
//		 ca.switchToNativeApp(getAndroidDriver());
//		 }
//		 if (data.get(6).get(0).equals("Timeframe")) {
//		 wait.until(ExpectedConditions.elementToBeClickable(AndroidClientPage_OR.linkSelectTimeframe));
//		 AndroidClientPage_OR.linkSelectTimeframe.click();
//		 ca.switchToWebView(getAndroidDriver());
//		 wait.until(ExpectedConditions.elementToBeClickable(AndroidAutoBundle_OR.timeFrameNow));
//		 AndroidAutoBundle_OR.timeFrameNow.click();
//		 ca.switchToNativeApp(getAndroidDriver());
//		 wait.until(ExpectedConditions.elementToBeClickable(AndroidClientPage_OR.tabACTIVE)).isDisplayed();
//		 }
	}

	@And("^verify created clients details of \"([^\"]*)\" in client page$")

	public void And_verify_created_clients_details_of_in_client_page(String Client) {
		if (Client.equals("Buyer")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientPage_OR.tabACTIVE)).isDisplayed();
			driver.findElement(
					By.xpath("//android.view.View[@text='" + pd.buyerFirstName + " " + pd.buyerLastName + "']"))
					.isDisplayed();

			System.out.println("User here is:" + pd.buyerFirstName + pd.buyerLastName);
		}
	}

//	@And("^User searches for client")
//	public void user_searhing_for_Client() throws InterruptedException {
//
//		wait.until(ExpectedConditions.elementToBeClickable(AndroidClientPage_OR.searchClients_inputfield));
//		AndroidClientPage_OR.searchClients_inputfield.click();
//		AndroidClientPage_OR.searchClients_inputfield.sendKeys(clientEmail);
//		Thread.sleep(3000);
//		driver.navigate().back();
//		// wait.until(ExpectedConditions.elementToBeClickable(AndroidClientPage_OR.btnFILTER)).isDisplayed();
//	}

	@And("^verify the client stage as \"([^\"]*)\" in clients details page$")
	public void verify_the_client_stage_in_clients_details_page(String Stage) {
		if (Stage.equals("Claimed")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidClientDetailsPage_OR.text_Stage_label));
			String CurrentStage = AndroidClientDetailsPage_OR.text_Stage_label.getText();
			assertEquals(CurrentStage, "CLAIMED");
			System.out.println("Current Stage is:" + CurrentStage);
		} else if (Stage.equals("In contact")) {
			// String CurrentStage =
			// driver.findElementByXPath("//XCUIElementTypeStaticText[@name='IN
			// CONTACT']").getText();
			String CurrentStage = AndroidClientDetailsPage_OR.text_Stage_label.getText();
			assertEquals(CurrentStage, "IN CONTACT");
			System.out.println("Current Stage is:" + CurrentStage);
		}

	}

	@And("^user adds tasks to the \"([^\"]*)\"$")
	public void user_adds_tasks_to_the_Client(String Client) throws MalformedURLException, InterruptedException {
		if (Client.equals("Client")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidClientDetailsPage_OR.link_ADD_TASK));
			AndroidClientDetailsPage_OR.link_ADD_TASK.click();
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.WhatTypeOfTask))
					.isDisplayed();

		}
	}

	@And("^user schedules tour with client$")
	public void user_schedules_tour_with_client(DataTable Input) throws InterruptedException {
		List<List<String>> data = Input.raw();

		if (data.get(0).get(0).equals("Title")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidClientDetailsPage_OR.EnterTaskTitle));
			AndroidClientDetailsPage_OR.EnterTaskTitle.click();
			AndroidClientDetailsPage_OR.EnterTaskTitle.sendKeys(TourTitle);
		}

		if (data.get(1).get(0).equals("When")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidClientDetailsPage_OR.SelectDateAndTime));
			AndroidClientDetailsPage_OR.SelectDateAndTime.click();
			AndroidClientDetailsPage_OR.Ok.click();
			Thread.sleep(500);
			AndroidClientDetailsPage_OR.Ok.click();
		}
//				if (data.get(2).get(0).equals("Add A Reminder")) {
//					wait.until(ExpectedConditions.visibilityOf(AndroidClientDetailsPage_OR.RemainderToggle));
//					AndroidClientDetailsPage_OR.RemainderToggle.click();
//					AndroidClientDetailsPage_OR.OneHourBefore.click();
//				}
		if (data.get(3).get(0).equals("Location")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidClientDetailsPage_OR.TapToSearchLocation));
			AndroidClientDetailsPage_OR.TapToSearchLocation.click();
			AndroidClientDetailsPage_OR.EnterAnAddressOrMLSID.click();
			AndroidClientDetailsPage_OR.EnterAnAddressOrMLSID.sendKeys(Address);
			driver.findElementByXPath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[4]/android.view.View[2]/android.widget.ListView/android.view.View/android.view.View")
					.click();
			// driver.findElementByXPath("//android.view.View[@text='"+Address+"']").click();
			wait.until(ExpectedConditions.visibilityOf(AndroidClientDetailsPage_OR.EnterTaskRelatedNotes));
		}
		if (data.get(4).get(0).equals("Notes")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidClientDetailsPage_OR.EnterTaskRelatedNotes));
			AndroidClientDetailsPage_OR.EnterTaskRelatedNotes.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			AndroidClientDetailsPage_OR.EnterTaskRelatedNotes.sendKeys("Test Notes");
			driver.hideKeyboard();
		}
	}

	@And("^verify the Schedule tour task in clients details page$")
	public void verify_the_Schedule_tour_task_in_clients_details_page() {
		wait.until(ExpectedConditions.visibilityOf(AndroidClientDetailsPage_OR.SCHEDULETOUR));
		AndroidClientDetailsPage_OR.SCHEDULETOUR.click();
		wait.until(ExpectedConditions.visibilityOf(AndroidClientDetailsPage_OR.Done));
		AndroidClientDetailsPage_OR.Done.click();
		wait.until(ExpectedConditions.visibilityOf(AndroidClientDetailsPage_OR.link_EMAIL));
	}

	@SuppressWarnings("static-access")
	@And("^scroll to \"([^\"]*)\" section$")
	public void scroll_to_section(String Section) throws MalformedURLException, InterruptedException {
		if (Section.equals("Tasks")) {

			Thread.sleep(8000);
//	    				ca.scrollToText("Schedule Tour", driver);
			ca.topBottomScroll(driver, 0.60, 0.10);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Thread.sleep(5000);
		}
	}

	@And("^user verifies the \"([^\"]*)\"$")
	public void user_verifies_Scheduled_tour(String Text) throws InterruptedException {
		if (Text.equals("Scheduled tour")) {
			Thread.sleep(5000);
			driver.findElementByXPath("//android.view.View[@text='" + TourTitle + "']").isDisplayed();
			driver.findElementByXPath("//android.view.View[@text='" + TourTitle + "']").click();
			wait.until(ExpectedConditions.visibilityOf(AndroidClientDetailsPage_OR.TourREPORT)).isDisplayed();
			Assert.assertTrue((AndroidClientDetailsPage_OR.TourREPORT.isDisplayed()), "is not display");
    		Assert.assertTrue(driver.findElementByXPath("//android.view.View[@name='730 F St NE COOL ROAD, Washington, DC, 20002']").isDisplayed(),"is not display");
		} else if (Text.equals("Added Comment")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidClientDetailsPage_OR.Continue));
			driver.findElementByXPath("//android.view.View[@name=" + TourComment + "]").isDisplayed();
		}
		else if (Text.equals("Show Client Details")) {
			
		}
		
	}

	@And("^verify the \"([^\"]*)\" is displayed or not$")
	public void verify_the_page(String Page) {
		if (Page.equals("Tour report welcome page")) {
			try {
				wait.until(ExpectedConditions.visibilityOf(AndroidClientDetailsPage_OR.TourReportWelomePage));
				Assert.assertTrue(AndroidClientDetailsPage_OR.TourReportWelomePage.isDisplayed(), "is not display");
				}
			catch (Exception E) {
				System.out.println("Tour Report Welcome page is not displaying");
			}
		} else if (Page.equals("Uploaded photo")) {
			Assert.assertTrue(AndroidClientDetailsPage_OR.AddedPhotoThumb.isDisplayed(), "is not display");

		} else if (Page.equals("Added comments")) {
			Assert.assertTrue(driver.findElementByXPath("//android.view.View[@name=" + TourComment + "]").isDisplayed(),
					"is not display");

		}

	}

	@And("^verify the \"([^\"]*)\" on tour report page$")
	public void verify_the_tour_report_page(String Input1) {
		if (Input1.equals("Take or upload photos")) {
			AndroidTourReport_OR.StartTourReportWelcomePageButton.click();
			wait.until(ExpectedConditions.visibilityOf(AndroidClientDetailsPage_OR.TAKEORUPLOADPHOTOS));
			Assert.assertTrue(AndroidClientDetailsPage_OR.TAKEORUPLOADPHOTOS.isDisplayed(), "is not display");
		} else if (Input1.equals("Add comment")) {
			Assert.assertTrue(AndroidClientDetailsPage_OR.ADDCOMMENT.isDisplayed(), "is not display");
		}
	}

	@And("^user uploads photo from \"([^\']*)\"$")
	public void user_uploads_photo_from_source(String Source) throws MalformedURLException, InterruptedException {
		if (Source.equals("Gallery")) {
			try {
				Thread.sleep(3000);
				AndroidTourReport_OR.CameraIcon.click();
			} catch (NoSuchElementException e) {
				System.out.println("No camera icon present");
			}
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.ChoosePhoto));
			AndroidClientDetailsPage_OR.ChoosePhoto.click();
			Thread.sleep(3000);
			try {
				if (AndroidClientDetailsPage_OR.MediaPermissionAllow.isDisplayed()) {
//			 		 wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.MediaPermissionAllow)).isDisplayed();
					AndroidClientDetailsPage_OR.MediaPermissionAllow.click();
				}
			} catch (NoSuchElementException e) {
				System.out.println("No Allow button");
			}
			Thread.sleep(3000);
			AndroidClientDetailsPage_OR.ChoosePhoto.click();

			// wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.GalleryOK)).isDisplayed();
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.GalleryFirstThumb))
					.isDisplayed();
			AndroidClientDetailsPage_OR.GalleryFirstThumb.click();
			AndroidClientDetailsPage_OR.GallerySecondThumb.click();
			AndroidClientDetailsPage_OR.GalleryThirdThumb.click();
			AndroidClientDetailsPage_OR.GalleryOK.click();
			ca.switchToWebView(driver);
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.SavePictureSendButton))
					.isDisplayed();
			AndroidClientDetailsPage_OR.SavePictureSendButton.click();
			ca.switchToNativeApp(driver);
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.Continue)).isDisplayed();
		}

		else if (Source.equals("Camera")) {
			for (int i = 0; i < 4; i++) {
				wait.until(ExpectedConditions
						.elementToBeClickable(AndroidClientDetailsPage_OR.ChooseCamereOrGalleryHeader)).isDisplayed();
				assertTrue(AndroidClientDetailsPage_OR.TakePhoto.isDisplayed());
				Thread.sleep(5000);
				AndroidClientDetailsPage_OR.TakePhoto.click();
				Thread.sleep(5000);

				try {
					AndroidClientDetailsPage_OR.MediaPermissionAllow.isDisplayed();
					AndroidClientDetailsPage_OR.MediaPermissionAllow.click();
					AndroidClientDetailsPage_OR.MediaPermissionAllow.click();
					wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.PhotoCapture));
					AndroidClientDetailsPage_OR.PhotoCapture.click();
					wait.until(ExpectedConditions.visibilityOf(AndroidClientDetailsPage_OR.UsePhoto));
					AndroidClientDetailsPage_OR.UsePhoto.click();
					ca.switchToWebView(getAndroidDriver());
					wait.until(
							ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.SavePictureSendButton))
							.isDisplayed();
					Thread.sleep(3000);
					AndroidClientDetailsPage_OR.SavePictureSendButton.click();
					ca.switchToNativeApp(getAndroidDriver());
					wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.CameraButton))
							.isDisplayed();
					Thread.sleep(5000);
					AndroidClientDetailsPage_OR.CameraButton.click();
				} catch (Exception e) {
					AndroidClientDetailsPage_OR.PhotoCapture.click();
					wait.until(ExpectedConditions.visibilityOf(AndroidClientDetailsPage_OR.UsePhoto));
					AndroidClientDetailsPage_OR.UsePhoto.click();
					ca.switchToWebView(getAndroidDriver());
					wait.until(
							ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.SavePictureSendButton))
							.isDisplayed();
					Thread.sleep(3000);
					AndroidClientDetailsPage_OR.SavePictureSendButton.click();
					ca.switchToNativeApp(getAndroidDriver());
					wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.CameraButton))
							.isDisplayed();
					Thread.sleep(3000);
					AndroidClientDetailsPage_OR.CameraButton.click();
					Thread.sleep(3000);
				}
			}
			AndroidClientDetailsPage_OR.Cancel.click();
		}
	}

	@SuppressWarnings("static-access")
	@And("^user adds \"([^\"]*)\"$")
	public void user_adds_comments(String Text) throws InterruptedException {
		if (Text.equals("Comments")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.AddCommentAfterAddingPhoto))
					.isDisplayed();
			AndroidClientDetailsPage_OR.AddCommentAfterAddingPhoto.click();
			AndroidClientDetailsPage_OR.AddCommentAfterAddingPhoto.sendKeys(TourComment);
			Thread.sleep(3000);
			ca.switchToWebView(getAndroidDriver());
			AndroidClientDetailsPage_OR.SavePictureSendButton2.click();
			ca.switchToNativeApp(getAndroidDriver());
			driver.findElementByXPath("//android.view.View[@text='" + TourComment + "']").isDisplayed();
		} else if (Text.equals("Rating")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.FiveStarRate)).isDisplayed();
			AndroidClientDetailsPage_OR.FiveStarRate.click();
		}
	}

	@And("^user adds \"([^\"]*)\" reaction to added photo$")
	public void user_adds_reaction_to_photos(String Reaction) {
		if (Reaction.equals("Liked it")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidClientDetailsPage_OR.Like)).isDisplayed();
			AndroidClientDetailsPage_OR.Like.click();
		}
	}

	@And("^verify the confirmation page of tour report$")
	public void verify_the_confirmation_page_of_tour_report() {
		wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.SendTourReport)).isDisplayed();
		AndroidClientDetailsPage_OR.SendTourReport.click();
		try {
			WebDriverWait waitone = new WebDriverWait(driver, 20);
			waitone.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.ReportFeedbackEasy))
					.isDisplayed();
		} catch (Exception e) {
			System.out.println("No feedback page");
		}

	}

	@And("^verify the acknowledgment page$")
	public void verify_the_acknowledgment_page_of_tour_report() throws MalformedURLException, InterruptedException {
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 15);
			wait2.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.ReportFeedbackEasy))
					.isDisplayed();
			AndroidClientDetailsPage_OR.ReportFeedbackEasy.click();
			ca.scrollToText("Submit", driver);
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.Submit)).isDisplayed();
			AndroidClientDetailsPage_OR.Submit.click();
		} catch (Exception e) {
			System.out.println("No feedback page");
		}
		try {
			AndroidClientDetailsPage_OR.DoNotRefer.isDisplayed();
			AndroidClientDetailsPage_OR.DoNotRefer.click();
			AndroidClientDetailsPage_OR.CloseTourButton.click();
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.BackToYourTasks))
					.isDisplayed();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidClientDetailsPage_OR.BackToYourTasks))
					.isDisplayed();

		}

	}

	@And("^verify triggered email to buyer$")
	public void verify_triggered_email_to_buyer() {

		wait.until(ExpectedConditions.elementToBeClickable(AndroidHomePage_OR.ClientsButton)).isDisplayed();
		AndroidHomePage_OR.ClientsButton.click();
	}
	@And("^User selects \"([^\"]*)\"$")
	public void user_selects(String Options) {
		if(Options.equals("The property is no longer available")) {
			
		}
		else if(Options.equals("Property Tile")) {
			
		}
		else if(Options.equals("View more info about this property")) {
			
		}
		else if(Options.equals("Share with Automation")) {
			
		}
		else if(Options.equals("Change Date / Time")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidTourReport_OR.ChangeDateTime));
			AndroidTourReport_OR.ChangeDateTime.click();
			wait.until(ExpectedConditions.visibilityOf(AndroidTourReport_OR.CalendarOK));

		}
		else if(Options.equals("Call Buyer")) {
			wait.until(ExpectedConditions.elementToBeClickable(AndroidTourReport_OR.CallBuyer)).isDisplayed();
			AndroidTourReport_OR.CallBuyer.click();
			wait.until(ExpectedConditions.elementToBeClickable(AndroidTourReport_OR.Dialer5)).isDisplayed();
		}
	}
	@And("^User suggest the Property$")
	public void User_suggest_the_Property() {
		
	}
	@And("^User changes \"([^\"]*)\"$")
	public void user_changes(String Options) {
		if(Options.equals("Tour location MLS property")) {
			
		}
		else if(Options.equals("Tour location Non-MLS property")) {
			
		}
		else if(Options.equals("Date/Time")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidTourReport_OR.CalendarOK));
			AndroidTourReport_OR.Calander28.click();
			AndroidTourReport_OR.CalendarOK.click();
			AndroidTourReport_OR.CalendarOK.click();
			wait.until(ExpectedConditions.visibilityOf(AndroidTourReport_OR.TourUpdated));
		}
		
	}
	@And("^User changes the location without choosing any$")
	public void  Userchangesthelocationwithoutchoosingany() {
		
	}
	@And("^Verify the \"([^\"]*)\" in home page pending tour card$")
	public void verify_the_pending_tour_card(String Option) {
		if(Option.endsWith("updated location")) {
			
		}
		else if(Option.endsWith("updated time")) {
			
		}
	}

}
