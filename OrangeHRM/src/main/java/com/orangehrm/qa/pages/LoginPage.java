package com.orangehrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.qa.base.TestBase;

public class LoginPage extends TestBase{
	@FindBy(name = "username")
	WebElement userNameInput;
	@FindBy(name = "password")
	WebElement passwordInput;
	@FindBy(css = "[type=submit]")
	WebElement submitBtn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public PIMPage Login(String username, String password) {
		userNameInput.sendKeys(username);
		passwordInput.sendKeys(password);
		submitBtn.click();
		return new PIMPage();

	}
}
