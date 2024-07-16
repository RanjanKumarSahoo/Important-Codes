package com.pom.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pom.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath = "//td[contains(text(),'Contacts')]")
	WebElement contactLabel;
	
	@FindBy(name  = "first_name")
	WebElement firstName;
	
	@FindBy(name  = "surname")
	WebElement surName;
	
	@FindBy(name  = "phone")
	WebElement phoneNumber;
	
	@FindBy(name  = "//input[@value='Save' and @type='submit']")
	WebElement saveBTN;
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyContactLabel() {
	return contactLabel.isDisplayed();
	}
	
	public void selectContactCheckBox(String name) {
		driver.findElement(By.xpath("//a[@_name='"+name+"']/../../td/input"));
	}
	
	public void newContactName(String title, String fName, String lName, String phone) {
		Select s=new Select(driver.findElement(By.name("title")));
		s.deselectByVisibleText(title);
		
		firstName.sendKeys(fName);
		surName.sendKeys(lName);
		phoneNumber.sendKeys(phone);
		saveBTN.click();
	}

}
