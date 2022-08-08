package com.souceDemo.TestPakage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice_class {
	@AfterMethod
	public void after_mehod()
	{
		System.out.println("this is after method annotation");
	}
	
	@BeforeMethod
	public void before_method()
	{
		System.out.println("this is before method annotation");
	}
	
	@Test
	public void testmethod()
	{
		System.out.println("this test method");
			
	}
	

}
