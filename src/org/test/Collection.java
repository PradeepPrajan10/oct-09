package org.test;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Collection {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
WebDriver dr = new ChromeDriver();
dr.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
Thread.sleep(6000);/*
List<WebElement> b = dr.findElements(By.tagName("iframes"));
		int c = b.size();
		System.out.println(c);
		dr.manage().window().maximize();
		dr.switchTo().frame(1);*/
		
		WebElement d = dr.findElement(By.xpath("(//span[@class='labelColumn'])[1]"));
		d.sendKeys("ranjith123");
		
	}
}