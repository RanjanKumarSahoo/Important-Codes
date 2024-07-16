package com.orangehrm.qa.testCases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.qa.base.TestBase;
import com.orangehrm.qa.pages.LoginPage;



public class LoginPageTest extends TestBase{

	LoginPage loginPage;

	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
	}

	@Test(priority = 1)
	public void login() {
		loginPage.Login("Admin","admin123");

	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}




}
