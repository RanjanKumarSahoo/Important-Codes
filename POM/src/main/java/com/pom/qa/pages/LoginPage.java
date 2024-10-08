package com.pom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	// Page Factory - Object Repository:
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//a[.='Sign Up']")
	WebElement signup;
	
	@FindBy(xpath = "//img[@alt='Free CRM Software for customer relationship management, sales and support']")
	WebElement freecrmlogo;
	
	//Initializing the Page Object.
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public  String validatePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMImage() {
		return freecrmlogo.isDisplayed();
	}
	
	public HomePage login(String ur, String pwd) {
		username.sendKeys(ur);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}

}
