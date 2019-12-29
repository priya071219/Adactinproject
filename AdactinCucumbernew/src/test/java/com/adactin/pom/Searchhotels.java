package com.adactin.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Searchhotels {

		public static WebDriver driver;


		@FindBy(xpath="(//select[@class='search_combobox'])[1]")
		private WebElement location;
		
		@FindBy(xpath="//select[@id='hotels']")
		private WebElement hotel;
		
		@FindBy(xpath="//select[@id='room_type']")
		private WebElement room;
		
		@FindBy(xpath="//select[@id='room_nos']")
		private WebElement nrooms;
		
		@FindBy(xpath="//input[@name='datepick_in']")
		private WebElement checkIn;
		
		@FindBy(xpath="//input[@name='datepick_out']")
		private WebElement checkOut;
		
		@FindBy(xpath="//select[@id='adult_room']")
		private WebElement adults;
		
		@FindBy(xpath="//select[@id='child_room']")
		private WebElement childs;
		
		@FindBy(xpath="//input[@name='Submit']")
		private WebElement search;
		
		public Searchhotels(WebDriver sdriver) {
			this.driver=sdriver;
			PageFactory.initElements(driver, this);
		}

		public WebElement getLocation() {
			return location;
		}

		public WebElement getHotel() {
			return hotel;
		}

		public WebElement getRoom() {
			return room;
		}

		public WebElement getNrooms() {
			return nrooms;
		}

		public WebElement getCheckIn() {
			checkIn.clear();
			return checkIn;
		}

		public WebElement getCheckOut() {
			checkOut.clear();
			return checkOut;
		}

		public WebElement getAdults() {
			return adults;
		}

		public WebElement getChilds() {
			return childs;
		}

		public WebElement getSearch() {
			return search;
		}


			}



