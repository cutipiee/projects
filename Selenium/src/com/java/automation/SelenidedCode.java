package com.java.automation;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

public class SelenidedCode {

	public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "D:/workspace/chromedriver");
		  //System.setProperty("webdriver.chrome.driver", ...);
		  
		   System.setProperty("selenide.browser", "Chrome");
		   Configuration.browser="chrome";
		      open("http://google.com");
		  //$(By.id("registerLink")).pressEnter();
		 }

		
}
