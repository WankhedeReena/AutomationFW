package com.yantraQA.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPageObjects {
	//1st thing
	WebDriver driver;
	
	//2nd thing
	private By email = By.id("email");
	private By clickSubmitButton= By.id("enterimg");
	
	// 3rd thing constructor
	public SignUpPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	// 4th methods
	public void setEmail(String arg)
	{
		driver.findElement(email).sendKeys(arg);
	}
	public void clickOnSubmitButton()
	{
		driver.findElement(clickSubmitButton).click();
	}
}
