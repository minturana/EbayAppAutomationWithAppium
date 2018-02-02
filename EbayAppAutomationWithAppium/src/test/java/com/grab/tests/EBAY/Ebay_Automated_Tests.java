package com.grab.tests.EBAY;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.grab.automation.BaseTest;
import com.grab.automation.TestSessionInitiator;

public class Ebay_Automated_Tests extends BaseTest {

	TestSessionInitiator test;

	@BeforeClass(groups = { "Mobile", "Tablet" })
	public void LaunchAppWithApiumOnEmulator() {
		test = new TestSessionInitiator(this.getClass().getSimpleName());
		// loadValue();
	}

	@Test(groups = { "Mobile", "Tablet" })
	public void Test01_searchaProductByKeyword() {
		test.ebay.searchItem("Mobile Phones");
	}

	@Test(groups = { "Mobile", "Tablet" })
	public void Test02_performSortingAfterSearchingResults() {

	}

	@Test(groups = { "Mobile", "Tablet" })
	public void Test03_WriteUtilityMethodThatReturnNitemPricesBasedOnTheAboveSearch() {

	}

	@Test(groups = { "Mobile", "Tablet" })
	public void Test04_clickOnProductLinkAndGoToProductPage() {

	}

	@Test(groups = { "Mobile", "Tablet" })
	public void Test05_clickOnWatch() {

	}

	@Test(groups = { "Mobile", "Tablet" })
	public void Test06_verifySignUpPageIsSigningUp() {

	}

	@AfterClass
	public void closeTheApp() {
		test = new TestSessionInitiator(this.getClass().getSimpleName());
		// loadValue();
	}

}