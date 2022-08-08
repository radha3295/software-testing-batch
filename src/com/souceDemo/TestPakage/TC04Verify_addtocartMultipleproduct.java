package com.souceDemo.TestPakage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sourceDemo.POMpakage.HomePOMClass;
import com.sourceDemo.POMpakage.LoginPOMClass;

public class TC04Verify_addtocartMultipleproduct extends TestBaseClass
{
	@Test
	public void verify_addtocartMultiple()
	{
		
		HomePOMClass hp=new HomePOMClass(driver);
		hp.clickOnmultiplepAddtocart();
		
		//validation
		String expectedCount="6";
		String actualCount=hp.gettextFromAddtoCart();
		Assert.assertEquals(actualCount, expectedCount);
	}

}
