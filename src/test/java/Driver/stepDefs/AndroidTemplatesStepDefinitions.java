/**
 * 
 */
package Driver.stepDefs;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import Driver.desiredCapabilities;
import ObjectRepository.AndroidTemplates_OR;
import PageObjects.CommonActionsConditions;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;

/**
 * @author Jayabrata
 *
 */
public class AndroidTemplatesStepDefinitions extends desiredCapabilities {

	WebDriverWait wait = new WebDriverWait(driver, 30);
	CommonActionsConditions cac = new CommonActionsConditions();

	@And("^User closes the template$")
	public void user_closes_the_template() throws Throwable {
		AndroidTemplates_OR.backButtonInTemplates.click();
		wait.until(ExpectedConditions.elementToBeClickable(AndroidTemplates_OR.buttonOK));
		AndroidTemplates_OR.buttonOK.click();
	}

	@And("^User saves the template$")
	public void user_saves_the_template() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(AndroidTemplates_OR.saveTemplateOption));
		AndroidTemplates_OR.saveTemplateOption.click();
		AndroidTemplates_OR.buttonSave.click();
		wait.until(ExpectedConditions.visibilityOf(AndroidTemplates_OR.emailSavedDialogue));
		AndroidTemplates_OR.buttonOK.click();
	}

	@And("^User deletes the template$")
	public void user_deletes_the_template() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(AndroidTemplates_OR.deleteTemplateOption));
		AndroidTemplates_OR.deleteTemplateOption.click();
		AndroidTemplates_OR.buttonOK.click();
	}
	
	@And("^All pre-made templates are visible and clicking on it should open respective pages$")
	public void Validate_all_templates(DataTable data) throws Throwable
	{
		List<List<String>> templates = data.raw();
		wait.until(ExpectedConditions.visibilityOf(AndroidTemplates_OR.BuyerThanksToMeetingTile));
		Assert.assertTrue(AndroidTemplates_OR.BuyerThanksToMeetingTile.isDisplayed(), templates.get(0).get(0)+"is not displayed");
		Assert.assertTrue(AndroidTemplates_OR.ClosingBuyerThanksTile.isDisplayed(), templates.get(1).get(0)+"is not displayed");
		cac.topBottomScroll(driver, 0.80, 0.20);
		Assert.assertTrue(AndroidTemplates_OR.ClosingFollowUPTile.isDisplayed(), templates.get(2).get(0)+"is not displayed");
		cac.topBottomScroll(driver, 0.80, 0.20);
		Assert.assertTrue(AndroidTemplates_OR.RecommendBuyerApp.isDisplayed(), templates.get(3).get(0)+"is not displayed");
		cac.topBottomScroll(driver, 0.80, 0.20);
        Assert.assertTrue(AndroidTemplates_OR.TourHomeThisWeekendTile.isDisplayed(), templates.get(4).get(0)+"is not displayed");

    }
	
	@And("^Verify order of display in below sequence$")
	public void Validate_templates_order_display(DataTable data) throws Throwable
	{
		List<List<String>> templates = data.raw();
		Assert.assertTrue(AndroidTemplates_OR.preMadeEmailTemplateHeader.isDisplayed(), templates.get(0).get(0)+"is not displayed");
		for (int i = 0; i < 2; i++) {
			Thread.sleep(2000);
			cac.topBottomScroll(driver, 0.80, 0.20);
			Thread.sleep(1000);
		}
		Assert.assertTrue(AndroidTemplates_OR.emailTemplateHeader.isDisplayed(), templates.get(1).get(0)+"is not displayed");
		cac.topBottomScroll(driver, 0.80, 0.20);
		Assert.assertTrue(AndroidTemplates_OR.preMadeSMSTemplateHeader.isDisplayed(), templates.get(2).get(0)+"is not displayed");
		cac.topBottomScroll(driver, 0.80, 0.20);
		Assert.assertTrue(AndroidTemplates_OR.smsTemplateHeader.isDisplayed(), templates.get(3).get(0)+"is not displayed");
    }
	
	@And("^Verify \"([^\"]*)\" is \"([^\"]*)\"$") 
	public void vaildate_preview_buttons(String Template,String PreviewCase) throws Throwable
	{
		if(Template.equals("Email Template") && PreviewCase.equals("Expanded"))
		{
			System.out.println("expand case:");
			cac.topBottomScroll(driver, 0.80, 0.20);
			wait.until(ExpectedConditions.visibilityOf(AndroidTemplates_OR.HideFullPreview));
			Assert.assertTrue(AndroidTemplates_OR.HideFullPreview.isDisplayed(), Template+ "not expanded after clicking" );
        }
		else if(Template.equals("Email Template") && PreviewCase.equals("Collapsed"))
		{
			System.out.println("collapse case:");
			Thread.sleep(2000);
			try
			{
				Assert.assertTrue(!AndroidTemplates_OR.HideFullPreview.isDisplayed(), Template+ "not collapsed after clicking" );
            }
			catch(NoSuchElementException e)
			{
				System.out.println("Hide Full Preview button not visible");
			}
        }
	}
}
