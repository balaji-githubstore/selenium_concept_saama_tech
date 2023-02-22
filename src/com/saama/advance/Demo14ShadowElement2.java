package com.saama.advance;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo14ShadowElement2 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.htmlelements.com/demos/menu/shadow-dom/index.htm"); 
	
//		document.querySelector("body > smart-ui-menu").shadowRoot
//		.querySelector("#menuItemsGroup1853 > div.smart-menu-item-label-container > div.smart-menu-item-label-element > span")
//	
//		document.querySelector("body > smart-ui-menu").shadowRoot
//		.querySelector("#menuItemsGroup1853 > div.smart-menu-item-label-container > div.smart-menu-item-label-element > span")
	
		SearchContext s1= driver.findElement(By.xpath("//smart-ui-menu")).getShadowRoot();
		
		//supporting only cssSelector method inside getShadowRoot
		List<WebElement> elements= s1.findElements(By.cssSelector("span"));
		
		for(WebElement element : elements)
		{
			System.out.println(element.getText());
			if(element.getText().equals("View"))
			{
				element.click();
				break;
			}
		}
		
		elements= s1.findElements(By.cssSelector("span"));
		
		for(WebElement element : elements)
		{
			System.out.println(element.getText());
			if(element.getText().equals("Server Explorer"))
			{
				element.click();
				break;
			}
		}
		
//		document.querySelector("body > smart-ui-menu").shadowRoot
//		.querySelector("#menuItem2e97 > div > div.smart-menu-item-label-element > span")
//		s1.findElement(By.cssSelector("#menuItemsGroup1853 > div.smart-menu-item-label-container > div.smart-menu-item-label-element > span")).click();
	}

}
