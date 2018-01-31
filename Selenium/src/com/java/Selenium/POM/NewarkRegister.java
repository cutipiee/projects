package com.java.Selenium.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewarkRegister {

	WebDriver driver;
	
	By userName=By.id("UserName");
	By password = By.id("Password");
	By confirmPassword = By.id("ConfirmPassword");
	By firstName = By.id("FirstName");
	By lastName = By.id("LastName");
	By email = By.id("Email");
	By phone = By.id("Mobile");
	By age = By.id("Age");
	By gender = By.id("Gender");
	By race = By.id("Race");
	By ethnicity = By.id("Ethnicity");
	By address = By.id("FullAddress");
	By education = By.id("Education");
	By status = By.id("EmploymentStatus");
	By radioJob = By.name("How_are_you_employed");
	By about = By.xpath("//*[@id=\"checkboxess\"]/div[2]/div/div/label");
	By about1 = By.xpath("//*[@id=\"checkboxess\"]/div[3]/div/div/label");
    By about2 = By.xpath("//*[@id=\"checkboxess\"]/div[5]/div/div/label");
    By interest1 = By.xpath("//*[@id=\"checkboxes\"]/div[2]/div/div/label");
	By interest2 = By.xpath("//*[@id=\"checkboxes\"]/div[16]/div/div/label");
    By resumeName = By.name("ResumeName");
    By upload = By.name("file");
    By submit=By.id("reg_sub");
    
    public NewarkRegister(WebDriver driver) {
		this.driver=driver;
	}
    public void setuserName(String stUserName) {
    	driver.findElement(userName).sendKeys(stUserName);
    }
    public void setPassword(String Password) {
    	driver.findElement(password).sendKeys(Password);
    }
	public void setConfirmPassword(String confirmPas) {
		driver.findElement(confirmPassword).sendKeys(confirmPas);
	}
	public void setFirstName(String FirstName) {
		driver.findElement(firstName).sendKeys(FirstName);
	}
	public void setLastName(String LastName) {
		driver.findElement(lastName).sendKeys(LastName);
	}
	public void setEmail(String Email) {
		driver.findElement(email).sendKeys(Email);
	}
	public void setPhone(String Phone) {
		driver.findElement(phone).sendKeys(Phone);
	}
	public void setAge(String Age) {
		driver.findElement(age).sendKeys(Age);
	}
	public void setGender(String Gender) {
		driver.findElement(gender).sendKeys(Gender);
	}
	public void setRace(String Race) {
		driver.findElement(race).sendKeys(Race);
	}
	public void setEthnicity(String Ethnicity) {
		driver.findElement(ethnicity).sendKeys(Ethnicity);
	}
	public void setAddress(String Address) {
		driver.findElement(address).sendKeys(Address);
	}
	public void setEducation(String Education) {
		driver.findElement(education).sendKeys(Education);
	}
	public void setStatus(String Status) {
		driver.findElement(status).sendKeys(Status);
	}
	public void setRadioJob(String RadioJob) {
		driver.findElement(radioJob).sendKeys(RadioJob);
	}
	public void setAbout(String About) {
		driver.findElement(about).click();
	}
	public void setAbout1(String About1) {
		driver.findElement(about1).click();
	}
	public void setAbout2(String About2) {
		driver.findElement(about2).click();;
	}
	public void setInterest1(String Interest1) {
		driver.findElement(interest1).click();
	}
	public void setInterest2(String Interest2) {
		driver.findElement(interest2).click();
	}
	public void setResumeName(String Resume) {
		driver.findElement(resumeName).sendKeys(Resume);
	}
	public void setUpload(String Upload) {
		driver.findElement(upload).sendKeys(Upload);
	}
	public void Submit() {
		driver.findElement(submit).click();
	}
	
	/*String userName, password, confirmPassword;
	String firstName,middleName,lastName;
	String email;
	String phoneNumber;
	int age;
	String gender,race,ethnicity;
	String fullAddress;
	String education,empStatus;
	String hrue,aboutUs,interst;
	String resumeName;
	String file;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getEthnicity() {
		return ethnicity;
	}
	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getEmpStatus() {
		return empStatus;
	}
	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}
	public String getHrue() {
		return hrue;
	}
	public void setHrue(String hrue) {
		this.hrue = hrue;
	}
	public String getAboutUs() {
		return aboutUs;
	}
	public void setAboutUs(String aboutUs) {
		this.aboutUs = aboutUs;
	}
	public String getInterst() {
		return interst;
	}
	public void setInterst(String interst) {
		this.interst = interst;
	}
	public String getResumeName() {
		return resumeName;
	}
	public void setResumeName(String resumeName) {
		this.resumeName = resumeName;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}*/
}
