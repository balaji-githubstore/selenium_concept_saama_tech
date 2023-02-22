package com.saama.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1SalesForce {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
//		2.	Enter first name as “John”
		driver.findElement(By.name("UserFirstName")).sendKeys("jack");

//		3.	Enter last name as “wick”
		driver.findElement(By.name("UserLastName")).sendKeys("wick");
		
//		4.	Enter work email as “john@gmail.com”
		driver.findElement(By.xpath("//input[contains(@id,'UserEmail')]")).sendKeys("jack@gmail.com");
		
//		5.	Select Job title as “IT Manager”
		Select selectTitle=new Select(driver.findElement(By.name("UserTitle")));
		selectTitle.selectByVisibleText("IT Manager");
		
//		6.	Select Employees as “101-500 employees”
		Select selectEmpCount=new Select(driver.findElement(By.name("CompanyEmployees")));
		selectEmpCount.selectByValue("250");
		
//		7.	Select country as “United Kingdom”
		Select selectCountry=new Select(driver.findElement(By.name("CompanyCountry")));
		selectCountry.selectByVisibleText("United Kingdom");
		
		
//		8.	Enter compnay name
		driver.findElement(By.xpath("//input[contains(@id,'CompanyName')]")).sendKeys("Saama Tech");
		
//		9.	Click on check box 
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		
//		10.	Click on start my free trial 
		driver.findElement(By.xpath("//button[contains(text(),'start my free')]")).click();
		
//		11.	Get the error message displayed “Enter a valid phone number”
		String actualError= driver.findElement(By.xpath("//span[contains(text(),'valid phone')]")).getText();
		System.out.println(actualError);
	}

}
