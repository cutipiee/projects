package com.java.Selenium.POM;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewarkRegisterPage {
	WebDriver driver;
	
	@FindBy(id="registerLink")
	WebElement regLink;
	
	@FindBy(id="UserName")
	WebElement userName;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmPassword;
	
	@FindBy(id="FirstName")
	WebElement firstName;
	
	@FindBy(id="LastName")
	WebElement lastName;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Mobile")
	WebElement phone;
	
	@FindBy(id="Age")
	WebElement age;
	
	@FindBy(id="Gender")
	WebElement gender;
	
	@FindBy(id="Race")
	WebElement race;
	
    @FindBy(id="Ethnicity")
	WebElement ethnicity;
    
	@FindBy(id="FullAddress")
	WebElement address;
	
	@FindBy(id="Education")
	WebElement education;
	
	@FindBy(id="EmploymentStatus")
	WebElement status;
	
	@FindBy(name="How_are_you_employed")
	List<WebElement> radioJob;
	
	@FindBy(xpath="//*[@id=\"checkboxess\"]/div[5]/div/div/label")
	WebElement about;
	
	@FindBy(xpath="//*[@id=\"checkboxes\"]/div[17]/div/div/label")
	WebElement interest1;
	
	@FindBy(name="ResumeName")
	WebElement resumeName;
	
	@FindBy(name="file")
	WebElement upload;
	
	@FindBy(id="reg_sub")
	WebElement submit;
	
	public NewarkRegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void link() {
		regLink.click();
	}
	
	 public String setuserName(String stUserName) {
	    userName.sendKeys(stUserName);
		return stUserName;
	    }
	    public String setPassword(String Password) {
	    	password.sendKeys(Password);
			return Password;
	    }
		public void setConfirmPassword(String confirmPas) {
			confirmPassword.sendKeys(confirmPas);
		}
		public void setFirstName(String FirstName) {
			firstName.sendKeys(FirstName);
		}
		public void setLastName(String LastName) {
			lastName.sendKeys(LastName);
		}
		public void setEmail(String Email) {
			email.sendKeys(Email);
		}
		public void setPhone(String Phone) {
			phone.sendKeys(Phone);
		}
		public void setAge(String Age) {
			age.sendKeys(Age);
		}
		public void setGender(String Gender) {
			gender.sendKeys(Gender);
		}
		public void setRace(String Race) {
			race.sendKeys(Race);
		}
		public void setEthnicity(String Ethnicity) {
			ethnicity.sendKeys(Ethnicity);
		}
		public void setAddress(String Address) {
			address.sendKeys(Address);
		}
		public void setEducation(String Education) {
			education.sendKeys(Education);
		}
		public void setStatus(String Status) {
			status.sendKeys(Status);
		}
		public void setRadioJob() {
			
			boolean bValue = false;
			if (bValue == true) {
				radioJob.get(0).click();
			} else {
				radioJob.get(1).click();
			}
		}
		public void setAbout() {
			about.click();
		}
		
		public void setInterest1() {
			interest1.click();
		}
		
		public void setResumeName(String Resume) {
			resumeName.sendKeys(Resume);
		}
		public void setUpload(String Upload) {
			upload.sendKeys(Upload);
		}
		
		
		public void Submit() {
			submit.submit();
		}
}
