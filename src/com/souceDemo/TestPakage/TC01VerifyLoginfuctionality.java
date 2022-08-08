package com.souceDemo.TestPakage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.souceDemo.UtilityPakage.Screenshot_code;
import com.sourceDemo.POMpakage.LoginPOMClass;

public class TC01VerifyLoginfuctionality extends TestBaseClass
{
	@Test
	public void verify_loginfuncionality()
	{
		String expetedTitle="Swag Labs";
		String actualTitle=driver.getTitle();
		if(expetedTitle.equals(actualTitle))
		{
			System.out.println("testcase is passed");
		}
		else
		{
			System.out.println("testcase is failed");
		}
			
	}

}
