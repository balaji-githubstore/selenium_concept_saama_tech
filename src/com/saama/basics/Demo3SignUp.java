package com.saama.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3SignUp {

	public static void main(String[] args)  {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://facebook.com/");  //wait for page load to complete 
		
		driver.findElement(By.linkText("Create new account")).click();
	
		driver.findElement(By.name("firstname")).sendKeys("john");
		driver.findElement(By.name("lastname")).sendKeys("wick");
		driver.findElement(By.id("password_step_input")).sendKeys("welcome123");
		
		//20 Dec 2000
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("20");
		
		//select month as Dec 
		Select selectMonth=new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Dec");
		
		//select year as 2000
		Select selectYear=new Select(driver.findElement(By.xpath("//select[@title='Year']")));
		selectYear.selectByVisibleText("2000");
		
		//click on radiobutton custom
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		//click on submit 
//		driver.findElement(By.name("websubmit")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}

}
