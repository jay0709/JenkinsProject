package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AndroidLoginPage_OR {

	@FindBy(xpath = "//android.view.View[@text='Skip']")
	public static WebElement SkipLink;

	@FindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	public static WebElement Allow;

	@FindBy(xpath = "//android.widget.Button[@text='SIGN IN']")
	public static WebElement btnSignIn;

	//image
	//android.widget.ImageView[@index='0']
}
