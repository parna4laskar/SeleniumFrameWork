package com.org.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	private WebDriver driver;
	
	public WebDriver getDriver(String browserName) throws Exception {
		
		if(browserName.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver","C://Parna/chromedriver/chromedriver.exe");
	        driver = new ChromeDriver();
		}
		else if(browserName.equals("Firefox"))
		{
			
		}
		else{
			throw new Exception("Browser not supported");
		}
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		return driver;
	}

}
