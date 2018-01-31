package com.java.Selenium.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterTesting {

	WebDriver driver;
	NewarkRegisterPage register;
	NewarkLoginPage login;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:/workspace/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.newarkjobs2020.com/");
		driver.manage().window().maximize();
		}

	@Test
	public void Testing() throws InterruptedException {
		register = new NewarkRegisterPage(driver);
		login = new NewarkLoginPage(driver);
		register.link();
		String user = register.setuserName("ManpreetKaur");
		String password = register.setPassword("Mechlin@123");
		register.setConfirmPassword("Mechlin@123");
		register.setFirstName("Mani");
		register.setLastName("Sidhu");
		register.setEmail("manpreet@yahoo.com");
		register.setPhone("8565656566");
		register.setAge("23");
		register.setGender("Female");
		register.setRace("Asian");
		register.setEthnicity("Hispanic or Latino");
		register.setAddress("#17,phase 4");
		register.setEducation("Bachelor's degree");
		register.setStatus("Currently Working");
		register.setRadioJob();
		register.setAbout();
		register.setInterest1();
		register.setResumeName("resume");
		register.setUpload("D:\\resume.doc");
		Thread.sleep(2000);
		register.Submit();
		Thread.sleep(2000);
		
		login.getLink();
		login.getEmail(user);
		login.getPassword(password);
		login.submit();
	}

}
