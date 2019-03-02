/**
 * 
 */
package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Jayabrata
 *
 */
public class AndroidTemplates_OR {

	@FindBy(xpath = "//android.view.View[@text='ADD NEW']")
	public static WebElement buttonAddNew;

	@FindBy(xpath = "//android.view.View[@text='Templates']")
	public static WebElement pageHeaderTemplates;

	@FindBy(xpath = "//android.view.View[@text='Pre-Made Email Templates']")
	public static WebElement preMadeEmailTemplateHeader;

	@FindBy(xpath = "//android.view.View[@text='Email Templates']")
	public static WebElement emailTemplateHeader;

	@FindBy(xpath = "//android.view.View[@text='Pre-Made SMS Templates']")
	public static WebElement preMadeSMSTemplateHeader;

	@FindBy(xpath = "//android.view.View[@text='SMS Templates']")
	public static WebElement smsTemplateHeader;

	@FindBy(xpath = "//android.view.View[@text='Hi [Client First Name],']")
	public static WebElement cardClosingFollowUp;

	@FindBy(xpath = "//*/android.view.View[3]/android.view.View[1]/android.widget.EditText")
	public static WebElement templatesPageSearch;

	@FindBy(xpath = "*//android.view.View//android.view.View[3]//android.view.View[1]//android.widget.EditText")
	public static WebElement addNewPageSearch;

	@FindBy(xpath = "//input[@ng-keypress='screen.handleFilterKey($event.keyCode)' and contains(@class,'client-filter ng-pristine ng-untouched ng-valid ng-empty')]")
	public static WebElement searchTemplate;

	@FindBy(xpath = "//android.view.View[@text = 'Blank Email Document']")
	public static WebElement blankEmailDocument;

	@FindBy(xpath = "//android.view.View[@text = 'Blank SMS Document']")
	public static WebElement blankSmsDocument;

	@FindBy(xpath = "//li[contains(@class, 'template-edit template-edit-icon')]")
	public static WebElement editTemplateButton;

	@FindBy(xpath = "*//android.widget.ListView[2]//android.view.View[2]//android.widget.Image")
	public static WebElement saveTemplateOption;

	@FindBy(xpath = "*//android.widget.ListView[2]//android.view.View[1]//android.view.View")
	public static WebElement deleteTemplateOption;

	@FindBy(xpath = "//android.view.View[@text='OK']")
	public static WebElement buttonOK;

	@FindBy(xpath = "//android.view.View[@text='SAVE']")
	public static WebElement buttonSave;

	@FindBy(xpath = "//android.view.View[@text= 'Email Saved!']")
	public static WebElement emailSavedDialogue;

	@FindBy(xpath = "//android.view.View[@text= 'SMS Saved!']")
	public static WebElement smsSavedDialogue;

	@FindBy(xpath = "//android.view.View[@text = 'Template Title']")
	public static WebElement templateTitle;

	@FindBy(xpath = "*//android.view.View[3]//android.view.View[1]//android.view.View[2]//android.widget.ListView[1]//android.view.View//android.view.View")
	public static WebElement backButtonInTemplates;

	@FindBy(xpath = "//android.view.View[@text='Hi [Client First Name],']")
	public static WebElement recomBuyerAppEmail;

	@FindBy(xpath = "//android.view.View[contains(@text,'Hi [Client First Name], Owners.com ')]")
	public static WebElement recomBuyerAppSMS;

	@FindBy(xpath = "//android.view.View[@text='Subject']")
	public static WebElement emailtemplateSubject;

	@FindBy(xpath = "//android.view.View[@text= 'No Matching Templates.']")
	public static WebElement noMatchingTemplate;
	
	@FindBy(xpath = "//android.view.View[@text='Buyer - Thanks for Meeting']")
	public static WebElement BuyerThanksToMeetingTile;
	
	@FindBy(xpath = "//android.view.View[@text='Closing - Buyer Thanks']")
	public static WebElement ClosingBuyerThanksTile;
	
	@FindBy(xpath = "//android.view.View[@text='Closing - Follow Up']")
	public static WebElement ClosingFollowUPTile;
	
	@FindBy(xpath = "//*/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[1]/android.widget.ListView/android.view.View[4]/android.view.View[1]")
	public static WebElement RecommendBuyerApp;
	
	@FindBy(xpath = "//android.view.View[@text='Tour Homes This Weekend']")
	public static WebElement TourHomeThisWeekendTile;
	
	@FindBy(xpath = "//android.view.View[@text='Add New']")
	public static WebElement AddNewTitle;
	
	@FindBy(xpath = "//android.view.View[@text='SHOW FULL PREVIEW']")
	public static WebElement ShowFullPreview;
	
	@FindBy(xpath = "//android.view.View[@text='HIDE FULL PREVIEW']")
	public static WebElement HideFullPreview;
	
	
	

}
