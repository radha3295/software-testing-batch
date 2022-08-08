package com.souceDemo.TestPakage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sourceDemo.POMpakage.HomePOMClass;
import com.sourceDemo.POMpakage.LoginPOMClass;

public class TC06Verify_the_about_option {
	@Test
	public void verify_about_functioanality()
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		System.out.println("Browser is opened ");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("Url is opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		//implicit wait is used
		// login Activity
		LoginPOMClass lp=new LoginPOMClass(driver);
		lp.sendUserName();
		System.out.println("username entered");
		lp.sendpassword();
		System.out.println("password entered");
		lp.clickOnLoginbtn();
		System.out.println("click on login button ");
		
		// we are now on homepage
		System.out.println("now we are on homepage");
		HomePOMClass hp=new HomePOMClass(driver);
		
		hp.click_on_settingbtn();
		System.out.println("clicked on settling menu ");
		
		hp.clickOnAbout();
		System.out.println("we can check about option here");
	}

}
