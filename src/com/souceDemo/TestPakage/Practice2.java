package com.souceDemo.TestPakage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.sourceDemo.POMpakage.HomePOMClass;
import com.sourceDemo.POMpakage.LoginPOMClass;

public class Practice2 extends practice1
{

	@Test
	public void login()
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
	
	@Test
	public void logout()
	{
		
		//validation
		//after logout we are on login page
		String expectedTitle1="Swag Labs";
		String actualTitle1=driver.getTitle();
		if(expectedTitle1.equals(actualTitle1))
			{
				System.out.println("testcase is passed");
			}
		else
		{
			System.out.println("testcase is failed");
		}
	}
	@Test
	public void addtocartProduct()
	{
		HomePOMClass hp=new HomePOMClass(driver);
		hp.selectElementfromdropdown();
		System.out.println("filer applied");
		hp.clickOnAddToCart();
		System.out.println("clicked on add to cart of single bag product");
		String expectedCount="1"	;
		String actualCount=hp.gettextFromAddtoCart();
		if(expectedCount.equals(actualCount))
		{
			System.out.println("testcase is passed");
		}
		else
		{
			System.out.println("testcase is failed");
		}
	}

}
