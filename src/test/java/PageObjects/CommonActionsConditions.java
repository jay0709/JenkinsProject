package PageObjects;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Driver.desiredCapabilities;
import ObjectRepository.AndroidHomePage_OR;
import ObjectRepository.AndroidTemplates_OR;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

/**
 * Wait and Verification Conditions.
 * 
 * @author Abhishek Singh
 * 
 */

public class CommonActionsConditions extends desiredCapabilities {

	/************************
	 * Override Verification methods.
	 ****************************/

	/**
	 * 
	 * @param actual
	 * @param expected
	 */
	public static void assertEquals(Object actual, Object expected, String message) {
		Assert.assertEquals(actual, expected, message);
	}

	/**
	 * 
	 * @param actual
	 * @param expected
	 */
	public static void assertEquals(String actual, String expected, String message) {
		Assert.assertEquals(actual, expected, message);
	}

	/**
	 * 
	 * @param actual
	 * @param expected
	 */
	public static void assertEquals(String actual, String[] expected, String message) {
		Assert.assertEquals(actual, expected, message);
	}

	/**
	 * 
	 * @param actual
	 * @param expected
	 */
	public static void assertEquals(String[] actual, String[] expected, String message) {
		Assert.assertEquals(actual, expected, message);
	}

	/**
	 * 
	 * @param actual
	 * @param expected
	 */
	public static void assertNotEquals(Object actual, Object expected, String message) {
		Assert.assertNotEquals(actual, expected, message);
	}

	/**
	 * 
	 * @param condition
	 */
	public static void assertTrue(boolean condition, String message) {
		Assert.assertTrue(condition, message);
	}

	/**
	 * 
	 * @param condition
	 */
	public static void assertFalse(boolean condition, String message) {
		Assert.assertFalse(condition, message);
	}

	/**
	 * 
	 * @param condition
	 */
//    public static void verifyTrue(boolean condition, String message) {
//    	//boolean flag;
//        try {
//            assertTrue(condition, message);
//            //flag = true;
//            logger.log(Status.PASS, "Verification PASSED");
//        } catch (Throwable e) {
//        	driver.addVerificationFailure(e);
//            //flag = false;
//        	logger.log(Status.FAIL, "Verification "+message+" FAILED - "+e.getMessage());
//        }
//    }

	/**
	 * 
	 * @param condition
	 */
//    public static void verifyFalse(boolean condition, String message) {
//    	//boolean flag;
//        try {
//            assertFalse(condition, message);
//            //flag = true;
//            logger.log(Status.PASS, "Verification PASSED");
//        } catch (Throwable e) {
//        	Drivers.addVerificationFailure(e);
//            //flag = false;
//        	logger.log(Status.FAIL, "Verification "+message+" FAILED - "+e.getMessage());
//        }
//    }

