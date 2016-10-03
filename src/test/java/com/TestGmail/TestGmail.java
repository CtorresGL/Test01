package com.TestGmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class TestGmail {
	
	public static WebDriver driver=null;
	
	@BeforeSuite
	public static void init() {
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30L,TimeUnit.SECONDS);
	}
	
	@Test
	public void Test01() {
		driver.get("http://gmail.com");
		
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("carluis.torres12"+Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("asdfghjkl");
		
	}
	

	@AfterSuite
	public static void quit() {
		driver.close();
		driver.quit();
		
	}
}
