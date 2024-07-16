package com.pom.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pom.qa.base.TestBase;
import com.pom.qa.pages.ContactsPage;
import com.pom.qa.pages.HomePage;
import com.pom.qa.pages.LoginPage;
import com.pom.qa.utili.TestUtil;

public class ContactsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	String sheetName="contacts";
	
	
	public ContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUP() {
		initialization();
		testUtil=new TestUtil();
		contactsPage=new ContactsPage();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.switchToFrame();
		contactsPage=homePage.clickOnContacts();
	}
		
		@Test(priority = 1)
		public void verifyContactLabelTest() {
			Assert.assertTrue(contactsPage.verifyContactLabel());
		}
		
		@Test(priority = 2)
		public void selectSingleContactTest() {
		contactsPage.selectContactCheckBox("Sonu Sahoo");
		
	}
		
		@Test(priority = 3)
		public void selectMultipleContactTest() {
		contactsPage.selectContactCheckBox("Sonu Sahoo");
		contactsPage.selectContactCheckBox("Kanhu Sahoo");
		
	}
		
		@DataProvider
		public Object[][] getPOMTestData() {
			Object data[][]=TestUtil.getTestData(sheetName);
			return data;
		}
		
		@Test(priority = 4, dataProvider = "getPOMTestData")
		public void valdiateNewContact(String title, String firstname, String surname, String phonenumber) {
			homePage.clickOnNewContact();
			//contactsPage.newContactName("Mr.", "Ramu", "Lenka", "9040397679");
			contactsPage.newContactName(title, firstname, surname, phonenumber);
		}
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}

}
