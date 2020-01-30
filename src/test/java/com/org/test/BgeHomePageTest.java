package com.org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.org.common.BrowserFactory;
import com.org.pages.BgeHomePage;

public class BgeHomePageTest {
  
	 private WebDriver driver;
	 
	 private BrowserFactory bfObj;
	 
	 private BgeHomePage bgeHomePageObj;

	    @BeforeClass
	    public void beforeClass() throws Exception   {
	    	bfObj = new BrowserFactory();
	    	driver = bfObj.getDriver("Chrome");	
	    }

	    @AfterClass
	    public void afterClass() {
	      //  driver.quit();
	    }

	    @Test
	    public void testLogin() {

	        driver.get("https://oakshackberrycreek.activebuilding.com");
	        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        
	 
	        bgeHomePageObj = new BgeHomePage();
	        bgeHomePageObj.setDriver(driver);
	        bgeHomePageObj.setUserName("email", "test1");
	        bgeHomePageObj.setPassword("password", "pwd");

	    }
}
