/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grab.automation.getpageobjects;

import static com.grab.automation.getpageobjects.ObjectFileReader.getPageTitleFromFile;
import static com.grab.automation.utils.ConfigPropertyReader.getProperty;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.NetworkConnectionSetting;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDeviceActionShortcuts;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.HasNetworkConnection;
import io.appium.java_client.android.Connection;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.grab.automation.utils.ImageMapping;
import com.grab.automation.utils.SeleniumWait;

/**
 * 
 * @author prashantshukla
 */
public class BaseUi {

	public SeleniumWait wait;
	private String pageName;
	Process p;
	protected static WebDriver driver;
	protected ImageMapping img;

	protected BaseUi(WebDriver driver2, String pageName) {
		PageFactory.initElements(driver2, this);
		this.driver = driver2;
		this.pageName = pageName;
		this.wait = new SeleniumWait(driver2, Integer.parseInt(getProperty(
				"Config.properties", "timeout")));
		//this.img	=	new ImageMapping((AppiumDriver) driver);
		this.img	=	new ImageMapping((WebDriver) driver);

	}
	
	public static String getPageTextOfPdf(String fileURL, int pageNumber) {
		PDFParser parser;
		String parsedText = null;

		PDFTextStripper pdfStripper = null;
		PDDocument pdDoc = null;
		COSDocument cosDoc = null;

		InputStream input;
		try {
			input = new URL(fileURL).openStream();
			parser = new PDFParser(input);
			parser.parse();
			cosDoc = parser.getDocument();
			pdfStripper = new PDFTextStripper();
			pdDoc = new PDDocument(cosDoc);
			pdfStripper.setStartPage(pageNumber);
			pdfStripper.setEndPage(pageNumber);
			parsedText = pdfStripper.getText(pdDoc);
			cosDoc.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return parsedText;
	}

	public void turnOffWifi() {
    	((AndroidDriver)driver).setConnection(Connection.NONE);
    	
    	wait.hardWait(15);
    	System.out.println("Wifi has been turned Off !!");
	}
	
	 public void turnOnWifi() {
	    ((AndroidDriver)driver).setConnection(Connection.WIFI);
	    wait.hardWait(15);
	    System.out.println("Wifi has been turned On !!");
	 }

	protected String alertText() {
		String text = switchToAlert().getText();
		return text;
	}

	protected void click(WebElement element) {
		try {
			wait.waitForElementToBeVisible(element);
			scrollDown(element);
			element.click();
		} catch (StaleElementReferenceException ex1) {
			// wait.waitForElementToBeVisible(element);
			// scrollDown(element);
			element.click();
			logMessage("Clicked Element " + element
					+ " after catching Stale Element Exception");
		} catch (Exception ex2) {
			logMessage("Element " + element + " could not be clicked! "
					+ ex2.getMessage());
		}
	}

	public void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}

	protected void executeJavascript(String script) {
		((JavascriptExecutor) driver).executeScript(script);
	}

	protected String getCurrentURL() {
		return driver.getCurrentUrl();
	}

	protected WebElement getElementByContainsText(List<WebElement> elementlist,
			String elementtext) {
		WebElement element = null;
		for (WebElement elem : elementlist) {
			if (elem.getText().contains(elementtext.trim())) {
				element = elem;
			}
		}
		// FIXME: handle if no element with the text is found in list
		if (element == null) {
		}
		return element;
	}

	protected WebElement getElementByExactText(List<WebElement> elementlist,
			String elementtext) {
		WebElement element = null;
		for (WebElement elem : elementlist) {
			if (elem.getText().equalsIgnoreCase(elementtext.trim())) {
				element = elem;
			}
		}
		// FIXME: handle if no element with the text is found in list No element
		// exception
		if (element == null) {
		}
		return element;
	}

	protected WebElement getElementByIndex(List<WebElement> elementlist,
			int index) {
		return elementlist.get(index);
	}

	protected String getPageTitle() {

		return driver.getTitle();
	}

	protected void handleAlert() {
		try {
			switchToAlert().accept();
			logMessage("Alert handled..");
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println("No Alert window appeared...");
		}
	}

