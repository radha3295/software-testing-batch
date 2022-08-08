package com.sourceDemo.POMpakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPOMclass 
{
	WebDriver driver;
//	private Select s;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement settingmenu;
	public void click_on_settingbtn()
	{
		settingmenu.click();
	}
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logoutbtn;
	public void clikonlogoutbtn()
	{
		logoutbtn.click();
	}
	
//	@FindBy(xpath="//select[@class='product_sort_container']")
//	private WebElement filterdropdown;
//	public void selectElementfromdropdown()
//	{
//		filterdropdown.click();
//		s.selectByIndex(2);
//	}
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement addtocart;
	public void clickOnAddToCart()
	{
		addtocart.click();
	}
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	private WebElement addtocartbox;
	public void clickonaddtocartbox()
	{
		addtocartbox.click();
	}
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement Checkoutbtn;
	public void clickONCheckoutbtn()
	{
		Checkoutbtn.click();
	}
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstname;
	public void enterFirstName()
	{
		firstname.sendKeys("snehal");
	}
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastname;
	public void enterLastName()
	{
		lastname.sendKeys("Kadam");
	}
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement zipcode;
	public void enterZipcode()
	{
		zipcode.sendKeys("415004");
	}
	@FindBy(xpath="//input[@id='continue']")
	private WebElement countinuebtn;
	public void clikonContinuebtn()
	{
		countinuebtn.click();
	}
	public CheckoutPOMclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
//		s=new Select(filterdropdown);
	}
}
