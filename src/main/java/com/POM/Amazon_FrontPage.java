package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Pojo.BaseClass;

public class Amazon_FrontPage extends BaseClass{

	@FindBy (xpath = "//a[@id='nav-link-accountList']") private WebElement signin;
	@FindBy (xpath = "//input[@id='ap_email']") private WebElement mail;
	@FindBy (xpath = "//input[@id='continue']") private WebElement continue1;
	@FindBy (xpath =  "//input[@type='password']") private WebElement pass;
	@FindBy (xpath = "//input[@type='submit']") private WebElement sign;
	
	@FindBy (xpath = "//a[@class='a-button-text']") private WebElement createAcc;
	@FindBy (xpath = "//input[@type='text']")private WebElement name;
	@FindBy (xpath = "//input[@id='ap_phone_number']")private WebElement mobile;
	@FindBy (xpath = "//input[@id='ap_email']")private WebElement mail2;
	@FindBy (xpath = "//input[@id='ap_password']")private WebElement password;
	@FindBy (xpath = "//input[@id='continue']")private WebElement continue2;
	
	@FindBy (xpath = "//a[@aria-label='Choose a language for shopping.']") private WebElement Lang;
	@FindBy (xpath = "//span[text()='MR']") private WebElement Marathi;
	@FindBy (xpath = "//input[@class='a-button-input']") private WebElement save;
	
	@FindBy (xpath = "//a[@id='nav-global-location-popover-link']") private WebElement address;
	@FindBy (xpath = "//a[@role='navigation']") private WebElement addpickup;
	@FindBy (xpath = "//div[@class='a-box first-desktop-address-tile']")private WebElement addnewAddress;
	@FindBy (xpath = "//input[@name='address-ui-widgets-enterAddressFullName']")private WebElement Fullname;
	@FindBy (xpath = "//input[@name='address-ui-widgets-enterAddressPhoneNumber']")private WebElement phone;
	@FindBy (xpath = "//input[@name='address-ui-widgets-enterAddressPostalCode']")private WebElement pincode;
	@FindBy (xpath = "//input[@name='address-ui-widgets-enterAddressLine1']")private WebElement addLine1;
	@FindBy (xpath = "//input[@name='address-ui-widgets-enterAddressLine2']")private WebElement addLine2;
	@FindBy (xpath = "//input[@name='address-ui-widgets-landmark']")private WebElement landmark;
	@FindBy (xpath = "//input[@name='address-ui-widgets-enterAddressCity']") private WebElement City;
	@FindBy (xpath = "//span[text()='MAHARASHTRA']") private WebElement state;
	@FindBy (xpath = "//input[@name='address-ui-widgets-use-as-my-default']") private WebElement defaultaddress;
	@FindBy (xpath = "//span[text()=' Select an Address Type ']") private WebElement addType;
	@FindBy (xpath = "//a[@id='dropdown1_1']") private WebElement drop1;
	
	
	public Amazon_FrontPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSign() {
		signin.click();
	}
	
	public void enterMailID(String Email) {
		 mail.sendKeys(Email);
	}
	
	public void clickOnContinue() {
		continue1.click();
	}
	
	public String getloginTitle() {
		return driver.getTitle();
	}
	
	public void enterPassword1(String Password) {
		password.sendKeys(Password);
	}
	
	public void clickOnSignIn() {
		sign.click();
	}
	
	public void clickOnCreateNewAccount() {
		createAcc.click();
	}
	
	public String getCreateAccTitle() {
		return driver.getTitle();
	}
	
	public void enterName(String Name) {
		name.sendKeys(Name);
	}
	
	public void enterMobileNumber(String Mobile) {
		mobile.sendKeys(Mobile);
	}
	
	public void entermailID(String Email2) {
		mail2.sendKeys();
	}
	public void enterPassword(String Password) {
		password.sendKeys(Password);
	}
	
	public void clickOnContinueButton() {
		continue2.click();
	}
	
	public void clickOnFlag() {
		Lang.click();
	}
	public String getLanguageTitle() {
		return driver.getTitle();
	}
	
	public void selectMarathilang() {
		Marathi.click();
	}
	
	public void saveChanges() {
		save.click();
	}

	public void clickOnAddress() {
		address.click();
	}
	
	public void clickOnPickUpPoint() {
		addpickup.click();
	}
	
	public void clickOnNewAddress() {
		addnewAddress.click();
	}
	
	public void enterFullName(String Name) {
		Fullname.sendKeys(Name);
	}
	
	public void enterMobileNumver(String Phone) {
		phone.sendKeys(Phone);
	}
	
	public void enterPincode(String Pin) {
		pincode.sendKeys(Pin);
	}
	
	public void enterAddLine1(String Line1) {
		addLine1.sendKeys(Line1);
	}
	
	public void enterAddLine2(String Line2) {
		addLine2.sendKeys(Line2);
	}
	
	public void enterLandMark(String LandMark) {
		landmark.sendKeys(LandMark);
	}
	
	public void enterCity (String CityName) {
		City.sendKeys(CityName);
	}
	
	public void enterState (String StateName) {
		state.sendKeys(StateName);
	}
	
	public void clickOnDefault () {
		defaultaddress.click();
	}
	
	public void clickOnAddressType () {
		addType.click();
	}
	
	public void clickOnAddressType1 () {
		Select A = new Select(drop1);
		A.selectByIndex(0);
	}
}
