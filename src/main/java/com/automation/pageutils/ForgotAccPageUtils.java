package com.automation.pageutils;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.pageobjects.FogotAccPageObjects;
import com.automation.utils.SeleniumCore;
import com.automation.utils.SeleniumUtils;

public class ForgotAccPageUtils extends BaseClass{
	
	public SeleniumCore seleniumCore;
	public SeleniumUtils seleniumUtils;
	public FogotAccPageObjects fogotAccPageObjects;
	
	public ForgotAccPageUtils(){
		seleniumCore=PageFactory.initElements(driver,SeleniumCore.class);
		seleniumUtils=PageFactory.initElements(driver,SeleniumUtils.class);
		fogotAccPageObjects=PageFactory.initElements(driver,FogotAccPageObjects.class);
	}
	
	public void ForgotAccDetails(String phnum,String email) throws InterruptedException{
		seleniumCore.clickOnEle(fogotAccPageObjects.forgotAcc);
		seleniumCore.enterText(fogotAccPageObjects.phnum, phnum);
		Thread.sleep(3000);
		seleniumCore.clickOnEle(fogotAccPageObjects.search1);
		Thread.sleep(3000);
		seleniumCore.clickOnEle(fogotAccPageObjects.back1);
		Thread.sleep(3000);
		seleniumCore.enterText(fogotAccPageObjects.email, email);
		Thread.sleep(3000);
		seleniumCore.clickOnEle(fogotAccPageObjects.search2);
		Thread.sleep(3000);
		seleniumCore.clickOnEle(fogotAccPageObjects.notyouobj);
		
	}
	
}