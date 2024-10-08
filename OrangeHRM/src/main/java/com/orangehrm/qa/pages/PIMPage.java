package com.orangehrm.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.qa.base.TestBase;



public class PIMPage extends TestBase {


	@FindBy(className = "oxd-main-menu-item")
	List<WebElement> PIMlink;

	@FindBy(partialLinkText = "Add Employee")
	WebElement addEmployeeLink;

	@FindBy(xpath =  "//button[@class='oxd-icon-button oxd-icon-button--solid-main employee-image-action']")
	WebElement profileImage;

	@FindBy(name = "firstName")
	WebElement fName;

	@FindBy(name = "middleName")
	WebElement mName;

	@FindBy(name = "lastName")
	WebElement lName;

	@FindBy(className = "oxd-switch-input")
	WebElement checkBox;

	@FindBy(className = "oxd-input")
	public List<WebElement> inputFields;

	@FindBy(xpath  = "//button[@type='submit']")
	WebElement submitBtn;

	@FindBy(xpath  = "//p[@class='oxd-text oxd-text--p oxd-text--toast-title oxd-toast-content-text']")
	WebElement confirmMsg;

	@FindBy(partialLinkText = "Employee List")
	WebElement employeeList;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	List<WebElement> searchByName;

	@FindBy(xpath = "//div[@class='oxd-table-cell oxd-padding-cell'][3]")
	WebElement empName;

	public PIMPage() {
		PageFactory.initElements(driver, this);
	}
	public void clickOnPIMLink() {
		List<WebElement> pim=driver.findElements(By.xpath("//a[@class='oxd-main-menu-item']"));
		pim.get(1).click();
	}

	public String addEmployee(String firstName,String middleName,  String lastName, String userName, String pass, String confirmPass){
		addEmployeeLink.click();
		profileImage.sendKeys("C:\\Users\\Lenovo\\Pictures\\RanjanPhoto.jpeg");
		checkBox.click();
		fName.sendKeys(firstName);
		mName.sendKeys(middleName);
		lName.sendKeys(lastName);
		inputFields.get(5).sendKeys(userName);
		inputFields.get(6).sendKeys(pass);
		inputFields.get(7).sendKeys(confirmPass);
		submitBtn.click();
		return confirmMsg.getText();

	}

	public String searchEmployee(String name) throws InterruptedException {
		employeeList.click();
		searchByName.get(0).sendKeys(name);
		submitBtn.click();
		Thread.sleep(5000);
		return empName.getText();
	}

}
