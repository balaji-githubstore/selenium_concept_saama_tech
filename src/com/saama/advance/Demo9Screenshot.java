package com.saama.advance;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

//Stored object of ChromeDriver in ChromeDriver iteslf which is not recommended
public class Demo9Screenshot {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();	
			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://google.net/"); 
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File file= ts.getScreenshotAs(OutputType.FILE);
		file.renameTo(new File("error.png"));
		

		
	}
}
