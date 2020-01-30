package com.org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BgeHomePage {
	
	private BgeHeader bgeHeaderObj;
	private BgeFooter bgeFooterObj;
	
	private WebElement username;
	private WebElement password;
	
	private WebDriver driver;
	
	public void setDriver(WebDriver driver){
		this.driver = driver;
	}
	
	 public void setUserName(String strUserName, String usernameValue){ 
	      username = driver.findElement(By.id(strUserName));
	      username.sendKeys(usernameValue);
	      
	    }
	 public void setPassword(String strPassword, String passwordValue ){  
		 password = driver.findElement(By.id(strPassword));
		 password.sendKeys(passwordValue);
	    }

}
