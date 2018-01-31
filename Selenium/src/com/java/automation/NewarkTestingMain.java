package com.java.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewarkTestingMain {

	private static WebDriver driver;
	
	@Test
	public void registerTest() throws InterruptedException {
		
		RegisterAutomate resg=new RegisterAutomate();
		resg.register(driver);
		LoginAutomation login=new LoginAutomation();
		login.login(driver);
	}
	
	
	@BeforeMethod
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:/workspace/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.newarkjobs2020.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("registerLink")).click();
	}
	@AfterMethod
	public void afterTest() {
		driver.close();
	}
}
