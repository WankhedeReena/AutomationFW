package com.yantraQA;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.yantraQA.base.TestBase;
import com.yantraQA.pageobjects.RegisterPageObjects;
import com.yantraQA.pageobjects.SignUpPageObjects;

public class TestScriptJUnit2 extends TestBase{
	
	@Test
	public void t_01_sign_up()
	{
		driver.get(baseUrl + "/Index.html");

		SignUpPageObjects signUpPageObjects = new SignUpPageObjects(driver);
		
		//Test steps
		signUpPageObjects.signUpUser("reena.wankhede@gmail.com");
		signUpPageObjects.verifyTheTitle("Register");
		
		//validation
		

	}
	@Test
	public void t_02_registration_form() 
	{
		driver.get(baseUrl + "/Register.html");
		
		RegisterPageObjects registerPageObjects = new RegisterPageObjects(driver);
		
		registerPageObjects.setFirstNameTextBox("Reena");
		registerPageObjects.setLastNameTextBox("Wankhede");
		registerPageObjects.setAddressTextBox("pune");
		registerPageObjects.setEmailTextBox("reena.wankhede@gmail.com");
		registerPageObjects.setPhoneTextBox("9834032347");
		registerPageObjects.clickOnGenderAsFemale();
		registerPageObjects.clickOnCricketCheckBox();
		registerPageObjects.clickOnMovieCheckbox();
		registerPageObjects.selectSkillsFromList("Analytics");
		registerPageObjects.selectCountryFromList("Albania");
		registerPageObjects.selectYear("1994");
		registerPageObjects.selectMonth("April");
		registerPageObjects.selectDay("17");
		registerPageObjects.setPassword("Reena@123");
		registerPageObjects.set2Password("Reena@123");
		registerPageObjects.submitButton();
		//////		driver.findElement(By.xpath("//input[@ng-model = 'FirstName']")).sendKeys("reena");
		//////		driver.findElement(By.xpath("//input[@ng-model = 'LastName']")).sendKeys("wankhede");
		//////		driver.findElement(By.xpath("//textarea[@ng-model = 'Adress']")).sendKeys("pune");
		//////		driver.findElement(By.xpath("//input[@ng-model = 'EmailAdress']")).sendKeys("reena.wankhede@gmail.com");
		//////		driver.findElement(By.xpath("//input[@ng-model = 'Phone']")).sendKeys("786541233");
		//////		driver.findElement(By.xpath("//input[@ng-model = 'radiovalue' and @value = 'FeMale']")).click();
		//////		driver.findElement(By.xpath("//input[@type = 'checkbox' and @value = 'Cricket']")).click();
		//////		driver.findElement(By.xpath("//input[@type = 'checkbox' and @value = 'Movies']")).click();
		//////		WebElement skillListElement = driver.findElement(By.id("Skills"));
		//////		Select skillsDropDown = new Select(skillListElement );
		//////		skillsDropDown.selectByVisibleText("Analytics");
		////		WebElement countryListElement = driver.findElement(By.id("countries"));
		////		Select countryDropDown = new Select(countryListElement );
		////		countryDropDown.selectByVisibleText("Albania");
		
		
			

		//		WebElement yearList = driver.findElement(By.id("yearbox"));
		//	Select yearDropDown = new Select(yearList);
		//	yearDropDown.selectByVisibleText("1932");
		//	WebElement monthList = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		//	Select monthDropDown = new Select( monthList);
		//	monthDropDown.selectByVisibleText("January");
		//	WebElement dayList = driver.findElement(By.xpath("//select[@ng-model='daybox']"));
		//	Select dayDropDown = new Select( dayList);
		//	dayDropDown.selectByVisibleText("15");
		//		driver.findElement(By.id("firstpassword")).sendKeys("Reena@123");
		//		driver.findElement(By.id("secondpassword")).sendKeys("Reena@123");
		//		driver.findElement(By.id("submitbtn")).click();
	}
}


