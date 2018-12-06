package com.samples.samplescripts;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.close();
	}

}
