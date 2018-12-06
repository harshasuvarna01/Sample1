package com.samples.samplescripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriveMethods 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		//get() 
		driver.get("https://ws51.rlndevbox.net/users/sign_in");
		Thread.sleep(1000);
		
		//getPageSource()
		//String pagesource = driver.getPageSource();
		//System.out.println(pagesource);
		
		//getTitle()
		//String title = driver.getTitle();
		//System.out.println(title);
		
		//getCurrentUrl()
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	
		
		
	}

}
