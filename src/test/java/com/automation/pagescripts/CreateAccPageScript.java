package com.automation.pagescripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.pageutils.CreateAccPageUtils;

public class CreateAccPageScript extends BaseClass {

	public CreateAccPageUtils createAccPageUtils;
	
	@BeforeClass
	public void loading(){
		createAccPageUtils = PageFactory.initElements(driver, CreateAccPageUtils.class);
	}
	
	@Test
	public void createAccCredentials(){
		createAccPageUtils.createAccDetails("Nandini", "Boyinapalli", "nandinikishoreb@gmail.com", "nandinikishoreb@gmail.com", "newpassword");
	}
	
	@Test(priority=1)
	public void birthdayCreadentials(){
		createAccPageUtils.birthDayDetails("4", "Apr", "2014");
	}
	
}
