package ObjectRepository;

/**
 * @author Jayabrata
 *
 */
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AndroidAutoBundleV1_OR {

	// ------ Auto bundle objects ----- //

	@FindBy(xpath = "//android.view.View[@text='What is their status....']")
	public static WebElement whatStatus;

	@FindBy(xpath = "//android.view.View[@text='Pre-approved']")
	public static WebElement preApproved;

	@FindBy(xpath = "//android.view.View[@text='Not pre-approved']")
	public static WebElement notPreApproved;

	@FindBy(xpath = "//android.view.View[@text='Cash buyer']")
	public static WebElement cashBuyer;

	@FindBy(xpath = "//android.view.View[@text='Help them get started']")
	public static WebElement helpThemGetStarted;

	@FindBy(xpath = "//android.view.View[@text='Refer']")
	public static WebElement buttonRefer;

	@FindBy(xpath = "//android.view.View[@text='Do not refer']")
	public static WebElement buttonDoNotRefer;

	@FindBy(xpath = "//android.view.View[@text='Pick a time here...']")
	public static WebElement bestTimeToContact;

	@FindBy(xpath = "//android.view.View[@text='Morning']")
	public static WebElement bestTimeMorning;

	@FindBy(xpath = "//android.view.View[@text='Yes']")
	public static WebElement selectAnswerYes;

	@FindBy(xpath = "//android.view.View[@text='Choose an answer...']")
	public static WebElement chooseAnswer;

	@FindBy(xpath = "*//android.view.View[3]//android.view.View[2]//android.view.View[2]//android.widget.ListView[2]//android.view.View[2]")
	public static WebElement clientExpectingCall;

	@FindBy(xpath = "*//android.view.View[3]//android.view.View[2]//android.view.View[2]//android.widget.ListView[3]//android.widget.ListView//android.view.View[1]")
	public static WebElement firstTimeBuyer;

	@FindBy(xpath = "*//android.view.View[3]//android.view.View[2]//android.view.View[2]//android.widget.ListView[4]//android.widget.ListView//android.view.View[1]")
	public static WebElement sellingHomesWithPurchase;

	@FindBy(xpath = "*//android.view.View[3]//android.view.View[2]//android.view.View[2]//android.view.View[7]//android.widget.EditText[1]")
	public static WebElement commentTextBox;

	@FindBy(xpath = "//android.view.View[@text='Choose a state...']")
	public static WebElement dropdownState;

	@FindBy(xpath = "//android.view.View[@text='ALASKA']")
	public static WebElement selectStateAK;

	@FindBy(xpath = "//a[contains(@class, 'bg-color') and (text()='Now')]")
	public static WebElement purchaseTimelineNow;

	@FindBy(xpath = "//div[contains(@class, 'action action-save button-blue ng-scope') and normalize-space(text())='Next']")
	public static WebElement referralFormNext;

	@FindBy(xpath = "//div[contains(@class, 'action action-save button-blue ng-scope') and normalize-space(text())='Send']")
	public static WebElement referralFormSend;

	@FindBy(xpath = "//android.view.View[@text='Referral sent to Owners.com Loans!')]")
	public static WebElement referralSentDialogue;

	@FindBy(xpath = "//android.view.View[@text='OK']")
	public static WebElement referralSentOkButton;

	@FindBy(xpath = "//android.view.View[@text='You chose to refer this client']")
	public static WebElement choseToReferClient;

	@FindBy(xpath = "//android.view.View[@text='Tell us why you chose not to refer your client to Owners.com Loans']")
	public static WebElement textTellUsWhy;

	@FindBy(xpath = "*//android.view.View[4]//android.view.View//android.view.View[2]//android.widget.ListView//android.view.View[2]//android.view.View")
	public static WebElement radioPreferredLender;

	@FindBy(xpath = "//android.view.View[@text ='Submit']")
	public static WebElement buttonSubmit;

	@FindBy(xpath = "//android.view.View[@text='You chose not to refer this client']")
	public static WebElement choseNotToReferClient;

}
