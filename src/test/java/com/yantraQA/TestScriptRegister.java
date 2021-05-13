package com.yantraQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScriptRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
