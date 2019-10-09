package org.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task {
	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com");
		Thread.sleep(1000);
		WebElement close = d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		close.click();
		Thread.sleep(2000);
		WebElement search = d.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Mobiles");
		WebElement sClick = d.findElement(By.xpath("//button[@type='submit']"));
		sClick.click();
		
		Thread.sleep(2000);
		WebElement Mob = d.findElement(By.xpath("(//div[text()='Realme C2 (Diamond Blue, 32 GB)'])[2]"));
		Mob.click();
		String text = Mob.getText();
		System.out.println(text);
		
		String parent = d.getWindowHandle();
		Set<String> child = d.getWindowHandles();
		for (String s : child) {
			if (!s.equals(parent)) {
				d.switchTo().window(s);
			}
		}
		WebElement get = d.findElement(By.xpath("//span[text()='Realme C2 (Diamond Blue, 32 GB)']"));
		String text2 = get.getText();
		System.out.println(text2);
		
	}}
