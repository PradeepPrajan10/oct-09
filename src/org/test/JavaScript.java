package org.test;

import java.awt.Desktop.Action;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScript {
	public static void main(String[] args) throws Exception {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		WebDriver  div = new ChromeDriver();
		div.get("https://netbanking.hdfcbank.com/netbanking/");
	
		WebElement count = div.findElement(By.tagName("frame"));
		
		Actions ac = new Actions(div);
		ac.keyDown(count,Keys.SHIFT).sendKeys("jithu").keyUp(count, Keys.SHIFT).perform();
		
		
		
	
		}

}
