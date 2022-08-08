package com.souceDemo.TestPakage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.souceDemo.UtilityPakage.Screenshot_code;
import com.sourceDemo.POMpakage.HomePOMClass;
import com.sourceDemo.POMpakage.LoginPOMClass;

public class TC05Verify_that_product_select_by_filter 
{
	@Test
	public void verify_product_filter() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		System.out.println("Browser is opened ");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("Url is opeded");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		//implicit wait is used
		
		Screenshot_code sc=new Screenshot_code();
		sc.takeScreenshot(driver);
		
		LoginPOMClass lp=new LoginPOMClass(driver);
		lp.sendUserName();
		System.out.println("username entered");
		lp.sendpassword();
		System.out.println("password entered");
		lp.clickOnLoginbtn();
		System.out.println("click on login button ");
		
		HomePOMClass hp=new HomePOMClass(driver);
		hp.selectElementfromdropdown();
		System.out.println("we selected Price low to high filter from dropdwon");
	}

}
