package com.grab.keywords.Ebay;

import org.openqa.selenium.WebDriver;

import com.grab.automation.getpageobjects.GetPage;

public class Android_Ebay_SearchScreen extends GetPage {

	private static String pageName = "ebaySearchScreen";
	
	public Android_Ebay_SearchScreen(WebDriver driver) {
		super(driver, pageName);
		this.driver = driver;
	}

	public void searchItem(String productItem){
		isElementDisplayed("search_box");
		clickOnElementFromText(element("search_box"));
		element("search_src_text").sendKeys(productItem);
	}
	
	public void doPerformSortingAfterSearchingResults(){
		
	}
	
	public void writeUtilityMethodThatReturnNitemPricesBasedOnTheAboveSearch(){
		
	}
	
	public void clickOnProductLinkAndGoToProductPage(){
		
	}
	
	public void clickOnWatch(){
		
	}
	
	public void verifySignUpPageIsSigningUp(){
		
	}
}

