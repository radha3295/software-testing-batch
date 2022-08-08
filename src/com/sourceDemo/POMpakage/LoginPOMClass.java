package com.sourceDemo.POMpakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass
{
	WebDriver driver;
	private Actions act;
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	public void sendUserName()
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginbtn;
	public void clickOnLoginbtn()
	{
		//loginbtn.click();
		act.click(loginbtn).perform();
	}
	public  LoginPOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver, this);
		act=new Actions(driver);
	}
	
	
	
}
