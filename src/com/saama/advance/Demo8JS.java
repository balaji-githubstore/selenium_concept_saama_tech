package com.saama.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

//Stored object of ChromeDriver in ChromeDriver iteslf which is not recommended
public class Demo8JS {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
	
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://phptravels.net/"); 
		
		WebElement ele1= driver.findElement(By.xpath("//input[@id='checkin']"));
		
		
		js.executeScript("arguments[0].value='29-03-2023'",ele1);
		
		
		
		WebElement ele2= driver.findElement(By.xpath("//input[@id='checkout']"));
		js.executeScript("arguments[0].value='7-04-2023'",ele2);
		
		

//		driver.executeScript("arguments[0].value='29-03-2023';arguments[1].value='7-04-2023'",ele1,ele2);
		

		
	}
}
