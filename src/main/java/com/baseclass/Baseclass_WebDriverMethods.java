package com.baseclass;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Baseclass_WebDriverMethods {

	public static WebDriver openBrowser(String browser, String url)
	{
		
		WebDriver driver = null;
		
	/*	if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\chromedriver.exe");
			ChromeOptions option=new ChromeOptions();
			driver= new ChromeDriver(option);
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "F:\\Automation Testing\\iedriver.exe");
			driver = new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{	
			System.setProperty("webdriver.gecko.driver", "F:\\Automation Testing\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "F:\\Automation Testing\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Invalid browser name");
		}
		
		*/
		
		switch(browser)
		{
			case "chrome" :
						System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\chromedriver.exe");
						ChromeOptions option=new ChromeOptions();
						driver= new ChromeDriver(option);
						break;
			case "ie" :
						System.setProperty("webdriver.ie.driver", "F:\\Automation Testing\\iedriver.exe");
						driver = new InternetExplorerDriver();
			case "firefox" :
						System.setProperty("webdriver.gecko.driver", "F:\\Automation Testing\\geckodriver.exe");
						driver = new FirefoxDriver();
						
			case "edge" :
						System.setProperty("webdriver.edge.driver", "F:\\Automation Testing\\edgedriver_win64\\msedgedriver.exe");
						driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	
	public static void setWindowSize(WebDriver driver1, Dimension d)
	{
		driver1.manage().window().setSize(d);
		System.out.println("Size is set now for window");
	}
	
	public static void setPosition(WebDriver driver1, Point p)
	{
		driver1.manage().window().setPosition(p);
		System.out.println("Position is set now for window");
	}
	
	public static void main(String[] args) 
	{
		openBrowser("edge", "https://www.google.com");
		
	}

}
