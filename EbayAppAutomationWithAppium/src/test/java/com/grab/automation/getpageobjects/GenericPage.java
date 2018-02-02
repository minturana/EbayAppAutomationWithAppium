package com.grab.automation.getpageobjects;

import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

import static com.grab.automation.utils.ConfigPropertyReader.getProperty;
import static com.grab.automation.utils.DataProvider.csvReaderRowSpecific;
import static com.grab.automation.utils.YamlReader.getYamlValue;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.grab.automation.utils.DataProvider;
import com.grab.automation.utils.LayoutValidation;

public class GenericPage extends GetPage {
	protected AndroidDriver<WebElement> webdriver;
	String pageName;
	LayoutValidation layouttest;
	String csvSeparator = getYamlValue("csv-data-file.data-separator");
	int timeOut;

	public GenericPage(AndroidDriver<WebElement> driver,
			String pageName) {
		super(driver, pageName);
		this.webdriver = driver;
		this.pageName = pageName;
		layouttest = new LayoutValidation(driver, pageName);
	}

//	public String getOmaSheetValue(String caseId, String valueFromDataSheet) {
//		String csvLine = csvReaderRowSpecific(
//				getYamlValue("csv-data-file.path_OMA"),
//				getYamlValue("csv-data-file.has-header"), caseId);
//		return DataProvider.getSpecificColumnFromCsvLine(csvLine, csvSeparator,
//				DataProvider.getColumnNumber(valueFromDataSheet)).trim();
//	}

//	public String getPriceSheetValue(String caseId, String valueFromDataSheet) {
//		String csvLine = csvReaderRowSpecific(
//				getYamlValue("csv-data-file.path_PriceValue"),
//				getYamlValue("csv-data-file.has-header"), caseId);
//		return DataProvider.getSpecificColumnFromCsvLine(csvLine, csvSeparator,
//				DataProvider.getColumnNumberForPriceValue(valueFromDataSheet))
//				.trim();
//	}

	public void verifyFieldVisibility(String element, String visibility)
			throws NoSuchElementException {
		timeOut = Integer.parseInt(getProperty("Config.properties", "timeout"));
		if (visibility.equalsIgnoreCase("hide")) {
			try {
				Reporter.log("Waiting for the element: " + element
						+ " to not to show up", true);
				wait.resetImplicitTimeout(0);
				wait.resetExplicitTimeout(5);
				isElementDisplayed(element);
				org.testng.Assert
						.fail("ASSERT FAILED: "
								+ element
								+ " is found visible even though it is expected to be hidden");
				wait.resetImplicitTimeout(timeOut);
				wait.resetExplicitTimeout(timeOut);
			} catch (NoSuchElementException e) {
				wait.resetImplicitTimeout(timeOut);
				wait.resetExplicitTimeout(timeOut);
				logMessage("ASSERT PASSED: " + element + " is hidden");
			}

		} else if (visibility.equalsIgnoreCase("show")) {
			try {
				wait.resetImplicitTimeout(0);
				wait.resetExplicitTimeout(5);
				isElementDisplayed(element);
				wait.resetImplicitTimeout(timeOut);
				wait.resetExplicitTimeout(timeOut);
			} catch (NoSuchElementException e) {
				wait.resetImplicitTimeout(timeOut);
				wait.resetExplicitTimeout(timeOut);
				logMessage("ASSERT FAILED: " + element + " is Show");
				throw new NoSuchElementException(
						"visibility' field is not displayed in Application.");
			}
		} else if (!(visibility.equalsIgnoreCase("N") || visibility
				.equalsIgnoreCase("Y"))) {
			logMessage("data is not valid in sheet");
			throw new NoSuchElementException("data is not valid in sheet");
		}
	}

	public void verifyFieldVisibility(String element, String replacementText,
			String visibility) throws NoSuchElementException {
		timeOut = Integer.parseInt(getProperty("Config.properties", "timeout"));
		if (visibility.equalsIgnoreCase("hide")) {
			try {
				Reporter.log("Waiting for the element: " + element
						+ " to not to show up", true);
				wait.resetImplicitTimeout(0);
				wait.resetExplicitTimeout(5);
				isElementDisplayed(element); // this is expected to throw
				// exception as element is
				// hidden
				wait.resetImplicitTimeout(timeOut);
				wait.resetExplicitTimeout(timeOut);
				Assert.fail("ASSERT FAILED: "
						+ element
						+ " is found visible even though it is expected to be hidden");
			} catch (NoSuchElementException e) {
				wait.resetImplicitTimeout(timeOut);
				wait.resetExplicitTimeout(timeOut);
				logMessage("ASSERT PASS: " + element + " is hidden");
			}
		} else if (visibility.equalsIgnoreCase("show")) {
			try {
				wait.resetImplicitTimeout(0);
				wait.resetExplicitTimeout(5);
				isElementDisplayed(element);
				wait.resetImplicitTimeout(timeOut);
				wait.resetExplicitTimeout(timeOut);
			} catch (NoSuchElementException e) {
				wait.resetImplicitTimeout(timeOut);
				wait.resetExplicitTimeout(timeOut);
				logMessage("ASSERT FAILED: " + element + " is Show");
				throw new NoSuchElementException(
						"visibility' field is not displayed in Application.");
			}

		} else {
			logMessage("data is not valid in sheet");
			throw new NoSuchElementException("data is not valid in sheet");
		}
	}

}
