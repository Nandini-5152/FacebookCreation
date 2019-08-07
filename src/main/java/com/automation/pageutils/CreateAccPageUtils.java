package com.automation.pageutils;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.pageobjects.CreateAccPageObjects;
import com.automation.utils.SeleniumCore;
import com.automation.utils.SeleniumUtils;

public class CreateAccPageUtils extends BaseClass {

	public SeleniumCore seleniumCore;
	public SeleniumUtils seleniumUtils;
	public CreateAccPageObjects createAccPageObjects;
	
	public CreateAccPageUtils(){
		seleniumCore = PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtils = PageFactory.initElements(driver, SeleniumUtils.class);
		createAccPageObjects=PageFactory.initElements(driver,CreateAccPageObjects.class);
	}
	
	public void createAccDetails(String Fname,String Sname,String email,String reemail,String newpass){
		seleniumCore.enterText(createAccPageObjects.firstname, Fname);
		seleniumCore.enterText(createAccPageObjects.surname, Sname);
		seleniumCore.enterText(createAccPageObjects.email, email);
		seleniumCore.enterText(createAccPageObjects.re_email, reemail);
		seleniumCore.enterText(createAccPageObjects.newpass, newpass);
	}
	
	public void birthDayDetails(String day,String month,String year){
		seleniumCore.selectEle(createAccPageObjects.day, day);
		seleniumCore.selectEle(createAccPageObjects.month, month);
		seleniumCore.selectEle(createAccPageObjects.year, year);
		
		seleniumCore.clickOnEle(createAccPageObjects.female);
		seleniumCore.clickOnEle(createAccPageObjects.singup);
	}
	
}
