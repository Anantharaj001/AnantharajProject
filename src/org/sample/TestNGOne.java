package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGOne {
	@Test
	@Parameters({"username","password"})
private void test1(String s1,String s2) {
		System.setProperty("webdriver.chrome.driver", "D:\\anand maven\\Maven\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement txtfirstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtfirstname.sendKeys(s1);
		WebElement txtlastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtlastname.sendKeys(s2);
}
	

}
