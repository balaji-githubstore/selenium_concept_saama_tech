package com.saama.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Demo16RelativeLocator {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demo.openemr.io/b/openemr"); 
		
		driver.findElement(RelativeLocator.with(By.tagName("input"))
				.below(By.xpath("//*[text()='Username']"))).sendKeys("admin");
		
		driver.findElement(RelativeLocator.with(By.tagName("input"))
				.below(By.xpath("//*[text()='Password']"))).sendKeys("admin");
		
		
		WebElement ele= driver.findElement(RelativeLocator.with(By.tagName("select"))
				.above(By.id("login-button")));
		
		new Select(ele).selectByVisibleText("Dutch");
				
	
	}
}
