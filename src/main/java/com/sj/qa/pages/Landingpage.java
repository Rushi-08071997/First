package com.sj.qa.pages;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sj.qa.resources.Base;

public class Landingpage extends Base {
	
	WebDriver driver;

	// initializing page object
	public Landingpage(WebDriver driver) {
		
		this.driver=driver;
	}

	@FindBy(xpath = "a[class='spicejet_logo']")
	WebElement logo;

	@FindBy(xpath = "//div[@id='smoothmenu1']")
	WebElement header;

	@FindBy(xpath = "//div[@class=\"search-buttons-heading\"]//div//ul//li")
	WebElement search_button_heading;

	@FindBy(xpath = "//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")
	WebElement from;

	// div[@id="glsctl00_mainContent_ddl_originStation1_CTNR"]//li//a

	@FindBy(xpath = "//div[@id=glsctl00_mainContent_ddl_originStation1_CTNR']//li//a")
	List<WebElement> Fcity;

	@FindBy(xpath = "//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")
	WebElement To;

	// div[@id="glsctl00_mainContent_ddl_destinationStation1_CTNR"]//li//a

	@FindBy(xpath = "//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR\"]//li//a']")
	List<WebElement> Tcity;

	@FindBy(xpath = "//div[@class='ui-datepicker-group.ui-datepicker-group-first']//div[1]//div//span")
	WebElement month;

	@FindBy(xpath = "//a[@class='ui-state-default']")
	WebElement date;

	@FindBy(id = "divpaxinfo")
	WebElement passenger;

	@FindBy(id = "ctl00_mainContent_ddl_Adult")
	WebElement Adult;

	@FindBy(id = "ctl00_mainContent_DropDownListCurrency")
	WebElement Currency;

	@FindBy(id = "ctl00_mainContent_btn_FindFlights")
	WebElement Search;

	// div[@id='discount-checkbox']//div//a//span

	@FindBy(xpath = "//div[@id='discount-checkbox']//div//a//span")
	WebElement Discount_checkbox;

	@FindBy(tagName = "a")
	WebElement linkcount;
	
	@FindBy(xpath="//li[@id='header-vacations']//a")
	WebElement Deals;

	// functions

	public boolean verifylogo() {

		return logo.isDisplayed();
	}

	public boolean verifyheader() {

		return header.isDisplayed();
	}

	public boolean verifySearch_heading() {

		return search_button_heading.isDisplayed();
	}

	public void selectorigin(String src) {

		from.click();
		List<WebElement> cities = Fcity;
		for (WebElement f : cities) {

			if (f.getText().contains(src)) {
				f.click();
			}
		}

	}

	public void selectdestination(String dest) {

		To.click();
		List<WebElement> cities = Tcity;
		for (WebElement t : cities) {

			if (t.getText().contains(dest)) {
				t.click();
			}

		}

	}

	public void selectdate(String mnth, String dt) {

		if (month.getText().contains(mnth) && date.getText().contains(dt)) {

			date.click();

		}

	}
	
	public void selectpassengers() {
		
		passenger.click();
		
		Select s=new Select(Adult);
		
		s.selectByValue("5");
		
	}
	
	public void selectcurrency() {
		
		Select s=new Select(Currency);
		
		s.selectByValue("INR");
		
	}
	
	public void clicksearch() {
		
		Search.click();
	}
	
	public Deals Clickondeals() {
		
		Deals.click();
		Deals ds=new Deals();
		return ds;
		
	}
	
	
	
}
