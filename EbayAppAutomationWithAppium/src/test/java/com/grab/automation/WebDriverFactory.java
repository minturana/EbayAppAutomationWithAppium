/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grab.automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import static com.grab.automation.utils.ConfigPropertyReader.getProperty;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.grab.automation.utils.restTest;

public class WebDriverFactory {
	static File classpathRoot = new File(System.getProperty("user.dir"));
	public static String product = getProperty("productName").toUpperCase();
	public static File appDir = new File(classpathRoot, "src/test/resources/testdata/APK/"+product+"/");
	private static DesiredCapabilities cap = null;
	static String firefoxProfilePath = "./src/test/resources/Profile";
	private static DesiredCapabilities capabilities;

	public static String tier	= getProperty("tier").toLowerCase();
	static String browser = getProperty("browser");
	static String platform = getProperty("platform");
	static String appType = getProperty("appType");
	static String deviceName = getProperty("deviceName");
	public static String device=getProperty("device");
	static String platformName = getProperty("platformName");
	static String udid = getProperty("udid");
	static String bundleId = getProperty("bundleId");
	static String platformVersion = getProperty("platformVersion");
	public static String appium_url = getProperty("appium_url");
	public static String app=getProperty("app_file_path");
	
	 //static File location = new File(appDir,restTest.getAPKPath());
	static File location = new File(appDir,app);
	 static String appPath = location.getAbsolutePath().trim().toString();
	 public static String browserversion= getProperty("browserversion");
	 public static String userName = "nirajupadhyay1";
	 public static String accessKey = "DbE5GJFXipE7Bqq7gosk";
	 
	private static AndroidDriver<WebElement> driver;
	
	// return set capabilities
	public static DesiredCapabilities getCapabilities() {
		return capabilities;
	}
	
	@SuppressWarnings("unchecked")
	WebDriver getWebDriver(Map<String, String> seleniumconfig) {
		
		System.out.println(browser);
		if (seleniumconfig.get("seleniumserver").equals("local")) {
			if (browser.equalsIgnoreCase("firefox")) {
				driverWeb = getFirefoxDriver();
			} else if (browser.equalsIgnoreCase("chrome")) {
				driverWeb = getChromeDriver(seleniumconfig.get("driverpath")
						.toString());
			} else if (browser.equalsIgnoreCase("Safari")) {
				driverWeb = getSafariDriver();
			} else if ((browser.equalsIgnoreCase("ie"))
					|| (browser.equalsIgnoreCase("internetexplorer"))
					|| (browser.equalsIgnoreCase("internet explorer"))) {
				driverWeb = getInternetExplorerDriver(seleniumconfig.get(
						"driverpath").toString()); }
				return driverWeb;
			
		} else if (seleniumconfig.get("seleniumserver").equalsIgnoreCase(
				"remote")){
			
			String seleniuhubaddress = seleniumconfig.get("seleniumserverhost");
			driver = (AndroidDriver<WebElement>) setRemoteDriver(seleniuhubaddress);
		return driver;
	}
		return driverWeb;}
	

	
	/**
	 * set chrome path
	 * 
	 * @param driverpath
	 * @return
	 */
	private static ChromeDriver getChromeDriver(String driverpath) {
		System.out.println("Inside chrome driver");
		String os=System.getProperty("os.name");
		System.out.println("Os--> "+os);
		if(os.contains("Windows")){
		System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
		}
		else if(os.equalsIgnoreCase("Linux") || os.equalsIgnoreCase("Mac OS X")){
			System.setProperty("webdriver.chrome.driver", driverpath+File.separator+"chromedriver");
			System.out.println("Chrome driver path--> " +driverpath+File.separator+"chromedriver");
		}  
		DesiredCapabilities capabilities 		=	new DesiredCapabilities().chrome();
        capabilities.setJavascriptEnabled(true);
        System.out.println(capabilities);
		return new ChromeDriver(capabilities);
	}

