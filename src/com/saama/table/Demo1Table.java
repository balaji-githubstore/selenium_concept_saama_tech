package com.saama.table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1Table {

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
		int rowCount=elements.size();
		System.out.println(rowCount);
		
		for(int i=2;i<=rowCount;i++)
		{
			String row=driver.findElement(By.xpath("//table[contains(@class,'TrainList')]/tbody/tr["+i+"]")).getText();
			System.out.println(row);
			
			String train=driver.findElement(By.xpath("//table[contains(@class,'TrainList')]/tbody/tr["+i+"]/td[1]")).getText();
			System.out.println(train);
			
			String name1=driver.findElement(By.xpath("//table[contains(@class,'TrainList')]/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(name1);
			
			if(name1.strip().equals("POTHIGAI EXPRES"))
			{
				driver.findElement(By.xpath("//table[contains(@class,'TrainList')]/tbody/tr["+i+"]/td[2]")).click();
				break;
			}
		}

	

	}
}
