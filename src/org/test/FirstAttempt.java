package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAttempt {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();


	driver.get("https://www.facebook.com");

	WebElement ID = driver.findElement(By.className("inputtext _55r1 _6luy"));
	
	JavascriptExecutor j = (JavascriptExecutor)driver;
	j.executeScript("arguments[0].setAttribute('value','Pradeep')",ID );
	
	j.executeScript("return argument[0].getAttribute('value')", ID);
	
}
}