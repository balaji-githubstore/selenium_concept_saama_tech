package com.saama.advance;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo10Options {
	
	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
//		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
//		options.addArguments("--Headless");
//		options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.malaysiaairlines.com/my/en.html"); 
		
	}

}
