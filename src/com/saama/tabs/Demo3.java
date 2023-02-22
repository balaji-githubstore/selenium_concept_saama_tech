package com.saama.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo3 {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.db4free.net/"); 
		
		//click on phpMyAdmin »
		driver.findElement(By.partialLinkText("phpMyAdmin")).click();
		
		
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		//switch to 2nd tab
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.id("input_username")).sendKeys("hello123");
		driver.findElement(By.id("input_password")).sendKeys("hello123");
		driver.findElement(By.id("input_go")).click();
		
		
		driver.close(); // check which tab is getting closed 
		
		//switch to 1st tab
		driver.switchTo().window(windows.get(0));
		
		System.out.println(driver.getTitle());
		
		driver.quit();

	}
}
