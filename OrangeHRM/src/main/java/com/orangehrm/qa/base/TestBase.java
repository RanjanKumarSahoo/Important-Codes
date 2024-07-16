package com.orangehrm.qa.base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.orangehrm.qa.utils.TestUtil;

public class TestBase {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static WebDriver driver;
	public static Properties prop;

	@SuppressWarnings("deprecation")
	public static void initialization() {
		driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");
	}









}

