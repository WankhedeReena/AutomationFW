package com.yantraQA.base;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	protected WebDriver driver;
	protected String baseUrl = "http://demo.automationtesting.in";
	//hook method
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\exes\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@After
	public void cleanUp()
	{
		driver.quit();
	}
}
