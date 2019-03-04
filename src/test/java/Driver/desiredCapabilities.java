/**
* 
*/
package Driver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import ObjectRepository.AndroidAutoBundleV1_OR;
import ObjectRepository.AndroidAutoBundle_OR;
import ObjectRepository.AndroidClientDetailsPage_OR;
import ObjectRepository.AndroidClientPage_OR;
import ObjectRepository.AndroidHomePage_OR;
import ObjectRepository.AndroidLoginPage_OR;
import ObjectRepository.AndroidTemplates_OR;
import ObjectRepository.AndroidTourReport_OR;
import ObjectRepository.AutoBundleTestScenarioes_OR;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * @author isaacindeevervemula
 *
 */
//@Parameters({"port","device"})
public class desiredCapabilities {
	public static AppiumDriver<MobileElement> driver;
	public static WebDriverWait wait;
	PropertyData prop = new PropertyData();
	// public String username = "isaacindeevervem1";
	// public static String accessKey = "8sxjEpfRKJaw84cfA8Kb";

	public String username = "syedmehdi2";
	public static String accessKey = "4BpkRSWcgPrG4ywH9V6S";

	String app = "bs://b3f49767bf61e651a62a70f5e914386914ef796a";
	String appiOS = "bs://07a33c9c802e1d55904f4268c08c946634c90ff4";

	public void BrowserStack() throws MalformedURLException, InterruptedException {
		if (prop.platformName.equalsIgnoreCase("Android")) {
			final DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("device", "Google Nexus 6");
			capabilities.setCapability("os_version", "6.0");
			capabilities.setCapability("app", "MyApp");
			capabilities.setCapability("browserstack.debug", "true");
			capabilities.setCapability("automationName", "Appium");
			driver = new AndroidDriver<MobileElement>(
					new URL("https://" + username + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"),
					capabilities);
			wait = new WebDriverWait(driver, 20);
			System.out.println("Initialize: " + driver);
		} else {
			final DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("device", "iPhone 7 Plus");
			capabilities.setCapability("os_version", "10.3");
			capabilities.setCapability("app", appiOS);
			capabilities.setCapability("browserstack.debug", "true");
			driver = new IOSDriver<MobileElement>(
					new URL("http://" + username + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"),
					capabilities);
		}

	}

	public void SetDesiredCapabilities() throws MalformedURLException, InterruptedException {

		if (prop.platformName.equalsIgnoreCase("Android")) {
			 final File appDir = new File("/Users/Jayabrata/Downloads/Automation/App/");
			 final File app = new File(appDir, "android-debug_2602.apk");
			final DesiredCapabilities capabilities = new DesiredCapabilities();
			String ANDROID_DEVICE_SOCKET = "com.owners.agentinteg" + "_devtools_remote";
			//String ANDROID_DEVICE_SOCKET = "com.owners.agentqa" + "_devtools_remote";

			capabilities.setCapability("deviceName", "Owners A8+");
			capabilities.setCapability("udid", "192.168.57.101:5555"); // 35870641 //5200d930ec16c45d 
			capabilities.setCapability("platformVersion", "9.0");
			capabilities.setCapability("platformName", "Android");
			//capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW, false);
			capabilities.setCapability("setWebContentsDebuggingEnabled", "true");
			capabilities.setCapability("chromeBundleId", "com.android.chrome");
			capabilities.setCapability("appPackage", "com.owners.agentinteg");
			capabilities.setCapability("automationName", "UiAutomator2");
			capabilities.setCapability("appActivity", ".MainActivity");
			capabilities.setCapability("instrumentApp", true);
			capabilities.setCapability("androidDeviceSocket", ANDROID_DEVICE_SOCKET);
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

			wait = new WebDriverWait(driver, 20);
			System.out.println("Initialize: " + driver);

			PageFactory.initElements(driver, AndroidLoginPage_OR.class);
			PageFactory.initElements(driver, AndroidHomePage_OR.class);
			PageFactory.initElements(driver, AndroidAutoBundle_OR.class);
			PageFactory.initElements(driver, AndroidAutoBundleV1_OR.class);
			PageFactory.initElements(driver, AndroidClientPage_OR.class);
			PageFactory.initElements(driver, AndroidTemplates_OR.class);
			PageFactory.initElements(driver, AndroidTourReport_OR.class);
			PageFactory.initElements(driver, AndroidClientDetailsPage_OR.class);
			PageFactory.initElements(driver, AutoBundleTestScenarioes_OR.class);
		} else {
			// final File appDir = new File("/Users/syedzubairmehdi/Desktop");
			// final File app = new File(appDir,"OwnersAgent_2611.ipa");
			final DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", "Owners iPhone");
			// capabilities.setCapability("deviceName", "iPhone Simulator");
			capabilities.setCapability("platformName", "iOS");
			capabilities.setCapability("platformVersion", "12.1");
			// capabilities.setCapability("platformVersion", "11.1");
			capabilities.setCapability("udid", "d65a23cce96269b7a6b162e5bd8dcf0a6a82447a");// fc1650f37d318a2b3c0399db133ff76209c5a6bc
			// capabilities.setCapability("udid",
			// "66b0c7f772fccab38d99ac18199f2e33cd86eaad");
			// capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("bundleId", "com.owners.agentinteg");
			capabilities.setCapability("appPackage", "com.owners.agentinteg");
			capabilities.setCapability("appActivity", ".MainActivity");
			capabilities.setCapability("automationName", "XCUITest");
			// capabilities.setCapability("useNewWDA", true);

			// new capabilities
//            capabilities.setCapability("clearSystemFiles",true);
//            capabilities.setCapability("wdaStartupRetryInterval",1000);
//            capabilities.setCapability("useNewWDA",true);
//            capabilities.setCapability("waitForQuiescence",false);
//            capabilities.setCapability("shouldUseSingletonTestManager",false);

			driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			PageFactory.initElements(driver, AndroidLoginPage_OR.class);
		}
	}

	public void iPhone5() throws MalformedURLException, InterruptedException {
		final File appDir = new File("/Users/syedzubair/Desktop");
		final File app = new File(appDir, "Owners.ipa");
		final DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "iPhone5");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "11.0");
		capabilities.setCapability("udid", "fc1650f37d318a2b3c0399db133ff76209c5a6bc");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("bundleId", "com.Owners.Owners.com");
		capabilities.setCapability("appPackage", "com.owners.agentqa");
		capabilities.setCapability("appActivity", ".MainActivity");
		capabilities.setCapability("automationName", "XCUITest");
		driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}

	public AppiumDriver<MobileElement> getAndroidDriver() {
		return driver;
	}

	public WebDriverWait getWebDriverWait() {
		return wait;
	}
}
