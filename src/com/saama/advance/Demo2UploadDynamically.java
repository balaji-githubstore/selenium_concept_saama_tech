package com.saama.advance;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo2UploadDynamically {

	public static void main(String[] args) {
		
		File file=new File("test_data/Balaji-Profile_2023.pdf");
		
		String fullPath=file.getAbsolutePath();
		
		System.out.println(fullPath);
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.ilovepdf.com/pdf_to_word"); 
		
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(fullPath);
		
		
	}
}
