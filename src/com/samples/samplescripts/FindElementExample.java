package com.samples.samplescripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementExample 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/Selenium/html/sampleLogin.html");
		
		//using id
		driver.findElement(By.id("fb")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		//using name
		driver.findElement(By.name("forgot")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		//using classname
		driver.findElement(By.className("abc")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		//using tagname
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		//using linktext
		driver.findElement(By.linkText("Forgot Password")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		//using partialLinkText
		driver.findElement(By.partialLinkText("Forgot")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		

	}

}
