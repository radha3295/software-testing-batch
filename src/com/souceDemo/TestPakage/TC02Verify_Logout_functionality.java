package com.souceDemo.TestPakage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sourceDemo.POMpakage.HomePOMClass;
import com.sourceDemo.POMpakage.LoginPOMClass;

public class TC02Verify_Logout_functionality extends TestBaseClass
{
	@Test
	public void verify_logout_functionality() 
	{
		
		// we are now on homepage
		System.out.println("now we are on homepage");
		HomePOMClass hp=new HomePOMClass(driver);
		hp.click_on_settingbtn();
		System.out.println("clicked on settling button");
		hp.clikonlogoutbtn();
		System.out.println("clicked on logout button");
		
		//validation
		//after logout we are on login page
		String expectedTitle="Swag Labs";
		String actualTitle=driver.getTitle();
		if(expectedTitle.equals(actualTitle))
			{
				System.out.println("testcase is passed");
			}
		else
		{
			System.out.println("testcase is failed");
		}
	}

}
