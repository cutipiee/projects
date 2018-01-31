package com.java.automation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSignUp {

	private static  WebDriver driver;
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "D:/workspace/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/#");
		//driver.manage().window().maximize();
		driver.navigate().to("CREATE AN ACCOUNT");
		
	}
}