	/**
	 * 
	 * @param actual
	 * @param expected
	 */
//   public static void verifyEquals(Object actual, Object expected, String message) {
//    	//boolean flag;
//        try {
//            assertEquals(actual, expected, message);
//            //flag = true;
//            logger.log(Status.PASS, "Verification PASSED");
//        } catch (Throwable e) {
//        	Drivers.addVerificationFailure(e);
//            //flag = false;
//        	logger.log(Status.FAIL, "Verification "+message+" FAILED - "+e.getMessage());
//        }
//    }
//    
//    /**
//     * 
//     * @param actual
//     * @param expected
//     */
//    public static void verifyEquals(String actual, String expected, String message) {
//    	//boolean flag;
//        try {
//            assertEquals(actual, expected, message);
//            //flag = true;
//            logger.log(Status.PASS, "Verification PASSED");
//        } catch (Throwable e) {
//        	Drivers.addVerificationFailure(e);
//            //flag = false;
//        	logger.log(Status.FAIL, "Verification "+message+" FAILED - "+e.getMessage());
//        }
//    }
//    
//    /**
//     * 
//     * @param actual
//     * @param expected
//     */
//    public static void verifyEquals(String[] actual, String[] expected, String message) {
//    	//boolean flag;
//        try {
//            assertEquals(actual, expected, message);
//            //flag = true;
//            logger.log(Status.PASS, "Verification PASSED");
//        } catch (Throwable e) {
//        	Drivers.addVerificationFailure(e);
//            //flag = false;
//        	logger.log(Status.FAIL, "Verification "+message+" FAILED - "+e.getMessage());
//        }
//    }
//    
//    /**
//     * 
//     * @param actual
//     * @param expected
//     */
//    public static void verifyNotEquals(Object actual, Object expected, String message) {
//    	//boolean flag;
//        try {
//        	assertNotEquals(actual, expected, message);
//            //flag = true;
//            logger.log(Status.PASS, "Verification PASSED");
//        } catch (Throwable e) {
//        	Drivers.addVerificationFailure(e);
//            //flag = false;
//            logger.log(Status.FAIL, "Verification "+message+" FAILED - "+e.getMessage());
//        }
//    }
//	
//    /**
//     * Wait for the element to be present in the DOM, and displayed on the page.
//     * And returns the first WebElement using the given method.
//     *
//     * @param WebDriver        The driver object to be used
//     * @param By        selector to find the element
//     * @param int        The time in seconds to wait until returning a failure
//     *
//     * @return WebElement        the first WebElement using the given method, or null (if the timeout is reached)
//     */
//    public static WebElement waitForElementPresent(WebElement webElement) {
//        try{
//        	WebDriverWait wait = new WebDriverWait(webDriver, explicitWaitInSeconds);
//        	webElement = wait.until(ExpectedConditions.visibilityOf(webElement));
//        	return webElement; //return the element        
//        } catch (Exception e) {
//        	e.printStackTrace();
//        }
//        return null;
//    }
//   
//    
//    /**
//     * wait for element to be presented with text
//     */
//    /**
//     * Wait for the element to be present in the DOM, and displayed on the page.
//     * And returns the first WebElement using the given method.
//     *
//     * @param WebDriver        The driver object to be used
//     * @param By        selector to find the element
//     * @param int        The time in seconds to wait until returning a failure
//     *
//     * @return WebElement        the first WebElement using the given method, or null (if the timeout is reached)
//     */
//    public static WebElement waitForElementClickable(WebElement webElement) {
//        try{
//        	WebDriverWait wait = new WebDriverWait(webDriver, explicitWaitInSeconds);
//        	webElement = wait.until(ExpectedConditions.elementToBeClickable(webElement));
//        	return webElement; //return the element        
//        } catch (Exception e) {
//        	e.printStackTrace();
//        }
//        return null;
//    }
//    
//    /**
//     * Wait for the element to be present in the DOM, and displayed on the page.
//     * And returns the first WebElement using the given method.
//     *
//     * @param WebDriver        The driver object to be used
//     * @param By        selector to find the element
//     * @param int        The time in seconds to wait until returning a failure
//     *
//     * @return WebElement        the first WebElement using the given method, or null (if the timeout is reached)
//     */
//    public static WebElement waitForElementClickable(WebDriver webDriver, WebElement webElement) {
//        try{
//        	WebDriverWait wait = new WebDriverWait(webDriver, explicitWaitInSeconds);
//        	webElement = wait.until(ExpectedConditions.elementToBeClickable(webElement));
//        	return webElement; //return the element        
//        } catch (Exception e) {
//        	e.printStackTrace();
//        }
//        return null;
//    }
//    
//    /**
//     * Wait for an element to appear on the refreshed web-page.
//     * And returns the first WebElement using the given method.
//     *
//     * This method is to deal with dynamic pages.
//     *
//     * Some sites I (Mark) have tested have required a page refresh to add additional elements to the DOM.
//     * Generally you (Chon) wouldn't need to do this in a typical AJAX scenario.
//     *
//     * @param WebDriver        The driver object to use to perform this element search
//     * @param aLocator        selector to find the element
//     * @param int        The time in seconds to wait until returning a failure
//     *
//     * @return WebElement        the first WebElement using the given method, or null(if the timeout is reached)
//     *
//     */
//     public static WebElement waitForElementRefresh(final WebElement webElement) {
//	    WebElement element;
//	    try{        
//	    	new WebDriverWait(webDriver, explicitWaitInSeconds) {}.until(new ExpectedCondition<Boolean>() {
//	    	 @Override
//	    	 public Boolean apply(WebDriver driverObject) {
//	    		 driverObject.navigate().refresh(); 					//refresh the page ****************
//	    		 return isElementDisplay(webElement);
//	    	 }
//	     });
//	     element = webElement;
//	     return element; 														//return the element
//	    } catch (Exception e) {
//	    	e.printStackTrace();
//	    }
//	    return null;
//     }
//     
//     /**
//      * Wait for the Text to be present in the given element, regardless of being displayed or not.
//      *
//      * @param WebDriver        The driver object to be used to wait and find the element
//      * @param aLocator        selector of the given element, which should contain the text
//      * @param String        The text we are looking
//      * @param int        The time in seconds to wait until returning a failure
//      *
//      * @return boolean
//      */
//     public static boolean waitForTextPresent(final WebElement webElement, final String text) {
//         boolean isPresent = false;
//         try{        
//        	 new WebDriverWait(webDriver, explicitWaitInSeconds) {}.until(new ExpectedCondition<Boolean>() {
//        		 @Override
//        		 public Boolean apply(WebDriver driverObject) {
//        			 return isTextPresent(webElement, text); //is the Text in the DOM
//        		 }
//        	 });
//        	 isPresent = isTextPresent(webElement, text);
//        	 return isPresent;
//         } catch (Exception e) {
//        	 e.printStackTrace();
//         }
//         return false;
//     }
//     
//     /**
//      * Waits for the Condition of JavaScript.
//      *
//      *
//      * @param WebDriver                The driver object to be used to wait and find the element
//      * @param String        The javaScript condition we are waiting. e.g. "return (xmlhttp.readyState >= 2 && xmlhttp.status == 200)"
//      * @param int        The time in seconds to wait until returning a failure
//      *
//      * @return boolean true or false(condition fail, or if the timeout is reached)
//      **/
//     public static boolean waitForJavaScriptCondition(final String javaScript) {
//         boolean jsCondition = false;
//         try{        
//        	 new WebDriverWait(webDriver, explicitWaitInSeconds) {}.until(new ExpectedCondition<Boolean>() {
//        		 @Override
//        		 public Boolean apply(WebDriver driverObject) {
//        			 return (Boolean) ((JavascriptExecutor) driverObject).executeScript(javaScript);
//        		 }
//        	 });
//        	 jsCondition = (Boolean) ((JavascriptExecutor) webDriver).executeScript(javaScript);
//        	 return jsCondition;
//         } catch (Exception e) {
//        	 e.printStackTrace();
//         }
//         return false;
//     }
//     
//     /** Waits for the completion of Ajax jQuery processing by checking "return jQuery.active == 0" condition.
//     *
//     * @param WebDriver - The driver object to be used to wait and find the element
//     * @param int - The time in seconds to wait until returning a failure
//     *
//     * @return boolean true or false(condition fail, or if the timeout is reached)
//     * */
//    public static boolean waitForJQueryProcessing(){
//        boolean jQcondition = false;
//        try{        
//        	new WebDriverWait(webDriver, explicitWaitInSeconds) {}.until(new ExpectedCondition<Boolean>() {
//        		@Override
//        		public Boolean apply(WebDriver driverObject) {
//        			return (Boolean) ((JavascriptExecutor) driverObject).executeScript("return jQuery.active == 0");
//        		}
//        	});
//        	jQcondition = (Boolean) ((JavascriptExecutor) webDriver).executeScript("return jQuery.active == 0");
//        	return jQcondition;
//        } catch (Exception e) {
//        	e.printStackTrace();
//        }
//        return jQcondition;
//    }
//
///**
//     * Checks if the text is present in the element.
//*
//     * @param driver - The driver object to use to perform this element search
//     * @param by - selector to find the element that should contain text
//     * @param text - The Text element you are looking for
//     * @return true or false
//     */
//    public static boolean isTextContain(WebElement webElement, String text)
//    {
//        try {
//        	webElement.getText().contains(text);
//        	return true;
//        } catch (NullPointerException e) {
//        	e.printStackTrace();
//        	return false;
//        }
//    }
//    
// /**
//     * Checks if the text is present in the element.
//*
//     * @param driver - The driver object to use to perform this element search
//     * @param by - selector to find the element that should contain text
//     * @param text - The Text element you are looking for
//     * @return true or false
//     */
//    public static boolean isTextPresent(WebElement webElement, String text)
//    {
//        try {
//        	webElement.getText().equals(text);
//        	return true;
//        } catch (NullPointerException e) {
//        	e.printStackTrace();
//        	return false;
//        }
//    }
//    
//    public static String getElementText(WebElement webElement)
//    {
//    	System.out.println("Element text: "+webElement.getText());
//    	return webElement.getText();
//    }
//
//    /**
//     * Checks if the element is in the DOM, regardless of being displayed or not.
//     *
//     * @param driver - The driver object to use to perform this element search
//     * @param by - selector to find the element
//     * @return boolean
//     */
//    public static boolean isElementPresent(WebElement webElement) {
//        try {
//        	if (webElement != null)	//if it does not find the element throw NoSuchElementException, which calls "catch(Exception)" and returns false;
//        	return true;
//        } catch (NoSuchElementException e) {
//        	e.printStackTrace();
//        	return false;
//        }
//		return false;
//    }
//
//    /**
//     * Checks if the List<WebElement> are in the DOM, regardless of being displayed or not.
//     *
//     * @param driver - The driver object to use to perform this element search
//     * @param by - selector to find the element
//     * @return boolean
//     */
//    public static boolean areElementsPresent(Set<WebElement> webElements) {
//        try {
//        	if (webElements != null)
//        	return true;
//        } catch (NoSuchElementException e) {
//        	e.printStackTrace();
//        	return false;
//        }
//		return false;
//    }
//
//    /**
//     * Checks if the element is in the DOM and displayed.
//     *
//     * @param driver - The driver object to use to perform this element search
//     * @param by - selector to find the element
//     * @return boolean
//     */
//    public static boolean isElementDisplay(WebElement webElement) {
//        try {                        
//        	return webElement.isDisplayed();
//        	//return true;
//        } catch (NoSuchElementException e) {
//        	System.out.println("Element not displayed: "+e.getMessage());
//        	System.out.println("This stacktrace message for not locating element");
//        	//e.printStackTrace();
//        	return false;
//        }
//    }
//    
//    /**
//     * Checks if the Link is in the DOM and displayed.
//     *
//     * @param linkText - Link Text to check Link present.
//     * @return boolean
//     */
//    public static boolean isLinkPresent(String linkText) {
//        try {                        
//        	webDriver.findElement(By.linkText(linkText)).isDisplayed();
//        	return true;
//        } catch (NoSuchElementException e) {
//        	e.printStackTrace();
//        	return false;
//        }
//    }
//    
//    /**
//     * Verify whether Element enabled on current page or not.
//     * @param aLocator
//     * @return
//     */
//	public static boolean isElementEnabled(WebElement webElement){
//		if(webElement.isEnabled())
//			return true;
//		else
//			return false;
//	}
//	
//	/**
//	 * Verify whether Element selected in drop down on current page or not.
//	 * @param aLocator
//	 * @return
//	 */
//	public static boolean isElementSelected(WebElement webElement){
//		if(webElement.isSelected())
//			return true;
//		else
//			return false;
//	}
//	
//	/**
//	 * Use in Key word Framework - Verify whether object attribute present on current page or not.
//	 * @param webElement
//	 * @param aAttribute
//	 * @param aText
//	 * @return
//	 */
//	public static boolean isAttributePresent(WebElement webElement, String aAttribute, String aText) {
//		String fTextOut = webElement.getAttribute(aAttribute);
//		if (fTextOut.equals(aText)) {
//			return true;
//		} else {
//			return false; 
//		}
//	}
//	
//	/************************************ Common Actions ***********************************************\
//	/**
//	 * Fully loaded base URL
//	 * @param aURL
//	 */
//	public static void getBaseUrl(String aURL) {
//
//		webDriver.get(aURL);
//	}
//		
//	/**
//	 * Navigate to base URL
//	 * @param aURL
//	 */
//	public static void navigateToURL(String aURL) {
//
//		webDriver.navigate().to(aURL);
//	}
//	
//	public static void pageRefresh() {
//
//		webDriver.navigate().refresh();
//	}
//	
//	/**
//	 * Go one step Back
//	 */
//	public static void goBack() {
//
//		webDriver.navigate().back();
//	}
//	
//	/**
//	 * Hide the keyboard
//	 */
//	public static void hideKeyboard() {
//
//		androidDriver.hideKeyboard();
//	}
//	
//	/**
//	 * Go to Forward page
//	 */
//	public static void goForward() {
//
//		webDriver.navigate().forward();
//	}
//	
//	/**
//	 * Handle child windows and get focus on that.
//	 * @throws InterruptedException
//	 */
//	public static void childWindowHandler(String parentWindow) throws InterruptedException {
//		Set<String> allWindows;
//		do {
//			allWindows = webDriver.getWindowHandles();
//			Thread.sleep(1000);
//		}
//		while (allWindows.size()==1);
//		allWindows.remove(parentWindow);
//		String childWindow = allWindows.iterator().next();
//		webDriver.switchTo().window(childWindow);
//		webDriver.manage().window().maximize();
//		System.out.println("Child Window Title ::" + webDriver.getTitle());
//	}
//
//	/**
//	 * Handle Java Script Element and click to that Element.
//	 * @param elementID
//	 */
//	public static void handleJavaScript(String elementID) {
//
//		((JavascriptExecutor) webDriver)
//				.executeScript("document.getElementById('elementID').click();");
//	}
//	
//	/**
//	 * Handle Alert on current page.
//	 */
//	public static void handleAlert(){
//		Alert alert = webDriver.switchTo().alert();
//		//String alertMsg = alert.getText();
//		alert.accept();
//	}
//
//	/**
//	 * Handle new tab in same window of browser.
//	 * @param url
//	 */
////	public static void switchToTab(String url) {
////		new Actions(webDriver)
////				.sendKeys(webDriver.findElement(By.tagName(url)), Keys.CONTROL)
////				.sendKeys(webDriver.findElement(By.tagName(url)), Keys.NUMPAD2)
////				.build().perform();
////	}
//	
//	/**
//	 * Close the Drive instance
//	 */
//	public static void closeCurrentBrowser(){
//		webDriver.close();
//	}
//	
//    /**
//     * Reporter.log, log the messages to TestNG report
//     * @param msg
//     */
//    public static void logb(String msg){
//    	Reporter.log("<b>"+msg+"</b>");
//    }
//    
//    /**
//     * Reporter.log, log the messages to TestNG report
//     * @param msg
//     */
//    public static void log(String msg){
//    	Reporter.log(msg);
//    }
//    
//    /**
//     * sleep for given seconds
//     * 
//     * @param millis
//     */
//    public static void sleepForMillis(long millis){
//		try {
//			Thread.sleep(millis);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//    }
//    
//    /**
//     * Tab to element
//     * @param driver
//     * @param x
//     * @param y
//     * @return
//     */
//	@SuppressWarnings("rawtypes")
//	public static boolean tapElement(WebDriver driver, int x, int y) {
//		try {
//			sleepForMillis(1000);
//			//new TouchAction((MobileDriver) driver).tap(x, y).perform();
//			logger.log(Status.INFO, "element location found and action success");
//			return true;
//		} catch (Exception e) {
//			logger.log(Status.ERROR, "element not found");
//			e.printStackTrace();
//			return false;
//		}
//	}
//
//	/**
//	 * Switch to WebView context
//	 * 
//	 * @param driver
//	 */
	public void switchToWebView(AppiumDriver<MobileElement> driver) {

		Set<String> availableContexts = driver.getContextHandles();
		System.out.println("Total No of Context Found = " + availableContexts.size());
		System.out.println("Available Contexts: " + availableContexts);
		// driver.context("WEBVIEW");

		for (String context : availableContexts) {
			System.out.println("context: " + context);
			if (context.contains("WEBVIEW")) {
				System.out.println("Switching to Context: " + context);
				driver.context(context);
				System.out.println("Switched to Context: " + context);
				break;
			} else {
				System.out.println("Expected context not found");
			}
		}
	}

