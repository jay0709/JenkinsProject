
package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoBundleTestScenarioes_OR {

	@FindBy(xpath = "//android.view.View[@text='Property Address']")
	public static WebElement editTextPropertyAddress;

	@FindBy(xpath = "//android.view.View[@text='Share offer with client']")
	public static WebElement optionShareOfferBuySell;

	@FindBy(xpath = "//android.view.View[@text='Get started']")
	public static WebElement buttonGetStarted;

	@FindBy(xpath = "//android.view.View[@text='Not interested']")
	public static WebElement buttonNotInterested;

	@FindBy(xpath = "//android.view.View[@text='Send SMS']")
	public static WebElement sendSMSOption;

	@FindBy(xpath = "//android.view.View[@text='Send Email']")
	public static WebElement sendEmailOption;

	@FindBy(xpath = "//android.view.View[@text='Share offer with client]")
	public static WebElement dialogueShareOffer;

	@FindBy(xpath = "//android.view.View[@text='Buy and sell']")
	public static WebElement checkBoxBuySell;

	@FindBy(xpath = "//android.view.View[@text='Owners.com Loans']")
	public static WebElement checkBoxOCL;

	@FindBy(xpath = "//android.view.View[@text='']")
	public static WebElement buttonEmailEditorBack;

	@FindBy(xpath = "//android.view.View[@text='YES']")
	public static WebElement buttonEmailEditorBackConfirm;

	@FindBy(xpath = "//textarea[contains(@ng-model, 'screen.email.subject')]")
	public static WebElement emailSubjectField;

	@FindBy(xpath = "//div[contains(@ng-click, 'screen.send(screen.email)') and normalize-space(text())='Send']")
	public static WebElement buttonEmailSend;

}
