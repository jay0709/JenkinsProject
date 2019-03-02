package Driver.stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Driver.PropertyData;
import Driver.desiredCapabilities;
import ObjectRepository.AndroidHomePage_OR;
import ObjectRepository.AndroidTourReport_OR;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class AndroidPendingTourStepDefinations extends desiredCapabilities {
	
	String ClientName ="Jimmy Me";
	String AcceptedTour="9626 F St NE COOL ROAD Washington, DC 20002";
	PropertyData pd = new PropertyData();
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	@And("^Verify Client Name \"([^\"]*)\" is displayed$")
	public void Verify_client_name_is_displayed(String ClientName) throws Throwable
	{
		                                                                 //android.view.View[contains(@text,'Jimmy Agent')]
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text,'"+ClientName+"')]")));
	    Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[contains(@text,'"+ClientName+"')]")).isDisplayed(),ClientName+ "is not displayed");		
	}
	
	@And("^Verify \"([^\"]*)\" from Home page$")
	public void Verify_Tour_Report_Card_is_disappeared(String option) throws Throwable {
		if (option.equals("Tour Report Card is disappeard")) {
			Thread.sleep(3000);
			try
			{
				AndroidHomePage_OR.Accept.isDisplayed();
			}
			catch(NoSuchElementException e)
			{
				System.out.println("Tour Report Card is disappeard");
			}
			//Assert.assertTrue(!AndroidHomePage_OR.Accept.isDisplayed(),option + " is displayed..!");

		}
	}
	
	@Then("^Verify \"([^\"]*)\" is displayed in upcoming tours section$")
	public void Verify_Accepted_Tour_is_displayed_in_upcoming_tours_section(String option) throws Throwable {
		 if (option.equals("Accepted Tour")) {
       	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[@text='"+AcceptedTour+"']")));
		    Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@text='" + AcceptedTour + "']")).isDisplayed(),option+ "is not displayed");		
		}
		
	}
	
	@Then("^Verify \"([^\"]*)\"$")
	public void Verify_Tour_Time(String option) throws Throwable {
		 if (option.equals("TourTime")) {
			wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.TourTime));
			Assert.assertTrue(AndroidHomePage_OR.TourTime.isDisplayed(),option + " is not displayed..!");
		 }
		 else if(option.equals("Added Comment"))
		 {
				wait.until(ExpectedConditions.visibilityOf(AndroidTourReport_OR.CommentBox));
				AndroidTourReport_OR.CommentBox.sendKeys(pd.comment);
				//clicking on send button
				AndroidTourReport_OR.SendButton.click();
		        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[@text='"+pd.comment+"']")));
		        Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@text='"+pd.comment+"']")).isDisplayed(), "comment is not entered");
		}
		 else if(option.equals("Property Tiles"))
		 {
				
		}
	}
	
	@And("^User adds \"([^\"]*)\"$")
    public void User_adds_rating(String options) throws Throwable
    {
		//user adds rating
		wait.until(ExpectedConditions.visibilityOf(AndroidTourReport_OR.RatingButton));
		AndroidTourReport_OR.RatingButton.click();
    }
	
	@And("^User \"([^\"]*)\" the Pending Tour$")
	public void User_updates_the_Pending_Tour(String Action) {
		if(Action.equals("Updates")) {
			
		}
		else if(Action.equals("Deletes")) {
			
		}
		
	}
	 @And("^User selects \"([^\"]*)\" $")
	 public void  User_selects_option(String Option) {
		 if (Option.equals("The property is no longer available")) {
			 
		 }
	 }

	
}
