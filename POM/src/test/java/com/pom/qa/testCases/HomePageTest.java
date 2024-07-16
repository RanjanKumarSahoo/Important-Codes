package com.pom.qa.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.qa.base.TestBase;
import com.pom.qa.pages.ContactsPage;
import com.pom.qa.pages.DealsPage;
import com.pom.qa.pages.HomePage;
import com.pom.qa.pages.LoginPage;
import com.pom.qa.utili.TestUtil;

import junit.framework.Assert;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	DealsPage dealsPage;

	public HomePageTest() {
		super();
	}
	
@BeforeMethod
public void setUp() {
	initialization();
	testUtil=new TestUtil();
	loginPage=new LoginPage();
	homePage =loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
}

@SuppressWarnings("deprecation")
@Test(priority = 1)
public void verifyTitleTest() {
	String title=homePage.verifyTitle();
	Assert.assertEquals(title, "CRMPRO","Title is not matching"); //if test case fail then we will get the msg.
}

@SuppressWarnings("deprecation")
@Test(priority = 2)
public void verifyUNTest() {
	testUtil.switchToFrame();
boolean un	=homePage.verifyUN();
Assert.assertTrue(un);
}

@Test(priority = 3)
public void clickOnContactsTest() {
	testUtil.switchToFrame();
	contactsPage=homePage.clickOnContacts();
}

@Test(priority = 4)
public void clickOnDealsTest() {
	testUtil.switchToFrame();
  dealsPage=homePage.clickOnDeals();
}

@AfterMethod
public void tearDown() {
	driver.quit();
}
	
	
}
