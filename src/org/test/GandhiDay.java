package org.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GandhiDay {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
	    

		WebDriver  div = new ChromeDriver();
		div.get("https\\www.facebook.com");
		
		
		String title = div.getTitle();
		TakesScreenshot t = (TakesScreenshot)div; //interface
		File As = t.getScreenshotAs(OutputType.FILE);
		
		Date d = new Date();
		int date = d.getDate();
		long time = d.getTime();
		System.out.println(date);
		System.out.println(time);
		File R = new File("C:\\Users\\GT\\eclipse-workspace\\Testing\\Screen"+date+"_"+time+"_"+title+".png");
	
		FileUtils.copyFile(As,R);
	}
}
