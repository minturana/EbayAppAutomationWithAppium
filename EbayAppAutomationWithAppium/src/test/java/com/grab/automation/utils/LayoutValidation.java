package com.grab.automation.utils;

import freemarker.template.TemplateException;
import io.appium.java_client.android.AndroidDriver;

import static com.grab.automation.utils.ConfigPropertyReader.getProperty;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import net.mindengine.galen.api.Galen;
import net.mindengine.galen.reports.GalenTestInfo;
import net.mindengine.galen.reports.HtmlReportBuilder;
import net.mindengine.galen.reports.model.LayoutReport;
import net.mindengine.galen.validation.ValidationError;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class LayoutValidation extends Galen {
	WebDriver driver;
	String PageName;
	String tier;
	private String filepath = "src/test/resources/PageObjectRepository/";

	public LayoutValidation(WebDriver driver, String pageName) {
		this.driver = driver;
		this.PageName = pageName;
	}

	public String  createPath() {
		String product = getProperty("productName").toUpperCase();
		String tier = getProperty("tier").toUpperCase();
		String val	=	this.filepath +"Mobile/"+"Android/"+product+"/"+ tier+"/" + this.PageName;
		System.out.println(val);
		return val;
	}



	public void checklayout(List<String> tagsToBeTested) {
		try {

			WebDriver Webdriver	=	driver;
	//		System.out.println(driver.getCapabilities().asMap());
			// Executing layout check and obtaining the layout report
	//		System.out.println(driver.getCapabilities());
			LayoutReport layoutReport = Galen.checkLayout(Webdriver,
					createPath()+ ".spec",
					tagsToBeTested, null, null, null);

			// Creating a list of tests
			LinkedList<GalenTestInfo> tests = new LinkedList<GalenTestInfo>();

			// Creating an object that will contain the information about the
			// test
			GalenTestInfo test = GalenTestInfo.fromString(this.PageName
					+ " - layout test");

			// Adding layout report to the test report
			test.getReport().layout(layoutReport,
					this.PageName + " - layout test");
			tests.add(test);

			// Exporting all test reports to html
			new HtmlReportBuilder().build(tests, "target/galen-reports");

			if (layoutReport.errors() > 0) {
				Reporter.log("There are Layout Errors on the page:- "
						+ this.PageName + "!!! The Errors are for ", true);
				for (ValidationError error : layoutReport.getValidationErrors()) {
					for (String errorMsg : error.getMessages()) {
						Reporter.log(errorMsg, true);
					}
				}
				// Assert.fail();
			}

		} catch (IOException | TemplateException ex) {
			Reporter.log(ex.getLocalizedMessage(), true);
		}
	}
}
