package com.ae.inheritance;

interface WebDriverDemo
{
	public abstract void get(String url);
	void quit();
	String getTitle();
}

interface JavascriptExecutorDemo
{
	void executeScript();
}

interface TakeScreenshotDemo
{
	void getScreenshot();
}

class FireFoxDemo implements WebDriverDemo,JavascriptExecutorDemo,TakeScreenshotDemo
{
	public FireFoxDemo()
	{
		System.out.println("FireFox launch");
	}
	
	public void quit() {
		// TODO Auto-generated method stub
		
	}


	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void get(String url) {
				System.out.println("logic to navigate to url in firefox");
	}

	@Override
	public void getScreenshot() {
		// TODO Auto-generated method stub
		System.out.println("screenshot in firefox");
	}

	@Override
	public void executeScript() {
		// TODO Auto-generated method stub
		System.out.println("javascript in firefox");
	}
}

class ChromeDriverDemo implements WebDriverDemo,JavascriptExecutorDemo,TakeScreenshotDemo
{
	public ChromeDriverDemo()
	{
		System.out.println("chrome launch");
	}

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		System.out.println("logic to navigate to url in chrome");
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getScreenshot() {
		// TODO Auto-generated method stub
		System.out.println("screenshot in chrome");
	}

	@Override
	public void executeScript() {
		// TODO Auto-generated method stub
		System.out.println("javascript in chrome");
	}
	
}

class EdgeDriver implements WebDriverDemo,JavascriptExecutorDemo,TakeScreenshotDemo
{

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void executeScript() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getScreenshot() {
		// TODO Auto-generated method stub
		
	}
	
}




public class Demo4SeleniumInterface {
	
	public static void main(String[] args) {
		
		WebDriverDemo driver=new EdgeDriver();
		driver.get("http://google.com");
		
		
		JavascriptExecutorDemo js=(JavascriptExecutorDemo) driver;
		js.executeScript();
		
		TakeScreenshotDemo ts=(TakeScreenshotDemo) driver;
		ts.getScreenshot();
		
		
//		driver=new FireFoxDemo();
//		driver.get("http://google.com");
	}

}
