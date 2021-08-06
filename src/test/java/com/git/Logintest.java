package com.git;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Logintest {
	
	public static WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		
	}
	@Test
	public void doLogin()
	{
		driver.get("https://www.google.com/");
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
