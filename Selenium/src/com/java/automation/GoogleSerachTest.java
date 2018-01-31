package com.java.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class GoogleSerachTest {

	public static void main(String args[]) {
		
		WebDriver driver=new ChromeDriver();
		
		
		System.setProperty("webdriver.chrome.driver", "D:/workspace/chromedriver.exe");
		driver.get("https://www.google.com");
		driver.navigate().to("www.google.com");
		//String appTitle=driver.getTitle();
		//System.out.println("Application title is"+appTitle);
		driver.quit();
	}
}
