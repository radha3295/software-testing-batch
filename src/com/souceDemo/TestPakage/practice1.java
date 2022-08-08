package com.souceDemo.TestPakage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.sourceDemo.POMpakage.HomePOMClass;
import com.sourceDemo.POMpakage.LoginPOMClass;

public class practice1
{	WebDriver driver;

	@BeforeClass
	public void setUP()
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		System.out.println("Browser is opened ");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("Url is opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		//implicit wait is used
	}
	
	@BeforeMethod
	public void loginactivity()
	{
		LoginPOMClass lp=new LoginPOMClass(driver);
		lp.sendUserName();
		System.out.println("username entered");
		lp.sendpassword();
		System.out.println("password entered");
		lp.clickOnLoginbtn();
		System.out.println("click on login button ");
	}
	@AfterMethod
	public void logoutActivity()
	{
		HomePOMClass hp=new HomePOMClass(driver);
		hp.click_on_settingbtn();
		System.out.println("clicked on settling button");
		hp.clikonlogoutbtn();
		System.out.println("clicked on logout button");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		System.out.println("Browser closed");
	}

}
