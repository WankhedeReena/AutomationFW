package com.yantraQA.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPageObjects {
WebDriver driver;
	
	//2nd thing
	private By firstName = By.xpath("//input[@ng-model = 'FirstName']");
	private By lastName = By.xpath("//input[@ng-model = 'LastName']");
	private By address = By.xpath("//textarea[@ng-model = 'Adress']");
	private By email = By.xpath("//input[@ng-model = 'EmailAdress']");
	private By phone = By.xpath("//input[@ng-model = 'Phone']");
	private By genderRadio = By.xpath("//input[@ng-model = 'radiovalue' and @value = 'FeMale']");
	private By cricketCheckBox = By.xpath("//input[@type = 'checkbox' and @value = 'Cricket']");
	private By movieCheckbox = By.xpath("//input[@type = 'checkbox' and @value = 'Movies']");
	private By skillsDropDown = By.id("Skills");
	private By countryDropDown = By.id("countries");
	private By yearDropDown = By.id("yearbox");
	private By monthDropDown = By.xpath("//select[@ng-model='monthbox']");
	private By dayDropDown = By.xpath("//select[@ng-model='daybox']");
	private By setPassword = By.id("firstpassword");
	private By set2Password = By.id("secondpassword");
	private By submitButton = By.id("submitbtn");
	// 3rd thing constructor
	public RegisterPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	public void setFirstNameTextBox(String arg)
	{
		driver.findElement(firstName).sendKeys(arg);
	}
	public void setLastNameTextBox(String arg)
	{
		driver.findElement(lastName).sendKeys(arg);
	}
	public void setAddressTextBox(String arg)
	{
		driver.findElement(address).sendKeys(arg);
	}
	public void setEmailTextBox(String arg)
	{
		driver.findElement(email).sendKeys(arg);
	}
	public void setPhoneTextBox(String arg)
	{
		driver.findElement(phone).sendKeys(arg);
	}
	public void clickOnGenderAsFemale()
	{
		driver.findElement(genderRadio).click();
	}
	public void clickOnCricketCheckBox()
	{
		driver.findElement(cricketCheckBox).click();
	}
	public void clickOnMovieCheckbox()
	{
		driver.findElement(movieCheckbox).click();
	}
	public void selectSkillsFromList(String arg)
	{
		WebElement skillsList = driver.findElement(skillsDropDown);
		Select List = new Select(skillsList);
		List.selectByVisibleText(arg);
	}
	public void selectCountryFromList(String arg)
	{
		WebElement countryList = driver.findElement(countryDropDown);
		Select List = new Select(countryList);
		List.selectByVisibleText(arg);
	}
	public void selectYear(String arg)
	{
		WebElement yearList = driver.findElement(yearDropDown);
		Select List = new Select(yearList);
		List.selectByVisibleText(arg);
	}
	public void selectMonth(String arg)
	{
		WebElement monthList = driver.findElement(monthDropDown);
		Select List = new Select(monthList);
		List.selectByVisibleText(arg);
	}
	public void selectDay(String arg)
	{
		WebElement dayList = driver.findElement(dayDropDown);
		Select List = new Select(dayList);
		List.selectByVisibleText(arg);
	}
	public void setPassword(String arg)
	{
		driver.findElement(setPassword).sendKeys(arg);
	}
	public void set2Password(String arg)
	{
		driver.findElement(set2Password).sendKeys(arg);
	}
	public void submitButton()
	{
		driver.findElement(submitButton).click();
	}
	
}
