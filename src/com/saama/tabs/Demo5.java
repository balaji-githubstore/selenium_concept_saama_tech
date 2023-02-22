package com.saama.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo5 {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.db4free.net/"); 
		
		//click on phpMyAdmin »
		driver.findElement(By.partialLinkText("phpMyAdmin")).click();
		
		
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		
		for(String win  : windows)
		{
			System.out.println(win);
			driver.switchTo().window(win);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
//			System.out.println(driver.getPageSource());
			if(driver.getCurrentUrl().contains("translate"))
			{
				break;
			}
			System.out.println("---------------------------");
		}
		
	
	}
}
