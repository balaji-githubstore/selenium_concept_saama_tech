package com.saama.advance;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo13ShadowElement {
	
	public static void main(String[] args) {
		
		File file=new File("downloads");
		
		
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", file.getAbsolutePath());
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.selenium.dev/downloads"); 
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.partialLinkText("32 bit Windows IE")).click();
		
		//create new tab and switch to it
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("chrome://downloads/");

	
//		document.querySelector("downloads-manager").shadowRoot
//		.querySelector('#frb0').shadowRoot
//		.querySelector('#show').innerText
		
//		document.querySelector("body > downloads-manager").shadowRoot
//		.querySelector("#frb0").shadowRoot
//		.querySelector("#file-link")
		
		SearchContext sc1= driver.findElement(By.xpath("//downloads-manager")).getShadowRoot();
		
		SearchContext sc2=sc1.findElement(By.id("frb0")).getShadowRoot();
		
		String actualText=sc2.findElement(By.id("show")).getText();
		System.out.println(actualText);
		
		
//		document.querySelector("body > smart-ui-menu").shadowRoot
//		.querySelector("#menuItemsGroup1853 > div.smart-menu-item-label-container > div.smart-menu-item-label-element > span")
//	
	
		SearchContext s1= driver.findElement(By.xpath("//smart-ui-menu")).getShadowRoot();
		s1.findElement(By.xpath("//span[contains(text(),'File')]")).click();
	}

}
