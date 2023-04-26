package com.saama.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Login {

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");

//		By loc = By.id("email");
//		WebElement element= driver.findElement(loc);
//		element.sendKeys("bala123@gmail.com");
		
		
		WebElement element= driver.findElement(By.id("email"));
		element.sendKeys("bala123@gmail.com");
		
//		driver.findElement(By.id("email")).sendKeys("bala123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("welcome123");
		
		driver.findElement(By.name("login")).click();
		
	}

}