	/**
	 * Switch to Native context
	 * 
	 * @param driver
	 */
	public void switchToNativeApp(AppiumDriver<MobileElement> driver) {
		driver.context("NATIVE_APP");
		System.out.println("Context switched to " + "NATIVE_APP");
	}

//	
//	/**
//	 * 
//	 * @param webDriver
//	 */
//	public static void angularJsComponentHandle(WebDriver webDriver) {
//		NgWebDriver ngDriver;
//		System.out.println("Angular JS component loading");
//		ngDriver = new NgWebDriver((JavascriptExecutor) webDriver);
//		ngDriver.waitForAngularRequestsToFinish();
//		System.out.println("Angular JS component loaded");
//		webDriver.findElement(By.cssSelector("[ng-click='screen.addClient('buyer')']")).click();
//	}
//	
//	/**
//	 * Click on exact Text looking for.
//	 * 
//	 * @param text
//	 */
//	public static void clickTextElement(String text) {
//		Screen screen = new Screen();
//		Settings.OcrTextRead = true;
//		Settings.OcrTextSearch = true;
//		try {
//			screen.wait(text, 2).click();
//			System.out.println("'"+text+"' Text element found and click action success");
//			logger.log(Status.INFO, "'"+text+"' Text element found and click action success");
//		} catch (NullPointerException e) {
//			System.out.println("'Screen' object not initialized");
//			logger.log(Status.ERROR, "'Screen' object not initialized");
//			e.printStackTrace();
//		} catch (FindFailed e) {
//			System.out.println("'"+text+"' Text element not found");
//			logger.log(Status.ERROR, "'"+text+"' Text element not found");
//			e.printStackTrace();
//		}
//	}
//	
//	/**
//	 * 
//	 * @param pattern
//	 */
//	public static void clickImgElement(Pattern pattern) {
//		Screen screen = new Screen();
//
//		try {
//			screen.wait(pattern.similar((float) 0.7), 2).click();
//			System.out.println("Image element found and action success");
//			logger.log(Status.INFO, "Image element found and action success");
//		} catch (FindFailed e) {
//			System.out.println("Image element not found");
//			logger.log(Status.ERROR, "Image element not found");
//			e.printStackTrace();
//		}
//		sleepForMillis(800);
//	}
//	
//	/**
//	 * Type given text to Img input
//	 * @param pattern
//	 */
//	public static void sendKeyImgElement(Pattern pattern, String input) {
//		Screen screen = new Screen();
//		try {
//			screen.wait(pattern.similar((float) 0.7), 2).type(input);
//			System.out.println("Image element found and action success");
//			logger.log(Status.INFO, "Image element found and action success");
//		} catch (FindFailed e) {
//			System.out.println("Image element not found");
//			logger.log(Status.ERROR, "Image element not found");
//			e.printStackTrace();
//		}
//	}
//	
//	/**
//	 * Scroll the page till the specific text on the page
//	 * @param text
//	 * @param driver
//	 */
//	public void scrollToText(String text, AndroidDriver<AndroidElement> driver) {
//
//        try {
//        	 MobileElement radioGroup = (MobileElement) driver.findElementByAndroidUIAutomator(
//             		"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
//             				+ text + "\").instance(0))");
//             sleepForMillis(2000);
//             radioGroup.click();
//		} catch (Exception e) {
//			System.out.println("error ocured while scroll the page: ");
//			logger.log(Status.INFO, "AN error ocured while scroll the page: "+e.getMessage());
//		}
//        sleepForMillis(2000);
//        
//        webDriver.getPageSource();
//    }
//	
//	/**
//	 * Scroll the current page at target position.
//	 * @param x
//	 * @param y
//	 */
	public static void pageScrollDown(AppiumDriver<MobileElement> driver, int x, int y) throws WebDriverException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(" + x + ", " + y + ")");
	}

