package com.souceDemo.TestPakage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.souceDemo.UtilityPakage.Screenshot_code;
import com.sourceDemo.POMpakage.LoginPOMClass;

public class TestBaseClass 
{
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		System.out.println("Browser is opened ");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("Url is opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		//implicit wait is used
		
		//login Activity
		LoginPOMClass lp=new LoginPOMClass(driver);
		lp.sendUserName();
		System.out.println("username entered");
		lp.sendpassword();
		System.out.println("password entered");
		lp.clickOnLoginbtn();
		System.out.println("click on login button ");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("Browser closed");
	}
}
