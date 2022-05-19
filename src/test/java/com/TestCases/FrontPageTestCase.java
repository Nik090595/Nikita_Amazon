package com.TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.POM.Amazon_FrontPage;
import com.Pojo.BaseClass;
import com.Pojo.Browser;
import com.Utilities.Excel;
import com.Utilities.ListenersTest;
import com.Utilities.Reports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

@Listeners(ListenersTest.class)
public class FrontPageTestCase extends BaseClass{

	ExtentReports reports;
	ExtentTest Test;
	
	@BeforeClass
	public void configureExtentReport() {
		reports = Reports.addReport();
	}
	@BeforeMethod
	public void launchBrowser() {
		driver = Browser.OpenBrowser("https://www.amazon.in/");
	}
	
	@DataProvider (name = "details")
	public Object[][] data(){
		return new Object [][] {{"nikitanakade1@gmail.com", "Nikita95"}};
	}
	
	@Test (dataProvider = "details")
	public void logintoAmazon(String mail, String Password) {
		Test = reports.createTest("logintoAmazon");
		Amazon_FrontPage pom = new Amazon_FrontPage(driver);
		String ActualText = pom.getloginTitle();
		String ExpectedText = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		SoftAssert assert1 = new SoftAssert();
		assert1.assertEquals(ExpectedText, ActualText);
		pom.clickOnSign();
		pom.enterMailID(mail);
		pom.clickOnContinue();
		pom.enterPassword1(Password);
		pom.clickOnSignIn();
		assert1.assertAll();
	}
	
	@Test
	public void createAccountToAmzaon() throws EncryptedDocumentException, IOException {
		Test = reports.createTest("createAccountToAmzaon");
		Amazon_FrontPage pom = new Amazon_FrontPage(driver);
		String ActualTitle = pom.getCreateAccTitle();
		String ExpectedTitle = "Amazon Registration" ;
//		SoftAssert A = new SoftAssert();
//		A.assertEquals(ActualTitle, ExpectedTitle);
		pom.clickOnSign();
		pom.clickOnCreateNewAccount();
		String Name = Excel.getExcelsheetData(1, 1, "Details");
		pom.enterName(Name);
		String Mobile = Excel.getExcelsheetData(2, 1, "Details");		
	    pom.enterMobileNumber(Mobile);
//	    String Email2 = Excel.getExcelsheetData(3, 1, "Details");		
//	    pom.entermailID(Email2);
	    String Password = Excel.getExcelsheetData(4, 1, "Details");
	    pom.enterPassword(Password);
	    pom.clickOnContinueButton();
//	    A.assertAll();
	}
	
	@Test
	public void changeMarathiLanguage() {
		Test = reports.createTest("changeMarathiLanguage");
		Amazon_FrontPage pom = new Amazon_FrontPage(driver);
		String ActualTitle = pom.getLanguageTitle();
		String ExpectedTitle = "Change Language Settings" ;
		SoftAssert A = new SoftAssert();
		A.assertEquals(ActualTitle, ExpectedTitle);
		pom.clickOnFlag();
		pom.selectMarathilang();
		pom.saveChanges();
		A.assertAll();
	}
	
	@DataProvider (name ="AddressDetails")
	public Object[][] addressdata(){
		return new Object[][] {{"Nikita Nakade", "7397936102", "444602","House No.2", "Dhanwantri Nagar","Dastur Nagar Road", "Amravati", "Maharashtra"}
		};
		}
	
	
	@Test
	public void enterNewAddressDetails(String Name, String Phone, String Pin, String Line1, String Line2,
			String LandMark, String CityName, String StateName) {
		Test = reports.createTest("enterNewAddressDetails");
		Amazon_FrontPage pom = new Amazon_FrontPage(driver);
		pom.clickOnAddress();
		pom.clickOnPickUpPoint();
		pom.clickOnNewAddress();
		pom.enterFullName(Name);
		pom.enterMobileNumver(Phone);
		pom.enterPincode(Pin);
		pom.enterAddLine1(Line1);
		pom.enterAddLine2(Line2);
		pom.enterLandMark(LandMark);
		pom.enterCity(CityName);
		pom.enterState(StateName);
		pom.clickOnDefault();
		pom.clickOnAddressType();
		pom.clickOnAddressType1();
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
	
	@AfterClass
	public void flushResults() {
		reports.flush();
	}
}
