package com.saama.advance;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo11Options {
	
	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
//		options.addArguments("start-maximized");
//		options.addArguments("--Headless");
		
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "C:\\mine");
		options.setExperimentalOption("prefs", prefs);
		
		
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.com"); 
		
		System.out.println(driver.getTitle());
		
//		driver.quit();
		
	}

}
