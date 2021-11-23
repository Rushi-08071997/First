package com.sj.qa.resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	
	public WebDriver driver;
	
	public Properties prop;
	
	
	
	public WebDriver Initializedriver() throws IOException {
		
		
		prop=new Properties();
		
		FileInputStream fis =new FileInputStream(System.getProperty("user.dir") + "//src//main//java//com//sj//qa//config//config.properties");
		
		prop.load(fis);
		
		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//main//java//com//sj//qa//testdata//chromedriver.exe");
			
			 ChromeOptions option=new ChromeOptions();
			 
			 if(browsername.contains("headless")) {
				 
				 driver=new ChromeDriver(option);
			 }
			
		}
		
if(browsername.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/SpiceJet/src/main/java/com/sj/qa/testdata/geckodriver.exe");
				 
				 driver=new FirefoxDriver();
			 }
/*
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);*/
return driver;			

		}
		
	
		
	}

