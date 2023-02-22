package com.saama.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo4Text {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://facebook.com/");

		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		String header1 = driver.findElement(By.xpath("//h2[contains(text(),'helps')]")).getText();
		System.out.println(header1);
		
		driver.quit();
	}
}
