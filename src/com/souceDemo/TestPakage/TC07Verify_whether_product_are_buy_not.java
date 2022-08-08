package com.souceDemo.TestPakage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.souceDemo.UtilityPakage.Screenshot_code;
import com.sourceDemo.POMpakage.BillingPagePOMclass;
import com.sourceDemo.POMpakage.CheckoutPOMclass;
import com.sourceDemo.POMpakage.HomePOMClass;
import com.sourceDemo.POMpakage.LoginPOMClass;
import com.sourceDemo.POMpakage.YourCartPOMclass;

public class TC07Verify_whether_product_are_buy_not extends TestBaseClass 
{
	@Test
	public void verifyproduct_buy_functionality() throws IOException
	{
		
		HomePOMClass hp=new HomePOMClass(driver);
		
		hp.clickOnAddToCart();
		System.out.println("clicked on add to cart of single bag product");
		
		hp.clickonaddtocartbox();
		System.out.println("clicked on addto cart box");
		
		YourCartPOMclass cp= new YourCartPOMclass(driver);
		cp.clickONCheckoutbtn();		
		System.out.println("Clicked on continue btn");
		
		CheckoutPOMclass chekPOM=new CheckoutPOMclass(driver);
		chekPOM.enterFirstName();
		System.out.println("firstname entered");
		chekPOM.enterLastName();
		System.out.println("lastname entered");
		chekPOM.enterZipcode();
		System.out.println("Zipcode entered");
		chekPOM.clikonContinuebtn();
		System.out.println("clicked on continuebtn");
		BillingPagePOMclass bp=new BillingPagePOMclass(driver);
		bp.clickonFinishbtn();
	}

}
