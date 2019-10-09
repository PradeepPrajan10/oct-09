package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check {
	
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://www.redbus.in");
		Thread.sleep(5000);
		WebElement b = a.findElement(By.xpath("//label[@for='onward_cal']"));
		b.click();
		WebElement c = a.findElement(By.xpath("(//table[@class='rb-monthTable first last'])[2]"));
		String d = c.getText();
		System.out.println(d);
		List<WebElement> e = c.findElements(By.tagName("tr"));
		
			WebElement f = e.get(5);
			List<WebElement> g = f.findElements(By.tagName("td"));
			for (int j = 0; j < g.size(); j++) {
				WebElement h = g.get(j);
				String k = h.getText();
			if (k.equals("22")) {
			h.click();
			}
				
				
				
			}
			
		
		
		
		
		
		
	}
}