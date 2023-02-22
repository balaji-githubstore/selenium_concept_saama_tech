package com.saama.advance;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo15ShadowElement3 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://selectorshub.com/xpath-practice-page/"); 
		
//		document.querySelector("#userName").shadowRoot.querySelector("#kils")
	
		SearchContext sc= driver.findElement(By.id("userName")).getShadowRoot();
		
		sc.findElement(By.cssSelector("#kils")).sendKeys("hello123");
	}

}
