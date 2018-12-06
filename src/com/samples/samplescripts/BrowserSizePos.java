package com.samples.samplescripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSizePos 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//To set the size of the browser window
		Dimension d = new Dimension(500, 500);
		driver.manage().window().setSize(d);
		
		//To set the position of browser window
		Point p = new Point(50, 500);
		driver.manage().window().setPosition(p);
		

	}

}
