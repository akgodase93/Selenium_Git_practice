package com.webdriver.methods;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Baseclass_WebDriverMethods;
public class WebDriver_Methods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String url="https://www.google.com";
		String browserName="chrome";
		WebDriver driver=Baseclass_WebDriverMethods.openBrowser(browserName,url);
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getPosition());
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().forward();
		Thread.sleep(3000);
		//Baseclass_WebDriverMethods.setWindowSize(driver, new Dimension(1200,700));
		//Baseclass_WebDriverMethods.setPosition(driver, new Point(-7,-7));
		
		driver.manage().window().setSize(new Dimension(1100,500));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='email']")));
		driver.manage().window().setPosition(new Point(-5,-5));
		Thread.sleep(6000);
		driver.close();//close single window opened by automation
		driver.quit(); //close all window opened by automation
	}
}
