package com.yantraQA;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;


public class TestScriptJUnit {
	@Test
	public void t_01_register()
	{
		//steps
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\exes\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("reena.wankhede@gmail.com");
		driver.findElement(By.id("enterimg")).click();
		String titleAfter = driver.getTitle();
		//validation
	Assert.assertEquals("Register", titleAfter);
		
	}
	@Test
	public void t_02_fill_the_form()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\exes\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@ng-model = 'FirstName']")).sendKeys("reena");
		driver.findElement(By.xpath("//input[@ng-model = 'LastName']")).sendKeys("wankhede");
		driver.findElement(By.xpath("//textarea[@ng-model = 'Adress']")).sendKeys("pune");
		driver.findElement(By.xpath("//input[@ng-model = 'EmailAdress']")).sendKeys("reena.wankhede@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model = 'Phone']")).sendKeys("786541233");
		driver.findElement(By.xpath("//input[@ng-model = 'radiovalue' and @value = 'FeMale']")).click();
		driver.findElement(By.xpath("//input[@type = 'checkbox' and @value = 'Cricket']")).click();
		driver.findElement(By.xpath("//input[@type = 'checkbox' and @value = 'Movies']")).click();
		WebElement skillListElement = driver.findElement(By.id("Skills"));
		Select skillsDropDown = new Select(skillListElement );
		skillsDropDown.selectByVisibleText("Analytics");
	}
}