	protected void holdExecution(int milliSeconds) {
		try {
			Thread.sleep(milliSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void hover(WebElement element) {
		Actions hoverOver = new Actions(driver);
		hoverOver.moveToElement(element).build().perform();
	}

	protected void hoverClick(WebElement element) {
		Actions hoverClick = new Actions(driver);
		hoverClick.moveToElement(element).click().build().perform();
	}

	protected void logMessage(String string) {
		Reporter.log(string, true);
	}

	protected void logMessagePass(String message) {
		Reporter.log("<b><font color='green'>" + message + "</font></b>", true);
	}

	public void navigateToBackPage() {
		wait.hardWait(2);
		logMessage("Step : navigate to back page\n");
		driver.navigate().back();

	}

	public void pageRefresh() {
		driver.navigate().refresh();
	}
	
    public static void navigateBack(){
	   driver.navigate().back();
    }
      
    public void tapOnScreen(){
    	TouchAction a2 = new TouchAction((AppiumDriver)driver);
		Dimension dimens = driver.manage().window().getSize();
		int xCoordinate = dimens.getHeight()/2; 
		int yCoordinate = dimens.getWidth()/2;
		a2.tap(xCoordinate, yCoordinate).perform();
		System.out.println("Tap on screen!!");
    }
    
    public void swapRightToLeft() {
		Dimension size = driver.manage().window().getSize();
		int startx = (int) (size.width * 0.9);
		int endx = (int) (size.width * 0.3);
		int starty = size.height / 2;
		((AppiumDriver)driver).swipe(startx, starty, endx, starty, 800);
		System.out.println("Swipe Right to left !");
	}
    
	public void scrollMobile()
	{
		Dimension dimensions = driver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();
        ((AppiumDriver)driver).swipe(0,scrollStart,0,scrollEnd,2000);
}

	protected void scrollDown(WebElement element) {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView(true);", element);
	}

	protected void selectDropDownValue(WebElement el, String index) {

		try {
			wait.waitForElementToBeVisible(el);
			scrollDown(el);
			Select sel = new Select(el);
			sel.selectByValue(index);
		} catch (StaleElementReferenceException ex1) {
			 wait.waitForElementToBeVisible(el);
			scrollDown(el);
			Select sel = new Select(el);
			sel.selectByValue(index);
			logMessage("select Element " + el
					+ " after catching Stale Element Exception");
		} catch (Exception ex2) {
			logMessage("Element " + el + " could not be clicked! "
					+ ex2.getMessage());
		}
	}
	
	protected void selectDropDownValue(WebElement el, int index) {

		try {
			wait.waitForElementToBeVisible(el);
		    scrollDown(el);
			Select sel = new Select(el);
			sel.selectByIndex(index);
		} catch (StaleElementReferenceException ex1) {
			wait.waitForElementToBeVisible(el);
			 scrollDown(el);
			Select sel = new Select(el);
			sel.selectByIndex(index);
			logMessage("select Element " + el
					+ " after catching Stale Element Exception");
		} catch (Exception ex2) {
			logMessage("Element " + el + " could not be clicked! "
					+ ex2.getMessage());
		}
	}

	protected void selectProvidedTextFromDropDown(WebElement el, String text) {
		try {
			wait.waitForElementToBeVisible(el);
			Select sel = new Select(el);
			sel.selectByVisibleText(text);
		} catch (StaleElementReferenceException ex1) {
			Select sel = new Select(el);
			sel.selectByVisibleText(text);
			logMessage("select Element " + el
					+ " after catching Stale Element Exception");
		} catch (Exception ex2) {
			logMessage("Element " + el + " could not be clicked! "
					+ ex2.getMessage());
		}
	}

	protected Alert switchToAlert() {
		WebDriverWait wait = new WebDriverWait(driver, 2);
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}

	public void switchToFrame(int i) {
		driver.switchTo().frame(i);
	}

	public void switchToFrame(String id) {
		driver.switchTo().frame(id);
	}

	protected void switchToFrame(WebElement element) {
		// switchToDefaultContent();
		wait.waitForElementToBeVisible(element);
		driver.switchTo().frame(element);
	}

	public void switchWindow() {
		for (String current : driver.getWindowHandles()) {
			driver.switchTo().window(current);
		}
	}

	/**
	 * Verification of the page title with the title text provided in the page
	 * object repository
	 */
	protected void verifyPageTitleContains() {
		String expectedPagetitle = getPageTitleFromFile(pageName).trim();
		verifyPageTitleContains(expectedPagetitle);
	}

	/**
	 * this method will get page title of current window and match it partially
	 * with the param provided
	 * 
	 * @param expectedPagetitle
	 *            partial page title text
	 */
	protected void verifyPageTitleContains(String expectedPagetitle) {
		if (((expectedPagetitle == "") || (expectedPagetitle == null) || (expectedPagetitle
				.isEmpty()))
				&& (getProperty("browser").equalsIgnoreCase("chrome"))) {
			expectedPagetitle = getCurrentURL();
		}
		try {
			wait.waitForPageTitleToContain(expectedPagetitle);
		} catch (TimeoutException exp) {
			String actualPageTitle = driver.getTitle().trim();
			logMessage("ASSERT FAILED: As actual Page Title: '"
					+ actualPageTitle
					+ "' does not contain expected Page Title : '"
					+ expectedPagetitle + "'.");
		}
		String actualPageTitle = getPageTitle().trim();
		logMessage("ASSERT PASSED: PageTitle for " + actualPageTitle
				+ " contains: '" + expectedPagetitle + "'.");
	}

	protected void verifyPageTitleExact() {
		String pageTitle = getPageTitleFromFile(pageName);
		verifyPageTitleExact(pageTitle);
	}

	protected void verifyPageTitleExact(String expectedPagetitle) {
		if (((expectedPagetitle == "") || (expectedPagetitle == null) || (expectedPagetitle
				.isEmpty()))
				&& (getProperty("browser").equalsIgnoreCase("chrome"))) {
			expectedPagetitle = getCurrentURL();
		}
		try {
			wait.waitForPageTitleToBeExact(expectedPagetitle);
			logMessage("ASSERT PASSED: PageTitle for " + pageName
					+ " is exactly: '" + expectedPagetitle + "'");
		} catch (TimeoutException ex) {
			Assert.fail("ASSERT FAILED: PageTitle for " + pageName
					+ " is not exactly: '" + expectedPagetitle
					+ "'!!!\n instead it is :- " + driver.getTitle());
		}
	}

	public boolean scollWindowTillTime(List<WebElement> ele) {
		boolean isDisplayed=false;
		int	Flag	=	0;
		while (ele.size()==0) {
			scollWindow();
			if (Flag==5) {
				return true;
			}
			Flag	=	Flag+1;
		}
		return isDisplayed;

	}
	
	public void scollWindow() {
		//		get the size of the screen, divide it up and scroll like that  
		Dimension dimensions = driver.manage().window().getSize();
		System.out.println(dimensions);
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();
		((AppiumDriver)driver).swipe(0,scrollStart,0,scrollEnd,1000); //duration is in milliseconds I believe so go for values like 1000 or 2000
	}
	
	protected void clickUsingXpathInJavaScriptExecutor(WebElement element) {
	    JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].click();", element);
	   }
	
	public void scollWindowUp() {
		//		get the size of the screen, divide it up and scroll like that  
		Dimension dimensions = driver.manage().window().getSize();
		System.out.println(dimensions);
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();
		((AppiumDriver)driver).swipe(0,scrollEnd,0,scrollStart,1000); //duration is in milliseconds I believe so go for values like 1000 or 2000
	}
	
	public void swipeUpElement(AppiumDriver<WebElement> driver, WebElement element, int duration){
	    int bottomY = element.getLocation().getY()-200;
	    driver.swipe(element.getLocation().getX(), element.getLocation().getY(), element.getLocation().getX(), bottomY, duration);
	}
	
	/*public void turnOffWifi() throws IOException{
		Runtime rt = Runtime.getRuntime();
		Process proc = rt.exec("adb shell am start -n io.appium.settings/.Settings -e wifi off");
//        p = Runtime.getRuntime().exec("adb shell am start -n io.appium.settings/.Settings -e wifi off");
	}
	
	public void turnOnWifi() throws IOException{
	   p = Runtime.getRuntime().exec("adb shell am start -n io.appium.settings/.Settings -e wifi on");
	}
	*/
	public void runAppInBackground(){
		((AndroidDriver<WebElement>)driver).runAppInBackground(10);	
	}
	
	public static void sendAppInBackground() throws IOException, InterruptedException{
		Runtime rt = Runtime.getRuntime();
		Process proc = rt.exec("adb  shell \"input keyevent 3\"");
		proc.waitFor();
		rt.exec("adb shell am start -n com.cengage.mobile.mindtap/com.cengage.mobile.mindtap.splash.SplashActivity");
		proc.waitFor();
        
	}
	
	public static void launchAppFromActivityName()throws IOException, InterruptedException{
		Runtime rt = Runtime.getRuntime();
		Process proc = rt.exec("adb shell am start -n com.cengage.mobile.mindtap/com.cengage.mobile.mindtap.splash.SplashActivity");
		proc.waitFor();
	}
	
	 public void TouchActionTapFromCoordinate(WebElement ele) {
			TouchAction action	=	new TouchAction((AppiumDriver) driver);
			int X	=	ele.getLocation().getX();
			int Y	=	ele.getLocation().getY();
			int Hight	=	ele.getSize().getHeight();
			int Width	=	ele.getSize().getWidth();
			int x	=	X+Width/2;
			int y	=	Y+Hight/2;		
			System.out.println(x +"                "+y);
			action.tap(x, y).perform();
		}
	 
	 protected void getElementTextAndVerifyIt(WebElement elem, String regex, String expected){
		  wait.waitForElementToBeVisible(elem);
		  String text = elem.getText();
		  logMessage("text--> "+text);
		  String args[]=text.split(regex);
		  System.out.println("actual text--> "+args[1]);
		  Assert.assertEquals(args[0].toString().trim(), expected);
	 }
	 
	 public void TurnOnLandscapeMode(){
			wait.hardWait(5);
			ScreenOrientation orientation=((AppiumDriver) driver).getOrientation();
			System.out.println("Current Orientation is "+orientation);
			((AppiumDriver) driver).rotate(ScreenOrientation.LANDSCAPE);
			wait.hardWait(60);
			ScreenOrientation orientation1=((AppiumDriver) driver).getOrientation();
			logMessage("Orientation changed to--> "+orientation1);
		}

		public void TurnOffLandscapeMode(){
			wait.hardWait(5);
			ScreenOrientation orientation=((AppiumDriver) driver).getOrientation();
			System.out.println("Current Orientation is "+orientation);
			((AppiumDriver) driver).rotate(ScreenOrientation.PORTRAIT);
			wait.hardWait(20);
			ScreenOrientation orientation1=((AppiumDriver) driver).getOrientation();
			logMessage("Orientation changed to--> "+orientation1);
		}
	 
	 public void changeOrientationToLandscape(){
		 ((AppiumDriver) driver).rotate(ScreenOrientation.LANDSCAPE);
			wait.hardWait(4);
			ScreenOrientation orientation1=((AppiumDriver) driver).getOrientation();
			logMessage("Orientation changed to--> "+orientation1);
	 }
	 
	 public void changeOrientationToPortrait(){
		 ((AppiumDriver) driver).rotate(ScreenOrientation.PORTRAIT);
			wait.hardWait(4);
			ScreenOrientation orientation1=((AppiumDriver) driver).getOrientation();
			logMessage("Orientation changed to--> "+orientation1);
	 }
	 
	 public void turnOffWifiThroughAdb() throws IOException{
		 Map<String,String> log = null;	
		 ((AppiumDriver) driver).execute("adb shell am start -n io.appium.settings/.Settings -e wifi off",log);
		 wait.hardWait(4);
		 System.out.println("Wifi is Off !!");
	 }
	 public void TurnOnLandscapeModethroughAdb(){
		 wait.hardWait(4);
		 Map<String,String> log = null;
		 ((AppiumDriver) driver).execute("adb shell content insert --uri content://settings/system --bind name:s:accelerometer_rotation --bind value:i:0",log);
		 wait.hardWait(4);
		 ((AppiumDriver) driver).execute("adb shell content insert --uri content://settings/system --bind name:s:user_rotation --bind value:i:0",log);
			 wait.hardWait(4);
			 System.out.println("Turn into Landscape mode!!");
	 }
}