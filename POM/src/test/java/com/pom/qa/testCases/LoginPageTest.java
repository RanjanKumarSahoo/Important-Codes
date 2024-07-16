package com.pom.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.qa.base.TestBase;
import com.pom.qa.pages.HomePage;
import com.pom.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}
@BeforeMethod
public void setUp() {
	initialization();
	loginPage=new LoginPage();
}

@Test(priority = 1)
public void loginPageTitleTest() {
	String title=loginPage.validatePageTitle();
	Assert.assertEquals(title, "Free CRM software for customer relationship management, sales, and support.");
}

@Test(priority=2) 
public void crmLogoValidationTest() {
	boolean logo=loginPage.validateCRMImage();
	Assert.assertTrue(logo);
}

@Test(priority = 3)
public void loginTest() {
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
}




@AfterMethod
public void tearDown() {
	driver.quit();
}
	


	
}
