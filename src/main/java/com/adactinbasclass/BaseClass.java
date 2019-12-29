package com.adactinbasclass;

	import java.security.cert.PKIXRevocationChecker.Option;

	import javax.lang.model.element.Element;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.support.ui.Select;

	public class BaseClass {
		
		public static WebDriver driver;
		
		public static WebDriver browserLaunch(String browsername)
		{
			try {
				if(browsername.equalsIgnoreCase("chrome"))
				{
					System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
					driver=new ChromeDriver();
				}
				else if(browsername.equalsIgnoreCase("firefox"))
				{
					System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\Driver\\geckodriver.exe");
					driver=new FirefoxDriver();
				}
				else if( browsername.equalsIgnoreCase("ie"))
				{
					System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+ "\\Driver\\IEDriverServer.exe");
					driver=new InternetExplorerDriver();
				}
				else
				{
					System.out.println("Invalid Browesrname");
				}
		    } catch (Exception e) {
				e.printStackTrace();
			    }
		
		       driver.manage().window().maximize();
		 
		       return driver;
		       }
		
	public static void geturl(String url)
	          {
		      driver.get(url);
	          }
	public static void dropdown(WebElement element, String option, String value)
	        { 
		    Select ss =new Select(element);
		     try {
				if(option.equals("index"))
				 {
					 ss.selectByIndex(Integer.parseInt(value));
				 }
				 else if(option.equals("value"))
				 {
					 ss.selectByValue(value);
				 }
				 else if(option.equals("text"))
				 {
					 ss.selectByVisibleText(value);
				 }
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        }

	public static void inputOnelement(WebElement element, String value)
	{
		element.sendKeys(value);
	}

	public static void clickOnelemant(WebElement elememt)
	{
		elememt.click();
	}
	//-------------------------getTitle---------//
	 public static void titleOnelement(String gettitle)
	 {
	 driver.get(gettitle);
	 }
	 //---------------------clear----------------//
	 public static void clearOnelement(WebElement element)
	 {
		 element.clear();
	 }









	}

			



