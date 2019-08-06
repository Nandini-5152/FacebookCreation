package com.automation.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public static WebDriver driver;
	public Properties prop;

	@BeforeSuite
	public void initBro(){
		loadFile();
		if ("chrome".equalsIgnoreCase(prop.getProperty("browser"))) {
			System.setProperty("webdriver.chrome.driver", "D:\\Automation\\FaceBookCreation\\Browsers\\chromedriver.exe");
			driver = (WebDriver) new ChromeDriver();
			driver.manage().window().maximize();
		}else if ("ie".equalsIgnoreCase(prop.getProperty("browser"))) {
			driver.manage().window().maximize();
		}else if ("firefox".equalsIgnoreCase(prop.getProperty("browser"))) {
			driver.manage().window().maximize();
		}else {
			System.out.println("Given browser is not avilabe");
		}
		driver.get(prop.getProperty("url"));
	}


	
	public void loadFile(){
		try {
			FileInputStream fis = new FileInputStream("D:\\Automation\\FaceBookCreation\\config\\config.properties");
			prop = new Properties();
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
