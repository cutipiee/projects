package com.java.automation;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewarkAutomation {

	private static WebDriver driver;

	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/workspace/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.newarkjobs2020.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("registerLink")).click();
		WebElement userName = driver.findElement(By.id("UserName"));

		userName.sendKeys("Manpreet");
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("Mechlin@123");
		WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
		confirmPassword.sendKeys("Mechlin@123");
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Manpreet");
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("Kaur");
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("manpreet@mechlintech.com");
		WebElement phone = driver.findElement(By.id("Mobile"));
		phone.sendKeys("1988965656");
		WebElement age = driver.findElement(By.id("Age"));
		age.sendKeys("23");
		WebElement gender = driver.findElement(By.id("Gender"));
		gender.sendKeys("Female");
		WebElement race = driver.findElement(By.id("Race"));
		race.sendKeys("Asian");
		WebElement ethnicity = driver.findElement(By.id("Ethnicity"));
		ethnicity.sendKeys("Hispanic or Latino");
		WebElement address = driver.findElement(By.id("FullAddress"));
		address.sendKeys("#17, phase4");
		WebElement education = driver.findElement(By.id("Education"));
		education.sendKeys("Bachelor's degree");
		WebElement status = driver.findElement(By.id("EmploymentStatus"));
		status.sendKeys("Currently Working");
		List<WebElement> radioJob = driver.findElements(By.name("How_are_you_employed"));
		boolean bValue = false;
		bValue = radioJob.get(0).isSelected();
		if (bValue == true) {
			radioJob.get(0).click();
		} else {
			radioJob.get(1).click();
		}

		WebElement about = driver.findElement(By.xpath("//*[@id=\"checkboxess\"]/div[2]/div/div/label"));
		about.click();
		WebElement about1 = driver.findElement(By.xpath("//*[@id=\"checkboxess\"]/div[3]/div/div/label"));
		about1.click();
		WebElement about2 = driver.findElement(By.xpath("//*[@id=\"checkboxess\"]/div[5]/div/div/label"));
		about2.click(); 
		WebElement interest1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/div[2]/div/div/label"));
		interest1.click();
		WebElement interest2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/div[16]/div/div/label"));
		interest2.click();
		WebElement resumeName = driver.findElement(By.name("ResumeName"));
		resumeName.sendKeys("log");
		WebElement upload = driver.findElement(By.name("file"));
		upload.sendKeys("D:\\resume.doc");
		driver.findElement(By.id("reg_sub")).submit();
		 Thread.sleep(2000);
		driver.findElement(By.id("loginLink")).click();
		WebElement userLogin = driver.findElement(By.id("Email"));
		userLogin.sendKeys("Manpreet");
		WebElement loginPwd = driver.findElement(By.id("Password"));
		loginPwd.sendKeys("Mechlin@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div/div/div/div/form/button")).submit();

	}

}