//	
//	/**
//	 * Scroll the page to the specific element
//	 * @param driver
//	 * @param fromElement
//	 * @param toElement
//	 */
//	public static void scrollPageAtElement(AndroidDriver<AndroidElement> driver, WebElement fromElement, WebElement toElement) {
//		
//		System.out.println("scrollPageAtElement: ");
//		//new TouchAction(driver).press(fromElement).waitAction().moveTo(toElement).release().perform();
//		System.out.println("Page scrolled");
//	}
//	
//	/**
//	 * Get the source code of the page
//	 */
//	public static void getPageSource() {
//		@SuppressWarnings("unused")
//		String currentPageSource = webDriver.getPageSource();
//		logger.log(Status.INFO, "getPageSource has been called");
//		System.out.println("getPageSource has been called");
//		//System.out.println("Current page source code: "+currentPageSource);
//	}
//	
//	/*
//	 * Scroll the page Bottom to Top till element
//	 */
//	public static void bottomTopScrollTillElement(AndroidDriver<AndroidElement> driver, WebElement element, double startYprc, double endYprc) {
//		
//	    System.out.println("Scroll Bottom to Top ...");
//	    int topY = element.getLocation().getY();
//	    int bottomY = topY + element.getSize().getHeight();
//	    int centerX = element.getLocation().getX() + (element.getSize().getWidth()/2);
//	    //new TouchAction(driver).press(centerX, bottomY).waitAction().moveTo(centerX, topY).release().perform();
//	    System.out.println("Page Scrolled...");
//	}
//	
//	/*
//	 * Scroll the page Bottom to Top 
//	 */
//	public static void bottomTopScroll(AndroidDriver<AndroidElement> driver, double startYprc, double endYprc) {
//		
//	    System.out.println("Scroll Bottom to Top ...");
//		Dimension size = driver.manage().window().getSize();
//	    int startX = size.width/2;
//	    int startY = (int) (size.height * startYprc);
//	    int endY = (int) (size.height * endYprc);
//	    
//	    System.out.println("Scroll: "+startX+", "+startY+", "+endY+" and Size: "+size);
//	    //new TouchAction(driver).press(startX, endY).waitAction().moveTo(startX, startY).release().perform();
//	    System.out.println("Page Scrolled...");
//	    sleepForMillis(1000);
//	    getPageSource();
//	}
//	
//	/*
//	 * Scroll the page Top to bottom
//	 */
	public void topBottomScroll(AppiumDriver<MobileElement> driver, double startYprc, double endYprc) {

		System.out.println("Scroll Top to bottom...");
		Dimension size = driver.manage().window().getSize();
		int startX = size.width / 2;
		int startY = (int) (size.height * startYprc);
		int endY = (int) (size.height * endYprc);

		System.out.println("Scroll: " + startX + ", " + startY + ", " + endY + " and Size: " + size);
		new TouchAction(driver).press(PointOption.point(startX, startY))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(100))).moveTo(PointOption.point(startX, endY))
				.release().perform();
		System.out.println("Page Scrolled...");
	}

