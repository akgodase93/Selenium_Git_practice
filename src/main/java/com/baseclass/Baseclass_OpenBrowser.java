package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Baseclass_OpenBrowser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
	}

}
