
package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Jayabrata
 *
 */
public class AndroidAutoBundle_OR {

	// ----- Add Client Objects ----- //

	@FindBy(xpath = "//android.view.View[@text='What type of client?']")
	public static WebElement clientTypeDialogue;

	@FindBy(xpath = "*//android.view.View[@text='Buyer']")
	public static WebElement clientTypeBuyer;

	@FindBy(xpath = "//android.view.View[@text='Seller']")
	public static WebElement clientTypeSeller;

	@FindBy(xpath = "//android.view.View[@text='First Name']/following-sibling::android.widget.EditText[@index='1']")
	public static WebElement firstNameEdit;

	@FindBy(xpath = "//android.view.View[@text='Last Name']/following-sibling::android.widget.EditText[@index='1']")
	public static WebElement lastNameEdit;

	@FindBy(xpath = "//android.view.View[@text='Phone Number']/following-sibling::android.widget.EditText[@index='1']")
	public static WebElement phoneNoEdit;

	@FindBy(xpath = "//android.view.View[@text='Email Address']/following-sibling::android.widget.EditText[@index='1']")
	public static WebElement emailAddressEdit;

	@FindBy(xpath = "//div[contains(@class, 'action action-save ng-scope') and normalize-space(text())='Next']")
	public static WebElement nextButton;

	// @FindBy(xpath = "//*[@text=\"Select Price Range\"]")
	@FindBy(xpath = "*//android.view.View[3]/android.view.View[2]//android.view.View[1]//android.view.View[1]//android.view.View[2]")
	public static WebElement priceRange;

	@FindBy(xpath = "//li[text()='50K - 100K']")
	public static WebElement hundredK;

	@FindBy(xpath = "//li[text()='150K - 200K']")
	public static WebElement twoHundredK;

	@FindBy(xpath = "//li[text()='600K - 750K']")
	public static WebElement sevenFiftyK;

	// @FindBy(xpath = "//*[@text='Select Pre-Approval']")
	@FindBy(xpath = "*//android.view.View[3]//android.view.View[2]//android.view.View[1]//android.view.View[2]//android.view.View[2]")
	public static WebElement preApprovalList;

	@FindBy(xpath = "//li[text()='Pre-approved']")
	public static WebElement preApproved;

	@FindBy(xpath = "//li[text()='Not pre-approved']")
	public static WebElement notPreApproved;

	@FindBy(xpath = "//li[text()='Cash buyer']")
	public static WebElement cashBuyer;

	// @FindBy(xpath = "/*[@text='Select Timeframe']")
	@FindBy(xpath = "*//android.view.View[3]//android.view.View[2]//android.view.View[1]//android.view.View[3]//android.view.View[2]")
	public static WebElement timeFrameList;

	@FindBy(xpath = "//li[text()='Now']")
	public static WebElement timeFrameNow;

	@FindBy(xpath = "//li[text()='1-3 months']")
	public static WebElement threeMonths;

	@FindBy(xpath = "//li[text()='3-6 Months']")
	public static WebElement sixMonths;

	@FindBy(xpath = "//li[text()='6+ Months']")
	public static WebElement morethanSixMonths;

	@FindBy(xpath = "//div[contains(@class,'selective-cancel')]")
	public static WebElement cancelSelectiveView;

	@FindBy(xpath = "//div[contains(@ng-click, 'screen.save(screen.client)') and normalize-space(text())='Add Client']")
	public static WebElement addClient;

	@FindBy(xpath = "*//android.view.View[1]/android.view.View[3]/android.widget.EditText[1]")
	public static WebElement clientTabSearch;

	@FindBy(xpath = "*//android.view.View[3]//android.view.View[2]//android.widget.ListView[1]//android.view.View[1]//android.view.View[2]")
	public static WebElement searchResultBuyerCard;

	// ----- CLient Stages Objects ------ //

	@FindBy(xpath = "//*[@text='CLAIMED']")
	public static WebElement statusClaimed;

	@FindBy(xpath = "//*[@text='IN CONTACT']")
	public static WebElement statusInContact;

