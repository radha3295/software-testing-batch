package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_chaining_concept {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
				WebDriver driver=new ChromeDriver();		
				driver.get("https://www.google.com"); // we directly use get method because get is method of wedriver 
				
				//driver.maximize();		//it is not possible because maximinze is not method of wedriver 
				
				driver.manage().window().maximize();//it is possible because manage is method of webdriver which return options,window is mehtod of options which returns window & maximize is method of window 
				//so here we can not use maximize method directly
				// this is chain of mehtods so it is known as mehtod chaining concept
				//same as 
				//driver .manage().window().minimize();
				//driver .navigate().back();
				//driver .navigate().forward();
				//driver .navigate().refresh();
				
				//above also are the examples of method chaining
				
				
					


	}

}
