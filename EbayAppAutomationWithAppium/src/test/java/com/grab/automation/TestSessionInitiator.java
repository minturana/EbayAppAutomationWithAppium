package com.grab.automation;

import io.appium.java_client.android.AndroidDriver;

import static com.grab.automation.utils.ConfigPropertyReader.getProperty;
import static com.grab.automation.utils.YamlReader.getData;
import static com.grab.automation.utils.YamlReader.getYamlValue;
import static com.grab.automation.utils.YamlReader.setYamlFilePath;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;

import com.grab.automation.utils.HttpClient;
import com.grab.keywords.Ebay.Android_Ebay_SearchScreen;
import com.sun.jersey.api.client.ClientResponse;


public class TestSessionInitiator{	
	static int timeout;
	public WebDriver driver;
	private final WebDriverFactory wdfactory;
	String browser;
	String seleniumserver;
	String seleniumserverhost;
	String appbaseurl;
	String applicationpath;
	String chromedriverpath;
	String datafileloc = "";
	Map<String, Object> chromeOptions = null;
	DesiredCapabilities capabilities;

	/**
	 * Initiating the page objects
	 */
		
	public Android_Ebay_SearchScreen ebay;

	public AndroidDriver<WebElement> Driver;
	/**
	 * Page object Initiation done
	 */

	public TestSessionInitiator(String testname) {
		wdfactory = new WebDriverFactory();
		testInitiator(testname);
	}

	public TestSessionInitiator(String testname,String port, String udid) {
		wdfactory = new WebDriverFactory();
		testInitiator(testname,port,udid);
	}

	public TestSessionInitiator(String simpleName, Map<String, String> _getSessionConfig) {
		wdfactory = new WebDriverFactory();
		testInitiator(simpleName,_getSessionConfig);
	}

	private void testInitiator(String simpleName, Map<String, String> _getSessionConfig) {
		setYamlFilePath();
		_configureBrowser(simpleName,_getSessionConfig);
		_initPage(_getSessionConfig);
	}



	private void _initPage(Map<String, String> _getSessionConfig) {
		
	}


	private void _configureBrowser(String testname,String port,String udid) {
		if (_getSessionConfig().get("platform").equalsIgnoreCase("android")) {
			driver = wdfactory.setAndroidMobileCapbilities(port,udid);
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(getProperty("timeout")),TimeUnit.SECONDS);	
		}
	}



	private void _configureBrowser(String testname) {

		if (_getSessionConfig().get("platform").equalsIgnoreCase("android")) {

			driver = wdfactory.setAndroidMobileCapbilities();
		    driver.manage().timeouts().implicitlyWait(Integer.parseInt(getProperty("timeout")),TimeUnit.SECONDS);

		}

	}

	private Map<String, String> _configureBrowser(String simpleName, Map<String, String> _getSessionConfig) {
		driver = wdfactory.getWebDriver(_getSessionConfig);
		driver.manage().window().maximize();
		driver.manage().timeouts()
		.implicitlyWait(Integer.parseInt(getProperty("timeout")),
				TimeUnit.SECONDS);

		return _getSessionConfig;
	}

	
	public void getAndroidDriverForMobile(){
		DesiredCapabilities capabilities10 = new DesiredCapabilities();
		capabilities10.setPlatform(Platform.ANDROID);
		capabilities10.setCapability("automationName","appium");
		capabilities10.setCapability("platformVersion", "5.0.2");
		capabilities10.setCapability("udid", "d566c2ac");
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	}



	private Map<String, String> _getSessionConfig() {
		String[] configKeys = { "tier", "browser", "seleniumserver",
				"seleniumserverhost", "timeout", "driverpath", "platform",
				"appium_url","device" ,"product","browserversion"};
		Map<String, String> config = new HashMap<>();
		for (String string : configKeys) {
			config.put(string, getProperty("./Config.properties", string));
		}
		return config;
	}

	public void _initPage()
	{

		ebay                =   new Android_Ebay_SearchScreen(driver);
	}


	public void closeBrowserSession() {
		driver.quit();
	}

	public void closeBrowserWindow() {
		driver.close();
	}

	public void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	public void launchApplication() {
		launchApplication(getYamlValue("baseurl"));
	}

	public void launchApplication(String baseurl) {
		Reporter.log("\nThe application url is :- " + baseurl, true);
		Reporter.log(
				"The test browser is :- " + _getSessionConfig().get("browser")
				+ "\n", true);
		deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(getProperty("timeout")),
				TimeUnit.SECONDS);
		driver.get(baseurl);


	}

	public void launchApplication(String username, String userPassword,String CourseKey,String ISBN) {
		System.out.println("*** Test Data ");
		System.out.println("Login ID:- "+username );
		System.out.println("Login Password:- "+userPassword );
		System.out.println("Course Key :- "+CourseKey );
		System.out.println("Book ISBN:- "+ISBN );

		System.out.println("*********************************************");

		System.out.println("**********************************************");

		try {
			String ssoToken = getSSOToken(username, userPassword);
			String destinationURL = buildLaunchUrl(ssoToken,CourseKey,ISBN);
			openUrl(destinationURL);
		} catch (JSONException e) {
			Reporter.log("[ERROR]: Could not log in to application, trouble authenticating: " + e.toString(), true);
		}Reporter.log("successfully logs in to the application",true);
	}

	public void launchProdApplication(String username, String userPassword){
		System.out.println("*** Test Data ");
		System.out.println("Login ID:- "+username );
		System.out.println("Login Password:- "+userPassword );
		System.out.println("*********************************************");

		System.out.println("**********************************************");

		try {
			String ssoToken = getSSOToken(username, userPassword);
			String destinationURL = buildLaunchUrlForProd(ssoToken);
			openUrl(destinationURL);
		} catch (JSONException e) {
			Reporter.log("[ERROR]: Could not log in to application, trouble authenticating: " + e.toString(), true);
		}
	}

	private String getSSOToken(String username, String password) throws JSONException {
		Object postBody = ("{\"uid\":\"" + username + "\", \"password\":\"" + password + "\"}");
		HttpClient httpclient = new HttpClient();
		ClientResponse response = httpclient.postHttpResponse(getData("SSO_TOKEN_URL"), postBody);
		String entity = response.getEntity(String.class);
		return new JSONObject(entity).getString("token");
	}

	private String buildLaunchUrl(String ssoToken, String CourseKey, String ISBN) {
		StringBuilder sb = new StringBuilder();
		sb.append(getData("PRODUCT_URL2"));
		sb.append("?token=");
		sb.append(ssoToken);
		sb.append("&courseKey=");
		sb.append(CourseKey);
		sb.append("&eISBN=");
		sb.append(ISBN);
		return sb.toString();
	}

	private String buildLaunchUrlForProd(String ssoToken){
		StringBuilder sb = new StringBuilder();
		sb.append(getData("PRODUCT_URL2"));
		sb.append("?token=");
		sb.append(ssoToken);
		return sb.toString();
	}


	public void openUrl(String url) {
		System.out.println("URL"+ url);
		driver.get(url);
	}

	private void testInitiator(String testname) {
		setYamlFilePath();
		_configureBrowser(testname);
		_initPage();
	}

	private void testInitiator(String testname,String port,String udid) {
		setYamlFilePath();
		_configureBrowser(testname, port, udid);
		_initPage();
	}

}
