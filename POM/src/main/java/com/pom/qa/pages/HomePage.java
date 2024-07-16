package com.pom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath = "//td/table/tbody/tr/td[contains(.,'User: Ranjan Sahoo')]")
	WebElement unvalidation;
	
	@FindBy(xpath = "//a[.='Contacts']")
	WebElement contactsLink;
	
	@FindBy(xpath = "//a[.='Deals']")
	WebElement dealssLink;
	
	@FindBy(xpath="//a[text()='New Contact']")
	WebElement clickNewContact;
	
	//initializing the page object
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTitle() {
		String title=driver.getTitle();
		return title;
	}
	
	public boolean verifyUN() {
	boolean un	=unvalidation.isDisplayed();
	return un;
	}
	
	public ContactsPage clickOnContacts() {
		contactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDeals() {
		dealssLink.click();
		return new DealsPage();
	}
	public void clickOnNewContact() {
		Actions a=new Actions(driver);
		a.moveToElement(contactsLink);
		clickNewContact.click();
	}

}
