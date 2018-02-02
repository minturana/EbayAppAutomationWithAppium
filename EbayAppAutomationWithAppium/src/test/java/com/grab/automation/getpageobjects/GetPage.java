package com.grab.automation.getpageobjects;

import static com.grab.automation.getpageobjects.ObjectFileReader.getELementFromFile;
import static com.grab.automation.utils.ConfigPropertyReader.getProperty;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.grab.automation.utils.LayoutValidation;

public class GetPage extends BaseUi {

	protected WebDriver webdriver;
	String pageName;
	LayoutValidation layouttest;


	public GetPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		this.webdriver = driver;
		this.pageName = pageName;
		layouttest = new LayoutValidation(driver, pageName);
	}

	protected void clickOnElementFromText(WebElement elem) {
		wait.waitForElementToBeVisible(elem);
		wait.waitForElementToBeClickable(elem);
		logMessage("clicking on WebElement : " + elem.getText().toUpperCase());
		elem.click();
		wait.hardWait(1);
	}

	protected void clickOnElementFromText(String elementName, String replacement) {
		wait.hardWait(1);
		wait.hardWait(1);
		logMessage("clicking on WebElement : " + element(elementName, replacement).getText().toUpperCase());
		element(elementName, replacement).click();
	}



	protected void clickOnElementFormJavaScript(WebElement element) { 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Dimension size = element.getSize();
		//	Point location = element.getLocation();
		double x = element.getLocation().getX() + size.getWidth()/2.0;
		double y = element.getLocation().getY() + size.getHeight()/2.0;
		HashMap<String, Double> point = new HashMap<String, Double>();
		point.put("x", x);	
		point.put("y", y);
		js.executeScript("mobile: tap", point);
	}
	protected double getX(WebElement element){ 
		Dimension size = element.getSize();
		double x = element.getLocation().getX() + size.getWidth()/2.0;
		return x;
	}
	protected double getY(WebElement element){ 
		Dimension size = element.getSize();
		double y = element.getLocation().getY() + size.getHeight()/2.0;
		return y;
	}


	protected WebElement element(String elementToken)
			throws NoSuchElementException {
		return element(elementToken, "");
	}

	protected WebElement element(By elementToken)
			throws NoSuchElementException {
		return element(elementToken, "");
	}

	protected WebElement element(By locator, String replacement) throws NoSuchElementException {
		WebElement elem;
		elem = wait.waitForElementToBeVisible(webdriver.findElement(locator));
		return elem;
	}

	protected WebElement element(String elementToken, String replacement) throws NoSuchElementException {
		WebElement elem = null;
		By locator = getLocator(elementToken, replacement);
		try {
			elem = wait.waitForElementToBeVisible(webdriver.findElement(locator));
		} catch (TimeoutException excp) {
			throw new NoSuchElementException("Element " + elementToken + " with locator "
					+ locator.toString().substring(2) + " not found on the " + this.pageName + " !!!");
		}
		catch (NoSuchElementException e) {
			locator = getLocator(elementToken, replacement, "AndroidVersionAbove6",true);
			elem = wait.waitForElementToBeVisible(webdriver.findElement(locator));
		}
		return elem;
	}

	public void swipeToParticularElement(String ele, String index){
		int X	=	element(ele,index).getLocation().getX();
		int Y	=	element(ele,index).getLocation().getY();			
		int w	=	element(ele,index).getSize().getWidth();
		int h	=	element(ele,index).getSize().getHeight();			
		int x1	=	X+w/2+w/4;
		int y1	=	Y+h/2+h/4;	
		int x2	=	X+w/2-w/4;
		int y2	=	Y+h/2+h/4;
		((AndroidDriver) driver).swipe(x1,y1,x2,y2,1200);
	}

	protected boolean elementNotDisplayed(String elementToken, String replacement) throws NoSuchElementException {
		WebElement elem = null;
		By locator = getLocator(elementToken, replacement);
		try {
			elem = wait.waitForElementToBeVisible(webdriver.findElement(locator));
			return true;
		} catch (NoSuchElementException excp) {
			return false;
		}

	}

	protected WebElement element(String elementToken, String replacement, String replace)
			throws NoSuchElementException {
		WebElement elem = null;
		By locator = getLocator(elementToken, replacement, replace);
		try {
			elem = wait.waitForElementToBeVisible(webdriver.findElement(locator));
		} catch (TimeoutException excp) {
			throw new NoSuchElementException("Element " + elementToken + " with locator "
					+ locator.toString().substring(2) + " not found on the " + this.pageName + " !!!");
		}
		return elem;
	}

	protected List<WebElement> elements(String elementToken) {
		return elements(elementToken, "");
	}

	protected List<WebElement> elements(String elementToken, String replacement) {
		return wait.waitForElementsToBeVisible(webdriver
				.findElements(getLocator(elementToken, replacement)));
	}

	protected List<WebElement> elementsWithOutWait(String elementToken, String replacement) {
		return webdriver.findElements(getLocator(elementToken, replacement));
	}
	protected List<WebElement> elementsWithOutWait(String elementToken) {
		return elementsWithOutWait(elementToken, "");
	}

	protected WebElement elementWithOutWait(String elementToken)
			throws NoSuchElementException {
		WebElement elem = null;
		By locator = getLocator(elementToken);
		try {
			elem = driver.findElement(locator);
		} catch (TimeoutException excp) {
			throw new NoSuchElementException("Element " + elementToken
					+ " with locator " + locator.toString().substring(2)
					+ " not found on the " + this.pageName + " !!!");
		}
		return elem;
	}

	protected WebElement elementWithOutWait(String elementToken,String replacement) throws NoSuchElementException {
		WebElement elem = null;
		By locator = getLocator(elementToken, replacement);
		try {
			elem = driver.findElement(locator);
		} catch (TimeoutException excp) {
			throw new NoSuchElementException("Element " + elementToken
					+ " with locator " + locator.toString().substring(2)
					+ " not found on the " + this.pageName + " !!!");
		}
		catch (NoSuchElementException e) {
			logMessage("Element " + elementToken+ " with locator " + locator.toString().substring(2) + " not found on the " + this.pageName + " !!!");
		}
		return elem;
	}

	private By getBy(String locatorType, String locatorValue) {
		switch (Locators.valueOf(locatorType)) {
		case id:
			return By.id(locatorValue);
		case xpath:
			return By.xpath(locatorValue);
		case css:
			return By.cssSelector(locatorValue);
		case name:
			return By.name(locatorValue);
		case classname:
			return By.className(locatorValue);
		case linktext:
			return By.linkText(locatorValue);
		default:
			return By.id(locatorValue);
		}
	}

	protected String getElementText(String elem) {
		wait.waitForElementToBeVisible(element(elem));
		String text = element(elem).getText();
		return text;
	}

	protected String getElementTextAndVerifyIt(WebElement elem, String expected) {
		wait.waitForElementToBeVisible(elem);
		String text = elem.getText();
		isStringMatching(text, expected);
		return text;
	}

	protected By getLocator(String elementToken) {
		return getLocator(elementToken, "");
	}

	protected By getLocator(String elementToken, String replacement) {
		String[] locator = getELementFromFile(this.pageName, elementToken);
		locator[2] = locator[2].replaceAll("\\$\\{.+\\}", replacement);
		return getBy(locator[1].trim(), locator[2].trim());
	}

	protected By getLocator(String elementToken, String replacement, String replace) {
		String[] locator = getELementFromFile(this.pageName, elementToken);
		locator[2] = locator[2].replaceAll("\\#\\{.+\\}", replace);
		locator[2] = locator[2].replaceAll("\\$\\{.+\\}", replacement);
		System.out.println(locator[2].trim());
		return getBy(locator[1].trim(), locator[2].trim());
	}

	protected By getLocator(String elementToken,String specName,Boolean look) {
		return getLocator(elementToken, "",specName,look);
	}

	protected By getLocator(String elementToken, String replacement,String specName,Boolean look) {
		String[] locator = getELementFromFile(this.pageName, elementToken,specName,look);
		locator[2] = locator[2].replaceAll("\\$\\{.+\\}", replacement);
		return getBy(locator[1].trim(), locator[2].trim());
	}

	protected By getLocator(String elementToken, String replacement, String replace,String specName,Boolean look) {
		String[] locator = getELementFromFile(this.pageName, elementToken,specName,look);
		locator[2] = locator[2].replaceAll("\\#\\{.+\\}", replace);
		locator[2] = locator[2].replaceAll("\\$\\{.+\\}", replacement);
		System.out.println(locator[2].trim());
		return getBy(locator[1].trim(), locator[2].trim());
	}

	protected boolean isElementDisplayed(String elementName, String elementTextReplace,String elementTextReplace1) {
		wait.waitForElementToBeVisible(element(elementName, elementTextReplace,elementTextReplace1));
		boolean result = element(elementName, elementTextReplace,elementTextReplace1).isDisplayed();
		assertTrue(result,
				"ASSERT FAILED: element '" + elementName + "with text " + elementTextReplace + "' is not displayed.");
		logMessage("ASSERT PASSED: element " + elementName + " with text " + elementTextReplace + " is displayed.");
		return result;
	}

	protected boolean isElementDisplayed(String elementName)
			throws NoSuchElementException {
		boolean result = wait.waitForElementToBeVisible(element(elementName))
				.isDisplayed();
		assertTrue(result, "ASSERT FAILED: element '" + elementName
				+ "' is not displayed.");
		logMessage("ASSERT PASSED: element " + elementName+ " is displayed.");
		return result;
	}

	protected boolean isElementDisplayed(String elementName,String elementTextReplace) {
		boolean result = element(elementName, elementTextReplace).isDisplayed();
		assertTrue(result, "ASSERT FAILED: element '" + elementName
				+ "with text " + elementTextReplace + "' is not displayed.");
		logMessage("ASSERT PASSED: element '" + elementName + "' with text "
				+ elementTextReplace + " is displayed.");
		return result;
	}

	protected boolean isElementEnabled(String elementName, boolean expected) {
		wait.waitForElementToBeVisible(element(elementName));
		boolean result = expected && element(elementName).isEnabled();
		assertTrue(result, "ASSERT FAILED: element '" + elementName
				+ "' is  ENABLED :- " + !expected);
		logMessage("ASSERT PASSED: element " + elementName + " is enabled :- "
				+ expected);
		return result;
	}

	protected boolean isElementNotDisplayed(String elem) {
		boolean result;
		try {
			result = driver.findElement(locator(elem)).isDisplayed();
			assertFalse(result, "Assert Failed element is displayed : " + elem);
		} catch (org.openqa.selenium.NoSuchElementException e) {
			assertTrue(driver.findElements(locator(elem)).size() == 0,
					"ASSERT FAILED: element is displayed");
			logMessage("ASSERT PASSED: element " + elem + " is not displayed.");
			result = true;
		}
		return result;
	}

	protected boolean isElementNotDisplayed(String elem, int seconds) {
		wait.hardWait(seconds);
		boolean result;
		try {
			result = driver.findElement(locator(elem)).isDisplayed();
			assertFalse(result, "Assert Failed element is displayed : " + elem);
		} catch (org.openqa.selenium.NoSuchElementException e) {
			assertTrue(driver.findElements(locator(elem)).size() == 0,
					"ASSERT FAILED: element is displayed");
			logMessage("ASSERT PASSED: element " + elem + " is displayed.");
			result = true;
		}
		return result;
	}

	protected boolean isElementNotDisplayed(WebElement elem) {
		boolean result;
		try {
			result = elem.isDisplayed();
			assertFalse(result, "Assert Failed element is displayed : " + elem);
		} catch (org.openqa.selenium.NoSuchElementException e) {
			// assertTrue(elem. == 0, "ASSERT FAILED: element is displayed");
			logMessage("ASSERT PASSED: element " + elem + " is displayed.");
			result = true;
		}
		return result;
	}

	protected void isStringMatching(String actual, String expected) {
		assertEquals(actual, expected);
		logMessage("ACTUAL STRING : " + actual);
		logMessage("EXPECTED STRING :" + expected);
		logMessagePass("String compare Assertion passed.");
	}

	protected void isStringMatching(String actual, String expected,
			boolean isSame) {
		if (isSame == true) {
			isStringMatching(actual, expected);
		} else {
			isStringNotMatching(actual, expected);
		}
	}

	protected void isStringNotMatching(String actual, String expected) {
		logMessage("ACTUAL STRING :" + actual);
		logMessage("EXPECTED STRING :" + expected);
		assertNotEquals(actual, expected,"String Equals Assertion Failed.");
		logMessage("[AssertNotEquals] : String Not Equals Assertion passed.");
	}

	protected By locator(String elementToken) {
		By locator = getLocator(elementToken);
		return locator;
	}

	public void swapLeftToRightFlashcard() {
		Dimension size = driver.manage().window().getSize();
		int endx = (int) (size.width * 0.8);
		int startx = (int) (size.width * 0.20);
		int starty = size.height / 2;
		((AppiumDriver)driver).swipe(startx, starty, endx, starty, 1000);
	}

	public void swapRightToLeftFlashcard() {
		Dimension size = driver.manage().window().getSize();
		int startx = (int) (size.width * 0.8);
		int endx = (int) (size.width * 0.20);
		int starty = size.height / 2;
		((AppiumDriver)driver).swipe(startx, starty, endx, starty, 1000);
	}


	protected void mobileSwipe(WebElement element, double startX,
			double startY, double endX, double endY, double duration) {
		Point location = element.getLocation();
		Dimension size = element.getSize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		logMessage("Starting swiping element with the coordinate ");
		HashMap<String, Double> swipeObject = new HashMap<String, Double>();
		swipeObject.put("startX", startX);
		swipeObject.put("startY", startY);
		swipeObject.put("endX", endX);
		swipeObject.put("endY", endY);
		swipeObject.put("duration", duration);
		js.executeScript("mobile: swipe", swipeObject);
	}

	public void swipeLeft(String elementToken, String replacement) {
		By locator = getLocator(elementToken, replacement);
		MobileElement element = (MobileElement) driver.findElement(locator);
		int offset = 1;
		Point p = element.getCenter();
		Point location = element.getLocation();
		Dimension size = element.getSize();
		((AppiumDriver)driver).swipe(location.getX() + size.getWidth() - offset, p.getY(),
				location.getX() + offset, p.getY(), 1000);
	}

	public void swipeRight(String elementToken, String replacement) {
		By locator = getLocator(elementToken, replacement);

		MobileElement element = (MobileElement) driver.findElement(locator);
		int offset = 1;
		Point p = element.getCenter();
		Point location = element.getLocation();
		Dimension size = element.getSize();
		((AppiumDriver)driver).swipe(location.getX() + offset + 20, p.getY(), location.getX()
				+ size.getWidth() - offset, p.getY(), 1000);
	}

	// TODO: put this in right place, create dedicated class for frame and
	// window handlers
	protected void switchToNestedFrames(String frameNames) {
		switchToDefaultContent();
		String[] frameIdentifiers = frameNames.split(":");
		for (String frameId : frameIdentifiers) {
			wait.waitForFrameToBeAvailableAndSwitchToIt(getLocator(frameId
					.trim()));
		}
	}

	public void testPageLayout() {
		testPageLayout(Arrays.asList(getProperty("./Config.properties",
				"browser")));
	}

	public void testPageLayout(List<String> tagsToBeTested) {
		layouttest.checklayout(tagsToBeTested);
	}

	public void testPageLayout(String tagToBeTested) {
		testPageLayout(Arrays.asList(tagToBeTested));
	}

	protected Boolean verifyElementIsDisplayedOrNot(String ele,	Boolean isPresent) {
		boolean result;
		if (isPresent == true) {
			result = isElementDisplayed(ele);
			logMessage("<font color='green'>ASSERT PASS: element " + ele.toUpperCase()
			+ " is displayed.</font>");
		} else {
			isElementNotDisplayed(ele);
			result = false;
		}
		return result;
	}
	protected void verifyElementsIsDisplayedOrNot(List<WebElement> eles, Boolean isPresent) {
		boolean result;
		if (isPresent == true) {
			if (eles.size()<0) {
				Assert.assertTrue(true);
				logMessage("<font color='green'>ASSERT PASS: element " + eles + " is displayed.</font>");
			}
			else {
				Assert.assertTrue(false);
			}

		} else {
			if (eles.size()==0) {
				Assert.assertTrue(true);
				logMessage("<font color='green'>ASSERT PASS: element " + eles + " is Not displayed.</font>");
			}
			else {
				Assert.assertTrue(false);
			}
			result = false;
		}
	}

	protected Boolean verifyElementIsDisplayedOrNot(WebElement ele,
			Boolean isPresent) {
		boolean result = false;
		if (isPresent == true) {
			ele.isDisplayed();
			logMessage("ASSERT Passed: element " + ele + " is displayed.");
		} else {
			logMessage("I am in else");
			isElementNotDisplayed(ele);
			result = false;
		}
		return result;
	}

	protected void verifyElementText(String elementName, String expectedText) {
		logMessage("Current Element Text : "+elementName+" And Expected Text : "+expectedText);
		assertEquals(elementName, expectedText,
				"ASSERT FAILED: element '" + elementName
				+ "' Text is as expected: ");
		logMessage("ASSERT PASSED: element " + elementName
				+ " and Text is " + expectedText+" Same");
	}
	protected void verifyContentAreNotSame(String elementName, String expectedText) {
		logMessage("Current Element Text : "+elementName+" And Expected Text : "+expectedText);
		Assert.assertFalse(elementName.equals(expectedText),	"ASSERT FAILED: element '" + elementName
				+ "' Text is not as expected: ");
		logMessage("ASSERT PASSED: Text " + elementName
				+ " is visible and Text is Not : " + expectedText);
	}

	protected void verifyElementText(WebElement element, String expectedText) {
		WebElement elemt = element;
		wait.waitForElementToBeVisible(elemt);
		assertEquals(elemt.getText().trim(), expectedText,
				"ASSERT FAILED: element '" + elemt.getText()
				+ "' Text is not as expected: ");
		logMessage("ASSERT PASSED: element " + elemt.getText()
		+ " is visible and Text is " + expectedText);
	}


	protected void verifyElementTextContains(WebElement elem,
			String expectedText) {
		wait.waitForElementToBeVisible(elem);
		String elementName = elem.getText().trim();
		assertThat("ASSERT FAILED: element '" + elementName
				+ "' Text is not as expected: ", elem.getText().trim(),
				containsString(expectedText));
		logMessage("ASSERT PASSED: element " + elementName
				+ " is visible and Text is " + expectedText);

	}

	protected boolean checkIfElementIsNotThere(String eleString){
		boolean flag = false;
		int timeout = wait.getTimeOut();
		try{
			wait.resetImplicitTimeout(6);
			if(webdriver.findElement(getLocator(eleString)).isDisplayed()){
				flag = false;
			}else{
				flag = true;
			}
		}catch(NoSuchElementException ex){
			flag =  true;
		}
		wait.resetImplicitTimeout(timeout);
		return flag;
	}


	protected void isStringContains(String actual, String expected){
		assertTrue(actual.contains(expected));
		logMessage("ACTUAL STRING : " + actual);
		logMessage("Contained STRING :" + expected);
		logMessagePass("String contains Assertion passed.");
	}

	protected void isStringContains(String actual, String expected,
			boolean isSame) {
		if (isSame == true) {
			isStringContains(actual, expected);
		} else {
			isStringNotContains(actual, expected);
		}
	}

	protected void isStringNotContains(String actual, String expected) {
		logMessage("ACTUAL STRING :" + actual);
		logMessage("EXPECTED STRING :" + expected);
		assertFalse(actual.contains(expected),"String Contains Assertion Failed.");
		logMessage("[AssertNotEquals] : String Not Contains Assertion passed.");
	}

	public void clickUsingActionClass(String element,String replacement){
		Actions actions = new Actions(driver);
		WebElement mainMenu = driver.findElement(getLocator(element,replacement));		
		actions.moveToElement(mainMenu);
		actions.click().build().perform();
	}

	public void swipeTimerUsingParticularElement(By ele, By Target_ele){
		int X	=	element(ele).getLocation().getX();
		int Y	=	element(ele).getLocation().getY();			
		int w	=	element(ele).getSize().getWidth();
		int h	=	element(ele).getSize().getHeight();	
		int X1	=	element(Target_ele).getLocation().getX();
		int Y1	=	element(Target_ele).getLocation().getY();			
		int w1	=	element(Target_ele).getSize().getWidth();
		int h1	=	element(Target_ele).getSize().getHeight();	
		int x1	=	X+w/2;
		int y1	=	Y+h/2;	
		int x2	=	X1+w1/2;
		int y2	=	Y1+h1/2;
		((AndroidDriver) driver).swipe(x1,y1,x2,y2,600);
	}
}
