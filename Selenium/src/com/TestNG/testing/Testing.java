package com.TestNG.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing {

	public static WebDriver driver;
	
	@Test
	public  void main() {
		driver.findElement(By.id("account"));
		driver.findElement(By.id("log")).sendKeys("test_user");
		driver.findElement(By.id("pwd")).sendKeys("123");
		driver.findElement(By.id("login")).click();
		System.out.println("Login sucessfully, now it is time to Log off");
		driver.findElement(By.id("account_logout"));
		}
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:/workspace/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.onlinestore.toolsqa.wpengine.com");
		
		
	}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
