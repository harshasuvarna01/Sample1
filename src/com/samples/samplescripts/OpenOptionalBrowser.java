package com.samples.samplescripts;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenOptionalBrowser 
{
	public static void main(String[] args) 
	{
		String url="https://ws51.rlndevbox.net/users/sign_in";
		System.out.println("Enter the browser you want to open the google page in");
		System.out.println(" 1. FF\n 2. Chrome\n 3. IE\n");
		Scanner sc = new Scanner(System.in);
		String bname = sc.nextLine();
		sc.close();
		WebDriver driver = null;
		
		if(bname.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
		}
		
		else if(bname.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
		}
		
		else
		{
			System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get(url);
		}
		
		

	}
}
