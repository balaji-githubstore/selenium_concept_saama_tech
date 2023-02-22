package com.saama.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Stored object of ChromeDriver in ChromeDriver iteslf which is not recommended
public class Demo7Js {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js= (JavascriptExecutor) driver;

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://phptravels.net/");

		// not working
//		driver.findElement(By.id("checkin")).sendKeys("29-03-2023");

		js.executeScript("document.querySelector('#checkin').value='29-03-2023'");

		js.executeScript("document.querySelector('#checkout').value='07-04-2023'");

//		driver.executeScript("document.querySelector('#checkin').value='29-03-2023';document.querySelector('#checkout').value='7-04-2023'");

		String title = js.executeScript("return document.title").toString();
		System.out.println(title);

		String value = js.executeScript("return document.querySelector('#checkout').value").toString();
		System.out.println(value);

	}
}
