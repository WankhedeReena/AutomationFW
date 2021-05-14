package com.yantraQA;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.yantraQA.pageobjects.RegisterPageObjects;
import com.yantraQA.pageobjects.SignUpPageObjects;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;


public class TestScriptJUnit {
	@Test
	public void t_01_sign_up()
	{
		//steps
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\exes\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");

		SignUpPageObjects signUpPageObjects = new SignUpPageObjects(driver);
		signUpPageObjects.setEmail("reena.wankhede@gmail.com");
		signUpPageObjects.clickOnSubmitButton();

		String titleAfter = driver.getTitle();
		//validation
		Assert.assertEquals("Register", titleAfter);

	}
	@Test
	public void t_02_registration_form() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\exes\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		
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
