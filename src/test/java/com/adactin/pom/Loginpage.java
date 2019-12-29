package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.runner.Runner;

public class Loginpage {
		
		public static WebDriver driver;

		public Loginpage(WebDriver driver2) {
			this.driver=driver2;
			PageFactory.initElements(driver, this);
		}

		
		@FindBy(xpath="(//input[@name='username'])")
		private WebElement username;
		
		@FindBy(xpath="(//input[@name='password'] )")
		private WebElement password;
		@FindBy(xpath="(//input[@name='login'])")
		private WebElement loginbtn;
		
		//getter methods
		public WebElement getLoginbtn() {
			return loginbtn;
		}
		public WebElement getPassword() {
			return password;
		}	
		public WebElement getUsername() {
			return username;
		}


		


		
		
		
		

	}