	/**
	 * set webdriver for Firefox
	 * ZY223FV3H7
	 * @return
	 */
	private static WebDriver getFirefoxDriver() {
		FirefoxProfile profile;
		String autoAuthPath = "src/test/resources/AddOn/autoauth-2.1-fx+fn.xpi";
		File firefoxProfile = new File(firefoxProfilePath);// path of firefox
		// profile
		profile = new FirefoxProfile(firefoxProfile);
		File extension = new File(autoAuthPath);// path of AutoAuth
		try {
			profile.addExtension(extension);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		profile.setPreference("browser.cache.disk.enable", false);
		return new FirefoxDriver(profile);
	}

	/**
	 * set IE driver
	 * 
	 * @param driverpath
	 *            for IE
	 * @return
	 */
	private static WebDriver getInternetExplorerDriver(String driverpath) {
		System.setProperty("webdriver.ie.driver", driverpath);
		cap.setCapability("ignoreZoomSetting", true);
		return new InternetExplorerDriver(cap);
	}

	/**
	 * set safari driver
	 * 
	 * @return
	 */
	private static WebDriver getSafariDriver() {
		return new SafariDriver();
	}

	private IOSDriver<WebElement> iOSdriver;

	private WebDriver driverWeb;

	



	
	/**
	 * Set capability for thSystem.out.println(capabilities);e android, iOS and mobile web devices
	 * 
	 * @return
	 */
	public AndroidDriver<WebElement> setAndroidMobileCapbilities() {
		 //verified for android devices and set capability
		//appiumStart();
//	try {
//			restTest.downloadAPK();
//	} catch (IOException e1) {
//			e1.printStackTrace();
//		}
		capabilities = DesiredCapabilities.android();
		//capabilities.setCapability("device", "Samsung Galaxy S7");
		//capabilities.setCapability("os_version", "6.0");
		capabilities.setCapability("deviceName", deviceName);
		capabilities.setCapability("platformName", platformName);
		//capabilities.setCapability("bundleId", bundleId);
		capabilities.setCapability("platformVersion", platformVersion);
		capabilities.setCapability("fullReset",true);
		capabilities.setCapability("--session-override",true);

		//capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		//capabilities.setCapability("unicodeKeyboard", true);

		
		if (appType.equalsIgnoreCase("native")) {
			System.out.println(appPath);
//			Properties props = System.getProperties();
//			props.setProperty("appPath", appPath);
		    capabilities.setCapability("app", appPath);
			//capabilities.setCapability("app", "bs://6f5fc53873dedec8499d8f91f608dce3a00d4527");
		} else if (appType.equalsIgnoreCase("mobile_web")) {
			capabilities.setCapability("app", browser);
		}
		capabilities.setJavascriptEnabled(true);
		try {
//			return driver = new AndroidDriver<>(new URL(appium_url),
//					capabilities);
//			return driver = new AndroidDriver<>(new URL(appium_url),
//					capabilities);
			return driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),
				      capabilities);
		//return driver = new AndroidDriver(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), capabilities);
		} catch (MalformedURLException e) {

			e.printStackTrace();
		}
		return null;
	}

	public IOSDriver<WebElement> setiOSMobileCapbilities() {
		// runAppium();
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", deviceName);
		capabilities.setCapability("platformName", platform);
		capabilities.setCapability("udid", udid);
		capabilities.setCapability("bundleId", bundleId);
		capabilities.setCapability("platformVersion", platformVersion);

		if (appType.equalsIgnoreCase("native")) {
			capabilities.setCapability("app", appPath);
		} else if (appType.equalsIgnoreCase("mobile_web")) {
			capabilities.setCapability("app", browser);
		}
		capabilities.setJavascriptEnabled(true);
		return iOSdriver;
	}

	/**
	 * set remote driver This is help for run script on Remote
	 * 
	 * @param remoteAddress
	 * @return
	 */
	private WebDriver setRemoteDriver(String remoteAddress) {
		URL selserverhost = null;
		try {
			selserverhost = new URL(remoteAddress);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		cap.setJavascriptEnabled(true);
		System.out.println(cap.toString());
		return new RemoteWebDriver(selserverhost, cap);
	}

		 String Appium_Node_Path="C:\\Program Files (x86)\\Appium\\node.exe";
		 String Appium_JS_Path="C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js";
		 AppiumDriverLocalService service;
		 String service_url;

		public  void appiumStart()  {
				System.out.println(appium_url);
			  service_url	= appium_url;
			  if(device.equalsIgnoreCase("Mobile")){
			service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().
					usingPort(4723).usingDriverExecutable(new File(Appium_Node_Path)).
					withAppiumJS(new File(Appium_JS_Path)));}
			  else{
				  service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().
							usingPort(4724).usingDriverExecutable(new File(Appium_Node_Path)).
							withAppiumJS(new File(Appium_JS_Path)));}
			  
			service.start();
			System.out.println(appium_url);
			service_url = service.getUrl().toString();
			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//service_url = service.getUrl().toString();
		}

		public  void appiumStop() {
			service.stop();

		}
		
		public AndroidDriver<WebElement> setAndroidMobileCapbilities(String port, String deviceId) {
			 //verified for android devices and set capability
		    //appiumStart();
			String url;
		try {
				restTest.downloadAPK();
		} catch (IOException e1) {
				e1.printStackTrace();
			}
			capabilities = DesiredCapabilities.android();
			capabilities.setCapability("deviceName", deviceName);
			capabilities.setCapability("platformName", platformName);
			//capabilities.setCapability("bundleId", bundleId);
			capabilities.setCapability("platformVersion", platformVersion);
			capabilities.setCapability("fullReset",true);
			capabilities.setCapability("--session-override",true);
			capabilities.setCapability("deviceId",deviceId);

			//capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
			//capabilities.setCapability("unicodeKeyboard", true);

			
			if (appType.equalsIgnoreCase("native")) {
				System.out.println(appPath);
//				Properties props = System.getProperties();
//				props.setProperty("appPath", appPath);
				capabilities.setCapability("app", appPath);
			} else if (appType.equalsIgnoreCase("mobile_web")) {
				capabilities.setCapability("app", browser);
			}
			capabilities.setJavascriptEnabled(true);
			try {
				url = "http://127.0.0.1:"+port+"/wd/hub";
				System.out.println("URL--" +url);
				return driver = new AndroidDriver<>(new URL("http://127.0.0.1:"+port+"/wd/hub"),
						capabilities);
			} catch (MalformedURLException e) {

				e.printStackTrace();
			}
			return null;
		}
}
