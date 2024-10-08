package com.orangehrm.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.qa.base.TestBase;
import com.orangehrm.qa.pages.PIMPage;
import com.orangehrm.qa.pages.LoginPage;

public class PIMPageTest extends TestBase {

	LoginPage loginPage;
	PIMPage pimPage;
	String Fname="njan";
	String Mname="ku";

	public PIMPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		pimPage=new PIMPage();
		pimPage=loginPage.Login("Admin", "admin123");
		pimPage.clickOnPIMLink();
	}

	@Test
	public void AddNewEmployee() {
		String confirmMessage = pimPage.addEmployee(Fname, Mname, "Sahoo", "bcod123", "Abc@123", "Abc@123");
		Assert.assertEquals(confirmMessage, "Success");
	}

	@Test
	public void SearchEmployee() throws InterruptedException {
		String search=pimPage.searchEmployee(Fname+ " "+Mname);
		Assert.assertEquals(search, Fname+ " "+Mname);
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
