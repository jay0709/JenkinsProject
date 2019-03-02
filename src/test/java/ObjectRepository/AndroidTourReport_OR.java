package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AndroidTourReport_OR {
	
    @FindBy(xpath="//android.view.View[@text='START TOUR REPORT']")
	public static WebElement StartTourReportWelcomePageButton;
	
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[3]/android.widget.ListView/android.view.View[2]/android.widget.EditText")
	public static WebElement CommentBox;
	
	@FindBy(xpath="//android.view.View[@text='Continue']")
	public static WebElement ContinueButton;
	
	@FindBy(xpath="//android.widget.Image[@text='add-photo-blue']")
	public static WebElement CameraIcon;
	
	@FindBy(xpath="//android.widget.Image[@text='dislike-filled-blue']")
	public static WebElement ImageDislike;
	
	@FindBy(xpath="//android.widget.Image[@text='like-filled-blue']")
	public static WebElement ImageLike;
	
	@FindBy(xpath="//android.widget.Image[@text='note-filled']")
	public static WebElement CommentCount;
	
	@FindBy(xpath="//android.widget.Image[@text='photo']")
	public static WebElement ImageCount;
	
	@FindBy(xpath="//android.view.View[@text='YES']")
	public static WebElement StartReportYesButton;
	
	@FindBy(xpath = "//android.view.View[@text='Done']")
	public static WebElement Done;
	
	@FindBy(xpath = "//android.view.View[@text='']")
	public static WebElement SendButton;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[9]/android.widget.ListView/android.view.View[2]")
	public static WebElement RatingButton;
	
	//@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[3]/android.widget.ListView/android.view.View[2]/android.widget.EditText")

	@FindBy(xpath = "//android.view.View[@text='Call Buyer']")
	public static WebElement CallBuyer;
	
	@FindBy(xpath = "//android.widget.TextView[@text='5']")
	public static WebElement Dialer5;
	
	@FindBy(xpath = "//android.view.View[@text='NO']")
	public static WebElement No;
	
	@FindBy(xpath = "//android.view.View[@text='Edit']")
	public static WebElement Edit;
	
	@FindBy(xpath = "//android.view.View[@text= 'Change Date / Time']")
	public static WebElement ChangeDateTime;
	
	@FindBy(xpath = "//android.view.View[@text= 'Change Location']")
	public static WebElement ChangeLocation;
	
	@FindBy(xpath = "//android.view.View[@text='']")
	public static WebElement CancelSearch;
	
	@FindBy(xpath = "//android.view.View[@text='No Matching Listings']")
	public static WebElement NoMatchingListings;
	
	@FindBy(xpath = "//android.view.View[@text='UPDATE LOCATION']")
	public static WebElement UpdateLocation;
	
	@FindBy(id = "android:id/button1")
	public static WebElement CalendarOK;
	
	@FindBy(id = "android:id/button2")
	public static WebElement CalendarCancel;
	
	@FindBy(xpath = "//android.view.View[@text='Tour Updated']")
	public static WebElement TourUpdated;
	
	@FindBy(xpath = "//android.view.View[contains(@text,'The tour has been rescheduled')]")
	public static WebElement TourRescheduled;
	
	@FindBy(xpath = "//android.view.View[@text='OVERDUE']")
	public static WebElement OVERDUE;
	
	@FindBy(xpath = "//android.view.View[@text='']")
	public static WebElement ThreeDot;
	
	@FindBy(xpath = "//android.view.View[@text='More Options']")
	public static WebElement MoreOptions;
	
	@FindBy(xpath = "//android.view.View[@text='Show Client Details']")
	public static WebElement ShowClientDetails;
	
	@FindBy(xpath = "//android.view.View[@text='Deletes']")
	public static WebElement Delete;
	
	@FindBy(xpath = "//android.view.View[@text='Enter Task Related Notes']")
	public static WebElement EnterTaskRelatedNotes;
	
	@FindBy(xpath = "//android.view.View[@text='Location']")
	public static WebElement Location;
	
	@FindBy(xpath = "//android.view.View[@text='28']")
	public static WebElement Calander28;
	
	@FindBy(xpath = "//android.view.View[@text='Why are you deleting this task?']")
	public static WebElement Whyareyoudeletingthistask;
	
	@FindBy(xpath = "//android.widget.RadioButton[contains(@text,'Buyer communicated')]")
	public static WebElement BuyerCommunicated;
	
	@FindBy(xpath = "//android.widget.RadioButton[@text='This time no longer works for my schedule']")
	public static WebElement ThisTimeNoLonger;
	
	@FindBy(xpath = "//android.widget.RadioButton[@text='Buyer was a no show']")
	public static WebElement Buyerwasanoshow;
	
	@FindBy(xpath = "//android.widget.RadioButton[@text='The property is no longer available']")
	public static WebElement Thepropertyisnolongeravailable;
	
	@FindBy(xpath = "//android.widget.RadioButton[@text='The listing agent had to change our scheduled appointment']")
	public static WebElement TheListingAgent;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.view.View[2]/android.widget.ListView/android.view.View[6]/android.view.View")
	public static WebElement Other;
	
	@FindBy(xpath = "//android.view.View[@text='DELETE TASK']")
	public static WebElement DELETETASK;
	
	@FindBy(xpath = "//android.view.View[@text='RESCHEDULE']")
	public static WebElement RESCHEDULE;
	
	@FindBy(xpath = "//android.view.View[@text='Would you rather reschedule with a new date and time?']")
	public static WebElement Wouldyouratherreschedule;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.EditText")
	public static WebElement ReasontoDelete;
	
	@FindBy(xpath = "//android.view.View[@text='Deleted']")
	public static WebElement Deleted;
	
	@FindBy(xpath = "//android.view.View[@text='Appointment has been deleted successfully']")
	public static WebElement Appointmenthasbeendeletedsuccessfully;
	
	@FindBy(xpath = "//android.view.View[@text='']")
	public static WebElement CancelDelete;
	
	@FindBy(xpath = "//android.view.View[@text='']")
	public static WebElement ClientArrow;
	
	
//	
	
	
	
	
	
	
	
	
	

}
