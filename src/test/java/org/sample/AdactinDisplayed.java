package org.sample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AdactinDisplayed {
	static WebDriver driver;
	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys("aravindh26");
		boolean user = txtUsername.isDisplayed();
		System.out.println(user);
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("Qwerty$26");
		boolean pass = txtPassword.isDisplayed();
		System.out.println(pass);
		WebElement btnLogin = driver.findElement(By.id("login"));
		boolean log = btnLogin.isDisplayed();
		System.out.println(log);
		driver.quit();
	}
}


