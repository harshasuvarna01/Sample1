package com.samples.samplescripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatePage 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//enter url using get()
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(1000);
		
		//enter url using navigate()
		driver.navigate().to("https://www.youtube.com");
		Thread.sleep(1000);
		
		
		//Go to previous page
		driver.navigate().back();
		Thread.sleep(1000);
		
		//Go to next page
		driver.navigate().forward();
		Thread.sleep(1000);
		
		/*//Refresh page
		driver.navigate().refresh();
		Thread.sleep(1000);*/
		
		
	}

}