	@FindBy(xpath = "//*[@text=\"Stage\"]")
	public static WebElement stageChangeDropdown;

	@FindBy(xpath = "//*[@text=\"In Contact\"]")
	public static WebElement stageInContact;

	@FindBy(xpath = "//div[contains(@class, 'ng-binding') and normalize-space(text())='Update']")
	public static WebElement buttonUpdateStage;

	@FindBy(xpath = "//*[@text=\"Loading Client\"]")
	public static WebElement toastClientLoading;

	// ----- Auto Bundle Cards ----- //

	@FindBy(xpath = "//*[@text=\"Steps For Success\"]")
	public static WebElement cardHeader;

	@FindBy(xpath = "*[@text=\"Help your client save\"]")
	public static WebElement autoBundleCardHeader;

	@FindBy(xpath = "//*[@text=\"Calculate client's savings\"]")
	public static WebElement buttonCalculateSavings;

	@FindBy(xpath = "//*[@text=\"Calculate Savings\"]")
	public static WebElement pageCalculateSavings;

	@FindBy(xpath = "*//android.view.View[3]//android.view.View[1]//android.view.View[4]//android.view.View[1]//android.view.View[2]")
	public static WebElement saveAmountInCSP;

	@FindBy(xpath = "//*[@text=\"YOUR CLIENT SAVES UP TO\"]")
	public static WebElement clientSavesUpto;

	@FindBy(xpath = "//*[@text=\"Buy & Sell with Owners.com\"]")
	public static WebElement cardBuyAndSell;

	@FindBy(xpath = "*//android.view.View[3]//android.view.View[2]//android.view.View[1]//android.view.View[3]")
	public static WebElement buySellCardDeatils;

	@FindBy(xpath = "*//android.view.View[3]//android.view.View[2]//android.view.View[2]//android.view.View[3]")
	public static WebElement ownersLoanCardDetails;

	@FindBy(xpath = "//*[@text=\"Finance with Owners.com Loans\"]")
	public static WebElement cardFinanceWithOwners;

	@FindBy(xpath = "//*[@text=\"Confirm Selected Offers\"]")
	public static WebElement buttonConfirmSelectedOffer;

	@FindBy(xpath = "//*[@text=\"Share This Bundle with Your Client\"]")
	public static WebElement buttonShareThisBundle;

	@FindBy(xpath = "*//android.view.View[3]//android.view.View[1]//android.view.View[4]//android.view.View[1]//android.view.View[2]")
	public static WebElement clientPageSaveAmount;

	@FindBy(xpath = "//*[@text=\"Share\"]")
	public static WebElement clientPageShareButton;

	@FindBy(xpath = "//*[@text=\"Not interested\"]")
	public static WebElement buttonNotInterested;

	@FindBy(xpath = "//*[@text=\"Refer client\"]")
	public static WebElement buttonReferClient;

	@FindBy(xpath = "//*[@text=\"CALCULATE AGAIN\"]")
	public static WebElement buttonCalculateAgain;

	@FindBy(xpath = "//*[@text=\"\"]")
	public static WebElement buttonCardExpandCollpase;

	@FindBy(xpath = "//android.view.View[@text='Share offer with client']")
	public static WebElement dialogueShareOffer;

	@FindBy(xpath = "//android.view.View[@text='Send SMS']")
	public static WebElement sendSMSOption;

	@FindBy(xpath = "//android.view.View[@text='Send Email']")
	public static WebElement sendEmailOption;

	@FindBy(xpath = "//div[contains(@class, 'screen-slide-up-cancel') and normalize-space(text())='Cancel']")
	public static WebElement buttonCancelShareOffer;

	@FindBy(xpath = "*//android.view.View[1]//android.view.View[3]//android.view.View[1]")
	public static WebElement inAppEmailEditor;

	@FindBy(xpath = "*//android.view.View[3]//android.view.View[2]//android.view.View[4]//android.view.View[2]//android.view.View[1]//android.view.View[3]")
	public static WebElement buySellSaveAmountInCDP;

	@FindBy(xpath = "*//android.view.View[3]//android.view.View[2]//android.view.View[4]//android.view.View[2]//android.view.View[2]//android.view.View[3]")
	public static WebElement financeSaveAmountInCDP;