//	
//	/*
//	 * Swipe right to left
//	 */
//	public static void swipeHorizontal(AndroidDriver<AndroidElement> driver, double startPercentage, double finalPercentage, double anchorPercentage) {
//		
//	    System.out.println("Call swipe left...");
//		Dimension size = driver.manage().window().getSize();
//	    int anchor = (int) (size.height * anchorPercentage);
//	    int startPoint = (int) (size.width * startPercentage);
//	    int endPoint = (int) (size.width * finalPercentage);
//	    
//	    System.out.println("Swipe: "+anchor+", "+startPoint+", "+endPoint+" and Size: "+size);
//	    //new TouchAction(driver).press(950, 700).waitAction().moveTo(100, 700).release().perform();
//	    System.out.println("Element Swiped...");
//	} 
//	
//	
	public void goBack() {

		driver.navigate().back();
	}

	public void signOutAsAgent() throws InterruptedException {

		boolean flag = false;
		int i = 0;
		while (i < 3) {

			if (AndroidHomePage_OR.HomeButton.isDisplayed()) {
				flag = true;
				System.out.println(flag + "button is found");
				break;
			} else {
				goBack();
				flag = false;
				Thread.sleep(5000);
				i++;

			}
		}

		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(AndroidHomePage_OR.MenuButton));
		if (AndroidHomePage_OR.MenuButton.isDisplayed()) {
			AndroidHomePage_OR.MenuButton.click();
			switchToWebView(driver);
			AndroidHomePage_OR.SignOut.click();
			switchToNativeApp(driver);

			System.out.println("clicked sign out");
		} else {
			System.out.println("did not click on sign out button");
		}
		Thread.sleep(2000);
		System.out.println("clicked sign out");
	}

	public void scrollToText(String text, AppiumDriver<MobileElement> driver)
			throws MalformedURLException, InterruptedException {

		((AndroidDriver<MobileElement>) driver).findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ text + "\").instance(0))");
	}

	public void hideKeayboardIfPresent(AppiumDriver<MobileElement> driver) {
		try {
			driver.hideKeyboard();
		} catch (Exception e) {
		}
	}

	public void scrollToTextDown(String text, AppiumDriver<MobileElement> driver)
			throws MalformedURLException, InterruptedException {
		Thread.sleep(4000);

		// scroll to item in ios
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap scrollObject = new HashMap<>();
		scrollObject.put("predicateString", "value == '" + text + "'");
		scrollObject.put("direction", "down");
		js.executeScript("mobile: scroll", scrollObject);
	}

	public String randomAlphaNumeric(int count) {
		final String token = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		StringBuilder builder = new StringBuilder();
		builder.append("Buyer");
		while (count-- != 0) {
			int character = (int) (Math.random() * token.length());
			builder.append(token.charAt(character));
		}
		return builder.toString();
	}

	public void locateAddNewPageSearch(AppiumDriver<MobileElement> driver) throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(AndroidTemplates_OR.addNewPageSearch));
		AndroidTemplates_OR.addNewPageSearch.click();
	}

	public void locateTemplatesPageSearch(AppiumDriver<MobileElement> driver) throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(AndroidTemplates_OR.templatesPageSearch));
		AndroidTemplates_OR.templatesPageSearch.click();
	}
    public void clickAction(WebElement element, AppiumDriver<MobileElement> driver) throws InterruptedException {
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
        builder.moveToElement(element).click();
        builder.perform();
	}
    public void ScrollNew(int x, int y1, int y2, AppiumDriver<MobileElement> driver) throws InterruptedException {
    	Dimension size = driver.manage().window().getSize();
		  System.out.println(size);
		   TouchAction action = new TouchAction(driver);
		   action.press(PointOption.point(x, y1));
		   action.moveTo(PointOption.point(x, y2));
		   action.release();
		   action.perform();
    
         }	
                                                                
                                                 
}
