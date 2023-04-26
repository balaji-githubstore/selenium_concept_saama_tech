package com.saama.table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2Table2 {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://erail.in/trains-between-stations/chennai-egmore-MS/madurai-jn-MDU"); //wait for page load 
		
		
		if(driver.findElement(By.id("chkSelectDateOnly")).isSelected())
		{
			driver.findElement(By.id("chkSelectDateOnly")).click();
		}
		
		
		List<WebElement> elements= driver.findElements(By.xpath("//table[contains(@class,'TrainList')]/tbody/tr"));
		
		
		for(WebElement rowEle : elements)
		{
			System.out.println(rowEle.getText());
			List<WebElement> elements2 = rowEle.findElements(By.tagName("td"));
			
			for(WebElement colEle : elements2)
			{
				System.out.println(colEle.getText());
			}
		}

	

	}
}