	@FindBy(xpath = "//*[@text='Share']")
	public static WebElement shareButtonInCDP;

	@FindBy(xpath = "//*[@text='Not interested']")
	public static WebElement notInterestedButtonInCDP;

	@FindBy(xpath = "//*[@text='Get started']")
	public static WebElement getStartedButtonInCDP;

	@FindBy(xpath = "//*[@text=\"Refer client\"]")
	public static WebElement referClientButtonInCDP;
	
	
	/*
	 *  ----------NEW------------
	 * 
	 */
	
	
	
	@FindBy(xpath="//android.view.View[contains(@text, 'Review Bundle Offers')]")
	public static WebElement ReviewBundleOffers;
	
	@FindBy(xpath="//android.widget.EditText[contains(@text,'Hi Automation')]")
	public static WebElement SmsBody;
	
	@FindBy(xpath="//android.view.View[contains(@text,'Hi Automation,')]")
	public static WebElement emailBody;
	
	@FindBy(xpath="//android.widget.EditText[@text='Save big when you buy and sell with us']")
	public static WebElement emailSubject;
	
	@FindBy(xpath="//android.view.View[@text='']")
	public static WebElement backButtonEmailEditor;
		
	@FindBy(xpath="//android.view.View[@text='By using Owners.com and our preferred partners to buy, sell, finance and close, they'll receive up to $2,500at closing.']")
	public static WebElement OwnersComMessage;
	
	@FindBy(xpath="//android.view.View[@text='Learn more']")
	public static WebElement LearnMore;
	
	@FindBy(xpath="//android.view.View[@text='SAVINGS']")
	public static WebElement Savings;
	
	@FindBy(xpath="//android.view.View[@text='']")
	public static WebElement BundleOfferCrossMark;
	
	@FindBy(xpath="//android.view.View[@text='Buy and Sell with Owners.com']")
	public static WebElement BuyAndSellwithOwners;
	
	@FindBy(xpath="//android.view.View[@text='Finance with Owners.com Loans']")
	public static WebElement FinanceWithOwners;
	
	@FindBy(xpath="//android.view.View[@text='Close smarter with Premium Title']")
	public static WebElement CloseSmarter;
	
	@FindBy(xpath="//android.view.View[@text='Share offer with client']")
	public static WebElement ShareOfferWithClient;
	
	
	@FindBy(xpath="//android.view.View[@text='']")
	public static WebElement ButtonShare;
	
	@FindBy(xpath="//android.view.View[@text='Buy and sell']")
	public static WebElement BuyandSell;
	
	@FindBy(xpath="//android.view.View[@text='Owners.com Loans']")
	public static WebElement OwnersLoans;
	
	@FindBy(xpath="//android.view.View[@text='Premium Title Service']")
	public static WebElement PremiumTitleService;
	
	@FindBy(xpath="//android.view.View[@text='Cancel']")
	public static WebElement Cancel;
	
	
	
	@FindBy(id="com.samsung.android.messaging:id/editor_body")
	public static WebElement MessageBodyField;
	
	@FindBy(id="Send sim 1")
	public static WebElement Sendsms;
	
