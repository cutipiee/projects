package com.java.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAutomation {

	public void login(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("loginLink")).click();
		WebElement userLogin = driver.findElement(By.id("Email"));
		userLogin.sendKeys("Manpreet");
		WebElement loginPwd = driver.findElement(By.id("Password"));
		loginPwd.sendKeys("Mechlin@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div/div/div/div/form/button")).submit();
		Thread.sleep(10000);
	}
}
