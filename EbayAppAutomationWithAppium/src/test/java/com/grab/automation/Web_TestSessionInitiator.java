package com.grab.automation;
//package com.qait.automation;
//
//import static com.qait.automation.utils.ConfigPropertyReader.getProperty;
//import static com.qait.automation.utils.YamlReader.getYamlValue;
//import static com.qait.automation.utils.YamlReader.setYamlFilePath;
//import io.appium.java_client.android.AndroidDriver;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.testng.Reporter;
//
//import com.qait.automation.utils.TakeScreenshot;
//import com.qait.keywords.DWPM.DWPMAboutPageActions;
//import com.qait.keywords.DWPM.DWPMDashBoard;
//import com.qait.keywords.DWPM.DWPMForgetPasswordActions;
//import com.qait.keywords.DWPM.DWPMLABSActions;
//import com.qait.keywords.DWPM.DWPMLoginPageActions;
//import com.qait.keywords.DWPM.DWPMReportActions;
//import com.qait.keywords.DWPM.DWPMTrackActivity;
//import com.qait.keywords.DWPM.DWPMTrackChangeActions;
//import com.qait.keywords.DWPM.DWPMTrackDietActions;
//import com.qait.keywords.DWPM.DWPMViewMenuOptions;
//import com.qait.keywords.MOB.ActivityListPage;
//import com.qait.keywords.MOB.CourseInfoPage;
//import com.qait.keywords.MOB.EULApageAction;
//import com.qait.keywords.MOB.FlashcardsPageActions;
//import com.qait.keywords.MOB.LoginPageActions;
//import com.qait.keywords.MOB.NotificationsPageActions;
//import com.qait.keywords.MOB.PracticeQuizPageActions;
//import com.qait.keywords.MOB.SettingsPageActions;
//import com.qait.keywords.MOB.SideBarPageAction;
//import com.qait.keywords.MOB2.MOB2PracticeQuizPageActions;
//import com.qait.keywords.MOB2.mob2FlashcardsPageActions;
//import com.qait.keywords.MOB2.mob2LoginPageActions;
//import com.qait.keywords.MOB2.mob2SettingsPageActions;
//import com.qait.keywords.MOB2.mob2SideBarPageAction;
//import com.qait.keywords.MOB2.mobv2ActivityListPage;
//import com.qait.keywords.MTPM.MTPMActivityListPage;
//import com.qait.keywords.MTPM.MTPMAttemptScreen;
//import com.qait.keywords.MTPM.MTPMCourseScreen;
//import com.qait.keywords.MTPM.MTPMEULApageAction;
//import com.qait.keywords.MTPM.MTPMLoginPageActions;
//import com.qait.keywords.MTPM.MTPMSettingScreen;
//import com.qait.keywords.MTPM.MTPMTermAction;
//import com.qait.keywords.MTPM.MTPMTermsListScreen;
//
//public class Web_TestSessionInitiator {	
//	static int timeout;
//	protected WebDriver driver;
//	protected  WebDriver	wdriver;
//	private final WebDriverFactory wdfactory;
//	String browser;
//	String seleniumserver;
//	String seleniumserverhost;
//	String appbaseurl;
//	String applicationpath;
//	String chromedriverpath;
//	String datafileloc = "";
//	Map<String, Object> chromeOptions = null;
//	// DesiredCapabilities capabilities;
//
//	/**
//	 * Initiating the page objects
//	 */
//	public TakeScreenshot takescreenshot;
//
//
//	//MOB2
//	public mob2LoginPageActions MOB2loginPage ;
//	public mob2SideBarPageAction	mob2SlideBar;
//	public mobv2ActivityListPage	mobv2Activity;	
//	public mob2FlashcardsPageActions	mob2FlashCards;
//	public MOB2PracticeQuizPageActions	mob2PracticeQuiz;
//	public mob2SettingsPageActions mob2Settings;
//	/**
//	 * Page object Initiation done
//	 */
//	private void _initPage() {
//		//mob2
//		MOB2loginPage	=	new mob2LoginPageActions(driver);
//		mob2SlideBar		=	new mob2SideBarPageAction(driver);
//		mobv2Activity	=	new mobv2ActivityListPage(driver);
//		mob2FlashCards	=	new mob2FlashcardsPageActions(driver);
//		mob2PracticeQuiz	=	new MOB2PracticeQuizPageActions(driver);
//		mob2Settings	=	new mob2SettingsPageActions(driver);
//	}
//
//
//	public Web_TestSessionInitiator(String testname) {
//		wdfactory = new WebDriverFactory();
//		testInitiator(testname);
//	}
//
//	private void _configureBrowser(String testname) {
//			if (_getSessionConfig().get("platform").equalsIgnoreCase("android")&&
//					_getSessionConfig().get("appType").equalsIgnoreCase("native")) {
//			driver = wdfactory.setAndroidMobileCapbilities();
//			driver.manage().window().maximize();
//			driver.manage()
//					.timeouts()
//					.implicitlyWait(Integer.parseInt(getProperty("timeout")),
//							TimeUnit.SECONDS);
//		}
//			else if (_getSessionConfig().get("appType").equalsIgnoreCase("web")) {
//				wdriver = (WebDriver) wdfactory.getWebDriver(_getSessionConfig());
//				System.out.println("_________________");
//				wdriver.manage().window().maximize();
//				wdriver.manage()
//						.timeouts()
//						.implicitlyWait(Integer.parseInt(getProperty("timeout")),
//								TimeUnit.SECONDS);
//			}
//				
//			}
//	
//	
//	private Map<String, String> _getSessionConfig() {
//		String[] configKeys = { "tier", "browser", "seleniumserver",
//				"seleniumserverhost", "timeout", "driverpath", "platform",
//				"appium_url","appType" };
//		Map<String, String> config = new HashMap<>();
//		for (String string : configKeys) {
//			config.put(string, getProperty("./Config.properties", string));
//		}
//		return config;
//	}
//
//
//	public void closeBrowserSession() {
//		// try {
//		// Runtime.getRuntime().exec("taskkill /F /IM plugin-container.exe");
//		// } catch (IOException e1) {
//		// }
//		driver.quit();
//
//	}
//
//	public void closeBrowserWindow() {
//		driver.close();
//	}
//
//	public void deleteAllCookies() {
//		driver.manage().deleteAllCookies();
//	}
//
//	public AndroidDriver<WebElement> getDriver() {
//		return this.driver;
//	}
//
//	public void launchApplication() {
//		launchApplication(getYamlValue("baseurl"));
//	}
//
//	public void launchApplication(String baseurl) {
//		Reporter.log("\nThe application url is :- " + baseurl, true);
//		Reporter.log(
//				"The test browser is :- " + _getSessionConfig().get("browser")
//						+ "\n", true);
//		deleteAllCookies();
//		driver.get(baseurl);
//
//	}
//
//	public void openUrl(String url) {
//		driver.get(url);
//	}
//
//	private void testInitiator(String testname) {
//		setYamlFilePath();
//		_configureBrowser(testname);
//		_initPage();
//		takescreenshot = new TakeScreenshot(testname, this.driver);
//	}
//}