	@FindBy(id="Navigate up")
	public static WebElement SmsBack;
	
	
//	SMSTextBuy="Hi Automation Just wanted to send over some more information about how you can save money when you buy and sell with us. Here’s how it works: https://services.owners.com/bundle/"
//	EmailText="Hi Automation, I wanted to follow up with some more information about how you can save by letting Owners.com handle every step of your home purchase. If you plan to sell your current place, consider sticking with an Owners.com agent. They’ll be with you every step of the way, from helping you choose the strongest offer to navigating the inspection. The best part: You could save up to $1000 at closing when you buy and sell with us. Interested in learning more? Visit https://services.owners.com/bundle/ to"
//	OCLSmsText ="Hi Automation Just in case you’re still looking for a lender, here’s some info about how you can save money at closing when you work with one of our preferred providers. Take a look and let me know what you think: https://services.owners.com/bundle/"
//	OCLEmailSubject="Use Owners.com Loans to find a lender and save"
//	PTSSMSText="Hi Automation Following up with some more info about our preferred provider for closing services, Premium Title. They make the process really easy to understand. You can find out more about them here: https://services.owners.com/bundle/"
//	PTSEmailSub="Closing made simple"
//	OCLPTSEmailSub="Financing and closing made simple"
//	OCLBUYSellSub="Here's how much you can save at closing"
//	BuySellPTSSub="Get home faster when you buy, sell + close with us"
//	BuyOClPTSSub="Want to save big at closing? Here's how"
//	OCLPTSSMS="Hi Automation Following up to remind you that by using Owners.com Loans to find a lender you could save hundreds at closing. To make things even easier, I’m also including some info about our preferred closing service. Here’s how it all works: https://services.owners.com/bundle/"
//	OCLBUYSMS="Hi Automation I’m just reaching out to remind you that you could save thousands when you buy and sell with us and use our preferred provider for financing. Here’s some info on how it works: https://services.owners.com/bundle/"
//	BuyPTSSMS="Hi Automation Sending over some info about how you can save money and time when you buy and sell with us and close with one of our preferred providers. Take a look and let me know what you think: https://services.owners.com/bundle/"		
//	BuyOCLPTSSms="Hi Automation Following up with some more information about how you can save thousands at closing when you buy and sell with us, and finance and close with our preferred providers. Here’s some additional info if you’re interested: https://services.owners.com/bundle/"
			
	@FindBy(xpath="//android.view.View[@text='OK']")
	public static WebElement OK;
	
	@FindBy(xpath="//android.view.View[@text='SMS Sent!']")
	public static WebElement SMSSent;
	
	@FindBy(xpath="//android.view.View[@text='Email Sent!']")
	public static WebElement EmailSent;
	
	@FindBy(xpath="//android.view.View[@text='From']")
	public static WebElement From;
	
	@FindBy(xpath="//android.view.View[@text='YES']")
	public static WebElement Yes;
	
	@FindBy(xpath="//android.view.View[@text='SEND']")
	public static WebElement SEND;
	
	@FindBy(xpath="//android.widget.EditText[@text='Financing and closing made simple']")
	public static WebElement Financingandclosingmadesimple;
	
	@FindBy(xpath="//android.widget.EditText[@text='Closing made simple']")
	public static WebElement Closingmadesimple;
	
	@FindBy(xpath="//android.widget.EditText[contains(@text,'how much you can save at closing')]")
	public static WebElement Herehowmuchyoucansaveatclosing;
	
	@FindBy(xpath="//android.widget.EditText[@text='Get home faster when you buy, sell + close with us']")
	public static WebElement Gethomefasterwhenyoubuysellclosewithus;
	
	@FindBy(xpath="//android.widget.EditText[contains(@text,'Want to save big at closing?')]")
	public static WebElement WanttosavebigatclosingHerehow;

	
	@FindBy(xpath="//android.view.View[@text='$750']")
	public static WebElement $750;
	
	@FindBy(xpath="//android.view.View[@text='$1,000']")
	public static WebElement $1000;
	
	@FindBy(xpath="//android.view.View[@text='Bundle Offers']")
	public static WebElement BundleOffers;
	
	@FindBy(xpath="//android.widget.EditText[@text='Use Owners.com Loans to find a lender and save']")
	public static WebElement UseOwnersLoanstofindalender;
	
	
	@FindBy(xpath="//android.view.View[@text='Never Viewed']")
	public static WebElement NeverViewed;

	
	@FindBy(xpath="//*[contains(@text,'innovative tech')]")
	public static WebElement PremiumTitleinnovativetechandmobile;
	
	@FindBy(xpath="//*[contains(@text,'Your client ')]")
	public static WebElement Yourclientdoesnthavetogoitalone;
	
	@FindBy(xpath="//*[contains(@text,'Make selling simple too')]")
	public static WebElement Makesellingsimple;

	
	@FindBy(xpath="//android.view.View[@text='Get started']")
	public static WebElement Getstarted;
	
}
