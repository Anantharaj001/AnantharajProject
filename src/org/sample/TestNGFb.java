package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGFb {
	@Test
	@Parameters({"username","password"})
private void test1(String s1,String s2) {
		System.setProperty("webdriver.chrome.driver", "D:\\anand maven\\Maven\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtusername=driver.findElement(By.id("email"));
		txtusername.sendKeys(s1);
		WebElement txtpassword=driver.findElement(By.id("pass"));
		txtpassword.sendKeys(s2);
}
}
