package com.sourceDemo.POMpakage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMClass 
{
		WebDriver driver;
		private Select s;
		@FindBy(xpath="//button[@id='react-burger-menu-btn']")
		private WebElement settingmenu;
		public void click_on_settingbtn()
		{
			settingmenu.click();
		}
		@FindBy(xpath="//a[text()='About']")
		private	WebElement aboutoption;
		public void clickOnAbout()
		{
			aboutoption.click();
		}
		@FindBy(xpath="//a[@id='logout_sidebar_link']")
		private WebElement logoutbtn;
		public void clikonlogoutbtn()
		{
			logoutbtn.click();
		}
		
		@FindBy(xpath="//select[@class='product_sort_container']")
		private WebElement filterdropdown;
		public void selectElementfromdropdown()
		{
			filterdropdown.click();
			s.selectByIndex(2);
		}
		
		@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
		private WebElement addtocart;
		public void clickOnAddToCart()
		{
			addtocart.click();
		}
		
		@FindBy(xpath="//span[text()='1']")
		private WebElement addtocartBasket;
		public String gettextFromAddtoCart()
		{
			String totalproductcount=addtocartBasket.getText();
			return totalproductcount;
		}
		
		@FindBy(xpath="//button[text()='Add to cart']")
		private List <WebElement> multiplepAddtocart;
		public void clickOnmultiplepAddtocart()
		{
			for(WebElement product:multiplepAddtocart)
			{
				product.click();
			}
		}
		@FindBy(xpath="//span[@class='shopping_cart_badge']")
		private WebElement addtocartbox;
		public void clickonaddtocartbox()
		{
			addtocartbox.click();
		}
		
		public HomePOMClass(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			s=new Select(filterdropdown);
		}

	}


