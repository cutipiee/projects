package com.java.Selenium.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewarkLoginPage {

	WebDriver driver;

	@FindBy(id = "loginLink")
	WebElement login;

	@FindBy(id = "Email")
	WebElement userLogin;

	@FindBy(id = "Password")
	WebElement loginPwd;

	@FindBy(xpath = "/html/body/section/div/div/div/div/form/button")
	WebElement submit;

	public NewarkLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void getLink() {
		login.click();
	}

	public void getEmail(String email) {
		userLogin.sendKeys(email);
	}

	public void getPassword(String pass) {
		loginPwd.sendKeys(pass);
	}

	public void submit() {
		submit.submit();
	}
}
