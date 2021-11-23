package com.sj.qa.test;

import com.sj.qa.pages.Landingpage;
import com.sj.qa.resources.Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Homepagetest extends Base {

	public WebDriver driver;
	
	Landingpage l;
	
	
	@BeforeTest

	public void getdriver() throws IOException{
		driver=Initializedriver();
	
	   l=new Landingpage(driver);
	   
	   
		
	}
	

}
