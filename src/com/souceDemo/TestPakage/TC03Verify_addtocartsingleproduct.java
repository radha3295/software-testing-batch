package com.souceDemo.TestPakage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sourceDemo.POMpakage.HomePOMClass;
import com.sourceDemo.POMpakage.LoginPOMClass;

public class TC03Verify_addtocartsingleproduct extends TestBaseClass 
{
	@Test
	public void verify_addtocart_product()
	{
		
		HomePOMClass hp=new HomePOMClass(driver);
		hp.selectElementfromdropdown();
		System.out.println("filer applied");
		
		
		hp.clickOnAddToCart();
		System.out.println("clicked on add to cart of single bag product");
		String expectedCount="1"	;
		String actualCount=hp.gettextFromAddtoCart();
		Assert.assertEquals(actualCount, expectedCount);

	}

}
