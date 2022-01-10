package org.sample;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class True {
	
	static WebDriver driver;
	@Test
	public void tc1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String url = driver.getCurrentUrl();
		boolean contains = url.contains("face");
		Assert.assertTrue("verify url",contains);
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("987564123");
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("lial@1234");
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}
	
}
		
	
	
	
	
	
	
	
	

